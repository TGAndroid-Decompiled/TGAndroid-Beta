package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.h11;
public final class d0 {
    public final Runnable f22234a;
    public boolean f22235b;
    public float f22236c;
    public int d;
    public float e;
    public int f22237f;
    public int f22238g;
    public h11 h;
    public TL_keyboard.KeyboardInlineButton f22239i;
    public BotInlineKeyboard.ButtonCustom f22240j;
    public BotInlineKeyboard.Button f22241k;
    public boolean f22242l;
    public boolean f22243m;
    public final Path f22244n = new Path();
    public final Paint f22245o = new Paint(1);
    public final RectF f22246p = new RectF();
    public final float[] f22247q = new float[8];
    public aa0 f22248r;
    public y f22249s;
    public Drawable f22250t;
    public org.telegram.ui.Components.p5 f22251u;
    public boolean v;
    public float f22252w;
    public ValueAnimator f22253x;

    public d0(Runnable runnable) {
        this.f22234a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22252w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22252w = min;
                this.f22252w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22234a.run();
            }
        }
        return com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f22252w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22234a.run();
            if (z10 && (valueAnimator = this.f22253x) != null) {
                valueAnimator.removeAllListeners();
                this.f22253x.cancel();
            }
            if (!z10) {
                float f7 = this.f22252w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22253x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22253x.addListener(new m.a(this, 11));
                    tl.l(2.0f, this.f22253x);
                    this.f22253x.setDuration(350L);
                    this.f22253x.start();
                }
            }
        }
    }
}
