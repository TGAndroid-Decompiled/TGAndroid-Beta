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
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.u01;
public final class e0 {
    public final Runnable f20155a;
    public boolean f20156b;
    public float f20157c;
    public int d;
    public float e;
    public int f20158f;
    public int f20159g;
    public u01 h;
    public TL_keyboard.KeyboardInlineButton f20160i;
    public BotInlineKeyboard.ButtonCustom f20161j;
    public BotInlineKeyboard.Button f20162k;
    public boolean f20163l;
    public boolean f20164m;
    public final Path f20165n = new Path();
    public final Paint f20166o = new Paint(1);
    public final RectF f20167p = new RectF();
    public final float[] f20168q = new float[8];
    public o90 f20169r;
    public z f20170s;
    public Drawable f20171t;
    public org.telegram.ui.Components.p5 f20172u;
    public boolean v;
    public float f20173w;
    public ValueAnimator f20174x;

    public e0(Runnable runnable) {
        this.f20155a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20173w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20173w = min;
                this.f20173w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20155a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f20173w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f20155a.run();
            if (z10 && (valueAnimator = this.f20174x) != null) {
                valueAnimator.removeAllListeners();
                this.f20174x.cancel();
            }
            if (!z10) {
                float f7 = this.f20173w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20174x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20174x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f20174x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20174x.setDuration(350L);
                    this.f20174x.start();
                }
            }
        }
    }
}
