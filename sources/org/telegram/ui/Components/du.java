package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.provider.Settings;
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
public final class du implements j81 {
    public final hu f25534a;

    public du(hu huVar) {
        this.f25534a = huVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        hu huVar = this.f25534a;
        FrameLayout frameLayout = huVar.l1;
        Activity activity = huVar.f26817p1;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(huVar.f26812j1.getAspectRatioView());
            huVar.E1 = false;
            huVar.D1 = z11;
            if (activity != null) {
                try {
                    huVar.C1 = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    huVar.f21586b.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        huVar.D1 = false;
        if (activity != null) {
            try {
                huVar.f21586b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(huVar.C1);
                return null;
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b() {
        hu huVar = this.f25534a;
        if (huVar.f26812j1.f()) {
            huVar.L();
        }
    }

    @Override
    public final void d() {
        hu huVar = this.f25534a;
        cu cuVar = huVar.f26811i1;
        cuVar.setVisibility(0);
        huVar.f26818q1.setVisibility(0);
        huVar.f26819r1.setVisibility(4);
        cuVar.setKeepScreenOn(true);
        m81 m81Var = huVar.f26812j1;
        m81Var.setVisibility(4);
        m81Var.getControlsView().setVisibility(4);
        m81Var.getTextureView().setVisibility(4);
        if (m81Var.getTextureImageView() != null) {
            m81Var.getTextureImageView().setVisibility(4);
        }
        huVar.f26812j1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            cuVar.loadUrl(huVar.B1, hashMap);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void e(m81 m81Var, boolean z10) {
        Activity activity = this.f25534a.f26817p1;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        hu huVar = this.f25534a;
        m81 m81Var = huVar.f26812j1;
        int[] iArr = huVar.f26823v1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(huVar.f26817p1);
            if (!jf0.x(false, huVar.f26817p1, null, textureView, i10, i11, false)) {
                return null;
            }
            jf0.f27345p0.U = huVar;
            return textureView;
        } else if (z11) {
            huVar.F1 = true;
            m81Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - huVar.T();
            iArr[1] = (int) (iArr[1] - huVar.f21586b.getTranslationY());
            TextureView textureView2 = m81Var.getTextureView();
            ImageView textureImageView = m81Var.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, property, 1.0f), ObjectAnimator.ofFloat(textureView2, property2, 1.0f), ObjectAnimator.ofFloat(textureView2, property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, property4, iArr[1]), ObjectAnimator.ofFloat(huVar.f21586b, property4, 0.0f), ObjectAnimator.ofInt(huVar.Y, i6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new w5(this, 22));
            animatorSet.start();
            return null;
        } else {
            huVar.f21586b.setTranslationY(0.0f);
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f25534a.f21589c;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f25534a.f26817p1;
        if (activity == null) {
            return false;
        }
        if (Settings.canDrawOverlays(activity)) {
            return true;
        }
        s4.A(activity, null, false);
        return false;
    }

    @Override
    public final void i(boolean z10, e81 e81Var, float f7, boolean z11) {
        if (z10) {
            hu huVar = this.f25534a;
            if (huVar.f26817p1 != null) {
                try {
                    huVar.f21586b.setSystemUiVisibility(0);
                    hu huVar2 = this.f25534a;
                    int i10 = huVar2.C1;
                    if (i10 != -2) {
                        huVar2.f26817p1.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            if (this.f25534a.l1.getVisibility() == 0) {
                ViewGroup viewGroup = this.f25534a.f21586b;
                viewGroup.setTranslationY(org.telegram.messenger.i0.L(10.0f) + viewGroup.getMeasuredHeight());
                this.f25534a.Y.setAlpha(0);
            }
            this.f25534a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f25534a.f26812j1.getTextureView();
                View controlsView = this.f25534a.f26812j1.getControlsView();
                ImageView textureImageView = this.f25534a.f26812j1.getTextureImageView();
                oj0 j10 = jf0.j(true, f7);
                float width = j10.f29086c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, j10.f29084a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, j10.f29085b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, j10.f29084a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, j10.f29085b);
                ViewGroup viewGroup2 = this.f25534a.f21586b;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup2, property4, org.telegram.messenger.i0.L(10.0f) + viewGroup2.getMeasuredHeight());
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f25534a.Y, i6.d, 0);
                FrameLayout frameLayout = this.f25534a.l1;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new bg.f(21, this, e81Var));
                animatorSet.start();
                return;
            }
            if (this.f25534a.l1.getVisibility() == 0) {
                this.f25534a.l1.setAlpha(1.0f);
                this.f25534a.l1.setVisibility(4);
            }
            e81Var.run();
            this.f25534a.L();
            return;
        }
        if (org.telegram.messenger.w0.f19032x) {
            try {
                this.f25534a.f26817p1.startService(new Intent(org.telegram.messenger.w0.f19025b, BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        if (z11) {
            hu huVar3 = this.f25534a;
            huVar3.setOnShowListener(huVar3.I1);
            oj0 j11 = jf0.j(false, f7);
            TextureView textureView2 = this.f25534a.f26812j1.getTextureView();
            ImageView textureImageView2 = this.f25534a.f26812j1.getTextureImageView();
            float f10 = j11.f29086c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(j11.f29084a);
            textureImageView2.setTranslationY(j11.f29085b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(j11.f29084a);
            textureView2.setTranslationY(j11.f29085b);
        } else {
            jf0.b(false);
        }
        hu huVar4 = this.f25534a;
        huVar4.f21594e0 = true;
        huVar4.show();
        if (z11) {
            hu huVar5 = this.f25534a;
            huVar5.G1 = 4;
            huVar5.Y.setAlpha(1);
            ViewGroup viewGroup3 = this.f25534a.f21586b;
            viewGroup3.setTranslationY(org.telegram.messenger.i0.L(10.0f) + viewGroup3.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
