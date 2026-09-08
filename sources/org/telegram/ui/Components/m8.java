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
import org.telegram.ui.ui1;
public final class m8 implements Runnable {
    public final int f28430a;
    public final int f28431b;
    public final Object f28432c;

    public m8(Object obj, int i10, int i11) {
        this.f28430a = i11;
        this.f28432c = obj;
        this.f28431b = i10;
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
        org.telegram.ui.uu0 uu0Var;
        String str2;
        int i15;
        int i16 = this.f28430a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f28431b;
        Object obj = this.f28432c;
        switch (i16) {
            case 0:
                ((q8) obj).b(i18);
                return;
            case 1:
                ld ldVar = (ld) obj;
                di.f4 f4Var = ldVar.f28169d1;
                if (ldVar.f28167b1 != i18) {
                    ldVar.setTimer(i18);
                    Utilities.Callback callback = ldVar.f28182r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (ldVar.f28181q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        f4Var.h = ldVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f7230e0 = AndroidUtilities.dp(0);
                        f4Var.f7228d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (ldVar.f28181q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        f4Var.h = ldVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f7230e0 = AndroidUtilities.dp(0);
                        f4Var.f7228d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (ldVar.f28181q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        f4Var.p(true);
                        f4Var.h = di.f4.a(replaceTags, f4Var.getTextPaint());
                        f4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f4Var.f7230e0 = AndroidUtilities.dp(2);
                        f4Var.f7228d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), ldVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (ldVar instanceof org.telegram.ui.bt0) {
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
                    ldVar.f28179o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(ldVar.f28180p1);
                    ldVar.invalidate();
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.f23833z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    if (chatActivityEnterView.f23708c5 == null) {
                        egVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f23762m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                og ogVar = chatActivityEnterView.Y2;
                if (ogVar != null) {
                    ogVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 3:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (i18 == pmVar.O && qmVar.f29798w.isShown()) {
                    qmVar.f29798w.e(1, true);
                    return;
                }
                return;
            case 4:
                kz kzVar = (kz) obj;
                if (kzVar.P1) {
                    ly lyVar = kzVar.f28013t1;
                    if (lyVar != null && lyVar.k()) {
                        try {
                            kzVar.f28025x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new m8(kzVar, max, 4), max);
                    return;
                }
                return;
            case 5:
                ((pa0) obj).f29371b.run(Integer.valueOf(i18));
                return;
            case 6:
                pf0 pf0Var = (pf0) obj;
                org.telegram.ui.hu0 hu0Var = pf0Var.f29394a;
                TextView textView = hu0Var.f29737e;
                di.eb ebVar = hu0Var.h;
                RadialProgressView radialProgressView = hu0Var.f29739n;
                TextView textView2 = hu0Var.d;
                textView.setVisibility(8);
                hu0Var.f29738f.setVisibility(8);
                LinearLayout linearLayout = hu0Var.f29736c;
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
            case 7:
                vi0 vi0Var = (vi0) obj;
                vi0Var.V0 = false;
                if (vi0Var.W0) {
                    vi0Var.A(true);
                    return;
                }
                vi0Var.f31373a1 = i18;
                vi0Var.G();
                vi0Var.v();
                return;
            case 8:
                ((xu0) obj).d1(i18);
                return;
            case 9:
                ((qt0) obj).h.scrollBy(0, i18);
                return;
            case 10:
                xu0 xu0Var = ((ps0) obj).f29512a;
                org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32753v1;
                if (n2Var != null) {
                    if (xu0Var.f32714d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = xu0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(xu0Var.f32714d1.f19897id);
                        TLRPC.ChatFull chatFull = xu0Var.f32714d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = xu0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = xu0Var.f32717e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(xu0Var.f32717e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    xu0Var.v1(true);
                    return;
                }
                return;
            case 11:
                ((vw0) obj).k0(i18, 0);
                return;
            case 12:
                f41 f41Var = (f41) obj;
                f41Var.U();
                f41Var.f25935g0 = i18;
                u31.I(f41Var.f25934f0);
                f41Var.V();
                return;
            case 13:
                ((h81) obj).v.x0(i18);
                return;
            case 14:
                b91 b91Var = (b91) obj;
                g71 g71Var = b91Var.f24645a;
                if (i18 == -1) {
                    if (g71Var.y()) {
                        g71Var.B();
                        b91Var.n();
                    }
                    b91Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (b91Var.K) {
                        b91Var.K = false;
                        g71Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && g71Var.y()) {
                    b91Var.K = true;
                    g71Var.B();
                    b91Var.n();
                    return;
                } else {
                    return;
                }
            case 15:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    j60Var.y3 = Integer.valueOf(i18);
                }
                yc ycVar = new yc(j60Var.topBulletinContainer, new bi.s0());
                Resources resources = j60Var.getContext().getResources();
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
                ycVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.j60.g1(i18)).k(j60Var.n1());
                return;
            case 16:
                org.telegram.ui.j60 j60Var2 = ((org.telegram.ui.m50) obj).f38601b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    j60Var2.y3 = Integer.valueOf(i18);
                }
                yc ycVar2 = new yc(j60Var2.topBulletinContainer, new bi.s0());
                Resources resources2 = j60Var2.getContext().getResources();
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
                ycVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.j60.g1(i18)).k(j60Var2.n1());
                return;
            case 17:
                org.telegram.ui.f70 f70Var = (org.telegram.ui.f70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = f70Var.f36322n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = f70Var.f36322n.getChildAt(i19);
                    f70Var.f36322n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(f70Var.f36322n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / f70Var.f36322n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 18:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) obj;
                id0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                id0Var.A0(false);
                return;
            case 19:
                ((org.telegram.ui.ge0) obj).f36669a.f36190f[i18].l(1.0f);
                return;
            case 20:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33513c.m(i18);
                return;
            case 21:
                ((org.telegram.ui.il0) obj).run(Integer.valueOf(i18));
                return;
            case 22:
                ((org.telegram.ui.op0) obj).f39323e.f41646p0.I.D(1 - i18);
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                int i20 = i18 + 1;
                if (i20 < 6 && (uu0Var = photoViewer.f33576e0) != null) {
                    uu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new m8(photoViewer, i20, 23), 100L);
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34058z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.t(profileActivity, i18, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 25:
                org.telegram.ui.z01 z01Var = (org.telegram.ui.z01) obj;
                org.telegram.ui.a11 a11Var = z01Var.h;
                NotificationCenter notificationCenter = a11Var.f34318e.getNotificationCenter();
                ProfileActivity profileActivity2 = a11Var.f34318e;
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
                    EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f39708a;
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
                s4.o0 layoutManager = f31Var.f36287y.getLayoutManager();
                if (layoutManager != null) {
                    if (f31Var.R) {
                        if (i18 > f31Var.L) {
                            i15 = Math.min(i18 + 1, f31Var.f36278b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.c31 c31Var = f31Var.f36279c;
                    c31Var.f45934a = i15;
                    layoutManager.w0(c31Var);
                }
                f31Var.L = i18;
                return;
            case 28:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.t81 t81Var = sessionsActivity.f34145a;
                if (t81Var != null) {
                    t81Var.l();
                    return;
                }
                return;
            default:
                ui1 ui1Var = (ui1) obj;
                ui1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.a3 a3Var = ui1Var.v;
                    if (a3Var.V != 3) {
                        a3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(a3Var.H, 255);
                        a3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.y2(a3Var, 2));
                        a3Var.O.setDuration(500L);
                        a3Var.O.start();
                    }
                    ui1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.a3 a3Var2 = ui1Var.v;
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
                ui1Var.F.c(false);
                return;
        }
    }
}
