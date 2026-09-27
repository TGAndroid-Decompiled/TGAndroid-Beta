package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;
public final class by0 implements Runnable {
    public final int f32453a;
    public final Object f32454b;
    public final Object f32455c;

    public by0(int i10, Object obj, Object obj2) {
        this.f32453a = i10;
        this.f32454b = obj;
        this.f32455c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.u8 u8Var;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f32453a;
        long j3 = 0;
        Object obj = this.f32455c;
        Object obj2 = this.f32454b;
        switch (i13) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f18337id);
                profileActivity.presentFragment(new xn(bundle), true);
                return;
            case 1:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f31565f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.xc.a(profileActivity2)) {
                        org.telegram.ui.Components.xc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.f31668u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        return;
                    }
                    return;
                }
                NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                int i15 = NotificationCenter.closeChats;
                notificationCenter2.removeObserver(profileActivity2, i15);
                if (AndroidUtilities.isTablet()) {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f31565f1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f31565f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.J1 = i10;
                profileActivity2.finishFragment();
                return;
            case 2:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.qc.e();
                nf.f.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 4:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f31565f1);
                ((CountDownLatch) obj).countDown();
                return;
            case 5:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 6:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity6.f31654s2.g());
                return;
            case 7:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (u8Var = profileActivity7.f31693x5) != null) {
                    u8Var.run();
                }
                profileActivity7.f31693x5 = null;
                return;
            case 8:
                dz0 dz0Var = (dz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity8 = dz0Var.X0.f33370c;
                Activity parentActivity = profileActivity8.getParentActivity();
                c01 c01Var = profileActivity8.f31614m5;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f18333id;
                }
                org.telegram.ui.Components.xc.x(parentActivity, c01Var, m10, j3, dz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), dz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 9:
                rz0 rz0Var = (rz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity9 = rz0Var.X0;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                c01 c01Var2 = profileActivity9.f31614m5;
                int m11 = iVar2.m();
                if (iVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar2.n(0)).f18333id;
                }
                org.telegram.ui.Components.xc.x(parentActivity2, c01Var2, m11, j3, rz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), rz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 10:
                ((s01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 11:
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = (org.telegram.ui.ActionBar.e6) obj;
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            case 12:
                c11 c11Var = (c11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = c11Var.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = c11Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i16 = 0; i16 < split.length; i16++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i16]);
                    strArr2[i16] = translitString;
                    if (translitString.equals(split[i16])) {
                        strArr2[i16] = null;
                    }
                }
                int i17 = 0;
                while (true) {
                    b11[] b11VarArr = c11Var.f32483c;
                    if (i17 < b11VarArr.length) {
                        b11 b11Var = b11VarArr[i17];
                        if (b11Var != null) {
                            String str6 = b11Var.f32210a;
                            String str7 = " " + str6.toLowerCase();
                            int i18 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i18 < split.length) {
                                if (split[i18].length() != 0) {
                                    String str8 = split[i18];
                                    i12 = i17;
                                    int indexOf = str7.indexOf(" " + str8);
                                    if (indexOf < 0 && (str4 = strArr2[i18]) != null) {
                                        indexOf = str7.indexOf(" ".concat(str4));
                                    } else {
                                        str4 = str8;
                                    }
                                    if (indexOf >= 0) {
                                        String str9 = str4;
                                        if (spannableStringBuilder2 == null) {
                                            spannableStringBuilder = new SpannableStringBuilder(str6);
                                        } else {
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        str2 = str7;
                                        strArr = strArr2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(o2Var2.getThemedColor(org.telegram.ui.ActionBar.i6.q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i17 = i12 + 1;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str7;
                                    i12 = i17;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i18 == split.length - 1) {
                                    if (b11Var.f32213f == 502) {
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 < 4) {
                                                if (UserConfig.getInstance(i19).isClientActivated()) {
                                                    i19++;
                                                }
                                            } else {
                                                i19 = -1;
                                            }
                                        }
                                        if (i19 < 0) {
                                        }
                                    }
                                    arrayList3.add(b11Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i18++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                i17 = i12;
                                str5 = str3;
                                str7 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i12 = i17;
                        i17 = i12 + 1;
                        str5 = str5;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        String str10 = str5;
                        if (c11Var.E != null) {
                            int size = arrayList2.size();
                            int i20 = 0;
                            while (i20 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i20);
                                String str11 = " " + faqSearchResult.title.toLowerCase();
                                int i21 = 0;
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                while (true) {
                                    if (i21 < split.length) {
                                        if (split[i21].length() != 0) {
                                            String str12 = split[i21];
                                            int indexOf2 = str11.indexOf(" " + str12);
                                            i11 = size;
                                            if (indexOf2 < 0 && (str = strArr3[i21]) != null) {
                                                indexOf2 = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf2 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(o2Var2.getThemedColor(org.telegram.ui.ActionBar.i6.q6)), indexOf2, str12.length() + indexOf2, 33);
                                            }
                                        } else {
                                            i11 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder3 != null && i21 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i21++;
                                        size = i11;
                                        arrayList2 = arrayList;
                                    } else {
                                        i11 = size;
                                    }
                                }
                                i20++;
                                size = i11;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new e90(c11Var, str10, arrayList3, arrayList4, arrayList5, 22));
                        return;
                    }
                }
                break;
            case 13:
                c11 c11Var2 = (c11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                c11Var2.d.addAll(arrayList6);
                int i22 = c11Var2.f32484f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = c11Var2.E;
                if (!c11Var2.f32488w) {
                    c11Var2.l();
                    return;
                }
                return;
            case 14:
                g11 g11Var = (g11) obj2;
                g11Var.f33702f.add((i11) obj);
                g11Var.a();
                return;
            case 15:
                ((y21) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 16:
                s21 s21Var = (s21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    s21Var.getClass();
                    return;
                }
                int i23 = s21Var.J;
                if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) s21Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            s21Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                s21Var.J = tL_exportedContactToken.expires;
                s21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 17:
                u31 u31Var = (u31) ((View[]) obj2)[0];
                u31Var.f38113b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                u31Var.f38114c = null;
                u31Var.d = null;
                u31Var.f38115f.Y2.N(false);
                return;
            case 18:
                ((u31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 19:
                u31 u31Var2 = (u31) ((View[]) obj2)[0];
                u31Var2.f38113b = null;
                u31Var2.f38114c = (TLRPC.TL_reportResultChooseOption) obj;
                u31Var2.d = null;
                u31Var2.f38115f.Y2.N(false);
                return;
            case 20:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 21:
                org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.jy) obj);
                return;
            case 22:
                ((SecretMediaViewer) obj2).M = false;
                ((yu0) obj).f40325a.setVisible(false, true);
                return;
            case 23:
                ((SecretMediaViewer) ((n7.z0) obj2).f15446c).h((File) obj);
                return;
            case 24:
                c71 c71Var = (c71) obj2;
                c71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new StickersActivity(5, c71Var.L0));
                Runnable runnable = c71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 25:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((a91) obj2).k(false).j();
                return;
            case 26:
                a91.c0((a91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 27:
                t81 t81Var = (t81) obj2;
                a0.i iVar3 = (a0.i) obj;
                a91 a91Var = t81Var.X0;
                Activity parentActivity3 = a91Var.getParentActivity();
                z8 z8Var = a91Var.f32012b;
                int m12 = iVar3.m();
                if (iVar3.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar3.n(0)).f18333id;
                }
                org.telegram.ui.Components.xc.x(parentActivity3, z8Var, m12, j3, t81Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), t81Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 28:
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) obj2;
                new l91(o2Var3.getContext(), o2Var3.getCurrentAccount(), o2Var3.getResourceProvider(), (qc) obj).show();
                return;
            default:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
        }
    }

    public by0(org.telegram.ui.Components.vq0 vq0Var, a0.i iVar, int i10, int i11) {
        this.f32453a = i11;
        this.f32454b = vq0Var;
        this.f32455c = iVar;
    }
}
