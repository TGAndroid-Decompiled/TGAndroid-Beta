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
    public zm f32671a;
    public MediaController.PhotoEntry f32672b;
    public ImageReceiver f32673c;
    public ImageReceiver d;
    public boolean e;
    public float f32679l;
    public float f32680m;
    public float f32681n;
    public float f32682o;
    public wh.f f32686s;
    public Bitmap v;
    public RectF f32674f = null;
    public final RectF f32675g = new RectF();
    public long h = 0;
    public int f32676i = 0;
    public float f32677j = 1.0f;
    public float f32678k = 0.0f;
    public RectF f32683p = null;
    public final RectF f32684q = new RectF();
    public String f32685r = null;
    public final Path f32687t = new Path();
    public final float[] f32688u = new float[8];
    public float f32689w = 1.0f;
    public final Paint f32690x = new Paint(1);
    public final RectF f32691y = new RectF();
    public final Paint f32692z = new Paint(1);
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
        this.f32671a = zmVar;
    }

    public static void a(ym ymVar, MediaController.PhotoEntry photoEntry) {
        zm zmVar = ymVar.O;
        ymVar.f32672b = photoEntry;
        if (photoEntry.isVideo) {
            ymVar.f32685r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            ymVar.f32685r = null;
        }
        if (ymVar.f32673c == null) {
            ymVar.f32673c = new ImageReceiver(zmVar.f32992z);
            ymVar.d = new ImageReceiver(zmVar.f32992z);
            ymVar.f32673c.setDelegate(new q2(11, ymVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            ymVar.f32673c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = ymVar.f32673c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                ymVar.f32673c.setAllowStartAnimation(true);
                return;
            }
            ymVar.f32673c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = ymVar.f32673c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            ymVar.f32673c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(ym ymVar, um umVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = ymVar.f32684q;
        RectF rectF2 = ymVar.f32675g;
        if (umVar != null && groupedMessagePosition != null) {
            ymVar.f32676i = groupedMessagePosition.flags;
            if (z10) {
                float e = ymVar.e();
                RectF rectF3 = ymVar.f32674f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = ymVar.f32683p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                ymVar.f32677j = AndroidUtilities.lerp(ymVar.f32677j, ymVar.f32678k, e);
                ymVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = umVar.f31019c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = umVar.f31020f;
            float f17 = f15 / f16;
            ymVar.f32678k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17796ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = ymVar.f32676i;
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
            if (ymVar.f32674f == null) {
                RectF rectF5 = new RectF();
                ymVar.f32674f = rectF5;
                rectF5.set(rectF2);
            }
            if (ymVar.f32683p == null) {
                RectF rectF6 = new RectF();
                ymVar.f32683p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ymVar.f32677j = AndroidUtilities.lerp(ymVar.f32677j, ymVar.f32678k, ymVar.e());
            RectF rectF7 = ymVar.f32674f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, ymVar.e(), ymVar.f32674f);
            }
            ymVar.f32678k = 0.0f;
            ymVar.h = elapsedRealtime;
        } else {
            ymVar.f32677j = 0.0f;
            ymVar.f32678k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ym.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        ym ymVar = new ym(this.O);
        ymVar.f32675g.set(this.f32675g);
        ymVar.f32673c = this.f32673c;
        ymVar.f32672b = this.f32672b;
        return ymVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f32675g != null && this.f32673c != null) {
            an anVar = this.O.f32992z;
            ym ymVar = anVar.P.J;
            if (ymVar != null && ymVar.f32672b == this.f32672b) {
                f7 = anVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f32677j, this.f32678k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a1.g.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f32691y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f32977j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f32691y;
        RectF rectF3 = this.f32675g;
        if (rectF3 != null && this.f32673c != null) {
            zm zmVar = this.O;
            float f10 = (rectF3.left * zmVar.f32985r) + zmVar.f32981n;
            float f11 = (rectF3.top * zmVar.f32986s) + zmVar.f32983p;
            float width = rectF3.width() * zmVar.f32985r;
            float height = rectF3.height() * zmVar.f32986s;
            if (f7 < 1.0f && (rectF = this.f32674f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * zmVar.f32985r) + zmVar.f32981n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f32674f.top * zmVar.f32986s) + zmVar.f32983p, f11, f7);
                width = AndroidUtilities.lerp(this.f32674f.width() * zmVar.f32985r, width, f7);
                height = AndroidUtilities.lerp(this.f32674f.height() * zmVar.f32986s, height, f7);
            }
            int i10 = this.f32676i;
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
