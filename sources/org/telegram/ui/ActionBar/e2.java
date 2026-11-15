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
import c8.ja;
import fi.h9;
import fi.i9;
import fi.w6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.at;
import org.telegram.messenger.bw;
import org.telegram.messenger.ez;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.rd;
import org.telegram.messenger.si;
import org.telegram.messenger.v9;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kx;
import org.telegram.ui.ni0;
import org.telegram.ui.uy0;
public abstract class e2 {
    protected k actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private wa bulletinDelegate;
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
    protected o4 parentLayout;
    private d2 previewDelegate;
    private boolean removingFromStack;
    protected e6 resourceProvider;
    public ArrayList<a2> sheetsStack;
    protected w4 simpleActionBar;
    private ri.a simpleGlass;
    private g5 simpleMenuOverlay;
    private e2 simpleMenuOverlayHost;
    public Dialog visibleDialog;
    protected int currentAccount = m10.f24940t0;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final ri.q glassEngine = new ri.q();
    private final e6 themedColors = new r1(this, 1);
    protected i0.c mSystemInsets = i0.c.f15573e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public e2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new y1(0, this));
    }

    public static boolean hasFullyVisibleSheets(e2 e2Var) {
        kx x10;
        if (e2Var != null) {
            if (!e2Var.hasShownFullyVisibleSheet()) {
                if ((e2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) e2Var.getParentLayout()).x()) != null && x10.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(e2 e2Var) {
        kx x10;
        if (e2Var != null) {
            if (!e2Var.hasShownSheet()) {
                if ((e2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) e2Var.getParentLayout()).x()) != null && x10.hasShownSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean X(MotionEvent motionEvent, boolean z10) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(a2 a2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f11880w0 = a2Var;
            a2Var.n(new fi.g3(lastStoryViewer, 3));
        }
        this.sheetsStack.add(a2Var);
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
                a2 a2Var = this.sheetsStack.get(i7);
                if (a2Var != null && a2Var.y()) {
                    org.telegram.messenger.g0.E2(a2Var.d());
                    wVar.addView(a2Var.d());
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
        ArrayList<a2> arrayList = this.sheetsStack;
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
        w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            org.telegram.messenger.g0.E2(w4Var);
            this.simpleActionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public boolean closeSheet() {
        ArrayList<a2> arrayList = this.sheetsStack;
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
        o4 o4Var;
        k kVar = new k(context, getResourceProvider());
        q6.h(j6.f29129s8, kVar, this.themedColors);
        q6.l(kVar, 3, j6.f29147t8, this.themedColors);
        q6.a(kVar, j6.f29262z8, this.themedColors, true);
        q6.l(kVar, 1, j6.f29186v8, this.themedColors);
        q6.b(kVar, j6.f29243y8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((o4Var = this.parentLayout) == null || !((ActionBarLayout) o4Var).T0)) {
            return kVar;
        }
        kVar.setOccupyStatusBar(false);
        return kVar;
    }

    public org.telegram.ui.g4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.t3) && getLastSheet().s()) {
                return ((org.telegram.ui.t3) getLastSheet()).L;
            }
            o4 o4Var = this.parentLayout;
            if ((o4Var instanceof ActionBarLayout) && ((ActionBarLayout) o4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.t3)) {
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
                if (t3Var.s()) {
                    return t3Var.L;
                }
            }
        }
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(this);
        org.telegram.ui.t3 t3Var2 = g4Var.L;
        addSheet(t3Var2);
        y2.b(t3Var2);
        return g4Var;
    }

    public i9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = new i9(this);
        o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).f28328b) {
            i9Var.f11869r1 = true;
        }
        this.sheetsStack.add(i9Var);
        updateSheetsVisibility();
        return i9Var;
    }

    public w4 createSimpleActionBar(Context context) {
        o4 o4Var;
        w4 w4Var = new w4(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((o4Var = this.parentLayout) == null || !((ActionBarLayout) o4Var).T0)) {
            return w4Var;
        }
        w4Var.setOccupyStatusBar(false);
        return w4Var;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                a2 a2Var = this.sheetsStack.get(i7);
                if (a2Var != null && a2Var.y()) {
                    org.telegram.messenger.g0.E2(a2Var.d());
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
        Typeface typeface = org.telegram.messenger.g0.f23583a;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        d2 d2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (d2Var = this.previewDelegate) != null) {
            ((uy0) ((ni0) d2Var).f49569b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        o4 o4Var = this.parentLayout;
        if (o4Var != null) {
            ((ActionBarLayout) o4Var).v();
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

    public org.telegram.ui.g4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.t3) && getLastSheet().s()) {
            return ((org.telegram.ui.t3) getLastSheet()).L;
        }
        o4 o4Var = this.parentLayout;
        if ((o4Var instanceof ActionBarLayout) && ((ActionBarLayout) o4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.t3)) {
            org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
            if (t3Var.s()) {
                return t3Var.L;
            }
            return null;
        }
        return null;
    }

    public k4 getBackButtonState() {
        k kVar = this.actionBar;
        if (kVar != null) {
            return kVar.getBackButtonState();
        }
        return null;
    }

    public ri.a getBaseSimpleGlass() {
        if (this.simpleGlass == null) {
            this.simpleGlass = new ri.a(this.glassEngine, new n(this));
        }
        return this.simpleGlass;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public wa getBulletinDelegate() {
        return this.bulletinDelegate;
    }

    public FrameLayout getBulletinLayoutContainer() {
        return getLayoutContainer();
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(getAccountInstance().f22782a);
    }

    public org.telegram.messenger.g5 getContactsController() {
        return org.telegram.messenger.g5.r(getAccountInstance().f22782a);
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
        return org.telegram.messenger.z5.q(getAccountInstance().f22782a);
    }

    public m3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return m3.f29381b;
        }
        return m3.f29380a;
    }

    public w7 getFileLoader() {
        return w7.G(getAccountInstance().f22782a);
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public e2 getFragmentForAlert(int i7) {
        o4 o4Var = this.parentLayout;
        if (o4Var != null && o4Var.getFragmentStack().size() > i7 + 1) {
            return (e2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i7);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public v9 getGiftAuctionsController() {
        return v9.c(getAccountInstance().f22782a);
    }

    public boolean getInPassivePreviewMode() {
        o4 o4Var = this.parentLayout;
        if (o4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) o4Var;
            if ((actionBarLayout.h && actionBarLayout.K == null) || actionBarLayout.f28329b0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public a2 getLastSheet() {
        ArrayList<a2> arrayList = this.sheetsStack;
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

    public i9 getLastStoryViewer() {
        ArrayList<a2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof i9) && this.sheetsStack.get(size).s()) {
                    return (i9) this.sheetsStack.get(size);
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

    public uj0 getListViewForSimpleGlass() {
        return null;
    }

    public rd getLocationController() {
        return rd.f(getAccountInstance().f22782a);
    }

    public MediaController getMediaController() {
        return MediaController.B();
    }

    public si getMediaDataController() {
        return si.b0(getAccountInstance().f22782a);
    }

    public np getMessagesController() {
        return np.s1(getAccountInstance().f22782a);
    }

    public vr getMessagesStorage() {
        return vr.a0(getAccountInstance().f22782a);
    }

    public int getNavigationBarColor() {
        int w02 = j6.w0(j6.f28792a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                a2 a2Var = this.sheetsStack.get(i7);
                if (a2Var.y()) {
                    w02 = a2Var.e(w02);
                }
            }
        }
        return w02;
    }

    public ns getNotificationCenter() {
        return ns.f(getAccountInstance().f22782a);
    }

    public at getNotificationsController() {
        return at.t(getAccountInstance().f22782a);
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().d();
    }

    public i9 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = (this.sheetsStack.isEmpty() || !(i5.c.h(1, this.sheetsStack) instanceof i9)) ? null : (i9) i5.c.h(1, this.sheetsStack);
        if (i9Var == null) {
            i9Var = new i9(this);
            o4 o4Var = this.parentLayout;
            if (o4Var != null && ((ActionBarLayout) o4Var).f28328b) {
                i9Var.f11869r1 = true;
            }
            this.sheetsStack.add(i9Var);
            updateSheetsVisibility();
        }
        return i9Var;
    }

    public Activity getParentActivity() {
        o4 o4Var = this.parentLayout;
        if (o4Var != null) {
            return o4Var.getParentActivity();
        }
        return null;
    }

    public o4 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public e6 getResourceProvider() {
        return this.resourceProvider;
    }

    public lm0 getScrollViewForSimpleGlass() {
        return null;
    }

    public bw getSecretChatHelper() {
        return bw.i(getAccountInstance().f22782a);
    }

    public ez getSendMessagesHelper() {
        return ez.C(getAccountInstance().f22782a);
    }

    public w4 getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public g5 getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        e2 e2Var = this.simpleMenuOverlayHost;
        if (e2Var != null && e2Var.fragmentView != null) {
            return e2Var.getSimpleMenuOverlay();
        }
        View view = this.fragmentView;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            w4 w4Var = this.simpleActionBar;
            if (w4Var != null && (w4Var.getParent() instanceof FrameLayout)) {
                viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            } else {
                return null;
            }
        }
        g5 g5Var = this.simpleMenuOverlay;
        if (g5Var == null || g5Var.getParent() != viewGroup) {
            g5 g5Var2 = this.simpleMenuOverlay;
            if (g5Var2 != null) {
                g5Var2.a(false);
                org.telegram.messenger.g0.E2(this.simpleMenuOverlay);
            }
            g5 g5Var3 = new g5(viewGroup.getContext());
            this.simpleMenuOverlay = g5Var3;
            viewGroup.addView(g5Var3, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.simpleMenuOverlay;
    }

    public ArrayList<s6> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i7) {
        return j6.w0(i7, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return j6.R0(str);
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
        return j6.V0(str);
    }

    public m10 getUserConfig() {
        return m10.i(getAccountInstance().f22782a);
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
        ArrayList<a2> arrayList = this.sheetsStack;
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
        o4 o4Var = this.parentLayout;
        if (o4Var != null && o4Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int x02;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || j6.D0().q()) {
                e6 resourceProvider = getResourceProvider();
                int i7 = j6.f29129s8;
                k kVar = this.actionBar;
                if (kVar != null && kVar.x()) {
                    i7 = j6.f29205w8;
                } else if (this.simpleActionBar != null) {
                    i7 = j6.f28792a7;
                }
                if (resourceProvider != null) {
                    x02 = resourceProvider.f(i7);
                } else {
                    x02 = j6.x0(null, i7, true);
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
                a2 a2Var = this.sheetsStack.get(i7);
                if ((a2Var instanceof i9) && view == ((i9) a2Var).f11870s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.e2.movePreviewFragment(float):void");
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
        if (((AccessibilityManager) org.telegram.messenger.t0.f26609b.getSystemService("accessibility")).isEnabled() && ((actionBar = getActionBar()) != null || this.simpleActionBar != null)) {
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
            kVar.S();
            y yVar = kVar.F;
            if (yVar != null) {
                int childCount = yVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = yVar.getChildAt(i7);
                    if (childAt instanceof q0) {
                        ((q0) childAt).p();
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
        w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !org.telegram.messenger.g0.Q1() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (j6.x0(null, j6.f29129s8, false) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.p3(parentActivity, z10);
        }
        ArrayList<a2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a2 a2Var = this.sheetsStack.get(size);
                a2Var.b(false);
                a2Var.a(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        int i7 = 0;
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i10 = I0.d;
        int i11 = I0.f15575b;
        this.mSystemInsets = I0;
        ViewGroup viewGroup = this.listViewForSimpleGlass;
        if (viewGroup != null) {
            ri.a.e(viewGroup, i11, i10, k.getCurrentActionBarHeight(), 0);
        }
        if (this.navigationBarFadeView != null) {
            if (this.mSystemInsets.d < org.telegram.messenger.g0.L(40.0f)) {
                i7 = 8;
            }
            this.navigationBarFadeView.getLayoutParams().height = this.mSystemInsets.d;
            this.navigationBarFadeView.setVisibility(i7);
        }
        int i12 = I0.f15574a;
        int i13 = I0.f15576c;
        this.bottomInset = i10;
        onInsets(i12, i11, i13, i10);
        return r0.k1.f55681b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E0 = false;
            kVar.S();
            y yVar = kVar.F;
            if (yVar != null) {
                int childCount = yVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = yVar.getChildAt(i7);
                    if (childAt instanceof q0) {
                        ((q0) childAt).p();
                    }
                }
            }
        }
        g5 g5Var = this.simpleMenuOverlay;
        if (g5Var != null) {
            g5Var.a(false);
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
            i9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f11872s1 = true;
            h9 h9Var = lastStoryViewer.A0;
            if (h9Var != null) {
                h9Var.release(null);
                lastStoryViewer.A0 = null;
            }
            if (!fi.g1.e(lastStoryViewer.B0)) {
                hi.r3 r3Var = lastStoryViewer.E0;
                if (r3Var != null) {
                    r3Var.b(0L, null);
                }
                fi.e1 e1Var = lastStoryViewer.B0;
                if (e1Var != null) {
                    if (e1Var.f11658n) {
                        e1Var.s(null);
                    } else {
                        e1Var.e();
                    }
                    lastStoryViewer.B0 = null;
                }
            }
            w6 w6Var = lastStoryViewer.f11876u1;
            if (w6Var != null) {
                w6Var.b();
            }
            getLastStoryViewer().V();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<a2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            updateSheetsVisibility();
        }
    }

    public void onResume() {
        this.isPaused = false;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E0 = true;
            kVar.S();
        }
        if (getLastStoryViewer() != null) {
            i9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f11872s1 = false;
            if (!org.telegram.ui.g4.v().W && lastStoryViewer.z() != null) {
                lastStoryViewer.z().d1(false);
            }
            w6 w6Var = lastStoryViewer.f11876u1;
            if (w6Var != null) {
                w6Var.a(false);
            }
            getLastStoryViewer().V();
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
        uj0 uj0Var;
        View createView = createView(context);
        uj0 listViewForSimpleGlass = getListViewForSimpleGlass();
        lm0 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            uj0Var = listViewForSimpleGlass;
        } else {
            uj0Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = uj0Var;
        if (uj0Var != null && (createView instanceof FrameLayout)) {
            ri.a baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.f((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                e6 e6Var = this.resourceProvider;
                baseSimpleGlass.f56050m = frameLayout;
                baseSimpleGlass.f56051n = scrollViewForSimpleGlass;
                baseSimpleGlass.f56052o = new di.f(8, scrollViewForSimpleGlass, frameLayout);
                ri.q qVar = baseSimpleGlass.f56040a;
                qVar.getClass();
                scrollViewForSimpleGlass.M.add(new ri.k(qVar, scrollViewForSimpleGlass));
                ri.l lVar = new ri.l(qVar);
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
            i0.c cVar = this.mSystemInsets;
            ri.a.e(viewGroup, cVar.f15575b, cVar.d, k.getCurrentActionBarHeight(), 0);
            if (drawEdgeNavigationBar()) {
                View view2 = new View(context);
                this.navigationBarFadeView = view2;
                view2.setBackground(baseSimpleGlass.b(view2));
                FrameLayout.LayoutParams e10 = ja.e(-1, 0, 80);
                e10.height = this.mSystemInsets.d;
                ((FrameLayout) createView).addView(this.navigationBarFadeView, e10);
            }
        }
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(e2 e2Var) {
        o4 o4Var;
        return allowPresentFragment() && (o4Var = this.parentLayout) != null && ((ActionBarLayout) o4Var).S(e2Var);
    }

    public boolean presentFragmentAsPreview(e2 e2Var) {
        o4 o4Var;
        if (allowPresentFragment() && (o4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) o4Var;
            actionBarLayout.getClass();
            m4 m4Var = new m4(e2Var);
            m4Var.f29386e = true;
            if (actionBarLayout.U(m4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(e2 e2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        o4 o4Var;
        if (allowPresentFragment() && (o4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) o4Var;
            actionBarLayout.getClass();
            m4 m4Var = new m4(e2Var);
            m4Var.f29386e = true;
            m4Var.f29387f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.U(m4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(a2 a2Var) {
        ArrayList<a2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(a2Var);
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
        o4 o4Var = this.parentLayout;
        if (o4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) o4Var;
            actionBarLayout.Y0 = true;
            Runnable runnable = actionBarLayout.f28336e;
            if (runnable != null && actionBarLayout.d == null) {
                org.telegram.messenger.g0.r(runnable);
                actionBarLayout.f28336e.run();
                actionBarLayout.f28336e = null;
            }
        }
    }

    public void setBulletinDelegate(wa waVar) {
        this.bulletinDelegate = waVar;
    }

    public void setCurrentAccount(int i7) {
        if (this.fragmentView == null) {
            this.currentAccount = i7;
            return;
        }
        throw new IllegalStateException("trying to set current account when fragment UI already created");
    }

    public void setFinishing(boolean z10) {
        this.finishing = z10;
    }

    public void setFragmentPanTranslationOffset(int i7) {
        o4 o4Var = this.parentLayout;
        if (o4Var != null) {
            o4Var.setFragmentPanTranslationOffset(i7);
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
        w4 w4Var = this.simpleActionBar;
        if (w4Var != null) {
            w4Var.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i7) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                a2 a2Var = this.sheetsStack.get(i10);
                if (a2Var != null) {
                    a2Var.h(i7);
                }
            }
        }
    }

    public void setNavigationBarColor(int i7) {
        boolean z10;
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
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.m3(parentActivity, z10);
            o4 o4Var = this.parentLayout;
            if (o4Var != null) {
                o4Var.setNavigationBarColor(i7);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(e2 e2Var) {
        setParentLayout(e2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentGlass(RectF rectF, Runnable runnable) {
        if (this.simpleGlass != null) {
            ri.q qVar = this.glassEngine;
            RectF rectF2 = qVar.f56123e;
            if (rectF == null) {
                if (!rectF2.isEmpty()) {
                    rectF2.setEmpty();
                    qVar.f56124f = true;
                }
            } else if (!rectF2.equals(rectF)) {
                rectF2.set(rectF);
                qVar.f56124f = true;
            }
            this.simpleGlass.f56047j = runnable;
        }
    }

    public void setParentLayout(o4 o4Var) {
        boolean z10;
        o4 o4Var2;
        ViewGroup viewGroup;
        if (this.parentLayout != o4Var) {
            this.parentLayout = o4Var;
            boolean z11 = false;
            if (o4Var != null && ((ActionBarLayout) o4Var).f28339f) {
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
                o4 o4Var3 = this.parentLayout;
                if (o4Var3 != null && o4Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                o4 o4Var4 = this.parentLayout;
                if (o4Var4 != null && o4Var4.getView().getContext() != this.actionBar.getContext()) {
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
            if (this.simpleActionBar != null && (o4Var2 = this.parentLayout) != null && o4Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                org.telegram.messenger.g0.E2(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    w4 createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new di.w1(this, 1));
                    return;
                }
                return;
            }
            o4 o4Var5 = this.parentLayout;
            if (o4Var5 != null && this.actionBar == null) {
                k createActionBar = createActionBar(o4Var5.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f29318u0 = this;
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

    public void setPreviewDelegate(d2 d2Var) {
        this.previewDelegate = d2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(e6 e6Var) {
        this.resourceProvider = e6Var;
    }

    public void setSimpleMenuOverlayHost(e2 e2Var) {
        this.simpleMenuOverlayHost = e2Var;
    }

    public void setTitleOverlayText(String str, int i7, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.O(str, i7, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null && kVar.L) {
            setTitleOverlayText(str, i7, runnable);
        }
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public o4[] showAsSheet(e2 e2Var) {
        return showAsSheet(e2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i7) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        o4 o4Var = this.parentLayout;
        if (o4Var != null && (activity = (actionBarLayout = (ActionBarLayout) o4Var).R0) != null) {
            if (actionBarLayout.f28326a0) {
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
                actionBarLayout.f28365s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i7);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                a2 a2Var = this.sheetsStack.get(i7);
                boolean z10 = true;
                if (i7 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z10 = false;
                }
                a2Var.b(z10);
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

    public boolean presentFragment(e2 e2Var, boolean z10) {
        o4 o4Var;
        return allowPresentFragment() && (o4Var = this.parentLayout) != null && ((ActionBarLayout) o4Var).T(e2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        o4 o4Var;
        if (this.isFinished || (o4Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) o4Var).d0(this, z10);
        }
    }

    public o4[] showAsSheet(e2 e2Var, c2 c2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        o4[] o4VarArr = {new j4(getParentActivity(), new z(r7, 2))};
        o4VarArr[0].setIsSheet(true);
        LaunchActivity.H1.Q.add(o4VarArr[0]);
        e2Var.onTransitionAnimationStart(true, false);
        z1 z1Var = new z1(getParentActivity(), e2Var.getResourceProvider(), c2Var, o4VarArr, e2Var, r7);
        u2[] u2VarArr = {z1Var};
        if (c2Var != null) {
            z1Var.u0(false);
            u2VarArr[0].W0 = c2Var.f28476a;
        }
        u2 u2Var = u2VarArr[0];
        e2Var.parentDialog = u2Var;
        u2Var.S0 = true;
        u2Var.show();
        return o4VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(e2 e2Var, boolean z10, boolean z11) {
        o4 o4Var;
        if (allowPresentFragment() && (o4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) o4Var;
            actionBarLayout.getClass();
            m4 m4Var = new m4(e2Var);
            m4Var.f29384b = z10;
            m4Var.f29385c = z11;
            m4Var.d = true;
            m4Var.f29386e = false;
            m4Var.f29387f = null;
            if (actionBarLayout.U(m4Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        o4 o4Var;
        if (dialog != null && (o4Var = this.parentLayout) != null && !((ActionBarLayout) o4Var).B()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.R && (z10 || !actionBarLayout.i())) {
                ArrayList<a2> arrayList = this.sheetsStack;
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
                    this.visibleDialog.setOnDismissListener(new di.a3(5, this, onDismissListener));
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
        o4 o4Var;
        if (this.isFinished || (o4Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) o4Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(m4 m4Var) {
        o4 o4Var;
        return allowPresentFragment() && (o4Var = this.parentLayout) != null && ((ActionBarLayout) o4Var).U(m4Var);
    }

    public i9 getOrCreateStoryViewer(int i7) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        i9 i9Var = null;
        i9 i9Var2 = (this.sheetsStack.isEmpty() || !(i5.c.h(1, this.sheetsStack) instanceof i9)) ? null : (i9) i5.c.h(1, this.sheetsStack);
        if (i9Var2 == null || i9Var2.h == i7) {
            i9Var = i9Var2;
        } else {
            i9Var2.u(true);
            removeSheet(i9Var2);
        }
        if (i9Var == null) {
            i9 i9Var3 = new i9(this);
            o4 o4Var = this.parentLayout;
            if (o4Var != null && ((ActionBarLayout) o4Var).f28328b) {
                i9Var3.f11869r1 = true;
            }
            this.sheetsStack.add(i9Var3);
            updateSheetsVisibility();
            return i9Var3;
        }
        return i9Var;
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

    public void onActivityResultFragment(int i7, int i10, Intent intent) {
    }

    public void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
    }

    public void onInsets(int i7, int i10, int i11, int i12) {
    }
}
