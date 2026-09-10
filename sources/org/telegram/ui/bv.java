package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class bv extends org.telegram.ui.ActionBar.p2 {
    public static final int[][] d = {new int[]{-14899731, -15431455}, new int[]{-11154873, -14175180}, new int[]{-11565578, -13276952}, new int[]{-1007845, -1996271}, new int[]{-765355, -2148011}, new int[]{-3903756, -6335009}, new int[]{-13451058, -14836538}};
    public static final int[] e = {org.telegram.ui.ActionBar.j6.hj, org.telegram.ui.ActionBar.j6.ij, org.telegram.ui.ActionBar.j6.lj, org.telegram.ui.ActionBar.j6.kj, org.telegram.ui.ActionBar.j6.jj, org.telegram.ui.ActionBar.j6.pj, org.telegram.ui.ActionBar.j6.qj};
    public static final int[] f31410f = {R.drawable.msg_filled_data_videos, R.drawable.msg_filled_data_files, R.drawable.msg_filled_data_photos, R.drawable.msg_filled_data_messages, R.drawable.msg_filled_data_music, R.drawable.msg_filled_data_voice, R.drawable.msg_filled_data_calls};
    public static final int[] h = {R.string.LocalVideoCache, R.string.LocalDocumentCache, R.string.LocalPhotoCache, R.string.MessagesSettings, R.string.LocalMusicCache, R.string.LocalAudioCache, R.string.CallsDataUsage};
    public static final int[] f31411n = {2, 5, 4, 1, 7, 3, 0};
    public org.telegram.ui.Components.v81 f31412a;
    public org.telegram.ui.Components.u81 f31413b;
    public boolean f31414c;

    public bv() {
        super(null);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.NetworkUsage));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18273w8;
        lVar.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        lVar2.setTitleColor(getThemedColor(i11));
        this.actionBar.C(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 19));
        k0 k0Var = new k0(this, context, 6);
        k0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
        org.telegram.ui.Components.v81 v81Var = new org.telegram.ui.Components.v81(context, null);
        this.f31412a = v81Var;
        v81Var.setAdapter(new yu(this));
        org.telegram.ui.Components.u81 n10 = this.f31412a.n(8, true);
        this.f31413b = n10;
        n10.setBackgroundColor(getThemedColor(i10));
        k0Var.addView(this.f31413b, w7.a6.e(-1, 48, 55));
        k0Var.addView(this.f31412a, w7.a6.d(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentView = k0Var;
        return k0Var;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return null;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f31414c) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18273w8, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getY() <= AndroidUtilities.dp(48.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                return true;
            }
        }
        if (this.f31412a.getCurrentPosition() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f31414c) {
            this.f31414c = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void r0() {
        View currentView = this.f31412a.getCurrentView();
        if (!(currentView instanceof xu)) {
            return;
        }
        xu xuVar = (xu) currentView;
        xuVar.d1(new tu(xuVar), 700, true);
    }
}
