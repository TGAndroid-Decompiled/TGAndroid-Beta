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
public class PipRoundVideoView implements org.telegram.messenger.fs {
    public static PipRoundVideoView G;
    public DecelerateInterpolator E;
    public final RectF F = new RectF();
    public re0 f33001a;
    public int f33002b;
    public TextureView f33003c;
    public ImageView d;
    public se0 f33004e;
    public Bitmap f33005f;
    public int h;
    public int f33006n;
    public AnimatorSet f33007r;
    public Runnable f33008s;
    public WindowManager.LayoutParams f33009w;
    public WindowManager f33010x;
    public SharedPreferences f33011y;

    public static int b(float f10, int i7, int i10, boolean z10) {
        int i11;
        int round;
        if (z10) {
            i11 = org.telegram.messenger.g0.f24121q.x;
        } else {
            i11 = org.telegram.messenger.g0.f24121q.y - i10;
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
        if (!z10) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z10) {
        if (z10) {
            TextureView textureView = this.f33003c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f33003c.getWidth() > 0 && this.f33003c.getHeight() > 0) {
                    int width = this.f33003c.getWidth();
                    int height = this.f33003c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f33005f = org.telegram.messenger.vr.c(width, height);
                }
                try {
                    this.f33003c.getBitmap(this.f33005f);
                } catch (Throwable unused) {
                    this.f33005f = null;
                }
                this.d.setImageBitmap(this.f33005f);
                try {
                    this.f33004e.removeView(this.f33003c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f33005f != null) {
            this.d.setImageDrawable(null);
            this.f33005f.recycle();
            this.f33005f = null;
        }
        try {
            this.f33010x.removeView(this.f33001a);
        } catch (Exception unused3) {
        }
        if (G == this) {
            G = null;
        }
        org.telegram.messenger.ks.f(this.f33002b).n(this, org.telegram.messenger.ks.f25108e2);
    }

    public final void c(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f33007r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33007r = animatorSet2;
        re0 re0Var = this.f33001a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(re0Var, property, f10);
        re0 re0Var2 = this.f33001a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(re0Var2, property2, f11);
        re0 re0Var3 = this.f33001a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(re0Var3, property3, f12));
        this.f33007r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f33007r.addListener(new org.telegram.ui.on(18, this, z10));
        this.f33007r.setInterpolator(this.E);
        this.f33007r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        G = this;
        this.f33008s = runnable;
        re0 re0Var = new re0(this, launchActivity);
        this.f33001a = re0Var;
        re0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.g0.L(126.0f);
        this.f33006n = org.telegram.messenger.g0.L(126.0f);
        se0 se0Var = new se0(0, launchActivity, this);
        this.f33004e = se0Var;
        se0Var.setOutlineProvider(new bg.q0(13));
        this.f33004e.setClipToOutline(true);
        this.f33004e.a(1.0f, 0);
        this.f33001a.addView(this.f33004e, c8.ma.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f33001a.setAlpha(1.0f);
        this.f33001a.setScaleX(0.8f);
        this.f33001a.setScaleY(0.8f);
        this.f33003c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.g0.N(2.0f) + org.telegram.messenger.g0.N(120.0f)) / org.telegram.messenger.g0.N(120.0f);
        this.f33003c.setScaleX(N);
        this.f33003c.setScaleY(N);
        this.f33004e.addView(this.f33003c, c8.ma.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.f33004e.addView(imageView, c8.ma.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f33010x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26915b.getSharedPreferences("pipconfig", 0);
        this.f33011y = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f33011y.getInt("sidey", 0);
        float f10 = this.f33011y.getFloat("px", 0.0f);
        float f11 = this.f33011y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f33009w = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.f33006n;
            layoutParams.x = b(f10, i7, i11, true);
            this.f33009w.y = b(f11, i10, this.f33006n, false);
            WindowManager.LayoutParams layoutParams2 = this.f33009w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.w3(this.f33010x, this.f33001a, layoutParams2);
            this.f33010x.addView(this.f33001a, this.f33009w);
            int i12 = org.telegram.messenger.j10.f24773t0;
            this.f33002b = i12;
            org.telegram.messenger.ks.f(i12).c(this, org.telegram.messenger.ks.f25108e2);
            c(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        se0 se0Var;
        if (i7 == org.telegram.messenger.ks.f25108e2 && (se0Var = this.f33004e) != null) {
            se0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f33007r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33007r = animatorSet2;
        re0 re0Var = this.f33001a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(re0Var, property, f10);
        re0 re0Var2 = this.f33001a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(re0Var2, property2, f11);
        re0 re0Var3 = this.f33001a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(re0Var3, property3, f12));
        this.f33007r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f33007r.addListener(new te0(this, 0));
        this.f33007r.setInterpolator(this.E);
        this.f33007r.start();
    }

    public int getX() {
        return this.f33009w.x;
    }

    public int getY() {
        return this.f33009w.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.f33009w;
        layoutParams.x = i7;
        try {
            this.f33010x.updateViewLayout(this.f33001a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.f33009w;
        layoutParams.y = i7;
        try {
            this.f33010x.updateViewLayout(this.f33001a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
