package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public class PipRoundVideoView implements NotificationCenter.NotificationCenterDelegate {
    public static PipRoundVideoView C;
    public final RectF B = new RectF();
    public cg0 f23043a;
    public int f23044b;
    public TextureView f23045c;
    public ImageView d;
    public dg0 e;
    public Bitmap f23046f;
    public int h;
    public int f23047n;
    public AnimatorSet f23048r;
    public Runnable f23049s;
    public WindowManager.LayoutParams v;
    public WindowManager f23050w;
    public SharedPreferences f23051x;
    public DecelerateInterpolator f23052y;

    public static int b(boolean z4, int i10, float f10, int i11) {
        int i12;
        int round;
        if (z4) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int i13 = i12 - i11;
        if (i10 == 0) {
            round = AndroidUtilities.dp(10.0f);
        } else if (i10 == 1) {
            round = i13 - AndroidUtilities.dp(10.0f);
        } else {
            round = Math.round((i13 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        }
        if (!z4) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z4) {
        if (z4) {
            TextureView textureView = this.f23045c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f23045c.getWidth() > 0 && this.f23045c.getHeight() > 0) {
                    this.f23046f = Bitmaps.createBitmap(this.f23045c.getWidth(), this.f23045c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f23045c.getBitmap(this.f23046f);
                } catch (Throwable unused) {
                    this.f23046f = null;
                }
                this.d.setImageBitmap(this.f23046f);
                try {
                    this.e.removeView(this.f23045c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f23046f != null) {
            this.d.setImageDrawable(null);
            this.f23046f.recycle();
            this.f23046f = null;
        }
        try {
            this.f23050w.removeView(this.f23043a);
        } catch (Exception unused3) {
        }
        if (C == this) {
            C = null;
        }
        NotificationCenter.getInstance(this.f23044b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z4) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f23048r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23048r = animatorSet2;
        cg0 cg0Var = this.f23043a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cg0Var, property, f10);
        cg0 cg0Var2 = this.f23043a;
        Property property2 = View.SCALE_X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cg0Var2, property2, f11);
        cg0 cg0Var3 = this.f23043a;
        Property property3 = View.SCALE_Y;
        if (!z4) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cg0Var3, property3, f12));
        this.f23048r.setDuration(150L);
        if (this.f23052y == null) {
            this.f23052y = new DecelerateInterpolator();
        }
        this.f23048r.addListener(new m00(9, this, z4));
        this.f23048r.setInterpolator(this.f23052y);
        this.f23048r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        C = this;
        this.f23049s = runnable;
        cg0 cg0Var = new cg0(this, activity);
        this.f23043a = cg0Var;
        cg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f23047n = AndroidUtilities.dp(126.0f);
        dg0 dg0Var = new dg0(this, activity, 0);
        this.e = dg0Var;
        dg0Var.setOutlineProvider(new gg.j1(10));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f23043a.addView(this.e, k7.b6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f23043a.setAlpha(1.0f);
        this.f23043a.setScaleX(0.8f);
        this.f23043a.setScaleY(0.8f);
        this.f23045c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f23045c.setScaleX(dpf2);
        this.f23045c.setScaleY(dpf2);
        this.e.addView(this.f23045c, k7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, k7.b6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f23050w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f23051x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f23051x.getInt("sidey", 0);
        float f10 = this.f23051x.getFloat("px", 0.0f);
        float f11 = this.f23051x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f23047n;
            layoutParams.x = b(true, i10, f10, i12);
            this.v.y = b(false, i11, f11, this.f23047n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f23050w, this.f23043a, layoutParams2);
            this.f23050w.addView(this.f23043a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f23044b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        dg0 dg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (dg0Var = this.e) != null) {
            dg0Var.invalidate();
        }
    }

    public final void e(boolean z4) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f23048r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23048r = animatorSet2;
        cg0 cg0Var = this.f23043a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cg0Var, property, f10);
        cg0 cg0Var2 = this.f23043a;
        Property property2 = View.SCALE_X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cg0Var2, property2, f11);
        cg0 cg0Var3 = this.f23043a;
        Property property3 = View.SCALE_Y;
        if (!z4) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cg0Var3, property3, f12));
        this.f23048r.setDuration(150L);
        if (this.f23052y == null) {
            this.f23052y = new DecelerateInterpolator();
        }
        this.f23048r.addListener(new eg0(this, 0));
        this.f23048r.setInterpolator(this.f23052y);
        this.f23048r.start();
    }

    public int getX() {
        return this.v.x;
    }

    public int getY() {
        return this.v.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.x = i10;
        try {
            this.f23050w.updateViewLayout(this.f23043a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f23050w.updateViewLayout(this.f23043a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
