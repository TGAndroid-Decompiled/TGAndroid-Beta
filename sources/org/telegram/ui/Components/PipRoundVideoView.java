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
    public zg0 f24216a;
    public int f24217b;
    public TextureView f24218c;
    public ImageView d;
    public ah0 f24219e;
    public Bitmap f24220f;
    public int h;
    public int f24221n;
    public AnimatorSet f24222r;
    public Runnable f24223s;
    public WindowManager.LayoutParams v;
    public WindowManager f24224w;
    public SharedPreferences f24225x;
    public DecelerateInterpolator f24226y;

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
            TextureView textureView = this.f24218c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f24218c.getWidth() > 0 && this.f24218c.getHeight() > 0) {
                    this.f24220f = Bitmaps.createBitmap(this.f24218c.getWidth(), this.f24218c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f24218c.getBitmap(this.f24220f);
                } catch (Throwable unused) {
                    this.f24220f = null;
                }
                this.d.setImageBitmap(this.f24220f);
                try {
                    this.f24219e.removeView(this.f24218c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f24220f != null) {
            this.d.setImageDrawable(null);
            this.f24220f.recycle();
            this.f24220f = null;
        }
        try {
            this.f24224w.removeView(this.f24216a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f24217b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24222r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24222r = animatorSet2;
        zg0 zg0Var = this.f24216a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zg0Var, property, f7);
        zg0 zg0Var2 = this.f24216a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zg0Var2, property2, f10);
        zg0 zg0Var3 = this.f24216a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(zg0Var3, property3, f11));
        this.f24222r.setDuration(150L);
        if (this.f24226y == null) {
            this.f24226y = new DecelerateInterpolator();
        }
        this.f24222r.addListener(new fa(17, this, z10));
        this.f24222r.setInterpolator(this.f24226y);
        this.f24222r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f24223s = runnable;
        zg0 zg0Var = new zg0(this, activity);
        this.f24216a = zg0Var;
        zg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f24221n = AndroidUtilities.dp(126.0f);
        ah0 ah0Var = new ah0(this, activity, 0);
        this.f24219e = ah0Var;
        ah0Var.setOutlineProvider(new ai.l2(14));
        this.f24219e.setClipToOutline(true);
        this.f24219e.a(1.0f, 0);
        this.f24216a.addView(this.f24219e, w7.x5.a(120.0f, 3.0f, 3.0f, 0.0f, 0.0f, 120, 51));
        this.f24216a.setAlpha(1.0f);
        this.f24216a.setScaleX(0.8f);
        this.f24216a.setScaleY(0.8f);
        this.f24218c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f24218c.setScaleX(dpf2);
        this.f24218c.setScaleY(dpf2);
        this.f24219e.addView(this.f24218c, w7.x5.d(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f24219e.addView(imageView, w7.x5.d(-1.0f, -1));
        this.d.setVisibility(4);
        this.f24224w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f24225x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24225x.getInt("sidey", 0);
        float f7 = this.f24225x.getFloat("px", 0.0f);
        float f10 = this.f24225x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f24221n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f24221n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f24224w, this.f24216a, layoutParams2);
            this.f24224w.addView(this.f24216a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f24217b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ah0 ah0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (ah0Var = this.f24219e) != null) {
            ah0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24222r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24222r = animatorSet2;
        zg0 zg0Var = this.f24216a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zg0Var, property, f7);
        zg0 zg0Var2 = this.f24216a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zg0Var2, property2, f10);
        zg0 zg0Var3 = this.f24216a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(zg0Var3, property3, f11));
        this.f24222r.setDuration(150L);
        if (this.f24226y == null) {
            this.f24226y = new DecelerateInterpolator();
        }
        this.f24222r.addListener(new bh0(this, 0));
        this.f24222r.setInterpolator(this.f24226y);
        this.f24222r.start();
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
            this.f24224w.updateViewLayout(this.f24216a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f24224w.updateViewLayout(this.f24216a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
