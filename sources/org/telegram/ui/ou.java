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
    public static final int[] e = {org.telegram.ui.ActionBar.k6.hj, org.telegram.ui.ActionBar.k6.ij, org.telegram.ui.ActionBar.k6.lj, org.telegram.ui.ActionBar.k6.kj, org.telegram.ui.ActionBar.k6.jj, org.telegram.ui.ActionBar.k6.pj, org.telegram.ui.ActionBar.k6.qj};
    public static final int[] f40255f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f40256n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.l91 f40257a;
    public org.telegram.ui.Components.k91 f40258b;
    public boolean f40259c;

    public ou() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21538w8;
        org.telegram.ui.ActionBar.r6.i(i10, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar2, 5, i11, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i11, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21273i6, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 22));
        l0 l0Var = new l0(this, context, 6);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, l0Var, null);
        org.telegram.ui.Components.l91 l91Var = new org.telegram.ui.Components.l91(context, null);
        this.f40257a = l91Var;
        l91Var.setAdapter(new lu(this));
        org.telegram.ui.Components.k91 n10 = this.f40257a.n(8, true);
        this.f40258b = n10;
        org.telegram.ui.ActionBar.r6.i(i10, n10, null);
        l0Var.addView(this.f40258b, w7.z5.e(-1, 48, 55));
        l0Var.addView(this.f40257a, w7.z5.d(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = l0Var;
        return l0Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f40259c) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21538w8, false)) <= 0.721f) {
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
        if (this.f40257a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f40259c) {
            this.f40259c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void r0() {
        View currentView = this.f40257a.getCurrentView();
        if (!(currentView instanceof ku)) {
            return;
        }
        ku kuVar = (ku) currentView;
        kuVar.f1(new gu(kuVar), 700, true);
    }
}
