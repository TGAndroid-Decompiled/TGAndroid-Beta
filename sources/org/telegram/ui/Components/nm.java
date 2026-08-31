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
    public om f29541a;
    public MediaController.PhotoEntry f29542b;
    public ImageReceiver f29543c;
    public ImageReceiver d;
    public boolean f29544e;
    public float f29550l;
    public float f29551m;
    public float f29552n;
    public float f29553o;
    public jh.j f29557s;
    public Bitmap v;
    public RectF f29545f = null;
    public final RectF f29546g = new RectF();
    public long h = 0;
    public int f29547i = 0;
    public float f29548j = 1.0f;
    public float f29549k = 0.0f;
    public RectF f29554p = null;
    public final RectF f29555q = new RectF();
    public String f29556r = null;
    public final Path f29558t = new Path();
    public final float[] f29559u = new float[8];
    public float f29560w = 1.0f;
    public final Paint f29561x = new Paint(1);
    public final RectF f29562y = new RectF();
    public final Paint f29563z = new Paint(1);
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
        this.f29541a = omVar;
    }

    public static void a(nm nmVar, MediaController.PhotoEntry photoEntry) {
        om omVar = nmVar.O;
        nmVar.f29542b = photoEntry;
        if (photoEntry.isVideo) {
            nmVar.f29556r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            nmVar.f29556r = null;
        }
        if (nmVar.f29543c == null) {
            nmVar.f29543c = new ImageReceiver(omVar.f29820z);
            nmVar.d = new ImageReceiver(omVar.f29820z);
            nmVar.f29543c.setDelegate(new o1(14, nmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            nmVar.f29543c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = nmVar.f29543c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
                nmVar.f29543c.setAllowStartAnimation(true);
                return;
            }
            nmVar.f29543c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = nmVar.f29543c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else {
            nmVar.f29543c.setImageBitmap(org.telegram.ui.ActionBar.k6.R4);
        }
    }

    public static void b(nm nmVar, im imVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z4) {
        float f10;
        float f11;
        float f12;
        RectF rectF = nmVar.f29555q;
        RectF rectF2 = nmVar.f29546g;
        if (imVar != null && groupedMessagePosition != null) {
            nmVar.f29547i = groupedMessagePosition.flags;
            if (z4) {
                float e6 = nmVar.e();
                RectF rectF3 = nmVar.f29545f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e6, rectF3);
                }
                RectF rectF4 = nmVar.f29554p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e6, rectF4);
                }
                nmVar.f29548j = AndroidUtilities.lerp(nmVar.f29548j, nmVar.f29549k, e6);
                nmVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = groupedMessagePosition.left;
            float f14 = imVar.f27857c;
            float f15 = f13 / f14;
            float f16 = groupedMessagePosition.top;
            float f17 = imVar.f27859f;
            float f18 = f16 / f17;
            nmVar.f29549k = 1.0f;
            rectF2.set(f15, f18, (groupedMessagePosition.pw / f14) + f15, (groupedMessagePosition.f18052ph / f17) + f18);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = nmVar.f29547i;
            if ((i10 & 5) == 5) {
                f10 = dp2;
            } else {
                f10 = dp;
            }
            if ((i10 & 6) == 6) {
                f11 = dp2;
            } else {
                f11 = dp;
            }
            if ((i10 & 10) == 10) {
                f12 = dp2;
            } else {
                f12 = dp;
            }
            if ((i10 & 9) == 9) {
                dp = dp2;
            }
            rectF.set(f10, f11, f12, dp);
            if (nmVar.f29545f == null) {
                RectF rectF5 = new RectF();
                nmVar.f29545f = rectF5;
                rectF5.set(rectF2);
            }
            if (nmVar.f29554p == null) {
                RectF rectF6 = new RectF();
                nmVar.f29554p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z4) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nmVar.f29548j = AndroidUtilities.lerp(nmVar.f29548j, nmVar.f29549k, nmVar.e());
            RectF rectF7 = nmVar.f29545f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, nmVar.e(), nmVar.f29545f);
            }
            nmVar.f29549k = 0.0f;
            nmVar.h = elapsedRealtime;
        } else {
            nmVar.f29548j = 0.0f;
            nmVar.f29549k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        nm nmVar = new nm(this.O);
        nmVar.f29546g.set(this.f29546g);
        nmVar.f29543c = this.f29543c;
        nmVar.f29542b = this.f29542b;
        return nmVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f29546g != null && this.f29543c != null) {
            pm pmVar = this.O.f29820z;
            nm nmVar = pmVar.M.G;
            if (nmVar != null && nmVar.f29542b == this.f29542b) {
                f10 = pmVar.D;
            }
            float lerp = (((1.0f - f10) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f29548j, this.f29549k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - lerp;
            float f13 = lerp + 1.0f;
            f11.set(android.support.v4.media.a.d(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, android.support.v4.media.a.d(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f29562y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f29805j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f29562y;
        RectF rectF3 = this.f29546g;
        if (rectF3 != null && this.f29543c != null) {
            om omVar = this.O;
            float f11 = (rectF3.left * omVar.f29813r) + omVar.f29809n;
            float f12 = (rectF3.top * omVar.f29814s) + omVar.f29811p;
            float width = rectF3.width() * omVar.f29813r;
            float height = rectF3.height() * omVar.f29814s;
            if (f10 < 1.0f && (rectF = this.f29545f) != null) {
                f11 = AndroidUtilities.lerp((rectF.left * omVar.f29813r) + omVar.f29809n, f11, f10);
                f12 = AndroidUtilities.lerp((this.f29545f.top * omVar.f29814s) + omVar.f29811p, f12, f10);
                width = AndroidUtilities.lerp(this.f29545f.width() * omVar.f29813r, width, f10);
                height = AndroidUtilities.lerp(this.f29545f.height() * omVar.f29814s, height, f10);
            }
            int i10 = this.f29547i;
            if ((i10 & 4) == 0) {
                int i11 = omVar.f29808m;
                f12 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= omVar.f29808m;
            }
            if ((i10 & 1) == 0) {
                int i12 = omVar.f29808m;
                f11 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= omVar.f29808m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
