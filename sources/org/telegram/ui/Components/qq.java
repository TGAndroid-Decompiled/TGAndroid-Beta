package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Intro;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.zd1;
public final class qq implements Runnable {
    public final int f29772a;
    public final int f29773b;
    public final Object f29774c;

    public qq(int i10, Object obj, int i11) {
        this.f29772a = i11;
        this.f29773b = i10;
        this.f29774c = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.zr0 zr0Var;
        String str;
        CharSequence text;
        int i12 = this.f29772a;
        int i13 = 0;
        int i14 = this.f29773b;
        Object obj = this.f29774c;
        switch (i12) {
            case 0:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    z2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i14);
                    T.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 1:
                vy vyVar = (vy) obj;
                if (vyVar.P1) {
                    vx vxVar = vyVar.f31996t1;
                    if (vxVar != null && vxVar.k()) {
                        try {
                            vyVar.f32012y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    vyVar.Q1 = true;
                    int max = Math.max(50, i14 - 100);
                    org.telegram.messenger.i0.h3(new qq(vyVar, max, 1), max);
                    return;
                }
                return;
            case 2:
                ((z90) obj).f33083b.a(Integer.valueOf(i14));
                return;
            case 3:
                ue0 ue0Var = (ue0) obj;
                org.telegram.ui.lr0 lr0Var = ue0Var.f30946a;
                TextView textView = lr0Var.e;
                bi.t0 t0Var = lr0Var.h;
                RadialProgressView radialProgressView = lr0Var.f31273n;
                TextView textView2 = lr0Var.d;
                textView.setVisibility(8);
                lr0Var.f31272f.setVisibility(8);
                LinearLayout linearLayout = lr0Var.f31271c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new te0(ue0Var, 0));
                }
                if (t0Var.getAlpha() == 1.0f) {
                    t0Var.animate().cancel();
                    t0Var.animate().alpha(0.0f).setDuration(150L).setListener(new te0(ue0Var, 1));
                }
                if (i14 != 2) {
                    if (i14 != 5) {
                        if (i14 != 150) {
                            if (i14 != 100) {
                                if (i14 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(org.telegram.messenger.dd.L0(2131742856, null));
                                return;
                            }
                        }
                        textView2.setText(org.telegram.messenger.dd.L0(2131742857, null));
                        textView.setText(org.telegram.messenger.dd.L0(2131742855, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new db0(ue0Var, 4));
                        return;
                    }
                    textView2.setText(org.telegram.messenger.dd.L0(2131742859, null));
                    return;
                }
                textView2.setText(org.telegram.messenger.dd.L0(2131742858, null));
                return;
            case 4:
                ai0 ai0Var = (ai0) obj;
                ai0Var.V0 = false;
                if (ai0Var.W0) {
                    ai0Var.C(true);
                    return;
                }
                ai0Var.f24403a1 = i14;
                ai0Var.I();
                ai0Var.x();
                return;
            case 5:
                y31 y31Var = (y31) obj;
                y31Var.e1();
                y31Var.Y1 = i14;
                n31.S0(y31Var.X1);
                y31Var.f1();
                return;
            case 6:
                ((w71) obj).f32162w.y0(i14);
                return;
            case 7:
                n81 n81Var = (n81) obj;
                v61 v61Var = n81Var.f28725a;
                if (i14 == -1) {
                    if (v61Var.d0()) {
                        v61Var.g0();
                        n81Var.n();
                    }
                    n81Var.J = false;
                    return;
                } else if (i14 == 1) {
                    if (n81Var.K) {
                        n81Var.K = false;
                        v61Var.h0();
                        return;
                    }
                    return;
                } else if (i14 != -3 && i14 == -2 && v61Var.d0()) {
                    n81Var.K = true;
                    v61Var.g0();
                    n81Var.n();
                    return;
                } else {
                    return;
                }
            case 8:
                org.telegram.ui.a50 a50Var = (org.telegram.ui.a50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i14);
                    a50Var.p5 = Integer.valueOf(i14);
                }
                cc ccVar = new cc(a50Var.E, new so0());
                Resources resources = a50Var.getContext().getResources();
                if (i14 == 2) {
                    i10 = 2131232424;
                } else if (i14 == 0) {
                    i10 = 2131232429;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i10 = 2131232425;
                    } else {
                        i10 = 2131232427;
                    }
                }
                ccVar.M(resources.getDrawable(i10).mutate(), org.telegram.ui.a50.i1(i14)).k(a50Var.p1());
                return;
            case 9:
                org.telegram.ui.a50 a50Var2 = ((org.telegram.ui.e40) obj).f36726b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i14);
                    a50Var2.p5 = Integer.valueOf(i14);
                }
                cc ccVar2 = new cc(a50Var2.E, new so0());
                Resources resources2 = a50Var2.getContext().getResources();
                if (i14 == 2) {
                    i11 = 2131232424;
                } else if (i14 == 0) {
                    i11 = 2131232429;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i11 = 2131232425;
                    } else {
                        i11 = 2131232427;
                    }
                }
                ccVar2.M(resources2.getDrawable(i11).mutate(), org.telegram.ui.a50.i1(i14)).k(a50Var2.p1());
                return;
            case 10:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = u50Var.f41816n.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = u50Var.f41816n.getChildAt(i15);
                    u50Var.f41816n.getClass();
                    if (RecyclerView.R(childAt) >= i14) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(u50Var.f41816n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / u50Var.f41816n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 11:
                org.telegram.ui.q60 q60Var = (org.telegram.ui.q60) obj;
                int i16 = org.telegram.ui.q60.D;
                q60Var.a(2131231536, 17, i14, true);
                q60Var.c();
                q60Var.b(q60Var.f40698w, 23, true);
                q60Var.d();
                Intro.a(i14);
                return;
            case 12:
                org.telegram.ui.xb0 xb0Var = (org.telegram.ui.xb0) obj;
                xb0Var.W.h1(0, -org.telegram.messenger.i0.L(i14));
                xb0Var.P0(false);
                return;
            case 13:
                ((org.telegram.ui.vc0) obj).f42478a.f44045f[i14].C(1.0f);
                return;
            case 14:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33416c.g(i14);
                return;
            case 15:
                ((org.telegram.ui.ej0) obj).a(Integer.valueOf(i14));
                return;
            case 16:
                ((org.telegram.ui.en0) obj).e.f39334p0.I.E(1 - i14);
                return;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i17 = i14 + 1;
                if (i17 < 6 && (zr0Var = photoViewer.f33477e0) != null) {
                    zr0Var.invalidate();
                    org.telegram.messenger.i0.h3(new qq(photoViewer, i17, 17), 100L);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33957z0);
                String L0 = org.telegram.messenger.dd.L0(2131746662, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131746663, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new i2.q(profileActivity, i14, 19));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 19:
                org.telegram.ui.vx0 vx0Var = (org.telegram.ui.vx0) obj;
                ProfileActivity profileActivity2 = vx0Var.h.e;
                profileActivity2.getNotificationCenter().n(profileActivity2, 107);
                if (i14 == 2) {
                    profileActivity2.getMessagesController().h4(0L, "PREMIUM_GRACE");
                    gf.f.r(vx0Var.getContext(), profileActivity2.getMessagesController().M5);
                } else {
                    org.telegram.messenger.wp messagesController = profileActivity2.getMessagesController();
                    if (i14 == 0) {
                        str = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str = "VALIDATE_PASSWORD";
                    }
                    messagesController.h4(0L, str);
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, 107);
                profileActivity2.D5(false, false);
                return;
            case 20:
                org.telegram.ui.iz0 iz0Var = (org.telegram.ui.iz0) obj;
                org.telegram.messenger.i0.v1(iz0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = iz0Var.f38218a;
                    if (i13 < editTextBoldCursorArr.length) {
                        if (i13 != 0 && ((i14 != 3 || i13 != 4) && ((i14 != 2 || (i13 != 4 && i13 != 1)) && (i14 != 1 || (i13 != 1 && i13 != 2 && i13 != 3))))) {
                            editTextBoldCursorArr[i13].setText((CharSequence) null);
                        }
                        i13++;
                    } else {
                        return;
                    }
                }
                break;
            case 21:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f34044f.remove(i14);
                sessionsActivity.r0();
                org.telegram.ui.n41 n41Var = sessionsActivity.f34041a;
                if (n41Var != null) {
                    n41Var.f();
                    return;
                }
                return;
            case 22:
                zd1 zd1Var = (zd1) obj;
                zd1Var.F.setSignalBarCount(i14);
                if (i14 <= 1) {
                    org.telegram.ui.Components.voip.k2 k2Var = zd1Var.f43975w;
                    if (k2Var.V != 3) {
                        k2Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(k2Var.H, 255);
                        k2Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.h2(k2Var, 2));
                        k2Var.O.setDuration(500L);
                        k2Var.O.start();
                    }
                    zd1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.k2 k2Var2 = zd1Var.f43975w;
                if (k2Var2.V != 2) {
                    k2Var2.V = 2;
                    k2Var2.c();
                    ValueAnimator valueAnimator = k2Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        k2Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(k2Var2.H, 0);
                    k2Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.h2(k2Var2, 0));
                    k2Var2.O.setDuration(500L);
                    k2Var2.O.start();
                }
                zd1Var.F.c(false);
                return;
            case 23:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj;
                HashSet hashSet = k0Var.E;
                hashSet.remove(Integer.valueOf(i14));
                if (hashSet.isEmpty()) {
                    k0Var.S();
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i14);
                org.telegram.messenger.at f7 = org.telegram.messenger.at.f(i14);
                org.telegram.ui.Wallet.z zVar = new org.telegram.ui.Wallet.z(f7, (org.telegram.ui.if0) obj, x10);
                f7.b(zVar, 251);
                org.telegram.messenger.i0.h3(zVar, 10000L);
                if (x10.e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                zVar.a();
                return;
            case 25:
                org.telegram.messenger.at.f(i14).n((org.telegram.ui.Wallet.g2) obj, 251);
                return;
            case 26:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.x0(c6Var, i14, org.telegram.ui.Wallet.c6.h(c6Var.R, i14), 3));
                return;
            case 27:
                org.telegram.ui.Wallet.a7 a7Var = (org.telegram.ui.Wallet.a7) obj;
                if (a7Var.f34208r && !a7Var.f34212y && i14 == a7Var.f34205k0) {
                    a7Var.postDelayed(a7Var.f34206l0, 500L);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.k8 k8Var = (org.telegram.ui.Wallet.k8) obj;
                ArrayList arrayList = k8Var.f34827w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) k8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        while (i14 < arrayList.size() && i13 < split.length) {
                            ((org.telegram.ui.Wallet.ra) arrayList.get(i14)).setText(split[i13]);
                            i14++;
                            i13++;
                        }
                        k8Var.d0();
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            default:
                org.telegram.ui.Wallet.ba baVar = (org.telegram.ui.Wallet.ba) obj;
                if (!baVar.f34287r && i14 == baVar.J) {
                    baVar.L = false;
                    baVar.f30217a.f31183f3.O(true);
                    return;
                }
                return;
        }
    }

    public qq(Object obj, int i10, int i11) {
        this.f29772a = i11;
        this.f29774c = obj;
        this.f29773b = i10;
    }
}
