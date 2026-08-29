package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.zz0;
public final class e0 {
    public final Runnable f24248a;
    public boolean f24249b;
    public float f24250c;
    public int d;
    public float f24251e;
    public int f24252f;
    public int f24253g;
    public zz0 h;
    public TL_keyboard.KeyboardInlineButton f24254i;
    public BotInlineKeyboard.ButtonCustom f24255j;
    public BotInlineKeyboard.Button f24256k;
    public boolean f24257l;
    public boolean f24258m;
    public final Path f24259n = new Path();
    public final Paint f24260o = new Paint(1);
    public final RectF f24261p = new RectF();
    public final float[] f24262q = new float[8];
    public c90 f24263r;
    public z f24264s;
    public Drawable f24265t;
    public org.telegram.ui.Components.p5 f24266u;
    public boolean v;
    public float f24267w;
    public ValueAnimator f24268x;

    public e0(Runnable runnable) {
        this.f24248a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f9 = this.f24267w;
            if (f9 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f9;
                this.f24267w = min;
                this.f24267w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f24248a.run();
            }
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f24267w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f24248a.run();
            if (z10 && (valueAnimator = this.f24268x) != null) {
                valueAnimator.removeAllListeners();
                this.f24268x.cancel();
            }
            if (!z10) {
                float f9 = this.f24267w;
                if (f9 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                    this.f24268x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f24268x.addListener(new nh.q5(this, 14));
                    this.f24268x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f24268x.setDuration(350L);
                    this.f24268x.start();
                }
            }
        }
    }
}
