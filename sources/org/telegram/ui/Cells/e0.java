package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.d11;
public final class e0 {
    public final Runnable f22155a;
    public boolean f22156b;
    public float f22157c;
    public int d;
    public float e;
    public int f22158f;
    public int f22159g;
    public d11 h;
    public TL_keyboard.KeyboardInlineButton f22160i;
    public BotInlineKeyboard.ButtonCustom f22161j;
    public BotInlineKeyboard.Button f22162k;
    public boolean f22163l;
    public boolean f22164m;
    public final Path f22165n = new Path();
    public final Paint f22166o = new Paint(1);
    public final RectF f22167p = new RectF();
    public final float[] f22168q = new float[8];
    public ba0 f22169r;
    public z f22170s;
    public Drawable f22171t;
    public org.telegram.ui.Components.r5 f22172u;
    public boolean v;
    public float f22173w;
    public ValueAnimator f22174x;

    public e0(Runnable runnable) {
        this.f22155a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22173w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22173w = min;
                this.f22173w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22155a.run();
            }
        }
        return com.google.android.gms.internal.cast.a6.x(1.0f, this.f22173w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22155a.run();
            if (z10 && (valueAnimator = this.f22174x) != null) {
                valueAnimator.removeAllListeners();
                this.f22174x.cancel();
            }
            if (!z10) {
                float f7 = this.f22173w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22174x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22174x.addListener(new m.a(this, 11));
                    wh.l(2.0f, this.f22174x);
                    this.f22174x.setDuration(350L);
                    this.f22174x.start();
                }
            }
        }
    }
}
