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
public final class yt implements j71 {
    public final bu f42155a;

    public yt(bu buVar) {
        this.f42155a = buVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i7, boolean z11) {
        bu buVar = this.f42155a;
        FrameLayout frameLayout = buVar.f33381p1;
        Activity activity = buVar.f33385t1;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(buVar.n1.getAspectRatioView());
            buVar.I1 = false;
            buVar.H1 = z11;
            if (activity != null) {
                try {
                    buVar.G1 = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    buVar.f29682b.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        buVar.H1 = false;
        if (activity != null) {
            try {
                buVar.f29682b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(buVar.G1);
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
        bu buVar = this.f42155a;
        if (buVar.n1.f()) {
            buVar.L();
        }
    }

    @Override
    public final void d() {
        bu buVar = this.f42155a;
        xt xtVar = buVar.f33379m1;
        xtVar.setVisibility(0);
        buVar.f33386u1.setVisibility(0);
        buVar.f33387v1.setVisibility(4);
        xtVar.setKeepScreenOn(true);
        m71 m71Var = buVar.n1;
        m71Var.setVisibility(4);
        m71Var.getControlsView().setVisibility(4);
        m71Var.getTextureView().setVisibility(4);
        if (m71Var.getTextureImageView() != null) {
            m71Var.getTextureImageView().setVisibility(4);
        }
        buVar.n1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            xtVar.loadUrl(buVar.F1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void e(m71 m71Var, boolean z10) {
        Activity activity = this.f42155a.f33385t1;
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
        bu buVar = this.f42155a;
        m71 m71Var = buVar.n1;
        int[] iArr = buVar.f33391z1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(buVar.f33385t1);
            buVar.O0(textureView, i7, i10);
            return textureView;
        } else if (z11) {
            buVar.J1 = true;
            m71Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - buVar.T();
            iArr[1] = (int) (iArr[1] - buVar.f29682b.getTranslationY());
            TextureView textureView2 = m71Var.getTextureView();
            ImageView textureImageView = m71Var.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, property, 1.0f), ObjectAnimator.ofFloat(textureView2, property2, 1.0f), ObjectAnimator.ofFloat(textureView2, property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, property4, iArr[1]), ObjectAnimator.ofFloat(buVar.f29682b, property4, 0.0f), ObjectAnimator.ofInt(buVar.Z, k6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new x5(this, 22));
            animatorSet.start();
            return null;
        } else {
            buVar.f29682b.setTranslationY(0.0f);
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f42155a.f29685c;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i(boolean z10, e71 e71Var, float f10, boolean z11) {
        if (z10) {
            bu buVar = this.f42155a;
            if (buVar.f33385t1 != null) {
                try {
                    buVar.f29682b.setSystemUiVisibility(0);
                    bu buVar2 = this.f42155a;
                    int i7 = buVar2.G1;
                    if (i7 != -2) {
                        buVar2.f33385t1.setRequestedOrientation(i7);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.f42155a.f33381p1.getVisibility() == 0) {
                ViewGroup viewGroup = this.f42155a.f29682b;
                viewGroup.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup.getMeasuredHeight());
                this.f42155a.Z.setAlpha(0);
            }
            this.f42155a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f42155a.n1.getTextureView();
                View controlsView = this.f42155a.n1.getControlsView();
                ImageView textureImageView = this.f42155a.n1.getTextureImageView();
                pi0 I0 = bu.I0(this.f42155a, true, f10);
                float width = I0.f38314c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, I0.f38312a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, I0.f38313b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, I0.f38312a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, I0.f38313b);
                ViewGroup viewGroup2 = this.f42155a.f29682b;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup2, property4, org.telegram.messenger.g0.L(10.0f) + viewGroup2.getMeasuredHeight());
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f42155a.Z, k6.d, 0);
                FrameLayout frameLayout = this.f42155a.f33381p1;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ah.l(26, this, e71Var));
                animatorSet.start();
                return;
            }
            if (this.f42155a.f33381p1.getVisibility() == 0) {
                this.f42155a.f33381p1.setAlpha(1.0f);
                this.f42155a.f33381p1.setVisibility(4);
            }
            e71Var.run();
            this.f42155a.L();
            return;
        }
        if (org.telegram.messenger.t0.f26617x) {
            try {
                this.f42155a.f33385t1.startService(new Intent(org.telegram.messenger.t0.f26609b, BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (z11) {
            bu buVar3 = this.f42155a;
            buVar3.setOnShowListener(buVar3.M1);
            pi0 I02 = bu.I0(this.f42155a, false, f10);
            TextureView textureView2 = this.f42155a.n1.getTextureView();
            ImageView textureImageView2 = this.f42155a.n1.getTextureImageView();
            float f11 = I02.f38314c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(I02.f38312a);
            textureImageView2.setTranslationY(I02.f38313b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(I02.f38312a);
            textureView2.setTranslationY(I02.f38313b);
        } else {
            this.f42155a.J0();
        }
        bu buVar4 = this.f42155a;
        buVar4.f29694f0 = true;
        buVar4.show();
        if (z11) {
            bu buVar5 = this.f42155a;
            buVar5.K1 = 4;
            buVar5.Z.setAlpha(1);
            ViewGroup viewGroup3 = this.f42155a.f29682b;
            viewGroup3.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup3.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10) {
    }
}
