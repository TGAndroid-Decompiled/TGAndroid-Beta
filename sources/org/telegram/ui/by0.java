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
public final class by0 implements Runnable {
    public final int f32195a;
    public final Object f32196b;
    public final Object f32197c;

    public by0(int i10, Object obj, Object obj2) {
        this.f32195a = i10;
        this.f32196b = obj;
        this.f32197c = obj2;
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
        int i13 = this.f32195a;
        long j3 = 0;
        Object obj = this.f32197c;
        Object obj2 = this.f32196b;
        switch (i13) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f31248f1, user);
                    if (profileActivity.E2 != null && user != null && org.telegram.ui.Components.xc.a(profileActivity)) {
                        org.telegram.ui.Components.xc.D(profileActivity, user, profileActivity.E2.title).j();
                    }
                    if (profileActivity.f31351u2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, Long.valueOf(-profileActivity.f31248f1));
                } else {
                    i10 = 0;
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                }
                profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f31248f1, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId())));
                profileActivity.J1 = i10;
                profileActivity.finishFragment();
                return;
            case 1:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 2:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                profileActivity2.getClass();
                org.telegram.ui.Components.qc.e();
                nf.f.s(profileActivity2.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 3:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.E2 = profileActivity3.getMessagesStorage().getChat(profileActivity3.f31248f1);
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
                ((org.telegram.ui.Cells.s8) ((View) obj)).setChecked(profileActivity5.f31337s2.g());
                return;
            case 6:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (u8Var = profileActivity6.f31376x5) != null) {
                    u8Var.run();
                }
                profileActivity6.f31376x5 = null;
                return;
            case 7:
                dz0 dz0Var = (dz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity7 = dz0Var.f32752b1.f33047c;
                Activity parentActivity = profileActivity7.getParentActivity();
                c01 c01Var = profileActivity7.f31297m5;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f18087id;
                }
                org.telegram.ui.Components.xc.x(parentActivity, c01Var, m10, j3, dz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), dz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 8:
                rz0 rz0Var = (rz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity8 = rz0Var.f37091b1;
                Activity parentActivity2 = profileActivity8.getParentActivity();
                c01 c01Var2 = profileActivity8.f31297m5;
                int m11 = iVar2.m();
                if (iVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar2.n(0)).f18087id;
                }
                org.telegram.ui.Components.xc.x(parentActivity2, c01Var2, m11, j3, rz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), rz0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 9:
                ((s01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 10:
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = (org.telegram.ui.ActionBar.d6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            case 11:
                c11 c11Var = (c11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = c11Var.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = c11Var.e;
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
                    b11[] b11VarArr = c11Var.f32229c;
                    if (i16 < b11VarArr.length) {
                        b11 b11Var = b11VarArr[i16];
                        if (b11Var != null) {
                            String str6 = b11Var.f31925a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(n2Var2.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf, str9.length() + indexOf, 33);
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
                                    if (b11Var.f31928f == 502) {
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
                                    arrayList3.add(b11Var);
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
                        if (c11Var.E != null) {
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
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(n2Var2.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf2, str12.length() + indexOf2, 33);
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
                        AndroidUtilities.runOnUIThread(new d90(c11Var, str10, arrayList3, arrayList4, arrayList5, 22));
                        return;
                    }
                }
                break;
            case 12:
                c11 c11Var2 = (c11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                c11Var2.d.addAll(arrayList6);
                int i21 = c11Var2.f32230f;
                MessagesController.getInstance(i21).faqSearchArray = arrayList6;
                MessagesController.getInstance(i21).faqWebPage = c11Var2.E;
                if (!c11Var2.f32234w) {
                    c11Var2.l();
                    return;
                }
                return;
            case 13:
                g11 g11Var = (g11) obj2;
                g11Var.f33434f.add((i11) obj);
                g11Var.a();
                return;
            case 14:
                ((x21) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 15:
                r21 r21Var = (r21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    r21Var.getClass();
                    return;
                }
                int i22 = r21Var.J;
                if (i22 != 0 && i22 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) r21Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            r21Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                r21Var.J = tL_exportedContactToken.expires;
                r21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 16:
                t31 t31Var = (t31) ((View[]) obj2)[0];
                t31Var.f37513b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                t31Var.f37514c = null;
                t31Var.d = null;
                t31Var.f37515f.Y2.N(false);
                return;
            case 17:
                ((t31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 18:
                t31 t31Var2 = (t31) ((View[]) obj2)[0];
                t31Var2.f37513b = null;
                t31Var2.f37514c = (TLRPC.TL_reportResultChooseOption) obj;
                t31Var2.d = null;
                t31Var2.f37515f.Y2.N(false);
                return;
            case 19:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 20:
                org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.oy) obj);
                return;
            case 21:
                ((SecretMediaViewer) obj2).M = false;
                ((wu0) obj).f39094a.setVisible(false, true);
                return;
            case 22:
                ((SecretMediaViewer) ((n7.a1) obj2).f15084c).h((File) obj);
                return;
            case 23:
                z61 z61Var = (z61) obj2;
                z61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, z61Var.L0));
                Runnable runnable = z61Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 24:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((x81) obj2).k(false).j();
                return;
            case 25:
                x81.W((x81) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 26:
                q81 q81Var = (q81) obj2;
                a0.i iVar3 = (a0.i) obj;
                x81 x81Var = q81Var.f36321b1;
                Activity parentActivity3 = x81Var.getParentActivity();
                w8 w8Var = x81Var.f39208b;
                int m12 = iVar3.m();
                if (iVar3.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar3.n(0)).f18087id;
                }
                org.telegram.ui.Components.xc.x(parentActivity3, w8Var, m12, j3, q81Var.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), q81Var.getThemedColor(org.telegram.ui.ActionBar.h6.Hi)).j();
                return;
            case 27:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj2;
                new j91(n2Var3.getContext(), n2Var3.getCurrentAccount(), n2Var3.getResourceProvider(), (oc) obj).show();
                return;
            case 28:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.n8) obj);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.x8) {
                    ((org.telegram.ui.Cells.x8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    return;
                }
                return;
        }
    }

    public by0(org.telegram.ui.Components.hq0 hq0Var, a0.i iVar, int i10, int i11) {
        this.f32195a = i11;
        this.f32196b = hq0Var;
        this.f32197c = iVar;
    }
}
