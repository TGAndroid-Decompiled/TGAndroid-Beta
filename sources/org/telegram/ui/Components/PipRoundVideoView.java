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
public class PipRoundVideoView implements jm7 {
    public static PipRoundVideoView G;
    public DecelerateInterpolator E;
    public final RectF F = new RectF();
    public yc8 a;
    public int b;
    public TextureView c;
    public ImageView d;
    public oa8 e;
    public Bitmap f;
    public int h;
    public int n;
    public AnimatorSet r;
    public Runnable s;
    public WindowManager.LayoutParams w;
    public WindowManager x;
    public SharedPreferences y;

    public static int b(float f, int i, int i2, boolean z) {
        int i3;
        int round;
        if (z) {
            i3 = gm.q.x;
        } else {
            i3 = gm.q.y - i2;
            i2 = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
        }
        int i4 = i3 - i2;
        if (i == 0) {
            round = gm.L(10.0f);
        } else if (i == 1) {
            round = i4 - gm.L(10.0f);
        } else {
            round = Math.round((i4 - gm.L(20.0f)) * f) + gm.L(10.0f);
        }
        if (!z) {
            return org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z) {
        if (z) {
            TextureView textureView = this.c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.c.getWidth() > 0 && this.c.getHeight() > 0) {
                    int width = this.c.getWidth();
                    int height = this.c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f = ld1.a(width, height);
                }
                try {
                    this.c.getBitmap(this.f);
                } catch (Throwable unused) {
                    this.f = null;
                }
                this.d.setImageBitmap(this.f);
                try {
                    this.e.removeView(this.c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f != null) {
            this.d.setImageDrawable(null);
            this.f.recycle();
            this.f = null;
        }
        try {
            this.x.removeView(this.a);
        } catch (Exception unused3) {
        }
        if (G == this) {
            G = null;
        }
        nm7.f(this.b).n(this, nm7.e2);
    }

    public final void c(boolean z) {
        float f;
        float f2;
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        yc8 yc8Var = this.a;
        Property property = View.ALPHA;
        float f3 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yc8Var, property, f);
        yc8 yc8Var2 = this.a;
        Property property2 = View.SCALE_X;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yc8Var2, property2, f2);
        yc8 yc8Var3 = this.a;
        Property property3 = View.SCALE_Y;
        if (!z) {
            f3 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(yc8Var3, property3, f3));
        this.r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.r.addListener(new jf4((byte) 22, this, z));
        this.r.setInterpolator(this.E);
        this.r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        G = this;
        this.s = runnable;
        yc8 yc8Var = new yc8(this, launchActivity);
        this.a = yc8Var;
        yc8Var.setWillNotDraw(false);
        this.h = gm.L(126.0f);
        this.n = gm.L(126.0f);
        oa8 oa8Var = new oa8((byte) 1, launchActivity, this);
        this.e = oa8Var;
        oa8Var.setOutlineProvider(new xj((byte) 11));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.a.addView(this.e, qoe.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.a.setAlpha(1.0f);
        this.a.setScaleX(0.8f);
        this.a.setScaleY(0.8f);
        this.c = new TextureView(launchActivity);
        float N = (gm.N(2.0f) + gm.N(120.0f)) / gm.N(120.0f);
        this.c.setScaleX(N);
        this.c.setScaleY(N);
        this.e.addView(this.c, qoe.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.e.addView(imageView, qoe.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.a.b.getSharedPreferences("pipconfig", 0);
        this.y = sharedPreferences;
        int i = sharedPreferences.getInt("sidex", 1);
        int i2 = this.y.getInt("sidey", 0);
        float f = this.y.getFloat("px", 0.0f);
        float f2 = this.y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.w = layoutParams;
            int i3 = this.h;
            layoutParams.width = i3;
            layoutParams.height = this.n;
            layoutParams.x = b(f, i, i3, true);
            this.w.y = b(f2, i2, this.n, false);
            WindowManager.LayoutParams layoutParams2 = this.w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            gm.s3(this.x, this.a, layoutParams2);
            this.x.addView(this.a, this.w);
            int i4 = z8c.t0;
            this.b = i4;
            nm7.f(i4).b(this, nm7.e2);
            c(true);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        oa8 oa8Var;
        if (i == nm7.e2 && (oa8Var = this.e) != null) {
            oa8Var.invalidate();
        }
    }

    public final void e(boolean z) {
        float f;
        float f2;
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        yc8 yc8Var = this.a;
        Property property = View.ALPHA;
        float f3 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yc8Var, property, f);
        yc8 yc8Var2 = this.a;
        Property property2 = View.SCALE_X;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yc8Var2, property2, f2);
        yc8 yc8Var3 = this.a;
        Property property3 = View.SCALE_Y;
        if (!z) {
            f3 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(yc8Var3, property3, f3));
        this.r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.r.addListener(new zc8(this, (byte) 0));
        this.r.setInterpolator(this.E);
        this.r.start();
    }

    public int getX() {
        return this.w.x;
    }

    public int getY() {
        return this.w.y;
    }

    public void setX(int i) {
        WindowManager.LayoutParams layoutParams = this.w;
        layoutParams.x = i;
        try {
            this.x.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i) {
        WindowManager.LayoutParams layoutParams = this.w;
        layoutParams.y = i;
        try {
            this.x.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
