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
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.t80;

public final class e0 {

    public final Runnable f24231a;

    public boolean f24232b;

    public float f24233c;
    public int d;

    public float f24234e;

    public int f24235f;

    public int f24236g;
    public pz0 h;

    public TL_keyboard.KeyboardInlineButton f24237i;

    public BotInlineKeyboard.ButtonCustom f24238j;

    public BotInlineKeyboard.Button f24239k;

    public boolean f24240l;

    public boolean f24241m;

    public final Path f24242n = new Path();

    public final Paint f24243o = new Paint(1);

    public final RectF f24244p = new RectF();

    public final float[] f24245q = new float[8];

    public t80 f24246r;

    public z f24247s;

    public Drawable f24248t;

    public org.telegram.ui.Components.k5 f24249u;
    public boolean v;

    public float f24250w;

    public ValueAnimator f24251x;

    public e0(Runnable runnable) {
        this.f24231a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f24250w;
            if (f10 != 1.0f) {
                float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                this.f24250w = fMin;
                this.f24250w = Utilities.clamp(fMin, 1.0f, 0.0f);
                this.f24231a.run();
            }
        }
        return com.google.android.recaptcha.internal.a.z(1.0f, this.f24250w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f24231a.run();
            if (z10 && (valueAnimator = this.f24251x) != null) {
                valueAnimator.removeAllListeners();
                this.f24251x.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.f24250w;
            if (f10 != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.f24251x = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new r(this, 1));
                this.f24251x.addListener(new lh.h9(this, 14));
                this.f24251x.setInterpolator(new OvershootInterpolator(2.0f));
                this.f24251x.setDuration(350L);
                this.f24251x.start();
            }
        }
    }
}
