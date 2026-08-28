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
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.p80;
public final class e0 {
    public final Runnable f24249a;
    public boolean f24250b;
    public float f24251c;
    public int d;
    public float f24252e;
    public int f24253f;
    public int f24254g;
    public nz0 h;
    public TL_keyboard.KeyboardInlineButton f24255i;
    public BotInlineKeyboard.ButtonCustom f24256j;
    public BotInlineKeyboard.Button f24257k;
    public boolean f24258l;
    public boolean f24259m;
    public final Path f24260n = new Path();
    public final Paint f24261o = new Paint(1);
    public final RectF f24262p = new RectF();
    public final float[] f24263q = new float[8];
    public p80 f24264r;
    public z f24265s;
    public Drawable f24266t;
    public org.telegram.ui.Components.k5 f24267u;
    public boolean v;
    public float f24268w;
    public ValueAnimator f24269x;

    public e0(Runnable runnable) {
        this.f24249a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f24268w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                this.f24268w = min;
                this.f24268w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f24249a.run();
            }
        }
        return e2.c.z(1.0f, this.f24268w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f24249a.run();
            if (z10 && (valueAnimator = this.f24269x) != null) {
                valueAnimator.removeAllListeners();
                this.f24269x.cancel();
            }
            if (!z10) {
                float f10 = this.f24268w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f24269x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f24269x.addListener(new mh.x(this, 12));
                    this.f24269x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f24269x.setDuration(350L);
                    this.f24269x.start();
                }
            }
        }
    }
}
