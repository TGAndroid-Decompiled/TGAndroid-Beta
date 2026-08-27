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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;

public final class bu implements f81 {

    public final fu f27212a;

    public bu(fu fuVar) {
        this.f27212a = fuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f10, int i10, boolean z11) {
        fu fuVar = this.f27212a;
        FrameLayout frameLayout = fuVar.f28452e;
        Activity activity = fuVar.f28455r;
        if (!z10) {
            frameLayout.setVisibility(4);
            fuVar.I = false;
            if (activity == null) {
                return null;
            }
            try {
                ((org.telegram.ui.ActionBar.e3) fuVar).containerView.setSystemUiVisibility(0);
                activity.setRequestedOrientation(fuVar.H);
                return null;
            } catch (Exception e9) {
                FileLog.e(e9);
                return null;
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(1.0f);
        frameLayout.addView(fuVar.f28451c.getAspectRatioView());
        fuVar.J = false;
        fuVar.I = z11;
        if (activity == null) {
            return null;
        }
        try {
            fuVar.H = activity.getRequestedOrientation();
            if (z11) {
                if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                    activity.setRequestedOrientation(8);
                } else {
                    activity.setRequestedOrientation(0);
                }
            }
            ((org.telegram.ui.ActionBar.e3) fuVar).containerView.setSystemUiVisibility(1028);
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override
    public final void b() {
        fu fuVar = this.f27212a;
        if (fuVar.f28451c.f()) {
            fuVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        fu fuVar = this.f27212a;
        zt ztVar = fuVar.f28450b;
        ztVar.setVisibility(0);
        fuVar.f28456s.setVisibility(0);
        fuVar.v.setVisibility(4);
        ztVar.setKeepScreenOn(true);
        i81 i81Var = fuVar.f28451c;
        i81Var.setVisibility(4);
        i81Var.getControlsView().setVisibility(4);
        i81Var.getTextureView().setVisibility(4);
        if (i81Var.getTextureImageView() != null) {
            i81Var.getTextureImageView().setVisibility(4);
        }
        fuVar.f28451c.g(null, null, null, null, false);
        HashMap map = new HashMap();
        map.put("Referer", "messenger.telegram.org");
        try {
            ztVar.loadUrl(fuVar.G, map);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void e(i81 i81Var, boolean z10) {
        Activity activity = this.f27212a.f28455r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        fu fuVar = this.f27212a;
        i81 i81Var = fuVar.f28451c;
        int[] iArr = fuVar.A;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(fuVar.f28455r);
            if (!sf0.x(false, fuVar.f28455r, null, textureView, i10, i11, false)) {
                return null;
            }
            sf0.f32415l0.Q = fuVar;
            return textureView;
        }
        if (!z11) {
            ((org.telegram.ui.ActionBar.e3) fuVar).containerView.setTranslationY(0.0f);
            return null;
        }
        fuVar.K = true;
        i81Var.getAspectRatioView().getLocationInWindow(iArr);
        iArr[0] = iArr[0] - fuVar.getLeftInset();
        iArr[1] = (int) (iArr[1] - ((org.telegram.ui.ActionBar.e3) fuVar).containerView.getTranslationY());
        TextureView textureView2 = i81Var.getTextureView();
        ImageView textureImageView = i81Var.getTextureImageView();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property2, 1.0f);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property3, iArr[0]);
        Property property4 = View.TRANSLATION_Y;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, ObjectAnimator.ofFloat(textureImageView, (Property<ImageView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, iArr[1]), ObjectAnimator.ofFloat(((org.telegram.ui.ActionBar.e3) fuVar).containerView, (Property<ViewGroup, Float>) property4, 0.0f), ObjectAnimator.ofInt(((org.telegram.ui.ActionBar.e3) fuVar).backDrawable, m6.d, 51));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new org.telegram.ui.am(this, 25));
        animatorSet.start();
        return null;
    }

    @Override
    public final ViewGroup g() {
        return this.f27212a.container;
    }

    @Override
    public final boolean h() {
        return this.f27212a.G();
    }

    @Override
    public final void i(boolean z10, a81 a81Var, float f10, boolean z11) {
        if (!z10) {
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.f27212a.f28455r.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (z11) {
                fu fuVar = this.f27212a;
                fuVar.setOnShowListener(fuVar.N);
                yj0 yj0VarO = sf0.o(f10, false);
                TextureView textureView = this.f27212a.f28451c.getTextureView();
                ImageView textureImageView = this.f27212a.f28451c.getTextureImageView();
                float f11 = yj0VarO.f34913c / textureView.getLayoutParams().width;
                textureImageView.setScaleX(f11);
                textureImageView.setScaleY(f11);
                textureImageView.setTranslationX(yj0VarO.f34911a);
                textureImageView.setTranslationY(yj0VarO.f34912b);
                textureView.setScaleX(f11);
                textureView.setScaleY(f11);
                textureView.setTranslationX(yj0VarO.f34911a);
                textureView.setTranslationY(yj0VarO.f34912b);
            } else {
                sf0.j(false);
            }
            this.f27212a.setShowWithoutAnimation(true);
            this.f27212a.show();
            if (z11) {
                fu fuVar2 = this.f27212a;
                fuVar2.L = 4;
                ((org.telegram.ui.ActionBar.e3) fuVar2).backDrawable.setAlpha(1);
                ((org.telegram.ui.ActionBar.e3) this.f27212a).containerView.setTranslationY(AndroidUtilities.dp(10.0f) + ((org.telegram.ui.ActionBar.e3) this.f27212a).containerView.getMeasuredHeight());
                return;
            }
            return;
        }
        fu fuVar3 = this.f27212a;
        if (fuVar3.f28455r != null) {
            try {
                ((org.telegram.ui.ActionBar.e3) fuVar3).containerView.setSystemUiVisibility(0);
                fu fuVar4 = this.f27212a;
                int i10 = fuVar4.H;
                if (i10 != -2) {
                    fuVar4.f28455r.setRequestedOrientation(i10);
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        if (this.f27212a.f28452e.getVisibility() == 0) {
            ((org.telegram.ui.ActionBar.e3) this.f27212a).containerView.setTranslationY(AndroidUtilities.dp(10.0f) + ((org.telegram.ui.ActionBar.e3) this.f27212a).containerView.getMeasuredHeight());
            ((org.telegram.ui.ActionBar.e3) this.f27212a).backDrawable.setAlpha(0);
        }
        this.f27212a.setOnShowListener(null);
        if (!z11) {
            if (this.f27212a.f28452e.getVisibility() == 0) {
                this.f27212a.f28452e.setAlpha(1.0f);
                this.f27212a.f28452e.setVisibility(4);
            }
            a81Var.run();
            this.f27212a.dismissInternal();
            return;
        }
        TextureView textureView2 = this.f27212a.f28451c.getTextureView();
        View controlsView = this.f27212a.f28451c.getControlsView();
        ImageView textureImageView2 = this.f27212a.f28451c.getTextureImageView();
        yj0 yj0VarO2 = sf0.o(f10, true);
        float width = yj0VarO2.f34913c / textureView2.getWidth();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property, width);
        Property property2 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property2, width);
        Property property3 = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property3, yj0VarO2.f34911a);
        Property property4 = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textureImageView2, (Property<ImageView, Float>) property4, yj0VarO2.f34912b);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property, width);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property2, width);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property3, yj0VarO2.f34911a);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(textureView2, (Property<TextureView, Float>) property4, yj0VarO2.f34912b);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(((org.telegram.ui.ActionBar.e3) this.f27212a).containerView, (Property<ViewGroup, Float>) property4, AndroidUtilities.dp(10.0f) + ((org.telegram.ui.ActionBar.e3) this.f27212a).containerView.getMeasuredHeight());
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(((org.telegram.ui.ActionBar.e3) this.f27212a).backDrawable, m6.d, 0);
        FrameLayout frameLayout = this.f27212a.f28452e;
        Property property5 = View.ALPHA;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfInt, ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(controlsView, (Property<View, Float>) property5, 0.0f));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(250L);
        animatorSet.addListener(new ag.x1(23, this, a81Var));
        animatorSet.start();
    }

    @Override
    public final void c(float f10, int i10) {
    }
}
