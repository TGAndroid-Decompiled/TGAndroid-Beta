package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.sl;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.i11;
public final class d0 {
    public final Runnable f22233a;
    public boolean f22234b;
    public float f22235c;
    public int d;
    public float e;
    public int f22236f;
    public int f22237g;
    public i11 h;
    public TL_keyboard.KeyboardInlineButton f22238i;
    public BotInlineKeyboard.ButtonCustom f22239j;
    public BotInlineKeyboard.Button f22240k;
    public boolean f22241l;
    public boolean f22242m;
    public final Path f22243n = new Path();
    public final Paint f22244o = new Paint(1);
    public final RectF f22245p = new RectF();
    public final float[] f22246q = new float[8];
    public ca0 f22247r;
    public y f22248s;
    public Drawable f22249t;
    public org.telegram.ui.Components.r5 f22250u;
    public boolean v;
    public float f22251w;
    public ValueAnimator f22252x;

    public d0(Runnable runnable) {
        this.f22233a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22251w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22251w = min;
                this.f22251w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22233a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f22251w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22233a.run();
            if (z10 && (valueAnimator = this.f22252x) != null) {
                valueAnimator.removeAllListeners();
                this.f22252x.cancel();
            }
            if (!z10) {
                float f7 = this.f22251w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22252x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22252x.addListener(new m.a(this, 11));
                    sl.l(2.0f, this.f22252x);
                    this.f22252x.setDuration(350L);
                    this.f22252x.start();
                }
            }
        }
    }
}
