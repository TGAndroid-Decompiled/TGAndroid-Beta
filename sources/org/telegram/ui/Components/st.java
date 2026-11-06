package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashMap;
import org.telegram.messenger.BringAppForegroundService;
public final class st implements i71 {
    public final vt f38118a;

    public st(vt vtVar) {
        this.f38118a = vtVar;
    }

    @Override
    public final TextureView a(View view, boolean z9, float f10, int i7, boolean z10) {
        vt vtVar = this.f38118a;
        FrameLayout frameLayout = vtVar.l1;
        Activity activity = vtVar.f39690p1;
        if (z9) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(vtVar.f39686j1.getAspectRatioView());
            vtVar.E1 = false;
            vtVar.D1 = z10;
            if (activity != null) {
                try {
                    vtVar.C1 = activity.getRequestedOrientation();
                    if (z10) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    vtVar.f28616b.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        vtVar.D1 = false;
        if (activity != null) {
            try {
                vtVar.f28616b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(vtVar.C1);
                return null;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b() {
        vt vtVar = this.f38118a;
        if (vtVar.f39686j1.f()) {
            vtVar.K();
        }
    }

    @Override
    public final void d() {
        vt vtVar = this.f38118a;
        rt rtVar = vtVar.f39685i1;
        rtVar.setVisibility(0);
        vtVar.f39691q1.setVisibility(0);
        vtVar.f39692r1.setVisibility(4);
        rtVar.setKeepScreenOn(true);
        l71 l71Var = vtVar.f39686j1;
        l71Var.setVisibility(4);
        l71Var.getControlsView().setVisibility(4);
        l71Var.getTextureView().setVisibility(4);
        if (l71Var.getTextureImageView() != null) {
            l71Var.getTextureImageView().setVisibility(4);
        }
        vtVar.f39686j1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            rtVar.loadUrl(vtVar.B1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void e(l71 l71Var, boolean z9) {
        Activity activity = this.f38118a.f39690p1;
        if (z9) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final TextureView f(View view, boolean z9, int i7, int i10, boolean z10) {
        vt vtVar = this.f38118a;
        l71 l71Var = vtVar.f39686j1;
        int[] iArr = vtVar.f39696v1;
        if (z9) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(vtVar.f39690p1);
            vtVar.O0(textureView, i7, i10);
            return textureView;
        } else if (z10) {
            vtVar.F1 = true;
            l71Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - vtVar.S();
            iArr[1] = (int) (iArr[1] - vtVar.f28616b.getTranslationY());
            TextureView textureView2 = l71Var.getTextureView();
            ImageView textureImageView = l71Var.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, property, 1.0f), ObjectAnimator.ofFloat(textureView2, property2, 1.0f), ObjectAnimator.ofFloat(textureView2, property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, property4, iArr[1]), ObjectAnimator.ofFloat(vtVar.f28616b, property4, 0.0f), ObjectAnimator.ofInt(vtVar.Y, m6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new z5(this, 22));
            animatorSet.start();
            return null;
        } else {
            vtVar.f28616b.setTranslationY(0.0f);
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f38118a.f28619c;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i(boolean z9, d71 d71Var, float f10, boolean z10) {
        if (z9) {
            vt vtVar = this.f38118a;
            if (vtVar.f39690p1 != null) {
                try {
                    vtVar.f28616b.setSystemUiVisibility(0);
                    vt vtVar2 = this.f38118a;
                    int i7 = vtVar2.C1;
                    if (i7 != -2) {
                        vtVar2.f39690p1.setRequestedOrientation(i7);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.f38118a.l1.getVisibility() == 0) {
                ViewGroup viewGroup = this.f38118a.f28616b;
                viewGroup.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup.getMeasuredHeight());
                this.f38118a.Y.setAlpha(0);
            }
            this.f38118a.setOnShowListener(null);
            if (z10) {
                TextureView textureView = this.f38118a.f39686j1.getTextureView();
                View controlsView = this.f38118a.f39686j1.getControlsView();
                ImageView textureImageView = this.f38118a.f39686j1.getTextureImageView();
                ki0 I0 = vt.I0(this.f38118a, true, f10);
                float width = I0.f35315c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, I0.f35313a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, I0.f35314b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, I0.f35313a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, I0.f35314b);
                ViewGroup viewGroup2 = this.f38118a.f28616b;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup2, property4, org.telegram.messenger.g0.L(10.0f) + viewGroup2.getMeasuredHeight());
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f38118a.Y, m6.d, 0);
                FrameLayout frameLayout = this.f38118a.l1;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ah.l(26, this, d71Var));
                animatorSet.start();
                return;
            }
            if (this.f38118a.l1.getVisibility() == 0) {
                this.f38118a.l1.setAlpha(1.0f);
                this.f38118a.l1.setVisibility(4);
            }
            d71Var.run();
            this.f38118a.K();
            return;
        }
        if (org.telegram.messenger.t0.f25571x) {
            try {
                this.f38118a.f39690p1.startService(new Intent(org.telegram.messenger.t0.f25563b, BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (z10) {
            vt vtVar3 = this.f38118a;
            vtVar3.setOnShowListener(vtVar3.I1);
            ki0 I02 = vt.I0(this.f38118a, false, f10);
            TextureView textureView2 = this.f38118a.f39686j1.getTextureView();
            ImageView textureImageView2 = this.f38118a.f39686j1.getTextureImageView();
            float f11 = I02.f35315c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(I02.f35313a);
            textureImageView2.setTranslationY(I02.f35314b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(I02.f35313a);
            textureView2.setTranslationY(I02.f35314b);
        } else {
            this.f38118a.J0();
        }
        vt vtVar4 = this.f38118a;
        vtVar4.f28625e0 = true;
        vtVar4.show();
        if (z10) {
            vt vtVar5 = this.f38118a;
            vtVar5.G1 = 4;
            vtVar5.Y.setAlpha(1);
            ViewGroup viewGroup3 = this.f38118a.f28616b;
            viewGroup3.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup3.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10) {
    }
}
