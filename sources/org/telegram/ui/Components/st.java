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
    public final vt f38059a;

    public st(vt vtVar) {
        this.f38059a = vtVar;
    }

    @Override
    public final TextureView a(View view, boolean z9, float f10, int i7, boolean z10) {
        vt vtVar = this.f38059a;
        FrameLayout frameLayout = vtVar.f39735o1;
        Activity activity = vtVar.f39739s1;
        if (z9) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(vtVar.f39734m1.getAspectRatioView());
            vtVar.H1 = false;
            vtVar.G1 = z10;
            if (activity != null) {
                try {
                    vtVar.F1 = activity.getRequestedOrientation();
                    if (z10) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    vtVar.f28672b.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        vtVar.G1 = false;
        if (activity != null) {
            try {
                vtVar.f28672b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(vtVar.F1);
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
        vt vtVar = this.f38059a;
        if (vtVar.f39734m1.f()) {
            vtVar.K();
        }
    }

    @Override
    public final void d() {
        vt vtVar = this.f38059a;
        rt rtVar = vtVar.l1;
        rtVar.setVisibility(0);
        vtVar.f39740t1.setVisibility(0);
        vtVar.f39741u1.setVisibility(4);
        rtVar.setKeepScreenOn(true);
        l71 l71Var = vtVar.f39734m1;
        l71Var.setVisibility(4);
        l71Var.getControlsView().setVisibility(4);
        l71Var.getTextureView().setVisibility(4);
        if (l71Var.getTextureImageView() != null) {
            l71Var.getTextureImageView().setVisibility(4);
        }
        vtVar.f39734m1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            rtVar.loadUrl(vtVar.E1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void e(l71 l71Var, boolean z9) {
        Activity activity = this.f38059a.f39739s1;
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
        vt vtVar = this.f38059a;
        l71 l71Var = vtVar.f39734m1;
        int[] iArr = vtVar.f39745y1;
        if (z9) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(vtVar.f39739s1);
            vtVar.O0(textureView, i7, i10);
            return textureView;
        } else if (z10) {
            vtVar.I1 = true;
            l71Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - vtVar.S();
            iArr[1] = (int) (iArr[1] - vtVar.f28672b.getTranslationY());
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
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, property, 1.0f), ObjectAnimator.ofFloat(textureView2, property2, 1.0f), ObjectAnimator.ofFloat(textureView2, property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, property4, iArr[1]), ObjectAnimator.ofFloat(vtVar.f28672b, property4, 0.0f), ObjectAnimator.ofInt(vtVar.Y, l6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new y5(this, 22));
            animatorSet.start();
            return null;
        } else {
            vtVar.f28672b.setTranslationY(0.0f);
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f38059a.f28675c;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i(boolean z9, d71 d71Var, float f10, boolean z10) {
        if (z9) {
            vt vtVar = this.f38059a;
            if (vtVar.f39739s1 != null) {
                try {
                    vtVar.f28672b.setSystemUiVisibility(0);
                    vt vtVar2 = this.f38059a;
                    int i7 = vtVar2.F1;
                    if (i7 != -2) {
                        vtVar2.f39739s1.setRequestedOrientation(i7);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.f38059a.f39735o1.getVisibility() == 0) {
                ViewGroup viewGroup = this.f38059a.f28672b;
                viewGroup.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup.getMeasuredHeight());
                this.f38059a.Y.setAlpha(0);
            }
            this.f38059a.setOnShowListener(null);
            if (z10) {
                TextureView textureView = this.f38059a.f39734m1.getTextureView();
                View controlsView = this.f38059a.f39734m1.getControlsView();
                ImageView textureImageView = this.f38059a.f39734m1.getTextureImageView();
                ki0 I0 = vt.I0(this.f38059a, true, f10);
                float width = I0.f35355c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, I0.f35353a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, I0.f35354b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, I0.f35353a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, I0.f35354b);
                ViewGroup viewGroup2 = this.f38059a.f28672b;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup2, property4, org.telegram.messenger.g0.L(10.0f) + viewGroup2.getMeasuredHeight());
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f38059a.Y, l6.d, 0);
                FrameLayout frameLayout = this.f38059a.f39735o1;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ah.l(26, this, d71Var));
                animatorSet.start();
                return;
            }
            if (this.f38059a.f39735o1.getVisibility() == 0) {
                this.f38059a.f39735o1.setAlpha(1.0f);
                this.f38059a.f39735o1.setVisibility(4);
            }
            d71Var.run();
            this.f38059a.K();
            return;
        }
        if (org.telegram.messenger.t0.f25578x) {
            try {
                this.f38059a.f39739s1.startService(new Intent(org.telegram.messenger.t0.f25570b, BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (z10) {
            vt vtVar3 = this.f38059a;
            vtVar3.setOnShowListener(vtVar3.L1);
            ki0 I02 = vt.I0(this.f38059a, false, f10);
            TextureView textureView2 = this.f38059a.f39734m1.getTextureView();
            ImageView textureImageView2 = this.f38059a.f39734m1.getTextureImageView();
            float f11 = I02.f35355c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(I02.f35353a);
            textureImageView2.setTranslationY(I02.f35354b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(I02.f35353a);
            textureView2.setTranslationY(I02.f35354b);
        } else {
            this.f38059a.J0();
        }
        vt vtVar4 = this.f38059a;
        vtVar4.f28681e0 = true;
        vtVar4.show();
        if (z10) {
            vt vtVar5 = this.f38059a;
            vtVar5.J1 = 4;
            vtVar5.Y.setAlpha(1);
            ViewGroup viewGroup3 = this.f38059a.f28672b;
            viewGroup3.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup3.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10) {
    }
}
