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
public final class qm {
    public TextPaint B;
    public TextPaint C;
    public final rm O;
    public rm f30102a;
    public MediaController.PhotoEntry f30103b;
    public ImageReceiver f30104c;
    public ImageReceiver d;
    public boolean f30105e;
    public float f30111l;
    public float f30112m;
    public float f30113n;
    public float f30114o;
    public vh.f f30118s;
    public Bitmap v;
    public RectF f30106f = null;
    public final RectF f30107g = new RectF();
    public long h = 0;
    public int f30108i = 0;
    public float f30109j = 1.0f;
    public float f30110k = 0.0f;
    public RectF f30115p = null;
    public final RectF f30116q = new RectF();
    public String f30117r = null;
    public final Path f30119t = new Path();
    public final float[] f30120u = new float[8];
    public float f30121w = 1.0f;
    public final Paint f30122x = new Paint(1);
    public final RectF f30123y = new RectF();
    public final Paint f30124z = new Paint(1);
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

    public qm(rm rmVar) {
        this.O = rmVar;
        this.f30102a = rmVar;
    }

    public static void a(qm qmVar, MediaController.PhotoEntry photoEntry) {
        rm rmVar = qmVar.O;
        qmVar.f30103b = photoEntry;
        if (photoEntry.isVideo) {
            qmVar.f30117r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            qmVar.f30117r = null;
        }
        if (qmVar.f30104c == null) {
            qmVar.f30104c = new ImageReceiver(rmVar.f30554z);
            qmVar.d = new ImageReceiver(rmVar.f30554z);
            qmVar.f30104c.setDelegate(new w2(8, qmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            qmVar.f30104c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = qmVar.f30104c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
                qmVar.f30104c.setAllowStartAnimation(true);
                return;
            }
            qmVar.f30104c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = qmVar.f30104c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else {
            qmVar.f30104c.setImageBitmap(org.telegram.ui.ActionBar.i6.R4);
        }
    }

    public static void b(qm qmVar, mm mmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = qmVar.f30116q;
        RectF rectF2 = qmVar.f30107g;
        if (mmVar != null && groupedMessagePosition != null) {
            qmVar.f30108i = groupedMessagePosition.flags;
            if (z10) {
                float e7 = qmVar.e();
                RectF rectF3 = qmVar.f30106f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e7, rectF3);
                }
                RectF rectF4 = qmVar.f30115p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e7, rectF4);
                }
                qmVar.f30109j = AndroidUtilities.lerp(qmVar.f30109j, qmVar.f30110k, e7);
                qmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = mmVar.f28736c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = mmVar.f28738f;
            float f17 = f15 / f16;
            qmVar.f30110k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17263ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = qmVar.f30108i;
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
            if (qmVar.f30106f == null) {
                RectF rectF5 = new RectF();
                qmVar.f30106f = rectF5;
                rectF5.set(rectF2);
            }
            if (qmVar.f30115p == null) {
                RectF rectF6 = new RectF();
                qmVar.f30115p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            qmVar.f30109j = AndroidUtilities.lerp(qmVar.f30109j, qmVar.f30110k, qmVar.e());
            RectF rectF7 = qmVar.f30106f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, qmVar.e(), qmVar.f30106f);
            }
            qmVar.f30110k = 0.0f;
            qmVar.h = elapsedRealtime;
        } else {
            qmVar.f30109j = 0.0f;
            qmVar.f30110k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        qm qmVar = new qm(this.O);
        qmVar.f30107g.set(this.f30107g);
        qmVar.f30104c = this.f30104c;
        qmVar.f30103b = this.f30103b;
        return qmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f30107g != null && this.f30104c != null) {
            sm smVar = this.O.f30554z;
            qm qmVar = smVar.P.J;
            if (qmVar != null && qmVar.f30103b == this.f30103b) {
                f7 = smVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f30109j, this.f30110k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f30123y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f30539j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f30123y;
        RectF rectF3 = this.f30107g;
        if (rectF3 != null && this.f30104c != null) {
            rm rmVar = this.O;
            float f10 = (rectF3.left * rmVar.f30547r) + rmVar.f30543n;
            float f11 = (rectF3.top * rmVar.f30548s) + rmVar.f30545p;
            float width = rectF3.width() * rmVar.f30547r;
            float height = rectF3.height() * rmVar.f30548s;
            if (f7 < 1.0f && (rectF = this.f30106f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * rmVar.f30547r) + rmVar.f30543n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f30106f.top * rmVar.f30548s) + rmVar.f30545p, f11, f7);
                width = AndroidUtilities.lerp(this.f30106f.width() * rmVar.f30547r, width, f7);
                height = AndroidUtilities.lerp(this.f30106f.height() * rmVar.f30548s, height, f7);
            }
            int i10 = this.f30108i;
            if ((i10 & 4) == 0) {
                int i11 = rmVar.f30542m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= rmVar.f30542m;
            }
            if ((i10 & 1) == 0) {
                int i12 = rmVar.f30542m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= rmVar.f30542m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
