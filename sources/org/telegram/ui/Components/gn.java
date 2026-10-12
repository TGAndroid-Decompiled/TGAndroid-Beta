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
public final class gn {
    public TextPaint B;
    public TextPaint C;
    public final hn O;
    public hn f26455a;
    public MediaController.PhotoEntry f26456b;
    public ImageReceiver f26457c;
    public ImageReceiver d;
    public boolean f26458e;
    public float f26464l;
    public float f26465m;
    public float f26466n;
    public float f26467o;
    public vh.f f26471s;
    public Bitmap v;
    public RectF f26459f = null;
    public final RectF f26460g = new RectF();
    public long h = 0;
    public int f26461i = 0;
    public float f26462j = 1.0f;
    public float f26463k = 0.0f;
    public RectF f26468p = null;
    public final RectF f26469q = new RectF();
    public String f26470r = null;
    public final Path f26472t = new Path();
    public final float[] f26473u = new float[8];
    public float f26474w = 1.0f;
    public final Paint f26475x = new Paint(1);
    public final RectF f26476y = new RectF();
    public final Paint f26477z = new Paint(1);
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

    public gn(hn hnVar) {
        this.O = hnVar;
        this.f26455a = hnVar;
    }

    public static void a(gn gnVar, MediaController.PhotoEntry photoEntry) {
        hn hnVar = gnVar.O;
        gnVar.f26456b = photoEntry;
        if (photoEntry.isVideo) {
            gnVar.f26470r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            gnVar.f26470r = null;
        }
        if (gnVar.f26457c == null) {
            gnVar.f26457c = new ImageReceiver(hnVar.f26837z);
            gnVar.d = new ImageReceiver(hnVar.f26837z);
            gnVar.f26457c.setDelegate(new y2(7, gnVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            gnVar.f26457c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = gnVar.f26457c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                gnVar.f26457c.setAllowStartAnimation(true);
                return;
            }
            gnVar.f26457c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = gnVar.f26457c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            gnVar.f26457c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(gn gnVar, cn cnVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = gnVar.f26469q;
        RectF rectF2 = gnVar.f26460g;
        if (cnVar != null && groupedMessagePosition != null) {
            gnVar.f26461i = groupedMessagePosition.flags;
            if (z10) {
                float e7 = gnVar.e();
                RectF rectF3 = gnVar.f26459f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e7, rectF3);
                }
                RectF rectF4 = gnVar.f26468p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e7, rectF4);
                }
                gnVar.f26462j = AndroidUtilities.lerp(gnVar.f26462j, gnVar.f26463k, e7);
                gnVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = cnVar.f24975c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = cnVar.f24977f;
            float f17 = f15 / f16;
            gnVar.f26463k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17000ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = gnVar.f26461i;
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
            if (gnVar.f26459f == null) {
                RectF rectF5 = new RectF();
                gnVar.f26459f = rectF5;
                rectF5.set(rectF2);
            }
            if (gnVar.f26468p == null) {
                RectF rectF6 = new RectF();
                gnVar.f26468p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            gnVar.f26462j = AndroidUtilities.lerp(gnVar.f26462j, gnVar.f26463k, gnVar.e());
            RectF rectF7 = gnVar.f26459f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, gnVar.e(), gnVar.f26459f);
            }
            gnVar.f26463k = 0.0f;
            gnVar.h = elapsedRealtime;
        } else {
            gnVar.f26462j = 0.0f;
            gnVar.f26463k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gn.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        gn gnVar = new gn(this.O);
        gnVar.f26460g.set(this.f26460g);
        gnVar.f26457c = this.f26457c;
        gnVar.f26456b = this.f26456b;
        return gnVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26460g != null && this.f26457c != null) {
            in inVar = this.O.f26837z;
            gn gnVar = inVar.P.J;
            if (gnVar != null && gnVar.f26456b == this.f26456b) {
                f7 = inVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26462j, this.f26463k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a1.g.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26476y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26822j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26476y;
        RectF rectF3 = this.f26460g;
        if (rectF3 != null && this.f26457c != null) {
            hn hnVar = this.O;
            float f10 = (rectF3.left * hnVar.f26830r) + hnVar.f26826n;
            float f11 = (rectF3.top * hnVar.f26831s) + hnVar.f26828p;
            float width = rectF3.width() * hnVar.f26830r;
            float height = rectF3.height() * hnVar.f26831s;
            if (f7 < 1.0f && (rectF = this.f26459f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * hnVar.f26830r) + hnVar.f26826n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f26459f.top * hnVar.f26831s) + hnVar.f26828p, f11, f7);
                width = AndroidUtilities.lerp(this.f26459f.width() * hnVar.f26830r, width, f7);
                height = AndroidUtilities.lerp(this.f26459f.height() * hnVar.f26831s, height, f7);
            }
            int i10 = this.f26461i;
            if ((i10 & 4) == 0) {
                int i11 = hnVar.f26825m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= hnVar.f26825m;
            }
            if ((i10 & 1) == 0) {
                int i12 = hnVar.f26825m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= hnVar.f26825m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
