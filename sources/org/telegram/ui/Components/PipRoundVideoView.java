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
    public ee0 f31426a;
    public int f31427b;
    public TextureView f31428c;
    public ImageView d;
    public fe0 f31429e;
    public Bitmap f31430f;
    public int h;
    public int f31431n;
    public AnimatorSet f31432r;
    public Runnable f31433s;
    public WindowManager.LayoutParams f31434w;
    public WindowManager f31435x;
    public SharedPreferences f31436y;

    public static int b(float f10, int i7, int i10, boolean z9) {
        int i11;
        int round;
        if (z9) {
            i11 = org.telegram.messenger.g0.f22563q.x;
        } else {
            i11 = org.telegram.messenger.g0.f22563q.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
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
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z9) {
        if (z9) {
            TextureView textureView = this.f31428c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f31428c.getWidth() > 0 && this.f31428c.getHeight() > 0) {
                    int width = this.f31428c.getWidth();
                    int height = this.f31428c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f31430f = org.telegram.messenger.as.c(width, height);
                }
                try {
                    this.f31428c.getBitmap(this.f31430f);
                } catch (Throwable unused) {
                    this.f31430f = null;
                }
                this.d.setImageBitmap(this.f31430f);
                try {
                    this.f31429e.removeView(this.f31428c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f31430f != null) {
            this.d.setImageDrawable(null);
            this.f31430f.recycle();
            this.f31430f = null;
        }
        try {
            this.f31435x.removeView(this.f31426a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        org.telegram.messenger.qs.f(this.f31427b).n(this, org.telegram.messenger.qs.f24992e2);
    }

    public final void c(boolean z9) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f31432r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31432r = animatorSet2;
        ee0 ee0Var = this.f31426a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ee0Var, property, f10);
        ee0 ee0Var2 = this.f31426a;
        Property property2 = View.SCALE_X;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ee0Var2, property2, f11);
        ee0 ee0Var3 = this.f31426a;
        Property property3 = View.SCALE_Y;
        if (!z9) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ee0Var3, property3, f12));
        this.f31432r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.f31432r.addListener(new t9(17, this, z9));
        this.f31432r.setInterpolator(this.D);
        this.f31432r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        F = this;
        this.f31433s = runnable;
        ee0 ee0Var = new ee0(this, launchActivity);
        this.f31426a = ee0Var;
        ee0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.g0.L(126.0f);
        this.f31431n = org.telegram.messenger.g0.L(126.0f);
        fe0 fe0Var = new fe0(0, launchActivity, this);
        this.f31429e = fe0Var;
        fe0Var.setOutlineProvider(new bg.q0(13));
        this.f31429e.setClipToOutline(true);
        this.f31429e.a(1.0f, 0);
        this.f31426a.addView(this.f31429e, c8.ha.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f31426a.setAlpha(1.0f);
        this.f31426a.setScaleX(0.8f);
        this.f31426a.setScaleY(0.8f);
        this.f31428c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.g0.N(2.0f) + org.telegram.messenger.g0.N(120.0f)) / org.telegram.messenger.g0.N(120.0f);
        this.f31428c.setScaleX(N);
        this.f31428c.setScaleY(N);
        this.f31429e.addView(this.f31428c, c8.ha.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.f31429e.addView(imageView, c8.ha.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f31435x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("pipconfig", 0);
        this.f31436y = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f31436y.getInt("sidey", 0);
        float f10 = this.f31436y.getFloat("px", 0.0f);
        float f11 = this.f31436y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f31434w = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.f31431n;
            layoutParams.x = b(f10, i7, i11, true);
            this.f31434w.y = b(f11, i10, this.f31431n, false);
            WindowManager.LayoutParams layoutParams2 = this.f31434w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.y3(this.f31435x, this.f31426a, layoutParams2);
            this.f31435x.addView(this.f31426a, this.f31434w);
            int i12 = org.telegram.messenger.p10.f24470s0;
            this.f31427b = i12;
            org.telegram.messenger.qs.f(i12).c(this, org.telegram.messenger.qs.f24992e2);
            c(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fe0 fe0Var;
        if (i7 == org.telegram.messenger.qs.f24992e2 && (fe0Var = this.f31429e) != null) {
            fe0Var.invalidate();
        }
    }

    public final void e(boolean z9) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f31432r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31432r = animatorSet2;
        ee0 ee0Var = this.f31426a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ee0Var, property, f10);
        ee0 ee0Var2 = this.f31426a;
        Property property2 = View.SCALE_X;
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ee0Var2, property2, f11);
        ee0 ee0Var3 = this.f31426a;
        Property property3 = View.SCALE_Y;
        if (!z9) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ee0Var3, property3, f12));
        this.f31432r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.f31432r.addListener(new ge0(this, 0));
        this.f31432r.setInterpolator(this.D);
        this.f31432r.start();
    }

    public int getX() {
        return this.f31434w.x;
    }

    public int getY() {
        return this.f31434w.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.f31434w;
        layoutParams.x = i7;
        try {
            this.f31435x.updateViewLayout(this.f31426a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.f31434w;
        layoutParams.y = i7;
        try {
            this.f31435x.updateViewLayout(this.f31426a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
