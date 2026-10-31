package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
public final class et0 implements Runnable {
    public final int f37108a;
    public final Object f37109b;
    public final Object f37110c;

    public et0(int i10, Object obj, Object obj2) {
        this.f37108a = i10;
        this.f37109b = obj;
        this.f37110c = obj2;
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
        switch (this.f37108a) {
            case 0:
                kt0 kt0Var = (kt0) this.f37109b;
                kt0Var.getClass();
                org.telegram.messenger.i0.g((String) this.f37110c);
                kt0Var.c(true);
                return;
            case 1:
                org.telegram.messenger.i0.g(org.telegram.messenger.jj.h0(((TLRPC.PollAnswer) this.f37110c).text, false));
                ((kt0) this.f37109b).c(true);
                return;
            case 2:
                kt0 kt0Var2 = (kt0) this.f37109b;
                byte[] bArr = (byte[]) this.f37110c;
                org.telegram.messenger.qz C = org.telegram.messenger.qz.C(kt0Var2.H.I1);
                org.telegram.messenger.jj jjVar = kt0Var2.H;
                if (jjVar != null && (org.telegram.messenger.jj.n1(jjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                    int f12 = jjVar.f1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().i1(B0);
                    tL_messages_deletePollAnswer.msg_id = f12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.r5 r5Var = Utilities.d;
                    Objects.requireNonNull(r5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.y3(r5Var), new org.telegram.messenger.d(C, 7));
                }
                kt0Var2.c(true);
                return;
            case 3:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.f37109b, (TLObject) this.f37110c);
                return;
            case 4:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f37109b;
                boolean[] zArr = (boolean[]) this.f37110c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.B0();
                    return;
                }
                return;
            case 5:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37109b;
                privacySettingsActivity.d = (TL_account.Password) this.f37110c;
                privacySettingsActivity.C0();
                return;
            case 6:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f37109b;
                boolean z12 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z12;
                ((org.telegram.ui.Cells.t8) this.f37110c).setChecked(z12);
                return;
            case 7:
                ((av0) this.f37109b).getMessagesController().c5(null, ((Long) this.f37110c).longValue());
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f37109b;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f37110c)[0]).f19801id);
                profileActivity.presentFragment(new un(bundle), true);
                return;
            case 9:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f37109b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f37110c;
                long j11 = profileActivity2.f33952z2;
                if (j11 != 0) {
                    TLRPC.User Z1 = profileActivity2.getMessagesController().Z1(Long.valueOf(j11));
                    profileActivity2.getMessagesController().f0(profileActivity2.f33803e1, Z1);
                    if (profileActivity2.D2 != null && Z1 != null && org.telegram.ui.Components.cc.a(profileActivity2)) {
                        org.telegram.ui.Components.cc.D(profileActivity2, Z1, profileActivity2.D2.title).j();
                    }
                    if (profileActivity2.f33908t2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.C5(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (org.telegram.messenger.i0.Q1()) {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f33803e1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().f0(profileActivity2.f33803e1, profileActivity2.getMessagesController().Z1(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.I1 = i10;
                profileActivity2.finishFragment();
                return;
            case 10:
                RectF rectF2 = ProfileActivity.R6;
                org.telegram.messenger.i0.g("https://" + ((ProfileActivity) this.f37109b).getMessagesController().U2 + "/" + org.telegram.messenger.w3.K((TLRPC.Chat) this.f37110c, false));
                return;
            case 11:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f37109b;
                RectF rectF3 = ProfileActivity.R6;
                profileActivity3.getClass();
                org.telegram.ui.Components.wb.e();
                gf.f.r(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f37110c).url);
                return;
            case 12:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f37109b;
                RectF rectF4 = ProfileActivity.R6;
                profileActivity4.D2 = profileActivity4.getMessagesStorage().O(profileActivity4.f33803e1);
                ((CountDownLatch) this.f37110c).countDown();
                return;
            case 13:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f37109b;
                RectF rectF5 = ProfileActivity.R6;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.p8) ((View) this.f37110c)).setChecked(profileActivity5.f33893r2.g());
                return;
            case 14:
                ProfileActivity profileActivity6 = (ProfileActivity) this.f37109b;
                RectF rectF6 = ProfileActivity.R6;
                profileActivity6.getClass();
                profileActivity6.F2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f37110c)).participant;
                return;
            case 15:
                ProfileActivity profileActivity7 = (ProfileActivity) this.f37109b;
                RectF rectF7 = ProfileActivity.R6;
                if (!((boolean[]) this.f37110c)[0] && (oVar = profileActivity7.f33941x5) != null) {
                    oVar.run();
                }
                profileActivity7.f33941x5 = null;
                return;
            case 16:
                fw0 fw0Var = (fw0) this.f37109b;
                a0.h hVar = (a0.h) this.f37110c;
                ProfileActivity profileActivity8 = fw0Var.R2.f37660c;
                Activity parentActivity = profileActivity8.getParentActivity();
                gx0 gx0Var = profileActivity8.f33861m5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f19797id;
                }
                org.telegram.ui.Components.cc.x(parentActivity, gx0Var, m10, j10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, fw0Var.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, fw0Var.I0)).j();
                return;
            case 17:
                uw0 uw0Var = (uw0) this.f37109b;
                a0.h hVar2 = (a0.h) this.f37110c;
                ProfileActivity profileActivity9 = uw0Var.R2;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                gx0 gx0Var2 = profileActivity9.f33861m5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f19797id;
                }
                org.telegram.ui.Components.cc.x(parentActivity2, gx0Var2, m11, j10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, uw0Var.I0), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, uw0Var.I0)).j();
                return;
            case 18:
                ((xx0) this.f37109b).e.presentFragment(ProfileActivity.z4(((Long) this.f37110c).longValue()));
                return;
            case 19:
                ?? k2Var = new org.telegram.ui.ActionBar.k2(null);
                k2Var.d = (org.telegram.ui.ActionBar.p6) this.f37110c;
                ((org.telegram.ui.ActionBar.k2) this.f37109b).presentFragment((org.telegram.ui.ActionBar.k2) k2Var);
                return;
            case 20:
                hy0 hy0Var = (hy0) this.f37109b;
                String str7 = (String) this.f37110c;
                ArrayList arrayList2 = hy0Var.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = hy0Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str8 = " ";
                String[] split = str7.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i14 = 0; i14 < split.length; i14++) {
                    String R0 = org.telegram.messenger.cd.D0().R0(split[i14], true, false);
                    strArr2[i14] = R0;
                    if (R0.equals(split[i14])) {
                        strArr2[i14] = null;
                    }
                }
                int i15 = 0;
                while (true) {
                    gy0[] gy0VarArr = hy0Var.f38053c;
                    if (i15 < gy0VarArr.length) {
                        gy0 gy0Var = gy0VarArr[i15];
                        if (gy0Var == null) {
                            i13 = i15;
                            z10 = z11;
                        } else {
                            String str9 = gy0Var.f37669a;
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
                                    if (gy0Var.f37672f == 502) {
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 < 4) {
                                                if (org.telegram.messenger.d20.i(i17).p()) {
                                                    i17++;
                                                }
                                            } else {
                                                i17 = -1;
                                            }
                                        }
                                        if (i17 < 0) {
                                        }
                                    }
                                    arrayList3.add(gy0Var);
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
                        if (hy0Var.E != null) {
                            int size = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size) {
                                org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) arrayList2.get(i18);
                                String str13 = str8 + hpVar.f15926a.toLowerCase();
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
                                                    spannableStringBuilder3 = new SpannableStringBuilder(hpVar.f15926a);
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
                                            arrayList4.add(hpVar);
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
                        org.telegram.messenger.i0.g3(new m90(hy0Var, str12, arrayList3, arrayList4, arrayList5, 19));
                        return;
                    }
                }
                break;
            case 21:
                hy0 hy0Var2 = (hy0) this.f37109b;
                ArrayList arrayList6 = (ArrayList) this.f37110c;
                hy0Var2.d.addAll(arrayList6);
                int i20 = hy0Var2.f38054f;
                org.telegram.messenger.vp.r1(i20).f18869p2 = arrayList6;
                org.telegram.messenger.vp.r1(i20).f18877q2 = hy0Var2.E;
                if (!hy0Var2.f38059x) {
                    hy0Var2.f();
                    return;
                }
                return;
            case 22:
                ly0 ly0Var = (ly0) this.f37109b;
                ly0Var.f39439f.add((ny0) this.f37110c);
                ly0Var.a();
                return;
            case 23:
                b01 b01Var = (b01) ((View[]) this.f37109b)[0];
                b01Var.f35920b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f37110c;
                b01Var.f35921c = null;
                b01Var.d = null;
                b01Var.f35922f.f30819f3.O(false);
                return;
            case 24:
                ((b01) ((View[]) this.f37109b)[0]).b((TLRPC.TL_reportResultAddComment) this.f37110c);
                return;
            case 25:
                b01 b01Var2 = (b01) ((View[]) this.f37109b)[0];
                b01Var2.f35920b = null;
                b01Var2.f35921c = (TLRPC.TL_reportResultChooseOption) this.f37110c;
                b01Var2.d = null;
                b01Var2.f35922f.f30819f3.O(false);
                return;
            case 26:
                ((org.telegram.messenger.video.a) this.f37109b).run();
                ((org.telegram.ui.Components.cc) this.f37110c).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                return;
            case 27:
                org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) this.f37109b).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                org.telegram.messenger.i0.g3((org.telegram.ui.Components.gi0) this.f37110c);
                return;
            case 28:
                ((SecretMediaViewer) this.f37109b).K = false;
                ((gs0) this.f37110c).f37627a.O0(false, true);
                return;
            default:
                ((SecretMediaViewer) ((m5.e) this.f37109b).f13014c).i((File) this.f37110c);
                return;
        }
    }

    public et0(org.telegram.ui.Components.op0 op0Var, a0.h hVar, int i10, int i11) {
        this.f37108a = i11;
        this.f37109b = op0Var;
        this.f37110c = hVar;
    }
}
