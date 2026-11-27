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
public abstract class e {
    protected a actionBar;
    protected Bundle arguments;
    private int bottomInset;
    private r11 bulletinDelegate;
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
    protected wk5 parentLayout;
    private cg0 previewDelegate;
    private boolean removingFromStack;
    protected vnb resourceProvider;
    public ArrayList<ag0> sheetsStack;
    protected jla simpleActionBar;
    private eg0 simpleGlass;
    private ula simpleMenuOverlay;
    private e simpleMenuOverlayHost;
    public Dialog visibleDialog;
    protected int currentAccount = yac.t0;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final vy4 glassEngine = new vy4();
    private final vnb themedColors = new gd(this, (byte) 1);
    protected mq5 mSystemInsets = mq5.e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public e(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new zf0(this, (byte) 0));
    }

    public static boolean hasFullyVisibleSheets(e eVar) {
        s24 v;
        if (eVar != null) {
            if (!eVar.hasShownFullyVisibleSheet()) {
                if ((eVar.getParentLayout() instanceof ActionBarLayout) && (v = ((ActionBarLayout) eVar.getParentLayout()).v()) != null && v.hasShownFullyVisibleSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean hasSheets(e eVar) {
        s24 v;
        if (eVar != null) {
            if (!eVar.hasShownSheet()) {
                if ((eVar.getParentLayout() instanceof ActionBarLayout) && (v = ((ActionBarLayout) eVar.getParentLayout()).v()) != null && v.hasShownSheet()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean W(MotionEvent motionEvent, boolean z) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(ag0 ag0Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        lcb lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.w0 = ag0Var;
            ag0Var.n(new x58(lastStoryViewer, (byte) 3));
        }
        this.sheetsStack.add(ag0Var);
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
                ag0 ag0Var = this.sheetsStack.get(i);
                if (ag0Var != null && ag0Var.z()) {
                    hl.B2(ag0Var.d());
                    bVar.addView(ag0Var.d());
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
        ArrayList<ag0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.sheetsStack.size() - 1;
            while (true) {
                ArrayList<ag0> arrayList2 = this.sheetsStack;
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
                    cc4.g(e, true);
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
                    cc4.g(e2, true);
                }
            }
            this.actionBar = null;
        }
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            hl.B2(jlaVar);
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
        ula ulaVar = this.simpleMenuOverlay;
        if (ulaVar != null && ulaVar.I) {
            if (z) {
                ulaVar.a(true);
            }
            return true;
        }
        return false;
    }

    public boolean closeSheet() {
        ArrayList<ag0> arrayList = this.sheetsStack;
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
        wk5 wk5Var;
        a aVar = new a(context, getResourceProvider());
        yob.h(aob.s8, this.themedColors, aVar);
        yob.l(aVar, 3, aob.t8, this.themedColors);
        yob.a(aVar, aob.z8, this.themedColors, true);
        yob.l(aVar, 1, aob.v8, this.themedColors);
        yob.b(aVar, aob.y8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((wk5Var = this.parentLayout) == null || !((ActionBarLayout) wk5Var).T0)) {
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
            if ((getLastSheet() instanceof tw) && getLastSheet().s()) {
                return ((tw) getLastSheet()).L;
            }
            wk5 wk5Var = this.parentLayout;
            if ((wk5Var instanceof ActionBarLayout) && ((ActionBarLayout) wk5Var).v() != null && (((ActionBarLayout) this.parentLayout).v().getLastSheet() instanceof tw)) {
                tw twVar = (tw) ((ActionBarLayout) this.parentLayout).v().getLastSheet();
                if (twVar.s()) {
                    return twVar.L;
                }
            }
        }
        o oVar = new o(this);
        tw twVar2 = oVar.L;
        addSheet(twVar2);
        tx0.a(twVar2);
        return oVar;
    }

    public lcb createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        lcb lcbVar = new lcb(this);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).b) {
            lcbVar.r1 = true;
        }
        this.sheetsStack.add(lcbVar);
        updateSheetsVisibility();
        return lcbVar;
    }

    public jla createSimpleActionBar(Context context) {
        wk5 wk5Var;
        jla jlaVar = new jla(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((wk5Var = this.parentLayout) == null || !((ActionBarLayout) wk5Var).T0)) {
            return jlaVar;
        }
        jlaVar.setOccupyStatusBar(false);
        return jlaVar;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                ag0 ag0Var = this.sheetsStack.get(i);
                if (ag0Var != null && ag0Var.z()) {
                    hl.B2(ag0Var.d());
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
            cc4.g(e, true);
        }
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return true;
    }

    public boolean drawEdgeNavigationBar() {
        return isSupportEdgeToEdge();
    }

    public void dumpCanvas() {
        Typeface typeface = hl.a;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        cg0 cg0Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (cg0Var = this.previewDelegate) != null) {
            ((li3) ((ye9) cg0Var).b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null) {
            ((ActionBarLayout) wk5Var).t();
        }
    }

    public k5 getAccountInstance() {
        return k5.a(this.currentAccount);
    }

    public a getActionBar() {
        return this.actionBar;
    }

    public Bundle getArguments() {
        return this.arguments;
    }

    public o getArticleViewer() {
        if ((getLastSheet() instanceof tw) && getLastSheet().s()) {
            return ((tw) getLastSheet()).L;
        }
        wk5 wk5Var = this.parentLayout;
        if ((wk5Var instanceof ActionBarLayout) && ((ActionBarLayout) wk5Var).v() != null && (((ActionBarLayout) this.parentLayout).v().getLastSheet() instanceof tw)) {
            tw twVar = (tw) ((ActionBarLayout) this.parentLayout).v().getLastSheet();
            if (twVar.s()) {
                return twVar.L;
            }
            return null;
        }
        return null;
    }

    public rk5 getBackButtonState() {
        a aVar = this.actionBar;
        if (aVar != null) {
            return aVar.getBackButtonState();
        }
        return null;
    }

    public eg0 getBaseSimpleGlass() {
        eg0 eg0Var = this.simpleGlass;
        if (eg0Var == null) {
            eg0 eg0Var2 = new eg0(this.glassEngine, new i6(this, (byte) 4));
            this.simpleGlass = eg0Var2;
            return eg0Var2;
        }
        return eg0Var;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public r11 getBulletinDelegate() {
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

    public lv2 getContactsController() {
        return lv2.r(getAccountInstance().a);
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

    public lq3 getDownloadController() {
        return lq3.q(getAccountInstance().a);
    }

    public jt3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return jt3.b;
        }
        return jt3.a;
    }

    public xb4 getFileLoader() {
        return xb4.G(getAccountInstance().a);
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public e getFragmentForAlert(int i) {
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && wk5Var.getFragmentStack().size() > i + 1) {
            return (e) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public ov4 getGiftAuctionsController() {
        return ov4.c(getAccountInstance().a);
    }

    public boolean getInPassivePreviewMode() {
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) wk5Var;
            if ((actionBarLayout.h && actionBarLayout.K == null) || actionBarLayout.b0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public ag0 getLastSheet() {
        ArrayList<ag0> arrayList = this.sheetsStack;
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

    public lcb getLastStoryViewer() {
        ArrayList<ag0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof lcb) && this.sheetsStack.get(size).s()) {
                    return (lcb) this.sheetsStack.get(size);
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

    public d79 getListViewForSimpleGlass() {
        return null;
    }

    public id6 getLocationController() {
        return id6.f(getAccountInstance().a);
    }

    public MediaController getMediaController() {
        return MediaController.z();
    }

    public ls6 getMediaDataController() {
        return ls6.d0(getAccountInstance().a);
    }

    public uc7 getMessagesController() {
        return uc7.s1(getAccountInstance().a);
    }

    public jf7 getMessagesStorage() {
        return jf7.Y(getAccountInstance().a);
    }

    public int getNavigationBarColor() {
        int v0 = aob.v0(aob.a7, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                ag0 ag0Var = this.sheetsStack.get(i);
                if (ag0Var.z()) {
                    v0 = ag0Var.e(v0);
                }
            }
        }
        return v0;
    }

    public jn7 getNotificationCenter() {
        return jn7.f(getAccountInstance().a);
    }

    public ip7 getNotificationsController() {
        return ip7.n(getAccountInstance().a);
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().d();
    }

    public lcb getOrCreateStoryViewer(int i) {
        lcb lcbVar;
        ArrayList<ag0> arrayList = this.sheetsStack;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.sheetsStack = arrayList;
        }
        lcb lcbVar2 = null;
        if (!arrayList.isEmpty() && (c00.g(1, this.sheetsStack) instanceof lcb)) {
            lcbVar = (lcb) c00.g(1, this.sheetsStack);
        } else {
            lcbVar = null;
        }
        if (lcbVar != null && lcbVar.h != i) {
            lcbVar.o(true);
            removeSheet(lcbVar);
        } else {
            lcbVar2 = lcbVar;
        }
        if (lcbVar2 == null) {
            lcb lcbVar3 = new lcb(this);
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && ((ActionBarLayout) wk5Var).b) {
                lcbVar3.r1 = true;
            }
            this.sheetsStack.add(lcbVar3);
            updateSheetsVisibility();
            return lcbVar3;
        }
        return lcbVar2;
    }

    public Activity getParentActivity() {
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null) {
            return wk5Var.getParentActivity();
        }
        return null;
    }

    public wk5 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public vnb getResourceProvider() {
        return this.resourceProvider;
    }

    public ny9 getScrollViewForSimpleGlass() {
        return null;
    }

    public wx9 getSecretChatHelper() {
        return wx9.i(getAccountInstance().a);
    }

    public r7a getSendMessagesHelper() {
        return r7a.B(getAccountInstance().a);
    }

    public jla getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public ula getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        e eVar = this.simpleMenuOverlayHost;
        if (eVar != null && eVar.fragmentView != null) {
            return eVar.getSimpleMenuOverlay();
        }
        View view = this.fragmentView;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            jla jlaVar = this.simpleActionBar;
            if (jlaVar != null && (jlaVar.getParent() instanceof FrameLayout)) {
                viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            } else {
                return null;
            }
        }
        ula ulaVar = this.simpleMenuOverlay;
        if (ulaVar == null || ulaVar.getParent() != viewGroup) {
            ula ulaVar2 = this.simpleMenuOverlay;
            if (ulaVar2 != null) {
                ulaVar2.a(false);
                hl.B2(this.simpleMenuOverlay);
            }
            ula ulaVar3 = new ula(viewGroup.getContext());
            this.simpleMenuOverlay = ulaVar3;
            viewGroup.addView(ulaVar3, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.simpleMenuOverlay;
    }

    public ArrayList<apb> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i) {
        return aob.v0(i, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return aob.P0(str);
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
        return aob.T0(str);
    }

    public yac getUserConfig() {
        return yac.h(getAccountInstance().a);
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
        ArrayList<ag0> arrayList = this.sheetsStack;
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
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && wk5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int w0;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || aob.B0().o()) {
                vnb resourceProvider = getResourceProvider();
                int i = aob.s8;
                a aVar = this.actionBar;
                if (aVar != null && aVar.z()) {
                    i = aob.w8;
                } else if (this.simpleActionBar != null) {
                    i = aob.a7;
                }
                if (resourceProvider != null) {
                    w0 = resourceProvider.f(i);
                } else {
                    w0 = aob.w0(null, i, true);
                }
                if (vm2.h(w0) <= 0.699999988079071d) {
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
                ag0 ag0Var = this.sheetsStack.get(i);
                if ((ag0Var instanceof lcb) && view == ((lcb) ag0Var).s) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.e.movePreviewFragment(float):void");
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
                jla jlaVar = this.simpleActionBar;
                if (jlaVar != null) {
                    title = jlaVar.getTitle();
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
            cc4.g(e, true);
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.E0 = false;
            aVar.S();
            s6 s6Var = aVar.F;
            if (s6Var != null) {
                int childCount = s6Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = s6Var.getChildAt(i);
                    if (childAt instanceof s7) {
                        ((s7) childAt).p();
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
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !hl.O1() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (aob.w0(null, aob.s8, false) == -1) {
                z = true;
            } else {
                z = false;
            }
            hl.k3(parentActivity, z);
        }
        ArrayList<ag0> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ag0 ag0Var = this.sheetsStack.get(size);
                ag0Var.b(false);
                ag0Var.a(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public l2d onInsetsInternal(View view, l2d l2dVar) {
        int i;
        int i2 = 0;
        mq5 H0 = hl.H0(l2dVar, false);
        this.mSystemInsets = H0;
        ViewGroup viewGroup = this.listViewForSimpleGlass;
        if (viewGroup != null) {
            jla jlaVar = this.simpleActionBar;
            if (jlaVar != null && jlaVar.getOccupyStatusBar()) {
                i = Math.max(this.mSystemInsets.b, hl.m);
            } else {
                i = this.mSystemInsets.b;
            }
            eg0.g(viewGroup, i, this.mSystemInsets.d, a.getCurrentActionBarHeight(), 0);
        }
        if (this.navigationBarFadeView != null) {
            if (this.mSystemInsets.d < hl.L(40.0f)) {
                i2 = 8;
            }
            this.navigationBarFadeView.getLayoutParams().height = this.mSystemInsets.d;
            this.navigationBarFadeView.setVisibility(i2);
        }
        int i3 = H0.a;
        int i4 = H0.b;
        int i5 = H0.c;
        int i6 = H0.d;
        this.bottomInset = i6;
        onInsets(i3, i4, i5, i6);
        return l2d.b;
    }

    public void onPause() {
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.E0 = false;
            aVar.S();
            s6 s6Var = aVar.F;
            if (s6Var != null) {
                int childCount = s6Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = s6Var.getChildAt(i);
                    if (childAt instanceof s7) {
                        ((s7) childAt).p();
                    }
                }
            }
        }
        ula ulaVar = this.simpleMenuOverlay;
        if (ulaVar != null) {
            ulaVar.a(false);
        }
        this.isPaused = true;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing() && dismissDialogOnPause(this.visibleDialog)) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (getLastStoryViewer() != null) {
            lcb lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.s1 = true;
            kcb kcbVar = lastStoryViewer.A0;
            if (kcbVar != null) {
                kcbVar.release(null);
                lastStoryViewer.A0 = null;
            }
            if (!ba6.a(lastStoryViewer.B0)) {
                x96 x96Var = lastStoryViewer.E0;
                if (x96Var != null) {
                    x96Var.e(0L, null);
                }
                w96 w96Var = lastStoryViewer.B0;
                if (w96Var != null) {
                    if (w96Var.n) {
                        w96Var.d();
                    } else {
                        w96Var.h();
                    }
                    lastStoryViewer.B0 = null;
                }
            }
            g6b g6bVar = lastStoryViewer.u1;
            if (g6bVar != null) {
                g6bVar.b();
            }
            getLastStoryViewer().U();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<ag0> arrayList = this.sheetsStack;
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
            lcb lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.s1 = false;
            if (!o.u().W && lastStoryViewer.w() != null) {
                lastStoryViewer.w().c1(false);
            }
            g6b g6bVar = lastStoryViewer.u1;
            if (g6bVar != null) {
                g6bVar.a(false);
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
        d79 d79Var;
        int i;
        View createView = createView(context);
        d79 listViewForSimpleGlass = getListViewForSimpleGlass();
        ny9 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            d79Var = listViewForSimpleGlass;
        } else {
            d79Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = d79Var;
        if (d79Var != null && (createView instanceof FrameLayout)) {
            eg0 baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.h((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                vnb vnbVar = this.resourceProvider;
                baseSimpleGlass.m = frameLayout;
                baseSimpleGlass.n = scrollViewForSimpleGlass;
                baseSimpleGlass.o = new dg0(scrollViewForSimpleGlass, frameLayout, (byte) 0);
                vy4 vy4Var = baseSimpleGlass.a;
                vy4Var.getClass();
                scrollViewForSimpleGlass.M.add(new py4(vy4Var, scrollViewForSimpleGlass));
                qy4 qy4Var = new qy4(vy4Var);
                ArrayList arrayList = scrollViewForSimpleGlass.K;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    scrollViewForSimpleGlass.K = arrayList;
                }
                if (!arrayList.contains(qy4Var)) {
                    scrollViewForSimpleGlass.K.add(qy4Var);
                }
                scrollViewForSimpleGlass.setClipToPadding(false);
                baseSimpleGlass.j(frameLayout, view, vnbVar);
            }
            if (useFadeDrawableForActionBar() && view != null) {
                view.setBackground(baseSimpleGlass.a(view));
            }
            ViewGroup viewGroup = this.listViewForSimpleGlass;
            jla jlaVar = this.simpleActionBar;
            if (jlaVar != null && jlaVar.getOccupyStatusBar()) {
                i = Math.max(this.mSystemInsets.b, hl.m);
            } else {
                i = this.mSystemInsets.b;
            }
            eg0.g(viewGroup, i, this.mSystemInsets.d, a.getCurrentActionBarHeight(), 0);
            if (drawEdgeNavigationBar()) {
                View view2 = new View(context);
                this.navigationBarFadeView = view2;
                view2.setBackground(baseSimpleGlass.b(view2));
                FrameLayout.LayoutParams e = tre.e(-1, 0, 80);
                e.height = this.mSystemInsets.d;
                ((FrameLayout) createView).addView(this.navigationBarFadeView, e);
            }
        }
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(e eVar, boolean z, boolean z2) {
        wk5 wk5Var;
        if (allowPresentFragment() && (wk5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) wk5Var;
            actionBarLayout.getClass();
            tk5 tk5Var = new tk5(eVar);
            tk5Var.b = z;
            tk5Var.c = z2;
            tk5Var.d = true;
            tk5Var.e = false;
            tk5Var.f = null;
            if (actionBarLayout.R(tk5Var)) {
                return true;
            }
        }
        return false;
    }

    public boolean presentFragmentAsPreview(e eVar) {
        wk5 wk5Var;
        if (allowPresentFragment() && (wk5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) wk5Var;
            actionBarLayout.getClass();
            tk5 tk5Var = new tk5(eVar);
            tk5Var.e = true;
            if (actionBarLayout.R(tk5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(e eVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        wk5 wk5Var;
        if (allowPresentFragment() && (wk5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) wk5Var;
            actionBarLayout.getClass();
            tk5 tk5Var = new tk5(eVar);
            tk5Var.e = true;
            tk5Var.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.R(tk5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack(boolean z) {
        wk5 wk5Var;
        if (!this.isFinished && (wk5Var = this.parentLayout) != null) {
            Dialog dialog = this.parentDialog;
            if (dialog != null) {
                dialog.dismiss();
            } else {
                ((ActionBarLayout) wk5Var).c0(this, z);
            }
        }
    }

    public void removeSheet(ag0 ag0Var) {
        ArrayList<ag0> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(ag0Var);
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
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) wk5Var;
            actionBarLayout.Y0 = true;
            Runnable runnable = actionBarLayout.e;
            if (runnable != null && actionBarLayout.d == null) {
                hl.r(runnable);
                actionBarLayout.e.run();
                actionBarLayout.e = null;
            }
        }
    }

    public void setBulletinDelegate(r11 r11Var) {
        this.bulletinDelegate = r11Var;
    }

    public void setCurrentAccount(int i) {
        if (this.fragmentView == null) {
            this.currentAccount = i;
        } else {
            grb.i("trying to set current account when fragment UI already created");
        }
    }

    public void setFinishing(boolean z) {
        this.finishing = z;
    }

    public void setFragmentPanTranslationOffset(int i) {
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null) {
            wk5Var.setFragmentPanTranslationOffset(i);
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
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i) {
        if (this.sheetsStack != null) {
            for (int i2 = 0; i2 < this.sheetsStack.size(); i2++) {
                ag0 ag0Var = this.sheetsStack.get(i2);
                if (ag0Var != null) {
                    ag0Var.g(i);
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
            if (hl.B(i) >= 0.721f) {
                z = true;
            } else {
                z = false;
            }
            hl.h3(parentActivity, z);
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null) {
                wk5Var.setNavigationBarColor(i);
            }
        }
    }

    public void setParentActivityTitle(CharSequence charSequence) {
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            parentActivity.setTitle(charSequence);
        }
    }

    public void setParentFragment(e eVar) {
        setParentLayout(eVar.parentLayout);
        this.fragmentView = createView(this.parentLayout.getView().getContext());
    }

    public void setParentGlass(RectF rectF, Runnable runnable) {
        if (this.simpleGlass != null) {
            vy4 vy4Var = this.glassEngine;
            RectF rectF2 = vy4Var.e;
            if (rectF == null) {
                if (!rectF2.isEmpty()) {
                    rectF2.setEmpty();
                    vy4Var.f = true;
                }
            } else if (!rectF2.equals(rectF)) {
                rectF2.set(rectF);
                vy4Var.f = true;
            }
            this.simpleGlass.j = runnable;
        }
    }

    public void setParentLayout(wk5 wk5Var) {
        boolean z;
        wk5 wk5Var2;
        boolean z2;
        ViewGroup viewGroup;
        if (this.parentLayout != wk5Var) {
            this.parentLayout = wk5Var;
            if (wk5Var != null && ((ActionBarLayout) wk5Var).f) {
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
                        cc4.g(e, true);
                    }
                }
                wk5 wk5Var3 = this.parentLayout;
                if (wk5Var3 != null && wk5Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                wk5 wk5Var4 = this.parentLayout;
                if (wk5Var4 != null && wk5Var4.getView().getContext() != this.actionBar.getContext()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a aVar = this.actionBar;
                if ((aVar.L || z2) && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                }
                if (z2) {
                    this.actionBar = null;
                }
            }
            if (this.simpleActionBar != null && (wk5Var2 = this.parentLayout) != null && wk5Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                hl.B2(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    jla createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new yf0(this, (byte) 0));
                    return;
                }
                return;
            }
            wk5 wk5Var5 = this.parentLayout;
            if (wk5Var5 != null && this.actionBar == null) {
                a createActionBar = createActionBar(wk5Var5.getView().getContext());
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

    public void setPreviewDelegate(cg0 cg0Var) {
        this.previewDelegate = cg0Var;
    }

    public void setRemovingFromStack(boolean z) {
        this.removingFromStack = z;
    }

    public void setResourceProvider(vnb vnbVar) {
        this.resourceProvider = vnbVar;
    }

    public void setSimpleMenuOverlayHost(e eVar) {
        this.simpleMenuOverlayHost = eVar;
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

    public void setupBulletinGlass(v21 v21Var) {
        float f;
        z11 z11Var = v21Var.e;
        if (this.simpleGlass != null && this.fragmentView != null && z11Var != null && z11Var.canHaveGlassBackground()) {
            final jl0 c = this.simpleGlass.c.c(z11Var, null, false);
            c.p(dtd.c(getResourceProvider()));
            if (v21Var.l) {
                f = 24.0f;
            } else {
                f = 16.0f;
            }
            c.r(hl.L(f));
            z11Var.setGlassBackground(c, new Runnable() {
                @Override
                public final void run() {
                    vy4 vy4Var = e.this.glassEngine;
                    ArrayList arrayList = vy4Var.c;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (((uy4) arrayList.get(size)).b == c && ((uy4) arrayList.remove(size)).i) {
                            vy4Var.f = true;
                        }
                    }
                }
            });
        }
    }

    public boolean shouldOverrideSlideTransition(boolean z, boolean z2) {
        return false;
    }

    public wk5[] showAsSheet(e eVar, bg0 bg0Var) {
        if (getParentActivity() == null) {
            return null;
        }
        wk5[] wk5VarArr = {new qk5(getParentActivity(), new m0(r7, (byte) 28))};
        wk5VarArr[0].setIsSheet(true);
        LaunchActivity.H1.Q.add(wk5VarArr[0]);
        eVar.onTransitionAnimationStart(true, false);
        d dVar = new d(getParentActivity(), eVar.getResourceProvider(), bg0Var, wk5VarArr, eVar, r7);
        nx0[] nx0VarArr = {dVar};
        if (bg0Var != null) {
            dVar.r0(false);
            nx0VarArr[0].V0 = bg0Var.a;
        }
        nx0 nx0Var = nx0VarArr[0];
        eVar.parentDialog = nx0Var;
        nx0Var.S0 = true;
        nx0Var.show();
        return wk5VarArr;
    }

    public Dialog showDialog(Dialog dialog, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        wk5 wk5Var;
        if (dialog != null && (wk5Var = this.parentLayout) != null && !((ActionBarLayout) wk5Var).z()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.R && (z || !actionBarLayout.h())) {
                ArrayList<ag0> arrayList = this.sheetsStack;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (this.sheetsStack.get(size).s() && this.sheetsStack.get(size).u(dialog)) {
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
                    cc4.g(e, true);
                }
                try {
                    this.visibleDialog = dialog;
                    dialog.setCanceledOnTouchOutside(true);
                    this.visibleDialog.setOnDismissListener(new gf(this, onDismissListener, (byte) 2));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
        }
        return null;
    }

    public void startActivityForResult(Intent intent, int i) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && (activity = (actionBarLayout = (ActionBarLayout) wk5Var).R0) != null) {
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
                ag0 ag0Var = this.sheetsStack.get(i);
                boolean z = true;
                if (i != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z = false;
                }
                ag0Var.b(z);
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

    public void addThemeColorKeys(HashSet<Integer> hashSet) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public void onPanTranslationUpdate(float f) {
    }

    public void restoreSelfArgs(Bundle bundle) {
    }

    public void saveSelfArgs(Bundle bundle) {
    }

    public void setPreviewOpenedProgress(float f) {
    }

    public void setPreviewReplaceProgress(float f) {
    }

    public boolean finishFragment(boolean z) {
        wk5 wk5Var;
        if (this.isFinished || (wk5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) wk5Var).j(z, false);
        return true;
    }

    public boolean presentFragment(e eVar, boolean z) {
        wk5 wk5Var;
        return allowPresentFragment() && (wk5Var = this.parentLayout) != null && ((ActionBarLayout) wk5Var).T(eVar, z);
    }

    public boolean presentFragment(e eVar) {
        wk5 wk5Var;
        return allowPresentFragment() && (wk5Var = this.parentLayout) != null && ((ActionBarLayout) wk5Var).S(eVar);
    }

    public boolean presentFragment(tk5 tk5Var) {
        wk5 wk5Var;
        return allowPresentFragment() && (wk5Var = this.parentLayout) != null && ((ActionBarLayout) wk5Var).R(tk5Var);
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

    public lcb getOrCreateStoryViewer() {
        ArrayList<ag0> arrayList = this.sheetsStack;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.sheetsStack = arrayList;
        }
        lcb lcbVar = (arrayList.isEmpty() || !(c00.g(1, this.sheetsStack) instanceof lcb)) ? null : (lcb) c00.g(1, this.sheetsStack);
        if (lcbVar == null) {
            lcbVar = new lcb(this);
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && ((ActionBarLayout) wk5Var).b) {
                lcbVar.r1 = true;
            }
            this.sheetsStack.add(lcbVar);
            updateSheetsVisibility();
        }
        return lcbVar;
    }

    public wk5[] showAsSheet(e eVar) {
        return showAsSheet(eVar, null);
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
