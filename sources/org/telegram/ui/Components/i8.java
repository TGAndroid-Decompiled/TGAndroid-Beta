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
import org.telegram.ui.oh1;
public final class i8 implements Runnable {
    public final int f29337a;
    public final int f29338b;
    public final Object f29339c;

    public i8(Object obj, int i10, int i11) {
        this.f29337a = i11;
        this.f29339c = obj;
        this.f29338b = i10;
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
        org.telegram.ui.rt0 rt0Var;
        String str2;
        int i15;
        int i16 = this.f29337a;
        float f9 = 1.0f;
        int i17 = this.f29338b;
        Object obj = this.f29339c;
        switch (i16) {
            case 0:
                ((m8) obj).b(i17);
                return;
            case 1:
                ed edVar = (ed) obj;
                nh.t3 t3Var = edVar.Z0;
                if (edVar.X0 != i17) {
                    edVar.setTimer(i17);
                    Utilities.Callback callback = edVar.f28013n1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i17));
                    }
                    if (i17 == 0) {
                        if (edVar.f28012m1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        t3Var.h = edVar.getMeasuredWidth();
                        t3Var.q(false);
                        t3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        t3Var.f18586a0 = AndroidUtilities.dp(0);
                        t3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i17 == Integer.MAX_VALUE) {
                        if (edVar.f28012m1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        t3Var.h = edVar.getMeasuredWidth();
                        t3Var.q(false);
                        t3Var.l(13.0f, 4.0f, 10.0f, 4.0f);
                        t3Var.f18586a0 = AndroidUtilities.dp(0);
                        t3Var.W = -AndroidUtilities.dp(1.0f);
                    } else if (i17 > 0) {
                        if (edVar.f28012m1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i17, new Object[0]));
                        t3Var.q(true);
                        t3Var.h = nh.t3.a(replaceTags, t3Var.getTextPaint());
                        t3Var.l(12.0f, 7.0f, 11.0f, 7.0f);
                        t3Var.f18586a0 = AndroidUtilities.dp(2);
                        t3Var.W = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), edVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (edVar instanceof org.telegram.ui.yr0) {
                        f9 = -1.0f;
                    }
                    t3Var.setTranslationY(dp * f9);
                    t3Var.t(replaceTags);
                    if (i17 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(34.0f), j7.l1.k(i11, ""), AndroidUtilities.dp(34.0f));
                    xi0Var.start();
                    t3Var.k(xi0Var);
                    t3Var.v();
                    edVar.f28011k1 = false;
                    AndroidUtilities.cancelRunOnUIThread(edVar.l1);
                    edVar.invalidate();
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i17 == 0) {
                    chatActivityEnterView.f26205v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                xf xfVar = chatActivityEnterView.Q0;
                if (xfVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        xfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.f26138i1.removeView(chatActivityEnterView.Q0);
                    if (chatActivityEnterView.B3) {
                        chatActivityEnterView.B3 = false;
                        chatActivityEnterView.Q0 = null;
                    }
                }
                hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    hgVar.v(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 3:
                km kmVar = (km) obj;
                lm lmVar = kmVar.L;
                if (i17 == kmVar.K && lmVar.f30374w.isShown()) {
                    lmVar.f30374w.e(1, true);
                    return;
                }
                return;
            case 4:
                fz fzVar = (fz) obj;
                if (fzVar.L1) {
                    fy fyVar = fzVar.f28623p1;
                    if (fyVar != null && fyVar.k()) {
                        try {
                            fzVar.f28649x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    fzVar.M1 = true;
                    int max = Math.max(50, i17 - 100);
                    AndroidUtilities.runOnUIThread(new i8(fzVar, max, 4), max);
                    return;
                }
                return;
            case 5:
                ((la0) obj).f30271b.run(Integer.valueOf(i17));
                return;
            case 6:
                lf0 lf0Var = (lf0) obj;
                org.telegram.ui.et0 et0Var = lf0Var.f30303a;
                TextView textView = et0Var.f30674e;
                cg.h0 h0Var = et0Var.h;
                RadialProgressView radialProgressView = et0Var.f30676n;
                TextView textView2 = et0Var.d;
                textView.setVisibility(8);
                et0Var.f30675f.setVisibility(8);
                LinearLayout linearLayout = et0Var.f30673c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new kf0(lf0Var, 0));
                }
                if (h0Var.getAlpha() == 1.0f) {
                    h0Var.animate().cancel();
                    h0Var.animate().alpha(0.0f).setDuration(150L).setListener(new kf0(lf0Var, 1));
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
                        textView.setOnClickListener(new u70(lf0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 7:
                ti0 ti0Var = (ti0) obj;
                ti0Var.R0 = false;
                if (ti0Var.S0) {
                    ti0Var.A(true);
                    return;
                }
                ti0Var.W0 = i17;
                ti0Var.G();
                ti0Var.v();
                return;
            case 8:
                ((qu0) obj).d1(i17);
                return;
            case 9:
                ((it0) obj).h.scrollBy(0, i17);
                return;
            case 10:
                qu0 qu0Var = ((hs0) obj).f29223a;
                org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
                if (o2Var != null) {
                    if (qu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = qu0.d0(i17, true);
                        tL_channels_setMainProfileTab.channel = o2Var.getMessagesController().getInputChannel(qu0Var.Z0.f22393id);
                        TLRPC.ChatFull chatFull = qu0Var.Z0;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = qu0.d0(i17, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = qu0Var.f32055a1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            o2Var.getMessagesStorage().updateUserInfo(qu0Var.f32055a1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    o2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    qu0Var.v1(true);
                    return;
                }
                return;
            case 11:
                ((ow0) obj).k0(i17, 0);
                return;
            case 12:
                v31 v31Var = (v31) obj;
                v31Var.U();
                v31Var.f33446c0 = i17;
                k31.H(v31Var.f33445b0);
                v31Var.V();
                return;
            case 13:
                ((y71) obj).v.x0(i17);
                return;
            case 14:
                s81 s81Var = (s81) obj;
                x61 x61Var = s81Var.f32569a;
                if (i17 == -1) {
                    if (x61Var.z()) {
                        x61Var.C();
                        s81Var.n();
                    }
                    s81Var.F = false;
                    return;
                } else if (i17 == 1) {
                    if (s81Var.G) {
                        s81Var.G = false;
                        x61Var.D();
                        return;
                    }
                    return;
                } else if (i17 != -3 && i17 == -2 && x61Var.z()) {
                    s81Var.G = true;
                    x61Var.C();
                    s81Var.n();
                    return;
                } else {
                    return;
                }
            case 15:
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i17);
                    r50Var.f41954u3 = Integer.valueOf(i17);
                }
                tc tcVar = new tc(r50Var.topBulletinContainer, new lh.h0());
                Resources resources = r50Var.getContext().getResources();
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
                tcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.r50.g1(i17)).k(r50Var.n1());
                return;
            case 16:
                org.telegram.ui.r50 r50Var2 = ((org.telegram.ui.u40) obj).f43179b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i17);
                    r50Var2.f41954u3 = Integer.valueOf(i17);
                }
                tc tcVar2 = new tc(r50Var2.topBulletinContainer, new lh.h0());
                Resources resources2 = r50Var2.getContext().getResources();
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
                tcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.r50.g1(i17)).k(r50Var2.n1());
                return;
            case 17:
                org.telegram.ui.m60 m60Var = (org.telegram.ui.m60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = m60Var.f40458n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = m60Var.f40458n.getChildAt(i18);
                    m60Var.f40458n.getClass();
                    if (RecyclerView.R(childAt) >= i17) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(m60Var.f40458n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / m60Var.f40458n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 18:
                org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) obj;
                rc0Var.U.h1(0, -AndroidUtilities.dp(i17));
                rc0Var.A0(false);
                return;
            case 19:
                ((org.telegram.ui.pd0) obj).f41371a.f42455f[i17].l(1.0f);
                return;
            case 20:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.R = true;
                notificationsSettingsActivity.f35623c.m(i17);
                return;
            case 21:
                ((org.telegram.ui.mk0) obj).run(Integer.valueOf(i17));
                return;
            case 22:
                ((org.telegram.ui.no0) obj).f40855e.f43077f0.f44951y.D(1 - i17);
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                int i19 = i17 + 1;
                if (i19 < 6 && (rt0Var = photoViewer.f35647a0) != null) {
                    rt0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new i8(photoViewer, i19, 23), 100L);
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36129v0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new eg.n2(profileActivity, i17, 16));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 25:
                org.telegram.ui.uz0 uz0Var = (org.telegram.ui.uz0) obj;
                org.telegram.ui.vz0 vz0Var = uz0Var.h;
                NotificationCenter notificationCenter = vz0Var.f43803e.getNotificationCenter();
                ProfileActivity profileActivity2 = vz0Var.f43803e;
                int i20 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i20);
                if (i17 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    ye.d.s(uz0Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    if (i17 == 0) {
                        str2 = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str2 = "VALIDATE_PASSWORD";
                    }
                    messagesController.removeSuggestion(0L, str2);
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i20);
                profileActivity2.e5(false, false);
                return;
            case 26:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) obj;
                f2.w0 layoutManager = z11Var.f45034y.getLayoutManager();
                if (layoutManager != null) {
                    if (z11Var.N) {
                        if (i17 > z11Var.H) {
                            i15 = Math.min(i17 + 1, z11Var.f45025b.d.size() - 1);
                        } else {
                            i15 = Math.max(i17 - 1, 0);
                        }
                    } else {
                        i15 = i17;
                    }
                    org.telegram.ui.w11 w11Var = z11Var.f45026c;
                    w11Var.f6373a = i15;
                    layoutManager.w0(w11Var);
                }
                z11Var.H = i17;
                return;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i17);
                sessionsActivity.m0();
                org.telegram.ui.n71 n71Var = sessionsActivity.f36238a;
                if (n71Var != null) {
                    n71Var.l();
                    return;
                }
                return;
            case 28:
                oh1 oh1Var = (oh1) obj;
                oh1Var.B.setSignalBarCount(i17);
                if (i17 <= 1) {
                    org.telegram.ui.Components.voip.e3 e3Var = oh1Var.v;
                    if (e3Var.R != 3) {
                        e3Var.R = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(e3Var.D, 255);
                        e3Var.K = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.c3(e3Var, 2));
                        e3Var.K.setDuration(500L);
                        e3Var.K.start();
                    }
                    oh1Var.B.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.e3 e3Var2 = oh1Var.v;
                if (e3Var2.R != 2) {
                    e3Var2.R = 2;
                    e3Var2.c();
                    ValueAnimator valueAnimator = e3Var2.K;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        e3Var2.K.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(e3Var2.D, 0);
                    e3Var2.K = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.c3(e3Var2, 0));
                    e3Var2.K.setDuration(500L);
                    e3Var2.K.start();
                }
                oh1Var.B.c(false);
                return;
            default:
                ((rf.a0) obj).m(i17);
                return;
        }
    }
}
