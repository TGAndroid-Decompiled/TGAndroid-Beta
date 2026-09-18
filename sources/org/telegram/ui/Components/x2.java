package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
public final class x2 implements Runnable {
    public final int f30217a;
    public final int f30218b;
    public final Object f30219c;

    public x2(int i10, l90 l90Var) {
        this.f30217a = 0;
        this.f30218b = i10;
        this.f30219c = l90Var;
    }

    @Override
    public final void run() {
        String str;
        CharSequence replaceTags;
        int i10;
        int i11;
        int i12;
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i13;
        int i14;
        org.telegram.ui.vu0 vu0Var;
        String str2;
        int i15;
        int i16 = this.f30217a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f30218b;
        Object obj = this.f30219c;
        switch (i16) {
            case 0:
                l90 l90Var = (l90) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i18).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i19 = 0;
                    while (true) {
                        if (i19 < privacyRules.size()) {
                            if (privacyRules.get(i19) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i19) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i19) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i19++;
                            }
                        }
                    }
                }
                l90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new m1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 1:
                ((o8) obj).b(i18);
                return;
            case 2:
                kd kdVar = (kd) obj;
                ci.f4 f4Var = kdVar.f25686d1;
                if (kdVar.f25684b1 != i18) {
                    kdVar.setTimer(i18);
                    Utilities.Callback callback = kdVar.f25699r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (kdVar.f25698q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        f4Var.h = kdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f4630e0 = AndroidUtilities.dp(0);
                        f4Var.f4629d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (kdVar.f25698q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        f4Var.h = kdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f4630e0 = AndroidUtilities.dp(0);
                        f4Var.f4629d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (kdVar.f25698q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        f4Var.p(true);
                        f4Var.h = ci.f4.a(replaceTags, f4Var.getTextPaint());
                        f4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f4Var.f4630e0 = AndroidUtilities.dp(2);
                        f4Var.f4629d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), kdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (kdVar instanceof org.telegram.ui.ct0) {
                        f7 = -1.0f;
                    }
                    f4Var.setTranslationY(dp * f7);
                    f4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    ij0 ij0Var = new ij0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    ij0Var.start();
                    f4Var.j(ij0Var);
                    f4Var.u();
                    kdVar.f25696o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(kdVar.f25697p1);
                    kdVar.invalidate();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.f22061z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.f21937c5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f21990m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 4:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (i18 == pmVar.O && qmVar.f27686w.isShown()) {
                    qmVar.f27686w.e(1, true);
                    return;
                }
                return;
            case 5:
                kz kzVar = (kz) obj;
                if (kzVar.P1) {
                    ly lyVar = kzVar.f25945t1;
                    if (lyVar != null && lyVar.k()) {
                        try {
                            kzVar.f25957x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new x2(kzVar, max, 5), max);
                    return;
                }
                return;
            case 6:
                ((xa0) obj).f30300b.run(Integer.valueOf(i18));
                return;
            case 7:
                yf0 yf0Var = (yf0) obj;
                org.telegram.ui.iu0 iu0Var = yf0Var.f30569a;
                TextView textView = iu0Var.e;
                ci.eb ebVar = iu0Var.h;
                RadialProgressView radialProgressView = iu0Var.f30787n;
                TextView textView2 = iu0Var.d;
                textView.setVisibility(8);
                iu0Var.f30786f.setVisibility(8);
                LinearLayout linearLayout = iu0Var.f30785c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new xf0(yf0Var, 0));
                }
                if (ebVar.getAlpha() == 1.0f) {
                    ebVar.animate().cancel();
                    ebVar.animate().alpha(0.0f).setDuration(150L).setListener(new xf0(yf0Var, 1));
                }
                if (i18 != 2) {
                    if (i18 != 5) {
                        if (i18 != 150) {
                            if (i18 != 100) {
                                if (i18 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                                return;
                            }
                        }
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                        textView.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new g80(yf0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 8:
                gj0 gj0Var = (gj0) obj;
                gj0Var.V0 = false;
                if (gj0Var.W0) {
                    gj0Var.C(true);
                    return;
                }
                gj0Var.f24422a1 = i18;
                gj0Var.I();
                gj0Var.x();
                return;
            case 9:
                ((kv0) obj).d1(i18);
                return;
            case 10:
                ((du0) obj).h.scrollBy(0, i18);
                return;
            case 11:
                kv0 kv0Var = ((ct0) obj).f23325a;
                org.telegram.ui.ActionBar.n2 n2Var = kv0Var.f25848v1;
                if (n2Var != null) {
                    if (kv0Var.f25810d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = kv0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(kv0Var.f25810d1.f18297id);
                        TLRPC.ChatFull chatFull = kv0Var.f25810d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = kv0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = kv0Var.f25812e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(kv0Var.f25812e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    kv0Var.v1(true);
                    return;
                }
                return;
            case 12:
                ((ix0) obj).l0(i18, 0);
                return;
            case 13:
                v41 v41Var = (v41) obj;
                v41Var.U();
                v41Var.f28921g0 = i18;
                k41.I(v41Var.f28920f0);
                v41Var.V();
                return;
            case 14:
                ((w81) obj).v.y0(i18);
                return;
            case 15:
                q91 q91Var = (q91) obj;
                u71 u71Var = q91Var.f27509a;
                if (i18 == -1) {
                    if (u71Var.y()) {
                        u71Var.B();
                        q91Var.n();
                    }
                    q91Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (q91Var.K) {
                        q91Var.K = false;
                        u71Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && u71Var.y()) {
                    q91Var.K = true;
                    u71Var.B();
                    q91Var.n();
                    return;
                } else {
                    return;
                }
            case 16:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    i60Var.y3 = Integer.valueOf(i18);
                }
                xc xcVar = new xc(i60Var.topBulletinContainer, new ai.a1());
                Resources resources = i60Var.getContext().getResources();
                if (i18 == 2) {
                    i13 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i13 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i13 = R.drawable.msg_voice_headphones;
                    } else {
                        i13 = R.drawable.msg_voice_phone;
                    }
                }
                xcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.i60.g1(i18)).k(i60Var.n1());
                return;
            case 17:
                org.telegram.ui.i60 i60Var2 = ((org.telegram.ui.l50) obj).f35254b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    i60Var2.y3 = Integer.valueOf(i18);
                }
                xc xcVar2 = new xc(i60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = i60Var2.getContext().getResources();
                if (i18 == 2) {
                    i14 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i14 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i14 = R.drawable.msg_voice_headphones;
                    } else {
                        i14 = R.drawable.msg_voice_phone;
                    }
                }
                xcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.i60.g1(i18)).k(i60Var2.n1());
                return;
            case 18:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = e70Var.f33206n.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = e70Var.f33206n.getChildAt(i20);
                    e70Var.f33206n.getClass();
                    if (RecyclerView.S(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(e70Var.f33206n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / e70Var.f33206n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 19:
                org.telegram.ui.jd0 jd0Var = (org.telegram.ui.jd0) obj;
                jd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                jd0Var.A0(false);
                return;
            case 20:
                ((org.telegram.ui.he0) obj).f34134a.f33074f[i18].l(1.0f);
                return;
            case 21:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f31120c.m(i18);
                return;
            case 22:
                ((org.telegram.ui.il0) obj).run(Integer.valueOf(i18));
                return;
            case 23:
                ((org.telegram.ui.pp0) obj).e.f39221p0.I.E(1 - i18);
                return;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i21 = i18 + 1;
                if (i21 < 6 && (vu0Var = photoViewer.f31181e0) != null) {
                    vu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new x2(photoViewer, i21, 24), 100L);
                    return;
                }
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31656z0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                b2Var.R = string2;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 26:
                org.telegram.ui.y01 y01Var = (org.telegram.ui.y01) obj;
                org.telegram.ui.z01 z01Var = y01Var.h;
                NotificationCenter notificationCenter = z01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = z01Var.e;
                int i22 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i22);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(y01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    if (i18 == 0) {
                        str2 = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str2 = "VALIDATE_PASSWORD";
                    }
                    messagesController.removeSuggestion(0L, str2);
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i22);
                profileActivity2.e5(false, false);
                return;
            case 27:
                org.telegram.ui.o21 o21Var = (org.telegram.ui.o21) obj;
                AndroidUtilities.hideKeyboard(o21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36094a;
                    if (i17 < editTextBoldCursorArr.length) {
                        if (i17 != 0 && ((i18 != 3 || i17 != 4) && ((i18 != 2 || (i17 != 4 && i17 != 1)) && (i18 != 1 || (i17 != 1 && i17 != 2 && i17 != 3))))) {
                            editTextBoldCursorArr[i17].setText((CharSequence) null);
                        }
                        i17++;
                    } else {
                        return;
                    }
                }
                break;
            case 28:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj;
                s4.o0 layoutManager = d31Var.f32856y.getLayoutManager();
                if (layoutManager != null) {
                    if (d31Var.R) {
                        if (i18 > d31Var.L) {
                            i15 = Math.min(i18 + 1, d31Var.f32848b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.a31 a31Var = d31Var.f32849c;
                    a31Var.f43079a = i15;
                    layoutManager.w0(a31Var);
                }
                d31Var.L = i18;
                return;
            default:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.p81 p81Var = sessionsActivity.f31740a;
                if (p81Var != null) {
                    p81Var.l();
                    return;
                }
                return;
        }
    }

    public x2(Object obj, int i10, int i11) {
        this.f30217a = i11;
        this.f30219c = obj;
        this.f30218b = i10;
    }
}
