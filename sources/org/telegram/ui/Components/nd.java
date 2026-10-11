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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ui1;
public final class nd implements Runnable {
    public final int f29032a;
    public final int f29033b;
    public final Object f29034c;

    public nd(Object obj, int i10, int i11) {
        this.f29032a = i11;
        this.f29034c = obj;
        this.f29033b = i10;
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
        int i16 = this.f29032a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f29033b;
        Object obj = this.f29034c;
        switch (i16) {
            case 0:
                od odVar = (od) obj;
                ci.d4 d4Var = odVar.f29374d1;
                if (odVar.f29372b1 != i18) {
                    odVar.setTimer(i18);
                    Utilities.Callback callback = odVar.f29387r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (odVar.f29386q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        d4Var.h = odVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f4909e0 = AndroidUtilities.dp(0);
                        d4Var.f4907d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (odVar.f29386q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        d4Var.h = odVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f4909e0 = AndroidUtilities.dp(0);
                        d4Var.f4907d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (odVar.f29386q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        d4Var.p(true);
                        d4Var.h = ci.d4.a(replaceTags, d4Var.getTextPaint());
                        d4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        d4Var.f4909e0 = AndroidUtilities.dp(2);
                        d4Var.f4907d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), odVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (odVar instanceof org.telegram.ui.bt0) {
                        f7 = -1.0f;
                    }
                    d4Var.setTranslationY(dp * f7);
                    d4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    ek0 ek0Var = new ek0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    ek0Var.start();
                    d4Var.j(ek0Var);
                    d4Var.u();
                    odVar.f29384o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(odVar.f29385p1);
                    odVar.invalidate();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                gg ggVar = chatActivityEnterView.U0;
                if (ggVar != null) {
                    if (chatActivityEnterView.f23868d5 == null) {
                        ggVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f23923n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 2:
                gn gnVar = (gn) obj;
                hn hnVar = gnVar.P;
                if (i18 == gnVar.O && hnVar.f27034w.isShown()) {
                    hnVar.f27034w.e(1, true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    e3Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i18);
                    U.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 4:
                b00 b00Var = (b00) obj;
                if (b00Var.P1) {
                    bz bzVar = b00Var.f24716t1;
                    if (bzVar != null && bzVar.k()) {
                        try {
                            b00Var.f24728x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    b00Var.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new nd(b00Var, max, 4), max);
                    return;
                }
                return;
            case 5:
                ((rb0) obj).f30434b.run(Integer.valueOf(i18));
                return;
            case 6:
                tg0 tg0Var = (tg0) obj;
                org.telegram.ui.iu0 iu0Var = tg0Var.f31092a;
                TextView textView = iu0Var.f31439e;
                ci.bb bbVar = iu0Var.h;
                RadialProgressView radialProgressView = iu0Var.f31441n;
                TextView textView2 = iu0Var.d;
                textView.setVisibility(8);
                iu0Var.f31440f.setVisibility(8);
                LinearLayout linearLayout = iu0Var.f31438c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new sg0(tg0Var, 0));
                }
                if (bbVar.getAlpha() == 1.0f) {
                    bbVar.animate().cancel();
                    bbVar.animate().alpha(0.0f).setDuration(150L).setListener(new sg0(tg0Var, 1));
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
                        textView.setOnClickListener(new c90(tg0Var, 6));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 7:
                ck0 ck0Var = (ck0) obj;
                ck0Var.V0 = false;
                if (ck0Var.W0) {
                    ck0Var.C(true);
                    return;
                }
                ck0Var.f25237a1 = i18;
                ck0Var.I();
                ck0Var.x();
                return;
            case 8:
                ((dw0) obj).d1(i18);
                return;
            case 9:
                ((wu0) obj).h.scrollBy(0, i18);
                return;
            case 10:
                dw0 dw0Var = ((vt0) obj).f32481a;
                org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
                if (m2Var != null) {
                    if (dw0Var.f25696d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = dw0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = m2Var.getMessagesController().getInputChannel(dw0Var.f25696d1.f20033id);
                        TLRPC.ChatFull chatFull = dw0Var.f25696d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = dw0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = dw0Var.f25699e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            m2Var.getMessagesStorage().updateUserInfo(dw0Var.f25699e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    m2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    dw0Var.v1(true);
                    return;
                }
                return;
            case 11:
                ((ay0) obj).k0(i18, 0);
                return;
            case 12:
                o51 o51Var = (o51) obj;
                o51Var.V();
                o51Var.f29267g0 = i18;
                d51.J(o51Var.f29266f0);
                o51Var.W();
                return;
            case 13:
                ((p91) obj).v.x0(i18);
                return;
            case 14:
                ia1 ia1Var = (ia1) obj;
                m81 m81Var = ia1Var.f27246a;
                if (i18 == -1) {
                    if (m81Var.y()) {
                        m81Var.B();
                        ia1Var.n();
                    }
                    ia1Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (ia1Var.K) {
                        ia1Var.K = false;
                        m81Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && m81Var.y()) {
                    ia1Var.K = true;
                    m81Var.B();
                    ia1Var.n();
                    return;
                } else {
                    return;
                }
            case 15:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    g60Var.y3 = Integer.valueOf(i18);
                }
                ad adVar = new ad(g60Var.topBulletinContainer, new ai.a1());
                Resources resources = g60Var.getContext().getResources();
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
                adVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.g60.h1(i18)).k(g60Var.o1());
                return;
            case 16:
                org.telegram.ui.g60 g60Var2 = ((org.telegram.ui.j50) obj).f38840b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    g60Var2.y3 = Integer.valueOf(i18);
                }
                ad adVar2 = new ad(g60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = g60Var2.getContext().getResources();
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
                adVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.g60.h1(i18)).k(g60Var2.o1());
                return;
            case 17:
                org.telegram.ui.c70 c70Var = (org.telegram.ui.c70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = c70Var.f36601n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = c70Var.f36601n.getChildAt(i19);
                    c70Var.f36601n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(c70Var.f36601n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / c70Var.f36601n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 18:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) obj;
                gd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                gd0Var.z0(false);
                return;
            case 19:
                ((org.telegram.ui.ee0) obj).f37278a.f36450f[i18].l(1.0f);
                return;
            case 20:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33868c.m(i18);
                return;
            case 21:
                ((org.telegram.ui.hl0) obj).run(Integer.valueOf(i18));
                return;
            case 22:
                ((org.telegram.ui.mp0) obj).f40048e.f42241p0.I.D(1 - i18);
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (vu0Var = photoViewer.f33932e0) != null) {
                    vu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new nd(photoViewer, i20, 23), 100L);
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34414z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 25:
                org.telegram.ui.w01 w01Var = (org.telegram.ui.w01) obj;
                org.telegram.ui.x01 x01Var = w01Var.h;
                NotificationCenter notificationCenter = x01Var.f43916e.getNotificationCenter();
                ProfileActivity profileActivity2 = x01Var.f43916e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    of.f.s(w01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
            case 26:
                org.telegram.ui.m21 m21Var = (org.telegram.ui.m21) obj;
                AndroidUtilities.hideKeyboard(m21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = m21Var.f39793a;
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
            case 27:
                org.telegram.ui.c31 c31Var = (org.telegram.ui.c31) obj;
                s4.p0 layoutManager = c31Var.f36545y.getLayoutManager();
                if (layoutManager != null) {
                    if (c31Var.R) {
                        if (i18 > c31Var.L) {
                            i15 = Math.min(i18 + 1, c31Var.f36536b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.z21 z21Var = c31Var.f36537c;
                    z21Var.f47917a = i15;
                    layoutManager.w0(z21Var);
                }
                c31Var.L = i18;
                return;
            case 28:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.t81 t81Var = sessionsActivity.f34501a;
                if (t81Var != null) {
                    t81Var.l();
                    return;
                }
                return;
            default:
                ui1 ui1Var = (ui1) obj;
                ui1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = ui1Var.v;
                    if (d3Var.V != 3) {
                        d3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.H, 255);
                        d3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.O.setDuration(500L);
                        d3Var.O.start();
                    }
                    ui1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.d3 d3Var2 = ui1Var.v;
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
                ui1Var.F.c(false);
                return;
        }
    }
}
