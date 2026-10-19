package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.e11;
public final class e0 {
    public final Runnable f22153a;
    public boolean f22154b;
    public float f22155c;
    public int d;
    public float e;
    public int f22156f;
    public int f22157g;
    public e11 h;
    public TL_keyboard.KeyboardInlineButton f22158i;
    public BotInlineKeyboard.ButtonCustom f22159j;
    public BotInlineKeyboard.Button f22160k;
    public boolean f22161l;
    public boolean f22162m;
    public final Path f22163n = new Path();
    public final Paint f22164o = new Paint(1);
    public final RectF f22165p = new RectF();
    public final float[] f22166q = new float[8];
    public ba0 f22167r;
    public z f22168s;
    public Drawable f22169t;
    public org.telegram.ui.Components.r5 f22170u;
    public boolean v;
    public float f22171w;
    public ValueAnimator f22172x;

    public e0(Runnable runnable) {
        this.f22153a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22171w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22171w = min;
                this.f22171w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22153a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f22171w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22153a.run();
            if (z10 && (valueAnimator = this.f22172x) != null) {
                valueAnimator.removeAllListeners();
                this.f22172x.cancel();
            }
            if (!z10) {
                float f7 = this.f22171w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22172x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22172x.addListener(new m.a(this, 11));
                    kk.l(2.0f, this.f22172x);
                    this.f22172x.setDuration(350L);
                    this.f22172x.start();
                }
            }
        }
    }
}
