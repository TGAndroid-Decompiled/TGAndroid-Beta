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
    public vg0 f24403a;
    public int f24404b;
    public TextureView f24405c;
    public ImageView d;
    public wg0 e;
    public Bitmap f24406f;
    public int h;
    public int f24407n;
    public AnimatorSet f24408r;
    public Runnable f24409s;
    public WindowManager.LayoutParams v;
    public WindowManager f24410w;
    public SharedPreferences f24411x;
    public DecelerateInterpolator f24412y;

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
            TextureView textureView = this.f24405c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f24405c.getWidth() > 0 && this.f24405c.getHeight() > 0) {
                    this.f24406f = Bitmaps.createBitmap(this.f24405c.getWidth(), this.f24405c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f24405c.getBitmap(this.f24406f);
                } catch (Throwable unused) {
                    this.f24406f = null;
                }
                this.d.setImageBitmap(this.f24406f);
                try {
                    this.e.removeView(this.f24405c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f24406f != null) {
            this.d.setImageDrawable(null);
            this.f24406f.recycle();
            this.f24406f = null;
        }
        try {
            this.f24410w.removeView(this.f24403a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f24404b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24408r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24408r = animatorSet2;
        vg0 vg0Var = this.f24403a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vg0Var, property, f7);
        vg0 vg0Var2 = this.f24403a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vg0Var2, property2, f10);
        vg0 vg0Var3 = this.f24403a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(vg0Var3, property3, f11));
        this.f24408r.setDuration(150L);
        if (this.f24412y == null) {
            this.f24412y = new DecelerateInterpolator();
        }
        this.f24408r.addListener(new org.telegram.ui.ho(18, this, z10));
        this.f24408r.setInterpolator(this.f24412y);
        this.f24408r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f24409s = runnable;
        vg0 vg0Var = new vg0(this, activity);
        this.f24403a = vg0Var;
        vg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f24407n = AndroidUtilities.dp(126.0f);
        wg0 wg0Var = new wg0(this, activity, 0);
        this.e = wg0Var;
        wg0Var.setOutlineProvider(new ci.n1(14));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f24403a.addView(this.e, w7.z5.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f24403a.setAlpha(1.0f);
        this.f24403a.setScaleX(0.8f);
        this.f24403a.setScaleY(0.8f);
        this.f24405c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f24405c.setScaleX(dpf2);
        this.f24405c.setScaleY(dpf2);
        this.e.addView(this.f24405c, w7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, w7.z5.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f24410w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f24411x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24411x.getInt("sidey", 0);
        float f7 = this.f24411x.getFloat("px", 0.0f);
        float f10 = this.f24411x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f24407n;
            layoutParams.x = b(f7, i10, i12, true);
            this.v.y = b(f10, i11, this.f24407n, false);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f24410w, this.f24403a, layoutParams2);
            this.f24410w.addView(this.f24403a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f24404b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        wg0 wg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (wg0Var = this.e) != null) {
            wg0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24408r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24408r = animatorSet2;
        vg0 vg0Var = this.f24403a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vg0Var, property, f7);
        vg0 vg0Var2 = this.f24403a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vg0Var2, property2, f10);
        vg0 vg0Var3 = this.f24403a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(vg0Var3, property3, f11));
        this.f24408r.setDuration(150L);
        if (this.f24412y == null) {
            this.f24412y = new DecelerateInterpolator();
        }
        this.f24408r.addListener(new xg0(this, 0));
        this.f24408r.setInterpolator(this.f24412y);
        this.f24408r.start();
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
            this.f24410w.updateViewLayout(this.f24403a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f24410w.updateViewLayout(this.f24403a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
