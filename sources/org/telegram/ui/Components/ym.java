package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
public final class ym {
    public TextPaint B;
    public TextPaint C;
    public final zm O;
    public zm f32673a;
    public MediaController.PhotoEntry f32674b;
    public ImageReceiver f32675c;
    public ImageReceiver d;
    public boolean e;
    public float f32681l;
    public float f32682m;
    public float f32683n;
    public float f32684o;
    public wh.f f32688s;
    public Bitmap v;
    public RectF f32676f = null;
    public final RectF f32677g = new RectF();
    public long h = 0;
    public int f32678i = 0;
    public float f32679j = 1.0f;
    public float f32680k = 0.0f;
    public RectF f32685p = null;
    public final RectF f32686q = new RectF();
    public String f32687r = null;
    public final Path f32689t = new Path();
    public final float[] f32690u = new float[8];
    public float f32691w = 1.0f;
    public final Paint f32692x = new Paint(1);
    public final RectF f32693y = new RectF();
    public final Paint f32694z = new Paint(1);
    public final Paint A = new Paint(1);
    public final Paint D = new Paint(1);
    public Bitmap E = null;
    public String F = null;
    public Bitmap G = null;
    public String H = null;
    public final Rect I = new Rect();
    public final Rect J = new Rect();
    public final Rect K = new Rect();
    public final Rect L = new Rect();
    public float M = 1.0f;
    public long N = 0;

    public ym(zm zmVar) {
        this.O = zmVar;
        this.f32673a = zmVar;
    }

    public static void a(ym ymVar, MediaController.PhotoEntry photoEntry) {
        zm zmVar = ymVar.O;
        ymVar.f32674b = photoEntry;
        if (photoEntry.isVideo) {
            ymVar.f32687r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            ymVar.f32687r = null;
        }
        if (ymVar.f32675c == null) {
            ymVar.f32675c = new ImageReceiver(zmVar.f32992z);
            ymVar.d = new ImageReceiver(zmVar.f32992z);
            ymVar.f32675c.setDelegate(new q2(11, ymVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            ymVar.f32675c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = ymVar.f32675c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                ymVar.f32675c.setAllowStartAnimation(true);
                return;
            }
            ymVar.f32675c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = ymVar.f32675c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            ymVar.f32675c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(ym ymVar, um umVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = ymVar.f32686q;
        RectF rectF2 = ymVar.f32677g;
        if (umVar != null && groupedMessagePosition != null) {
            ymVar.f32678i = groupedMessagePosition.flags;
            if (z10) {
                float e = ymVar.e();
                RectF rectF3 = ymVar.f32676f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = ymVar.f32685p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                ymVar.f32679j = AndroidUtilities.lerp(ymVar.f32679j, ymVar.f32680k, e);
                ymVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = umVar.f31021c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = umVar.f31022f;
            float f17 = f15 / f16;
            ymVar.f32680k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17798ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = ymVar.f32678i;
            if ((i10 & 5) == 5) {
                f7 = dp2;
            } else {
                f7 = dp;
            }
            if ((i10 & 6) == 6) {
                f10 = dp2;
            } else {
                f10 = dp;
            }
            if ((i10 & 10) == 10) {
                f11 = dp2;
            } else {
                f11 = dp;
            }
            if ((i10 & 9) == 9) {
                dp = dp2;
            }
            rectF.set(f7, f10, f11, dp);
            if (ymVar.f32676f == null) {
                RectF rectF5 = new RectF();
                ymVar.f32676f = rectF5;
                rectF5.set(rectF2);
            }
            if (ymVar.f32685p == null) {
                RectF rectF6 = new RectF();
                ymVar.f32685p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ymVar.f32679j = AndroidUtilities.lerp(ymVar.f32679j, ymVar.f32680k, ymVar.e());
            RectF rectF7 = ymVar.f32676f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, ymVar.e(), ymVar.f32676f);
            }
            ymVar.f32680k = 0.0f;
            ymVar.h = elapsedRealtime;
        } else {
            ymVar.f32679j = 0.0f;
            ymVar.f32680k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ym.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        ym ymVar = new ym(this.O);
        ymVar.f32677g.set(this.f32677g);
        ymVar.f32675c = this.f32675c;
        ymVar.f32674b = this.f32674b;
        return ymVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f32677g != null && this.f32675c != null) {
            an anVar = this.O.f32992z;
            ym ymVar = anVar.P.J;
            if (ymVar != null && ymVar.f32674b == this.f32674b) {
                f7 = anVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f32679j, this.f32680k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a1.g.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f32693y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f32977j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f32693y;
        RectF rectF3 = this.f32677g;
        if (rectF3 != null && this.f32675c != null) {
            zm zmVar = this.O;
            float f10 = (rectF3.left * zmVar.f32985r) + zmVar.f32981n;
            float f11 = (rectF3.top * zmVar.f32986s) + zmVar.f32983p;
            float width = rectF3.width() * zmVar.f32985r;
            float height = rectF3.height() * zmVar.f32986s;
            if (f7 < 1.0f && (rectF = this.f32676f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * zmVar.f32985r) + zmVar.f32981n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f32676f.top * zmVar.f32986s) + zmVar.f32983p, f11, f7);
                width = AndroidUtilities.lerp(this.f32676f.width() * zmVar.f32985r, width, f7);
                height = AndroidUtilities.lerp(this.f32676f.height() * zmVar.f32986s, height, f7);
            }
            int i10 = this.f32678i;
            if ((i10 & 4) == 0) {
                int i11 = zmVar.f32980m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= zmVar.f32980m;
            }
            if ((i10 & 1) == 0) {
                int i12 = zmVar.f32980m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= zmVar.f32980m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
