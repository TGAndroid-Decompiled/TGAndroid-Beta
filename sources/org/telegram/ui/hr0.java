package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
public final class hr0 implements Runnable {
    public final int f37853a;
    public final Object f37854b;
    public final Object f37855c;

    public hr0(int i10, Object obj, Object obj2) {
        this.f37853a = i10;
        this.f37854b = obj;
        this.f37855c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.video.o oVar;
        ArrayList arrayList;
        String str;
        int i11;
        int i12;
        String str2;
        boolean z10;
        int i13;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        SpannableStringBuilder spannableStringBuilder;
        String str6;
        long j10 = 0;
        boolean z11 = true;
        switch (this.f37853a) {
            case 0:
                fs0 fs0Var = (fs0) this.f37855c;
                ((ir0) this.f37854b).f38163r.f33604s4 = false;
                if (!fs0Var.f37230s) {
                    fs0Var.f37215a.O0(false, true);
                    return;
                }
                return;
            case 1:
                jt0 jt0Var = (jt0) this.f37854b;
                jt0Var.getClass();
                org.telegram.messenger.i0.g((String) this.f37855c);
                jt0Var.c(true);
                return;
            case 2:
                org.telegram.messenger.i0.g(org.telegram.messenger.kj.h0(((TLRPC.PollAnswer) this.f37855c).text, false));
                ((jt0) this.f37854b).c(true);
                return;
            case 3:
                jt0 jt0Var2 = (jt0) this.f37854b;
                byte[] bArr = (byte[]) this.f37855c;
                org.telegram.messenger.rz C = org.telegram.messenger.rz.C(jt0Var2.H.I1);
                org.telegram.messenger.kj kjVar = jt0Var2.H;
                if (kjVar != null && (org.telegram.messenger.kj.n1(kjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
                    int f12 = kjVar.f1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().i1(B0);
                    tL_messages_deletePollAnswer.msg_id = f12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.r5 r5Var = Utilities.d;
                    Objects.requireNonNull(r5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.y3(r5Var), new org.telegram.messenger.d(C, 7));
                }
                jt0Var2.c(true);
                return;
            case 4:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.f37854b, (TLObject) this.f37855c);
                return;
            case 5:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f37854b;
                boolean[] zArr = (boolean[]) this.f37855c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.C0();
                    return;
                }
                return;
            case 6:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37854b;
                privacySettingsActivity.d = (TL_account.Password) this.f37855c;
                privacySettingsActivity.D0();
                return;
            case 7:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f37854b;
                boolean z12 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z12;
                ((org.telegram.ui.Cells.t8) this.f37855c).setChecked(z12);
                return;
            case 8:
                ((zu0) this.f37854b).getMessagesController().c5(null, ((Long) this.f37855c).longValue());
                return;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.f37854b;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f37855c)[0]).f19802id);
                profileActivity.presentFragment(new un(bundle), true);
                return;
            case 10:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f37854b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f37855c;
                long j11 = profileActivity2.f33959z2;
                if (j11 != 0) {
                    TLRPC.User Z1 = profileActivity2.getMessagesController().Z1(Long.valueOf(j11));
                    profileActivity2.getMessagesController().f0(profileActivity2.f33810e1, Z1);
                    if (profileActivity2.D2 != null && Z1 != null && org.telegram.ui.Components.cc.a(profileActivity2)) {
                        org.telegram.ui.Components.cc.D(profileActivity2, Z1, profileActivity2.D2.title).j();
                    }
                    if (profileActivity2.f33915t2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.D5(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (org.telegram.messenger.i0.Q1()) {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f33810e1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().f0(profileActivity2.f33810e1, profileActivity2.getMessagesController().Z1(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.I1 = i10;
                profileActivity2.finishFragment();
                return;
            case 11:
                RectF rectF2 = ProfileActivity.S6;
                org.telegram.messenger.i0.g("https://" + ((ProfileActivity) this.f37854b).getMessagesController().U2 + "/" + org.telegram.messenger.w3.K((TLRPC.Chat) this.f37855c, false));
                return;
            case 12:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f37854b;
                RectF rectF3 = ProfileActivity.S6;
                profileActivity3.getClass();
                org.telegram.ui.Components.wb.e();
                gf.f.r(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f37855c).url);
                return;
            case 13:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f37854b;
                RectF rectF4 = ProfileActivity.S6;
                profileActivity4.D2 = profileActivity4.getMessagesStorage().O(profileActivity4.f33810e1);
                ((CountDownLatch) this.f37855c).countDown();
                return;
            case 14:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f37854b;
                RectF rectF5 = ProfileActivity.S6;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.p8) ((View) this.f37855c)).setChecked(profileActivity5.f33900r2.g());
                return;
            case 15:
                ProfileActivity profileActivity6 = (ProfileActivity) this.f37854b;
                RectF rectF6 = ProfileActivity.S6;
                profileActivity6.getClass();
                profileActivity6.F2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f37855c)).participant;
                return;
            case 16:
                ProfileActivity profileActivity7 = (ProfileActivity) this.f37854b;
                RectF rectF7 = ProfileActivity.S6;
                if (!((boolean[]) this.f37855c)[0] && (oVar = profileActivity7.f33948x5) != null) {
                    oVar.run();
                }
                profileActivity7.f33948x5 = null;
                return;
            case 17:
                ew0 ew0Var = (ew0) this.f37854b;
                a0.h hVar = (a0.h) this.f37855c;
                ProfileActivity profileActivity8 = ew0Var.R2.f37246c;
                Activity parentActivity = profileActivity8.getParentActivity();
                fx0 fx0Var = profileActivity8.f33868m5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f19798id;
                }
                org.telegram.ui.Components.cc.x(parentActivity, fx0Var, m10, j10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, ew0Var.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, ew0Var.I0)).j();
                return;
            case 18:
                tw0 tw0Var = (tw0) this.f37854b;
                a0.h hVar2 = (a0.h) this.f37855c;
                ProfileActivity profileActivity9 = tw0Var.R2;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                fx0 fx0Var2 = profileActivity9.f33868m5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f19798id;
                }
                org.telegram.ui.Components.cc.x(parentActivity2, fx0Var2, m11, j10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, tw0Var.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, tw0Var.I0)).j();
                return;
            case 19:
                ((wx0) this.f37854b).e.presentFragment(ProfileActivity.A4(((Long) this.f37855c).longValue()));
                return;
            case 20:
                ?? k2Var = new org.telegram.ui.ActionBar.k2(null);
                k2Var.d = (org.telegram.ui.ActionBar.p6) this.f37855c;
                ((org.telegram.ui.ActionBar.k2) this.f37854b).presentFragment((org.telegram.ui.ActionBar.k2) k2Var);
                return;
            case 21:
                gy0 gy0Var = (gy0) this.f37854b;
                String str7 = (String) this.f37855c;
                ArrayList arrayList2 = gy0Var.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = gy0Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str8 = " ";
                String[] split = str7.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i14 = 0; i14 < split.length; i14++) {
                    String R0 = org.telegram.messenger.dd.D0().R0(split[i14], true, false);
                    strArr2[i14] = R0;
                    if (R0.equals(split[i14])) {
                        strArr2[i14] = null;
                    }
                }
                int i15 = 0;
                while (true) {
                    fy0[] fy0VarArr = gy0Var.f37586c;
                    if (i15 < fy0VarArr.length) {
                        fy0 fy0Var = fy0VarArr[i15];
                        if (fy0Var == null) {
                            i13 = i15;
                            z10 = z11;
                        } else {
                            String str9 = fy0Var.f37255a;
                            z10 = z11;
                            String str10 = " " + str9.toLowerCase();
                            i13 = i15;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            int i16 = 0;
                            while (i16 < split.length) {
                                if (split[i16].length() != 0) {
                                    String str11 = split[i16];
                                    strArr = strArr2;
                                    int indexOf = str10.indexOf(" " + str11);
                                    if (indexOf < 0 && (str6 = strArr[i16]) != null) {
                                        indexOf = str10.indexOf(" ".concat(str6));
                                    } else {
                                        str6 = str11;
                                    }
                                    if (indexOf >= 0) {
                                        str3 = str10;
                                        if (spannableStringBuilder2 == null) {
                                            spannableStringBuilder = new SpannableStringBuilder(str9);
                                        } else {
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        str4 = str7;
                                        str5 = str9;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(k2Var2.getThemedColor(org.telegram.ui.ActionBar.t6.q6)), indexOf, str6.length() + indexOf, 33);
                                    } else {
                                        i15 = i13 + 1;
                                        z11 = z10;
                                        strArr2 = strArr;
                                        str7 = str7;
                                    }
                                } else {
                                    str3 = str10;
                                    strArr = strArr2;
                                    str4 = str7;
                                    str5 = str9;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i16 == split.length - 1) {
                                    if (fy0Var.f37258f == 502) {
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 < 4) {
                                                if (org.telegram.messenger.e20.i(i17).p()) {
                                                    i17++;
                                                }
                                            } else {
                                                i17 = -1;
                                            }
                                        }
                                        if (i17 < 0) {
                                        }
                                    }
                                    arrayList3.add(fy0Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i16++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                strArr2 = strArr;
                                str10 = str3;
                                str9 = str5;
                                str7 = str4;
                            }
                        }
                        strArr = strArr2;
                        i15 = i13 + 1;
                        z11 = z10;
                        strArr2 = strArr;
                        str7 = str7;
                    } else {
                        String[] strArr3 = strArr2;
                        String str12 = str7;
                        if (gy0Var.E != null) {
                            int size = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size) {
                                org.telegram.messenger.ip ipVar = (org.telegram.messenger.ip) arrayList2.get(i18);
                                String str13 = str8 + ipVar.f16319a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                int i19 = 0;
                                while (true) {
                                    if (i19 < split.length) {
                                        if (split[i19].length() != 0) {
                                            String str14 = split[i19];
                                            arrayList = arrayList2;
                                            int indexOf2 = str13.indexOf(str8 + str14);
                                            if (indexOf2 < 0 && (str2 = strArr3[i19]) != null) {
                                                str14 = str2;
                                                i12 = str13.indexOf(str8.concat(str2));
                                            } else {
                                                i12 = indexOf2;
                                            }
                                            if (i12 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    str = str8;
                                                    spannableStringBuilder3 = new SpannableStringBuilder(ipVar.f16319a);
                                                } else {
                                                    str = str8;
                                                }
                                                i11 = size;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(k2Var2.getThemedColor(org.telegram.ui.ActionBar.t6.q6)), i12, str14.length() + i12, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            str = str8;
                                            i11 = size;
                                        }
                                        if (spannableStringBuilder3 != null && i19 == split.length - 1) {
                                            arrayList4.add(ipVar);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i19++;
                                        size = i11;
                                        arrayList2 = arrayList;
                                        str8 = str;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i18++;
                                size = size;
                                arrayList2 = arrayList;
                                str8 = str8;
                            }
                        }
                        org.telegram.messenger.i0.g3(new l90(gy0Var, str12, arrayList3, arrayList4, arrayList5, 19));
                        return;
                    }
                }
                break;
            case 22:
                gy0 gy0Var2 = (gy0) this.f37854b;
                ArrayList arrayList6 = (ArrayList) this.f37855c;
                gy0Var2.d.addAll(arrayList6);
                int i20 = gy0Var2.f37587f;
                org.telegram.messenger.wp.r1(i20).f19212p2 = arrayList6;
                org.telegram.messenger.wp.r1(i20).f19220q2 = gy0Var2.E;
                if (!gy0Var2.f37592x) {
                    gy0Var2.f();
                    return;
                }
                return;
            case 23:
                ky0 ky0Var = (ky0) this.f37854b;
                ky0Var.f39029f.add((my0) this.f37855c);
                ky0Var.a();
                return;
            case 24:
                a01 a01Var = (a01) ((View[]) this.f37854b)[0];
                a01Var.f35505b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f37855c;
                a01Var.f35506c = null;
                a01Var.d = null;
                a01Var.f35507f.f31183f3.O(false);
                return;
            case 25:
                ((a01) ((View[]) this.f37854b)[0]).b((TLRPC.TL_reportResultAddComment) this.f37855c);
                return;
            case 26:
                a01 a01Var2 = (a01) ((View[]) this.f37854b)[0];
                a01Var2.f35505b = null;
                a01Var2.f35506c = (TLRPC.TL_reportResultChooseOption) this.f37855c;
                a01Var2.d = null;
                a01Var2.f35507f.f31183f3.O(false);
                return;
            case 27:
                ((org.telegram.messenger.video.a) this.f37854b).run();
                ((org.telegram.ui.Components.cc) this.f37855c).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                return;
            case 28:
                org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) this.f37854b).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                org.telegram.messenger.i0.g3((org.telegram.ui.Components.hi0) this.f37855c);
                return;
            default:
                ((SecretMediaViewer) this.f37854b).K = false;
                ((fs0) this.f37855c).f37215a.O0(false, true);
                return;
        }
    }

    public hr0(org.telegram.ui.Components.pp0 pp0Var, a0.h hVar, int i10, int i11) {
        this.f37853a = i11;
        this.f37854b = pp0Var;
        this.f37855c = hVar;
    }
}
