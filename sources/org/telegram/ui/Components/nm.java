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
    public om f26496a;
    public MediaController.PhotoEntry f26497b;
    public ImageReceiver f26498c;
    public ImageReceiver d;
    public boolean e;
    public float f26504l;
    public float f26505m;
    public float f26506n;
    public float f26507o;
    public vh.g f26511s;
    public Bitmap v;
    public RectF f26499f = null;
    public final RectF f26500g = new RectF();
    public long h = 0;
    public int f26501i = 0;
    public float f26502j = 1.0f;
    public float f26503k = 0.0f;
    public RectF f26508p = null;
    public final RectF f26509q = new RectF();
    public String f26510r = null;
    public final Path f26512t = new Path();
    public final float[] f26513u = new float[8];
    public float f26514w = 1.0f;
    public final Paint f26515x = new Paint(1);
    public final RectF f26516y = new RectF();
    public final Paint f26517z = new Paint(1);
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
        this.f26496a = omVar;
    }

    public static void a(nm nmVar, MediaController.PhotoEntry photoEntry) {
        om omVar = nmVar.O;
        nmVar.f26497b = photoEntry;
        if (photoEntry.isVideo) {
            nmVar.f26510r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            nmVar.f26510r = null;
        }
        if (nmVar.f26498c == null) {
            nmVar.f26498c = new ImageReceiver(omVar.f26858z);
            nmVar.d = new ImageReceiver(omVar.f26858z);
            nmVar.f26498c.setDelegate(new mf(5, nmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            nmVar.f26498c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = nmVar.f26498c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
                nmVar.f26498c.setAllowStartAnimation(true);
                return;
            }
            nmVar.f26498c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = nmVar.f26498c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else {
            nmVar.f26498c.setImageBitmap(org.telegram.ui.ActionBar.i6.R4);
        }
    }

    public static void b(nm nmVar, jm jmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = nmVar.f26509q;
        RectF rectF2 = nmVar.f26500g;
        if (jmVar != null && groupedMessagePosition != null) {
            nmVar.f26501i = groupedMessagePosition.flags;
            if (z10) {
                float e = nmVar.e();
                RectF rectF3 = nmVar.f26499f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = nmVar.f26508p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                nmVar.f26502j = AndroidUtilities.lerp(nmVar.f26502j, nmVar.f26503k, e);
                nmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = jmVar.f25372c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = jmVar.f25373f;
            float f17 = f15 / f16;
            nmVar.f26503k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15598ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = nmVar.f26501i;
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
            if (nmVar.f26499f == null) {
                RectF rectF5 = new RectF();
                nmVar.f26499f = rectF5;
                rectF5.set(rectF2);
            }
            if (nmVar.f26508p == null) {
                RectF rectF6 = new RectF();
                nmVar.f26508p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nmVar.f26502j = AndroidUtilities.lerp(nmVar.f26502j, nmVar.f26503k, nmVar.e());
            RectF rectF7 = nmVar.f26499f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, nmVar.e(), nmVar.f26499f);
            }
            nmVar.f26503k = 0.0f;
            nmVar.h = elapsedRealtime;
        } else {
            nmVar.f26502j = 0.0f;
            nmVar.f26503k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        nm nmVar = new nm(this.O);
        nmVar.f26500g.set(this.f26500g);
        nmVar.f26498c = this.f26498c;
        nmVar.f26497b = this.f26497b;
        return nmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26500g != null && this.f26498c != null) {
            pm pmVar = this.O.f26858z;
            nm nmVar = pmVar.P.J;
            if (nmVar != null && nmVar.f26497b == this.f26497b) {
                f7 = pmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26502j, this.f26503k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26516y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26843j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26516y;
        RectF rectF3 = this.f26500g;
        if (rectF3 != null && this.f26498c != null) {
            om omVar = this.O;
            float f10 = (rectF3.left * omVar.f26851r) + omVar.f26847n;
            float f11 = (rectF3.top * omVar.f26852s) + omVar.f26849p;
            float width = rectF3.width() * omVar.f26851r;
            float height = rectF3.height() * omVar.f26852s;
            if (f7 < 1.0f && (rectF = this.f26499f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * omVar.f26851r) + omVar.f26847n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f26499f.top * omVar.f26852s) + omVar.f26849p, f11, f7);
                width = AndroidUtilities.lerp(this.f26499f.width() * omVar.f26851r, width, f7);
                height = AndroidUtilities.lerp(this.f26499f.height() * omVar.f26852s, height, f7);
            }
            int i10 = this.f26501i;
            if ((i10 & 4) == 0) {
                int i11 = omVar.f26846m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= omVar.f26846m;
            }
            if ((i10 & 1) == 0) {
                int i12 = omVar.f26846m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= omVar.f26846m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
