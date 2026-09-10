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
public final class vu implements l91 {
    public final zu f28598a;

    public vu(zu zuVar) {
        this.f28598a = zuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zu zuVar = this.f28598a;
        FrameLayout frameLayout = zuVar.e;
        Activity activity = zuVar.f29814r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(zuVar.f29811c.getAspectRatioView());
            zuVar.N = false;
            zuVar.M = z11;
            if (activity != null) {
                try {
                    zuVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.h3) zuVar).containerView;
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
        zuVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.h3) zuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(zuVar.L);
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
        zu zuVar = this.f28598a;
        if (zuVar.f29811c.f()) {
            zuVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        zu zuVar = this.f28598a;
        tu tuVar = zuVar.f29810b;
        tuVar.setVisibility(0);
        zuVar.f29815s.setVisibility(0);
        zuVar.v.setVisibility(4);
        tuVar.setKeepScreenOn(true);
        o91 o91Var = zuVar.f29811c;
        o91Var.setVisibility(4);
        o91Var.getControlsView().setVisibility(4);
        o91Var.getTextureView().setVisibility(4);
        if (o91Var.getTextureImageView() != null) {
            o91Var.getTextureImageView().setVisibility(4);
        }
        zuVar.f29811c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            tuVar.loadUrl(zuVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(o91 o91Var, boolean z10) {
        Activity activity = this.f28598a.f29814r;
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
        org.telegram.ui.ActionBar.g3 g3Var;
        zu zuVar = this.f28598a;
        o91 o91Var = zuVar.f29811c;
        int[] iArr = zuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(zuVar.f29814r);
            if (!og0.x(false, zuVar.f29814r, null, textureView, i10, i11, false)) {
                return null;
            }
            og0.f25781p0.U = zuVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) zuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            zuVar.O = true;
            o91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - zuVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) zuVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = o91Var.getTextureView();
            ImageView textureImageView = o91Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.h3) zuVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            g3Var = ((org.telegram.ui.ActionBar.h3) zuVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(g3Var, r6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new rm(this, 7));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f28598a.container;
    }

    @Override
    public final boolean h() {
        return this.f28598a.F();
    }

    @Override
    public final void i(boolean z10, g91 g91Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.g3 g3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.g3 g3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.g3 g3Var3;
        if (z10) {
            zu zuVar = this.f28598a;
            if (zuVar.f29814r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.h3) zuVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    zu zuVar2 = this.f28598a;
                    int i10 = zuVar2.L;
                    if (i10 != -2) {
                        zuVar2.f29814r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f28598a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.h3) this.f28598a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.h3) this.f28598a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                g3Var3 = ((org.telegram.ui.ActionBar.h3) this.f28598a).backDrawable;
                g3Var3.setAlpha(0);
            }
            this.f28598a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f28598a.f29811c.getTextureView();
                View controlsView = this.f28598a.f29811c.getControlsView();
                ImageView textureImageView = this.f28598a.f29811c.getTextureImageView();
                rk0 o9 = og0.o(f7, true);
                float width = o9.f26683c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f26681a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f26682b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f26681a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f26682b);
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) this.f28598a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.h3) this.f28598a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                g3Var2 = ((org.telegram.ui.ActionBar.h3) this.f28598a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(g3Var2, r6.d, 0);
                FrameLayout frameLayout = this.f28598a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new bi.u3(21, this, g91Var));
                animatorSet.start();
                return;
            }
            if (this.f28598a.e.getVisibility() == 0) {
                this.f28598a.e.setAlpha(1.0f);
                this.f28598a.e.setVisibility(4);
            }
            g91Var.run();
            this.f28598a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f28598a.f29814r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            zu zuVar3 = this.f28598a;
            zuVar3.setOnShowListener(zuVar3.R);
            rk0 o10 = og0.o(f7, false);
            TextureView textureView2 = this.f28598a.f29811c.getTextureView();
            ImageView textureImageView2 = this.f28598a.f29811c.getTextureImageView();
            float f10 = o10.f26683c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f26681a);
            textureImageView2.setTranslationY(o10.f26682b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f26681a);
            textureView2.setTranslationY(o10.f26682b);
        } else {
            og0.j(false);
        }
        this.f28598a.setShowWithoutAnimation(true);
        this.f28598a.show();
        if (z11) {
            zu zuVar4 = this.f28598a;
            zuVar4.P = 4;
            g3Var = ((org.telegram.ui.ActionBar.h3) zuVar4).backDrawable;
            g3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.f28598a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) this.f28598a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
