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
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.k01;
public final class e0 {
    public final Runnable f20962a;
    public boolean f20963b;
    public float f20964c;
    public int d;
    public float e;
    public int f20965f;
    public int f20966g;
    public k01 h;
    public TL_keyboard.KeyboardInlineButton f20967i;
    public BotInlineKeyboard.ButtonCustom f20968j;
    public BotInlineKeyboard.Button f20969k;
    public boolean f20970l;
    public boolean f20971m;
    public final Path f20972n = new Path();
    public final Paint f20973o = new Paint(1);
    public final RectF f20974p = new RectF();
    public final float[] f20975q = new float[8];
    public i90 f20976r;
    public z f20977s;
    public Drawable f20978t;
    public org.telegram.ui.Components.l5 f20979u;
    public boolean v;
    public float f20980w;
    public ValueAnimator f20981x;

    public e0(Runnable runnable) {
        this.f20962a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f20980w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                this.f20980w = min;
                this.f20980w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20962a.run();
            }
        }
        return e2.c.w(1.0f, this.f20980w, 0.04f, 0.96f);
    }

    public final void b(boolean z4) {
        ValueAnimator valueAnimator;
        if (this.v != z4) {
            this.v = z4;
            this.f20962a.run();
            if (z4 && (valueAnimator = this.f20981x) != null) {
                valueAnimator.removeAllListeners();
                this.f20981x.cancel();
            }
            if (!z4) {
                float f10 = this.f20980w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f20981x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20981x.addListener(new org.telegram.ui.s5(this, 5));
                    this.f20981x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20981x.setDuration(350L);
                    this.f20981x.start();
                }
            }
        }
    }
}
