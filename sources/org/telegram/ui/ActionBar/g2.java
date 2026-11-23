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
import c8.ma;
import fi.e9;
import fi.f9;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.rd;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.v9;
import org.telegram.messenger.w7;
import org.telegram.messenger.ys;
import org.telegram.messenger.yv;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ox;
import org.telegram.ui.qi0;
import org.telegram.ui.yy0;
public abstract class g2 {
    protected k actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private fb bulletinDelegate;
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
    private f2 previewDelegate;
    private boolean removingFromStack;
    protected h6 resourceProvider;
    public ArrayList<c2> sheetsStack;
    protected z4 simpleActionBar;
    private ri.a simpleGlass;
    private j5 simpleMenuOverlay;
    private g2 simpleMenuOverlayHost;
    public Dialog visibleDialog;
    protected int currentAccount = k10.f24968t0;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final ri.q glassEngine = new ri.q();
    private final h6 themedColors = new r1(this, 1);
    protected i0.b mSystemInsets = i0.b.f15916e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public g2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new a2(0, this));
    }

    public static boolean hasFullyVisibleSheets(g2 g2Var) {
        ox x10;
        if (g2Var != null) {
            if (!g2Var.hasShownFullyVisibleSheet()) {
                if ((g2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) g2Var.getParentLayout()).x()) != null && x10.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(g2 g2Var) {
        ox x10;
        if (g2Var != null) {
            if (!g2Var.hasShownSheet()) {
                if ((g2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) g2Var.getParentLayout()).x()) != null && x10.hasShownSheet()) {
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

    public void addSheet(c2 c2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        f9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f12046w0 = c2Var;
            c2Var.n(new fi.e3(lastStoryViewer, 3));
        }
        this.sheetsStack.add(c2Var);
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
                c2 c2Var = this.sheetsStack.get(i7);
                if (c2Var != null && c2Var.y()) {
                    org.telegram.messenger.g0.E2(c2Var.d());
                    wVar.addView(c2Var.d());
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
        ArrayList<c2> arrayList = this.sheetsStack;
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
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            org.telegram.messenger.g0.E2(z4Var);
            this.simpleActionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    public boolean clipsScrimUnderOccluders() {
        return false;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public boolean closeOpenMenuOverlay(boolean z10) {
        j5 j5Var = this.simpleMenuOverlay;
        if (j5Var != null && j5Var.I) {
            if (z10) {
                j5Var.a(true);
            }
            return true;
        }
        return false;
    }

    public boolean closeSheet() {
        ArrayList<c2> arrayList = this.sheetsStack;
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
        r4 r4Var;
        k kVar = new k(context, getResourceProvider());
        t6.h(m6.f29661s8, kVar, this.themedColors);
        t6.l(kVar, 3, m6.f29679t8, this.themedColors);
        t6.a(kVar, m6.f29794z8, this.themedColors, true);
        t6.l(kVar, 1, m6.f29718v8, this.themedColors);
        t6.b(kVar, m6.f29775y8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((r4Var = this.parentLayout) == null || !((ActionBarLayout) r4Var).T0)) {
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
            r4 r4Var = this.parentLayout;
            if ((r4Var instanceof ActionBarLayout) && ((ActionBarLayout) r4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.t3)) {
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
                if (t3Var.s()) {
                    return t3Var.L;
                }
            }
        }
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(this);
        org.telegram.ui.t3 t3Var2 = g4Var.L;
        addSheet(t3Var2);
        a3.b(t3Var2);
        return g4Var;
    }

    public f9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        f9 f9Var = new f9(this);
        r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).f28713b) {
            f9Var.f12035r1 = true;
        }
        this.sheetsStack.add(f9Var);
        updateSheetsVisibility();
        return f9Var;
    }

    public z4 createSimpleActionBar(Context context) {
        r4 r4Var;
        z4 z4Var = new z4(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((r4Var = this.parentLayout) == null || !((ActionBarLayout) r4Var).T0)) {
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
                c2 c2Var = this.sheetsStack.get(i7);
                if (c2Var != null && c2Var.y()) {
                    org.telegram.messenger.g0.E2(c2Var.d());
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
        Typeface typeface = org.telegram.messenger.g0.f24018a;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        f2 f2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (f2Var = this.previewDelegate) != null) {
            ((yy0) ((qi0) f2Var).f51292b).a();
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
        r4 r4Var = this.parentLayout;
        if ((r4Var instanceof ActionBarLayout) && ((ActionBarLayout) r4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.t3)) {
            org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
            if (t3Var.s()) {
                return t3Var.L;
            }
            return null;
        }
        return null;
    }

    public n4 getBackButtonState() {
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

    public fb getBulletinDelegate() {
        return this.bulletinDelegate;
    }

    public FrameLayout getBulletinLayoutContainer() {
        return getLayoutContainer();
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(getAccountInstance().f23202a);
    }

    public org.telegram.messenger.i5 getContactsController() {
        return org.telegram.messenger.i5.r(getAccountInstance().f23202a);
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

    public org.telegram.messenger.a6 getDownloadController() {
        return org.telegram.messenger.a6.q(getAccountInstance().f23202a);
    }

    public p3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return p3.f29885b;
        }
        return p3.f29884a;
    }

    public w7 getFileLoader() {
        return w7.G(getAccountInstance().f23202a);
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public g2 getFragmentForAlert(int i7) {
        r4 r4Var = this.parentLayout;
        if (r4Var != null && r4Var.getFragmentStack().size() > i7 + 1) {
            return (g2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i7);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public v9 getGiftAuctionsController() {
        return v9.c(getAccountInstance().f23202a);
    }

    public boolean getInPassivePreviewMode() {
        r4 r4Var = this.parentLayout;
        if (r4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) r4Var;
            if ((actionBarLayout.h && actionBarLayout.K == null) || actionBarLayout.f28714b0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public c2 getLastSheet() {
        ArrayList<c2> arrayList = this.sheetsStack;
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

    public f9 getLastStoryViewer() {
        ArrayList<c2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof f9) && this.sheetsStack.get(size).s()) {
                    return (f9) this.sheetsStack.get(size);
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

    public ek0 getListViewForSimpleGlass() {
        return null;
    }

    public rd getLocationController() {
        return rd.f(getAccountInstance().f23202a);
    }

    public MediaController getMediaController() {
        return MediaController.B();
    }

    public si getMediaDataController() {
        return si.d0(getAccountInstance().f23202a);
    }

    public np getMessagesController() {
        return np.u1(getAccountInstance().f23202a);
    }

    public ur getMessagesStorage() {
        return ur.a0(getAccountInstance().f23202a);
    }

    public int getNavigationBarColor() {
        int w02 = m6.w0(m6.f29324a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                c2 c2Var = this.sheetsStack.get(i7);
                if (c2Var.y()) {
                    w02 = c2Var.e(w02);
                }
            }
        }
        return w02;
    }

    public ls getNotificationCenter() {
        return ls.f(getAccountInstance().f23202a);
    }

    public ys getNotificationsController() {
        return ys.t(getAccountInstance().f23202a);
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().d();
    }

    public f9 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        f9 f9Var = (this.sheetsStack.isEmpty() || !(i5.c.h(1, this.sheetsStack) instanceof f9)) ? null : (f9) i5.c.h(1, this.sheetsStack);
        if (f9Var == null) {
            f9Var = new f9(this);
            r4 r4Var = this.parentLayout;
            if (r4Var != null && ((ActionBarLayout) r4Var).f28713b) {
                f9Var.f12035r1 = true;
            }
            this.sheetsStack.add(f9Var);
            updateSheetsVisibility();
        }
        return f9Var;
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

    public wm0 getScrollViewForSimpleGlass() {
        return null;
    }

    public yv getSecretChatHelper() {
        return yv.i(getAccountInstance().f23202a);
    }

    public az getSendMessagesHelper() {
        return az.C(getAccountInstance().f23202a);
    }

    public z4 getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public j5 getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        g2 g2Var = this.simpleMenuOverlayHost;
        if (g2Var != null && g2Var.fragmentView != null) {
            return g2Var.getSimpleMenuOverlay();
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
            paint = getResourceProvider().g(str);
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return m6.V0(str);
    }

    public k10 getUserConfig() {
        return k10.i(getAccountInstance().f23202a);
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
        ArrayList<c2> arrayList = this.sheetsStack;
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
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || m6.D0().q()) {
                h6 resourceProvider = getResourceProvider();
                int i7 = m6.f29661s8;
                k kVar = this.actionBar;
                if (kVar != null && kVar.x()) {
                    i7 = m6.f29737w8;
                } else if (this.simpleActionBar != null) {
                    i7 = m6.f29324a7;
                }
                if (resourceProvider != null) {
                    x02 = resourceProvider.i(i7);
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
                c2 c2Var = this.sheetsStack.get(i7);
                if ((c2Var instanceof f9) && view == ((f9) c2Var).f12036s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.g2.movePreviewFragment(float):void");
    }

    public boolean needDelayOpenAnimation() {
        return false;
    }

    public boolean onBackPressed(boolean z10) {
        if (closeOpenMenuOverlay(z10)) {
            return false;
        }
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
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
        if (((AccessibilityManager) org.telegram.messenger.t0.f26931b.getSystemService("accessibility")).isEnabled() && ((actionBar = getActionBar()) != null || this.simpleActionBar != null)) {
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
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !org.telegram.messenger.g0.Q1() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (m6.x0(null, m6.f29661s8, false) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.o3(parentActivity, z10);
        }
        ArrayList<c2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c2 c2Var = this.sheetsStack.get(size);
                c2Var.b(false);
                c2Var.a(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        int i7 = 0;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i10 = I0.d;
        int i11 = I0.f15918b;
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
        int i12 = I0.f15917a;
        int i13 = I0.f15919c;
        this.bottomInset = i10;
        onInsets(i12, i11, i13, i10);
        return r0.l1.f56302b;
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
            f9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f12038s1 = true;
            e9 e9Var = lastStoryViewer.A0;
            if (e9Var != null) {
                e9Var.release(null);
                lastStoryViewer.A0 = null;
            }
            if (!fi.e1.a(lastStoryViewer.B0)) {
                hi.q3 q3Var = lastStoryViewer.E0;
                if (q3Var != null) {
                    q3Var.b(0L, null);
                }
                fi.c1 c1Var = lastStoryViewer.B0;
                if (c1Var != null) {
                    if (c1Var.f11841n) {
                        c1Var.s(null);
                    } else {
                        c1Var.e();
                    }
                    lastStoryViewer.B0 = null;
                }
            }
            fi.t6 t6Var = lastStoryViewer.f12042u1;
            if (t6Var != null) {
                t6Var.b();
            }
            getLastStoryViewer().V();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<c2> arrayList = this.sheetsStack;
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
            f9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f12038s1 = false;
            if (!org.telegram.ui.g4.v().W && lastStoryViewer.z() != null) {
                lastStoryViewer.z().d1(false);
            }
            fi.t6 t6Var = lastStoryViewer.f12042u1;
            if (t6Var != null) {
                t6Var.a(false);
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
        ek0 ek0Var;
        View createView = createView(context);
        ek0 listViewForSimpleGlass = getListViewForSimpleGlass();
        wm0 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            ek0Var = listViewForSimpleGlass;
        } else {
            ek0Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = ek0Var;
        if (ek0Var != null && (createView instanceof FrameLayout)) {
            ri.a baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.f((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                h6 h6Var = this.resourceProvider;
                baseSimpleGlass.f56669m = frameLayout;
                baseSimpleGlass.f56670n = scrollViewForSimpleGlass;
                baseSimpleGlass.f56671o = new di.f(8, scrollViewForSimpleGlass, frameLayout);
                ri.q qVar = baseSimpleGlass.f56659a;
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
                baseSimpleGlass.g(frameLayout, view, h6Var);
            }
            if (useFadeDrawableForActionBar() && view != null) {
                view.setBackground(baseSimpleGlass.a(view));
            }
            ViewGroup viewGroup = this.listViewForSimpleGlass;
            i0.b bVar = this.mSystemInsets;
            ri.a.e(viewGroup, bVar.f15918b, bVar.d, k.getCurrentActionBarHeight(), 0);
            if (drawEdgeNavigationBar()) {
                View view2 = new View(context);
                this.navigationBarFadeView = view2;
                view2.setBackground(baseSimpleGlass.b(view2));
                FrameLayout.LayoutParams e10 = ma.e(-1, 0, 80);
                e10.height = this.mSystemInsets.d;
                ((FrameLayout) createView).addView(this.navigationBarFadeView, e10);
            }
        }
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(g2 g2Var) {
        r4 r4Var;
        return allowPresentFragment() && (r4Var = this.parentLayout) != null && ((ActionBarLayout) r4Var).S(g2Var);
    }

    public boolean presentFragmentAsPreview(g2 g2Var) {
        r4 r4Var;
        if (allowPresentFragment() && (r4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) r4Var;
            actionBarLayout.getClass();
            p4 p4Var = new p4(g2Var);
            p4Var.f29890e = true;
            if (actionBarLayout.U(p4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(g2 g2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        r4 r4Var;
        if (allowPresentFragment() && (r4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) r4Var;
            actionBarLayout.getClass();
            p4 p4Var = new p4(g2Var);
            p4Var.f29890e = true;
            p4Var.f29891f = actionBarPopupWindow$ActionBarPopupWindowLayout;
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

    public void removeSheet(c2 c2Var) {
        ArrayList<c2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(c2Var);
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
            actionBarLayout.Y0 = true;
            Runnable runnable = actionBarLayout.f28721e;
            if (runnable != null && actionBarLayout.d == null) {
                org.telegram.messenger.g0.r(runnable);
                actionBarLayout.f28721e.run();
                actionBarLayout.f28721e = null;
            }
        }
    }

    public void setBulletinDelegate(fb fbVar) {
        this.bulletinDelegate = fbVar;
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
        r4 r4Var = this.parentLayout;
        if (r4Var != null) {
            r4Var.setFragmentPanTranslationOffset(i7);
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
        z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i7) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                c2 c2Var = this.sheetsStack.get(i10);
                if (c2Var != null) {
                    c2Var.h(i7);
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
            org.telegram.messenger.g0.l3(parentActivity, z10);
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

    public void setParentFragment(g2 g2Var) {
        setParentLayout(g2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentGlass(RectF rectF, Runnable runnable) {
        if (this.simpleGlass != null) {
            ri.q qVar = this.glassEngine;
            RectF rectF2 = qVar.f56742e;
            if (rectF == null) {
                if (!rectF2.isEmpty()) {
                    rectF2.setEmpty();
                    qVar.f56743f = true;
                }
            } else if (!rectF2.equals(rectF)) {
                rectF2.set(rectF);
                qVar.f56743f = true;
            }
            this.simpleGlass.f56666j = runnable;
        }
    }

    public void setParentLayout(r4 r4Var) {
        boolean z10;
        r4 r4Var2;
        ViewGroup viewGroup;
        if (this.parentLayout != r4Var) {
            this.parentLayout = r4Var;
            boolean z11 = false;
            if (r4Var != null && ((ActionBarLayout) r4Var).f28724f) {
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
                r4 r4Var3 = this.parentLayout;
                if (r4Var3 != null && r4Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                r4 r4Var4 = this.parentLayout;
                if (r4Var4 != null && r4Var4.getView().getContext() != this.actionBar.getContext()) {
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
            if (this.simpleActionBar != null && (r4Var2 = this.parentLayout) != null && r4Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                org.telegram.messenger.g0.E2(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    z4 createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new di.a2(this, 1));
                    return;
                }
                return;
            }
            r4 r4Var5 = this.parentLayout;
            if (r4Var5 != null && this.actionBar == null) {
                k createActionBar = createActionBar(r4Var5.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f29164u0 = this;
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

    public void setPreviewDelegate(f2 f2Var) {
        this.previewDelegate = f2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(h6 h6Var) {
        this.resourceProvider = h6Var;
    }

    public void setSimpleMenuOverlayHost(g2 g2Var) {
        this.simpleMenuOverlayHost = g2Var;
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

    public void setupBulletinGlass(gc gcVar) {
        lb lbVar = gcVar.f35523e;
        if (this.simpleGlass != null && this.fragmentView != null && lbVar != null && lbVar.canHaveGlassBackground()) {
            fh.g c10 = this.simpleGlass.f56661c.c(lbVar, null, false);
            c10.p(c8.i0.c(getResourceProvider()));
            c10.r(org.telegram.messenger.g0.L(16.0f));
            lbVar.setGlassBackground(c10, new z1(0, this, c10));
        }
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public r4[] showAsSheet(g2 g2Var) {
        return showAsSheet(g2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i7) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        r4 r4Var = this.parentLayout;
        if (r4Var != null && (activity = (actionBarLayout = (ActionBarLayout) r4Var).R0) != null) {
            if (actionBarLayout.f28711a0) {
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
                actionBarLayout.f28750s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i7);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                c2 c2Var = this.sheetsStack.get(i7);
                boolean z10 = true;
                if (i7 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z10 = false;
                }
                c2Var.b(z10);
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

    public boolean presentFragment(g2 g2Var, boolean z10) {
        r4 r4Var;
        return allowPresentFragment() && (r4Var = this.parentLayout) != null && ((ActionBarLayout) r4Var).T(g2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        r4 r4Var;
        if (this.isFinished || (r4Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) r4Var).d0(this, z10);
        }
    }

    public r4[] showAsSheet(g2 g2Var, e2 e2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        r4[] r4VarArr = {new m4(getParentActivity(), new org.telegram.tgnet.u(r7, 4))};
        r4VarArr[0].setIsSheet(true);
        LaunchActivity.H1.Q.add(r4VarArr[0]);
        g2Var.onTransitionAnimationStart(true, false);
        b2 b2Var = new b2(getParentActivity(), g2Var.getResourceProvider(), e2Var, r4VarArr, g2Var, r7);
        w2[] w2VarArr = {b2Var};
        if (e2Var != null) {
            b2Var.u0(false);
            w2VarArr[0].W0 = e2Var.f28905a;
        }
        w2 w2Var = w2VarArr[0];
        g2Var.parentDialog = w2Var;
        w2Var.S0 = true;
        w2Var.show();
        return r4VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(g2 g2Var, boolean z10, boolean z11) {
        r4 r4Var;
        if (allowPresentFragment() && (r4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) r4Var;
            actionBarLayout.getClass();
            p4 p4Var = new p4(g2Var);
            p4Var.f29888b = z10;
            p4Var.f29889c = z11;
            p4Var.d = true;
            p4Var.f29890e = false;
            p4Var.f29891f = null;
            if (actionBarLayout.U(p4Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        r4 r4Var;
        if (dialog != null && (r4Var = this.parentLayout) != null && !((ActionBarLayout) r4Var).B()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.R && (z10 || !actionBarLayout.i())) {
                ArrayList<c2> arrayList = this.sheetsStack;
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
                    this.visibleDialog.setOnDismissListener(new y1(0, this, onDismissListener));
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
        r4 r4Var;
        if (this.isFinished || (r4Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) r4Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(p4 p4Var) {
        r4 r4Var;
        return allowPresentFragment() && (r4Var = this.parentLayout) != null && ((ActionBarLayout) r4Var).U(p4Var);
    }

    public f9 getOrCreateStoryViewer(int i7) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        f9 f9Var = null;
        f9 f9Var2 = (this.sheetsStack.isEmpty() || !(i5.c.h(1, this.sheetsStack) instanceof f9)) ? null : (f9) i5.c.h(1, this.sheetsStack);
        if (f9Var2 == null || f9Var2.h == i7) {
            f9Var = f9Var2;
        } else {
            f9Var2.u(true);
            removeSheet(f9Var2);
        }
        if (f9Var == null) {
            f9 f9Var3 = new f9(this);
            r4 r4Var = this.parentLayout;
            if (r4Var != null && ((ActionBarLayout) r4Var).f28713b) {
                f9Var3.f12035r1 = true;
            }
            this.sheetsStack.add(f9Var3);
            updateSheetsVisibility();
            return f9Var3;
        }
        return f9Var;
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
