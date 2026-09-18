package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class av extends org.telegram.ui.ActionBar.n2 {
    public static final int[][] f32143r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f32144s = {org.telegram.ui.ActionBar.j6.hj, org.telegram.ui.ActionBar.j6.ij, org.telegram.ui.ActionBar.j6.lj, org.telegram.ui.ActionBar.j6.kj, org.telegram.ui.ActionBar.j6.jj, org.telegram.ui.ActionBar.j6.pj, org.telegram.ui.ActionBar.j6.qj};
    public static final int[] v = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] f32145w = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f32146x = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.x81 f32147a;
    public org.telegram.ui.Components.w81 f32148b;
    public FrameLayout f32149c;
    public View d;
    public final pe.b e;
    public boolean f32150f;
    public int h;
    public int f32151n;

    public av() {
        super(null);
        this.e = new pe.b(true);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19413w8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.B(getThemedColor(i10), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.j6.f19152i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 19));
        ai.x5 x5Var = new ai.x5(context, 23);
        x5Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19006a7));
        org.telegram.ui.Components.x81 x81Var = new org.telegram.ui.Components.x81(context, null);
        this.f32147a = x81Var;
        x81Var.setAdapter(new xu(this));
        this.f32149c = new FrameLayout(context);
        this.f32148b = this.f32147a.n(-2, true);
        x5Var.addView(this.f32147a, w7.y5.e(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        x5Var.addView(view, w7.y5.e(-1, 0, 48));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f32149c.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h) - AndroidUtilities.dp(9.0f));
        this.f32149c.addView(this.f32148b, w7.y5.c(48.0f, -1));
        this.f32149c.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        FrameLayout frameLayout = this.f32149c;
        ch.d c10 = getBaseSimpleGlass().f14286b.c(this.f32149c, null, false);
        c10.o(eh.b.m(this.resourceProvider));
        c10.p(AndroidUtilities.dp(9.66f));
        c10.q(AndroidUtilities.dp(18.0f));
        frameLayout.setBackground(c10);
        li.b baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.x81 x81Var2 = this.f32147a;
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        baseSimpleGlass.e = x5Var;
        baseSimpleGlass.f14288f = x81Var2;
        li.i iVar = baseSimpleGlass.f14285a;
        iVar.getClass();
        x81Var2.Q.add(new li.e(iVar));
        kVar2.setCenterTitleAndGlass(true);
        kVar2.M(baseSimpleGlass.f14286b, eh.b.m(e6Var), false);
        kVar2.setAddToContainer(false);
        AndroidUtilities.removeFromParent(kVar2);
        x5Var.addView(kVar2, w7.y5.e(-1, -2, 48));
        ah.e eVar = new ah.e(baseSimpleGlass.f14287c.c(kVar2, null, false));
        eVar.b(-AndroidUtilities.dp(50.0f), true);
        eVar.f443q = 224;
        kVar2.setBackground(eVar);
        kVar2.setExtraHeight(AndroidUtilities.dp(12.0f));
        getBaseSimpleGlass().f14289g = new li.a(2, this, x5Var);
        getBaseSimpleGlass().f14288f = null;
        x5Var.addView(this.f32149c, w7.y5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(this.actionBar.getBackground());
        this.actionBar.setBackground(null);
        this.fragmentView = x5Var;
        return x5Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f32150f) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19413w8, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        if (this.f32147a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.h = i11;
        this.f32151n = i13;
        this.f32149c.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - AndroidUtilities.dp(9.0f));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            wu wuVar = (wu) it.next();
            av avVar = wuVar.f39256o3;
            li.b.a(wuVar, avVar.h, avVar.f32151n, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f32150f) {
            this.f32150f = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void s0() {
        View currentView = this.f32147a.getCurrentView();
        if (!(currentView instanceof wu)) {
            return;
        }
        wu wuVar = (wu) currentView;
        wuVar.f1(new su(wuVar), 700, true);
    }
}
