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
    public final Runnable f21812a;
    public boolean f21813b;
    public float f21814c;
    public int d;
    public float f21815e;
    public int f21816f;
    public int f21817g;
    public f01 h;
    public TL_keyboard.KeyboardInlineButton f21818i;
    public BotInlineKeyboard.ButtonCustom f21819j;
    public BotInlineKeyboard.Button f21820k;
    public boolean f21821l;
    public boolean f21822m;
    public final Path f21823n = new Path();
    public final Paint f21824o = new Paint(1);
    public final RectF f21825p = new RectF();
    public final float[] f21826q = new float[8];
    public h90 f21827r;
    public z f21828s;
    public Drawable f21829t;
    public org.telegram.ui.Components.q5 f21830u;
    public boolean v;
    public float f21831w;
    public ValueAnimator f21832x;

    public e0(Runnable runnable) {
        this.f21812a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f21831w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f21831w = min;
                this.f21831w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21812a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f21831w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21812a.run();
            if (z10 && (valueAnimator = this.f21832x) != null) {
                valueAnimator.removeAllListeners();
                this.f21832x.cancel();
            }
            if (!z10) {
                float f7 = this.f21831w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21832x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f21832x.addListener(new org.telegram.ui.s0(this, 9));
                    this.f21832x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f21832x.setDuration(350L);
                    this.f21832x.start();
                }
            }
        }
    }
}
