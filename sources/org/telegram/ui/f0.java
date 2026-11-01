package org.telegram.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class f0 implements org.telegram.messenger.k20 {
    public final int f36941a;
    public final int f36942b;
    public final Object f36943c;
    public final Object d;
    public final Object e;

    public f0(int i10, org.telegram.ui.ActionBar.k2 k2Var, gf.e eVar, org.telegram.ui.ActionBar.x1 x1Var) {
        this.f36941a = 6;
        this.f36942b = i10;
        this.f36943c = k2Var;
        this.d = eVar;
        this.e = x1Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10 = this.f36941a;
        TLRPC.WebPage webPage = null;
        int i11 = this.f36942b;
        boolean z11 = false;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f36943c;
        switch (i10) {
            case 0:
                c1 c1Var = (c1) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i12 = this.f36942b;
                if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new ag.g3(c1Var, i12, tL_error, tL_channels_joinChannel, 8));
                    return;
                }
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    int i13 = 0;
                    while (true) {
                        if (i13 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i13);
                            if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                z10 = true;
                            } else {
                                i13++;
                            }
                        } else {
                            z10 = false;
                        }
                    }
                    org.telegram.messenger.wp.r1(i12).L3(updates, false);
                    z11 = z10;
                } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.i0.g3(new ag.o0(i12, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat, 15));
                    z11 = true;
                }
                if (!z11) {
                    org.telegram.messenger.wp.r1(i12).B0(chat.f19794id, true);
                }
                org.telegram.messenger.i0.g3(new qr0(c1Var, 5));
                org.telegram.messenger.i0.h3(new ag.d3(i12, chat, 12), 1000L);
                org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(i12);
                long j10 = chat.f19794id;
                a02.R1(-j10, j10, new ArrayList(), null);
                return;
            case 1:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj5;
                org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = g0Var.f26263y2;
                g0Var.I2 = -1;
                g0Var.J2 = false;
                if (tL_error2 != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text))) {
                    new org.telegram.ui.Components.cc(frameLayout, g0Var.I0).I(2131624214, org.telegram.messenger.dd.L0(2131754989, null), org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131754990, null))).j();
                    g0Var.C2 = true;
                    g0Var.u1(true);
                    return;
                } else if (tL_error2 != null) {
                    org.telegram.ui.Cells.f1.s(frameLayout, g0Var.I0, tL_error2, false);
                    u5Var.i(null);
                    g0Var.B2 = true;
                    g0Var.C2 = false;
                    g0Var.u1(true);
                    return;
                } else if (tL_composedMessageWithAI == null) {
                    u5Var.i(null);
                    g0Var.B2 = true;
                    g0Var.C2 = false;
                    g0Var.u1(true);
                    return;
                } else {
                    u5Var.i(null);
                    g0Var.C2 = false;
                    g0Var.u1(true);
                    g0Var.K2[i11] = tL_messages_composeMessageWithAI;
                    if (i11 == 0) {
                        g0Var.R1 = false;
                        g0Var.S1 = org.telegram.messenger.kj.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i11 == 1) {
                        g0Var.U1 = false;
                        g0Var.V1 = org.telegram.messenger.kj.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i11 == 2) {
                        g0Var.X1 = false;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                        if (tL_textWithEntities != null) {
                            g0Var.Y1 = org.telegram.messenger.kj.h0(tL_textWithEntities, false);
                            g0Var.a2 = org.telegram.messenger.kj.h0(tL_composedMessageWithAI.result_text, false);
                        } else {
                            Spannable h02 = org.telegram.messenger.kj.h0(tL_composedMessageWithAI.result_text, false);
                            g0Var.a2 = h02;
                            g0Var.Y1 = h02;
                        }
                    }
                    g0Var.G2.O(true);
                    return;
                }
            case 2:
                org.telegram.ui.Components.g0 g0Var2 = (org.telegram.ui.Components.g0) obj5;
                org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = g0Var2.f26263y2;
                g0Var2.I2 = -1;
                g0Var2.J2 = false;
                if (tL_error3 != null && ("SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error3.text) || "AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error3.text))) {
                    new org.telegram.ui.Components.cc(frameLayout2, g0Var2.I0).I(2131624214, org.telegram.messenger.dd.L0(2131754989, null), org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131754990, null))).j();
                    g0Var2.C2 = true;
                    g0Var2.u1(true);
                    return;
                } else if (tL_error3 != null) {
                    org.telegram.ui.Cells.f1.s(frameLayout2, g0Var2.I0, tL_error3, false);
                    u5Var2.i(null);
                    g0Var2.B2 = true;
                    g0Var2.C2 = false;
                    g0Var2.u1(true);
                    return;
                } else if (tL_composedRichMessageWithAI == null) {
                    u5Var2.i(null);
                    g0Var2.B2 = true;
                    g0Var2.C2 = false;
                    g0Var2.u1(true);
                    return;
                } else {
                    u5Var2.i(null);
                    g0Var2.C2 = false;
                    g0Var2.u1(true);
                    g0Var2.L2[i11] = tL_messages_composeRichMessageWithAI;
                    if (i11 == 0) {
                        g0Var2.R1 = false;
                        g0Var2.T1 = tL_composedRichMessageWithAI.result;
                    } else if (i11 == 1) {
                        g0Var2.U1 = false;
                        g0Var2.W1 = tL_composedRichMessageWithAI.result;
                    } else if (i11 == 2) {
                        g0Var2.X1 = false;
                        g0Var2.Z1 = tL_composedRichMessageWithAI.result;
                    }
                    g0Var2.G2.O(true);
                    return;
                }
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                org.telegram.messenger.k20 k20Var = (org.telegram.messenger.k20) obj3;
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr[0]) {
                    if (str != null) {
                        arrayList.set(i11, str);
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            if (arrayList.get(i14) == null) {
                                return;
                            }
                        }
                        zArr[0] = true;
                        k20Var.a(TextUtils.join("", arrayList), Boolean.FALSE);
                        return;
                    }
                    zArr[0] = true;
                    k20Var.a(null, bool);
                    return;
                }
                return;
            case 4:
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                ((vh.d) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    if ("EMPTY".equalsIgnoreCase(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        String L0 = org.telegram.messenger.dd.L0(2131747648, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.dd.L0(2131747649, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                        x1Var.setOnDismissListener(new q5(z2Var, 9));
                        alertDialog$Builder.p();
                        return;
                    }
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        if (str2 != null) {
                            new org.telegram.ui.Components.cc(z2Var.E, z2Var.I0).e0(str2, false);
                            return;
                        } else if (passkey != null) {
                            org.telegram.messenger.wp.r1(i11).h4(0L, "SETUP_PASSKEY");
                            if (T instanceof PasskeysActivity) {
                                z2Var.dismiss();
                                ((PasskeysActivity) T).d0(passkey);
                                return;
                            } else if (T instanceof PrivacySettingsActivity) {
                                z2Var.dismiss();
                                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) T;
                                ArrayList arrayList2 = privacySettingsActivity.e;
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(passkey);
                                privacySettingsActivity.F0(true);
                                T.presentFragment(new PasskeysActivity(arrayList2));
                                return;
                            } else {
                                ConnectionsManager.getInstance(i11).sendRequestTyped(new TL_account.getPasskeys(), new a3.b(1), new n6(z2Var, passkey, str2, 3));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str3 = (String) obj2;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j11 = wallettransaction.fee;
                    if (j11 > 0) {
                        textView.setText(org.telegram.ui.Wallet.b6.w0(i11, j11, p6Var));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj5;
                gf.e eVar = (gf.e) obj4;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error4 == null) {
                    org.telegram.messenger.wp.r1(i11).L3(updates2, false);
                }
                org.telegram.messenger.i0.g3(new ox0((Object) k2Var, tL_error4, (Object) eVar, (Object) x1Var2, 16));
                return;
            case 7:
                boolean[] zArr2 = (boolean[]) obj5;
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj3;
                Long l4 = (Long) obj;
                String str4 = (String) obj2;
                if (l4 != null && l4.longValue() != 0) {
                    int i15 = this.f36942b;
                    org.telegram.messenger.y9.c(i15).j(l4.longValue(), new f90(zArr2, context2, p6Var2, i15, str4, 1));
                    return;
                }
                zArr2[0] = false;
                return;
            case 8:
                xh.u0 u0Var = (xh.u0) obj4;
                org.telegram.messenger.vs[] vsVarArr = (org.telegram.messenger.vs[]) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage2 = messageMedia.webpage;
                    if (!(webPage2 instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage2 instanceof TLRPC.TL_webPagePending) {
                                long j12 = webPage2.f19949id;
                                int i16 = this.f36942b;
                                xh.v0 v0Var = new xh.v0(j12, vsVarArr, i16, u0Var);
                                vsVarArr[0] = v0Var;
                                org.telegram.messenger.at.f(i16).b(v0Var, 59);
                                return;
                            }
                            if (webPage2 instanceof TLRPC.TL_webPage) {
                                webPage = webPage2;
                            }
                            u0Var.a(webPage);
                            return;
                        }
                        u0Var.a(null);
                        return;
                    }
                }
                u0Var.a(null);
                return;
            default:
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj5;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.x1 x1Var3 = x1VarArr[0];
                if (x1Var3 != null) {
                    x1Var3.dismiss();
                    x1VarArr[0] = null;
                }
                if (tL_error6 != null) {
                    org.telegram.ui.Components.cc.a0(k2Var2).f0(tL_error6, false);
                    return;
                } else if (arrayList3 != null) {
                    if (arrayList3.isEmpty()) {
                        org.telegram.messenger.m5.n(null, 2131751905, org.telegram.ui.Components.cc.a0(k2Var2), 2131624066, 36);
                        return;
                    } else if (!arrayList3.isEmpty()) {
                        k2Var2.showDialog(new yh.z(k2Var2, 0L, arrayList3, new jg.o2(k2Var2, chat2, i11, 6)));
                        return;
                    } else {
                        org.telegram.ui.Components.cc.a0(k2Var2).Q(2131624066, 36, "").j();
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public f0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f36941a = i11;
        this.f36943c = obj;
        this.f36942b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public f0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f36941a = i11;
        this.f36943c = obj;
        this.d = obj2;
        this.f36942b = i10;
        this.e = obj3;
    }

    public f0(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f36941a = i11;
        this.f36943c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f36942b = i10;
    }
}
