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
public final class nm {
    public TextPaint B;
    public TextPaint C;
    public final om O;
    public om f26497a;
    public MediaController.PhotoEntry f26498b;
    public ImageReceiver f26499c;
    public ImageReceiver d;
    public boolean e;
    public float f26505l;
    public float f26506m;
    public float f26507n;
    public float f26508o;
    public vh.g f26512s;
    public Bitmap v;
    public RectF f26500f = null;
    public final RectF f26501g = new RectF();
    public long h = 0;
    public int f26502i = 0;
    public float f26503j = 1.0f;
    public float f26504k = 0.0f;
    public RectF f26509p = null;
    public final RectF f26510q = new RectF();
    public String f26511r = null;
    public final Path f26513t = new Path();
    public final float[] f26514u = new float[8];
    public float f26515w = 1.0f;
    public final Paint f26516x = new Paint(1);
    public final RectF f26517y = new RectF();
    public final Paint f26518z = new Paint(1);
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

    public nm(om omVar) {
        this.O = omVar;
        this.f26497a = omVar;
    }

    public static void a(nm nmVar, MediaController.PhotoEntry photoEntry) {
        om omVar = nmVar.O;
        nmVar.f26498b = photoEntry;
        if (photoEntry.isVideo) {
            nmVar.f26511r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            nmVar.f26511r = null;
        }
        if (nmVar.f26499c == null) {
            nmVar.f26499c = new ImageReceiver(omVar.f26861z);
            nmVar.d = new ImageReceiver(omVar.f26861z);
            nmVar.f26499c.setDelegate(new mf(5, nmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            nmVar.f26499c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = nmVar.f26499c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
                nmVar.f26499c.setAllowStartAnimation(true);
                return;
            }
            nmVar.f26499c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = nmVar.f26499c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else {
            nmVar.f26499c.setImageBitmap(org.telegram.ui.ActionBar.i6.R4);
        }
    }

    public static void b(nm nmVar, jm jmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = nmVar.f26510q;
        RectF rectF2 = nmVar.f26501g;
        if (jmVar != null && groupedMessagePosition != null) {
            nmVar.f26502i = groupedMessagePosition.flags;
            if (z10) {
                float e = nmVar.e();
                RectF rectF3 = nmVar.f26500f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = nmVar.f26509p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                nmVar.f26503j = AndroidUtilities.lerp(nmVar.f26503j, nmVar.f26504k, e);
                nmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = jmVar.f25375c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = jmVar.f25376f;
            float f17 = f15 / f16;
            nmVar.f26504k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15600ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = nmVar.f26502i;
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
            if (nmVar.f26500f == null) {
                RectF rectF5 = new RectF();
                nmVar.f26500f = rectF5;
                rectF5.set(rectF2);
            }
            if (nmVar.f26509p == null) {
                RectF rectF6 = new RectF();
                nmVar.f26509p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nmVar.f26503j = AndroidUtilities.lerp(nmVar.f26503j, nmVar.f26504k, nmVar.e());
            RectF rectF7 = nmVar.f26500f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, nmVar.e(), nmVar.f26500f);
            }
            nmVar.f26504k = 0.0f;
            nmVar.h = elapsedRealtime;
        } else {
            nmVar.f26503j = 0.0f;
            nmVar.f26504k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        nm nmVar = new nm(this.O);
        nmVar.f26501g.set(this.f26501g);
        nmVar.f26499c = this.f26499c;
        nmVar.f26498b = this.f26498b;
        return nmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26501g != null && this.f26499c != null) {
            pm pmVar = this.O.f26861z;
            nm nmVar = pmVar.P.J;
            if (nmVar != null && nmVar.f26498b == this.f26498b) {
                f7 = pmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26503j, this.f26504k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26517y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26846j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26517y;
        RectF rectF3 = this.f26501g;
        if (rectF3 != null && this.f26499c != null) {
            om omVar = this.O;
            float f10 = (rectF3.left * omVar.f26854r) + omVar.f26850n;
            float f11 = (rectF3.top * omVar.f26855s) + omVar.f26852p;
            float width = rectF3.width() * omVar.f26854r;
            float height = rectF3.height() * omVar.f26855s;
            if (f7 < 1.0f && (rectF = this.f26500f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * omVar.f26854r) + omVar.f26850n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f26500f.top * omVar.f26855s) + omVar.f26852p, f11, f7);
                width = AndroidUtilities.lerp(this.f26500f.width() * omVar.f26854r, width, f7);
                height = AndroidUtilities.lerp(this.f26500f.height() * omVar.f26855s, height, f7);
            }
            int i10 = this.f26502i;
            if ((i10 & 4) == 0) {
                int i11 = omVar.f26849m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= omVar.f26849m;
            }
            if ((i10 & 1) == 0) {
                int i12 = omVar.f26849m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= omVar.f26849m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
