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
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.r11;
public final class d0 {
    public final Runnable f23963a;
    public boolean f23964b;
    public float f23965c;
    public int d;
    public float e;
    public int f23966f;
    public int f23967g;
    public r11 h;
    public TL_keyboard.KeyboardInlineButton f23968i;
    public BotInlineKeyboard.ButtonCustom f23969j;
    public BotInlineKeyboard.Button f23970k;
    public boolean f23971l;
    public boolean f23972m;
    public final Path f23973n = new Path();
    public final Paint f23974o = new Paint(1);
    public final RectF f23975p = new RectF();
    public final float[] f23976q = new float[8];
    public ea0 f23977r;
    public y f23978s;
    public Drawable f23979t;
    public org.telegram.ui.Components.t5 f23980u;
    public boolean v;
    public float f23981w;
    public ValueAnimator f23982x;

    public d0(Runnable runnable) {
        this.f23963a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f23981w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f23981w = min;
                this.f23981w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f23963a.run();
            }
        }
        return c3.h0.z(1.0f, this.f23981w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f23963a.run();
            if (z10 && (valueAnimator = this.f23982x) != null) {
                valueAnimator.removeAllListeners();
                this.f23982x.cancel();
            }
            if (!z10) {
                float f7 = this.f23981w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f23982x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f23982x.addListener(new kg.e(this, 13));
                    org.telegram.ui.d3.m(2.0f, this.f23982x);
                    this.f23982x.setDuration(350L);
                    this.f23982x.start();
                }
            }
        }
    }
}
