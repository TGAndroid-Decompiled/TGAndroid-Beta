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
public final class zm {
    public TextPaint B;
    public TextPaint C;
    public final an O;
    public an f35357a;
    public MediaController.PhotoEntry f35358b;
    public ImageReceiver f35359c;
    public ImageReceiver d;
    public boolean e;
    public float f35365l;
    public float f35366m;
    public float f35367n;
    public float f35368o;
    public xh.f f35372s;
    public Bitmap v;
    public RectF f35360f = null;
    public final RectF f35361g = new RectF();
    public long h = 0;
    public int f35362i = 0;
    public float f35363j = 1.0f;
    public float f35364k = 0.0f;
    public RectF f35369p = null;
    public final RectF f35370q = new RectF();
    public String f35371r = null;
    public final Path f35373t = new Path();
    public final float[] f35374u = new float[8];
    public float f35375w = 1.0f;
    public final Paint f35376x = new Paint(1);
    public final RectF f35377y = new RectF();
    public final Paint f35378z = new Paint(1);
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

    public zm(an anVar) {
        this.O = anVar;
        this.f35357a = anVar;
    }

    public static void a(zm zmVar, MediaController.PhotoEntry photoEntry) {
        an anVar = zmVar.O;
        zmVar.f35358b = photoEntry;
        if (photoEntry.isVideo) {
            zmVar.f35371r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            zmVar.f35371r = null;
        }
        if (zmVar.f35359c == null) {
            zmVar.f35359c = new ImageReceiver(anVar.f26577z);
            zmVar.d = new ImageReceiver(anVar.f26577z);
            zmVar.f35359c.setDelegate(new p1(15, zmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            zmVar.f35359c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.y6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = zmVar.f35359c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.y6.R4, 0L, null, null, 0);
                zmVar.f35359c.setAllowStartAnimation(true);
                return;
            }
            zmVar.f35359c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = zmVar.f35359c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.y6.R4, 0L, null, null, 0);
        } else {
            zmVar.f35359c.setImageBitmap(org.telegram.ui.ActionBar.y6.R4);
        }
    }

    public static void b(zm zmVar, vm vmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = zmVar.f35370q;
        RectF rectF2 = zmVar.f35361g;
        if (vmVar != null && groupedMessagePosition != null) {
            zmVar.f35362i = groupedMessagePosition.flags;
            if (z10) {
                float e = zmVar.e();
                RectF rectF3 = zmVar.f35360f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = zmVar.f35369p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                zmVar.f35363j = AndroidUtilities.lerp(zmVar.f35363j, zmVar.f35364k, e);
                zmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = vmVar.f33686c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = vmVar.f33687f;
            float f17 = f15 / f16;
            zmVar.f35364k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f19546ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = zmVar.f35362i;
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
            if (zmVar.f35360f == null) {
                RectF rectF5 = new RectF();
                zmVar.f35360f = rectF5;
                rectF5.set(rectF2);
            }
            if (zmVar.f35369p == null) {
                RectF rectF6 = new RectF();
                zmVar.f35369p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zmVar.f35363j = AndroidUtilities.lerp(zmVar.f35363j, zmVar.f35364k, zmVar.e());
            RectF rectF7 = zmVar.f35360f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, zmVar.e(), zmVar.f35360f);
            }
            zmVar.f35364k = 0.0f;
            zmVar.h = elapsedRealtime;
        } else {
            zmVar.f35363j = 0.0f;
            zmVar.f35364k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        zm zmVar = new zm(this.O);
        zmVar.f35361g.set(this.f35361g);
        zmVar.f35359c = this.f35359c;
        zmVar.f35358b = this.f35358b;
        return zmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f35361g != null && this.f35359c != null) {
            bn bnVar = this.O.f26577z;
            zm zmVar = bnVar.P.J;
            if (zmVar != null && zmVar.f35358b == this.f35358b) {
                f7 = bnVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f35363j, this.f35364k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a1.g.C(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.C(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f35377y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26562j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f35377y;
        RectF rectF3 = this.f35361g;
        if (rectF3 != null && this.f35359c != null) {
            an anVar = this.O;
            float f10 = (rectF3.left * anVar.f26570r) + anVar.f26566n;
            float f11 = (rectF3.top * anVar.f26571s) + anVar.f26568p;
            float width = rectF3.width() * anVar.f26570r;
            float height = rectF3.height() * anVar.f26571s;
            if (f7 < 1.0f && (rectF = this.f35360f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * anVar.f26570r) + anVar.f26566n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f35360f.top * anVar.f26571s) + anVar.f26568p, f11, f7);
                width = AndroidUtilities.lerp(this.f35360f.width() * anVar.f26570r, width, f7);
                height = AndroidUtilities.lerp(this.f35360f.height() * anVar.f26571s, height, f7);
            }
            int i10 = this.f35362i;
            if ((i10 & 4) == 0) {
                int i11 = anVar.f26565m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= anVar.f26565m;
            }
            if ((i10 & 1) == 0) {
                int i12 = anVar.f26565m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= anVar.f26565m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
