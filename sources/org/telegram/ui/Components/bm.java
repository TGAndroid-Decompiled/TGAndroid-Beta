package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public final class bm {
    public TextPaint B;
    public TextPaint C;
    public final cm O;

    public cm f27137a;

    public MediaController.PhotoEntry f27138b;

    public ImageReceiver f27139c;
    public ImageReceiver d;

    public boolean f27140e;

    public float f27146l;

    public float f27147m;

    public float f27148n;

    public float f27149o;

    public eh.j f27153s;
    public Bitmap v;

    public RectF f27141f = null;

    public final RectF f27142g = new RectF();
    public long h = 0;

    public int f27143i = 0;

    public float f27144j = 1.0f;

    public float f27145k = 0.0f;

    public RectF f27150p = null;

    public final RectF f27151q = new RectF();

    public String f27152r = null;

    public final Path f27154t = new Path();

    public final float[] f27155u = new float[8];

    public float f27156w = 1.0f;

    public final Paint f27157x = new Paint(1);

    public final RectF f27158y = new RectF();

    public final Paint f27159z = new Paint(1);
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

    public bm(cm cmVar) {
        this.O = cmVar;
        this.f27137a = cmVar;
    }

    public static void a(bm bmVar, MediaController.PhotoEntry photoEntry) {
        cm cmVar = bmVar.O;
        bmVar.f27138b = photoEntry;
        if (photoEntry.isVideo) {
            bmVar.f27152r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            bmVar.f27152r = null;
        }
        if (bmVar.f27139c == null) {
            bmVar.f27139c = new ImageReceiver(cmVar.f27505z);
            bmVar.d = new ImageReceiver(cmVar.f27505z);
            bmVar.f27139c.setDelegate(new g1(15, bmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            bmVar.f27139c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.g6.R4, 0L, null, null, 0);
            return;
        }
        if (photoEntry.path == null) {
            bmVar.f27139c.setImageBitmap(org.telegram.ui.ActionBar.g6.R4);
            return;
        }
        if (photoEntry.isVideo) {
            bmVar.f27139c.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.g6.R4, 0L, null, null, 0);
            bmVar.f27139c.setAllowStartAnimation(true);
            return;
        }
        bmVar.f27139c.setOrientation(photoEntry.orientation, true);
        bmVar.f27139c.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.g6.R4, 0L, null, null, 0);
    }

    public static void b(bm bmVar, wl wlVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        RectF rectF = bmVar.f27151q;
        RectF rectF2 = bmVar.f27142g;
        if (wlVar == null || groupedMessagePosition == null) {
            if (!z10) {
                bmVar.f27144j = 0.0f;
                bmVar.f27145k = 0.0f;
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            bmVar.f27144j = AndroidUtilities.lerp(bmVar.f27144j, bmVar.f27145k, bmVar.e());
            RectF rectF3 = bmVar.f27141f;
            if (rectF3 != null) {
                AndroidUtilities.lerp(rectF3, rectF2, bmVar.e(), bmVar.f27141f);
            }
            bmVar.f27145k = 0.0f;
            bmVar.h = jElapsedRealtime;
            return;
        }
        bmVar.f27143i = groupedMessagePosition.flags;
        if (z10) {
            float fE = bmVar.e();
            RectF rectF4 = bmVar.f27141f;
            if (rectF4 != null) {
                AndroidUtilities.lerp(rectF4, rectF2, fE, rectF4);
            }
            RectF rectF5 = bmVar.f27150p;
            if (rectF5 != null) {
                AndroidUtilities.lerp(rectF5, rectF, fE, rectF5);
            }
            bmVar.f27144j = AndroidUtilities.lerp(bmVar.f27144j, bmVar.f27145k, fE);
            bmVar.h = SystemClock.elapsedRealtime();
        }
        float f10 = groupedMessagePosition.left;
        float f11 = wlVar.f34282c;
        float f12 = f10 / f11;
        float f13 = groupedMessagePosition.top;
        float f14 = wlVar.f34284f;
        float f15 = f13 / f14;
        float f16 = groupedMessagePosition.pw / f11;
        float f17 = groupedMessagePosition.f19619ph / f14;
        bmVar.f27145k = 1.0f;
        rectF2.set(f12, f15, f16 + f12, f17 + f15);
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        int i10 = bmVar.f27143i;
        float f18 = (i10 & 5) == 5 ? fDp2 : fDp;
        float f19 = (i10 & 6) == 6 ? fDp2 : fDp;
        float f20 = (i10 & 10) == 10 ? fDp2 : fDp;
        if ((i10 & 9) == 9) {
            fDp = fDp2;
        }
        rectF.set(f18, f19, f20, fDp);
        if (bmVar.f27141f == null) {
            RectF rectF6 = new RectF();
            bmVar.f27141f = rectF6;
            rectF6.set(rectF2);
        }
        if (bmVar.f27150p == null) {
            RectF rectF7 = new RectF();
            bmVar.f27150p = rectF7;
            rectF7.set(rectF);
        }
    }

    public final boolean c(Canvas canvas, boolean z10) {
        dm dmVar;
        char c10;
        char c11;
        Bitmap bitmap;
        String str;
        float f10;
        String str2;
        char c12;
        Path.Direction direction;
        RectF rectF;
        float fE = e();
        if (this.f27142g == null || this.f27139c == null) {
            return false;
        }
        cm cmVar = this.O;
        dm dmVar2 = cmVar.f27505z;
        em emVar = dmVar2.L;
        float f11 = dmVar2.L.F == this ? dmVar2.C : 0.0f;
        float fLerp = AndroidUtilities.lerp(this.f27144j, this.f27145k, fE);
        if (fLerp <= 0.0f) {
            return false;
        }
        RectF rectFD = d();
        float fDp = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        RectF rectF2 = this.f27151q;
        float fLerp2 = rectF2.left;
        float fLerp3 = rectF2.top;
        float fLerp4 = rectF2.right;
        float fLerp5 = rectF2.bottom;
        if (fE < 1.0f && (rectF = this.f27150p) != null) {
            fLerp2 = AndroidUtilities.lerp(rectF.left, fLerp2, fE);
            fLerp3 = AndroidUtilities.lerp(this.f27150p.top, fLerp3, fE);
            fLerp4 = AndroidUtilities.lerp(this.f27150p.right, fLerp4, fE);
            fLerp5 = AndroidUtilities.lerp(this.f27150p.bottom, fLerp5, fE);
        }
        float fLerp6 = AndroidUtilities.lerp(fLerp2, fDp, f11);
        float fLerp7 = AndroidUtilities.lerp(fLerp3, fDp, f11);
        float fLerp8 = AndroidUtilities.lerp(fLerp4, fDp, f11);
        float fLerp9 = AndroidUtilities.lerp(fLerp5, fDp, f11);
        if (z10) {
            canvas.save();
            canvas.translate(-rectFD.centerX(), -rectFD.centerY());
        }
        int i10 = (int) fLerp6;
        int i11 = (int) fLerp7;
        int i12 = (int) fLerp8;
        int i13 = (int) fLerp9;
        this.f27139c.setRoundRadius(i10, i11, i12, i13);
        this.f27139c.setImageCoords(rectFD.left, rectFD.top, rectFD.width(), rectFD.height());
        this.f27139c.setAlpha(fLerp);
        this.f27139c.draw(canvas);
        MediaController.PhotoEntry photoEntry = this.f27138b;
        float[] fArr = this.f27155u;
        Path path = this.f27154t;
        if (photoEntry == null || !photoEntry.hasSpoiler || photoEntry.isChatPreviewSpoilerRevealed) {
            fLerp7 = fLerp7;
            dmVar = dmVar2;
            c10 = 3;
            c11 = 2;
        } else {
            if (this.f27140e || this.d.getBitmap() != null || this.f27139c.getBitmap() == null) {
                if (!this.f27140e && this.d.getBitmap() != null) {
                    c12 = 1;
                    this.f27140e = true;
                }
                fArr[c12] = fLerp6;
                fArr[0] = fLerp6;
                fArr[3] = fLerp7;
                fArr[2] = fLerp7;
                fArr[5] = fLerp8;
                fArr[4] = fLerp8;
                fArr[7] = fLerp9;
                fArr[6] = fLerp9;
                canvas.save();
                path.rewind();
                direction = Path.Direction.CW;
                path.addRoundRect(rectFD, fArr, direction);
                canvas.clipPath(path);
                if (this.f27146l != 0.0f) {
                    path.rewind();
                    path.addCircle(this.f27147m, this.f27148n, this.f27146l * this.f27149o, direction);
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                }
                this.d.setRoundRadius(i10, i11, i12, i13);
                this.d.setImageCoords(rectFD.left, rectFD.top, rectFD.width(), rectFD.height());
                this.d.setAlpha(fLerp);
                this.d.draw(canvas);
                if (this.f27153s == null) {
                    this.f27153s = eh.j.e(dmVar2);
                }
                eh.j jVar = this.f27153s;
                int width = dmVar2.getWidth();
                int height = dmVar2.getHeight();
                dmVar = dmVar2;
                c10 = 3;
                c11 = 2;
                jVar.c(canvas, dmVar, width, height, 1.0f, false);
                canvas.restore();
                dmVar.invalidate();
                dmVar.invalidate();
            } else {
                this.f27140e = true;
                this.d.setImageBitmap(Utilities.stackBlurBitmapMax(this.f27139c.getBitmap()));
            }
            c12 = 1;
            fArr[c12] = fLerp6;
            fArr[0] = fLerp6;
            fArr[3] = fLerp7;
            fArr[2] = fLerp7;
            fArr[5] = fLerp8;
            fArr[4] = fLerp8;
            fArr[7] = fLerp9;
            fArr[6] = fLerp9;
            canvas.save();
            path.rewind();
            direction = Path.Direction.CW;
            path.addRoundRect(rectFD, fArr, direction);
            canvas.clipPath(path);
            if (this.f27146l != 0.0f) {
                path.rewind();
                path.addCircle(this.f27147m, this.f27148n, this.f27146l * this.f27149o, direction);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            this.d.setRoundRadius(i10, i11, i12, i13);
            this.d.setImageCoords(rectFD.left, rectFD.top, rectFD.width(), rectFD.height());
            this.d.setAlpha(fLerp);
            this.d.draw(canvas);
            if (this.f27153s == null) {
                this.f27153s = eh.j.e(dmVar2);
            }
            eh.j jVar2 = this.f27153s;
            int width2 = dmVar2.getWidth();
            int height2 = dmVar2.getHeight();
            dmVar = dmVar2;
            c10 = 3;
            c11 = 2;
            jVar2.c(canvas, dmVar, width2, height2, 1.0f, false);
            canvas.restore();
            dmVar.invalidate();
            dmVar.invalidate();
        }
        float f12 = this.f27156w;
        String str3 = null;
        if (f12 != 1.0f && this.v != null) {
            fArr[1] = fLerp6;
            fArr[0] = fLerp6;
            fArr[c10] = fLerp7;
            fArr[c11] = fLerp7;
            fArr[5] = fLerp8;
            fArr[4] = fLerp8;
            fArr[7] = fLerp9;
            fArr[6] = fLerp9;
            canvas.save();
            path.rewind();
            path.addRoundRect(rectFD, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            float fMin = Math.min(1.0f, (Math.min(16L, SystemClock.elapsedRealtime() - this.h) / 250.0f) + this.f27156w);
            this.f27156w = fMin;
            int i14 = (int) ((1.0f - fMin) * 255.0f);
            Paint paint = this.f27157x;
            paint.setAlpha(i14);
            canvas.drawBitmap(this.v, rectFD.left, rectFD.top, paint);
            canvas.restore();
            dmVar.invalidate();
        } else if (f12 == 1.0f && (bitmap = this.v) != null) {
            bitmap.recycle();
            this.v = null;
            dmVar.invalidate();
        }
        int iIndexOf = cmVar.f27491k.f34285g.indexOf(this.f27138b) + cmVar.f27484b;
        if (iIndexOf >= 0) {
            str3 = (iIndexOf + 1) + "";
        }
        float f13 = this.f27139c.getVisible() ? 1.0f : 0.0f;
        boolean z11 = Math.abs(this.M - f13) > 0.01f;
        if (z11) {
            long jMin = Math.min(17L, SystemClock.elapsedRealtime() - this.N);
            this.N = SystemClock.elapsedRealtime();
            float f14 = jMin / 100.0f;
            float f15 = this.M;
            if (f13 < f15) {
                this.M = Math.max(0.0f, f15 - f14);
            } else {
                this.M = Math.min(1.0f, f15 + f14);
            }
        }
        float fDp2 = rectFD.top + AndroidUtilities.dp(10.0f);
        float fDp3 = rectFD.right - AndroidUtilities.dp(10.0f);
        float f16 = this.M * fLerp;
        int iDp = AndroidUtilities.dp(12.0f);
        int iDp2 = AndroidUtilities.dp(1.2f);
        int i15 = (iDp + iDp2) * 2;
        int i16 = iDp2 * 4;
        Rect rect = this.I;
        if (str3 == null || !(this.E == null || (str2 = this.F) == null || !str2.equals(str3))) {
            z11 = z11;
        } else {
            if (this.E == null) {
                this.E = Bitmap.createBitmap(i15, i15, Bitmap.Config.ARGB_8888);
            }
            Canvas canvas2 = new Canvas(this.E);
            canvas2.drawColor(0);
            if (this.B == null) {
                TextPaint textPaint = new TextPaint(1);
                this.B = textPaint;
                textPaint.setTypeface(AndroidUtilities.bold());
            }
            TextPaint textPaint2 = this.B;
            int i17 = org.telegram.ui.ActionBar.g6.V9;
            textPaint2.setColor(org.telegram.ui.ActionBar.g6.v0(i17, emVar.f34899a));
            int length = str3.length();
            if (length == 0 || length == 1 || length == 2) {
                f10 = 14.0f;
            } else {
                f10 = length != 3 ? 8.0f : 10.0f;
            }
            float f17 = f10;
            this.B.setTextSize(AndroidUtilities.dp(f17));
            float f18 = i15 / 2.0f;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W9, emVar.f34899a);
            Paint paint2 = this.f27159z;
            paint2.setColor(iV0);
            float f19 = (int) f18;
            float f20 = iDp;
            canvas2.drawCircle(f19, f19, f20, paint2);
            int offsetColor = AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.g6.v0(i17, emVar.f34899a), 1.0f, 1.0f);
            Paint paint3 = this.A;
            paint3.setColor(offsetColor);
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeWidth(iDp2);
            canvas2.drawCircle(f19, f19, f20, paint3);
            canvas2.drawText(str3, f18 - (this.B.measureText(str3) / 2.0f), f18 + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(f17 / 4.0f), this.B);
            rect.set(0, 0, i15, i15);
            this.F = str3;
        }
        Bitmap bitmap2 = this.E;
        Paint paint4 = this.D;
        if (bitmap2 != null) {
            float f21 = i15 * fLerp;
            float f22 = i16;
            int i18 = (int) ((fDp3 - f21) + f22);
            float f23 = fDp2 - f22;
            int i19 = (int) f23;
            int i20 = (int) (fDp3 + f22);
            int i21 = (int) (f23 + f21);
            Rect rect2 = this.J;
            rect2.set(i18, i19, i20, i21);
            paint4.setAlpha((int) (f16 * 255.0f));
            canvas.drawBitmap(this.E, rect, rect2, paint4);
        }
        float fDp4 = rectFD.left + AndroidUtilities.dp(4.0f);
        float fDp5 = rectFD.bottom - AndroidUtilities.dp(4.0f);
        String str4 = this.f27152r;
        float f24 = this.M * fLerp;
        if (str4 != null) {
            Bitmap bitmap3 = this.G;
            Rect rect3 = this.K;
            if (bitmap3 == null || (str = this.H) == null || !str.equals(str4)) {
                if (this.C == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    this.C = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    this.C.setColor(-1);
                }
                float fDp6 = AndroidUtilities.dp(12.0f);
                this.C.setTextSize(fDp6);
                float intrinsicWidth = emVar.J.getIntrinsicWidth() + this.C.measureText(str4) + AndroidUtilities.dp(15.0f);
                Drawable drawable = emVar.J;
                float fMax = Math.max(fDp6, AndroidUtilities.dp(4.0f) + emVar.J.getIntrinsicHeight());
                int iCeil = (int) Math.ceil(intrinsicWidth);
                int iCeil2 = (int) Math.ceil(fMax);
                Bitmap bitmap4 = this.G;
                if (bitmap4 == null || bitmap4.getWidth() != iCeil || this.G.getHeight() != iCeil2) {
                    Bitmap bitmap5 = this.G;
                    if (bitmap5 != null) {
                        bitmap5.recycle();
                    }
                    this.G = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas3 = new Canvas(this.G);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, intrinsicWidth, fMax);
                canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f23140i2);
                int iDp3 = AndroidUtilities.dp(5.0f);
                int intrinsicHeight = (int) ((fMax - drawable.getIntrinsicHeight()) / 2.0f);
                drawable.setBounds(iDp3, intrinsicHeight, drawable.getIntrinsicWidth() + iDp3, drawable.getIntrinsicHeight() + intrinsicHeight);
                drawable.draw(canvas3);
                canvas3.drawText(str4, AndroidUtilities.dp(18.0f), fDp6 + AndroidUtilities.dp(-0.7f), this.C);
                rect3.set(0, 0, iCeil, iCeil2);
                this.H = str4;
            }
            int width3 = this.G.getWidth();
            Rect rect4 = this.L;
            rect4.set((int) fDp4, (int) (fDp5 - (this.G.getHeight() * fLerp)), (int) ((width3 * fLerp) + fDp4), (int) fDp5);
            paint4.setAlpha((int) (f24 * 255.0f));
            canvas.drawBitmap(this.G, rect3, rect4, paint4);
        }
        if (z10) {
            canvas.restore();
        }
        return fE < 1.0f || z11;
    }

    public final Object clone() {
        bm bmVar = new bm(this.O);
        bmVar.f27142g.set(this.f27142g);
        bmVar.f27139c = this.f27139c;
        bmVar.f27138b = this.f27138b;
        return bmVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.f27142g == null || this.f27139c == null) {
            RectF rectF = this.f27158y;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF;
        }
        dm dmVar = this.O.f27505z;
        bm bmVar = dmVar.L.F;
        if (bmVar != null && bmVar.f27138b == this.f27138b) {
            f10 = dmVar.C;
        }
        float fLerp = (((1.0f - f10) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.f27144j, this.f27145k, e());
        RectF rectFF = f(e());
        float f11 = 1.0f - fLerp;
        float f12 = fLerp + 1.0f;
        rectFF.set(a9.p.d(rectFF.width(), f11, 2.0f, rectFF.left), ((rectFF.height() * f11) / 2.0f) + rectFF.top, a9.p.d(rectFF.width(), f12, 2.0f, rectFF.left), ((rectFF.height() * f12) / 2.0f) + rectFF.top);
        return rectFF;
    }

    public final float e() {
        return this.O.f27490j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.h) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.f27158y;
        RectF rectF3 = this.f27142g;
        if (rectF3 == null || this.f27139c == null) {
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF2;
        }
        cm cmVar = this.O;
        float fLerp = (rectF3.left * cmVar.f27498r) + cmVar.f27494n;
        float fLerp2 = (rectF3.top * cmVar.f27499s) + cmVar.f27496p;
        float fWidth = rectF3.width() * cmVar.f27498r;
        float fHeight = rectF3.height() * cmVar.f27499s;
        if (f10 < 1.0f && (rectF = this.f27141f) != null) {
            fLerp = AndroidUtilities.lerp((rectF.left * cmVar.f27498r) + cmVar.f27494n, fLerp, f10);
            fLerp2 = AndroidUtilities.lerp((this.f27141f.top * cmVar.f27499s) + cmVar.f27496p, fLerp2, f10);
            fWidth = AndroidUtilities.lerp(this.f27141f.width() * cmVar.f27498r, fWidth, f10);
            fHeight = AndroidUtilities.lerp(this.f27141f.height() * cmVar.f27499s, fHeight, f10);
        }
        int i10 = this.f27143i;
        if ((i10 & 4) == 0) {
            int i11 = cmVar.f27493m;
            fLerp2 += i11;
            fHeight -= i11;
        }
        if ((i10 & 8) == 0) {
            fHeight -= cmVar.f27493m;
        }
        if ((i10 & 1) == 0) {
            int i12 = cmVar.f27493m;
            fLerp += i12;
            fWidth -= i12;
        }
        if ((i10 & 2) == 0) {
            fWidth -= cmVar.f27493m;
        }
        rectF2.set(fLerp, fLerp2, fWidth + fLerp, fHeight + fLerp2);
        return rectF2;
    }
}
