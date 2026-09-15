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
public final class ru implements z81 {
    public final vu f27693a;

    public ru(vu vuVar) {
        this.f27693a = vuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        vu vuVar = this.f27693a;
        FrameLayout frameLayout = vuVar.e;
        Activity activity = vuVar.f29434r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(vuVar.f29431c.getAspectRatioView());
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
        vu vuVar = this.f27693a;
        if (vuVar.f29431c.f()) {
            vuVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        vu vuVar = this.f27693a;
        pu puVar = vuVar.f29430b;
        puVar.setVisibility(0);
        vuVar.f29435s.setVisibility(0);
        vuVar.v.setVisibility(4);
        puVar.setKeepScreenOn(true);
        c91 c91Var = vuVar.f29431c;
        c91Var.setVisibility(4);
        c91Var.getControlsView().setVisibility(4);
        c91Var.getTextureView().setVisibility(4);
        if (c91Var.getTextureImageView() != null) {
            c91Var.getTextureImageView().setVisibility(4);
        }
        vuVar.f29431c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            puVar.loadUrl(vuVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(c91 c91Var, boolean z10) {
        Activity activity = this.f27693a.f29434r;
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
        vu vuVar = this.f27693a;
        c91 c91Var = vuVar.f29431c;
        int[] iArr = vuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(vuVar.f29434r);
            if (!eg0.x(false, vuVar.f29434r, null, textureView, i10, i11, false)) {
                return null;
            }
            eg0.f23638p0.U = vuVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) vuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            vuVar.O = true;
            c91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - vuVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) vuVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = c91Var.getTextureView();
            ImageView textureImageView = c91Var.getTextureImageView();
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
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, q6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new p8(this, 17));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f27693a.container;
    }

    @Override
    public final boolean h() {
        return this.f27693a.G();
    }

    @Override
    public final void i(boolean z10, t81 t81Var, float f7, boolean z11) {
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
            vu vuVar = this.f27693a;
            if (vuVar.f29434r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) vuVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    vu vuVar2 = this.f27693a;
                    int i10 = vuVar2.L;
                    if (i10 != -2) {
                        vuVar2.f29434r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f27693a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f27693a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f27693a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f27693a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f27693a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f27693a.f29431c.getTextureView();
                View controlsView = this.f27693a.f29431c.getControlsView();
                ImageView textureImageView = this.f27693a.f29431c.getTextureImageView();
                hk0 o9 = eg0.o(f7, true);
                float width = o9.f24711c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f24709a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f24710b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f24709a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f24710b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f27693a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f27693a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f27693a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, q6.d, 0);
                FrameLayout frameLayout = this.f27693a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.z(23, this, t81Var));
                animatorSet.start();
                return;
            }
            if (this.f27693a.e.getVisibility() == 0) {
                this.f27693a.e.setAlpha(1.0f);
                this.f27693a.e.setVisibility(4);
            }
            t81Var.run();
            this.f27693a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f27693a.f29434r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            vu vuVar3 = this.f27693a;
            vuVar3.setOnShowListener(vuVar3.R);
            hk0 o10 = eg0.o(f7, false);
            TextureView textureView2 = this.f27693a.f29431c.getTextureView();
            ImageView textureImageView2 = this.f27693a.f29431c.getTextureImageView();
            float f10 = o10.f24711c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f24709a);
            textureImageView2.setTranslationY(o10.f24710b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f24709a);
            textureView2.setTranslationY(o10.f24710b);
        } else {
            eg0.j(false);
        }
        this.f27693a.setShowWithoutAnimation(true);
        this.f27693a.show();
        if (z11) {
            vu vuVar4 = this.f27693a;
            vuVar4.P = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) vuVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27693a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f27693a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
