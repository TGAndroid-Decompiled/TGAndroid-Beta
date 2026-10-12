package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.am;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.r11;
public final class e0 {
    public final Runnable f21759a;
    public boolean f21760b;
    public float f21761c;
    public int d;
    public float f21762e;
    public int f21763f;
    public int f21764g;
    public r11 h;
    public TL_keyboard.KeyboardInlineButton f21765i;
    public BotInlineKeyboard.ButtonCustom f21766j;
    public BotInlineKeyboard.Button f21767k;
    public boolean f21768l;
    public boolean f21769m;
    public final Path f21770n = new Path();
    public final Paint f21771o = new Paint(1);
    public final RectF f21772p = new RectF();
    public final float[] f21773q = new float[8];
    public ma0 f21774r;
    public z f21775s;
    public Drawable f21776t;
    public org.telegram.ui.Components.s5 f21777u;
    public boolean v;
    public float f21778w;
    public ValueAnimator f21779x;

    public e0(Runnable runnable) {
        this.f21759a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f21778w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f21778w = min;
                this.f21778w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21759a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f21778w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21759a.run();
            if (z10 && (valueAnimator = this.f21779x) != null) {
                valueAnimator.removeAllListeners();
                this.f21779x.cancel();
            }
            if (!z10) {
                float f7 = this.f21778w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21779x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f21779x.addListener(new org.telegram.ui.w4(this, 6));
                    am.l(2.0f, this.f21779x);
                    this.f21779x.setDuration(350L);
                    this.f21779x.start();
                }
            }
        }
    }
}
