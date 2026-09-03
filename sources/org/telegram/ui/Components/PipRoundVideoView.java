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
    public dg0 f24923a;
    public int f24924b;
    public TextureView f24925c;
    public ImageView d;
    public eg0 f24926e;
    public Bitmap f24927f;
    public int h;
    public int f24928n;
    public AnimatorSet f24929r;
    public Runnable f24930s;
    public WindowManager.LayoutParams v;
    public WindowManager f24931w;
    public SharedPreferences f24932x;
    public DecelerateInterpolator f24933y;

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
            TextureView textureView = this.f24925c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f24925c.getWidth() > 0 && this.f24925c.getHeight() > 0) {
                    this.f24927f = Bitmaps.createBitmap(this.f24925c.getWidth(), this.f24925c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f24925c.getBitmap(this.f24927f);
                } catch (Throwable unused) {
                    this.f24927f = null;
                }
                this.d.setImageBitmap(this.f24927f);
                try {
                    this.f24926e.removeView(this.f24925c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f24927f != null) {
            this.d.setImageDrawable(null);
            this.f24927f.recycle();
            this.f24927f = null;
        }
        try {
            this.f24931w.removeView(this.f24923a);
        } catch (Exception unused3) {
        }
        if (C == this) {
            C = null;
        }
        NotificationCenter.getInstance(this.f24924b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z4) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f24929r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24929r = animatorSet2;
        dg0 dg0Var = this.f24923a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dg0Var, property, f10);
        dg0 dg0Var2 = this.f24923a;
        Property property2 = View.SCALE_X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dg0Var2, property2, f11);
        dg0 dg0Var3 = this.f24923a;
        Property property3 = View.SCALE_Y;
        if (!z4) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(dg0Var3, property3, f12));
        this.f24929r.setDuration(150L);
        if (this.f24933y == null) {
            this.f24933y = new DecelerateInterpolator();
        }
        this.f24929r.addListener(new x20(7, this, z4));
        this.f24929r.setInterpolator(this.f24933y);
        this.f24929r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        C = this;
        this.f24930s = runnable;
        dg0 dg0Var = new dg0(this, activity);
        this.f24923a = dg0Var;
        dg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f24928n = AndroidUtilities.dp(126.0f);
        eg0 eg0Var = new eg0(this, activity, 0);
        this.f24926e = eg0Var;
        eg0Var.setOutlineProvider(new hg.j1(10));
        this.f24926e.setClipToOutline(true);
        this.f24926e.a(1.0f, 0);
        this.f24923a.addView(this.f24926e, k7.c6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.f24923a.setAlpha(1.0f);
        this.f24923a.setScaleX(0.8f);
        this.f24923a.setScaleY(0.8f);
        this.f24925c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f24925c.setScaleX(dpf2);
        this.f24925c.setScaleY(dpf2);
        this.f24926e.addView(this.f24925c, k7.c6.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f24926e.addView(imageView, k7.c6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.f24931w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f24932x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24932x.getInt("sidey", 0);
        float f10 = this.f24932x.getFloat("px", 0.0f);
        float f11 = this.f24932x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f24928n;
            layoutParams.x = b(true, i10, f10, i12);
            this.v.y = b(false, i11, f11, this.f24928n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f24931w, this.f24923a, layoutParams2);
            this.f24931w.addView(this.f24923a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f24924b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        eg0 eg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (eg0Var = this.f24926e) != null) {
            eg0Var.invalidate();
        }
    }

    public final void e(boolean z4) {
        float f10;
        float f11;
        AnimatorSet animatorSet = this.f24929r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24929r = animatorSet2;
        dg0 dg0Var = this.f24923a;
        Property property = View.ALPHA;
        float f12 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dg0Var, property, f10);
        dg0 dg0Var2 = this.f24923a;
        Property property2 = View.SCALE_X;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dg0Var2, property2, f11);
        dg0 dg0Var3 = this.f24923a;
        Property property3 = View.SCALE_Y;
        if (!z4) {
            f12 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(dg0Var3, property3, f12));
        this.f24929r.setDuration(150L);
        if (this.f24933y == null) {
            this.f24933y = new DecelerateInterpolator();
        }
        this.f24929r.addListener(new fg0(this, 0));
        this.f24929r.setInterpolator(this.f24933y);
        this.f24929r.start();
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
            this.f24931w.updateViewLayout(this.f24923a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f24931w.updateViewLayout(this.f24923a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
