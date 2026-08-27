package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.t80;

public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final bm0 E;
    public n0 F;
    public ga G;

    public final s1 f24747a;

    public int f24748b;

    public long f24749c;
    public MessageObject d;

    public long f24750e;

    public StaticLayout f24752g;
    public float h;

    public float f24753i;

    public int f24754j;

    public float f24759o;

    public float f24760p;

    public t80 f24763s;

    public final org.telegram.ui.Components.y5 f24765u;
    public pz0 v;

    public final nc f24768y;

    public final TextPaint f24751f = new TextPaint(1);

    public final Paint f24755k = new Paint(1);

    public final Path f24756l = new Path();

    public final float f24757m = -1.0f;

    public int f24758n = AndroidUtilities.dp(66.0f);

    public final ArrayList f24761q = new ArrayList();

    public final Path f24762r = new Path();

    public final RectF f24766w = new RectF();

    public final RectF f24767x = new RectF();

    public final Paint f24769z = new Paint(1);

    public boolean f24764t = true;

    public o0(s1 s1Var) {
        this.f24747a = s1Var;
        this.E = new bm0(s1Var.getContext(), null);
        this.f24768y = new nc(s1Var);
        this.f24765u = new org.telegram.ui.Components.y5(s1Var, 350L, er.h);
    }

    public final boolean a(MotionEvent motionEvent) {
        s1 s1Var;
        ArrayList arrayList;
        n0 n0Var;
        VelocityTracker velocityTracker;
        boolean z10;
        if (this.d != null && (s1Var = this.f24747a) != null) {
            int action = motionEvent.getAction();
            RectF rectF = this.f24766w;
            float fDp = (rectF.left + AndroidUtilities.dp(7.0f)) - this.f24759o;
            int i10 = 0;
            while (true) {
                arrayList = this.f24761q;
                if (i10 >= arrayList.size()) {
                    n0Var = null;
                    break;
                }
                n0Var = (n0) arrayList.get(i10);
                if (motionEvent.getX() >= fDp && motionEvent.getX() <= this.f24758n + fDp && motionEvent.getY() >= rectF.bottom - AndroidUtilities.dp(99.0f) && motionEvent.getY() < rectF.bottom) {
                    break;
                }
                fDp += AndroidUtilities.dp(9.0f) + this.f24758n;
                i10++;
            }
            boolean zContains = this.f24767x.contains(motionEvent.getX(), motionEvent.getY());
            nc ncVar = this.f24768y;
            if (action == 0) {
                this.E.a();
                if (this.f24764t) {
                    z10 = false;
                } else {
                    float x8 = motionEvent.getX();
                    this.C = x8;
                    if (rectF.contains(x8, motionEvent.getY())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                this.A = z10;
                if (z10 && s1Var.getParent() != null) {
                    s1Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.B = false;
                VelocityTracker velocityTracker2 = this.D;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.D = null;
                }
                this.D = VelocityTracker.obtain();
                if (n0Var != null) {
                    n0Var.f24713n.c(true);
                }
                if (zContains) {
                    ncVar.c(true);
                }
                ga gaVar = this.G;
                if (gaVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar);
                    this.G = null;
                }
                this.F = n0Var;
                if (n0Var != null) {
                    ga gaVar2 = new ga(1, this, n0Var);
                    this.G = gaVar2;
                    AndroidUtilities.runOnUIThread(gaVar2, ViewConfiguration.getLongPressTimeout());
                }
                return this.A;
            }
            if (action == 2) {
                VelocityTracker velocityTracker3 = this.D;
                if (velocityTracker3 != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
                if ((this.A && Math.abs(motionEvent.getX() - this.C) >= AndroidUtilities.touchSlop) || this.B) {
                    ga gaVar3 = this.G;
                    if (gaVar3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(gaVar3);
                        this.G = null;
                    }
                    this.B = true;
                    this.f24759o = Utilities.clamp(this.f24759o + (this.C - motionEvent.getX()), this.f24760p - (rectF.width() - AndroidUtilities.dp(14.0f)), 0.0f);
                    s1Var.Z2();
                    this.C = motionEvent.getX();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ((n0) arrayList.get(i11)).f24713n.c(false);
                    }
                    return true;
                }
            } else if (action == 1 || action == 3) {
                ga gaVar4 = this.G;
                if (gaVar4 != null) {
                    AndroidUtilities.cancelRunOnUIThread(gaVar4);
                    this.G = null;
                }
                VelocityTracker velocityTracker4 = this.D;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                boolean z11 = this.B;
                this.B = false;
                if (action == 1) {
                    if (z11 || n0Var == null || !n0Var.f24713n.h) {
                        if (z11 && (velocityTracker = this.D) != null) {
                            velocityTracker.computeCurrentVelocity(500);
                            this.E.c((int) this.f24759o, 0, (int) (-this.D.getXVelocity()), 0, -2147483647, Integer.MAX_VALUE, 0, 0);
                        } else if (ncVar.h && s1Var.getDelegate() != null) {
                            s1Var.getDelegate().D(s1Var);
                        }
                    } else if (!n0Var.f24707g) {
                        TLObject tLObject = n0Var.f24714o;
                        if (s1Var.getDelegate() != null) {
                            s1Var.getDelegate().E0(s1Var, tLObject, false);
                        }
                    } else if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().m2();
                    }
                }
                ncVar.c(false);
                this.A = false;
                VelocityTracker velocityTracker5 = this.D;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.D = null;
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((n0) arrayList.get(i12)).f24713n.c(false);
                }
                return z11;
            }
        }
        return false;
    }

    public final void b() {
        bm0 bm0Var = this.E;
        if (bm0Var.b()) {
            float f10 = bm0Var.f27171j;
            this.f24759o = f10;
            this.f24759o = Utilities.clamp(f10, this.f24760p - (this.f24766w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f24747a.Z2();
        }
    }

    public final void c(Canvas canvas) {
        s1 s1Var;
        float fDp;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Canvas canvas2;
        RectF rectF;
        float f15;
        if (this.d == null || (s1Var = this.f24747a) == null) {
            return;
        }
        r1 r1Var = s1Var.Vc;
        b();
        if (this.f24752g != null) {
            canvas.save();
            float width = (s1Var.getWidth() - this.f24752g.getWidth()) / 2.0f;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((this.h + width) - AndroidUtilities.dp(8.66f), AndroidUtilities.dp(4.0f), this.f24753i + width + AndroidUtilities.dp(8.66f), AndroidUtilities.dp(10.66f) + this.f24754j);
            s1Var.i2(canvas, rectF2, AndroidUtilities.dp(11.0f));
            canvas.translate(width, AndroidUtilities.dp(7.33f));
            this.f24752g.draw(canvas);
            canvas.restore();
            fDp = AndroidUtilities.dp(10.66f) + this.f24754j + 0.0f;
        } else {
            fDp = 0.0f;
        }
        if (r1Var.L2) {
            f10 = d() ? r1Var.K1 : 1.0f - r1Var.K1;
        } else {
            f10 = d() ? 1.0f : 0.0f;
        }
        float fClamp = Utilities.clamp((f10 - 0.3f) / 0.7f, 1.0f, 0.0f);
        if (fClamp > 0.0f) {
            int width2 = s1Var.getWidth() - AndroidUtilities.dp(18.0f);
            int iDp = (int) (width2 > AndroidUtilities.dp(441.0f) ? AndroidUtilities.dp(66.0f) : Math.max((width2 / 4.5f) - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(66.0f)));
            this.f24758n = iDp;
            ArrayList arrayList = this.f24761q;
            this.f24760p = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * iDp);
            int iMin = (int) Math.min(width2, this.f24758n * 6.5f);
            float width3 = (s1Var.getWidth() - iMin) / 2.0f;
            float fDp2 = AndroidUtilities.dp(10.0f) + fDp;
            float width4 = (s1Var.getWidth() + iMin) / 2.0f;
            float fDp3 = fDp + AndroidUtilities.dp(138.0f);
            RectF rectF3 = this.f24766w;
            rectF3.set(width3, fDp2, width4, fDp3);
            this.f24759o = Utilities.clamp(this.f24759o, this.f24760p - (rectF3.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            float fAbs = Math.abs(fClamp - this.f24757m);
            Path path = this.f24756l;
            if (fAbs < 0.001f) {
                f11 = 6.0f;
                f12 = 8.0f;
                f13 = 9.0f;
                f14 = 2.0f;
            } else {
                float fDp4 = AndroidUtilities.dp(16.66f) * 2.0f;
                f11 = 6.0f;
                float f16 = rectF3.bottom;
                path.rewind();
                f12 = 8.0f;
                RectF rectF4 = AndroidUtilities.rectTmp;
                f13 = 9.0f;
                float f17 = rectF3.left;
                f14 = 2.0f;
                float f18 = rectF3.top;
                rectF4.set(f17, f18, f17 + fDp4, f18 + fDp4);
                path.arcTo(rectF4, -90.0f, -90.0f);
                float f19 = rectF3.left;
                float f20 = f16 - fDp4;
                rectF4.set(f19, f20, f19 + fDp4, f16);
                path.arcTo(rectF4, -180.0f, -90.0f);
                float f21 = rectF3.right;
                rectF4.set(f21 - fDp4, f20, f21, f16);
                path.arcTo(rectF4, -270.0f, -90.0f);
                float f22 = rectF3.right;
                float f23 = rectF3.top;
                rectF4.set(f22 - fDp4, f23, f22, fDp4 + f23);
                path.arcTo(rectF4, 0.0f, -90.0f);
                path.lineTo(rectF3.centerX() + AndroidUtilities.dp(8.0f), rectF3.top);
                path.lineTo(rectF3.centerX(), rectF3.top - AndroidUtilities.dp(6.0f));
                path.lineTo(rectF3.centerX() - AndroidUtilities.dp(8.0f), rectF3.top);
                path.close();
            }
            canvas.save();
            float f24 = (fClamp * 0.6f) + 0.4f;
            canvas.scale(f24, f24, rectF3.centerX(), rectF3.top - AndroidUtilities.dp(f11));
            Paint paint = this.f24755k;
            paint.setAlpha((int) (fClamp * 255.0f));
            paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), i0.b.k(-16777216, (int) (27.0f * fClamp)));
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            pz0 pz0Var = this.v;
            if (pz0Var != null) {
                pz0Var.c(rectF3.left + AndroidUtilities.dp(17.0f), rectF3.top + AndroidUtilities.dp(20.0f), fClamp, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, s1Var.Ed), canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            float fE = this.f24765u.e(this.f24764t);
            float fDp5 = (rectF3.left + AndroidUtilities.dp(7.0f)) - this.f24759o;
            float fDp6 = AndroidUtilities.dp(f13) + this.f24758n;
            int iFloor = (int) Math.floor(((rectF3.left - iMin) - fDp5) / fDp6);
            int iCeil = (int) Math.ceil((rectF3.right - fDp5) / fDp6);
            if (fE < 1.0f) {
                int iMax = Math.max(0, iFloor);
                while (iMax < Math.min(iCeil + 1, arrayList.size())) {
                    n0 n0Var = (n0) arrayList.get(iMax);
                    canvas2.save();
                    canvas2.translate((iMax * fDp6) + fDp5, rectF3.bottom - AndroidUtilities.dp(99.0f));
                    int i10 = this.f24758n;
                    float f25 = (1.0f - fE) * fClamp;
                    org.telegram.ui.Components.y8[] y8VarArr = n0Var.f24703b;
                    float f26 = fE;
                    pz0 pz0Var2 = n0Var.f24710k;
                    float f27 = fDp5;
                    Paint paint2 = n0Var.f24709j;
                    canvas2.save();
                    float f28 = fClamp;
                    float f29 = fDp6;
                    float fA = n0Var.f24713n.a(0.075f);
                    float f30 = i10;
                    float f31 = f30 / f14;
                    canvas2.scale(fA, fA, f31, AndroidUtilities.dp(99.0f) / f14);
                    Paint paint3 = n0Var.f24708i;
                    paint3.setStrokeWidth(AndroidUtilities.dp(2.66f));
                    s1 s1Var2 = n0Var.f24702a;
                    paint3.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23305ra, s1Var2.Ed));
                    ImageReceiver[] imageReceiverArr = n0Var.f24704c;
                    int length = imageReceiverArr.length - 1;
                    while (length >= 0) {
                        int i11 = length;
                        float length2 = (f31 - (((imageReceiverArr.length - 1) * AndroidUtilities.dp(7.0f)) / f14)) + (AndroidUtilities.dp(7.0f) * i11);
                        int i12 = iMax;
                        float fDp7 = (AndroidUtilities.dp(54.0f) / f14) + AndroidUtilities.dp(10.0f);
                        ArrayList arrayList2 = arrayList;
                        RectF rectF5 = rectF3;
                        if (imageReceiverArr.length > 1) {
                            canvas2.drawCircle(length2, fDp7, AndroidUtilities.dp(54.0f) / f14, paint3);
                        }
                        ImageReceiver[] imageReceiverArr2 = imageReceiverArr;
                        imageReceiverArr[i11].setImageCoords(length2 - (AndroidUtilities.dp(54.0f) / f14), fDp7 - (AndroidUtilities.dp(54.0f) / f14), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f));
                        imageReceiverArr2[i11].setAlpha(f25);
                        imageReceiverArr2[i11].draw(canvas2);
                        length = i11 - 1;
                        iMax = i12;
                        arrayList = arrayList2;
                        rectF3 = rectF5;
                        imageReceiverArr = imageReceiverArr2;
                    }
                    ImageReceiver[] imageReceiverArr3 = imageReceiverArr;
                    int i13 = iMax;
                    RectF rectF6 = rectF3;
                    ArrayList arrayList3 = arrayList;
                    if (pz0Var2 != null) {
                        pz0Var2.f31708p = i10 - AndroidUtilities.dp(32.0f);
                        float fL = pz0Var2.l() + AndroidUtilities.dp(n0Var.h != null ? 17.0f : 8.0f);
                        float fDp8 = AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(10.0f);
                        AndroidUtilities.rectTmp.set((f30 - fL) / f14, fDp8 - AndroidUtilities.dp(14.33f), (f30 + fL) / f14, fDp8);
                        boolean z10 = n0Var.f24712m;
                        if (z10 || !n0Var.f24707g) {
                            if (!z10 && (imageReceiverArr3[0].getStaticThumb() instanceof BitmapDrawable)) {
                                Bitmap bitmap = ((BitmapDrawable) imageReceiverArr3[0].getStaticThumb()).getBitmap();
                                try {
                                    int pixel = bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() - 2);
                                    float[] fArr = new float[3];
                                    i0.b.b(fArr, Color.red(pixel), Color.green(pixel), Color.blue(pixel));
                                    float f32 = fArr[1];
                                    if (f32 <= 0.05f || f32 >= 0.95f) {
                                        fArr[1] = 0.0f;
                                        if (org.telegram.ui.ActionBar.g6.I.q()) {
                                            f15 = 0.38f;
                                        } else {
                                            f15 = 0.7f;
                                        }
                                        fArr[2] = f15;
                                    } else {
                                        float f33 = fArr[2];
                                        if (f33 <= 0.02f || f33 >= 0.98f) {
                                            fArr[1] = 0.0f;
                                            if (org.telegram.ui.ActionBar.g6.I.q()) {
                                                f15 = 0.38f;
                                            } else {
                                                f15 = 0.7f;
                                            }
                                            fArr[2] = f15;
                                        } else {
                                            fArr[1] = 0.25f;
                                            fArr[2] = org.telegram.ui.ActionBar.g6.I.q() ? 0.35f : 0.65f;
                                        }
                                    }
                                    paint2.setColor(i0.b.a(fArr));
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                                n0Var.f24712m = true;
                            } else if (!n0Var.f24712m && !n0Var.f24711l) {
                                try {
                                    int iD = i0.b.d(0.5f, y8VarArr[0].b(), y8VarArr[0].c());
                                    float[] fArr2 = new float[3];
                                    i0.b.b(fArr2, Color.red(iD), Color.green(iD), Color.blue(iD));
                                    float f34 = fArr2[1];
                                    if (f34 <= 0.05f || f34 >= 0.95f) {
                                        fArr2[2] = Utilities.clamp(fArr2[2] - 0.1f, 0.6f, 0.3f);
                                    } else {
                                        fArr2[1] = Utilities.clamp(f34 - 0.06f, 0.4f, 0.0f);
                                        fArr2[2] = Utilities.clamp(fArr2[2] - 0.08f, 0.5f, 0.2f);
                                    }
                                    try {
                                        paint2.setColor(i0.b.a(fArr2));
                                    } catch (Exception e10) {
                                        e = e10;
                                        FileLog.e(e);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                }
                                n0Var.f24711l = true;
                            }
                            RectF rectF7 = AndroidUtilities.rectTmp;
                            canvas2.drawRoundRect(rectF7, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), paint2);
                            rectF7.inset((-AndroidUtilities.dp(1.0f)) / f14, (-AndroidUtilities.dp(1.0f)) / f14);
                            paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
                            canvas2.drawRoundRect(rectF7, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), paint3);
                        } else {
                            paint2.setColor(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23305ra, s1Var2.Ed), org.telegram.ui.ActionBar.g6.l1(0.85f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, s1Var2.Ed))));
                            n0Var.f24712m = true;
                        }
                        RectF rectF8 = AndroidUtilities.rectTmp;
                        canvas2.drawRoundRect(rectF8, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), paint2);
                        rectF8.inset((-AndroidUtilities.dp(1.0f)) / f14, (-AndroidUtilities.dp(1.0f)) / f14);
                        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
                        canvas2.drawRoundRect(rectF8, AndroidUtilities.dp(f12), AndroidUtilities.dp(f12), paint3);
                    }
                    canvas2.restore();
                    n0Var.b(canvas2, this.f24758n, f25);
                    canvas2.restore();
                    iMax = i13 + 1;
                    fE = f26;
                    fDp5 = f27;
                    fClamp = f28;
                    fDp6 = f29;
                    arrayList = arrayList3;
                    rectF3 = rectF6;
                }
            }
            float f35 = fE;
            float f36 = fDp5;
            float f37 = fDp6;
            RectF rectF9 = rectF3;
            if (f35 > 0.0f) {
                Path path2 = this.f24762r;
                path2.rewind();
                int iMax2 = Math.max(0, iFloor);
                while (iMax2 < iCeil) {
                    float f38 = (iMax2 * f37) + f36;
                    float f39 = this.f24758n;
                    float fDp9 = (AndroidUtilities.dp(54.0f) / f14) + AndroidUtilities.dp(10.0f);
                    float fDp10 = AndroidUtilities.dp(54.0f) / f14;
                    Path.Direction direction = Path.Direction.CW;
                    path2.addCircle((f39 / f14) + f38, fDp9, fDp10, direction);
                    float f40 = f39 * 0.4f;
                    RectF rectF10 = AndroidUtilities.rectTmp;
                    rectF10.set(com.google.android.recaptcha.internal.a.A(f39, f40, 2.0f, f38), AndroidUtilities.dp(69.0f), i0.a.c(f39, f40, 2.0f, f38), AndroidUtilities.dp(79.0f));
                    path2.addRoundRect(rectF10, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), direction);
                    float f41 = f39 * 0.35f;
                    rectF10.set(com.google.android.recaptcha.internal.a.A(f39, f41, 2.0f, f38), AndroidUtilities.dp(83.0f), i0.a.c(f39, f41, 2.0f, f38), AndroidUtilities.dp(91.0f));
                    path2.addRoundRect(rectF10, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), direction);
                    iMax2++;
                    f14 = 2.0f;
                }
                if (this.f24763s == null) {
                    t80 t80Var = new t80();
                    this.f24763s = t80Var;
                    t80Var.f32711x = path2;
                    t80Var.C = false;
                }
                int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, s1Var.Ed);
                this.f24763s.f(org.telegram.ui.ActionBar.g6.l1(0.05f, iV0), org.telegram.ui.ActionBar.g6.l1(0.15f, iV0), org.telegram.ui.ActionBar.g6.l1(0.1f, iV0), org.telegram.ui.ActionBar.g6.l1(0.3f, iV0));
                t80 t80Var2 = this.f24763s;
                t80Var2.f32708t = 1.5f;
                t80Var2.setAlpha((int) (f35 * 255.0f));
                canvas2.save();
                rectF = rectF9;
                canvas2.translate(0.0f, rectF.bottom - AndroidUtilities.dp(99.0f));
                this.f24763s.draw(canvas2);
                canvas2.restore();
            } else {
                rectF = rectF9;
            }
            float fA2 = this.f24768y.a(0.02f);
            float fDp11 = rectF.right - AndroidUtilities.dp(20.0f);
            float fDp12 = rectF.top + AndroidUtilities.dp(20.0f);
            canvas2.save();
            canvas2.scale(fA2, fA2, fDp11, fDp12);
            float fDp13 = AndroidUtilities.dp(1.33f);
            Paint paint4 = this.f24769z;
            paint4.setStrokeWidth(fDp13);
            canvas2.drawLine(fDp11 - AndroidUtilities.dp(4.0f), fDp12 - AndroidUtilities.dp(4.0f), fDp11 + AndroidUtilities.dp(4.0f), fDp12 + AndroidUtilities.dp(4.0f), paint4);
            canvas.drawLine(fDp11 - AndroidUtilities.dp(4.0f), fDp12 + AndroidUtilities.dp(4.0f), fDp11 + AndroidUtilities.dp(4.0f), fDp12 - AndroidUtilities.dp(4.0f), paint4);
            this.f24767x.set(fDp11 - AndroidUtilities.dp(12.0f), fDp12 - AndroidUtilities.dp(12.0f), fDp11 + AndroidUtilities.dp(12.0f), fDp12 + AndroidUtilities.dp(12.0f));
            canvas.restore();
            canvas.restore();
        }
    }

    public final boolean d() {
        return this.d.channelJoinedExpanded && this.f24761q.size() > 0;
    }

    public final void e(MessageObject messageObject) {
        ArrayList arrayList;
        int i10;
        int i11;
        this.f24748b = messageObject.currentAccount;
        this.d = messageObject;
        this.f24749c = messageObject.getDialogId();
        MessagesController.getInstance(this.f24748b).getChat(Long.valueOf(-this.f24749c));
        this.f24750e = -this.f24749c;
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = this.f24751f;
        textPaint.setTypeface(typefaceBold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i12 = org.telegram.ui.ActionBar.g6.f23150ic;
        s1 s1Var = this.f24747a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i12, s1Var.Ed));
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.f24752g = staticLayout;
        this.h = staticLayout.getWidth();
        this.f24753i = 0.0f;
        for (int i13 = 0; i13 < this.f24752g.getLineCount(); i13++) {
            this.h = Math.min(this.h, this.f24752g.getLineLeft(i13));
            this.f24753i = Math.max(this.f24753i, this.f24752g.getLineRight(i13));
        }
        this.f24754j = this.f24752g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f24769z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, s1Var.Ed));
        s1Var.f25454o0 = AndroidUtilities.dp(14.66f) + this.f24754j;
        int i14 = 0;
        while (true) {
            arrayList = this.f24761q;
            if (i14 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i14);
            int i15 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f24704c;
                if (i15 < imageReceiverArr.length) {
                    imageReceiverArr[i15].onDetachedFromWindow();
                    i15++;
                }
            }
            i14++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f24748b).getChannelRecommendations(this.f24749c);
        ArrayList arrayList2 = (channelRecommendations == null || channelRecommendations.chats == null) ? new ArrayList() : new ArrayList(channelRecommendations.chats);
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            TLObject tLObject = (TLObject) arrayList2.get(i16);
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                arrayList2.remove(i16);
                i16--;
            }
            i16++;
        }
        boolean z10 = arrayList2.isEmpty() || (!UserConfig.getInstance(this.f24748b).isPremium() && arrayList2.size() == 1);
        this.f24764t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f24748b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f24748b).recommendedChannelsLimitDefault);
            }
            int iMin = Math.min(size, 10);
            for (int i17 = 0; i17 < iMin; i17++) {
                arrayList.add(new n0(this.f24748b, s1Var, (TLObject) arrayList2.get(i17)));
            }
            if (iMin < arrayList2.size()) {
                TLObject tLObject2 = null;
                TLObject tLObject3 = (iMin < 0 || iMin >= arrayList2.size()) ? null : (TLObject) arrayList2.get(iMin);
                TLObject tLObject4 = (iMin < 0 || (i11 = iMin + 1) >= arrayList2.size()) ? null : (TLObject) arrayList2.get(i11);
                if (iMin >= 0 && (i10 = iMin + 2) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i10);
                }
                arrayList.add(new n0(this.f24748b, s1Var, new TLObject[]{tLObject3, tLObject4, tLObject2}, (arrayList2.size() + channelRecommendations.more) - iMin));
            }
        }
        if (this.v == null) {
            pz0 pz0Var = new pz0(LocaleController.getString(this.f24749c > 0 ? R.string.SimilarBots : R.string.SimilarChannels), 14.0f, AndroidUtilities.bold());
            pz0Var.f31707o = true;
            this.v = pz0Var;
        }
        if (d()) {
            s1Var.f25454o0 = AndroidUtilities.dp(144.0f) + s1Var.f25454o0;
            this.f24755k.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23305ra, s1Var.Ed));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f24758n);
        this.f24760p = size2;
        this.f24759o = Utilities.clamp(this.f24759o, size2, 0.0f);
    }
}
