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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.cj1;
public final class o8 implements Runnable {
    public final int f27596a;
    public final int f27597b;
    public final Object f27598c;

    public o8(Object obj, int i10, int i11) {
        this.f27596a = i11;
        this.f27598c = obj;
        this.f27597b = i10;
    }

    @Override
    public final void run() {
        String str;
        CharSequence replaceTags;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.bv0 bv0Var;
        String str2;
        int i15;
        int i16 = this.f27596a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f27597b;
        Object obj = this.f27598c;
        switch (i16) {
            case 0:
                ((s8) obj).b(i18);
                return;
            case 1:
                md mdVar = (md) obj;
                di.d4 d4Var = mdVar.f27071d1;
                if (mdVar.f27069b1 != i18) {
                    mdVar.setTimer(i18);
                    Utilities.Callback callback = mdVar.f27084r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (mdVar.f27083q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        d4Var.h = mdVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f6796e0 = AndroidUtilities.dp(0);
                        d4Var.f6795d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (mdVar.f27083q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        d4Var.h = mdVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f6796e0 = AndroidUtilities.dp(0);
                        d4Var.f6795d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (mdVar.f27083q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        d4Var.p(true);
                        d4Var.h = di.d4.a(replaceTags, d4Var.getTextPaint());
                        d4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        d4Var.f6796e0 = AndroidUtilities.dp(2);
                        d4Var.f6795d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), mdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (mdVar instanceof org.telegram.ui.it0) {
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
                    mdVar.f27081o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(mdVar.f27082p1);
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
                    if (chatActivityEnterView.f22575d5 == null) {
                        fgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f22630n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.A(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 3:
                dn dnVar = (dn) obj;
                en enVar = dnVar.P;
                if (i18 == dnVar.O && enVar.f24435w.isShown()) {
                    enVar.f24435w.e(1, true);
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
                    wy wyVar = wzVar.f30760t1;
                    if (wyVar != null && wyVar.k()) {
                        try {
                            wzVar.f30772x.performHapticFeedback(3);
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
                ((pb0) obj).f27957b.run(Integer.valueOf(i18));
                return;
            case 7:
                qg0 qg0Var = (qg0) obj;
                org.telegram.ui.ou0 ou0Var = qg0Var.f28282a;
                TextView textView = ou0Var.e;
                di.ab abVar = ou0Var.h;
                RadialProgressView radialProgressView = ou0Var.f28527n;
                TextView textView2 = ou0Var.d;
                textView.setVisibility(8);
                ou0Var.f28526f.setVisibility(8);
                LinearLayout linearLayout = ou0Var.f28525c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new pg0(qg0Var, 0));
                }
                if (abVar.getAlpha() == 1.0f) {
                    abVar.animate().cancel();
                    abVar.animate().alpha(0.0f).setDuration(150L).setListener(new pg0(qg0Var, 1));
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
                        textView.setOnClickListener(new y80(qg0Var, 6));
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
                wj0Var.f30595a1 = i18;
                wj0Var.I();
                wj0Var.x();
                return;
            case 9:
                ((xv0) obj).e1(i18);
                return;
            case 10:
                ((qu0) obj).h.scrollBy(0, i18);
                return;
            case 11:
                ((ux0) obj).k0(i18, 0);
                return;
            case 12:
                i51 i51Var = (i51) obj;
                i51Var.V();
                i51Var.f25514g0 = i18;
                x41.J(i51Var.f25513f0);
                i51Var.W();
                return;
            case 13:
                ((k91) obj).v.x0(i18);
                return;
            case 14:
                da1 da1Var = (da1) obj;
                i81 i81Var = da1Var.f24046a;
                if (i18 == -1) {
                    if (i81Var.y()) {
                        i81Var.B();
                        da1Var.n();
                    }
                    da1Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (da1Var.K) {
                        da1Var.K = false;
                        i81Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && i81Var.y()) {
                    da1Var.K = true;
                    i81Var.B();
                    da1Var.n();
                    return;
                } else {
                    return;
                }
            case 15:
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
            case 16:
                org.telegram.ui.n60 n60Var2 = ((org.telegram.ui.q50) obj).f39065b;
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
            case 17:
                org.telegram.ui.j70 j70Var = (org.telegram.ui.j70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = j70Var.f36955n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = j70Var.f36955n.getChildAt(i19);
                    j70Var.f36955n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(j70Var.f36955n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / j70Var.f36955n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 18:
                org.telegram.ui.ld0 ld0Var = (org.telegram.ui.ld0) obj;
                ld0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                ld0Var.z0(false);
                return;
            case 19:
                ((org.telegram.ui.je0) obj).f37030a.f36645f[i18].l(1.0f);
                return;
            case 20:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f31867c.m(i18);
                return;
            case 21:
                ((org.telegram.ui.ml0) obj).run(Integer.valueOf(i18));
                return;
            case 22:
                ((org.telegram.ui.rp0) obj).e.f41880p0.I.D(1 - i18);
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (bv0Var = photoViewer.f31928e0) != null) {
                    bv0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new o8(photoViewer, i20, 23), 100L);
                    return;
                }
                return;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f32405z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.r(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 25:
                org.telegram.ui.d11 d11Var = (org.telegram.ui.d11) obj;
                org.telegram.ui.e11 e11Var = d11Var.h;
                NotificationCenter notificationCenter = e11Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = e11Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    pf.d.r(d11Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
                org.telegram.ui.v21 v21Var = (org.telegram.ui.v21) obj;
                AndroidUtilities.hideKeyboard(v21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = v21Var.f40556a;
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
                org.telegram.ui.k31 k31Var = (org.telegram.ui.k31) obj;
                s4.n0 layoutManager = k31Var.f37233y.getLayoutManager();
                if (layoutManager != null) {
                    if (k31Var.R) {
                        if (i18 > k31Var.L) {
                            i15 = Math.min(i18 + 1, k31Var.f37225b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.h31 h31Var = k31Var.f37226c;
                    h31Var.f44979a = i15;
                    layoutManager.w0(h31Var);
                }
                k31Var.L = i18;
                return;
            case 28:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.a91 a91Var = sessionsActivity.f32489a;
                if (a91Var != null) {
                    a91Var.l();
                    return;
                }
                return;
            default:
                cj1 cj1Var = (cj1) obj;
                cj1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.b3 b3Var = cj1Var.v;
                    if (b3Var.V != 3) {
                        b3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(b3Var.H, 255);
                        b3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var, 2));
                        b3Var.O.setDuration(500L);
                        b3Var.O.start();
                    }
                    cj1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.b3 b3Var2 = cj1Var.v;
                if (b3Var2.V != 2) {
                    b3Var2.V = 2;
                    b3Var2.c();
                    ValueAnimator valueAnimator = b3Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        b3Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(b3Var2.H, 0);
                    b3Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var2, 0));
                    b3Var2.O.setDuration(500L);
                    b3Var2.O.start();
                }
                cj1Var.F.c(false);
                return;
        }
    }
}
