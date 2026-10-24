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
    public final int f39399a;
    public final Object f39400b;
    public final Object f39401c;

    public lv0(int i10, Object obj, Object obj2) {
        this.f39399a = i10;
        this.f39400b = obj;
        this.f39401c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.t8 t8Var;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f39399a;
        long j10 = 0;
        boolean z10 = true;
        Object obj = this.f39401c;
        Object obj2 = this.f39400b;
        switch (i13) {
            case 0:
                tv0 tv0Var = (tv0) obj2;
                tv0Var.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                tv0Var.c(true);
                return;
            case 1:
                tv0 tv0Var2 = (tv0) obj2;
                SendMessagesHelper.getInstance(tv0Var2.H.currentAccount).deletePollOption(tv0Var2.H, (byte[]) obj);
                tv0Var2.c(true);
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
                ((org.telegram.ui.Cells.w8) obj).setChecked(z11);
                return;
            case 6:
                ((nx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f20352id);
                profileActivity.presentFragment(new sn(bundle), true);
                return;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j11 = profileActivity2.B2;
                if (j11 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j11));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f33930g1, user);
                    if (profileActivity2.F2 != null && user != null && org.telegram.ui.Components.vc.a(profileActivity2)) {
                        org.telegram.ui.Components.vc.D(profileActivity2, user, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.f34034v2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.i5(true, false);
                        return;
                    }
                    return;
                }
                NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                int i15 = NotificationCenter.closeChats;
                notificationCenter2.removeObserver(profileActivity2, i15);
                if (AndroidUtilities.isTablet()) {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f33930g1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f33930g1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.K1 = i10;
                profileActivity2.finishFragment();
                return;
            case 9:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 10:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.oc.e();
                pf.d.r(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 11:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.F2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f33930g1);
                ((CountDownLatch) obj).countDown();
                return;
            case 12:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity5.f34020t2.g());
                return;
            case 13:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                profileActivity6.H2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 14:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (t8Var = profileActivity7.f34067z5) != null) {
                    t8Var.run();
                }
                profileActivity7.f34067z5 = null;
                return;
            case 15:
                qy0 qy0Var = (qy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = qy0Var.f40960e1.f41253c;
                Activity parentActivity = profileActivity8.getParentActivity();
                oz0 oz0Var = profileActivity8.f33988o5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20348id;
                }
                org.telegram.ui.Components.vc.x(parentActivity, oz0Var, m10, j10, qy0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), qy0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 16:
                ez0 ez0Var = (ez0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = ez0Var.f37151e1;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                oz0 oz0Var2 = profileActivity9.f33988o5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f20348id;
                }
                org.telegram.ui.Components.vc.x(parentActivity2, oz0Var2, m11, j10, ez0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), ez0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 17:
                ((e01) obj2).e.presentFragment(ProfileActivity.o4(((Long) obj).longValue()));
                return;
            case 18:
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = (org.telegram.ui.ActionBar.g6) obj;
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            case 19:
                p01 p01Var = (p01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = p01Var.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = p01Var.e;
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
                    o01[] o01VarArr = p01Var.f40302c;
                    boolean z12 = z10;
                    if (i17 < o01VarArr.length) {
                        o01 o01Var = o01VarArr[i17];
                        if (o01Var != null) {
                            String str6 = o01Var.f40050a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(o2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.q6)), indexOf, str9.length() + indexOf, 33);
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
                                    if (o01Var.f40053f == 502) {
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
                                    arrayList3.add(o01Var);
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
                        if (p01Var.E != null) {
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
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(o2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.q6)), indexOf2, str12.length() + indexOf2, 33);
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
                        AndroidUtilities.runOnUIThread(new j01(p01Var, str10, arrayList3, arrayList4, arrayList5, 0));
                        return;
                    }
                }
                break;
            case 20:
                p01 p01Var2 = (p01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                p01Var2.d.addAll(arrayList6);
                int i22 = p01Var2.f40303f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = p01Var2.E;
                if (!p01Var2.f40307w) {
                    p01Var2.l();
                    return;
                }
                return;
            case 21:
                t01 t01Var = (t01) obj2;
                t01Var.f41850f.add((v01) obj);
                t01Var.a();
                return;
            case 22:
                q21 q21Var = (q21) ((View[]) obj2)[0];
                q21Var.f40694b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                q21Var.f40695c = null;
                q21Var.d = null;
                q21Var.f40696f.Z2.N(false);
                return;
            case 23:
                ((q21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 24:
                q21 q21Var2 = (q21) ((View[]) obj2)[0];
                q21Var2.f40694b = null;
                q21Var2.f40695c = (TLRPC.TL_reportResultChooseOption) obj;
                q21Var2.d = null;
                q21Var2.f40696f.Z2.N(false);
                return;
            case 25:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.vc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 26:
                org.telegram.ui.Components.vc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.jo0) obj);
                return;
            case 27:
                ((SecretMediaViewer) obj2).M = false;
                ((lu0) obj).f39381a.setVisible(false, true);
                return;
            case 28:
                ((SecretMediaViewer) ((n2.e) obj2).f17103c).h((File) obj);
                return;
            default:
                a61 a61Var = (a61) obj2;
                a61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new StickersActivity(5, a61Var.L0));
                Runnable runnable = a61Var.U1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public lv0(org.telegram.ui.Components.hr0 hr0Var, a0.h hVar, int i10, int i11) {
        this.f39399a = i11;
        this.f39400b = hr0Var;
        this.f39401c = hVar;
    }
}
