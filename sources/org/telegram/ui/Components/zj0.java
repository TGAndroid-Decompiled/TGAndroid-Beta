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
public final class zj0 extends View implements org.telegram.ui.ActionBar.k6 {
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
    public boolean f33076a;
    public boolean f33077a0;
    public final RectF f33078b;
    public final float f33079b0;
    public final Paint f33080c;
    public final Drawable f33081c0;
    public final Paint d;
    public final Drawable f33082d0;
    public float e;
    public vg.f f33083e0;
    public float f33084f;
    public vg.f f33085f0;
    public final boolean f33086g0;
    public float h;
    public int f33087h0;
    public final ew f33088i0;
    public int f33089j0;
    public float f33090k0;
    public boolean f33091l0;
    public long m0;
    public boolean f33092n;
    public float f33093n0;
    public float f33094o0;
    public final tk0 f33095p0;
    public StaticLayout f33096r;
    public StaticLayout f33097s;
    public StaticLayout f33098w;
    public StaticLayout f33099x;
    public StaticLayout f33100y;

    public zj0(tk0 tk0Var, Context context, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        org.telegram.ui.ActionBar.p6 p6Var = tk0Var.f30625n2;
        this.f33095p0 = tk0Var;
        this.f33076a = true;
        this.f33078b = new RectF();
        this.f33080c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.D = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        this.J = new Path();
        this.K = new Path();
        this.L = new float[8];
        this.W = new int[2];
        this.f33088i0 = new ew(this, 9);
        this.f33094o0 = 1.0f;
        this.R = i10;
        if (i10 == 0) {
            textPaint.setTextSize(org.telegram.messenger.i0.L(45.0f));
            this.f33086g0 = org.telegram.messenger.cd.X;
        } else {
            this.f33086g0 = false;
            textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            int i12 = org.telegram.ui.ActionBar.t6.f20929d6;
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
            Drawable mutate = context.getDrawable(2131230910).mutate();
            this.f33082d0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.b.f(0.1f, org.telegram.ui.ActionBar.t6.w0(i12, p6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i13 = 0; i13 < 8; i13++) {
            this.L[i13] = org.telegram.messenger.i0.L(44.0f);
        }
        if (this.f33086g0) {
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
        if (tk0Var.b1()) {
            if (this.f33086g0) {
                f10 = -4.0f;
            } else {
                f10 = 6.0f;
            }
            this.Q = org.telegram.messenger.i0.L(f10) + L;
        }
        c();
        setFocusableInTouchMode(true);
        this.f33079b0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f33081c0 = context.getDrawable(2131231068);
    }

    public final void a(boolean z10) {
        tk0 tk0Var = this.f33095p0;
        s4.n0 layoutManager = tk0Var.getLayoutManager();
        if (layoutManager instanceof s4.a0) {
            s4.a0 a0Var = (s4.a0) layoutManager;
            boolean z11 = true;
            if (a0Var.f47868o == 1) {
                s4.g0 adapter = tk0Var.getAdapter();
                if (adapter instanceof ak0) {
                    ak0 ak0Var = (ak0) adapter;
                    float f7 = this.e;
                    int[] iArr = this.W;
                    ak0Var.G(tk0Var, f7, iArr);
                    if (z10) {
                        a0Var.h1(iArr[0], (-iArr[1]) + tk0Var.f30638u1);
                    }
                    String F = ak0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f33096r;
                        if (staticLayout != null) {
                            this.f33097s = staticLayout;
                        }
                        this.f33096r = null;
                    } else if (!F.equals(this.I)) {
                        this.I = F;
                        int i10 = this.R;
                        TextPaint textPaint = this.H;
                        if (i10 == 0) {
                            this.f33096r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.f33098w = this.f33096r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f33096r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.f33098w != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.f33098w.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.f33098w.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new wy(false), split2[0].length(), charSequence.length(), 0);
                                    this.f33098w = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new wy(false), split[0].length(), F.length(), 0);
                                    this.f33099x = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new wy(false), 0, split[0].length(), 0);
                                    this.f33100y = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f33099x = this.f33096r;
                                    this.f33100y = null;
                                }
                                this.G = this.f33098w.getWidth();
                                this.D = 0.0f;
                                if (getProgress() <= this.F) {
                                    z11 = false;
                                }
                                this.E = z11;
                            }
                            this.F = getProgress();
                        }
                        this.f33097s = null;
                        if (this.f33096r.getLineCount() > 0) {
                            this.f33096r.getLineWidth(0);
                            this.f33096r.getLineLeft(0);
                            if (this.f33086g0) {
                                this.M = (((org.telegram.messenger.i0.L(88.0f) - this.f33096r.getLineWidth(0)) / 2.0f) + org.telegram.messenger.i0.L(10.0f)) - this.f33096r.getLineLeft(0);
                            } else {
                                this.M = ((org.telegram.messenger.i0.L(88.0f) - this.f33096r.getLineWidth(0)) / 2.0f) - this.f33096r.getLineLeft(0);
                            }
                            this.N = (org.telegram.messenger.i0.L(88.0f) - this.f33096r.getHeight()) / 2;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21077l7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21116n7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    public final void b() {
        if (this.R != 1) {
            return;
        }
        if (!this.U) {
            this.U = true;
            invalidate();
        }
        ew ewVar = this.f33088i0;
        org.telegram.messenger.i0.r(ewVar);
        org.telegram.messenger.i0.h3(ewVar, 2000L);
    }

    public final void c() {
        int o10;
        tk0 tk0Var = this.f33095p0;
        int i10 = this.R;
        if (i10 == 0) {
            o10 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21096m7, tk0Var.f30625n2);
        } else {
            o10 = i0.b.o(-16777216, 102);
        }
        this.S = o10;
        this.T = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21077l7, tk0Var.f30625n2);
        this.f33080c.setColor(this.S);
        TextPaint textPaint = this.H;
        if (i10 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n7, tk0Var.f30625n2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, tk0Var.f30625n2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f33094o0;
    }

    public float getProgress() {
        return this.e;
    }

    public int getScrollBarY() {
        return org.telegram.messenger.i0.L(17.0f) + ((int) Math.ceil((getMeasuredHeight() - org.telegram.messenger.i0.L(54.0f)) * this.e));
    }

    @Override
    public final boolean isPressed() {
        return this.f33092n;
    }

    @Override
    public final void layout(int i10, int i11, int i12, int i13) {
        if (!this.f33095p0.H1) {
            return;
        }
        super.layout(i10, i11, i12, i13);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        char c10;
        float f12;
        float f13;
        int i11;
        int i12;
        float f14;
        float L;
        float L2;
        float f15;
        float f16;
        if (this.f33076a) {
            i10 = getPaddingTop();
        } else {
            i10 = 0;
        }
        int ceil = i10 + ((int) Math.ceil(((getMeasuredHeight() - i10) - org.telegram.messenger.i0.L(54.0f)) * this.e));
        int i13 = this.Q;
        float f17 = i13;
        RectF rectF = this.f33078b;
        rectF.set(f17, org.telegram.messenger.i0.L(12.0f) + ceil, org.telegram.messenger.i0.L(5.0f) + i13, org.telegram.messenger.i0.L(42.0f) + ceil);
        int i14 = this.R;
        Paint paint = this.f33080c;
        if (i14 == 0) {
            f7 = 12.0f;
            f10 = 36.0f;
            paint.setColor(i0.b.f(this.O, this.S, this.T));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), paint);
            f11 = 8.0f;
            c10 = 2;
            f12 = 24.0f;
            f13 = 4.0f;
        } else {
            f7 = 12.0f;
            f10 = 36.0f;
            int i15 = org.telegram.ui.ActionBar.t6.f20929d6;
            tk0 tk0Var = this.f33095p0;
            f11 = 8.0f;
            paint.setColor(i0.b.f(0.1f, org.telegram.ui.ActionBar.t6.w0(i15, tk0Var.f30625n2), -1));
            float L3 = org.telegram.messenger.i0.L(27.0f) + ceil;
            vg.f fVar = this.f33083e0;
            if (fVar != null) {
                c10 = 2;
                f12 = 24.0f;
                fVar.setBounds(org.telegram.messenger.i0.L(-20.0f) + i13, org.telegram.messenger.i0.L(-1.0f) + ceil, org.telegram.messenger.i0.L(36.0f) + i13, org.telegram.messenger.i0.L(55.0f) + ceil);
                this.f33083e0.draw(canvas);
                f13 = 4.0f;
            } else {
                c10 = 2;
                f12 = 24.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.f33081c0;
                f13 = 4.0f;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (L3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (L3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(org.telegram.messenger.i0.L(8.0f) + i13, org.telegram.messenger.i0.L(27.0f) + ceil, org.telegram.messenger.i0.L(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, tk0Var.f30625n2));
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(f13) + i13, (org.telegram.messenger.i0.L(2.0f) * this.O) + org.telegram.messenger.i0.L(34.0f) + ceil);
            Path path = this.K;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(f13) + i13, (org.telegram.messenger.i0.L(f12) + ceil) - (org.telegram.messenger.i0.L(2.0f) * this.O));
            canvas.rotate(180.0f, 0.0f, -org.telegram.messenger.i0.L(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i14 == 0) {
            if (this.f33091l0 || this.O != 0.0f) {
                paint.setAlpha((int) (this.O * 255.0f));
                int L4 = org.telegram.messenger.i0.L(30.0f) + ceil;
                int L5 = ceil - org.telegram.messenger.i0.L(46.0f);
                if (L5 <= org.telegram.messenger.i0.L(f7)) {
                    f14 = org.telegram.messenger.i0.L(f7) - L5;
                    L5 = org.telegram.messenger.i0.L(f7);
                } else {
                    f14 = 0.0f;
                }
                canvas.translate(org.telegram.messenger.i0.L(10.0f), L5);
                if (f14 <= org.telegram.messenger.i0.L(29.0f)) {
                    L = org.telegram.messenger.i0.L(44.0f);
                    L2 = ((f14 / org.telegram.messenger.i0.L(29.0f)) * org.telegram.messenger.i0.L(40.0f)) + org.telegram.messenger.i0.L(f13);
                } else {
                    L = ((1.0f - ((f14 - org.telegram.messenger.i0.L(29.0f)) / org.telegram.messenger.i0.L(29.0f))) * org.telegram.messenger.i0.L(40.0f)) + org.telegram.messenger.i0.L(f13);
                    L2 = org.telegram.messenger.i0.L(44.0f);
                }
                boolean z10 = this.f33086g0;
                Path path2 = this.J;
                float[] fArr = this.L;
                if ((z10 && (fArr[0] != L || fArr[6] != L2)) || (!z10 && (fArr[c10] != L || fArr[4] != L2))) {
                    if (z10) {
                        fArr[1] = L;
                        fArr[0] = L;
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
                        f15 = org.telegram.messenger.i0.L(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    if (z10) {
                        f16 = 98.0f;
                    } else {
                        f16 = 88.0f;
                    }
                    rectF.set(f15, 0.0f, org.telegram.messenger.i0.L(f16), org.telegram.messenger.i0.L(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.f33096r;
                if (staticLayout == null) {
                    staticLayout = this.f33097s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f18 = this.O;
                    canvas.scale(f18, f18, f17, L4 - L5);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.M, this.N);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i14 == 1 && this.f33096r != null && this.V != 0.0f) {
            canvas.save();
            float f19 = (this.V * 0.3f) + 0.7f;
            canvas.scale(f19, f19, rectF.right - org.telegram.messenger.i0.L(f7), rectF.centerY());
            float centerY = rectF.centerY();
            float L6 = (rectF.left - (org.telegram.messenger.i0.L(30.0f) * this.O)) - org.telegram.messenger.i0.L(f11);
            this.f33096r.getHeight();
            org.telegram.messenger.i0.L(6.0f);
            rectF.set((L6 - (((1.0f - this.D) * this.G) + (this.D * this.f33096r.getWidth()))) - org.telegram.messenger.i0.L(f10), (centerY - (this.f33096r.getHeight() / 2.0f)) - org.telegram.messenger.i0.L(f11), L6 - org.telegram.messenger.i0.L(f7), (this.f33096r.getHeight() / 2.0f) + centerY + org.telegram.messenger.i0.L(f11));
            Paint paint2 = this.d;
            int alpha = paint2.getAlpha();
            TextPaint textPaint = this.H;
            int alpha2 = textPaint.getAlpha();
            paint2.setAlpha((int) (alpha * this.V));
            if (this.f33085f0 != null) {
                Rect rect = org.telegram.messenger.i0.Q;
                rectF.round(rect);
                rect.inset(-org.telegram.messenger.i0.L(f13), -org.telegram.messenger.i0.L(f13));
                this.f33085f0.setBounds(rect);
                this.f33085f0.draw(canvas);
            } else {
                Drawable drawable2 = this.f33082d0;
                drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                drawable2.setAlpha((int) (this.V * 255.0f));
                drawable2.draw(canvas);
            }
            float f20 = this.D;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.10666667f;
                this.D = f21;
                if (f21 > 1.0f) {
                    this.D = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (this.D != 1.0f) {
                canvas.save();
                rectF.inset(org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(2.0f));
                canvas.clipRect(rectF);
                if (this.f33098w != null) {
                    textPaint.setAlpha((int) ((1.0f - this.D) * alpha2 * this.V));
                    canvas.save();
                    float width = (L6 - this.f33098w.getWidth()) - org.telegram.messenger.i0.L(f12);
                    float height = centerY - (this.f33098w.getHeight() / 2.0f);
                    if (this.E) {
                        i12 = -1;
                    } else {
                        i12 = 1;
                    }
                    canvas.translate(width, (org.telegram.messenger.i0.L(15.0f) * i12 * this.D) + height);
                    this.f33098w.draw(canvas);
                    canvas.restore();
                }
                if (this.f33099x != null) {
                    textPaint.setAlpha((int) (alpha2 * this.V * this.D));
                    canvas.save();
                    float width2 = (L6 - this.f33099x.getWidth()) - org.telegram.messenger.i0.L(f12);
                    float height2 = centerY - (this.f33099x.getHeight() / 2.0f);
                    if (this.E) {
                        i11 = 1;
                    } else {
                        i11 = -1;
                    }
                    canvas.translate(width2, c3.i0.z(1.0f, this.D, org.telegram.messenger.i0.L(15.0f) * i11, height2));
                    this.f33099x.draw(canvas);
                    canvas.restore();
                }
                if (this.f33100y != null) {
                    textPaint.setAlpha((int) (alpha2 * this.V));
                    canvas.save();
                    canvas.translate((L6 - this.f33100y.getWidth()) - org.telegram.messenger.i0.L(f12), centerY - (this.f33100y.getHeight() / 2.0f));
                    this.f33100y.draw(canvas);
                    canvas.restore();
                }
                canvas.restore();
            } else {
                textPaint.setAlpha((int) (alpha2 * this.V));
                canvas.save();
                canvas.translate((L6 - this.f33096r.getWidth()) - org.telegram.messenger.i0.L(f12), c3.i0.z(1.0f, this.D, org.telegram.messenger.i0.L(15.0f), centerY - (this.f33096r.getHeight() / 2.0f)));
                this.f33096r.draw(canvas);
                canvas.restore();
            }
            paint2.setAlpha(alpha);
            textPaint.setAlpha(alpha2);
            canvas.restore();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.P;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z11 = this.f33091l0;
        if ((z11 && this.f33096r != null && this.O < 1.0f) || ((!z11 || this.f33096r == null) && this.O > 0.0f)) {
            this.P = currentTimeMillis;
            invalidate();
            if (this.f33091l0 && this.f33096r != null) {
                float f22 = (((float) j10) / 120.0f) + this.O;
                this.O = f22;
                if (f22 > 1.0f) {
                    this.O = 1.0f;
                }
            } else {
                float f23 = this.O - (((float) j10) / 120.0f);
                this.O = f23;
                if (f23 < 0.0f) {
                    this.O = 0.0f;
                }
            }
        }
        boolean z12 = this.U;
        if (z12) {
            float f24 = this.V;
            if (f24 != 1.0f) {
                float f25 = (((float) j10) / 120.0f) + f24;
                this.V = f25;
                if (f25 > 1.0f) {
                    this.V = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (!z12) {
            float f26 = this.V;
            if (f26 != 0.0f) {
                float f27 = f26 - (((float) j10) / 120.0f);
                this.V = f27;
                if (f27 < 0.0f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zj0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f7) {
        if (this.f33094o0 != f7) {
            this.f33094o0 = f7;
            super.setAlpha(f7 * this.f33093n0);
        }
    }

    public void setIsVisible(boolean z10) {
        float f7;
        if (this.f33077a0 != z10) {
            this.f33077a0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.f33093n0 = f7;
            super.setAlpha(this.f33094o0 * f7);
        }
    }

    public void setProgress(float f7) {
        this.e = f7;
        invalidate();
    }

    public void setVisibilityAlpha(float f7) {
        if (this.f33093n0 != f7) {
            this.f33093n0 = f7;
            super.setAlpha(this.f33094o0 * f7);
        }
    }

    @Override
    public final void updateColors() {
        int f7;
        try {
            c();
            if (this.R != 0) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.f33095p0.f30625n2);
                this.d.setColor(w02);
                Drawable drawable = this.f33082d0;
                if (drawable != null && (f7 = i0.b.f(0.1f, w02, -1)) != this.f33089j0) {
                    this.f33089j0 = f7;
                    drawable.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
