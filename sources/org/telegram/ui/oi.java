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
public final class oi extends org.telegram.ui.ActionBar.j {
    public final Context f48297a;
    public final wm f48298b;

    public oi(wm wmVar, Context context) {
        this.f48298b = wmVar;
        this.f48297a = context;
    }

    @Override
    public final void b(int i3) {
        boolean z10;
        boolean z11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        boolean z14;
        long j10;
        int i13;
        int i14;
        long j11;
        int i15;
        int i16;
        boolean z15;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.n01 n01Var;
        wm wmVar = this.f48298b;
        SparseArray[] sparseArrayArr = wmVar.f51438p6;
        SparseArray[] sparseArrayArr2 = wmVar.f51425o6;
        SparseArray[] sparseArrayArr3 = wmVar.f51412n6;
        if (i3 != -2 && i3 != 75 && i3 != -1 && (n01Var = wmVar.f51407n0) != null && n01Var.f36323y > 0.0f) {
            n01Var.c();
        }
        boolean z16 = true;
        if (i3 == -1) {
            if (!wmVar.f51264bd.f53841f) {
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                if (kVar.v()) {
                    wmVar.N7(false);
                } else if (wmVar.f51325g4 == 5 && (wmVar.L6.isEmpty() || wmVar.f51475s4 == 0)) {
                    wmVar.tc();
                } else if (wmVar.f51325g4 == 6 && wmVar.f51237a0.t()) {
                    wmVar.Zb(new Runnable(this) {
                        public final oi f47343b;

                        {
                            this.f47343b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f47343b.f48298b.finishFragment();
                                    return;
                                default:
                                    oi oiVar = this.f47343b;
                                    oiVar.getClass();
                                    wm wmVar2 = oiVar.f48298b;
                                    Intent intent = new Intent(wmVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", wmVar2.f51297e4.link);
                                    wmVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!wmVar.l7(true, true)) {
                    wmVar.finishFragment();
                }
            } else {
                wmVar.Sa();
            }
        } else if (i3 == 59) {
            if (wmVar.getUserConfig().e() == wmVar.f51376k6) {
                wmVar.getMessagesController().N4(true);
                wmVar.f51433p1.e(false, true);
                return;
            }
            org.telegram.messenger.c00 c00Var = wmVar.getMessagesController().f23102q7;
            c00Var.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = c00Var.getMessagesController().h1(-wmVar.f51376k6);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            c00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(c00Var, 7));
            m91.M0(wmVar);
        } else {
            String str = null;
            org.telegram.messenger.zi ziVar = null;
            if (i3 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j12 = 0;
                for (int i17 = 1; i17 >= 0; i17--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i18 = 0; i18 < sparseArrayArr2[i17].size(); i18++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i17].keyAt(i18)));
                    }
                    if (wmVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) sparseArrayArr2[i17].get(((Integer) arrayList.get(i19)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user2 = wmVar.f51306f) == null || !user2.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) wm.X8(j12, ziVar2, z15));
                        j12 = ziVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    wmVar.f8();
                    wmVar.N3.j(58, 0L, null);
                }
                wmVar.N7(false);
            } else if (i3 == 12) {
                if (wmVar.getParentActivity() != null) {
                    wmVar.U7(null, null, false);
                }
            } else if (i3 == 11) {
                wmVar.Ba(true);
            } else if (i3 == 69) {
                wm.I1(wmVar);
            } else if (i3 == 70) {
                TLRPC.Chat chat = wmVar.f51292e;
                if (chat != null) {
                    wmVar.presentFragment(wm.ra(-chat.linked_monoforum_id));
                }
            } else if (i3 == 72) {
                long j13 = wmVar.f51376k6;
                if (org.telegram.messenger.t3.p0(wmVar.f51292e)) {
                    i16 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    if (org.telegram.messenger.t3.A(i16, wmVar.f51292e, 24)) {
                        j13 = wmVar.f51475s4;
                        j11 = wmVar.f51376k6;
                        long j14 = j13;
                        i15 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        ci.e9.y(i15, false).g0(j14, j11, false, false);
                    }
                }
                j11 = 0;
                long j142 = j13;
                i15 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                ci.e9.y(i15, false).g0(j142, j11, false, false);
            } else if (i3 == 71) {
                long j15 = wmVar.f51376k6;
                if (org.telegram.messenger.t3.p0(wmVar.f51292e)) {
                    i14 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    if (org.telegram.messenger.t3.A(i14, wmVar.f51292e, 24)) {
                        j15 = wmVar.f51475s4;
                        j10 = wmVar.f51376k6;
                        long j16 = j15;
                        i13 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        ci.e9.y(i13, false).C(j16, j10, new ci.v4(this, j16, j10, 2));
                    }
                }
                j10 = 0;
                long j162 = j15;
                i13 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                ci.e9.y(i13, false).C(j162, j10, new ci.v4(this, j162, j10, 2));
            } else if (i3 == 28) {
                if (wmVar.f51558yb == null) {
                    wm.N1(wmVar);
                } else {
                    wmVar.H9();
                }
            } else if (i3 == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i20 = 1; i20 >= 0; i20--) {
                    for (int i21 = 0; i21 < sparseArrayArr3[i20].size(); i21++) {
                        arrayList2.add((org.telegram.messenger.zi) sparseArrayArr3[i20].valueAt(i21));
                    }
                    sparseArrayArr3[i20].clear();
                    sparseArrayArr2[i20].clear();
                    sparseArrayArr[i20].clear();
                }
                if (wmVar.f51527w6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                wmVar.z9();
                wmVar.cd(0, true);
                wmVar.Cd(false);
                MediaController.g0(wmVar.getParentActivity(), wmVar.getAccountInstance(), arrayList2, new mi(0, this, z14));
            } else if (i3 == 13) {
                if (wmVar.getParentActivity() != null) {
                    wmVar.showDialog(org.telegram.ui.Components.t4.U(wmVar.getParentActivity(), wmVar.h, wmVar.f51557ya).f27343a);
                }
            } else if (i3 != 15 && i3 != 16 && i3 != 26) {
                if (i3 == 17) {
                    if (wmVar.f51306f != null && wmVar.getParentActivity() != null) {
                        TextView textView = wmVar.f51239a2;
                        if (textView != null && textView.getTag() != null) {
                            wmVar.Ub(((Integer) wmVar.f51239a2.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", wmVar.f51306f.f27150id);
                        bundle.putBoolean("addContact", true);
                        wmVar.presentFragment(new lr(bundle));
                    }
                } else if (i3 == 18) {
                    wmVar.Ec(false);
                } else if (i3 == 24) {
                    try {
                        org.telegram.messenger.li mediaDataController = wmVar.getMediaDataController();
                        long j17 = wmVar.f51306f.f27150id;
                        Pattern pattern = org.telegram.messenger.li.S1;
                        mediaDataController.y0(j17, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i3 == 29) {
                    if (org.telegram.messenger.t3.N(wmVar.f51292e)) {
                        v5 v5Var = new v5(wmVar.f51376k6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = wmVar.S1;
                        v5Var.U = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            v5Var.getMessagesController().G0().b(v5Var.S, v5Var.U, new n5(v5Var, 0));
                        }
                        wmVar.presentFragment(v5Var);
                        return;
                    }
                    wmVar.getNotificationCenter().k(org.telegram.messenger.hs.f23272n3, Long.valueOf(wmVar.f51376k6));
                } else if (i3 == 21) {
                    int i22 = ey0.f45092t1;
                    int currentAccount = wmVar.getCurrentAccount();
                    Activity parentActivity = wmVar.getParentActivity();
                    long a10 = wmVar.a();
                    if (parentActivity != null) {
                        ey0.J0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i3 == 22) {
                    for (int i23 = 0; i23 < 2; i23++) {
                        for (int i24 = 0; i24 < sparseArrayArr[i23].size(); i24++) {
                            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) sparseArrayArr[i23].valueAt(i24);
                            wmVar.getMediaDataController().d(2, ziVar3, ziVar3.F0(), (int) (System.currentTimeMillis() / 1000), !wmVar.f51451q6);
                        }
                    }
                    wmVar.N7(false);
                } else if (i3 == 23) {
                    for (int i25 = 1; i25 >= 0; i25--) {
                        if (ziVar == null && sparseArrayArr3[i25].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i26 = 0; i26 < sparseArrayArr3[i25].size(); i26++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i25].keyAt(i26)));
                            }
                            ziVar = (org.telegram.messenger.zi) wmVar.F6[i25].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i25].clear();
                        sparseArrayArr2[i25].clear();
                        sparseArrayArr[i25].clear();
                    }
                    if (ziVar != null && ziVar.E4()) {
                        wmVar.f51500u5 = ziVar;
                        wmVar.ab(109);
                    } else {
                        wmVar.Ac(ziVar, false);
                    }
                    wmVar.z9();
                    wmVar.cd(0, true);
                    wmVar.Cd(false);
                } else if (i3 == 64) {
                    i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    lg.t1 c2 = lg.u1.f(i11).c(wmVar.b9());
                    Activity parentActivity2 = wmVar.getParentActivity();
                    i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    lg.r1.i0(parentActivity2, i12, wmVar.f51311f4, c2, wmVar.getResourceProvider(), new mi.f(20, this, c2));
                } else if (i3 == 14) {
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f48297a, wmVar.getResourceProvider(), true, true);
                    y0Var.j(org.telegram.messenger.bd.M0(2131753953, null), 2131231495, null);
                    y0Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.q0 q0Var = wmVar.f51359j0;
                    org.telegram.ui.ActionBar.w wVar = wmVar.f51321g0;
                    wVar.a();
                    q0Var.U(y0Var, wVar.f28759m);
                } else if (i3 == 30) {
                    wmVar.getSendMessagesHelper().r0(org.telegram.messenger.wy.b("/help", wmVar.f51376k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i3 == 31) {
                    wmVar.getSendMessagesHelper().r0(org.telegram.messenger.wy.b("/settings", wmVar.f51376k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i3 == 40) {
                    if (wmVar.ca()) {
                        str = "";
                    }
                    wmVar.La(str);
                } else if (i3 == 62) {
                    wmVar.getMessagesController().f23120s7.J(wmVar.a(), false, true);
                    if (!wmVar.getMessagesController().f23120s7.K(wmVar.a(), true)) {
                        wmVar.vd(true);
                    }
                } else if (i3 != 32 && i3 != 33) {
                    if (i3 == 27) {
                        wmVar.ac();
                    } else if (i3 == 60) {
                        if (wmVar.f51463r4 != null) {
                            org.telegram.messenger.c00 c00Var2 = wmVar.getMessagesController().f23102q7;
                            long j18 = wmVar.f51292e.f27001id;
                            TLRPC.TL_forumTopic tL_forumTopic = wmVar.f51463r4;
                            int i27 = tL_forumTopic.f27053id;
                            tL_forumTopic.closed = true;
                            c00Var2.z(i27, j18, true);
                            wmVar.wd();
                            wmVar.Lc(false);
                            wmVar.vd(true);
                        }
                    } else if (i3 == 61) {
                        m91.M0(wmVar);
                    } else if (i3 == 65) {
                        org.telegram.messenger.g0.g(wmVar.f51297e4.link);
                        org.telegram.ui.Components.fc.a0(LaunchActivity.Q()).k(false).j();
                    } else if (i3 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final oi f47343b;

                            {
                                this.f47343b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f47343b.f48298b.finishFragment();
                                        return;
                                    default:
                                        oi oiVar = this.f47343b;
                                        oiVar.getClass();
                                        wm wmVar2 = oiVar.f48298b;
                                        Intent intent = new Intent(wmVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", wmVar2.f51297e4.link);
                                        wmVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (wmVar.f51237a0.t()) {
                            wmVar.Zb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i3 == 67) {
                        Activity parentActivity3 = wmVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = wmVar.f51297e4;
                        e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                        lg.v.g0(parentActivity3, i10, tL_businessChatLink, e6Var);
                    } else if (i3 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.getResourceProvider());
                        String M0 = org.telegram.messenger.bd.M0(2131752707, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131752708, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new x0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        wmVar.showDialog(s1Var);
                        TextView textView2 = (TextView) s1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28122q7, wmVar.getResourceProvider());
                        }
                    } else if (i3 == 75) {
                        if (wmVar.ea() && wmVar.y8() != null) {
                            org.telegram.messenger.g0.v1(wmVar.m1);
                            wmVar.f51407n0.requestLayout();
                            org.telegram.ui.Components.n01 n01Var2 = wmVar.f51407n0;
                            n01Var2.g();
                            n01Var2.a(1.0f, 0.0f);
                        }
                    } else if (i3 == 73) {
                        l81 f02 = l81.f0(-wmVar.f51376k6, 0L);
                        f02.E = wmVar;
                        wmVar.presentFragment(f02);
                    } else if (i3 == 888) {
                        wmVar.dumpCanvas();
                    } else if (i3 == 889) {
                        HashSet hashSet = i4.f46056d1;
                        org.telegram.ui.Components.fc.a0(wmVar).t("No rich message copied", null).j();
                    }
                } else if (wmVar.f51306f != null && wmVar.getParentActivity() != null) {
                    TLRPC.User user3 = wmVar.f51306f;
                    if (i3 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = wmVar.f51466r8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.n1.m(user3, z12, z13, wmVar.getParentActivity(), wmVar.getMessagesController().b2(wmVar.f51306f.f27150id), wmVar.getAccountInstance());
                }
            } else if (wmVar.getParentActivity() != null) {
                if (i3 == 15 && org.telegram.messenger.t3.p0(wmVar.f51292e)) {
                    if (wmVar.f51475s4 != 0 && (a22 = wmVar.getMessagesController().a2(Long.valueOf(wmVar.f51475s4))) != null) {
                        org.telegram.ui.Components.t4.q(wmVar, -1, a22, wmVar.f51292e, true, new mi.d4(24, this, a22), wmVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = wmVar.f51453q8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i3 != 26) {
                    int i28 = 15;
                    if (i3 == 15) {
                        if (wmVar.h != null || (((user = wmVar.f51306f) == null || org.telegram.messenger.l10.B(user) || org.telegram.messenger.l10.x(wmVar.f51306f)) && ((chatFull = wmVar.f51453q8) == null || !chatFull.can_delete_channel))) {
                            i28 = 15;
                        }
                    }
                    if (i3 == i28) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = wmVar.f51292e;
                    TLRPC.User user4 = wmVar.f51306f;
                    if (wmVar.h == null) {
                        z16 = false;
                    }
                    org.telegram.ui.Components.t4.r(wmVar, z11, chat2, user4, z16, true, false, z10, new k2.q(this, i3, z10));
                    return;
                }
                boolean z17 = z10;
                org.telegram.ui.Components.t4.q(wmVar, -1, wmVar.f51306f, wmVar.f51292e, z17, new ni(this, z17), wmVar.getResourceProvider());
            }
        }
    }
}
