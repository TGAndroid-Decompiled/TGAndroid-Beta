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
public final class av0 implements p50, org.telegram.ui.Components.nv0, org.telegram.ui.ActionBar.u1, org.telegram.messenger.as, r0.m, org.telegram.ui.Components.gg0, org.telegram.ui.Components.jk0, fe.e, org.telegram.messenger.k9 {
    public final int f35842a;
    public final ProfileActivity f35843b;

    public av0(ProfileActivity profileActivity, int i10) {
        this.f35842a = i10;
        this.f35843b = profileActivity;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        RectF rectF = ProfileActivity.S6;
        int i10 = j1Var.f46143a.f(519).d;
        ProfileActivity profileActivity = this.f35843b;
        profileActivity.I6 = i10;
        FrameLayout frameLayout = profileActivity.f33911s5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i11 = profileActivity.I6 + profileActivity.H6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                marginLayoutParams.bottomMargin = i11;
                profileActivity.f33911s5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.N != null) {
            profileActivity.H3();
            org.telegram.ui.Components.wq0 wq0Var = profileActivity.N.f24498a0;
            if (wq0Var != null) {
                wq0Var.setButtonOffset(profileActivity.I6 + profileActivity.H6);
            }
        }
        return r0.j1.f46142b;
    }

    @Override
    public boolean f(int i10, View view) {
        ProfileActivity profileActivity = this.f35843b;
        gy0 gy0Var = profileActivity.e;
        if (gy0Var.f37592x || gy0Var.f37591w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33957z0);
        String L0 = org.telegram.messenger.dd.L0(2131752056, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131752061, null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752099, null), new av0(profileActivity, 10));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        profileActivity.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
            return true;
        }
        return true;
    }

    @Override
    public void g(int i10, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.S6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.f35843b;
        TLRPC.ChatFull chatFull = profileActivity.f33915t2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < profileActivity.f33915t2.participants.participants.size(); i11++) {
                hashSet.add(Long.valueOf(profileActivity.f33915t2.participants.participants.get(i11).user_id));
            }
        }
        profileActivity.getMessagesController().o(profileActivity.D2, profileActivity, arrayList, i10, new f3(arrayList2, 5), new f3(profileActivity, 6), new pd0(profileActivity, arrayList2, hashSet, 26));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = this.f35842a;
        ProfileActivity profileActivity = this.f35843b;
        switch (i11) {
            case 2:
                RectF rectF = ProfileActivity.S6;
                profileActivity.getMessagesController().w(profileActivity.f33803d1);
                if (org.telegram.ui.Components.cc.a(profileActivity)) {
                    org.telegram.ui.Components.cc.d(profileActivity, true).j();
                    return;
                }
                return;
            case 9:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.getClass();
                org.telegram.messenger.uz.f18530l = null;
                org.telegram.messenger.uz.f18532m = null;
                org.telegram.messenger.uz.y();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                gy0 gy0Var = profileActivity.e;
                gy0Var.f37591w.clear();
                org.telegram.messenger.wp.d1().edit().remove("settingsSearchRecent2").commit();
                gy0Var.f();
                return;
        }
    }

    @Override
    public void i(boolean z10) {
        ProfileActivity profileActivity = this.f35843b;
        profileActivity.I1 = 0;
        org.telegram.messenger.at notificationCenter = profileActivity.getNotificationCenter();
        int i10 = org.telegram.messenger.at.f14786t;
        notificationCenter.n(profileActivity, i10);
        profileActivity.getNotificationCenter().k(i10, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.at.K2, Long.valueOf(-profileActivity.D2.f19794id), null, profileActivity.D2, Boolean.valueOf(z10));
    }

    @Override
    public boolean run() {
        ProfileActivity profileActivity = this.f35843b;
        if (profileActivity.C2 == null && !profileActivity.u4()) {
            return false;
        }
        return true;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        RectF rectF = ProfileActivity.S6;
        this.f35843b.p5();
    }

    @Override
    public void e(TLRPC.User user) {
    }

    @Override
    public void E(float f7, int i10) {
    }
}
