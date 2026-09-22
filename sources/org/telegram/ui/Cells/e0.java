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
import org.telegram.ui.Components.w01;
public final class e0 {
    public final Runnable f20170a;
    public boolean f20171b;
    public float f20172c;
    public int d;
    public float e;
    public int f20173f;
    public int f20174g;
    public w01 h;
    public TL_keyboard.KeyboardInlineButton f20175i;
    public BotInlineKeyboard.ButtonCustom f20176j;
    public BotInlineKeyboard.Button f20177k;
    public boolean f20178l;
    public boolean f20179m;
    public final Path f20180n = new Path();
    public final Paint f20181o = new Paint(1);
    public final RectF f20182p = new RectF();
    public final float[] f20183q = new float[8];
    public r90 f20184r;
    public z f20185s;
    public Drawable f20186t;
    public org.telegram.ui.Components.p5 f20187u;
    public boolean v;
    public float f20188w;
    public ValueAnimator f20189x;

    public e0(Runnable runnable) {
        this.f20170a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20188w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20188w = min;
                this.f20188w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20170a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f20188w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f20170a.run();
            if (z10 && (valueAnimator = this.f20189x) != null) {
                valueAnimator.removeAllListeners();
                this.f20189x.cancel();
            }
            if (!z10) {
                float f7 = this.f20188w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20189x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20189x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f20189x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20189x.setDuration(350L);
                    this.f20189x.start();
                }
            }
        }
    }
}
