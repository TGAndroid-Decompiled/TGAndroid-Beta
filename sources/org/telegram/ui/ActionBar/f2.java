package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import c8.ha;
import di.d7;
import di.p9;
import di.q9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.dt;
import org.telegram.messenger.dw;
import org.telegram.messenger.gz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.sd;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.messenger.w9;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.az0;
import org.telegram.ui.mx;
import org.telegram.ui.oi0;
public abstract class f2 {
    protected l actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private za bulletinDelegate;
    protected boolean finishing;
    protected boolean fragmentBeginToShow;
    public View fragmentView;
    private Runnable fullyVisibleListener;
    protected boolean inBubbleMode;
    protected boolean inMenuMode;
    protected boolean inPreviewMode;
    public boolean isFinished;
    private boolean isFullyVisible;
    private ViewGroup listViewForSimpleGlass;
    protected View navigationBarFadeView;
    protected Dialog parentDialog;
    protected r4 parentLayout;
    private e2 previewDelegate;
    private boolean removingFromStack;
    protected h6 resourceProvider;
    public ArrayList<b2> sheetsStack;
    protected z4 simpleActionBar;
    private oi.a simpleGlass;
    private j5 simpleMenuOverlay;
    private f2 simpleMenuOverlayHost;
    public Dialog visibleDialog;
    protected int currentAccount = p10.f24474s0;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final oi.q glassEngine = new oi.q();
    private final h6 themedColors = new s1(this, 1);
    protected i0.b mSystemInsets = i0.b.f15121e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public f2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new z1(0, this));
    }

    public static boolean hasFullyVisibleSheets(f2 f2Var) {
        mx x10;
        if (f2Var != null) {
            if (!f2Var.hasShownFullyVisibleSheet()) {
                if ((f2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) f2Var.getParentLayout()).x()) != null && x10.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(f2 f2Var) {
        mx x10;
        if (f2Var != null) {
            if (!f2Var.hasShownSheet()) {
                if ((f2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) f2Var.getParentLayout()).x()) != null && x10.hasShownSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean W(MotionEvent motionEvent, boolean z9) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(b2 b2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        q9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f9646v0 = b2Var;
            b2Var.n(new di.l3(lastStoryViewer, 3));
        }
        this.sheetsStack.add(b2Var);
        updateSheetsVisibility();
    }

    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return true;
    }

    public boolean allowPresentFragment() {
        return true;
    }

    public void attachSheets(w wVar) {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                b2 b2Var = this.sheetsStack.get(i7);
                if (b2Var != null && b2Var.y()) {
                    org.telegram.messenger.g0.E2(b2Var.d());
                    wVar.addView(b2Var.d());
                }
            }
        }
    }

    public boolean canBeginSlide() {
        return true;
    }

    public void checkSystemBarColors() {
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            ((LaunchActivity) parentActivity).F(true, true, true);
        }
    }

    public void clearSheets() {
        ArrayList<b2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                this.sheetsStack.get(size).a(true);
            }
            this.sheetsStack.clear();
        }
    }

    public void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            this.fragmentView = null;
        }
        l lVar = this.actionBar;
        if (lVar != null) {
            ViewGroup viewGroup2 = (ViewGroup) lVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            this.actionBar = null;
        }
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            org.telegram.messenger.g0.E2(z4Var);
            this.simpleActionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public boolean closeSheet() {
        ArrayList<b2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).s()) {
                    this.sheetsStack.get(size).p();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public l createActionBar(Context context) {
        r4 r4Var;
        l lVar = new l(context, getResourceProvider());
        t6.h(m6.f28170s8, lVar, this.themedColors);
        t6.l(lVar, 3, m6.f28188t8, this.themedColors);
        t6.a(lVar, m6.f28302z8, this.themedColors, true);
        t6.l(lVar, 1, m6.f28227v8, this.themedColors);
        t6.b(lVar, m6.f28284y8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((r4Var = this.parentLayout) == null || !((ActionBarLayout) r4Var).S0)) {
            return lVar;
        }
        lVar.setOccupyStatusBar(false);
        return lVar;
    }

    public org.telegram.ui.g4 createArticleViewer(boolean z9) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z9) {
            if ((getLastSheet() instanceof org.telegram.ui.t3) && getLastSheet().s()) {
                return ((org.telegram.ui.t3) getLastSheet()).K;
            }
            r4 r4Var = this.parentLayout;
            if ((r4Var instanceof ActionBarLayout) && ((ActionBarLayout) r4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.t3)) {
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
                if (t3Var.s()) {
                    return t3Var.K;
                }
            }
        }
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(this);
        org.telegram.ui.t3 t3Var2 = g4Var.K;
        addSheet(t3Var2);
        a3.b(t3Var2);
        return g4Var;
    }

    public q9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        q9 q9Var = new q9(this);
        r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).f27237b) {
            q9Var.f9635q1 = true;
        }
        this.sheetsStack.add(q9Var);
        updateSheetsVisibility();
        return q9Var;
    }

    public z4 createSimpleActionBar(Context context) {
        r4 r4Var;
        z4 z4Var = new z4(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((r4Var = this.parentLayout) == null || !((ActionBarLayout) r4Var).S0)) {
            return z4Var;
        }
        z4Var.setOccupyStatusBar(false);
        return z4Var;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                b2 b2Var = this.sheetsStack.get(i7);
                if (b2Var != null && b2Var.y()) {
                    org.telegram.messenger.g0.E2(b2Var.d());
                }
            }
        }
    }

    public void dismissCurrentDialog() {
        Dialog dialog = this.visibleDialog;
        if (dialog == null) {
            return;
        }
        try {
            dialog.dismiss();
            this.visibleDialog = null;
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return true;
    }

    public boolean drawEdgeNavigationBar() {
        return isSupportEdgeToEdge();
    }

    public void dumpCanvas() {
        Typeface typeface = org.telegram.messenger.g0.f22539a;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        e2 e2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (e2Var = this.previewDelegate) != null) {
            ((az0) ((oi0) e2Var).f48533b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        r4 r4Var = this.parentLayout;
        if (r4Var != null) {
            ((ActionBarLayout) r4Var).v();
        }
    }

    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.currentAccount);
    }

    public l getActionBar() {
        return this.actionBar;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public org.telegram.ui.g4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.t3) && getLastSheet().s()) {
            return ((org.telegram.ui.t3) getLastSheet()).K;
        }
        r4 r4Var = this.parentLayout;
        if ((r4Var instanceof ActionBarLayout) && ((ActionBarLayout) r4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.t3)) {
            org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
            if (t3Var.s()) {
                return t3Var.K;
            }
            return null;
        }
        return null;
    }

    public n4 getBackButtonState() {
        l lVar = this.actionBar;
        if (lVar != null) {
            return lVar.getBackButtonState();
        }
        return null;
    }

    public oi.a getBaseSimpleGlass() {
        if (this.simpleGlass == null) {
            this.simpleGlass = new oi.a(this.glassEngine, new o(this));
        }
        return this.simpleGlass;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public za getBulletinDelegate() {
        return this.bulletinDelegate;
    }

    public FrameLayout getBulletinLayoutContainer() {
        return getLayoutContainer();
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(getAccountInstance().f21770a);
    }

    public org.telegram.messenger.g5 getContactsController() {
        return org.telegram.messenger.g5.r(getAccountInstance().f21770a);
    }

    public Context getContext() {
        return getParentActivity();
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public Animator getCustomSlideTransition(boolean z9, boolean z10, float f10) {
        return null;
    }

    public org.telegram.messenger.z5 getDownloadController() {
        return org.telegram.messenger.z5.q(getAccountInstance().f21770a);
    }

    public p3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return p3.f28377b;
        }
        return p3.f28376a;
    }

    public w7 getFileLoader() {
        return w7.G(getAccountInstance().f21770a);
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public f2 getFragmentForAlert(int i7) {
        r4 r4Var = this.parentLayout;
        if (r4Var != null && r4Var.getFragmentStack().size() > i7 + 1) {
            return (f2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i7);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public w9 getGiftAuctionsController() {
        return w9.c(getAccountInstance().f21770a);
    }

    public boolean getInPassivePreviewMode() {
        r4 r4Var = this.parentLayout;
        if (r4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) r4Var;
            if ((actionBarLayout.h && actionBarLayout.J == null) || actionBarLayout.f27235a0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public b2 getLastSheet() {
        ArrayList<b2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).s()) {
                    return this.sheetsStack.get(size);
                }
            }
            return null;
        }
        return null;
    }

    public q9 getLastStoryViewer() {
        ArrayList<b2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof q9) && this.sheetsStack.get(size).s()) {
                    return (q9) this.sheetsStack.get(size);
                }
            }
            return null;
        }
        return null;
    }

    public FrameLayout getLayoutContainer() {
        View view = this.fragmentView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof FrameLayout) {
                return (FrameLayout) parent;
            }
            return null;
        }
        return null;
    }

    public pj0 getListViewForSimpleGlass() {
        return null;
    }

    public sd getLocationController() {
        return sd.f(getAccountInstance().f21770a);
    }

    public MediaController getMediaController() {
        return MediaController.B();
    }

    public ui getMediaDataController() {
        return ui.b0(getAccountInstance().f21770a);
    }

    public qp getMessagesController() {
        return qp.s1(getAccountInstance().f21770a);
    }

    public yr getMessagesStorage() {
        return yr.a0(getAccountInstance().f21770a);
    }

    public int getNavigationBarColor() {
        int w02 = m6.w0(m6.f27834a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                b2 b2Var = this.sheetsStack.get(i7);
                if (b2Var.y()) {
                    w02 = b2Var.e(w02);
                }
            }
        }
        return w02;
    }

    public qs getNotificationCenter() {
        return qs.f(getAccountInstance().f21770a);
    }

    public dt getNotificationsController() {
        return dt.t(getAccountInstance().f21770a);
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().c();
    }

    public q9 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        q9 q9Var = (this.sheetsStack.isEmpty() || !(jg.g.i(1, this.sheetsStack) instanceof q9)) ? null : (q9) jg.g.i(1, this.sheetsStack);
        if (q9Var == null) {
            q9Var = new q9(this);
            r4 r4Var = this.parentLayout;
            if (r4Var != null && ((ActionBarLayout) r4Var).f27237b) {
                q9Var.f9635q1 = true;
            }
            this.sheetsStack.add(q9Var);
            updateSheetsVisibility();
        }
        return q9Var;
    }

    public Activity getParentActivity() {
        r4 r4Var = this.parentLayout;
        if (r4Var != null) {
            return r4Var.getParentActivity();
        }
        return null;
    }

    public r4 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public h6 getResourceProvider() {
        return this.resourceProvider;
    }

    public hm0 getScrollViewForSimpleGlass() {
        return null;
    }

    public dw getSecretChatHelper() {
        return dw.i(getAccountInstance().f21770a);
    }

    public gz getSendMessagesHelper() {
        return gz.C(getAccountInstance().f21770a);
    }

    public z4 getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public j5 getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        f2 f2Var = this.simpleMenuOverlayHost;
        if (f2Var != null && f2Var.fragmentView != null) {
            return f2Var.getSimpleMenuOverlay();
        }
        View view = this.fragmentView;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            z4 z4Var = this.simpleActionBar;
            if (z4Var != null && (z4Var.getParent() instanceof FrameLayout)) {
                viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            } else {
                return null;
            }
        }
        j5 j5Var = this.simpleMenuOverlay;
        if (j5Var == null || j5Var.getParent() != viewGroup) {
            j5 j5Var2 = this.simpleMenuOverlay;
            if (j5Var2 != null) {
                j5Var2.a(false);
                org.telegram.messenger.g0.E2(this.simpleMenuOverlay);
            }
            j5 j5Var3 = new j5(viewGroup.getContext());
            this.simpleMenuOverlay = j5Var3;
            viewGroup.addView(j5Var3, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.simpleMenuOverlay;
    }

    public ArrayList<v6> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i7) {
        return m6.w0(i7, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return m6.R0(str);
    }

    public Paint getThemedPaint(String str) {
        Paint paint;
        if (getResourceProvider() != null) {
            paint = getResourceProvider().d(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return m6.V0(str);
    }

    public p10 getUserConfig() {
        return p10.i(getAccountInstance().f21770a);
    }

    public Dialog getVisibleDialog() {
        return this.visibleDialog;
    }

    public boolean hasForceLightStatusBar() {
        return false;
    }

    public boolean hasOwnBackground() {
        return this.hasOwnBackground;
    }

    public boolean hasSheet() {
        ArrayList<b2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasShownFullyVisibleSheet() {
        if (hasSheet()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).s() && this.sheetsStack.get(size).j()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean hasShownSheet() {
        if (hasSheet()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).s()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean hasStoryViewer() {
        if (getLastStoryViewer() != null) {
            return true;
        }
        return false;
    }

    public boolean hideKeyboardOnShow() {
        return true;
    }

    public boolean isActionBarCrossfadeEnabled() {
        if (this.actionBar != null) {
            return true;
        }
        return false;
    }

    public boolean isBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public boolean isBotView(View view) {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                this.sheetsStack.get(i7);
            }
        }
        return false;
    }

    public boolean isFinishing() {
        return this.finishing;
    }

    public boolean isInBubbleMode() {
        return this.inBubbleMode;
    }

    public boolean isInPreviewMode() {
        return this.inPreviewMode;
    }

    public boolean isLastFragment() {
        r4 r4Var = this.parentLayout;
        if (r4Var != null && r4Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int x02;
        if (getLastStoryViewer() == null || getLastStoryViewer().G0) {
            if (!hasForceLightStatusBar() || m6.D0().q()) {
                h6 resourceProvider = getResourceProvider();
                int i7 = m6.f28170s8;
                l lVar = this.actionBar;
                if (lVar != null && lVar.x()) {
                    i7 = m6.f28246w8;
                } else if (this.simpleActionBar != null) {
                    i7 = m6.f27834a7;
                }
                if (resourceProvider != null) {
                    x02 = resourceProvider.f(i7);
                } else {
                    x02 = m6.x0(null, i7, true);
                }
                if (i0.a.h(x02) <= 0.699999988079071d) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public boolean isRemovingFromStack() {
        return this.removingFromStack;
    }

    public boolean isStoryViewer(View view) {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                b2 b2Var = this.sheetsStack.get(i7);
                if ((b2Var instanceof q9) && view == ((q9) b2Var).f9639s) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public boolean isSupportEdgeToEdge() {
        return false;
    }

    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public void movePreviewFragment(float r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f2.movePreviewFragment(float):void");
    }

    public boolean needDelayOpenAnimation() {
        return false;
    }

    public boolean onBackPressed(boolean z9) {
        if (hasShownSheet()) {
            if (z9) {
                closeSheet();
                return false;
            }
            return false;
        }
        return true;
    }

    public void onBecomeFullyHidden() {
        this.isFullyVisible = false;
        updateSheetsVisibility();
    }

    public void onBecomeFullyVisible() {
        l actionBar;
        String title;
        this.isFullyVisible = true;
        if (((AccessibilityManager) org.telegram.messenger.t0.f25570b.getSystemService("accessibility")).isEnabled() && ((actionBar = getActionBar()) != null || this.simpleActionBar != null)) {
            if (actionBar != null) {
                title = actionBar.getTitle();
            } else {
                title = this.simpleActionBar.getTitle();
            }
            if (!TextUtils.isEmpty(title)) {
                setParentActivityTitle(title);
            }
        }
        Runnable runnable = this.fullyVisibleListener;
        if (runnable != null) {
            this.fullyVisibleListener = null;
            runnable.run();
        }
        updateSheetsVisibility();
        checkSystemBarColors();
    }

    public void onBeginSlide() {
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing()) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D0 = false;
            lVar.R();
            y yVar = lVar.E;
            if (yVar != null) {
                int childCount = yVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = yVar.getChildAt(i7);
                    if (childAt instanceof r0) {
                        ((r0) childAt).o();
                    }
                }
            }
        }
    }

    public AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        return null;
    }

    public boolean onFragmentCreate() {
        return true;
    }

    public void onFragmentDestroy() {
        boolean z9;
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().k(this.classGuid);
        this.isFinished = true;
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setEnabled(false);
        }
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !org.telegram.messenger.g0.Q1() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (m6.x0(null, m6.f28170s8, false) == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.messenger.g0.p3(parentActivity, z9);
        }
        ArrayList<b2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b2 b2Var = this.sheetsStack.get(size);
                b2Var.b(false);
                b2Var.a(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        int i7 = 0;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i10 = I0.d;
        int i11 = I0.f15123b;
        this.mSystemInsets = I0;
        ViewGroup viewGroup = this.listViewForSimpleGlass;
        if (viewGroup != null) {
            oi.a.e(viewGroup, i11, i10, l.getCurrentActionBarHeight(), 0);
        }
        if (this.navigationBarFadeView != null) {
            if (this.mSystemInsets.d < org.telegram.messenger.g0.L(40.0f)) {
                i7 = 8;
            }
            this.navigationBarFadeView.getLayoutParams().height = this.mSystemInsets.d;
            this.navigationBarFadeView.setVisibility(i7);
        }
        int i12 = I0.f15122a;
        int i13 = I0.f15124c;
        this.bottomInset = i10;
        onInsets(i12, i11, i13, i10);
        return r0.k1.f54212b;
    }

    public void onPause() {
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D0 = false;
            lVar.R();
            y yVar = lVar.E;
            if (yVar != null) {
                int childCount = yVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = yVar.getChildAt(i7);
                    if (childAt instanceof r0) {
                        ((r0) childAt).o();
                    }
                }
            }
        }
        j5 j5Var = this.simpleMenuOverlay;
        if (j5Var != null) {
            j5Var.a(false);
        }
        this.isPaused = true;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing() && dismissDialogOnPause(this.visibleDialog)) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (getLastStoryViewer() != null) {
            q9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f9638r1 = true;
            p9 p9Var = lastStoryViewer.f9654z0;
            if (p9Var != null) {
                p9Var.release(null);
                lastStoryViewer.f9654z0 = null;
            }
            if (!di.i1.a(lastStoryViewer.A0)) {
                fi.s3 s3Var = lastStoryViewer.D0;
                if (s3Var != null) {
                    s3Var.b(0L, null);
                }
                di.g1 g1Var = lastStoryViewer.A0;
                if (g1Var != null) {
                    if (g1Var.f9007n) {
                        g1Var.s(null);
                    } else {
                        g1Var.e();
                    }
                    lastStoryViewer.A0 = null;
                }
            }
            d7 d7Var = lastStoryViewer.f9643t1;
            if (d7Var != null) {
                d7Var.b();
            }
            getLastStoryViewer().V();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<b2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            updateSheetsVisibility();
        }
    }

    public void onResume() {
        this.isPaused = false;
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D0 = true;
            lVar.R();
        }
        if (getLastStoryViewer() != null) {
            q9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f9638r1 = false;
            if (!org.telegram.ui.g4.v().V && lastStoryViewer.z() != null) {
                lastStoryViewer.z().d1(false);
            }
            d7 d7Var = lastStoryViewer.f9643t1;
            if (d7Var != null) {
                d7Var.a(false);
            }
            getLastStoryViewer().V();
        }
    }

    public void onTransitionAnimationEnd(boolean z9, boolean z10) {
        this.inTransitionAnimation = false;
    }

    public void onTransitionAnimationStart(boolean z9, boolean z10) {
        this.inTransitionAnimation = true;
        if (z9) {
            this.fragmentBeginToShow = true;
        }
    }

    public void onViewCreated(View view) {
        this.glassEngine.i(view);
    }

    public View performCreateView(Context context) {
        pj0 pj0Var;
        View createView = createView(context);
        pj0 listViewForSimpleGlass = getListViewForSimpleGlass();
        hm0 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            pj0Var = listViewForSimpleGlass;
        } else {
            pj0Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = pj0Var;
        if (pj0Var != null && (createView instanceof FrameLayout)) {
            oi.a baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.f((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                h6 h6Var = this.resourceProvider;
                baseSimpleGlass.f21034m = frameLayout;
                baseSimpleGlass.f21035n = scrollViewForSimpleGlass;
                baseSimpleGlass.f21036o = new bi.g(3, scrollViewForSimpleGlass, frameLayout);
                oi.q qVar = baseSimpleGlass.f21024a;
                qVar.getClass();
                scrollViewForSimpleGlass.L.add(new oi.k(qVar, scrollViewForSimpleGlass));
                oi.l lVar = new oi.l(qVar);
                if (scrollViewForSimpleGlass.J == null) {
                    scrollViewForSimpleGlass.J = new ArrayList();
                }
                if (!scrollViewForSimpleGlass.J.contains(lVar)) {
                    scrollViewForSimpleGlass.J.add(lVar);
                }
                scrollViewForSimpleGlass.setClipToPadding(false);
                baseSimpleGlass.g(frameLayout, view, h6Var);
            }
            if (useFadeDrawableForActionBar() && view != null) {
                view.setBackground(baseSimpleGlass.a(view));
            }
            ViewGroup viewGroup = this.listViewForSimpleGlass;
            i0.b bVar = this.mSystemInsets;
            oi.a.e(viewGroup, bVar.f15123b, bVar.d, l.getCurrentActionBarHeight(), 0);
            if (drawEdgeNavigationBar()) {
                View view2 = new View(context);
                this.navigationBarFadeView = view2;
                view2.setBackground(baseSimpleGlass.b(view2));
                FrameLayout.LayoutParams e10 = ha.e(-1, 0, 80);
                e10.height = this.mSystemInsets.d;
                ((FrameLayout) createView).addView(this.navigationBarFadeView, e10);
            }
        }
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(f2 f2Var) {
        r4 r4Var;
        return allowPresentFragment() && (r4Var = this.parentLayout) != null && ((ActionBarLayout) r4Var).S(f2Var);
    }

    public boolean presentFragmentAsPreview(f2 f2Var) {
        r4 r4Var;
        if (allowPresentFragment() && (r4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) r4Var;
            actionBarLayout.getClass();
            p4 p4Var = new p4(f2Var);
            p4Var.f28382e = true;
            if (actionBarLayout.U(p4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(f2 f2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        r4 r4Var;
        if (allowPresentFragment() && (r4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) r4Var;
            actionBarLayout.getClass();
            p4 p4Var = new p4(f2Var);
            p4Var.f28382e = true;
            p4Var.f28383f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.U(p4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(b2 b2Var) {
        ArrayList<b2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(b2Var);
        updateSheetsVisibility();
    }

    public void resetFragment() {
        if (this.isFinished) {
            clearViews();
            this.isFinished = false;
            this.finishing = false;
        }
    }

    public void resumeDelayedFragmentAnimation() {
        r4 r4Var = this.parentLayout;
        if (r4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) r4Var;
            actionBarLayout.X0 = true;
            Runnable runnable = actionBarLayout.f27245e;
            if (runnable != null && actionBarLayout.d == null) {
                org.telegram.messenger.g0.r(runnable);
                actionBarLayout.f27245e.run();
                actionBarLayout.f27245e = null;
            }
        }
    }

    public void setBulletinDelegate(za zaVar) {
        this.bulletinDelegate = zaVar;
    }

    public void setCurrentAccount(int i7) {
        if (this.fragmentView == null) {
            this.currentAccount = i7;
            return;
        }
        throw new IllegalStateException("trying to set current account when fragment UI already created");
    }

    public void setFinishing(boolean z9) {
        this.finishing = z9;
    }

    public void setFragmentPanTranslationOffset(int i7) {
        r4 r4Var = this.parentLayout;
        if (r4Var != null) {
            r4Var.setFragmentPanTranslationOffset(i7);
        }
    }

    public void setFragmentView(View view) {
        this.fragmentView = view;
    }

    public void setHasOwnBackground(boolean z9) {
        this.hasOwnBackground = z9;
    }

    public void setInBubbleMode(boolean z9) {
        this.inBubbleMode = z9;
    }

    public void setInMenuMode(boolean z9) {
        this.inMenuMode = z9;
    }

    public void setInPreviewMode(boolean z9) {
        this.inPreviewMode = z9;
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setOccupyStatusBar(!z9);
        }
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i7) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                b2 b2Var = this.sheetsStack.get(i10);
                if (b2Var != null) {
                    b2Var.h(i7);
                }
            }
        }
    }

    public void setNavigationBarColor(int i7) {
        boolean z9;
        if (!isSupportEdgeToEdge()) {
            Activity parentActivity = getParentActivity();
            if (parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) parentActivity).D0(i7);
            } else if (parentActivity != null) {
                Window window = parentActivity.getWindow();
                if (Build.VERSION.SDK_INT >= 26 && window != null) {
                    window.getNavigationBarColor();
                }
            }
            if (org.telegram.messenger.g0.B(i7) >= 0.721f) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.messenger.g0.m3(parentActivity, z9);
            r4 r4Var = this.parentLayout;
            if (r4Var != null) {
                r4Var.setNavigationBarColor(i7);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(f2 f2Var) {
        setParentLayout(f2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentGlass(RectF rectF, Runnable runnable) {
        if (this.simpleGlass != null) {
            oi.q qVar = this.glassEngine;
            RectF rectF2 = qVar.f21107e;
            if (rectF == null) {
                if (!rectF2.isEmpty()) {
                    rectF2.setEmpty();
                    qVar.f21108f = true;
                }
            } else if (!rectF2.equals(rectF)) {
                rectF2.set(rectF);
                qVar.f21108f = true;
            }
            this.simpleGlass.f21031j = runnable;
        }
    }

    public void setParentLayout(r4 r4Var) {
        boolean z9;
        r4 r4Var2;
        ViewGroup viewGroup;
        if (this.parentLayout != r4Var) {
            this.parentLayout = r4Var;
            boolean z10 = false;
            if (r4Var != null && ((ActionBarLayout) r4Var).f27248f) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.inBubbleMode = z9;
            View view = this.fragmentView;
            if (view != null) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    try {
                        onRemoveFromParent();
                        viewGroup2.removeViewInLayout(this.fragmentView);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                r4 r4Var3 = this.parentLayout;
                if (r4Var3 != null && r4Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                r4 r4Var4 = this.parentLayout;
                if (r4Var4 != null && r4Var4.getView().getContext() != this.actionBar.getContext()) {
                    z10 = true;
                }
                l lVar = this.actionBar;
                if ((lVar.K || z10) && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
                if (z10) {
                    this.actionBar = null;
                }
            }
            if (this.simpleActionBar != null && (r4Var2 = this.parentLayout) != null && r4Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                org.telegram.messenger.g0.E2(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    z4 createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new bi.l2(this, 1));
                    return;
                }
                return;
            }
            r4 r4Var5 = this.parentLayout;
            if (r4Var5 != null && this.actionBar == null) {
                l createActionBar = createActionBar(r4Var5.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f27704t0 = this;
                }
            }
        }
    }

    public void setPaused(boolean z9) {
        if (this.isPaused == z9) {
            return;
        }
        if (z9) {
            onPause();
        } else {
            onResume();
        }
    }

    public void setPreviewDelegate(e2 e2Var) {
        this.previewDelegate = e2Var;
    }

    public void setRemovingFromStack(boolean z9) {
        this.removingFromStack = z9;
    }

    public void setResourceProvider(h6 h6Var) {
        this.resourceProvider = h6Var;
    }

    public void setSimpleMenuOverlayHost(f2 f2Var) {
        this.simpleMenuOverlayHost = f2Var;
    }

    public void setTitleOverlayText(String str, int i7, Runnable runnable) {
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.N(str, i7, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        l lVar = this.actionBar;
        if (lVar != null && lVar.K) {
            setTitleOverlayText(str, i7, runnable);
        }
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z9, boolean z10) {
        return false;
    }

    public r4[] showAsSheet(f2 f2Var) {
        return showAsSheet(f2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i7) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        r4 r4Var = this.parentLayout;
        if (r4Var != null && (activity = (actionBarLayout = (ActionBarLayout) r4Var).Q0) != null) {
            if (actionBarLayout.W) {
                AnimatorSet animatorSet = actionBarLayout.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.K = null;
                }
                if (actionBarLayout.E0 != null) {
                    actionBarLayout.K();
                } else if (actionBarLayout.F0 != null) {
                    actionBarLayout.N();
                }
                actionBarLayout.f27274s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i7);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                b2 b2Var = this.sheetsStack.get(i7);
                boolean z9 = true;
                if (i7 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z9 = false;
                }
                b2Var.b(z9);
            }
        }
    }

    public boolean useFadeDrawableForActionBar() {
        return true;
    }

    public boolean useSimpleActionBar() {
        return false;
    }

    public void whenFullyVisible(Runnable runnable) {
        this.fullyVisibleListener = runnable;
    }

    public boolean presentFragment(f2 f2Var, boolean z9) {
        r4 r4Var;
        return allowPresentFragment() && (r4Var = this.parentLayout) != null && ((ActionBarLayout) r4Var).T(f2Var, z9);
    }

    public void removeSelfFromStack(boolean z9) {
        r4 r4Var;
        if (this.isFinished || (r4Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) r4Var).d0(this, z9);
        }
    }

    public r4[] showAsSheet(f2 f2Var, d2 d2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        r4[] r4VarArr = {new m4(getParentActivity(), new l2.x(r7, 28))};
        r4VarArr[0].setIsSheet(true);
        LaunchActivity.G1.P.add(r4VarArr[0]);
        f2Var.onTransitionAnimationStart(true, false);
        a2 a2Var = new a2(getParentActivity(), f2Var.getResourceProvider(), d2Var, r4VarArr, f2Var, r7);
        w2[] w2VarArr = {a2Var};
        if (d2Var != null) {
            a2Var.u0(false);
            w2VarArr[0].V0 = d2Var.f27388a;
        }
        w2 w2Var = w2VarArr[0];
        f2Var.parentDialog = w2Var;
        w2Var.R0 = true;
        w2Var.show();
        return r4VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(f2 f2Var, boolean z9, boolean z10) {
        r4 r4Var;
        if (allowPresentFragment() && (r4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) r4Var;
            actionBarLayout.getClass();
            p4 p4Var = new p4(f2Var);
            p4Var.f28380b = z9;
            p4Var.f28381c = z10;
            p4Var.d = true;
            p4Var.f28382e = false;
            p4Var.f28383f = null;
            if (actionBarLayout.U(p4Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z9, DialogInterface.OnDismissListener onDismissListener) {
        r4 r4Var;
        if (dialog != null && (r4Var = this.parentLayout) != null && !((ActionBarLayout) r4Var).B()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.Q && (z9 || !actionBarLayout.i())) {
                ArrayList<b2> arrayList = this.sheetsStack;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (this.sheetsStack.get(size).s() && this.sheetsStack.get(size).t(dialog)) {
                            return dialog;
                        }
                    }
                }
                try {
                    Dialog dialog2 = this.visibleDialog;
                    if (dialog2 != null) {
                        dialog2.dismiss();
                        this.visibleDialog = null;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                try {
                    this.visibleDialog = dialog;
                    dialog.setCanceledOnTouchOutside(true);
                    this.visibleDialog.setOnDismissListener(new bi.u3(5, this, onDismissListener));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
        }
        return null;
    }

    public boolean finishFragment(boolean z9) {
        r4 r4Var;
        if (this.isFinished || (r4Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) r4Var).l(z9, false);
        return true;
    }

    public boolean presentFragment(p4 p4Var) {
        r4 r4Var;
        return allowPresentFragment() && (r4Var = this.parentLayout) != null && ((ActionBarLayout) r4Var).U(p4Var);
    }

    public q9 getOrCreateStoryViewer(int i7) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        q9 q9Var = null;
        q9 q9Var2 = (this.sheetsStack.isEmpty() || !(jg.g.i(1, this.sheetsStack) instanceof q9)) ? null : (q9) jg.g.i(1, this.sheetsStack);
        if (q9Var2 == null || q9Var2.h == i7) {
            q9Var = q9Var2;
        } else {
            q9Var2.u(true);
            removeSheet(q9Var2);
        }
        if (q9Var == null) {
            q9 q9Var3 = new q9(this);
            r4 r4Var = this.parentLayout;
            if (r4Var != null && ((ActionBarLayout) r4Var).f27237b) {
                q9Var3.f9635q1 = true;
            }
            this.sheetsStack.add(q9Var3);
            updateSheetsVisibility();
            return q9Var3;
        }
        return q9Var;
    }

    public void addThemeColorKeys(HashSet<Integer> hashSet) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public void onPanTranslationUpdate(float f10) {
    }

    public void restoreSelfArgs(Bundle bundle) {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setPreviewOpenedProgress(float f10) {
    }

    public void setPreviewReplaceProgress(float f10) {
    }

    public void onBottomSheetCreated() {
    }

    public void onFragmentClosed() {
    }

    public void onLowMemory() {
    }

    public void onPanTransitionEnd() {
    }

    public void onPanTransitionStart() {
    }

    public void onPreviewOpenAnimationEnd() {
    }

    public void onThemeColorsChanged() {
    }

    public void onUserLeaveHint() {
    }

    public void saveKeyboardPositionBeforeTransition() {
    }

    public void onSlideProgress(boolean z9, float f10) {
    }

    public void onTransitionAnimationProgress(boolean z9, float f10) {
    }

    public void prepareFragmentToSlide(boolean z9, boolean z10) {
    }

    public void onActivityResultFragment(int i7, int i10, Intent intent) {
    }

    public void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
    }

    public void onInsets(int i7, int i10, int i11, int i12) {
    }
}
