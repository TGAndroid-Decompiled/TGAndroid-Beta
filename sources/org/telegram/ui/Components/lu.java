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
public final class lu implements b91 {
    public final pu f26886a;

    public lu(pu puVar) {
        this.f26886a = puVar;
    }

    @Override
    public final TextureView a(View view, boolean z4, float f10, int i10, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        pu puVar = this.f26886a;
        FrameLayout frameLayout = puVar.e;
        Activity activity = puVar.f27988r;
        if (z4) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(puVar.f27985c.getAspectRatioView());
            puVar.K = false;
            puVar.J = z10;
            if (activity != null) {
                try {
                    puVar.I = activity.getRequestedOrientation();
                    if (z10) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.g3) puVar).containerView;
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
        puVar.J = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.g3) puVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(puVar.I);
                return null;
            } catch (Exception e6) {
                FileLog.e(e6);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void b() {
        pu puVar = this.f26886a;
        if (puVar.f27985c.f()) {
            puVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        pu puVar = this.f26886a;
        ju juVar = puVar.f27984b;
        juVar.setVisibility(0);
        puVar.f27989s.setVisibility(0);
        puVar.v.setVisibility(4);
        juVar.setKeepScreenOn(true);
        e91 e91Var = puVar.f27985c;
        e91Var.setVisibility(4);
        e91Var.getControlsView().setVisibility(4);
        e91Var.getTextureView().setVisibility(4);
        if (e91Var.getTextureImageView() != null) {
            e91Var.getTextureImageView().setVisibility(4);
        }
        puVar.f27985c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            juVar.loadUrl(puVar.H, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(e91 e91Var, boolean z4) {
        Activity activity = this.f26886a.f27988r;
        if (z4) {
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final TextureView f(View view, boolean z4, int i10, int i11, boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        org.telegram.ui.ActionBar.f3 f3Var;
        pu puVar = this.f26886a;
        e91 e91Var = puVar.f27985c;
        int[] iArr = puVar.B;
        if (z4) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(puVar.f27988r);
            if (!lg0.x(false, puVar.f27988r, null, textureView, i10, i11, false)) {
                return null;
            }
            lg0.m0.R = puVar;
            return textureView;
        } else if (!z10) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) puVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            puVar.L = true;
            e91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - puVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) puVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = e91Var.getTextureView();
            ImageView textureImageView = e91Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.g3) puVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            f3Var = ((org.telegram.ui.ActionBar.g3) puVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(f3Var, n6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new a9(this, 16));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f26886a.container;
    }

    @Override
    public final boolean h() {
        return this.f26886a.F();
    }

    @Override
    public final void i(boolean z4, w81 w81Var, float f10, boolean z10) {
        org.telegram.ui.ActionBar.f3 f3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.f3 f3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.f3 f3Var3;
        if (z4) {
            pu puVar = this.f26886a;
            if (puVar.f27988r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.g3) puVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    pu puVar2 = this.f26886a;
                    int i10 = puVar2.I;
                    if (i10 != -2) {
                        puVar2.f27988r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f26886a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.g3) this.f26886a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.g3) this.f26886a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                f3Var3 = ((org.telegram.ui.ActionBar.g3) this.f26886a).backDrawable;
                f3Var3.setAlpha(0);
            }
            this.f26886a.setOnShowListener(null);
            if (z10) {
                TextureView textureView = this.f26886a.f27985c.getTextureView();
                View controlsView = this.f26886a.f27985c.getControlsView();
                ImageView textureImageView = this.f26886a.f27985c.getTextureImageView();
                sk0 o10 = lg0.o(f10, true);
                float width = o10.f28724c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o10.f28722a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o10.f28723b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o10.f28722a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o10.f28723b);
                viewGroup4 = ((org.telegram.ui.ActionBar.g3) this.f26886a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.g3) this.f26886a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                f3Var2 = ((org.telegram.ui.ActionBar.g3) this.f26886a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(f3Var2, n6.d, 0);
                FrameLayout frameLayout = this.f26886a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new dg.y2(20, this, w81Var));
                animatorSet.start();
                return;
            }
            if (this.f26886a.e.getVisibility() == 0) {
                this.f26886a.e.setAlpha(1.0f);
                this.f26886a.e.setVisibility(4);
            }
            w81Var.run();
            this.f26886a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f26886a.f27988r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z10) {
            pu puVar3 = this.f26886a;
            puVar3.setOnShowListener(puVar3.O);
            sk0 o11 = lg0.o(f10, false);
            TextureView textureView2 = this.f26886a.f27985c.getTextureView();
            ImageView textureImageView2 = this.f26886a.f27985c.getTextureImageView();
            float f11 = o11.f28724c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f11);
            textureImageView2.setScaleY(f11);
            textureImageView2.setTranslationX(o11.f28722a);
            textureImageView2.setTranslationY(o11.f28723b);
            textureView2.setScaleX(f11);
            textureView2.setScaleY(f11);
            textureView2.setTranslationX(o11.f28722a);
            textureView2.setTranslationY(o11.f28723b);
        } else {
            lg0.j(false);
        }
        this.f26886a.setShowWithoutAnimation(true);
        this.f26886a.show();
        if (z10) {
            pu puVar4 = this.f26886a;
            puVar4.M = 4;
            f3Var = ((org.telegram.ui.ActionBar.g3) puVar4).backDrawable;
            f3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f26886a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) this.f26886a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f10, int i10) {
    }
}
