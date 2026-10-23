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
import org.telegram.ui.hh1;
public final class e2 implements Runnable {
    public final int f25701a;
    public final int f25702b;
    public final Object f25703c;

    public e2(int i10, Object obj, int i11) {
        this.f25701a = i11;
        this.f25702b = i10;
        this.f25703c = obj;
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
        org.telegram.ui.bu0 bu0Var;
        String str2;
        int i15 = this.f25701a;
        float f7 = 1.0f;
        int i16 = 0;
        int i17 = this.f25702b;
        Object obj = this.f25703c;
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
                ei.x3 x3Var = kdVar.f27853d1;
                if (kdVar.f27851b1 != i17) {
                    kdVar.setTimer(i17);
                    Utilities.Callback callback = kdVar.f27866r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i17));
                    }
                    if (i17 == 0) {
                        if (kdVar.f27865q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        x3Var.h = kdVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f10072e0 = AndroidUtilities.dp(0);
                        x3Var.f10071d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (kdVar.f27865q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        x3Var.h = kdVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f10072e0 = AndroidUtilities.dp(0);
                        x3Var.f10071d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (kdVar.f27865q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i17, new Object[0]));
                        x3Var.p(true);
                        x3Var.h = ei.x3.a(replaceTags, x3Var.getTextPaint());
                        x3Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        x3Var.f10072e0 = AndroidUtilities.dp(2);
                        x3Var.f10071d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), kdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (kdVar instanceof org.telegram.ui.is0) {
                        f7 = -1.0f;
                    }
                    x3Var.setTranslationY(dp * f7);
                    x3Var.s(replaceTags);
                    if (i17 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    vj0 vj0Var = new vj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    vj0Var.start();
                    x3Var.j(vj0Var);
                    x3Var.u();
                    kdVar.f27863o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(kdVar.f27864p1);
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
                    if (chatActivityEnterView.f23938d5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f23993n1.removeView(chatActivityEnterView.U0);
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
                if (i17 == anVar.O && bnVar.f24997w.isShown()) {
                    bnVar.f24997w.e(1, true);
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
                    uy uyVar = tzVar.f30780t1;
                    if (uyVar != null && uyVar.k()) {
                        try {
                            tzVar.f30792x.performHapticFeedback(3);
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
                ((jb0) obj).f27493b.run(Integer.valueOf(i17));
                return;
            case 9:
                kg0 kg0Var = (kg0) obj;
                org.telegram.ui.ot0 ot0Var = kg0Var.f27878a;
                TextView textView = ot0Var.e;
                ai.ic icVar = ot0Var.h;
                RadialProgressView radialProgressView = ot0Var.f28159n;
                TextView textView2 = ot0Var.d;
                textView.setVisibility(8);
                ot0Var.f28158f.setVisibility(8);
                LinearLayout linearLayout = ot0Var.f28157c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new jg0(kg0Var, 0));
                }
                if (icVar.getAlpha() == 1.0f) {
                    icVar.animate().cancel();
                    icVar.animate().alpha(0.0f).setDuration(150L).setListener(new jg0(kg0Var, 1));
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
                        textView.setOnClickListener(new u80(kg0Var, 6));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 10:
                tj0 tj0Var = (tj0) obj;
                tj0Var.V0 = false;
                if (tj0Var.W0) {
                    tj0Var.C(true);
                    return;
                }
                tj0Var.f30620a1 = i17;
                tj0Var.I();
                tj0Var.x();
                return;
            case 11:
                ((uv0) obj).f1(i17);
                return;
            case 12:
                ((rx0) obj).k0(i17, 0);
                return;
            case 13:
                e51 e51Var = (e51) obj;
                e51Var.V();
                e51Var.f25740g0 = i17;
                t41.J(e51Var.f25739f0);
                e51Var.W();
                return;
            case 14:
                ((d91) obj).v.x0(i17);
                return;
            case 15:
                w91 w91Var = (w91) obj;
                c81 c81Var = w91Var.f32021a;
                if (i17 == -1) {
                    if (c81Var.y()) {
                        c81Var.B();
                        w91Var.n();
                    }
                    w91Var.J = false;
                    return;
                } else if (i17 == 1) {
                    if (w91Var.K) {
                        w91Var.K = false;
                        c81Var.C();
                        return;
                    }
                    return;
                } else if (i17 != -3 && i17 == -2 && c81Var.y()) {
                    w91Var.K = true;
                    c81Var.B();
                    w91Var.n();
                    return;
                } else {
                    return;
                }
            case 16:
                org.telegram.ui.q50 q50Var = (org.telegram.ui.q50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i17);
                    q50Var.y3 = Integer.valueOf(i17);
                }
                xc xcVar = new xc(q50Var.topBulletinContainer, new ci.k0());
                Resources resources = q50Var.getContext().getResources();
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
                xcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.q50.h1(i17)).k(q50Var.o1());
                return;
            case 17:
                org.telegram.ui.q50 q50Var2 = ((org.telegram.ui.t40) obj).f41596b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    q50Var2.y3 = Integer.valueOf(i17);
                }
                xc xcVar2 = new xc(q50Var2.topBulletinContainer, new ci.k0());
                Resources resources2 = q50Var2.getContext().getResources();
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
                xcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.q50.h1(i17)).k(q50Var2.o1());
                return;
            case 18:
                org.telegram.ui.l60 l60Var = (org.telegram.ui.l60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = l60Var.f38821n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = l60Var.f38821n.getChildAt(i19);
                    l60Var.f38821n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(l60Var.f38821n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / l60Var.f38821n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 19:
                org.telegram.ui.nc0 nc0Var = (org.telegram.ui.nc0) obj;
                nc0Var.Y.h1(0, -AndroidUtilities.dp(i17));
                nc0Var.z0(false);
                return;
            case 20:
                ((org.telegram.ui.md0) obj).f39214a.f40963f[i17].l(1.0f);
                return;
            case 21:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33222c.m(i17);
                return;
            case 22:
                ((org.telegram.ui.qk0) obj).run(Integer.valueOf(i17));
                return;
            case 23:
                ((org.telegram.ui.vo0) obj).e.f36042p0.I.D(1 - i17);
                return;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i17 + 1;
                if (i20 < 6 && (bu0Var = photoViewer.f33283e0) != null) {
                    bu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new e2(photoViewer, i20, 24), 100L);
                    return;
                }
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                b2Var.R = string2;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i17, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 26:
                org.telegram.ui.a01 a01Var = (org.telegram.ui.a01) obj;
                org.telegram.ui.b01 b01Var = a01Var.h;
                NotificationCenter notificationCenter = b01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = b01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    pf.d.r(a01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) obj;
                AndroidUtilities.hideKeyboard(s11Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = s11Var.f41319a;
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
                org.telegram.ui.h71 h71Var = sessionsActivity.f33848a;
                if (h71Var != null) {
                    h71Var.l();
                    return;
                }
                return;
            default:
                hh1 hh1Var = (hh1) obj;
                hh1Var.F.setSignalBarCount(i17);
                if (i17 <= 1) {
                    org.telegram.ui.Components.voip.a3 a3Var = hh1Var.v;
                    if (a3Var.V != 3) {
                        a3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(a3Var.H, 255);
                        a3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var, 2));
                        a3Var.O.setDuration(500L);
                        a3Var.O.start();
                    }
                    hh1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.a3 a3Var2 = hh1Var.v;
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
                hh1Var.F.c(false);
                return;
        }
    }

    public e2(Object obj, int i10, int i11) {
        this.f25701a = i11;
        this.f25703c = obj;
        this.f25702b = i10;
    }
}
