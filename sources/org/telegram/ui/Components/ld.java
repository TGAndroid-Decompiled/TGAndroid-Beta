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
    public final int f28334a;
    public final int f28335b;
    public final Object f28336c;

    public ld(Object obj, int i10, int i11) {
        this.f28334a = i11;
        this.f28336c = obj;
        this.f28335b = i10;
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
        org.telegram.ui.qu0 qu0Var;
        String str2;
        int i15;
        int i16 = this.f28334a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f28335b;
        Object obj = this.f28336c;
        switch (i16) {
            case 0:
                md mdVar = (md) obj;
                ci.e4 e4Var = mdVar.f28577d1;
                if (mdVar.f28575b1 != i18) {
                    mdVar.setTimer(i18);
                    Utilities.Callback callback = mdVar.f28590r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (mdVar.f28589q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        e4Var.h = mdVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.f4989e0 = AndroidUtilities.dp(0);
                        e4Var.f4987d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (mdVar.f28589q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        e4Var.h = mdVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.f4989e0 = AndroidUtilities.dp(0);
                        e4Var.f4987d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (mdVar.f28589q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        e4Var.p(true);
                        e4Var.h = ci.e4.a(replaceTags, e4Var.getTextPaint());
                        e4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        e4Var.f4989e0 = AndroidUtilities.dp(2);
                        e4Var.f4987d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), mdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (mdVar instanceof org.telegram.ui.xs0) {
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
                    mdVar.f28587o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(mdVar.f28588p1);
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
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView.f23873d5 == null) {
                        fgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f23928n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 2:
                sm smVar = (sm) obj;
                tm tmVar = smVar.P;
                if (i18 == smVar.O && tmVar.f31094w.isShown()) {
                    tmVar.f31094w.e(1, true);
                    return;
                }
                return;
            case 3:
                nz nzVar = (nz) obj;
                if (nzVar.P1) {
                    oy oyVar = nzVar.f29146t1;
                    if (oyVar != null && oyVar.k()) {
                        try {
                            nzVar.f29158x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    nzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new ld(nzVar, max, 3), max);
                    return;
                }
                return;
            case 4:
                ((cb0) obj).f25311b.run(Integer.valueOf(i18));
                return;
            case 5:
                cg0 cg0Var = (cg0) obj;
                org.telegram.ui.du0 du0Var = cg0Var.f25363a;
                TextView textView = du0Var.f25718e;
                ci.ab abVar = du0Var.h;
                RadialProgressView radialProgressView = du0Var.f25720n;
                TextView textView2 = du0Var.d;
                textView.setVisibility(8);
                du0Var.f25719f.setVisibility(8);
                LinearLayout linearLayout = du0Var.f25717c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new bg0(cg0Var, 0));
                }
                if (abVar.getAlpha() == 1.0f) {
                    abVar.animate().cancel();
                    abVar.animate().alpha(0.0f).setDuration(150L).setListener(new bg0(cg0Var, 1));
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
                        textView.setOnClickListener(new l80(cg0Var, 7));
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
                ij0Var.f27433a1 = i18;
                ij0Var.I();
                ij0Var.x();
                return;
            case 7:
                ((pv0) obj).d1(i18);
                return;
            case 8:
                ((iu0) obj).h.scrollBy(0, i18);
                return;
            case 9:
                pv0 pv0Var = ((ht0) obj).f27234a;
                org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29801v1;
                if (n2Var != null) {
                    if (pv0Var.f29762d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = pv0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(pv0Var.f29762d1.f20039id);
                        TLRPC.ChatFull chatFull = pv0Var.f29762d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = pv0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = pv0Var.f29765e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(pv0Var.f29765e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    pv0Var.v1(true);
                    return;
                }
                return;
            case 10:
                e51 e51Var = (e51) obj;
                e51Var.S();
                e51Var.f25926g0 = i18;
                t41.G(e51Var.f25925f0);
                e51Var.T();
                return;
            case 11:
                ((f91) obj).v.y0(i18);
                return;
            case 12:
                z91 z91Var = (z91) obj;
                d81 d81Var = z91Var.f33440a;
                if (i18 == -1) {
                    if (d81Var.y()) {
                        d81Var.B();
                        z91Var.n();
                    }
                    z91Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (z91Var.K) {
                        z91Var.K = false;
                        d81Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && d81Var.y()) {
                    z91Var.K = true;
                    d81Var.B();
                    z91Var.n();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    h60Var.y3 = Integer.valueOf(i18);
                }
                yc ycVar = new yc(h60Var.topBulletinContainer, new ai.a1());
                Resources resources = h60Var.getContext().getResources();
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
                ycVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.h60.g1(i18)).k(h60Var.n1());
                return;
            case 14:
                org.telegram.ui.h60 h60Var2 = ((org.telegram.ui.l50) obj).f38164b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    h60Var2.y3 = Integer.valueOf(i18);
                }
                yc ycVar2 = new yc(h60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = h60Var2.getContext().getResources();
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
                ycVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.h60.g1(i18)).k(h60Var2.n1());
                return;
            case 15:
                org.telegram.ui.d70 d70Var = (org.telegram.ui.d70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = d70Var.f35677n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = d70Var.f35677n.getChildAt(i19);
                    d70Var.f35677n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(d70Var.f35677n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / d70Var.f35677n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 16:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) obj;
                gd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                gd0Var.A0(false);
                return;
            case 17:
                ((org.telegram.ui.ee0) obj).f35996a.f35544f[i18].l(1.0f);
                return;
            case 18:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33831c.m(i18);
                return;
            case 19:
                ((org.telegram.ui.dl0) obj).run(Integer.valueOf(i18));
                return;
            case 20:
                ((org.telegram.ui.jp0) obj).f37738e.f39783p0.I.E(1 - i18);
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (qu0Var = photoViewer.f33895e0) != null) {
                    qu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new ld(photoViewer, i20, 21), 100L);
                    return;
                }
                return;
            case 22:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34377z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 23:
                org.telegram.ui.r01 r01Var = (org.telegram.ui.r01) obj;
                org.telegram.ui.s01 s01Var = r01Var.h;
                NotificationCenter notificationCenter = s01Var.f40318e.getNotificationCenter();
                ProfileActivity profileActivity2 = s01Var.f40318e;
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
            case 24:
                org.telegram.ui.h21 h21Var = (org.telegram.ui.h21) obj;
                AndroidUtilities.hideKeyboard(h21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = h21Var.f36836a;
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
            case 25:
                org.telegram.ui.x21 x21Var = (org.telegram.ui.x21) obj;
                s4.o0 layoutManager = x21Var.f42734y.getLayoutManager();
                if (layoutManager != null) {
                    if (x21Var.R) {
                        if (i18 > x21Var.L) {
                            i15 = Math.min(i18 + 1, x21Var.f42725b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.u21 u21Var = x21Var.f42726c;
                    u21Var.f46692a = i15;
                    layoutManager.w0(u21Var);
                }
                x21Var.L = i18;
                return;
            case 26:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.m81 m81Var = sessionsActivity.f34464a;
                if (m81Var != null) {
                    m81Var.l();
                    return;
                }
                return;
            case 27:
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
            case 28:
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
                duration.setInterpolator(tr.f31141f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
            default:
                org.telegram.ui.vt0 vt0Var = (org.telegram.ui.vt0) obj;
                pg.t1 t1Var = vt0Var.K1;
                vt0Var.t0(t1Var, null);
                pg.u0.e(i18).j(t1Var.f44633c);
                return;
        }
    }
}
