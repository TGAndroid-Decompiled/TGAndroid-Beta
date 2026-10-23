package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.nk;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.f11;
public final class e0 {
    public final Runnable f22160a;
    public boolean f22161b;
    public float f22162c;
    public int d;
    public float e;
    public int f22163f;
    public int f22164g;
    public f11 h;
    public TL_keyboard.KeyboardInlineButton f22165i;
    public BotInlineKeyboard.ButtonCustom f22166j;
    public BotInlineKeyboard.Button f22167k;
    public boolean f22168l;
    public boolean f22169m;
    public final Path f22170n = new Path();
    public final Paint f22171o = new Paint(1);
    public final RectF f22172p = new RectF();
    public final float[] f22173q = new float[8];
    public ba0 f22174r;
    public z f22175s;
    public Drawable f22176t;
    public org.telegram.ui.Components.r5 f22177u;
    public boolean v;
    public float f22178w;
    public ValueAnimator f22179x;

    public e0(Runnable runnable) {
        this.f22160a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22178w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22178w = min;
                this.f22178w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22160a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f22178w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22160a.run();
            if (z10 && (valueAnimator = this.f22179x) != null) {
                valueAnimator.removeAllListeners();
                this.f22179x.cancel();
            }
            if (!z10) {
                float f7 = this.f22178w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22179x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22179x.addListener(new m.a(this, 11));
                    nk.l(2.0f, this.f22179x);
                    this.f22179x.setDuration(350L);
                    this.f22179x.start();
                }
            }
        }
    }
}
