package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lk;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.d11;
public final class e0 {
    public final Runnable f22152a;
    public boolean f22153b;
    public float f22154c;
    public int d;
    public float e;
    public int f22155f;
    public int f22156g;
    public d11 h;
    public TL_keyboard.KeyboardInlineButton f22157i;
    public BotInlineKeyboard.ButtonCustom f22158j;
    public BotInlineKeyboard.Button f22159k;
    public boolean f22160l;
    public boolean f22161m;
    public final Path f22162n = new Path();
    public final Paint f22163o = new Paint(1);
    public final RectF f22164p = new RectF();
    public final float[] f22165q = new float[8];
    public ba0 f22166r;
    public z f22167s;
    public Drawable f22168t;
    public org.telegram.ui.Components.r5 f22169u;
    public boolean v;
    public float f22170w;
    public ValueAnimator f22171x;

    public e0(Runnable runnable) {
        this.f22152a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22170w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22170w = min;
                this.f22170w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22152a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f22170w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22152a.run();
            if (z10 && (valueAnimator = this.f22171x) != null) {
                valueAnimator.removeAllListeners();
                this.f22171x.cancel();
            }
            if (!z10) {
                float f7 = this.f22170w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22171x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22171x.addListener(new m.a(this, 11));
                    lk.l(2.0f, this.f22171x);
                    this.f22171x.setDuration(350L);
                    this.f22171x.start();
                }
            }
        }
    }
}
