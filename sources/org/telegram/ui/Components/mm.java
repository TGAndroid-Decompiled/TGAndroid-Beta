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
public final class mm {
    public TextPaint B;
    public TextPaint C;
    public final nm O;
    public nm f29156a;
    public MediaController.PhotoEntry f29157b;
    public ImageReceiver f29158c;
    public ImageReceiver d;
    public boolean f29159e;
    public float f29165l;
    public float f29166m;
    public float f29167n;
    public float f29168o;
    public jh.j f29172s;
    public Bitmap v;
    public RectF f29160f = null;
    public final RectF f29161g = new RectF();
    public long h = 0;
    public int f29162i = 0;
    public float f29163j = 1.0f;
    public float f29164k = 0.0f;
    public RectF f29169p = null;
    public final RectF f29170q = new RectF();
    public String f29171r = null;
    public final Path f29173t = new Path();
    public final float[] f29174u = new float[8];
    public float f29175w = 1.0f;
    public final Paint f29176x = new Paint(1);
    public final RectF f29177y = new RectF();
    public final Paint f29178z = new Paint(1);
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

    public mm(nm nmVar) {
        this.O = nmVar;
        this.f29156a = nmVar;
    }

    public static void a(mm mmVar, MediaController.PhotoEntry photoEntry) {
        nm nmVar = mmVar.O;
        mmVar.f29157b = photoEntry;
        if (photoEntry.isVideo) {
            mmVar.f29171r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            mmVar.f29171r = null;
        }
        if (mmVar.f29158c == null) {
            mmVar.f29158c = new ImageReceiver(nmVar.f29538z);
            mmVar.d = new ImageReceiver(nmVar.f29538z);
            mmVar.f29158c.setDelegate(new o1(14, mmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            mmVar.f29158c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = mmVar.f29158c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
                mmVar.f29158c.setAllowStartAnimation(true);
                return;
            }
            mmVar.f29158c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = mmVar.f29158c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
        } else {
            mmVar.f29158c.setImageBitmap(org.telegram.ui.ActionBar.k6.R4);
        }
    }

    public static void b(mm mmVar, hm hmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z4) {
        float f10;
        float f11;
        float f12;
        RectF rectF = mmVar.f29170q;
        RectF rectF2 = mmVar.f29161g;
        if (hmVar != null && groupedMessagePosition != null) {
            mmVar.f29162i = groupedMessagePosition.flags;
            if (z4) {
                float e6 = mmVar.e();
                RectF rectF3 = mmVar.f29160f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e6, rectF3);
                }
                RectF rectF4 = mmVar.f29169p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e6, rectF4);
                }
                mmVar.f29163j = AndroidUtilities.lerp(mmVar.f29163j, mmVar.f29164k, e6);
                mmVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = groupedMessagePosition.left;
            float f14 = hmVar.f27562c;
            float f15 = f13 / f14;
            float f16 = groupedMessagePosition.top;
            float f17 = hmVar.f27564f;
            float f18 = f16 / f17;
            mmVar.f29164k = 1.0f;
            rectF2.set(f15, f18, (groupedMessagePosition.pw / f14) + f15, (groupedMessagePosition.f18054ph / f17) + f18);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = mmVar.f29162i;
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
            if (mmVar.f29160f == null) {
                RectF rectF5 = new RectF();
                mmVar.f29160f = rectF5;
                rectF5.set(rectF2);
            }
            if (mmVar.f29169p == null) {
                RectF rectF6 = new RectF();
                mmVar.f29169p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z4) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            mmVar.f29163j = AndroidUtilities.lerp(mmVar.f29163j, mmVar.f29164k, mmVar.e());
            RectF rectF7 = mmVar.f29160f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, mmVar.e(), mmVar.f29160f);
            }
            mmVar.f29164k = 0.0f;
            mmVar.h = elapsedRealtime;
        } else {
            mmVar.f29163j = 0.0f;
            mmVar.f29164k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        mm mmVar = new mm(this.O);
        mmVar.f29161g.set(this.f29161g);
        mmVar.f29158c = this.f29158c;
        mmVar.f29157b = this.f29157b;
        return mmVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f29161g != null && this.f29158c != null) {
            om omVar = this.O.f29538z;
            mm mmVar = omVar.M.G;
            if (mmVar != null && mmVar.f29157b == this.f29157b) {
                f10 = omVar.D;
            }
            float lerp = (((1.0f - f10) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f29163j, this.f29164k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - lerp;
            float f13 = lerp + 1.0f;
            f11.set(android.support.v4.media.a.d(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, android.support.v4.media.a.d(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f29177y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f29523j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f29177y;
        RectF rectF3 = this.f29161g;
        if (rectF3 != null && this.f29158c != null) {
            nm nmVar = this.O;
            float f11 = (rectF3.left * nmVar.f29531r) + nmVar.f29527n;
            float f12 = (rectF3.top * nmVar.f29532s) + nmVar.f29529p;
            float width = rectF3.width() * nmVar.f29531r;
            float height = rectF3.height() * nmVar.f29532s;
            if (f10 < 1.0f && (rectF = this.f29160f) != null) {
                f11 = AndroidUtilities.lerp((rectF.left * nmVar.f29531r) + nmVar.f29527n, f11, f10);
                f12 = AndroidUtilities.lerp((this.f29160f.top * nmVar.f29532s) + nmVar.f29529p, f12, f10);
                width = AndroidUtilities.lerp(this.f29160f.width() * nmVar.f29531r, width, f10);
                height = AndroidUtilities.lerp(this.f29160f.height() * nmVar.f29532s, height, f10);
            }
            int i10 = this.f29162i;
            if ((i10 & 4) == 0) {
                int i11 = nmVar.f29526m;
                f12 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= nmVar.f29526m;
            }
            if ((i10 & 1) == 0) {
                int i12 = nmVar.f29526m;
                f11 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= nmVar.f29526m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
