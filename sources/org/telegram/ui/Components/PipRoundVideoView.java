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
    public te0 f33034a;
    public int f33035b;
    public TextureView f33036c;
    public ImageView d;
    public ue0 f33037e;
    public Bitmap f33038f;
    public int h;
    public int f33039n;
    public AnimatorSet f33040r;
    public Runnable f33041s;
    public WindowManager.LayoutParams f33042w;
    public WindowManager f33043x;
    public SharedPreferences f33044y;

    public static int b(float f10, int i7, int i10, boolean z10) {
        int i11;
        int round;
        if (z10) {
            i11 = org.telegram.messenger.g0.f24146q.x;
        } else {
            i11 = org.telegram.messenger.g0.f24146q.y - i10;
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
            TextureView textureView = this.f33036c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f33036c.getWidth() > 0 && this.f33036c.getHeight() > 0) {
                    int width = this.f33036c.getWidth();
                    int height = this.f33036c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f33038f = org.telegram.messenger.vr.c(width, height);
                }
                try {
                    this.f33036c.getBitmap(this.f33038f);
                } catch (Throwable unused) {
                    this.f33038f = null;
                }
                this.d.setImageBitmap(this.f33038f);
                try {
                    this.f33037e.removeView(this.f33036c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f33038f != null) {
            this.d.setImageDrawable(null);
            this.f33038f.recycle();
            this.f33038f = null;
        }
        try {
            this.f33043x.removeView(this.f33034a);
        } catch (Exception unused3) {
        }
        if (G == this) {
            G = null;
        }
        org.telegram.messenger.ks.f(this.f33035b).n(this, org.telegram.messenger.ks.f25134e2);
    }

    public final void c(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f33040r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33040r = animatorSet2;
        te0 te0Var = this.f33034a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(te0Var, property, f10);
        te0 te0Var2 = this.f33034a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(te0Var2, property2, f11);
        te0 te0Var3 = this.f33034a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(te0Var3, property3, f12));
        this.f33040r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f33040r.addListener(new org.telegram.ui.on(18, this, z10));
        this.f33040r.setInterpolator(this.E);
        this.f33040r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        G = this;
        this.f33041s = runnable;
        te0 te0Var = new te0(this, launchActivity);
        this.f33034a = te0Var;
        te0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.g0.L(126.0f);
        this.f33039n = org.telegram.messenger.g0.L(126.0f);
        ue0 ue0Var = new ue0(0, launchActivity, this);
        this.f33037e = ue0Var;
        ue0Var.setOutlineProvider(new bg.q0(13));
        this.f33037e.setClipToOutline(true);
        this.f33037e.a(1.0f, 0);
        this.f33034a.addView(this.f33037e, c8.ma.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f33034a.setAlpha(1.0f);
        this.f33034a.setScaleX(0.8f);
        this.f33034a.setScaleY(0.8f);
        this.f33036c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.g0.N(2.0f) + org.telegram.messenger.g0.N(120.0f)) / org.telegram.messenger.g0.N(120.0f);
        this.f33036c.setScaleX(N);
        this.f33036c.setScaleY(N);
        this.f33037e.addView(this.f33036c, c8.ma.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.f33037e.addView(imageView, c8.ma.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f33043x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26941b.getSharedPreferences("pipconfig", 0);
        this.f33044y = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f33044y.getInt("sidey", 0);
        float f10 = this.f33044y.getFloat("px", 0.0f);
        float f11 = this.f33044y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f33042w = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.f33039n;
            layoutParams.x = b(f10, i7, i11, true);
            this.f33042w.y = b(f11, i10, this.f33039n, false);
            WindowManager.LayoutParams layoutParams2 = this.f33042w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.w3(this.f33043x, this.f33034a, layoutParams2);
            this.f33043x.addView(this.f33034a, this.f33042w);
            int i12 = org.telegram.messenger.j10.f24798t0;
            this.f33035b = i12;
            org.telegram.messenger.ks.f(i12).c(this, org.telegram.messenger.ks.f25134e2);
            c(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ue0 ue0Var;
        if (i7 == org.telegram.messenger.ks.f25134e2 && (ue0Var = this.f33037e) != null) {
            ue0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f33040r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33040r = animatorSet2;
        te0 te0Var = this.f33034a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(te0Var, property, f10);
        te0 te0Var2 = this.f33034a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(te0Var2, property2, f11);
        te0 te0Var3 = this.f33034a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(te0Var3, property3, f12));
        this.f33040r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f33040r.addListener(new ve0(this, 0));
        this.f33040r.setInterpolator(this.E);
        this.f33040r.start();
    }

    public int getX() {
        return this.f33042w.x;
    }

    public int getY() {
        return this.f33042w.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.f33042w;
        layoutParams.x = i7;
        try {
            this.f33043x.updateViewLayout(this.f33034a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.f33042w;
        layoutParams.y = i7;
        try {
            this.f33043x.updateViewLayout(this.f33034a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
