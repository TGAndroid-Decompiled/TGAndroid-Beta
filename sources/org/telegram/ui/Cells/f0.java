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
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.ha0;
public final class f0 {
    public final Runnable f21129a;
    public boolean f21130b;
    public float f21131c;
    public int d;
    public float e;
    public int f21132f;
    public int f21133g;
    public h11 h;
    public TL_keyboard.KeyboardInlineButton f21134i;
    public BotInlineKeyboard.ButtonCustom f21135j;
    public BotInlineKeyboard.Button f21136k;
    public boolean f21137l;
    public boolean f21138m;
    public final Path f21139n = new Path();
    public final Paint f21140o = new Paint(1);
    public final RectF f21141p = new RectF();
    public final float[] f21142q = new float[8];
    public ha0 f21143r;
    public z f21144s;
    public Drawable f21145t;
    public org.telegram.ui.Components.s5 f21146u;
    public boolean v;
    public float f21147w;
    public ValueAnimator f21148x;

    public f0(Runnable runnable) {
        this.f21129a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f21147w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f21147w = min;
                this.f21147w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21129a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f21147w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21129a.run();
            if (z10 && (valueAnimator = this.f21148x) != null) {
                valueAnimator.removeAllListeners();
                this.f21148x.cancel();
            }
            if (!z10) {
                float f7 = this.f21147w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21148x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f21148x.addListener(new org.telegram.ui.u0(this, 9));
                    d0.l(2.0f, this.f21148x);
                    this.f21148x.setDuration(350L);
                    this.f21148x.start();
                }
            }
        }
    }
}
