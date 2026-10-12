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
    public wg0 f23200a;
    public int f23201b;
    public TextureView f23202c;
    public ImageView d;
    public xg0 e;
    public Bitmap f23203f;
    public int h;
    public int f23204n;
    public AnimatorSet f23205r;
    public Runnable f23206s;
    public WindowManager.LayoutParams v;
    public WindowManager f23207w;
    public SharedPreferences f23208x;
    public DecelerateInterpolator f23209y;

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
            TextureView textureView = this.f23202c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f23202c.getWidth() > 0 && this.f23202c.getHeight() > 0) {
                    this.f23203f = Bitmaps.createBitmap(this.f23202c.getWidth(), this.f23202c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f23202c.getBitmap(this.f23203f);
                } catch (Throwable unused) {
                    this.f23203f = null;
                }
                this.d.setImageBitmap(this.f23203f);
                try {
                    this.e.removeView(this.f23202c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f23203f != null) {
            this.d.setImageDrawable(null);
            this.f23203f.recycle();
            this.f23203f = null;
        }
        try {
            this.f23207w.removeView(this.f23200a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f23201b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f23205r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23205r = animatorSet2;
        wg0 wg0Var = this.f23200a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wg0Var, property, f7);
        wg0 wg0Var2 = this.f23200a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wg0Var2, property2, f10);
        wg0 wg0Var3 = this.f23200a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(wg0Var3, property3, f11));
        this.f23205r.setDuration(150L);
        if (this.f23209y == null) {
            this.f23209y = new DecelerateInterpolator();
        }
        this.f23205r.addListener(new org.telegram.ui.vo(18, this, z10));
        this.f23205r.setInterpolator(this.f23209y);
        this.f23205r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f23206s = runnable;
        wg0 wg0Var = new wg0(this, activity);
        this.f23200a = wg0Var;
        wg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f23204n = AndroidUtilities.dp(126.0f);
        xg0 xg0Var = new xg0(this, activity, 0);
        this.e = xg0Var;
        xg0Var.setOutlineProvider(new bi.a2(14));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f23200a.addView(this.e, w7.a6.a(120.0f, 3.0f, 3.0f, 0.0f, 0.0f, 120, 51));
        this.f23200a.setAlpha(1.0f);
        this.f23200a.setScaleX(0.8f);
        this.f23200a.setScaleY(0.8f);
        this.f23202c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f23202c.setScaleX(dpf2);
        this.f23202c.setScaleY(dpf2);
        this.e.addView(this.f23202c, w7.a6.d(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, w7.a6.d(-1.0f, -1));
        this.d.setVisibility(4);
        this.f23207w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f23208x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f23208x.getInt("sidey", 0);
        float f7 = this.f23208x.getFloat("px", 0.0f);
        float f10 = this.f23208x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f23204n;
            layoutParams.x = b(f7, i10, i12, true);
            this.v.y = b(f10, i11, this.f23204n, false);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f23207w, this.f23200a, layoutParams2);
            this.f23207w.addView(this.f23200a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f23201b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        xg0 xg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (xg0Var = this.e) != null) {
            xg0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f23205r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23205r = animatorSet2;
        wg0 wg0Var = this.f23200a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wg0Var, property, f7);
        wg0 wg0Var2 = this.f23200a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wg0Var2, property2, f10);
        wg0 wg0Var3 = this.f23200a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(wg0Var3, property3, f11));
        this.f23205r.setDuration(150L);
        if (this.f23209y == null) {
            this.f23209y = new DecelerateInterpolator();
        }
        this.f23205r.addListener(new yg0(this, 0));
        this.f23205r.setInterpolator(this.f23209y);
        this.f23205r.start();
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
            this.f23207w.updateViewLayout(this.f23200a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f23207w.updateViewLayout(this.f23200a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
