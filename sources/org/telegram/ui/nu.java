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
public final class nu extends org.telegram.ui.ActionBar.r2 {
    public static final int[][] f41886r = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f41887s = {org.telegram.ui.ActionBar.y6.hj, org.telegram.ui.ActionBar.y6.ij, org.telegram.ui.ActionBar.y6.lj, org.telegram.ui.ActionBar.y6.kj, org.telegram.ui.ActionBar.y6.jj, org.telegram.ui.ActionBar.y6.pj, org.telegram.ui.ActionBar.y6.qj};
    public static final int[] v = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] f41888w = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f41889x = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.v91 f41890a;
    public org.telegram.ui.Components.u91 f41891b;
    public FrameLayout f41892c;
    public View d;
    public final se.b e;
    public boolean f41893f;
    public int h;
    public int f41894n;

    public nu() {
        super(null);
        this.e = new se.b();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 24));
        di.i4 i4Var = new di.i4(context, 22);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23300a7, i4Var, null);
        org.telegram.ui.Components.v91 v91Var = new org.telegram.ui.Components.v91(context, null);
        this.f41890a = v91Var;
        v91Var.setAdapter(new ku(this));
        this.f41892c = new FrameLayout(context);
        this.f41891b = this.f41890a.n(-2, true);
        i4Var.addView(this.f41890a, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        View view = new View(context);
        this.d = view;
        i4Var.addView(view, org.telegram.ui.Components.kb1.i(-1, 0, 48));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        this.f41892c.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h) - AndroidUtilities.dp(9.0f));
        this.f41892c.addView(this.f41891b, org.telegram.ui.Components.kb1.g(48.0f, -1));
        this.f41892c.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        FrameLayout frameLayout = this.f41892c;
        eh.d c10 = getBaseSimpleGlass().f19420c.c(this.f41892c, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        frameLayout.setBackground(c10);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.Components.v91 v91Var2 = this.f41890a;
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.u6 u6Var = this.resourceProvider;
        baseSimpleGlass.f19422g = i4Var;
        baseSimpleGlass.h = v91Var2;
        baseSimpleGlass.f19418a.c(v91Var2);
        baseSimpleGlass.f(i4Var, r5Var, u6Var);
        getBaseSimpleGlass().f19423i = new bi.g(8, this, i4Var);
        getBaseSimpleGlass().h = null;
        i4Var.addView(this.f41892c, org.telegram.ui.Components.kb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.d.setBackground(getBaseSimpleGlass().a(this.d));
        this.simpleActionBar.setBackground(null);
        this.fragmentView = i4Var;
        return i4Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f41893f) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23714w8, false)) <= 0.721f) {
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
        if (this.f41890a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.h = i11;
        this.f41894n = i13;
        this.f41892c.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11) - AndroidUtilities.dp(9.0f));
        this.d.getLayoutParams().height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.h;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ju juVar = (ju) it.next();
            nu nuVar = juVar.f40613w3;
            oi.a.d(juVar, nuVar.h, nuVar.f41894n, AndroidUtilities.dp(42.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f41893f) {
            this.f41893f = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void t0() {
        View currentView = this.f41890a.getCurrentView();
        if (!(currentView instanceof ju)) {
            return;
        }
        ju juVar = (ju) currentView;
        juVar.e1(new fu(juVar), 700, true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
