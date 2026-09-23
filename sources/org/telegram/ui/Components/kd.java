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
import org.telegram.ui.mi1;
public final class kd implements Runnable {
    public final int f25580a;
    public final int f25581b;
    public final Object f25582c;

    public kd(Object obj, int i10, int i11) {
        this.f25580a = i11;
        this.f25582c = obj;
        this.f25581b = i10;
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
        org.telegram.ui.ou0 ou0Var;
        String str2;
        int i15;
        int i16 = this.f25580a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f25581b;
        Object obj = this.f25582c;
        switch (i16) {
            case 0:
                ld ldVar = (ld) obj;
                ci.e4 e4Var = ldVar.f25866d1;
                if (ldVar.f25864b1 != i18) {
                    ldVar.setTimer(i18);
                    Utilities.Callback callback = ldVar.f25879r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (ldVar.f25878q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        e4Var.h = ldVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.f4607e0 = AndroidUtilities.dp(0);
                        e4Var.f4606d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (ldVar.f25878q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        e4Var.h = ldVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.f4607e0 = AndroidUtilities.dp(0);
                        e4Var.f4606d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (ldVar.f25878q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        e4Var.p(true);
                        e4Var.h = ci.e4.a(replaceTags, e4Var.getTextPaint());
                        e4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        e4Var.f4607e0 = AndroidUtilities.dp(2);
                        e4Var.f4606d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), ldVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (ldVar instanceof org.telegram.ui.vs0) {
                        f7 = -1.0f;
                    }
                    e4Var.setTranslationY(dp * f7);
                    e4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    yi0 yi0Var = new yi0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yi0Var.start();
                    e4Var.j(yi0Var);
                    e4Var.u();
                    ldVar.f25876o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(ldVar.f25877p1);
                    ldVar.invalidate();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.f21846z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.f21727d5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f21774m1.removeView(chatActivityEnterView.U0);
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
            case 2:
                qm qmVar = (qm) obj;
                rm rmVar = qmVar.P;
                if (i18 == qmVar.O && rmVar.f27673w.isShown()) {
                    rmVar.f27673w.e(1, true);
                    return;
                }
                return;
            case 3:
                lz lzVar = (lz) obj;
                if (lzVar.P1) {
                    ly lyVar = lzVar.f26021t1;
                    if (lyVar != null && lyVar.k()) {
                        try {
                            lzVar.f26033x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    lzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new kd(lzVar, max, 3), max);
                    return;
                }
                return;
            case 4:
                ((pa0) obj).f26994b.run(Integer.valueOf(i18));
                return;
            case 5:
                pf0 pf0Var = (pf0) obj;
                org.telegram.ui.bu0 bu0Var = pf0Var.f27020a;
                TextView textView = bu0Var.e;
                ci.bb bbVar = bu0Var.h;
                RadialProgressView radialProgressView = bu0Var.f27333n;
                TextView textView2 = bu0Var.d;
                textView.setVisibility(8);
                bu0Var.f27332f.setVisibility(8);
                LinearLayout linearLayout = bu0Var.f27331c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, 0));
                }
                if (bbVar.getAlpha() == 1.0f) {
                    bbVar.animate().cancel();
                    bbVar.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, 1));
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
                        textView.setOnClickListener(new y70(pf0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 6:
                wi0 wi0Var = (wi0) obj;
                wi0Var.V0 = false;
                if (wi0Var.W0) {
                    wi0Var.C(true);
                    return;
                }
                wi0Var.f29732a1 = i18;
                wi0Var.I();
                wi0Var.x();
                return;
            case 7:
                ((yu0) obj).d1(i18);
                return;
            case 8:
                ((rt0) obj).h.scrollBy(0, i18);
                return;
            case 9:
                yu0 yu0Var = ((qs0) obj).f27443a;
                org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30450v1;
                if (n2Var != null) {
                    if (yu0Var.f30412d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = yu0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(yu0Var.f30412d1.f18084id);
                        TLRPC.ChatFull chatFull = yu0Var.f30412d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = yu0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = yu0Var.f30414e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(yu0Var.f30414e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    yu0Var.v1(true);
                    return;
                }
                return;
            case 10:
                ((vw0) obj).k0(i18, 0);
                return;
            case 11:
                f41 f41Var = (f41) obj;
                f41Var.U();
                f41Var.f23844g0 = i18;
                u31.I(f41Var.f23843f0);
                f41Var.V();
                return;
            case 12:
                ((g81) obj).v.x0(i18);
                return;
            case 13:
                b91 b91Var = (b91) obj;
                f71 f71Var = b91Var.f22619a;
                if (i18 == -1) {
                    if (f71Var.y()) {
                        f71Var.B();
                        b91Var.n();
                    }
                    b91Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (b91Var.K) {
                        b91Var.K = false;
                        f71Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && f71Var.y()) {
                    b91Var.K = true;
                    f71Var.B();
                    b91Var.n();
                    return;
                } else {
                    return;
                }
            case 14:
                org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    f60Var.y3 = Integer.valueOf(i18);
                }
                xc xcVar = new xc(f60Var.topBulletinContainer, new ai.a1());
                Resources resources = f60Var.getContext().getResources();
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
                xcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.f60.g1(i18)).k(f60Var.n1());
                return;
            case 15:
                org.telegram.ui.f60 f60Var2 = ((org.telegram.ui.i50) obj).f34029b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    f60Var2.y3 = Integer.valueOf(i18);
                }
                xc xcVar2 = new xc(f60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = f60Var2.getContext().getResources();
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
                xcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.f60.g1(i18)).k(f60Var2.n1());
                return;
            case 16:
                org.telegram.ui.b70 b70Var = (org.telegram.ui.b70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = b70Var.f31999n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = b70Var.f31999n.getChildAt(i19);
                    b70Var.f31999n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(b70Var.f31999n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / b70Var.f31999n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 17:
                org.telegram.ui.dd0 dd0Var = (org.telegram.ui.dd0) obj;
                dd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                dd0Var.A0(false);
                return;
            case 18:
                ((org.telegram.ui.be0) obj).f32087a.f40230f[i18].l(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f30847c.m(i18);
                return;
            case 20:
                ((org.telegram.ui.zk0) obj).run(Integer.valueOf(i18));
                return;
            case 21:
                ((org.telegram.ui.hp0) obj).e.f35938p0.I.D(1 - i18);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (ou0Var = photoViewer.f30908e0) != null) {
                    ou0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new kd(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31383z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 24:
                org.telegram.ui.r01 r01Var = (org.telegram.ui.r01) obj;
                org.telegram.ui.s01 s01Var = r01Var.h;
                NotificationCenter notificationCenter = s01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = s01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(r01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
                org.telegram.ui.h21 h21Var = (org.telegram.ui.h21) obj;
                AndroidUtilities.hideKeyboard(h21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f33711a;
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
                org.telegram.ui.w21 w21Var = (org.telegram.ui.w21) obj;
                s4.o0 layoutManager = w21Var.f38524y.getLayoutManager();
                if (layoutManager != null) {
                    if (w21Var.R) {
                        if (i18 > w21Var.L) {
                            i15 = Math.min(i18 + 1, w21Var.f38516b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.t21 t21Var = w21Var.f38517c;
                    t21Var.f42777a = i15;
                    layoutManager.w0(t21Var);
                }
                w21Var.L = i18;
                return;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.i81 i81Var = sessionsActivity.f31467a;
                if (i81Var != null) {
                    i81Var.l();
                    return;
                }
                return;
            case 28:
                mi1 mi1Var = (mi1) obj;
                mi1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = mi1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    mi1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.c3 c3Var2 = mi1Var.v;
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
                mi1Var.F.c(false);
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
                duration.setInterpolator(rr.f27701f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
        }
    }
}
