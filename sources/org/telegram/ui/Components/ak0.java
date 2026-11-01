package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.HashSet;
public final class ak0 extends View implements org.telegram.ui.ActionBar.k6 {
    public float D;
    public boolean E;
    public float F;
    public float G;
    public final TextPaint H;
    public String I;
    public final Path J;
    public final Path K;
    public final float[] L;
    public float M;
    public float N;
    public float O;
    public long P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public boolean U;
    public float V;
    public final int[] W;
    public boolean f24411a;
    public boolean f24412a0;
    public final RectF f24413b;
    public final float f24414b0;
    public final Paint f24415c;
    public final Drawable f24416c0;
    public final Paint d;
    public final Drawable f24417d0;
    public float e;
    public vg.f f24418e0;
    public float f24419f;
    public vg.f f24420f0;
    public final boolean f24421g0;
    public float h;
    public int f24422h0;
    public final ew f24423i0;
    public int f24424j0;
    public float f24425k0;
    public boolean f24426l0;
    public long m0;
    public boolean f24427n;
    public float f24428n0;
    public float f24429o0;
    public final uk0 f24430p0;
    public StaticLayout f24431r;
    public StaticLayout f24432s;
    public StaticLayout f24433w;
    public StaticLayout f24434x;
    public StaticLayout f24435y;

    public ak0(uk0 uk0Var, Context context, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.p6 p6Var = uk0Var.f31008n2;
        this.f24430p0 = uk0Var;
        this.f24411a = true;
        this.f24413b = new RectF();
        this.f24415c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.D = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        this.J = new Path();
        this.K = new Path();
        this.L = new float[8];
        this.W = new int[2];
        this.f24423i0 = new ew(this, 9);
        this.f24429o0 = 1.0f;
        this.R = i10;
        if (i10 == 0) {
            textPaint.setTextSize(org.telegram.messenger.i0.L(45.0f));
            this.f24421g0 = org.telegram.messenger.dd.X;
        } else {
            this.f24421g0 = false;
            textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            int i12 = org.telegram.ui.ActionBar.t6.f20930d6;
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            Drawable mutate = context.getDrawable(2131230910).mutate();
            this.f24417d0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.1f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i13 = 0; i13 < 8; i13++) {
            this.L[i13] = org.telegram.messenger.i0.L(44.0f);
        }
        if (this.f24421g0) {
            f7 = 10.0f;
        } else {
            if (i10 == 0) {
                i11 = 132;
            } else {
                i11 = 240;
            }
            f7 = i11 - 15;
        }
        int L = org.telegram.messenger.i0.L(f7);
        this.Q = L;
        if (uk0Var.b1()) {
            if (this.f24421g0) {
                f10 = -4.0f;
            } else {
                f10 = 6.0f;
            }
            this.Q = org.telegram.messenger.i0.L(f10) + L;
        }
        d();
        setFocusableInTouchMode(true);
        this.f24414b0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f24416c0 = context.getDrawable(2131231068);
    }

    public final void a(tg.b bVar, wg.d dVar) {
        uk0 uk0Var = this.f24430p0;
        vg.f c10 = bVar.c(uk0Var.f30988d1, dVar, false);
        this.f24418e0 = c10;
        c10.p(org.telegram.messenger.i0.L(4.0f));
        this.f24418e0.q(org.telegram.messenger.i0.L(24.0f));
        vg.f c11 = bVar.c(uk0Var.f30988d1, dVar, false);
        this.f24420f0 = c11;
        c11.p(org.telegram.messenger.i0.L(6.0f));
        this.f24420f0.t(org.telegram.messenger.i0.L(4.0f));
        this.f24420f0.q(org.telegram.messenger.i0.L(14.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21097m7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21078l7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21117n7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    public final void b(boolean z10) {
        uk0 uk0Var = this.f24430p0;
        s4.n0 layoutManager = uk0Var.getLayoutManager();
        if (layoutManager instanceof s4.a0) {
            s4.a0 a0Var = (s4.a0) layoutManager;
            boolean z11 = true;
            if (a0Var.f47879o == 1) {
                s4.g0 adapter = uk0Var.getAdapter();
                if (adapter instanceof bk0) {
                    bk0 bk0Var = (bk0) adapter;
                    float f7 = this.e;
                    int[] iArr = this.W;
                    bk0Var.G(uk0Var, f7, iArr);
                    if (z10) {
                        a0Var.h1(iArr[0], (-iArr[1]) + uk0Var.f31021u1);
                    }
                    String F = bk0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f24431r;
                        if (staticLayout != null) {
                            this.f24432s = staticLayout;
                        }
                        this.f24431r = null;
                    } else if (!F.equals(this.I)) {
                        this.I = F;
                        int i10 = this.R;
                        TextPaint textPaint = this.H;
                        if (i10 == 0) {
                            this.f24431r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.f24433w = this.f24431r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f24431r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.f24433w != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.f24433w.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.f24433w.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new wy(false), split2[0].length(), charSequence.length(), 0);
                                    this.f24433w = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new wy(false), split[0].length(), F.length(), 0);
                                    this.f24434x = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new wy(false), 0, split[0].length(), 0);
                                    this.f24435y = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f24434x = this.f24431r;
                                    this.f24435y = null;
                                }
                                this.G = this.f24433w.getWidth();
                                this.D = 0.0f;
                                if (getProgress() <= this.F) {
                                    z11 = false;
                                }
                                this.E = z11;
                            }
                            this.F = getProgress();
                        }
                        this.f24432s = null;
                        if (this.f24431r.getLineCount() > 0) {
                            this.f24431r.getLineWidth(0);
                            this.f24431r.getLineLeft(0);
                            if (this.f24421g0) {
                                this.M = (((org.telegram.messenger.i0.L(88.0f) - this.f24431r.getLineWidth(0)) / 2.0f) + org.telegram.messenger.i0.L(10.0f)) - this.f24431r.getLineLeft(0);
                            } else {
                                this.M = ((org.telegram.messenger.i0.L(88.0f) - this.f24431r.getLineWidth(0)) / 2.0f) - this.f24431r.getLineLeft(0);
                            }
                            this.N = (org.telegram.messenger.i0.L(88.0f) - this.f24431r.getHeight()) / 2;
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.R != 1) {
            return;
        }
        if (!this.U) {
            this.U = true;
            invalidate();
        }
        ew ewVar = this.f24423i0;
        org.telegram.messenger.i0.r(ewVar);
        org.telegram.messenger.i0.h3(ewVar, 2000L);
    }

    public final void d() {
        int o10;
        uk0 uk0Var = this.f24430p0;
        int i10 = this.R;
        if (i10 == 0) {
            o10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21097m7, uk0Var.f31008n2);
        } else {
            o10 = i0.b.o(-16777216, 102);
        }
        this.S = o10;
        this.T = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21078l7, uk0Var.f31008n2);
        this.f24415c.setColor(this.S);
        TextPaint textPaint = this.H;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21117n7, uk0Var.f31008n2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, uk0Var.f31008n2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f24429o0;
    }

    public float getProgress() {
        return this.e;
    }

    public int getScrollBarY() {
        return org.telegram.messenger.i0.L(17.0f) + ((int) Math.ceil((getMeasuredHeight() - org.telegram.messenger.i0.L(54.0f)) * this.e));
    }

    @Override
    public final boolean isPressed() {
        return this.f24427n;
    }

    @Override
    public final void layout(int i10, int i11, int i12, int i13) {
        if (!this.f24430p0.H1) {
            return;
        }
        super.layout(i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        char c10;
        float f11;
        float f12;
        int i11;
        int i12;
        int i13;
        float f13;
        float L;
        float L2;
        float f14;
        float f15;
        if (this.f24411a) {
            i10 = getPaddingTop();
        } else {
            i10 = 0;
        }
        int ceil = i10 + ((int) Math.ceil(((getMeasuredHeight() - i10) - org.telegram.messenger.i0.L(54.0f)) * this.e));
        int i14 = this.Q;
        float f16 = i14;
        RectF rectF = this.f24413b;
        rectF.set(f16, org.telegram.messenger.i0.L(12.0f) + ceil, org.telegram.messenger.i0.L(5.0f) + i14, org.telegram.messenger.i0.L(42.0f) + ceil);
        int i15 = this.R;
        Paint paint = this.f24415c;
        if (i15 == 0) {
            f7 = 36.0f;
            f10 = 8.0f;
            paint.setColor(i0.b.f(this.O, this.S, this.T));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), paint);
            c10 = 2;
            f11 = 24.0f;
            f12 = 4.0f;
            i11 = 0;
        } else {
            f7 = 36.0f;
            f10 = 8.0f;
            int i16 = org.telegram.ui.ActionBar.t6.f20930d6;
            uk0 uk0Var = this.f24430p0;
            c10 = 2;
            paint.setColor(i0.b.f(0.1f, org.telegram.ui.ActionBar.t6.w0(i16, uk0Var.f31008n2), -1));
            float L3 = org.telegram.messenger.i0.L(27.0f) + ceil;
            vg.f fVar = this.f24418e0;
            if (fVar != null) {
                f11 = 24.0f;
                f12 = 4.0f;
                fVar.setBounds(org.telegram.messenger.i0.L(-20.0f) + i14, org.telegram.messenger.i0.L(-1.0f) + ceil, org.telegram.messenger.i0.L(36.0f) + i14, org.telegram.messenger.i0.L(55.0f) + ceil);
                this.f24418e0.draw(canvas);
                i11 = 0;
            } else {
                f11 = 24.0f;
                f12 = 4.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.f24416c0;
                i11 = 0;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (L3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (L3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(org.telegram.messenger.i0.L(8.0f) + i14, org.telegram.messenger.i0.L(27.0f) + ceil, org.telegram.messenger.i0.L(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, uk0Var.f31008n2));
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(f12) + i14, (org.telegram.messenger.i0.L(2.0f) * this.O) + org.telegram.messenger.i0.L(34.0f) + ceil);
            Path path = this.K;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(f12) + i14, (org.telegram.messenger.i0.L(f11) + ceil) - (org.telegram.messenger.i0.L(2.0f) * this.O));
            canvas.rotate(180.0f, 0.0f, -org.telegram.messenger.i0.L(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i15 == 0) {
            if (this.f24426l0 || this.O != 0.0f) {
                paint.setAlpha((int) (this.O * 255.0f));
                int L4 = org.telegram.messenger.i0.L(30.0f) + ceil;
                int L5 = ceil - org.telegram.messenger.i0.L(46.0f);
                if (L5 <= org.telegram.messenger.i0.L(12.0f)) {
                    f13 = org.telegram.messenger.i0.L(12.0f) - L5;
                    L5 = org.telegram.messenger.i0.L(12.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas.translate(org.telegram.messenger.i0.L(10.0f), L5);
                if (f13 <= org.telegram.messenger.i0.L(29.0f)) {
                    L = org.telegram.messenger.i0.L(44.0f);
                    L2 = ((f13 / org.telegram.messenger.i0.L(29.0f)) * org.telegram.messenger.i0.L(40.0f)) + org.telegram.messenger.i0.L(f12);
                } else {
                    L = ((1.0f - ((f13 - org.telegram.messenger.i0.L(29.0f)) / org.telegram.messenger.i0.L(29.0f))) * org.telegram.messenger.i0.L(40.0f)) + org.telegram.messenger.i0.L(f12);
                    L2 = org.telegram.messenger.i0.L(44.0f);
                }
                boolean z10 = this.f24421g0;
                Path path2 = this.J;
                float[] fArr = this.L;
                if ((z10 && (fArr[i11] != L || fArr[6] != L2)) || (!z10 && (fArr[c10] != L || fArr[4] != L2))) {
                    if (z10) {
                        fArr[1] = L;
                        fArr[i11] = L;
                        fArr[7] = L2;
                        fArr[6] = L2;
                    } else {
                        fArr[3] = L;
                        fArr[c10] = L;
                        fArr[5] = L2;
                        fArr[4] = L2;
                    }
                    path2.reset();
                    if (z10) {
                        f14 = org.telegram.messenger.i0.L(10.0f);
                    } else {
                        f14 = 0.0f;
                    }
                    if (z10) {
                        f15 = 98.0f;
                    } else {
                        f15 = 88.0f;
                    }
                    rectF.set(f14, 0.0f, org.telegram.messenger.i0.L(f15), org.telegram.messenger.i0.L(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.f24431r;
                if (staticLayout == null) {
                    staticLayout = this.f24432s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f17 = this.O;
                    canvas.scale(f17, f17, f16, L4 - L5);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.M, this.N);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i15 == 1) {
            if (this.f24431r != null && this.V != 0.0f) {
                canvas.save();
                float f18 = (this.V * 0.3f) + 0.7f;
                canvas.scale(f18, f18, rectF.right - org.telegram.messenger.i0.L(12.0f), rectF.centerY());
                float centerY = rectF.centerY();
                float L6 = (rectF.left - (org.telegram.messenger.i0.L(30.0f) * this.O)) - org.telegram.messenger.i0.L(f10);
                this.f24431r.getHeight();
                org.telegram.messenger.i0.L(6.0f);
                rectF.set((L6 - (((1.0f - this.D) * this.G) + (this.D * this.f24431r.getWidth()))) - org.telegram.messenger.i0.L(f7), (centerY - (this.f24431r.getHeight() / 2.0f)) - org.telegram.messenger.i0.L(f10), L6 - org.telegram.messenger.i0.L(12.0f), (this.f24431r.getHeight() / 2.0f) + centerY + org.telegram.messenger.i0.L(f10));
                Paint paint2 = this.d;
                int alpha = paint2.getAlpha();
                TextPaint textPaint = this.H;
                int alpha2 = textPaint.getAlpha();
                paint2.setAlpha((int) (alpha * this.V));
                if (this.f24420f0 != null) {
                    Rect rect = org.telegram.messenger.i0.Q;
                    rectF.round(rect);
                    rect.inset(-org.telegram.messenger.i0.L(f12), -org.telegram.messenger.i0.L(f12));
                    this.f24420f0.setBounds(rect);
                    this.f24420f0.setAlpha((int) (this.V * 255.0f));
                    this.f24420f0.draw(canvas);
                } else {
                    Drawable drawable2 = this.f24417d0;
                    drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    drawable2.setAlpha((int) (this.V * 255.0f));
                    drawable2.draw(canvas);
                }
                float f19 = this.D;
                if (f19 != 1.0f) {
                    float f20 = f19 + 0.10666667f;
                    this.D = f20;
                    if (f20 > 1.0f) {
                        this.D = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.D != 1.0f) {
                    canvas.save();
                    rectF.inset(org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(2.0f));
                    canvas.clipRect(rectF);
                    if (this.f24433w != null) {
                        textPaint.setAlpha((int) ((1.0f - this.D) * alpha2 * this.V));
                        canvas.save();
                        float width = (L6 - this.f24433w.getWidth()) - org.telegram.messenger.i0.L(f11);
                        float height = centerY - (this.f24433w.getHeight() / 2.0f);
                        if (this.E) {
                            i13 = -1;
                        } else {
                            i13 = 1;
                        }
                        canvas.translate(width, (org.telegram.messenger.i0.L(15.0f) * i13 * this.D) + height);
                        this.f24433w.draw(canvas);
                        canvas.restore();
                    }
                    if (this.f24434x != null) {
                        textPaint.setAlpha((int) (alpha2 * this.V * this.D));
                        canvas.save();
                        float width2 = (L6 - this.f24434x.getWidth()) - org.telegram.messenger.i0.L(f11);
                        float height2 = centerY - (this.f24434x.getHeight() / 2.0f);
                        if (this.E) {
                            i12 = 1;
                        } else {
                            i12 = -1;
                        }
                        canvas.translate(width2, c3.i0.z(1.0f, this.D, org.telegram.messenger.i0.L(15.0f) * i12, height2));
                        this.f24434x.draw(canvas);
                        canvas.restore();
                    }
                    if (this.f24435y != null) {
                        textPaint.setAlpha((int) (alpha2 * this.V));
                        canvas.save();
                        canvas.translate((L6 - this.f24435y.getWidth()) - org.telegram.messenger.i0.L(f11), centerY - (this.f24435y.getHeight() / 2.0f));
                        this.f24435y.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                } else {
                    textPaint.setAlpha((int) (alpha2 * this.V));
                    canvas.save();
                    canvas.translate((L6 - this.f24431r.getWidth()) - org.telegram.messenger.i0.L(f11), c3.i0.z(1.0f, this.D, org.telegram.messenger.i0.L(15.0f), centerY - (this.f24431r.getHeight() / 2.0f)));
                    this.f24431r.draw(canvas);
                    canvas.restore();
                }
                paint2.setAlpha(alpha);
                textPaint.setAlpha(alpha2);
                canvas.restore();
            } else {
                vg.f fVar2 = this.f24420f0;
                if (fVar2 != null) {
                    fVar2.setAlpha(i11);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.P;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z11 = this.f24426l0;
        if ((z11 && this.f24431r != null && this.O < 1.0f) || ((!z11 || this.f24431r == null) && this.O > 0.0f)) {
            this.P = currentTimeMillis;
            invalidate();
            if (this.f24426l0 && this.f24431r != null) {
                float f21 = (((float) j10) / 120.0f) + this.O;
                this.O = f21;
                if (f21 > 1.0f) {
                    this.O = 1.0f;
                }
            } else {
                float f22 = this.O - (((float) j10) / 120.0f);
                this.O = f22;
                if (f22 < 0.0f) {
                    this.O = 0.0f;
                }
            }
        }
        boolean z12 = this.U;
        if (z12) {
            float f23 = this.V;
            if (f23 != 1.0f) {
                float f24 = (((float) j10) / 120.0f) + f23;
                this.V = f24;
                if (f24 > 1.0f) {
                    this.V = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (!z12) {
            float f25 = this.V;
            if (f25 != 0.0f) {
                float f26 = f25 - (((float) j10) / 120.0f);
                this.V = f26;
                if (f26 < 0.0f) {
                    this.V = 0.0f;
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.R == 0) {
            f7 = 132.0f;
        } else {
            f7 = 240.0f;
        }
        setMeasuredDimension(org.telegram.messenger.i0.L(f7), View.MeasureSpec.getSize(i11));
        Path path = this.K;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        path.lineTo(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(4.0f));
        path.close();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ak0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f7) {
        if (this.f24429o0 != f7) {
            this.f24429o0 = f7;
            super.setAlpha(f7 * this.f24428n0);
        }
    }

    public void setIsVisible(boolean z10) {
        float f7;
        if (this.f24412a0 != z10) {
            this.f24412a0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f24428n0 = f7;
            super.setAlpha(this.f24429o0 * f7);
        }
    }

    public void setProgress(float f7) {
        this.e = f7;
        invalidate();
    }

    public void setVisibilityAlpha(float f7) {
        if (this.f24428n0 != f7) {
            this.f24428n0 = f7;
            super.setAlpha(this.f24429o0 * f7);
        }
    }

    @Override
    public final void updateColors() {
        int f7;
        try {
            d();
            if (this.R != 0) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f24430p0.f31008n2);
                this.d.setColor(w02);
                Drawable drawable = this.f24417d0;
                if (drawable != null && (f7 = i0.b.f(0.1f, w02, -1)) != this.f24424j0) {
                    this.f24424j0 = f7;
                    drawable.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
