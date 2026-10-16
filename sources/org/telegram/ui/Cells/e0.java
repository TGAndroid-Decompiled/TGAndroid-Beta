package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sk;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.i11;
public final class e0 {
    public final Runnable f20787a;
    public boolean f20788b;
    public float f20789c;
    public int d;
    public float e;
    public int f20790f;
    public int f20791g;
    public i11 h;
    public TL_keyboard.KeyboardInlineButton f20792i;
    public BotInlineKeyboard.ButtonCustom f20793j;
    public BotInlineKeyboard.Button f20794k;
    public boolean f20795l;
    public boolean f20796m;
    public final Path f20797n = new Path();
    public final Paint f20798o = new Paint(1);
    public final RectF f20799p = new RectF();
    public final float[] f20800q = new float[8];
    public ha0 f20801r;
    public z f20802s;
    public Drawable f20803t;
    public org.telegram.ui.Components.s5 f20804u;
    public boolean v;
    public float f20805w;
    public ValueAnimator f20806x;

    public e0(Runnable runnable) {
        this.f20787a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20805w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20805w = min;
                this.f20805w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20787a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f20805w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f20787a.run();
            if (z10 && (valueAnimator = this.f20806x) != null) {
                valueAnimator.removeAllListeners();
                this.f20806x.cancel();
            }
            if (!z10) {
                float f7 = this.f20805w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20806x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20806x.addListener(new org.telegram.ui.u0(this, 9));
                    sk.l(2.0f, this.f20806x);
                    this.f20806x.setDuration(350L);
                    this.f20806x.start();
                }
            }
        }
    }
}
