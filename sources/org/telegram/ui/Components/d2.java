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
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
public final class d2 implements Runnable {
    public final int f25486a;
    public final int f25487b;
    public final Object f25488c;

    public d2(int i10, Object obj, int i11) {
        this.f25486a = i11;
        this.f25487b = i10;
        this.f25488c = obj;
    }

    @Override
    public final void run() {
        String str;
        CharSequence replaceTags;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.eu0 eu0Var;
        String str2;
        int i15 = this.f25486a;
        float f7 = 1.0f;
        int i16 = 0;
        int i17 = this.f25487b;
        Object obj = this.f25488c;
        switch (i15) {
            case 0:
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new t1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 1:
                y90 y90Var = (y90) obj;
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(i17).getPrivacyRules(11);
                String string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                if (privacyRules != null && !privacyRules.isEmpty()) {
                    int i18 = 0;
                    while (true) {
                        if (i18 < privacyRules.size()) {
                            if (privacyRules.get(i18) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                string = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                            } else {
                                if ((privacyRules.get(i18) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i18) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    string = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                                }
                                i18++;
                            }
                        }
                    }
                }
                y90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new n1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 2:
                ((p8) obj).b(i17);
                return;
            case 3:
                kd kdVar = (kd) obj;
                ei.x3 x3Var = kdVar.f28008d1;
                if (kdVar.f28006b1 != i17) {
                    kdVar.setTimer(i17);
                    Utilities.Callback callback = kdVar.f28021r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i17));
                    }
                    if (i17 == 0) {
                        if (kdVar.f28020q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        x3Var.h = kdVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f10089e0 = AndroidUtilities.dp(0);
                        x3Var.f10088d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (kdVar.f28020q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        x3Var.h = kdVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f10089e0 = AndroidUtilities.dp(0);
                        x3Var.f10088d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (kdVar.f28020q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i17, new Object[0]));
                        x3Var.p(true);
                        x3Var.h = ei.x3.a(replaceTags, x3Var.getTextPaint());
                        x3Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        x3Var.f10089e0 = AndroidUtilities.dp(2);
                        x3Var.f10088d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), kdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (kdVar instanceof org.telegram.ui.ls0) {
                        f7 = -1.0f;
                    }
                    x3Var.setTranslationY(dp * f7);
                    x3Var.s(replaceTags);
                    if (i17 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    yj0 yj0Var = new yj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yj0Var.start();
                    x3Var.j(yj0Var);
                    x3Var.u();
                    kdVar.f28018o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(kdVar.f28019p1);
                    kdVar.invalidate();
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i17 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.f24101h5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f24131n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 5:
                an anVar = (an) obj;
                bn bnVar = anVar.P;
                if (i17 == anVar.O && bnVar.f25104w.isShown()) {
                    bnVar.f25104w.d(1, true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    h3Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i17);
                    U.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 7:
                tz tzVar = (tz) obj;
                if (tzVar.P1) {
                    uy uyVar = tzVar.f31019t1;
                    if (uyVar != null && uyVar.k()) {
                        try {
                            tzVar.f31031x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    tzVar.Q1 = true;
                    int max = Math.max(50, i17 - 100);
                    AndroidUtilities.runOnUIThread(new d2(tzVar, max, 7), max);
                    return;
                }
                return;
            case 8:
                ((kb0) obj).f27999b.run(Integer.valueOf(i17));
                return;
            case 9:
                og0 og0Var = (og0) obj;
                org.telegram.ui.rt0 rt0Var = og0Var.f29171a;
                TextView textView = rt0Var.e;
                ai.jc jcVar = rt0Var.h;
                RadialProgressView radialProgressView = rt0Var.f29554n;
                TextView textView2 = rt0Var.d;
                textView.setVisibility(8);
                rt0Var.f29553f.setVisibility(8);
                LinearLayout linearLayout = rt0Var.f29552c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new ng0(og0Var, 0));
                }
                if (jcVar.getAlpha() == 1.0f) {
                    jcVar.animate().cancel();
                    jcVar.animate().alpha(0.0f).setDuration(150L).setListener(new ng0(og0Var, 1));
                }
                if (i17 != 2) {
                    if (i17 != 5) {
                        if (i17 != 150) {
                            if (i17 != 100) {
                                if (i17 != 101) {
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
                        textView.setOnClickListener(new v80(og0Var, 6));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 10:
                wj0 wj0Var = (wj0) obj;
                wj0Var.V0 = false;
                if (wj0Var.W0) {
                    wj0Var.C(true);
                    return;
                }
                wj0Var.f32263a1 = i17;
                wj0Var.I();
                wj0Var.x();
                return;
            case 11:
                ((xv0) obj).g1(i17);
                return;
            case 12:
                ((ux0) obj).k0(i17, 0);
                return;
            case 13:
                k51 k51Var = (k51) obj;
                k51Var.U();
                k51Var.f27879g0 = i17;
                y41.R(k51Var.f27878f0);
                k51Var.V();
                return;
            case 14:
                ((k91) obj).v.x0(i17);
                return;
            case 15:
                da1 da1Var = (da1) obj;
                j81 j81Var = da1Var.f25564a;
                if (i17 == -1) {
                    if (j81Var.y()) {
                        j81Var.B();
                        da1Var.n();
                    }
                    da1Var.J = false;
                    return;
                } else if (i17 == 1) {
                    if (da1Var.K) {
                        da1Var.K = false;
                        j81Var.C();
                        return;
                    }
                    return;
                } else if (i17 != -3 && i17 == -2 && j81Var.y()) {
                    da1Var.K = true;
                    j81Var.B();
                    da1Var.n();
                    return;
                } else {
                    return;
                }
            case 16:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i17);
                    u50Var.y3 = Integer.valueOf(i17);
                }
                xc xcVar = new xc(u50Var.topBulletinContainer, new ci.k0());
                Resources resources = u50Var.getContext().getResources();
                if (i17 == 2) {
                    i13 = R.drawable.msg_voice_bluetooth;
                } else if (i17 == 0) {
                    i13 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i13 = R.drawable.msg_voice_headphones;
                    } else {
                        i13 = R.drawable.msg_voice_phone;
                    }
                }
                xcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.u50.g1(i17)).k(u50Var.n1());
                return;
            case 17:
                org.telegram.ui.u50 u50Var2 = ((org.telegram.ui.w40) obj).f42922b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    u50Var2.y3 = Integer.valueOf(i17);
                }
                xc xcVar2 = new xc(u50Var2.topBulletinContainer, new ci.k0());
                Resources resources2 = u50Var2.getContext().getResources();
                if (i17 == 2) {
                    i14 = R.drawable.msg_voice_bluetooth;
                } else if (i17 == 0) {
                    i14 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i14 = R.drawable.msg_voice_headphones;
                    } else {
                        i14 = R.drawable.msg_voice_phone;
                    }
                }
                xcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.u50.g1(i17)).k(u50Var2.n1());
                return;
            case 18:
                org.telegram.ui.p60 p60Var = (org.telegram.ui.p60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = p60Var.f40372n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = p60Var.f40372n.getChildAt(i19);
                    p60Var.f40372n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(p60Var.f40372n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / p60Var.f40372n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 19:
                org.telegram.ui.l70 l70Var = (org.telegram.ui.l70) obj;
                int i20 = R.drawable.intro_powerful_mask;
                int i21 = org.telegram.ui.l70.f39150y;
                l70Var.b(i20, 17, i17, true);
                l70Var.d();
                l70Var.c(l70Var.v, 23, true);
                l70Var.f();
                Intro.setBackgroundColor(i17);
                return;
            case 20:
                org.telegram.ui.sc0 sc0Var = (org.telegram.ui.sc0) obj;
                sc0Var.Y.h1(0, -AndroidUtilities.dp(i17));
                sc0Var.A0(false);
                return;
            case 21:
                ((org.telegram.ui.rd0) obj).f41094a.f41793f[i17].l(1.0f);
                return;
            case 22:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33519c.m(i17);
                return;
            case 23:
                ((org.telegram.ui.tk0) obj).run(Integer.valueOf(i17));
                return;
            case 24:
                ((org.telegram.ui.yo0) obj).e.f37402p0.I.D(1 - i17);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i22 = i17 + 1;
                if (i22 < 6 && (eu0Var = photoViewer.f33580e0) != null) {
                    eu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new d2(photoViewer, i22, 25), 100L);
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.R = string2;
                c2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.r(profileActivity, i17, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 27:
                org.telegram.ui.e01 e01Var = (org.telegram.ui.e01) obj;
                org.telegram.ui.f01 f01Var = e01Var.h;
                NotificationCenter notificationCenter = f01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = f01Var.e;
                int i23 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i23);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    pf.d.r(e01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    if (i17 == 0) {
                        str2 = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str2 = "VALIDATE_PASSWORD";
                    }
                    messagesController.removeSuggestion(0L, str2);
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i23);
                profileActivity2.i5(false, false);
                return;
            case 28:
                org.telegram.ui.w11 w11Var = (org.telegram.ui.w11) obj;
                AndroidUtilities.hideKeyboard(w11Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = w11Var.f42891a;
                    if (i16 < editTextBoldCursorArr.length) {
                        if (i16 != 0 && ((i17 != 3 || i16 != 4) && ((i17 != 2 || (i16 != 4 && i16 != 1)) && (i17 != 1 || (i16 != 1 && i16 != 2 && i16 != 3))))) {
                            editTextBoldCursorArr[i16].setText((CharSequence) null);
                        }
                        i16++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f34148f.remove(i17);
                sessionsActivity.m0();
                org.telegram.ui.l71 l71Var = sessionsActivity.f34145a;
                if (l71Var != null) {
                    l71Var.l();
                    return;
                }
                return;
        }
    }

    public d2(Object obj, int i10, int i11) {
        this.f25486a = i11;
        this.f25488c = obj;
        this.f25487b = i10;
    }
}
