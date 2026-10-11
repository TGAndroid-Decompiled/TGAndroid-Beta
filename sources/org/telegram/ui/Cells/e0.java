package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ai;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.m11;
public final class e0 {
    public final Runnable f22026a;
    public boolean f22027b;
    public float f22028c;
    public int d;
    public float f22029e;
    public int f22030f;
    public int f22031g;
    public m11 h;
    public TL_keyboard.KeyboardInlineButton f22032i;
    public BotInlineKeyboard.ButtonCustom f22033j;
    public BotInlineKeyboard.Button f22034k;
    public boolean f22035l;
    public boolean f22036m;
    public final Path f22037n = new Path();
    public final Paint f22038o = new Paint(1);
    public final RectF f22039p = new RectF();
    public final float[] f22040q = new float[8];
    public ia0 f22041r;
    public z f22042s;
    public Drawable f22043t;
    public org.telegram.ui.Components.s5 f22044u;
    public boolean v;
    public float f22045w;
    public ValueAnimator f22046x;

    public e0(Runnable runnable) {
        this.f22026a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22045w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22045w = min;
                this.f22045w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22026a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f22045w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22026a.run();
            if (z10 && (valueAnimator = this.f22046x) != null) {
                valueAnimator.removeAllListeners();
                this.f22046x.cancel();
            }
            if (!z10) {
                float f7 = this.f22045w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22046x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22046x.addListener(new org.telegram.ui.s4(this, 6));
                    ai.l(2.0f, this.f22046x);
                    this.f22046x.setDuration(350L);
                    this.f22046x.start();
                }
            }
        }
    }
}
