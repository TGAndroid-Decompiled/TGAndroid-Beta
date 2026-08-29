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
public final class im {
    public TextPaint B;
    public TextPaint C;
    public final jm O;
    public jm f29408a;
    public MediaController.PhotoEntry f29409b;
    public ImageReceiver f29410c;
    public ImageReceiver d;
    public boolean f29411e;
    public float f29417l;
    public float f29418m;
    public float f29419n;
    public float f29420o;
    public gh.j f29424s;
    public Bitmap v;
    public RectF f29412f = null;
    public final RectF f29413g = new RectF();
    public long h = 0;
    public int f29414i = 0;
    public float f29415j = 1.0f;
    public float f29416k = 0.0f;
    public RectF f29421p = null;
    public final RectF f29422q = new RectF();
    public String f29423r = null;
    public final Path f29425t = new Path();
    public final float[] f29426u = new float[8];
    public float f29427w = 1.0f;
    public final Paint f29428x = new Paint(1);
    public final RectF f29429y = new RectF();
    public final Paint f29430z = new Paint(1);
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

    public im(jm jmVar) {
        this.O = jmVar;
        this.f29408a = jmVar;
    }

    public static void a(im imVar, MediaController.PhotoEntry photoEntry) {
        jm jmVar = imVar.O;
        imVar.f29409b = photoEntry;
        if (photoEntry.isVideo) {
            imVar.f29423r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            imVar.f29423r = null;
        }
        if (imVar.f29410c == null) {
            imVar.f29410c = new ImageReceiver(jmVar.f29760z);
            imVar.d = new ImageReceiver(jmVar.f29760z);
            imVar.f29410c.setDelegate(new j1(15, imVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            imVar.f29410c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.g6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = imVar.f29410c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.g6.R4, 0L, null, null, 0);
                imVar.f29410c.setAllowStartAnimation(true);
                return;
            }
            imVar.f29410c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = imVar.f29410c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.g6.R4, 0L, null, null, 0);
        } else {
            imVar.f29410c.setImageBitmap(org.telegram.ui.ActionBar.g6.R4);
        }
    }

    public static void b(im imVar, em emVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f9;
        float f10;
        float f11;
        RectF rectF = imVar.f29422q;
        RectF rectF2 = imVar.f29413g;
        if (emVar != null && groupedMessagePosition != null) {
            imVar.f29414i = groupedMessagePosition.flags;
            if (z10) {
                float e10 = imVar.e();
                RectF rectF3 = imVar.f29412f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = imVar.f29421p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e10, rectF4);
                }
                imVar.f29415j = AndroidUtilities.lerp(imVar.f29415j, imVar.f29416k, e10);
                imVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = emVar.f28109c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = emVar.f28111f;
            float f17 = f15 / f16;
            imVar.f29416k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f19617ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = imVar.f29414i;
            if ((i10 & 5) == 5) {
                f9 = dp2;
            } else {
                f9 = dp;
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
            rectF.set(f9, f10, f11, dp);
            if (imVar.f29412f == null) {
                RectF rectF5 = new RectF();
                imVar.f29412f = rectF5;
                rectF5.set(rectF2);
            }
            if (imVar.f29421p == null) {
                RectF rectF6 = new RectF();
                imVar.f29421p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            imVar.f29415j = AndroidUtilities.lerp(imVar.f29415j, imVar.f29416k, imVar.e());
            RectF rectF7 = imVar.f29412f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, imVar.e(), imVar.f29412f);
            }
            imVar.f29416k = 0.0f;
            imVar.h = elapsedRealtime;
        } else {
            imVar.f29415j = 0.0f;
            imVar.f29416k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.im.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        im imVar = new im(this.O);
        imVar.f29413g.set(this.f29413g);
        imVar.f29410c = this.f29410c;
        imVar.f29409b = this.f29409b;
        return imVar;
    }

    public final RectF d() {
        float f9 = 0.0f;
        if (this.f29413g != null && this.f29410c != null) {
            km kmVar = this.O.f29760z;
            im imVar = kmVar.L.F;
            if (imVar != null && imVar.f29409b == this.f29409b) {
                f9 = kmVar.C;
            }
            float lerp = (((1.0f - f9) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f29415j, this.f29416k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.w.d(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.w.d(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f29429y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f29745j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f9) {
        RectF rectF;
        RectF rectF2 = this.f29429y;
        RectF rectF3 = this.f29413g;
        if (rectF3 != null && this.f29410c != null) {
            jm jmVar = this.O;
            float f10 = (rectF3.left * jmVar.f29753r) + jmVar.f29749n;
            float f11 = (rectF3.top * jmVar.f29754s) + jmVar.f29751p;
            float width = rectF3.width() * jmVar.f29753r;
            float height = rectF3.height() * jmVar.f29754s;
            if (f9 < 1.0f && (rectF = this.f29412f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * jmVar.f29753r) + jmVar.f29749n, f10, f9);
                f11 = AndroidUtilities.lerp((this.f29412f.top * jmVar.f29754s) + jmVar.f29751p, f11, f9);
                width = AndroidUtilities.lerp(this.f29412f.width() * jmVar.f29753r, width, f9);
                height = AndroidUtilities.lerp(this.f29412f.height() * jmVar.f29754s, height, f9);
            }
            int i10 = this.f29414i;
            if ((i10 & 4) == 0) {
                int i11 = jmVar.f29748m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= jmVar.f29748m;
            }
            if ((i10 & 1) == 0) {
                int i12 = jmVar.f29748m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= jmVar.f29748m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
