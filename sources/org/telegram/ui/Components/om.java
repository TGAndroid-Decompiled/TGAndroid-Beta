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
public final class om {
    public TextPaint B;
    public TextPaint C;
    public final pm O;
    public pm f27114a;
    public MediaController.PhotoEntry f27115b;
    public ImageReceiver f27116c;
    public ImageReceiver d;
    public boolean e;
    public float f27122l;
    public float f27123m;
    public float f27124n;
    public float f27125o;
    public vh.f f27129s;
    public Bitmap v;
    public RectF f27117f = null;
    public final RectF f27118g = new RectF();
    public long h = 0;
    public int f27119i = 0;
    public float f27120j = 1.0f;
    public float f27121k = 0.0f;
    public RectF f27126p = null;
    public final RectF f27127q = new RectF();
    public String f27128r = null;
    public final Path f27130t = new Path();
    public final float[] f27131u = new float[8];
    public float f27132w = 1.0f;
    public final Paint f27133x = new Paint(1);
    public final RectF f27134y = new RectF();
    public final Paint f27135z = new Paint(1);
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

    public om(pm pmVar) {
        this.O = pmVar;
        this.f27114a = pmVar;
    }

    public static void a(om omVar, MediaController.PhotoEntry photoEntry) {
        pm pmVar = omVar.O;
        omVar.f27115b = photoEntry;
        if (photoEntry.isVideo) {
            omVar.f27128r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            omVar.f27128r = null;
        }
        if (omVar.f27116c == null) {
            omVar.f27116c = new ImageReceiver(pmVar.f27390z);
            omVar.d = new ImageReceiver(pmVar.f27390z);
            omVar.f27116c.setDelegate(new w2(7, omVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            omVar.f27116c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = omVar.f27116c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                omVar.f27116c.setAllowStartAnimation(true);
                return;
            }
            omVar.f27116c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = omVar.f27116c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            omVar.f27116c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(om omVar, km kmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = omVar.f27127q;
        RectF rectF2 = omVar.f27118g;
        if (kmVar != null && groupedMessagePosition != null) {
            omVar.f27119i = groupedMessagePosition.flags;
            if (z10) {
                float e = omVar.e();
                RectF rectF3 = omVar.f27117f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = omVar.f27126p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                omVar.f27120j = AndroidUtilities.lerp(omVar.f27120j, omVar.f27121k, e);
                omVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = kmVar.f25798c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = kmVar.f25799f;
            float f17 = f15 / f16;
            omVar.f27121k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15814ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = omVar.f27119i;
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
            if (omVar.f27117f == null) {
                RectF rectF5 = new RectF();
                omVar.f27117f = rectF5;
                rectF5.set(rectF2);
            }
            if (omVar.f27126p == null) {
                RectF rectF6 = new RectF();
                omVar.f27126p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            omVar.f27120j = AndroidUtilities.lerp(omVar.f27120j, omVar.f27121k, omVar.e());
            RectF rectF7 = omVar.f27117f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, omVar.e(), omVar.f27117f);
            }
            omVar.f27121k = 0.0f;
            omVar.h = elapsedRealtime;
        } else {
            omVar.f27120j = 0.0f;
            omVar.f27121k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.om.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        om omVar = new om(this.O);
        omVar.f27118g.set(this.f27118g);
        omVar.f27116c = this.f27116c;
        omVar.f27115b = this.f27115b;
        return omVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f27118g != null && this.f27116c != null) {
            qm qmVar = this.O.f27390z;
            om omVar = qmVar.P.J;
            if (omVar != null && omVar.f27115b == this.f27115b) {
                f7 = qmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f27120j, this.f27121k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f27134y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f27375j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f27134y;
        RectF rectF3 = this.f27118g;
        if (rectF3 != null && this.f27116c != null) {
            pm pmVar = this.O;
            float f10 = (rectF3.left * pmVar.f27383r) + pmVar.f27379n;
            float f11 = (rectF3.top * pmVar.f27384s) + pmVar.f27381p;
            float width = rectF3.width() * pmVar.f27383r;
            float height = rectF3.height() * pmVar.f27384s;
            if (f7 < 1.0f && (rectF = this.f27117f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * pmVar.f27383r) + pmVar.f27379n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f27117f.top * pmVar.f27384s) + pmVar.f27381p, f11, f7);
                width = AndroidUtilities.lerp(this.f27117f.width() * pmVar.f27383r, width, f7);
                height = AndroidUtilities.lerp(this.f27117f.height() * pmVar.f27384s, height, f7);
            }
            int i10 = this.f27119i;
            if ((i10 & 4) == 0) {
                int i11 = pmVar.f27378m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= pmVar.f27378m;
            }
            if ((i10 & 1) == 0) {
                int i12 = pmVar.f27378m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= pmVar.f27378m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
