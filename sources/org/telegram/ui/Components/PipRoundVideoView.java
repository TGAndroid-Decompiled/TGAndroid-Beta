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
    public bh0 f23990a;
    public int f23991b;
    public TextureView f23992c;
    public ImageView d;
    public ch0 f23993e;
    public Bitmap f23994f;
    public int h;
    public int f23995n;
    public AnimatorSet f23996r;
    public Runnable f23997s;
    public WindowManager.LayoutParams v;
    public WindowManager f23998w;
    public SharedPreferences f23999x;
    public DecelerateInterpolator f24000y;

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
            TextureView textureView = this.f23992c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f23992c.getWidth() > 0 && this.f23992c.getHeight() > 0) {
                    this.f23994f = Bitmaps.createBitmap(this.f23992c.getWidth(), this.f23992c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f23992c.getBitmap(this.f23994f);
                } catch (Throwable unused) {
                    this.f23994f = null;
                }
                this.d.setImageBitmap(this.f23994f);
                try {
                    this.f23993e.removeView(this.f23992c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f23994f != null) {
            this.d.setImageDrawable(null);
            this.f23994f.recycle();
            this.f23994f = null;
        }
        try {
            this.f23998w.removeView(this.f23990a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f23991b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f23996r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23996r = animatorSet2;
        bh0 bh0Var = this.f23990a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bh0Var, property, f7);
        bh0 bh0Var2 = this.f23990a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bh0Var2, property2, f10);
        bh0 bh0Var3 = this.f23990a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(bh0Var3, property3, f11));
        this.f23996r.setDuration(150L);
        if (this.f24000y == null) {
            this.f24000y = new DecelerateInterpolator();
        }
        this.f23996r.addListener(new ea(17, this, z10));
        this.f23996r.setInterpolator(this.f24000y);
        this.f23996r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f23997s = runnable;
        bh0 bh0Var = new bh0(this, activity);
        this.f23990a = bh0Var;
        bh0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f23995n = AndroidUtilities.dp(126.0f);
        ch0 ch0Var = new ch0(this, activity, 0);
        this.f23993e = ch0Var;
        ch0Var.setOutlineProvider(new ai.l2(14));
        this.f23993e.setClipToOutline(true);
        this.f23993e.a(1.0f, 0);
        this.f23990a.addView(this.f23993e, w7.w5.a(120.0f, 3.0f, 3.0f, 0.0f, 0.0f, 120, 51));
        this.f23990a.setAlpha(1.0f);
        this.f23990a.setScaleX(0.8f);
        this.f23990a.setScaleY(0.8f);
        this.f23992c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f23992c.setScaleX(dpf2);
        this.f23992c.setScaleY(dpf2);
        this.f23993e.addView(this.f23992c, w7.w5.d(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f23993e.addView(imageView, w7.w5.d(-1.0f, -1));
        this.d.setVisibility(4);
        this.f23998w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f23999x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f23999x.getInt("sidey", 0);
        float f7 = this.f23999x.getFloat("px", 0.0f);
        float f10 = this.f23999x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f23995n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f23995n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f23998w, this.f23990a, layoutParams2);
            this.f23998w.addView(this.f23990a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f23991b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ch0 ch0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (ch0Var = this.f23993e) != null) {
            ch0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f23996r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23996r = animatorSet2;
        bh0 bh0Var = this.f23990a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bh0Var, property, f7);
        bh0 bh0Var2 = this.f23990a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bh0Var2, property2, f10);
        bh0 bh0Var3 = this.f23990a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(bh0Var3, property3, f11));
        this.f23996r.setDuration(150L);
        if (this.f24000y == null) {
            this.f24000y = new DecelerateInterpolator();
        }
        this.f23996r.addListener(new dh0(this, 0));
        this.f23996r.setInterpolator(this.f24000y);
        this.f23996r.start();
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
            this.f23998w.updateViewLayout(this.f23990a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f23998w.updateViewLayout(this.f23990a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
