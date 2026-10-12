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
import org.telegram.ui.xi1;
public final class nd implements Runnable {
    public final int f28779a;
    public final int f28780b;
    public final Object f28781c;

    public nd(Object obj, int i10, int i11) {
        this.f28779a = i11;
        this.f28781c = obj;
        this.f28780b = i10;
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
        org.telegram.ui.yu0 yu0Var;
        String str2;
        int i15;
        int i16 = this.f28779a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f28780b;
        Object obj = this.f28781c;
        switch (i16) {
            case 0:
                od odVar = (od) obj;
                ci.d4 d4Var = odVar.f29144d1;
                if (odVar.f29142b1 != i18) {
                    odVar.setTimer(i18);
                    Utilities.Callback callback = odVar.f29157r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (odVar.f29156q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        d4Var.h = odVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f4908e0 = AndroidUtilities.dp(0);
                        d4Var.f4906d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (odVar.f29156q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        d4Var.h = odVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f4908e0 = AndroidUtilities.dp(0);
                        d4Var.f4906d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (odVar.f29156q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        d4Var.p(true);
                        d4Var.h = ci.d4.a(replaceTags, d4Var.getTextPaint());
                        d4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        d4Var.f4908e0 = AndroidUtilities.dp(2);
                        d4Var.f4906d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), odVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (odVar instanceof org.telegram.ui.et0) {
                        f7 = -1.0f;
                    }
                    d4Var.setTranslationY(dp * f7);
                    d4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    fk0 fk0Var = new fk0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    fk0Var.start();
                    d4Var.j(fk0Var);
                    d4Var.u();
                    odVar.f29154o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(odVar.f29155p1);
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
                ig igVar = chatActivityEnterView.U0;
                if (igVar != null) {
                    if (chatActivityEnterView.G5 == null) {
                        igVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f23696n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.f23672i4) {
                        chatActivityEnterView.f23672i4 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                sg sgVar = chatActivityEnterView.Z2;
                if (sgVar != null) {
                    sgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 2:
                in inVar = (in) obj;
                jn jnVar = inVar.P;
                if (i18 == inVar.O && jnVar.f27561w.isShown()) {
                    jnVar.f27561w.e(1, true);
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
                d00 d00Var = (d00) obj;
                if (d00Var.P1) {
                    dz dzVar = d00Var.f25134t1;
                    if (dzVar != null && dzVar.k()) {
                        try {
                            d00Var.f25146x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    d00Var.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new nd(d00Var, max, 4), max);
                    return;
                }
                return;
            case 5:
                ((ub0) obj).f31134b.run(Integer.valueOf(i18));
                return;
            case 6:
                ug0 ug0Var = (ug0) obj;
                org.telegram.ui.lu0 lu0Var = ug0Var.f31165a;
                TextView textView = lu0Var.f31506e;
                ci.bb bbVar = lu0Var.h;
                RadialProgressView radialProgressView = lu0Var.f31508n;
                TextView textView2 = lu0Var.d;
                textView.setVisibility(8);
                lu0Var.f31507f.setVisibility(8);
                LinearLayout linearLayout = lu0Var.f31505c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new tg0(ug0Var, 0));
                }
                if (bbVar.getAlpha() == 1.0f) {
                    bbVar.animate().cancel();
                    bbVar.animate().alpha(0.0f).setDuration(150L).setListener(new tg0(ug0Var, 1));
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
                        textView.setOnClickListener(new f90(ug0Var, 6));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 7:
                dk0 dk0Var = (dk0) obj;
                dk0Var.V0 = false;
                if (dk0Var.W0) {
                    dk0Var.C(true);
                    return;
                }
                dk0Var.f25386a1 = i18;
                dk0Var.I();
                dk0Var.x();
                return;
            case 8:
                ((hw0) obj).d1(i18);
                return;
            case 9:
                ((av0) obj).h.scrollBy(0, i18);
                return;
            case 10:
                hw0 hw0Var = ((zt0) obj).f33491a;
                org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26972v1;
                if (m2Var != null) {
                    if (hw0Var.f26933d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = hw0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = m2Var.getMessagesController().getInputChannel(hw0Var.f26933d1.f19803id);
                        TLRPC.ChatFull chatFull = hw0Var.f26933d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = hw0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = hw0Var.f26936e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            m2Var.getMessagesStorage().updateUserInfo(hw0Var.f26936e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    m2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    hw0Var.v1(true);
                    return;
                }
                return;
            case 11:
                ((ey0) obj).k0(i18, 0);
                return;
            case 12:
                r51 r51Var = (r51) obj;
                r51Var.V();
                r51Var.f30047g0 = i18;
                g51.J(r51Var.f30046f0);
                r51Var.W();
                return;
            case 13:
                ((t91) obj).v.x0(i18);
                return;
            case 14:
                ma1 ma1Var = (ma1) obj;
                q81 q81Var = ma1Var.f28503a;
                if (i18 == -1) {
                    if (q81Var.y()) {
                        q81Var.B();
                        ma1Var.n();
                    }
                    ma1Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (ma1Var.K) {
                        ma1Var.K = false;
                        q81Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && q81Var.y()) {
                    ma1Var.K = true;
                    q81Var.B();
                    ma1Var.n();
                    return;
                } else {
                    return;
                }
            case 15:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    i60Var.y3 = Integer.valueOf(i18);
                }
                zc zcVar = new zc(i60Var.topBulletinContainer, new ai.a1());
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
                zcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.i60.h1(i18)).k(i60Var.o1());
                return;
            case 16:
                org.telegram.ui.i60 i60Var2 = ((org.telegram.ui.l50) obj).f39646b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    i60Var2.y3 = Integer.valueOf(i18);
                }
                zc zcVar2 = new zc(i60Var2.topBulletinContainer, new ai.a1());
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
                zcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.i60.h1(i18)).k(i60Var2.o1());
                return;
            case 17:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = e70Var.f37008n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = e70Var.f37008n.getChildAt(i19);
                    e70Var.f37008n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(e70Var.f37008n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / e70Var.f37008n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 18:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) obj;
                id0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                id0Var.z0(false);
                return;
            case 19:
                ((org.telegram.ui.ge0) obj).f38018a.f37837f[i18].l(1.0f);
                return;
            case 20:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33677c.m(i18);
                return;
            case 21:
                ((org.telegram.ui.jl0) obj).run(Integer.valueOf(i18));
                return;
            case 22:
                ((org.telegram.ui.pp0) obj).f41065e.f43597p0.I.D(1 - i18);
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (yu0Var = photoViewer.f33741e0) != null) {
                    yu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new nd(photoViewer, i20, 23), 100L);
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34223z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 25:
                org.telegram.ui.z01 z01Var = (org.telegram.ui.z01) obj;
                org.telegram.ui.a11 a11Var = z01Var.h;
                NotificationCenter notificationCenter = a11Var.f35664e.getNotificationCenter();
                ProfileActivity profileActivity2 = a11Var.f35664e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    of.f.s(z01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
                org.telegram.ui.q21 q21Var = (org.telegram.ui.q21) obj;
                AndroidUtilities.hideKeyboard(q21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f41150a;
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
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj;
                s4.p0 layoutManager = f31Var.f37620y.getLayoutManager();
                if (layoutManager != null) {
                    if (f31Var.R) {
                        if (i18 > f31Var.L) {
                            i15 = Math.min(i18 + 1, f31Var.f37611b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.c31 c31Var = f31Var.f37612c;
                    c31Var.f48058a = i15;
                    layoutManager.w0(c31Var);
                }
                f31Var.L = i18;
                return;
            case 28:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.w81 w81Var = sessionsActivity.f34310a;
                if (w81Var != null) {
                    w81Var.l();
                    return;
                }
                return;
            default:
                xi1 xi1Var = (xi1) obj;
                xi1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = xi1Var.v;
                    if (d3Var.V != 3) {
                        d3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.H, 255);
                        d3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.O.setDuration(500L);
                        d3Var.O.start();
                    }
                    xi1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.d3 d3Var2 = xi1Var.v;
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
                xi1Var.F.c(false);
                return;
        }
    }
}
