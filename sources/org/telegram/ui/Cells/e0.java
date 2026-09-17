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
    public final Runnable f21839a;
    public boolean f21840b;
    public float f21841c;
    public int d;
    public float f21842e;
    public int f21843f;
    public int f21844g;
    public f01 h;
    public TL_keyboard.KeyboardInlineButton f21845i;
    public BotInlineKeyboard.ButtonCustom f21846j;
    public BotInlineKeyboard.Button f21847k;
    public boolean f21848l;
    public boolean f21849m;
    public final Path f21850n = new Path();
    public final Paint f21851o = new Paint(1);
    public final RectF f21852p = new RectF();
    public final float[] f21853q = new float[8];
    public h90 f21854r;
    public z f21855s;
    public Drawable f21856t;
    public org.telegram.ui.Components.q5 f21857u;
    public boolean v;
    public float f21858w;
    public ValueAnimator f21859x;

    public e0(Runnable runnable) {
        this.f21839a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f21858w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f21858w = min;
                this.f21858w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21839a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f21858w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21839a.run();
            if (z10 && (valueAnimator = this.f21859x) != null) {
                valueAnimator.removeAllListeners();
                this.f21859x.cancel();
            }
            if (!z10) {
                float f7 = this.f21858w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21859x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f21859x.addListener(new org.telegram.ui.s0(this, 9));
                    this.f21859x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f21859x.setDuration(350L);
                    this.f21859x.start();
                }
            }
        }
    }
}
