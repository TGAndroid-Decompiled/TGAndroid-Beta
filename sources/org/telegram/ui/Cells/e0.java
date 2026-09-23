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
    public final Runnable f19902a;
    public boolean f19903b;
    public float f19904c;
    public int d;
    public float e;
    public int f19905f;
    public int f19906g;
    public f01 h;
    public TL_keyboard.KeyboardInlineButton f19907i;
    public BotInlineKeyboard.ButtonCustom f19908j;
    public BotInlineKeyboard.Button f19909k;
    public boolean f19910l;
    public boolean f19911m;
    public final Path f19912n = new Path();
    public final Paint f19913o = new Paint(1);
    public final RectF f19914p = new RectF();
    public final float[] f19915q = new float[8];
    public h90 f19916r;
    public z f19917s;
    public Drawable f19918t;
    public org.telegram.ui.Components.q5 f19919u;
    public boolean v;
    public float f19920w;
    public ValueAnimator f19921x;

    public e0(Runnable runnable) {
        this.f19902a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f19920w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f19920w = min;
                this.f19920w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f19902a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f19920w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f19902a.run();
            if (z10 && (valueAnimator = this.f19921x) != null) {
                valueAnimator.removeAllListeners();
                this.f19921x.cancel();
            }
            if (!z10) {
                float f7 = this.f19920w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f19921x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f19921x.addListener(new org.telegram.ui.u4(this, 6));
                    this.f19921x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f19921x.setDuration(350L);
                    this.f19921x.start();
                }
            }
        }
    }
}
