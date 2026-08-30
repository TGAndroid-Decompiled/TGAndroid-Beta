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
public final class lm {
    public TextPaint B;
    public TextPaint C;
    public final mm O;
    public mm f26790a;
    public MediaController.PhotoEntry f26791b;
    public ImageReceiver f26792c;
    public ImageReceiver d;
    public boolean e;
    public float f26798l;
    public float f26799m;
    public float f26800n;
    public float f26801o;
    public ih.j f26805s;
    public Bitmap v;
    public RectF f26793f = null;
    public final RectF f26794g = new RectF();
    public long h = 0;
    public int f26795i = 0;
    public float f26796j = 1.0f;
    public float f26797k = 0.0f;
    public RectF f26802p = null;
    public final RectF f26803q = new RectF();
    public String f26804r = null;
    public final Path f26806t = new Path();
    public final float[] f26807u = new float[8];
    public float f26808w = 1.0f;
    public final Paint f26809x = new Paint(1);
    public final RectF f26810y = new RectF();
    public final Paint f26811z = new Paint(1);
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

    public lm(mm mmVar) {
        this.O = mmVar;
        this.f26790a = mmVar;
    }

    public static void a(lm lmVar, MediaController.PhotoEntry photoEntry) {
        mm mmVar = lmVar.O;
        lmVar.f26791b = photoEntry;
        if (photoEntry.isVideo) {
            lmVar.f26804r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            lmVar.f26804r = null;
        }
        if (lmVar.f26792c == null) {
            lmVar.f26792c = new ImageReceiver(mmVar.f27074z);
            lmVar.d = new ImageReceiver(mmVar.f27074z);
            lmVar.f26792c.setDelegate(new o1(14, lmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            lmVar.f26792c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = lmVar.f26792c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
                lmVar.f26792c.setAllowStartAnimation(true);
                return;
            }
            lmVar.f26792c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = lmVar.f26792c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else {
            lmVar.f26792c.setImageBitmap(org.telegram.ui.ActionBar.j6.R4);
        }
    }

    public static void b(lm lmVar, gm gmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z4) {
        float f10;
        float f11;
        float f12;
        RectF rectF = lmVar.f26803q;
        RectF rectF2 = lmVar.f26794g;
        if (gmVar != null && groupedMessagePosition != null) {
            lmVar.f26795i = groupedMessagePosition.flags;
            if (z4) {
                float e = lmVar.e();
                RectF rectF3 = lmVar.f26793f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = lmVar.f26802p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                lmVar.f26796j = AndroidUtilities.lerp(lmVar.f26796j, lmVar.f26797k, e);
                lmVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = groupedMessagePosition.left;
            float f14 = gmVar.f25195c;
            float f15 = f13 / f14;
            float f16 = groupedMessagePosition.top;
            float f17 = gmVar.f25196f;
            float f18 = f16 / f17;
            lmVar.f26797k = 1.0f;
            rectF2.set(f15, f18, (groupedMessagePosition.pw / f14) + f15, (groupedMessagePosition.f16666ph / f17) + f18);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = lmVar.f26795i;
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
            if (lmVar.f26793f == null) {
                RectF rectF5 = new RectF();
                lmVar.f26793f = rectF5;
                rectF5.set(rectF2);
            }
            if (lmVar.f26802p == null) {
                RectF rectF6 = new RectF();
                lmVar.f26802p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z4) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lmVar.f26796j = AndroidUtilities.lerp(lmVar.f26796j, lmVar.f26797k, lmVar.e());
            RectF rectF7 = lmVar.f26793f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, lmVar.e(), lmVar.f26793f);
            }
            lmVar.f26797k = 0.0f;
            lmVar.h = elapsedRealtime;
        } else {
            lmVar.f26796j = 0.0f;
            lmVar.f26797k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        lm lmVar = new lm(this.O);
        lmVar.f26794g.set(this.f26794g);
        lmVar.f26792c = this.f26792c;
        lmVar.f26791b = this.f26791b;
        return lmVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f26794g != null && this.f26792c != null) {
            nm nmVar = this.O.f27074z;
            lm lmVar = nmVar.M.G;
            if (lmVar != null && lmVar.f26791b == this.f26791b) {
                f10 = nmVar.D;
            }
            float lerp = (((1.0f - f10) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26796j, this.f26797k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - lerp;
            float f13 = lerp + 1.0f;
            f11.set(android.support.v4.media.a.d(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, android.support.v4.media.a.d(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f26810y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f27059j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f26810y;
        RectF rectF3 = this.f26794g;
        if (rectF3 != null && this.f26792c != null) {
            mm mmVar = this.O;
            float f11 = (rectF3.left * mmVar.f27067r) + mmVar.f27063n;
            float f12 = (rectF3.top * mmVar.f27068s) + mmVar.f27065p;
            float width = rectF3.width() * mmVar.f27067r;
            float height = rectF3.height() * mmVar.f27068s;
            if (f10 < 1.0f && (rectF = this.f26793f) != null) {
                f11 = AndroidUtilities.lerp((rectF.left * mmVar.f27067r) + mmVar.f27063n, f11, f10);
                f12 = AndroidUtilities.lerp((this.f26793f.top * mmVar.f27068s) + mmVar.f27065p, f12, f10);
                width = AndroidUtilities.lerp(this.f26793f.width() * mmVar.f27067r, width, f10);
                height = AndroidUtilities.lerp(this.f26793f.height() * mmVar.f27068s, height, f10);
            }
            int i10 = this.f26795i;
            if ((i10 & 4) == 0) {
                int i11 = mmVar.f27062m;
                f12 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= mmVar.f27062m;
            }
            if ((i10 & 1) == 0) {
                int i12 = mmVar.f27062m;
                f11 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= mmVar.f27062m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
