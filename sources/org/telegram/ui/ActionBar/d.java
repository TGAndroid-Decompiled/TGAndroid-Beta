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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public abstract class d {
    protected a actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private q21 bulletinDelegate;
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
    protected tk5 parentLayout;
    private ch0 previewDelegate;
    private boolean removingFromStack;
    protected ylb resourceProvider;
    public ArrayList<ah0> sheetsStack;
    protected rja simpleActionBar;
    private eh0 simpleGlass;
    private bka simpleMenuOverlay;
    private d simpleMenuOverlayHost;
    public Dialog visibleDialog;
    protected int currentAccount = z8c.t0;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final sy4 glassEngine = new sy4();
    private final ylb themedColors = new fe(this, (byte) 1);
    protected iq5 mSystemInsets = iq5.e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public d(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new yg0(this, (byte) 0));
    }

    public static boolean hasFullyVisibleSheets(d dVar) {
        i34 v;
        if (dVar != null) {
            if (!dVar.hasShownFullyVisibleSheet()) {
                if ((dVar.getParentLayout() instanceof ActionBarLayout) && (v = ((ActionBarLayout) dVar.getParentLayout()).v()) != null && v.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(d dVar) {
        i34 v;
        if (dVar != null) {
            if (!dVar.hasShownSheet()) {
                if ((dVar.getParentLayout() instanceof ActionBarLayout) && (v = ((ActionBarLayout) dVar.getParentLayout()).v()) != null && v.hasShownSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean X(MotionEvent motionEvent, boolean z) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(ah0 ah0Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        oab lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.w0 = ah0Var;
            ah0Var.n(new j48(lastStoryViewer, (byte) 3));
        }
        this.sheetsStack.add(ah0Var);
        updateSheetsVisibility();
    }

    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return true;
    }

    public boolean allowPresentFragment() {
        return true;
    }

    public void attachSheets(b bVar) {
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                ah0 ah0Var = this.sheetsStack.get(i);
                if (ah0Var != null && ah0Var.y()) {
                    gm.B2(ah0Var.d());
                    bVar.addView(ah0Var.d());
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
            ((LaunchActivity) parentActivity).H(true, true, true);
        }
    }

    public void clearSheets() {
        ArrayList<ah0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.sheetsStack.size() - 1;
            while (true) {
                ArrayList<ah0> arrayList2 = this.sheetsStack;
                if (size >= 0) {
                    arrayList2.get(size).a(true);
                    size--;
                } else {
                    arrayList2.clear();
                    return;
                }
            }
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
                    fc4.g(e, true);
                }
            }
            this.fragmentView = null;
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
            this.actionBar = null;
        }
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            gm.B2(rjaVar);
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

    public boolean closeOpenMenuOverlay(boolean z) {
        bka bkaVar = this.simpleMenuOverlay;
        if (bkaVar != null && bkaVar.I) {
            if (z) {
                bkaVar.a(true);
            }
            return true;
        }
        return false;
    }

    public boolean closeSheet() {
        ArrayList<ah0> arrayList = this.sheetsStack;
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

    public a createActionBar(Context context) {
        tk5 tk5Var;
        a aVar = new a(context, getResourceProvider());
        anb.h(cmb.r8, this.themedColors, aVar);
        anb.l(aVar, 3, cmb.s8, this.themedColors);
        anb.a(aVar, cmb.y8, this.themedColors, true);
        anb.l(aVar, 1, cmb.u8, this.themedColors);
        anb.b(aVar, cmb.x8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((tk5Var = this.parentLayout) == null || !((ActionBarLayout) tk5Var).T0)) {
            return aVar;
        }
        aVar.setOccupyStatusBar(false);
        return aVar;
    }

    public o createArticleViewer(boolean z) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        if (!z) {
            if ((getLastSheet() instanceof sx) && getLastSheet().s()) {
                return ((sx) getLastSheet()).L;
            }
            tk5 tk5Var = this.parentLayout;
            if ((tk5Var instanceof ActionBarLayout) && ((ActionBarLayout) tk5Var).v() != null && (((ActionBarLayout) this.parentLayout).v().getLastSheet() instanceof sx)) {
                sx sxVar = (sx) ((ActionBarLayout) this.parentLayout).v().getLastSheet();
                if (sxVar.s()) {
                    return sxVar.L;
                }
            }
        }
        o oVar = new o(this);
        sx sxVar2 = oVar.L;
        addSheet(sxVar2);
        sy0.a(sxVar2);
        return oVar;
    }

    public oab createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        oab oabVar = new oab(this);
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).b) {
            oabVar.r1 = true;
        }
        this.sheetsStack.add(oabVar);
        updateSheetsVisibility();
        return oabVar;
    }

    public rja createSimpleActionBar(Context context) {
        tk5 tk5Var;
        rja rjaVar = new rja(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((tk5Var = this.parentLayout) == null || !((ActionBarLayout) tk5Var).T0)) {
            return rjaVar;
        }
        rjaVar.setOccupyStatusBar(false);
        return rjaVar;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                ah0 ah0Var = this.sheetsStack.get(i);
                if (ah0Var != null && ah0Var.y()) {
                    gm.B2(ah0Var.d());
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
            fc4.g(e, true);
        }
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return true;
    }

    public boolean drawEdgeNavigationBar() {
        return isSupportEdgeToEdge();
    }

    public void dumpCanvas() {
        Typeface typeface = gm.a;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        ch0 ch0Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (ch0Var = this.previewDelegate) != null) {
            ((dj3) ((yf9) ch0Var).b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null) {
            ((ActionBarLayout) tk5Var).t();
        }
    }

    public j5 getAccountInstance() {
        return j5.a(this.currentAccount);
    }

    public a getActionBar() {
        return this.actionBar;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public o getArticleViewer() {
        if ((getLastSheet() instanceof sx) && getLastSheet().s()) {
            return ((sx) getLastSheet()).L;
        }
        tk5 tk5Var = this.parentLayout;
        if ((tk5Var instanceof ActionBarLayout) && ((ActionBarLayout) tk5Var).v() != null && (((ActionBarLayout) this.parentLayout).v().getLastSheet() instanceof sx)) {
            sx sxVar = (sx) ((ActionBarLayout) this.parentLayout).v().getLastSheet();
            if (sxVar.s()) {
                return sxVar.L;
            }
            return null;
        }
        return null;
    }

    public ok5 getBackButtonState() {
        a aVar = this.actionBar;
        if (aVar != null) {
            return aVar.getBackButtonState();
        }
        return null;
    }

    public eh0 getBaseSimpleGlass() {
        eh0 eh0Var = this.simpleGlass;
        if (eh0Var == null) {
            eh0 eh0Var2 = new eh0(this.glassEngine, new h6(this, (byte) 4));
            this.simpleGlass = eh0Var2;
            return eh0Var2;
        }
        return eh0Var;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public q21 getBulletinDelegate() {
        return this.bulletinDelegate;
    }

    public FrameLayout getBulletinLayoutContainer() {
        return getLayoutContainer();
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(getAccountInstance().a);
    }

    public bw2 getContactsController() {
        return bw2.r(getAccountInstance().a);
    }

    public Context getContext() {
        return getParentActivity();
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        return null;
    }

    public er3 getDownloadController() {
        return er3.q(getAccountInstance().a);
    }

    public bu3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return bu3.b;
        }
        return bu3.a;
    }

    public bc4 getFileLoader() {
        return bc4.G(getAccountInstance().a);
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public d getFragmentForAlert(int i) {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && tk5Var.getFragmentStack().size() > i + 1) {
            return (d) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public lv4 getGiftAuctionsController() {
        return lv4.c(getAccountInstance().a);
    }

    public boolean getInPassivePreviewMode() {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) tk5Var;
            if ((actionBarLayout.h && actionBarLayout.K == null) || actionBarLayout.b0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public ah0 getLastSheet() {
        ArrayList<ah0> arrayList = this.sheetsStack;
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

    public oab getLastStoryViewer() {
        ArrayList<ah0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof oab) && this.sheetsStack.get(size).s()) {
                    return (oab) this.sheetsStack.get(size);
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

    public r59 getListViewForSimpleGlass() {
        return null;
    }

    public dd6 getLocationController() {
        return dd6.f(getAccountInstance().a);
    }

    public MediaController getMediaController() {
        return MediaController.w();
    }

    public hs6 getMediaDataController() {
        return hs6.d0(getAccountInstance().a);
    }

    public oc7 getMessagesController() {
        return oc7.r1(getAccountInstance().a);
    }

    public cf7 getMessagesStorage() {
        return cf7.Y(getAccountInstance().a);
    }

    public int getNavigationBarColor() {
        int v0 = cmb.v0(cmb.Z6, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                ah0 ah0Var = this.sheetsStack.get(i);
                if (ah0Var.y()) {
                    v0 = ah0Var.e(v0);
                }
            }
        }
        return v0;
    }

    public nm7 getNotificationCenter() {
        return nm7.f(getAccountInstance().a);
    }

    public lo7 getNotificationsController() {
        return lo7.n(getAccountInstance().a);
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().d();
    }

    public oab getOrCreateStoryViewer(int i) {
        oab oabVar;
        ArrayList<ah0> arrayList = this.sheetsStack;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.sheetsStack = arrayList;
        }
        oab oabVar2 = null;
        if (!arrayList.isEmpty() && (b10.f(1, this.sheetsStack) instanceof oab)) {
            oabVar = (oab) b10.f(1, this.sheetsStack);
        } else {
            oabVar = null;
        }
        if (oabVar != null && oabVar.h != i) {
            oabVar.o(true);
            removeSheet(oabVar);
        } else {
            oabVar2 = oabVar;
        }
        if (oabVar2 == null) {
            oab oabVar3 = new oab(this);
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && ((ActionBarLayout) tk5Var).b) {
                oabVar3.r1 = true;
            }
            this.sheetsStack.add(oabVar3);
            updateSheetsVisibility();
            return oabVar3;
        }
        return oabVar2;
    }

    public Activity getParentActivity() {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null) {
            return tk5Var.getParentActivity();
        }
        return null;
    }

    public tk5 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public ylb getResourceProvider() {
        return this.resourceProvider;
    }

    public ww9 getScrollViewForSimpleGlass() {
        return null;
    }

    public dw9 getSecretChatHelper() {
        return dw9.i(getAccountInstance().a);
    }

    public a6a getSendMessagesHelper() {
        return a6a.B(getAccountInstance().a);
    }

    public rja getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public bka getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        d dVar = this.simpleMenuOverlayHost;
        if (dVar != null && dVar.fragmentView != null) {
            return dVar.getSimpleMenuOverlay();
        }
        View view = this.fragmentView;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            rja rjaVar = this.simpleActionBar;
            if (rjaVar != null && (rjaVar.getParent() instanceof FrameLayout)) {
                viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            } else {
                return null;
            }
        }
        bka bkaVar = this.simpleMenuOverlay;
        if (bkaVar == null || bkaVar.getParent() != viewGroup) {
            bka bkaVar2 = this.simpleMenuOverlay;
            if (bkaVar2 != null) {
                bkaVar2.a(false);
                gm.B2(this.simpleMenuOverlay);
            }
            bka bkaVar3 = new bka(viewGroup.getContext());
            this.simpleMenuOverlay = bkaVar3;
            viewGroup.addView(bkaVar3, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.simpleMenuOverlay;
    }

    public ArrayList<cnb> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i) {
        return cmb.v0(i, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return cmb.P0(str);
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
        return cmb.T0(str);
    }

    public z8c getUserConfig() {
        return z8c.h(getAccountInstance().a);
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
        ArrayList<ah0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasShownFullyVisibleSheet() {
        if (hasSheet()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).s() && this.sheetsStack.get(size).h()) {
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
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                this.sheetsStack.get(i);
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
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && tk5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int w0;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || cmb.B0().o()) {
                ylb resourceProvider = getResourceProvider();
                int i = cmb.r8;
                a aVar = this.actionBar;
                if (aVar != null && aVar.y()) {
                    i = cmb.v8;
                } else if (this.simpleActionBar != null) {
                    i = cmb.Z6;
                }
                if (resourceProvider != null) {
                    w0 = resourceProvider.f(i);
                } else {
                    w0 = cmb.w0(null, i, true);
                }
                if (on2.h(w0) <= 0.699999988079071d) {
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
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                ah0 ah0Var = this.sheetsStack.get(i);
                if ((ah0Var instanceof oab) && view == ((oab) ah0Var).s) {
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

    public void movePreviewFragment(float r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d.movePreviewFragment(float):void");
    }

    public boolean needDelayOpenAnimation() {
        return false;
    }

    public boolean onBackPressed(boolean z) {
        if (closeOpenMenuOverlay(z)) {
            return false;
        }
        if (hasShownSheet()) {
            if (z) {
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
        String title;
        this.isFullyVisible = true;
        if (((AccessibilityManager) org.telegram.messenger.a.b.getSystemService("accessibility")).isEnabled()) {
            a actionBar = getActionBar();
            if (actionBar == null) {
                rja rjaVar = this.simpleActionBar;
                if (rjaVar != null) {
                    title = rjaVar.getTitle();
                }
            } else {
                title = actionBar.getTitle();
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
            fc4.g(e, true);
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.E0 = false;
            aVar.S();
            r6 r6Var = aVar.F;
            if (r6Var != null) {
                int childCount = r6Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = r6Var.getChildAt(i);
                    if (childAt instanceof r7) {
                        ((r7) childAt).p();
                    }
                }
            }
        }
    }

    public AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        return null;
    }

    public boolean onFragmentCreate() {
        return true;
    }

    public void onFragmentDestroy() {
        boolean z;
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().j(this.classGuid);
        this.isFinished = true;
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setEnabled(false);
        }
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !gm.O1() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (cmb.w0(null, cmb.r8, false) == -1) {
                z = true;
            } else {
                z = false;
            }
            gm.k3(parentActivity, z);
        }
        ArrayList<ah0> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ah0 ah0Var = this.sheetsStack.get(size);
                ah0Var.b(false);
                ah0Var.a(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public wzc onInsetsInternal(View view, wzc wzcVar) {
        int i = 0;
        iq5 H0 = gm.H0(wzcVar, false);
        int i2 = H0.d;
        int i3 = H0.b;
        this.mSystemInsets = H0;
        ViewGroup viewGroup = this.listViewForSimpleGlass;
        if (viewGroup != null) {
            eh0.e(viewGroup, i3, i2, a.getCurrentActionBarHeight(), 0);
        }
        if (this.navigationBarFadeView != null) {
            if (this.mSystemInsets.d < gm.L(40.0f)) {
                i = 8;
            }
            this.navigationBarFadeView.getLayoutParams().height = this.mSystemInsets.d;
            this.navigationBarFadeView.setVisibility(i);
        }
        int i4 = H0.a;
        int i5 = H0.c;
        this.bottomInset = i2;
        onInsets(i4, i3, i5, i2);
        return wzc.b;
    }

    public void onPause() {
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.E0 = false;
            aVar.S();
            r6 r6Var = aVar.F;
            if (r6Var != null) {
                int childCount = r6Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = r6Var.getChildAt(i);
                    if (childAt instanceof r7) {
                        ((r7) childAt).p();
                    }
                }
            }
        }
        bka bkaVar = this.simpleMenuOverlay;
        if (bkaVar != null) {
            bkaVar.a(false);
        }
        this.isPaused = true;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing() && dismissDialogOnPause(this.visibleDialog)) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (getLastStoryViewer() != null) {
            oab lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.s1 = true;
            nab nabVar = lastStoryViewer.A0;
            if (nabVar != null) {
                nabVar.release(null);
                lastStoryViewer.A0 = null;
            }
            if (!w96.a(lastStoryViewer.B0)) {
                t96 t96Var = lastStoryViewer.E0;
                if (t96Var != null) {
                    t96Var.e(0L, null);
                }
                s96 s96Var = lastStoryViewer.B0;
                if (s96Var != null) {
                    if (s96Var.n) {
                        s96Var.d();
                    } else {
                        s96Var.h();
                    }
                    lastStoryViewer.B0 = null;
                }
            }
            l4b l4bVar = lastStoryViewer.u1;
            if (l4bVar != null) {
                l4bVar.b();
            }
            getLastStoryViewer().U();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<ah0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            updateSheetsVisibility();
        }
    }

    public void onResume() {
        this.isPaused = false;
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.E0 = true;
            aVar.S();
        }
        if (getLastStoryViewer() != null) {
            oab lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.s1 = false;
            if (!o.u().W && lastStoryViewer.w() != null) {
                lastStoryViewer.w().c1(false);
            }
            l4b l4bVar = lastStoryViewer.u1;
            if (l4bVar != null) {
                l4bVar.a(false);
            }
            getLastStoryViewer().U();
        }
    }

    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        this.inTransitionAnimation = false;
    }

    public void onTransitionAnimationStart(boolean z, boolean z2) {
        this.inTransitionAnimation = true;
        if (z) {
            this.fragmentBeginToShow = true;
        }
    }

    public void onViewCreated(View view) {
        this.glassEngine.i(view);
    }

    public View performCreateView(Context context) {
        r59 r59Var;
        View createView = createView(context);
        r59 listViewForSimpleGlass = getListViewForSimpleGlass();
        ww9 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            r59Var = listViewForSimpleGlass;
        } else {
            r59Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = r59Var;
        if (r59Var != null && (createView instanceof FrameLayout)) {
            eh0 baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.f((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                ylb ylbVar = this.resourceProvider;
                baseSimpleGlass.m = frameLayout;
                baseSimpleGlass.n = scrollViewForSimpleGlass;
                baseSimpleGlass.o = new dh0(scrollViewForSimpleGlass, frameLayout, (byte) 0);
                sy4 sy4Var = baseSimpleGlass.a;
                sy4Var.getClass();
                scrollViewForSimpleGlass.M.add(new my4(sy4Var, scrollViewForSimpleGlass));
                ny4 ny4Var = new ny4(sy4Var);
                ArrayList arrayList = scrollViewForSimpleGlass.K;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    scrollViewForSimpleGlass.K = arrayList;
                }
                if (!arrayList.contains(ny4Var)) {
                    scrollViewForSimpleGlass.K.add(ny4Var);
                }
                scrollViewForSimpleGlass.setClipToPadding(false);
                baseSimpleGlass.h(frameLayout, view, ylbVar);
            }
            if (useFadeDrawableForActionBar() && view != null) {
                view.setBackground(baseSimpleGlass.a(view));
            }
            ViewGroup viewGroup = this.listViewForSimpleGlass;
            iq5 iq5Var = this.mSystemInsets;
            eh0.e(viewGroup, iq5Var.b, iq5Var.d, a.getCurrentActionBarHeight(), 0);
            if (drawEdgeNavigationBar()) {
                View view2 = new View(context);
                this.navigationBarFadeView = view2;
                view2.setBackground(baseSimpleGlass.b(view2));
                FrameLayout.LayoutParams e = qoe.e(-1, 0, 80);
                e.height = this.mSystemInsets.d;
                ((FrameLayout) createView).addView(this.navigationBarFadeView, e);
            }
        }
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(d dVar, boolean z, boolean z2) {
        tk5 tk5Var;
        if (allowPresentFragment() && (tk5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) tk5Var;
            actionBarLayout.getClass();
            qk5 qk5Var = new qk5(dVar);
            qk5Var.b = z;
            qk5Var.c = z2;
            qk5Var.d = true;
            qk5Var.e = false;
            qk5Var.f = null;
            if (actionBarLayout.R(qk5Var)) {
                return true;
            }
        }
        return false;
    }

    public boolean presentFragmentAsPreview(d dVar) {
        tk5 tk5Var;
        if (allowPresentFragment() && (tk5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) tk5Var;
            actionBarLayout.getClass();
            qk5 qk5Var = new qk5(dVar);
            qk5Var.e = true;
            if (actionBarLayout.R(qk5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(d dVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        tk5 tk5Var;
        if (allowPresentFragment() && (tk5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) tk5Var;
            actionBarLayout.getClass();
            qk5 qk5Var = new qk5(dVar);
            qk5Var.e = true;
            qk5Var.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.R(qk5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack(boolean z) {
        tk5 tk5Var;
        if (!this.isFinished && (tk5Var = this.parentLayout) != null) {
            Dialog dialog = this.parentDialog;
            if (dialog != null) {
                dialog.dismiss();
            } else {
                ((ActionBarLayout) tk5Var).c0(this, z);
            }
        }
    }

    public void removeSheet(ah0 ah0Var) {
        ArrayList<ah0> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(ah0Var);
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
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) tk5Var;
            actionBarLayout.Y0 = true;
            Runnable runnable = actionBarLayout.e;
            if (runnable != null && actionBarLayout.d == null) {
                gm.r(runnable);
                actionBarLayout.e.run();
                actionBarLayout.e = null;
            }
        }
    }

    public void setBulletinDelegate(q21 q21Var) {
        this.bulletinDelegate = q21Var;
    }

    public void setCurrentAccount(int i) {
        if (this.fragmentView == null) {
            this.currentAccount = i;
        } else {
            dq9.m("trying to set current account when fragment UI already created");
        }
    }

    public void setFinishing(boolean z) {
        this.finishing = z;
    }

    public void setFragmentPanTranslationOffset(int i) {
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null) {
            tk5Var.setFragmentPanTranslationOffset(i);
        }
    }

    public void setFragmentView(View view) {
        this.fragmentView = view;
    }

    public void setHasOwnBackground(boolean z) {
        this.hasOwnBackground = z;
    }

    public void setInBubbleMode(boolean z) {
        this.inBubbleMode = z;
    }

    public void setInMenuMode(boolean z) {
        this.inMenuMode = z;
    }

    public void setInPreviewMode(boolean z) {
        this.inPreviewMode = z;
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setOccupyStatusBar(!z);
        }
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i) {
        if (this.sheetsStack != null) {
            for (int i2 = 0; i2 < this.sheetsStack.size(); i2++) {
                ah0 ah0Var = this.sheetsStack.get(i2);
                if (ah0Var != null) {
                    ah0Var.g(i);
                }
            }
        }
    }

    public void setNavigationBarColor(int i) {
        boolean z;
        if (!isSupportEdgeToEdge()) {
            Activity parentActivity = getParentActivity();
            if (parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) parentActivity).D0(i);
            } else if (parentActivity != null) {
                Window window = parentActivity.getWindow();
                if (Build.VERSION.SDK_INT >= 26 && window != null) {
                    window.getNavigationBarColor();
                }
            }
            if (gm.B(i) >= 0.721f) {
                z = true;
            } else {
                z = false;
            }
            gm.h3(parentActivity, z);
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null) {
                tk5Var.setNavigationBarColor(i);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(d dVar) {
        setParentLayout(dVar.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentGlass(RectF rectF, Runnable runnable) {
        if (this.simpleGlass != null) {
            sy4 sy4Var = this.glassEngine;
            RectF rectF2 = sy4Var.e;
            if (rectF == null) {
                if (!rectF2.isEmpty()) {
                    rectF2.setEmpty();
                    sy4Var.f = true;
                }
            } else if (!rectF2.equals(rectF)) {
                rectF2.set(rectF);
                sy4Var.f = true;
            }
            this.simpleGlass.j = runnable;
        }
    }

    public void setParentLayout(tk5 tk5Var) {
        boolean z;
        tk5 tk5Var2;
        boolean z2;
        ViewGroup viewGroup;
        if (this.parentLayout != tk5Var) {
            this.parentLayout = tk5Var;
            if (tk5Var != null && ((ActionBarLayout) tk5Var).f) {
                z = true;
            } else {
                z = false;
            }
            this.inBubbleMode = z;
            View view = this.fragmentView;
            if (view != null) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                if (viewGroup2 != null) {
                    try {
                        onRemoveFromParent();
                        viewGroup2.removeViewInLayout(this.fragmentView);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                tk5 tk5Var3 = this.parentLayout;
                if (tk5Var3 != null && tk5Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                tk5 tk5Var4 = this.parentLayout;
                if (tk5Var4 != null && tk5Var4.getView().getContext() != this.actionBar.getContext()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a aVar = this.actionBar;
                if ((aVar.L || z2) && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                }
                if (z2) {
                    this.actionBar = null;
                }
            }
            if (this.simpleActionBar != null && (tk5Var2 = this.parentLayout) != null && tk5Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                gm.B2(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    rja createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new wg0(this, (byte) 0));
                    return;
                }
                return;
            }
            tk5 tk5Var5 = this.parentLayout;
            if (tk5Var5 != null && this.actionBar == null) {
                a createActionBar = createActionBar(tk5Var5.getView().getContext());
                this.actionBar = createActionBar;
                if (createActionBar != null) {
                    createActionBar.u0 = this;
                }
            }
        }
    }

    public void setPaused(boolean z) {
        if (this.isPaused == z) {
            return;
        }
        if (z) {
            onPause();
        } else {
            onResume();
        }
    }

    public void setPreviewDelegate(ch0 ch0Var) {
        this.previewDelegate = ch0Var;
    }

    public void setRemovingFromStack(boolean z) {
        this.removingFromStack = z;
    }

    public void setResourceProvider(ylb ylbVar) {
        this.resourceProvider = ylbVar;
    }

    public void setSimpleMenuOverlayHost(d dVar) {
        this.simpleMenuOverlayHost = dVar;
    }

    public void setTitleOverlayText(String str, int i, Runnable runnable) {
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.O(str, i, runnable);
        }
    }

    public void setTitleOverlayTextIfActionBarAttached(String str, int i, Runnable runnable) {
        a aVar = this.actionBar;
        if (aVar != null && aVar.L) {
            setTitleOverlayText(str, i, runnable);
        }
    }

    public void setVisibleDialog(Dialog dialog) {
        this.visibleDialog = dialog;
    }

    public void setupBulletinGlass(u31 u31Var) {
        float f;
        y21 y21Var = u31Var.e;
        if (this.simpleGlass != null && this.fragmentView != null && y21Var != null && y21Var.canHaveGlassBackground()) {
            final im0 c = this.simpleGlass.c.c(y21Var, null, false);
            c.p(qqd.c(getResourceProvider()));
            if (u31Var.l) {
                f = 24.0f;
            } else {
                f = 16.0f;
            }
            c.r(gm.L(f));
            y21Var.setGlassBackground(c, new Runnable() {
                @Override
                public final void run() {
                    sy4 sy4Var = d.this.glassEngine;
                    ArrayList arrayList = sy4Var.c;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (((ry4) arrayList.get(size)).b == c && ((ry4) arrayList.remove(size)).i) {
                            sy4Var.f = true;
                        }
                    }
                }
            });
        }
    }

    public boolean shouldOverrideSlideTransition(boolean z, boolean z2) {
        return false;
    }

    public tk5[] showAsSheet(d dVar, bh0 bh0Var) {
        if (getParentActivity() == null) {
            return null;
        }
        tk5[] tk5VarArr = {new nk5(getParentActivity(), new xg0(r7, (byte) 0))};
        tk5VarArr[0].setIsSheet(true);
        LaunchActivity.H1.Q.add(tk5VarArr[0]);
        dVar.onTransitionAnimationStart(true, false);
        zg0 zg0Var = new zg0(getParentActivity(), dVar.getResourceProvider(), bh0Var, tk5VarArr, dVar, r7);
        my0[] my0VarArr = {zg0Var};
        if (bh0Var != null) {
            zg0Var.r0(false);
            my0VarArr[0].V0 = bh0Var.a;
        }
        my0 my0Var = my0VarArr[0];
        dVar.parentDialog = my0Var;
        my0Var.S0 = true;
        my0Var.show();
        return tk5VarArr;
    }

    public Dialog showDialog(Dialog dialog, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        tk5 tk5Var;
        if (dialog != null && (tk5Var = this.parentLayout) != null && !((ActionBarLayout) tk5Var).z()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.R && (z || !actionBarLayout.h())) {
                ArrayList<ah0> arrayList = this.sheetsStack;
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
                    fc4.g(e, true);
                }
                try {
                    this.visibleDialog = dialog;
                    dialog.setCanceledOnTouchOutside(true);
                    this.visibleDialog.setOnDismissListener(new dg(this, onDismissListener, (byte) 2));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
        }
        return null;
    }

    public void startActivityForResult(Intent intent, int i) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && (activity = (actionBarLayout = (ActionBarLayout) tk5Var).R0) != null) {
            if (actionBarLayout.a0) {
                AnimatorSet animatorSet = actionBarLayout.L;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    actionBarLayout.L = null;
                }
                if (actionBarLayout.F0 != null) {
                    actionBarLayout.I();
                } else if (actionBarLayout.G0 != null) {
                    actionBarLayout.L();
                }
                actionBarLayout.s.invalidate();
            }
            if (intent != null) {
                activity.startActivityForResult(intent, i);
            }
        }
    }

    public void updateSheetsVisibility() {
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                ah0 ah0Var = this.sheetsStack.get(i);
                boolean z = true;
                if (i != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z = false;
                }
                ah0Var.b(z);
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

    public void removeSelfFromStack() {
        removeSelfFromStack(false);
    }

    public void addThemeColorKeys(HashSet<Integer> hashSet) {
    }

    public void onBottomSheetCreated() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public void onFragmentClosed() {
    }

    public void onLowMemory() {
    }

    public void onPanTransitionEnd() {
    }

    public void onPanTransitionStart() {
    }

    public void onPanTranslationUpdate(float f) {
    }

    public void onPreviewOpenAnimationEnd() {
    }

    public void onThemeColorsChanged() {
    }

    public void onUserLeaveHint() {
    }

    public void restoreSelfArgs(Bundle bundle) {
    }

    public void saveKeyboardPositionBeforeTransition() {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setPreviewOpenedProgress(float f) {
    }

    public void setPreviewReplaceProgress(float f) {
    }

    public boolean finishFragment(boolean z) {
        tk5 tk5Var;
        if (this.isFinished || (tk5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) tk5Var).j(z, false);
        return true;
    }

    public boolean presentFragment(d dVar, boolean z) {
        tk5 tk5Var;
        return allowPresentFragment() && (tk5Var = this.parentLayout) != null && ((ActionBarLayout) tk5Var).T(dVar, z);
    }

    public boolean presentFragment(d dVar) {
        tk5 tk5Var;
        return allowPresentFragment() && (tk5Var = this.parentLayout) != null && ((ActionBarLayout) tk5Var).S(dVar);
    }

    public boolean presentFragment(qk5 qk5Var) {
        tk5 tk5Var;
        return allowPresentFragment() && (tk5Var = this.parentLayout) != null && ((ActionBarLayout) tk5Var).R(qk5Var);
    }

    public void onSlideProgress(boolean z, float f) {
    }

    public void onTransitionAnimationProgress(boolean z, float f) {
    }

    public void prepareFragmentToSlide(boolean z, boolean z2) {
    }

    public void onActivityResultFragment(int i, int i2, Intent intent) {
    }

    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
    }

    public oab getOrCreateStoryViewer() {
        ArrayList<ah0> arrayList = this.sheetsStack;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.sheetsStack = arrayList;
        }
        oab oabVar = (arrayList.isEmpty() || !(b10.f(1, this.sheetsStack) instanceof oab)) ? null : (oab) b10.f(1, this.sheetsStack);
        if (oabVar == null) {
            oabVar = new oab(this);
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && ((ActionBarLayout) tk5Var).b) {
                oabVar.r1 = true;
            }
            this.sheetsStack.add(oabVar);
            updateSheetsVisibility();
        }
        return oabVar;
    }

    public tk5[] showAsSheet(d dVar) {
        return showAsSheet(dVar, null);
    }

    public Dialog showDialog(Dialog dialog, DialogInterface.OnDismissListener onDismissListener) {
        return showDialog(dialog, false, onDismissListener);
    }

    public Dialog showDialog(Dialog dialog) {
        return showDialog(dialog, false, null);
    }

    public void onInsets(int i, int i2, int i3, int i4) {
    }
}
