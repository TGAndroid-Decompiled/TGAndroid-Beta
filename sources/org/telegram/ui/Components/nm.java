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
    public om f26479a;
    public MediaController.PhotoEntry f26480b;
    public ImageReceiver f26481c;
    public ImageReceiver d;
    public boolean e;
    public float f26487l;
    public float f26488m;
    public float f26489n;
    public float f26490o;
    public vh.g f26494s;
    public Bitmap v;
    public RectF f26482f = null;
    public final RectF f26483g = new RectF();
    public long h = 0;
    public int f26484i = 0;
    public float f26485j = 1.0f;
    public float f26486k = 0.0f;
    public RectF f26491p = null;
    public final RectF f26492q = new RectF();
    public String f26493r = null;
    public final Path f26495t = new Path();
    public final float[] f26496u = new float[8];
    public float f26497w = 1.0f;
    public final Paint f26498x = new Paint(1);
    public final RectF f26499y = new RectF();
    public final Paint f26500z = new Paint(1);
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
        this.f26479a = omVar;
    }

    public static void a(nm nmVar, MediaController.PhotoEntry photoEntry) {
        om omVar = nmVar.O;
        nmVar.f26480b = photoEntry;
        if (photoEntry.isVideo) {
            nmVar.f26493r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            nmVar.f26493r = null;
        }
        if (nmVar.f26481c == null) {
            nmVar.f26481c = new ImageReceiver(omVar.f26800z);
            nmVar.d = new ImageReceiver(omVar.f26800z);
            nmVar.f26481c.setDelegate(new mf(5, nmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            nmVar.f26481c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = nmVar.f26481c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
                nmVar.f26481c.setAllowStartAnimation(true);
                return;
            }
            nmVar.f26481c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = nmVar.f26481c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else {
            nmVar.f26481c.setImageBitmap(org.telegram.ui.ActionBar.j6.R4);
        }
    }

    public static void b(nm nmVar, jm jmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = nmVar.f26492q;
        RectF rectF2 = nmVar.f26483g;
        if (jmVar != null && groupedMessagePosition != null) {
            nmVar.f26484i = groupedMessagePosition.flags;
            if (z10) {
                float e = nmVar.e();
                RectF rectF3 = nmVar.f26482f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = nmVar.f26491p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                nmVar.f26485j = AndroidUtilities.lerp(nmVar.f26485j, nmVar.f26486k, e);
                nmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = jmVar.f25323c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = jmVar.f25324f;
            float f17 = f15 / f16;
            nmVar.f26486k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15610ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = nmVar.f26484i;
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
            if (nmVar.f26482f == null) {
                RectF rectF5 = new RectF();
                nmVar.f26482f = rectF5;
                rectF5.set(rectF2);
            }
            if (nmVar.f26491p == null) {
                RectF rectF6 = new RectF();
                nmVar.f26491p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nmVar.f26485j = AndroidUtilities.lerp(nmVar.f26485j, nmVar.f26486k, nmVar.e());
            RectF rectF7 = nmVar.f26482f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, nmVar.e(), nmVar.f26482f);
            }
            nmVar.f26486k = 0.0f;
            nmVar.h = elapsedRealtime;
        } else {
            nmVar.f26485j = 0.0f;
            nmVar.f26486k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        nm nmVar = new nm(this.O);
        nmVar.f26483g.set(this.f26483g);
        nmVar.f26481c = this.f26481c;
        nmVar.f26480b = this.f26480b;
        return nmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26483g != null && this.f26481c != null) {
            pm pmVar = this.O.f26800z;
            nm nmVar = pmVar.P.J;
            if (nmVar != null && nmVar.f26480b == this.f26480b) {
                f7 = pmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26485j, this.f26486k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26499y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26785j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26499y;
        RectF rectF3 = this.f26483g;
        if (rectF3 != null && this.f26481c != null) {
            om omVar = this.O;
            float f10 = (rectF3.left * omVar.f26793r) + omVar.f26789n;
            float f11 = (rectF3.top * omVar.f26794s) + omVar.f26791p;
            float width = rectF3.width() * omVar.f26793r;
            float height = rectF3.height() * omVar.f26794s;
            if (f7 < 1.0f && (rectF = this.f26482f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * omVar.f26793r) + omVar.f26789n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f26482f.top * omVar.f26794s) + omVar.f26791p, f11, f7);
                width = AndroidUtilities.lerp(this.f26482f.width() * omVar.f26793r, width, f7);
                height = AndroidUtilities.lerp(this.f26482f.height() * omVar.f26794s, height, f7);
            }
            int i10 = this.f26484i;
            if ((i10 & 4) == 0) {
                int i11 = omVar.f26788m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= omVar.f26788m;
            }
            if ((i10 & 1) == 0) {
                int i12 = omVar.f26788m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= omVar.f26788m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
