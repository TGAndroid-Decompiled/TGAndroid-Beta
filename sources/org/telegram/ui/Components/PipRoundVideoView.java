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
    public static PipRoundVideoView F;
    public final RectF E = new RectF();
    public bh0 f23989a;
    public int f23990b;
    public TextureView f23991c;
    public ImageView d;
    public ch0 f23992e;
    public Bitmap f23993f;
    public int h;
    public int f23994n;
    public AnimatorSet f23995r;
    public Runnable f23996s;
    public WindowManager.LayoutParams v;
    public WindowManager f23997w;
    public SharedPreferences f23998x;
    public DecelerateInterpolator f23999y;

    public static int b(boolean z10, int i10, float f7, int i11) {
        int i12;
        int round;
        if (z10) {
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
            round = Math.round((i13 - AndroidUtilities.dp(20.0f)) * f7) + AndroidUtilities.dp(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z10) {
        if (z10) {
            TextureView textureView = this.f23991c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f23991c.getWidth() > 0 && this.f23991c.getHeight() > 0) {
                    this.f23993f = Bitmaps.createBitmap(this.f23991c.getWidth(), this.f23991c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f23991c.getBitmap(this.f23993f);
                } catch (Throwable unused) {
                    this.f23993f = null;
                }
                this.d.setImageBitmap(this.f23993f);
                try {
                    this.f23992e.removeView(this.f23991c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f23993f != null) {
            this.d.setImageDrawable(null);
            this.f23993f.recycle();
            this.f23993f = null;
        }
        try {
            this.f23997w.removeView(this.f23989a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f23990b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f23995r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23995r = animatorSet2;
        bh0 bh0Var = this.f23989a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bh0Var, property, f7);
        bh0 bh0Var2 = this.f23989a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bh0Var2, property2, f10);
        bh0 bh0Var3 = this.f23989a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(bh0Var3, property3, f11));
        this.f23995r.setDuration(150L);
        if (this.f23999y == null) {
            this.f23999y = new DecelerateInterpolator();
        }
        this.f23995r.addListener(new ea(17, this, z10));
        this.f23995r.setInterpolator(this.f23999y);
        this.f23995r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f23996s = runnable;
        bh0 bh0Var = new bh0(this, activity);
        this.f23989a = bh0Var;
        bh0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f23994n = AndroidUtilities.dp(126.0f);
        ch0 ch0Var = new ch0(this, activity, 0);
        this.f23992e = ch0Var;
        ch0Var.setOutlineProvider(new ai.l2(14));
        this.f23992e.setClipToOutline(true);
        this.f23992e.a(1.0f, 0);
        this.f23989a.addView(this.f23992e, w7.w5.a(120.0f, 3.0f, 3.0f, 0.0f, 0.0f, 120, 51));
        this.f23989a.setAlpha(1.0f);
        this.f23989a.setScaleX(0.8f);
        this.f23989a.setScaleY(0.8f);
        this.f23991c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f23991c.setScaleX(dpf2);
        this.f23991c.setScaleY(dpf2);
        this.f23992e.addView(this.f23991c, w7.w5.d(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f23992e.addView(imageView, w7.w5.d(-1.0f, -1));
        this.d.setVisibility(4);
        this.f23997w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f23998x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f23998x.getInt("sidey", 0);
        float f7 = this.f23998x.getFloat("px", 0.0f);
        float f10 = this.f23998x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f23994n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f23994n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f23997w, this.f23989a, layoutParams2);
            this.f23997w.addView(this.f23989a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f23990b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ch0 ch0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (ch0Var = this.f23992e) != null) {
            ch0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f23995r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23995r = animatorSet2;
        bh0 bh0Var = this.f23989a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bh0Var, property, f7);
        bh0 bh0Var2 = this.f23989a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bh0Var2, property2, f10);
        bh0 bh0Var3 = this.f23989a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(bh0Var3, property3, f11));
        this.f23995r.setDuration(150L);
        if (this.f23999y == null) {
            this.f23999y = new DecelerateInterpolator();
        }
        this.f23995r.addListener(new dh0(this, 0));
        this.f23995r.setInterpolator(this.f23999y);
        this.f23995r.start();
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
            this.f23997w.updateViewLayout(this.f23989a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f23997w.updateViewLayout(this.f23989a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
