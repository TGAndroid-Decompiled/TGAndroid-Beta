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
public class PipRoundVideoView implements org.telegram.messenger.us {
    public static PipRoundVideoView F;
    public DecelerateInterpolator D;
    public final RectF E = new RectF();
    public ze0 f24076a;
    public int f24077b;
    public TextureView f24078c;
    public ImageView d;
    public af0 e;
    public Bitmap f24079f;
    public int h;
    public int f24080n;
    public AnimatorSet f24081r;
    public Runnable f24082s;
    public WindowManager.LayoutParams f24083w;
    public WindowManager f24084x;
    public SharedPreferences f24085y;

    public static int b(float f7, int i10, int i11, boolean z10) {
        int i12;
        int round;
        if (z10) {
            i12 = org.telegram.messenger.i0.f16026q.x;
        } else {
            i12 = org.telegram.messenger.i0.f16026q.y - i11;
            i11 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        int i13 = i12 - i11;
        if (i10 == 0) {
            round = org.telegram.messenger.i0.L(10.0f);
        } else if (i10 == 1) {
            round = i13 - org.telegram.messenger.i0.L(10.0f);
        } else {
            round = Math.round((i13 - org.telegram.messenger.i0.L(20.0f)) * f7) + org.telegram.messenger.i0.L(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z10) {
        if (z10) {
            TextureView textureView = this.f24078c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f24078c.getWidth() > 0 && this.f24078c.getHeight() > 0) {
                    int width = this.f24078c.getWidth();
                    int height = this.f24078c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f24079f = org.telegram.messenger.js.b(width, height);
                }
                try {
                    this.f24078c.getBitmap(this.f24079f);
                } catch (Throwable unused) {
                    this.f24079f = null;
                }
                this.d.setImageBitmap(this.f24079f);
                try {
                    this.e.removeView(this.f24078c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f24079f != null) {
            this.d.setImageDrawable(null);
            this.f24079f.recycle();
            this.f24079f = null;
        }
        try {
            this.f24084x.removeView(this.f24076a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        org.telegram.messenger.zs.f(this.f24077b).n(this, org.telegram.messenger.zs.f19604e2);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24081r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24081r = animatorSet2;
        ze0 ze0Var = this.f24076a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ze0Var, property, f7);
        ze0 ze0Var2 = this.f24076a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ze0Var2, property2, f10);
        ze0 ze0Var3 = this.f24076a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ze0Var3, property3, f11));
        this.f24081r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.f24081r.addListener(new ha0(3, this, z10));
        this.f24081r.setInterpolator(this.D);
        this.f24081r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        F = this;
        this.f24082s = runnable;
        ze0 ze0Var = new ze0(this, launchActivity);
        this.f24076a = ze0Var;
        ze0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.i0.L(126.0f);
        this.f24080n = org.telegram.messenger.i0.L(126.0f);
        af0 af0Var = new af0(this, launchActivity, 0);
        this.e = af0Var;
        af0Var.setOutlineProvider(new bi.d2(13));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f24076a.addView(this.e, w7.b6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f24076a.setAlpha(1.0f);
        this.f24076a.setScaleX(0.8f);
        this.f24076a.setScaleY(0.8f);
        this.f24078c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.i0.N(2.0f) + org.telegram.messenger.i0.N(120.0f)) / org.telegram.messenger.i0.N(120.0f);
        this.f24078c.setScaleX(N);
        this.f24078c.setScaleY(N);
        this.e.addView(this.f24078c, w7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.e.addView(imageView, w7.b6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f24084x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("pipconfig", 0);
        this.f24085y = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24085y.getInt("sidey", 0);
        float f7 = this.f24085y.getFloat("px", 0.0f);
        float f10 = this.f24085y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f24083w = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f24080n;
            layoutParams.x = b(f7, i10, i12, true);
            this.f24083w.y = b(f10, i11, this.f24080n, false);
            WindowManager.LayoutParams layoutParams2 = this.f24083w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.i0.x3(this.f24084x, this.f24076a, layoutParams2);
            this.f24084x.addView(this.f24076a, this.f24083w);
            int i13 = org.telegram.messenger.d20.f15147s0;
            this.f24077b = i13;
            org.telegram.messenger.zs.f(i13).c(this, org.telegram.messenger.zs.f19604e2);
            c(true);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        af0 af0Var;
        if (i10 == org.telegram.messenger.zs.f19604e2 && (af0Var = this.e) != null) {
            af0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24081r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24081r = animatorSet2;
        ze0 ze0Var = this.f24076a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ze0Var, property, f7);
        ze0 ze0Var2 = this.f24076a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ze0Var2, property2, f10);
        ze0 ze0Var3 = this.f24076a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ze0Var3, property3, f11));
        this.f24081r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.f24081r.addListener(new bf0(this, 0));
        this.f24081r.setInterpolator(this.D);
        this.f24081r.start();
    }

    public int getX() {
        return this.f24083w.x;
    }

    public int getY() {
        return this.f24083w.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24083w;
        layoutParams.x = i10;
        try {
            this.f24084x.updateViewLayout(this.f24076a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24083w;
        layoutParams.y = i10;
        try {
            this.f24084x.updateViewLayout(this.f24076a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
