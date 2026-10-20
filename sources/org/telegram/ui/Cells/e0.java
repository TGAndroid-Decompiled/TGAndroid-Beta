package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mk;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.f11;
public final class e0 {
    public final Runnable f22156a;
    public boolean f22157b;
    public float f22158c;
    public int d;
    public float e;
    public int f22159f;
    public int f22160g;
    public f11 h;
    public TL_keyboard.KeyboardInlineButton f22161i;
    public BotInlineKeyboard.ButtonCustom f22162j;
    public BotInlineKeyboard.Button f22163k;
    public boolean f22164l;
    public boolean f22165m;
    public final Path f22166n = new Path();
    public final Paint f22167o = new Paint(1);
    public final RectF f22168p = new RectF();
    public final float[] f22169q = new float[8];
    public ba0 f22170r;
    public z f22171s;
    public Drawable f22172t;
    public org.telegram.ui.Components.r5 f22173u;
    public boolean v;
    public float f22174w;
    public ValueAnimator f22175x;

    public e0(Runnable runnable) {
        this.f22156a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22174w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22174w = min;
                this.f22174w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22156a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f22174w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22156a.run();
            if (z10 && (valueAnimator = this.f22175x) != null) {
                valueAnimator.removeAllListeners();
                this.f22175x.cancel();
            }
            if (!z10) {
                float f7 = this.f22174w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22175x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22175x.addListener(new m.a(this, 11));
                    mk.l(2.0f, this.f22175x);
                    this.f22175x.setDuration(350L);
                    this.f22175x.start();
                }
            }
        }
    }
}
