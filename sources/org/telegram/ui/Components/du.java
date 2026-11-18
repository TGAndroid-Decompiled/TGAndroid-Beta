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
public final class du implements t71 {
    public final gu f34508a;

    public du(gu guVar) {
        this.f34508a = guVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i7, boolean z11) {
        gu guVar = this.f34508a;
        FrameLayout frameLayout = guVar.f35647p1;
        Activity activity = guVar.f35651t1;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(guVar.n1.getAspectRatioView());
            guVar.I1 = false;
            guVar.H1 = z11;
            if (activity != null) {
                try {
                    guVar.G1 = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    guVar.f30190b.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        guVar.H1 = false;
        if (activity != null) {
            try {
                guVar.f30190b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(guVar.G1);
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
        gu guVar = this.f34508a;
        if (guVar.n1.f()) {
            guVar.L();
        }
    }

    @Override
    public final void d() {
        gu guVar = this.f34508a;
        cu cuVar = guVar.f35645m1;
        cuVar.setVisibility(0);
        guVar.f35652u1.setVisibility(0);
        guVar.f35653v1.setVisibility(4);
        cuVar.setKeepScreenOn(true);
        w71 w71Var = guVar.n1;
        w71Var.setVisibility(4);
        w71Var.getControlsView().setVisibility(4);
        w71Var.getTextureView().setVisibility(4);
        if (w71Var.getTextureImageView() != null) {
            w71Var.getTextureImageView().setVisibility(4);
        }
        guVar.n1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            cuVar.loadUrl(guVar.F1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void e(w71 w71Var, boolean z10) {
        Activity activity = this.f34508a.f35651t1;
        if (z10) {
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
    public final TextureView f(View view, boolean z10, int i7, int i10, boolean z11) {
        gu guVar = this.f34508a;
        w71 w71Var = guVar.n1;
        int[] iArr = guVar.f35657z1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(guVar.f35651t1);
            guVar.P0(textureView, i7, i10);
            return textureView;
        } else if (z11) {
            guVar.J1 = true;
            w71Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - guVar.T();
            iArr[1] = (int) (iArr[1] - guVar.f30190b.getTranslationY());
            TextureView textureView2 = w71Var.getTextureView();
            ImageView textureImageView = w71Var.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, property, 1.0f), ObjectAnimator.ofFloat(textureView2, property2, 1.0f), ObjectAnimator.ofFloat(textureView2, property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, property4, iArr[1]), ObjectAnimator.ofFloat(guVar.f30190b, property4, 0.0f), ObjectAnimator.ofInt(guVar.Z, q6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new x(this, 23));
            animatorSet.start();
            return null;
        } else {
            guVar.f30190b.setTranslationY(0.0f);
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f34508a.f30193c;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i(boolean z10, o71 o71Var, float f10, boolean z11) {
        if (z10) {
            gu guVar = this.f34508a;
            if (guVar.f35651t1 != null) {
                try {
                    guVar.f30190b.setSystemUiVisibility(0);
                    gu guVar2 = this.f34508a;
                    int i7 = guVar2.G1;
                    if (i7 != -2) {
                        guVar2.f35651t1.setRequestedOrientation(i7);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.f34508a.f35647p1.getVisibility() == 0) {
                ViewGroup viewGroup = this.f34508a.f30190b;
                viewGroup.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup.getMeasuredHeight());
                this.f34508a.Z.setAlpha(0);
            }
            this.f34508a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f34508a.n1.getTextureView();
                View controlsView = this.f34508a.n1.getControlsView();
                ImageView textureImageView = this.f34508a.n1.getTextureImageView();
                yi0 J0 = gu.J0(this.f34508a, true, f10);
                float width = J0.f42505c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, J0.f42503a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, J0.f42504b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, J0.f42503a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, J0.f42504b);
                ViewGroup viewGroup2 = this.f34508a.f30190b;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup2, property4, org.telegram.messenger.g0.L(10.0f) + viewGroup2.getMeasuredHeight());
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f34508a.Z, q6.d, 0);
                FrameLayout frameLayout = this.f34508a.f35647p1;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ah.l(26, this, o71Var));
                animatorSet.start();
                return;
            }
            if (this.f34508a.f35647p1.getVisibility() == 0) {
                this.f34508a.f35647p1.setAlpha(1.0f);
                this.f34508a.f35647p1.setVisibility(4);
            }
            o71Var.run();
            this.f34508a.L();
            return;
        }
        if (org.telegram.messenger.t0.f26921x) {
            try {
                this.f34508a.f35651t1.startService(new Intent(org.telegram.messenger.t0.f26913b, BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (z11) {
            gu guVar3 = this.f34508a;
            guVar3.setOnShowListener(guVar3.M1);
            yi0 J02 = gu.J0(this.f34508a, false, f10);
            TextureView textureView2 = this.f34508a.n1.getTextureView();
            ImageView textureImageView2 = this.f34508a.n1.getTextureImageView();
            float f11 = J02.f42505c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(J02.f42503a);
            textureImageView2.setTranslationY(J02.f42504b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(J02.f42503a);
            textureView2.setTranslationY(J02.f42504b);
        } else {
            this.f34508a.K0();
        }
        gu guVar4 = this.f34508a;
        guVar4.f30202f0 = true;
        guVar4.show();
        if (z11) {
            gu guVar5 = this.f34508a;
            guVar5.K1 = 4;
            guVar5.Z.setAlpha(1);
            ViewGroup viewGroup3 = this.f34508a.f30190b;
            viewGroup3.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup3.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10) {
    }
}
