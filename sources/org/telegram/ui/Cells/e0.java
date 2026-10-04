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
    public final Runnable f21991a;
    public boolean f21992b;
    public float f21993c;
    public int d;
    public float f21994e;
    public int f21995f;
    public int f21996g;
    public e11 h;
    public TL_keyboard.KeyboardInlineButton f21997i;
    public BotInlineKeyboard.ButtonCustom f21998j;
    public BotInlineKeyboard.Button f21999k;
    public boolean f22000l;
    public boolean f22001m;
    public final Path f22002n = new Path();
    public final Paint f22003o = new Paint(1);
    public final RectF f22004p = new RectF();
    public final float[] f22005q = new float[8];
    public u90 f22006r;
    public z f22007s;
    public Drawable f22008t;
    public org.telegram.ui.Components.q5 f22009u;
    public boolean v;
    public float f22010w;
    public ValueAnimator f22011x;

    public e0(Runnable runnable) {
        this.f21991a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f22010w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f22010w = min;
                this.f22010w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f21991a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f22010w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f21991a.run();
            if (z10 && (valueAnimator = this.f22011x) != null) {
                valueAnimator.removeAllListeners();
                this.f22011x.cancel();
            }
            if (!z10) {
                float f7 = this.f22010w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f22011x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f22011x.addListener(new org.telegram.ui.u4(this, 6));
                    this.f22011x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f22011x.setDuration(350L);
                    this.f22011x.start();
                }
            }
        }
    }
}
