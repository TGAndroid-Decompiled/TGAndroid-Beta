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
    public qm f27368a;
    public MediaController.PhotoEntry f27369b;
    public ImageReceiver f27370c;
    public ImageReceiver d;
    public boolean e;
    public float f27376l;
    public float f27377m;
    public float f27378n;
    public float f27379o;
    public vh.f f27383s;
    public Bitmap v;
    public RectF f27371f = null;
    public final RectF f27372g = new RectF();
    public long h = 0;
    public int f27373i = 0;
    public float f27374j = 1.0f;
    public float f27375k = 0.0f;
    public RectF f27380p = null;
    public final RectF f27381q = new RectF();
    public String f27382r = null;
    public final Path f27384t = new Path();
    public final float[] f27385u = new float[8];
    public float f27386w = 1.0f;
    public final Paint f27387x = new Paint(1);
    public final RectF f27388y = new RectF();
    public final Paint f27389z = new Paint(1);
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
        this.f27368a = qmVar;
    }

    public static void a(pm pmVar, MediaController.PhotoEntry photoEntry) {
        qm qmVar = pmVar.O;
        pmVar.f27369b = photoEntry;
        if (photoEntry.isVideo) {
            pmVar.f27382r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            pmVar.f27382r = null;
        }
        if (pmVar.f27370c == null) {
            pmVar.f27370c = new ImageReceiver(qmVar.f27790z);
            pmVar.d = new ImageReceiver(qmVar.f27790z);
            pmVar.f27370c.setDelegate(new w2(7, pmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            pmVar.f27370c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = pmVar.f27370c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                pmVar.f27370c.setAllowStartAnimation(true);
                return;
            }
            pmVar.f27370c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = pmVar.f27370c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            pmVar.f27370c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(pm pmVar, lm lmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = pmVar.f27381q;
        RectF rectF2 = pmVar.f27372g;
        if (lmVar != null && groupedMessagePosition != null) {
            pmVar.f27373i = groupedMessagePosition.flags;
            if (z10) {
                float e = pmVar.e();
                RectF rectF3 = pmVar.f27371f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = pmVar.f27380p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                pmVar.f27374j = AndroidUtilities.lerp(pmVar.f27374j, pmVar.f27375k, e);
                pmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = lmVar.f26033c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = lmVar.f26034f;
            float f17 = f15 / f16;
            pmVar.f27375k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15830ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = pmVar.f27373i;
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
            if (pmVar.f27371f == null) {
                RectF rectF5 = new RectF();
                pmVar.f27371f = rectF5;
                rectF5.set(rectF2);
            }
            if (pmVar.f27380p == null) {
                RectF rectF6 = new RectF();
                pmVar.f27380p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            pmVar.f27374j = AndroidUtilities.lerp(pmVar.f27374j, pmVar.f27375k, pmVar.e());
            RectF rectF7 = pmVar.f27371f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, pmVar.e(), pmVar.f27371f);
            }
            pmVar.f27375k = 0.0f;
            pmVar.h = elapsedRealtime;
        } else {
            pmVar.f27374j = 0.0f;
            pmVar.f27375k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        pm pmVar = new pm(this.O);
        pmVar.f27372g.set(this.f27372g);
        pmVar.f27370c = this.f27370c;
        pmVar.f27369b = this.f27369b;
        return pmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f27372g != null && this.f27370c != null) {
            rm rmVar = this.O.f27790z;
            pm pmVar = rmVar.P.J;
            if (pmVar != null && pmVar.f27369b == this.f27369b) {
                f7 = rmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f27374j, this.f27375k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f27388y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f27775j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f27388y;
        RectF rectF3 = this.f27372g;
        if (rectF3 != null && this.f27370c != null) {
            qm qmVar = this.O;
            float f10 = (rectF3.left * qmVar.f27783r) + qmVar.f27779n;
            float f11 = (rectF3.top * qmVar.f27784s) + qmVar.f27781p;
            float width = rectF3.width() * qmVar.f27783r;
            float height = rectF3.height() * qmVar.f27784s;
            if (f7 < 1.0f && (rectF = this.f27371f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * qmVar.f27783r) + qmVar.f27779n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f27371f.top * qmVar.f27784s) + qmVar.f27781p, f11, f7);
                width = AndroidUtilities.lerp(this.f27371f.width() * qmVar.f27783r, width, f7);
                height = AndroidUtilities.lerp(this.f27371f.height() * qmVar.f27784s, height, f7);
            }
            int i10 = this.f27373i;
            if ((i10 & 4) == 0) {
                int i11 = qmVar.f27778m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= qmVar.f27778m;
            }
            if ((i10 & 1) == 0) {
                int i12 = qmVar.f27778m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= qmVar.f27778m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
