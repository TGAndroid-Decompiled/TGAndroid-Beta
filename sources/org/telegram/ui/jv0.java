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
public final class jv0 implements Runnable {
    public final int f38362a;
    public final Object f38363b;
    public final Object f38364c;

    public jv0(int i10, Object obj, Object obj2) {
        this.f38362a = i10;
        this.f38363b = obj;
        this.f38364c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.p8 p8Var;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f38362a;
        long j10 = 0;
        boolean z10 = true;
        Object obj = this.f38364c;
        Object obj2 = this.f38363b;
        switch (i13) {
            case 0:
                qv0 qv0Var = (qv0) obj2;
                qv0Var.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                qv0Var.c(true);
                return;
            case 1:
                qv0 qv0Var2 = (qv0) obj2;
                SendMessagesHelper.getInstance(qv0Var2.H.currentAccount).deletePollOption(qv0Var2.H, (byte[]) obj);
                qv0Var2.c(true);
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
                ((kx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f20283id);
                profileActivity.presentFragment(new qn(bundle), true);
                return;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j11 = profileActivity2.B2;
                if (j11 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j11));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f33620g1, user);
                    if (profileActivity2.F2 != null && user != null && org.telegram.ui.Components.xc.a(profileActivity2)) {
                        org.telegram.ui.Components.xc.D(profileActivity2, user, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.f33724v2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f33620g1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f33620g1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
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
                profileActivity4.F2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f33620g1);
                ((CountDownLatch) obj).countDown();
                return;
            case 12:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.q8) ((View) obj)).setChecked(profileActivity5.f33710t2.g());
                return;
            case 13:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                profileActivity6.H2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 14:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (p8Var = profileActivity7.f33756z5) != null) {
                    p8Var.run();
                }
                profileActivity7.f33756z5 = null;
                return;
            case 15:
                my0 my0Var = (my0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = my0Var.f39366c1.f39717c;
                Activity parentActivity = profileActivity8.getParentActivity();
                lz0 lz0Var = profileActivity8.f33678o5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20279id;
                }
                org.telegram.ui.Components.xc.x(parentActivity, lz0Var, m10, j10, my0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), my0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 16:
                bz0 bz0Var = (bz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = bz0Var.f35759c1;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                lz0 lz0Var2 = profileActivity9.f33678o5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f20279id;
                }
                org.telegram.ui.Components.xc.x(parentActivity2, lz0Var2, m11, j10, bz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), bz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 17:
                ((b01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 18:
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = (org.telegram.ui.ActionBar.d6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            case 19:
                m01 m01Var = (m01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = m01Var.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = m01Var.e;
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
                    l01[] l01VarArr = m01Var.f39104c;
                    boolean z12 = z10;
                    if (i17 < l01VarArr.length) {
                        l01 l01Var = l01VarArr[i17];
                        if (l01Var != null) {
                            String str6 = l01Var.f38708a;
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
                                    if (l01Var.f38711f == 502) {
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
                                    arrayList3.add(l01Var);
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
                        if (m01Var.E != null) {
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
                        AndroidUtilities.runOnUIThread(new g01(m01Var, str10, arrayList3, arrayList4, arrayList5, 0));
                        return;
                    }
                }
                break;
            case 20:
                m01 m01Var2 = (m01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                m01Var2.d.addAll(arrayList6);
                int i22 = m01Var2.f39105f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = m01Var2.E;
                if (!m01Var2.f39109w) {
                    m01Var2.l();
                    return;
                }
                return;
            case 21:
                q01 q01Var = (q01) obj2;
                q01Var.f40342f.add((s01) obj);
                q01Var.a();
                return;
            case 22:
                n21 n21Var = (n21) ((View[]) obj2)[0];
                n21Var.f39393b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                n21Var.f39394c = null;
                n21Var.d = null;
                n21Var.f39395f.W2.N(false);
                return;
            case 23:
                ((n21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 24:
                n21 n21Var2 = (n21) ((View[]) obj2)[0];
                n21Var2.f39393b = null;
                n21Var2.f39394c = (TLRPC.TL_reportResultChooseOption) obj;
                n21Var2.d = null;
                n21Var2.f39395f.W2.N(false);
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
                ((ju0) obj).f38343a.setVisible(false, true);
                return;
            case 28:
                ((SecretMediaViewer) ((mi.q) obj2).f16976c).h((File) obj);
                return;
            default:
                x51 x51Var = (x51) obj2;
                x51Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, x51Var.L0));
                Runnable runnable = x51Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public jv0(org.telegram.ui.Components.er0 er0Var, a0.h hVar, int i10, int i11) {
        this.f38362a = i11;
        this.f38363b = er0Var;
        this.f38364c = hVar;
    }
}
