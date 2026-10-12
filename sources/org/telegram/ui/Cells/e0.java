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
    public final Runnable f21760a;
    public boolean f21761b;
    public float f21762c;
    public int d;
    public float f21763e;
    public int f21764f;
    public int f21765g;
    public r11 h;
    public TL_keyboard.KeyboardInlineButton f21766i;
    public BotInlineKeyboard.ButtonCustom f21767j;
    public BotInlineKeyboard.Button f21768k;
    public boolean f21769l;
    public boolean f21770m;
    public final Path f21771n = new Path();
    public final Paint f21772o = new Paint(1);
    public final RectF f21773p = new RectF();
    public final float[] f21774q = new float[8];
    public ma0 f21775r;
    public z f21776s;
    public Drawable f21777t;
    public org.telegram.ui.Components.s5 f21778u;
    public boolean v;
    public float f21779w;
    public ValueAnimator f21780x;

    public e0(Runnable runnable) {
        this.f21760a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f21779w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f21779w = min;
                this.f21779w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21760a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.y(1.0f, this.f21779w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21760a.run();
            if (z10 && (valueAnimator = this.f21780x) != null) {
                valueAnimator.removeAllListeners();
                this.f21780x.cancel();
            }
            if (!z10) {
                float f7 = this.f21779w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f21780x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f21780x.addListener(new org.telegram.ui.w4(this, 6));
                    am.l(2.0f, this.f21780x);
                    this.f21780x.setDuration(350L);
                    this.f21780x.start();
                }
            }
        }
    }
}
