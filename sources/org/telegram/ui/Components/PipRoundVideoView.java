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
public class PipRoundVideoView implements org.telegram.messenger.vs {
    public static PipRoundVideoView F;
    public DecelerateInterpolator D;
    public final RectF E = new RectF();
    public ze0 f24077a;
    public int f24078b;
    public TextureView f24079c;
    public ImageView d;
    public af0 e;
    public Bitmap f24080f;
    public int h;
    public int f24081n;
    public AnimatorSet f24082r;
    public Runnable f24083s;
    public WindowManager.LayoutParams f24084w;
    public WindowManager f24085x;
    public SharedPreferences f24086y;

    public static int b(float f7, int i10, int i11, boolean z10) {
        int i12;
        int round;
        if (z10) {
            i12 = org.telegram.messenger.i0.f16172q.x;
        } else {
            i12 = org.telegram.messenger.i0.f16172q.y - i11;
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
            TextureView textureView = this.f24079c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f24079c.getWidth() > 0 && this.f24079c.getHeight() > 0) {
                    int width = this.f24079c.getWidth();
                    int height = this.f24079c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f24080f = org.telegram.messenger.ks.b(width, height);
                }
                try {
                    this.f24079c.getBitmap(this.f24080f);
                } catch (Throwable unused) {
                    this.f24080f = null;
                }
                this.d.setImageBitmap(this.f24080f);
                try {
                    this.e.removeView(this.f24079c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f24080f != null) {
            this.d.setImageDrawable(null);
            this.f24080f.recycle();
            this.f24080f = null;
        }
        try {
            this.f24085x.removeView(this.f24077a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        org.telegram.messenger.at.f(this.f24078b).n(this, org.telegram.messenger.at.f14700e2);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24082r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24082r = animatorSet2;
        ze0 ze0Var = this.f24077a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ze0Var, property, f7);
        ze0 ze0Var2 = this.f24077a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ze0Var2, property2, f10);
        ze0 ze0Var3 = this.f24077a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ze0Var3, property3, f11));
        this.f24082r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.f24082r.addListener(new ha0(3, this, z10));
        this.f24082r.setInterpolator(this.D);
        this.f24082r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        F = this;
        this.f24083s = runnable;
        ze0 ze0Var = new ze0(this, launchActivity);
        this.f24077a = ze0Var;
        ze0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.i0.L(126.0f);
        this.f24081n = org.telegram.messenger.i0.L(126.0f);
        af0 af0Var = new af0(this, launchActivity, 0);
        this.e = af0Var;
        af0Var.setOutlineProvider(new bi.d2(13));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f24077a.addView(this.e, w7.b6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f24077a.setAlpha(1.0f);
        this.f24077a.setScaleX(0.8f);
        this.f24077a.setScaleY(0.8f);
        this.f24079c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.i0.N(2.0f) + org.telegram.messenger.i0.N(120.0f)) / org.telegram.messenger.i0.N(120.0f);
        this.f24079c.setScaleX(N);
        this.f24079c.setScaleY(N);
        this.e.addView(this.f24079c, w7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.e.addView(imageView, w7.b6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f24085x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("pipconfig", 0);
        this.f24086y = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24086y.getInt("sidey", 0);
        float f7 = this.f24086y.getFloat("px", 0.0f);
        float f10 = this.f24086y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f24084w = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f24081n;
            layoutParams.x = b(f7, i10, i12, true);
            this.f24084w.y = b(f10, i11, this.f24081n, false);
            WindowManager.LayoutParams layoutParams2 = this.f24084w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.i0.x3(this.f24085x, this.f24077a, layoutParams2);
            this.f24085x.addView(this.f24077a, this.f24084w);
            int i13 = org.telegram.messenger.e20.f15506s0;
            this.f24078b = i13;
            org.telegram.messenger.at.f(i13).c(this, org.telegram.messenger.at.f14700e2);
            c(true);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        af0 af0Var;
        if (i10 == org.telegram.messenger.at.f14700e2 && (af0Var = this.e) != null) {
            af0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24082r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24082r = animatorSet2;
        ze0 ze0Var = this.f24077a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ze0Var, property, f7);
        ze0 ze0Var2 = this.f24077a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ze0Var2, property2, f10);
        ze0 ze0Var3 = this.f24077a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ze0Var3, property3, f11));
        this.f24082r.setDuration(150L);
        if (this.D == null) {
            this.D = new DecelerateInterpolator();
        }
        this.f24082r.addListener(new bf0(this, 0));
        this.f24082r.setInterpolator(this.D);
        this.f24082r.start();
    }

    public int getX() {
        return this.f24084w.x;
    }

    public int getY() {
        return this.f24084w.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24084w;
        layoutParams.x = i10;
        try {
            this.f24085x.updateViewLayout(this.f24077a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.f24084w;
        layoutParams.y = i10;
        try {
            this.f24085x.updateViewLayout(this.f24077a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
