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
    public fg0 f21165a;
    public int f21166b;
    public TextureView f21167c;
    public ImageView d;
    public gg0 e;
    public Bitmap f21168f;
    public int h;
    public int f21169n;
    public AnimatorSet f21170r;
    public Runnable f21171s;
    public WindowManager.LayoutParams v;
    public WindowManager f21172w;
    public SharedPreferences f21173x;
    public DecelerateInterpolator f21174y;

    public static int b(boolean z10, int i10, float f7, int i11) {
        int i12;
        int round;
        if (z10) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
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
            return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z10) {
        if (z10) {
            TextureView textureView = this.f21167c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f21167c.getWidth() > 0 && this.f21167c.getHeight() > 0) {
                    this.f21168f = Bitmaps.createBitmap(this.f21167c.getWidth(), this.f21167c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f21167c.getBitmap(this.f21168f);
                } catch (Throwable unused) {
                    this.f21168f = null;
                }
                this.d.setImageBitmap(this.f21168f);
                try {
                    this.e.removeView(this.f21167c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f21168f != null) {
            this.d.setImageDrawable(null);
            this.f21168f.recycle();
            this.f21168f = null;
        }
        try {
            this.f21172w.removeView(this.f21165a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f21166b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f21170r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f21170r = animatorSet2;
        fg0 fg0Var = this.f21165a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fg0Var, property, f7);
        fg0 fg0Var2 = this.f21165a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fg0Var2, property2, f10);
        fg0 fg0Var3 = this.f21165a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(fg0Var3, property3, f11));
        this.f21170r.setDuration(150L);
        if (this.f21174y == null) {
            this.f21174y = new DecelerateInterpolator();
        }
        this.f21170r.addListener(new yo(13, this, z10));
        this.f21170r.setInterpolator(this.f21174y);
        this.f21170r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f21171s = runnable;
        fg0 fg0Var = new fg0(this, activity);
        this.f21165a = fg0Var;
        fg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f21169n = AndroidUtilities.dp(126.0f);
        gg0 gg0Var = new gg0(this, activity, 0);
        this.e = gg0Var;
        gg0Var.setOutlineProvider(new bi.g(11));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f21165a.addView(this.e, w7.a6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f21165a.setAlpha(1.0f);
        this.f21165a.setScaleX(0.8f);
        this.f21165a.setScaleY(0.8f);
        this.f21167c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f21167c.setScaleX(dpf2);
        this.f21167c.setScaleY(dpf2);
        this.e.addView(this.f21167c, w7.a6.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, w7.a6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f21172w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f21173x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f21173x.getInt("sidey", 0);
        float f7 = this.f21173x.getFloat("px", 0.0f);
        float f10 = this.f21173x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f21169n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f21169n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f21172w, this.f21165a, layoutParams2);
            this.f21172w.addView(this.f21165a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f21166b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gg0 gg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (gg0Var = this.e) != null) {
            gg0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f21170r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f21170r = animatorSet2;
        fg0 fg0Var = this.f21165a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fg0Var, property, f7);
        fg0 fg0Var2 = this.f21165a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fg0Var2, property2, f10);
        fg0 fg0Var3 = this.f21165a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(fg0Var3, property3, f11));
        this.f21170r.setDuration(150L);
        if (this.f21174y == null) {
            this.f21174y = new DecelerateInterpolator();
        }
        this.f21170r.addListener(new hg0(this, 0));
        this.f21170r.setInterpolator(this.f21174y);
        this.f21170r.start();
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
            this.f21172w.updateViewLayout(this.f21165a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f21172w.updateViewLayout(this.f21165a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
