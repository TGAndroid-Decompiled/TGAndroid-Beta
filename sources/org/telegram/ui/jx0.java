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
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
public final class jx0 implements Runnable {
    public final int f34888a;
    public final Object f34889b;
    public final Object f34890c;

    public jx0(int i10, Object obj, Object obj2) {
        this.f34888a = i10;
        this.f34889b = obj;
        this.f34890c = obj2;
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
        int i13 = this.f34888a;
        long j3 = 0;
        Object obj = this.f34890c;
        Object obj2 = this.f34889b;
        switch (i13) {
            case 0:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 1:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                return;
            case 2:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z10 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z10;
                ((org.telegram.ui.Cells.w8) obj).setChecked(z10);
                return;
            case 3:
                ((yx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f18343id);
                profileActivity.presentFragment(new wn(bundle), true);
                return;
            case 5:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f31563f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.xc.a(profileActivity2)) {
                        org.telegram.ui.Components.xc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.f31666u2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f31563f1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f31563f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.J1 = i10;
                profileActivity2.finishFragment();
                return;
            case 6:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 7:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.qc.e();
                nf.f.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 8:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f31563f1);
                ((CountDownLatch) obj).countDown();
                return;
            case 9:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 10:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity6.f31652s2.g());
                return;
            case 11:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (u8Var = profileActivity7.f31691x5) != null) {
                    u8Var.run();
                }
                profileActivity7.f31691x5 = null;
                return;
            case 12:
                bz0 bz0Var = (bz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity8 = bz0Var.f32528b1.f32832c;
                Activity parentActivity = profileActivity8.getParentActivity();
                a01 a01Var = profileActivity8.f31612m5;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f18339id;
                }
                org.telegram.ui.Components.xc.x(parentActivity, a01Var, m10, j3, bz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), bz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 13:
                pz0 pz0Var = (pz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity9 = pz0Var.f36708b1;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                a01 a01Var2 = profileActivity9.f31612m5;
                int m11 = iVar2.m();
                if (iVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar2.n(0)).f18339id;
                }
                org.telegram.ui.Components.xc.x(parentActivity2, a01Var2, m11, j3, pz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), pz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 14:
                ((q01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 15:
                ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                m2Var.d = (org.telegram.ui.ActionBar.d6) obj;
                ((org.telegram.ui.ActionBar.m2) obj2).presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                return;
            case 16:
                a11 a11Var = (a11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = a11Var.d;
                org.telegram.ui.ActionBar.m2 m2Var2 = a11Var.e;
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
                    z01[] z01VarArr = a11Var.f31952c;
                    if (i17 < z01VarArr.length) {
                        z01 z01Var = z01VarArr[i17];
                        if (z01Var != null) {
                            String str6 = z01Var.f40306a;
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
                                    if (z01Var.f40309f == 502) {
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
                                    arrayList3.add(z01Var);
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
                        if (a11Var.E != null) {
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
                        AndroidUtilities.runOnUIThread(new c90(a11Var, str10, arrayList3, arrayList4, arrayList5, 22));
                        return;
                    }
                }
                break;
            case 17:
                a11 a11Var2 = (a11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                a11Var2.d.addAll(arrayList6);
                int i22 = a11Var2.f31953f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = a11Var2.E;
                if (!a11Var2.f31957w) {
                    a11Var2.l();
                    return;
                }
                return;
            case 18:
                e11 e11Var = (e11) obj2;
                e11Var.f33257f.add((g11) obj);
                e11Var.a();
                return;
            case 19:
                ((w21) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 20:
                q21 q21Var = (q21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    q21Var.getClass();
                    return;
                }
                int i23 = q21Var.J;
                if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) q21Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            q21Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                q21Var.J = tL_exportedContactToken.expires;
                q21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 21:
                s31 s31Var = (s31) ((View[]) obj2)[0];
                s31Var.f37582b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                s31Var.f37583c = null;
                s31Var.d = null;
                s31Var.f37584f.Y2.N(false);
                return;
            case 22:
                ((s31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 23:
                s31 s31Var2 = (s31) ((View[]) obj2)[0];
                s31Var2.f37582b = null;
                s31Var2.f37583c = (TLRPC.TL_reportResultChooseOption) obj;
                s31Var2.d = null;
                s31Var2.f37584f.Y2.N(false);
                return;
            case 24:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 25:
                org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.m2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.vw) obj);
                return;
            case 26:
                ((SecretMediaViewer) obj2).M = false;
                ((vu0) obj).f38819a.setVisible(false, true);
                return;
            case 27:
                ((SecretMediaViewer) ((n7.z0) obj2).f15411c).h((File) obj);
                return;
            case 28:
                a71 a71Var = (a71) obj2;
                a71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.m2) obj).presentFragment(new StickersActivity(5, a71Var.L0));
                Runnable runnable = a71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((z81) obj2).k(false).j();
                return;
        }
    }

    public jx0(org.telegram.ui.Components.uq0 uq0Var, a0.i iVar, int i10, int i11) {
        this.f34888a = i11;
        this.f34889b = uq0Var;
        this.f34890c = iVar;
    }
}
