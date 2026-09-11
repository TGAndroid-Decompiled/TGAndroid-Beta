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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h90;
public final class e0 {
    public final Runnable f21811a;
    public boolean f21812b;
    public float f21813c;
    public int d;
    public float f21814e;
    public int f21815f;
    public int f21816g;
    public f01 h;
    public TL_keyboard.KeyboardInlineButton f21817i;
    public BotInlineKeyboard.ButtonCustom f21818j;
    public BotInlineKeyboard.Button f21819k;
    public boolean f21820l;
    public boolean f21821m;
    public final Path f21822n = new Path();
    public final Paint f21823o = new Paint(1);
    public final RectF f21824p = new RectF();
    public final float[] f21825q = new float[8];
    public h90 f21826r;
    public z f21827s;
    public Drawable f21828t;
    public org.telegram.ui.Components.q5 f21829u;
    public boolean v;
    public float f21830w;
    public ValueAnimator f21831x;

    public e0(Runnable runnable) {
        this.f21811a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f21830w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f21830w = min;
                this.f21830w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21811a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f21830w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21811a.run();
            if (z10 && (valueAnimator = this.f21831x) != null) {
                valueAnimator.removeAllListeners();
                this.f21831x.cancel();
            }
            if (!z10) {
                float f7 = this.f21830w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21831x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f21831x.addListener(new org.telegram.ui.s0(this, 9));
                    this.f21831x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f21831x.setDuration(350L);
                    this.f21831x.start();
                }
            }
        }
    }
}
