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
import org.telegram.messenger.jj;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.zz;
public class s7 extends FrameLayout {
    public static long E0;
    public static boolean F0;
    public ValueAnimator A0;
    public float B0;
    public boolean C0;
    public boolean D;
    public final org.telegram.ui.Components.t5 D0;
    public boolean E;
    public StaticLayout F;
    public String G;
    public boolean H;
    public int I;
    public Bitmap J;
    public Paint K;
    public boolean L;
    public final org.telegram.ui.Components.t5 M;
    public final org.telegram.ui.Components.e6 N;
    public qz0 O;
    public CheckBoxBase P;
    public final m.p3 Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public int f23017a;
    public boolean f23018a0;
    public final ImageReceiver f23019b;
    public GradientDrawable f23020b0;
    public final ImageReceiver f23021c;
    public boolean f23022c0;
    public final ImageReceiver d;
    public boolean f23023d0;
    public fo0 e;
    public boolean f23024e0;
    public final int f23025f;
    public boolean f23026f0;
    public final Path f23027g0;
    public boolean h;
    public nh.i f23028h0;
    public float f23029i0;
    public float f23030j0;
    public float f23031k0;
    public float f23032l0;
    public nh.h m0;
    public jj f23033n;
    public final Path f23034n0;
    public qz0 f23035o0;
    public qz0 f23036p0;
    public qz0 f23037q0;
    public int f23038r;
    public int f23039r0;
    public zz f23040s;
    public final Paint f23041s0;
    public final Paint f23042t0;
    public final org.telegram.ui.Components.t5 f23043u0;
    public jc f23044v0;
    public s7 f23045w;
    public boolean f23046w0;
    public float f23047x;
    public boolean f23048x0;
    public float f23049y;
    public final RectF f23050y0;
    public Path f23051z0;

    public s7(Context context, m.p3 p3Var, int i10) {
        super(context);
        this.f23017a = 0;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f23019b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.f23021c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.d = imageReceiver3;
        this.f23047x = 1.0f;
        this.f23049y = 1.0f;
        this.H = true;
        gr grVar = gr.h;
        this.M = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.N = e6Var;
        this.f23027g0 = new Path();
        this.f23034n0 = new Path();
        this.f23039r0 = 0;
        this.f23041s0 = new Paint(1);
        this.f23042t0 = new Paint(1);
        this.f23043u0 = new org.telegram.ui.Components.t5(this, 0L, 200L, grVar);
        this.f23050y0 = new RectF();
        this.D0 = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.Q = p3Var;
        this.f23025f = i10;
        i(false, false);
        imageReceiver2.H0(this);
        imageReceiver.H0(this);
        imageReceiver3.H0(this);
        imageReceiver2.f14382g1 = new ca(this, 6);
        e6Var.setCallback(this);
        e6Var.w(org.telegram.messenger.i0.L(12.0f));
        e6Var.u(-1);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.M = org.telegram.messenger.i0.f16026q.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.S != 0.0f) {
            float f7 = this.T;
            if (f7 == 9.0f || this.f23038r == 9) {
                if (f7 == 9.0f) {
                    float N = org.telegram.messenger.i0.N(1.0f) * this.S;
                    return c3.i0.z(1.0f, this.S, org.telegram.messenger.i0.N(2.0f), N);
                }
                float N2 = org.telegram.messenger.i0.N(2.0f) * this.S;
                return c3.i0.z(1.0f, this.S, org.telegram.messenger.i0.N(1.0f), N2);
            }
        }
        if (this.f23038r == 9) {
            return org.telegram.messenger.i0.N(1.0f);
        }
        return org.telegram.messenger.i0.N(2.0f);
    }

    private void setPrivacyType(int i10) {
        int i11;
        if (this.I == i10) {
            return;
        }
        this.I = i10;
        this.J = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 100) {
                        i11 = 0;
                    } else {
                        i11 = 2131232295;
                    }
                } else {
                    i11 = 2131232159;
                }
            } else {
                i11 = 2131232161;
            }
        } else {
            i11 = 2131232385;
        }
        if (i11 != 0) {
            Context context = getContext();
            HashMap hashMap = (HashMap) this.Q.h;
            Bitmap bitmap = (Bitmap) hashMap.get(Integer.valueOf(i11));
            if (bitmap == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i11);
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
                canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                Utilities.stackBlurBitmap(createBitmap, org.telegram.messenger.i0.L(1.0f));
                Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), config);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
                canvas2.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                createBitmap.recycle();
                decodeResource.recycle();
                hashMap.put(Integer.valueOf(i11), createBitmap2);
                bitmap = createBitmap2;
            }
            this.J = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f7, float f10, float f11) {
        canvas.save();
        if (this.f23051z0 == null) {
            this.f23051z0 = new Path();
        }
        this.f23051z0.rewind();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, f7, f10);
        float L = org.telegram.messenger.i0.L(12.0f) * f11;
        this.f23051z0.addRoundRect(rectF, L, L, Path.Direction.CW);
        this.f23051z0.close();
        canvas.clipPath(this.f23051z0);
        canvas.scale(f7 / getWidth(), f10 / getHeight());
        boolean J = this.f23019b.J();
        if (!J || f11 < 1.0f) {
            float f12 = 1.0f - f11;
            d(f12, 1.0f, f12, canvas, false);
        }
        if (J && f11 > 0.0f) {
            d(1.0f - f11, f11, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f7) {
        float f10;
        if (this.f23023d0) {
            ImageReceiver imageReceiver = this.f23021c;
            if ((imageReceiver == null || imageReceiver.Q0) && this.h && this.O != null) {
                float L = org.telegram.messenger.i0.L(5.33f);
                qz0 qz0Var = this.O;
                qz0Var.f29784p = (int) (rectF.width() - (2.0f * L));
                qz0Var.f29788t = org.telegram.messenger.i0.L(14.0f);
                qz0Var.f29772a.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(0.66f), org.telegram.ui.ActionBar.t6.r1(0.4f * f7, -16777216));
                float f11 = rectF.left + L;
                float f12 = rectF.top;
                if (this.f23038r <= 2) {
                    f10 = 15.0f;
                } else {
                    f10 = 11.33f;
                }
                qz0Var.c(f11, f12 + org.telegram.messenger.i0.L(f10), 1.0f, org.telegram.ui.ActionBar.t6.r1(f7, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f7) {
        int i10;
        int i11;
        int i12;
        int L;
        String str;
        float f10 = f7;
        if (this.D) {
            ImageReceiver imageReceiver = this.f23021c;
            if (imageReceiver == null || imageReceiver.Q0) {
                float L2 = (org.telegram.messenger.i0.L(20.0f) * this.B0) + rectF.width();
                float width = rectF.width() / L2;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i13 = this.f23038r;
                m.p3 p3Var = this.Q;
                if (i13 != 9 && this.F == null && (str = this.G) != null) {
                    this.F = new StaticLayout(this.G, (TextPaint) p3Var.f12518a, (int) Math.ceil(((TextPaint) p3Var.f12518a).measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i13 >= 9 || this.G == null) && this.F != null) {
                    this.F = null;
                }
                boolean q6 = q(L2);
                int L3 = org.telegram.messenger.i0.L(8.0f);
                StaticLayout staticLayout = this.F;
                int i14 = 0;
                if (staticLayout != null) {
                    i10 = staticLayout.getWidth();
                } else {
                    i10 = 0;
                }
                int i15 = L3 + i10;
                if (this.H) {
                    i11 = org.telegram.messenger.i0.L(10.0f);
                } else {
                    i11 = 0;
                }
                int i16 = i15 + i11;
                float L4 = org.telegram.messenger.i0.L(5.0f);
                float height = ((rectF.height() + org.telegram.messenger.i0.L(1.0f)) - org.telegram.messenger.i0.L(17.0f)) - org.telegram.messenger.i0.L(4.0f);
                if (q6) {
                    i12 = org.telegram.messenger.i0.L(22.0f);
                } else {
                    i12 = 0;
                }
                canvas.translate(L4, height - i12);
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(0.0f, 0.0f, i16, org.telegram.messenger.i0.L(17.0f));
                int alpha = org.telegram.ui.ActionBar.t6.f21016i2.getAlpha();
                org.telegram.ui.ActionBar.t6.f21016i2.setAlpha((int) (alpha * f10));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.f21016i2);
                org.telegram.ui.ActionBar.t6.f21016i2.setAlpha(alpha);
                if (this.H) {
                    canvas.save();
                    if (this.F == null) {
                        L = org.telegram.messenger.i0.L(5.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(4.0f);
                    }
                    float f11 = L;
                    int L5 = org.telegram.messenger.i0.L(17.0f);
                    Drawable drawable = (Drawable) p3Var.f12520c;
                    canvas.translate(f11, (L5 - ((Drawable) p3Var.f12520c).getIntrinsicHeight()) / 2.0f);
                    drawable.setAlpha((int) (this.f23047x * 255.0f * f10));
                    drawable.draw(canvas);
                    canvas.restore();
                }
                if (this.F != null) {
                    if (this.H) {
                        i14 = 10;
                    }
                    canvas.translate(org.telegram.messenger.i0.L(i14 + 4), (org.telegram.messenger.i0.L(17.0f) - this.F.getHeight()) / 2.0f);
                    TextPaint textPaint = (TextPaint) p3Var.f12518a;
                    int alpha2 = ((TextPaint) p3Var.f12518a).getAlpha();
                    textPaint.setAlpha((int) (alpha2 * f10));
                    this.F.draw(canvas);
                    textPaint.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public final void d(float r31, float r32, float r33, android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s7.d(float, float, float, android.graphics.Canvas, boolean):void");
    }

    public final void e(Canvas canvas, RectF rectF, float f7) {
        Bitmap bitmap;
        if (this.f23023d0 && (bitmap = this.J) != null && !bitmap.isRecycled()) {
            int L = org.telegram.messenger.i0.L((rectF.width() / ((org.telegram.messenger.i0.L(20.0f) * this.B0) + rectF.width())) * 17.33f);
            canvas.save();
            float f10 = L;
            canvas.translate((rectF.right - f10) - org.telegram.messenger.i0.L(5.66f), rectF.top + org.telegram.messenger.i0.L(5.66f));
            if (this.K == null) {
                this.K = new Paint(3);
            }
            this.K.setAlpha((int) (f7 * 255.0f));
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(0.0f, 0.0f, f10, f10);
            canvas.drawBitmap(this.J, (Rect) null, rectF2, this.K);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, RectF rectF, float f7) {
        float width;
        float width2;
        if (this.f23023d0) {
            ImageReceiver imageReceiver = this.f23021c;
            if ((imageReceiver == null || imageReceiver.Q0) && this.f23038r < 5) {
                float L = (org.telegram.messenger.i0.L(20.0f) * this.B0) + rectF.width();
                float width3 = rectF.width() / L;
                boolean q6 = q(L);
                float d = this.M.d(this.L);
                float f10 = f7 * d;
                if (f10 < 1.0f) {
                    f10 = (float) Math.pow(f10, 8.0d);
                }
                if (d > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    if (q6) {
                        width = 0.0f;
                    } else {
                        width = rectF.width();
                    }
                    canvas.scale(width3, width3, width, rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    org.telegram.ui.Components.e6 e6Var = this.N;
                    float c10 = e6Var.c() + org.telegram.messenger.i0.L(26.0f);
                    if (q6) {
                        width2 = org.telegram.messenger.i0.L(5.0f);
                    } else {
                        width2 = (rectF.width() - org.telegram.messenger.i0.L(5.0f)) - c10;
                    }
                    canvas.translate(width2, ((rectF.height() + org.telegram.messenger.i0.L(1.0f)) - org.telegram.messenger.i0.L(17.0f)) - org.telegram.messenger.i0.L(4.0f));
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    rectF2.set(0.0f, 0.0f, c10, org.telegram.messenger.i0.L(17.0f));
                    int alpha = org.telegram.ui.ActionBar.t6.f21016i2.getAlpha();
                    org.telegram.ui.ActionBar.t6.f21016i2.setAlpha((int) (alpha * f10));
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.f21016i2);
                    org.telegram.ui.ActionBar.t6.f21016i2.setAlpha(alpha);
                    canvas.save();
                    int L2 = org.telegram.messenger.i0.L(17.0f);
                    m.p3 p3Var = this.Q;
                    canvas.translate(org.telegram.messenger.i0.L(3.0f), (L2 - ((Drawable) p3Var.d).getBounds().height()) / 2.0f);
                    ((Drawable) p3Var.d).setAlpha((int) (this.f23047x * 255.0f * f10));
                    ((Drawable) p3Var.d).draw(canvas);
                    canvas.restore();
                    canvas.translate(org.telegram.messenger.i0.L(22.0f), 0.0f);
                    e6Var.setBounds(0, 0, (int) c10, org.telegram.messenger.i0.L(17.0f));
                    e6Var.B = (int) (f10 * 255.0f);
                    e6Var.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(jj jjVar) {
        TL_stories.StoryItem storyItem;
        if (this.f23026f0) {
            return 100;
        }
        if (!this.f23023d0 || jjVar == null || (storyItem = jjVar.f16341l) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new vh.u6(this.f23025f, storyItem.privacy);
        }
        int i10 = storyItem.parsedPrivacy.f52017a;
        if (i10 != 2 && i10 != 1 && i10 != 3) {
            return -1;
        }
        return i10;
    }

    public View getCrossfadeView() {
        return this.f23045w;
    }

    public int getMessageId() {
        jj jjVar = this.f23033n;
        if (jjVar != null) {
            return jjVar.f1();
        }
        return 0;
    }

    public jj getMessageObject() {
        return this.f23033n;
    }

    public int getStyle() {
        return this.f23039r0;
    }

    public final void i(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null && checkBoxBase.f23919q) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 == z10) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.P = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.t6.zi, org.telegram.ui.ActionBar.t6.f21059k7);
            if (this.f23046w0 && (i10 = this.f23017a) != 0) {
                CheckBoxBase checkBoxBase3 = this.P;
                int w9 = org.telegram.ui.ActionBar.t6.w(i10, org.telegram.ui.ActionBar.t6.r1(0.25f, -1));
                if (checkBoxBase3.f23925x != w9) {
                    checkBoxBase3.f23925x = w9;
                    checkBoxBase3.b();
                }
            }
            this.P.k(false);
            this.P.d(1);
            this.P.e(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
            if (this.R) {
                this.P.f23914l = true;
            }
        }
        this.P.f(-1, z10, z11);
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            this.A0 = null;
            valueAnimator.cancel();
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.B0;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.A0 = ofFloat;
            ofFloat.addUpdateListener(new bg.o(this, 5));
            this.A0.setDuration(200L);
            this.A0.addListener(new eg.m(10, this, z10));
            this.A0.start();
        } else {
            if (z10) {
                f7 = 1.0f;
            }
            this.B0 = f7;
        }
        invalidate();
    }

    public final void j(boolean z10, float f7) {
        if (this.f23049y != f7) {
            this.f23049y = f7;
            if (z10) {
                invalidate();
            }
        }
    }

    public final void k(org.telegram.messenger.jj r29, int r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s7.k(org.telegram.messenger.jj, int, boolean):void");
    }

    public final void l(boolean z10, boolean z11) {
        if (this.C0 == z10) {
            return;
        }
        this.C0 = z10;
        if (!z11) {
            this.D0.a(z10);
        }
        invalidate();
    }

    public final void m(String str, boolean z10) {
        this.G = str;
        this.D = true;
        this.E = false;
        StaticLayout staticLayout = this.F;
        if (staticLayout != null && !staticLayout.getText().toString().equals(str)) {
            this.F = null;
        }
        this.H = z10;
    }

    public final void n(float f7, float f10) {
        this.f23030j0 = f7;
        this.f23031k0 = f10;
        this.f23032l0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(w7.u.a(this.f23032l0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(gr.f26498j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new org.telegram.ui.s9(this, 9));
        duration.start();
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s7.o():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.f23914l = true;
        }
        if (this.f23033n != null) {
            this.f23021c.P();
            this.f23019b.P();
            this.d.P();
        }
        nh.h hVar = this.m0;
        if (hVar != null) {
            if (hVar.f13834i) {
                this.m0 = nh.h.e(this);
            } else {
                hVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R = false;
        CheckBoxBase checkBoxBase = this.P;
        if (checkBoxBase != null) {
            checkBoxBase.f23914l = false;
        }
        if (this.f23033n != null) {
            this.f23021c.R();
            this.f23019b.R();
            this.d.R();
        }
        nh.h hVar = this.m0;
        if (hVar != null) {
            hVar.b(this);
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
            if (this.f23033n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.f23023d0;
        if (z10) {
            i12 = (int) (size * 1.25f);
        } else {
            i12 = size;
        }
        if (z10 && this.f23038r == 1) {
            i12 /= 2;
        }
        setMeasuredDimension(size, i12);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jc jcVar = this.f23044v0;
        if (jcVar != null && jcVar.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            jj jjVar = this.f23033n;
            if (jjVar != null && jjVar.t2()) {
                if (this.m0 == null) {
                    this.m0 = nh.h.e(this);
                    return;
                }
                return;
            }
            nh.h hVar = this.m0;
            if (hVar != null) {
                hVar.b(this);
                this.m0 = null;
            }
        }
    }

    public final boolean q(float f7) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f23023d0 && this.f23038r < 5) {
            int L = org.telegram.messenger.i0.L(26.0f) + ((int) this.N.c());
            if (this.D) {
                int L2 = org.telegram.messenger.i0.L(8.0f);
                StaticLayout staticLayout = this.F;
                if (staticLayout != null) {
                    i12 = staticLayout.getWidth();
                } else {
                    i12 = 0;
                }
                int i14 = L2 + i12;
                if (this.H) {
                    i13 = org.telegram.messenger.i0.L(10.0f);
                } else {
                    i13 = 0;
                }
                i10 = i14 + i13;
            } else {
                i10 = 0;
            }
            if (L > 0 && i10 > 0) {
                i11 = org.telegram.messenger.i0.L(8.0f);
            } else {
                i11 = 0;
            }
            if (L + i11 + i10 > f7) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(zz zzVar) {
        this.f23040s = zzVar;
    }

    public void setHighlightProgress(float f7) {
        if (this.U != f7) {
            this.U = f7;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.f23048x0 = z10;
        invalidate();
    }

    public void setStyle(int i10) {
        if (this.f23039r0 != i10) {
            this.f23039r0 = i10;
            if (i10 == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
                this.P = checkBoxBase;
                checkBoxBase.h(-1, org.telegram.ui.ActionBar.t6.zi, org.telegram.ui.ActionBar.t6.f21059k7);
                this.P.k(true);
                this.P.d(0);
                this.P.e(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
                if (this.R) {
                    this.P.f23914l = true;
                }
                jc jcVar = new jc(this);
                this.f23044v0 = jcVar;
                jcVar.h = new f(this, 6);
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
