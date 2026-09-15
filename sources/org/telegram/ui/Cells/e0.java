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
    public final Runnable f19984a;
    public boolean f19985b;
    public float f19986c;
    public int d;
    public float e;
    public int f19987f;
    public int f19988g;
    public g01 h;
    public TL_keyboard.KeyboardInlineButton f19989i;
    public BotInlineKeyboard.ButtonCustom f19990j;
    public BotInlineKeyboard.Button f19991k;
    public boolean f19992l;
    public boolean f19993m;
    public final Path f19994n = new Path();
    public final Paint f19995o = new Paint(1);
    public final RectF f19996p = new RectF();
    public final float[] f19997q = new float[8];
    public g90 f19998r;
    public z f19999s;
    public Drawable f20000t;
    public org.telegram.ui.Components.o5 f20001u;
    public boolean v;
    public float f20002w;
    public ValueAnimator f20003x;

    public e0(Runnable runnable) {
        this.f19984a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20002w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20002w = min;
                this.f20002w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f19984a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f20002w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f19984a.run();
            if (z10 && (valueAnimator = this.f20003x) != null) {
                valueAnimator.removeAllListeners();
                this.f20003x.cancel();
            }
            if (!z10) {
                float f7 = this.f20002w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20003x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20003x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f20003x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20003x.setDuration(350L);
                    this.f20003x.start();
                }
            }
        }
    }
}
