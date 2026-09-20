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
public final class ru implements m91 {
    public final vu f27957a;

    public ru(vu vuVar) {
        this.f27957a = vuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        vu vuVar = this.f27957a;
        FrameLayout frameLayout = vuVar.e;
        Activity activity = vuVar.f29833r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(vuVar.f29830c.getAspectRatioView());
            vuVar.N = false;
            vuVar.M = z11;
            if (activity != null) {
                try {
                    vuVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) vuVar).containerView;
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
        vuVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) vuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(vuVar.L);
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
        vu vuVar = this.f27957a;
        if (vuVar.f29830c.f()) {
            vuVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        vu vuVar = this.f27957a;
        pu puVar = vuVar.f29829b;
        puVar.setVisibility(0);
        vuVar.f29834s.setVisibility(0);
        vuVar.v.setVisibility(4);
        puVar.setKeepScreenOn(true);
        p91 p91Var = vuVar.f29830c;
        p91Var.setVisibility(4);
        p91Var.getControlsView().setVisibility(4);
        p91Var.getTextureView().setVisibility(4);
        if (p91Var.getTextureImageView() != null) {
            p91Var.getTextureImageView().setVisibility(4);
        }
        vuVar.f29830c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            puVar.loadUrl(vuVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(p91 p91Var, boolean z10) {
        Activity activity = this.f27957a.f29833r;
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
        org.telegram.ui.ActionBar.e3 e3Var;
        vu vuVar = this.f27957a;
        p91 p91Var = vuVar.f29830c;
        int[] iArr = vuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(vuVar.f29833r);
            if (!og0.x(false, vuVar.f29833r, null, textureView, i10, i11, false)) {
                return null;
            }
            og0.f26912p0.U = vuVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) vuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            vuVar.O = true;
            p91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - vuVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) vuVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = p91Var.getTextureView();
            ImageView textureImageView = p91Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.f3) vuVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            e3Var = ((org.telegram.ui.ActionBar.f3) vuVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, r6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new q8(this, 17));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f27957a.container;
    }

    @Override
    public final boolean h() {
        return this.f27957a.G();
    }

    @Override
    public final void i(boolean z10, h91 h91Var, float f7, boolean z11) {
        org.telegram.ui.ActionBar.e3 e3Var;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        org.telegram.ui.ActionBar.e3 e3Var2;
        ViewGroup viewGroup6;
        ViewGroup viewGroup7;
        org.telegram.ui.ActionBar.e3 e3Var3;
        if (z10) {
            vu vuVar = this.f27957a;
            if (vuVar.f29833r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) vuVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    vu vuVar2 = this.f27957a;
                    int i10 = vuVar2.L;
                    if (i10 != -2) {
                        vuVar2.f29833r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f27957a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f27957a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f27957a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f27957a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f27957a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f27957a.f29830c.getTextureView();
                View controlsView = this.f27957a.f29830c.getControlsView();
                ImageView textureImageView = this.f27957a.f29830c.getTextureImageView();
                rk0 o9 = og0.o(f7, true);
                float width = o9.f27915c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f27913a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f27914b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f27913a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f27914b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f27957a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f27957a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f27957a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, r6.d, 0);
                FrameLayout frameLayout = this.f27957a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.z(23, this, h91Var));
                animatorSet.start();
                return;
            }
            if (this.f27957a.e.getVisibility() == 0) {
                this.f27957a.e.setAlpha(1.0f);
                this.f27957a.e.setVisibility(4);
            }
            h91Var.run();
            this.f27957a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f27957a.f29833r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            vu vuVar3 = this.f27957a;
            vuVar3.setOnShowListener(vuVar3.R);
            rk0 o10 = og0.o(f7, false);
            TextureView textureView2 = this.f27957a.f29830c.getTextureView();
            ImageView textureImageView2 = this.f27957a.f29830c.getTextureImageView();
            float f10 = o10.f27915c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f27913a);
            textureImageView2.setTranslationY(o10.f27914b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f27913a);
            textureView2.setTranslationY(o10.f27914b);
        } else {
            og0.j(false);
        }
        this.f27957a.setShowWithoutAnimation(true);
        this.f27957a.show();
        if (z11) {
            vu vuVar4 = this.f27957a;
            vuVar4.P = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) vuVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27957a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f27957a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
