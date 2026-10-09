package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.l11;
public final class e0 {
    public final Runnable f21998a;
    public boolean f21999b;
    public float f22000c;
    public int d;
    public float f22001e;
    public int f22002f;
    public int f22003g;
    public l11 h;
    public TL_keyboard.KeyboardInlineButton f22004i;
    public BotInlineKeyboard.ButtonCustom f22005j;
    public BotInlineKeyboard.Button f22006k;
    public boolean f22007l;
    public boolean f22008m;
    public final Path f22009n = new Path();
    public final Paint f22010o = new Paint(1);
    public final RectF f22011p = new RectF();
    public final float[] f22012q = new float[8];
    public ia0 f22013r;
    public z f22014s;
    public Drawable f22015t;
    public org.telegram.ui.Components.s5 f22016u;
    public boolean v;
    public float f22017w;
    public ValueAnimator f22018x;

    public e0(Runnable runnable) {
        this.f21998a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22017w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22017w = min;
                this.f22017w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21998a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f22017w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21998a.run();
            if (z10 && (valueAnimator = this.f22018x) != null) {
                valueAnimator.removeAllListeners();
                this.f22018x.cancel();
            }
            if (!z10) {
                float f7 = this.f22017w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22018x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22018x.addListener(new org.telegram.ui.t4(this, 6));
                    bi.l(2.0f, this.f22018x);
                    this.f22018x.setDuration(350L);
                    this.f22018x.start();
                }
            }
        }
    }
}
