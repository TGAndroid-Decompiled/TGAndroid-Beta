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
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.u01;
public final class e0 {
    public final Runnable f20202a;
    public boolean f20203b;
    public float f20204c;
    public int d;
    public float e;
    public int f20205f;
    public int f20206g;
    public u01 h;
    public TL_keyboard.KeyboardInlineButton f20207i;
    public BotInlineKeyboard.ButtonCustom f20208j;
    public BotInlineKeyboard.Button f20209k;
    public boolean f20210l;
    public boolean f20211m;
    public final Path f20212n = new Path();
    public final Paint f20213o = new Paint(1);
    public final RectF f20214p = new RectF();
    public final float[] f20215q = new float[8];
    public s90 f20216r;
    public z f20217s;
    public Drawable f20218t;
    public org.telegram.ui.Components.q5 f20219u;
    public boolean v;
    public float f20220w;
    public ValueAnimator f20221x;

    public e0(Runnable runnable) {
        this.f20202a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20220w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20220w = min;
                this.f20220w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20202a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f20220w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f20202a.run();
            if (z10 && (valueAnimator = this.f20221x) != null) {
                valueAnimator.removeAllListeners();
                this.f20221x.cancel();
            }
            if (!z10) {
                float f7 = this.f20220w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20221x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20221x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f20221x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20221x.setDuration(350L);
                    this.f20221x.start();
                }
            }
        }
    }
}
