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
    public final int f34733a;
    public final Object f34734b;
    public final Object f34735c;

    public iy0(int i10, Object obj, Object obj2) {
        this.f34733a = i10;
        this.f34734b = obj;
        this.f34735c = obj2;
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
        int i13 = this.f34733a;
        long j3 = 0;
        Object obj = this.f34735c;
        Object obj2 = this.f34734b;
        switch (i13) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f31274f1, user);
                    if (profileActivity.E2 != null && user != null && org.telegram.ui.Components.vc.a(profileActivity)) {
                        org.telegram.ui.Components.vc.D(profileActivity, user, profileActivity.E2.title).j();
                    }
                    if (profileActivity.f31377u2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, Long.valueOf(-profileActivity.f31274f1));
                } else {
                    i10 = 0;
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                }
                profileActivity.getMessagesController().deleteParticipantFromChat(profileActivity.f31274f1, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.getUserConfig().getClientUserId())));
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
                profileActivity3.E2 = profileActivity3.getMessagesStorage().getChat(profileActivity3.f31274f1);
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
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity5.f31363s2.g());
                return;
            case 6:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (t8Var = profileActivity6.f31402x5) != null) {
                    t8Var.run();
                }
                profileActivity6.f31402x5 = null;
                return;
            case 7:
                lz0 lz0Var = (lz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity7 = lz0Var.f35568b1.f35849c;
                Activity parentActivity = profileActivity7.getParentActivity();
                k01 k01Var = profileActivity7.f31323m5;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f18113id;
                }
                org.telegram.ui.Components.vc.x(parentActivity, k01Var, m10, j3, lz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), lz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 8:
                zz0 zz0Var = (zz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity8 = zz0Var.f40336b1;
                Activity parentActivity2 = profileActivity8.getParentActivity();
                k01 k01Var2 = profileActivity8.f31323m5;
                int m11 = iVar2.m();
                if (iVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar2.n(0)).f18113id;
                }
                org.telegram.ui.Components.vc.x(parentActivity2, k01Var2, m11, j3, zz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), zz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 9:
                ((a11) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 10:
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = (org.telegram.ui.ActionBar.e6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            case 11:
                k11 k11Var = (k11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = k11Var.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = k11Var.e;
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
                    j11[] j11VarArr = k11Var.f35022c;
                    if (i16 < j11VarArr.length) {
                        j11 j11Var = j11VarArr[i16];
                        if (j11Var != null) {
                            String str6 = j11Var.f34771a;
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
                                    if (j11Var.f34774f == 502) {
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
                                    arrayList3.add(j11Var);
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
                        if (k11Var.E != null) {
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
                        AndroidUtilities.runOnUIThread(new g90(k11Var, str10, arrayList3, arrayList4, arrayList5, 22));
                        return;
                    }
                }
                break;
            case 12:
                k11 k11Var2 = (k11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                k11Var2.d.addAll(arrayList6);
                int i21 = k11Var2.f35023f;
                MessagesController.getInstance(i21).faqSearchArray = arrayList6;
                MessagesController.getInstance(i21).faqWebPage = k11Var2.E;
                if (!k11Var2.f35027w) {
                    k11Var2.l();
                    return;
                }
                return;
            case 13:
                o11 o11Var = (o11) obj2;
                o11Var.f36093f.add((q11) obj);
                o11Var.a();
                return;
            case 14:
                ((f31) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 15:
                z21 z21Var = (z21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    z21Var.getClass();
                    return;
                }
                int i22 = z21Var.J;
                if (i22 != 0 && i22 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) z21Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            z21Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                z21Var.J = tL_exportedContactToken.expires;
                z21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 16:
                b41 b41Var = (b41) ((View[]) obj2)[0];
                b41Var.f32031b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                b41Var.f32032c = null;
                b41Var.d = null;
                b41Var.f32033f.Y2.N(false);
                return;
            case 17:
                ((b41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 18:
                b41 b41Var2 = (b41) ((View[]) obj2)[0];
                b41Var2.f32031b = null;
                b41Var2.f32032c = (TLRPC.TL_reportResultChooseOption) obj;
                b41Var2.d = null;
                b41Var2.f32033f.Y2.N(false);
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
                ((dv0) obj).f33096a.setVisible(false, true);
                return;
            case 22:
                ((SecretMediaViewer) ((n7.a1) obj2).f15107c).h((File) obj);
                return;
            case 23:
                h71 h71Var = (h71) obj2;
                h71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new StickersActivity(5, h71Var.L0));
                Runnable runnable = h71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 24:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.vc.a0((f91) obj2).k(false).j();
                return;
            case 25:
                f91.X((f91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            case 26:
                y81 y81Var = (y81) obj2;
                a0.i iVar3 = (a0.i) obj;
                f91 f91Var = y81Var.f39779b1;
                Activity parentActivity3 = f91Var.getParentActivity();
                w8 w8Var = f91Var.f33544b;
                int m12 = iVar3.m();
                if (iVar3.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar3.n(0)).f18113id;
                }
                org.telegram.ui.Components.vc.x(parentActivity3, w8Var, m12, j3, y81Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), y81Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 27:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj2;
                new r91(n2Var3.getContext(), n2Var3.getCurrentAccount(), n2Var3.getResourceProvider(), (nf) obj).show();
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
        this.f34733a = i11;
        this.f34734b = hq0Var;
        this.f34735c = iVar;
    }
}
