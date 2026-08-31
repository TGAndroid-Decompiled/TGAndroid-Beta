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
public final class br0 implements Runnable {
    public final int f35581a;
    public final Object f35582b;
    public final Object f35583c;

    public br0(int i10, Object obj, Object obj2) {
        this.f35581a = i10;
        this.f35582b = obj;
        this.f35583c = obj2;
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
        int i13 = this.f35581a;
        long j10 = 0;
        Object obj = this.f35583c;
        Object obj2 = this.f35582b;
        switch (i13) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                eg.o1 o1Var = (eg.o1) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                o1Var.f5391e.h();
                o1Var.f5390c.postRunnable(new ag.f(5));
                photoViewer.f34230b0.removeView(photoViewer.K1);
                return;
            case 1:
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                if (y5Var != null) {
                    ArrayList arrayList2 = y5Var.h;
                    org.telegram.ui.Components.v5 v5Var = y5Var.f33323n;
                    if (v5Var != null) {
                        arrayList2.add(v5Var);
                    }
                    org.telegram.ui.Components.v5 v5Var2 = y5Var.f33328r;
                    if (v5Var2 != null) {
                        arrayList2.add(v5Var2);
                    }
                    org.telegram.ui.Components.v5 v5Var3 = y5Var.f33330s;
                    if (v5Var3 != null) {
                        arrayList2.add(v5Var3);
                    }
                    y5Var.f33323n = new org.telegram.ui.Components.v5(bitmap);
                    y5Var.f33328r = null;
                    y5Var.f33330s = null;
                    y5Var.t();
                    return;
                }
                return;
            case 2:
                nr0 nr0Var = (nr0) obj2;
                nr0Var.getClass();
                ((View) obj).setOutlineProvider(null);
                PhotoViewer photoViewer2 = nr0Var.f39511c;
                ImageView imageView = photoViewer2.f34404u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                cu0 cu0Var = photoViewer2.B2;
                if (cu0Var != null) {
                    cu0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 3:
                ys0 ys0Var = (ys0) obj2;
                org.telegram.ui.Components.k71 k71Var = (org.telegram.ui.Components.k71) obj;
                ys0Var.getClass();
                if (k71Var.p() > 0 && k71Var.n() >= k71Var.p() - 590) {
                    ys0Var.f43703a.f34230b0.invalidate();
                    return;
                }
                return;
            case 4:
                ct0 ct0Var = (ct0) obj2;
                eg.o1 o1Var2 = (eg.o1) obj;
                o1Var2.f5391e.h();
                o1Var2.f5390c.postRunnable(new ag.f(5));
                try {
                    ct0Var.f35908b.f34230b0.removeView(o1Var2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 5:
                ag.l lVar = (ag.l) obj;
                PhotoViewer photoViewer3 = ((gs0) obj2).f37263b;
                if (photoViewer3.f34452z3 != null) {
                    ImageView imageView2 = photoViewer3.f34404u3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer3.f34404u3.setImageBitmap(photoViewer3.f34452z3);
                    }
                    ((ImageReceiver) lVar.f212b).setImageBitmap(photoViewer3.f34452z3);
                    return;
                }
                return;
            case 6:
                ((mt0) obj2).f39226r.f34301i7.lock();
                ((AnimatorSet) obj).start();
                return;
            case 7:
                lu0 lu0Var = (lu0) obj;
                ((mt0) obj2).f39226r.f34360p4 = false;
                if (!lu0Var.f38880s) {
                    lu0Var.f38864a.setVisible(false, true);
                    return;
                }
                return;
            case 8:
                tv0 tv0Var = (tv0) obj2;
                tv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                tv0Var.c(true);
                return;
            case 9:
                tv0 tv0Var2 = (tv0) obj2;
                tv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                tv0Var2.c(true);
                return;
            case 10:
                tv0 tv0Var3 = (tv0) obj2;
                SendMessagesHelper.getInstance(tv0Var3.E.currentAccount).deletePollOption(tv0Var3.E, (byte[]) obj);
                tv0Var3.c(true);
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
                ((org.telegram.ui.Cells.s8) obj).setChecked(z4);
                return;
            case 15:
                ((ox0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f20851id);
                profileActivity.presentFragment(new xn(bundle), true);
                return;
            case 17:
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
            case 18:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 19:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.ic.e();
                af.g.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 20:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.B2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f34577c1);
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
                ((org.telegram.ui.Cells.o8) ((View) obj)).setChecked(profileActivity6.f34668p2.g());
                return;
            case 23:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (w8Var = profileActivity7.f34706u5) != null) {
                    w8Var.run();
                }
                profileActivity7.f34706u5 = null;
                return;
            case 24:
                ty0 ty0Var = (ty0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = ty0Var.Y0.f42067c;
                Activity parentActivity = profileActivity8.getParentActivity();
                sz0 sz0Var = profileActivity8.f34630j5;
                int m9 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f20847id;
                }
                org.telegram.ui.Components.qc.x(parentActivity, sz0Var, m9, j10, ty0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), ty0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 25:
                iz0 iz0Var = (iz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = iz0Var.Y0;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                sz0 sz0Var2 = profileActivity9.f34630j5;
                int m10 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f20847id;
                }
                org.telegram.ui.Components.qc.x(parentActivity2, sz0Var2, m10, j10, iz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), iz0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                return;
            case 26:
                ((i01) obj2).f37715e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 27:
                ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                p2Var.d = (org.telegram.ui.ActionBar.g6) obj;
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                return;
            case 28:
                s01 s01Var = (s01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList3 = s01Var.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = s01Var.f41095e;
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
                    r01[] r01VarArr = s01Var.f41094c;
                    if (i17 < r01VarArr.length) {
                        r01 r01Var = r01VarArr[i17];
                        if (r01Var != null) {
                            String str6 = r01Var.f40737a;
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f21894q6)), indexOf, str9.length() + indexOf, 33);
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
                                    if (r01Var.f40741f == 502) {
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
                                    arrayList4.add(r01Var);
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
                        if (s01Var.B != null) {
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
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f21894q6)), indexOf2, str12.length() + indexOf2, 33);
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
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ky0(s01Var, str10, arrayList4, arrayList5, arrayList6, 28));
                        return;
                    }
                }
                break;
            default:
                s01 s01Var2 = (s01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList7 = (ArrayList) obj;
                s01Var2.d.addAll(arrayList7);
                int i22 = s01Var2.f41096f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList7;
                MessagesController.getInstance(i22).faqWebPage = s01Var2.B;
                if (!s01Var2.f41100w) {
                    s01Var2.l();
                    return;
                }
                return;
        }
    }

    public br0(org.telegram.ui.Components.mq0 mq0Var, a0.h hVar, int i10, int i11) {
        this.f35581a = i11;
        this.f35582b = mq0Var;
        this.f35583c = hVar;
    }
}
