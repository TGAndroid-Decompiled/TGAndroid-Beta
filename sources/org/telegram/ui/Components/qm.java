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
    public rm f27673a;
    public MediaController.PhotoEntry f27674b;
    public ImageReceiver f27675c;
    public ImageReceiver d;
    public boolean e;
    public float f27681l;
    public float f27682m;
    public float f27683n;
    public float f27684o;
    public vh.f f27688s;
    public Bitmap v;
    public RectF f27676f = null;
    public final RectF f27677g = new RectF();
    public long h = 0;
    public int f27678i = 0;
    public float f27679j = 1.0f;
    public float f27680k = 0.0f;
    public RectF f27685p = null;
    public final RectF f27686q = new RectF();
    public String f27687r = null;
    public final Path f27689t = new Path();
    public final float[] f27690u = new float[8];
    public float f27691w = 1.0f;
    public final Paint f27692x = new Paint(1);
    public final RectF f27693y = new RectF();
    public final Paint f27694z = new Paint(1);
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
        this.f27673a = rmVar;
    }

    public static void a(qm qmVar, MediaController.PhotoEntry photoEntry) {
        rm rmVar = qmVar.O;
        qmVar.f27674b = photoEntry;
        if (photoEntry.isVideo) {
            qmVar.f27687r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            qmVar.f27687r = null;
        }
        if (qmVar.f27675c == null) {
            qmVar.f27675c = new ImageReceiver(rmVar.f28086z);
            qmVar.d = new ImageReceiver(rmVar.f28086z);
            qmVar.f27675c.setDelegate(new w2(7, qmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            qmVar.f27675c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = qmVar.f27675c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                qmVar.f27675c.setAllowStartAnimation(true);
                return;
            }
            qmVar.f27675c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = qmVar.f27675c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            qmVar.f27675c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(qm qmVar, mm mmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = qmVar.f27686q;
        RectF rectF2 = qmVar.f27677g;
        if (mmVar != null && groupedMessagePosition != null) {
            qmVar.f27678i = groupedMessagePosition.flags;
            if (z10) {
                float e = qmVar.e();
                RectF rectF3 = qmVar.f27676f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = qmVar.f27685p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                qmVar.f27679j = AndroidUtilities.lerp(qmVar.f27679j, qmVar.f27680k, e);
                qmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = mmVar.f26322c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = mmVar.f26323f;
            float f17 = f15 / f16;
            qmVar.f27680k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f15846ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = qmVar.f27678i;
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
            if (qmVar.f27676f == null) {
                RectF rectF5 = new RectF();
                qmVar.f27676f = rectF5;
                rectF5.set(rectF2);
            }
            if (qmVar.f27685p == null) {
                RectF rectF6 = new RectF();
                qmVar.f27685p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            qmVar.f27679j = AndroidUtilities.lerp(qmVar.f27679j, qmVar.f27680k, qmVar.e());
            RectF rectF7 = qmVar.f27676f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, qmVar.e(), qmVar.f27676f);
            }
            qmVar.f27680k = 0.0f;
            qmVar.h = elapsedRealtime;
        } else {
            qmVar.f27679j = 0.0f;
            qmVar.f27680k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        qm qmVar = new qm(this.O);
        qmVar.f27677g.set(this.f27677g);
        qmVar.f27675c = this.f27675c;
        qmVar.f27674b = this.f27674b;
        return qmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f27677g != null && this.f27675c != null) {
            sm smVar = this.O.f28086z;
            qm qmVar = smVar.P.J;
            if (qmVar != null && qmVar.f27674b == this.f27674b) {
                f7 = smVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f27679j, this.f27680k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f27693y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f28071j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f27693y;
        RectF rectF3 = this.f27677g;
        if (rectF3 != null && this.f27675c != null) {
            rm rmVar = this.O;
            float f10 = (rectF3.left * rmVar.f28079r) + rmVar.f28075n;
            float f11 = (rectF3.top * rmVar.f28080s) + rmVar.f28077p;
            float width = rectF3.width() * rmVar.f28079r;
            float height = rectF3.height() * rmVar.f28080s;
            if (f7 < 1.0f && (rectF = this.f27676f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * rmVar.f28079r) + rmVar.f28075n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f27676f.top * rmVar.f28080s) + rmVar.f28077p, f11, f7);
                width = AndroidUtilities.lerp(this.f27676f.width() * rmVar.f28079r, width, f7);
                height = AndroidUtilities.lerp(this.f27676f.height() * rmVar.f28080s, height, f7);
            }
            int i10 = this.f27678i;
            if ((i10 & 4) == 0) {
                int i11 = rmVar.f28074m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= rmVar.f28074m;
            }
            if ((i10 & 1) == 0) {
                int i12 = rmVar.f28074m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= rmVar.f28074m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
