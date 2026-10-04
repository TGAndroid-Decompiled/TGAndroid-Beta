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
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.u90;
public final class e0 {
    public final Runnable f21996a;
    public boolean f21997b;
    public float f21998c;
    public int d;
    public float f21999e;
    public int f22000f;
    public int f22001g;
    public e11 h;
    public TL_keyboard.KeyboardInlineButton f22002i;
    public BotInlineKeyboard.ButtonCustom f22003j;
    public BotInlineKeyboard.Button f22004k;
    public boolean f22005l;
    public boolean f22006m;
    public final Path f22007n = new Path();
    public final Paint f22008o = new Paint(1);
    public final RectF f22009p = new RectF();
    public final float[] f22010q = new float[8];
    public u90 f22011r;
    public z f22012s;
    public Drawable f22013t;
    public org.telegram.ui.Components.q5 f22014u;
    public boolean v;
    public float f22015w;
    public ValueAnimator f22016x;

    public e0(Runnable runnable) {
        this.f21996a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22015w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22015w = min;
                this.f22015w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21996a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f22015w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21996a.run();
            if (z10 && (valueAnimator = this.f22016x) != null) {
                valueAnimator.removeAllListeners();
                this.f22016x.cancel();
            }
            if (!z10) {
                float f7 = this.f22015w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22016x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22016x.addListener(new org.telegram.ui.u4(this, 6));
                    this.f22016x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f22016x.setDuration(350L);
                    this.f22016x.start();
                }
            }
        }
    }
}
