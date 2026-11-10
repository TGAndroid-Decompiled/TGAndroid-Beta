package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import org.telegram.ui.LaunchActivity;
public class PipRoundVideoView implements org.telegram.messenger.ls {
    public static PipRoundVideoView F;
    public DecelerateInterpolator D;
    public final RectF E = new RectF();
    public ee0 f31442a;
    public int f31443b;
    public TextureView f31444c;
    public ImageView d;
    public fe0 f31445e;
    public Bitmap f31446f;
    public int h;
    public int f31447n;
    public AnimatorSet f31448r;
    public Runnable f31449s;
    public WindowManager.LayoutParams f31450w;
    public WindowManager f31451x;
    public SharedPreferences f31452y;

    public static int b(float f10, int i7, int i10, boolean z9) {
        int i11;
        int round;
        if (z9) {
            i11 = org.telegram.messenger.g0.f22567q.x;
        } else {
            i11 = org.telegram.messenger.g0.f22567q.y - i10;
            i10 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        int i12 = i11 - i10;
        if (i7 == 0) {
            round = org.telegram.messenger.g0.L(10.0f);
        } else if (i7 == 1) {
            round = i12 - org.telegram.messenger.g0.L(10.0f);
        } else {
            round = Math.round((i12 - org.telegram.messenger.g0.L(20.0f)) * f10) + org.telegram.messenger.g0.L(10.0f);
        }
        if (!z9) {
            return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z9) {
        if (z9) {
            TextureView textureView = this.f31444c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f31444c.getWidth() > 0 && this.f31444c.getHeight() > 0) {
                    int width = this.f31444c.getWidth();
                    int height = this.f31444c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f31446f = org.telegram.messenger.as.c(width, height);
                }
                try {
                    this.f31444c.getBitmap(this.f31446f);
                } catch (Throwable unused) {
                    this.f31446f = null;
                }
                this.d.setImageBitmap(this.f31446f);
                try {
                    this.f31445e.removeView(this.f31444c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f31446f != null) {
            this.d.setImageDrawable(null);
            this.f31446f.recycle();
            this.f31446f = null;
        }
        try {
            this.f31451x.removeView(this.f31442a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        org.telegram.messenger.qs.f(this.f31443b).n(this, org.telegram.messenger.qs.f24996e2);
    }

    public final void c(boolean z9) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f31448r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31448r = animatorSet2;
        ee0 ee0Var = this.f31442a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ee0Var, property, f10);
        ee0 ee0Var2 = this.f31442a;
        Property property2 = View.SCALE_X;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ee0Var2, property2, f11);
        ee0 ee0Var3 = this.f31442a;
        Property property3 = View.SCALE_Y;
        if (!z9) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ee0Var3, property3, f12));
        this.f31448r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.f31448r.addListener(new s9(17, this, z9));
        this.f31448r.setInterpolator(this.D);
        this.f31448r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        F = this;
        this.f31449s = runnable;
        ee0 ee0Var = new ee0(this, launchActivity);
        this.f31442a = ee0Var;
        ee0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.g0.L(126.0f);
        this.f31447n = org.telegram.messenger.g0.L(126.0f);
        fe0 fe0Var = new fe0(0, launchActivity, this);
        this.f31445e = fe0Var;
        fe0Var.setOutlineProvider(new bg.q0(13));
        this.f31445e.setClipToOutline(true);
        this.f31445e.a(1.0f, 0);
        this.f31442a.addView(this.f31445e, c8.ha.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f31442a.setAlpha(1.0f);
        this.f31442a.setScaleX(0.8f);
        this.f31442a.setScaleY(0.8f);
        this.f31444c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.g0.N(2.0f) + org.telegram.messenger.g0.N(120.0f)) / org.telegram.messenger.g0.N(120.0f);
        this.f31444c.setScaleX(N);
        this.f31444c.setScaleY(N);
        this.f31445e.addView(this.f31444c, c8.ha.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.f31445e.addView(imageView, c8.ha.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f31451x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25570b.getSharedPreferences("pipconfig", 0);
        this.f31452y = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f31452y.getInt("sidey", 0);
        float f10 = this.f31452y.getFloat("px", 0.0f);
        float f11 = this.f31452y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f31450w = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.f31447n;
            layoutParams.x = b(f10, i7, i11, true);
            this.f31450w.y = b(f11, i10, this.f31447n, false);
            WindowManager.LayoutParams layoutParams2 = this.f31450w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.y3(this.f31451x, this.f31442a, layoutParams2);
            this.f31451x.addView(this.f31442a, this.f31450w);
            int i12 = org.telegram.messenger.p10.f24474s0;
            this.f31443b = i12;
            org.telegram.messenger.qs.f(i12).c(this, org.telegram.messenger.qs.f24996e2);
            c(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fe0 fe0Var;
        if (i7 == org.telegram.messenger.qs.f24996e2 && (fe0Var = this.f31445e) != null) {
            fe0Var.invalidate();
        }
    }

    public final void e(boolean z9) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f31448r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31448r = animatorSet2;
        ee0 ee0Var = this.f31442a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ee0Var, property, f10);
        ee0 ee0Var2 = this.f31442a;
        Property property2 = View.SCALE_X;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ee0Var2, property2, f11);
        ee0 ee0Var3 = this.f31442a;
        Property property3 = View.SCALE_Y;
        if (!z9) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ee0Var3, property3, f12));
        this.f31448r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.f31448r.addListener(new ge0(this, 0));
        this.f31448r.setInterpolator(this.D);
        this.f31448r.start();
    }

    public int getX() {
        return this.f31450w.x;
    }

    public int getY() {
        return this.f31450w.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.f31450w;
        layoutParams.x = i7;
        try {
            this.f31451x.updateViewLayout(this.f31442a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.f31450w;
        layoutParams.y = i7;
        try {
            this.f31451x.updateViewLayout(this.f31442a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
