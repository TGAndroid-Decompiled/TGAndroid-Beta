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
public final class c2 implements Runnable {
    public final int f25156a;
    public final int f25157b;
    public final Object f25158c;

    public c2(int i10, Object obj, int i11) {
        this.f25156a = i11;
        this.f25157b = i10;
        this.f25158c = obj;
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
        int i15 = this.f25156a;
        float f7 = 1.0f;
        int i16 = 0;
        int i17 = this.f25157b;
        Object obj = this.f25158c;
        switch (i15) {
            case 0:
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                AndroidUtilities.runOnUIThread(new t1((MessagesStorage.BooleanCallback) obj, 1), 250L);
                return;
            case 1:
                w90 w90Var = (w90) obj;
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
                w90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new l1(privacyRules, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
                return;
            case 2:
                ((n8) obj).b(i17);
                return;
            case 3:
                id idVar = (id) obj;
                ei.x3 x3Var = idVar.f27401d1;
                if (idVar.f27399b1 != i17) {
                    idVar.setTimer(i17);
                    Utilities.Callback callback = idVar.f27414r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i17));
                    }
                    if (i17 == 0) {
                        if (idVar.f27413q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        x3Var.h = idVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f10089e0 = AndroidUtilities.dp(0);
                        x3Var.f10088d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (idVar.f27413q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        x3Var.h = idVar.getMeasuredWidth();
                        x3Var.p(false);
                        x3Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        x3Var.f10089e0 = AndroidUtilities.dp(0);
                        x3Var.f10088d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (idVar.f27413q1) {
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
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), idVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (idVar instanceof org.telegram.ui.ks0) {
                        f7 = -1.0f;
                    }
                    x3Var.setTranslationY(dp * f7);
                    x3Var.s(replaceTags);
                    if (i17 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    xj0 xj0Var = new xj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    xj0Var.start();
                    x3Var.j(xj0Var);
                    x3Var.u();
                    idVar.f27411o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(idVar.f27412p1);
                    idVar.invalidate();
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i17 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                bg bgVar = chatActivityEnterView.U0;
                if (bgVar != null) {
                    if (chatActivityEnterView.f24102h5 == null) {
                        bgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f24132n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                mg mgVar = chatActivityEnterView.Z2;
                if (mgVar != null) {
                    mgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 5:
                ym ymVar = (ym) obj;
                zm zmVar = ymVar.P;
                if (i17 == ymVar.O && zmVar.f33294w.isShown()) {
                    zmVar.f33294w.d(1, true);
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
                rz rzVar = (rz) obj;
                if (rzVar.P1) {
                    sy syVar = rzVar.f30363t1;
                    if (syVar != null && syVar.k()) {
                        try {
                            rzVar.f30375x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    rzVar.Q1 = true;
                    int max = Math.max(50, i17 - 100);
                    AndroidUtilities.runOnUIThread(new c2(rzVar, max, 7), max);
                    return;
                }
                return;
            case 8:
                ((ib0) obj).f27392b.run(Integer.valueOf(i17));
                return;
            case 9:
                ng0 ng0Var = (ng0) obj;
                org.telegram.ui.qt0 qt0Var = ng0Var.f28906a;
                TextView textView = qt0Var.e;
                ai.jc jcVar = qt0Var.h;
                RadialProgressView radialProgressView = qt0Var.f29273n;
                TextView textView2 = qt0Var.d;
                textView.setVisibility(8);
                qt0Var.f29272f.setVisibility(8);
                LinearLayout linearLayout = qt0Var.f29271c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new mg0(ng0Var, 0));
                }
                if (jcVar.getAlpha() == 1.0f) {
                    jcVar.animate().cancel();
                    jcVar.animate().alpha(0.0f).setDuration(150L).setListener(new mg0(ng0Var, 1));
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
                        textView.setOnClickListener(new t80(ng0Var, 6));
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
                vj0Var.f31470a1 = i17;
                vj0Var.I();
                vj0Var.x();
                return;
            case 11:
                ((wv0) obj).g1(i17);
                return;
            case 12:
                ((tx0) obj).k0(i17, 0);
                return;
            case 13:
                j51 j51Var = (j51) obj;
                j51Var.U();
                j51Var.f27570g0 = i17;
                x41.R(j51Var.f27569f0);
                j51Var.V();
                return;
            case 14:
                ((k91) obj).v.x0(i17);
                return;
            case 15:
                da1 da1Var = (da1) obj;
                j81 j81Var = da1Var.f25669a;
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
                vc vcVar = new vc(u50Var.topBulletinContainer, new ci.k0());
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
                vcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.u50.g1(i17)).k(u50Var.n1());
                return;
            case 17:
                org.telegram.ui.u50 u50Var2 = ((org.telegram.ui.w40) obj).f42898b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    u50Var2.y3 = Integer.valueOf(i17);
                }
                vc vcVar2 = new vc(u50Var2.topBulletinContainer, new ci.k0());
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
                vcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.u50.g1(i17)).k(u50Var2.n1());
                return;
            case 18:
                org.telegram.ui.p60 p60Var = (org.telegram.ui.p60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = p60Var.f40364n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = p60Var.f40364n.getChildAt(i19);
                    p60Var.f40364n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(p60Var.f40364n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / p60Var.f40364n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 19:
                org.telegram.ui.l70 l70Var = (org.telegram.ui.l70) obj;
                int i20 = R.drawable.intro_powerful_mask;
                int i21 = org.telegram.ui.l70.f39120y;
                l70Var.b(i20, 17, i17, true);
                l70Var.d();
                l70Var.c(l70Var.v, 23, true);
                l70Var.f();
                Intro.setBackgroundColor(i17);
                return;
            case 20:
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) obj;
                rc0Var.Y.h1(0, -AndroidUtilities.dp(i17));
                rc0Var.A0(false);
                return;
            case 21:
                ((org.telegram.ui.qd0) obj).f40783a.f41792f[i17].l(1.0f);
                return;
            case 22:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33521c.m(i17);
                return;
            case 23:
                ((org.telegram.ui.sk0) obj).run(Integer.valueOf(i17));
                return;
            case 24:
                ((org.telegram.ui.xo0) obj).e.f36983p0.I.D(1 - i17);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i22 = i17 + 1;
                if (i22 < 6 && (du0Var = photoViewer.f33582e0) != null) {
                    du0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new c2(photoViewer, i22, 25), 100L);
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.A0);
                String string2 = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string2;
                c2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.r(profileActivity, i17, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 27:
                org.telegram.ui.d01 d01Var = (org.telegram.ui.d01) obj;
                org.telegram.ui.e01 e01Var = d01Var.h;
                NotificationCenter notificationCenter = e01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = e01Var.e;
                int i23 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i23);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    pf.d.r(d01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
                org.telegram.ui.v11 v11Var = (org.telegram.ui.v11) obj;
                AndroidUtilities.hideKeyboard(v11Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = v11Var.f42536a;
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
                sessionsActivity.f34150f.remove(i17);
                sessionsActivity.m0();
                org.telegram.ui.k71 k71Var = sessionsActivity.f34147a;
                if (k71Var != null) {
                    k71Var.l();
                    return;
                }
                return;
        }
    }

    public c2(Object obj, int i10, int i11) {
        this.f25156a = i11;
        this.f25158c = obj;
        this.f25157b = i10;
    }
}
