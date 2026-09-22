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
    public om f26805a;
    public MediaController.PhotoEntry f26806b;
    public ImageReceiver f26807c;
    public ImageReceiver d;
    public boolean e;
    public float f26813l;
    public float f26814m;
    public float f26815n;
    public float f26816o;
    public vh.f f26820s;
    public Bitmap v;
    public RectF f26808f = null;
    public final RectF f26809g = new RectF();
    public long h = 0;
    public int f26810i = 0;
    public float f26811j = 1.0f;
    public float f26812k = 0.0f;
    public RectF f26817p = null;
    public final RectF f26818q = new RectF();
    public String f26819r = null;
    public final Path f26821t = new Path();
    public final float[] f26822u = new float[8];
    public float f26823w = 1.0f;
    public final Paint f26824x = new Paint(1);
    public final RectF f26825y = new RectF();
    public final Paint f26826z = new Paint(1);
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
        this.f26805a = omVar;
    }

    public static void a(nm nmVar, MediaController.PhotoEntry photoEntry) {
        om omVar = nmVar.O;
        nmVar.f26806b = photoEntry;
        if (photoEntry.isVideo) {
            nmVar.f26819r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            nmVar.f26819r = null;
        }
        if (nmVar.f26807c == null) {
            nmVar.f26807c = new ImageReceiver(omVar.f27146z);
            nmVar.d = new ImageReceiver(omVar.f27146z);
            nmVar.f26807c.setDelegate(new a3(6, nmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            nmVar.f26807c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = nmVar.f26807c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
                nmVar.f26807c.setAllowStartAnimation(true);
                return;
            }
            nmVar.f26807c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = nmVar.f26807c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else {
            nmVar.f26807c.setImageBitmap(org.telegram.ui.ActionBar.j6.R4);
        }
    }

    public static void b(nm nmVar, jm jmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = nmVar.f26818q;
        RectF rectF2 = nmVar.f26809g;
        if (jmVar != null && groupedMessagePosition != null) {
            nmVar.f26810i = groupedMessagePosition.flags;
            if (z10) {
                float e = nmVar.e();
                RectF rectF3 = nmVar.f26808f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = nmVar.f26817p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                nmVar.f26811j = AndroidUtilities.lerp(nmVar.f26811j, nmVar.f26812k, e);
                nmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = jmVar.f25402c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = jmVar.f25403f;
            float f17 = f15 / f16;
            nmVar.f26812k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15834ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = nmVar.f26810i;
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
            if (nmVar.f26808f == null) {
                RectF rectF5 = new RectF();
                nmVar.f26808f = rectF5;
                rectF5.set(rectF2);
            }
            if (nmVar.f26817p == null) {
                RectF rectF6 = new RectF();
                nmVar.f26817p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nmVar.f26811j = AndroidUtilities.lerp(nmVar.f26811j, nmVar.f26812k, nmVar.e());
            RectF rectF7 = nmVar.f26808f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, nmVar.e(), nmVar.f26808f);
            }
            nmVar.f26812k = 0.0f;
            nmVar.h = elapsedRealtime;
        } else {
            nmVar.f26811j = 0.0f;
            nmVar.f26812k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        nm nmVar = new nm(this.O);
        nmVar.f26809g.set(this.f26809g);
        nmVar.f26807c = this.f26807c;
        nmVar.f26806b = this.f26806b;
        return nmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26809g != null && this.f26807c != null) {
            pm pmVar = this.O.f27146z;
            nm nmVar = pmVar.P.J;
            if (nmVar != null && nmVar.f26806b == this.f26806b) {
                f7 = pmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26811j, this.f26812k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26825y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f27131j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26825y;
        RectF rectF3 = this.f26809g;
        if (rectF3 != null && this.f26807c != null) {
            om omVar = this.O;
            float f10 = (rectF3.left * omVar.f27139r) + omVar.f27135n;
            float f11 = (rectF3.top * omVar.f27140s) + omVar.f27137p;
            float width = rectF3.width() * omVar.f27139r;
            float height = rectF3.height() * omVar.f27140s;
            if (f7 < 1.0f && (rectF = this.f26808f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * omVar.f27139r) + omVar.f27135n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f26808f.top * omVar.f27140s) + omVar.f27137p, f11, f7);
                width = AndroidUtilities.lerp(this.f26808f.width() * omVar.f27139r, width, f7);
                height = AndroidUtilities.lerp(this.f26808f.height() * omVar.f27140s, height, f7);
            }
            int i10 = this.f26810i;
            if ((i10 & 4) == 0) {
                int i11 = omVar.f27134m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= omVar.f27134m;
            }
            if ((i10 & 1) == 0) {
                int i12 = omVar.f27134m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= omVar.f27134m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
