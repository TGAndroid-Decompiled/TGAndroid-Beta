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
    public final Runnable f20203a;
    public boolean f20204b;
    public float f20205c;
    public int d;
    public float e;
    public int f20206f;
    public int f20207g;
    public t01 h;
    public TL_keyboard.KeyboardInlineButton f20208i;
    public BotInlineKeyboard.ButtonCustom f20209j;
    public BotInlineKeyboard.Button f20210k;
    public boolean f20211l;
    public boolean f20212m;
    public final Path f20213n = new Path();
    public final Paint f20214o = new Paint(1);
    public final RectF f20215p = new RectF();
    public final float[] f20216q = new float[8];
    public r90 f20217r;
    public z f20218s;
    public Drawable f20219t;
    public org.telegram.ui.Components.q5 f20220u;
    public boolean v;
    public float f20221w;
    public ValueAnimator f20222x;

    public e0(Runnable runnable) {
        this.f20203a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20221w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20221w = min;
                this.f20221w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20203a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f20221w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f20203a.run();
            if (z10 && (valueAnimator = this.f20222x) != null) {
                valueAnimator.removeAllListeners();
                this.f20222x.cancel();
            }
            if (!z10) {
                float f7 = this.f20221w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20222x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20222x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f20222x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20222x.setDuration(350L);
                    this.f20222x.start();
                }
            }
        }
    }
}
