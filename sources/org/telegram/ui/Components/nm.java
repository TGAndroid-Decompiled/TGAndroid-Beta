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
public final class nm {
    public TextPaint B;
    public TextPaint C;
    public final om O;
    public om f28792a;
    public MediaController.PhotoEntry f28793b;
    public ImageReceiver f28794c;
    public ImageReceiver d;
    public boolean f28795e;
    public float f28801l;
    public float f28802m;
    public float f28803n;
    public float f28804o;
    public wh.g f28808s;
    public Bitmap v;
    public RectF f28796f = null;
    public final RectF f28797g = new RectF();
    public long h = 0;
    public int f28798i = 0;
    public float f28799j = 1.0f;
    public float f28800k = 0.0f;
    public RectF f28805p = null;
    public final RectF f28806q = new RectF();
    public String f28807r = null;
    public final Path f28809t = new Path();
    public final float[] f28810u = new float[8];
    public float f28811w = 1.0f;
    public final Paint f28812x = new Paint(1);
    public final RectF f28813y = new RectF();
    public final Paint f28814z = new Paint(1);
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

    public nm(om omVar) {
        this.O = omVar;
        this.f28792a = omVar;
    }

    public static void a(nm nmVar, MediaController.PhotoEntry photoEntry) {
        om omVar = nmVar.O;
        nmVar.f28793b = photoEntry;
        if (photoEntry.isVideo) {
            nmVar.f28807r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            nmVar.f28807r = null;
        }
        if (nmVar.f28794c == null) {
            nmVar.f28794c = new ImageReceiver(omVar.f29132z);
            nmVar.d = new ImageReceiver(omVar.f29132z);
            nmVar.f28794c.setDelegate(new b3(6, nmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            nmVar.f28794c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = nmVar.f28794c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
                nmVar.f28794c.setAllowStartAnimation(true);
                return;
            }
            nmVar.f28794c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = nmVar.f28794c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else {
            nmVar.f28794c.setImageBitmap(org.telegram.ui.ActionBar.j6.R4);
        }
    }

    public static void b(nm nmVar, jm jmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = nmVar.f28806q;
        RectF rectF2 = nmVar.f28797g;
        if (jmVar != null && groupedMessagePosition != null) {
            nmVar.f28798i = groupedMessagePosition.flags;
            if (z10) {
                float e7 = nmVar.e();
                RectF rectF3 = nmVar.f28796f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e7, rectF3);
                }
                RectF rectF4 = nmVar.f28805p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e7, rectF4);
                }
                nmVar.f28799j = AndroidUtilities.lerp(nmVar.f28799j, nmVar.f28800k, e7);
                nmVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = jmVar.f27536c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = jmVar.f27538f;
            float f17 = f15 / f16;
            nmVar.f28800k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f17077ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = nmVar.f28798i;
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
            if (nmVar.f28796f == null) {
                RectF rectF5 = new RectF();
                nmVar.f28796f = rectF5;
                rectF5.set(rectF2);
            }
            if (nmVar.f28805p == null) {
                RectF rectF6 = new RectF();
                nmVar.f28805p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            nmVar.f28799j = AndroidUtilities.lerp(nmVar.f28799j, nmVar.f28800k, nmVar.e());
            RectF rectF7 = nmVar.f28796f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, nmVar.e(), nmVar.f28796f);
            }
            nmVar.f28800k = 0.0f;
            nmVar.h = elapsedRealtime;
        } else {
            nmVar.f28799j = 0.0f;
            nmVar.f28800k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        nm nmVar = new nm(this.O);
        nmVar.f28797g.set(this.f28797g);
        nmVar.f28794c = this.f28794c;
        nmVar.f28793b = this.f28793b;
        return nmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f28797g != null && this.f28794c != null) {
            pm pmVar = this.O.f29132z;
            nm nmVar = pmVar.P.J;
            if (nmVar != null && nmVar.f28793b == this.f28793b) {
                f7 = pmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f28799j, this.f28800k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f28813y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f29117j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f28813y;
        RectF rectF3 = this.f28797g;
        if (rectF3 != null && this.f28794c != null) {
            om omVar = this.O;
            float f10 = (rectF3.left * omVar.f29125r) + omVar.f29121n;
            float f11 = (rectF3.top * omVar.f29126s) + omVar.f29123p;
            float width = rectF3.width() * omVar.f29125r;
            float height = rectF3.height() * omVar.f29126s;
            if (f7 < 1.0f && (rectF = this.f28796f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * omVar.f29125r) + omVar.f29121n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f28796f.top * omVar.f29126s) + omVar.f29123p, f11, f7);
                width = AndroidUtilities.lerp(this.f28796f.width() * omVar.f29125r, width, f7);
                height = AndroidUtilities.lerp(this.f28796f.height() * omVar.f29126s, height, f7);
            }
            int i10 = this.f28798i;
            if ((i10 & 4) == 0) {
                int i11 = omVar.f29120m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= omVar.f29120m;
            }
            if ((i10 & 1) == 0) {
                int i12 = omVar.f29120m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= omVar.f29120m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
