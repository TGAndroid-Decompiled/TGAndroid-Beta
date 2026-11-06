package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xq;
public class o7 extends FrameLayout {
    public static long E0;
    public static boolean F0;
    public ValueAnimator A0;
    public float B0;
    public boolean C0;
    public boolean D;
    public final org.telegram.ui.Components.w5 D0;
    public boolean E;
    public StaticLayout F;
    public String G;
    public boolean H;
    public int I;
    public Bitmap J;
    public Paint K;
    public boolean L;
    public final org.telegram.ui.Components.w5 M;
    public final org.telegram.ui.Components.i6 N;
    public my0 O;
    public CheckBoxBase P;
    public final m.q3 Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public int f29657a;
    public boolean f29658a0;
    public final ImageReceiver f29659b;
    public GradientDrawable f29660b0;
    public final ImageReceiver f29661c;
    public boolean f29662c0;
    public final ImageReceiver d;
    public boolean f29663d0;
    public en0 f29664e;
    public boolean f29665e0;
    public final int f29666f;
    public boolean f29667f0;
    public final Path f29668g0;
    public boolean h;
    public xh.f f29669h0;
    public float f29670i0;
    public float f29671j0;
    public float f29672k0;
    public float f29673l0;
    public xh.e m0;
    public ij f29674n;
    public final Path f29675n0;
    public my0 f29676o0;
    public my0 f29677p0;
    public my0 f29678q0;
    public int f29679r;
    public int f29680r0;
    public lz f29681s;
    public final Paint f29682s0;
    public final Paint f29683t0;
    public final org.telegram.ui.Components.w5 f29684u0;
    public pc f29685v0;
    public o7 f29686w;
    public boolean f29687w0;
    public float f29688x;
    public boolean f29689x0;
    public float f29690y;
    public final RectF f29691y0;
    public Path f29692z0;

    public o7(Context context, m.q3 q3Var, int i7) {
        super(context);
        this.f29657a = 0;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f29659b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.f29661c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.d = imageReceiver3;
        this.f29688x = 1.0f;
        this.f29690y = 1.0f;
        this.H = true;
        xq xqVar = xq.h;
        this.M = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.N = i6Var;
        this.f29668g0 = new Path();
        this.f29675n0 = new Path();
        this.f29680r0 = 0;
        this.f29682s0 = new Paint(1);
        this.f29683t0 = new Paint(1);
        this.f29684u0 = new org.telegram.ui.Components.w5(this, 0L, 200L, xqVar);
        this.f29691y0 = new RectF();
        this.D0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.Q = q3Var;
        this.f29666f = i7;
        i(false, false);
        imageReceiver2.H0(this);
        imageReceiver.H0(this);
        imageReceiver3.H0(this);
        imageReceiver2.f21192g1 = new ca(this, 6);
        i6Var.setCallback(this);
        i6Var.w(org.telegram.messenger.g0.L(12.0f));
        i6Var.u(-1);
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.M = org.telegram.messenger.g0.f22544q.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.S != 0.0f) {
            float f10 = this.T;
            if (f10 == 9.0f || this.f29679r == 9) {
                if (f10 == 9.0f) {
                    float N = org.telegram.messenger.g0.N(1.0f) * this.S;
                    return com.google.android.recaptcha.internal.a.z(1.0f, this.S, org.telegram.messenger.g0.N(2.0f), N);
                }
                float N2 = org.telegram.messenger.g0.N(2.0f) * this.S;
                return com.google.android.recaptcha.internal.a.z(1.0f, this.S, org.telegram.messenger.g0.N(1.0f), N2);
            }
        }
        if (this.f29679r == 9) {
            return org.telegram.messenger.g0.N(1.0f);
        }
        return org.telegram.messenger.g0.N(2.0f);
    }

    private void setPrivacyType(int i7) {
        int i10;
        if (this.I == i7) {
            return;
        }
        this.I = i7;
        this.J = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 100) {
                        i10 = 0;
                    } else {
                        i10 = 2131232296;
                    }
                } else {
                    i10 = 2131232160;
                }
            } else {
                i10 = 2131232162;
            }
        } else {
            i10 = 2131232386;
        }
        if (i10 != 0) {
            Context context = getContext();
            HashMap hashMap = (HashMap) this.Q.f19230g;
            Bitmap bitmap = (Bitmap) hashMap.get(Integer.valueOf(i10));
            if (bitmap == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i10);
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
                canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                Utilities.stackBlurBitmap(createBitmap, org.telegram.messenger.g0.L(1.0f));
                Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), config);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
                canvas2.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                createBitmap.recycle();
                decodeResource.recycle();
                hashMap.put(Integer.valueOf(i10), createBitmap2);
                bitmap = createBitmap2;
            }
            this.J = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        canvas.save();
        if (this.f29692z0 == null) {
            this.f29692z0 = new Path();
        }
        this.f29692z0.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, f10, f11);
        float L = org.telegram.messenger.g0.L(12.0f) * f12;
        this.f29692z0.addRoundRect(rectF, L, L, Path.Direction.CW);
        this.f29692z0.close();
        canvas.clipPath(this.f29692z0);
        canvas.scale(f10 / getWidth(), f11 / getHeight());
        boolean J = this.f29659b.J();
        if (!J || f12 < 1.0f) {
            float f13 = 1.0f - f12;
            d(f13, 1.0f, f13, canvas, false);
        }
        if (J && f12 > 0.0f) {
            d(1.0f - f12, f12, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f10) {
        float f11;
        if (this.f29663d0) {
            ImageReceiver imageReceiver = this.f29661c;
            if ((imageReceiver == null || imageReceiver.Q0) && this.h && this.O != null) {
                float L = org.telegram.messenger.g0.L(5.33f);
                my0 my0Var = this.O;
                my0Var.f36136p = (int) (rectF.width() - (2.0f * L));
                my0Var.f36140t = org.telegram.messenger.g0.L(14.0f);
                my0Var.f36123a.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.k6.r1(0.4f * f10, -16777216));
                float f12 = rectF.left + L;
                float f13 = rectF.top;
                if (this.f29679r <= 2) {
                    f11 = 15.0f;
                } else {
                    f11 = 11.33f;
                }
                my0Var.c(f12, f13 + org.telegram.messenger.g0.L(f11), 1.0f, org.telegram.ui.ActionBar.k6.r1(f10, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f10) {
        int i7;
        int i10;
        int i11;
        int L;
        String str;
        float f11 = f10;
        if (this.D) {
            ImageReceiver imageReceiver = this.f29661c;
            if (imageReceiver == null || imageReceiver.Q0) {
                float L2 = (org.telegram.messenger.g0.L(20.0f) * this.B0) + rectF.width();
                float width = rectF.width() / L2;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i12 = this.f29679r;
                m.q3 q3Var = this.Q;
                if (i12 != 9 && this.F == null && (str = this.G) != null) {
                    this.F = new StaticLayout(this.G, (TextPaint) q3Var.f19225a, (int) Math.ceil(((TextPaint) q3Var.f19225a).measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i12 >= 9 || this.G == null) && this.F != null) {
                    this.F = null;
                }
                boolean q10 = q(L2);
                int L3 = org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.F;
                int i13 = 0;
                if (staticLayout != null) {
                    i7 = staticLayout.getWidth();
                } else {
                    i7 = 0;
                }
                int i14 = L3 + i7;
                if (this.H) {
                    i10 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i10 = 0;
                }
                int i15 = i14 + i10;
                float L4 = org.telegram.messenger.g0.L(5.0f);
                float height = ((rectF.height() + org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(17.0f)) - org.telegram.messenger.g0.L(4.0f);
                if (q10) {
                    i11 = org.telegram.messenger.g0.L(22.0f);
                } else {
                    i11 = 0;
                }
                canvas.translate(L4, height - i11);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(0.0f, 0.0f, i15, org.telegram.messenger.g0.L(17.0f));
                int alpha = org.telegram.ui.ActionBar.k6.f27937i2.getAlpha();
                org.telegram.ui.ActionBar.k6.f27937i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.f27937i2);
                org.telegram.ui.ActionBar.k6.f27937i2.setAlpha(alpha);
                if (this.H) {
                    canvas.save();
                    if (this.F == null) {
                        L = org.telegram.messenger.g0.L(5.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    float f12 = L;
                    int L5 = org.telegram.messenger.g0.L(17.0f);
                    Drawable drawable = (Drawable) q3Var.f19227c;
                    canvas.translate(f12, (L5 - ((Drawable) q3Var.f19227c).getIntrinsicHeight()) / 2.0f);
                    drawable.setAlpha((int) (this.f29688x * 255.0f * f11));
                    drawable.draw(canvas);
                    canvas.restore();
                }
                if (this.F != null) {
                    if (this.H) {
                        i13 = 10;
                    }
                    canvas.translate(org.telegram.messenger.g0.L(i13 + 4), (org.telegram.messenger.g0.L(17.0f) - this.F.getHeight()) / 2.0f);
                    TextPaint textPaint = (TextPaint) q3Var.f19225a;
                    int alpha2 = ((TextPaint) q3Var.f19225a).getAlpha();
                    textPaint.setAlpha((int) (alpha2 * f11));
                    this.F.draw(canvas);
                    textPaint.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public final void d(float r31, float r32, float r33, android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o7.d(float, float, float, android.graphics.Canvas, boolean):void");
    }

    public final void e(Canvas canvas, RectF rectF, float f10) {
        Bitmap bitmap;
        if (this.f29663d0 && (bitmap = this.J) != null && !bitmap.isRecycled()) {
            int L = org.telegram.messenger.g0.L((rectF.width() / ((org.telegram.messenger.g0.L(20.0f) * this.B0) + rectF.width())) * 17.33f);
            canvas.save();
            float f11 = L;
            canvas.translate((rectF.right - f11) - org.telegram.messenger.g0.L(5.66f), rectF.top + org.telegram.messenger.g0.L(5.66f));
            if (this.K == null) {
                this.K = new Paint(3);
            }
            this.K.setAlpha((int) (f10 * 255.0f));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, f11, f11);
            canvas.drawBitmap(this.J, (Rect) null, rectF2, this.K);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, RectF rectF, float f10) {
        float width;
        float width2;
        if (this.f29663d0) {
            ImageReceiver imageReceiver = this.f29661c;
            if ((imageReceiver == null || imageReceiver.Q0) && this.f29679r < 5) {
                float L = (org.telegram.messenger.g0.L(20.0f) * this.B0) + rectF.width();
                float width3 = rectF.width() / L;
                boolean q10 = q(L);
                float d = this.M.d(this.L);
                float f11 = f10 * d;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                if (d > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    if (q10) {
                        width = 0.0f;
                    } else {
                        width = rectF.width();
                    }
                    canvas.scale(width3, width3, width, rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    org.telegram.ui.Components.i6 i6Var = this.N;
                    float c10 = i6Var.c() + org.telegram.messenger.g0.L(26.0f);
                    if (q10) {
                        width2 = org.telegram.messenger.g0.L(5.0f);
                    } else {
                        width2 = (rectF.width() - org.telegram.messenger.g0.L(5.0f)) - c10;
                    }
                    canvas.translate(width2, ((rectF.height() + org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(17.0f)) - org.telegram.messenger.g0.L(4.0f));
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(0.0f, 0.0f, c10, org.telegram.messenger.g0.L(17.0f));
                    int alpha = org.telegram.ui.ActionBar.k6.f27937i2.getAlpha();
                    org.telegram.ui.ActionBar.k6.f27937i2.setAlpha((int) (alpha * f11));
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.f27937i2);
                    org.telegram.ui.ActionBar.k6.f27937i2.setAlpha(alpha);
                    canvas.save();
                    int L2 = org.telegram.messenger.g0.L(17.0f);
                    m.q3 q3Var = this.Q;
                    canvas.translate(org.telegram.messenger.g0.L(3.0f), (L2 - ((Drawable) q3Var.d).getBounds().height()) / 2.0f);
                    ((Drawable) q3Var.d).setAlpha((int) (this.f29688x * 255.0f * f11));
                    ((Drawable) q3Var.d).draw(canvas);
                    canvas.restore();
                    canvas.translate(org.telegram.messenger.g0.L(22.0f), 0.0f);
                    i6Var.setBounds(0, 0, (int) c10, org.telegram.messenger.g0.L(17.0f));
                    i6Var.B = (int) (f11 * 255.0f);
                    i6Var.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(ij ijVar) {
        TL_stories.StoryItem storyItem;
        if (this.f29667f0) {
            return 100;
        }
        if (!this.f29663d0 || ijVar == null || (storyItem = ijVar.f23248l) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new fi.q8(this.f29666f, storyItem.privacy);
        }
        int i7 = storyItem.parsedPrivacy.f12678a;
        if (i7 != 2 && i7 != 1 && i7 != 3) {
            return -1;
        }
        return i7;
    }

    public View getCrossfadeView() {
        return this.f29686w;
    }

    public int getMessageId() {
        ij ijVar = this.f29674n;
        if (ijVar != null) {
            return ijVar.f1();
        }
        return 0;
    }

    public ij getMessageObject() {
        return this.f29674n;
    }

    public int getStyle() {
        return this.f29680r0;
    }

    public final void i(boolean z9, boolean z10) {
        boolean z11;
        int i7;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null && checkBoxBase.f31259q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 == z9) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.P = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.k6.zi, org.telegram.ui.ActionBar.k6.f27979k7);
            if (this.f29687w0 && (i7 = this.f29657a) != 0) {
                CheckBoxBase checkBoxBase3 = this.P;
                int w10 = org.telegram.ui.ActionBar.k6.w(i7, org.telegram.ui.ActionBar.k6.r1(0.25f, -1));
                if (checkBoxBase3.f31265x != w10) {
                    checkBoxBase3.f31265x = w10;
                    checkBoxBase3.b();
                }
            }
            this.P.k(false);
            this.P.d(1);
            this.P.e(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            if (this.R) {
                this.P.f31254l = true;
            }
        }
        this.P.f(-1, z9, z10);
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            this.A0 = null;
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.B0;
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.A0 = ofFloat;
            ofFloat.addUpdateListener(new di.m4(this, 7));
            this.A0.setDuration(200L);
            this.A0.addListener(new ch.y(24, this, z9));
            this.A0.start();
        } else {
            if (z9) {
                f10 = 1.0f;
            }
            this.B0 = f10;
        }
        invalidate();
    }

    public final void j(boolean z9, float f10) {
        if (this.f29690y != f10) {
            this.f29690y = f10;
            if (z9) {
                invalidate();
            }
        }
    }

    public final void k(org.telegram.messenger.ij r29, int r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o7.k(org.telegram.messenger.ij, int, boolean):void");
    }

    public final void l(boolean z9, boolean z10) {
        if (this.C0 == z9) {
            return;
        }
        this.C0 = z9;
        if (!z10) {
            this.D0.a(z9);
        }
        invalidate();
    }

    public final void m(String str, boolean z9) {
        this.G = str;
        this.D = true;
        this.E = false;
        StaticLayout staticLayout = this.F;
        if (staticLayout != null && !staticLayout.getText().toString().equals(str)) {
            this.F = null;
        }
        this.H = z9;
    }

    public final void n(float f10, float f11) {
        this.f29671j0 = f10;
        this.f29672k0 = f11;
        this.f29673l0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c8.j9.a(this.f29673l0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(xq.f40348j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new m.a(this, 28));
        duration.start();
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o7.o():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.f31254l = true;
        }
        if (this.f29674n != null) {
            this.f29661c.P();
            this.f29659b.P();
            this.d.P();
        }
        xh.e eVar = this.m0;
        if (eVar != null) {
            if (eVar.f58689i) {
                this.m0 = xh.e.e(this);
            } else {
                eVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R = false;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.f31254l = false;
        }
        if (this.f29674n != null) {
            this.f29661c.R();
            this.f29659b.R();
            this.d.R();
        }
        xh.e eVar = this.m0;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(1.0f, 1.0f, 1.0f, canvas, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        try {
            if (this.f29674n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        boolean z9 = this.f29663d0;
        if (z9) {
            i11 = (int) (size * 1.25f);
        } else {
            i11 = size;
        }
        if (z9 && this.f29679r == 1) {
            i11 /= 2;
        }
        setMeasuredDimension(size, i11);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pc pcVar = this.f29685v0;
        if (pcVar != null && pcVar.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            ij ijVar = this.f29674n;
            if (ijVar != null && ijVar.u2()) {
                if (this.m0 == null) {
                    this.m0 = xh.e.e(this);
                    return;
                }
                return;
            }
            xh.e eVar = this.m0;
            if (eVar != null) {
                eVar.b(this);
                this.m0 = null;
            }
        }
    }

    public final boolean q(float f10) {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.f29663d0 && this.f29679r < 5) {
            int L = org.telegram.messenger.g0.L(26.0f) + ((int) this.N.c());
            if (this.D) {
                int L2 = org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.F;
                if (staticLayout != null) {
                    i11 = staticLayout.getWidth();
                } else {
                    i11 = 0;
                }
                int i13 = L2 + i11;
                if (this.H) {
                    i12 = org.telegram.messenger.g0.L(10.0f);
                } else {
                    i12 = 0;
                }
                i7 = i13 + i12;
            } else {
                i7 = 0;
            }
            if (L > 0 && i7 > 0) {
                i10 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i10 = 0;
            }
            if (L + i10 + i7 > f10) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(lz lzVar) {
        this.f29681s = lzVar;
    }

    public void setHighlightProgress(float f10) {
        if (this.U != f10) {
            this.U = f10;
            invalidate();
        }
    }

    public void setReorder(boolean z9) {
        this.f29689x0 = z9;
        invalidate();
    }

    public void setStyle(int i7) {
        if (this.f29680r0 != i7) {
            this.f29680r0 = i7;
            if (i7 == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
                this.P = checkBoxBase;
                checkBoxBase.h(-1, org.telegram.ui.ActionBar.k6.zi, org.telegram.ui.ActionBar.k6.f27979k7);
                this.P.k(true);
                this.P.d(0);
                this.P.e(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                if (this.R) {
                    this.P.f31254l = true;
                }
                pc pcVar = new pc(this);
                this.f29685v0 = pcVar;
                pcVar.h = new f(this, 7);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.N != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void h() {
    }
}
