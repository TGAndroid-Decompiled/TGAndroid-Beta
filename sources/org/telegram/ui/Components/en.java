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
public final class en {
    public TextPaint B;
    public TextPaint C;
    public final fn O;
    public fn f26081a;
    public MediaController.PhotoEntry f26082b;
    public ImageReceiver f26083c;
    public ImageReceiver d;
    public boolean f26084e;
    public float f26090l;
    public float f26091m;
    public float f26092n;
    public float f26093o;
    public vh.f f26097s;
    public Bitmap v;
    public RectF f26085f = null;
    public final RectF f26086g = new RectF();
    public long h = 0;
    public int f26087i = 0;
    public float f26088j = 1.0f;
    public float f26089k = 0.0f;
    public RectF f26094p = null;
    public final RectF f26095q = new RectF();
    public String f26096r = null;
    public final Path f26098t = new Path();
    public final float[] f26099u = new float[8];
    public float f26100w = 1.0f;
    public final Paint f26101x = new Paint(1);
    public final RectF f26102y = new RectF();
    public final Paint f26103z = new Paint(1);
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

    public en(fn fnVar) {
        this.O = fnVar;
        this.f26081a = fnVar;
    }

    public static void a(en enVar, MediaController.PhotoEntry photoEntry) {
        fn fnVar = enVar.O;
        enVar.f26082b = photoEntry;
        if (photoEntry.isVideo) {
            enVar.f26096r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            enVar.f26096r = null;
        }
        if (enVar.f26083c == null) {
            enVar.f26083c = new ImageReceiver(fnVar.f26397z);
            enVar.d = new ImageReceiver(fnVar.f26397z);
            enVar.f26083c.setDelegate(new y2(8, enVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            enVar.f26083c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = enVar.f26083c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                enVar.f26083c.setAllowStartAnimation(true);
                return;
            }
            enVar.f26083c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = enVar.f26083c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            enVar.f26083c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(en enVar, an anVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = enVar.f26095q;
        RectF rectF2 = enVar.f26086g;
        if (anVar != null && groupedMessagePosition != null) {
            enVar.f26087i = groupedMessagePosition.flags;
            if (z10) {
                float e7 = enVar.e();
                RectF rectF3 = enVar.f26085f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e7, rectF3);
                }
                RectF rectF4 = enVar.f26094p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e7, rectF4);
                }
                enVar.f26088j = AndroidUtilities.lerp(enVar.f26088j, enVar.f26089k, e7);
                enVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = anVar.f24541c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = anVar.f24543f;
            float f17 = f15 / f16;
            enVar.f26089k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17248ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = enVar.f26087i;
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
            if (enVar.f26085f == null) {
                RectF rectF5 = new RectF();
                enVar.f26085f = rectF5;
                rectF5.set(rectF2);
            }
            if (enVar.f26094p == null) {
                RectF rectF6 = new RectF();
                enVar.f26094p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            enVar.f26088j = AndroidUtilities.lerp(enVar.f26088j, enVar.f26089k, enVar.e());
            RectF rectF7 = enVar.f26085f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, enVar.e(), enVar.f26085f);
            }
            enVar.f26089k = 0.0f;
            enVar.h = elapsedRealtime;
        } else {
            enVar.f26088j = 0.0f;
            enVar.f26089k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.en.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        en enVar = new en(this.O);
        enVar.f26086g.set(this.f26086g);
        enVar.f26083c = this.f26083c;
        enVar.f26082b = this.f26082b;
        return enVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f26086g != null && this.f26083c != null) {
            gn gnVar = this.O.f26397z;
            en enVar = gnVar.P.J;
            if (enVar != null && enVar.f26082b == this.f26082b) {
                f7 = gnVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f26088j, this.f26089k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a1.g.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f26102y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f26382j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f26102y;
        RectF rectF3 = this.f26086g;
        if (rectF3 != null && this.f26083c != null) {
            fn fnVar = this.O;
            float f10 = (rectF3.left * fnVar.f26390r) + fnVar.f26386n;
            float f11 = (rectF3.top * fnVar.f26391s) + fnVar.f26388p;
            float width = rectF3.width() * fnVar.f26390r;
            float height = rectF3.height() * fnVar.f26391s;
            if (f7 < 1.0f && (rectF = this.f26085f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * fnVar.f26390r) + fnVar.f26386n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f26085f.top * fnVar.f26391s) + fnVar.f26388p, f11, f7);
                width = AndroidUtilities.lerp(this.f26085f.width() * fnVar.f26390r, width, f7);
                height = AndroidUtilities.lerp(this.f26085f.height() * fnVar.f26391s, height, f7);
            }
            int i10 = this.f26087i;
            if ((i10 & 4) == 0) {
                int i11 = fnVar.f26385m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= fnVar.f26385m;
            }
            if ((i10 & 1) == 0) {
                int i12 = fnVar.f26385m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= fnVar.f26385m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
