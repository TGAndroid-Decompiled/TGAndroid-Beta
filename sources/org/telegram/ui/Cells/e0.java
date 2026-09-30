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
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.w01;
public final class e0 {
    public final Runnable f20219a;
    public boolean f20220b;
    public float f20221c;
    public int d;
    public float e;
    public int f20222f;
    public int f20223g;
    public w01 h;
    public TL_keyboard.KeyboardInlineButton f20224i;
    public BotInlineKeyboard.ButtonCustom f20225j;
    public BotInlineKeyboard.Button f20226k;
    public boolean f20227l;
    public boolean f20228m;
    public final Path f20229n = new Path();
    public final Paint f20230o = new Paint(1);
    public final RectF f20231p = new RectF();
    public final float[] f20232q = new float[8];
    public u90 f20233r;
    public z f20234s;
    public Drawable f20235t;
    public org.telegram.ui.Components.q5 f20236u;
    public boolean v;
    public float f20237w;
    public ValueAnimator f20238x;

    public e0(Runnable runnable) {
        this.f20219a = runnable;
    }

    public final float a() {
        if (this.v) {
            float f7 = this.f20237w;
            if (f7 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f7;
                this.f20237w = min;
                this.f20237w = Utilities.clamp(min, 1.0f, 0.0f);
                this.f20219a.run();
            }
        }
        return com.google.android.gms.internal.vision.e2.z(1.0f, this.f20237w, 0.04f, 0.96f);
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        if (this.v != z10) {
            this.v = z10;
            this.f20219a.run();
            if (z10 && (valueAnimator = this.f20238x) != null) {
                valueAnimator.removeAllListeners();
                this.f20238x.cancel();
            }
            if (!z10) {
                float f7 = this.f20237w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f20238x = ofFloat;
                    ofFloat.addUpdateListener(new r(this, 1));
                    this.f20238x.addListener(new org.telegram.ui.t4(this, 6));
                    this.f20238x.setInterpolator(new OvershootInterpolator(2.0f));
                    this.f20238x.setDuration(350L);
                    this.f20238x.start();
                }
            }
        }
    }
}
