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
    public final int f49306a;
    public final Object f49307b;
    public final Object f49308c;

    public mp0(int i7, Object obj, Object obj2) {
        this.f49306a = i7;
        this.f49307b = obj;
        this.f49308c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        View D;
        float f10;
        ai.k2 k2Var;
        ArrayList arrayList;
        String str;
        int i10;
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
        switch (this.f49306a) {
            case 0:
                op0 op0Var = (op0) this.f49307b;
                tg.o0 o0Var = (tg.o0) this.f49308c;
                o0Var.f57477e.h();
                o0Var.f57476c.postRunnable(new ah0(21));
                try {
                    op0Var.f50044b.f42763f0.removeView(o0Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 1:
                ((yp0) this.f49307b).f53612r.f42820l7.d();
                ((AnimatorSet) this.f49308c).start();
                return;
            case 2:
                uq0 uq0Var = (uq0) this.f49308c;
                ((yp0) this.f49307b).f53612r.f42880s4 = false;
                if (!uq0Var.f52015s) {
                    uq0Var.f51999a.O0(false, true);
                    return;
                }
                return;
            case 3:
                xr0 xr0Var = (xr0) this.f49307b;
                xr0Var.getClass();
                org.telegram.messenger.g0.g((String) this.f49308c);
                xr0Var.c(true);
                return;
            case 4:
                xr0 xr0Var2 = (xr0) this.f49307b;
                xr0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.gj.h0(((TLRPC.PollAnswer) this.f49308c).text, false));
                xr0Var2.c(true);
                return;
            case 5:
                xr0 xr0Var3 = (xr0) this.f49307b;
                byte[] bArr = (byte[]) this.f49308c;
                org.telegram.messenger.ez C = org.telegram.messenger.ez.C(xr0Var3.I.K1);
                org.telegram.messenger.gj gjVar = xr0Var3.I;
                if (gjVar != null && (org.telegram.messenger.gj.m1(gjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
                    int e12 = gjVar.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().j1(B0);
                    tL_messages_deletePollAnswer.msg_id = e12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.p5 p5Var = Utilities.d;
                    Objects.requireNonNull(p5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.d(C, 7));
                }
                xr0Var3.c(true);
                return;
            case 6:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.f49307b, (TLObject) this.f49308c);
                return;
            case 7:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f49307b;
                boolean[] zArr = (boolean[]) this.f49308c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    return;
                }
                return;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f49307b;
                privacySettingsActivity.d = (TL_account.Password) this.f49308c;
                privacySettingsActivity.D0();
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.f49307b;
                boolean z12 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z12;
                ((org.telegram.ui.Cells.q8) this.f49308c).setChecked(z12);
                return;
            case 10:
                ((pt0) this.f49307b).getMessagesController().g5(null, ((Long) this.f49308c).longValue());
                return;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) this.f49307b;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) this.f49308c)[0]).f28059id);
                profileActivity.presentFragment(new an(bundle), true);
                return;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f49307b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.f49308c;
                long j10 = profileActivity2.B2;
                if (j10 != 0) {
                    TLRPC.User a22 = profileActivity2.getMessagesController().a2(Long.valueOf(j10));
                    profileActivity2.getMessagesController().f0(profileActivity2.f43102f1, a22);
                    if (profileActivity2.F2 != null && a22 != null && org.telegram.ui.Components.cc.a(profileActivity2)) {
                        org.telegram.ui.Components.cc.D(profileActivity2, a22, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.f43211v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.G5(true, false);
                        return;
                    }
                    return;
                }
                profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                if (org.telegram.messenger.g0.Q1()) {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f43102f1));
                } else {
                    i7 = 0;
                    profileActivity2.getNotificationCenter().k(4, new Object[0]);
                }
                profileActivity2.getMessagesController().f0(profileActivity2.f43102f1, profileActivity2.getMessagesController().a2(Long.valueOf(profileActivity2.getUserConfig().e())));
                profileActivity2.J1 = i7;
                profileActivity2.finishFragment();
                return;
            case 13:
                RectF rectF2 = ProfileActivity.X6;
                org.telegram.messenger.g0.g("https://" + ((ProfileActivity) this.f49307b).getMessagesController().V2 + "/" + org.telegram.messenger.t3.K((TLRPC.Chat) this.f49308c, false));
                return;
            case 14:
                ProfileActivity profileActivity3 = (ProfileActivity) this.f49307b;
                RectF rectF3 = ProfileActivity.X6;
                profileActivity3.getClass();
                org.telegram.ui.Components.xb.e();
                vf.c.t(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f49308c).url);
                return;
            case 15:
                ProfileActivity profileActivity4 = (ProfileActivity) this.f49307b;
                RectF rectF4 = ProfileActivity.X6;
                org.telegram.ui.Components.on onVar = ((org.telegram.ui.Components.sn) this.f49308c).f39353e;
                yw ywVar = profileActivity4.f43133j5;
                if (ywVar != null && ywVar.getFragmentView() != null) {
                    D = profileActivity4.f43133j5.getFragmentView();
                } else {
                    D = profileActivity4.f43140k5.D();
                }
                RectF rectF5 = profileActivity4.f43134j6;
                if (jh.k.c(onVar, D, rectF5)) {
                    f10 = rectF5.left;
                } else {
                    f10 = 0.0f;
                }
                profileActivity4.f43128i6 = f10;
                profileActivity4.c4();
                return;
            case 16:
                ProfileActivity profileActivity5 = (ProfileActivity) this.f49307b;
                RectF rectF6 = ProfileActivity.X6;
                profileActivity5.F2 = profileActivity5.getMessagesStorage().O(profileActivity5.f43102f1);
                ((CountDownLatch) this.f49308c).countDown();
                return;
            case 17:
                ProfileActivity profileActivity6 = (ProfileActivity) this.f49307b;
                RectF rectF7 = ProfileActivity.X6;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.l8) ((View) this.f49308c)).setChecked(profileActivity6.f43198t2.g());
                return;
            case 18:
                ProfileActivity profileActivity7 = (ProfileActivity) this.f49307b;
                RectF rectF8 = ProfileActivity.X6;
                profileActivity7.getClass();
                profileActivity7.H2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) this.f49308c)).participant;
                return;
            case 19:
                ProfileActivity profileActivity8 = (ProfileActivity) this.f49307b;
                RectF rectF9 = ProfileActivity.X6;
                if (!((boolean[]) this.f49308c)[0] && (k2Var = profileActivity8.B5) != null) {
                    k2Var.run();
                }
                profileActivity8.B5 = null;
                return;
            case 20:
                tu0 tu0Var = (tu0) this.f49307b;
                a0.h hVar = (a0.h) this.f49308c;
                ProfileActivity profileActivity9 = tu0Var.V2.f52032c;
                Activity parentActivity = profileActivity9.getParentActivity();
                sv0 sv0Var = profileActivity9.f43179q5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f28055id;
                }
                org.telegram.ui.Components.cc.x(parentActivity, sv0Var, m10, j3, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.wj, tu0Var.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, tu0Var.J0)).j();
                return;
            case 21:
                iv0 iv0Var = (iv0) this.f49307b;
                a0.h hVar2 = (a0.h) this.f49308c;
                ProfileActivity profileActivity10 = iv0Var.V2;
                Activity parentActivity2 = profileActivity10.getParentActivity();
                sv0 sv0Var2 = profileActivity10.f43179q5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar2.n(0)).f28055id;
                }
                org.telegram.ui.Components.cc.x(parentActivity2, sv0Var2, m11, j3, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.wj, iv0Var.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, iv0Var.J0)).j();
                return;
            case 22:
                ((iw0) this.f49307b).f48138e.presentFragment(ProfileActivity.C4(((Long) this.f49308c).longValue()));
                return;
            case 23:
                ?? e2Var = new org.telegram.ui.ActionBar.e2(null);
                e2Var.d = (org.telegram.ui.ActionBar.e6) this.f49308c;
                ((org.telegram.ui.ActionBar.e2) this.f49307b).presentFragment((org.telegram.ui.ActionBar.e2) e2Var);
                return;
            case 24:
                sw0 sw0Var = (sw0) this.f49307b;
                String str7 = (String) this.f49308c;
                ArrayList arrayList2 = sw0Var.d;
                org.telegram.ui.ActionBar.e2 e2Var2 = sw0Var.f51287e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str8 = " ";
                String[] split = str7.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i13 = 0; i13 < split.length; i13++) {
                    String S0 = org.telegram.messenger.hd.E0().S0(split[i13], true, false);
                    strArr2[i13] = S0;
                    if (S0.equals(split[i13])) {
                        strArr2[i13] = null;
                    }
                }
                int i14 = 0;
                while (true) {
                    rw0[] rw0VarArr = sw0Var.f51286c;
                    if (i14 < rw0VarArr.length) {
                        rw0 rw0Var = rw0VarArr[i14];
                        if (rw0Var == null) {
                            i12 = i14;
                            z10 = z11;
                        } else {
                            String str9 = rw0Var.f51043a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(e2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f29089q6)), indexOf, str6.length() + indexOf, 33);
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
                                    if (rw0Var.f51047f == 502) {
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 < 4) {
                                                if (org.telegram.messenger.m10.i(i16).p()) {
                                                    i16++;
                                                }
                                            } else {
                                                i16 = -1;
                                            }
                                        }
                                        if (i16 < 0) {
                                        }
                                    }
                                    arrayList3.add(rw0Var);
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
                        if (sw0Var.F != null) {
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                org.telegram.messenger.zo zoVar = (org.telegram.messenger.zo) arrayList2.get(i17);
                                String str13 = str8 + zoVar.f27980a.toLowerCase();
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
                                                    str = str8;
                                                    spannableStringBuilder3 = new SpannableStringBuilder(zoVar.f27980a);
                                                } else {
                                                    str = str8;
                                                }
                                                i10 = size;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(e2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f29089q6)), i11, str14.length() + i11, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            str = str8;
                                            i10 = size;
                                        }
                                        if (spannableStringBuilder3 != null && i18 == split.length - 1) {
                                            arrayList4.add(zoVar);
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
                        org.telegram.messenger.g0.h3(new cu0(sw0Var, str12, arrayList3, arrayList4, arrayList5, 3));
                        return;
                    }
                }
                break;
            case 25:
                sw0 sw0Var2 = (sw0) this.f49307b;
                ArrayList arrayList6 = (ArrayList) this.f49308c;
                sw0Var2.d.addAll(arrayList6);
                int i19 = sw0Var2.f51288f;
                org.telegram.messenger.np.s1(i19).f25368q2 = arrayList6;
                org.telegram.messenger.np.s1(i19).f25378r2 = sw0Var2.F;
                if (!sw0Var2.f51293x) {
                    sw0Var2.f();
                    return;
                }
                return;
            case 26:
                ww0 ww0Var = (ww0) this.f49307b;
                ww0Var.f53019f.add((yw0) this.f49308c);
                ww0Var.a();
                return;
            case 27:
                ly0 ly0Var = (ly0) ((View[]) this.f49307b)[0];
                ly0Var.f49062b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.f49308c;
                ly0Var.f49063c = null;
                ly0Var.d = null;
                ly0Var.f49065f.f39895g3.O(false);
                return;
            case 28:
                ((ly0) ((View[]) this.f49307b)[0]).b((TLRPC.TL_reportResultAddComment) this.f49308c);
                return;
            default:
                ly0 ly0Var2 = (ly0) ((View[]) this.f49307b)[0];
                ly0Var2.f49062b = null;
                ly0Var2.f49063c = (TLRPC.TL_reportResultChooseOption) this.f49308c;
                ly0Var2.d = null;
                ly0Var2.f49065f.f39895g3.O(false);
                return;
        }
    }

    public mp0(org.telegram.ui.Components.po0 po0Var, a0.h hVar, int i7, int i10) {
        this.f49306a = i10;
        this.f49307b = po0Var;
        this.f49308c = hVar;
    }
}
