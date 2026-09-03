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
public final class km {
    public TextPaint B;
    public TextPaint C;
    public final lm O;
    public lm f26330a;
    public MediaController.PhotoEntry f26331b;
    public ImageReceiver f26332c;
    public ImageReceiver d;
    public boolean e;
    public float f26338l;
    public float f26339m;
    public float f26340n;
    public float f26341o;
    public ih.j f26345s;
    public Bitmap v;
    public RectF f26333f = null;
    public final RectF f26334g = new RectF();
    public long h = 0;
    public int f26335i = 0;
    public float f26336j = 1.0f;
    public float f26337k = 0.0f;
    public RectF f26342p = null;
    public final RectF f26343q = new RectF();
    public String f26344r = null;
    public final Path f26346t = new Path();
    public final float[] f26347u = new float[8];
    public float f26348w = 1.0f;
    public final Paint f26349x = new Paint(1);
    public final RectF f26350y = new RectF();
    public final Paint f26351z = new Paint(1);
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

    public km(lm lmVar) {
        this.O = lmVar;
        this.f26330a = lmVar;
    }

    public static void a(km kmVar, MediaController.PhotoEntry photoEntry) {
        lm lmVar = kmVar.O;
        kmVar.f26331b = photoEntry;
        if (photoEntry.isVideo) {
            kmVar.f26344r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            kmVar.f26344r = null;
        }
        if (kmVar.f26332c == null) {
            kmVar.f26332c = new ImageReceiver(lmVar.f26801z);
            kmVar.d = new ImageReceiver(lmVar.f26801z);
            kmVar.f26332c.setDelegate(new o1(14, kmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            kmVar.f26332c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = kmVar.f26332c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
                kmVar.f26332c.setAllowStartAnimation(true);
                return;
            }
            kmVar.f26332c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = kmVar.f26332c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else {
            kmVar.f26332c.setImageBitmap(org.telegram.ui.ActionBar.j6.R4);
        }
    }

    public static void b(km kmVar, gm gmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z4) {
        float f10;
        float f11;
        float f12;
        RectF rectF = kmVar.f26343q;
        RectF rectF2 = kmVar.f26334g;
        if (gmVar != null && groupedMessagePosition != null) {
            kmVar.f26335i = groupedMessagePosition.flags;
            if (z4) {
                float e = kmVar.e();
                RectF rectF3 = kmVar.f26333f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = kmVar.f26342p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                kmVar.f26336j = AndroidUtilities.lerp(kmVar.f26336j, kmVar.f26337k, e);
                kmVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = groupedMessagePosition.left;
            float f14 = gmVar.f25198c;
            float f15 = f13 / f14;
            float f16 = groupedMessagePosition.top;
            float f17 = gmVar.f25199f;
            float f18 = f16 / f17;
            kmVar.f26337k = 1.0f;
            rectF2.set(f15, f18, (groupedMessagePosition.pw / f14) + f15, (groupedMessagePosition.f16646ph / f17) + f18);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = kmVar.f26335i;
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
            if (kmVar.f26333f == null) {
                RectF rectF5 = new RectF();
                kmVar.f26333f = rectF5;
                rectF5.set(rectF2);
            }
            if (kmVar.f26342p == null) {
                RectF rectF6 = new RectF();
                kmVar.f26342p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z4) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            kmVar.f26336j = AndroidUtilities.lerp(kmVar.f26336j, kmVar.f26337k, kmVar.e());
            RectF rectF7 = kmVar.f26333f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, kmVar.e(), kmVar.f26333f);
            }
            kmVar.f26337k = 0.0f;
            kmVar.h = elapsedRealtime;
        } else {
            kmVar.f26336j = 0.0f;
            kmVar.f26337k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.km.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        km kmVar = new km(this.O);
        kmVar.f26334g.set(this.f26334g);
        kmVar.f26332c = this.f26332c;
        kmVar.f26331b = this.f26331b;
        return kmVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f26334g != null && this.f26332c != null) {
            mm mmVar = this.O.f26801z;
            km kmVar = mmVar.M.G;
            if (kmVar != null && kmVar.f26331b == this.f26331b) {
                f10 = mmVar.D;
            }
            float lerp = (((1.0f - f10) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26336j, this.f26337k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - lerp;
            float f13 = lerp + 1.0f;
            f11.set(android.support.v4.media.a.d(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, android.support.v4.media.a.d(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f26350y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26786j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f26350y;
        RectF rectF3 = this.f26334g;
        if (rectF3 != null && this.f26332c != null) {
            lm lmVar = this.O;
            float f11 = (rectF3.left * lmVar.f26794r) + lmVar.f26790n;
            float f12 = (rectF3.top * lmVar.f26795s) + lmVar.f26792p;
            float width = rectF3.width() * lmVar.f26794r;
            float height = rectF3.height() * lmVar.f26795s;
            if (f10 < 1.0f && (rectF = this.f26333f) != null) {
                f11 = AndroidUtilities.lerp((rectF.left * lmVar.f26794r) + lmVar.f26790n, f11, f10);
                f12 = AndroidUtilities.lerp((this.f26333f.top * lmVar.f26795s) + lmVar.f26792p, f12, f10);
                width = AndroidUtilities.lerp(this.f26333f.width() * lmVar.f26794r, width, f10);
                height = AndroidUtilities.lerp(this.f26333f.height() * lmVar.f26795s, height, f10);
            }
            int i10 = this.f26335i;
            if ((i10 & 4) == 0) {
                int i11 = lmVar.f26789m;
                f12 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= lmVar.f26789m;
            }
            if ((i10 & 1) == 0) {
                int i12 = lmVar.f26789m;
                f11 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= lmVar.f26789m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
