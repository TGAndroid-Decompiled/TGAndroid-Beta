package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.m11;
public final class e0 {
    public final Runnable f22002a;
    public boolean f22003b;
    public float f22004c;
    public int d;
    public float f22005e;
    public int f22006f;
    public int f22007g;
    public m11 h;
    public TL_keyboard.KeyboardInlineButton f22008i;
    public BotInlineKeyboard.ButtonCustom f22009j;
    public BotInlineKeyboard.Button f22010k;
    public boolean f22011l;
    public boolean f22012m;
    public final Path f22013n = new Path();
    public final Paint f22014o = new Paint(1);
    public final RectF f22015p = new RectF();
    public final float[] f22016q = new float[8];
    public ja0 f22017r;
    public z f22018s;
    public Drawable f22019t;
    public org.telegram.ui.Components.s5 f22020u;
    public boolean v;
    public float f22021w;
    public ValueAnimator f22022x;

    public e0(Runnable runnable) {
        this.f22002a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22021w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22021w = min;
                this.f22021w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22002a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f22021w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22002a.run();
            if (z10 && (valueAnimator = this.f22022x) != null) {
                valueAnimator.removeAllListeners();
                this.f22022x.cancel();
            }
            if (!z10) {
                float f7 = this.f22021w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22022x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22022x.addListener(new org.telegram.ui.t4(this, 6));
                    bi.l(2.0f, this.f22022x);
                    this.f22022x.setDuration(350L);
                    this.f22022x.start();
                }
            }
        }
    }
}
