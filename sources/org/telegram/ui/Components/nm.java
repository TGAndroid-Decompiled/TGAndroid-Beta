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
    public om f26482a;
    public MediaController.PhotoEntry f26483b;
    public ImageReceiver f26484c;
    public ImageReceiver d;
    public boolean e;
    public float f26490l;
    public float f26491m;
    public float f26492n;
    public float f26493o;
    public vh.g f26497s;
    public Bitmap v;
    public RectF f26485f = null;
    public final RectF f26486g = new RectF();
    public long h = 0;
    public int f26487i = 0;
    public float f26488j = 1.0f;
    public float f26489k = 0.0f;
    public RectF f26494p = null;
    public final RectF f26495q = new RectF();
    public String f26496r = null;
    public final Path f26498t = new Path();
    public final float[] f26499u = new float[8];
    public float f26500w = 1.0f;
    public final Paint f26501x = new Paint(1);
    public final RectF f26502y = new RectF();
    public final Paint f26503z = new Paint(1);
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
        this.f26482a = omVar;
    }

    public static void a(nm nmVar, MediaController.PhotoEntry photoEntry) {
        om omVar = nmVar.O;
        nmVar.f26483b = photoEntry;
        if (photoEntry.isVideo) {
            nmVar.f26496r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            nmVar.f26496r = null;
        }
        if (nmVar.f26484c == null) {
            nmVar.f26484c = new ImageReceiver(omVar.f26803z);
            nmVar.d = new ImageReceiver(omVar.f26803z);
            nmVar.f26484c.setDelegate(new mf(5, nmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            nmVar.f26484c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = nmVar.f26484c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
                nmVar.f26484c.setAllowStartAnimation(true);
                return;
            }
            nmVar.f26484c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = nmVar.f26484c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else {
            nmVar.f26484c.setImageBitmap(org.telegram.ui.ActionBar.j6.R4);
        }
    }

    public static void b(nm nmVar, jm jmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = nmVar.f26495q;
        RectF rectF2 = nmVar.f26486g;
        if (jmVar != null && groupedMessagePosition != null) {
            nmVar.f26487i = groupedMessagePosition.flags;
            if (z10) {
                float e = nmVar.e();
                RectF rectF3 = nmVar.f26485f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = nmVar.f26494p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                nmVar.f26488j = AndroidUtilities.lerp(nmVar.f26488j, nmVar.f26489k, e);
                nmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = jmVar.f25326c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = jmVar.f25327f;
            float f17 = f15 / f16;
            nmVar.f26489k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15610ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = nmVar.f26487i;
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
            if (nmVar.f26485f == null) {
                RectF rectF5 = new RectF();
                nmVar.f26485f = rectF5;
                rectF5.set(rectF2);
            }
            if (nmVar.f26494p == null) {
                RectF rectF6 = new RectF();
                nmVar.f26494p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nmVar.f26488j = AndroidUtilities.lerp(nmVar.f26488j, nmVar.f26489k, nmVar.e());
            RectF rectF7 = nmVar.f26485f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, nmVar.e(), nmVar.f26485f);
            }
            nmVar.f26489k = 0.0f;
            nmVar.h = elapsedRealtime;
        } else {
            nmVar.f26488j = 0.0f;
            nmVar.f26489k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        nm nmVar = new nm(this.O);
        nmVar.f26486g.set(this.f26486g);
        nmVar.f26484c = this.f26484c;
        nmVar.f26483b = this.f26483b;
        return nmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26486g != null && this.f26484c != null) {
            pm pmVar = this.O.f26803z;
            nm nmVar = pmVar.P.J;
            if (nmVar != null && nmVar.f26483b == this.f26483b) {
                f7 = pmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26488j, this.f26489k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26502y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26788j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26502y;
        RectF rectF3 = this.f26486g;
        if (rectF3 != null && this.f26484c != null) {
            om omVar = this.O;
            float f10 = (rectF3.left * omVar.f26796r) + omVar.f26792n;
            float f11 = (rectF3.top * omVar.f26797s) + omVar.f26794p;
            float width = rectF3.width() * omVar.f26796r;
            float height = rectF3.height() * omVar.f26797s;
            if (f7 < 1.0f && (rectF = this.f26485f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * omVar.f26796r) + omVar.f26792n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f26485f.top * omVar.f26797s) + omVar.f26794p, f11, f7);
                width = AndroidUtilities.lerp(this.f26485f.width() * omVar.f26796r, width, f7);
                height = AndroidUtilities.lerp(this.f26485f.height() * omVar.f26797s, height, f7);
            }
            int i10 = this.f26487i;
            if ((i10 & 4) == 0) {
                int i11 = omVar.f26791m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= omVar.f26791m;
            }
            if ((i10 & 1) == 0) {
                int i12 = omVar.f26791m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= omVar.f26791m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
