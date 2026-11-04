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
public class PipRoundVideoView implements org.telegram.messenger.cs {
    public static PipRoundVideoView G;
    public DecelerateInterpolator E;
    public final RectF F = new RectF();
    public yd0 f31497a;
    public int f31498b;
    public TextureView f31499c;
    public ImageView d;
    public zd0 f31500e;
    public Bitmap f31501f;
    public int h;
    public int f31502n;
    public AnimatorSet f31503r;
    public Runnable f31504s;
    public WindowManager.LayoutParams f31505w;
    public WindowManager f31506x;
    public SharedPreferences f31507y;

    public static int b(float f10, int i3, int i10, boolean z10) {
        int i11;
        int round;
        if (z10) {
            i11 = org.telegram.messenger.g0.f22608q.x;
        } else {
            i11 = org.telegram.messenger.g0.f22608q.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int i12 = i11 - i10;
        if (i3 == 0) {
            round = org.telegram.messenger.g0.L(10.0f);
        } else if (i3 == 1) {
            round = i12 - org.telegram.messenger.g0.L(10.0f);
        } else {
            round = Math.round((i12 - org.telegram.messenger.g0.L(20.0f)) * f10) + org.telegram.messenger.g0.L(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z10) {
        if (z10) {
            TextureView textureView = this.f31499c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f31499c.getWidth() > 0 && this.f31499c.getHeight() > 0) {
                    int width = this.f31499c.getWidth();
                    int height = this.f31499c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f31501f = org.telegram.messenger.sr.c(width, height);
                }
                try {
                    this.f31499c.getBitmap(this.f31501f);
                } catch (Throwable unused) {
                    this.f31501f = null;
                }
                this.d.setImageBitmap(this.f31501f);
                try {
                    this.f31500e.removeView(this.f31499c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f31501f != null) {
            this.d.setImageDrawable(null);
            this.f31501f.recycle();
            this.f31501f = null;
        }
        try {
            this.f31506x.removeView(this.f31497a);
        } catch (Exception unused3) {
        }
        if (G == this) {
            G = null;
        }
        org.telegram.messenger.hs.f(this.f31498b).n(this, org.telegram.messenger.hs.f23221e2);
    }

    public final void c(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f31503r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31503r = animatorSet2;
        yd0 yd0Var = this.f31497a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yd0Var, property, f10);
        yd0 yd0Var2 = this.f31497a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yd0Var2, property2, f11);
        yd0 yd0Var3 = this.f31497a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(yd0Var3, property3, f12));
        this.f31503r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f31503r.addListener(new s9(17, this, z10));
        this.f31503r.setInterpolator(this.E);
        this.f31503r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        G = this;
        this.f31504s = runnable;
        yd0 yd0Var = new yd0(this, launchActivity);
        this.f31497a = yd0Var;
        yd0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.g0.L(126.0f);
        this.f31502n = org.telegram.messenger.g0.L(126.0f);
        zd0 zd0Var = new zd0(0, launchActivity, this);
        this.f31500e = zd0Var;
        zd0Var.setOutlineProvider(new cg.p0(16));
        this.f31500e.setClipToOutline(true);
        this.f31500e.a(1.0f, 0);
        this.f31497a.addView(this.f31500e, b8.mf.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f31497a.setAlpha(1.0f);
        this.f31497a.setScaleX(0.8f);
        this.f31497a.setScaleY(0.8f);
        this.f31499c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.g0.N(2.0f) + org.telegram.messenger.g0.N(120.0f)) / org.telegram.messenger.g0.N(120.0f);
        this.f31499c.setScaleX(N);
        this.f31499c.setScaleY(N);
        this.f31500e.addView(this.f31499c, b8.mf.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.f31500e.addView(imageView, b8.mf.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f31506x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("pipconfig", 0);
        this.f31507y = sharedPreferences;
        int i3 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f31507y.getInt("sidey", 0);
        float f10 = this.f31507y.getFloat("px", 0.0f);
        float f11 = this.f31507y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f31505w = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.f31502n;
            layoutParams.x = b(f10, i3, i11, true);
            this.f31505w.y = b(f11, i10, this.f31502n, false);
            WindowManager.LayoutParams layoutParams2 = this.f31505w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.y3(this.f31506x, this.f31497a, layoutParams2);
            this.f31506x.addView(this.f31497a, this.f31505w);
            int i12 = org.telegram.messenger.h10.f22829t0;
            this.f31498b = i12;
            org.telegram.messenger.hs.f(i12).c(this, org.telegram.messenger.hs.f23221e2);
            c(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        zd0 zd0Var;
        if (i3 == org.telegram.messenger.hs.f23221e2 && (zd0Var = this.f31500e) != null) {
            zd0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f31503r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f31503r = animatorSet2;
        yd0 yd0Var = this.f31497a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yd0Var, property, f10);
        yd0 yd0Var2 = this.f31497a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yd0Var2, property2, f11);
        yd0 yd0Var3 = this.f31497a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(yd0Var3, property3, f12));
        this.f31503r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f31503r.addListener(new ae0(this, 0));
        this.f31503r.setInterpolator(this.E);
        this.f31503r.start();
    }

    public int getX() {
        return this.f31505w.x;
    }

    public int getY() {
        return this.f31505w.y;
    }

    public void setX(int i3) {
        WindowManager.LayoutParams layoutParams = this.f31505w;
        layoutParams.x = i3;
        try {
            this.f31506x.updateViewLayout(this.f31497a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i3) {
        WindowManager.LayoutParams layoutParams = this.f31505w;
        layoutParams.y = i3;
        try {
            this.f31506x.updateViewLayout(this.f31497a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
