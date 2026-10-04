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
    public rm f30074a;
    public MediaController.PhotoEntry f30075b;
    public ImageReceiver f30076c;
    public ImageReceiver d;
    public boolean f30077e;
    public float f30083l;
    public float f30084m;
    public float f30085n;
    public float f30086o;
    public vh.f f30090s;
    public Bitmap v;
    public RectF f30078f = null;
    public final RectF f30079g = new RectF();
    public long h = 0;
    public int f30080i = 0;
    public float f30081j = 1.0f;
    public float f30082k = 0.0f;
    public RectF f30087p = null;
    public final RectF f30088q = new RectF();
    public String f30089r = null;
    public final Path f30091t = new Path();
    public final float[] f30092u = new float[8];
    public float f30093w = 1.0f;
    public final Paint f30094x = new Paint(1);
    public final RectF f30095y = new RectF();
    public final Paint f30096z = new Paint(1);
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
        this.f30074a = rmVar;
    }

    public static void a(qm qmVar, MediaController.PhotoEntry photoEntry) {
        rm rmVar = qmVar.O;
        qmVar.f30075b = photoEntry;
        if (photoEntry.isVideo) {
            qmVar.f30089r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            qmVar.f30089r = null;
        }
        if (qmVar.f30076c == null) {
            qmVar.f30076c = new ImageReceiver(rmVar.f30465z);
            qmVar.d = new ImageReceiver(rmVar.f30465z);
            qmVar.f30076c.setDelegate(new w2(8, qmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            qmVar.f30076c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = qmVar.f30076c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
                qmVar.f30076c.setAllowStartAnimation(true);
                return;
            }
            qmVar.f30076c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = qmVar.f30076c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
        } else {
            qmVar.f30076c.setImageBitmap(org.telegram.ui.ActionBar.i6.R4);
        }
    }

    public static void b(qm qmVar, mm mmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = qmVar.f30088q;
        RectF rectF2 = qmVar.f30079g;
        if (mmVar != null && groupedMessagePosition != null) {
            qmVar.f30080i = groupedMessagePosition.flags;
            if (z10) {
                float e7 = qmVar.e();
                RectF rectF3 = qmVar.f30078f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e7, rectF3);
                }
                RectF rectF4 = qmVar.f30087p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e7, rectF4);
                }
                qmVar.f30081j = AndroidUtilities.lerp(qmVar.f30081j, qmVar.f30082k, e7);
                qmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = mmVar.f28651c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = mmVar.f28653f;
            float f17 = f15 / f16;
            qmVar.f30082k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17253ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = qmVar.f30080i;
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
            if (qmVar.f30078f == null) {
                RectF rectF5 = new RectF();
                qmVar.f30078f = rectF5;
                rectF5.set(rectF2);
            }
            if (qmVar.f30087p == null) {
                RectF rectF6 = new RectF();
                qmVar.f30087p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            qmVar.f30081j = AndroidUtilities.lerp(qmVar.f30081j, qmVar.f30082k, qmVar.e());
            RectF rectF7 = qmVar.f30078f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, qmVar.e(), qmVar.f30078f);
            }
            qmVar.f30082k = 0.0f;
            qmVar.h = elapsedRealtime;
        } else {
            qmVar.f30081j = 0.0f;
            qmVar.f30082k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        qm qmVar = new qm(this.O);
        qmVar.f30079g.set(this.f30079g);
        qmVar.f30076c = this.f30076c;
        qmVar.f30075b = this.f30075b;
        return qmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f30079g != null && this.f30076c != null) {
            sm smVar = this.O.f30465z;
            qm qmVar = smVar.P.J;
            if (qmVar != null && qmVar.f30075b == this.f30075b) {
                f7 = smVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f30081j, this.f30082k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f30095y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f30450j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f30095y;
        RectF rectF3 = this.f30079g;
        if (rectF3 != null && this.f30076c != null) {
            rm rmVar = this.O;
            float f10 = (rectF3.left * rmVar.f30458r) + rmVar.f30454n;
            float f11 = (rectF3.top * rmVar.f30459s) + rmVar.f30456p;
            float width = rectF3.width() * rmVar.f30458r;
            float height = rectF3.height() * rmVar.f30459s;
            if (f7 < 1.0f && (rectF = this.f30078f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * rmVar.f30458r) + rmVar.f30454n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f30078f.top * rmVar.f30459s) + rmVar.f30456p, f11, f7);
                width = AndroidUtilities.lerp(this.f30078f.width() * rmVar.f30458r, width, f7);
                height = AndroidUtilities.lerp(this.f30078f.height() * rmVar.f30459s, height, f7);
            }
            int i10 = this.f30080i;
            if ((i10 & 4) == 0) {
                int i11 = rmVar.f30453m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= rmVar.f30453m;
            }
            if ((i10 & 1) == 0) {
                int i12 = rmVar.f30453m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= rmVar.f30453m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
