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
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.mh1;
public final class qd implements Runnable {
    public final int f31884a;
    public final int f31885b;
    public final Object f31886c;

    public qd(Object obj, int i9, int i10) {
        this.f31884a = i10;
        this.f31886c = obj;
        this.f31885b = i9;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i9;
        int i10;
        org.telegram.ui.tt0 tt0Var;
        String str;
        int i11;
        int i12 = this.f31884a;
        int i13 = this.f31885b;
        Object obj = this.f31886c;
        switch (i12) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i13 == 0) {
                    chatActivityEnterView.f26194v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                uf ufVar = chatActivityEnterView.Q0;
                if (ufVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        ufVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.f26127i1.removeView(chatActivityEnterView.Q0);
                    if (chatActivityEnterView.B3) {
                        chatActivityEnterView.B3 = false;
                        chatActivityEnterView.Q0 = null;
                    }
                }
                eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 1:
                gm gmVar = (gm) obj;
                hm hmVar = gmVar.L;
                if (i13 == gmVar.K && hmVar.f29126w.isShown()) {
                    hmVar.f29126w.e(1, true);
                    return;
                }
                return;
            case 2:
                wy wyVar = (wy) obj;
                if (wyVar.L1) {
                    wx wxVar = wyVar.f34432p1;
                    if (wxVar != null && wxVar.k()) {
                        try {
                            wyVar.f34458x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    wyVar.M1 = true;
                    int max = Math.max(50, i13 - 100);
                    AndroidUtilities.runOnUIThread(new qd(wyVar, max, 2), max);
                    return;
                }
                return;
            case 3:
                ((x90) obj).f34625b.run(Integer.valueOf(i13));
                return;
            case 4:
                ye0 ye0Var = (ye0) obj;
                org.telegram.ui.gt0 gt0Var = ye0Var.f34958a;
                TextView textView = gt0Var.f35289e;
                fh.l2 l2Var = gt0Var.h;
                RadialProgressView radialProgressView = gt0Var.f35291n;
                TextView textView2 = gt0Var.d;
                textView.setVisibility(8);
                gt0Var.f35290f.setVisibility(8);
                LinearLayout linearLayout = gt0Var.f35288c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new xe0(ye0Var, 0));
                }
                if (l2Var.getAlpha() == 1.0f) {
                    l2Var.animate().cancel();
                    l2Var.animate().alpha(0.0f).setDuration(150L).setListener(new xe0(ye0Var, 1));
                }
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 150) {
                            if (i13 != 100) {
                                if (i13 != 101) {
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
                        textView.setOnClickListener(new h70(ye0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 5:
                ii0 ii0Var = (ii0) obj;
                ii0Var.R0 = false;
                if (ii0Var.S0) {
                    ii0Var.A(true);
                    return;
                }
                ii0Var.W0 = i13;
                ii0Var.G();
                ii0Var.v();
                return;
            case 6:
                ((eu0) obj).d1(i13);
                return;
            case 7:
                ((xs0) obj).h.scrollBy(0, i13);
                return;
            case 8:
                eu0 eu0Var = ((wr0) obj).f34347a;
                org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
                if (o2Var != null) {
                    if (eu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = eu0.d0(i13, true);
                        tL_channels_setMainProfileTab.channel = o2Var.getMessagesController().getInputChannel(eu0Var.Z0.f22381id);
                        TLRPC.ChatFull chatFull = eu0Var.Z0;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = eu0.d0(i13, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = eu0Var.f28122a1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            o2Var.getMessagesStorage().updateUserInfo(eu0Var.f28122a1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    o2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    eu0Var.v1(true);
                    return;
                }
                return;
            case 9:
                ((ew0) obj).k0(i13, 0);
                return;
            case 10:
                k31 k31Var = (k31) obj;
                k31Var.T();
                k31Var.f29926c0 = i13;
                z21.H(k31Var.f29925b0);
                k31Var.U();
                return;
            case 11:
                ((m71) obj).v.x0(i13);
                return;
            case 12:
                g81 g81Var = (g81) obj;
                k61 k61Var = g81Var.f28692a;
                if (i13 == -1) {
                    if (k61Var.z()) {
                        k61Var.C();
                        g81Var.n();
                    }
                    g81Var.F = false;
                    return;
                } else if (i13 == 1) {
                    if (g81Var.G) {
                        g81Var.G = false;
                        k61Var.D();
                        return;
                    }
                    return;
                } else if (i13 != -3 && i13 == -2 && k61Var.z()) {
                    g81Var.G = true;
                    k61Var.C();
                    g81Var.n();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i13);
                    o50Var.f40967u3 = Integer.valueOf(i13);
                }
                oc ocVar = new oc(o50Var.topBulletinContainer, new ih.j0());
                Resources resources = o50Var.getContext().getResources();
                if (i13 == 2) {
                    i9 = R.drawable.msg_voice_bluetooth;
                } else if (i13 == 0) {
                    i9 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i9 = R.drawable.msg_voice_headphones;
                    } else {
                        i9 = R.drawable.msg_voice_phone;
                    }
                }
                ocVar.L(resources.getDrawable(i9).mutate(), org.telegram.ui.o50.g1(i13)).k(o50Var.n1());
                return;
            case 14:
                org.telegram.ui.o50 o50Var2 = ((org.telegram.ui.r40) obj).f42265b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i13);
                    o50Var2.f40967u3 = Integer.valueOf(i13);
                }
                oc ocVar2 = new oc(o50Var2.topBulletinContainer, new ih.j0());
                Resources resources2 = o50Var2.getContext().getResources();
                if (i13 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i13 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i10 = R.drawable.msg_voice_headphones;
                    } else {
                        i10 = R.drawable.msg_voice_phone;
                    }
                }
                ocVar2.L(resources2.getDrawable(i10).mutate(), org.telegram.ui.o50.g1(i13)).k(o50Var2.n1());
                return;
            case 15:
                org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = k60Var.f39742n.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = k60Var.f39742n.getChildAt(i14);
                    k60Var.f39742n.getClass();
                    if (RecyclerView.R(childAt) >= i13) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(k60Var.f39742n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / k60Var.f39742n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 16:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) obj;
                pc0Var.U.h1(0, -AndroidUtilities.dp(i13));
                pc0Var.z0(false);
                return;
            case 17:
                ((org.telegram.ui.pd0) obj).f41482a.f42755f[i13].l(1.0f);
                return;
            case 18:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.R = true;
                notificationsSettingsActivity.f35556c.m(i13);
                return;
            case 19:
                ((org.telegram.ui.qk0) obj).run(Integer.valueOf(i13));
                return;
            case 20:
                ((org.telegram.ui.oo0) obj).f41216e.f43287f0.f45202y.D(1 - i13);
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                int i15 = i13 + 1;
                if (i15 < 6 && (tt0Var = photoViewer.f35580a0) != null) {
                    tt0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new qd(photoViewer, i15, 21), 100L);
                    return;
                }
                return;
            case 22:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f36064v0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bg.x2(profileActivity, i13, 16));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 23:
                org.telegram.ui.uz0 uz0Var = (org.telegram.ui.uz0) obj;
                org.telegram.ui.vz0 vz0Var = uz0Var.h;
                NotificationCenter notificationCenter = vz0Var.f43616e.getNotificationCenter();
                ProfileActivity profileActivity2 = vz0Var.f43616e;
                int i16 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i16);
                if (i13 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    ve.e.s(uz0Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    if (i13 == 0) {
                        str = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str = "VALIDATE_PASSWORD";
                    }
                    messagesController.removeSuggestion(0L, str);
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i16);
                profileActivity2.e5(false, false);
                return;
            case 24:
                org.telegram.ui.y11 y11Var = (org.telegram.ui.y11) obj;
                f2.z0 layoutManager = y11Var.f44684y.getLayoutManager();
                if (layoutManager != null) {
                    if (y11Var.N) {
                        if (i13 > y11Var.H) {
                            i11 = Math.min(i13 + 1, y11Var.f44675b.d.size() - 1);
                        } else {
                            i11 = Math.max(i13 - 1, 0);
                        }
                    } else {
                        i11 = i13;
                    }
                    org.telegram.ui.v11 v11Var = y11Var.f44676c;
                    v11Var.f5443a = i11;
                    layoutManager.w0(v11Var);
                }
                y11Var.H = i13;
                return;
            case 25:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i13);
                sessionsActivity.l0();
                org.telegram.ui.k71 k71Var = sessionsActivity.f36173a;
                if (k71Var != null) {
                    k71Var.l();
                    return;
                }
                return;
            case 26:
                mh1 mh1Var = (mh1) obj;
                mh1Var.B.setSignalBarCount(i13);
                if (i13 <= 1) {
                    org.telegram.ui.Components.voip.b3 b3Var = mh1Var.v;
                    if (b3Var.R != 3) {
                        b3Var.R = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(b3Var.D, 255);
                        b3Var.K = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var, 2));
                        b3Var.K.setDuration(500L);
                        b3Var.K.start();
                    }
                    mh1Var.B.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.b3 b3Var2 = mh1Var.v;
                if (b3Var2.R != 2) {
                    b3Var2.R = 2;
                    b3Var2.c();
                    ValueAnimator valueAnimator = b3Var2.K;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        b3Var2.K.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(b3Var2.D, 0);
                    b3Var2.K = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var2, 0));
                    b3Var2.K.setDuration(500L);
                    b3Var2.K.start();
                }
                mh1Var.B.c(false);
                return;
            case 27:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 28:
                f2.x0 x0Var = (f2.x0) obj;
                x0Var.getClass();
                try {
                    x0Var.f5561a.scrollBy(0, i13);
                    return;
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
            default:
                qh.b0 b0Var = (qh.b0) obj;
                qh.e0 e0Var = b0Var.f46303f;
                if (b0Var.f46301c && e0Var.A != null && e0Var.f46834a != null) {
                    b0Var.d = true;
                    b0Var.f46299a.setPressed(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    qh.c0 c0Var = e0Var.A;
                    qh.a aVar = e0Var.f46834a;
                    qh.o3 o3Var = ((qh.g3) c0Var).f46405a;
                    o3Var.o3(false);
                    o3Var.f46565d3.d2(new qh.l3(o3Var, aVar, i13), b0Var);
                    return;
                }
                return;
        }
    }
}
