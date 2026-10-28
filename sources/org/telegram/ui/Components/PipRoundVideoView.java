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
    public vg0 f26198a;
    public int f26199b;
    public TextureView f26200c;
    public ImageView d;
    public wg0 e;
    public Bitmap f26201f;
    public int h;
    public int f26202n;
    public AnimatorSet f26203r;
    public Runnable f26204s;
    public WindowManager.LayoutParams v;
    public WindowManager f26205w;
    public SharedPreferences f26206x;
    public DecelerateInterpolator f26207y;

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
            TextureView textureView = this.f26200c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f26200c.getWidth() > 0 && this.f26200c.getHeight() > 0) {
                    this.f26201f = Bitmaps.createBitmap(this.f26200c.getWidth(), this.f26200c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f26200c.getBitmap(this.f26201f);
                } catch (Throwable unused) {
                    this.f26201f = null;
                }
                this.d.setImageBitmap(this.f26201f);
                try {
                    this.e.removeView(this.f26200c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f26201f != null) {
            this.d.setImageDrawable(null);
            this.f26201f.recycle();
            this.f26201f = null;
        }
        try {
            this.f26205w.removeView(this.f26198a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f26199b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f26203r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26203r = animatorSet2;
        vg0 vg0Var = this.f26198a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vg0Var, property, f7);
        vg0 vg0Var2 = this.f26198a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vg0Var2, property2, f10);
        vg0 vg0Var3 = this.f26198a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(vg0Var3, property3, f11));
        this.f26203r.setDuration(150L);
        if (this.f26207y == null) {
            this.f26207y = new DecelerateInterpolator();
        }
        this.f26203r.addListener(new org.telegram.ui.lo(18, this, z10));
        this.f26203r.setInterpolator(this.f26207y);
        this.f26203r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f26204s = runnable;
        vg0 vg0Var = new vg0(this, activity);
        this.f26198a = vg0Var;
        vg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f26202n = AndroidUtilities.dp(126.0f);
        wg0 wg0Var = new wg0(this, activity, 0);
        this.e = wg0Var;
        wg0Var.setOutlineProvider(new ag.v0(16));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f26198a.addView(this.e, kb1.h(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f26198a.setAlpha(1.0f);
        this.f26198a.setScaleX(0.8f);
        this.f26198a.setScaleY(0.8f);
        this.f26200c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f26200c.setScaleX(dpf2);
        this.f26200c.setScaleY(dpf2);
        this.e.addView(this.f26200c, kb1.g(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, kb1.g(-1.0f, -1));
        this.d.setVisibility(4);
        this.f26205w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f26206x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f26206x.getInt("sidey", 0);
        float f7 = this.f26206x.getFloat("px", 0.0f);
        float f10 = this.f26206x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f26202n;
            layoutParams.x = b(f7, i10, i12, true);
            this.v.y = b(f10, i11, this.f26202n, false);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f26205w, this.f26198a, layoutParams2);
            this.f26205w.addView(this.f26198a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f26199b = i13;
            NotificationCenter.getInstance(i13).addWeakObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
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
        AnimatorSet animatorSet = this.f26203r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26203r = animatorSet2;
        vg0 vg0Var = this.f26198a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vg0Var, property, f7);
        vg0 vg0Var2 = this.f26198a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vg0Var2, property2, f10);
        vg0 vg0Var3 = this.f26198a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(vg0Var3, property3, f11));
        this.f26203r.setDuration(150L);
        if (this.f26207y == null) {
            this.f26207y = new DecelerateInterpolator();
        }
        this.f26203r.addListener(new xg0(this, 0));
        this.f26203r.setInterpolator(this.f26207y);
        this.f26203r.start();
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
            this.f26205w.updateViewLayout(this.f26198a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f26205w.updateViewLayout(this.f26198a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
