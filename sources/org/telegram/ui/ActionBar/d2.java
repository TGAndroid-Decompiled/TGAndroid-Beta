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
import b8.mf;
import ei.d7;
import ei.r9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ld;
import org.telegram.messenger.li;
import org.telegram.messenger.q9;
import org.telegram.messenger.qr;
import org.telegram.messenger.us;
import org.telegram.messenger.vv;
import org.telegram.messenger.w7;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.gx;
import org.telegram.ui.my0;
public abstract class d2 {
    protected k actionBar;
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
    protected q4 parentLayout;
    private c2 previewDelegate;
    private boolean removingFromStack;
    protected e6 resourceProvider;
    public ArrayList<z1> sheetsStack;
    protected y4 simpleActionBar;
    private pi.a simpleGlass;
    private i5 simpleMenuOverlay;
    private d2 simpleMenuOverlayHost;
    public Dialog visibleDialog;
    protected int currentAccount = h10.f22829t0;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final pi.q glassEngine = new pi.q();
    private final e6 themedColors = new q1(this, 1);
    protected i0.b mSystemInsets = i0.b.f14494e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public d2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new x1(0, this));
    }

    public static boolean hasFullyVisibleSheets(d2 d2Var) {
        gx x10;
        if (d2Var != null) {
            if (!d2Var.hasShownFullyVisibleSheet()) {
                if ((d2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) d2Var.getParentLayout()).x()) != null && x10.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(d2 d2Var) {
        gx x10;
        if (d2Var != null) {
            if (!d2Var.hasShownSheet()) {
                if ((d2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) d2Var.getParentLayout()).x()) != null && x10.hasShownSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean W(MotionEvent motionEvent, boolean z10) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(z1 z1Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        r9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f10958w0 = z1Var;
            z1Var.n(new ei.o3(lastStoryViewer, 3));
        }
        this.sheetsStack.add(z1Var);
        updateSheetsVisibility();
    }

    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return true;
    }

    public boolean allowPresentFragment() {
        return true;
    }

    public void attachSheets(v vVar) {
        if (this.sheetsStack != null) {
            for (int i3 = 0; i3 < this.sheetsStack.size(); i3++) {
                z1 z1Var = this.sheetsStack.get(i3);
                if (z1Var != null && z1Var.y()) {
                    org.telegram.messenger.g0.E2(z1Var.d());
                    vVar.addView(z1Var.d());
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
        ArrayList<z1> arrayList = this.sheetsStack;
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
        k kVar = this.actionBar;
        if (kVar != null) {
            ViewGroup viewGroup2 = (ViewGroup) kVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            this.actionBar = null;
        }
        y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            org.telegram.messenger.g0.E2(y4Var);
            this.simpleActionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public boolean closeSheet() {
        ArrayList<z1> arrayList = this.sheetsStack;
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

    public k createActionBar(Context context) {
        q4 q4Var;
        k kVar = new k(context, getResourceProvider());
        r6.i(k6.f28160s8, kVar, this.themedColors);
        r6.m(kVar, 3, k6.f28179t8, this.themedColors);
        r6.a(kVar, k6.f28292z8, this.themedColors, true);
        r6.m(kVar, 1, k6.f28216v8, this.themedColors);
        r6.b(kVar, k6.f28275y8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((q4Var = this.parentLayout) == null || !((ActionBarLayout) q4Var).T0)) {
            return kVar;
        }
        kVar.setOccupyStatusBar(false);
        return kVar;
    }

    public org.telegram.ui.i4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.u3) && getLastSheet().s()) {
                return ((org.telegram.ui.u3) getLastSheet()).L;
            }
            q4 q4Var = this.parentLayout;
            if ((q4Var instanceof ActionBarLayout) && ((ActionBarLayout) q4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.u3)) {
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
                if (u3Var.s()) {
                    return u3Var.L;
                }
            }
        }
        org.telegram.ui.i4 i4Var = new org.telegram.ui.i4(this);
        org.telegram.ui.u3 u3Var2 = i4Var.L;
        addSheet(u3Var2);
        x2.b(u3Var2);
        return i4Var;
    }

    public r9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        r9 r9Var = new r9(this);
        q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).f27279b) {
            r9Var.f10950s1 = true;
        }
        this.sheetsStack.add(r9Var);
        updateSheetsVisibility();
        return r9Var;
    }

    public y4 createSimpleActionBar(Context context) {
        q4 q4Var;
        y4 y4Var = new y4(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((q4Var = this.parentLayout) == null || !((ActionBarLayout) q4Var).T0)) {
            return y4Var;
        }
        y4Var.setOccupyStatusBar(false);
        return y4Var;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i3 = 0; i3 < this.sheetsStack.size(); i3++) {
                z1 z1Var = this.sheetsStack.get(i3);
                if (z1Var != null && z1Var.y()) {
                    org.telegram.messenger.g0.E2(z1Var.d());
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
        Typeface typeface = org.telegram.messenger.g0.f22580a;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        c2 c2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (c2Var = this.previewDelegate) != null) {
            ((my0) ((ci0) c2Var).f44362b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        q4 q4Var = this.parentLayout;
        if (q4Var != null) {
            ((ActionBarLayout) q4Var).v();
        }
    }

    public org.telegram.messenger.c getAccountInstance() {
        return org.telegram.messenger.c.a(this.currentAccount);
    }

    public k getActionBar() {
        return this.actionBar;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public org.telegram.ui.i4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.u3) && getLastSheet().s()) {
            return ((org.telegram.ui.u3) getLastSheet()).L;
        }
        q4 q4Var = this.parentLayout;
        if ((q4Var instanceof ActionBarLayout) && ((ActionBarLayout) q4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.u3)) {
            org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
            if (u3Var.s()) {
                return u3Var.L;
            }
            return null;
        }
        return null;
    }

    public m4 getBackButtonState() {
        k kVar = this.actionBar;
        if (kVar != null) {
            return kVar.getBackButtonState();
        }
        return null;
    }

    public pi.a getBaseSimpleGlass() {
        if (this.simpleGlass == null) {
            this.simpleGlass = new pi.a(this.glassEngine, new n(this));
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
        return ConnectionsManager.getInstance(getAccountInstance().f21919a);
    }

    public org.telegram.messenger.g5 getContactsController() {
        return org.telegram.messenger.g5.r(getAccountInstance().f21919a);
    }

    public Context getContext() {
        return getParentActivity();
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        return null;
    }

    public org.telegram.messenger.z5 getDownloadController() {
        return org.telegram.messenger.z5.q(getAccountInstance().f21919a);
    }

    public m3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return m3.f28338b;
        }
        return m3.f28337a;
    }

    public w7 getFileLoader() {
        return w7.G(getAccountInstance().f21919a);
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public d2 getFragmentForAlert(int i3) {
        q4 q4Var = this.parentLayout;
        if (q4Var != null && q4Var.getFragmentStack().size() > i3 + 1) {
            return (d2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i3);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public q9 getGiftAuctionsController() {
        return q9.c(getAccountInstance().f21919a);
    }

    public boolean getInPassivePreviewMode() {
        q4 q4Var = this.parentLayout;
        if (q4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) q4Var;
            if ((actionBarLayout.h && actionBarLayout.K == null) || actionBarLayout.f27280b0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public z1 getLastSheet() {
        ArrayList<z1> arrayList = this.sheetsStack;
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

    public r9 getLastStoryViewer() {
        ArrayList<z1> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof r9) && this.sheetsStack.get(size).s()) {
                    return (r9) this.sheetsStack.get(size);
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

    public tj0 getListViewForSimpleGlass() {
        return null;
    }

    public ld getLocationController() {
        return ld.f(getAccountInstance().f21919a);
    }

    public MediaController getMediaController() {
        return MediaController.B();
    }

    public li getMediaDataController() {
        return li.b0(getAccountInstance().f21919a);
    }

    public hp getMessagesController() {
        return hp.s1(getAccountInstance().f21919a);
    }

    public qr getMessagesStorage() {
        return qr.a0(getAccountInstance().f21919a);
    }

    public int getNavigationBarColor() {
        int w02 = k6.w0(k6.f27824a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i3 = 0; i3 < this.sheetsStack.size(); i3++) {
                z1 z1Var = this.sheetsStack.get(i3);
                if (z1Var.y()) {
                    w02 = z1Var.e(w02);
                }
            }
        }
        return w02;
    }

    public hs getNotificationCenter() {
        return hs.f(getAccountInstance().f21919a);
    }

    public us getNotificationsController() {
        return us.t(getAccountInstance().f21919a);
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().c();
    }

    public r9 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        r9 r9Var = (this.sheetsStack.isEmpty() || !(k2.p1.h(1, this.sheetsStack) instanceof r9)) ? null : (r9) k2.p1.h(1, this.sheetsStack);
        if (r9Var == null) {
            r9Var = new r9(this);
            q4 q4Var = this.parentLayout;
            if (q4Var != null && ((ActionBarLayout) q4Var).f27279b) {
                r9Var.f10950s1 = true;
            }
            this.sheetsStack.add(r9Var);
            updateSheetsVisibility();
        }
        return r9Var;
    }

    public Activity getParentActivity() {
        q4 q4Var = this.parentLayout;
        if (q4Var != null) {
            return q4Var.getParentActivity();
        }
        return null;
    }

    public q4 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public e6 getResourceProvider() {
        return this.resourceProvider;
    }

    public km0 getScrollViewForSimpleGlass() {
        return null;
    }

    public vv getSecretChatHelper() {
        return vv.i(getAccountInstance().f21919a);
    }

    public yy getSendMessagesHelper() {
        return yy.C(getAccountInstance().f21919a);
    }

    public y4 getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public i5 getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        d2 d2Var = this.simpleMenuOverlayHost;
        if (d2Var != null && d2Var.fragmentView != null) {
            return d2Var.getSimpleMenuOverlay();
        }
        View view = this.fragmentView;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            y4 y4Var = this.simpleActionBar;
            if (y4Var != null && (y4Var.getParent() instanceof FrameLayout)) {
                viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            } else {
                return null;
            }
        }
        i5 i5Var = this.simpleMenuOverlay;
        if (i5Var == null || i5Var.getParent() != viewGroup) {
            i5 i5Var2 = this.simpleMenuOverlay;
            if (i5Var2 != null) {
                i5Var2.a(false);
                org.telegram.messenger.g0.E2(this.simpleMenuOverlay);
            }
            i5 i5Var3 = new i5(viewGroup.getContext());
            this.simpleMenuOverlay = i5Var3;
            viewGroup.addView(i5Var3, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.simpleMenuOverlay;
    }

    public ArrayList<t6> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i3) {
        return k6.w0(i3, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return k6.R0(str);
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
        return k6.V0(str);
    }

    public h10 getUserConfig() {
        return h10.i(getAccountInstance().f21919a);
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
        ArrayList<z1> arrayList = this.sheetsStack;
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
            for (int i3 = 0; i3 < this.sheetsStack.size(); i3++) {
                this.sheetsStack.get(i3);
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
        q4 q4Var = this.parentLayout;
        if (q4Var != null && q4Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int x02;
        if (getLastStoryViewer() == null || getLastStoryViewer().I0) {
            if (!hasForceLightStatusBar() || k6.D0().q()) {
                e6 resourceProvider = getResourceProvider();
                int i3 = k6.f28160s8;
                k kVar = this.actionBar;
                if (kVar != null && kVar.v()) {
                    i3 = k6.f28236w8;
                } else if (this.simpleActionBar != null) {
                    i3 = k6.f27824a7;
                }
                if (resourceProvider != null) {
                    x02 = resourceProvider.f(i3);
                } else {
                    x02 = k6.x0(null, i3, true);
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
            for (int i3 = 0; i3 < this.sheetsStack.size(); i3++) {
                z1 z1Var = this.sheetsStack.get(i3);
                if ((z1Var instanceof r9) && view == ((r9) z1Var).f10948s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d2.movePreviewFragment(float):void");
    }

    public boolean needDelayOpenAnimation() {
        return false;
    }

    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
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
        k actionBar;
        String title;
        this.isFullyVisible = true;
        if (((AccessibilityManager) org.telegram.messenger.t0.f25457b.getSystemService("accessibility")).isEnabled() && ((actionBar = getActionBar()) != null || this.simpleActionBar != null)) {
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
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E0 = false;
            kVar.P();
            x xVar = kVar.F;
            if (xVar != null) {
                int childCount = xVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = xVar.getChildAt(i3);
                    if (childAt instanceof q0) {
                        ((q0) childAt).o();
                    }
                }
            }
        }
    }

    public AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        return null;
    }

    public boolean onFragmentCreate() {
        return true;
    }

    public void onFragmentDestroy() {
        boolean z10;
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().k(this.classGuid);
        this.isFinished = true;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setEnabled(false);
        }
        y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !org.telegram.messenger.g0.Q1() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (k6.x0(null, k6.f28160s8, false) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.p3(parentActivity, z10);
        }
        ArrayList<z1> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                z1 z1Var = this.sheetsStack.get(size);
                z1Var.b(false);
                z1Var.a(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        int i3 = 0;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i10 = I0.d;
        int i11 = I0.f14496b;
        this.mSystemInsets = I0;
        ViewGroup viewGroup = this.listViewForSimpleGlass;
        if (viewGroup != null) {
            pi.a.e(viewGroup, i11, i10, k.getCurrentActionBarHeight(), 0);
        }
        if (this.navigationBarFadeView != null) {
            if (this.mSystemInsets.d < org.telegram.messenger.g0.L(40.0f)) {
                i3 = 8;
            }
            this.navigationBarFadeView.getLayoutParams().height = this.mSystemInsets.d;
            this.navigationBarFadeView.setVisibility(i3);
        }
        int i12 = I0.f14495a;
        int i13 = I0.f14497c;
        this.bottomInset = i10;
        onInsets(i12, i11, i13, i10);
        return r0.k1.f54025b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E0 = false;
            kVar.P();
            x xVar = kVar.F;
            if (xVar != null) {
                int childCount = xVar.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = xVar.getChildAt(i3);
                    if (childAt instanceof q0) {
                        ((q0) childAt).o();
                    }
                }
            }
        }
        i5 i5Var = this.simpleMenuOverlay;
        if (i5Var != null) {
            i5Var.a(false);
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
            r9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f10952t1 = true;
            ei.q9 q9Var = lastStoryViewer.A0;
            if (q9Var != null) {
                q9Var.release(null);
                lastStoryViewer.A0 = null;
            }
            if (lastStoryViewer.F0 == null) {
                gi.r3 r3Var = lastStoryViewer.E0;
                if (r3Var != null) {
                    r3Var.d(0L, null);
                }
                ei.g1 g1Var = lastStoryViewer.B0;
                if (g1Var != null) {
                    if (g1Var.f10301n) {
                        g1Var.s(null);
                    } else {
                        g1Var.e();
                    }
                    lastStoryViewer.B0 = null;
                }
            }
            d7 d7Var = lastStoryViewer.f10956v1;
            if (d7Var != null) {
                d7Var.b();
            }
            getLastStoryViewer().d0();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<z1> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            updateSheetsVisibility();
        }
    }

    public void onResume() {
        this.isPaused = false;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E0 = true;
            kVar.P();
        }
        if (getLastStoryViewer() != null) {
            r9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f10952t1 = false;
            if (!org.telegram.ui.i4.v().W && lastStoryViewer.H() != null) {
                lastStoryViewer.H().d1(false);
            }
            d7 d7Var = lastStoryViewer.f10956v1;
            if (d7Var != null) {
                d7Var.a(false);
            }
            if (ei.n1.f10647a0.T) {
                ei.n1.b();
            }
            getLastStoryViewer().d0();
        }
    }

    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        this.inTransitionAnimation = false;
    }

    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        this.inTransitionAnimation = true;
        if (z10) {
            this.fragmentBeginToShow = true;
        }
    }

    public void onViewCreated(View view) {
        this.glassEngine.i(view);
    }

    public View performCreateView(Context context) {
        tj0 tj0Var;
        View createView = createView(context);
        tj0 listViewForSimpleGlass = getListViewForSimpleGlass();
        km0 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            tj0Var = listViewForSimpleGlass;
        } else {
            tj0Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = tj0Var;
        if (tj0Var != null && (createView instanceof FrameLayout)) {
            pi.a baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.f((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                e6 e6Var = this.resourceProvider;
                baseSimpleGlass.f53532l = frameLayout;
                baseSimpleGlass.f53533m = scrollViewForSimpleGlass;
                baseSimpleGlass.f53534n = new ci.g(8, scrollViewForSimpleGlass, frameLayout);
                pi.q qVar = baseSimpleGlass.f53523a;
                qVar.getClass();
                scrollViewForSimpleGlass.M.add(new pi.k(qVar, scrollViewForSimpleGlass));
                pi.l lVar = new pi.l(qVar);
                if (scrollViewForSimpleGlass.K == null) {
                    scrollViewForSimpleGlass.K = new ArrayList();
                }
                if (!scrollViewForSimpleGlass.K.contains(lVar)) {
                    scrollViewForSimpleGlass.K.add(lVar);
                }
                scrollViewForSimpleGlass.setClipToPadding(false);
                baseSimpleGlass.g(frameLayout, view, e6Var);
            }
            if (useFadeDrawableForActionBar() && view != null) {
                view.setBackground(baseSimpleGlass.a(view));
            }
            ViewGroup viewGroup = this.listViewForSimpleGlass;
            i0.b bVar = this.mSystemInsets;
            pi.a.e(viewGroup, bVar.f14496b, bVar.d, k.getCurrentActionBarHeight(), 0);
            if (drawEdgeNavigationBar()) {
                View view2 = new View(context);
                this.navigationBarFadeView = view2;
                view2.setBackground(baseSimpleGlass.b(view2));
                FrameLayout.LayoutParams e10 = mf.e(-1, 0, 80);
                e10.height = this.mSystemInsets.d;
                ((FrameLayout) createView).addView(this.navigationBarFadeView, e10);
            }
        }
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(d2 d2Var) {
        q4 q4Var;
        return allowPresentFragment() && (q4Var = this.parentLayout) != null && ((ActionBarLayout) q4Var).S(d2Var);
    }

    public boolean presentFragmentAsPreview(d2 d2Var) {
        q4 q4Var;
        if (allowPresentFragment() && (q4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) q4Var;
            actionBarLayout.getClass();
            o4 o4Var = new o4(d2Var);
            o4Var.f28398e = true;
            if (actionBarLayout.U(o4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(d2 d2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        q4 q4Var;
        if (allowPresentFragment() && (q4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) q4Var;
            actionBarLayout.getClass();
            o4 o4Var = new o4(d2Var);
            o4Var.f28398e = true;
            o4Var.f28399f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.U(o4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(z1 z1Var) {
        ArrayList<z1> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(z1Var);
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
        q4 q4Var = this.parentLayout;
        if (q4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) q4Var;
            actionBarLayout.Y0 = true;
            Runnable runnable = actionBarLayout.f27287e;
            if (runnable != null && actionBarLayout.d == null) {
                org.telegram.messenger.g0.r(runnable);
                actionBarLayout.f27287e.run();
                actionBarLayout.f27287e = null;
            }
        }
    }

    public void setBulletinDelegate(za zaVar) {
        this.bulletinDelegate = zaVar;
    }

    public void setCurrentAccount(int i3) {
        if (this.fragmentView == null) {
            this.currentAccount = i3;
            return;
        }
        throw new IllegalStateException("trying to set current account when fragment UI already created");
    }

    public void setFinishing(boolean z10) {
        this.finishing = z10;
    }

    public void setFragmentPanTranslationOffset(int i3) {
        q4 q4Var = this.parentLayout;
        if (q4Var != null) {
            q4Var.setFragmentPanTranslationOffset(i3);
        }
    }

    public void setFragmentView(View view) {
        this.fragmentView = view;
    }

    public void setHasOwnBackground(boolean z10) {
        this.hasOwnBackground = z10;
    }

    public void setInBubbleMode(boolean z10) {
        this.inBubbleMode = z10;
    }

    public void setInMenuMode(boolean z10) {
        this.inMenuMode = z10;
    }

    public void setInPreviewMode(boolean z10) {
        this.inPreviewMode = z10;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setOccupyStatusBar(!z10);
        }
        y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i3) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                z1 z1Var = this.sheetsStack.get(i10);
                if (z1Var != null) {
                    z1Var.h(i3);
                }
            }
        }
    }

    public void setNavigationBarColor(int i3) {
        boolean z10;
        if (!isSupportEdgeToEdge()) {
            Activity parentActivity = getParentActivity();
            if (parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) parentActivity).D0(i3);
            } else if (parentActivity != null) {
                Window window = parentActivity.getWindow();
                if (Build.VERSION.SDK_INT >= 26 && window != null) {
                    window.getNavigationBarColor();
                }
            }
            if (org.telegram.messenger.g0.B(i3) >= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(parentActivity, z10);
            q4 q4Var = this.parentLayout;
            if (q4Var != null) {
                q4Var.setNavigationBarColor(i3);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(d2 d2Var) {
        setParentLayout(d2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentGlass(RectF rectF, Runnable runnable) {
        if (this.simpleGlass != null) {
            pi.q qVar = this.glassEngine;
            RectF rectF2 = qVar.f53605e;
            if (rectF == null) {
                if (!rectF2.isEmpty()) {
                    rectF2.setEmpty();
                    qVar.f53606f = true;
                }
            } else if (!rectF2.equals(rectF)) {
                rectF2.set(rectF);
                qVar.f53606f = true;
            }
            this.simpleGlass.f53530j = runnable;
        }
    }

    public void setParentLayout(q4 q4Var) {
        boolean z10;
        q4 q4Var2;
        ViewGroup viewGroup;
        if (this.parentLayout != q4Var) {
            this.parentLayout = q4Var;
            boolean z11 = false;
            if (q4Var != null && ((ActionBarLayout) q4Var).f27290f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.inBubbleMode = z10;
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
                q4 q4Var3 = this.parentLayout;
                if (q4Var3 != null && q4Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                q4 q4Var4 = this.parentLayout;
                if (q4Var4 != null && q4Var4.getView().getContext() != this.actionBar.getContext()) {
                    z11 = true;
                }
                k kVar = this.actionBar;
                if ((kVar.L || z11) && (viewGroup = (ViewGroup) kVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                }
                if (z11) {
                    this.actionBar = null;
                }
            }
            if (this.simpleActionBar != null && (q4Var2 = this.parentLayout) != null && q4Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                org.telegram.messenger.g0.E2(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    y4 createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new ci.c2(this, 1));
                    return;
                }
                return;
            }
            q4 q4Var5 = this.parentLayout;
            if (q4Var5 != null && this.actionBar == null) {
                k createActionBar = createActionBar(q4Var5.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f27742u0 = this;
                }
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.isPaused == z10) {
            return;
        }
        if (z10) {
            onPause();
        } else {
            onResume();
        }
    }

    public void setPreviewDelegate(c2 c2Var) {
        this.previewDelegate = c2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(e6 e6Var) {
        this.resourceProvider = e6Var;
    }

    public void setSimpleMenuOverlayHost(d2 d2Var) {
        this.simpleMenuOverlayHost = d2Var;
    }

    public void setTitleOverlayText(String str, int i3, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.L(str, i3, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i3, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null && kVar.L) {
            setTitleOverlayText(str, i3, runnable);
        }
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public q4[] showAsSheet(d2 d2Var) {
        return showAsSheet(d2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i3) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        q4 q4Var = this.parentLayout;
        if (q4Var != null && (activity = (actionBarLayout = (ActionBarLayout) q4Var).R0) != null) {
            if (actionBarLayout.f27277a0) {
                AnimatorSet animatorSet = actionBarLayout.L;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.L = null;
                }
                if (actionBarLayout.F0 != null) {
                    actionBarLayout.K();
                } else if (actionBarLayout.G0 != null) {
                    actionBarLayout.N();
                }
                actionBarLayout.f27316s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i3);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i3 = 0; i3 < this.sheetsStack.size(); i3++) {
                z1 z1Var = this.sheetsStack.get(i3);
                boolean z10 = true;
                if (i3 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z10 = false;
                }
                z1Var.b(z10);
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

    public boolean presentFragment(d2 d2Var, boolean z10) {
        q4 q4Var;
        return allowPresentFragment() && (q4Var = this.parentLayout) != null && ((ActionBarLayout) q4Var).T(d2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        q4 q4Var;
        if (this.isFinished || (q4Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) q4Var).d0(this, z10);
        }
    }

    public q4[] showAsSheet(d2 d2Var, b2 b2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        q4[] q4VarArr = {new l4(getParentActivity(), new l5.b(r7, 29))};
        q4VarArr[0].setIsSheet(true);
        LaunchActivity.K1.Q.add(q4VarArr[0]);
        d2Var.onTransitionAnimationStart(true, false);
        y1 y1Var = new y1(getParentActivity(), d2Var.getResourceProvider(), b2Var, q4VarArr, d2Var, r7);
        t2[] t2VarArr = {y1Var};
        if (b2Var != null) {
            y1Var.u0(false);
            t2VarArr[0].W0 = b2Var.f27395a;
        }
        t2 t2Var = t2VarArr[0];
        d2Var.parentDialog = t2Var;
        t2Var.S0 = true;
        t2Var.show();
        return q4VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(d2 d2Var, boolean z10, boolean z11) {
        q4 q4Var;
        if (allowPresentFragment() && (q4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) q4Var;
            actionBarLayout.getClass();
            o4 o4Var = new o4(d2Var);
            o4Var.f28396b = z10;
            o4Var.f28397c = z11;
            o4Var.d = true;
            o4Var.f28398e = false;
            o4Var.f28399f = null;
            if (actionBarLayout.U(o4Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        q4 q4Var;
        if (dialog != null && (q4Var = this.parentLayout) != null && !((ActionBarLayout) q4Var).B()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.R && (z10 || !actionBarLayout.i())) {
                ArrayList<z1> arrayList = this.sheetsStack;
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
                    this.visibleDialog.setOnDismissListener(new ci.h3(5, this, onDismissListener));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
        }
        return null;
    }

    public boolean finishFragment(boolean z10) {
        q4 q4Var;
        if (this.isFinished || (q4Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) q4Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(o4 o4Var) {
        q4 q4Var;
        return allowPresentFragment() && (q4Var = this.parentLayout) != null && ((ActionBarLayout) q4Var).U(o4Var);
    }

    public r9 getOrCreateStoryViewer(int i3) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        r9 r9Var = null;
        r9 r9Var2 = (this.sheetsStack.isEmpty() || !(k2.p1.h(1, this.sheetsStack) instanceof r9)) ? null : (r9) k2.p1.h(1, this.sheetsStack);
        if (r9Var2 == null || r9Var2.h == i3) {
            r9Var = r9Var2;
        } else {
            r9Var2.D(true);
            removeSheet(r9Var2);
        }
        if (r9Var == null) {
            r9 r9Var3 = new r9(this);
            q4 q4Var = this.parentLayout;
            if (q4Var != null && ((ActionBarLayout) q4Var).f27279b) {
                r9Var3.f10950s1 = true;
            }
            this.sheetsStack.add(r9Var3);
            updateSheetsVisibility();
            return r9Var3;
        }
        return r9Var;
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

    public void onSlideProgress(boolean z10, float f10) {
    }

    public void onTransitionAnimationProgress(boolean z10, float f10) {
    }

    public void prepareFragmentToSlide(boolean z10, boolean z11) {
    }

    public void onActivityResultFragment(int i3, int i10, Intent intent) {
    }

    public void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
    }

    public void onInsets(int i3, int i10, int i11, int i12) {
    }
}
