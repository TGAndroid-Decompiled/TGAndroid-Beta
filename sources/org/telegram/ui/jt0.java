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
public final class jt0 implements m40, org.telegram.ui.Components.ju0, org.telegram.ui.ActionBar.p1, org.telegram.messenger.ir, r0.m, org.telegram.ui.Components.ff0, org.telegram.ui.Components.hj0, qe.b, org.telegram.messenger.d9 {
    public final int f46686a;
    public final ProfileActivity f46687b;

    public jt0(ProfileActivity profileActivity, int i3) {
        this.f46686a = i3;
        this.f46687b = profileActivity;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        RectF rectF = ProfileActivity.T6;
        int i3 = k1Var.f54026a.f(519).d;
        ProfileActivity profileActivity = this.f46687b;
        profileActivity.J6 = i3;
        FrameLayout frameLayout = profileActivity.f41857t5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i10 = profileActivity.J6 + profileActivity.I6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i10) {
                marginLayoutParams.bottomMargin = i10;
                profileActivity.f41857t5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.O != null) {
            profileActivity.H3();
            org.telegram.ui.Components.vp0 vp0Var = profileActivity.O.f40072b0;
            if (vp0Var != null) {
                vp0Var.setButtonOffset(profileActivity.J6 + profileActivity.I6);
            }
        }
        return r0.k1.f54025b;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        RectF rectF = ProfileActivity.T6;
        this.f46687b.p5();
    }

    @Override
    public boolean f(int i3, View view) {
        ProfileActivity profileActivity = this.f46687b;
        lw0 lw0Var = profileActivity.f41749e;
        if (lw0Var.f47457x || lw0Var.f47456w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
        String M0 = org.telegram.messenger.bd.M0(2131752056, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752061, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new jt0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        profileActivity.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
            return true;
        }
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.f46686a;
        ProfileActivity profileActivity = this.f46687b;
        switch (i10) {
            case 2:
                RectF rectF = ProfileActivity.T6;
                profileActivity.getMessagesController().w(profileActivity.f41751e1);
                if (org.telegram.ui.Components.fc.a(profileActivity)) {
                    org.telegram.ui.Components.fc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 9:
                RectF rectF2 = ProfileActivity.T6;
                profileActivity.getClass();
                org.telegram.messenger.az.f21642l = null;
                org.telegram.messenger.az.f21645m = null;
                org.telegram.messenger.az.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                lw0 lw0Var = profileActivity.f41749e;
                lw0Var.f47456w.clear();
                org.telegram.messenger.hp.e1().edit().remove("settingsSearchRecent2").commit();
                lw0Var.f();
                return;
        }
    }

    @Override
    public void h(int i3, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.T6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f46687b;
        TLRPC.ChatFull chatFull = profileActivity.f41861u2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i10 = 0; i10 < profileActivity.f41861u2.participants.participants.size(); i10++) {
                hashSet.add(Long.valueOf(profileActivity.f41861u2.participants.participants.get(i10).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.E2, profileActivity, arrayList, i3, new g3(arrayList2, 5), new g3(profileActivity, 6), new hc0(profileActivity, arrayList2, hashSet, 27));
    }

    @Override
    public void o(boolean z10) {
        ProfileActivity profileActivity = this.f46687b;
        profileActivity.J1 = 0;
        org.telegram.messenger.hs notificationCenter = profileActivity.getNotificationCenter();
        int i3 = org.telegram.messenger.hs.f23305t;
        notificationCenter.n(profileActivity, i3);
        profileActivity.getNotificationCenter().k(i3, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.hs.K2, Long.valueOf(-profileActivity.E2.f27001id), null, profileActivity.E2, Boolean.valueOf(z10));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f46687b;
        if (profileActivity.D2 == null && !profileActivity.u4()) {
            return false;
        }
        return true;
    }

    @Override
    public void e(TLRPC.User user) {
    }

    @Override
    public void F(float f10, int i3) {
    }
}
