package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
public final class hu0 implements Runnable {
    public final int f38536a;
    public final Object f38537b;
    public final Object f38538c;

    public hu0(int i10, Object obj, Object obj2) {
        this.f38536a = i10;
        this.f38537b = obj;
        this.f38538c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.r8 r8Var;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f38536a;
        long j3 = 0;
        boolean z10 = true;
        Object obj = this.f38538c;
        Object obj2 = this.f38537b;
        switch (i13) {
            case 0:
                ((iu0) obj2).f39006r.f33807l7.lock();
                ((AnimatorSet) obj).start();
                return;
            case 1:
                gv0 gv0Var = (gv0) obj;
                ((iu0) obj2).f39006r.f33867s4 = false;
                if (!gv0Var.f38163s) {
                    gv0Var.f38147a.setVisible(false, true);
                    return;
                }
                return;
            case 2:
                ow0 ow0Var = (ow0) obj2;
                ow0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ow0Var.c(true);
                return;
            case 3:
                ow0 ow0Var2 = (ow0) obj2;
                ow0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                ow0Var2.c(true);
                return;
            case 4:
                ow0 ow0Var3 = (ow0) obj2;
                SendMessagesHelper.getInstance(ow0Var3.H.currentAccount).deletePollOption(ow0Var3.H, (byte[]) obj);
                ow0Var3.c(true);
                return;
            case 5:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                return;
            case 6:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 7:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                return;
            case 8:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z11 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z11;
                ((org.telegram.ui.Cells.w8) obj).setChecked(z11);
                return;
            case 9:
                ((iy0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f19810id);
                profileActivity.presentFragment(new eo(bundle), true);
                return;
            case 11:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f34088f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.zc.a(profileActivity2)) {
                        org.telegram.ui.Components.zc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.f34191u2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f34088f1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f34088f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.J1 = i10;
                profileActivity2.finishFragment();
                return;
            case 12:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 13:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.sc.e();
                of.f.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 14:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f34088f1);
                ((CountDownLatch) obj).countDown();
                return;
            case 15:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 16:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity6.f34177s2.g());
                return;
            case 17:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (r8Var = profileActivity7.f34216x5) != null) {
                    r8Var.run();
                }
                profileActivity7.f34216x5 = null;
                return;
            case 18:
                lz0 lz0Var = (lz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity8 = lz0Var.f39870b1.f40159c;
                Activity parentActivity = profileActivity8.getParentActivity();
                k01 k01Var = profileActivity8.f34137m5;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f19806id;
                }
                org.telegram.ui.Components.zc.x(parentActivity, k01Var, m10, j3, lz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), lz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 19:
                a01 a01Var = (a01) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity9 = a01Var.f35640b1;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                k01 k01Var2 = profileActivity9.f34137m5;
                int m11 = iVar2.m();
                if (iVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar2.n(0)).f19806id;
                }
                org.telegram.ui.Components.zc.x(parentActivity2, k01Var2, m11, j3, a01Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), a01Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 20:
                ((a11) obj2).f35664e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 21:
                ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                m2Var.d = (org.telegram.ui.ActionBar.c6) obj;
                ((org.telegram.ui.ActionBar.m2) obj2).presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                return;
            case 22:
                k11 k11Var = (k11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = k11Var.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = k11Var.f39334e;
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
                    j11[] j11VarArr = k11Var.f39333c;
                    boolean z12 = z10;
                    if (i17 < j11VarArr.length) {
                        j11 j11Var = j11VarArr[i17];
                        if (j11Var != null) {
                            String str6 = j11Var.f39075a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(m2Var2.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf, str9.length() + indexOf, 33);
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
                                    if (j11Var.f39079f == 502) {
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
                                    arrayList3.add(j11Var);
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
                        if (k11Var.E != null) {
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
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(m2Var2.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf2, str12.length() + indexOf2, 33);
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
                        AndroidUtilities.runOnUIThread(new i90(k11Var, str10, arrayList3, arrayList4, arrayList5, 22));
                        return;
                    }
                }
                break;
            case 23:
                k11 k11Var2 = (k11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                k11Var2.d.addAll(arrayList6);
                int i22 = k11Var2.f39335f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = k11Var2.E;
                if (!k11Var2.f39339w) {
                    k11Var2.l();
                    return;
                }
                return;
            case 24:
                o11 o11Var = (o11) obj2;
                o11Var.f40536f.add((q11) obj);
                o11Var.a();
                return;
            case 25:
                ((g31) obj2).d0(34, (Bitmap) obj, true);
                return;
            case 26:
                b31 b31Var = (b31) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    b31Var.getClass();
                    return;
                }
                int i23 = b31Var.J;
                if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) b31Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            b31Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                b31Var.J = tL_exportedContactToken.expires;
                b31Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 27:
                d41 d41Var = (d41) ((View[]) obj2)[0];
                d41Var.f36639b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                d41Var.f36640c = null;
                d41Var.d = null;
                d41Var.f36642f.W2.N(false);
                return;
            case 28:
                ((d41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            default:
                d41 d41Var2 = (d41) ((View[]) obj2)[0];
                d41Var2.f36639b = null;
                d41Var2.f36640c = (TLRPC.TL_reportResultChooseOption) obj;
                d41Var2.d = null;
                d41Var2.f36642f.W2.N(false);
                return;
        }
    }

    public hu0(org.telegram.ui.Components.sr0 sr0Var, a0.i iVar, int i10, int i11) {
        this.f38536a = i11;
        this.f38537b = sr0Var;
        this.f38538c = iVar;
    }
}
