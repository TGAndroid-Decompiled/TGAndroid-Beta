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
    public static PipRoundVideoView B;
    public final RectF A = new RectF();
    public sf0 f26435a;
    public int f26436b;
    public TextureView f26437c;
    public ImageView d;
    public tf0 f26438e;
    public Bitmap f26439f;
    public int h;
    public int f26440n;
    public AnimatorSet f26441r;
    public Runnable f26442s;
    public WindowManager.LayoutParams v;
    public WindowManager f26443w;
    public SharedPreferences f26444x;
    public DecelerateInterpolator f26445y;

    public static int b(boolean z10, int i10, float f9, int i11) {
        int i12;
        int round;
        if (z10) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        }
        int i13 = i12 - i11;
        if (i10 == 0) {
            round = AndroidUtilities.dp(10.0f);
        } else if (i10 == 1) {
            round = i13 - AndroidUtilities.dp(10.0f);
        } else {
            round = Math.round((i13 - AndroidUtilities.dp(20.0f)) * f9) + AndroidUtilities.dp(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z10) {
        if (z10) {
            TextureView textureView = this.f26437c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f26437c.getWidth() > 0 && this.f26437c.getHeight() > 0) {
                    this.f26439f = Bitmaps.createBitmap(this.f26437c.getWidth(), this.f26437c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f26437c.getBitmap(this.f26439f);
                } catch (Throwable unused) {
                    this.f26439f = null;
                }
                this.d.setImageBitmap(this.f26439f);
                try {
                    this.f26438e.removeView(this.f26437c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f26439f != null) {
            this.d.setImageDrawable(null);
            this.f26439f.recycle();
            this.f26439f = null;
        }
        try {
            this.f26443w.removeView(this.f26435a);
        } catch (Exception unused3) {
        }
        if (B == this) {
            B = null;
        }
        NotificationCenter.getInstance(this.f26436b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f9;
        float f10;
        AnimatorSet animatorSet = this.f26441r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26441r = animatorSet2;
        sf0 sf0Var = this.f26435a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sf0Var, property, f9);
        sf0 sf0Var2 = this.f26435a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(sf0Var2, property2, f10);
        sf0 sf0Var3 = this.f26435a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(sf0Var3, property3, f11));
        this.f26441r.setDuration(150L);
        if (this.f26445y == null) {
            this.f26445y = new DecelerateInterpolator();
        }
        this.f26441r.addListener(new z9(17, this, z10));
        this.f26441r.setInterpolator(this.f26445y);
        this.f26441r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        B = this;
        this.f26442s = runnable;
        sf0 sf0Var = new sf0(this, activity);
        this.f26435a = sf0Var;
        sf0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f26440n = AndroidUtilities.dp(126.0f);
        tf0 tf0Var = new tf0(this, activity, 0);
        this.f26438e = tf0Var;
        tf0Var.setOutlineProvider(new eg.k1(12));
        this.f26438e.setClipToOutline(true);
        this.f26438e.a(1.0f, 0);
        this.f26435a.addView(this.f26438e, i7.f6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f26435a.setAlpha(1.0f);
        this.f26435a.setScaleX(0.8f);
        this.f26435a.setScaleY(0.8f);
        this.f26437c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f26437c.setScaleX(dpf2);
        this.f26437c.setScaleY(dpf2);
        this.f26438e.addView(this.f26437c, i7.f6.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f26438e.addView(imageView, i7.f6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f26443w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f26444x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f26444x.getInt("sidey", 0);
        float f9 = this.f26444x.getFloat("px", 0.0f);
        float f10 = this.f26444x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f26440n;
            layoutParams.x = b(true, i10, f9, i12);
            this.v.y = b(false, i11, f10, this.f26440n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f26443w, this.f26435a, layoutParams2);
            this.f26443w.addView(this.f26435a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f26436b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tf0 tf0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (tf0Var = this.f26438e) != null) {
            tf0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f9;
        float f10;
        AnimatorSet animatorSet = this.f26441r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26441r = animatorSet2;
        sf0 sf0Var = this.f26435a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sf0Var, property, f9);
        sf0 sf0Var2 = this.f26435a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(sf0Var2, property2, f10);
        sf0 sf0Var3 = this.f26435a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(sf0Var3, property3, f11));
        this.f26441r.setDuration(150L);
        if (this.f26445y == null) {
            this.f26445y = new DecelerateInterpolator();
        }
        this.f26441r.addListener(new uf0(this, 0));
        this.f26441r.setInterpolator(this.f26445y);
        this.f26441r.start();
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
            this.f26443w.updateViewLayout(this.f26435a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f26443w.updateViewLayout(this.f26435a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
