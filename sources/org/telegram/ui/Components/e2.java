package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
import org.telegram.ui.jh1;
public final class e2 implements Runnable {
    public final int f25781a;
    public final int f25782b;
    public final Object f25783c;

    public e2(int i10, Object obj, int i11) {
        this.f25781a = i11;
        this.f25782b = i10;
        this.f25783c = obj;
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
        org.telegram.ui.du0 du0Var;
        String str2;
        int i15 = this.f25781a;
        float f7 = 1.0f;
        int i16 = 0;
        int i17 = this.f25782b;
        Object obj = this.f25783c;
        switch (i15) {
            case 0:
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new u1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 1:
                x90 x90Var = (x90) obj;
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
                x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new n1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 2:
                ((p8) obj).b(i17);
                return;
            case 3:
                kd kdVar = (kd) obj;
                ei.x3 x3Var = kdVar.f27839d1;
                if (kdVar.f27837b1 != i17) {
                    kdVar.setTimer(i17);
                    Utilities.Callback callback = kdVar.f27852r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i17));
                    }
                    if (i17 == 0) {
                        if (kdVar.f27851q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        x3Var.h = kdVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f10073e0 = AndroidUtilities.dp(0);
                        x3Var.f10072d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (kdVar.f27851q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        x3Var.h = kdVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f10073e0 = AndroidUtilities.dp(0);
                        x3Var.f10072d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (kdVar.f27851q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i17, new Object[0]));
                        x3Var.p(true);
                        x3Var.h = ei.x3.a(replaceTags, x3Var.getTextPaint());
                        x3Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        x3Var.f10073e0 = AndroidUtilities.dp(2);
                        x3Var.f10072d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), kdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (kdVar instanceof org.telegram.ui.ks0) {
                        f7 = -1.0f;
                    }
                    x3Var.setTranslationY(dp * f7);
                    x3Var.s(replaceTags);
                    if (i17 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    uj0 uj0Var = new uj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    uj0Var.start();
                    x3Var.j(uj0Var);
                    x3Var.u();
                    kdVar.f27849o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(kdVar.f27850p1);
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
                    if (chatActivityEnterView.f23930d5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f23985n1.removeView(chatActivityEnterView.U0);
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
                if (i17 == anVar.O && bnVar.f25011w.isShown()) {
                    bnVar.f25011w.e(1, true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    f3Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i17);
                    U.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 7:
                tz tzVar = (tz) obj;
                if (tzVar.P1) {
                    uy uyVar = tzVar.f30800t1;
                    if (uyVar != null && uyVar.k()) {
                        try {
                            tzVar.f30812x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    tzVar.Q1 = true;
                    int max = Math.max(50, i17 - 100);
                    AndroidUtilities.runOnUIThread(new e2(tzVar, max, 7), max);
                    return;
                }
                return;
            case 8:
                ((jb0) obj).f27492b.run(Integer.valueOf(i17));
                return;
            case 9:
                jg0 jg0Var = (jg0) obj;
                org.telegram.ui.qt0 qt0Var = jg0Var.f27523a;
                TextView textView = qt0Var.e;
                ai.hc hcVar = qt0Var.h;
                RadialProgressView radialProgressView = qt0Var.f27867n;
                TextView textView2 = qt0Var.d;
                textView.setVisibility(8);
                qt0Var.f27866f.setVisibility(8);
                LinearLayout linearLayout = qt0Var.f27865c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new ig0(jg0Var, 0));
                }
                if (hcVar.getAlpha() == 1.0f) {
                    hcVar.animate().cancel();
                    hcVar.animate().alpha(0.0f).setDuration(150L).setListener(new ig0(jg0Var, 1));
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
                        textView.setOnClickListener(new u80(jg0Var, 6));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 10:
                sj0 sj0Var = (sj0) obj;
                sj0Var.V0 = false;
                if (sj0Var.W0) {
                    sj0Var.C(true);
                    return;
                }
                sj0Var.f30283a1 = i17;
                sj0Var.I();
                sj0Var.x();
                return;
            case 11:
                ((sv0) obj).f1(i17);
                return;
            case 12:
                ((px0) obj).k0(i17, 0);
                return;
            case 13:
                c51 c51Var = (c51) obj;
                c51Var.V();
                c51Var.f25094g0 = i17;
                r41.J(c51Var.f25093f0);
                c51Var.W();
                return;
            case 14:
                ((b91) obj).v.x0(i17);
                return;
            case 15:
                u91 u91Var = (u91) obj;
                a81 a81Var = u91Var.f30926a;
                if (i17 == -1) {
                    if (a81Var.y()) {
                        a81Var.B();
                        u91Var.n();
                    }
                    u91Var.J = false;
                    return;
                } else if (i17 == 1) {
                    if (u91Var.K) {
                        u91Var.K = false;
                        a81Var.C();
                        return;
                    }
                    return;
                } else if (i17 != -3 && i17 == -2 && a81Var.y()) {
                    u91Var.K = true;
                    a81Var.B();
                    u91Var.n();
                    return;
                } else {
                    return;
                }
            case 16:
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i17);
                    s50Var.y3 = Integer.valueOf(i17);
                }
                xc xcVar = new xc(s50Var.topBulletinContainer, new ci.k0());
                Resources resources = s50Var.getContext().getResources();
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
                xcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.s50.h1(i17)).k(s50Var.o1());
                return;
            case 17:
                org.telegram.ui.s50 s50Var2 = ((org.telegram.ui.v40) obj).f42118b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    s50Var2.y3 = Integer.valueOf(i17);
                }
                xc xcVar2 = new xc(s50Var2.topBulletinContainer, new ci.k0());
                Resources resources2 = s50Var2.getContext().getResources();
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
                xcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.s50.h1(i17)).k(s50Var2.o1());
                return;
            case 18:
                org.telegram.ui.n60 n60Var = (org.telegram.ui.n60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = n60Var.f39344n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = n60Var.f39344n.getChildAt(i19);
                    n60Var.f39344n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(n60Var.f39344n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / n60Var.f39344n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 19:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) obj;
                pc0Var.Y.h1(0, -AndroidUtilities.dp(i17));
                pc0Var.z0(false);
                return;
            case 20:
                ((org.telegram.ui.od0) obj).f39742a.f41486f[i17].l(1.0f);
                return;
            case 21:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33205c.m(i17);
                return;
            case 22:
                ((org.telegram.ui.sk0) obj).run(Integer.valueOf(i17));
                return;
            case 23:
                ((org.telegram.ui.wo0) obj).e.f36261p0.I.D(1 - i17);
                return;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i17 + 1;
                if (i20 < 6 && (du0Var = photoViewer.f33266e0) != null) {
                    du0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new e2(photoViewer, i20, 24), 100L);
                    return;
                }
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.R = string2;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.q(profileActivity, i17, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 26:
                org.telegram.ui.c01 c01Var = (org.telegram.ui.c01) obj;
                org.telegram.ui.d01 d01Var = c01Var.h;
                NotificationCenter notificationCenter = d01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = d01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    pf.d.r(c01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    if (i17 == 0) {
                        str2 = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str2 = "VALIDATE_PASSWORD";
                    }
                    messagesController.removeSuggestion(0L, str2);
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i21);
                profileActivity2.e5(false, false);
                return;
            case 27:
                org.telegram.ui.u11 u11Var = (org.telegram.ui.u11) obj;
                AndroidUtilities.hideKeyboard(u11Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = u11Var.f41858a;
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
            case 28:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i17);
                sessionsActivity.m0();
                org.telegram.ui.j71 j71Var = sessionsActivity.f33829a;
                if (j71Var != null) {
                    j71Var.l();
                    return;
                }
                return;
            default:
                jh1 jh1Var = (jh1) obj;
                jh1Var.F.setSignalBarCount(i17);
                if (i17 <= 1) {
                    org.telegram.ui.Components.voip.a3 a3Var = jh1Var.v;
                    if (a3Var.V != 3) {
                        a3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(a3Var.H, 255);
                        a3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var, 2));
                        a3Var.O.setDuration(500L);
                        a3Var.O.start();
                    }
                    jh1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.a3 a3Var2 = jh1Var.v;
                if (a3Var2.V != 2) {
                    a3Var2.V = 2;
                    a3Var2.c();
                    ValueAnimator valueAnimator = a3Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        a3Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(a3Var2.H, 0);
                    a3Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var2, 0));
                    a3Var2.O.setDuration(500L);
                    a3Var2.O.start();
                }
                jh1Var.F.c(false);
                return;
        }
    }

    public e2(Object obj, int i10, int i11) {
        this.f25781a = i11;
        this.f25783c = obj;
        this.f25782b = i10;
    }
}
