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
public final class h2 implements Runnable {
    public final int f28815a;
    public final int f28816b;
    public final Object f28817c;

    public h2(int i10, Object obj, int i11) {
        this.f28815a = i11;
        this.f28816b = i10;
        this.f28817c = obj;
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
        org.telegram.ui.ku0 ku0Var;
        String str2;
        int i15 = this.f28815a;
        float f7 = 1.0f;
        int i16 = 0;
        int i17 = this.f28816b;
        Object obj = this.f28817c;
        switch (i15) {
            case 0:
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new x1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 1:
                aa0 aa0Var = (aa0) obj;
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
                aa0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new m1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 2:
                ((r8) obj).b(i17);
                return;
            case 3:
                jd jdVar = (jd) obj;
                fi.v3 v3Var = jdVar.f29647d1;
                if (jdVar.f29645b1 != i17) {
                    jdVar.setTimer(i17);
                    Utilities.Callback callback = jdVar.f29660r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i17));
                    }
                    if (i17 == 0) {
                        if (jdVar.f29659q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        v3Var.h = jdVar.getMeasuredWidth();
                        v3Var.p(false);
                        v3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        v3Var.f11789e0 = AndroidUtilities.dp(0);
                        v3Var.f11788d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (jdVar.f29659q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        v3Var.h = jdVar.getMeasuredWidth();
                        v3Var.p(false);
                        v3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        v3Var.f11789e0 = AndroidUtilities.dp(0);
                        v3Var.f11788d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (jdVar.f29659q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i17, new Object[0]));
                        v3Var.p(true);
                        v3Var.h = fi.v3.a(replaceTags, v3Var.getTextPaint());
                        v3Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        v3Var.f11789e0 = AndroidUtilities.dp(2);
                        v3Var.f11788d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), jdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (jdVar instanceof org.telegram.ui.rs0) {
                        f7 = -1.0f;
                    }
                    v3Var.setTranslationY(dp * f7);
                    v3Var.s(replaceTags);
                    if (i17 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    yj0 yj0Var = new yj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yj0Var.start();
                    v3Var.j(yj0Var);
                    v3Var.u();
                    jdVar.f29657o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(jdVar.f29658p1);
                    jdVar.invalidate();
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
                    if (chatActivityEnterView.f25896h5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f25926n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.t(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 5:
                bn bnVar = (bn) obj;
                cn cnVar = bnVar.P;
                if (i17 == bnVar.O && cnVar.f27212w.isShown()) {
                    cnVar.f27212w.d(1, true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    k3Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i17);
                    U.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 7:
                sz szVar = (sz) obj;
                if (szVar.P1) {
                    ty tyVar = szVar.f32766t1;
                    if (tyVar != null && tyVar.k()) {
                        try {
                            szVar.f32778x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    szVar.Q1 = true;
                    int max = Math.max(50, i17 - 100);
                    AndroidUtilities.runOnUIThread(new h2(szVar, max, 7), max);
                    return;
                }
                return;
            case 8:
                ((ib0) obj).f29293b.run(Integer.valueOf(i17));
                return;
            case 9:
                mg0 mg0Var = (mg0) obj;
                org.telegram.ui.xt0 xt0Var = mg0Var.f30537a;
                TextView textView = xt0Var.e;
                bi.cc ccVar = xt0Var.h;
                RadialProgressView radialProgressView = xt0Var.f30910n;
                TextView textView2 = xt0Var.d;
                textView.setVisibility(8);
                xt0Var.f30909f.setVisibility(8);
                LinearLayout linearLayout = xt0Var.f30908c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new lg0(mg0Var, 0));
                }
                if (ccVar.getAlpha() == 1.0f) {
                    ccVar.animate().cancel();
                    ccVar.animate().alpha(0.0f).setDuration(150L).setListener(new lg0(mg0Var, 1));
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
                        textView.setOnClickListener(new x80(mg0Var, 5));
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
                wj0Var.f34534a1 = i17;
                wj0Var.I();
                wj0Var.x();
                return;
            case 11:
                s51 s51Var = (s51) obj;
                s51Var.U();
                s51Var.f32481g0 = i17;
                g51.R(s51Var.f32480f0);
                s51Var.V();
                return;
            case 12:
                ((u91) obj).v.y0(i17);
                return;
            case 13:
                na1 na1Var = (na1) obj;
                t81 t81Var = na1Var.f30807a;
                if (i17 == -1) {
                    if (t81Var.y()) {
                        t81Var.B();
                        na1Var.n();
                    }
                    na1Var.J = false;
                    return;
                } else if (i17 == 1) {
                    if (na1Var.K) {
                        na1Var.K = false;
                        t81Var.C();
                        return;
                    }
                    return;
                } else if (i17 != -3 && i17 == -2 && t81Var.y()) {
                    na1Var.K = true;
                    t81Var.B();
                    na1Var.n();
                    return;
                } else {
                    return;
                }
            case 14:
                try {
                    ((dc1) obj).g(i17);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 15:
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i17);
                    x50Var.y3 = Integer.valueOf(i17);
                }
                wc wcVar = new wc(x50Var.topBulletinContainer, new di.k0());
                Resources resources = x50Var.getContext().getResources();
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
                wcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.x50.g1(i17)).k(x50Var.n1());
                return;
            case 16:
                org.telegram.ui.x50 x50Var2 = ((org.telegram.ui.a50) obj).f37695b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    x50Var2.y3 = Integer.valueOf(i17);
                }
                wc wcVar2 = new wc(x50Var2.topBulletinContainer, new di.k0());
                Resources resources2 = x50Var2.getContext().getResources();
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
                wcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.x50.g1(i17)).k(x50Var2.n1());
                return;
            case 17:
                org.telegram.ui.t60 t60Var = (org.telegram.ui.t60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = t60Var.f43513n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = t60Var.f43513n.getChildAt(i19);
                    t60Var.f43513n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(t60Var.f43513n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / t60Var.f43513n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 18:
                org.telegram.ui.p70 p70Var = (org.telegram.ui.p70) obj;
                int i20 = R.drawable.intro_powerful_mask;
                int i21 = org.telegram.ui.p70.f42328y;
                p70Var.b(i20, 17, i17, true);
                p70Var.d();
                p70Var.c(p70Var.v, 23, true);
                p70Var.f();
                Intro.setBackgroundColor(i17);
                return;
            case 19:
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) obj;
                rc0Var.Y.h1(0, -AndroidUtilities.dp(i17));
                rc0Var.B0(false);
                return;
            case 20:
                ((org.telegram.ui.qd0) obj).f42672a.f45772f[i17].l(1.0f);
                return;
            case 21:
                org.telegram.ui.zj0 zj0Var = (org.telegram.ui.zj0) ((bi.e5) obj).f4553c;
                zj0Var.l0(i17, true);
                if (i17 == 0) {
                    zj0Var.k0();
                    return;
                }
                return;
            case 22:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f35609c.m(i17);
                return;
            case 23:
                ((org.telegram.ui.bl0) obj).run(Integer.valueOf(i17));
                return;
            case 24:
                ((org.telegram.ui.gp0) obj).e.f41856p0.I.E(1 - i17);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i22 = i17 + 1;
                if (i22 < 6 && (ku0Var = photoViewer.f35670e0) != null) {
                    ku0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new h2(photoViewer, i22, 25), 100L);
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int i23 = ProfileActivity.R6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36150z0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string2;
                e2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.r(profileActivity, i17, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 27:
                org.telegram.ui.k01 k01Var = (org.telegram.ui.k01) obj;
                org.telegram.ui.l01 l01Var = k01Var.h;
                NotificationCenter notificationCenter = l01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = l01Var.e;
                int i24 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i24);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    qf.d.r(k01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    if (i17 == 0) {
                        str2 = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str2 = "VALIDATE_PASSWORD";
                    }
                    messagesController.removeSuggestion(0L, str2);
                }
                profileActivity2.getNotificationCenter().addWeakObserver(profileActivity2, i24);
                profileActivity2.p5(false, false);
                return;
            case 28:
                org.telegram.ui.d21 d21Var = (org.telegram.ui.d21) obj;
                AndroidUtilities.hideKeyboard(d21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f38498a;
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
                sessionsActivity.f36238f.remove(i17);
                sessionsActivity.n0();
                org.telegram.ui.p71 p71Var = sessionsActivity.f36235a;
                if (p71Var != null) {
                    p71Var.l();
                    return;
                }
                return;
        }
    }

    public h2(Object obj, int i10, int i11) {
        this.f28815a = i11;
        this.f28817c = obj;
        this.f28816b = i10;
    }
}
