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
    public pm f26779a;
    public MediaController.PhotoEntry f26780b;
    public ImageReceiver f26781c;
    public ImageReceiver d;
    public boolean e;
    public float f26787l;
    public float f26788m;
    public float f26789n;
    public float f26790o;
    public vh.g f26794s;
    public Bitmap v;
    public RectF f26782f = null;
    public final RectF f26783g = new RectF();
    public long h = 0;
    public int f26784i = 0;
    public float f26785j = 1.0f;
    public float f26786k = 0.0f;
    public RectF f26791p = null;
    public final RectF f26792q = new RectF();
    public String f26793r = null;
    public final Path f26795t = new Path();
    public final float[] f26796u = new float[8];
    public float f26797w = 1.0f;
    public final Paint f26798x = new Paint(1);
    public final RectF f26799y = new RectF();
    public final Paint f26800z = new Paint(1);
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
        this.f26779a = pmVar;
    }

    public static void a(om omVar, MediaController.PhotoEntry photoEntry) {
        pm pmVar = omVar.O;
        omVar.f26780b = photoEntry;
        if (photoEntry.isVideo) {
            omVar.f26793r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            omVar.f26793r = null;
        }
        if (omVar.f26781c == null) {
            omVar.f26781c = new ImageReceiver(pmVar.f27105z);
            omVar.d = new ImageReceiver(pmVar.f27105z);
            omVar.f26781c.setDelegate(new b3(6, omVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            omVar.f26781c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = omVar.f26781c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                omVar.f26781c.setAllowStartAnimation(true);
                return;
            }
            omVar.f26781c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = omVar.f26781c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            omVar.f26781c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(om omVar, km kmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = omVar.f26792q;
        RectF rectF2 = omVar.f26783g;
        if (kmVar != null && groupedMessagePosition != null) {
            omVar.f26784i = groupedMessagePosition.flags;
            if (z10) {
                float e = omVar.e();
                RectF rectF3 = omVar.f26782f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = omVar.f26791p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                omVar.f26785j = AndroidUtilities.lerp(omVar.f26785j, omVar.f26786k, e);
                omVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = kmVar.f25628c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = kmVar.f25629f;
            float f17 = f15 / f16;
            omVar.f26786k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15574ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = omVar.f26784i;
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
            if (omVar.f26782f == null) {
                RectF rectF5 = new RectF();
                omVar.f26782f = rectF5;
                rectF5.set(rectF2);
            }
            if (omVar.f26791p == null) {
                RectF rectF6 = new RectF();
                omVar.f26791p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            omVar.f26785j = AndroidUtilities.lerp(omVar.f26785j, omVar.f26786k, omVar.e());
            RectF rectF7 = omVar.f26782f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, omVar.e(), omVar.f26782f);
            }
            omVar.f26786k = 0.0f;
            omVar.h = elapsedRealtime;
        } else {
            omVar.f26785j = 0.0f;
            omVar.f26786k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.om.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        om omVar = new om(this.O);
        omVar.f26783g.set(this.f26783g);
        omVar.f26781c = this.f26781c;
        omVar.f26780b = this.f26780b;
        return omVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26783g != null && this.f26781c != null) {
            qm qmVar = this.O.f27105z;
            om omVar = qmVar.P.J;
            if (omVar != null && omVar.f26780b == this.f26780b) {
                f7 = qmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26785j, this.f26786k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26799y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f27090j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26799y;
        RectF rectF3 = this.f26783g;
        if (rectF3 != null && this.f26781c != null) {
            pm pmVar = this.O;
            float f10 = (rectF3.left * pmVar.f27098r) + pmVar.f27094n;
            float f11 = (rectF3.top * pmVar.f27099s) + pmVar.f27096p;
            float width = rectF3.width() * pmVar.f27098r;
            float height = rectF3.height() * pmVar.f27099s;
            if (f7 < 1.0f && (rectF = this.f26782f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * pmVar.f27098r) + pmVar.f27094n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f26782f.top * pmVar.f27099s) + pmVar.f27096p, f11, f7);
                width = AndroidUtilities.lerp(this.f26782f.width() * pmVar.f27098r, width, f7);
                height = AndroidUtilities.lerp(this.f26782f.height() * pmVar.f27099s, height, f7);
            }
            int i10 = this.f26784i;
            if ((i10 & 4) == 0) {
                int i11 = pmVar.f27093m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= pmVar.f27093m;
            }
            if ((i10 & 1) == 0) {
                int i12 = pmVar.f27093m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= pmVar.f27093m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
