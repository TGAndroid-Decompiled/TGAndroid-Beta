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
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.qd;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.u9;
import org.telegram.messenger.w7;
import org.telegram.messenger.xs;
import org.telegram.messenger.xv;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ox;
import org.telegram.ui.qi0;
import org.telegram.ui.yy0;
public abstract class h2 {
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
    protected s4 parentLayout;
    private g2 previewDelegate;
    private boolean removingFromStack;
    protected i6 resourceProvider;
    public ArrayList<d2> sheetsStack;
    protected a5 simpleActionBar;
    private ri.a simpleGlass;
    private k5 simpleMenuOverlay;
    private h2 simpleMenuOverlayHost;
    public Dialog visibleDialog;
    protected int currentAccount = j10.f24770t0;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final ri.q glassEngine = new ri.q();
    private final i6 themedColors = new s1(this, 1);
    protected i0.b mSystemInsets = i0.b.f15888e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public h2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new b2(0, this));
    }

    public static boolean hasFullyVisibleSheets(h2 h2Var) {
        ox x10;
        if (h2Var != null) {
            if (!h2Var.hasShownFullyVisibleSheet()) {
                if ((h2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) h2Var.getParentLayout()).x()) != null && x10.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(h2 h2Var) {
        ox x10;
        if (h2Var != null) {
            if (!h2Var.hasShownSheet()) {
                if ((h2Var.getParentLayout() instanceof ActionBarLayout) && (x10 = ((ActionBarLayout) h2Var.getParentLayout()).x()) != null && x10.hasShownSheet()) {
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

    public void addSheet(d2 d2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        f9 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f12002w0 = d2Var;
            d2Var.n(new fi.e3(lastStoryViewer, 3));
        }
        this.sheetsStack.add(d2Var);
        updateSheetsVisibility();
    }

    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return true;
    }

    public boolean allowPresentFragment() {
        return true;
    }

    public void attachSheets(x xVar) {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                d2 d2Var = this.sheetsStack.get(i7);
                if (d2Var != null && d2Var.y()) {
                    org.telegram.messenger.g0.E2(d2Var.d());
                    xVar.addView(d2Var.d());
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
        ArrayList<d2> arrayList = this.sheetsStack;
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
        a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            org.telegram.messenger.g0.E2(a5Var);
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
        k5 k5Var = this.simpleMenuOverlay;
        if (k5Var != null && k5Var.I) {
            if (z10) {
                k5Var.a(true);
            }
            return true;
        }
        return false;
    }

    public boolean closeSheet() {
        ArrayList<d2> arrayList = this.sheetsStack;
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
        s4 s4Var;
        k kVar = new k(context, getResourceProvider());
        u6.h(n6.f29674s8, kVar, this.themedColors);
        u6.l(kVar, 3, n6.f29692t8, this.themedColors);
        u6.a(kVar, n6.f29807z8, this.themedColors, true);
        u6.l(kVar, 1, n6.f29731v8, this.themedColors);
        u6.b(kVar, n6.f29788y8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((s4Var = this.parentLayout) == null || !((ActionBarLayout) s4Var).T0)) {
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
            s4 s4Var = this.parentLayout;
            if ((s4Var instanceof ActionBarLayout) && ((ActionBarLayout) s4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.t3)) {
                org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
                if (t3Var.s()) {
                    return t3Var.L;
                }
            }
        }
        org.telegram.ui.g4 g4Var = new org.telegram.ui.g4(this);
        org.telegram.ui.t3 t3Var2 = g4Var.L;
        addSheet(t3Var2);
        b3.b(t3Var2);
        return g4Var;
    }

    public f9 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        f9 f9Var = new f9(this);
        s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).f28680b) {
            f9Var.f11991r1 = true;
        }
        this.sheetsStack.add(f9Var);
        updateSheetsVisibility();
        return f9Var;
    }

    public a5 createSimpleActionBar(Context context) {
        s4 s4Var;
        a5 a5Var = new a5(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((s4Var = this.parentLayout) == null || !((ActionBarLayout) s4Var).T0)) {
            return a5Var;
        }
        a5Var.setOccupyStatusBar(false);
        return a5Var;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                d2 d2Var = this.sheetsStack.get(i7);
                if (d2Var != null && d2Var.y()) {
                    org.telegram.messenger.g0.E2(d2Var.d());
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
        Typeface typeface = org.telegram.messenger.g0.f24090a;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        g2 g2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (g2Var = this.previewDelegate) != null) {
            ((yy0) ((qi0) g2Var).f51234b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        s4 s4Var = this.parentLayout;
        if (s4Var != null) {
            ((ActionBarLayout) s4Var).v();
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
        s4 s4Var = this.parentLayout;
        if ((s4Var instanceof ActionBarLayout) && ((ActionBarLayout) s4Var).x() != null && (((ActionBarLayout) this.parentLayout).x().getLastSheet() instanceof org.telegram.ui.t3)) {
            org.telegram.ui.t3 t3Var = (org.telegram.ui.t3) ((ActionBarLayout) this.parentLayout).x().getLastSheet();
            if (t3Var.s()) {
                return t3Var.L;
            }
            return null;
        }
        return null;
    }

    public o4 getBackButtonState() {
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
        return ConnectionsManager.getInstance(getAccountInstance().f23218a);
    }

    public org.telegram.messenger.i5 getContactsController() {
        return org.telegram.messenger.i5.r(getAccountInstance().f23218a);
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
        return org.telegram.messenger.a6.q(getAccountInstance().f23218a);
    }

    public q3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return q3.f29899b;
        }
        return q3.f29898a;
    }

    public w7 getFileLoader() {
        return w7.G(getAccountInstance().f23218a);
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public h2 getFragmentForAlert(int i7) {
        s4 s4Var = this.parentLayout;
        if (s4Var != null && s4Var.getFragmentStack().size() > i7 + 1) {
            return (h2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i7);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public u9 getGiftAuctionsController() {
        return u9.c(getAccountInstance().f23218a);
    }

    public boolean getInPassivePreviewMode() {
        s4 s4Var = this.parentLayout;
        if (s4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) s4Var;
            if ((actionBarLayout.h && actionBarLayout.K == null) || actionBarLayout.f28681b0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public d2 getLastSheet() {
        ArrayList<d2> arrayList = this.sheetsStack;
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
        ArrayList<d2> arrayList = this.sheetsStack;
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

    public ck0 getListViewForSimpleGlass() {
        return null;
    }

    public qd getLocationController() {
        return qd.f(getAccountInstance().f23218a);
    }

    public MediaController getMediaController() {
        return MediaController.B();
    }

    public ri getMediaDataController() {
        return ri.d0(getAccountInstance().f23218a);
    }

    public mp getMessagesController() {
        return mp.u1(getAccountInstance().f23218a);
    }

    public tr getMessagesStorage() {
        return tr.a0(getAccountInstance().f23218a);
    }

    public int getNavigationBarColor() {
        int w02 = n6.w0(n6.f29337a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                d2 d2Var = this.sheetsStack.get(i7);
                if (d2Var.y()) {
                    w02 = d2Var.e(w02);
                }
            }
        }
        return w02;
    }

    public ks getNotificationCenter() {
        return ks.f(getAccountInstance().f23218a);
    }

    public xs getNotificationsController() {
        return xs.t(getAccountInstance().f23218a);
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
            s4 s4Var = this.parentLayout;
            if (s4Var != null && ((ActionBarLayout) s4Var).f28680b) {
                f9Var.f11991r1 = true;
            }
            this.sheetsStack.add(f9Var);
            updateSheetsVisibility();
        }
        return f9Var;
    }

    public Activity getParentActivity() {
        s4 s4Var = this.parentLayout;
        if (s4Var != null) {
            return s4Var.getParentActivity();
        }
        return null;
    }

    public s4 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public i6 getResourceProvider() {
        return this.resourceProvider;
    }

    public tm0 getScrollViewForSimpleGlass() {
        return null;
    }

    public xv getSecretChatHelper() {
        return xv.i(getAccountInstance().f23218a);
    }

    public zy getSendMessagesHelper() {
        return zy.C(getAccountInstance().f23218a);
    }

    public a5 getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public k5 getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        h2 h2Var = this.simpleMenuOverlayHost;
        if (h2Var != null && h2Var.fragmentView != null) {
            return h2Var.getSimpleMenuOverlay();
        }
        View view = this.fragmentView;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            a5 a5Var = this.simpleActionBar;
            if (a5Var != null && (a5Var.getParent() instanceof FrameLayout)) {
                viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            } else {
                return null;
            }
        }
        k5 k5Var = this.simpleMenuOverlay;
        if (k5Var == null || k5Var.getParent() != viewGroup) {
            k5 k5Var2 = this.simpleMenuOverlay;
            if (k5Var2 != null) {
                k5Var2.a(false);
                org.telegram.messenger.g0.E2(this.simpleMenuOverlay);
            }
            k5 k5Var3 = new k5(viewGroup.getContext());
            this.simpleMenuOverlay = k5Var3;
            viewGroup.addView(k5Var3, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.simpleMenuOverlay;
    }

    public ArrayList<w6> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i7) {
        return n6.w0(i7, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return n6.R0(str);
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
        return n6.V0(str);
    }

    public j10 getUserConfig() {
        return j10.i(getAccountInstance().f23218a);
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
        ArrayList<d2> arrayList = this.sheetsStack;
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
        s4 s4Var = this.parentLayout;
        if (s4Var != null && s4Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int x02;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || n6.D0().q()) {
                i6 resourceProvider = getResourceProvider();
                int i7 = n6.f29674s8;
                k kVar = this.actionBar;
                if (kVar != null && kVar.y()) {
                    i7 = n6.f29750w8;
                } else if (this.simpleActionBar != null) {
                    i7 = n6.f29337a7;
                }
                if (resourceProvider != null) {
                    x02 = resourceProvider.i(i7);
                } else {
                    x02 = n6.x0(null, i7, true);
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
                d2 d2Var = this.sheetsStack.get(i7);
                if ((d2Var instanceof f9) && view == ((f9) d2Var).f11992s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.h2.movePreviewFragment(float):void");
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
        if (((AccessibilityManager) org.telegram.messenger.t0.f26913b.getSystemService("accessibility")).isEnabled() && ((actionBar = getActionBar()) != null || this.simpleActionBar != null)) {
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
            kVar.T();
            z zVar = kVar.F;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = zVar.getChildAt(i7);
                    if (childAt instanceof r0) {
                        ((r0) childAt).p();
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
        a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            a5Var.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !org.telegram.messenger.g0.Q1() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (n6.x0(null, n6.f29674s8, false) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.o3(parentActivity, z10);
        }
        ArrayList<d2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d2 d2Var = this.sheetsStack.get(size);
                d2Var.b(false);
                d2Var.a(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        int i7 = 0;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i10 = I0.d;
        int i11 = I0.f15890b;
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
        int i12 = I0.f15889a;
        int i13 = I0.f15891c;
        this.bottomInset = i10;
        onInsets(i12, i11, i13, i10);
        return r0.l1.f56257b;
    }

    public void onPause() {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E0 = false;
            kVar.T();
            z zVar = kVar.F;
            if (zVar != null) {
                int childCount = zVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = zVar.getChildAt(i7);
                    if (childAt instanceof r0) {
                        ((r0) childAt).p();
                    }
                }
            }
        }
        k5 k5Var = this.simpleMenuOverlay;
        if (k5Var != null) {
            k5Var.a(false);
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
            lastStoryViewer.f11994s1 = true;
            e9 e9Var = lastStoryViewer.A0;
            if (e9Var != null) {
                e9Var.release(null);
                lastStoryViewer.A0 = null;
            }
            if (!fi.e1.a(lastStoryViewer.B0)) {
                hi.r3 r3Var = lastStoryViewer.E0;
                if (r3Var != null) {
                    r3Var.b(0L, null);
                }
                fi.c1 c1Var = lastStoryViewer.B0;
                if (c1Var != null) {
                    if (c1Var.f11795n) {
                        c1Var.s(null);
                    } else {
                        c1Var.e();
                    }
                    lastStoryViewer.B0 = null;
                }
            }
            fi.t6 t6Var = lastStoryViewer.f11998u1;
            if (t6Var != null) {
                t6Var.b();
            }
            getLastStoryViewer().V();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<d2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            updateSheetsVisibility();
        }
    }

    public void onResume() {
        this.isPaused = false;
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E0 = true;
            kVar.T();
        }
        if (getLastStoryViewer() != null) {
            f9 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f11994s1 = false;
            if (!org.telegram.ui.g4.v().W && lastStoryViewer.z() != null) {
                lastStoryViewer.z().d1(false);
            }
            fi.t6 t6Var = lastStoryViewer.f11998u1;
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
        ck0 ck0Var;
        View createView = createView(context);
        ck0 listViewForSimpleGlass = getListViewForSimpleGlass();
        tm0 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            ck0Var = listViewForSimpleGlass;
        } else {
            ck0Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = ck0Var;
        if (ck0Var != null && (createView instanceof FrameLayout)) {
            ri.a baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.f((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                i6 i6Var = this.resourceProvider;
                baseSimpleGlass.f56624m = frameLayout;
                baseSimpleGlass.f56625n = scrollViewForSimpleGlass;
                baseSimpleGlass.f56626o = new di.f(8, scrollViewForSimpleGlass, frameLayout);
                ri.q qVar = baseSimpleGlass.f56614a;
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
                baseSimpleGlass.g(frameLayout, view, i6Var);
            }
            if (useFadeDrawableForActionBar() && view != null) {
                view.setBackground(baseSimpleGlass.a(view));
            }
            ViewGroup viewGroup = this.listViewForSimpleGlass;
            i0.b bVar = this.mSystemInsets;
            ri.a.e(viewGroup, bVar.f15890b, bVar.d, k.getCurrentActionBarHeight(), 0);
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

    public boolean presentFragment(h2 h2Var) {
        s4 s4Var;
        return allowPresentFragment() && (s4Var = this.parentLayout) != null && ((ActionBarLayout) s4Var).S(h2Var);
    }

    public boolean presentFragmentAsPreview(h2 h2Var) {
        s4 s4Var;
        if (allowPresentFragment() && (s4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) s4Var;
            actionBarLayout.getClass();
            q4 q4Var = new q4(h2Var);
            q4Var.f29904e = true;
            if (actionBarLayout.U(q4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(h2 h2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        s4 s4Var;
        if (allowPresentFragment() && (s4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) s4Var;
            actionBarLayout.getClass();
            q4 q4Var = new q4(h2Var);
            q4Var.f29904e = true;
            q4Var.f29905f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.U(q4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(d2 d2Var) {
        ArrayList<d2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(d2Var);
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
        s4 s4Var = this.parentLayout;
        if (s4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) s4Var;
            actionBarLayout.Y0 = true;
            Runnable runnable = actionBarLayout.f28688e;
            if (runnable != null && actionBarLayout.d == null) {
                org.telegram.messenger.g0.r(runnable);
                actionBarLayout.f28688e.run();
                actionBarLayout.f28688e = null;
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
        s4 s4Var = this.parentLayout;
        if (s4Var != null) {
            s4Var.setFragmentPanTranslationOffset(i7);
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
        a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            a5Var.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i7) {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                d2 d2Var = this.sheetsStack.get(i10);
                if (d2Var != null) {
                    d2Var.h(i7);
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
            s4 s4Var = this.parentLayout;
            if (s4Var != null) {
                s4Var.setNavigationBarColor(i7);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(h2 h2Var) {
        setParentLayout(h2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentGlass(RectF rectF, Runnable runnable) {
        if (this.simpleGlass != null) {
            ri.q qVar = this.glassEngine;
            RectF rectF2 = qVar.f56697e;
            if (rectF == null) {
                if (!rectF2.isEmpty()) {
                    rectF2.setEmpty();
                    qVar.f56698f = true;
                }
            } else if (!rectF2.equals(rectF)) {
                rectF2.set(rectF);
                qVar.f56698f = true;
            }
            this.simpleGlass.f56621j = runnable;
        }
    }

    public void setParentLayout(s4 s4Var) {
        boolean z10;
        s4 s4Var2;
        ViewGroup viewGroup;
        if (this.parentLayout != s4Var) {
            this.parentLayout = s4Var;
            boolean z11 = false;
            if (s4Var != null && ((ActionBarLayout) s4Var).f28691f) {
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
                s4 s4Var3 = this.parentLayout;
                if (s4Var3 != null && s4Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                s4 s4Var4 = this.parentLayout;
                if (s4Var4 != null && s4Var4.getView().getContext() != this.actionBar.getContext()) {
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
            if (this.simpleActionBar != null && (s4Var2 = this.parentLayout) != null && s4Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                org.telegram.messenger.g0.E2(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    a5 createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new di.a2(this, 1));
                    return;
                }
                return;
            }
            s4 s4Var5 = this.parentLayout;
            if (s4Var5 != null && this.actionBar == null) {
                k createActionBar = createActionBar(s4Var5.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f29100u0 = this;
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

    public void setPreviewDelegate(g2 g2Var) {
        this.previewDelegate = g2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(i6 i6Var) {
        this.resourceProvider = i6Var;
    }

    public void setSimpleMenuOverlayHost(h2 h2Var) {
        this.simpleMenuOverlayHost = h2Var;
    }

    public void setTitleOverlayText(String str, int i7, Runnable runnable) {
        k kVar = this.actionBar;
        if (kVar != null) {
            kVar.P(str, i7, runnable);
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
        lb lbVar = gcVar.f35457e;
        if (this.simpleGlass != null && this.fragmentView != null && lbVar != null && lbVar.canHaveGlassBackground()) {
            fh.g c10 = this.simpleGlass.f56616c.c(lbVar, null, false);
            c10.p(c8.i0.c(getResourceProvider()));
            c10.r(org.telegram.messenger.g0.L(16.0f));
            lbVar.setGlassBackground(c10, new a2(0, this, c10));
        }
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public s4[] showAsSheet(h2 h2Var) {
        return showAsSheet(h2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i7) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        s4 s4Var = this.parentLayout;
        if (s4Var != null && (activity = (actionBarLayout = (ActionBarLayout) s4Var).R0) != null) {
            if (actionBarLayout.f28678a0) {
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
                actionBarLayout.f28717s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i7);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i7 = 0; i7 < this.sheetsStack.size(); i7++) {
                d2 d2Var = this.sheetsStack.get(i7);
                boolean z10 = true;
                if (i7 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z10 = false;
                }
                d2Var.b(z10);
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

    public boolean presentFragment(h2 h2Var, boolean z10) {
        s4 s4Var;
        return allowPresentFragment() && (s4Var = this.parentLayout) != null && ((ActionBarLayout) s4Var).T(h2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        s4 s4Var;
        if (this.isFinished || (s4Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) s4Var).d0(this, z10);
        }
    }

    public s4[] showAsSheet(h2 h2Var, f2 f2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        s4[] s4VarArr = {new n4(getParentActivity(), new p(r7, 3))};
        s4VarArr[0].setIsSheet(true);
        LaunchActivity.H1.Q.add(s4VarArr[0]);
        h2Var.onTransitionAnimationStart(true, false);
        c2 c2Var = new c2(getParentActivity(), h2Var.getResourceProvider(), f2Var, s4VarArr, h2Var, r7);
        x2[] x2VarArr = {c2Var};
        if (f2Var != null) {
            c2Var.u0(false);
            x2VarArr[0].W0 = f2Var.f28921a;
        }
        x2 x2Var = x2VarArr[0];
        h2Var.parentDialog = x2Var;
        x2Var.S0 = true;
        x2Var.show();
        return s4VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(h2 h2Var, boolean z10, boolean z11) {
        s4 s4Var;
        if (allowPresentFragment() && (s4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) s4Var;
            actionBarLayout.getClass();
            q4 q4Var = new q4(h2Var);
            q4Var.f29902b = z10;
            q4Var.f29903c = z11;
            q4Var.d = true;
            q4Var.f29904e = false;
            q4Var.f29905f = null;
            if (actionBarLayout.U(q4Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        s4 s4Var;
        if (dialog != null && (s4Var = this.parentLayout) != null && !((ActionBarLayout) s4Var).B()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.R && (z10 || !actionBarLayout.i())) {
                ArrayList<d2> arrayList = this.sheetsStack;
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
                    this.visibleDialog.setOnDismissListener(new z1(0, this, onDismissListener));
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
        s4 s4Var;
        if (this.isFinished || (s4Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) s4Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(q4 q4Var) {
        s4 s4Var;
        return allowPresentFragment() && (s4Var = this.parentLayout) != null && ((ActionBarLayout) s4Var).U(q4Var);
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
            s4 s4Var = this.parentLayout;
            if (s4Var != null && ((ActionBarLayout) s4Var).f28680b) {
                f9Var3.f11991r1 = true;
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
