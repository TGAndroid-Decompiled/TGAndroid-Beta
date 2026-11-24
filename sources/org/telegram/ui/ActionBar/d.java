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
    private i11 bulletinDelegate;
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
    protected ui5 parentLayout;
    private bg0 previewDelegate;
    private boolean removingFromStack;
    protected wjb resourceProvider;
    public ArrayList<zf0> sheetsStack;
    protected pha simpleActionBar;
    private dg0 simpleGlass;
    private zha simpleMenuOverlay;
    private d simpleMenuOverlayHost;
    public Dialog visibleDialog;
    protected int currentAccount = y6c.t0;
    protected boolean hasOwnBackground = false;
    protected boolean isPaused = true;
    protected boolean inTransitionAnimation = false;
    protected final qw4 glassEngine = new qw4();
    private final wjb themedColors = new fd(this, (byte) 1);
    protected io5 mSystemInsets = io5.e;
    protected int classGuid = ConnectionsManager.generateClassGuid();

    public d(Bundle bundle) {
        this.arguments = bundle;
        setBulletinDelegate(new xf0(this, (byte) 0));
    }

    public static boolean hasFullyVisibleSheets(d dVar) {
        x14 v;
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
        x14 v;
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

    public boolean W(MotionEvent motionEvent, boolean z) {
        return isSwipeBackEnabled(motionEvent);
    }

    public void addSheet(zf0 zf0Var) {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        m8b lastStoryViewer = getLastStoryViewer();
        if (lastStoryViewer != null) {
            lastStoryViewer.w0 = zf0Var;
            zf0Var.n(new g28(lastStoryViewer, (byte) 3));
        }
        this.sheetsStack.add(zf0Var);
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
                zf0 zf0Var = this.sheetsStack.get(i);
                if (zf0Var != null && zf0Var.z()) {
                    gl.B2(zf0Var.d());
                    bVar.addView(zf0Var.d());
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
        ArrayList<zf0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.sheetsStack.size() - 1;
            while (true) {
                ArrayList<zf0> arrayList2 = this.sheetsStack;
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
                    fa4.g(e, true);
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
                    fa4.g(e2, true);
                }
            }
            this.actionBar = null;
        }
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            gl.B2(phaVar);
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
        zha zhaVar = this.simpleMenuOverlay;
        if (zhaVar != null && zhaVar.I) {
            if (z) {
                zhaVar.a(true);
            }
            return true;
        }
        return false;
    }

    public boolean closeSheet() {
        ArrayList<zf0> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).t()) {
                    this.sheetsStack.get(size).q();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public a createActionBar(Context context) {
        ui5 ui5Var;
        a aVar = new a(context, getResourceProvider());
        zkb.h(bkb.r8, this.themedColors, aVar);
        zkb.l(aVar, 3, bkb.s8, this.themedColors);
        zkb.a(aVar, bkb.y8, this.themedColors, true);
        zkb.l(aVar, 1, bkb.u8, this.themedColors);
        zkb.b(aVar, bkb.x8, this.themedColors, true);
        if (!this.inPreviewMode && !this.inBubbleMode && ((ui5Var = this.parentLayout) == null || !((ActionBarLayout) ui5Var).T0)) {
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
            if ((getLastSheet() instanceof sw) && getLastSheet().t()) {
                return ((sw) getLastSheet()).L;
            }
            ui5 ui5Var = this.parentLayout;
            if ((ui5Var instanceof ActionBarLayout) && ((ActionBarLayout) ui5Var).v() != null && (((ActionBarLayout) this.parentLayout).v().getLastSheet() instanceof sw)) {
                sw swVar = (sw) ((ActionBarLayout) this.parentLayout).v().getLastSheet();
                if (swVar.t()) {
                    return swVar.L;
                }
            }
        }
        o oVar = new o(this);
        sw swVar2 = oVar.L;
        addSheet(swVar2);
        lx0.a(swVar2);
        return oVar;
    }

    public m8b createOverlayStoryViewer() {
        if (this.sheetsStack == null) {
            this.sheetsStack = new ArrayList<>();
        }
        m8b m8bVar = new m8b(this);
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).b) {
            m8bVar.r1 = true;
        }
        this.sheetsStack.add(m8bVar);
        updateSheetsVisibility();
        return m8bVar;
    }

    public pha createSimpleActionBar(Context context) {
        ui5 ui5Var;
        pha phaVar = new pha(context, getResourceProvider());
        if (!this.inPreviewMode && !this.inBubbleMode && ((ui5Var = this.parentLayout) == null || !((ActionBarLayout) ui5Var).T0)) {
            return phaVar;
        }
        phaVar.setOccupyStatusBar(false);
        return phaVar;
    }

    public View createView(Context context) {
        return null;
    }

    public void detachSheets() {
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                zf0 zf0Var = this.sheetsStack.get(i);
                if (zf0Var != null && zf0Var.z()) {
                    gl.B2(zf0Var.d());
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
            fa4.g(e, true);
        }
    }

    public boolean dismissDialogOnPause(Dialog dialog) {
        return true;
    }

    public boolean drawEdgeNavigationBar() {
        return isSupportEdgeToEdge();
    }

    public void dumpCanvas() {
        Typeface typeface = gl.a;
    }

    public boolean extendActionMode(Menu menu) {
        return false;
    }

    public void finishFragment() {
        bg0 bg0Var;
        Dialog dialog = this.parentDialog;
        if (dialog != null) {
            dialog.dismiss();
        } else if (this.inPreviewMode && (bg0Var = this.previewDelegate) != null) {
            ((rh3) ((wh9) bg0Var).b).a();
        } else {
            finishFragment(true);
        }
    }

    public void finishPreviewFragment() {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null) {
            ((ActionBarLayout) ui5Var).t();
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
        if ((getLastSheet() instanceof sw) && getLastSheet().t()) {
            return ((sw) getLastSheet()).L;
        }
        ui5 ui5Var = this.parentLayout;
        if ((ui5Var instanceof ActionBarLayout) && ((ActionBarLayout) ui5Var).v() != null && (((ActionBarLayout) this.parentLayout).v().getLastSheet() instanceof sw)) {
            sw swVar = (sw) ((ActionBarLayout) this.parentLayout).v().getLastSheet();
            if (swVar.t()) {
                return swVar.L;
            }
            return null;
        }
        return null;
    }

    public pi5 getBackButtonState() {
        a aVar = this.actionBar;
        if (aVar != null) {
            return aVar.getBackButtonState();
        }
        return null;
    }

    public dg0 getBaseSimpleGlass() {
        dg0 dg0Var = this.simpleGlass;
        if (dg0Var == null) {
            dg0 dg0Var2 = new dg0(this.glassEngine, new h6(this, (byte) 4));
            this.simpleGlass = dg0Var2;
            return dg0Var2;
        }
        return dg0Var;
    }

    public int getBottomInset() {
        return this.bottomInset;
    }

    public i11 getBulletinDelegate() {
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

    public qu2 getContactsController() {
        return qu2.r(getAccountInstance().a);
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

    public up3 getDownloadController() {
        return up3.q(getAccountInstance().a);
    }

    public rs3 getEdgeToEdgeSupportMode() {
        if (isSupportEdgeToEdge()) {
            return rs3.b;
        }
        return rs3.a;
    }

    public ba4 getFileLoader() {
        return ba4.G(getAccountInstance().a);
    }

    public boolean getFragmentBeginToShow() {
        return this.fragmentBeginToShow;
    }

    public d getFragmentForAlert(int i) {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ui5Var.getFragmentStack().size() > i + 1) {
            return (d) this.parentLayout.getFragmentStack().get((this.parentLayout.getFragmentStack().size() - 2) - i);
        }
        return this;
    }

    public View getFragmentView() {
        return this.fragmentView;
    }

    public kt4 getGiftAuctionsController() {
        return kt4.c(getAccountInstance().a);
    }

    public boolean getInPassivePreviewMode() {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) ui5Var;
            if ((actionBarLayout.h && actionBarLayout.K == null) || actionBarLayout.b0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public zf0 getLastSheet() {
        ArrayList<zf0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).t()) {
                    return this.sheetsStack.get(size);
                }
            }
            return null;
        }
        return null;
    }

    public m8b getLastStoryViewer() {
        ArrayList<zf0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if ((this.sheetsStack.get(size) instanceof m8b) && this.sheetsStack.get(size).t()) {
                    return (m8b) this.sheetsStack.get(size);
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

    public o39 getListViewForSimpleGlass() {
        return null;
    }

    public eb6 getLocationController() {
        return eb6.f(getAccountInstance().a);
    }

    public MediaController getMediaController() {
        return MediaController.w();
    }

    public hq6 getMediaDataController() {
        return hq6.d0(getAccountInstance().a);
    }

    public na7 getMessagesController() {
        return na7.q1(getAccountInstance().a);
    }

    public ad7 getMessagesStorage() {
        return ad7.Y(getAccountInstance().a);
    }

    public int getNavigationBarColor() {
        int v0 = bkb.v0(bkb.Z6, getResourceProvider());
        if (this.sheetsStack != null) {
            for (int i = 0; i < this.sheetsStack.size(); i++) {
                zf0 zf0Var = this.sheetsStack.get(i);
                if (zf0Var.z()) {
                    v0 = zf0Var.e(v0);
                }
            }
        }
        return v0;
    }

    public kk7 getNotificationCenter() {
        return kk7.f(getAccountInstance().a);
    }

    public im7 getNotificationsController() {
        return im7.n(getAccountInstance().a);
    }

    public SharedPreferences getNotificationsSettings() {
        return getAccountInstance().d();
    }

    public m8b getOrCreateStoryViewer(int i) {
        m8b m8bVar;
        ArrayList<zf0> arrayList = this.sheetsStack;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.sheetsStack = arrayList;
        }
        m8b m8bVar2 = null;
        if (!arrayList.isEmpty() && (b00.f(1, this.sheetsStack) instanceof m8b)) {
            m8bVar = (m8b) b00.f(1, this.sheetsStack);
        } else {
            m8bVar = null;
        }
        if (m8bVar != null && m8bVar.h != i) {
            m8bVar.o(true);
            removeSheet(m8bVar);
        } else {
            m8bVar2 = m8bVar;
        }
        if (m8bVar2 == null) {
            m8b m8bVar3 = new m8b(this);
            ui5 ui5Var = this.parentLayout;
            if (ui5Var != null && ((ActionBarLayout) ui5Var).b) {
                m8bVar3.r1 = true;
            }
            this.sheetsStack.add(m8bVar3);
            updateSheetsVisibility();
            return m8bVar3;
        }
        return m8bVar2;
    }

    public Activity getParentActivity() {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null) {
            return ui5Var.getParentActivity();
        }
        return null;
    }

    public ui5 getParentLayout() {
        return this.parentLayout;
    }

    public int getPreviewHeight() {
        return -1;
    }

    public wjb getResourceProvider() {
        return this.resourceProvider;
    }

    public tu9 getScrollViewForSimpleGlass() {
        return null;
    }

    public bu9 getSecretChatHelper() {
        return bu9.i(getAccountInstance().a);
    }

    public z3a getSendMessagesHelper() {
        return z3a.B(getAccountInstance().a);
    }

    public pha getSimpleActionBar() {
        return this.simpleActionBar;
    }

    public zha getSimpleMenuOverlay() {
        ViewGroup viewGroup;
        d dVar = this.simpleMenuOverlayHost;
        if (dVar != null && dVar.fragmentView != null) {
            return dVar.getSimpleMenuOverlay();
        }
        View view = this.fragmentView;
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        } else {
            pha phaVar = this.simpleActionBar;
            if (phaVar != null && (phaVar.getParent() instanceof FrameLayout)) {
                viewGroup = (ViewGroup) this.simpleActionBar.getParent();
            } else {
                return null;
            }
        }
        zha zhaVar = this.simpleMenuOverlay;
        if (zhaVar == null || zhaVar.getParent() != viewGroup) {
            zha zhaVar2 = this.simpleMenuOverlay;
            if (zhaVar2 != null) {
                zhaVar2.a(false);
                gl.B2(this.simpleMenuOverlay);
            }
            zha zhaVar3 = new zha(viewGroup.getContext());
            this.simpleMenuOverlay = zhaVar3;
            viewGroup.addView(zhaVar3, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.simpleMenuOverlay;
    }

    public ArrayList<blb> getThemeDescriptions() {
        return new ArrayList<>();
    }

    public int getThemedColor(int i) {
        return bkb.v0(i, getResourceProvider());
    }

    public Drawable getThemedDrawable(String str) {
        return bkb.P0(str);
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
        return bkb.T0(str);
    }

    public y6c getUserConfig() {
        return y6c.h(getAccountInstance().a);
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
        ArrayList<zf0> arrayList = this.sheetsStack;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasShownFullyVisibleSheet() {
        if (hasSheet()) {
            for (int size = this.sheetsStack.size() - 1; size >= 0; size--) {
                if (this.sheetsStack.get(size).t() && this.sheetsStack.get(size).h()) {
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
                if (this.sheetsStack.get(size).t()) {
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
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ui5Var.getLastFragment() == this) {
            return true;
        }
        return false;
    }

    public boolean isLightStatusBar() {
        int w0;
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            if (!hasForceLightStatusBar() || bkb.B0().o()) {
                wjb resourceProvider = getResourceProvider();
                int i = bkb.r8;
                a aVar = this.actionBar;
                if (aVar != null && aVar.y()) {
                    i = bkb.v8;
                } else if (this.simpleActionBar != null) {
                    i = bkb.Z6;
                }
                if (resourceProvider != null) {
                    w0 = resourceProvider.f(i);
                } else {
                    w0 = bkb.w0(null, i, true);
                }
                if (bm2.h(w0) <= 0.699999988079071d) {
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
                zf0 zf0Var = this.sheetsStack.get(i);
                if ((zf0Var instanceof m8b) && view == ((m8b) zf0Var).s) {
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
                pha phaVar = this.simpleActionBar;
                if (phaVar != null) {
                    title = phaVar.getTitle();
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
            fa4.g(e, true);
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
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.setEnabled(false);
        }
        if (hasForceLightStatusBar() && !gl.O1() && getParentLayout().getLastFragment() == this && getParentActivity() != null && !this.finishing) {
            Activity parentActivity = getParentActivity();
            if (bkb.w0(null, bkb.r8, false) == -1) {
                z = true;
            } else {
                z = false;
            }
            gl.l3(parentActivity, z);
        }
        ArrayList<zf0> arrayList = this.sheetsStack;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                zf0 zf0Var = this.sheetsStack.get(size);
                zf0Var.b(false);
                zf0Var.a(true);
                this.sheetsStack.remove(size);
            }
        }
    }

    public vxc onInsetsInternal(View view, vxc vxcVar) {
        int i = 0;
        io5 H0 = gl.H0(vxcVar, false);
        int i2 = H0.d;
        int i3 = H0.b;
        this.mSystemInsets = H0;
        ViewGroup viewGroup = this.listViewForSimpleGlass;
        if (viewGroup != null) {
            dg0.e(viewGroup, i3, i2, a.getCurrentActionBarHeight(), 0);
        }
        if (this.navigationBarFadeView != null) {
            if (this.mSystemInsets.d < gl.L(40.0f)) {
                i = 8;
            }
            this.navigationBarFadeView.getLayoutParams().height = this.mSystemInsets.d;
            this.navigationBarFadeView.setVisibility(i);
        }
        int i4 = H0.a;
        int i5 = H0.c;
        this.bottomInset = i2;
        onInsets(i4, i3, i5, i2);
        return vxc.b;
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
        zha zhaVar = this.simpleMenuOverlay;
        if (zhaVar != null) {
            zhaVar.a(false);
        }
        this.isPaused = true;
        try {
            Dialog dialog = this.visibleDialog;
            if (dialog != null && dialog.isShowing() && dismissDialogOnPause(this.visibleDialog)) {
                this.visibleDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (getLastStoryViewer() != null) {
            m8b lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.s1 = true;
            l8b l8bVar = lastStoryViewer.A0;
            if (l8bVar != null) {
                l8bVar.release(null);
                lastStoryViewer.A0 = null;
            }
            if (!x76.a(lastStoryViewer.B0)) {
                u76 u76Var = lastStoryViewer.E0;
                if (u76Var != null) {
                    u76Var.e(0L, null);
                }
                t76 t76Var = lastStoryViewer.B0;
                if (t76Var != null) {
                    if (t76Var.n) {
                        t76Var.d();
                    } else {
                        t76Var.h();
                    }
                    lastStoryViewer.B0 = null;
                }
            }
            k2b k2bVar = lastStoryViewer.u1;
            if (k2bVar != null) {
                k2bVar.b();
            }
            getLastStoryViewer().U();
        }
    }

    public void onRemoveFromParent() {
        ArrayList<zf0> arrayList = this.sheetsStack;
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
            m8b lastStoryViewer = getLastStoryViewer();
            lastStoryViewer.s1 = false;
            if (!o.u().W && lastStoryViewer.w() != null) {
                lastStoryViewer.w().c1(false);
            }
            k2b k2bVar = lastStoryViewer.u1;
            if (k2bVar != null) {
                k2bVar.a(false);
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
        o39 o39Var;
        View createView = createView(context);
        o39 listViewForSimpleGlass = getListViewForSimpleGlass();
        tu9 scrollViewForSimpleGlass = getScrollViewForSimpleGlass();
        if (listViewForSimpleGlass != null) {
            o39Var = listViewForSimpleGlass;
        } else {
            o39Var = scrollViewForSimpleGlass;
        }
        this.listViewForSimpleGlass = o39Var;
        if (o39Var != null && (createView instanceof FrameLayout)) {
            dg0 baseSimpleGlass = getBaseSimpleGlass();
            View view = this.simpleActionBar;
            if (view == null) {
                view = this.actionBar;
            }
            if (listViewForSimpleGlass != null) {
                baseSimpleGlass.f((FrameLayout) createView, listViewForSimpleGlass, view, this.resourceProvider);
            } else if (scrollViewForSimpleGlass != null) {
                FrameLayout frameLayout = (FrameLayout) createView;
                wjb wjbVar = this.resourceProvider;
                baseSimpleGlass.m = frameLayout;
                baseSimpleGlass.n = scrollViewForSimpleGlass;
                baseSimpleGlass.o = new cg0(scrollViewForSimpleGlass, frameLayout, (byte) 0);
                qw4 qw4Var = baseSimpleGlass.a;
                qw4Var.getClass();
                scrollViewForSimpleGlass.M.add(new kw4(qw4Var, scrollViewForSimpleGlass));
                lw4 lw4Var = new lw4(qw4Var);
                ArrayList arrayList = scrollViewForSimpleGlass.K;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    scrollViewForSimpleGlass.K = arrayList;
                }
                if (!arrayList.contains(lw4Var)) {
                    scrollViewForSimpleGlass.K.add(lw4Var);
                }
                scrollViewForSimpleGlass.setClipToPadding(false);
                baseSimpleGlass.g(frameLayout, view, wjbVar);
            }
            if (useFadeDrawableForActionBar() && view != null) {
                view.setBackground(baseSimpleGlass.a(view));
            }
            ViewGroup viewGroup = this.listViewForSimpleGlass;
            io5 io5Var = this.mSystemInsets;
            dg0.e(viewGroup, io5Var.b, io5Var.d, a.getCurrentActionBarHeight(), 0);
            if (drawEdgeNavigationBar()) {
                View view2 = new View(context);
                this.navigationBarFadeView = view2;
                view2.setBackground(baseSimpleGlass.b(view2));
                FrameLayout.LayoutParams e = nme.e(-1, 0, 80);
                e.height = this.mSystemInsets.d;
                ((FrameLayout) createView).addView(this.navigationBarFadeView, e);
            }
        }
        onViewCreated(createView);
        return createView;
    }

    public boolean presentFragment(d dVar, boolean z, boolean z2) {
        ui5 ui5Var;
        if (allowPresentFragment() && (ui5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) ui5Var;
            actionBarLayout.getClass();
            ri5 ri5Var = new ri5(dVar);
            ri5Var.b = z;
            ri5Var.c = z2;
            ri5Var.d = true;
            ri5Var.e = false;
            ri5Var.f = null;
            if (actionBarLayout.R(ri5Var)) {
                return true;
            }
        }
        return false;
    }

    public boolean presentFragmentAsPreview(d dVar) {
        ui5 ui5Var;
        if (allowPresentFragment() && (ui5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) ui5Var;
            actionBarLayout.getClass();
            ri5 ri5Var = new ri5(dVar);
            ri5Var.e = true;
            if (actionBarLayout.R(ri5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean presentFragmentAsPreviewWithMenu(d dVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        ui5 ui5Var;
        if (allowPresentFragment() && (ui5Var = this.parentLayout) != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) ui5Var;
            actionBarLayout.getClass();
            ri5 ri5Var = new ri5(dVar);
            ri5Var.e = true;
            ri5Var.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
            if (actionBarLayout.R(ri5Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void removeSelfFromStack(boolean z) {
        ui5 ui5Var;
        if (!this.isFinished && (ui5Var = this.parentLayout) != null) {
            Dialog dialog = this.parentDialog;
            if (dialog != null) {
                dialog.dismiss();
            } else {
                ((ActionBarLayout) ui5Var).c0(this, z);
            }
        }
    }

    public void removeSheet(zf0 zf0Var) {
        ArrayList<zf0> arrayList = this.sheetsStack;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(zf0Var);
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
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) ui5Var;
            actionBarLayout.Y0 = true;
            Runnable runnable = actionBarLayout.e;
            if (runnable != null && actionBarLayout.d == null) {
                gl.r(runnable);
                actionBarLayout.e.run();
                actionBarLayout.e = null;
            }
        }
    }

    public void setBulletinDelegate(i11 i11Var) {
        this.bulletinDelegate = i11Var;
    }

    public void setCurrentAccount(int i) {
        if (this.fragmentView == null) {
            this.currentAccount = i;
        } else {
            sc8.j("trying to set current account when fragment UI already created");
        }
    }

    public void setFinishing(boolean z) {
        this.finishing = z;
    }

    public void setFragmentPanTranslationOffset(int i) {
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null) {
            ui5Var.setFragmentPanTranslationOffset(i);
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
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.setOccupyStatusBar(!this.inPreviewMode);
        }
    }

    public void setKeyboardHeightFromParent(int i) {
        if (this.sheetsStack != null) {
            for (int i2 = 0; i2 < this.sheetsStack.size(); i2++) {
                zf0 zf0Var = this.sheetsStack.get(i2);
                if (zf0Var != null) {
                    zf0Var.g(i);
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
            if (gl.B(i) >= 0.721f) {
                z = true;
            } else {
                z = false;
            }
            gl.i3(parentActivity, z);
            ui5 ui5Var = this.parentLayout;
            if (ui5Var != null) {
                ui5Var.setNavigationBarColor(i);
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
            qw4 qw4Var = this.glassEngine;
            RectF rectF2 = qw4Var.e;
            if (rectF == null) {
                if (!rectF2.isEmpty()) {
                    rectF2.setEmpty();
                    qw4Var.f = true;
                }
            } else if (!rectF2.equals(rectF)) {
                rectF2.set(rectF);
                qw4Var.f = true;
            }
            this.simpleGlass.j = runnable;
        }
    }

    public void setParentLayout(ui5 ui5Var) {
        boolean z;
        ui5 ui5Var2;
        boolean z2;
        ViewGroup viewGroup;
        if (this.parentLayout != ui5Var) {
            this.parentLayout = ui5Var;
            if (ui5Var != null && ((ActionBarLayout) ui5Var).f) {
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
                        fa4.g(e, true);
                    }
                }
                ui5 ui5Var3 = this.parentLayout;
                if (ui5Var3 != null && ui5Var3.getView().getContext() != this.fragmentView.getContext()) {
                    this.fragmentView = null;
                    clearSheets();
                }
            }
            if (this.actionBar != null) {
                ui5 ui5Var4 = this.parentLayout;
                if (ui5Var4 != null && ui5Var4.getView().getContext() != this.actionBar.getContext()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a aVar = this.actionBar;
                if ((aVar.L || z2) && (viewGroup = (ViewGroup) aVar.getParent()) != null) {
                    try {
                        viewGroup.removeViewInLayout(this.actionBar);
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                if (z2) {
                    this.actionBar = null;
                }
            }
            if (this.simpleActionBar != null && (ui5Var2 = this.parentLayout) != null && ui5Var2.getView().getContext() != this.simpleActionBar.getContext()) {
                gl.B2(this.simpleActionBar);
                this.simpleActionBar = null;
            }
            if (this.parentLayout != null && useSimpleActionBar()) {
                if (this.simpleActionBar == null) {
                    pha createSimpleActionBar = createSimpleActionBar(this.parentLayout.getView().getContext());
                    this.simpleActionBar = createSimpleActionBar;
                    createSimpleActionBar.setMenuOverlayProvider(new wf0(this, (byte) 0));
                    return;
                }
                return;
            }
            ui5 ui5Var5 = this.parentLayout;
            if (ui5Var5 != null && this.actionBar == null) {
                a createActionBar = createActionBar(ui5Var5.getView().getContext());
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

    public void setPreviewDelegate(bg0 bg0Var) {
        this.previewDelegate = bg0Var;
    }

    public void setRemovingFromStack(boolean z) {
        this.removingFromStack = z;
    }

    public void setResourceProvider(wjb wjbVar) {
        this.resourceProvider = wjbVar;
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

    public void setupBulletinGlass(m21 m21Var) {
        q11 q11Var = m21Var.e;
        if (this.simpleGlass != null && this.fragmentView != null && q11Var != null && q11Var.canHaveGlassBackground()) {
            final il0 c = this.simpleGlass.c.c(q11Var, null, false);
            c.p(nod.c(getResourceProvider()));
            c.r(gl.L(16.0f));
            q11Var.setGlassBackground(c, new Runnable() {
                @Override
                public final void run() {
                    qw4 qw4Var = d.this.glassEngine;
                    ArrayList arrayList = qw4Var.c;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (((pw4) arrayList.get(size)).b == c && ((pw4) arrayList.remove(size)).i) {
                            qw4Var.f = true;
                        }
                    }
                }
            });
        }
    }

    public boolean shouldOverrideSlideTransition(boolean z, boolean z2) {
        return false;
    }

    public ui5[] showAsSheet(d dVar, ag0 ag0Var) {
        if (getParentActivity() == null) {
            return null;
        }
        ui5[] ui5VarArr = {new oi5(getParentActivity(), new l0(r7, (byte) 28))};
        ui5VarArr[0].setIsSheet(true);
        LaunchActivity.H1.Q.add(ui5VarArr[0]);
        dVar.onTransitionAnimationStart(true, false);
        yf0 yf0Var = new yf0(getParentActivity(), dVar.getResourceProvider(), ag0Var, ui5VarArr, dVar, r7);
        fx0[] fx0VarArr = {yf0Var};
        if (ag0Var != null) {
            yf0Var.r0(false);
            fx0VarArr[0].V0 = ag0Var.a;
        }
        fx0 fx0Var = fx0VarArr[0];
        dVar.parentDialog = fx0Var;
        fx0Var.S0 = true;
        fx0Var.show();
        return ui5VarArr;
    }

    public Dialog showDialog(Dialog dialog, boolean z, DialogInterface.OnDismissListener onDismissListener) {
        ui5 ui5Var;
        if (dialog != null && (ui5Var = this.parentLayout) != null && !((ActionBarLayout) ui5Var).z()) {
            ActionBarLayout actionBarLayout = (ActionBarLayout) this.parentLayout;
            if (!actionBarLayout.R && (z || !actionBarLayout.h())) {
                ArrayList<zf0> arrayList = this.sheetsStack;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (this.sheetsStack.get(size).t() && this.sheetsStack.get(size).u(dialog)) {
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
                    fa4.g(e, true);
                }
                try {
                    this.visibleDialog = dialog;
                    dialog.setCanceledOnTouchOutside(true);
                    this.visibleDialog.setOnDismissListener(new cf(this, onDismissListener, (byte) 2));
                    this.visibleDialog.show();
                    return this.visibleDialog;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
        }
        return null;
    }

    public void startActivityForResult(Intent intent, int i) {
        ActionBarLayout actionBarLayout;
        Activity activity;
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && (activity = (actionBarLayout = (ActionBarLayout) ui5Var).R0) != null) {
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
                zf0 zf0Var = this.sheetsStack.get(i);
                boolean z = true;
                if (i != this.sheetsStack.size() - 1 || !this.isFullyVisible) {
                    z = false;
                }
                zf0Var.b(z);
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
        ui5 ui5Var;
        if (this.isFinished || (ui5Var = this.parentLayout) == null) {
            return false;
        }
        this.finishing = true;
        ((ActionBarLayout) ui5Var).j(z, false);
        return true;
    }

    public boolean presentFragment(d dVar, boolean z) {
        ui5 ui5Var;
        return allowPresentFragment() && (ui5Var = this.parentLayout) != null && ((ActionBarLayout) ui5Var).T(dVar, z);
    }

    public boolean presentFragment(d dVar) {
        ui5 ui5Var;
        return allowPresentFragment() && (ui5Var = this.parentLayout) != null && ((ActionBarLayout) ui5Var).S(dVar);
    }

    public boolean presentFragment(ri5 ri5Var) {
        ui5 ui5Var;
        return allowPresentFragment() && (ui5Var = this.parentLayout) != null && ((ActionBarLayout) ui5Var).R(ri5Var);
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

    public m8b getOrCreateStoryViewer() {
        ArrayList<zf0> arrayList = this.sheetsStack;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.sheetsStack = arrayList;
        }
        m8b m8bVar = (arrayList.isEmpty() || !(b00.f(1, this.sheetsStack) instanceof m8b)) ? null : (m8b) b00.f(1, this.sheetsStack);
        if (m8bVar == null) {
            m8bVar = new m8b(this);
            ui5 ui5Var = this.parentLayout;
            if (ui5Var != null && ((ActionBarLayout) ui5Var).b) {
                m8bVar.r1 = true;
            }
            this.sheetsStack.add(m8bVar);
            updateSheetsVisibility();
        }
        return m8bVar;
    }

    public ui5[] showAsSheet(d dVar) {
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
