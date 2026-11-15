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
public class PipRoundVideoView implements org.telegram.messenger.is {
    public static PipRoundVideoView G;
    public DecelerateInterpolator E;
    public final RectF F = new RectF();
    public he0 f32604a;
    public int f32605b;
    public TextureView f32606c;
    public ImageView d;
    public ie0 f32607e;
    public Bitmap f32608f;
    public int h;
    public int f32609n;
    public AnimatorSet f32610r;
    public Runnable f32611s;
    public WindowManager.LayoutParams f32612w;
    public WindowManager f32613x;
    public SharedPreferences f32614y;

    public static int b(float f10, int i7, int i10, boolean z10) {
        int i11;
        int round;
        if (z10) {
            i11 = org.telegram.messenger.g0.f23609q.x;
        } else {
            i11 = org.telegram.messenger.g0.f23609q.y - i10;
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
            TextureView textureView = this.f32606c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f32606c.getWidth() > 0 && this.f32606c.getHeight() > 0) {
                    int width = this.f32606c.getWidth();
                    int height = this.f32606c.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    this.f32608f = org.telegram.messenger.xr.c(width, height);
                }
                try {
                    this.f32606c.getBitmap(this.f32608f);
                } catch (Throwable unused) {
                    this.f32608f = null;
                }
                this.d.setImageBitmap(this.f32608f);
                try {
                    this.f32607e.removeView(this.f32606c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f32608f != null) {
            this.d.setImageDrawable(null);
            this.f32608f.recycle();
            this.f32608f = null;
        }
        try {
            this.f32613x.removeView(this.f32604a);
        } catch (Exception unused3) {
        }
        if (G == this) {
            G = null;
        }
        org.telegram.messenger.ns.f(this.f32605b).n(this, org.telegram.messenger.ns.f25488e2);
    }

    public final void c(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f32610r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32610r = animatorSet2;
        he0 he0Var = this.f32604a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(he0Var, property, f10);
        he0 he0Var2 = this.f32604a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(he0Var2, property2, f11);
        he0 he0Var3 = this.f32604a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(he0Var3, property3, f12));
        this.f32610r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f32610r.addListener(new org.telegram.ui.nn(18, this, z10));
        this.f32610r.setInterpolator(this.E);
        this.f32610r.start();
    }

    public final void d(LaunchActivity launchActivity, Runnable runnable) {
        if (launchActivity == null) {
            return;
        }
        G = this;
        this.f32611s = runnable;
        he0 he0Var = new he0(this, launchActivity);
        this.f32604a = he0Var;
        he0Var.setWillNotDraw(false);
        this.h = org.telegram.messenger.g0.L(126.0f);
        this.f32609n = org.telegram.messenger.g0.L(126.0f);
        ie0 ie0Var = new ie0(0, launchActivity, this);
        this.f32607e = ie0Var;
        ie0Var.setOutlineProvider(new bg.p0(13));
        this.f32607e.setClipToOutline(true);
        this.f32607e.a(1.0f, 0);
        this.f32604a.addView(this.f32607e, c8.ja.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f32604a.setAlpha(1.0f);
        this.f32604a.setScaleX(0.8f);
        this.f32604a.setScaleY(0.8f);
        this.f32606c = new TextureView(launchActivity);
        float N = (org.telegram.messenger.g0.N(2.0f) + org.telegram.messenger.g0.N(120.0f)) / org.telegram.messenger.g0.N(120.0f);
        this.f32606c.setScaleX(N);
        this.f32606c.setScaleY(N);
        this.f32607e.addView(this.f32606c, c8.ja.c(-1.0f, -1));
        ImageView imageView = new ImageView(launchActivity);
        this.d = imageView;
        this.f32607e.addView(imageView, c8.ja.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f32613x = (WindowManager) launchActivity.getSystemService("window");
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26600b.getSharedPreferences("pipconfig", 0);
        this.f32614y = sharedPreferences;
        int i7 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f32614y.getInt("sidey", 0);
        float f10 = this.f32614y.getFloat("px", 0.0f);
        float f11 = this.f32614y.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f32612w = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.f32609n;
            layoutParams.x = b(f10, i7, i11, true);
            this.f32612w.y = b(f11, i10, this.f32609n, false);
            WindowManager.LayoutParams layoutParams2 = this.f32612w;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            org.telegram.messenger.g0.x3(this.f32613x, this.f32604a, layoutParams2);
            this.f32613x.addView(this.f32604a, this.f32612w);
            int i12 = org.telegram.messenger.m10.f24934t0;
            this.f32605b = i12;
            org.telegram.messenger.ns.f(i12).c(this, org.telegram.messenger.ns.f25488e2);
            c(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ie0 ie0Var;
        if (i7 == org.telegram.messenger.ns.f25488e2 && (ie0Var = this.f32607e) != null) {
            ie0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f32610r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f32610r = animatorSet2;
        he0 he0Var = this.f32604a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(he0Var, property, f10);
        he0 he0Var2 = this.f32604a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(he0Var2, property2, f11);
        he0 he0Var3 = this.f32604a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(he0Var3, property3, f12));
        this.f32610r.setDuration(150L);
        if (this.E == null) {
            this.E = new DecelerateInterpolator();
        }
        this.f32610r.addListener(new je0(this, 0));
        this.f32610r.setInterpolator(this.E);
        this.f32610r.start();
    }

    public int getX() {
        return this.f32612w.x;
    }

    public int getY() {
        return this.f32612w.y;
    }

    public void setX(int i7) {
        WindowManager.LayoutParams layoutParams = this.f32612w;
        layoutParams.x = i7;
        try {
            this.f32613x.updateViewLayout(this.f32604a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i7) {
        WindowManager.LayoutParams layoutParams = this.f32612w;
        layoutParams.y = i7;
        try {
            this.f32613x.updateViewLayout(this.f32604a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
