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
    public final Runnable f21838a;
    public boolean f21839b;
    public float f21840c;
    public int d;
    public float f21841e;
    public int f21842f;
    public int f21843g;
    public f01 h;
    public TL_keyboard.KeyboardInlineButton f21844i;
    public BotInlineKeyboard.ButtonCustom f21845j;
    public BotInlineKeyboard.Button f21846k;
    public boolean f21847l;
    public boolean f21848m;
    public final Path f21849n = new Path();
    public final Paint f21850o = new Paint(1);
    public final RectF f21851p = new RectF();
    public final float[] f21852q = new float[8];
    public h90 f21853r;
    public z f21854s;
    public Drawable f21855t;
    public org.telegram.ui.Components.q5 f21856u;
    public boolean v;
    public float f21857w;
    public ValueAnimator f21858x;

    public e0(Runnable runnable) {
        this.f21838a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f21857w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f21857w = min;
                this.f21857w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21838a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f21857w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21838a.run();
            if (z10 && (valueAnimator = this.f21858x) != null) {
                valueAnimator.removeAllListeners();
                this.f21858x.cancel();
            }
            if (!z10) {
                float f7 = this.f21857w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21858x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f21858x.addListener(new org.telegram.ui.s0(this, 9));
                    this.f21858x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f21858x.setDuration(350L);
                    this.f21858x.start();
                }
            }
        }
    }
}
