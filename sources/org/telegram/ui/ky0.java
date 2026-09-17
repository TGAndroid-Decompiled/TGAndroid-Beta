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
public final class ky0 implements Runnable {
    public final int f35376a;
    public final Object f35377b;
    public final Object f35378c;

    public ky0(int i10, Object obj, Object obj2) {
        this.f35376a = i10;
        this.f35377b = obj;
        this.f35378c = obj2;
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
        int i13 = this.f35376a;
        long j3 = 0;
        Object obj = this.f35378c;
        Object obj2 = this.f35377b;
        switch (i13) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f31290f1, user);
                    if (profileActivity.E2 != null && user != null && org.telegram.ui.Components.vc.a(profileActivity)) {
                        org.telegram.ui.Components.vc.D(profileActivity, user, profileActivity.E2.title).j();
                    }
                    if (profileActivity.f31393u2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, Long.valueOf(-profileActivity.f31290f1));
                } else {
                    i10 = 0;
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                }
                profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f31290f1, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId())));
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
                profileActivity3.E2 = profileActivity3.getMessagesStorage().getChat(profileActivity3.f31290f1);
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
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity5.f31379s2.g());
                return;
            case 6:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (t8Var = profileActivity6.f31418x5) != null) {
                    t8Var.run();
                }
                profileActivity6.f31418x5 = null;
                return;
            case 7:
                mz0 mz0Var = (mz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity7 = mz0Var.f35909b1.f36186c;
                Activity parentActivity = profileActivity7.getParentActivity();
                l01 l01Var = profileActivity7.f31339m5;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f18125id;
                }
                org.telegram.ui.Components.vc.x(parentActivity, l01Var, m10, j3, mz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), mz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 8:
                a01 a01Var = (a01) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity8 = a01Var.f31659b1;
                Activity parentActivity2 = profileActivity8.getParentActivity();
                l01 l01Var2 = profileActivity8.f31339m5;
                int m11 = iVar2.m();
                if (iVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar2.n(0)).f18125id;
                }
                org.telegram.ui.Components.vc.x(parentActivity2, l01Var2, m11, j3, a01Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), a01Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 9:
                ((b11) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 10:
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = (org.telegram.ui.ActionBar.f6) obj;
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            case 11:
                l11 l11Var = (l11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = l11Var.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = l11Var.e;
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
                    k11[] k11VarArr = l11Var.f35416c;
                    if (i16 < k11VarArr.length) {
                        k11 k11Var = k11VarArr[i16];
                        if (k11Var != null) {
                            String str6 = k11Var.f34971a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(o2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.q6)), indexOf, str9.length() + indexOf, 33);
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
                                    if (k11Var.f34974f == 502) {
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
                                    arrayList3.add(k11Var);
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
                        if (l11Var.E != null) {
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
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(o2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.q6)), indexOf2, str12.length() + indexOf2, 33);
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
                        AndroidUtilities.runOnUIThread(new i90(l11Var, str10, arrayList3, arrayList4, arrayList5, 22));
                        return;
                    }
                }
                break;
            case 12:
                l11 l11Var2 = (l11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                l11Var2.d.addAll(arrayList6);
                int i21 = l11Var2.f35417f;
                MessagesController.getInstance(i21).faqSearchArray = arrayList6;
                MessagesController.getInstance(i21).faqWebPage = l11Var2.E;
                if (!l11Var2.f35421w) {
                    l11Var2.l();
                    return;
                }
                return;
            case 13:
                p11 p11Var = (p11) obj2;
                p11Var.f36488f.add((r11) obj);
                p11Var.a();
                return;
            case 14:
                ((g31) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 15:
                a31 a31Var = (a31) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    a31Var.getClass();
                    return;
                }
                int i22 = a31Var.J;
                if (i22 != 0 && i22 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) a31Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            a31Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                a31Var.J = tL_exportedContactToken.expires;
                a31Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 16:
                c41 c41Var = (c41) ((View[]) obj2)[0];
                c41Var.f32661b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                c41Var.f32662c = null;
                c41Var.d = null;
                c41Var.f32663f.Y2.N(false);
                return;
            case 17:
                ((c41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 18:
                c41 c41Var2 = (c41) ((View[]) obj2)[0];
                c41Var2.f32661b = null;
                c41Var2.f32662c = (TLRPC.TL_reportResultChooseOption) obj;
                c41Var2.d = null;
                c41Var2.f32663f.Y2.N(false);
                return;
            case 19:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.vc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 20:
                org.telegram.ui.Components.vc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ny) obj);
                return;
            case 21:
                ((SecretMediaViewer) obj2).M = false;
                ((fv0) obj).f33763a.setVisible(false, true);
                return;
            case 22:
                ((SecretMediaViewer) ((n7.a1) obj2).f15119c).h((File) obj);
                return;
            case 23:
                i71 i71Var = (i71) obj2;
                i71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new StickersActivity(5, i71Var.L0));
                Runnable runnable = i71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 24:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.vc.a0((g91) obj2).k(false).j();
                return;
            case 25:
                g91.X((g91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 26:
                z81 z81Var = (z81) obj2;
                a0.i iVar3 = (a0.i) obj;
                g91 g91Var = z81Var.f40156b1;
                Activity parentActivity3 = g91Var.getParentActivity();
                y8 y8Var = g91Var.f33919b;
                int m12 = iVar3.m();
                if (iVar3.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar3.n(0)).f18125id;
                }
                org.telegram.ui.Components.vc.x(parentActivity3, y8Var, m12, j3, z81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), z81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 27:
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) obj2;
                new s91(o2Var3.getContext(), o2Var3.getCurrentAccount(), o2Var3.getResourceProvider(), (pf) obj).show();
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

    public ky0(org.telegram.ui.Components.iq0 iq0Var, a0.i iVar, int i10, int i11) {
        this.f35376a = i11;
        this.f35377b = iq0Var;
        this.f35378c = iVar;
    }
}
