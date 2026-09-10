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
public final class um {
    public TextPaint B;
    public TextPaint C;
    public final vm O;
    public vm f27697a;
    public MediaController.PhotoEntry f27698b;
    public ImageReceiver f27699c;
    public ImageReceiver d;
    public boolean e;
    public float f27705l;
    public float f27706m;
    public float f27707n;
    public float f27708o;
    public uh.g f27712s;
    public Bitmap v;
    public RectF f27700f = null;
    public final RectF f27701g = new RectF();
    public long h = 0;
    public int f27702i = 0;
    public float f27703j = 1.0f;
    public float f27704k = 0.0f;
    public RectF f27709p = null;
    public final RectF f27710q = new RectF();
    public String f27711r = null;
    public final Path f27713t = new Path();
    public final float[] f27714u = new float[8];
    public float f27715w = 1.0f;
    public final Paint f27716x = new Paint(1);
    public final RectF f27717y = new RectF();
    public final Paint f27718z = new Paint(1);
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

    public um(vm vmVar) {
        this.O = vmVar;
        this.f27697a = vmVar;
    }

    public static void a(um umVar, MediaController.PhotoEntry photoEntry) {
        vm vmVar = umVar.O;
        umVar.f27698b = photoEntry;
        if (photoEntry.isVideo) {
            umVar.f27711r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            umVar.f27711r = null;
        }
        if (umVar.f27699c == null) {
            umVar.f27699c = new ImageReceiver(vmVar.f28029z);
            umVar.d = new ImageReceiver(vmVar.f28029z);
            umVar.f27699c.setDelegate(new km(1, umVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            umVar.f27699c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = umVar.f27699c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
                umVar.f27699c.setAllowStartAnimation(true);
                return;
            }
            umVar.f27699c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = umVar.f27699c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
        } else {
            umVar.f27699c.setImageBitmap(org.telegram.ui.ActionBar.j6.R4);
        }
    }

    public static void b(um umVar, pm pmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f7;
        float f10;
        float f11;
        RectF rectF = umVar.f27710q;
        RectF rectF2 = umVar.f27701g;
        if (pmVar != null && groupedMessagePosition != null) {
            umVar.f27702i = groupedMessagePosition.flags;
            if (z10) {
                float e = umVar.e();
                RectF rectF3 = umVar.f27700f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e, rectF3);
                }
                RectF rectF4 = umVar.f27709p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e, rectF4);
                }
                umVar.f27703j = AndroidUtilities.lerp(umVar.f27703j, umVar.f27704k, e);
                umVar.h = SystemClock.elapsedRealtime();
            }
            float f12 = groupedMessagePosition.left;
            float f13 = pmVar.f26210c;
            float f14 = f12 / f13;
            float f15 = groupedMessagePosition.top;
            float f16 = pmVar.f26211f;
            float f17 = f15 / f16;
            umVar.f27704k = 1.0f;
            rectF2.set(f14, f17, (groupedMessagePosition.pw / f13) + f14, (groupedMessagePosition.f14642ph / f16) + f17);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i10 = umVar.f27702i;
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
            if (umVar.f27700f == null) {
                RectF rectF5 = new RectF();
                umVar.f27700f = rectF5;
                rectF5.set(rectF2);
            }
            if (umVar.f27709p == null) {
                RectF rectF6 = new RectF();
                umVar.f27709p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            umVar.f27703j = AndroidUtilities.lerp(umVar.f27703j, umVar.f27704k, umVar.e());
            RectF rectF7 = umVar.f27700f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, umVar.e(), umVar.f27700f);
            }
            umVar.f27704k = 0.0f;
            umVar.h = elapsedRealtime;
        } else {
            umVar.f27703j = 0.0f;
            umVar.f27704k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.um.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        um umVar = new um(this.O);
        umVar.f27701g.set(this.f27701g);
        umVar.f27699c = this.f27699c;
        umVar.f27698b = this.f27698b;
        return umVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.f27701g != null && this.f27699c != null) {
            wm wmVar = this.O.f28029z;
            um umVar = wmVar.P.J;
            if (umVar != null && umVar.f27698b == this.f27698b) {
                f7 = wmVar.G;
            }
            float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f27703j, this.f27704k, e());
            RectF f10 = f(e());
            float f11 = 1.0f - lerp;
            float f12 = lerp + 1.0f;
            f10.set(a4.a.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
            return f10;
        }
        RectF rectF = this.f27717y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f28014j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.f27717y;
        RectF rectF3 = this.f27701g;
        if (rectF3 != null && this.f27699c != null) {
            vm vmVar = this.O;
            float f10 = (rectF3.left * vmVar.f28022r) + vmVar.f28018n;
            float f11 = (rectF3.top * vmVar.f28023s) + vmVar.f28020p;
            float width = rectF3.width() * vmVar.f28022r;
            float height = rectF3.height() * vmVar.f28023s;
            if (f7 < 1.0f && (rectF = this.f27700f) != null) {
                f10 = AndroidUtilities.lerp((rectF.left * vmVar.f28022r) + vmVar.f28018n, f10, f7);
                f11 = AndroidUtilities.lerp((this.f27700f.top * vmVar.f28023s) + vmVar.f28020p, f11, f7);
                width = AndroidUtilities.lerp(this.f27700f.width() * vmVar.f28022r, width, f7);
                height = AndroidUtilities.lerp(this.f27700f.height() * vmVar.f28023s, height, f7);
            }
            int i10 = this.f27702i;
            if ((i10 & 4) == 0) {
                int i11 = vmVar.f28017m;
                f11 += i11;
                height -= i11;
            }
            if ((i10 & 8) == 0) {
                height -= vmVar.f28017m;
            }
            if ((i10 & 1) == 0) {
                int i12 = vmVar.f28017m;
                f10 += i12;
                width -= i12;
            }
            if ((i10 & 2) == 0) {
                width -= vmVar.f28017m;
            }
            rectF2.set(f10, f11, width + f10, height + f11);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
