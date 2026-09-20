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
    public fg0 f22301a;
    public int f22302b;
    public TextureView f22303c;
    public ImageView d;
    public gg0 e;
    public Bitmap f22304f;
    public int h;
    public int f22305n;
    public AnimatorSet f22306r;
    public Runnable f22307s;
    public WindowManager.LayoutParams v;
    public WindowManager f22308w;
    public SharedPreferences f22309x;
    public DecelerateInterpolator f22310y;

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
            TextureView textureView = this.f22303c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f22303c.getWidth() > 0 && this.f22303c.getHeight() > 0) {
                    this.f22304f = Bitmaps.createBitmap(this.f22303c.getWidth(), this.f22303c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f22303c.getBitmap(this.f22304f);
                } catch (Throwable unused) {
                    this.f22304f = null;
                }
                this.d.setImageBitmap(this.f22304f);
                try {
                    this.e.removeView(this.f22303c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f22304f != null) {
            this.d.setImageDrawable(null);
            this.f22304f.recycle();
            this.f22304f = null;
        }
        try {
            this.f22308w.removeView(this.f22301a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f22302b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f22306r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22306r = animatorSet2;
        fg0 fg0Var = this.f22301a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fg0Var, property, f7);
        fg0 fg0Var2 = this.f22301a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fg0Var2, property2, f10);
        fg0 fg0Var3 = this.f22301a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(fg0Var3, property3, f11));
        this.f22306r.setDuration(150L);
        if (this.f22310y == null) {
            this.f22310y = new DecelerateInterpolator();
        }
        this.f22306r.addListener(new ba(17, this, z10));
        this.f22306r.setInterpolator(this.f22310y);
        this.f22306r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f22307s = runnable;
        fg0 fg0Var = new fg0(this, activity);
        this.f22301a = fg0Var;
        fg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f22305n = AndroidUtilities.dp(126.0f);
        gg0 gg0Var = new gg0(this, activity, 0);
        this.e = gg0Var;
        gg0Var.setOutlineProvider(new ai.k2(14));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.f22301a.addView(this.e, w7.y5.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f22301a.setAlpha(1.0f);
        this.f22301a.setScaleX(0.8f);
        this.f22301a.setScaleY(0.8f);
        this.f22303c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f22303c.setScaleX(dpf2);
        this.f22303c.setScaleY(dpf2);
        this.e.addView(this.f22303c, w7.y5.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, w7.y5.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f22308w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f22309x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f22309x.getInt("sidey", 0);
        float f7 = this.f22309x.getFloat("px", 0.0f);
        float f10 = this.f22309x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f22305n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f22305n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f22308w, this.f22301a, layoutParams2);
            this.f22308w.addView(this.f22301a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f22302b = i13;
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
        AnimatorSet animatorSet = this.f22306r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f22306r = animatorSet2;
        fg0 fg0Var = this.f22301a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fg0Var, property, f7);
        fg0 fg0Var2 = this.f22301a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fg0Var2, property2, f10);
        fg0 fg0Var3 = this.f22301a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(fg0Var3, property3, f11));
        this.f22306r.setDuration(150L);
        if (this.f22310y == null) {
            this.f22310y = new DecelerateInterpolator();
        }
        this.f22306r.addListener(new hg0(this, 0));
        this.f22306r.setInterpolator(this.f22310y);
        this.f22306r.start();
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
            this.f22308w.updateViewLayout(this.f22301a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f22308w.updateViewLayout(this.f22301a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
