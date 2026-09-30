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
public final class uu implements o91 {
    public final yu f28927a;

    public uu(yu yuVar) {
        this.f28927a = yuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        yu yuVar = this.f28927a;
        FrameLayout frameLayout = yuVar.e;
        Activity activity = yuVar.f30813r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(yuVar.f30810c.getAspectRatioView());
            yuVar.N = false;
            yuVar.M = z11;
            if (activity != null) {
                try {
                    yuVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.e3) yuVar).containerView;
                    viewGroup2.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e) {
                    FileLog.e(e);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        yuVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.e3) yuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(yuVar.L);
                return null;
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b() {
        yu yuVar = this.f28927a;
        if (yuVar.f30810c.f()) {
            yuVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        yu yuVar = this.f28927a;
        su suVar = yuVar.f30809b;
        suVar.setVisibility(0);
        yuVar.f30814s.setVisibility(0);
        yuVar.v.setVisibility(4);
        suVar.setKeepScreenOn(true);
        r91 r91Var = yuVar.f30810c;
        r91Var.setVisibility(4);
        r91Var.getControlsView().setVisibility(4);
        r91Var.getTextureView().setVisibility(4);
        if (r91Var.getTextureImageView() != null) {
            r91Var.getTextureImageView().setVisibility(4);
        }
        yuVar.f30810c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            suVar.loadUrl(yuVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(r91 r91Var, boolean z10) {
        Activity activity = this.f28927a.f30813r;
        if (z10) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final TextureView f(View view, boolean z10, int i10, int i11, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.d3 d3Var;
        yu yuVar = this.f28927a;
        r91 r91Var = yuVar.f30810c;
        int[] iArr = yuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(yuVar.f30813r);
            if (!rg0.x(false, yuVar.f30813r, null, textureView, i10, i11, false)) {
                return null;
            }
            rg0.f27987p0.U = yuVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.e3) yuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            yuVar.O = true;
            r91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - yuVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) yuVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = r91Var.getTextureView();
            ImageView textureImageView = r91Var.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView2, property, 1.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView2, property2, 1.0f);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView2, property3, iArr[0]);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView2, property4, iArr[1]);
            viewGroup3 = ((org.telegram.ui.ActionBar.e3) yuVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            d3Var = ((org.telegram.ui.ActionBar.e3) yuVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(d3Var, s6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new r8(this, 17));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f28927a.container;
    }

    @Override
    public final boolean h() {
        return this.f28927a.G();
    }

    @Override
    public final void i(boolean z10, j91 j91Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.d3 d3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.d3 d3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.d3 d3Var3;
        if (z10) {
            yu yuVar = this.f28927a;
            if (yuVar.f30813r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.e3) yuVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    yu yuVar2 = this.f28927a;
                    int i10 = yuVar2.L;
                    if (i10 != -2) {
                        yuVar2.f30813r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f28927a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.e3) this.f28927a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.e3) this.f28927a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                d3Var3 = ((org.telegram.ui.ActionBar.e3) this.f28927a).backDrawable;
                d3Var3.setAlpha(0);
            }
            this.f28927a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f28927a.f30810c.getTextureView();
                View controlsView = this.f28927a.f30810c.getControlsView();
                ImageView textureImageView = this.f28927a.f30810c.getTextureImageView();
                vk0 o9 = rg0.o(f7, true);
                float width = o9.f29134c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f29132a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f29133b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f29132a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f29133b);
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) this.f28927a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.e3) this.f28927a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                d3Var2 = ((org.telegram.ui.ActionBar.e3) this.f28927a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(d3Var2, s6.d, 0);
                FrameLayout frameLayout = this.f28927a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.z(23, this, j91Var));
                animatorSet.start();
                return;
            }
            if (this.f28927a.e.getVisibility() == 0) {
                this.f28927a.e.setAlpha(1.0f);
                this.f28927a.e.setVisibility(4);
            }
            j91Var.run();
            this.f28927a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f28927a.f30813r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            yu yuVar3 = this.f28927a;
            yuVar3.setOnShowListener(yuVar3.R);
            vk0 o10 = rg0.o(f7, false);
            TextureView textureView2 = this.f28927a.f30810c.getTextureView();
            ImageView textureImageView2 = this.f28927a.f30810c.getTextureImageView();
            float f10 = o10.f29134c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f29132a);
            textureImageView2.setTranslationY(o10.f29133b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f29132a);
            textureView2.setTranslationY(o10.f29133b);
        } else {
            rg0.j(false);
        }
        this.f28927a.setShowWithoutAnimation(true);
        this.f28927a.show();
        if (z11) {
            yu yuVar4 = this.f28927a;
            yuVar4.P = 4;
            d3Var = ((org.telegram.ui.ActionBar.e3) yuVar4).backDrawable;
            d3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.f28927a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) this.f28927a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
