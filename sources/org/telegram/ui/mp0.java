package org.telegram.ui;

import android.animation.AnimatorSet;
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
public final class mp0 implements Runnable {
    public final int f50094a;
    public final Object f50095b;
    public final Object f50096c;

    public mp0(int i7, Object obj, Object obj2) {
        this.f50094a = i7;
        this.f50095b = obj;
        this.f50096c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        View D;
        float f10;
        ai.f2 f2Var;
        ArrayList arrayList;
        int i10;
        String str;
        int i11;
        String str2;
        boolean z10;
        int i12;
        String str3;
        String str4;
        String[] strArr;
        String str5;
        SpannableStringBuilder spannableStringBuilder;
        String str6;
        long j3 = 0;
        boolean z11 = true;
        switch (this.f50094a) {
            case 0:
                np0 np0Var = (np0) this.f50095b;
                org.telegram.ui.Components.h61 h61Var = (org.telegram.ui.Components.h61) this.f50096c;
                np0Var.getClass();
                if (h61Var.U() > 0 && h61Var.S() >= h61Var.U() - 590) {
                    np0Var.f50389a.f43334f0.invalidate();
                    return;
                }
                return;
            case 1:
                qp0 qp0Var = (qp0) this.f50095b;
                tg.t0 t0Var = (tg.t0) this.f50096c;
                t0Var.f58236e.h();
                t0Var.f58235c.postRunnable(new cd0(24));
                try {
                    qp0Var.f51503b.f43334f0.removeView(t0Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 2:
                ((aq0) this.f50095b).f45797r.f43444r7.d();
                ((AnimatorSet) this.f50096c).start();
                return;
            case 3:
                wq0 wq0Var = (wq0) this.f50096c;
                ((aq0) this.f50095b).f45797r.f43451s4 = false;
                if (!wq0Var.f53742s) {
                    wq0Var.f53726a.P0(false, true);
                    return;
                }
                return;
            case 4:
                zr0 zr0Var = (zr0) this.f50095b;
                zr0Var.getClass();
                org.telegram.messenger.g0.g((String) this.f50096c);
                zr0Var.c(true);
                return;
            case 5:
                zr0 zr0Var2 = (zr0) this.f50095b;
                zr0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.fj.h0(((TLRPC.PollAnswer) this.f50096c).text, false));
                zr0Var2.c(true);
                return;
            case 6:
                zr0 zr0Var3 = (zr0) this.f50095b;
                byte[] bArr = (byte[]) this.f50096c;
                org.telegram.messenger.zy C = org.telegram.messenger.zy.C(zr0Var3.I.K1);
                org.telegram.messenger.fj fjVar = zr0Var3.I;
                if (fjVar != null && (org.telegram.messenger.fj.m1(fjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                    int e12 = fjVar.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().l1(B0);
                    tL_messages_deletePollAnswer.msg_id = e12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.q5 q5Var = Utilities.d;
                    Objects.requireNonNull(q5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.x3(q5Var), new org.telegram.messenger.d(C, 7));
                }
                zr0Var3.c(true);
                return;
            case 7:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.f50095b, (TLObject) this.f50096c);
                return;
            case 8:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f50095b;
                boolean[] zArr = (boolean[]) this.f50096c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    return;
                }
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f50095b;
                privacySettingsActivity.d = (TL_account.Password) this.f50096c;
                privacySettingsActivity.D0();
                return;
            case 10:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f50095b;
                boolean z12 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z12;
                ((org.telegram.ui.Cells.r8) this.f50096c).setChecked(z12);
                return;
            case 11:
                ((rt0) this.f50095b).getMessagesController().r5(null, ((Long) this.f50096c).longValue());
                return;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) this.f50095b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f50096c)[0]).f28500id);
                profileActivity.presentFragment(new bn(bundle), true);
                return;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f50095b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f50096c;
                long j10 = profileActivity2.B2;
                if (j10 != 0) {
                    TLRPC.User c22 = profileActivity2.getMessagesController().c2(Long.valueOf(j10));
                    profileActivity2.getMessagesController().f0(profileActivity2.f43674f1, c22);
                    if (profileActivity2.F2 != null && c22 != null && org.telegram.ui.Components.kc.a(profileActivity2)) {
                        org.telegram.ui.Components.kc.D(profileActivity2, c22, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.f43783v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.H5(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (org.telegram.messenger.g0.Q1()) {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f43674f1));
                } else {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().f0(profileActivity2.f43674f1, profileActivity2.getMessagesController().c2(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.J1 = i7;
                profileActivity2.finishFragment();
                return;
            case 14:
                RectF rectF2 = ProfileActivity.Z6;
                org.telegram.messenger.g0.g("https://" + ((ProfileActivity) this.f50095b).getMessagesController().X2 + "/" + org.telegram.messenger.v3.K((TLRPC.Chat) this.f50096c, false));
                return;
            case 15:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f50095b;
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity3.getClass();
                org.telegram.ui.Components.fc.e();
                vf.c.t(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f50096c).url);
                return;
            case 16:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f50095b;
                RectF rectF4 = ProfileActivity.Z6;
                org.telegram.ui.Components.vn vnVar = ((org.telegram.ui.Components.zn) this.f50096c).f42934e;
                bx bxVar = profileActivity4.f43718l5;
                if (bxVar != null && bxVar.getFragmentView() != null) {
                    D = profileActivity4.f43718l5.getFragmentView();
                } else {
                    D = profileActivity4.f43724m5.D();
                }
                RectF rectF5 = profileActivity4.f43719l6;
                if (jh.k.c(vnVar, D, rectF5)) {
                    f10 = rectF5.left;
                } else {
                    f10 = 0.0f;
                }
                profileActivity4.f43713k6 = f10;
                profileActivity4.d4();
                return;
            case 17:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f50095b;
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity5.F2 = profileActivity5.getMessagesStorage().O(profileActivity5.f43674f1);
                ((CountDownLatch) this.f50096c).countDown();
                return;
            case 18:
                ProfileActivity profileActivity6 = (ProfileActivity) this.f50095b;
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.m8) ((View) this.f50096c)).setChecked(profileActivity6.f43770t2.g());
                return;
            case 19:
                ProfileActivity profileActivity7 = (ProfileActivity) this.f50095b;
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity7.getClass();
                profileActivity7.H2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f50096c)).participant;
                return;
            case 20:
                ProfileActivity profileActivity8 = (ProfileActivity) this.f50095b;
                RectF rectF9 = ProfileActivity.Z6;
                if (!((boolean[]) this.f50096c)[0] && (f2Var = profileActivity8.D5) != null) {
                    f2Var.run();
                }
                profileActivity8.D5 = null;
                return;
            case 21:
                uu0 uu0Var = (uu0) this.f50095b;
                a0.h hVar = (a0.h) this.f50096c;
                ProfileActivity profileActivity9 = uu0Var.V2.f53035c;
                Activity parentActivity = profileActivity9.getParentActivity();
                sv0 sv0Var = profileActivity9.s5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f28496id;
                }
                org.telegram.ui.Components.kc.x(parentActivity, sv0Var, m10, j3, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, uu0Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, uu0Var.J0)).j();
                return;
            case 22:
                jv0 jv0Var = (jv0) this.f50095b;
                a0.h hVar2 = (a0.h) this.f50096c;
                ProfileActivity profileActivity10 = jv0Var.V2;
                Activity parentActivity2 = profileActivity10.getParentActivity();
                sv0 sv0Var2 = profileActivity10.s5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar2.n(0)).f28496id;
                }
                org.telegram.ui.Components.kc.x(parentActivity2, sv0Var2, m11, j3, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, jv0Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, jv0Var.J0)).j();
                return;
            case 23:
                ((jw0) this.f50095b).f49218e.presentFragment(ProfileActivity.D4(((Long) this.f50096c).longValue()));
                return;
            case 24:
                ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                g2Var.d = (org.telegram.ui.ActionBar.i6) this.f50096c;
                ((org.telegram.ui.ActionBar.g2) this.f50095b).presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
                return;
            case 25:
                uw0 uw0Var = (uw0) this.f50095b;
                String str7 = (String) this.f50096c;
                ArrayList arrayList2 = uw0Var.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = uw0Var.f52743e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str8 = " ";
                String[] split = str7.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    String T0 = org.telegram.messenger.gd.E0().T0(split[i13], true, false);
                    strArr2[i13] = T0;
                    if (T0.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                }
                int i14 = 0;
                while (true) {
                    tw0[] tw0VarArr = uw0Var.f52742c;
                    if (i14 < tw0VarArr.length) {
                        tw0 tw0Var = tw0VarArr[i14];
                        if (tw0Var == null) {
                            i12 = i14;
                            z10 = z11;
                        } else {
                            String str9 = tw0Var.f52489a;
                            z10 = z11;
                            String str10 = " " + str9.toLowerCase();
                            i12 = i14;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            int i15 = 0;
                            while (i15 < split.length) {
                                if (split[i15].length() != 0) {
                                    String str11 = split[i15];
                                    str4 = str7;
                                    int indexOf = str10.indexOf(" " + str11);
                                    if (indexOf < 0 && (str6 = strArr2[i15]) != null) {
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
                                        strArr = strArr2;
                                        str5 = str9;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.n6.f29691q6)), indexOf, str6.length() + indexOf, 33);
                                    } else {
                                        i14 = i12 + 1;
                                        z11 = z10;
                                        str7 = str4;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str3 = str10;
                                    str4 = str7;
                                    strArr = strArr2;
                                    str5 = str9;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i15 == split.length - 1) {
                                    if (tw0Var.f52493f == 502) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 < 4) {
                                                if (org.telegram.messenger.i10.i(i16).p()) {
                                                    i16++;
                                                }
                                            } else {
                                                i16 = -1;
                                            }
                                        }
                                        if (i16 < 0) {
                                        }
                                    }
                                    arrayList3.add(tw0Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i15++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                str7 = str4;
                                str10 = str3;
                                str9 = str5;
                                strArr2 = strArr;
                            }
                        }
                        str4 = str7;
                        i14 = i12 + 1;
                        z11 = z10;
                        str7 = str4;
                        strArr2 = strArr2;
                    } else {
                        String str12 = str7;
                        String[] strArr3 = strArr2;
                        if (uw0Var.F != null) {
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                org.telegram.messenger.yo yoVar = (org.telegram.messenger.yo) arrayList2.get(i17);
                                String str13 = str8 + yoVar.f28269a.toLowerCase();
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                int i18 = 0;
                                while (true) {
                                    if (i18 < split.length) {
                                        if (split[i18].length() != 0) {
                                            String str14 = split[i18];
                                            arrayList = arrayList2;
                                            int indexOf2 = str13.indexOf(str8 + str14);
                                            if (indexOf2 < 0 && (str2 = strArr3[i18]) != null) {
                                                str14 = str2;
                                                i11 = str13.indexOf(str8.concat(str2));
                                            } else {
                                                i11 = indexOf2;
                                            }
                                            if (i11 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    i10 = size;
                                                    spannableStringBuilder3 = new SpannableStringBuilder(yoVar.f28269a);
                                                } else {
                                                    i10 = size;
                                                }
                                                str = str8;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(g2Var2.getThemedColor(org.telegram.ui.ActionBar.n6.f29691q6)), i11, str14.length() + i11, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            i10 = size;
                                            str = str8;
                                        }
                                        if (spannableStringBuilder3 != null && i18 == split.length - 1) {
                                            arrayList4.add(yoVar);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i18++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                        str8 = str;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i17++;
                                size = size;
                                arrayList2 = arrayList;
                                str8 = str8;
                            }
                        }
                        org.telegram.messenger.g0.g3(new eu0(uw0Var, str12, arrayList3, arrayList4, arrayList5, 3));
                        return;
                    }
                }
                break;
            case 26:
                uw0 uw0Var2 = (uw0) this.f50095b;
                ArrayList arrayList6 = (ArrayList) this.f50096c;
                uw0Var2.d.addAll(arrayList6);
                int i19 = uw0Var2.f52744f;
                org.telegram.messenger.mp.u1(i19).f25852s2 = arrayList6;
                org.telegram.messenger.mp.u1(i19).f25860t2 = uw0Var2.F;
                if (!uw0Var2.f52749x) {
                    uw0Var2.f();
                    return;
                }
                return;
            case 27:
                yw0 yw0Var = (yw0) this.f50095b;
                yw0Var.f54441f.add((ax0) this.f50096c);
                yw0Var.a();
                return;
            case 28:
                oy0 oy0Var = (oy0) ((View[]) this.f50095b)[0];
                oy0Var.f50786b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f50096c;
                oy0Var.f50787c = null;
                oy0Var.d = null;
                oy0Var.f50789f.f35323g3.O(false);
                return;
            default:
                ((oy0) ((View[]) this.f50095b)[0]).b((TLRPC.TL_reportResultAddComment) this.f50096c);
                return;
        }
    }

    public mp0(org.telegram.ui.Components.zo0 zo0Var, a0.h hVar, int i7, int i10) {
        this.f50094a = i10;
        this.f50095b = zo0Var;
        this.f50096c = hVar;
    }
}
