package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ev extends org.telegram.ui.ActionBar.m2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] e = {org.telegram.ui.ActionBar.g6.hj, org.telegram.ui.ActionBar.g6.ij, org.telegram.ui.ActionBar.g6.lj, org.telegram.ui.ActionBar.g6.kj, org.telegram.ui.ActionBar.g6.jj, org.telegram.ui.ActionBar.g6.pj, org.telegram.ui.ActionBar.g6.qj};
    public static final int[] f35381f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f35382n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.l91 f35383a;
    public org.telegram.ui.Components.k91 f35384b;
    public boolean f35385c;

    public ev() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19954w8;
        kVar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        kVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.D(getThemedColor(i11), false);
        this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.g6.f19690i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 21));
        l0 l0Var = new l0(this, context, 6);
        l0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7));
        org.telegram.ui.Components.l91 l91Var = new org.telegram.ui.Components.l91(context, null);
        this.f35383a = l91Var;
        l91Var.setAdapter(new bv(this));
        org.telegram.ui.Components.k91 n10 = this.f35383a.n(8, true);
        this.f35384b = n10;
        n10.setBackgroundColor(getThemedColor(i10));
        l0Var.addView(this.f35384b, w7.z5.e(-1, 48, 55));
        l0Var.addView(this.f35383a, w7.z5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 119));
        this.fragmentView = l0Var;
        return l0Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f35385c) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19954w8, false)) <= 0.721f) {
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
        if (this.f35383a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f35385c) {
            this.f35385c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void r0() {
        View currentView = this.f35383a.getCurrentView();
        if (!(currentView instanceof av)) {
            return;
        }
        av avVar = (av) currentView;
        avVar.e1(new wu(avVar), 700, true);
    }
}
