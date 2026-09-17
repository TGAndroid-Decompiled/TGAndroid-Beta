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
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h01;
public final class e0 {
    public final Runnable f19994a;
    public boolean f19995b;
    public float f19996c;
    public int d;
    public float e;
    public int f19997f;
    public int f19998g;
    public h01 h;
    public TL_keyboard.KeyboardInlineButton f19999i;
    public BotInlineKeyboard.ButtonCustom f20000j;
    public BotInlineKeyboard.Button f20001k;
    public boolean f20002l;
    public boolean f20003m;
    public final Path f20004n = new Path();
    public final Paint f20005o = new Paint(1);
    public final RectF f20006p = new RectF();
    public final float[] f20007q = new float[8];
    public g90 f20008r;
    public z f20009s;
    public Drawable f20010t;
    public org.telegram.ui.Components.o5 f20011u;
    public boolean v;
    public float f20012w;
    public ValueAnimator f20013x;

    public e0(Runnable runnable) {
        this.f19994a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20012w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20012w = min;
                this.f20012w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f19994a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f20012w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f19994a.run();
            if (z10 && (valueAnimator = this.f20013x) != null) {
                valueAnimator.removeAllListeners();
                this.f20013x.cancel();
            }
            if (!z10) {
                float f7 = this.f20012w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20013x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20013x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f20013x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20013x.setDuration(350L);
                    this.f20013x.start();
                }
            }
        }
    }
}
