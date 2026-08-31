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
import org.telegram.ui.ci1;
public final class jm implements Runnable {
    public final int f28153a;
    public final int f28154b;
    public final Object f28155c;

    public jm(Object obj, int i10, int i11) {
        this.f28153a = i11;
        this.f28155c = obj;
        this.f28154b = i10;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        int i11;
        org.telegram.ui.du0 du0Var;
        String str;
        int i12;
        int i13 = this.f28153a;
        int i14 = 0;
        int i15 = this.f28154b;
        Object obj = this.f28155c;
        switch (i13) {
            case 0:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.M;
                if (i15 == pmVar.L && qmVar.f30418w.isShown()) {
                    qmVar.f30418w.e(1, true);
                    return;
                }
                return;
            case 1:
                mz mzVar = (mz) obj;
                if (mzVar.M1) {
                    my myVar = mzVar.f29315q1;
                    if (myVar != null && myVar.k()) {
                        try {
                            mzVar.f29338x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    mzVar.N1 = true;
                    int max = Math.max(50, i15 - 100);
                    AndroidUtilities.runOnUIThread(new jm(mzVar, max, 1), max);
                    return;
                }
                return;
            case 2:
                ((sa0) obj).f31024b.run(Integer.valueOf(i15));
                return;
            case 3:
                wf0 wf0Var = (wf0) obj;
                org.telegram.ui.pt0 pt0Var = wf0Var.f32741a;
                TextView textView = pt0Var.f33062e;
                fg.h0 h0Var = pt0Var.h;
                RadialProgressView radialProgressView = pt0Var.f33064n;
                TextView textView2 = pt0Var.d;
                textView.setVisibility(8);
                pt0Var.f33063f.setVisibility(8);
                LinearLayout linearLayout = pt0Var.f33061c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new vf0(wf0Var, 0));
                }
                if (h0Var.getAlpha() == 1.0f) {
                    h0Var.animate().cancel();
                    h0Var.animate().alpha(0.0f).setDuration(150L).setListener(new vf0(wf0Var, 1));
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
                        textView.setOnClickListener(new b80(wf0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 4:
                ej0 ej0Var = (ej0) obj;
                ej0Var.S0 = false;
                if (ej0Var.T0) {
                    ej0Var.A(true);
                    return;
                }
                ej0Var.X0 = i15;
                ej0Var.G();
                ej0Var.v();
                return;
            case 5:
                ((zu0) obj).d1(i15);
                return;
            case 6:
                ((rt0) obj).h.scrollBy(0, i15);
                return;
            case 7:
                zu0 zu0Var = ((qs0) obj).f30476a;
                org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
                if (p2Var != null) {
                    if (zu0Var.f33963a1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = zu0.d0(i15, true);
                        tL_channels_setMainProfileTab.channel = p2Var.getMessagesController().getInputChannel(zu0Var.f33963a1.f20844id);
                        TLRPC.ChatFull chatFull = zu0Var.f33963a1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = zu0.d0(i15, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = zu0Var.f33966b1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            p2Var.getMessagesStorage().updateUserInfo(zu0Var.f33966b1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    p2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    zu0Var.v1(true);
                    return;
                }
                return;
            case 8:
                ((yw0) obj).k0(i15, 0);
                return;
            case 9:
                h41 h41Var = (h41) obj;
                h41Var.U();
                h41Var.f27379d0 = i15;
                w31.H(h41Var.f27378c0);
                h41Var.V();
                return;
            case 10:
                ((l81) obj).v.x0(i15);
                return;
            case 11:
                f91 f91Var = (f91) obj;
                k71 k71Var = f91Var.f26812a;
                if (i15 == -1) {
                    if (k71Var.y()) {
                        k71Var.B();
                        f91Var.n();
                    }
                    f91Var.G = false;
                    return;
                } else if (i15 == 1) {
                    if (f91Var.H) {
                        f91Var.H = false;
                        k71Var.C();
                        return;
                    }
                    return;
                } else if (i15 != -3 && i15 == -2 && k71Var.y()) {
                    f91Var.H = true;
                    k71Var.B();
                    f91Var.n();
                    return;
                } else {
                    return;
                }
            case 12:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    d60Var.f36101v3 = Integer.valueOf(i15);
                }
                qc qcVar = new qc(d60Var.topBulletinContainer, new oh.h0());
                Resources resources = d60Var.getContext().getResources();
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
                qcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.d60.g1(i15)).k(d60Var.n1());
                return;
            case 13:
                org.telegram.ui.d60 d60Var2 = ((org.telegram.ui.h50) obj).f37329b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    d60Var2.f36101v3 = Integer.valueOf(i15);
                }
                qc qcVar2 = new qc(d60Var2.topBulletinContainer, new oh.h0());
                Resources resources2 = d60Var2.getContext().getResources();
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
                qcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.d60.g1(i15)).k(d60Var2.n1());
                return;
            case 14:
                org.telegram.ui.z60 z60Var = (org.telegram.ui.z60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = z60Var.f43841n.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = z60Var.f43841n.getChildAt(i16);
                    z60Var.f43841n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(z60Var.f43841n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / z60Var.f43841n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 15:
                org.telegram.ui.bd0 bd0Var = (org.telegram.ui.bd0) obj;
                bd0Var.V.h1(0, -AndroidUtilities.dp(i15));
                bd0Var.A0(false);
                return;
            case 16:
                ((org.telegram.ui.zd0) obj).f43906a.f43982f[i15].l(1.0f);
                return;
            case 17:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.S = true;
                notificationsSettingsActivity.f34197c.m(i15);
                return;
            case 18:
                ((org.telegram.ui.wk0) obj).run(Integer.valueOf(i15));
                return;
            case 19:
                ((org.telegram.ui.xo0) obj).f43444e.f36282g0.f37914y.D(1 - i15);
                return;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                int i17 = i15 + 1;
                if (i17 < 6 && (du0Var = photoViewer.f34230b0) != null) {
                    du0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new jm(photoViewer, i17, 20), 100L);
                    return;
                }
                return;
            case 21:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34714w0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new hg.m2(profileActivity, i15, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 22:
                org.telegram.ui.h01 h01Var = (org.telegram.ui.h01) obj;
                org.telegram.ui.i01 i01Var = h01Var.h;
                NotificationCenter notificationCenter = i01Var.f37715e.getNotificationCenter();
                ProfileActivity profileActivity2 = i01Var.f37715e;
                int i18 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i18);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    af.g.s(h01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
            case 23:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) obj;
                AndroidUtilities.hideKeyboard(z11Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = z11Var.f43772a;
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
            case 24:
                org.telegram.ui.n21 n21Var = (org.telegram.ui.n21) obj;
                f2.w0 layoutManager = n21Var.f39279y.getLayoutManager();
                if (layoutManager != null) {
                    if (n21Var.O) {
                        if (i15 > n21Var.I) {
                            i12 = Math.min(i15 + 1, n21Var.f39270b.d.size() - 1);
                        } else {
                            i12 = Math.max(i15 - 1, 0);
                        }
                    } else {
                        i12 = i15;
                    }
                    org.telegram.ui.k21 k21Var = n21Var.f39271c;
                    k21Var.f5805a = i12;
                    layoutManager.w0(k21Var);
                }
                n21Var.I = i15;
                return;
            case 25:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i15);
                sessionsActivity.m0();
                org.telegram.ui.b81 b81Var = sessionsActivity.f34817a;
                if (b81Var != null) {
                    b81Var.l();
                    return;
                }
                return;
            case 26:
                ci1 ci1Var = (ci1) obj;
                ci1Var.C.setSignalBarCount(i15);
                if (i15 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = ci1Var.v;
                    if (d3Var.S != 3) {
                        d3Var.S = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.E, 255);
                        d3Var.L = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.L.setDuration(500L);
                        d3Var.L.start();
                    }
                    ci1Var.C.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.d3 d3Var2 = ci1Var.v;
                if (d3Var2.S != 2) {
                    d3Var2.S = 2;
                    d3Var2.c();
                    ValueAnimator valueAnimator = d3Var2.L;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        d3Var2.L.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(d3Var2.E, 0);
                    d3Var2.L = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var2, 0));
                    d3Var2.L.setDuration(500L);
                    d3Var2.L.start();
                }
                ci1Var.C.c(false);
                return;
            case 27:
                ((qh.m) obj).run(Integer.valueOf(i15));
                return;
            case 28:
                ((Utilities.Callback) obj).run(Integer.valueOf(i15));
                return;
            default:
                ((qh.y1) obj).p0(i15);
                return;
        }
    }
}
