package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.i31;
import org.telegram.ui.m90;
public final class g1 extends AnimatorListenerAdapter {
    public final int f20335a;
    public final Object f20336b;
    public final Object f20337c;
    public final Object d;

    public g1(Object obj, Object obj2, Object obj3, int i10) {
        this.f20335a = i10;
        this.d = obj;
        this.f20336b = obj2;
        this.f20337c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20335a) {
            case 5:
                vy vyVar = (vy) this.d;
                if (animator.equals(vyVar.M0)) {
                    vyVar.M0 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f20335a) {
            case 0:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20133y.remove((AnimatorSet) this.f20336b);
                View view = (View) this.f20337c;
                if (view instanceof b1) {
                    ei0 ei0Var = ((b1) view).f20166c;
                    if (ei0Var.getAnimatedDrawable() != null) {
                        ei0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q3 q3Var = (q3) this.d;
                n3 n3Var = (n3) this.f20337c;
                h3 h3Var = (h3) this.f20336b;
                ViewGroup viewGroup = h3Var.f20355b;
                if (viewGroup == null) {
                    viewGroup = h3Var.f20356c;
                }
                if (viewGroup != null && h3Var.f20363m == null && (i10 = h3Var.f20358g) > 0 && (i11 = h3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        q3.g(viewGroup, -h3Var.f20359i, new ag.e0(9, h3Var, n3Var));
                        q3Var.f20663b = null;
                        q3Var.invalidate();
                        return;
                    }
                    h3Var.f20363m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(h3Var.f20363m);
                    canvas.translate(0.0f, -h3Var.f20359i);
                    viewGroup.draw(canvas);
                }
                n3Var.mo30d().setDrawingFromOverlay(false);
                n3Var.release();
                q3Var.f20663b = null;
                q3Var.invalidate();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f20336b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.f23746m1.removeView(chatActivityEnterView.f23700e1);
                    viewGroup2.addView(chatActivityEnterView.f23700e1, (ViewGroup.LayoutParams) this.f20337c);
                }
                chatActivityEnterView.f23700e1.setAlpha(1.0f);
                chatActivityEnterView.f23719h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f23751n = 0.0f;
                chatActivityEnterView.E1();
                xh.w wVar = chatActivityEnterView.f23742l0;
                if (wVar != null) {
                    wVar.setAlpha(0.0f);
                    chatActivityEnterView.f23742l0.setScaleX(0.0f);
                    chatActivityEnterView.f23742l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && vp.d1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f20337c).setVisibility(4);
                ((ImageView) this.f20336b).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((ac.a) this.d).f362a) {
                    ((View) this.f20337c).postDelayed((mg.c2) this.f20336b, 300L);
                    return;
                }
                return;
            case 5:
                tk0 tk0Var = (tk0) this.f20337c;
                s4.r rVar = (s4.r) this.f20336b;
                vy vyVar = (vy) this.d;
                if (animator.equals(vyVar.M0)) {
                    int L0 = rVar.L0();
                    tk0Var.setTranslationY(0.0f);
                    if (tk0Var == vyVar.D0) {
                        tk0Var.setPadding(0, org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(44.0f) + vyVar.f31908q2);
                    } else if (tk0Var == vyVar.f31880h0) {
                        tk0Var.setPadding(0, vyVar.f31861b1, 0, org.telegram.messenger.i0.L(44.0f) + vyVar.f31908q2);
                    } else if (tk0Var == vyVar.P) {
                        tk0Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(44.0f) + vyVar.f31908q2);
                    }
                    if (L0 != -1) {
                        rVar.h1(L0, 0);
                    }
                    vyVar.M0 = null;
                    return;
                }
                return;
            case 6:
                e50 e50Var = (e50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr = (boolean[]) this.f20336b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((j40) this.f20337c).run();
                }
                e50Var.f25656f.setRotationY(0.0f);
                e50Var.f25674q0.setRotationY(0.0f);
                e50Var.N0 = false;
                e50Var.invalidate();
                return;
            case 7:
                x60 x60Var = (x60) this.f20336b;
                x60Var.setProgress(0.0f);
                x60Var.invalidate();
                org.telegram.messenger.i0.E2(x60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f20337c).getViewTreeObserver();
                z60 z60Var = (z60) this.d;
                View view2 = z60Var.f32918f;
                viewTreeObserver.removeOnPreDrawListener(z60Var.f32946y);
                if (z60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof ph.c1) {
                        ph.c1 c1Var = (ph.c1) view2;
                        FrameLayout frameLayout = c1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(c1Var.e);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.w wVar2 = (org.telegram.ui.Components.voip.w) this.d;
                wVar2.N0 = null;
                ((org.telegram.ui.Components.voip.r) this.f20336b).E = false;
                org.telegram.ui.Components.voip.r rVar2 = wVar2.E;
                if (rVar2 != null) {
                    if (rVar2.getParent() != null) {
                        wVar2.removeView(wVar2.E);
                        ((org.telegram.ui.Components.voip.r) this.f20337c).e();
                    }
                    wVar2.E = null;
                    return;
                }
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.G0 = null;
                launchActivity.f33395z0.invalidate();
                launchActivity.f33373o0.invalidate();
                launchActivity.f33373o0.setImageDrawable(null);
                b11 b11Var = launchActivity.f33373o0;
                b11Var.f24497c = null;
                b11Var.f24495a.setShader(null);
                b11Var.f24499n = null;
                b11Var.f24500r = null;
                launchActivity.f33373o0.setVisibility(8);
                launchActivity.f33375p0.setVisibility(8);
                ei0 ei0Var2 = (ei0) this.f20336b;
                if (ei0Var2 != null) {
                    ei0Var2.setImageDrawable((bi0) this.f20337c);
                }
                zs.e().k(267, new Object[0]);
                if (ei0Var2 != null) {
                    ei0Var2.setVisibility(0);
                }
                ay.f35769x4 = false;
                return;
            case 10:
                i31 i31Var = (i31) this.d;
                i31Var.f38153s1 = null;
                i31Var.invalidate();
                boolean[] zArr2 = (boolean[]) this.f20336b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((m90) this.f20337c).run();
                    return;
                }
                return;
            default:
                th.j5 j5Var = (th.j5) this.f20337c;
                th.f2 f2Var = (th.f2) this.d;
                th.z2 z2Var = f2Var.f48950a;
                z2Var.f49701d3 = false;
                z2Var.f49704e3 = 1.0f;
                z2Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f20336b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    th.z2 z2Var2 = f2Var.f48950a;
                    z2Var2.Z2 = true;
                    try {
                        z2Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                j5Var.setAllowDrawReaction(true);
                j5Var.f49110r = true;
                ImageReceiver imageReceiver = j5Var.e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                th.z2 z2Var3 = f2Var.f48950a;
                org.telegram.ui.Components.f5 f5Var = z2Var3.X2;
                if (f5Var != null) {
                    f5Var.n(z2Var3);
                    f2Var.f48950a.X2 = null;
                    return;
                }
                return;
        }
    }

    public g1(ac.a aVar, View view) {
        this.f20335a = 4;
        this.d = aVar;
        this.f20337c = view;
        this.f20336b = new mg.c2(this, 29);
    }

    public g1(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, View view, ImageView imageView) {
        this.f20335a = 3;
        this.d = chatAttachAlertPhotoLayout;
        this.f20337c = view;
        this.f20336b = imageView;
    }
}
