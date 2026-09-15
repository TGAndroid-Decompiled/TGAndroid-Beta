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
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.ti1;
public final class id implements Runnable {
    public final int f24994a;
    public final int f24995b;
    public final Object f24996c;

    public id(Object obj, int i10, int i11) {
        this.f24994a = i11;
        this.f24996c = obj;
        this.f24995b = i10;
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
        int i16 = this.f24994a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f24995b;
        Object obj = this.f24996c;
        switch (i16) {
            case 0:
                jd jdVar = (jd) obj;
                ci.f4 f4Var = jdVar.f25288d1;
                if (jdVar.f25286b1 != i18) {
                    jdVar.setTimer(i18);
                    Utilities.Callback callback = jdVar.f25301r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (jdVar.f25300q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        f4Var.h = jdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f4625e0 = AndroidUtilities.dp(0);
                        f4Var.f4624d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (jdVar.f25300q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        f4Var.h = jdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f4625e0 = AndroidUtilities.dp(0);
                        f4Var.f4624d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (jdVar.f25300q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        f4Var.p(true);
                        f4Var.h = ci.f4.a(replaceTags, f4Var.getTextPaint());
                        f4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f4Var.f4625e0 = AndroidUtilities.dp(2);
                        f4Var.f4624d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), jdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (jdVar instanceof org.telegram.ui.ct0) {
                        f7 = -1.0f;
                    }
                    f4Var.setTranslationY(dp * f7);
                    f4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    xi0Var.start();
                    f4Var.j(xi0Var);
                    f4Var.u();
                    jdVar.f25298o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(jdVar.f25299p1);
                    jdVar.invalidate();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.f21875z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                cg cgVar = chatActivityEnterView.U0;
                if (cgVar != null) {
                    if (chatActivityEnterView.f21751c5 == null) {
                        cgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f21804m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 2:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (i18 == pmVar.O && qmVar.f27389w.isShown()) {
                    qmVar.f27389w.e(1, true);
                    return;
                }
                return;
            case 3:
                kz kzVar = (kz) obj;
                if (kzVar.P1) {
                    ky kyVar = kzVar.f25756t1;
                    if (kyVar != null && kyVar.k()) {
                        try {
                            kzVar.f25768x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new id(kzVar, max, 3), max);
                    return;
                }
                return;
            case 4:
                ((oa0) obj).f26743b.run(Integer.valueOf(i18));
                return;
            case 5:
                pf0 pf0Var = (pf0) obj;
                org.telegram.ui.iu0 iu0Var = pf0Var.f27033a;
                TextView textView = iu0Var.e;
                ci.eb ebVar = iu0Var.h;
                RadialProgressView radialProgressView = iu0Var.f27326n;
                TextView textView2 = iu0Var.d;
                textView.setVisibility(8);
                iu0Var.f27325f.setVisibility(8);
                LinearLayout linearLayout = iu0Var.f27324c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, 0));
                }
                if (ebVar.getAlpha() == 1.0f) {
                    ebVar.animate().cancel();
                    ebVar.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, 1));
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
                        textView.setOnClickListener(new x70(pf0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 6:
                vi0 vi0Var = (vi0) obj;
                vi0Var.V0 = false;
                if (vi0Var.W0) {
                    vi0Var.C(true);
                    return;
                }
                vi0Var.f28817a1 = i18;
                vi0Var.I();
                vi0Var.x();
                return;
            case 7:
                ((yu0) obj).d1(i18);
                return;
            case 8:
                ((rt0) obj).h.scrollBy(0, i18);
                return;
            case 9:
                yu0 yu0Var = ((qs0) obj).f27441a;
                org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
                if (n2Var != null) {
                    if (yu0Var.f30354d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = yu0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(yu0Var.f30354d1.f18113id);
                        TLRPC.ChatFull chatFull = yu0Var.f30354d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = yu0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = yu0Var.f30356e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(yu0Var.f30356e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    yu0Var.v1(true);
                    return;
                }
                return;
            case 10:
                ((ww0) obj).k0(i18, 0);
                return;
            case 11:
                g41 g41Var = (g41) obj;
                g41Var.U();
                g41Var.f24189g0 = i18;
                v31.I(g41Var.f24188f0);
                g41Var.V();
                return;
            case 12:
                ((h81) obj).v.x0(i18);
                return;
            case 13:
                c91 c91Var = (c91) obj;
                g71 g71Var = c91Var.f23017a;
                if (i18 == -1) {
                    if (g71Var.y()) {
                        g71Var.B();
                        c91Var.n();
                    }
                    c91Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (c91Var.K) {
                        c91Var.K = false;
                        g71Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && g71Var.y()) {
                    c91Var.K = true;
                    g71Var.B();
                    c91Var.n();
                    return;
                } else {
                    return;
                }
            case 14:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    i60Var.y3 = Integer.valueOf(i18);
                }
                vc vcVar = new vc(i60Var.topBulletinContainer, new ai.a1());
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
                vcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.i60.g1(i18)).k(i60Var.n1());
                return;
            case 15:
                org.telegram.ui.i60 i60Var2 = ((org.telegram.ui.l50) obj).f35341b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    i60Var2.y3 = Integer.valueOf(i18);
                }
                vc vcVar2 = new vc(i60Var2.topBulletinContainer, new ai.a1());
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
                vcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.i60.g1(i18)).k(i60Var2.n1());
                return;
            case 16:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = e70Var.f33247n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = e70Var.f33247n.getChildAt(i19);
                    e70Var.f33247n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(e70Var.f33247n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / e70Var.f33247n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 17:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) obj;
                id0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                id0Var.A0(false);
                return;
            case 18:
                ((org.telegram.ui.ge0) obj).f33876a.f33120f[i18].l(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f30876c.m(i18);
                return;
            case 20:
                ((org.telegram.ui.fl0) obj).run(Integer.valueOf(i18));
                return;
            case 21:
                ((org.telegram.ui.np0) obj).e.f38083p0.I.D(1 - i18);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                int i20 = i18 + 1;
                if (i20 < 6 && (vu0Var = photoViewer.f30936e0) != null) {
                    vu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new id(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31412z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 24:
                org.telegram.ui.y01 y01Var = (org.telegram.ui.y01) obj;
                org.telegram.ui.z01 z01Var = y01Var.h;
                NotificationCenter notificationCenter = z01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = z01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
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
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i21);
                profileActivity2.e5(false, false);
                return;
            case 25:
                org.telegram.ui.o21 o21Var = (org.telegram.ui.o21) obj;
                AndroidUtilities.hideKeyboard(o21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36088a;
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
            case 26:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj;
                s4.o0 layoutManager = d31Var.f32914y.getLayoutManager();
                if (layoutManager != null) {
                    if (d31Var.R) {
                        if (i18 > d31Var.L) {
                            i15 = Math.min(i18 + 1, d31Var.f32906b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.a31 a31Var = d31Var.f32907c;
                    a31Var.f42825a = i15;
                    layoutManager.w0(a31Var);
                }
                d31Var.L = i18;
                return;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.p81 p81Var = sessionsActivity.f31496a;
                if (p81Var != null) {
                    p81Var.l();
                    return;
                }
                return;
            case 28:
                ti1 ti1Var = (ti1) obj;
                ti1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = ti1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    ti1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.c3 c3Var2 = ti1Var.v;
                if (c3Var2.V != 2) {
                    c3Var2.V = 2;
                    c3Var2.c();
                    ValueAnimator valueAnimator = c3Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        c3Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(c3Var2.H, 0);
                    c3Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var2, 0));
                    c3Var2.O.setDuration(500L);
                    c3Var2.O.start();
                }
                ti1Var.F.c(false);
                return;
            default:
                qg.j jVar = (qg.j) obj;
                jVar.L = i18;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator2 = jVar.P;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.Q;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(qr.f27423f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
        }
    }
}
