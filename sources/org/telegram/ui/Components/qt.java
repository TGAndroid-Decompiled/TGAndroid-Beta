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
public final class qt implements a71 {
    public final ut f37524a;

    public qt(ut utVar) {
        this.f37524a = utVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i3, boolean z11) {
        ut utVar = this.f37524a;
        FrameLayout frameLayout = utVar.m1;
        Activity activity = utVar.f38867q1;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(utVar.k1.getAspectRatioView());
            utVar.F1 = false;
            utVar.E1 = z11;
            if (activity != null) {
                try {
                    utVar.D1 = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    utVar.f28586b.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        utVar.E1 = false;
        if (activity != null) {
            try {
                utVar.f28586b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(utVar.D1);
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
        ut utVar = this.f37524a;
        if (utVar.k1.f()) {
            utVar.K();
        }
    }

    @Override
    public final void d() {
        ut utVar = this.f37524a;
        pt ptVar = utVar.f38862j1;
        ptVar.setVisibility(0);
        utVar.f38868r1.setVisibility(0);
        utVar.f38869s1.setVisibility(4);
        ptVar.setKeepScreenOn(true);
        d71 d71Var = utVar.k1;
        d71Var.setVisibility(4);
        d71Var.getControlsView().setVisibility(4);
        d71Var.getTextureView().setVisibility(4);
        if (d71Var.getTextureImageView() != null) {
            d71Var.getTextureImageView().setVisibility(4);
        }
        utVar.k1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            ptVar.loadUrl(utVar.C1, hashMap);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void e(d71 d71Var, boolean z10) {
        Activity activity = this.f37524a.f38867q1;
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
    public final TextureView f(View view, boolean z10, int i3, int i10, boolean z11) {
        ut utVar = this.f37524a;
        d71 d71Var = utVar.k1;
        int[] iArr = utVar.f38873w1;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(utVar.f38867q1);
            if (!ie0.x(false, utVar.f38867q1, null, textureView, i3, i10, false)) {
                return null;
            }
            ie0.f34683q0.V = utVar;
            return textureView;
        } else if (z11) {
            utVar.G1 = true;
            d71Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - utVar.S();
            iArr[1] = (int) (iArr[1] - utVar.f28586b.getTranslationY());
            TextureView textureView2 = d71Var.getTextureView();
            ImageView textureImageView = d71Var.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, property, 1.0f), ObjectAnimator.ofFloat(textureView2, property2, 1.0f), ObjectAnimator.ofFloat(textureView2, property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, property4, iArr[1]), ObjectAnimator.ofFloat(utVar.f28586b, property4, 0.0f), ObjectAnimator.ofInt(utVar.Z, k6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new x5(this, 22));
            animatorSet.start();
            return null;
        } else {
            utVar.f28586b.setTranslationY(0.0f);
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f37524a.f28589c;
    }

    @Override
    public final boolean h() {
        Activity activity = this.f37524a.f38867q1;
        if (activity == null) {
            return false;
        }
        if (Settings.canDrawOverlays(activity)) {
            return true;
        }
        t4.A(activity, null, false);
        return false;
    }

    @Override
    public final void i(boolean z10, v61 v61Var, float f10, boolean z11) {
        if (z10) {
            ut utVar = this.f37524a;
            if (utVar.f38867q1 != null) {
                try {
                    utVar.f28586b.setSystemUiVisibility(0);
                    ut utVar2 = this.f37524a;
                    int i3 = utVar2.D1;
                    if (i3 != -2) {
                        utVar2.f38867q1.setRequestedOrientation(i3);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (this.f37524a.m1.getVisibility() == 0) {
                ViewGroup viewGroup = this.f37524a.f28586b;
                viewGroup.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup.getMeasuredHeight());
                this.f37524a.Z.setAlpha(0);
            }
            this.f37524a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f37524a.k1.getTextureView();
                View controlsView = this.f37524a.k1.getControlsView();
                ImageView textureImageView = this.f37524a.k1.getTextureImageView();
                ni0 j10 = ie0.j(true, f10);
                float width = j10.f36565c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, j10.f36563a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, j10.f36564b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, j10.f36563a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, j10.f36564b);
                ViewGroup viewGroup2 = this.f37524a.f28586b;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup2, property4, org.telegram.messenger.g0.L(10.0f) + viewGroup2.getMeasuredHeight());
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f37524a.Z, k6.d, 0);
                FrameLayout frameLayout = this.f37524a.m1;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new bh.j(25, this, v61Var));
                animatorSet.start();
                return;
            }
            if (this.f37524a.m1.getVisibility() == 0) {
                this.f37524a.m1.setAlpha(1.0f);
                this.f37524a.m1.setVisibility(4);
            }
            v61Var.run();
            this.f37524a.K();
            return;
        }
        if (org.telegram.messenger.t0.f25465x) {
            try {
                this.f37524a.f38867q1.startService(new Intent(org.telegram.messenger.t0.f25457b, BringAppForegroundService.class));
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        if (z11) {
            ut utVar3 = this.f37524a;
            utVar3.setOnShowListener(utVar3.J1);
            ni0 j11 = ie0.j(false, f10);
            TextureView textureView2 = this.f37524a.k1.getTextureView();
            ImageView textureImageView2 = this.f37524a.k1.getTextureImageView();
            float f11 = j11.f36565c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(j11.f36563a);
            textureImageView2.setTranslationY(j11.f36564b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(j11.f36563a);
            textureView2.setTranslationY(j11.f36564b);
        } else {
            ie0.b(false);
        }
        ut utVar4 = this.f37524a;
        utVar4.f28598f0 = true;
        utVar4.show();
        if (z11) {
            ut utVar5 = this.f37524a;
            utVar5.H1 = 4;
            utVar5.Z.setAlpha(1);
            ViewGroup viewGroup3 = this.f37524a.f28586b;
            viewGroup3.setTranslationY(org.telegram.messenger.g0.L(10.0f) + viewGroup3.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10) {
    }
}
