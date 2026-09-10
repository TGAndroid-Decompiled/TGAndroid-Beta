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
import org.telegram.tgnet.tl.TL_fragment;
public final class ey0 implements Runnable {
    public final int f32644a;
    public final Object f32645b;
    public final Object f32646c;

    public ey0(int i10, Object obj, Object obj2) {
        this.f32644a = i10;
        this.f32645b = obj;
        this.f32646c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.a9 a9Var;
        int i11;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        int i12;
        String[] strArr;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f32644a;
        long j3 = 0;
        Object obj = this.f32646c;
        Object obj2 = this.f32645b;
        switch (i13) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                boolean z10 = !privacySettingsActivity.V;
                privacySettingsActivity.V = z10;
                ((org.telegram.ui.Cells.x8) obj).setChecked(z10);
                return;
            case 1:
                ((ky0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f17203id);
                profileActivity.presentFragment(new eo(bundle), true);
                return;
            case 3:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f30389f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.wc.a(profileActivity2)) {
                        org.telegram.ui.Components.wc.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.f30492u2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f30389f1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f30389f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.J1 = i10;
                profileActivity2.finishFragment();
                return;
            case 4:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 5:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.pc.e();
                nf.f.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 6:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f30389f1);
                ((CountDownLatch) obj).countDown();
                return;
            case 7:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 8:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.s8) ((View) obj)).setChecked(profileActivity6.f30478s2.g());
                return;
            case 9:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (a9Var = profileActivity7.f30517x5) != null) {
                    a9Var.run();
                }
                profileActivity7.f30517x5 = null;
                return;
            case 10:
                oz0 oz0Var = (oz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity8 = oz0Var.f35650b1.f35936c;
                Activity parentActivity = profileActivity8.getParentActivity();
                p01 p01Var = profileActivity8.f30438m5;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f17199id;
                }
                org.telegram.ui.Components.wc.x(parentActivity, p01Var, m10, j3, oz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), oz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 11:
                c01 c01Var = (c01) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity9 = c01Var.f31479b1;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                p01 p01Var2 = profileActivity9.f30438m5;
                int m11 = iVar2.m();
                if (iVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar2.n(0)).f17199id;
                }
                org.telegram.ui.Components.wc.x(parentActivity2, p01Var2, m11, j3, c01Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), c01Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 12:
                ((f11) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 13:
                ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                p2Var.d = (org.telegram.ui.ActionBar.f6) obj;
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                return;
            case 14:
                p11 p11Var = (p11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = p11Var.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = p11Var.e;
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
                    o11[] o11VarArr = p11Var.f35662c;
                    if (i17 < o11VarArr.length) {
                        o11 o11Var = o11VarArr[i17];
                        if (o11Var != null) {
                            String str6 = o11Var.f35381a;
                            String str7 = " " + str6.toLowerCase();
                            int i18 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i18 < split.length) {
                                if (split[i18].length() != 0) {
                                    String str8 = split[i18];
                                    str3 = str5;
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
                                        i12 = i17;
                                        strArr = strArr2;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i17++;
                                        str5 = str3;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str7;
                                    str3 = str5;
                                    i12 = i17;
                                    strArr = strArr2;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i18 == split.length - 1) {
                                    if (o11Var.f35384f == 502) {
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
                                    arrayList3.add(o11Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i18++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                str5 = str3;
                                strArr2 = strArr;
                                str7 = str2;
                                i17 = i12;
                            }
                        }
                        str3 = str5;
                        i17++;
                        str5 = str3;
                        strArr2 = strArr2;
                    } else {
                        String str10 = str5;
                        String[] strArr3 = strArr2;
                        if (p11Var.E != null) {
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
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.q6)), indexOf2, str12.length() + indexOf2, 33);
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
                        AndroidUtilities.runOnUIThread(new ac0(p11Var, str10, arrayList3, arrayList4, arrayList5));
                        return;
                    }
                }
                break;
            case 15:
                p11 p11Var2 = (p11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                p11Var2.d.addAll(arrayList6);
                int i22 = p11Var2.f35663f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = p11Var2.E;
                if (!p11Var2.f35667w) {
                    p11Var2.l();
                    return;
                }
                return;
            case 16:
                t11 t11Var = (t11) obj2;
                t11Var.f36816f.add((v11) obj);
                t11Var.a();
                return;
            case 17:
                ((k31) obj2).e0(34, (Bitmap) obj, true);
                return;
            case 18:
                e31 e31Var = (e31) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    e31Var.getClass();
                    return;
                }
                int i23 = e31Var.J;
                if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) e31Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            e31Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                e31Var.J = tL_exportedContactToken.expires;
                e31Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 19:
                g41 g41Var = (g41) ((View[]) obj2)[0];
                g41Var.f32989b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                g41Var.f32990c = null;
                g41Var.d = null;
                g41Var.f32991f.Y2.N(false);
                return;
            case 20:
                ((g41) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
            case 21:
                g41 g41Var2 = (g41) ((View[]) obj2)[0];
                g41Var2.f32989b = null;
                g41Var2.f32990c = (TLRPC.TL_reportResultChooseOption) obj;
                g41Var2.d = null;
                g41Var2.f32991f.Y2.N(false);
                return;
            case 22:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 23:
                org.telegram.ui.Components.wc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.hy) obj);
                return;
            case 24:
                ((SecretMediaViewer) obj2).M = false;
                ((ev0) obj).f32616a.setVisible(false, true);
                return;
            case 25:
                ((SecretMediaViewer) ((og.u0) obj2).f14498c).h((File) obj);
                return;
            case 26:
                l71 l71Var = (l71) obj2;
                l71Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new StickersActivity(5, l71Var.L0));
                Runnable runnable = l71Var.T1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.wc.a0((k91) obj2).k(false).j();
                return;
            case 28:
                k91.X((k91) obj2, (TLRPC.TL_attachMenuBot) obj);
                return;
            default:
                d91 d91Var = (d91) obj2;
                a0.i iVar3 = (a0.i) obj;
                k91 k91Var = d91Var.f31867b1;
                Activity parentActivity3 = k91Var.getParentActivity();
                w8 w8Var = k91Var.f34296b;
                int m12 = iVar3.m();
                if (iVar3.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar3.n(0)).f17199id;
                }
                org.telegram.ui.Components.wc.x(parentActivity3, w8Var, m12, j3, d91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), d91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
        }
    }

    public ey0(org.telegram.ui.Components.sq0 sq0Var, a0.i iVar, int i10, int i11) {
        this.f32644a = i11;
        this.f32645b = sq0Var;
        this.f32646c = iVar;
    }
}
