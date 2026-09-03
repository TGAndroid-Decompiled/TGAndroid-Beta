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
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k01;
public final class e0 {
    public final Runnable f20961a;
    public boolean f20962b;
    public float f20963c;
    public int d;
    public float e;
    public int f20964f;
    public int f20965g;
    public k01 h;
    public TL_keyboard.KeyboardInlineButton f20966i;
    public BotInlineKeyboard.ButtonCustom f20967j;
    public BotInlineKeyboard.Button f20968k;
    public boolean f20969l;
    public boolean f20970m;
    public final Path f20971n = new Path();
    public final Paint f20972o = new Paint(1);
    public final RectF f20973p = new RectF();
    public final float[] f20974q = new float[8];
    public j90 f20975r;
    public z f20976s;
    public Drawable f20977t;
    public org.telegram.ui.Components.l5 f20978u;
    public boolean v;
    public float f20979w;
    public ValueAnimator f20980x;

    public e0(Runnable runnable) {
        this.f20961a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f10 = this.f20979w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f10;
                this.f20979w = min;
                this.f20979w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20961a.run();
            }
        }
        return e2.c.w(1.0f, this.f20979w, 0.04f, 0.96f);
    }

    public final void b(boolean z4) {
        ValueAnimator valueAnimator;
        if (this.v != z4) {
            this.v = z4;
            this.f20961a.run();
            if (z4 && (valueAnimator = this.f20980x) != null) {
                valueAnimator.removeAllListeners();
                this.f20980x.cancel();
            }
            if (!z4) {
                float f10 = this.f20979w;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f20980x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20980x.addListener(new org.telegram.ui.u5(this, 5));
                    this.f20980x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20980x.setDuration(350L);
                    this.f20980x.start();
                }
            }
        }
    }
}
