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
public final class ld implements Runnable {
    public final int f25970a;
    public final int f25971b;
    public final Object f25972c;

    public ld(Object obj, int i10, int i11) {
        this.f25970a = i11;
        this.f25972c = obj;
        this.f25971b = i10;
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
        org.telegram.ui.nu0 nu0Var;
        String str2;
        int i15;
        int i16 = this.f25970a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f25971b;
        Object obj = this.f25972c;
        switch (i16) {
            case 0:
                md mdVar = (md) obj;
                ci.e4 e4Var = mdVar.f26383d1;
                if (mdVar.f26381b1 != i18) {
                    mdVar.setTimer(i18);
                    Utilities.Callback callback = mdVar.f26396r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (mdVar.f26395q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        e4Var.h = mdVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.f4607e0 = AndroidUtilities.dp(0);
                        e4Var.f4606d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (mdVar.f26395q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        e4Var.h = mdVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.f4607e0 = AndroidUtilities.dp(0);
                        e4Var.f4606d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (mdVar.f26395q1) {
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
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), mdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (mdVar instanceof org.telegram.ui.us0) {
                        f7 = -1.0f;
                    }
                    e4Var.setTranslationY(dp * f7);
                    e4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    kj0 kj0Var = new kj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    kj0Var.start();
                    e4Var.j(kj0Var);
                    e4Var.u();
                    mdVar.f26393o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(mdVar.f26394p1);
                    mdVar.invalidate();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    if (chatActivityEnterView.f21978d5 == null) {
                        egVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f22032n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 2:
                rm rmVar = (rm) obj;
                sm smVar = rmVar.P;
                if (i18 == rmVar.O && smVar.f28316w.isShown()) {
                    smVar.f28316w.e(1, true);
                    return;
                }
                return;
            case 3:
                mz mzVar = (mz) obj;
                if (mzVar.P1) {
                    ny nyVar = mzVar.f26585t1;
                    if (nyVar != null && nyVar.k()) {
                        try {
                            mzVar.f26597x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    mzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new ld(mzVar, max, 3), max);
                    return;
                }
                return;
            case 4:
                ((cb0) obj).f23265b.run(Integer.valueOf(i18));
                return;
            case 5:
                bg0 bg0Var = (bg0) obj;
                org.telegram.ui.au0 au0Var = bg0Var.f22997a;
                TextView textView = au0Var.e;
                ci.bb bbVar = au0Var.h;
                RadialProgressView radialProgressView = au0Var.f23296n;
                TextView textView2 = au0Var.d;
                textView.setVisibility(8);
                au0Var.f23295f.setVisibility(8);
                LinearLayout linearLayout = au0Var.f23294c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new ag0(bg0Var, 0));
                }
                if (bbVar.getAlpha() == 1.0f) {
                    bbVar.animate().cancel();
                    bbVar.animate().alpha(0.0f).setDuration(150L).setListener(new ag0(bg0Var, 1));
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
                        textView.setOnClickListener(new k80(bg0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 6:
                ij0 ij0Var = (ij0) obj;
                ij0Var.V0 = false;
                if (ij0Var.W0) {
                    ij0Var.C(true);
                    return;
                }
                ij0Var.f25143a1 = i18;
                ij0Var.I();
                ij0Var.x();
                return;
            case 7:
                ((lv0) obj).d1(i18);
                return;
            case 8:
                ((eu0) obj).h.scrollBy(0, i18);
                return;
            case 9:
                lv0 lv0Var = ((dt0) obj).f23724a;
                org.telegram.ui.ActionBar.m2 m2Var = lv0Var.f26159v1;
                if (m2Var != null) {
                    if (lv0Var.f26121d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = lv0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = m2Var.getMessagesController().getInputChannel(lv0Var.f26121d1.f18336id);
                        TLRPC.ChatFull chatFull = lv0Var.f26121d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = lv0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = lv0Var.f26123e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            m2Var.getMessagesStorage().updateUserInfo(lv0Var.f26123e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    m2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    lv0Var.v1(true);
                    return;
                }
                return;
            case 10:
                ((ix0) obj).k0(i18, 0);
                return;
            case 11:
                v41 v41Var = (v41) obj;
                v41Var.U();
                v41Var.f28977g0 = i18;
                k41.I(v41Var.f28976f0);
                v41Var.V();
                return;
            case 12:
                ((x81) obj).v.x0(i18);
                return;
            case 13:
                q91 q91Var = (q91) obj;
                u71 u71Var = q91Var.f27608a;
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
            case 14:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    d60Var.y3 = Integer.valueOf(i18);
                }
                xc xcVar = new xc(d60Var.topBulletinContainer, new ai.a1());
                Resources resources = d60Var.getContext().getResources();
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
                xcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.d60.g1(i18)).k(d60Var.n1());
                return;
            case 15:
                org.telegram.ui.d60 d60Var2 = ((org.telegram.ui.g50) obj).f33828b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    d60Var2.y3 = Integer.valueOf(i18);
                }
                xc xcVar2 = new xc(d60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = d60Var2.getContext().getResources();
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
                xcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.d60.g1(i18)).k(d60Var2.n1());
                return;
            case 16:
                org.telegram.ui.z60 z60Var = (org.telegram.ui.z60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = z60Var.f40382n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = z60Var.f40382n.getChildAt(i19);
                    z60Var.f40382n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(z60Var.f40382n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / z60Var.f40382n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 17:
                org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) obj;
                cd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                cd0Var.A0(false);
                return;
            case 18:
                ((org.telegram.ui.ae0) obj).f32137a.f40237f[i18].l(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f31162c.m(i18);
                return;
            case 20:
                ((org.telegram.ui.zk0) obj).run(Integer.valueOf(i18));
                return;
            case 21:
                ((org.telegram.ui.gp0) obj).e.f35955p0.I.D(1 - i18);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (nu0Var = photoViewer.f31223e0) != null) {
                    nu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new ld(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31698z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 24:
                org.telegram.ui.p01 p01Var = (org.telegram.ui.p01) obj;
                org.telegram.ui.q01 q01Var = p01Var.h;
                NotificationCenter notificationCenter = q01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = q01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(p01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
                org.telegram.ui.f21 f21Var = (org.telegram.ui.f21) obj;
                AndroidUtilities.hideKeyboard(f21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = f21Var.f33523a;
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
                org.telegram.ui.v21 v21Var = (org.telegram.ui.v21) obj;
                s4.o0 layoutManager = v21Var.f38617y.getLayoutManager();
                if (layoutManager != null) {
                    if (v21Var.R) {
                        if (i18 > v21Var.L) {
                            i15 = Math.min(i18 + 1, v21Var.f38609b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.s21 s21Var = v21Var.f38610c;
                    s21Var.f43110a = i15;
                    layoutManager.w0(s21Var);
                }
                v21Var.L = i18;
                return;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.k81 k81Var = sessionsActivity.f31782a;
                if (k81Var != null) {
                    k81Var.l();
                    return;
                }
                return;
            case 28:
                mi1 mi1Var = (mi1) obj;
                mi1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = mi1Var.v;
                    if (d3Var.V != 3) {
                        d3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.H, 255);
                        d3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.O.setDuration(500L);
                        d3Var.O.start();
                    }
                    mi1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.d3 d3Var2 = mi1Var.v;
                if (d3Var2.V != 2) {
                    d3Var2.V = 2;
                    d3Var2.c();
                    ValueAnimator valueAnimator = d3Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        d3Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(d3Var2.H, 0);
                    d3Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var2, 0));
                    d3Var2.O.setDuration(500L);
                    d3Var2.O.start();
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
                duration.setInterpolator(sr.f28348f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
        }
    }
}
