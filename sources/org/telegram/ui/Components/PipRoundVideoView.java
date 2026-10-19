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
    public qg0 f24258a;
    public int f24259b;
    public TextureView f24260c;
    public ImageView d;
    public rg0 e;
    public Bitmap f24261f;
    public int h;
    public int f24262n;
    public AnimatorSet f24263r;
    public Runnable f24264s;
    public WindowManager.LayoutParams v;
    public WindowManager f24265w;
    public SharedPreferences f24266x;
    public DecelerateInterpolator f24267y;

    public static int b(float f7, int i10, int i11, boolean z10) {
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
            TextureView textureView = this.f24260c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f24260c.getWidth() > 0 && this.f24260c.getHeight() > 0) {
                    this.f24261f = Bitmaps.createBitmap(this.f24260c.getWidth(), this.f24260c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f24260c.getBitmap(this.f24261f);
                } catch (Throwable unused) {
                    this.f24261f = null;
                }
                this.d.setImageBitmap(this.f24261f);
                try {
                    this.e.removeView(this.f24260c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f24261f != null) {
            this.d.setImageDrawable(null);
            this.f24261f.recycle();
            this.f24261f = null;
        }
        try {
            this.f24265w.removeView(this.f24258a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f24259b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24263r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24263r = animatorSet2;
        qg0 qg0Var = this.f24258a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qg0Var, property, f7);
        qg0 qg0Var2 = this.f24258a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qg0Var2, property2, f10);
        qg0 qg0Var3 = this.f24258a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(qg0Var3, property3, f11));
        this.f24263r.setDuration(150L);
        if (this.f24267y == null) {
            this.f24267y = new DecelerateInterpolator();
        }
        this.f24263r.addListener(new org.telegram.ui.fo(18, this, z10));
        this.f24263r.setInterpolator(this.f24267y);
        this.f24263r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f24264s = runnable;
        qg0 qg0Var = new qg0(this, activity);
        this.f24258a = qg0Var;
        qg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f24262n = AndroidUtilities.dp(126.0f);
        rg0 rg0Var = new rg0(this, activity, 0);
        this.e = rg0Var;
        rg0Var.setOutlineProvider(new ci.o1(14));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f24258a.addView(this.e, w7.z5.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f24258a.setAlpha(1.0f);
        this.f24258a.setScaleX(0.8f);
        this.f24258a.setScaleY(0.8f);
        this.f24260c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f24260c.setScaleX(dpf2);
        this.f24260c.setScaleY(dpf2);
        this.e.addView(this.f24260c, w7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, w7.z5.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f24265w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f24266x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24266x.getInt("sidey", 0);
        float f7 = this.f24266x.getFloat("px", 0.0f);
        float f10 = this.f24266x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f24262n;
            layoutParams.x = b(f7, i10, i12, true);
            this.v.y = b(f10, i11, this.f24262n, false);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f24265w, this.f24258a, layoutParams2);
            this.f24265w.addView(this.f24258a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f24259b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        rg0 rg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (rg0Var = this.e) != null) {
            rg0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24263r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24263r = animatorSet2;
        qg0 qg0Var = this.f24258a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qg0Var, property, f7);
        qg0 qg0Var2 = this.f24258a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qg0Var2, property2, f10);
        qg0 qg0Var3 = this.f24258a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(qg0Var3, property3, f11));
        this.f24263r.setDuration(150L);
        if (this.f24267y == null) {
            this.f24267y = new DecelerateInterpolator();
        }
        this.f24263r.addListener(new sg0(this, 0));
        this.f24263r.setInterpolator(this.f24267y);
        this.f24263r.start();
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
            this.f24265w.updateViewLayout(this.f24258a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f24265w.updateViewLayout(this.f24258a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
