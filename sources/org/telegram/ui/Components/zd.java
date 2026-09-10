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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.zi1;
public final class zd implements Runnable {
    public final int f29645a;
    public final int f29646b;
    public final Object f29647c;

    public zd(Object obj, int i10, int i11) {
        this.f29645a = i11;
        this.f29647c = obj;
        this.f29646b = i10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        int i11;
        org.telegram.ui.wu0 wu0Var;
        String str;
        int i12;
        int i13 = this.f29645a;
        int i14 = 0;
        int i15 = this.f29646b;
        Object obj = this.f29647c;
        switch (i13) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.f20960z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView.f20836c5 == null) {
                        fgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f20889m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                qg qgVar = chatActivityEnterView.Y2;
                if (qgVar != null) {
                    qgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 1:
                wm wmVar = (wm) obj;
                xm xmVar = wmVar.P;
                if (i15 == wmVar.O && xmVar.f29082w.isShown()) {
                    xmVar.f29082w.e(1, true);
                    return;
                }
                return;
            case 2:
                rz rzVar = (rz) obj;
                if (rzVar.P1) {
                    sy syVar = rzVar.f26858t1;
                    if (syVar != null && syVar.k()) {
                        try {
                            rzVar.f26870x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    rzVar.Q1 = true;
                    int max = Math.max(50, i15 - 100);
                    AndroidUtilities.runOnUIThread(new zd(rzVar, max, 2), max);
                    return;
                }
                return;
            case 3:
                ((ya0) obj).f29287b.run(Integer.valueOf(i15));
                return;
            case 4:
                yf0 yf0Var = (yf0) obj;
                org.telegram.ui.hu0 hu0Var = yf0Var.f29318a;
                TextView textView = hu0Var.e;
                bi.nc ncVar = hu0Var.h;
                RadialProgressView radialProgressView = hu0Var.f29662n;
                TextView textView2 = hu0Var.d;
                textView.setVisibility(8);
                hu0Var.f29661f.setVisibility(8);
                LinearLayout linearLayout = hu0Var.f29660c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new xf0(yf0Var, 0));
                }
                if (ncVar.getAlpha() == 1.0f) {
                    ncVar.animate().cancel();
                    ncVar.animate().alpha(0.0f).setDuration(150L).setListener(new xf0(yf0Var, 1));
                }
                if (i15 != 2) {
                    if (i15 != 5) {
                        if (i15 != 150) {
                            if (i15 != 100) {
                                if (i15 != 101) {
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
                        textView.setOnClickListener(new g80(yf0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 5:
                fj0 fj0Var = (fj0) obj;
                fj0Var.V0 = false;
                if (fj0Var.W0) {
                    fj0Var.C(true);
                    return;
                }
                fj0Var.f23024a1 = i15;
                fj0Var.I();
                fj0Var.x();
                return;
            case 6:
                ((iv0) obj).d1(i15);
                return;
            case 7:
                ((au0) obj).h.scrollBy(0, i15);
                return;
            case 8:
                iv0 iv0Var = ((zs0) obj).f29804a;
                org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
                if (p2Var != null) {
                    if (iv0Var.f24093d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = iv0.d0(i15, true);
                        tL_channels_setMainProfileTab.channel = p2Var.getMessagesController().getInputChannel(iv0Var.f24093d1.f17196id);
                        TLRPC.ChatFull chatFull = iv0Var.f24093d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = iv0.d0(i15, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = iv0Var.f24095e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            p2Var.getMessagesStorage().updateUserInfo(iv0Var.f24095e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    p2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    iv0Var.v1(true);
                    return;
                }
                return;
            case 9:
                ((hx0) obj).k0(i15, 0);
                return;
            case 10:
                t41 t41Var = (t41) obj;
                t41Var.U();
                t41Var.f27321g0 = i15;
                i41.I(t41Var.f27320f0);
                t41Var.V();
                return;
            case 11:
                ((u81) obj).v.x0(i15);
                return;
            case 12:
                o91 o91Var = (o91) obj;
                t71 t71Var = o91Var.f25715a;
                if (i15 == -1) {
                    if (t71Var.y()) {
                        t71Var.B();
                        o91Var.n();
                    }
                    o91Var.J = false;
                    return;
                } else if (i15 == 1) {
                    if (o91Var.K) {
                        o91Var.K = false;
                        t71Var.C();
                        return;
                    }
                    return;
                } else if (i15 != -3 && i15 == -2 && t71Var.y()) {
                    o91Var.K = true;
                    t71Var.B();
                    o91Var.n();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    j60Var.y3 = Integer.valueOf(i15);
                }
                wc wcVar = new wc(j60Var.topBulletinContainer, new bq0());
                Resources resources = j60Var.getContext().getResources();
                if (i15 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i10 = R.drawable.msg_voice_headphones;
                    } else {
                        i10 = R.drawable.msg_voice_phone;
                    }
                }
                wcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.j60.g1(i15)).k(j60Var.n1());
                return;
            case 14:
                org.telegram.ui.j60 j60Var2 = ((org.telegram.ui.m50) obj).f34847b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    j60Var2.y3 = Integer.valueOf(i15);
                }
                wc wcVar2 = new wc(j60Var2.topBulletinContainer, new bq0());
                Resources resources2 = j60Var2.getContext().getResources();
                if (i15 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i11 = R.drawable.msg_voice_headphones;
                    } else {
                        i11 = R.drawable.msg_voice_phone;
                    }
                }
                wcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.j60.g1(i15)).k(j60Var2.n1());
                return;
            case 15:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = e70Var.f32093n.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = e70Var.f32093n.getChildAt(i16);
                    e70Var.f32093n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(e70Var.f32093n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / e70Var.f32093n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 16:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) obj;
                id0Var.Y.h1(0, -AndroidUtilities.dp(i15));
                id0Var.A0(false);
                return;
            case 17:
                ((org.telegram.ui.ge0) obj).f33070a.f32906f[i15].l(1.0f);
                return;
            case 18:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f29989c.m(i15);
                return;
            case 19:
                ((org.telegram.ui.hl0) obj).run(Integer.valueOf(i15));
                return;
            case 20:
                ((org.telegram.ui.np0) obj).e.f37324p0.I.D(1 - i15);
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                int i17 = i15 + 1;
                if (i17 < 6 && (wu0Var = photoViewer.f30049e0) != null) {
                    wu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new zd(photoViewer, i17, 21), 100L);
                    return;
                }
                return;
            case 22:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f30524z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                d2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i15, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 23:
                org.telegram.ui.e11 e11Var = (org.telegram.ui.e11) obj;
                org.telegram.ui.f11 f11Var = e11Var.h;
                NotificationCenter notificationCenter = f11Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = f11Var.e;
                int i18 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i18);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(e11Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    if (i15 == 0) {
                        str = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str = "VALIDATE_PASSWORD";
                    }
                    messagesController.removeSuggestion(0L, str);
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i18);
                profileActivity2.e5(false, false);
                return;
            case 24:
                org.telegram.ui.u21 u21Var = (org.telegram.ui.u21) obj;
                AndroidUtilities.hideKeyboard(u21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = u21Var.f37089a;
                    if (i14 < editTextBoldCursorArr.length) {
                        if (i14 != 0 && ((i15 != 3 || i14 != 4) && ((i15 != 2 || (i14 != 4 && i14 != 1)) && (i15 != 1 || (i14 != 1 && i14 != 2 && i14 != 3))))) {
                            editTextBoldCursorArr[i14].setText((CharSequence) null);
                        }
                        i14++;
                    } else {
                        return;
                    }
                }
                break;
            case 25:
                org.telegram.ui.j31 j31Var = (org.telegram.ui.j31) obj;
                s4.o0 layoutManager = j31Var.f33875y.getLayoutManager();
                if (layoutManager != null) {
                    if (j31Var.R) {
                        if (i15 > j31Var.L) {
                            i12 = Math.min(i15 + 1, j31Var.f33867b.d.size() - 1);
                        } else {
                            i12 = Math.max(i15 - 1, 0);
                        }
                    } else {
                        i12 = i15;
                    }
                    org.telegram.ui.g31 g31Var = j31Var.f33868c;
                    g31Var.f41760a = i12;
                    layoutManager.w0(g31Var);
                }
                j31Var.L = i15;
                return;
            case 26:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i15);
                sessionsActivity.m0();
                org.telegram.ui.v81 v81Var = sessionsActivity.f30608a;
                if (v81Var != null) {
                    v81Var.l();
                    return;
                }
                return;
            case 27:
                zi1 zi1Var = (zi1) obj;
                zi1Var.F.setSignalBarCount(i15);
                if (i15 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = zi1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    zi1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.c3 c3Var2 = zi1Var.v;
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
                zi1Var.F.c(false);
                return;
            case 28:
                pg.j jVar = (pg.j) obj;
                jVar.L = i15;
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
                duration.setInterpolator(wr.f28819f);
                jVar.P.addUpdateListener(new pg.f(jVar, 5));
                jVar.P.addListener(new pg.g(jVar, 2));
                jVar.P.start();
                return;
            default:
                org.telegram.ui.zt0 zt0Var = (org.telegram.ui.zt0) obj;
                og.v1 v1Var = zt0Var.K1;
                zt0Var.s0(v1Var, null);
                og.x0.e(i15).j(v1Var.f14536c);
                return;
        }
    }
}
