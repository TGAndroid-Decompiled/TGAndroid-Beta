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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.k90;
public final class e0 {
    public final Runnable f22700a;
    public boolean f22701b;
    public float f22702c;
    public int d;
    public float f22703e;
    public int f22704f;
    public int f22705g;
    public k01 h;
    public TL_keyboard.KeyboardInlineButton f22706i;
    public BotInlineKeyboard.ButtonCustom f22707j;
    public BotInlineKeyboard.Button f22708k;
    public boolean f22709l;
    public boolean f22710m;
    public final Path f22711n = new Path();
    public final Paint f22712o = new Paint(1);
    public final RectF f22713p = new RectF();
    public final float[] f22714q = new float[8];
    public k90 f22715r;
    public z f22716s;
    public Drawable f22717t;
    public org.telegram.ui.Components.l5 f22718u;
    public boolean v;
    public float f22719w;
    public ValueAnimator f22720x;

    public e0(Runnable runnable) {
        this.f22700a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f22719w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                this.f22719w = min;
                this.f22719w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f22700a.run();
            }
        }
        return e2.c.w(1.0f, this.f22719w, 0.04f, 0.96f);
    }

    public final void b(boolean z4) {
        ValueAnimator valueAnimator;
        if (this.v != z4) {
            this.v = z4;
            this.f22700a.run();
            if (z4 && (valueAnimator = this.f22720x) != null) {
                valueAnimator.removeAllListeners();
                this.f22720x.cancel();
            }
            if (!z4) {
                float f10 = this.f22719w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f22720x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22720x.addListener(new org.telegram.ui.s5(this, 5));
                    this.f22720x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f22720x.setDuration(350L);
                    this.f22720x.start();
                }
            }
        }
    }
}
