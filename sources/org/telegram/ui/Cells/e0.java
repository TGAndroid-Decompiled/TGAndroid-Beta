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
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.u90;
public final class e0 {
    public final Runnable f21992a;
    public boolean f21993b;
    public float f21994c;
    public int d;
    public float f21995e;
    public int f21996f;
    public int f21997g;
    public e11 h;
    public TL_keyboard.KeyboardInlineButton f21998i;
    public BotInlineKeyboard.ButtonCustom f21999j;
    public BotInlineKeyboard.Button f22000k;
    public boolean f22001l;
    public boolean f22002m;
    public final Path f22003n = new Path();
    public final Paint f22004o = new Paint(1);
    public final RectF f22005p = new RectF();
    public final float[] f22006q = new float[8];
    public u90 f22007r;
    public z f22008s;
    public Drawable f22009t;
    public org.telegram.ui.Components.q5 f22010u;
    public boolean v;
    public float f22011w;
    public ValueAnimator f22012x;

    public e0(Runnable runnable) {
        this.f21992a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22011w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22011w = min;
                this.f22011w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21992a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f22011w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21992a.run();
            if (z10 && (valueAnimator = this.f22012x) != null) {
                valueAnimator.removeAllListeners();
                this.f22012x.cancel();
            }
            if (!z10) {
                float f7 = this.f22011w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22012x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22012x.addListener(new org.telegram.ui.u4(this, 6));
                    this.f22012x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f22012x.setDuration(350L);
                    this.f22012x.start();
                }
            }
        }
    }
}
