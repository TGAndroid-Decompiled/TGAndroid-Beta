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
import org.telegram.messenger.fj;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wz;
public class o7 extends FrameLayout {
    public static long F0;
    public static boolean G0;
    public Path A0;
    public ValueAnimator B0;
    public float C0;
    public boolean D0;
    public boolean E;
    public final org.telegram.ui.Components.c6 E0;
    public boolean F;
    public StaticLayout G;
    public String H;
    public boolean I;
    public int J;
    public Bitmap K;
    public Paint L;
    public boolean M;
    public final org.telegram.ui.Components.c6 N;
    public final org.telegram.ui.Components.m6 O;
    public vy0 P;
    public CheckBoxBase Q;
    public final m.o3 R;
    public boolean S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public int f31175a;
    public boolean f31176a0;
    public final ImageReceiver f31177b;
    public boolean f31178b0;
    public final ImageReceiver f31179c;
    public GradientDrawable f31180c0;
    public final ImageReceiver d;
    public boolean f31181d0;
    public rn0 f31182e;
    public boolean f31183e0;
    public final int f31184f;
    public boolean f31185f0;
    public boolean f31186g0;
    public boolean h;
    public final Path f31187h0;
    public xh.f f31188i0;
    public float f31189j0;
    public float f31190k0;
    public float f31191l0;
    public float m0;
    public fj f31192n;
    public xh.e f31193n0;
    public final Path f31194o0;
    public vy0 f31195p0;
    public vy0 f31196q0;
    public int f31197r;
    public vy0 f31198r0;
    public wz f31199s;
    public int f31200s0;
    public final Paint f31201t0;
    public final Paint f31202u0;
    public final org.telegram.ui.Components.c6 f31203v0;
    public o7 f31204w;
    public tc f31205w0;
    public float f31206x;
    public boolean f31207x0;
    public float f31208y;
    public boolean f31209y0;
    public final RectF f31210z0;

    public o7(Context context, m.o3 o3Var, int i7) {
        super(context);
        this.f31175a = 0;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f31177b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.f31179c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.d = imageReceiver3;
        this.f31206x = 1.0f;
        this.f31208y = 1.0f;
        this.I = true;
        lr lrVar = lr.h;
        this.N = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.O = m6Var;
        this.f31187h0 = new Path();
        this.f31194o0 = new Path();
        this.f31200s0 = 0;
        this.f31201t0 = new Paint(1);
        this.f31202u0 = new Paint(1);
        this.f31203v0 = new org.telegram.ui.Components.c6(this, 0L, 200L, lrVar);
        this.f31210z0 = new RectF();
        this.E0 = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        this.R = o3Var;
        this.f31184f = i7;
        i(false, false);
        imageReceiver2.H0(this);
        imageReceiver.H0(this);
        imageReceiver3.H0(this);
        imageReceiver2.f22642h1 = new da(this, 6);
        m6Var.setCallback(this);
        m6Var.w(org.telegram.messenger.g0.L(12.0f));
        m6Var.u(-1);
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.N = org.telegram.messenger.g0.f24121q.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.T != 0.0f) {
            float f10 = this.U;
            if (f10 == 9.0f || this.f31197r == 9) {
                if (f10 == 9.0f) {
                    float N = org.telegram.messenger.g0.N(1.0f) * this.T;
                    return com.google.android.gms.internal.vision.e2.z(1.0f, this.T, org.telegram.messenger.g0.N(2.0f), N);
                }
                float N2 = org.telegram.messenger.g0.N(2.0f) * this.T;
                return com.google.android.gms.internal.vision.e2.z(1.0f, this.T, org.telegram.messenger.g0.N(1.0f), N2);
            }
        }
        if (this.f31197r == 9) {
            return org.telegram.messenger.g0.N(1.0f);
        }
        return org.telegram.messenger.g0.N(2.0f);
    }

    private void setPrivacyType(int i7) {
        int i10;
        if (this.J == i7) {
            return;
        }
        this.J = i7;
        this.K = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 100) {
                        i10 = 0;
                    } else {
                        i10 = 2131232298;
                    }
                } else {
                    i10 = 2131232162;
                }
            } else {
                i10 = 2131232164;
            }
        } else {
            i10 = 2131232388;
        }
        if (i10 != 0) {
            Context context = getContext();
            HashMap hashMap = (HashMap) this.R.f20166g;
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
            this.K = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f10, float f11, float f12) {
        canvas.save();
        if (this.A0 == null) {
            this.A0 = new Path();
        }
        this.A0.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, f10, f11);
        float L = org.telegram.messenger.g0.L(12.0f) * f12;
        this.A0.addRoundRect(rectF, L, L, Path.Direction.CW);
        this.A0.close();
        canvas.clipPath(this.A0);
        canvas.scale(f10 / getWidth(), f11 / getHeight());
        boolean J = this.f31177b.J();
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
        if (this.f31183e0) {
            ImageReceiver imageReceiver = this.f31179c;
            if ((imageReceiver == null || imageReceiver.R0) && this.h && this.P != null) {
                float L = org.telegram.messenger.g0.L(5.33f);
                vy0 vy0Var = this.P;
                vy0Var.f41493p = (int) (rectF.width() - (2.0f * L));
                vy0Var.f41497t = org.telegram.messenger.g0.L(14.0f);
                vy0Var.f41480a.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.66f), org.telegram.ui.ActionBar.n6.r1(0.4f * f10, -16777216));
                float f12 = rectF.left + L;
                float f13 = rectF.top;
                if (this.f31197r <= 2) {
                    f11 = 15.0f;
                } else {
                    f11 = 11.33f;
                }
                vy0Var.c(f12, f13 + org.telegram.messenger.g0.L(f11), 1.0f, org.telegram.ui.ActionBar.n6.r1(f10, -1), canvas);
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
        if (this.E) {
            ImageReceiver imageReceiver = this.f31179c;
            if (imageReceiver == null || imageReceiver.R0) {
                float L2 = (org.telegram.messenger.g0.L(20.0f) * this.C0) + rectF.width();
                float width = rectF.width() / L2;
                if (f11 < 1.0f) {
                    f11 = (float) Math.pow(f11, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i12 = this.f31197r;
                m.o3 o3Var = this.R;
                if (i12 != 9 && this.G == null && (str = this.H) != null) {
                    this.G = new StaticLayout(this.H, (TextPaint) o3Var.f20161a, (int) Math.ceil(((TextPaint) o3Var.f20161a).measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i12 >= 9 || this.H == null) && this.G != null) {
                    this.G = null;
                }
                boolean q10 = q(L2);
                int L3 = org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.G;
                int i13 = 0;
                if (staticLayout != null) {
                    i7 = staticLayout.getWidth();
                } else {
                    i7 = 0;
                }
                int i14 = L3 + i7;
                if (this.I) {
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
                int alpha = org.telegram.ui.ActionBar.n6.f29484i2.getAlpha();
                org.telegram.ui.ActionBar.n6.f29484i2.setAlpha((int) (alpha * f11));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.f29484i2);
                org.telegram.ui.ActionBar.n6.f29484i2.setAlpha(alpha);
                if (this.I) {
                    canvas.save();
                    if (this.G == null) {
                        L = org.telegram.messenger.g0.L(5.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(4.0f);
                    }
                    float f12 = L;
                    int L5 = org.telegram.messenger.g0.L(17.0f);
                    Drawable drawable = (Drawable) o3Var.f20163c;
                    canvas.translate(f12, (L5 - ((Drawable) o3Var.f20163c).getIntrinsicHeight()) / 2.0f);
                    drawable.setAlpha((int) (this.f31206x * 255.0f * f11));
                    drawable.draw(canvas);
                    canvas.restore();
                }
                if (this.G != null) {
                    if (this.I) {
                        i13 = 10;
                    }
                    canvas.translate(org.telegram.messenger.g0.L(i13 + 4), (org.telegram.messenger.g0.L(17.0f) - this.G.getHeight()) / 2.0f);
                    TextPaint textPaint = (TextPaint) o3Var.f20161a;
                    int alpha2 = ((TextPaint) o3Var.f20161a).getAlpha();
                    textPaint.setAlpha((int) (alpha2 * f11));
                    this.G.draw(canvas);
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
        if (this.f31183e0 && (bitmap = this.K) != null && !bitmap.isRecycled()) {
            int L = org.telegram.messenger.g0.L((rectF.width() / ((org.telegram.messenger.g0.L(20.0f) * this.C0) + rectF.width())) * 17.33f);
            canvas.save();
            float f11 = L;
            canvas.translate((rectF.right - f11) - org.telegram.messenger.g0.L(5.66f), rectF.top + org.telegram.messenger.g0.L(5.66f));
            if (this.L == null) {
                this.L = new Paint(3);
            }
            this.L.setAlpha((int) (f10 * 255.0f));
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, f11, f11);
            canvas.drawBitmap(this.K, (Rect) null, rectF2, this.L);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, RectF rectF, float f10) {
        float width;
        float width2;
        if (this.f31183e0) {
            ImageReceiver imageReceiver = this.f31179c;
            if ((imageReceiver == null || imageReceiver.R0) && this.f31197r < 5) {
                float L = (org.telegram.messenger.g0.L(20.0f) * this.C0) + rectF.width();
                float width3 = rectF.width() / L;
                boolean q10 = q(L);
                float d = this.N.d(this.M);
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
                    org.telegram.ui.Components.m6 m6Var = this.O;
                    float c10 = m6Var.c() + org.telegram.messenger.g0.L(26.0f);
                    if (q10) {
                        width2 = org.telegram.messenger.g0.L(5.0f);
                    } else {
                        width2 = (rectF.width() - org.telegram.messenger.g0.L(5.0f)) - c10;
                    }
                    canvas.translate(width2, ((rectF.height() + org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(17.0f)) - org.telegram.messenger.g0.L(4.0f));
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    rectF2.set(0.0f, 0.0f, c10, org.telegram.messenger.g0.L(17.0f));
                    int alpha = org.telegram.ui.ActionBar.n6.f29484i2.getAlpha();
                    org.telegram.ui.ActionBar.n6.f29484i2.setAlpha((int) (alpha * f11));
                    canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.f29484i2);
                    org.telegram.ui.ActionBar.n6.f29484i2.setAlpha(alpha);
                    canvas.save();
                    int L2 = org.telegram.messenger.g0.L(17.0f);
                    m.o3 o3Var = this.R;
                    canvas.translate(org.telegram.messenger.g0.L(3.0f), (L2 - ((Drawable) o3Var.d).getBounds().height()) / 2.0f);
                    ((Drawable) o3Var.d).setAlpha((int) (this.f31206x * 255.0f * f11));
                    ((Drawable) o3Var.d).draw(canvas);
                    canvas.restore();
                    canvas.translate(org.telegram.messenger.g0.L(22.0f), 0.0f);
                    m6Var.setBounds(0, 0, (int) c10, org.telegram.messenger.g0.L(17.0f));
                    m6Var.C = (int) (f11 * 255.0f);
                    m6Var.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(fj fjVar) {
        TL_stories.StoryItem storyItem;
        if (this.f31186g0) {
            return 100;
        }
        if (!this.f31183e0 || fjVar == null || (storyItem = fjVar.f23973l) == null) {
            return -1;
        }
        if (storyItem.parsedPrivacy == null) {
            storyItem.parsedPrivacy = new hi.o8(this.f31184f, storyItem.privacy);
        }
        int i7 = storyItem.parsedPrivacy.f15195a;
        if (i7 != 2 && i7 != 1 && i7 != 3) {
            return -1;
        }
        return i7;
    }

    public View getCrossfadeView() {
        return this.f31204w;
    }

    public int getMessageId() {
        fj fjVar = this.f31192n;
        if (fjVar != null) {
            return fjVar.e1();
        }
        return 0;
    }

    public fj getMessageObject() {
        return this.f31192n;
    }

    public int getStyle() {
        return this.f31200s0;
    }

    public final void i(boolean z10, boolean z11) {
        boolean z12;
        int i7;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null && checkBoxBase.f32838q) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 == z10) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, this, null);
            this.Q = checkBoxBase2;
            checkBoxBase2.h(-1, org.telegram.ui.ActionBar.n6.Ci, org.telegram.ui.ActionBar.n6.f29526k7);
            if (this.f31207x0 && (i7 = this.f31175a) != 0) {
                CheckBoxBase checkBoxBase3 = this.Q;
                int w10 = org.telegram.ui.ActionBar.n6.w(i7, org.telegram.ui.ActionBar.n6.r1(0.25f, -1));
                if (checkBoxBase3.f32844x != w10) {
                    checkBoxBase3.f32844x = w10;
                    checkBoxBase3.b();
                }
            }
            this.Q.k(false);
            this.Q.d(1);
            this.Q.e(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            if (this.S) {
                this.Q.f32833l = true;
            }
        }
        this.Q.f(-1, z10, z11);
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            this.B0 = null;
            valueAnimator.cancel();
        }
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.C0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.B0 = ofFloat;
            ofFloat.addUpdateListener(new fi.d4(this, 7));
            this.B0.setDuration(200L);
            this.B0.addListener(new bi.e7(25, this, z10));
            this.B0.start();
        } else {
            if (z10) {
                f10 = 1.0f;
            }
            this.C0 = f10;
        }
        invalidate();
    }

    public final void j(boolean z10, float f10) {
        if (this.f31208y != f10) {
            this.f31208y = f10;
            if (z10) {
                invalidate();
            }
        }
    }

    public final void k(org.telegram.messenger.fj r29, int r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o7.k(org.telegram.messenger.fj, int, boolean):void");
    }

    public final void l(boolean z10, boolean z11) {
        if (this.D0 == z10) {
            return;
        }
        this.D0 = z10;
        if (!z11) {
            this.E0.a(z10);
        }
        invalidate();
    }

    public final void m(String str, boolean z10) {
        this.H = str;
        this.E = true;
        this.F = false;
        StaticLayout staticLayout = this.G;
        if (staticLayout != null && !staticLayout.getText().toString().equals(str)) {
            this.G = null;
        }
        this.I = z10;
    }

    public final void n(float f10, float f11) {
        this.f31190k0 = f10;
        this.f31191l0 = f11;
        this.m0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c8.l9.a(this.m0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(lr.f37211j);
        duration.addUpdateListener(new r(this, 5));
        duration.addListener(new ki.n3(this, 29));
        duration.start();
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o7.o():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null) {
            checkBoxBase.f32833l = true;
        }
        if (this.f31192n != null) {
            this.f31179c.P();
            this.f31177b.P();
            this.d.P();
        }
        xh.e eVar = this.f31193n0;
        if (eVar != null) {
            if (eVar.f60541i) {
                this.f31193n0 = xh.e.e(this);
            } else {
                eVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S = false;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null) {
            checkBoxBase.f32833l = false;
        }
        if (this.f31192n != null) {
            this.f31179c.R();
            this.f31177b.R();
            this.d.R();
        }
        xh.e eVar = this.f31193n0;
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
            if (this.f31192n != null) {
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
        boolean z10 = this.f31183e0;
        if (z10) {
            i11 = (int) (size * 1.25f);
        } else {
            i11 = size;
        }
        if (z10 && this.f31197r == 1) {
            i11 /= 2;
        }
        setMeasuredDimension(size, i11);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tc tcVar = this.f31205w0;
        if (tcVar != null && tcVar.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            fj fjVar = this.f31192n;
            if (fjVar != null && fjVar.t2()) {
                if (this.f31193n0 == null) {
                    this.f31193n0 = xh.e.e(this);
                    return;
                }
                return;
            }
            xh.e eVar = this.f31193n0;
            if (eVar != null) {
                eVar.b(this);
                this.f31193n0 = null;
            }
        }
    }

    public final boolean q(float f10) {
        int i7;
        int i10;
        int i11;
        int i12;
        if (this.f31183e0 && this.f31197r < 5) {
            int L = org.telegram.messenger.g0.L(26.0f) + ((int) this.O.c());
            if (this.E) {
                int L2 = org.telegram.messenger.g0.L(8.0f);
                StaticLayout staticLayout = this.G;
                if (staticLayout != null) {
                    i11 = staticLayout.getWidth();
                } else {
                    i11 = 0;
                }
                int i13 = L2 + i11;
                if (this.I) {
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

    public void setGradientView(wz wzVar) {
        this.f31199s = wzVar;
    }

    public void setHighlightProgress(float f10) {
        if (this.V != f10) {
            this.V = f10;
            invalidate();
        }
    }

    public void setReorder(boolean z10) {
        this.f31209y0 = z10;
        invalidate();
    }

    public void setStyle(int i7) {
        if (this.f31200s0 != i7) {
            this.f31200s0 = i7;
            if (i7 == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, this, null);
                this.Q = checkBoxBase;
                checkBoxBase.h(-1, org.telegram.ui.ActionBar.n6.Ci, org.telegram.ui.ActionBar.n6.f29526k7);
                this.Q.k(true);
                this.Q.d(0);
                this.Q.e(0, 0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                if (this.S) {
                    this.Q.f32833l = true;
                }
                tc tcVar = new tc(this);
                this.f31205w0 = tcVar;
                tcVar.h = new f(this, 8);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.O != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void h() {
    }
}
