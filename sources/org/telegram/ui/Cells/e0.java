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
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.t01;
public final class e0 {
    public final Runnable f19027a;
    public boolean f19028b;
    public float f19029c;
    public int d;
    public float e;
    public int f19030f;
    public int f19031g;
    public t01 h;
    public TL_keyboard.KeyboardInlineButton f19032i;
    public BotInlineKeyboard.ButtonCustom f19033j;
    public BotInlineKeyboard.Button f19034k;
    public boolean f19035l;
    public boolean f19036m;
    public final Path f19037n = new Path();
    public final Paint f19038o = new Paint(1);
    public final RectF f19039p = new RectF();
    public final float[] f19040q = new float[8];
    public q90 f19041r;
    public z f19042s;
    public Drawable f19043t;
    public org.telegram.ui.Components.p5 f19044u;
    public boolean v;
    public float f19045w;
    public ValueAnimator f19046x;

    public e0(Runnable runnable) {
        this.f19027a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f19045w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f19045w = min;
                this.f19045w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f19027a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f19045w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f19027a.run();
            if (z10 && (valueAnimator = this.f19046x) != null) {
                valueAnimator.removeAllListeners();
                this.f19046x.cancel();
            }
            if (!z10) {
                float f7 = this.f19045w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f19046x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f19046x.addListener(new bi.h(this, 26));
                    this.f19046x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f19046x.setDuration(350L);
                    this.f19046x.start();
                }
            }
        }
    }
}
