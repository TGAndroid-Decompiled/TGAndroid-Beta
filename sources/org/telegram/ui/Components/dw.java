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
import java.util.ArrayList;
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
import org.telegram.ui.ii1;
public final class dw implements Runnable {
    public final int f24388a;
    public final int f24389b;
    public final Object f24390c;

    public dw(int i10, ArrayList arrayList) {
        this.f24388a = 29;
        this.f24389b = i10;
        this.f24390c = arrayList;
    }

    @Override
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        int i11;
        org.telegram.ui.iu0 iu0Var;
        String str;
        int i12;
        int i13 = this.f24388a;
        int i14 = 0;
        Object obj = this.f24390c;
        int i15 = this.f24389b;
        switch (i13) {
            case 0:
                kz kzVar = (kz) obj;
                if (kzVar.M1) {
                    ky kyVar = kzVar.f26472q1;
                    if (kyVar != null && kyVar.k()) {
                        try {
                            kzVar.f26495x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.N1 = true;
                    int max = Math.max(50, i15 - 100);
                    AndroidUtilities.runOnUIThread(new dw(kzVar, max, 0), max);
                    return;
                }
                return;
            case 1:
                ((ra0) obj).f28436b.run(Integer.valueOf(i15));
                return;
            case 2:
                vf0 vf0Var = (vf0) obj;
                org.telegram.ui.ut0 ut0Var = vf0Var.f29469a;
                TextView textView = ut0Var.e;
                eg.h0 h0Var = ut0Var.h;
                RadialProgressView radialProgressView = ut0Var.f30241n;
                TextView textView2 = ut0Var.d;
                textView.setVisibility(8);
                ut0Var.f30240f.setVisibility(8);
                LinearLayout linearLayout = ut0Var.f30239c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new uf0(vf0Var, 0));
                }
                if (h0Var.getAlpha() == 1.0f) {
                    h0Var.animate().cancel();
                    h0Var.animate().alpha(0.0f).setDuration(150L).setListener(new uf0(vf0Var, 1));
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
                        textView.setOnClickListener(new a80(vf0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 3:
                dj0 dj0Var = (dj0) obj;
                dj0Var.S0 = false;
                if (dj0Var.T0) {
                    dj0Var.A(true);
                    return;
                }
                dj0Var.X0 = i15;
                dj0Var.G();
                dj0Var.v();
                return;
            case 4:
                ((yu0) obj).d1(i15);
                return;
            case 5:
                ((qt0) obj).h.scrollBy(0, i15);
                return;
            case 6:
                yu0 yu0Var = ((ps0) obj).f27995a;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31155s1;
                if (p2Var != null) {
                    if (yu0Var.f31115a1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = yu0.d0(i15, true);
                        tL_channels_setMainProfileTab.channel = p2Var.getMessagesController().getInputChannel(yu0Var.f31115a1.f19160id);
                        TLRPC.ChatFull chatFull = yu0Var.f31115a1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = yu0.d0(i15, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = yu0Var.f31118b1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            p2Var.getMessagesStorage().updateUserInfo(yu0Var.f31118b1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    p2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    yu0Var.v1(true);
                    return;
                }
                return;
            case 7:
                ((xw0) obj).k0(i15, 0);
                return;
            case 8:
                g41 g41Var = (g41) obj;
                g41Var.U();
                g41Var.f25045d0 = i15;
                v31.H(g41Var.f25044c0);
                g41Var.V();
                return;
            case 9:
                ((k81) obj).v.x0(i15);
                return;
            case 10:
                e91 e91Var = (e91) obj;
                i71 i71Var = e91Var.f24530a;
                if (i15 == -1) {
                    if (i71Var.y()) {
                        i71Var.B();
                        e91Var.n();
                    }
                    e91Var.G = false;
                    return;
                } else if (i15 == 1) {
                    if (e91Var.H) {
                        e91Var.H = false;
                        i71Var.C();
                        return;
                    }
                    return;
                } else if (i15 != -3 && i15 == -2 && i71Var.y()) {
                    e91Var.H = true;
                    i71Var.B();
                    e91Var.n();
                    return;
                } else {
                    return;
                }
            case 11:
                org.telegram.ui.e60 e60Var = (org.telegram.ui.e60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    e60Var.f33706v3 = Integer.valueOf(i15);
                }
                qc qcVar = new qc(e60Var.topBulletinContainer, new nh.i0());
                Resources resources = e60Var.getContext().getResources();
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
                qcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.e60.g1(i15)).k(e60Var.n1());
                return;
            case 12:
                org.telegram.ui.e60 e60Var2 = ((org.telegram.ui.i50) obj).f34803b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    e60Var2.f33706v3 = Integer.valueOf(i15);
                }
                qc qcVar2 = new qc(e60Var2.topBulletinContainer, new nh.i0());
                Resources resources2 = e60Var2.getContext().getResources();
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
                qcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.e60.g1(i15)).k(e60Var2.n1());
                return;
            case 13:
                org.telegram.ui.a70 a70Var = (org.telegram.ui.a70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = a70Var.f32499n.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = a70Var.f32499n.getChildAt(i16);
                    a70Var.f32499n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(a70Var.f32499n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / a70Var.f32499n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 14:
                org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) obj;
                cd0Var.V.h1(0, -AndroidUtilities.dp(i15));
                cd0Var.A0(false);
                return;
            case 15:
                ((org.telegram.ui.ae0) obj).f32561a.f32635f[i15].l(1.0f);
                return;
            case 16:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.S = true;
                notificationsSettingsActivity.f31648c.m(i15);
                return;
            case 17:
                ((org.telegram.ui.wk0) obj).run(Integer.valueOf(i15));
                return;
            case 18:
                ((org.telegram.ui.ap0) obj).e.m0.F.D(1 - i15);
                return;
            case 19:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                int i17 = i15 + 1;
                if (i17 < 6 && (iu0Var = photoViewer.f31679b0) != null) {
                    iu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new dw(photoViewer, i17, 19), 100L);
                    return;
                }
                return;
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32155w0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gg.m2(profileActivity, i15, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 21:
                org.telegram.ui.m01 m01Var = (org.telegram.ui.m01) obj;
                org.telegram.ui.n01 n01Var = m01Var.h;
                NotificationCenter notificationCenter = n01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = n01Var.e;
                int i18 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i18);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    ze.d.s(m01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
            case 22:
                org.telegram.ui.d21 d21Var = (org.telegram.ui.d21) obj;
                AndroidUtilities.hideKeyboard(d21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = d21Var.f33303a;
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
            case 23:
                org.telegram.ui.t21 t21Var = (org.telegram.ui.t21) obj;
                f2.v0 layoutManager = t21Var.f38370y.getLayoutManager();
                if (layoutManager != null) {
                    if (t21Var.O) {
                        if (i15 > t21Var.I) {
                            i12 = Math.min(i15 + 1, t21Var.f38362b.d.size() - 1);
                        } else {
                            i12 = Math.max(i15 - 1, 0);
                        }
                    } else {
                        i12 = i15;
                    }
                    org.telegram.ui.q21 q21Var = t21Var.f38363c;
                    q21Var.f5712a = i12;
                    layoutManager.w0(q21Var);
                }
                t21Var.I = i15;
                return;
            case 24:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i15);
                sessionsActivity.m0();
                org.telegram.ui.i81 i81Var = sessionsActivity.f32255a;
                if (i81Var != null) {
                    i81Var.l();
                    return;
                }
                return;
            case 25:
                ii1 ii1Var = (ii1) obj;
                ii1Var.C.setSignalBarCount(i15);
                if (i15 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = ii1Var.v;
                    if (c3Var.S != 3) {
                        c3Var.S = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.E, 255);
                        c3Var.L = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.L.setDuration(500L);
                        c3Var.L.start();
                    }
                    ii1Var.C.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.c3 c3Var2 = ii1Var.v;
                if (c3Var2.S != 2) {
                    c3Var2.S = 2;
                    c3Var2.c();
                    ValueAnimator valueAnimator = c3Var2.L;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        c3Var2.L.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(c3Var2.E, 0);
                    c3Var2.L = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var2, 0));
                    c3Var2.L.setDuration(500L);
                    c3Var2.L.start();
                }
                ii1Var.C.c(false);
                return;
            case 26:
                ((ph.m) obj).run(Integer.valueOf(i15));
                return;
            case 27:
                ((Utilities.Callback) obj).run(Integer.valueOf(i15));
                return;
            case 28:
                ((ph.y1) obj).p0(i15);
                return;
            default:
                MessagesController.getInstance(i15).putUsers((ArrayList) obj, true);
                return;
        }
    }

    public dw(Object obj, int i10, int i11) {
        this.f24388a = i11;
        this.f24390c = obj;
        this.f24389b = i10;
    }
}
