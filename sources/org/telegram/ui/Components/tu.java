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
public final class tu implements n91 {
    public final xu f28690a;

    public tu(xu xuVar) {
        this.f28690a = xuVar;
    }

    @Override
    public final TextureView a(View view, boolean z10, float f7, int i10, boolean z11) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        xu xuVar = this.f28690a;
        FrameLayout frameLayout = xuVar.e;
        Activity activity = xuVar.f30487r;
        if (z10) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(xuVar.f30484c.getAspectRatioView());
            xuVar.N = false;
            xuVar.M = z11;
            if (activity != null) {
                try {
                    xuVar.L = activity.getRequestedOrientation();
                    if (z11) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    viewGroup2 = ((org.telegram.ui.ActionBar.g3) xuVar).containerView;
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
        xuVar.M = false;
        if (activity != null) {
            try {
                viewGroup = ((org.telegram.ui.ActionBar.g3) xuVar).containerView;
                viewGroup.setSystemUiVisibility(0);
                activity.setRequestedOrientation(xuVar.L);
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
        xu xuVar = this.f28690a;
        if (xuVar.f30484c.f()) {
            xuVar.dismissInternal();
        }
    }

    @Override
    public final void d() {
        xu xuVar = this.f28690a;
        ru ruVar = xuVar.f30483b;
        ruVar.setVisibility(0);
        xuVar.f30488s.setVisibility(0);
        xuVar.v.setVisibility(4);
        ruVar.setKeepScreenOn(true);
        q91 q91Var = xuVar.f30484c;
        q91Var.setVisibility(4);
        q91Var.getControlsView().setVisibility(4);
        q91Var.getTextureView().setVisibility(4);
        if (q91Var.getTextureImageView() != null) {
            q91Var.getTextureImageView().setVisibility(4);
        }
        xuVar.f30484c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            ruVar.loadUrl(xuVar.K, hashMap);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void e(q91 q91Var, boolean z10) {
        Activity activity = this.f28690a.f30487r;
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
        org.telegram.ui.ActionBar.f3 f3Var;
        xu xuVar = this.f28690a;
        q91 q91Var = xuVar.f30484c;
        int[] iArr = xuVar.E;
        if (z10) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(xuVar.f30487r);
            if (!rg0.x(false, xuVar.f30487r, null, textureView, i10, i11, false)) {
                return null;
            }
            rg0.f27977p0.U = xuVar;
            return textureView;
        } else if (!z11) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) xuVar).containerView;
            viewGroup.setTranslationY(0.0f);
            return null;
        } else {
            xuVar.O = true;
            q91Var.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - xuVar.getLeftInset();
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) xuVar).containerView;
            iArr[1] = (int) (iArr[1] - viewGroup2.getTranslationY());
            TextureView textureView2 = q91Var.getTextureView();
            ImageView textureImageView = q91Var.getTextureImageView();
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
            viewGroup3 = ((org.telegram.ui.ActionBar.g3) xuVar).containerView;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup3, property4, 0.0f);
            f3Var = ((org.telegram.ui.ActionBar.g3) xuVar).backDrawable;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofInt(f3Var, s6.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new r8(this, 17));
            animatorSet.start();
            return null;
        }
    }

    @Override
    public final ViewGroup g() {
        return this.f28690a.container;
    }

    @Override
    public final boolean h() {
        return this.f28690a.G();
    }

    @Override
    public final void i(boolean z10, i91 i91Var, float f7, boolean z11) {
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
        if (z10) {
            xu xuVar = this.f28690a;
            if (xuVar.f30487r != null) {
                try {
                    viewGroup3 = ((org.telegram.ui.ActionBar.g3) xuVar).containerView;
                    viewGroup3.setSystemUiVisibility(0);
                    xu xuVar2 = this.f28690a;
                    int i10 = xuVar2.L;
                    if (i10 != -2) {
                        xuVar2.f30487r.setRequestedOrientation(i10);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.f28690a.e.getVisibility() == 0) {
                viewGroup6 = ((org.telegram.ui.ActionBar.g3) this.f28690a).containerView;
                viewGroup7 = ((org.telegram.ui.ActionBar.g3) this.f28690a).containerView;
                viewGroup6.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup7.getMeasuredHeight());
                f3Var3 = ((org.telegram.ui.ActionBar.g3) this.f28690a).backDrawable;
                f3Var3.setAlpha(0);
            }
            this.f28690a.setOnShowListener(null);
            if (z11) {
                TextureView textureView = this.f28690a.f30484c.getTextureView();
                View controlsView = this.f28690a.f30484c.getControlsView();
                ImageView textureImageView = this.f28690a.f30484c.getTextureImageView();
                uk0 o9 = rg0.o(f7, true);
                float width = o9.f28896c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, o9.f28894a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, o9.f28895b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, o9.f28894a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, o9.f28895b);
                viewGroup4 = ((org.telegram.ui.ActionBar.g3) this.f28690a).containerView;
                viewGroup5 = ((org.telegram.ui.ActionBar.g3) this.f28690a).containerView;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup4, property4, AndroidUtilities.dp(10.0f) + viewGroup5.getMeasuredHeight());
                f3Var2 = ((org.telegram.ui.ActionBar.g3) this.f28690a).backDrawable;
                ObjectAnimator ofInt = ObjectAnimator.ofInt(f3Var2, s6.d, 0);
                FrameLayout frameLayout = this.f28690a.e;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new ai.z(23, this, i91Var));
                animatorSet.start();
                return;
            }
            if (this.f28690a.e.getVisibility() == 0) {
                this.f28690a.e.setAlpha(1.0f);
                this.f28690a.e.setVisibility(4);
            }
            i91Var.run();
            this.f28690a.dismissInternal();
            return;
        }
        if (ApplicationLoader.mainInterfacePaused) {
            try {
                this.f28690a.f30487r.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        if (z11) {
            xu xuVar3 = this.f28690a;
            xuVar3.setOnShowListener(xuVar3.R);
            uk0 o10 = rg0.o(f7, false);
            TextureView textureView2 = this.f28690a.f30484c.getTextureView();
            ImageView textureImageView2 = this.f28690a.f30484c.getTextureImageView();
            float f10 = o10.f28896c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f10);
            textureImageView2.setScaleY(f10);
            textureImageView2.setTranslationX(o10.f28894a);
            textureImageView2.setTranslationY(o10.f28895b);
            textureView2.setScaleX(f10);
            textureView2.setScaleY(f10);
            textureView2.setTranslationX(o10.f28894a);
            textureView2.setTranslationY(o10.f28895b);
        } else {
            rg0.j(false);
        }
        this.f28690a.setShowWithoutAnimation(true);
        this.f28690a.show();
        if (z11) {
            xu xuVar4 = this.f28690a;
            xuVar4.P = 4;
            f3Var = ((org.telegram.ui.ActionBar.g3) xuVar4).backDrawable;
            f3Var.setAlpha(1);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.f28690a).containerView;
            viewGroup2 = ((org.telegram.ui.ActionBar.g3) this.f28690a).containerView;
            viewGroup.setTranslationY(AndroidUtilities.dp(10.0f) + viewGroup2.getMeasuredHeight());
        }
    }

    @Override
    public final void c(float f7) {
    }
}
