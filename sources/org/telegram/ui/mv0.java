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
public final class mv0 implements Runnable {
    public final int f39710a;
    public final Object f39711b;
    public final Object f39712c;

    public mv0(int i10, Object obj, Object obj2) {
        this.f39710a = i10;
        this.f39711b = obj;
        this.f39712c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.s8 s8Var;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f39710a;
        long j10 = 0;
        boolean z10 = true;
        Object obj = this.f39712c;
        Object obj2 = this.f39711b;
        switch (i13) {
            case 0:
                uv0 uv0Var = (uv0) obj2;
                uv0Var.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                uv0Var.c(true);
                return;
            case 1:
                uv0 uv0Var2 = (uv0) obj2;
                SendMessagesHelper.getInstance(uv0Var2.H.currentAccount).deletePollOption(uv0Var2.H, (byte[]) obj);
                uv0Var2.c(true);
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
                ((ox0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f20351id);
                profileActivity.presentFragment(new sn(bundle), true);
                return;
            case 8:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j11 = profileActivity2.B2;
                if (j11 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j11));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f33928g1, user);
                    if (profileActivity2.F2 != null && user != null && org.telegram.ui.Components.xc.a(profileActivity2)) {
                        org.telegram.ui.Components.xc.D(profileActivity2, user, profileActivity2.F2.title).j();
                    }
                    if (profileActivity2.f34032v2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f33928g1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f33928g1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
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
                profileActivity4.F2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f33928g1);
                ((CountDownLatch) obj).countDown();
                return;
            case 12:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity5.f34018t2.g());
                return;
            case 13:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                profileActivity6.H2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 14:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (s8Var = profileActivity7.f34065z5) != null) {
                    s8Var.run();
                }
                profileActivity7.f34065z5 = null;
                return;
            case 15:
                ry0 ry0Var = (ry0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = ry0Var.f41267e1.f41824c;
                Activity parentActivity = profileActivity8.getParentActivity();
                pz0 pz0Var = profileActivity8.f33986o5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20347id;
                }
                org.telegram.ui.Components.xc.x(parentActivity, pz0Var, m10, j10, ry0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), ry0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 16:
                fz0 fz0Var = (fz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = fz0Var.f37436e1;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                pz0 pz0Var2 = profileActivity9.f33986o5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f20347id;
                }
                org.telegram.ui.Components.xc.x(parentActivity2, pz0Var2, m11, j10, fz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), fz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 17:
                ((f01) obj2).e.presentFragment(ProfileActivity.o4(((Long) obj).longValue()));
                return;
            case 18:
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = (org.telegram.ui.ActionBar.g6) obj;
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            case 19:
                q01 q01Var = (q01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = q01Var.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = q01Var.e;
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
                    p01[] p01VarArr = q01Var.f40595c;
                    boolean z12 = z10;
                    if (i17 < p01VarArr.length) {
                        p01 p01Var = p01VarArr[i17];
                        if (p01Var != null) {
                            String str6 = p01Var.f40323a;
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
                                    if (p01Var.f40326f == 502) {
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
                                    arrayList3.add(p01Var);
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
                        if (q01Var.E != null) {
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
                        AndroidUtilities.runOnUIThread(new k01(q01Var, str10, arrayList3, arrayList4, arrayList5, 0));
                        return;
                    }
                }
                break;
            case 20:
                q01 q01Var2 = (q01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                q01Var2.d.addAll(arrayList6);
                int i22 = q01Var2.f40596f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = q01Var2.E;
                if (!q01Var2.f40600w) {
                    q01Var2.l();
                    return;
                }
                return;
            case 21:
                u01 u01Var = (u01) obj2;
                u01Var.f42124f.add((w01) obj);
                u01Var.a();
                return;
            case 22:
                r21 r21Var = (r21) ((View[]) obj2)[0];
                r21Var.f40980b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                r21Var.f40981c = null;
                r21Var.d = null;
                r21Var.f40982f.Z2.N(false);
                return;
            case 23:
                ((r21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 24:
                r21 r21Var2 = (r21) ((View[]) obj2)[0];
                r21Var2.f40980b = null;
                r21Var2.f40981c = (TLRPC.TL_reportResultChooseOption) obj;
                r21Var2.d = null;
                r21Var2.f40982f.Z2.N(false);
                return;
            case 25:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 26:
                org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ko0) obj);
                return;
            case 27:
                ((SecretMediaViewer) obj2).M = false;
                ((mu0) obj).f39692a.setVisible(false, true);
                return;
            case 28:
                ((SecretMediaViewer) ((n2.e) obj2).f17103c).h((File) obj);
                return;
            default:
                b61 b61Var = (b61) obj2;
                b61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new StickersActivity(5, b61Var.L0));
                Runnable runnable = b61Var.U1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public mv0(org.telegram.ui.Components.ir0 ir0Var, a0.h hVar, int i10, int i11) {
        this.f39710a = i11;
        this.f39711b = ir0Var;
        this.f39712c = hVar;
    }
}
