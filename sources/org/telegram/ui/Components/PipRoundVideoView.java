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
    public zg0 f24240a;
    public int f24241b;
    public TextureView f24242c;
    public ImageView d;
    public ah0 f24243e;
    public Bitmap f24244f;
    public int h;
    public int f24245n;
    public AnimatorSet f24246r;
    public Runnable f24247s;
    public WindowManager.LayoutParams v;
    public WindowManager f24248w;
    public SharedPreferences f24249x;
    public DecelerateInterpolator f24250y;

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
            TextureView textureView = this.f24242c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f24242c.getWidth() > 0 && this.f24242c.getHeight() > 0) {
                    this.f24244f = Bitmaps.createBitmap(this.f24242c.getWidth(), this.f24242c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f24242c.getBitmap(this.f24244f);
                } catch (Throwable unused) {
                    this.f24244f = null;
                }
                this.d.setImageBitmap(this.f24244f);
                try {
                    this.f24243e.removeView(this.f24242c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f24244f != null) {
            this.d.setImageDrawable(null);
            this.f24244f.recycle();
            this.f24244f = null;
        }
        try {
            this.f24248w.removeView(this.f24240a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f24241b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24246r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24246r = animatorSet2;
        zg0 zg0Var = this.f24240a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zg0Var, property, f7);
        zg0 zg0Var2 = this.f24240a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zg0Var2, property2, f10);
        zg0 zg0Var3 = this.f24240a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(zg0Var3, property3, f11));
        this.f24246r.setDuration(150L);
        if (this.f24250y == null) {
            this.f24250y = new DecelerateInterpolator();
        }
        this.f24246r.addListener(new ea(17, this, z10));
        this.f24246r.setInterpolator(this.f24250y);
        this.f24246r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f24247s = runnable;
        zg0 zg0Var = new zg0(this, activity);
        this.f24240a = zg0Var;
        zg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f24245n = AndroidUtilities.dp(126.0f);
        ah0 ah0Var = new ah0(this, activity, 0);
        this.f24243e = ah0Var;
        ah0Var.setOutlineProvider(new ai.l2(14));
        this.f24243e.setClipToOutline(true);
        this.f24243e.a(1.0f, 0);
        this.f24240a.addView(this.f24243e, w7.x5.a(120.0f, 3.0f, 3.0f, 0.0f, 0.0f, 120, 51));
        this.f24240a.setAlpha(1.0f);
        this.f24240a.setScaleX(0.8f);
        this.f24240a.setScaleY(0.8f);
        this.f24242c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f24242c.setScaleX(dpf2);
        this.f24242c.setScaleY(dpf2);
        this.f24243e.addView(this.f24242c, w7.x5.d(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f24243e.addView(imageView, w7.x5.d(-1.0f, -1));
        this.d.setVisibility(4);
        this.f24248w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f24249x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24249x.getInt("sidey", 0);
        float f7 = this.f24249x.getFloat("px", 0.0f);
        float f10 = this.f24249x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f24245n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f24245n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f24248w, this.f24240a, layoutParams2);
            this.f24248w.addView(this.f24240a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f24241b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ah0 ah0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (ah0Var = this.f24243e) != null) {
            ah0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24246r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24246r = animatorSet2;
        zg0 zg0Var = this.f24240a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zg0Var, property, f7);
        zg0 zg0Var2 = this.f24240a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zg0Var2, property2, f10);
        zg0 zg0Var3 = this.f24240a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(zg0Var3, property3, f11));
        this.f24246r.setDuration(150L);
        if (this.f24250y == null) {
            this.f24250y = new DecelerateInterpolator();
        }
        this.f24246r.addListener(new bh0(this, 0));
        this.f24246r.setInterpolator(this.f24250y);
        this.f24246r.start();
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
            this.f24248w.updateViewLayout(this.f24240a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f24248w.updateViewLayout(this.f24240a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
