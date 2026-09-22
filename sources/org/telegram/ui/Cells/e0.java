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
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.g90;
public final class e0 {
    public final Runnable f19963a;
    public boolean f19964b;
    public float f19965c;
    public int d;
    public float e;
    public int f19966f;
    public int f19967g;
    public g01 h;
    public TL_keyboard.KeyboardInlineButton f19968i;
    public BotInlineKeyboard.ButtonCustom f19969j;
    public BotInlineKeyboard.Button f19970k;
    public boolean f19971l;
    public boolean f19972m;
    public final Path f19973n = new Path();
    public final Paint f19974o = new Paint(1);
    public final RectF f19975p = new RectF();
    public final float[] f19976q = new float[8];
    public g90 f19977r;
    public z f19978s;
    public Drawable f19979t;
    public org.telegram.ui.Components.o5 f19980u;
    public boolean v;
    public float f19981w;
    public ValueAnimator f19982x;

    public e0(Runnable runnable) {
        this.f19963a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f19981w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f19981w = min;
                this.f19981w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f19963a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f19981w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f19963a.run();
            if (z10 && (valueAnimator = this.f19982x) != null) {
                valueAnimator.removeAllListeners();
                this.f19982x.cancel();
            }
            if (!z10) {
                float f7 = this.f19981w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f19982x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f19982x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f19982x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f19982x.setDuration(350L);
                    this.f19982x.start();
                }
            }
        }
    }
}
