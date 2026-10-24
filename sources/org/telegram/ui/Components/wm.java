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
public final class wm {
    public TextPaint B;
    public TextPaint C;
    public final xm O;
    public xm f32266a;
    public MediaController.PhotoEntry f32267b;
    public ImageReceiver f32268c;
    public ImageReceiver d;
    public boolean e;
    public float f32274l;
    public float f32275m;
    public float f32276n;
    public float f32277o;
    public wh.f f32281s;
    public Bitmap v;
    public RectF f32269f = null;
    public final RectF f32270g = new RectF();
    public long h = 0;
    public int f32271i = 0;
    public float f32272j = 1.0f;
    public float f32273k = 0.0f;
    public RectF f32278p = null;
    public final RectF f32279q = new RectF();
    public String f32280r = null;
    public final Path f32282t = new Path();
    public final float[] f32283u = new float[8];
    public float f32284w = 1.0f;
    public final Paint f32285x = new Paint(1);
    public final RectF f32286y = new RectF();
    public final Paint f32287z = new Paint(1);
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

    public wm(xm xmVar) {
        this.O = xmVar;
        this.f32266a = xmVar;
    }

    public static void a(wm wmVar, MediaController.PhotoEntry photoEntry) {
        xm xmVar = wmVar.O;
        wmVar.f32267b = photoEntry;
        if (photoEntry.isVideo) {
            wmVar.f32280r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            wmVar.f32280r = null;
        }
        if (wmVar.f32268c == null) {
            wmVar.f32268c = new ImageReceiver(xmVar.f32658z);
            wmVar.d = new ImageReceiver(xmVar.f32658z);
            wmVar.f32268c.setDelegate(new o2(12, wmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            wmVar.f32268c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = wmVar.f32268c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
                wmVar.f32268c.setAllowStartAnimation(true);
                return;
            }
            wmVar.f32268c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = wmVar.f32268c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else {
            wmVar.f32268c.setImageBitmap(org.telegram.ui.ActionBar.k6.R4);
        }
    }

    public static void b(wm wmVar, sm smVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = wmVar.f32279q;
        RectF rectF2 = wmVar.f32270g;
        if (smVar != null && groupedMessagePosition != null) {
            wmVar.f32271i = groupedMessagePosition.flags;
            if (z10) {
                float e = wmVar.e();
                RectF rectF3 = wmVar.f32269f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = wmVar.f32278p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                wmVar.f32272j = AndroidUtilities.lerp(wmVar.f32272j, wmVar.f32273k, e);
                wmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = smVar.f30568c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = smVar.f30569f;
            float f17 = f15 / f16;
            wmVar.f32273k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17859ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = wmVar.f32271i;
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
            if (wmVar.f32269f == null) {
                RectF rectF5 = new RectF();
                wmVar.f32269f = rectF5;
                rectF5.set(rectF2);
            }
            if (wmVar.f32278p == null) {
                RectF rectF6 = new RectF();
                wmVar.f32278p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            wmVar.f32272j = AndroidUtilities.lerp(wmVar.f32272j, wmVar.f32273k, wmVar.e());
            RectF rectF7 = wmVar.f32269f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, wmVar.e(), wmVar.f32269f);
            }
            wmVar.f32273k = 0.0f;
            wmVar.h = elapsedRealtime;
        } else {
            wmVar.f32272j = 0.0f;
            wmVar.f32273k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        wm wmVar = new wm(this.O);
        wmVar.f32270g.set(this.f32270g);
        wmVar.f32268c = this.f32268c;
        wmVar.f32267b = this.f32267b;
        return wmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f32270g != null && this.f32268c != null) {
            ym ymVar = this.O.f32658z;
            wm wmVar = ymVar.P.J;
            if (wmVar != null && wmVar.f32267b == this.f32267b) {
                f7 = ymVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f32272j, this.f32273k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a1.g.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f32286y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f32643j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f32286y;
        RectF rectF3 = this.f32270g;
        if (rectF3 != null && this.f32268c != null) {
            xm xmVar = this.O;
            float f10 = (rectF3.left * xmVar.f32651r) + xmVar.f32647n;
            float f11 = (rectF3.top * xmVar.f32652s) + xmVar.f32649p;
            float width = rectF3.width() * xmVar.f32651r;
            float height = rectF3.height() * xmVar.f32652s;
            if (f7 < 1.0f && (rectF = this.f32269f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * xmVar.f32651r) + xmVar.f32647n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f32269f.top * xmVar.f32652s) + xmVar.f32649p, f11, f7);
                width = AndroidUtilities.lerp(this.f32269f.width() * xmVar.f32651r, width, f7);
                height = AndroidUtilities.lerp(this.f32269f.height() * xmVar.f32652s, height, f7);
            }
            int i10 = this.f32271i;
            if ((i10 & 4) == 0) {
                int i11 = xmVar.f32646m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= xmVar.f32646m;
            }
            if ((i10 & 1) == 0) {
                int i12 = xmVar.f32646m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= xmVar.f32646m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
