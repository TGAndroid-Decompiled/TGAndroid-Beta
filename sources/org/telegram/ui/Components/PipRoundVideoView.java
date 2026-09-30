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
    public jg0 f22324a;
    public int f22325b;
    public TextureView f22326c;
    public ImageView d;
    public kg0 e;
    public Bitmap f22327f;
    public int h;
    public int f22328n;
    public AnimatorSet f22329r;
    public Runnable f22330s;
    public WindowManager.LayoutParams v;
    public WindowManager f22331w;
    public SharedPreferences f22332x;
    public DecelerateInterpolator f22333y;

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
            TextureView textureView = this.f22326c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f22326c.getWidth() > 0 && this.f22326c.getHeight() > 0) {
                    this.f22327f = Bitmaps.createBitmap(this.f22326c.getWidth(), this.f22326c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f22326c.getBitmap(this.f22327f);
                } catch (Throwable unused) {
                    this.f22327f = null;
                }
                this.d.setImageBitmap(this.f22327f);
                try {
                    this.e.removeView(this.f22326c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f22327f != null) {
            this.d.setImageDrawable(null);
            this.f22327f.recycle();
            this.f22327f = null;
        }
        try {
            this.f22331w.removeView(this.f22324a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f22325b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f22329r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22329r = animatorSet2;
        jg0 jg0Var = this.f22324a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jg0Var, property, f7);
        jg0 jg0Var2 = this.f22324a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jg0Var2, property2, f10);
        jg0 jg0Var3 = this.f22324a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(jg0Var3, property3, f11));
        this.f22329r.setDuration(150L);
        if (this.f22333y == null) {
            this.f22333y = new DecelerateInterpolator();
        }
        this.f22329r.addListener(new da(17, this, z10));
        this.f22329r.setInterpolator(this.f22333y);
        this.f22329r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f22330s = runnable;
        jg0 jg0Var = new jg0(this, activity);
        this.f22324a = jg0Var;
        jg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f22328n = AndroidUtilities.dp(126.0f);
        kg0 kg0Var = new kg0(this, activity, 0);
        this.e = kg0Var;
        kg0Var.setOutlineProvider(new ai.k2(14));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f22324a.addView(this.e, w7.y5.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f22324a.setAlpha(1.0f);
        this.f22324a.setScaleX(0.8f);
        this.f22324a.setScaleY(0.8f);
        this.f22326c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f22326c.setScaleX(dpf2);
        this.f22326c.setScaleY(dpf2);
        this.e.addView(this.f22326c, w7.y5.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, w7.y5.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f22331w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f22332x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f22332x.getInt("sidey", 0);
        float f7 = this.f22332x.getFloat("px", 0.0f);
        float f10 = this.f22332x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f22328n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f22328n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f22331w, this.f22324a, layoutParams2);
            this.f22331w.addView(this.f22324a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f22325b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        kg0 kg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (kg0Var = this.e) != null) {
            kg0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f22329r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22329r = animatorSet2;
        jg0 jg0Var = this.f22324a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(jg0Var, property, f7);
        jg0 jg0Var2 = this.f22324a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jg0Var2, property2, f10);
        jg0 jg0Var3 = this.f22324a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(jg0Var3, property3, f11));
        this.f22329r.setDuration(150L);
        if (this.f22333y == null) {
            this.f22333y = new DecelerateInterpolator();
        }
        this.f22329r.addListener(new lg0(this, 0));
        this.f22329r.setInterpolator(this.f22333y);
        this.f22329r.start();
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
            this.f22331w.updateViewLayout(this.f22324a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f22331w.updateViewLayout(this.f22324a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
