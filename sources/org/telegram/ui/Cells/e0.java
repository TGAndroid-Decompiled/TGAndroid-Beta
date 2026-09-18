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
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.v01;
public final class e0 {
    public final Runnable f20166a;
    public boolean f20167b;
    public float f20168c;
    public int d;
    public float e;
    public int f20169f;
    public int f20170g;
    public v01 h;
    public TL_keyboard.KeyboardInlineButton f20171i;
    public BotInlineKeyboard.ButtonCustom f20172j;
    public BotInlineKeyboard.Button f20173k;
    public boolean f20174l;
    public boolean f20175m;
    public final Path f20176n = new Path();
    public final Paint f20177o = new Paint(1);
    public final RectF f20178p = new RectF();
    public final float[] f20179q = new float[8];
    public p90 f20180r;
    public z f20181s;
    public Drawable f20182t;
    public org.telegram.ui.Components.q5 f20183u;
    public boolean v;
    public float f20184w;
    public ValueAnimator f20185x;

    public e0(Runnable runnable) {
        this.f20166a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20184w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20184w = min;
                this.f20184w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20166a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f20184w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f20166a.run();
            if (z10 && (valueAnimator = this.f20185x) != null) {
                valueAnimator.removeAllListeners();
                this.f20185x.cancel();
            }
            if (!z10) {
                float f7 = this.f20184w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20185x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20185x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f20185x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20185x.setDuration(350L);
                    this.f20185x.start();
                }
            }
        }
    }
}
