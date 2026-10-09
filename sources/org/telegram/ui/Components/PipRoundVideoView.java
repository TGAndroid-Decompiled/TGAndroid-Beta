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
    public yg0 f24212a;
    public int f24213b;
    public TextureView f24214c;
    public ImageView d;
    public zg0 f24215e;
    public Bitmap f24216f;
    public int h;
    public int f24217n;
    public AnimatorSet f24218r;
    public Runnable f24219s;
    public WindowManager.LayoutParams v;
    public WindowManager f24220w;
    public SharedPreferences f24221x;
    public DecelerateInterpolator f24222y;

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
            TextureView textureView = this.f24214c;
            if (textureView != null && textureView.getParent() != null) {
                if (this.f24214c.getWidth() > 0 && this.f24214c.getHeight() > 0) {
                    this.f24216f = Bitmaps.createBitmap(this.f24214c.getWidth(), this.f24214c.getHeight(), Bitmap.Config.ARGB_8888);
                }
                try {
                    this.f24214c.getBitmap(this.f24216f);
                } catch (Throwable unused) {
                    this.f24216f = null;
                }
                this.d.setImageBitmap(this.f24216f);
                try {
                    this.f24215e.removeView(this.f24214c);
                } catch (Exception unused2) {
                }
                this.d.setVisibility(0);
                c(false);
                return;
            }
            return;
        }
        if (this.f24216f != null) {
            this.d.setImageDrawable(null);
            this.f24216f.recycle();
            this.f24216f = null;
        }
        try {
            this.f24220w.removeView(this.f24212a);
        } catch (Exception unused3) {
        }
        if (F == this) {
            F = null;
        }
        NotificationCenter.getInstance(this.f24213b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
    }

    public final void c(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24218r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24218r = animatorSet2;
        yg0 yg0Var = this.f24212a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yg0Var, property, f7);
        yg0 yg0Var2 = this.f24212a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yg0Var2, property2, f10);
        yg0 yg0Var3 = this.f24212a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(yg0Var3, property3, f11));
        this.f24218r.setDuration(150L);
        if (this.f24222y == null) {
            this.f24222y = new DecelerateInterpolator();
        }
        this.f24218r.addListener(new fa(17, this, z10));
        this.f24218r.setInterpolator(this.f24222y);
        this.f24218r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        F = this;
        this.f24219s = runnable;
        yg0 yg0Var = new yg0(this, activity);
        this.f24212a = yg0Var;
        yg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.f24217n = AndroidUtilities.dp(126.0f);
        zg0 zg0Var = new zg0(this, activity, 0);
        this.f24215e = zg0Var;
        zg0Var.setOutlineProvider(new ai.l2(14));
        this.f24215e.setClipToOutline(true);
        this.f24215e.a(1.0f, 0);
        this.f24212a.addView(this.f24215e, w7.x5.a(120.0f, 3.0f, 3.0f, 0.0f, 0.0f, 120, 51));
        this.f24212a.setAlpha(1.0f);
        this.f24212a.setScaleX(0.8f);
        this.f24212a.setScaleY(0.8f);
        this.f24214c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.f24214c.setScaleX(dpf2);
        this.f24214c.setScaleY(dpf2);
        this.f24215e.addView(this.f24214c, w7.x5.d(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.f24215e.addView(imageView, w7.x5.d(-1.0f, -1));
        this.d.setVisibility(4);
        this.f24220w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.f24221x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.f24221x.getInt("sidey", 0);
        float f7 = this.f24221x.getFloat("px", 0.0f);
        float f10 = this.f24221x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.f24217n;
            layoutParams.x = b(true, i10, f7, i12);
            this.v.y = b(false, i11, f10, this.f24217n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.f24220w, this.f24212a, layoutParams2);
            this.f24220w.addView(this.f24212a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.f24213b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zg0 zg0Var;
        if (i10 == NotificationCenter.messagePlayingProgressDidChanged && (zg0Var = this.f24215e) != null) {
            zg0Var.invalidate();
        }
    }

    public final void e(boolean z10) {
        float f7;
        float f10;
        AnimatorSet animatorSet = this.f24218r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f24218r = animatorSet2;
        yg0 yg0Var = this.f24212a;
        Property property = View.ALPHA;
        float f11 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yg0Var, property, f7);
        yg0 yg0Var2 = this.f24212a;
        Property property2 = View.SCALE_X;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.8f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yg0Var2, property2, f10);
        yg0 yg0Var3 = this.f24212a;
        Property property3 = View.SCALE_Y;
        if (!z10) {
            f11 = 0.8f;
        }
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(yg0Var3, property3, f11));
        this.f24218r.setDuration(150L);
        if (this.f24222y == null) {
            this.f24222y = new DecelerateInterpolator();
        }
        this.f24218r.addListener(new ah0(this, 0));
        this.f24218r.setInterpolator(this.f24222y);
        this.f24218r.start();
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
            this.f24220w.updateViewLayout(this.f24212a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.f24220w.updateViewLayout(this.f24212a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
