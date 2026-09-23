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
public final class su implements y81 {
    public final wu f27992a;

    public su(wu wuVar) {
        this.f27992a = wuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        wu wuVar = this.f27992a;
        FrameLayout frameLayout = wuVar.e;
        Activity activity = wuVar.f29814r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(wuVar.f29811c.getAspectRatioView());
            wuVar.N = false;
            wuVar.M = z11;
            if (activity != null) {
                try {
                    wuVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.f3) wuVar).containerView;
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
        wuVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.f3) wuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(wuVar.L);
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
        wu wuVar = this.f27992a;
        if (wuVar.f29811c.f()) {
            wuVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        wu wuVar = this.f27992a;
        qu quVar = wuVar.f29810b;
        quVar.setVisibility(0);
        wuVar.f29815s.setVisibility(0);
        wuVar.v.setVisibility(4);
        quVar.setKeepScreenOn(true);
        b91 b91Var = wuVar.f29811c;
        b91Var.setVisibility(4);
        b91Var.getControlsView().setVisibility(4);
        b91Var.getTextureView().setVisibility(4);
        if (b91Var.getTextureImageView() != null) {
            b91Var.getTextureImageView().setVisibility(4);
        }
        wuVar.f29811c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            quVar.loadUrl(wuVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(b91 b91Var, boolean z10) {
        Activity activity = this.f27992a.f29814r;
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
        wu wuVar = this.f27992a;
        b91 b91Var = wuVar.f29811c;
        int[] iArr = wuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(wuVar.f29814r);
            if (!eg0.x(false, wuVar.f29814r, null, textureView, i10, i11, false)) {
                return null;
            }
            eg0.f23661p0.U = wuVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.f3) wuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            wuVar.O = true;
            b91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - wuVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) wuVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = b91Var.getTextureView();
            ImageView textureImageView = b91Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.f3) wuVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            e3Var = ((org.telegram.ui.ActionBar.f3) wuVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(e3Var, s6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new r8(this, 17));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f27992a.container;
    }

    @Override
    public final boolean h() {
        return this.f27992a.G();
    }

    @Override
    public final void i(boolean z10, s81 s81Var, float f7, boolean z11) {
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
            wu wuVar = this.f27992a;
            if (wuVar.f29814r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.f3) wuVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    wu wuVar2 = this.f27992a;
                    int i10 = wuVar2.L;
                    if (i10 != -2) {
                        wuVar2.f29814r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f27992a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.f3) this.f27992a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.f3) this.f27992a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                e3Var3 = ((org.telegram.ui.ActionBar.f3) this.f27992a).backDrawable;
                e3Var3.setAlpha(0);
            }
            this.f27992a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f27992a.f29811c.getTextureView();
                View controlsView = this.f27992a.f29811c.getControlsView();
                ImageView textureImageView = this.f27992a.f29811c.getTextureImageView();
                ik0 o9 = eg0.o(f7, true);
                float width = o9.f24990c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f24988a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f24989b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f24988a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f24989b);
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) this.f27992a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) this.f27992a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                e3Var2 = ((org.telegram.ui.ActionBar.f3) this.f27992a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var2, s6.d, 0);
                FrameLayout frameLayout = this.f27992a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.z(23, this, s81Var));
                animatorSet.start();
                return;
            }
            if (this.f27992a.e.getVisibility() == 0) {
                this.f27992a.e.setAlpha(1.0f);
                this.f27992a.e.setVisibility(4);
            }
            s81Var.run();
            this.f27992a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f27992a.f29814r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            wu wuVar3 = this.f27992a;
            wuVar3.setOnShowListener(wuVar3.R);
            ik0 o10 = eg0.o(f7, false);
            TextureView textureView2 = this.f27992a.f29811c.getTextureView();
            ImageView textureImageView2 = this.f27992a.f29811c.getTextureImageView();
            float f10 = o10.f24990c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f24988a);
            textureImageView2.setTranslationY(o10.f24989b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f24988a);
            textureView2.setTranslationY(o10.f24989b);
        } else {
            eg0.j(false);
        }
        this.f27992a.setShowWithoutAnimation(true);
        this.f27992a.show();
        if (z11) {
            wu wuVar4 = this.f27992a;
            wuVar4.P = 4;
            e3Var = ((org.telegram.ui.ActionBar.f3) wuVar4).backDrawable;
            e3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27992a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) this.f27992a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
