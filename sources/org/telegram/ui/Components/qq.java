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
import org.telegram.ui.be1;
public final class qq implements Runnable {
    public final int f29724a;
    public final int f29725b;
    public final Object f29726c;

    public qq(int i10, Object obj, int i11) {
        this.f29724a = i11;
        this.f29725b = i10;
        this.f29726c = obj;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.as0 as0Var;
        String str;
        CharSequence text;
        int i12 = this.f29724a;
        int i13 = 0;
        int i14 = this.f29725b;
        Object obj = this.f29726c;
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
                    vx vxVar = vyVar.f31918t1;
                    if (vxVar != null && vxVar.k()) {
                        try {
                            vyVar.f31934y.performHapticFeedback(3);
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
                ((z90) obj).f32987b.a(Integer.valueOf(i14));
                return;
            case 3:
                ue0 ue0Var = (ue0) obj;
                org.telegram.ui.mr0 mr0Var = ue0Var.f30912a;
                TextView textView = mr0Var.e;
                bi.t0 t0Var = mr0Var.h;
                RadialProgressView radialProgressView = mr0Var.f31238n;
                TextView textView2 = mr0Var.d;
                textView.setVisibility(8);
                mr0Var.f31237f.setVisibility(8);
                LinearLayout linearLayout = mr0Var.f31236c;
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
                                textView2.setText(org.telegram.messenger.cd.L0(2131742856, null));
                                return;
                            }
                        }
                        textView2.setText(org.telegram.messenger.cd.L0(2131742857, null));
                        textView.setText(org.telegram.messenger.cd.L0(2131742855, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new db0(ue0Var, 4));
                        return;
                    }
                    textView2.setText(org.telegram.messenger.cd.L0(2131742859, null));
                    return;
                }
                textView2.setText(org.telegram.messenger.cd.L0(2131742858, null));
                return;
            case 4:
                zh0 zh0Var = (zh0) obj;
                zh0Var.V0 = false;
                if (zh0Var.W0) {
                    zh0Var.C(true);
                    return;
                }
                zh0Var.f33068a1 = i14;
                zh0Var.I();
                zh0Var.x();
                return;
            case 5:
                x31 x31Var = (x31) obj;
                x31Var.e1();
                x31Var.Y1 = i14;
                m31.S0(x31Var.X1);
                x31Var.f1();
                return;
            case 6:
                ((v71) obj).f31184w.y0(i14);
                return;
            case 7:
                m81 m81Var = (m81) obj;
                u61 u61Var = m81Var.f28359a;
                if (i14 == -1) {
                    if (u61Var.d0()) {
                        u61Var.g0();
                        m81Var.n();
                    }
                    m81Var.J = false;
                    return;
                } else if (i14 == 1) {
                    if (m81Var.K) {
                        m81Var.K = false;
                        u61Var.h0();
                        return;
                    }
                    return;
                } else if (i14 != -3 && i14 == -2 && u61Var.d0()) {
                    m81Var.K = true;
                    u61Var.g0();
                    m81Var.n();
                    return;
                } else {
                    return;
                }
            case 8:
                org.telegram.ui.b50 b50Var = (org.telegram.ui.b50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i14);
                    b50Var.p5 = Integer.valueOf(i14);
                }
                cc ccVar = new cc(b50Var.E, new ro0());
                Resources resources = b50Var.getContext().getResources();
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
                ccVar.M(resources.getDrawable(i10).mutate(), org.telegram.ui.b50.i1(i14)).k(b50Var.p1());
                return;
            case 9:
                org.telegram.ui.b50 b50Var2 = ((org.telegram.ui.f40) obj).f37176b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i14);
                    b50Var2.p5 = Integer.valueOf(i14);
                }
                cc ccVar2 = new cc(b50Var2.E, new ro0());
                Resources resources2 = b50Var2.getContext().getResources();
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
                ccVar2.M(resources2.getDrawable(i11).mutate(), org.telegram.ui.b50.i1(i14)).k(b50Var2.p1());
                return;
            case 10:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = v50Var.f42621n.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = v50Var.f42621n.getChildAt(i15);
                    v50Var.f42621n.getClass();
                    if (RecyclerView.R(childAt) >= i14) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(v50Var.f42621n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / v50Var.f42621n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 11:
                org.telegram.ui.r60 r60Var = (org.telegram.ui.r60) obj;
                int i16 = org.telegram.ui.r60.D;
                r60Var.a(2131231536, 17, i14, true);
                r60Var.c();
                r60Var.b(r60Var.f41146w, 23, true);
                r60Var.d();
                Intro.a(i14);
                return;
            case 12:
                org.telegram.ui.yb0 yb0Var = (org.telegram.ui.yb0) obj;
                yb0Var.W.h1(0, -org.telegram.messenger.i0.L(i14));
                yb0Var.O0(false);
                return;
            case 13:
                ((org.telegram.ui.wc0) obj).f42927a.f44219f[i14].C(1.0f);
                return;
            case 14:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33409c.g(i14);
                return;
            case 15:
                ((org.telegram.ui.gj0) obj).a(Integer.valueOf(i14));
                return;
            case 16:
                ((org.telegram.ui.gn0) obj).e.f40001p0.I.E(1 - i14);
                return;
            case 17:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i17 = i14 + 1;
                if (i17 < 6 && (as0Var = photoViewer.f33470e0) != null) {
                    as0Var.invalidate();
                    org.telegram.messenger.i0.h3(new qq(photoViewer, i17, 17), 100L);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.R6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f33950z0);
                String L0 = org.telegram.messenger.cd.L0(2131746662, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131746663, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new i2.q(profileActivity, i14, 19));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 19:
                org.telegram.ui.wx0 wx0Var = (org.telegram.ui.wx0) obj;
                ProfileActivity profileActivity2 = wx0Var.h.e;
                profileActivity2.getNotificationCenter().n(profileActivity2, 107);
                if (i14 == 2) {
                    profileActivity2.getMessagesController().h4(0L, "PREMIUM_GRACE");
                    gf.f.r(wx0Var.getContext(), profileActivity2.getMessagesController().M5);
                } else {
                    org.telegram.messenger.vp messagesController = profileActivity2.getMessagesController();
                    if (i14 == 0) {
                        str = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str = "VALIDATE_PASSWORD";
                    }
                    messagesController.h4(0L, str);
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, 107);
                profileActivity2.C5(false, false);
                return;
            case 20:
                org.telegram.ui.jz0 jz0Var = (org.telegram.ui.jz0) obj;
                org.telegram.messenger.i0.v1(jz0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = jz0Var.f38635a;
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
                sessionsActivity.f34037f.remove(i14);
                sessionsActivity.q0();
                org.telegram.ui.p41 p41Var = sessionsActivity.f34034a;
                if (p41Var != null) {
                    p41Var.f();
                    return;
                }
                return;
            case 22:
                be1 be1Var = (be1) obj;
                be1Var.F.setSignalBarCount(i14);
                if (i14 <= 1) {
                    org.telegram.ui.Components.voip.j2 j2Var = be1Var.f36236w;
                    if (j2Var.V != 3) {
                        j2Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(j2Var.H, 255);
                        j2Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.g2(j2Var, 2));
                        j2Var.O.setDuration(500L);
                        j2Var.O.start();
                    }
                    be1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.j2 j2Var2 = be1Var.f36236w;
                if (j2Var2.V != 2) {
                    j2Var2.V = 2;
                    j2Var2.c();
                    ValueAnimator valueAnimator = j2Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        j2Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(j2Var2.H, 0);
                    j2Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.g2(j2Var2, 0));
                    j2Var2.O.setDuration(500L);
                    j2Var2.O.start();
                }
                be1Var.F.c(false);
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
                org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i14);
                org.telegram.ui.Wallet.z zVar = new org.telegram.ui.Wallet.z(f7, (org.telegram.ui.f70) obj, x10);
                f7.b(zVar, 251);
                org.telegram.messenger.i0.h3(zVar, 10000L);
                if (x10.e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                zVar.a();
                return;
            case 25:
                org.telegram.messenger.zs.f(i14).n((org.telegram.ui.Wallet.g2) obj, 251);
                return;
            case 26:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.x0(c6Var, i14, org.telegram.ui.Wallet.c6.h(c6Var.R, i14), 3));
                return;
            case 27:
                org.telegram.ui.Wallet.a7 a7Var = (org.telegram.ui.Wallet.a7) obj;
                if (a7Var.f34209r && !a7Var.f34213y && i14 == a7Var.f34206k0) {
                    a7Var.postDelayed(a7Var.f34207l0, 500L);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Wallet.k8 k8Var = (org.telegram.ui.Wallet.k8) obj;
                ArrayList arrayList = k8Var.f34823w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) k8Var.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        while (i14 < arrayList.size() && i13 < split.length) {
                            ((org.telegram.ui.Wallet.ra) arrayList.get(i14)).setText(split[i13]);
                            i14++;
                            i13++;
                        }
                        k8Var.c0();
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            default:
                org.telegram.ui.Wallet.ba baVar = (org.telegram.ui.Wallet.ba) obj;
                if (!baVar.f34285r && i14 == baVar.J) {
                    baVar.L = false;
                    baVar.f29837a.f30819f3.O(true);
                    return;
                }
                return;
        }
    }

    public qq(Object obj, int i10, int i11) {
        this.f29724a = i11;
        this.f29726c = obj;
        this.f29725b = i10;
    }
}
