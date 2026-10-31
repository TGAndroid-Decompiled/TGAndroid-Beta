package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bv0 implements q50, org.telegram.ui.Components.mv0, org.telegram.ui.ActionBar.u1, org.telegram.messenger.zr, r0.m, org.telegram.ui.Components.gg0, org.telegram.ui.Components.ik0, fe.e, org.telegram.messenger.j9 {
    public final int f36309a;
    public final ProfileActivity f36310b;

    public bv0(ProfileActivity profileActivity, int i10) {
        this.f36309a = i10;
        this.f36310b = profileActivity;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        RectF rectF = ProfileActivity.R6;
        int i10 = j1Var.f46132a.f(519).d;
        ProfileActivity profileActivity = this.f36310b;
        profileActivity.H6 = i10;
        FrameLayout frameLayout = profileActivity.f33904s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.H6 + profileActivity.G6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f33904s5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.N != null) {
            profileActivity.G3();
            org.telegram.ui.Components.vq0 vq0Var = profileActivity.N.f33170a0;
            if (vq0Var != null) {
                vq0Var.setButtonOffset(profileActivity.H6 + profileActivity.G6);
            }
        }
        return r0.j1.f46131b;
    }

    @Override
    public boolean f(int i10, View view) {
        ProfileActivity profileActivity = this.f36310b;
        hy0 hy0Var = profileActivity.e;
        if (hy0Var.f38059x || hy0Var.f38058w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33950z0);
        String L0 = org.telegram.messenger.cd.L0(2131752056, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752061, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752099, null), new bv0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        profileActivity.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
            return true;
        }
        return true;
    }

    @Override
    public void g(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.R6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f36310b;
        TLRPC.ChatFull chatFull = profileActivity.f33908t2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f33908t2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f33908t2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.D2, profileActivity, arrayList, i10, new f3(arrayList2, 5), new f3(profileActivity, 6), new qd0(profileActivity, arrayList2, hashSet, 26));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.f36309a;
        ProfileActivity profileActivity = this.f36310b;
        switch (i11) {
            case 2:
                RectF rectF = ProfileActivity.R6;
                profileActivity.getMessagesController().w(profileActivity.f33796d1);
                if (org.telegram.ui.Components.cc.a(profileActivity)) {
                    org.telegram.ui.Components.cc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 9:
                RectF rectF2 = ProfileActivity.R6;
                profileActivity.getClass();
                org.telegram.messenger.tz.f18161l = null;
                org.telegram.messenger.tz.f18163m = null;
                org.telegram.messenger.tz.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                hy0 hy0Var = profileActivity.e;
                hy0Var.f38058w.clear();
                org.telegram.messenger.vp.d1().edit().remove("settingsSearchRecent2").commit();
                hy0Var.f();
                return;
        }
    }

    @Override
    public void i(boolean z10) {
        ProfileActivity profileActivity = this.f36310b;
        profileActivity.I1 = 0;
        org.telegram.messenger.zs notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.zs.f19690t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.zs.K2, Long.valueOf(-profileActivity.D2.f19793id), null, profileActivity.D2, Boolean.valueOf(z10));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f36310b;
        if (profileActivity.C2 == null && !profileActivity.t4()) {
            return false;
        }
        return true;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        RectF rectF = ProfileActivity.R6;
        this.f36310b.o5();
    }

    @Override
    public void e(TLRPC.User user) {
    }

    @Override
    public void E(float f7, int i10) {
    }
}
