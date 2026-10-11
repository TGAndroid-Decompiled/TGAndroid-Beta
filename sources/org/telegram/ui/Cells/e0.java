package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ai;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.n11;
public final class e0 {
    public final Runnable f21990a;
    public boolean f21991b;
    public float f21992c;
    public int d;
    public float f21993e;
    public int f21994f;
    public int f21995g;
    public n11 h;
    public TL_keyboard.KeyboardInlineButton f21996i;
    public BotInlineKeyboard.ButtonCustom f21997j;
    public BotInlineKeyboard.Button f21998k;
    public boolean f21999l;
    public boolean f22000m;
    public final Path f22001n = new Path();
    public final Paint f22002o = new Paint(1);
    public final RectF f22003p = new RectF();
    public final float[] f22004q = new float[8];
    public ja0 f22005r;
    public z f22006s;
    public Drawable f22007t;
    public org.telegram.ui.Components.s5 f22008u;
    public boolean v;
    public float f22009w;
    public ValueAnimator f22010x;

    public e0(Runnable runnable) {
        this.f21990a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22009w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22009w = min;
                this.f22009w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21990a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f22009w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21990a.run();
            if (z10 && (valueAnimator = this.f22010x) != null) {
                valueAnimator.removeAllListeners();
                this.f22010x.cancel();
            }
            if (!z10) {
                float f7 = this.f22009w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22010x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22010x.addListener(new org.telegram.ui.s4(this, 6));
                    ai.l(2.0f, this.f22010x);
                    this.f22010x.setDuration(350L);
                    this.f22010x.start();
                }
            }
        }
    }
}
