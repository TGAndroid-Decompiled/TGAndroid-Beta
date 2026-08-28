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
    public ff0 f26424a;
    public int f26425b;
    public TextureView f26426c;
    public ImageView d;
    public gf0 f26427e;
    public Bitmap f26428f;
    public int h;
    public int f26429n;
    public AnimatorSet f26430r;
    public Runnable f26431s;
    public WindowManager.LayoutParams v;
    public WindowManager f26432w;
    public SharedPreferences f26433x;
    public DecelerateInterpolator f26434y;

    public static int b(boolean z10, int i9, float f10, int i10) {
        int i11;
        int round;
        if (z10) {
            i11 = AndroidUtilities.displaySize.x;
        } else {
            i11 = AndroidUtilities.displaySize.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int i12 = i11 - i10;
        if (i9 == 0) {
            round = AndroidUtilities.dp(10.0f);
        } else if (i9 == 1) {
            round = i12 - AndroidUtilities.dp(10.0f);
        } else {
            round = Math.round((i12 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        }
        if (!z10) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z10) {
        if (z10) {
            TextureView textureView = this.f26426c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f26426c.getWidth() > 0 && this.f26426c.getHeight() > 0) {
                    this.f26428f = Bitmaps.createBitmap(this.f26426c.getWidth(), this.f26426c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f26426c.getBitmap(this.f26428f);
                } catch (Throwable unused) {
                    this.f26428f = null;
                }
                this.d.setImageBitmap(this.f26428f);
                try {
                    this.f26427e.removeView(this.f26426c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f26428f != null) {
            this.d.setImageDrawable(null);
            this.f26428f.recycle();
            this.f26428f = null;
        }
        try {
            this.f26432w.removeView(this.f26424a);
        } catch (Exception unused3) {
        }
        if (B == this) {
            B = null;
        }
        NotificationCenter.getInstance(this.f26425b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f26430r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26430r = animatorSet2;
        ff0 ff0Var = this.f26424a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ff0Var, property, f10);
        ff0 ff0Var2 = this.f26424a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ff0Var2, property2, f11);
        ff0 ff0Var3 = this.f26424a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ff0Var3, property3, f12));
        this.f26430r.setDuration(150L);
        if (this.f26434y == null) {
            this.f26434y = new DecelerateInterpolator();
        }
        this.f26430r.addListener(new u9(17, this, z10));
        this.f26430r.setInterpolator(this.f26434y);
        this.f26430r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        B = this;
        this.f26431s = runnable;
        ff0 ff0Var = new ff0(this, activity);
        this.f26424a = ff0Var;
        ff0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f26429n = AndroidUtilities.dp(126.0f);
        gf0 gf0Var = new gf0(this, activity, 0);
        this.f26427e = gf0Var;
        gf0Var.setOutlineProvider(new bg.q1(12));
        this.f26427e.setClipToOutline(true);
        this.f26427e.a(1.0f, 0);
        this.f26424a.addView(this.f26427e, g7.e6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f26424a.setAlpha(1.0f);
        this.f26424a.setScaleX(0.8f);
        this.f26424a.setScaleY(0.8f);
        this.f26426c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f26426c.setScaleX(dpf2);
        this.f26426c.setScaleY(dpf2);
        this.f26427e.addView(this.f26426c, g7.e6.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f26427e.addView(imageView, g7.e6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f26432w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f26433x = sharedPreferences;
        int i9 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.f26433x.getInt("sidey", 0);
        float f10 = this.f26433x.getFloat("px", 0.0f);
        float f11 = this.f26433x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.f26429n;
            layoutParams.x = b(true, i9, f10, i11);
            this.v.y = b(false, i10, f11, this.f26429n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f26432w, this.f26424a, layoutParams2);
            this.f26432w.addView(this.f26424a, this.v);
            int i12 = UserConfig.selectedAccount;
            this.f26425b = i12;
            NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        gf0 gf0Var;
        if (i9 == NotificationCenter.messagePlayingProgressDidChanged && (gf0Var = this.f26427e) != null) {
            gf0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f26430r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26430r = animatorSet2;
        ff0 ff0Var = this.f26424a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ff0Var, property, f10);
        ff0 ff0Var2 = this.f26424a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ff0Var2, property2, f11);
        ff0 ff0Var3 = this.f26424a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ff0Var3, property3, f12));
        this.f26430r.setDuration(150L);
        if (this.f26434y == null) {
            this.f26434y = new DecelerateInterpolator();
        }
        this.f26430r.addListener(new hf0(this, 0));
        this.f26430r.setInterpolator(this.f26434y);
        this.f26430r.start();
    }

    public int getX() {
        return this.v.x;
    }

    public int getY() {
        return this.v.y;
    }

    public void setX(int i9) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.x = i9;
        try {
            this.f26432w.updateViewLayout(this.f26424a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i9) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i9;
        try {
            this.f26432w.updateViewLayout(this.f26424a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
