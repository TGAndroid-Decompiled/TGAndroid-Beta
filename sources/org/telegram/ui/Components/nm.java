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
    public om f28819a;
    public MediaController.PhotoEntry f28820b;
    public ImageReceiver f28821c;
    public ImageReceiver d;
    public boolean f28822e;
    public float f28828l;
    public float f28829m;
    public float f28830n;
    public float f28831o;
    public wh.g f28835s;
    public Bitmap v;
    public RectF f28823f = null;
    public final RectF f28824g = new RectF();
    public long h = 0;
    public int f28825i = 0;
    public float f28826j = 1.0f;
    public float f28827k = 0.0f;
    public RectF f28832p = null;
    public final RectF f28833q = new RectF();
    public String f28834r = null;
    public final Path f28836t = new Path();
    public final float[] f28837u = new float[8];
    public float f28838w = 1.0f;
    public final Paint f28839x = new Paint(1);
    public final RectF f28840y = new RectF();
    public final Paint f28841z = new Paint(1);
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
        this.f28819a = omVar;
    }

    public static void a(nm nmVar, MediaController.PhotoEntry photoEntry) {
        om omVar = nmVar.O;
        nmVar.f28820b = photoEntry;
        if (photoEntry.isVideo) {
            nmVar.f28834r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            nmVar.f28834r = null;
        }
        if (nmVar.f28821c == null) {
            nmVar.f28821c = new ImageReceiver(omVar.f29159z);
            nmVar.d = new ImageReceiver(omVar.f29159z);
            nmVar.f28821c.setDelegate(new b3(6, nmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            nmVar.f28821c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = nmVar.f28821c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
                nmVar.f28821c.setAllowStartAnimation(true);
                return;
            }
            nmVar.f28821c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = nmVar.f28821c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else {
            nmVar.f28821c.setImageBitmap(org.telegram.ui.ActionBar.j6.R4);
        }
    }

    public static void b(nm nmVar, jm jmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = nmVar.f28833q;
        RectF rectF2 = nmVar.f28824g;
        if (jmVar != null && groupedMessagePosition != null) {
            nmVar.f28825i = groupedMessagePosition.flags;
            if (z10) {
                float e7 = nmVar.e();
                RectF rectF3 = nmVar.f28823f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e7, rectF3);
                }
                RectF rectF4 = nmVar.f28832p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e7, rectF4);
                }
                nmVar.f28826j = AndroidUtilities.lerp(nmVar.f28826j, nmVar.f28827k, e7);
                nmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = jmVar.f27563c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = jmVar.f27565f;
            float f17 = f15 / f16;
            nmVar.f28827k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17104ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = nmVar.f28825i;
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
            if (nmVar.f28823f == null) {
                RectF rectF5 = new RectF();
                nmVar.f28823f = rectF5;
                rectF5.set(rectF2);
            }
            if (nmVar.f28832p == null) {
                RectF rectF6 = new RectF();
                nmVar.f28832p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nmVar.f28826j = AndroidUtilities.lerp(nmVar.f28826j, nmVar.f28827k, nmVar.e());
            RectF rectF7 = nmVar.f28823f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, nmVar.e(), nmVar.f28823f);
            }
            nmVar.f28827k = 0.0f;
            nmVar.h = elapsedRealtime;
        } else {
            nmVar.f28826j = 0.0f;
            nmVar.f28827k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        nm nmVar = new nm(this.O);
        nmVar.f28824g.set(this.f28824g);
        nmVar.f28821c = this.f28821c;
        nmVar.f28820b = this.f28820b;
        return nmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f28824g != null && this.f28821c != null) {
            pm pmVar = this.O.f29159z;
            nm nmVar = pmVar.P.J;
            if (nmVar != null && nmVar.f28820b == this.f28820b) {
                f7 = pmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f28826j, this.f28827k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f28840y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f29144j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f28840y;
        RectF rectF3 = this.f28824g;
        if (rectF3 != null && this.f28821c != null) {
            om omVar = this.O;
            float f10 = (rectF3.left * omVar.f29152r) + omVar.f29148n;
            float f11 = (rectF3.top * omVar.f29153s) + omVar.f29150p;
            float width = rectF3.width() * omVar.f29152r;
            float height = rectF3.height() * omVar.f29153s;
            if (f7 < 1.0f && (rectF = this.f28823f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * omVar.f29152r) + omVar.f29148n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f28823f.top * omVar.f29153s) + omVar.f29150p, f11, f7);
                width = AndroidUtilities.lerp(this.f28823f.width() * omVar.f29152r, width, f7);
                height = AndroidUtilities.lerp(this.f28823f.height() * omVar.f29153s, height, f7);
            }
            int i10 = this.f28825i;
            if ((i10 & 4) == 0) {
                int i11 = omVar.f29147m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= omVar.f29147m;
            }
            if ((i10 & 1) == 0) {
                int i12 = omVar.f29147m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= omVar.f29147m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
