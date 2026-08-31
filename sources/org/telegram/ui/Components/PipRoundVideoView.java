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
    public dg0 f24921a;
    public int f24922b;
    public TextureView f24923c;
    public ImageView d;
    public eg0 f24924e;
    public Bitmap f24925f;
    public int h;
    public int f24926n;
    public AnimatorSet f24927r;
    public Runnable f24928s;
    public WindowManager.LayoutParams v;
    public WindowManager f24929w;
    public SharedPreferences f24930x;
    public DecelerateInterpolator f24931y;

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
            TextureView textureView = this.f24923c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f24923c.getWidth() > 0 && this.f24923c.getHeight() > 0) {
                    this.f24925f = Bitmaps.createBitmap(this.f24923c.getWidth(), this.f24923c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f24923c.getBitmap(this.f24925f);
                } catch (Throwable unused) {
                    this.f24925f = null;
                }
                this.d.setImageBitmap(this.f24925f);
                try {
                    this.f24924e.removeView(this.f24923c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f24925f != null) {
            this.d.setImageDrawable(null);
            this.f24925f.recycle();
            this.f24925f = null;
        }
        try {
            this.f24929w.removeView(this.f24921a);
        } catch (Exception unused3) {
        }
        if (C == this) {
            C = null;
        }
        NotificationCenter.getInstance(this.f24922b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z4) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f24927r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24927r = animatorSet2;
        dg0 dg0Var = this.f24921a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dg0Var, property, f10);
        dg0 dg0Var2 = this.f24921a;
        Property property2 = View.SCALE_X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dg0Var2, property2, f11);
        dg0 dg0Var3 = this.f24921a;
        Property property3 = View.SCALE_Y;
        if (!z4) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(dg0Var3, property3, f12));
        this.f24927r.setDuration(150L);
        if (this.f24931y == null) {
            this.f24931y = new DecelerateInterpolator();
        }
        this.f24927r.addListener(new x20(7, this, z4));
        this.f24927r.setInterpolator(this.f24931y);
        this.f24927r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        C = this;
        this.f24928s = runnable;
        dg0 dg0Var = new dg0(this, activity);
        this.f24921a = dg0Var;
        dg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f24926n = AndroidUtilities.dp(126.0f);
        eg0 eg0Var = new eg0(this, activity, 0);
        this.f24924e = eg0Var;
        eg0Var.setOutlineProvider(new hg.j1(10));
        this.f24924e.setClipToOutline(true);
        this.f24924e.a(1.0f, 0);
        this.f24921a.addView(this.f24924e, k7.c6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f24921a.setAlpha(1.0f);
        this.f24921a.setScaleX(0.8f);
        this.f24921a.setScaleY(0.8f);
        this.f24923c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f24923c.setScaleX(dpf2);
        this.f24923c.setScaleY(dpf2);
        this.f24924e.addView(this.f24923c, k7.c6.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f24924e.addView(imageView, k7.c6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f24929w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f24930x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24930x.getInt("sidey", 0);
        float f10 = this.f24930x.getFloat("px", 0.0f);
        float f11 = this.f24930x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f24926n;
            layoutParams.x = b(true, i10, f10, i12);
            this.v.y = b(false, i11, f11, this.f24926n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f24929w, this.f24921a, layoutParams2);
            this.f24929w.addView(this.f24921a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f24922b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        eg0 eg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (eg0Var = this.f24924e) != null) {
            eg0Var.invalidate();
        }
    }

    public final void e(boolean z4) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f24927r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24927r = animatorSet2;
        dg0 dg0Var = this.f24921a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dg0Var, property, f10);
        dg0 dg0Var2 = this.f24921a;
        Property property2 = View.SCALE_X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dg0Var2, property2, f11);
        dg0 dg0Var3 = this.f24921a;
        Property property3 = View.SCALE_Y;
        if (!z4) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(dg0Var3, property3, f12));
        this.f24927r.setDuration(150L);
        if (this.f24931y == null) {
            this.f24931y = new DecelerateInterpolator();
        }
        this.f24927r.addListener(new fg0(this, 0));
        this.f24927r.setInterpolator(this.f24931y);
        this.f24927r.start();
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
            this.f24929w.updateViewLayout(this.f24921a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f24929w.updateViewLayout(this.f24921a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
