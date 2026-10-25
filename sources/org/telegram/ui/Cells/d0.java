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
    public final Runnable f23960a;
    public boolean f23961b;
    public float f23962c;
    public int d;
    public float e;
    public int f23963f;
    public int f23964g;
    public q11 h;
    public TL_keyboard.KeyboardInlineButton f23965i;
    public BotInlineKeyboard.ButtonCustom f23966j;
    public BotInlineKeyboard.Button f23967k;
    public boolean f23968l;
    public boolean f23969m;
    public final Path f23970n = new Path();
    public final Paint f23971o = new Paint(1);
    public final RectF f23972p = new RectF();
    public final float[] f23973q = new float[8];
    public da0 f23974r;
    public y f23975s;
    public Drawable f23976t;
    public org.telegram.ui.Components.t5 f23977u;
    public boolean v;
    public float f23978w;
    public ValueAnimator f23979x;

    public d0(Runnable runnable) {
        this.f23960a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f23978w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f23978w = min;
                this.f23978w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f23960a.run();
            }
        }
        return c3.h0.z(1.0f, this.f23978w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f23960a.run();
            if (z10 && (valueAnimator = this.f23979x) != null) {
                valueAnimator.removeAllListeners();
                this.f23979x.cancel();
            }
            if (!z10) {
                float f7 = this.f23978w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f23979x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f23979x.addListener(new kg.e(this, 13));
                    org.telegram.ui.d3.m(2.0f, this.f23979x);
                    this.f23979x.setDuration(350L);
                    this.f23979x.start();
                }
            }
        }
    }
}
