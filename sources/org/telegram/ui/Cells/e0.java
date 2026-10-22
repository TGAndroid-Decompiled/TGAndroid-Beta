package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.f11;
public final class e0 {
    public final Runnable f22159a;
    public boolean f22160b;
    public float f22161c;
    public int d;
    public float e;
    public int f22162f;
    public int f22163g;
    public f11 h;
    public TL_keyboard.KeyboardInlineButton f22164i;
    public BotInlineKeyboard.ButtonCustom f22165j;
    public BotInlineKeyboard.Button f22166k;
    public boolean f22167l;
    public boolean f22168m;
    public final Path f22169n = new Path();
    public final Paint f22170o = new Paint(1);
    public final RectF f22171p = new RectF();
    public final float[] f22172q = new float[8];
    public ba0 f22173r;
    public z f22174s;
    public Drawable f22175t;
    public org.telegram.ui.Components.r5 f22176u;
    public boolean v;
    public float f22177w;
    public ValueAnimator f22178x;

    public e0(Runnable runnable) {
        this.f22159a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22177w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22177w = min;
                this.f22177w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22159a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f22177w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22159a.run();
            if (z10 && (valueAnimator = this.f22178x) != null) {
                valueAnimator.removeAllListeners();
                this.f22178x.cancel();
            }
            if (!z10) {
                float f7 = this.f22177w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22178x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22178x.addListener(new m.a(this, 11));
                    ok.l(2.0f, this.f22178x);
                    this.f22178x.setDuration(350L);
                    this.f22178x.start();
                }
            }
        }
    }
}
