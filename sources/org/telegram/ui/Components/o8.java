package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
public final class o8 implements Runnable {
    public final int f27902a;
    public final int f27903b;
    public final Object f27904c;

    public o8(Object obj, int i10, int i11) {
        this.f27902a = i11;
        this.f27904c = obj;
        this.f27903b = i10;
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
        org.telegram.ui.cv0 cv0Var;
        String str2;
        int i15;
        int i16 = this.f27902a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f27903b;
        Object obj = this.f27904c;
        switch (i16) {
            case 0:
                ((s8) obj).b(i18);
                return;
            case 1:
                md mdVar = (md) obj;
                di.d4 d4Var = mdVar.f27359d1;
                if (mdVar.f27357b1 != i18) {
                    mdVar.setTimer(i18);
                    Utilities.Callback callback = mdVar.f27372r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (mdVar.f27371q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        d4Var.h = mdVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f6793e0 = AndroidUtilities.dp(0);
                        d4Var.f6792d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (mdVar.f27371q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        d4Var.h = mdVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f6793e0 = AndroidUtilities.dp(0);
                        d4Var.f6792d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (mdVar.f27371q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        d4Var.p(true);
                        d4Var.h = di.d4.a(replaceTags, d4Var.getTextPaint());
                        d4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        d4Var.f6793e0 = AndroidUtilities.dp(2);
                        d4Var.f6792d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), mdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (mdVar instanceof org.telegram.ui.jt0) {
                        f7 = -1.0f;
                    }
                    d4Var.setTranslationY(dp * f7);
                    d4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    yj0 yj0Var = new yj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yj0Var.start();
                    d4Var.j(yj0Var);
                    d4Var.u();
                    mdVar.f27369o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(mdVar.f27370p1);
                    mdVar.invalidate();
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView.f22875d5 == null) {
                        fgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f22930n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 3:
                dn dnVar = (dn) obj;
                en enVar = dnVar.P;
                if (i18 == dnVar.O && enVar.f24748w.isShown()) {
                    enVar.f24748w.e(1, true);
                    return;
                }
                return;
            case 4:
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
            case 5:
                wz wzVar = (wz) obj;
                if (wzVar.P1) {
                    wy wyVar = wzVar.f31067t1;
                    if (wyVar != null && wyVar.k()) {
                        try {
                            wzVar.f31079x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    wzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new o8(wzVar, max, 5), max);
                    return;
                }
                return;
            case 6:
                ((pb0) obj).f28276b.run(Integer.valueOf(i18));
                return;
            case 7:
                pg0 pg0Var = (pg0) obj;
                org.telegram.ui.pu0 pu0Var = pg0Var.f28309a;
                TextView textView = pu0Var.e;
                di.ab abVar = pu0Var.h;
                RadialProgressView radialProgressView = pu0Var.f28595n;
                TextView textView2 = pu0Var.d;
                textView.setVisibility(8);
                pu0Var.f28594f.setVisibility(8);
                LinearLayout linearLayout = pu0Var.f28593c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new og0(pg0Var, 0));
                }
                if (abVar.getAlpha() == 1.0f) {
                    abVar.animate().cancel();
                    abVar.animate().alpha(0.0f).setDuration(150L).setListener(new og0(pg0Var, 1));
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
                        textView.setOnClickListener(new z80(pg0Var, 6));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 8:
                wj0 wj0Var = (wj0) obj;
                wj0Var.V0 = false;
                if (wj0Var.W0) {
                    wj0Var.C(true);
                    return;
                }
                wj0Var.f30907a1 = i18;
                wj0Var.I();
                wj0Var.x();
                return;
            case 9:
                ((xv0) obj).d1(i18);
                return;
            case 10:
                ((qu0) obj).h.scrollBy(0, i18);
                return;
            case 11:
                xv0 xv0Var = ((pt0) obj).f28421a;
                org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
                if (m2Var != null) {
                    if (xv0Var.f31350d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = xv0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = m2Var.getMessagesController().getInputChannel(xv0Var.f31350d1.f19217id);
                        TLRPC.ChatFull chatFull = xv0Var.f31350d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = xv0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = xv0Var.f31352e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            m2Var.getMessagesStorage().updateUserInfo(xv0Var.f31352e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    m2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    xv0Var.v1(true);
                    return;
                }
                return;
            case 12:
                ((ux0) obj).k0(i18, 0);
                return;
            case 13:
                i51 i51Var = (i51) obj;
                i51Var.V();
                i51Var.f25845g0 = i18;
                x41.J(i51Var.f25844f0);
                i51Var.W();
                return;
            case 14:
                ((j91) obj).v.x0(i18);
                return;
            case 15:
                ca1 ca1Var = (ca1) obj;
                h81 h81Var = ca1Var.f23990a;
                if (i18 == -1) {
                    if (h81Var.y()) {
                        h81Var.B();
                        ca1Var.n();
                    }
                    ca1Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (ca1Var.K) {
                        ca1Var.K = false;
                        h81Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && h81Var.y()) {
                    ca1Var.K = true;
                    h81Var.B();
                    ca1Var.n();
                    return;
                } else {
                    return;
                }
            case 16:
                org.telegram.ui.n60 n60Var = (org.telegram.ui.n60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    n60Var.y3 = Integer.valueOf(i18);
                }
                zc zcVar = new zc(n60Var.topBulletinContainer, new bi.s0());
                Resources resources = n60Var.getContext().getResources();
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
                zcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.n60.h1(i18)).k(n60Var.o1());
                return;
            case 17:
                org.telegram.ui.n60 n60Var2 = ((org.telegram.ui.q50) obj).f39344b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    n60Var2.y3 = Integer.valueOf(i18);
                }
                zc zcVar2 = new zc(n60Var2.topBulletinContainer, new bi.s0());
                Resources resources2 = n60Var2.getContext().getResources();
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
                zcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.n60.h1(i18)).k(n60Var2.o1());
                return;
            case 18:
                org.telegram.ui.j70 j70Var = (org.telegram.ui.j70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = j70Var.f37285n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = j70Var.f37285n.getChildAt(i19);
                    j70Var.f37285n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(j70Var.f37285n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / j70Var.f37285n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 19:
                org.telegram.ui.nd0 nd0Var = (org.telegram.ui.nd0) obj;
                nd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                nd0Var.z0(false);
                return;
            case 20:
                ((org.telegram.ui.le0) obj).f37930a.f36949f[i18].l(1.0f);
                return;
            case 21:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f32165c.m(i18);
                return;
            case 22:
                ((org.telegram.ui.nl0) obj).run(Integer.valueOf(i18));
                return;
            case 23:
                ((org.telegram.ui.tp0) obj).e.f34322p0.I.D(1 - i18);
                return;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (cv0Var = photoViewer.f32226e0) != null) {
                    cv0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new o8(photoViewer, i20, 24), 100L);
                    return;
                }
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32703z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.r(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 26:
                org.telegram.ui.e11 e11Var = (org.telegram.ui.e11) obj;
                org.telegram.ui.f11 f11Var = e11Var.h;
                NotificationCenter notificationCenter = f11Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = f11Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    pf.d.s(e11Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
            case 27:
                org.telegram.ui.v21 v21Var = (org.telegram.ui.v21) obj;
                AndroidUtilities.hideKeyboard(v21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = v21Var.f40869a;
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
            case 28:
                org.telegram.ui.k31 k31Var = (org.telegram.ui.k31) obj;
                s4.n0 layoutManager = k31Var.f37512y.getLayoutManager();
                if (layoutManager != null) {
                    if (k31Var.R) {
                        if (i18 > k31Var.L) {
                            i15 = Math.min(i18 + 1, k31Var.f37504b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.h31 h31Var = k31Var.f37505c;
                    h31Var.f44979a = i15;
                    layoutManager.w0(h31Var);
                }
                k31Var.L = i18;
                return;
            default:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.a91 a91Var = sessionsActivity.f32787a;
                if (a91Var != null) {
                    a91Var.l();
                    return;
                }
                return;
        }
    }
}
