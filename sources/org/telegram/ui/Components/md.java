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
public final class md implements Runnable {
    public final int f26260a;
    public final int f26261b;
    public final Object f26262c;

    public md(Object obj, int i10, int i11) {
        this.f26260a = i11;
        this.f26262c = obj;
        this.f26261b = i10;
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
        int i16 = this.f26260a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f26261b;
        Object obj = this.f26262c;
        switch (i16) {
            case 0:
                nd ndVar = (nd) obj;
                ci.e4 e4Var = ndVar.f26669d1;
                if (ndVar.f26667b1 != i18) {
                    ndVar.setTimer(i18);
                    Utilities.Callback callback = ndVar.f26682r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (ndVar.f26681q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        e4Var.h = ndVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.f4615e0 = AndroidUtilities.dp(0);
                        e4Var.f4614d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (ndVar.f26681q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        e4Var.h = ndVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.f4615e0 = AndroidUtilities.dp(0);
                        e4Var.f4614d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (ndVar.f26681q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        e4Var.p(true);
                        e4Var.h = ci.e4.a(replaceTags, e4Var.getTextPaint());
                        e4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        e4Var.f4615e0 = AndroidUtilities.dp(2);
                        e4Var.f4614d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), ndVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (ndVar instanceof org.telegram.ui.us0) {
                        f7 = -1.0f;
                    }
                    e4Var.setTranslationY(dp * f7);
                    e4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    lj0 lj0Var = new lj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    lj0Var.start();
                    e4Var.j(lj0Var);
                    e4Var.u();
                    ndVar.f26679o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(ndVar.f26680p1);
                    ndVar.invalidate();
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
                    if (chatActivityEnterView.f22000d5 == null) {
                        fgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f22054n1.removeView(chatActivityEnterView.U0);
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
                if (i18 == smVar.O && tmVar.f28604w.isShown()) {
                    tmVar.f28604w.e(1, true);
                    return;
                }
                return;
            case 3:
                nz nzVar = (nz) obj;
                if (nzVar.P1) {
                    oy oyVar = nzVar.f26871t1;
                    if (oyVar != null && oyVar.k()) {
                        try {
                            nzVar.f26883x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    nzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new md(nzVar, max, 3), max);
                    return;
                }
                return;
            case 4:
                ((db0) obj).f23602b.run(Integer.valueOf(i18));
                return;
            case 5:
                cg0 cg0Var = (cg0) obj;
                org.telegram.ui.au0 au0Var = cg0Var.f23311a;
                TextView textView = au0Var.e;
                ci.bb bbVar = au0Var.h;
                RadialProgressView radialProgressView = au0Var.f23633n;
                TextView textView2 = au0Var.d;
                textView.setVisibility(8);
                au0Var.f23632f.setVisibility(8);
                LinearLayout linearLayout = au0Var.f23631c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new bg0(cg0Var, 0));
                }
                if (bbVar.getAlpha() == 1.0f) {
                    bbVar.animate().cancel();
                    bbVar.animate().alpha(0.0f).setDuration(150L).setListener(new bg0(cg0Var, 1));
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
                jj0 jj0Var = (jj0) obj;
                jj0Var.V0 = false;
                if (jj0Var.W0) {
                    jj0Var.C(true);
                    return;
                }
                jj0Var.f25481a1 = i18;
                jj0Var.I();
                jj0Var.x();
                return;
            case 7:
                ((mv0) obj).d1(i18);
                return;
            case 8:
                ((fu0) obj).h.scrollBy(0, i18);
                return;
            case 9:
                mv0 mv0Var = ((et0) obj).f24046a;
                org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
                if (m2Var != null) {
                    if (mv0Var.f26411d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = mv0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = m2Var.getMessagesController().getInputChannel(mv0Var.f26411d1.f18353id);
                        TLRPC.ChatFull chatFull = mv0Var.f26411d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = mv0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = mv0Var.f26413e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            m2Var.getMessagesStorage().updateUserInfo(mv0Var.f26413e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    m2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    mv0Var.v1(true);
                    return;
                }
                return;
            case 10:
                ((jx0) obj).l0(i18, 0);
                return;
            case 11:
                w41 w41Var = (w41) obj;
                w41Var.U();
                w41Var.f29824g0 = i18;
                l41.I(w41Var.f29823f0);
                w41Var.V();
                return;
            case 12:
                ((x81) obj).v.y0(i18);
                return;
            case 13:
                r91 r91Var = (r91) obj;
                v71 v71Var = r91Var.f27905a;
                if (i18 == -1) {
                    if (v71Var.y()) {
                        v71Var.B();
                        r91Var.n();
                    }
                    r91Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (r91Var.K) {
                        r91Var.K = false;
                        v71Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && v71Var.y()) {
                    r91Var.K = true;
                    v71Var.B();
                    r91Var.n();
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
                yc ycVar = new yc(d60Var.topBulletinContainer, new ai.a1());
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
                ycVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.d60.g1(i18)).k(d60Var.n1());
                return;
            case 15:
                org.telegram.ui.d60 d60Var2 = ((org.telegram.ui.g50) obj).f33969b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    d60Var2.y3 = Integer.valueOf(i18);
                }
                yc ycVar2 = new yc(d60Var2.topBulletinContainer, new ai.a1());
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
                ycVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.d60.g1(i18)).k(d60Var2.n1());
                return;
            case 16:
                org.telegram.ui.z60 z60Var = (org.telegram.ui.z60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = z60Var.f40492n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = z60Var.f40492n.getChildAt(i19);
                    z60Var.f40492n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(z60Var.f40492n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / z60Var.f40492n.getMeasuredHeight()) * 100.0f));
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
                ((org.telegram.ui.ae0) obj).f32211a.f40347f[i18].l(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f31236c.m(i18);
                return;
            case 20:
                ((org.telegram.ui.zk0) obj).run(Integer.valueOf(i18));
                return;
            case 21:
                ((org.telegram.ui.fp0) obj).e.f35751p0.I.D(1 - i18);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (nu0Var = photoViewer.f31297e0) != null) {
                    nu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new md(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31772z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
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
                    EditTextBoldCursor[] editTextBoldCursorArr = f21Var.f33608a;
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
                s4.o0 layoutManager = v21Var.f38706y.getLayoutManager();
                if (layoutManager != null) {
                    if (v21Var.R) {
                        if (i18 > v21Var.L) {
                            i15 = Math.min(i18 + 1, v21Var.f38698b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.s21 s21Var = v21Var.f38699c;
                    s21Var.f43218a = i15;
                    layoutManager.w0(s21Var);
                }
                v21Var.L = i18;
                return;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.k81 k81Var = sessionsActivity.f31856a;
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
                duration.setInterpolator(tr.f28636f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
        }
    }
}
