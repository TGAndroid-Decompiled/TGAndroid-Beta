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
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.u90;
public final class e0 {
    public final Runnable f22000a;
    public boolean f22001b;
    public float f22002c;
    public int d;
    public float f22003e;
    public int f22004f;
    public int f22005g;
    public f11 h;
    public TL_keyboard.KeyboardInlineButton f22006i;
    public BotInlineKeyboard.ButtonCustom f22007j;
    public BotInlineKeyboard.Button f22008k;
    public boolean f22009l;
    public boolean f22010m;
    public final Path f22011n = new Path();
    public final Paint f22012o = new Paint(1);
    public final RectF f22013p = new RectF();
    public final float[] f22014q = new float[8];
    public u90 f22015r;
    public z f22016s;
    public Drawable f22017t;
    public org.telegram.ui.Components.q5 f22018u;
    public boolean v;
    public float f22019w;
    public ValueAnimator f22020x;

    public e0(Runnable runnable) {
        this.f22000a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22019w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22019w = min;
                this.f22019w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22000a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f22019w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f22000a.run();
            if (z10 && (valueAnimator = this.f22020x) != null) {
                valueAnimator.removeAllListeners();
                this.f22020x.cancel();
            }
            if (!z10) {
                float f7 = this.f22019w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22020x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22020x.addListener(new org.telegram.ui.u4(this, 6));
                    this.f22020x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f22020x.setDuration(350L);
                    this.f22020x.start();
                }
            }
        }
    }
}
