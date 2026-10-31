package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nj extends org.telegram.ui.ActionBar.k {
    public final Context f39955a;
    public final un f39956b;

    public nj(un unVar, Context context) {
        this.f39956b = unVar;
        this.f39955a = context;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        boolean z11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User Z1;
        boolean z12;
        boolean z13;
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i12;
        int i13;
        boolean z14;
        long j10;
        int i14;
        int i15;
        long j11;
        int i16;
        int i17;
        boolean z15;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Components.t11 t11Var;
        un unVar = this.f39956b;
        SparseArray[] sparseArrayArr = unVar.f42360o6;
        SparseArray[] sparseArrayArr2 = unVar.f42347n6;
        SparseArray[] sparseArrayArr3 = unVar.f42333m6;
        if (i10 != -2 && i10 != 75 && i10 != -1 && (t11Var = unVar.m0) != null && t11Var.D > 0.0f) {
            t11Var.b();
        }
        boolean z16 = true;
        if (i10 == -1) {
            if (!unVar.Sc.f7021f) {
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                if (lVar.u()) {
                    unVar.H7(false);
                } else if (unVar.f42248f4 == 5 && (unVar.K6.isEmpty() || unVar.f42394r4 == 0)) {
                    unVar.jc();
                } else if (unVar.f42248f4 == 6 && unVar.Z.s()) {
                    unVar.Pb(new Runnable(this) {
                        public final nj f38877b;

                        {
                            this.f38877b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f38877b.f39956b.finishFragment();
                                    return;
                                default:
                                    nj njVar = this.f38877b;
                                    njVar.getClass();
                                    un unVar2 = njVar.f39956b;
                                    Intent intent = new Intent(unVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", unVar2.f42223d4.link);
                                    unVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!unVar.f7(true, true)) {
                    unVar.finishFragment();
                }
            } else {
                unVar.Ia();
            }
        } else if (i10 == 59) {
            if (unVar.getUserConfig().e() == unVar.f42297j6) {
                unVar.getMessagesController().K4(true);
                unVar.f42355o1.e(false, true);
                return;
            }
            org.telegram.messenger.x00 x00Var = unVar.getMessagesController().f18891r7;
            x00Var.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = x00Var.getMessagesController().g1(-unVar.f42297j6);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            x00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.v1(x00Var, 7));
            pb1.L0(unVar);
        } else {
            String str = null;
            org.telegram.messenger.jj jjVar = null;
            if (i10 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j12 = 0;
                for (int i18 = 1; i18 >= 0; i18--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr2[i18].size(); i19++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i18].keyAt(i19)));
                    }
                    if (unVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user2 = unVar.f42243f) == null || !user2.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) un.Q8(j12, jjVar2, z15));
                        j12 = jjVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.i0.g(spannableStringBuilder);
                    unVar.Y7();
                    unVar.M3.j(58, 0L, null);
                }
                unVar.H7(false);
            } else if (i10 == 12) {
                if (unVar.getParentActivity() != null) {
                    unVar.N7(null, null, false);
                }
            } else if (i10 == 11) {
                unVar.ra(true);
            } else if (i10 == 69) {
                un.H1(unVar);
            } else if (i10 == 70) {
                TLRPC.Chat chat = unVar.e;
                if (chat != null) {
                    unVar.presentFragment(un.ha(-chat.linked_monoforum_id));
                }
            } else if (i10 == 72) {
                long j13 = unVar.f42297j6;
                if (org.telegram.messenger.w3.p0(unVar.e)) {
                    i17 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    if (org.telegram.messenger.w3.A(i17, unVar.e, 24)) {
                        j13 = unVar.f42394r4;
                        j11 = unVar.f42297j6;
                        long j14 = j13;
                        i16 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        rh.e6.y(i16, false).g0(j14, j11, false, false);
                    }
                }
                j11 = 0;
                long j142 = j13;
                i16 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                rh.e6.y(i16, false).g0(j142, j11, false, false);
            } else if (i10 == 71) {
                long j15 = unVar.f42297j6;
                if (org.telegram.messenger.w3.p0(unVar.e)) {
                    i15 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    if (org.telegram.messenger.w3.A(i15, unVar.e, 24)) {
                        j15 = unVar.f42394r4;
                        j10 = unVar.f42297j6;
                        long j16 = j15;
                        i14 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        rh.e6.y(i14, false).C(j16, j10, new dg(this, j16, j10, 1));
                    }
                }
                j10 = 0;
                long j162 = j15;
                i14 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                rh.e6.y(i14, false).C(j162, j10, new dg(this, j162, j10, 1));
            } else if (i10 == 28) {
                if (unVar.f42464wb == null) {
                    un.M1(unVar);
                } else {
                    unVar.x9();
                }
            } else if (i10 == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i21 = 1; i21 >= 0; i21--) {
                    for (int i22 = 0; i22 < sparseArrayArr3[i21].size(); i22++) {
                        arrayList2.add((org.telegram.messenger.jj) sparseArrayArr3[i21].valueAt(i22));
                    }
                    sparseArrayArr3[i21].clear();
                    sparseArrayArr2[i21].clear();
                    sparseArrayArr[i21].clear();
                }
                if (unVar.f42447v6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                unVar.p9();
                unVar.Sc(0, true);
                unVar.sd(false);
                MediaController.g0(unVar.getParentActivity(), unVar.getAccountInstance(), arrayList2, new lj(0, this, z14));
            } else if (i10 == 13) {
                if (unVar.getParentActivity() != null) {
                    unVar.showDialog(org.telegram.ui.Components.s4.U(unVar.getParentActivity(), unVar.h, unVar.f42477xa).f20134a);
                }
            } else if (i10 != 15 && i10 != 16 && i10 != 26) {
                if (i10 == 17) {
                    if (unVar.f42243f != null && unVar.getParentActivity() != null) {
                        TextView textView = unVar.Z1;
                        if (textView != null && textView.getTag() != null) {
                            unVar.Kb(((Integer) unVar.Z1.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", unVar.f42243f.f19942id);
                        bundle.putBoolean("addContact", true);
                        unVar.presentFragment(new ns(bundle));
                    }
                } else if (i10 == 18) {
                    unVar.uc(false);
                } else if (i10 == 24) {
                    try {
                        org.telegram.messenger.ui mediaDataController = unVar.getMediaDataController();
                        long j17 = unVar.f42243f.f19942id;
                        Pattern pattern = org.telegram.messenger.ui.R1;
                        mediaDataController.y0(j17, 0, null);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                } else if (i10 == 29) {
                    if (org.telegram.messenger.w3.N(unVar.e)) {
                        t5 t5Var = new t5(unVar.f42297j6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = unVar.R1;
                        t5Var.T = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new k5(t5Var, 0));
                        }
                        unVar.presentFragment(t5Var);
                        return;
                    }
                    unVar.getNotificationCenter().k(org.telegram.messenger.zs.f19656n3, Long.valueOf(unVar.f42297j6));
                } else if (i10 == 21) {
                    int i23 = c01.f36350s1;
                    int currentAccount = unVar.getCurrentAccount();
                    Activity parentActivity = unVar.getParentActivity();
                    long a2 = unVar.a();
                    if (parentActivity != null) {
                        c01.J0(currentAccount, parentActivity, a2, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i10 == 22) {
                    for (int i24 = 0; i24 < 2; i24++) {
                        for (int i25 = 0; i25 < sparseArrayArr[i24].size(); i25++) {
                            org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) sparseArrayArr[i24].valueAt(i25);
                            unVar.getMediaDataController().d(2, jjVar3, jjVar3.F0(), (int) (System.currentTimeMillis() / 1000), !unVar.f42372p6);
                        }
                    }
                    unVar.H7(false);
                } else if (i10 == 23) {
                    for (int i26 = 1; i26 >= 0; i26--) {
                        if (jjVar == null && sparseArrayArr3[i26].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i27 = 0; i27 < sparseArrayArr3[i26].size(); i27++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i26].keyAt(i27)));
                            }
                            jjVar = (org.telegram.messenger.jj) unVar.E6[i26].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i26].clear();
                        sparseArrayArr2[i26].clear();
                        sparseArrayArr[i26].clear();
                    }
                    if (jjVar != null && jjVar.D4()) {
                        unVar.f42421t5 = jjVar;
                        unVar.Qa(109);
                    } else {
                        unVar.qc(jjVar, false);
                    }
                    unVar.p9();
                    unVar.Sc(0, true);
                    unVar.sd(false);
                } else if (i10 == 64) {
                    i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    ag.h3 c10 = ag.i3.f(i12).c(unVar.U8());
                    Activity parentActivity2 = unVar.getParentActivity();
                    i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    ag.z2.h0(parentActivity2, i13, unVar.f42236e4, c10, unVar.getResourceProvider(), new ag.e0(23, this, c10));
                } else if (i10 == 14) {
                    org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(0, this.f39955a, unVar.getResourceProvider(), true, true);
                    b1Var.j(org.telegram.messenger.cd.L0(2131753953, null), 2131231496, null);
                    b1Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.t0 t0Var = unVar.f42279i0;
                    org.telegram.ui.ActionBar.x xVar = unVar.f42244f0;
                    xVar.a();
                    t0Var.U(b1Var, xVar.f21464m);
                } else if (i10 == 30) {
                    unVar.getSendMessagesHelper().r0(org.telegram.messenger.oz.b("/help", unVar.f42297j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 31) {
                    unVar.getSendMessagesHelper().r0(org.telegram.messenger.oz.b("/settings", unVar.f42297j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i10 == 40) {
                    if (unVar.S9()) {
                        str = "";
                    }
                    unVar.Ba(str);
                } else if (i10 == 62) {
                    unVar.getMessagesController().f18910t7.J(unVar.a(), false, true);
                    if (!unVar.getMessagesController().f18910t7.K(unVar.a(), true)) {
                        unVar.ld(true);
                    }
                } else if (i10 != 32 && i10 != 33) {
                    if (i10 == 27) {
                        unVar.Qb();
                    } else if (i10 == 60) {
                        if (unVar.f42382q4 != null) {
                            org.telegram.messenger.x00 x00Var2 = unVar.getMessagesController().f18891r7;
                            long j18 = unVar.e.f19793id;
                            TLRPC.TL_forumTopic tL_forumTopic = unVar.f42382q4;
                            int i28 = tL_forumTopic.f19845id;
                            tL_forumTopic.closed = true;
                            x00Var2.z(i28, j18, true);
                            unVar.md();
                            unVar.Bc(false);
                            unVar.ld(true);
                        }
                    } else if (i10 == 61) {
                        pb1.L0(unVar);
                    } else if (i10 == 65) {
                        org.telegram.messenger.i0.g(unVar.f42223d4.link);
                        org.telegram.ui.Components.cc.a0(LaunchActivity.Q()).k(false).j();
                    } else if (i10 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final nj f38877b;

                            {
                                this.f38877b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f38877b.f39956b.finishFragment();
                                        return;
                                    default:
                                        nj njVar = this.f38877b;
                                        njVar.getClass();
                                        un unVar2 = njVar.f39956b;
                                        Intent intent = new Intent(unVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", unVar2.f42223d4.link);
                                        unVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (unVar.Z.s()) {
                            unVar.Pb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i10 == 67) {
                        Activity parentActivity3 = unVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = unVar.f42223d4;
                        p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                        ag.i0.f0(parentActivity3, i11, tL_businessChatLink, p6Var);
                    } else if (i10 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.getResourceProvider());
                        String L0 = org.telegram.messenger.cd.L0(2131752707, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131752708, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new y0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        unVar.showDialog(x1Var);
                        TextView textView2 = (TextView) x1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21170q7, unVar.getResourceProvider());
                        }
                    } else if (i10 == 75) {
                        if (unVar.U9() && unVar.r8() != null) {
                            org.telegram.messenger.i0.v1(unVar.l1);
                            org.telegram.ui.Components.t11 t11Var2 = unVar.m0;
                            t11Var2.f();
                            t11Var2.a(1.0f, 0.0f);
                        }
                    } else if (i10 == 73) {
                        la1 e02 = la1.e0(-unVar.f42297j6, 0L);
                        e02.D = unVar;
                        unVar.presentFragment(e02);
                    } else if (i10 == 888) {
                        unVar.dumpCanvas();
                    } else if (i10 == 889) {
                        HashSet hashSet = h4.f37702c1;
                        org.telegram.ui.Components.cc.a0(unVar).t("No rich message copied", null).j();
                    }
                } else if (unVar.f42243f != null && unVar.getParentActivity() != null) {
                    TLRPC.User user3 = unVar.f42243f;
                    if (i10 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = unVar.f42385q8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.m1.m(user3, z12, z13, unVar.getParentActivity(), unVar.getMessagesController().a2(unVar.f42243f.f19942id), unVar.getAccountInstance());
                }
            } else if (unVar.getParentActivity() != null) {
                if (i10 == 15 && org.telegram.messenger.w3.p0(unVar.e)) {
                    if (unVar.f42394r4 != 0 && (Z1 = unVar.getMessagesController().Z1(Long.valueOf(unVar.f42394r4))) != null) {
                        org.telegram.ui.Components.s4.q(unVar, -1, Z1, unVar.e, true, new ng.d(14, this, Z1), unVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = unVar.f42374p8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 != 26) {
                    int i29 = 15;
                    if (i10 == 15) {
                        if (unVar.h != null || (((user = unVar.f42243f) == null || org.telegram.messenger.h20.B(user) || org.telegram.messenger.h20.x(unVar.f42243f)) && ((chatFull = unVar.f42374p8) == null || !chatFull.can_delete_channel))) {
                            i29 = 15;
                        }
                    }
                    if (i10 == i29) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = unVar.e;
                    boolean z17 = z11;
                    TLRPC.User user4 = unVar.f42243f;
                    if (unVar.h == null) {
                        z16 = false;
                    }
                    org.telegram.ui.Components.s4.r(unVar, z17, chat2, user4, z16, true, false, z10, new i2.q(this, i10, z10));
                    return;
                }
                boolean z18 = z10;
                org.telegram.ui.Components.s4.q(unVar, -1, unVar.f42243f, unVar.e, z18, new mj(this, z18), unVar.getResourceProvider());
            }
        }
    }
}
