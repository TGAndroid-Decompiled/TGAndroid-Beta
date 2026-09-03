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
public final class pr0 implements Runnable {
    public final int f40117a;
    public final Object f40118b;
    public final Object f40119c;

    public pr0(int i10, Object obj, Object obj2) {
        this.f40117a = i10;
        this.f40118b = obj;
        this.f40119c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.w8 w8Var;
        ArrayList arrayList;
        int i11;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f40117a;
        long j10 = 0;
        Object obj = this.f40119c;
        Object obj2 = this.f40118b;
        switch (i13) {
            case 0:
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (y5Var != null) {
                    ArrayList arrayList2 = y5Var.h;
                    org.telegram.ui.Components.v5 v5Var = y5Var.f33339n;
                    if (v5Var != null) {
                        arrayList2.add(v5Var);
                    }
                    org.telegram.ui.Components.v5 v5Var2 = y5Var.f33344r;
                    if (v5Var2 != null) {
                        arrayList2.add(v5Var2);
                    }
                    org.telegram.ui.Components.v5 v5Var3 = y5Var.f33346s;
                    if (v5Var3 != null) {
                        arrayList2.add(v5Var3);
                    }
                    y5Var.f33339n = new org.telegram.ui.Components.v5(bitmap);
                    y5Var.f33344r = null;
                    y5Var.f33346s = null;
                    y5Var.t();
                    return;
                }
                return;
            case 1:
                sr0 sr0Var = (sr0) obj2;
                sr0Var.getClass();
                ((View) obj).setOutlineProvider(null);
                PhotoViewer photoViewer = sr0Var.f41302c;
                ImageView imageView = photoViewer.f34404u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                hu0 hu0Var = photoViewer.B2;
                if (hu0Var != null) {
                    hu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 2:
                dt0 dt0Var = (dt0) obj2;
                org.telegram.ui.Components.j71 j71Var = (org.telegram.ui.Components.j71) obj;
                dt0Var.getClass();
                if (j71Var.p() > 0 && j71Var.n() >= j71Var.p() - 590) {
                    dt0Var.f36256a.f34230b0.invalidate();
                    return;
                }
                return;
            case 3:
                ht0 ht0Var = (ht0) obj2;
                eg.o1 o1Var = (eg.o1) obj;
                o1Var.f5391e.h();
                o1Var.f5390c.postRunnable(new ag.f(5));
                try {
                    ht0Var.f37476b.f34230b0.removeView(o1Var);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                ag.l lVar = (ag.l) obj;
                PhotoViewer photoViewer2 = ((ls0) obj2).f38769b;
                if (photoViewer2.f34452z3 != null) {
                    ImageView imageView2 = photoViewer2.f34404u3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer2.f34404u3.setImageBitmap(photoViewer2.f34452z3);
                    }
                    ((ImageReceiver) lVar.f212b).setImageBitmap(photoViewer2.f34452z3);
                    return;
                }
                return;
            case 5:
                ((rt0) obj2).f40943r.f34301i7.lock();
                ((AnimatorSet) obj).start();
                return;
            case 6:
                qu0 qu0Var = (qu0) obj;
                ((rt0) obj2).f40943r.f34360p4 = false;
                if (!qu0Var.f40694s) {
                    qu0Var.f40678a.setVisible(false, true);
                    return;
                }
                return;
            case 7:
                yv0 yv0Var = (yv0) obj2;
                yv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                yv0Var.c(true);
                return;
            case 8:
                yv0 yv0Var2 = (yv0) obj2;
                yv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                yv0Var2.c(true);
                return;
            case 9:
                yv0 yv0Var3 = (yv0) obj2;
                SendMessagesHelper.getInstance(yv0Var3.E.currentAccount).deletePollOption(yv0Var3.E, (byte[]) obj);
                yv0Var3.c(true);
                return;
            case 10:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                return;
            case 11:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 12:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z4 = !privacySettingsActivity2.S;
                privacySettingsActivity2.S = z4;
                ((org.telegram.ui.Cells.s8) obj).setChecked(z4);
                return;
            case 14:
                ((tx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 15:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f20853id);
                profileActivity.presentFragment(new xn(bundle), true);
                return;
            case 16:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j11 = profileActivity2.f34723x2;
                if (j11 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j11));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f34577c1, user);
                    if (profileActivity2.B2 != null && user != null && org.telegram.ui.Components.qc.a(profileActivity2)) {
                        org.telegram.ui.Components.qc.D(profileActivity2, user, profileActivity2.B2.title).j();
                    }
                    if (profileActivity2.f34683r2.participants.participants.remove(chatParticipant)) {
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
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f34577c1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f34577c1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.G1 = i10;
                profileActivity2.finishFragment();
                return;
            case 17:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 18:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.ic.e();
                af.g.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 19:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.B2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f34577c1);
                ((CountDownLatch) obj).countDown();
                return;
            case 20:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.D2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 21:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.o8) ((View) obj)).setChecked(profileActivity6.f34668p2.g());
                return;
            case 22:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (w8Var = profileActivity7.f34706u5) != null) {
                    w8Var.run();
                }
                profileActivity7.f34706u5 = null;
                return;
            case 23:
                yy0 yy0Var = (yy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = yy0Var.Y0.f44047c;
                Activity parentActivity = profileActivity8.getParentActivity();
                xz0 xz0Var = profileActivity8.f34630j5;
                int m9 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20849id;
                }
                org.telegram.ui.Components.qc.x(parentActivity, xz0Var, m9, j10, yy0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), yy0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 24:
                mz0 mz0Var = (mz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = mz0Var.Y0;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                xz0 xz0Var2 = profileActivity9.f34630j5;
                int m10 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f20849id;
                }
                org.telegram.ui.Components.qc.x(parentActivity2, xz0Var2, m10, j10, mz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), mz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 25:
                ((n01) obj2).f39152e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 26:
                ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                p2Var.d = (org.telegram.ui.ActionBar.g6) obj;
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                return;
            case 27:
                x01 x01Var = (x01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList3 = x01Var.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = x01Var.f42886e;
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
                    w01[] w01VarArr = x01Var.f42885c;
                    if (i17 < w01VarArr.length) {
                        w01 w01Var = w01VarArr[i17];
                        if (w01Var != null) {
                            String str6 = w01Var.f42240a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f21896q6)), indexOf, str9.length() + indexOf, 33);
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
                                    if (w01Var.f42244f == 502) {
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
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f21896q6)), indexOf2, str12.length() + indexOf2, 33);
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
            case 28:
                x01 x01Var2 = (x01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList7 = (ArrayList) obj;
                x01Var2.d.addAll(arrayList7);
                int i22 = x01Var2.f42887f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList7;
                MessagesController.getInstance(i22).faqWebPage = x01Var2.B;
                if (!x01Var2.f42891w) {
                    x01Var2.l();
                    return;
                }
                return;
            default:
                b11 b11Var = (b11) obj2;
                b11Var.f35319f.add((d11) obj);
                b11Var.a();
                return;
        }
    }

    public pr0(org.telegram.ui.Components.lq0 lq0Var, a0.h hVar, int i10, int i11) {
        this.f40117a = i11;
        this.f40118b = lq0Var;
        this.f40119c = hVar;
    }
}
