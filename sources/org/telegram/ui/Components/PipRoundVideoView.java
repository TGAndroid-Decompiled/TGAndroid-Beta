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
    public static PipRoundVideoView C;
    public final RectF B = new RectF();
    public bg0 f23070a;
    public int f23071b;
    public TextureView f23072c;
    public ImageView d;
    public cg0 e;
    public Bitmap f23073f;
    public int h;
    public int f23074n;
    public AnimatorSet f23075r;
    public Runnable f23076s;
    public WindowManager.LayoutParams v;
    public WindowManager f23077w;
    public SharedPreferences f23078x;
    public DecelerateInterpolator f23079y;

    public static int b(boolean z4, int i10, float f10, int i11) {
        int i12;
        int round;
        if (z4) {
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
            round = Math.round((i13 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        }
        if (!z4) {
            return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + round;
        }
        return round;
    }

    public final void a(boolean z4) {
        if (z4) {
            TextureView textureView = this.f23072c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f23072c.getWidth() > 0 && this.f23072c.getHeight() > 0) {
                    this.f23073f = Bitmaps.createBitmap(this.f23072c.getWidth(), this.f23072c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f23072c.getBitmap(this.f23073f);
                } catch (Throwable unused) {
                    this.f23073f = null;
                }
                this.d.setImageBitmap(this.f23073f);
                try {
                    this.e.removeView(this.f23072c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f23073f != null) {
            this.d.setImageDrawable(null);
            this.f23073f.recycle();
            this.f23073f = null;
        }
        try {
            this.f23077w.removeView(this.f23070a);
        } catch (Exception unused3) {
        }
        if (C == this) {
            C = null;
        }
        NotificationCenter.getInstance(this.f23071b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z4) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f23075r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23075r = animatorSet2;
        bg0 bg0Var = this.f23070a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bg0Var, property, f10);
        bg0 bg0Var2 = this.f23070a;
        Property property2 = View.SCALE_X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bg0Var2, property2, f11);
        bg0 bg0Var3 = this.f23070a;
        Property property3 = View.SCALE_Y;
        if (!z4) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(bg0Var3, property3, f12));
        this.f23075r.setDuration(150L);
        if (this.f23079y == null) {
            this.f23079y = new DecelerateInterpolator();
        }
        this.f23075r.addListener(new l00(9, this, z4));
        this.f23075r.setInterpolator(this.f23079y);
        this.f23075r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        C = this;
        this.f23076s = runnable;
        bg0 bg0Var = new bg0(this, activity);
        this.f23070a = bg0Var;
        bg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f23074n = AndroidUtilities.dp(126.0f);
        cg0 cg0Var = new cg0(this, activity, 0);
        this.e = cg0Var;
        cg0Var.setOutlineProvider(new gg.j1(10));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f23070a.addView(this.e, k7.b6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f23070a.setAlpha(1.0f);
        this.f23070a.setScaleX(0.8f);
        this.f23070a.setScaleY(0.8f);
        this.f23072c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f23072c.setScaleX(dpf2);
        this.f23072c.setScaleY(dpf2);
        this.e.addView(this.f23072c, k7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, k7.b6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f23077w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f23078x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f23078x.getInt("sidey", 0);
        float f10 = this.f23078x.getFloat("px", 0.0f);
        float f11 = this.f23078x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f23074n;
            layoutParams.x = b(true, i10, f10, i12);
            this.v.y = b(false, i11, f11, this.f23074n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f23077w, this.f23070a, layoutParams2);
            this.f23077w.addView(this.f23070a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f23071b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        cg0 cg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (cg0Var = this.e) != null) {
            cg0Var.invalidate();
        }
    }

    public final void e(boolean z4) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f23075r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f23075r = animatorSet2;
        bg0 bg0Var = this.f23070a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bg0Var, property, f10);
        bg0 bg0Var2 = this.f23070a;
        Property property2 = View.SCALE_X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bg0Var2, property2, f11);
        bg0 bg0Var3 = this.f23070a;
        Property property3 = View.SCALE_Y;
        if (!z4) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(bg0Var3, property3, f12));
        this.f23075r.setDuration(150L);
        if (this.f23079y == null) {
            this.f23079y = new DecelerateInterpolator();
        }
        this.f23075r.addListener(new dg0(this, 0));
        this.f23075r.setInterpolator(this.f23079y);
        this.f23075r.start();
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
            this.f23077w.updateViewLayout(this.f23070a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f23077w.updateViewLayout(this.f23070a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
