package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.q11;
public final class d0 {
    public final Runnable f23962a;
    public boolean f23963b;
    public float f23964c;
    public int d;
    public float e;
    public int f23965f;
    public int f23966g;
    public q11 h;
    public TL_keyboard.KeyboardInlineButton f23967i;
    public BotInlineKeyboard.ButtonCustom f23968j;
    public BotInlineKeyboard.Button f23969k;
    public boolean f23970l;
    public boolean f23971m;
    public final Path f23972n = new Path();
    public final Paint f23973o = new Paint(1);
    public final RectF f23974p = new RectF();
    public final float[] f23975q = new float[8];
    public da0 f23976r;
    public y f23977s;
    public Drawable f23978t;
    public org.telegram.ui.Components.t5 f23979u;
    public boolean v;
    public float f23980w;
    public ValueAnimator f23981x;

    public d0(Runnable runnable) {
        this.f23962a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f23980w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f23980w = min;
                this.f23980w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f23962a.run();
            }
        }
        return c3.h0.z(1.0f, this.f23980w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f23962a.run();
            if (z10 && (valueAnimator = this.f23981x) != null) {
                valueAnimator.removeAllListeners();
                this.f23981x.cancel();
            }
            if (!z10) {
                float f7 = this.f23980w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f23981x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f23981x.addListener(new kg.e(this, 13));
                    org.telegram.ui.d3.m(2.0f, this.f23981x);
                    this.f23981x.setDuration(350L);
                    this.f23981x.start();
                }
            }
        }
    }
}
