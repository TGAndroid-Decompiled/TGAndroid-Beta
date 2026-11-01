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
import org.telegram.messenger.at;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g31;
import org.telegram.ui.l90;
import org.telegram.ui.zx;
public final class g1 extends AnimatorListenerAdapter {
    public final int f20336a;
    public final Object f20337b;
    public final Object f20338c;
    public final Object d;

    public g1(Object obj, Object obj2, Object obj3, int i10) {
        this.f20336a = i10;
        this.d = obj;
        this.f20337b = obj2;
        this.f20338c = obj3;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20336a) {
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
        switch (this.f20336a) {
            case 0:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).f20134y.remove((AnimatorSet) this.f20337b);
                View view = (View) this.f20338c;
                if (view instanceof b1) {
                    fi0 fi0Var = ((b1) view).f20167c;
                    if (fi0Var.getAnimatedDrawable() != null) {
                        fi0Var.getAnimatedDrawable().start();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                q3 q3Var = (q3) this.d;
                n3 n3Var = (n3) this.f20338c;
                h3 h3Var = (h3) this.f20337b;
                ViewGroup viewGroup = h3Var.f20356b;
                if (viewGroup == null) {
                    viewGroup = h3Var.f20357c;
                }
                if (viewGroup != null && h3Var.f20364m == null && (i10 = h3Var.f20359g) > 0 && (i11 = h3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        q3.g(viewGroup, -h3Var.f20360i, new ag.e0(9, h3Var, n3Var));
                        q3Var.f20664b = null;
                        q3Var.invalidate();
                        return;
                    }
                    h3Var.f20364m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(h3Var.f20364m);
                    canvas.translate(0.0f, -h3Var.f20360i);
                    viewGroup.draw(canvas);
                }
                n3Var.mo30d().setDrawingFromOverlay(false);
                n3Var.release();
                q3Var.f20664b = null;
                q3Var.invalidate();
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.f20337b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.f23747m1.removeView(chatActivityEnterView.f23701e1);
                    viewGroup2.addView(chatActivityEnterView.f23701e1, (ViewGroup.LayoutParams) this.f20338c);
                }
                chatActivityEnterView.f23701e1.setAlpha(1.0f);
                chatActivityEnterView.f23720h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.f23752n = 0.0f;
                chatActivityEnterView.E1();
                xh.w wVar = chatActivityEnterView.f23743l0;
                if (wVar != null) {
                    wVar.setAlpha(0.0f);
                    chatActivityEnterView.f23743l0.setScaleX(0.0f);
                    chatActivityEnterView.f23743l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && wp.d1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    return;
                }
                return;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.f20338c).setVisibility(4);
                ((ImageView) this.f20337b).sendAccessibilityEvent(8);
                return;
            case 4:
                if (((ac.a) this.d).f362a) {
                    ((View) this.f20338c).postDelayed((mg.c2) this.f20337b, 300L);
                    return;
                }
                return;
            case 5:
                uk0 uk0Var = (uk0) this.f20338c;
                s4.r rVar = (s4.r) this.f20337b;
                vy vyVar = (vy) this.d;
                if (animator.equals(vyVar.M0)) {
                    int L0 = rVar.L0();
                    uk0Var.setTranslationY(0.0f);
                    if (uk0Var == vyVar.D0) {
                        uk0Var.setPadding(0, org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(44.0f) + vyVar.f31986q2);
                    } else if (uk0Var == vyVar.f31958h0) {
                        uk0Var.setPadding(0, vyVar.f31939b1, 0, org.telegram.messenger.i0.L(44.0f) + vyVar.f31986q2);
                    } else if (uk0Var == vyVar.P) {
                        uk0Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(44.0f) + vyVar.f31986q2);
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
                boolean[] zArr = (boolean[]) this.f20337b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((j40) this.f20338c).run();
                }
                e50Var.f25705f.setRotationY(0.0f);
                e50Var.f25723q0.setRotationY(0.0f);
                e50Var.N0 = false;
                e50Var.invalidate();
                return;
            case 7:
                x60 x60Var = (x60) this.f20337b;
                x60Var.setProgress(0.0f);
                x60Var.invalidate();
                org.telegram.messenger.i0.E2(x60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.f20338c).getViewTreeObserver();
                z60 z60Var = (z60) this.d;
                View view2 = z60Var.f33021f;
                viewTreeObserver.removeOnPreDrawListener(z60Var.f33049y);
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
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.d;
                xVar.N0 = null;
                ((org.telegram.ui.Components.voip.r) this.f20337b).E = false;
                org.telegram.ui.Components.voip.r rVar2 = xVar.E;
                if (rVar2 != null) {
                    if (rVar2.getParent() != null) {
                        xVar.removeView(xVar.E);
                        ((org.telegram.ui.Components.voip.r) this.f20338c).e();
                    }
                    xVar.E = null;
                    return;
                }
                return;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.G0 = null;
                launchActivity.f33402z0.invalidate();
                launchActivity.f33380o0.invalidate();
                launchActivity.f33380o0.setImageDrawable(null);
                c11 c11Var = launchActivity.f33380o0;
                c11Var.f24973c = null;
                c11Var.f24971a.setShader(null);
                c11Var.f24975n = null;
                c11Var.f24976r = null;
                launchActivity.f33380o0.setVisibility(8);
                launchActivity.f33382p0.setVisibility(8);
                fi0 fi0Var2 = (fi0) this.f20337b;
                if (fi0Var2 != null) {
                    fi0Var2.setImageDrawable((ci0) this.f20338c);
                }
                at.e().k(267, new Object[0]);
                if (fi0Var2 != null) {
                    fi0Var2.setVisibility(0);
                }
                zx.f44112x4 = false;
                return;
            case 10:
                g31 g31Var = (g31) this.d;
                g31Var.f37329s1 = null;
                g31Var.invalidate();
                boolean[] zArr2 = (boolean[]) this.f20337b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((l90) this.f20338c).run();
                    return;
                }
                return;
            default:
                th.j5 j5Var = (th.j5) this.f20338c;
                th.f2 f2Var = (th.f2) this.d;
                th.z2 z2Var = f2Var.f48964a;
                z2Var.f49715d3 = false;
                z2Var.f49718e3 = 1.0f;
                z2Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.f20337b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    th.z2 z2Var2 = f2Var.f48964a;
                    z2Var2.Z2 = true;
                    try {
                        z2Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                j5Var.setAllowDrawReaction(true);
                j5Var.f49124r = true;
                ImageReceiver imageReceiver = j5Var.e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                th.z2 z2Var3 = f2Var.f48964a;
                org.telegram.ui.Components.f5 f5Var = z2Var3.X2;
                if (f5Var != null) {
                    f5Var.n(z2Var3);
                    f2Var.f48964a.X2 = null;
                    return;
                }
                return;
        }
    }

    public g1(ac.a aVar, View view) {
        this.f20336a = 4;
        this.d = aVar;
        this.f20338c = view;
        this.f20337b = new mg.c2(this, 29);
    }

    public g1(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, View view, ImageView imageView) {
        this.f20336a = 3;
        this.d = chatAttachAlertPhotoLayout;
        this.f20338c = view;
        this.f20337b = imageView;
    }
}
