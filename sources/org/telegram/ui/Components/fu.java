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
public final class fu implements w71 {
    public final iu f35314a;

    public fu(iu iuVar) {
        this.f35314a = iuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i7, boolean z11) {
        iu iuVar = this.f35314a;
        FrameLayout frameLayout = iuVar.f36320p1;
        Activity activity = iuVar.f36324t1;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(iuVar.n1.getAspectRatioView());
            iuVar.I1 = false;
            iuVar.H1 = z11;
            if (activity != null) {
                try {
                    iuVar.G1 = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    iuVar.f30173b.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        iuVar.H1 = false;
        if (activity != null) {
            try {
                iuVar.f30173b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(iuVar.G1);
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
        iu iuVar = this.f35314a;
        if (iuVar.n1.f()) {
            iuVar.L();
        }
    }

    @Override
    public final void d() {
        iu iuVar = this.f35314a;
        eu euVar = iuVar.f36318m1;
        euVar.setVisibility(0);
        iuVar.f36325u1.setVisibility(0);
        iuVar.f36326v1.setVisibility(4);
        euVar.setKeepScreenOn(true);
        z71 z71Var = iuVar.n1;
        z71Var.setVisibility(4);
        z71Var.getControlsView().setVisibility(4);
        z71Var.getTextureView().setVisibility(4);
        if (z71Var.getTextureImageView() != null) {
            z71Var.getTextureImageView().setVisibility(4);
        }
        iuVar.n1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            euVar.loadUrl(iuVar.F1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void e(z71 z71Var, boolean z10) {
        Activity activity = this.f35314a.f36324t1;
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
        iu iuVar = this.f35314a;
        z71 z71Var = iuVar.n1;
        int[] iArr = iuVar.f36330z1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(iuVar.f36324t1);
            iuVar.P0(textureView, i7, i10);
            return textureView;
        } else if (z11) {
            iuVar.J1 = true;
            z71Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - iuVar.T();
            iArr[1] = (int) (iArr[1] - iuVar.f30173b.getTranslationY());
            TextureView textureView2 = z71Var.getTextureView();
            ImageView textureImageView = z71Var.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, property, 1.0f), ObjectAnimator.ofFloat(textureView2, property2, 1.0f), ObjectAnimator.ofFloat(textureView2, property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, property4, iArr[1]), ObjectAnimator.ofFloat(iuVar.f30173b, property4, 0.0f), ObjectAnimator.ofInt(iuVar.Z, r6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new y(this, 23));
            animatorSet.start();
            return null;
        } else {
            iuVar.f30173b.setTranslationY(0.0f);
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f35314a.f30176c;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i(boolean z10, r71 r71Var, float f10, boolean z11) {
        if (z10) {
            iu iuVar = this.f35314a;
            if (iuVar.f36324t1 != null) {
                try {
                    iuVar.f30173b.setSystemUiVisibility(0);
                    iu iuVar2 = this.f35314a;
                    int i7 = iuVar2.G1;
                    if (i7 != -2) {
                        iuVar2.f36324t1.setRequestedOrientation(i7);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.f35314a.f36320p1.getVisibility() == 0) {
                ViewGroup viewGroup = this.f35314a.f30173b;
                viewGroup.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup.getMeasuredHeight());
                this.f35314a.Z.setAlpha(0);
            }
            this.f35314a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f35314a.n1.getTextureView();
                View controlsView = this.f35314a.n1.getControlsView();
                ImageView textureImageView = this.f35314a.n1.getTextureImageView();
                aj0 J0 = iu.J0(this.f35314a, true, f10);
                float width = J0.f33524c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, J0.f33522a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, J0.f33523b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, J0.f33522a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, J0.f33523b);
                ViewGroup viewGroup2 = this.f35314a.f30173b;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup2, property4, org.telegram.messenger.g0.L(10.0f) + viewGroup2.getMeasuredHeight());
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f35314a.Z, r6.d, 0);
                FrameLayout frameLayout = this.f35314a.f36320p1;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ah.l(27, this, r71Var));
                animatorSet.start();
                return;
            }
            if (this.f35314a.f36320p1.getVisibility() == 0) {
                this.f35314a.f36320p1.setAlpha(1.0f);
                this.f35314a.f36320p1.setVisibility(4);
            }
            r71Var.run();
            this.f35314a.L();
            return;
        }
        if (org.telegram.messenger.t0.f26949x) {
            try {
                this.f35314a.f36324t1.startService(new Intent(org.telegram.messenger.t0.f26941b, BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (z11) {
            iu iuVar3 = this.f35314a;
            iuVar3.setOnShowListener(iuVar3.M1);
            aj0 J02 = iu.J0(this.f35314a, false, f10);
            TextureView textureView2 = this.f35314a.n1.getTextureView();
            ImageView textureImageView2 = this.f35314a.n1.getTextureImageView();
            float f11 = J02.f33524c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(J02.f33522a);
            textureImageView2.setTranslationY(J02.f33523b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(J02.f33522a);
            textureView2.setTranslationY(J02.f33523b);
        } else {
            this.f35314a.K0();
        }
        iu iuVar4 = this.f35314a;
        iuVar4.f30185f0 = true;
        iuVar4.show();
        if (z11) {
            iu iuVar5 = this.f35314a;
            iuVar5.K1 = 4;
            iuVar5.Z.setAlpha(1);
            ViewGroup viewGroup3 = this.f35314a.f30173b;
            viewGroup3.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup3.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10) {
    }
}
