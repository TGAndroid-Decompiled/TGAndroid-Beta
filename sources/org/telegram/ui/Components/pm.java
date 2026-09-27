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
public final class pm {
    public TextPaint B;
    public TextPaint C;
    public final qm O;
    public qm f27391a;
    public MediaController.PhotoEntry f27392b;
    public ImageReceiver f27393c;
    public ImageReceiver d;
    public boolean e;
    public float f27399l;
    public float f27400m;
    public float f27401n;
    public float f27402o;
    public vh.f f27406s;
    public Bitmap v;
    public RectF f27394f = null;
    public final RectF f27395g = new RectF();
    public long h = 0;
    public int f27396i = 0;
    public float f27397j = 1.0f;
    public float f27398k = 0.0f;
    public RectF f27403p = null;
    public final RectF f27404q = new RectF();
    public String f27405r = null;
    public final Path f27407t = new Path();
    public final float[] f27408u = new float[8];
    public float f27409w = 1.0f;
    public final Paint f27410x = new Paint(1);
    public final RectF f27411y = new RectF();
    public final Paint f27412z = new Paint(1);
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

    public pm(qm qmVar) {
        this.O = qmVar;
        this.f27391a = qmVar;
    }

    public static void a(pm pmVar, MediaController.PhotoEntry photoEntry) {
        qm qmVar = pmVar.O;
        pmVar.f27392b = photoEntry;
        if (photoEntry.isVideo) {
            pmVar.f27405r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            pmVar.f27405r = null;
        }
        if (pmVar.f27393c == null) {
            pmVar.f27393c = new ImageReceiver(qmVar.f27803z);
            pmVar.d = new ImageReceiver(qmVar.f27803z);
            pmVar.f27393c.setDelegate(new w2(7, pmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            pmVar.f27393c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = pmVar.f27393c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
                pmVar.f27393c.setAllowStartAnimation(true);
                return;
            }
            pmVar.f27393c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = pmVar.f27393c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else {
            pmVar.f27393c.setImageBitmap(org.telegram.ui.ActionBar.i6.R4);
        }
    }

    public static void b(pm pmVar, lm lmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = pmVar.f27404q;
        RectF rectF2 = pmVar.f27395g;
        if (lmVar != null && groupedMessagePosition != null) {
            pmVar.f27396i = groupedMessagePosition.flags;
            if (z10) {
                float e = pmVar.e();
                RectF rectF3 = pmVar.f27394f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = pmVar.f27403p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                pmVar.f27397j = AndroidUtilities.lerp(pmVar.f27397j, pmVar.f27398k, e);
                pmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = lmVar.f26084c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = lmVar.f26085f;
            float f17 = f15 / f16;
            pmVar.f27398k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15823ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = pmVar.f27396i;
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
            if (pmVar.f27394f == null) {
                RectF rectF5 = new RectF();
                pmVar.f27394f = rectF5;
                rectF5.set(rectF2);
            }
            if (pmVar.f27403p == null) {
                RectF rectF6 = new RectF();
                pmVar.f27403p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            pmVar.f27397j = AndroidUtilities.lerp(pmVar.f27397j, pmVar.f27398k, pmVar.e());
            RectF rectF7 = pmVar.f27394f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, pmVar.e(), pmVar.f27394f);
            }
            pmVar.f27398k = 0.0f;
            pmVar.h = elapsedRealtime;
        } else {
            pmVar.f27397j = 0.0f;
            pmVar.f27398k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        pm pmVar = new pm(this.O);
        pmVar.f27395g.set(this.f27395g);
        pmVar.f27393c = this.f27393c;
        pmVar.f27392b = this.f27392b;
        return pmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f27395g != null && this.f27393c != null) {
            rm rmVar = this.O.f27803z;
            pm pmVar = rmVar.P.J;
            if (pmVar != null && pmVar.f27392b == this.f27392b) {
                f7 = rmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f27397j, this.f27398k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f27411y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f27788j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f27411y;
        RectF rectF3 = this.f27395g;
        if (rectF3 != null && this.f27393c != null) {
            qm qmVar = this.O;
            float f10 = (rectF3.left * qmVar.f27796r) + qmVar.f27792n;
            float f11 = (rectF3.top * qmVar.f27797s) + qmVar.f27794p;
            float width = rectF3.width() * qmVar.f27796r;
            float height = rectF3.height() * qmVar.f27797s;
            if (f7 < 1.0f && (rectF = this.f27394f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * qmVar.f27796r) + qmVar.f27792n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f27394f.top * qmVar.f27797s) + qmVar.f27794p, f11, f7);
                width = AndroidUtilities.lerp(this.f27394f.width() * qmVar.f27796r, width, f7);
                height = AndroidUtilities.lerp(this.f27394f.height() * qmVar.f27797s, height, f7);
            }
            int i10 = this.f27396i;
            if ((i10 & 4) == 0) {
                int i11 = qmVar.f27791m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= qmVar.f27791m;
            }
            if ((i10 & 1) == 0) {
                int i12 = qmVar.f27791m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= qmVar.f27791m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
