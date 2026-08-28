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
public final class em {
    public TextPaint B;
    public TextPaint C;
    public final fm O;
    public fm f28062a;
    public MediaController.PhotoEntry f28063b;
    public ImageReceiver f28064c;
    public ImageReceiver d;
    public boolean f28065e;
    public float f28071l;
    public float f28072m;
    public float f28073n;
    public float f28074o;
    public dh.k f28078s;
    public Bitmap v;
    public RectF f28066f = null;
    public final RectF f28067g = new RectF();
    public long h = 0;
    public int f28068i = 0;
    public float f28069j = 1.0f;
    public float f28070k = 0.0f;
    public RectF f28075p = null;
    public final RectF f28076q = new RectF();
    public String f28077r = null;
    public final Path f28079t = new Path();
    public final float[] f28080u = new float[8];
    public float f28081w = 1.0f;
    public final Paint f28082x = new Paint(1);
    public final RectF f28083y = new RectF();
    public final Paint f28084z = new Paint(1);
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

    public em(fm fmVar) {
        this.O = fmVar;
        this.f28062a = fmVar;
    }

    public static void a(em emVar, MediaController.PhotoEntry photoEntry) {
        fm fmVar = emVar.O;
        emVar.f28063b = photoEntry;
        if (photoEntry.isVideo) {
            emVar.f28077r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            emVar.f28077r = null;
        }
        if (emVar.f28064c == null) {
            emVar.f28064c = new ImageReceiver(fmVar.f28512z);
            emVar.d = new ImageReceiver(fmVar.f28512z);
            emVar.f28064c.setDelegate(new g1(15, emVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            emVar.f28064c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.f6.R4, 0L, null, null, 0);
        } else if (photoEntry.path != null) {
            if (photoEntry.isVideo) {
                ImageReceiver imageReceiver = emVar.f28064c;
                imageReceiver.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.f6.R4, 0L, null, null, 0);
                emVar.f28064c.setAllowStartAnimation(true);
                return;
            }
            emVar.f28064c.setOrientation(photoEntry.orientation, true);
            ImageReceiver imageReceiver2 = emVar.f28064c;
            imageReceiver2.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.f6.R4, 0L, null, null, 0);
        } else {
            emVar.f28064c.setImageBitmap(org.telegram.ui.ActionBar.f6.R4);
        }
    }

    public static void b(em emVar, am amVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        float f10;
        float f11;
        float f12;
        RectF rectF = emVar.f28076q;
        RectF rectF2 = emVar.f28067g;
        if (amVar != null && groupedMessagePosition != null) {
            emVar.f28068i = groupedMessagePosition.flags;
            if (z10) {
                float e10 = emVar.e();
                RectF rectF3 = emVar.f28066f;
                if (rectF3 != null) {
                    AndroidUtilities.lerp(rectF3, rectF2, e10, rectF3);
                }
                RectF rectF4 = emVar.f28075p;
                if (rectF4 != null) {
                    AndroidUtilities.lerp(rectF4, rectF, e10, rectF4);
                }
                emVar.f28069j = AndroidUtilities.lerp(emVar.f28069j, emVar.f28070k, e10);
                emVar.h = SystemClock.elapsedRealtime();
            }
            float f13 = groupedMessagePosition.left;
            float f14 = amVar.f26864c;
            float f15 = f13 / f14;
            float f16 = groupedMessagePosition.top;
            float f17 = amVar.f26866f;
            float f18 = f16 / f17;
            emVar.f28070k = 1.0f;
            rectF2.set(f15, f18, (groupedMessagePosition.pw / f14) + f15, (groupedMessagePosition.f19646ph / f17) + f18);
            float dp = AndroidUtilities.dp(2.0f);
            float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
            int i9 = emVar.f28068i;
            if ((i9 & 5) == 5) {
                f10 = dp2;
            } else {
                f10 = dp;
            }
            if ((i9 & 6) == 6) {
                f11 = dp2;
            } else {
                f11 = dp;
            }
            if ((i9 & 10) == 10) {
                f12 = dp2;
            } else {
                f12 = dp;
            }
            if ((i9 & 9) == 9) {
                dp = dp2;
            }
            rectF.set(f10, f11, f12, dp);
            if (emVar.f28066f == null) {
                RectF rectF5 = new RectF();
                emVar.f28066f = rectF5;
                rectF5.set(rectF2);
            }
            if (emVar.f28075p == null) {
                RectF rectF6 = new RectF();
                emVar.f28075p = rectF6;
                rectF6.set(rectF);
            }
        } else if (z10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            emVar.f28069j = AndroidUtilities.lerp(emVar.f28069j, emVar.f28070k, emVar.e());
            RectF rectF7 = emVar.f28066f;
            if (rectF7 != null) {
                AndroidUtilities.lerp(rectF7, rectF2, emVar.e(), emVar.f28066f);
            }
            emVar.f28070k = 0.0f;
            emVar.h = elapsedRealtime;
        } else {
            emVar.f28069j = 0.0f;
            emVar.f28070k = 0.0f;
        }
    }

    public final boolean c(android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.em.c(android.graphics.Canvas, boolean):boolean");
    }

    public final Object clone() {
        em emVar = new em(this.O);
        emVar.f28067g.set(this.f28067g);
        emVar.f28064c = this.f28064c;
        emVar.f28063b = this.f28063b;
        return emVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f28067g != null && this.f28064c != null) {
            gm gmVar = this.O.f28512z;
            em emVar = gmVar.L.F;
            if (emVar != null && emVar.f28063b == this.f28063b) {
                f10 = gmVar.C;
            }
            float lerp = (((1.0f - f10) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f28069j, this.f28070k, e());
            RectF f11 = f(e());
            float f12 = 1.0f - lerp;
            float f13 = lerp + 1.0f;
            f11.set(aa.d.d(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, aa.d.d(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
            return f11;
        }
        RectF rectF = this.f28083y;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF;
    }

    public final float e() {
        return this.O.f28497j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - this.h)) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f28083y;
        RectF rectF3 = this.f28067g;
        if (rectF3 != null && this.f28064c != null) {
            fm fmVar = this.O;
            float f11 = (rectF3.left * fmVar.f28505r) + fmVar.f28501n;
            float f12 = (rectF3.top * fmVar.f28506s) + fmVar.f28503p;
            float width = rectF3.width() * fmVar.f28505r;
            float height = rectF3.height() * fmVar.f28506s;
            if (f10 < 1.0f && (rectF = this.f28066f) != null) {
                f11 = AndroidUtilities.lerp((rectF.left * fmVar.f28505r) + fmVar.f28501n, f11, f10);
                f12 = AndroidUtilities.lerp((this.f28066f.top * fmVar.f28506s) + fmVar.f28503p, f12, f10);
                width = AndroidUtilities.lerp(this.f28066f.width() * fmVar.f28505r, width, f10);
                height = AndroidUtilities.lerp(this.f28066f.height() * fmVar.f28506s, height, f10);
            }
            int i9 = this.f28068i;
            if ((i9 & 4) == 0) {
                int i10 = fmVar.f28500m;
                f12 += i10;
                height -= i10;
            }
            if ((i9 & 8) == 0) {
                height -= fmVar.f28500m;
            }
            if ((i9 & 1) == 0) {
                int i11 = fmVar.f28500m;
                f11 += i11;
                width -= i11;
            }
            if ((i9 & 2) == 0) {
                width -= fmVar.f28500m;
            }
            rectF2.set(f11, f12, width + f11, height + f12);
            return rectF2;
        }
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        return rectF2;
    }
}
