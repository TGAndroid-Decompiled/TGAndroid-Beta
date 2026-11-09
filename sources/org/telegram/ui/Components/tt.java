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
public final class tt implements j71 {
    public final wt f38487a;

    public tt(wt wtVar) {
        this.f38487a = wtVar;
    }

    @Override
    public final TextureView a(View view, boolean z9, float f10, int i7, boolean z10) {
        wt wtVar = this.f38487a;
        FrameLayout frameLayout = wtVar.l1;
        Activity activity = wtVar.f40154p1;
        if (z9) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(wtVar.f40150j1.getAspectRatioView());
            wtVar.E1 = false;
            wtVar.D1 = z10;
            if (activity != null) {
                try {
                    wtVar.C1 = activity.getRequestedOrientation();
                    if (z10) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    wtVar.f28624b.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        wtVar.D1 = false;
        if (activity != null) {
            try {
                wtVar.f28624b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(wtVar.C1);
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
        wt wtVar = this.f38487a;
        if (wtVar.f40150j1.f()) {
            wtVar.K();
        }
    }

    @Override
    public final void d() {
        wt wtVar = this.f38487a;
        st stVar = wtVar.f40149i1;
        stVar.setVisibility(0);
        wtVar.f40155q1.setVisibility(0);
        wtVar.f40156r1.setVisibility(4);
        stVar.setKeepScreenOn(true);
        m71 m71Var = wtVar.f40150j1;
        m71Var.setVisibility(4);
        m71Var.getControlsView().setVisibility(4);
        m71Var.getTextureView().setVisibility(4);
        if (m71Var.getTextureImageView() != null) {
            m71Var.getTextureImageView().setVisibility(4);
        }
        wtVar.f40150j1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            stVar.loadUrl(wtVar.B1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void e(m71 m71Var, boolean z9) {
        Activity activity = this.f38487a.f40154p1;
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
        wt wtVar = this.f38487a;
        m71 m71Var = wtVar.f40150j1;
        int[] iArr = wtVar.f40160v1;
        if (z9) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(wtVar.f40154p1);
            wtVar.O0(textureView, i7, i10);
            return textureView;
        } else if (z10) {
            wtVar.F1 = true;
            m71Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - wtVar.S();
            iArr[1] = (int) (iArr[1] - wtVar.f28624b.getTranslationY());
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
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, property, 1.0f), ObjectAnimator.ofFloat(textureView2, property2, 1.0f), ObjectAnimator.ofFloat(textureView2, property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, property4, iArr[1]), ObjectAnimator.ofFloat(wtVar.f28624b, property4, 0.0f), ObjectAnimator.ofInt(wtVar.Y, m6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new z5(this, 22));
            animatorSet.start();
            return null;
        } else {
            wtVar.f28624b.setTranslationY(0.0f);
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f38487a.f28627c;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i(boolean z9, e71 e71Var, float f10, boolean z10) {
        if (z9) {
            wt wtVar = this.f38487a;
            if (wtVar.f40154p1 != null) {
                try {
                    wtVar.f28624b.setSystemUiVisibility(0);
                    wt wtVar2 = this.f38487a;
                    int i7 = wtVar2.C1;
                    if (i7 != -2) {
                        wtVar2.f40154p1.setRequestedOrientation(i7);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.f38487a.l1.getVisibility() == 0) {
                ViewGroup viewGroup = this.f38487a.f28624b;
                viewGroup.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup.getMeasuredHeight());
                this.f38487a.Y.setAlpha(0);
            }
            this.f38487a.setOnShowListener(null);
            if (z10) {
                TextureView textureView = this.f38487a.f40150j1.getTextureView();
                View controlsView = this.f38487a.f40150j1.getControlsView();
                ImageView textureImageView = this.f38487a.f40150j1.getTextureImageView();
                li0 I0 = wt.I0(this.f38487a, true, f10);
                float width = I0.f35753c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, I0.f35751a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, I0.f35752b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, I0.f35751a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, I0.f35752b);
                ViewGroup viewGroup2 = this.f38487a.f28624b;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup2, property4, org.telegram.messenger.g0.L(10.0f) + viewGroup2.getMeasuredHeight());
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f38487a.Y, m6.d, 0);
                FrameLayout frameLayout = this.f38487a.l1;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ah.l(26, this, e71Var));
                animatorSet.start();
                return;
            }
            if (this.f38487a.l1.getVisibility() == 0) {
                this.f38487a.l1.setAlpha(1.0f);
                this.f38487a.l1.setVisibility(4);
            }
            e71Var.run();
            this.f38487a.K();
            return;
        }
        if (org.telegram.messenger.t0.f25574x) {
            try {
                this.f38487a.f40154p1.startService(new Intent(org.telegram.messenger.t0.f25566b, BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (z10) {
            wt wtVar3 = this.f38487a;
            wtVar3.setOnShowListener(wtVar3.I1);
            li0 I02 = wt.I0(this.f38487a, false, f10);
            TextureView textureView2 = this.f38487a.f40150j1.getTextureView();
            ImageView textureImageView2 = this.f38487a.f40150j1.getTextureImageView();
            float f11 = I02.f35753c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(I02.f35751a);
            textureImageView2.setTranslationY(I02.f35752b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(I02.f35751a);
            textureView2.setTranslationY(I02.f35752b);
        } else {
            this.f38487a.J0();
        }
        wt wtVar4 = this.f38487a;
        wtVar4.f28633e0 = true;
        wtVar4.show();
        if (z10) {
            wt wtVar5 = this.f38487a;
            wtVar5.G1 = 4;
            wtVar5.Y.setAlpha(1);
            ViewGroup viewGroup3 = this.f38487a.f28624b;
            viewGroup3.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup3.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10) {
    }
}
