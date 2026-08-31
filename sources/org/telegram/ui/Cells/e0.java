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
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l01;
public final class e0 {
    public final Runnable f22698a;
    public boolean f22699b;
    public float f22700c;
    public int d;
    public float f22701e;
    public int f22702f;
    public int f22703g;
    public l01 h;
    public TL_keyboard.KeyboardInlineButton f22704i;
    public BotInlineKeyboard.ButtonCustom f22705j;
    public BotInlineKeyboard.Button f22706k;
    public boolean f22707l;
    public boolean f22708m;
    public final Path f22709n = new Path();
    public final Paint f22710o = new Paint(1);
    public final RectF f22711p = new RectF();
    public final float[] f22712q = new float[8];
    public k90 f22713r;
    public z f22714s;
    public Drawable f22715t;
    public org.telegram.ui.Components.l5 f22716u;
    public boolean v;
    public float f22717w;
    public ValueAnimator f22718x;

    public e0(Runnable runnable) {
        this.f22698a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f22717w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                this.f22717w = min;
                this.f22717w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22698a.run();
            }
        }
        return e2.c.w(1.0f, this.f22717w, 0.04f, 0.96f);
    }

    public final void b(boolean z4) {
        ValueAnimator valueAnimator;
        if (this.v != z4) {
            this.v = z4;
            this.f22698a.run();
            if (z4 && (valueAnimator = this.f22718x) != null) {
                valueAnimator.removeAllListeners();
                this.f22718x.cancel();
            }
            if (!z4) {
                float f10 = this.f22717w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f22718x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22718x.addListener(new org.telegram.ui.s5(this, 5));
                    this.f22718x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f22718x.setDuration(350L);
                    this.f22718x.start();
                }
            }
        }
    }
}
