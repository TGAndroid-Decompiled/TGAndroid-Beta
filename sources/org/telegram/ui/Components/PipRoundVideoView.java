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
    public gg0 f22303a;
    public int f22304b;
    public TextureView f22305c;
    public ImageView d;
    public hg0 e;
    public Bitmap f22306f;
    public int h;
    public int f22307n;
    public AnimatorSet f22308r;
    public Runnable f22309s;
    public WindowManager.LayoutParams v;
    public WindowManager f22310w;
    public SharedPreferences f22311x;
    public DecelerateInterpolator f22312y;

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
            TextureView textureView = this.f22305c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f22305c.getWidth() > 0 && this.f22305c.getHeight() > 0) {
                    this.f22306f = Bitmaps.createBitmap(this.f22305c.getWidth(), this.f22305c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f22305c.getBitmap(this.f22306f);
                } catch (Throwable unused) {
                    this.f22306f = null;
                }
                this.d.setImageBitmap(this.f22306f);
                try {
                    this.e.removeView(this.f22305c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f22306f != null) {
            this.d.setImageDrawable(null);
            this.f22306f.recycle();
            this.f22306f = null;
        }
        try {
            this.f22310w.removeView(this.f22303a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f22304b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f22308r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22308r = animatorSet2;
        gg0 gg0Var = this.f22303a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gg0Var, property, f7);
        gg0 gg0Var2 = this.f22303a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gg0Var2, property2, f10);
        gg0 gg0Var3 = this.f22303a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(gg0Var3, property3, f11));
        this.f22308r.setDuration(150L);
        if (this.f22312y == null) {
            this.f22312y = new DecelerateInterpolator();
        }
        this.f22308r.addListener(new ca(17, this, z10));
        this.f22308r.setInterpolator(this.f22312y);
        this.f22308r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f22309s = runnable;
        gg0 gg0Var = new gg0(this, activity);
        this.f22303a = gg0Var;
        gg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f22307n = AndroidUtilities.dp(126.0f);
        hg0 hg0Var = new hg0(this, activity, 0);
        this.e = hg0Var;
        hg0Var.setOutlineProvider(new ai.k2(14));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f22303a.addView(this.e, w7.y5.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f22303a.setAlpha(1.0f);
        this.f22303a.setScaleX(0.8f);
        this.f22303a.setScaleY(0.8f);
        this.f22305c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f22305c.setScaleX(dpf2);
        this.f22305c.setScaleY(dpf2);
        this.e.addView(this.f22305c, w7.y5.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, w7.y5.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f22310w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f22311x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f22311x.getInt("sidey", 0);
        float f7 = this.f22311x.getFloat("px", 0.0f);
        float f10 = this.f22311x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f22307n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f22307n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f22310w, this.f22303a, layoutParams2);
            this.f22310w.addView(this.f22303a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f22304b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        hg0 hg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (hg0Var = this.e) != null) {
            hg0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f22308r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22308r = animatorSet2;
        gg0 gg0Var = this.f22303a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gg0Var, property, f7);
        gg0 gg0Var2 = this.f22303a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gg0Var2, property2, f10);
        gg0 gg0Var3 = this.f22303a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(gg0Var3, property3, f11));
        this.f22308r.setDuration(150L);
        if (this.f22312y == null) {
            this.f22312y = new DecelerateInterpolator();
        }
        this.f22308r.addListener(new ig0(this, 0));
        this.f22308r.setInterpolator(this.f22312y);
        this.f22308r.start();
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
            this.f22310w.updateViewLayout(this.f22303a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f22310w.updateViewLayout(this.f22303a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
