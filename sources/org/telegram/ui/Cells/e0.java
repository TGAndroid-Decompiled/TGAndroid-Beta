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
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.t01;
public final class e0 {
    public final Runnable f20188a;
    public boolean f20189b;
    public float f20190c;
    public int d;
    public float e;
    public int f20191f;
    public int f20192g;
    public t01 h;
    public TL_keyboard.KeyboardInlineButton f20193i;
    public BotInlineKeyboard.ButtonCustom f20194j;
    public BotInlineKeyboard.Button f20195k;
    public boolean f20196l;
    public boolean f20197m;
    public final Path f20198n = new Path();
    public final Paint f20199o = new Paint(1);
    public final RectF f20200p = new RectF();
    public final float[] f20201q = new float[8];
    public r90 f20202r;
    public z f20203s;
    public Drawable f20204t;
    public org.telegram.ui.Components.q5 f20205u;
    public boolean v;
    public float f20206w;
    public ValueAnimator f20207x;

    public e0(Runnable runnable) {
        this.f20188a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20206w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20206w = min;
                this.f20206w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20188a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f20206w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f20188a.run();
            if (z10 && (valueAnimator = this.f20207x) != null) {
                valueAnimator.removeAllListeners();
                this.f20207x.cancel();
            }
            if (!z10) {
                float f7 = this.f20206w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20207x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20207x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f20207x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20207x.setDuration(350L);
                    this.f20207x.start();
                }
            }
        }
    }
}
