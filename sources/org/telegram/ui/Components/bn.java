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
public final class bn {
    public TextPaint B;
    public TextPaint C;
    public final cn O;
    public cn f23496a;
    public MediaController.PhotoEntry f23497b;
    public ImageReceiver f23498c;
    public ImageReceiver d;
    public boolean e;
    public float f23504l;
    public float f23505m;
    public float f23506n;
    public float f23507o;
    public wh.f f23511s;
    public Bitmap v;
    public RectF f23499f = null;
    public final RectF f23500g = new RectF();
    public long h = 0;
    public int f23501i = 0;
    public float f23502j = 1.0f;
    public float f23503k = 0.0f;
    public RectF f23508p = null;
    public final RectF f23509q = new RectF();
    public String f23510r = null;
    public final Path f23512t = new Path();
    public final float[] f23513u = new float[8];
    public float f23514w = 1.0f;
    public final Paint f23515x = new Paint(1);
    public final RectF f23516y = new RectF();
    public final Paint f23517z = new Paint(1);
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

    public bn(cn cnVar) {
        this.O = cnVar;
        this.f23496a = cnVar;
    }

    public static void a(bn bnVar, MediaController.PhotoEntry photoEntry) {
        cn cnVar = bnVar.O;
        bnVar.f23497b = photoEntry;
        if (photoEntry.isVideo) {
            bnVar.f23510r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            bnVar.f23510r = null;
        }
        if (bnVar.f23498c == null) {
            bnVar.f23498c = new ImageReceiver(cnVar.f23826z);
            bnVar.d = new ImageReceiver(cnVar.f23826z);
            bnVar.f23498c.setDelegate(new u2(9, bnVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            bnVar.f23498c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.g6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = bnVar.f23498c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.g6.R4, 0L, null, null, 0);
                bnVar.f23498c.setAllowStartAnimation(true);
                return;
            }
            bnVar.f23498c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = bnVar.f23498c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.g6.R4, 0L, null, null, 0);
        } else {
            bnVar.f23498c.setImageBitmap(org.telegram.ui.ActionBar.g6.R4);
        }
    }

    public static void b(bn bnVar, xm xmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = bnVar.f23509q;
        RectF rectF2 = bnVar.f23500g;
        if (xmVar != null && groupedMessagePosition != null) {
            bnVar.f23501i = groupedMessagePosition.flags;
            if (z10) {
                float e = bnVar.e();
                RectF rectF3 = bnVar.f23499f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = bnVar.f23508p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                bnVar.f23502j = AndroidUtilities.lerp(bnVar.f23502j, bnVar.f23503k, e);
                bnVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = xmVar.f30950c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = xmVar.f30951f;
            float f17 = f15 / f16;
            bnVar.f23503k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f16397ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = bnVar.f23501i;
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
            if (bnVar.f23499f == null) {
                RectF rectF5 = new RectF();
                bnVar.f23499f = rectF5;
                rectF5.set(rectF2);
            }
            if (bnVar.f23508p == null) {
                RectF rectF6 = new RectF();
                bnVar.f23508p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bnVar.f23502j = AndroidUtilities.lerp(bnVar.f23502j, bnVar.f23503k, bnVar.e());
            RectF rectF7 = bnVar.f23499f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, bnVar.e(), bnVar.f23499f);
            }
            bnVar.f23503k = 0.0f;
            bnVar.h = elapsedRealtime;
        } else {
            bnVar.f23502j = 0.0f;
            bnVar.f23503k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bn.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        bn bnVar = new bn(this.O);
        bnVar.f23500g.set(this.f23500g);
        bnVar.f23498c = this.f23498c;
        bnVar.f23497b = this.f23497b;
        return bnVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f23500g != null && this.f23498c != null) {
            dn dnVar = this.O.f23826z;
            bn bnVar = dnVar.P.J;
            if (bnVar != null && bnVar.f23497b == this.f23497b) {
                f7 = dnVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f23502j, this.f23503k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a1.g.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f23516y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f23811j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f23516y;
        RectF rectF3 = this.f23500g;
        if (rectF3 != null && this.f23498c != null) {
            cn cnVar = this.O;
            float f10 = (rectF3.left * cnVar.f23819r) + cnVar.f23815n;
            float f11 = (rectF3.top * cnVar.f23820s) + cnVar.f23817p;
            float width = rectF3.width() * cnVar.f23819r;
            float height = rectF3.height() * cnVar.f23820s;
            if (f7 < 1.0f && (rectF = this.f23499f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * cnVar.f23819r) + cnVar.f23815n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f23499f.top * cnVar.f23820s) + cnVar.f23817p, f11, f7);
                width = AndroidUtilities.lerp(this.f23499f.width() * cnVar.f23819r, width, f7);
                height = AndroidUtilities.lerp(this.f23499f.height() * cnVar.f23820s, height, f7);
            }
            int i10 = this.f23501i;
            if ((i10 & 4) == 0) {
                int i11 = cnVar.f23814m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= cnVar.f23814m;
            }
            if ((i10 & 1) == 0) {
                int i12 = cnVar.f23814m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= cnVar.f23814m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
