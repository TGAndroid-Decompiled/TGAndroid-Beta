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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b8;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.nd;
import org.telegram.messenger.ot;
import org.telegram.messenger.ow;
import org.telegram.messenger.qz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.x9;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.ua;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k01;
import org.telegram.ui.my;
import org.telegram.ui.tj0;
import th.n7;
import th.o7;
public abstract class k2 {
    protected l actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private ua bulletinDelegate;
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
    protected z4 parentLayout;
    private j2 previewDelegate;
    private boolean removingFromStack;
    protected p6 resourceProvider;
    public ArrayList<g2> sheetsStack;
    protected i5 simpleActionBar;
    private ei.b simpleGlass;
    private s5 simpleMenuOverlay;
    private k2 simpleMenuOverlayHost;
    public Dialog visibleDialog;
    protected int currentAccount = d20.f15147s0;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final ei.r glassEngine = new ei.r();
    private final p6 themedColors = new v1(this, 1);
    protected i0.c mSystemInsets = i0.c.e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public k2(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new e2(0, this));
    }

    public static boolean hasFullyVisibleSheets(k2 k2Var) {
        my w9;
        if (k2Var != null) {
            if (!k2Var.hasShownFullyVisibleSheet()) {
                if ((k2Var.getParentLayout() instanceof ActionBarLayout) && (w9 = ((ActionBarLayout) k2Var.getParentLayout()).w()) != null && w9.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(k2 k2Var) {
        my w9;
        if (k2Var != null) {
            if (!k2Var.hasShownSheet()) {
                if ((k2Var.getParentLayout() instanceof ActionBarLayout) && (w9 = ((ActionBarLayout) k2Var.getParentLayout()).w()) != null && w9.hasShownSheet()) {
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

    public void addSheet(g2 g2Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        o7 lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.f49337v0 = g2Var;
            g2Var.o(new th.i2(lastStoryViewer, 3));
        }
        this.sheetsStack.add(g2Var);
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
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                g2 g2Var = this.sheetsStack.get(i10);
                if (g2Var != null && g2Var.z()) {
                    org.telegram.messenger.i0.E2(g2Var.d());
                    wVar.addView(g2Var.d());
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
        ArrayList<g2> arrayList = this.sheetsStack;
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
                } catch (Exception e) {
                    f8.g(e, true);
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
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
            this.actionBar = null;
        }
        i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            org.telegram.messenger.i0.E2(i5Var);
            this.simpleActionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    public boolean closeLastFragment() {
        return false;
    }

    public boolean closeSheet() {
        ArrayList<g2> arrayList = this.sheetsStack;
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
        z4 z4Var;
        l lVar = new l(context, getResourceProvider());
        a7.i(t6.f21206s8, lVar, this.themedColors);
        a7.m(lVar, 3, t6.f21225t8, this.themedColors);
        a7.a(lVar, t6.f21332z8, this.themedColors, true);
        a7.m(lVar, 1, t6.f21261v8, this.themedColors);
        a7.b(lVar, t6.f21313y8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((z4Var = this.parentLayout) == null || !((ActionBarLayout) z4Var).S0)) {
            return lVar;
        }
        lVar.setOccupyStatusBar(false);
        return lVar;
    }

    public org.telegram.ui.h4 createArticleViewer(boolean z10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z10) {
            if ((getLastSheet() instanceof org.telegram.ui.u3) && getLastSheet().s()) {
                return ((org.telegram.ui.u3) getLastSheet()).K;
            }
            z4 z4Var = this.parentLayout;
            if ((z4Var instanceof ActionBarLayout) && ((ActionBarLayout) z4Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.u3)) {
                org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
                if (u3Var.s()) {
                    return u3Var.K;
                }
            }
        }
        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(this);
        org.telegram.ui.u3 u3Var2 = h4Var.K;
        addSheet(u3Var2);
        d3.b(u3Var2);
        return h4Var;
    }

    public o7 createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        o7 o7Var = new o7(this);
        z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).f20072b) {
            o7Var.f49329r1 = true;
        }
        this.sheetsStack.add(o7Var);
        updateSheetsVisibility();
        return o7Var;
    }

    public i5 createSimpleActionBar(Context context) {
        z4 z4Var;
        i5 i5Var = new i5(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((z4Var = this.parentLayout) == null || !((ActionBarLayout) z4Var).S0)) {
            return i5Var;
        }
        i5Var.setOccupyStatusBar(false);
        return i5Var;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                g2 g2Var = this.sheetsStack.get(i10);
                if (g2Var != null && g2Var.z()) {
                    org.telegram.messenger.i0.E2(g2Var.d());
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
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return true;
    }

    public boolean drawEdgeNavigationBar() {
        return isSupportEdgeToEdge();
    }

    public void dumpCanvas() {
        Typeface typeface = org.telegram.messenger.i0.f15999a;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        j2 j2Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (j2Var = this.previewDelegate) != null) {
            ((k01) ((tj0) j2Var).f41852b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        z4 z4Var = this.parentLayout;
        if (z4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) z4Var;
            if (actionBarLayout.h || actionBarLayout.f20070a0) {
                Runnable runnable = actionBarLayout.e;
                if (runnable != null) {
                    org.telegram.messenger.i0.r(runnable);
                    actionBarLayout.e = null;
                }
                actionBarLayout.l(true, false);
            }
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

    public org.telegram.ui.h4 getArticleViewer() {
        if ((getLastSheet() instanceof org.telegram.ui.u3) && getLastSheet().s()) {
            return ((org.telegram.ui.u3) getLastSheet()).K;
        }
        z4 z4Var = this.parentLayout;
        if ((z4Var instanceof ActionBarLayout) && ((ActionBarLayout) z4Var).w() != null && (((ActionBarLayout) this.parentLayout).w().getLastSheet() instanceof org.telegram.ui.u3)) {
            org.telegram.ui.u3 u3Var = (org.telegram.ui.u3) ((ActionBarLayout) this.parentLayout).w().getLastSheet();
            if (u3Var.s()) {
                return u3Var.K;
            }
            return null;
        }
        return null;
    }

    public u4 getBackButtonState() {
        l lVar = this.actionBar;
        if (lVar != null) {
            return lVar.getBackButtonState();
        }
        return null;
    }

    public ei.b getBaseSimpleGlass() {
        if (this.simpleGlass == null) {
            this.simpleGlass = new ei.b(this.glassEngine, new o(this));
        }
        return this.simpleGlass;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public ua getBulletinDelegate() {
        return this.bulletinDelegate;
    }

    public FrameLayout getBulletinLayoutContainer() {
        return getLayoutContainer();
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(getAccountInstance().f14863a);
    }

    public org.telegram.messenger.i5 getContactsController() {
        return org.telegram.messenger.i5.r(getAccountInstance().f14863a);
    }

    public Context getContext() {
        return getParentActivity();
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        return null;
    }

    public org.telegram.messenger.b6 getDownloadController() {
        return org.telegram.messenger.b6.q(getAccountInstance().f14863a);
    }

    public t3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return t3.f20862b;
        }
        return t3.f20861a;
    }

    public b8 getFileLoader() {
        return b8.G(getAccountInstance().f14863a);
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public k2 getFragmentForAlert(int i10) {
        z4 z4Var = this.parentLayout;
        if (z4Var != null && z4Var.getFragmentStack().size() > i10 + 1) {
            return (k2) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i10);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public x9 getGiftAuctionsController() {
        return x9.c(getAccountInstance().f14863a);
    }

    public boolean getInPassivePreviewMode() {
        z4 z4Var = this.parentLayout;
        if (z4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) z4Var;
            if ((actionBarLayout.h && actionBarLayout.J == null) || actionBarLayout.f20070a0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public g2 getLastSheet() {
        ArrayList<g2> arrayList = this.sheetsStack;
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

    public o7 getLastStoryViewer() {
        ArrayList<g2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof o7) && this.sheetsStack.get(size).s()) {
                    return (o7) this.sheetsStack.get(size);
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

    public tk0 getListViewForSimpleGlass() {
        return null;
    }

    public nd getLocationController() {
        return nd.f(getAccountInstance().f14863a);
    }

    public MediaController getMediaController() {
        return MediaController.B();
    }

    public ui getMediaDataController() {
        return ui.b0(getAccountInstance().f14863a);
    }

    public vp getMessagesController() {
        return vp.r1(getAccountInstance().f14863a);
    }

    public hs getMessagesStorage() {
        return hs.a0(getAccountInstance().f14863a);
    }

    public int getNavigationBarColor() {
        int w02 = t6.w0(t6.f20872a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                g2 g2Var = this.sheetsStack.get(i10);
                if (g2Var.z()) {
                    w02 = g2Var.e(w02);
                }
            }
        }
        return w02;
    }

    public zs getNotificationCenter() {
        return zs.f(getAccountInstance().f14863a);
    }

    public ot getNotificationsController() {
        return ot.t(getAccountInstance().f14863a);
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().c();
    }

    public o7 getOrCreateStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        o7 o7Var = (this.sheetsStack.isEmpty() || !(i0.a.g(1, this.sheetsStack) instanceof o7)) ? null : (o7) i0.a.g(1, this.sheetsStack);
        if (o7Var == null) {
            o7Var = new o7(this);
            z4 z4Var = this.parentLayout;
            if (z4Var != null && ((ActionBarLayout) z4Var).f20072b) {
                o7Var.f49329r1 = true;
            }
            this.sheetsStack.add(o7Var);
            updateSheetsVisibility();
        }
        return o7Var;
    }

    public Activity getParentActivity() {
        z4 z4Var = this.parentLayout;
        if (z4Var != null) {
            return z4Var.getParentActivity();
        }
        return null;
    }

    public z4 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public p6 getResourceProvider() {
        return this.resourceProvider;
    }

    public in0 getScrollViewForSimpleGlass() {
        return null;
    }

    public ow getSecretChatHelper() {
        return ow.i(getAccountInstance().f14863a);
    }

    public qz getSendMessagesHelper() {
        return qz.C(getAccountInstance().f14863a);
    }

    public i5 getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public s5 getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        k2 k2Var = this.simpleMenuOverlayHost;
        if (k2Var != null && k2Var.fragmentView != null) {
            return k2Var.getSimpleMenuOverlay();
        }
        View view = this.fragmentView;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            i5 i5Var = this.simpleActionBar;
            if (i5Var != null && (i5Var.getParent() instanceof FrameLayout)) {
                viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            } else {
                return null;
            }
        }
        s5 s5Var = this.simpleMenuOverlay;
        if (s5Var == null || s5Var.getParent() != viewGroup) {
            s5 s5Var2 = this.simpleMenuOverlay;
            if (s5Var2 != null) {
                s5Var2.a(false);
                org.telegram.messenger.i0.E2(this.simpleMenuOverlay);
            }
            s5 s5Var3 = new s5(viewGroup.getContext());
            this.simpleMenuOverlay = s5Var3;
            viewGroup.addView(s5Var3, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.simpleMenuOverlay;
    }

    public ArrayList<c7> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i10) {
        return t6.w0(i10, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return t6.R0(str);
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
        return t6.V0(str);
    }

    public d20 getUserConfig() {
        return d20.i(getAccountInstance().f14863a);
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
        ArrayList<g2> arrayList = this.sheetsStack;
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
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                this.sheetsStack.get(i10);
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
        z4 z4Var = this.parentLayout;
        if (z4Var != null && z4Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int x02;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || t6.D0().q()) {
                p6 resourceProvider = getResourceProvider();
                int i10 = t6.f21206s8;
                l lVar = this.actionBar;
                if (lVar != null && lVar.u()) {
                    i10 = t6.f21279w8;
                } else if (this.simpleActionBar != null) {
                    i10 = t6.f20872a7;
                }
                if (resourceProvider != null) {
                    x02 = resourceProvider.f(i10);
                } else {
                    x02 = t6.x0(null, i10, true);
                }
                if (i0.b.h(x02) <= 0.699999988079071d) {
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
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                g2 g2Var = this.sheetsStack.get(i10);
                if ((g2Var instanceof o7) && view == ((o7) g2Var).f49330s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k2.movePreviewFragment(float):void");
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
        l actionBar;
        String title;
        this.isFullyVisible = true;
        if (((AccessibilityManager) org.telegram.messenger.w0.f19025b.getSystemService("accessibility")).isEnabled() && ((actionBar = getActionBar()) != null || this.simpleActionBar != null)) {
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
        } catch (Exception e) {
            f8.g(e, true);
        }
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D0 = false;
            lVar.P();
            y yVar = lVar.E;
            if (yVar != null) {
                int childCount = yVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = yVar.getChildAt(i10);
                    if (childAt instanceof t0) {
                        ((t0) childAt).o();
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
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setEnabled(false);
        }
        i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !org.telegram.messenger.i0.Q1() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (t6.x0(null, t6.f21206s8, false) == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.i0.o3(parentActivity, z10);
        }
        ArrayList<g2> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                g2 g2Var = this.sheetsStack.get(size);
                g2Var.b(false);
                g2Var.a(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public r0.j1 onInsetsInternal(View view, r0.j1 j1Var) {
        int i10 = 0;
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i11 = I0.d;
        int i12 = I0.f7766b;
        this.mSystemInsets = I0;
        ViewGroup viewGroup = this.listViewForSimpleGlass;
        if (viewGroup != null) {
            ei.b.e(viewGroup, i12, i11, l.getCurrentActionBarHeight(), 0);
        }
        if (this.navigationBarFadeView != null) {
            if (this.mSystemInsets.d < org.telegram.messenger.i0.L(40.0f)) {
                i10 = 8;
            }
            this.navigationBarFadeView.getLayoutParams().height = this.mSystemInsets.d;
            this.navigationBarFadeView.setVisibility(i10);
        }
        int i13 = I0.f7765a;
        int i14 = I0.f7767c;
        this.bottomInset = i11;
        onInsets(i13, i12, i14, i11);
        return r0.j1.f46131b;
    }

    public void onPause() {
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D0 = false;
            lVar.P();
            y yVar = lVar.E;
            if (yVar != null) {
                int childCount = yVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = yVar.getChildAt(i10);
                    if (childAt instanceof t0) {
                        ((t0) childAt).o();
                    }
                }
            }
        }
        s5 s5Var = this.simpleMenuOverlay;
        if (s5Var != null) {
            s5Var.a(false);
        }
        this.isPaused = true;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing() && dismissDialogOnPause(this.visibleDialog)) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        if (getLastStoryViewer() != null) {
            o7 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f49332s1 = true;
            n7 n7Var = lastStoryViewer.f49346z0;
            if (n7Var != null) {
                n7Var.release(null);
                lastStoryViewer.f49346z0 = null;
            }
            if (lastStoryViewer.E0 == null) {
                vh.s2 s2Var = lastStoryViewer.D0;
                if (s2Var != null) {
                    s2Var.d(0L, null);
                }
                th.s0 s0Var = lastStoryViewer.A0;
                if (s0Var != null) {
                    if (s0Var.f49423n) {
                        s0Var.s(null);
                    } else {
                        s0Var.e();
                    }
                    lastStoryViewer.A0 = null;
                }
            }
            th.i5 i5Var = lastStoryViewer.f49336u1;
            if (i5Var != null) {
                i5Var.b();
            }
            getLastStoryViewer().d0();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<g2> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            updateSheetsVisibility();
        }
    }

    public void onResume() {
        this.isPaused = false;
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.D0 = true;
            lVar.P();
        }
        if (getLastStoryViewer() != null) {
            o7 lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.f49332s1 = false;
            if (!org.telegram.ui.h4.v().V && lastStoryViewer.H() != null) {
                lastStoryViewer.H().d1(false);
            }
            th.i5 i5Var = lastStoryViewer.f49336u1;
            if (i5Var != null) {
                i5Var.a(false);
            }
            if (th.w0.Z.S) {
                th.w0.b();
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
        tk0 tk0Var;
        View createView = createView(context);
        tk0 listViewForSimpleGlass = getListViewForSimpleGlass();
        in0 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            tk0Var = listViewForSimpleGlass;
        } else {
            tk0Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = tk0Var;
        if (tk0Var != null && (createView instanceof FrameLayout)) {
            ei.b baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.f((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                p6 p6Var = this.resourceProvider;
                baseSimpleGlass.f6604k = frameLayout;
                baseSimpleGlass.f6605l = scrollViewForSimpleGlass;
                baseSimpleGlass.f6606m = new ei.a(0, scrollViewForSimpleGlass, frameLayout);
                ei.r rVar = baseSimpleGlass.f6597a;
                rVar.getClass();
                scrollViewForSimpleGlass.L.add(new ei.l(rVar, scrollViewForSimpleGlass));
                ei.m mVar = new ei.m(rVar);
                if (scrollViewForSimpleGlass.J == null) {
                    scrollViewForSimpleGlass.J = new ArrayList();
                }
                if (!scrollViewForSimpleGlass.J.contains(mVar)) {
                    scrollViewForSimpleGlass.J.add(mVar);
                }
                scrollViewForSimpleGlass.setClipToPadding(false);
                baseSimpleGlass.g(frameLayout, view, p6Var);
            }
            if (useFadeDrawableForActionBar() && view != null) {
                view.setBackground(baseSimpleGlass.a(view));
            }
            ViewGroup viewGroup = this.listViewForSimpleGlass;
            i0.c cVar = this.mSystemInsets;
            ei.b.e(viewGroup, cVar.f7766b, cVar.d, l.getCurrentActionBarHeight(), 0);
            if (drawEdgeNavigationBar()) {
                View view2 = new View(context);
                this.navigationBarFadeView = view2;
                view2.setBackground(baseSimpleGlass.b(view2));
                FrameLayout.LayoutParams e = w7.b6.e(-1, 0, 80);
                e.height = this.mSystemInsets.d;
                ((FrameLayout) createView).addView(this.navigationBarFadeView, e);
            }
        }
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(k2 k2Var) {
        z4 z4Var;
        return allowPresentFragment() && (z4Var = this.parentLayout) != null && ((ActionBarLayout) z4Var).R(k2Var);
    }

    public boolean presentFragmentAsPreview(k2 k2Var) {
        z4 z4Var;
        if (allowPresentFragment() && (z4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) z4Var;
            actionBarLayout.getClass();
            w4 w4Var = new w4(k2Var);
            w4Var.e = true;
            if (actionBarLayout.T(w4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(k2 k2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        z4 z4Var;
        if (allowPresentFragment() && (z4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) z4Var;
            actionBarLayout.getClass();
            w4 w4Var = new w4(k2Var);
            w4Var.e = true;
            w4Var.f21448f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.T(w4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void removeSheet(g2 g2Var) {
        ArrayList<g2> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(g2Var);
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
        z4 z4Var = this.parentLayout;
        if (z4Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) z4Var;
            actionBarLayout.X0 = true;
            Runnable runnable = actionBarLayout.e;
            if (runnable != null && actionBarLayout.d == null) {
                org.telegram.messenger.i0.r(runnable);
                actionBarLayout.e.run();
                actionBarLayout.e = null;
            }
        }
    }

    public void setBulletinDelegate(ua uaVar) {
        this.bulletinDelegate = uaVar;
    }

    public void setCurrentAccount(int i10) {
        if (this.fragmentView == null) {
            this.currentAccount = i10;
            return;
        }
        throw new IllegalStateException("trying to set current account when fragment UI already created");
    }

    public void setFinishing(boolean z10) {
        this.finishing = z10;
    }

    public void setFragmentPanTranslationOffset(int i10) {
        z4 z4Var = this.parentLayout;
        if (z4Var != null) {
            z4Var.setFragmentPanTranslationOffset(i10);
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
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setOccupyStatusBar(!z10);
        }
        i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i10) {
        if (this.sheetsStack != null) {
            for (int i11 = 0; i11 < this.sheetsStack.size(); i11++) {
                g2 g2Var = this.sheetsStack.get(i11);
                if (g2Var != null) {
                    g2Var.h(i10);
                }
            }
        }
    }

    public void setNavigationBarColor(int i10) {
        boolean z10;
        if (!isSupportEdgeToEdge()) {
            Activity parentActivity = getParentActivity();
            if (parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) parentActivity).D0(i10);
            } else if (parentActivity != null) {
                Window window = parentActivity.getWindow();
                if (Build.VERSION.SDK_INT >= 26 && window != null) {
                    window.getNavigationBarColor();
                }
            }
            if (org.telegram.messenger.i0.B(i10) >= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.i0.l3(parentActivity, z10);
            z4 z4Var = this.parentLayout;
            if (z4Var != null) {
                z4Var.setNavigationBarColor(i10);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(k2 k2Var) {
        setParentLayout(k2Var.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentGlass(RectF rectF, Runnable runnable) {
        if (this.simpleGlass != null) {
            ei.r rVar = this.glassEngine;
            RectF rectF2 = rVar.e;
            if (rectF == null) {
                if (!rectF2.isEmpty()) {
                    rectF2.setEmpty();
                    rVar.f6673f = true;
                }
            } else if (!rectF2.equals(rectF)) {
                rectF2.set(rectF);
                rVar.f6673f = true;
            }
            this.simpleGlass.f6602i = runnable;
        }
    }

    public void setParentLayout(z4 z4Var) {
        boolean z10;
        z4 z4Var2;
        ViewGroup viewGroup;
        if (this.parentLayout != z4Var) {
            this.parentLayout = z4Var;
            boolean z11 = false;
            if (z4Var != null && ((ActionBarLayout) z4Var).f20082f) {
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
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                z4 z4Var3 = this.parentLayout;
                if (z4Var3 != null && z4Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                z4 z4Var4 = this.parentLayout;
                if (z4Var4 != null && z4Var4.getView().getContext() != this.actionBar.getContext()) {
                    z11 = true;
                }
                l lVar = this.actionBar;
                if ((lVar.K || z11) && (viewGroup = (ViewGroup) lVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                }
                if (z11) {
                    this.actionBar = null;
                }
            }
            if (this.simpleActionBar != null && (z4Var2 = this.parentLayout) != null && z4Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                org.telegram.messenger.i0.E2(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    i5 createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new d2(this, 0));
                    return;
                }
                return;
            }
            z4 z4Var5 = this.parentLayout;
            if (z4Var5 != null && this.actionBar == null) {
                l createActionBar = createActionBar(z4Var5.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.f20511t0 = this;
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

    public void setPreviewDelegate(j2 j2Var) {
        this.previewDelegate = j2Var;
    }

    public void setRemovingFromStack(boolean z10) {
        this.removingFromStack = z10;
    }

    public void setResourceProvider(p6 p6Var) {
        this.resourceProvider = p6Var;
    }

    public void setSimpleMenuOverlayHost(k2 k2Var) {
        this.simpleMenuOverlayHost = k2Var;
    }

    public void setTitleOverlayText(String str, int i10, Runnable runnable) {
        l lVar = this.actionBar;
        if (lVar != null) {
            lVar.L(str, i10, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        l lVar = this.actionBar;
        if (lVar != null && lVar.K) {
            setTitleOverlayText(str, i10, runnable);
        }
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public boolean shouldOverrideSlideTransition(boolean z10, boolean z11) {
        return false;
    }

    public z4[] showAsSheet(k2 k2Var) {
        return showAsSheet(k2Var, null);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void startActivityForResult(Intent intent, int i10) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        z4 z4Var = this.parentLayout;
        if (z4Var != null && (activity = (actionBarLayout = (ActionBarLayout) z4Var).Q0) != null) {
            if (actionBarLayout.W) {
                AnimatorSet animatorSet = actionBarLayout.K;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.K = null;
                }
                if (actionBarLayout.E0 != null) {
                    actionBarLayout.J();
                } else if (actionBarLayout.F0 != null) {
                    actionBarLayout.M();
                }
                actionBarLayout.f20109s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i10);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i10 = 0; i10 < this.sheetsStack.size(); i10++) {
                g2 g2Var = this.sheetsStack.get(i10);
                boolean z10 = true;
                if (i10 != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z10 = false;
                }
                g2Var.b(z10);
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

    public boolean presentFragment(k2 k2Var, boolean z10) {
        z4 z4Var;
        return allowPresentFragment() && (z4Var = this.parentLayout) != null && ((ActionBarLayout) z4Var).S(k2Var, z10);
    }

    public void removeSelfFromStack(boolean z10) {
        z4 z4Var;
        if (this.isFinished || (z4Var = this.parentLayout) == null) {
            return;
        }
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else {
            ((ActionBarLayout) z4Var).c0(this, z10);
        }
    }

    public z4[] showAsSheet(k2 k2Var, i2 i2Var) {
        if (getParentActivity() == null) {
            return null;
        }
        z4[] z4VarArr = {new t4(getParentActivity(), new mg.l(r7, 11))};
        z4VarArr[0].setIsSheet(true);
        LaunchActivity.I1.P.add(z4VarArr[0]);
        k2Var.onTransitionAnimationStart(true, false);
        f2 f2Var = new f2(getParentActivity(), k2Var.getResourceProvider(), i2Var, z4VarArr, k2Var, r7);
        z2[] z2VarArr = {f2Var};
        if (i2Var != null) {
            f2Var.u0(false);
            z2VarArr[0].V0 = i2Var.f20389a;
        }
        z2 z2Var = z2VarArr[0];
        k2Var.parentDialog = z2Var;
        z2Var.R0 = true;
        z2Var.show();
        return z4VarArr;
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public boolean presentFragment(k2 k2Var, boolean z10, boolean z11) {
        z4 z4Var;
        if (allowPresentFragment() && (z4Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) z4Var;
            actionBarLayout.getClass();
            w4 w4Var = new w4(k2Var);
            w4Var.f21446b = z10;
            w4Var.f21447c = z11;
            w4Var.d = true;
            w4Var.e = false;
            w4Var.f21448f = null;
            if (actionBarLayout.T(w4Var)) {
                return true;
            }
        }
        return false;
    }

    public Dialog showDialog(Dialog dialog, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        z4 z4Var;
        if (dialog != null && (z4Var = this.parentLayout) != null && !((ActionBarLayout) z4Var).A()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.Q && (z10 || !actionBarLayout.i())) {
                ArrayList<g2> arrayList = this.sheetsStack;
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
                } catch (Exception e) {
                    f8.g(e, true);
                }
                try {
                    this.visibleDialog = dialog;
                    dialog.setCanceledOnTouchOutside(true);
                    this.visibleDialog.setOnDismissListener(new mg.g(1, this, onDismissListener));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
        }
        return null;
    }

    public boolean finishFragment(boolean z10) {
        z4 z4Var;
        if (this.isFinished || (z4Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) z4Var).l(z10, false);
        return true;
    }

    public boolean presentFragment(w4 w4Var) {
        z4 z4Var;
        return allowPresentFragment() && (z4Var = this.parentLayout) != null && ((ActionBarLayout) z4Var).T(w4Var);
    }

    public o7 getOrCreateStoryViewer(int i10) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        o7 o7Var = null;
        o7 o7Var2 = (this.sheetsStack.isEmpty() || !(i0.a.g(1, this.sheetsStack) instanceof o7)) ? null : (o7) i0.a.g(1, this.sheetsStack);
        if (o7Var2 == null || o7Var2.h == i10) {
            o7Var = o7Var2;
        } else {
            o7Var2.D(true);
            removeSheet(o7Var2);
        }
        if (o7Var == null) {
            o7 o7Var3 = new o7(this);
            z4 z4Var = this.parentLayout;
            if (z4Var != null && ((ActionBarLayout) z4Var).f20072b) {
                o7Var3.f49329r1 = true;
            }
            this.sheetsStack.add(o7Var3);
            updateSheetsVisibility();
            return o7Var3;
        }
        return o7Var;
    }

    public void addThemeColorKeys(HashSet<Integer> hashSet) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public void onPanTranslationUpdate(float f7) {
    }

    public void restoreSelfArgs(Bundle bundle) {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setPreviewOpenedProgress(float f7) {
    }

    public void setPreviewReplaceProgress(float f7) {
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

    public void onSlideProgress(boolean z10, float f7) {
    }

    public void onTransitionAnimationProgress(boolean z10, float f7) {
    }

    public void prepareFragmentToSlide(boolean z10, boolean z11) {
    }

    public void onActivityResultFragment(int i10, int i11, Intent intent) {
    }

    public void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
    }

    public void onInsets(int i10, int i11, int i12, int i13) {
    }
}
