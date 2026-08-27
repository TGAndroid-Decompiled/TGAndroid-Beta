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

    public jf0 f26420a;

    public int f26421b;

    public TextureView f26422c;
    public ImageView d;

    public kf0 f26423e;

    public Bitmap f26424f;
    public int h;

    public int f26425n;

    public AnimatorSet f26426r;

    public Runnable f26427s;
    public WindowManager.LayoutParams v;

    public WindowManager f26428w;

    public SharedPreferences f26429x;

    public DecelerateInterpolator f26430y;

    public static int b(boolean z10, int i10, float f10, int i11) {
        int i12;
        int iDp;
        if (z10) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int i13 = i12 - i11;
        if (i10 == 0) {
            iDp = AndroidUtilities.dp(10.0f);
        } else {
            iDp = i10 == 1 ? i13 - AndroidUtilities.dp(10.0f) : Math.round((i13 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        }
        return !z10 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + iDp : iDp;
    }

    public final void a(boolean z10) {
        if (!z10) {
            if (this.f26424f != null) {
                this.d.setImageDrawable(null);
                this.f26424f.recycle();
                this.f26424f = null;
            }
            try {
                this.f26428w.removeView(this.f26420a);
            } catch (Exception unused) {
            }
            if (B == this) {
                B = null;
            }
            NotificationCenter.getInstance(this.f26421b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            return;
        }
        TextureView textureView = this.f26422c;
        if (textureView == null || textureView.getParent() == null) {
            return;
        }
        if (this.f26422c.getWidth() > 0 && this.f26422c.getHeight() > 0) {
            this.f26424f = Bitmaps.createBitmap(this.f26422c.getWidth(), this.f26422c.getHeight(), Bitmap.Config.ARGB_8888);
        }
        try {
            this.f26422c.getBitmap(this.f26424f);
        } catch (Throwable unused2) {
            this.f26424f = null;
        }
        this.d.setImageBitmap(this.f26424f);
        try {
            this.f26423e.removeView(this.f26422c);
        } catch (Exception unused3) {
        }
        this.d.setVisibility(0);
        c(false);
    }

    public final void c(boolean z10) {
        AnimatorSet animatorSet = this.f26426r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26426r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f26420a, (Property<jf0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.f26420a, (Property<jf0, Float>) View.SCALE_X, z10 ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.f26420a, (Property<jf0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.8f));
        this.f26426r.setDuration(150L);
        if (this.f26430y == null) {
            this.f26430y = new DecelerateInterpolator();
        }
        this.f26426r.addListener(new org.telegram.ui.go(18, this, z10));
        this.f26426r.setInterpolator(this.f26430y);
        this.f26426r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        B = this;
        this.f26427s = runnable;
        jf0 jf0Var = new jf0(this, activity);
        this.f26420a = jf0Var;
        jf0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f26425n = AndroidUtilities.dp(126.0f);
        kf0 kf0Var = new kf0(this, activity, 0);
        this.f26423e = kf0Var;
        kf0Var.setOutlineProvider(new cg.l1(12));
        this.f26423e.setClipToOutline(true);
        this.f26423e.a(1.0f, 0);
        this.f26420a.addView(this.f26423e, h7.z5.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f26420a.setAlpha(1.0f);
        this.f26420a.setScaleX(0.8f);
        this.f26420a.setScaleY(0.8f);
        this.f26422c = new TextureView(activity);
        float fDpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f26422c.setScaleX(fDpf2);
        this.f26422c.setScaleY(fDpf2);
        this.f26423e.addView(this.f26422c, h7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f26423e.addView(imageView, h7.z5.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f26428w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f26429x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f26429x.getInt("sidey", 0);
        float f10 = this.f26429x.getFloat("px", 0.0f);
        float f11 = this.f26429x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f26425n;
            layoutParams.x = b(true, i10, f10, i12);
            this.v.y = b(false, i11, f11, this.f26425n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f26428w, this.f26420a, layoutParams2);
            this.f26428w.addView(this.f26420a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f26421b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        kf0 kf0Var;
        if (i10 != NotificationCenter.messagePlayingProgressDidChanged || (kf0Var = this.f26423e) == null) {
            return;
        }
        kf0Var.invalidate();
    }

    public final void e(boolean z10) {
        AnimatorSet animatorSet = this.f26426r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26426r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f26420a, (Property<jf0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.f26420a, (Property<jf0, Float>) View.SCALE_X, z10 ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.f26420a, (Property<jf0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.8f));
        this.f26426r.setDuration(150L);
        if (this.f26430y == null) {
            this.f26430y = new DecelerateInterpolator();
        }
        this.f26426r.addListener(new lf0(this, 0));
        this.f26426r.setInterpolator(this.f26430y);
        this.f26426r.start();
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
            this.f26428w.updateViewLayout(this.f26420a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f26428w.updateViewLayout(this.f26420a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
