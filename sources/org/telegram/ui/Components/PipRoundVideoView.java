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
    public wf0 f22080a;
    public int f22081b;
    public TextureView f22082c;
    public ImageView d;
    public xf0 e;
    public Bitmap f22083f;
    public int h;
    public int f22084n;
    public AnimatorSet f22085r;
    public Runnable f22086s;
    public WindowManager.LayoutParams v;
    public WindowManager f22087w;
    public SharedPreferences f22088x;
    public DecelerateInterpolator f22089y;

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
            TextureView textureView = this.f22082c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f22082c.getWidth() > 0 && this.f22082c.getHeight() > 0) {
                    this.f22083f = Bitmaps.createBitmap(this.f22082c.getWidth(), this.f22082c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f22082c.getBitmap(this.f22083f);
                } catch (Throwable unused) {
                    this.f22083f = null;
                }
                this.d.setImageBitmap(this.f22083f);
                try {
                    this.e.removeView(this.f22082c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f22083f != null) {
            this.d.setImageDrawable(null);
            this.f22083f.recycle();
            this.f22083f = null;
        }
        try {
            this.f22087w.removeView(this.f22080a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f22081b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f22085r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22085r = animatorSet2;
        wf0 wf0Var = this.f22080a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wf0Var, property, f7);
        wf0 wf0Var2 = this.f22080a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wf0Var2, property2, f10);
        wf0 wf0Var3 = this.f22080a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(wf0Var3, property3, f11));
        this.f22085r.setDuration(150L);
        if (this.f22089y == null) {
            this.f22089y = new DecelerateInterpolator();
        }
        this.f22085r.addListener(new aa(17, this, z10));
        this.f22085r.setInterpolator(this.f22089y);
        this.f22085r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f22086s = runnable;
        wf0 wf0Var = new wf0(this, activity);
        this.f22080a = wf0Var;
        wf0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f22084n = AndroidUtilities.dp(126.0f);
        xf0 xf0Var = new xf0(this, activity, 0);
        this.e = xf0Var;
        xf0Var.setOutlineProvider(new ai.k2(12));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f22080a.addView(this.e, w7.x5.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f22080a.setAlpha(1.0f);
        this.f22080a.setScaleX(0.8f);
        this.f22080a.setScaleY(0.8f);
        this.f22082c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f22082c.setScaleX(dpf2);
        this.f22082c.setScaleY(dpf2);
        this.e.addView(this.f22082c, w7.x5.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, w7.x5.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f22087w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f22088x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f22088x.getInt("sidey", 0);
        float f7 = this.f22088x.getFloat("px", 0.0f);
        float f10 = this.f22088x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f22084n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f22084n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f22087w, this.f22080a, layoutParams2);
            this.f22087w.addView(this.f22080a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f22081b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        xf0 xf0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (xf0Var = this.e) != null) {
            xf0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f22085r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22085r = animatorSet2;
        wf0 wf0Var = this.f22080a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wf0Var, property, f7);
        wf0 wf0Var2 = this.f22080a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wf0Var2, property2, f10);
        wf0 wf0Var3 = this.f22080a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(wf0Var3, property3, f11));
        this.f22085r.setDuration(150L);
        if (this.f22089y == null) {
            this.f22089y = new DecelerateInterpolator();
        }
        this.f22085r.addListener(new yf0(this, 0));
        this.f22085r.setInterpolator(this.f22089y);
        this.f22085r.start();
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
            this.f22087w.updateViewLayout(this.f22080a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f22087w.updateViewLayout(this.f22080a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
