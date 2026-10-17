package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
public final class lv0 implements Runnable {
    public final int f38955a;
    public final Object f38956b;
    public final Object f38957c;

    public lv0(int i10, Object obj, Object obj2) {
        this.f38955a = i10;
        this.f38956b = obj;
        this.f38957c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.o8 o8Var;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f38955a;
        long j10 = 0;
        boolean z10 = true;
        Object obj = this.f38957c;
        Object obj2 = this.f38956b;
        switch (i13) {
            case 0:
                sv0 sv0Var = (sv0) obj2;
                sv0Var.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                sv0Var.c(true);
                return;
            case 1:
                sv0 sv0Var2 = (sv0) obj2;
                SendMessagesHelper.getInstance(sv0Var2.H.currentAccount).deletePollOption(sv0Var2.H, (byte[]) obj);
                sv0Var2.c(true);
                return;
            case 2:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                return;
            case 3:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                return;
            case 5:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z11 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z11;
                ((org.telegram.ui.Cells.v8) obj).setChecked(z11);
                return;
            case 6:
                ((mx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f20280id);
                profileActivity.presentFragment(new sn(bundle), true);
                return;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j11 = profileActivity2.B2;
                if (j11 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j11));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f33614g1, user);
                    if (profileActivity2.F2 != null && user != null && org.telegram.ui.Components.xc.a(profileActivity2)) {
                        org.telegram.ui.Components.xc.D(profileActivity2, user, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.f33718v2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f33614g1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f33614g1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.K1 = i10;
                profileActivity2.finishFragment();
                return;
            case 9:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 10:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.qc.e();
                pf.d.r(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 11:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.F2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f33614g1);
                ((CountDownLatch) obj).countDown();
                return;
            case 12:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.q8) ((View) obj)).setChecked(profileActivity5.f33704t2.g());
                return;
            case 13:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                profileActivity6.H2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 14:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (o8Var = profileActivity7.f33750z5) != null) {
                    o8Var.run();
                }
                profileActivity7.f33750z5 = null;
                return;
            case 15:
                oy0 oy0Var = (oy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = oy0Var.f39903b1.f40274c;
                Activity parentActivity = profileActivity8.getParentActivity();
                nz0 nz0Var = profileActivity8.f33672o5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20276id;
                }
                org.telegram.ui.Components.xc.x(parentActivity, nz0Var, m10, j10, oy0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), oy0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 16:
                dz0 dz0Var = (dz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = dz0Var.f36347b1;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                nz0 nz0Var2 = profileActivity9.f33672o5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f20276id;
                }
                org.telegram.ui.Components.xc.x(parentActivity2, nz0Var2, m11, j10, dz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), dz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 17:
                ((d01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 18:
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = (org.telegram.ui.ActionBar.d6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            case 19:
                o01 o01Var = (o01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = o01Var.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = o01Var.e;
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
                    n01[] n01VarArr = o01Var.f39608c;
                    boolean z12 = z10;
                    if (i17 < n01VarArr.length) {
                        n01 n01Var = n01VarArr[i17];
                        if (n01Var != null) {
                            String str6 = n01Var.f39289a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(n2Var2.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i17 = i12 + 1;
                                        z10 = z12;
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
                                    if (n01Var.f39292f == 502) {
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
                                    arrayList3.add(n01Var);
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
                        z10 = z12;
                        str5 = str5;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        String str10 = str5;
                        if (o01Var.E != null) {
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
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(n2Var2.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf2, str12.length() + indexOf2, 33);
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
                        AndroidUtilities.runOnUIThread(new i01(o01Var, str10, arrayList3, arrayList4, arrayList5, 0));
                        return;
                    }
                }
                break;
            case 20:
                o01 o01Var2 = (o01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                o01Var2.d.addAll(arrayList6);
                int i22 = o01Var2.f39609f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = o01Var2.E;
                if (!o01Var2.f39613w) {
                    o01Var2.l();
                    return;
                }
                return;
            case 21:
                s01 s01Var = (s01) obj2;
                s01Var.f40854f.add((u01) obj);
                s01Var.a();
                return;
            case 22:
                p21 p21Var = (p21) ((View[]) obj2)[0];
                p21Var.f39942b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                p21Var.f39943c = null;
                p21Var.d = null;
                p21Var.f39944f.W2.N(false);
                return;
            case 23:
                ((p21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 24:
                p21 p21Var2 = (p21) ((View[]) obj2)[0];
                p21Var2.f39942b = null;
                p21Var2.f39943c = (TLRPC.TL_reportResultChooseOption) obj;
                p21Var2.d = null;
                p21Var2.f39944f.W2.N(false);
                return;
            case 25:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 26:
                org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.go0) obj);
                return;
            case 27:
                ((SecretMediaViewer) obj2).M = false;
                ((lu0) obj).f38937a.setVisible(false, true);
                return;
            case 28:
                ((SecretMediaViewer) ((mi.q) obj2).f16968c).h((File) obj);
                return;
            default:
                z51 z51Var = (z51) obj2;
                z51Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, z51Var.L0));
                Runnable runnable = z51Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public lv0(org.telegram.ui.Components.dr0 dr0Var, a0.h hVar, int i10, int i11) {
        this.f38955a = i11;
        this.f38956b = dr0Var;
        this.f38957c = hVar;
    }
}
