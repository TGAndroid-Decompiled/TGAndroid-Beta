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
public final class ym {
    public TextPaint B;
    public TextPaint C;
    public final zm O;
    public zm f32678a;
    public MediaController.PhotoEntry f32679b;
    public ImageReceiver f32680c;
    public ImageReceiver d;
    public boolean e;
    public float f32686l;
    public float f32687m;
    public float f32688n;
    public float f32689o;
    public wh.f f32693s;
    public Bitmap v;
    public RectF f32681f = null;
    public final RectF f32682g = new RectF();
    public long h = 0;
    public int f32683i = 0;
    public float f32684j = 1.0f;
    public float f32685k = 0.0f;
    public RectF f32690p = null;
    public final RectF f32691q = new RectF();
    public String f32692r = null;
    public final Path f32694t = new Path();
    public final float[] f32695u = new float[8];
    public float f32696w = 1.0f;
    public final Paint f32697x = new Paint(1);
    public final RectF f32698y = new RectF();
    public final Paint f32699z = new Paint(1);
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

    public ym(zm zmVar) {
        this.O = zmVar;
        this.f32678a = zmVar;
    }

    public static void a(ym ymVar, MediaController.PhotoEntry photoEntry) {
        zm zmVar = ymVar.O;
        ymVar.f32679b = photoEntry;
        if (photoEntry.isVideo) {
            ymVar.f32692r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            ymVar.f32692r = null;
        }
        if (ymVar.f32680c == null) {
            ymVar.f32680c = new ImageReceiver(zmVar.f32971z);
            ymVar.d = new ImageReceiver(zmVar.f32971z);
            ymVar.f32680c.setDelegate(new q2(11, ymVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            ymVar.f32680c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = ymVar.f32680c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
                ymVar.f32680c.setAllowStartAnimation(true);
                return;
            }
            ymVar.f32680c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = ymVar.f32680c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
        } else {
            ymVar.f32680c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
        }
    }

    public static void b(ym ymVar, um umVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = ymVar.f32691q;
        RectF rectF2 = ymVar.f32682g;
        if (umVar != null && groupedMessagePosition != null) {
            ymVar.f32683i = groupedMessagePosition.flags;
            if (z10) {
                float e = ymVar.e();
                RectF rectF3 = ymVar.f32681f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = ymVar.f32690p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                ymVar.f32684j = AndroidUtilities.lerp(ymVar.f32684j, ymVar.f32685k, e);
                ymVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = umVar.f30964c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = umVar.f30965f;
            float f17 = f15 / f16;
            ymVar.f32685k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17796ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = ymVar.f32683i;
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
            if (ymVar.f32681f == null) {
                RectF rectF5 = new RectF();
                ymVar.f32681f = rectF5;
                rectF5.set(rectF2);
            }
            if (ymVar.f32690p == null) {
                RectF rectF6 = new RectF();
                ymVar.f32690p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ymVar.f32684j = AndroidUtilities.lerp(ymVar.f32684j, ymVar.f32685k, ymVar.e());
            RectF rectF7 = ymVar.f32681f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, ymVar.e(), ymVar.f32681f);
            }
            ymVar.f32685k = 0.0f;
            ymVar.h = elapsedRealtime;
        } else {
            ymVar.f32684j = 0.0f;
            ymVar.f32685k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ym.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        ym ymVar = new ym(this.O);
        ymVar.f32682g.set(this.f32682g);
        ymVar.f32680c = this.f32680c;
        ymVar.f32679b = this.f32679b;
        return ymVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f32682g != null && this.f32680c != null) {
            an anVar = this.O.f32971z;
            ym ymVar = anVar.P.J;
            if (ymVar != null && ymVar.f32679b == this.f32679b) {
                f7 = anVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f32684j, this.f32685k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a1.g.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f32698y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f32956j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f32698y;
        RectF rectF3 = this.f32682g;
        if (rectF3 != null && this.f32680c != null) {
            zm zmVar = this.O;
            float f10 = (rectF3.left * zmVar.f32964r) + zmVar.f32960n;
            float f11 = (rectF3.top * zmVar.f32965s) + zmVar.f32962p;
            float width = rectF3.width() * zmVar.f32964r;
            float height = rectF3.height() * zmVar.f32965s;
            if (f7 < 1.0f && (rectF = this.f32681f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * zmVar.f32964r) + zmVar.f32960n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f32681f.top * zmVar.f32965s) + zmVar.f32962p, f11, f7);
                width = AndroidUtilities.lerp(this.f32681f.width() * zmVar.f32964r, width, f7);
                height = AndroidUtilities.lerp(this.f32681f.height() * zmVar.f32965s, height, f7);
            }
            int i10 = this.f32683i;
            if ((i10 & 4) == 0) {
                int i11 = zmVar.f32959m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= zmVar.f32959m;
            }
            if ((i10 & 1) == 0) {
                int i12 = zmVar.f32959m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= zmVar.f32959m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
