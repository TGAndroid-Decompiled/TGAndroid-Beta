package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ou extends org.telegram.ui.ActionBar.o2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] f41240e = {org.telegram.ui.ActionBar.f6.hj, org.telegram.ui.ActionBar.f6.ij, org.telegram.ui.ActionBar.f6.lj, org.telegram.ui.ActionBar.f6.kj, org.telegram.ui.ActionBar.f6.jj, org.telegram.ui.ActionBar.f6.pj, org.telegram.ui.ActionBar.f6.qj};
    public static final int[] f41241f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f41242n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.n71 f41243a;
    public org.telegram.ui.Components.m71 f41244b;
    public boolean f41245c;

    public ou() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.w8;
        kVar.setBackgroundColor(getThemedColor(i9));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        kVar2.setTitleColor(getThemedColor(i10));
        this.actionBar.C(getThemedColor(i10), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 14));
        m0 m0Var = new m0(this, context, 6);
        m0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.Components.n71 n71Var = new org.telegram.ui.Components.n71(context, null);
        this.f41243a = n71Var;
        n71Var.setAdapter(new lu(this));
        org.telegram.ui.Components.m71 n10 = this.f41243a.n(8, true);
        this.f41244b = n10;
        n10.setBackgroundColor(getThemedColor(i9));
        m0Var.addView(this.f41244b, g7.e6.e(-1, 48, 55));
        m0Var.addView(this.f41243a, g7.e6.d(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = m0Var;
        return m0Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f41245c) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.w8, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                return true;
            }
        }
        if (this.f41243a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f41245c) {
            this.f41245c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    public final void q0() {
        View currentView = this.f41243a.getCurrentView();
        if (!(currentView instanceof ku)) {
            return;
        }
        ku kuVar = (ku) currentView;
        kuVar.e1(new gu(kuVar), 700, true);
    }
}
