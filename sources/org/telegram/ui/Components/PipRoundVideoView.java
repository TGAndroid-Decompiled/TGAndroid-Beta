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
public class PipRoundVideoView implements org.telegram.messenger.gs {
    public static PipRoundVideoView G;
    public DecelerateInterpolator E;
    public final RectF F = new RectF();
    public te0 f33037a;
    public int f33038b;
    public TextureView f33039c;
    public ImageView d;
    public ue0 f33040e;
    public Bitmap f33041f;
    public int h;
    public int f33042n;
    public AnimatorSet f33043r;
    public Runnable f33044s;
    public WindowManager.LayoutParams f33045w;
    public WindowManager f33046x;
    public SharedPreferences f33047y;

    public static int b(float f10, int i7, int i10, boolean z10) {
        int i11;
        int round;
        if (z10) {
            i11 = org.telegram.messenger.g0.f24046q.x;
        } else {
            i11 = org.telegram.messenger.g0.f24046q.y - i10;
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
            TextureView textureView = this.f33039c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f33039c.getWidth() > 0 && this.f33039c.getHeight() > 0) {
                    int width = this.f33039c.getWidth();
                    int height = this.f33039c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f33041f = org.telegram.messenger.wr.c(width, height);
                }
                try {
                    this.f33039c.getBitmap(this.f33041f);
                } catch (Throwable unused) {
                    this.f33041f = null;
                }
                this.d.setImageBitmap(this.f33041f);
                try {
                    this.f33040e.removeView(this.f33039c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f33041f != null) {
            this.d.setImageDrawable(null);
            this.f33041f.recycle();
            this.f33041f = null;
        }
        try {
            this.f33046x.removeView(this.f33037a);
        } catch (Exception unused3) {
        }
        if (G == this) {
            G = null;
        }
        org.telegram.messenger.ls.f(this.f33038b).n(this, org.telegram.messenger.ls.f25300e2);
    }

    public final void c(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f33043r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33043r = animatorSet2;
        te0 te0Var = this.f33037a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(te0Var, property, f10);
        te0 te0Var2 = this.f33037a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(te0Var2, property2, f11);
        te0 te0Var3 = this.f33037a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(te0Var3, property3, f12));
        this.f33043r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f33043r.addListener(new org.telegram.ui.on(18, this, z10));
        this.f33043r.setInterpolator(this.E);
        this.f33043r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        G = this;
        this.f33044s = runnable;
        te0 te0Var = new te0(this, launchActivity);
        this.f33037a = te0Var;
        te0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.g0.L(126.0f);
        this.f33042n = org.telegram.messenger.g0.L(126.0f);
        ue0 ue0Var = new ue0(0, launchActivity, this);
        this.f33040e = ue0Var;
        ue0Var.setOutlineProvider(new bg.q0(13));
        this.f33040e.setClipToOutline(true);
        this.f33040e.a(1.0f, 0);
        this.f33037a.addView(this.f33040e, c8.ma.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f33037a.setAlpha(1.0f);
        this.f33037a.setScaleX(0.8f);
        this.f33037a.setScaleY(0.8f);
        this.f33039c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.g0.N(2.0f) + org.telegram.messenger.g0.N(120.0f)) / org.telegram.messenger.g0.N(120.0f);
        this.f33039c.setScaleX(N);
        this.f33039c.setScaleY(N);
        this.f33040e.addView(this.f33039c, c8.ma.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.f33040e.addView(imageView, c8.ma.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f33046x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26931b.getSharedPreferences("pipconfig", 0);
        this.f33047y = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f33047y.getInt("sidey", 0);
        float f10 = this.f33047y.getFloat("px", 0.0f);
        float f11 = this.f33047y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f33045w = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.f33042n;
            layoutParams.x = b(f10, i7, i11, true);
            this.f33045w.y = b(f11, i10, this.f33042n, false);
            WindowManager.LayoutParams layoutParams2 = this.f33045w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.w3(this.f33046x, this.f33037a, layoutParams2);
            this.f33046x.addView(this.f33037a, this.f33045w);
            int i12 = org.telegram.messenger.k10.f24968t0;
            this.f33038b = i12;
            org.telegram.messenger.ls.f(i12).c(this, org.telegram.messenger.ls.f25300e2);
            c(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ue0 ue0Var;
        if (i7 == org.telegram.messenger.ls.f25300e2 && (ue0Var = this.f33040e) != null) {
            ue0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f33043r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f33043r = animatorSet2;
        te0 te0Var = this.f33037a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(te0Var, property, f10);
        te0 te0Var2 = this.f33037a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(te0Var2, property2, f11);
        te0 te0Var3 = this.f33037a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(te0Var3, property3, f12));
        this.f33043r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f33043r.addListener(new ve0(this, 0));
        this.f33043r.setInterpolator(this.E);
        this.f33043r.start();
    }

    public int getX() {
        return this.f33045w.x;
    }

    public int getY() {
        return this.f33045w.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.f33045w;
        layoutParams.x = i7;
        try {
            this.f33046x.updateViewLayout(this.f33037a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.f33045w;
        layoutParams.y = i7;
        try {
            this.f33046x.updateViewLayout(this.f33037a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
