package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
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
public final class gr0 implements Runnable {
    public final int f34498a;
    public final Object f34499b;
    public final Object f34500c;

    public gr0(int i10, Object obj, Object obj2) {
        this.f34498a = i10;
        this.f34499b = obj;
        this.f34500c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.w8 w8Var;
        ArrayList arrayList;
        int i11;
        String str;
        String str2;
        String str3;
        int i12;
        String[] strArr;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f34498a;
        long j10 = 0;
        Object obj = this.f34500c;
        Object obj2 = this.f34499b;
        switch (i13) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                dg.q1 q1Var = (dg.q1) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                q1Var.e.h();
                q1Var.f4735c.postRunnable(new cg.n0(2));
                photoViewer.f31679b0.removeView(photoViewer.K1);
                return;
            case 1:
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                if (y5Var != null) {
                    ArrayList arrayList2 = y5Var.h;
                    org.telegram.ui.Components.v5 v5Var = y5Var.f30852n;
                    if (v5Var != null) {
                        arrayList2.add(v5Var);
                    }
                    org.telegram.ui.Components.v5 v5Var2 = y5Var.f30857r;
                    if (v5Var2 != null) {
                        arrayList2.add(v5Var2);
                    }
                    org.telegram.ui.Components.v5 v5Var3 = y5Var.f30859s;
                    if (v5Var3 != null) {
                        arrayList2.add(v5Var3);
                    }
                    y5Var.f30852n = new org.telegram.ui.Components.v5(bitmap);
                    y5Var.f30857r = null;
                    y5Var.f30859s = null;
                    y5Var.t();
                    return;
                }
                return;
            case 2:
                sr0 sr0Var = (sr0) obj2;
                sr0Var.getClass();
                ((View) obj).setOutlineProvider(null);
                PhotoViewer photoViewer2 = sr0Var.f38301c;
                ImageView imageView = photoViewer2.f31852u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                hu0 hu0Var = photoViewer2.B2;
                if (hu0Var != null) {
                    hu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 3:
                dt0 dt0Var = (dt0) obj2;
                org.telegram.ui.Components.i71 i71Var = (org.telegram.ui.Components.i71) obj;
                dt0Var.getClass();
                if (i71Var.p() > 0 && i71Var.n() >= i71Var.p() - 590) {
                    dt0Var.f33530a.f31679b0.invalidate();
                    return;
                }
                return;
            case 4:
                ht0 ht0Var = (ht0) obj2;
                dg.q1 q1Var2 = (dg.q1) obj;
                q1Var2.e.h();
                q1Var2.f4735c.postRunnable(new cg.n0(2));
                try {
                    ht0Var.f34751b.f31679b0.removeView(q1Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                ah.e eVar = (ah.e) obj;
                PhotoViewer photoViewer3 = ((ls0) obj2).f35916b;
                if (photoViewer3.f31900z3 != null) {
                    ImageView imageView2 = photoViewer3.f31852u3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer3.f31852u3.setImageBitmap(photoViewer3.f31900z3);
                    }
                    ((ImageReceiver) eVar.f212b).setImageBitmap(photoViewer3.f31900z3);
                    return;
                }
                return;
            case 6:
                ((rt0) obj2).f38059r.f31749i7.lock();
                ((AnimatorSet) obj).start();
                return;
            case 7:
                qu0 qu0Var = (qu0) obj;
                ((rt0) obj2).f38059r.f31808p4 = false;
                if (!qu0Var.f37502s) {
                    qu0Var.f37487a.setVisible(false, true);
                    return;
                }
                return;
            case 8:
                yv0 yv0Var = (yv0) obj2;
                yv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                yv0Var.c(true);
                return;
            case 9:
                yv0 yv0Var2 = (yv0) obj2;
                yv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                yv0Var2.c(true);
                return;
            case 10:
                yv0 yv0Var3 = (yv0) obj2;
                SendMessagesHelper.getInstance(yv0Var3.E.currentAccount).deletePollOption(yv0Var3.E, (byte[]) obj);
                yv0Var3.c(true);
                return;
            case 11:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                return;
            case 12:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                return;
            case 14:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z4 = !privacySettingsActivity2.S;
                privacySettingsActivity2.S = z4;
                ((org.telegram.ui.Cells.r8) obj).setChecked(z4);
                return;
            case 15:
                ((tx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f19167id);
                profileActivity.presentFragment(new zn(bundle), true);
                return;
            case 17:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j11 = profileActivity2.f32164x2;
                if (j11 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j11));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f32019c1, user);
                    if (profileActivity2.B2 != null && user != null && org.telegram.ui.Components.qc.a(profileActivity2)) {
                        org.telegram.ui.Components.qc.D(profileActivity2, user, profileActivity2.B2.title).j();
                    }
                    if (profileActivity2.f32124r2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f32019c1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f32019c1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.G1 = i10;
                profileActivity2.finishFragment();
                return;
            case 18:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 19:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.ic.e();
                ze.d.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 20:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.B2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f32019c1);
                ((CountDownLatch) obj).countDown();
                return;
            case 21:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.D2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 22:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.n8) ((View) obj)).setChecked(profileActivity6.f32109p2.g());
                return;
            case 23:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (w8Var = profileActivity7.f32147u5) != null) {
                    w8Var.run();
                }
                profileActivity7.f32147u5 = null;
                return;
            case 24:
                yy0 yy0Var = (yy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = yy0Var.Y0.f40904c;
                Activity parentActivity = profileActivity8.getParentActivity();
                xz0 xz0Var = profileActivity8.f32071j5;
                int m9 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f19163id;
                }
                org.telegram.ui.Components.qc.x(parentActivity, xz0Var, m9, j10, yy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), yy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 25:
                mz0 mz0Var = (mz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = mz0Var.Y0;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                xz0 xz0Var2 = profileActivity9.f32071j5;
                int m10 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f19163id;
                }
                org.telegram.ui.Components.qc.x(parentActivity2, xz0Var2, m10, j10, mz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), mz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 26:
                ((n01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 27:
                ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                p2Var.d = (org.telegram.ui.ActionBar.f6) obj;
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                return;
            case 28:
                x01 x01Var = (x01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList3 = x01Var.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = x01Var.e;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
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
                    w01[] w01VarArr = x01Var.f39799c;
                    if (i17 < w01VarArr.length) {
                        w01 w01Var = w01VarArr[i17];
                        if (w01Var != null) {
                            String str6 = w01Var.f39228a;
                            String str7 = " " + str6.toLowerCase();
                            int i18 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i18 < split.length) {
                                if (split[i18].length() != 0) {
                                    String str8 = split[i18];
                                    str2 = str5;
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
                                        str3 = str7;
                                        i12 = i17;
                                        strArr = strArr2;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20115q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i17++;
                                        str5 = str2;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str5;
                                    str3 = str7;
                                    i12 = i17;
                                    strArr = strArr2;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i18 == split.length - 1) {
                                    if (w01Var.f39231f == 502) {
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
                                    arrayList4.add(w01Var);
                                    arrayList6.add(spannableStringBuilder);
                                }
                                i18++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                str5 = str2;
                                strArr2 = strArr;
                                str7 = str3;
                                i17 = i12;
                            }
                        }
                        str2 = str5;
                        i17++;
                        str5 = str2;
                        strArr2 = strArr2;
                    } else {
                        String str10 = str5;
                        String[] strArr3 = strArr2;
                        if (x01Var.B != null) {
                            int size = arrayList3.size();
                            int i20 = 0;
                            while (i20 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList3.get(i20);
                                String str11 = " " + faqSearchResult.title.toLowerCase();
                                int i21 = 0;
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                while (true) {
                                    if (i21 < split.length) {
                                        if (split[i21].length() != 0) {
                                            String str12 = split[i21];
                                            int indexOf2 = str11.indexOf(" " + str12);
                                            arrayList = arrayList3;
                                            if (indexOf2 < 0 && (str = strArr3[i21]) != null) {
                                                indexOf2 = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf2 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                i11 = size;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20115q6)), indexOf2, str12.length() + indexOf2, 33);
                                            }
                                        } else {
                                            arrayList = arrayList3;
                                            i11 = size;
                                        }
                                        if (spannableStringBuilder3 != null && i21 == split.length - 1) {
                                            arrayList5.add(faqSearchResult);
                                            arrayList6.add(spannableStringBuilder3);
                                        }
                                        i21++;
                                        arrayList3 = arrayList;
                                        size = i11;
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                }
                                i20++;
                                arrayList3 = arrayList;
                                size = size;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(x01Var, str10, arrayList4, arrayList5, arrayList6, 28));
                        return;
                    }
                }
                break;
            default:
                x01 x01Var2 = (x01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList7 = (ArrayList) obj;
                x01Var2.d.addAll(arrayList7);
                int i22 = x01Var2.f39800f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList7;
                MessagesController.getInstance(i22).faqWebPage = x01Var2.B;
                if (!x01Var2.f39804w) {
                    x01Var2.l();
                    return;
                }
                return;
        }
    }

    public gr0(org.telegram.ui.Components.lq0 lq0Var, a0.h hVar, int i10, int i11) {
        this.f34498a = i11;
        this.f34499b = lq0Var;
        this.f34500c = hVar;
    }
}
