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
    public final int f28767a;
    public final int f28768b;
    public final Object f28769c;

    public h2(int i10, Object obj, int i11) {
        this.f28767a = i11;
        this.f28768b = i10;
        this.f28769c = obj;
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
        org.telegram.ui.iu0 iu0Var;
        String str2;
        int i15 = this.f28767a;
        float f7 = 1.0f;
        int i16 = 0;
        int i17 = this.f28768b;
        Object obj = this.f28769c;
        switch (i15) {
            case 0:
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new x1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 1:
                z90 z90Var = (z90) obj;
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
                z90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new m1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 2:
                ((r8) obj).b(i17);
                return;
            case 3:
                jd jdVar = (jd) obj;
                fi.v3 v3Var = jdVar.f29613d1;
                if (jdVar.f29611b1 != i17) {
                    jdVar.setTimer(i17);
                    Utilities.Callback callback = jdVar.f29626r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i17));
                    }
                    if (i17 == 0) {
                        if (jdVar.f29625q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        v3Var.h = jdVar.getMeasuredWidth();
                        v3Var.p(false);
                        v3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        v3Var.f11790e0 = AndroidUtilities.dp(0);
                        v3Var.f11789d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (jdVar.f29625q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        v3Var.h = jdVar.getMeasuredWidth();
                        v3Var.p(false);
                        v3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        v3Var.f11790e0 = AndroidUtilities.dp(0);
                        v3Var.f11789d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (jdVar.f29625q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i17, new Object[0]));
                        v3Var.p(true);
                        v3Var.h = fi.v3.a(replaceTags, v3Var.getTextPaint());
                        v3Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        v3Var.f11790e0 = AndroidUtilities.dp(2);
                        v3Var.f11789d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), jdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (jdVar instanceof org.telegram.ui.ps0) {
                        f7 = -1.0f;
                    }
                    v3Var.setTranslationY(dp * f7);
                    v3Var.s(replaceTags);
                    if (i17 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    xj0 xj0Var = new xj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    xj0Var.start();
                    v3Var.j(xj0Var);
                    v3Var.u();
                    jdVar.f29623o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(jdVar.f29624p1);
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
                    if (chatActivityEnterView.f25894h5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f25924n1.removeView(chatActivityEnterView.U0);
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
                if (i17 == bnVar.O && cnVar.f27203w.isShown()) {
                    cnVar.f27203w.d(1, true);
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
                    ty tyVar = szVar.f32772t1;
                    if (tyVar != null && tyVar.k()) {
                        try {
                            szVar.f32784x.performHapticFeedback(3);
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
                ((hb0) obj).f28907b.run(Integer.valueOf(i17));
                return;
            case 9:
                lg0 lg0Var = (lg0) obj;
                org.telegram.ui.vt0 vt0Var = lg0Var.f30208a;
                TextView textView = vt0Var.e;
                bi.cc ccVar = vt0Var.h;
                RadialProgressView radialProgressView = vt0Var.f30578n;
                TextView textView2 = vt0Var.d;
                textView.setVisibility(8);
                vt0Var.f30577f.setVisibility(8);
                LinearLayout linearLayout = vt0Var.f30576c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new kg0(lg0Var, 0));
                }
                if (ccVar.getAlpha() == 1.0f) {
                    ccVar.animate().cancel();
                    ccVar.animate().alpha(0.0f).setDuration(150L).setListener(new kg0(lg0Var, 1));
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
                        textView.setOnClickListener(new w80(lg0Var, 5));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 10:
                vj0 vj0Var = (vj0) obj;
                vj0Var.V0 = false;
                if (vj0Var.W0) {
                    vj0Var.C(true);
                    return;
                }
                vj0Var.f33679a1 = i17;
                vj0Var.I();
                vj0Var.x();
                return;
            case 11:
                r51 r51Var = (r51) obj;
                r51Var.U();
                r51Var.f32111g0 = i17;
                f51.R(r51Var.f32110f0);
                r51Var.V();
                return;
            case 12:
                ((t91) obj).v.y0(i17);
                return;
            case 13:
                ma1 ma1Var = (ma1) obj;
                s81 s81Var = ma1Var.f30488a;
                if (i17 == -1) {
                    if (s81Var.y()) {
                        s81Var.B();
                        ma1Var.n();
                    }
                    ma1Var.J = false;
                    return;
                } else if (i17 == 1) {
                    if (ma1Var.K) {
                        ma1Var.K = false;
                        s81Var.C();
                        return;
                    }
                    return;
                } else if (i17 != -3 && i17 == -2 && s81Var.y()) {
                    ma1Var.K = true;
                    s81Var.B();
                    ma1Var.n();
                    return;
                } else {
                    return;
                }
            case 14:
                try {
                    ((yb1) obj).f(i17);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 15:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i17);
                    v50Var.y3 = Integer.valueOf(i17);
                }
                wc wcVar = new wc(v50Var.topBulletinContainer, new di.k0());
                Resources resources = v50Var.getContext().getResources();
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
                wcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.v50.g1(i17)).k(v50Var.n1());
                return;
            case 16:
                org.telegram.ui.v50 v50Var2 = ((org.telegram.ui.y40) obj).f45954b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    v50Var2.y3 = Integer.valueOf(i17);
                }
                wc wcVar2 = new wc(v50Var2.topBulletinContainer, new di.k0());
                Resources resources2 = v50Var2.getContext().getResources();
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
                wcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.v50.g1(i17)).k(v50Var2.n1());
                return;
            case 17:
                org.telegram.ui.r60 r60Var = (org.telegram.ui.r60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = r60Var.f43028n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = r60Var.f43028n.getChildAt(i19);
                    r60Var.f43028n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(r60Var.f43028n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / r60Var.f43028n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 18:
                org.telegram.ui.n70 n70Var = (org.telegram.ui.n70) obj;
                int i20 = R.drawable.intro_powerful_mask;
                int i21 = org.telegram.ui.n70.f41766y;
                n70Var.b(i20, 17, i17, true);
                n70Var.d();
                n70Var.c(n70Var.v, 23, true);
                n70Var.f();
                Intro.setBackgroundColor(i17);
                return;
            case 19:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) obj;
                pc0Var.Y.h1(0, -AndroidUtilities.dp(i17));
                pc0Var.B0(false);
                return;
            case 20:
                ((org.telegram.ui.od0) obj).f42154a.f44897f[i17].l(1.0f);
                return;
            case 21:
                org.telegram.ui.xj0 xj0Var2 = (org.telegram.ui.xj0) ((bi.e5) obj).f4553c;
                xj0Var2.l0(i17, true);
                if (i17 == 0) {
                    xj0Var2.k0();
                    return;
                }
                return;
            case 22:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f35585c.m(i17);
                return;
            case 23:
                ((org.telegram.ui.zk0) obj).run(Integer.valueOf(i17));
                return;
            case 24:
                ((org.telegram.ui.ep0) obj).e.f41333p0.I.E(1 - i17);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i22 = i17 + 1;
                if (i22 < 6 && (iu0Var = photoViewer.f35646e0) != null) {
                    iu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new h2(photoViewer, i22, 25), 100L);
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int i23 = ProfileActivity.R6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36126z0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                e2Var.R = string2;
                e2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.r(profileActivity, i17, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 27:
                org.telegram.ui.i01 i01Var = (org.telegram.ui.i01) obj;
                org.telegram.ui.j01 j01Var = i01Var.h;
                NotificationCenter notificationCenter = j01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = j01Var.e;
                int i24 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i24);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    qf.d.r(i01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    if (i17 == 0) {
                        str2 = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str2 = "VALIDATE_PASSWORD";
                    }
                    messagesController.removeSuggestion(0L, str2);
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i24);
                profileActivity2.p5(false, false);
                return;
            case 28:
                org.telegram.ui.b21 b21Var = (org.telegram.ui.b21) obj;
                AndroidUtilities.hideKeyboard(b21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = b21Var.f37955a;
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
                sessionsActivity.f36214f.remove(i17);
                sessionsActivity.n0();
                org.telegram.ui.n71 n71Var = sessionsActivity.f36211a;
                if (n71Var != null) {
                    n71Var.l();
                    return;
                }
                return;
        }
    }

    public h2(Object obj, int i10, int i11) {
        this.f28767a = i11;
        this.f28769c = obj;
        this.f28768b = i10;
    }
}
