package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
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
public final class iy0 implements Runnable {
    public final int f34746a;
    public final Object f34747b;
    public final Object f34748c;

    public iy0(int i10, Object obj, Object obj2) {
        this.f34746a = i10;
        this.f34747b = obj;
        this.f34748c = obj2;
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
        int i13 = this.f34746a;
        long j3 = 0;
        Object obj = this.f34748c;
        Object obj2 = this.f34747b;
        switch (i13) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f31277f1, user);
                    if (profileActivity.E2 != null && user != null && org.telegram.ui.Components.vc.a(profileActivity)) {
                        org.telegram.ui.Components.vc.D(profileActivity, user, profileActivity.E2.title).j();
                    }
                    if (profileActivity.f31380u2.participants.participants.remove(chatParticipant)) {
                        profileActivity.e5(true, false);
                        return;
                    }
                    return;
                }
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                if (AndroidUtilities.isTablet()) {
                    i10 = 0;
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, Long.valueOf(-profileActivity.f31277f1));
                } else {
                    i10 = 0;
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                }
                profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f31277f1, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId())));
                profileActivity.J1 = i10;
                profileActivity.finishFragment();
                return;
            case 1:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                profileActivity2.getClass();
                org.telegram.ui.Components.oc.e();
                nf.f.s(profileActivity2.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.E2 = profileActivity3.getMessagesStorage().getChat(profileActivity3.f31277f1);
                ((CountDownLatch) obj).countDown();
                return;
            case 4:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.getClass();
                profileActivity4.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 5:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity5.f31366s2.g());
                return;
            case 6:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (t8Var = profileActivity6.f31405x5) != null) {
                    t8Var.run();
                }
                profileActivity6.f31405x5 = null;
                return;
            case 7:
                kz0 kz0Var = (kz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity7 = kz0Var.f35290b1.f35587c;
                Activity parentActivity = profileActivity7.getParentActivity();
                j01 j01Var = profileActivity7.f31326m5;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f18116id;
                }
                org.telegram.ui.Components.vc.x(parentActivity, j01Var, m10, j3, kz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), kz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 8:
                yz0 yz0Var = (yz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity8 = yz0Var.f40016b1;
                Activity parentActivity2 = profileActivity8.getParentActivity();
                j01 j01Var2 = profileActivity8.f31326m5;
                int m11 = iVar2.m();
                if (iVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar2.n(0)).f18116id;
                }
                org.telegram.ui.Components.vc.x(parentActivity2, j01Var2, m11, j3, yz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), yz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 9:
                ((z01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 10:
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = (org.telegram.ui.ActionBar.e6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            case 11:
                j11 j11Var = (j11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = j11Var.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = j11Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i15 = 0; i15 < split.length; i15++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i15]);
                    strArr2[i15] = translitString;
                    if (translitString.equals(split[i15])) {
                        strArr2[i15] = null;
                    }
                }
                int i16 = 0;
                while (true) {
                    i11[] i11VarArr = j11Var.f34788c;
                    if (i16 < i11VarArr.length) {
                        i11 i11Var = i11VarArr[i16];
                        if (i11Var != null) {
                            String str6 = i11Var.f34385a;
                            String str7 = " " + str6.toLowerCase();
                            int i17 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i17 < split.length) {
                                if (split[i17].length() != 0) {
                                    String str8 = split[i17];
                                    i12 = i16;
                                    int indexOf = str7.indexOf(" " + str8);
                                    if (indexOf < 0 && (str4 = strArr2[i17]) != null) {
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(n2Var2.getThemedColor(org.telegram.ui.ActionBar.i6.q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i16 = i12 + 1;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str7;
                                    i12 = i16;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i17 == split.length - 1) {
                                    if (i11Var.f34388f == 502) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 < 4) {
                                                if (UserConfig.getInstance(i18).isClientActivated()) {
                                                    i18++;
                                                }
                                            } else {
                                                i18 = -1;
                                            }
                                        }
                                        if (i18 < 0) {
                                        }
                                    }
                                    arrayList3.add(i11Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i17++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                i16 = i12;
                                str5 = str3;
                                str7 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i12 = i16;
                        i16 = i12 + 1;
                        str5 = str5;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        String str10 = str5;
                        if (j11Var.E != null) {
                            int size = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i19);
                                String str11 = " " + faqSearchResult.title.toLowerCase();
                                int i20 = 0;
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                while (true) {
                                    if (i20 < split.length) {
                                        if (split[i20].length() != 0) {
                                            String str12 = split[i20];
                                            int indexOf2 = str11.indexOf(" " + str12);
                                            i11 = size;
                                            if (indexOf2 < 0 && (str = strArr3[i20]) != null) {
                                                indexOf2 = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf2 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(n2Var2.getThemedColor(org.telegram.ui.ActionBar.i6.q6)), indexOf2, str12.length() + indexOf2, 33);
                                            }
                                        } else {
                                            i11 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder3 != null && i20 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i20++;
                                        size = i11;
                                        arrayList2 = arrayList;
                                    } else {
                                        i11 = size;
                                    }
                                }
                                i19++;
                                size = i11;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new g90(j11Var, str10, arrayList3, arrayList4, arrayList5, 22));
                        return;
                    }
                }
                break;
            case 12:
                j11 j11Var2 = (j11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                j11Var2.d.addAll(arrayList6);
                int i21 = j11Var2.f34789f;
                MessagesController.getInstance(i21).faqSearchArray = arrayList6;
                MessagesController.getInstance(i21).faqWebPage = j11Var2.E;
                if (!j11Var2.f34793w) {
                    j11Var2.l();
                    return;
                }
                return;
            case 13:
                n11 n11Var = (n11) obj2;
                n11Var.f35866f.add((p11) obj);
                n11Var.a();
                return;
            case 14:
                ((e31) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 15:
                y21 y21Var = (y21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    y21Var.getClass();
                    return;
                }
                int i22 = y21Var.J;
                if (i22 != 0 && i22 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) y21Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            y21Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                y21Var.J = tL_exportedContactToken.expires;
                y21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 16:
                a41 a41Var = (a41) ((View[]) obj2)[0];
                a41Var.f31690b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                a41Var.f31691c = null;
                a41Var.d = null;
                a41Var.f31692f.Y2.N(false);
                return;
            case 17:
                ((a41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 18:
                a41 a41Var2 = (a41) ((View[]) obj2)[0];
                a41Var2.f31690b = null;
                a41Var2.f31691c = (TLRPC.TL_reportResultChooseOption) obj;
                a41Var2.d = null;
                a41Var2.f31692f.Y2.N(false);
                return;
            case 19:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.vc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 20:
                org.telegram.ui.Components.vc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ny) obj);
                return;
            case 21:
                ((SecretMediaViewer) obj2).M = false;
                ((dv0) obj).f33134a.setVisible(false, true);
                return;
            case 22:
                ((SecretMediaViewer) ((n7.a1) obj2).f15109c).h((File) obj);
                return;
            case 23:
                g71 g71Var = (g71) obj2;
                g71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, g71Var.L0));
                Runnable runnable = g71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 24:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.vc.a0((e91) obj2).k(false).j();
                return;
            case 25:
                e91.X((e91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 26:
                x81 x81Var = (x81) obj2;
                a0.i iVar3 = (a0.i) obj;
                e91 e91Var = x81Var.f39524b1;
                Activity parentActivity3 = e91Var.getParentActivity();
                w8 w8Var = e91Var.f33283b;
                int m12 = iVar3.m();
                if (iVar3.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar3.n(0)).f18116id;
                }
                org.telegram.ui.Components.vc.x(parentActivity3, w8Var, m12, j3, x81Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), x81Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 27:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj2;
                new q91(n2Var3.getContext(), n2Var3.getCurrentAccount(), n2Var3.getResourceProvider(), (nf) obj).show();
                return;
            case 28:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
        }
    }

    public iy0(org.telegram.ui.Components.hq0 hq0Var, a0.i iVar, int i10, int i11) {
        this.f34746a = i11;
        this.f34747b = hq0Var;
        this.f34748c = iVar;
    }
}
