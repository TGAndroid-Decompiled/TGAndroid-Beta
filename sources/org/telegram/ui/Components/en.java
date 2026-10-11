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
public final class en {
    public TextPaint B;
    public TextPaint C;
    public final fn O;
    public fn f26119a;
    public MediaController.PhotoEntry f26120b;
    public ImageReceiver f26121c;
    public ImageReceiver d;
    public boolean f26122e;
    public float f26128l;
    public float f26129m;
    public float f26130n;
    public float f26131o;
    public vh.f f26135s;
    public Bitmap v;
    public RectF f26123f = null;
    public final RectF f26124g = new RectF();
    public long h = 0;
    public int f26125i = 0;
    public float f26126j = 1.0f;
    public float f26127k = 0.0f;
    public RectF f26132p = null;
    public final RectF f26133q = new RectF();
    public String f26134r = null;
    public final Path f26136t = new Path();
    public final float[] f26137u = new float[8];
    public float f26138w = 1.0f;
    public final Paint f26139x = new Paint(1);
    public final RectF f26140y = new RectF();
    public final Paint f26141z = new Paint(1);
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

    public en(fn fnVar) {
        this.O = fnVar;
        this.f26119a = fnVar;
    }

    public static void a(en enVar, MediaController.PhotoEntry photoEntry) {
        fn fnVar = enVar.O;
        enVar.f26120b = photoEntry;
        if (photoEntry.isVideo) {
            enVar.f26134r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            enVar.f26134r = null;
        }
        if (enVar.f26121c == null) {
            enVar.f26121c = new ImageReceiver(fnVar.f26512z);
            enVar.d = new ImageReceiver(fnVar.f26512z);
            enVar.f26121c.setDelegate(new y2(8, enVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            enVar.f26121c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = enVar.f26121c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                enVar.f26121c.setAllowStartAnimation(true);
                return;
            }
            enVar.f26121c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = enVar.f26121c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            enVar.f26121c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(en enVar, an anVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = enVar.f26133q;
        RectF rectF2 = enVar.f26124g;
        if (anVar != null && groupedMessagePosition != null) {
            enVar.f26125i = groupedMessagePosition.flags;
            if (z10) {
                float e7 = enVar.e();
                RectF rectF3 = enVar.f26123f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e7, rectF3);
                }
                RectF rectF4 = enVar.f26132p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e7, rectF4);
                }
                enVar.f26126j = AndroidUtilities.lerp(enVar.f26126j, enVar.f26127k, e7);
                enVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = anVar.f24630c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = anVar.f24632f;
            float f17 = f15 / f16;
            enVar.f26127k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17284ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = enVar.f26125i;
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
            if (enVar.f26123f == null) {
                RectF rectF5 = new RectF();
                enVar.f26123f = rectF5;
                rectF5.set(rectF2);
            }
            if (enVar.f26132p == null) {
                RectF rectF6 = new RectF();
                enVar.f26132p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            enVar.f26126j = AndroidUtilities.lerp(enVar.f26126j, enVar.f26127k, enVar.e());
            RectF rectF7 = enVar.f26123f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, enVar.e(), enVar.f26123f);
            }
            enVar.f26127k = 0.0f;
            enVar.h = elapsedRealtime;
        } else {
            enVar.f26126j = 0.0f;
            enVar.f26127k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.en.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        en enVar = new en(this.O);
        enVar.f26124g.set(this.f26124g);
        enVar.f26121c = this.f26121c;
        enVar.f26120b = this.f26120b;
        return enVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26124g != null && this.f26121c != null) {
            gn gnVar = this.O.f26512z;
            en enVar = gnVar.P.J;
            if (enVar != null && enVar.f26120b == this.f26120b) {
                f7 = gnVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26126j, this.f26127k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a1.g.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26140y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26497j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26140y;
        RectF rectF3 = this.f26124g;
        if (rectF3 != null && this.f26121c != null) {
            fn fnVar = this.O;
            float f10 = (rectF3.left * fnVar.f26505r) + fnVar.f26501n;
            float f11 = (rectF3.top * fnVar.f26506s) + fnVar.f26503p;
            float width = rectF3.width() * fnVar.f26505r;
            float height = rectF3.height() * fnVar.f26506s;
            if (f7 < 1.0f && (rectF = this.f26123f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * fnVar.f26505r) + fnVar.f26501n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f26123f.top * fnVar.f26506s) + fnVar.f26503p, f11, f7);
                width = AndroidUtilities.lerp(this.f26123f.width() * fnVar.f26505r, width, f7);
                height = AndroidUtilities.lerp(this.f26123f.height() * fnVar.f26506s, height, f7);
            }
            int i10 = this.f26125i;
            if ((i10 & 4) == 0) {
                int i11 = fnVar.f26500m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= fnVar.f26500m;
            }
            if ((i10 & 1) == 0) {
                int i12 = fnVar.f26500m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= fnVar.f26500m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
