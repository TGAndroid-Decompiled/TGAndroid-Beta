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
public final class yi0 extends View implements org.telegram.ui.ActionBar.z5 {
    public float E;
    public boolean F;
    public float G;
    public float H;
    public final TextPaint I;
    public String J;
    public final Path K;
    public final Path L;
    public final float[] M;
    public float N;
    public float O;
    public float P;
    public long Q;
    public final int R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public float W;
    public boolean f40728a;
    public final int[] f40729a0;
    public final RectF f40730b;
    public boolean f40731b0;
    public final Paint f40732c;
    public final float f40733c0;
    public final Paint d;
    public final Drawable f40734d0;
    public float f40735e;
    public final Drawable f40736e0;
    public float f40737f;
    public gh.g f40738f0;
    public gh.g f40739g0;
    public float h;
    public final boolean f40740h0;
    public int f40741i0;
    public final lt f40742j0;
    public int f40743k0;
    public float f40744l0;
    public boolean m0;
    public boolean f40745n;
    public long f40746n0;
    public float f40747o0;
    public float f40748p0;
    public final tj0 f40749q0;
    public StaticLayout f40750r;
    public StaticLayout f40751s;
    public StaticLayout f40752w;
    public StaticLayout f40753x;
    public StaticLayout f40754y;

    public yi0(tj0 tj0Var, Context context, int i3) {
        super(context);
        int i10;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.e6 e6Var = tj0Var.f38460o2;
        this.f40749q0 = tj0Var;
        this.f40728a = true;
        this.f40730b = new RectF();
        this.f40732c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.E = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        this.K = new Path();
        this.L = new Path();
        this.M = new float[8];
        this.f40729a0 = new int[2];
        this.f40742j0 = new lt(this, 10);
        this.f40748p0 = 1.0f;
        this.S = i3;
        if (i3 == 0) {
            textPaint.setTextSize(org.telegram.messenger.g0.L(45.0f));
            this.f40740h0 = org.telegram.messenger.bd.f21784a0;
        } else {
            this.f40740h0 = false;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            Drawable mutate = context.getDrawable(2131230910).mutate();
            this.f40736e0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i12 = 0; i12 < 8; i12++) {
            this.M[i12] = org.telegram.messenger.g0.L(44.0f);
        }
        if (this.f40740h0) {
            f10 = 10.0f;
        } else {
            if (i3 == 0) {
                i10 = 132;
            } else {
                i10 = 240;
            }
            f10 = i10 - 15;
        }
        int L = org.telegram.messenger.g0.L(f10);
        this.R = L;
        if (tj0Var.b1()) {
            if (this.f40740h0) {
                f11 = -4.0f;
            } else {
                f11 = 6.0f;
            }
            this.R = org.telegram.messenger.g0.L(f11) + L;
        }
        d();
        setFocusableInTouchMode(true);
        this.f40733c0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f40734d0 = context.getDrawable(2131231068);
    }

    public final void a(eh.c cVar, hh.e eVar) {
        tj0 tj0Var = this.f40749q0;
        gh.g c2 = cVar.c(tj0Var.f38441e1, eVar, false);
        this.f40738f0 = c2;
        c2.q(org.telegram.messenger.g0.L(4.0f));
        this.f40738f0.r(org.telegram.messenger.g0.L(24.0f));
        gh.g c10 = cVar.c(tj0Var.f38441e1, eVar, false);
        this.f40739g0 = c10;
        c10.q(org.telegram.messenger.g0.L(6.0f));
        this.f40739g0.u(org.telegram.messenger.g0.L(4.0f));
        this.f40739g0.r(org.telegram.messenger.g0.L(14.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28044m7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28027l7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28063n7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    public final void b(boolean z10) {
        tj0 tj0Var = this.f40749q0;
        u4.o0 layoutManager = tj0Var.getLayoutManager();
        if (layoutManager instanceof u4.b0) {
            u4.b0 b0Var = (u4.b0) layoutManager;
            boolean z11 = true;
            if (b0Var.f55509o == 1) {
                u4.h0 adapter = tj0Var.getAdapter();
                if (adapter instanceof zi0) {
                    zi0 zi0Var = (zi0) adapter;
                    float f10 = this.f40735e;
                    int[] iArr = this.f40729a0;
                    zi0Var.G(tj0Var, f10, iArr);
                    if (z10) {
                        b0Var.h1(iArr[0], (-iArr[1]) + tj0Var.f38473v1);
                    }
                    String F = zi0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f40750r;
                        if (staticLayout != null) {
                            this.f40751s = staticLayout;
                        }
                        this.f40750r = null;
                    } else if (!F.equals(this.J)) {
                        this.J = F;
                        int i3 = this.S;
                        TextPaint textPaint = this.I;
                        if (i3 == 0) {
                            this.f40750r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.f40752w = this.f40750r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f40750r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.f40752w != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.f40752w.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.f40752w.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new fy(false), split2[0].length(), charSequence.length(), 0);
                                    this.f40752w = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new fy(false), split[0].length(), F.length(), 0);
                                    this.f40753x = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new fy(false), 0, split[0].length(), 0);
                                    this.f40754y = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f40753x = this.f40750r;
                                    this.f40754y = null;
                                }
                                this.H = this.f40752w.getWidth();
                                this.E = 0.0f;
                                if (getProgress() <= this.G) {
                                    z11 = false;
                                }
                                this.F = z11;
                            }
                            this.G = getProgress();
                        }
                        this.f40751s = null;
                        if (this.f40750r.getLineCount() > 0) {
                            this.f40750r.getLineWidth(0);
                            this.f40750r.getLineLeft(0);
                            if (this.f40740h0) {
                                this.N = (((org.telegram.messenger.g0.L(88.0f) - this.f40750r.getLineWidth(0)) / 2.0f) + org.telegram.messenger.g0.L(10.0f)) - this.f40750r.getLineLeft(0);
                            } else {
                                this.N = ((org.telegram.messenger.g0.L(88.0f) - this.f40750r.getLineWidth(0)) / 2.0f) - this.f40750r.getLineLeft(0);
                            }
                            this.O = (org.telegram.messenger.g0.L(88.0f) - this.f40750r.getHeight()) / 2;
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.S != 1) {
            return;
        }
        if (!this.V) {
            this.V = true;
            invalidate();
        }
        lt ltVar = this.f40742j0;
        org.telegram.messenger.g0.r(ltVar);
        org.telegram.messenger.g0.i3(ltVar, 2000L);
    }

    public final void d() {
        int o10;
        tj0 tj0Var = this.f40749q0;
        int i3 = this.S;
        if (i3 == 0) {
            o10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28044m7, tj0Var.f38460o2);
        } else {
            o10 = i0.a.o(-16777216, 102);
        }
        this.T = o10;
        this.U = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28027l7, tj0Var.f38460o2);
        this.f40732c.setColor(this.T);
        TextPaint textPaint = this.I;
        if (i3 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28063n7, tj0Var.f38460o2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, tj0Var.f38460o2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f40748p0;
    }

    public float getProgress() {
        return this.f40735e;
    }

    public int getScrollBarY() {
        return org.telegram.messenger.g0.L(17.0f) + ((int) Math.ceil((getMeasuredHeight() - org.telegram.messenger.g0.L(54.0f)) * this.f40735e));
    }

    @Override
    public final boolean isPressed() {
        return this.f40745n;
    }

    @Override
    public final void layout(int i3, int i10, int i11, int i12) {
        if (!this.f40749q0.I1) {
            return;
        }
        super.layout(i3, i10, i11, i12);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        float f11;
        char c2;
        float f12;
        float f13;
        int i10;
        int i11;
        int i12;
        float f14;
        float L;
        float L2;
        float f15;
        float f16;
        if (this.f40728a) {
            i3 = getPaddingTop();
        } else {
            i3 = 0;
        }
        int ceil = i3 + ((int) Math.ceil(((getMeasuredHeight() - i3) - org.telegram.messenger.g0.L(54.0f)) * this.f40735e));
        int i13 = this.R;
        float f17 = i13;
        RectF rectF = this.f40730b;
        rectF.set(f17, org.telegram.messenger.g0.L(12.0f) + ceil, org.telegram.messenger.g0.L(5.0f) + i13, org.telegram.messenger.g0.L(42.0f) + ceil);
        int i14 = this.S;
        Paint paint = this.f40732c;
        if (i14 == 0) {
            f10 = 36.0f;
            f11 = 8.0f;
            paint.setColor(i0.a.f(this.P, this.T, this.U));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint);
            c2 = 2;
            f12 = 24.0f;
            f13 = 4.0f;
            i10 = 0;
        } else {
            f10 = 36.0f;
            f11 = 8.0f;
            int i15 = org.telegram.ui.ActionBar.k6.f27878d6;
            tj0 tj0Var = this.f40749q0;
            c2 = 2;
            paint.setColor(i0.a.f(0.1f, org.telegram.ui.ActionBar.k6.w0(i15, tj0Var.f38460o2), -1));
            float L3 = org.telegram.messenger.g0.L(27.0f) + ceil;
            gh.g gVar = this.f40738f0;
            if (gVar != null) {
                f12 = 24.0f;
                f13 = 4.0f;
                gVar.setBounds(org.telegram.messenger.g0.L(-20.0f) + i13, org.telegram.messenger.g0.L(-1.0f) + ceil, org.telegram.messenger.g0.L(36.0f) + i13, org.telegram.messenger.g0.L(55.0f) + ceil);
                this.f40738f0.draw(canvas);
                i10 = 0;
            } else {
                f12 = 24.0f;
                f13 = 4.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.f40734d0;
                i10 = 0;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (L3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (L3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(27.0f) + ceil, org.telegram.messenger.g0.L(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, tj0Var.f38460o2));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(f13) + i13, (org.telegram.messenger.g0.L(2.0f) * this.P) + org.telegram.messenger.g0.L(34.0f) + ceil);
            Path path = this.L;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(f13) + i13, (org.telegram.messenger.g0.L(f12) + ceil) - (org.telegram.messenger.g0.L(2.0f) * this.P));
            canvas.rotate(180.0f, 0.0f, -org.telegram.messenger.g0.L(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i14 == 0) {
            if (this.m0 || this.P != 0.0f) {
                paint.setAlpha((int) (this.P * 255.0f));
                int L4 = org.telegram.messenger.g0.L(30.0f) + ceil;
                int L5 = ceil - org.telegram.messenger.g0.L(46.0f);
                if (L5 <= org.telegram.messenger.g0.L(12.0f)) {
                    f14 = org.telegram.messenger.g0.L(12.0f) - L5;
                    L5 = org.telegram.messenger.g0.L(12.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas.translate(org.telegram.messenger.g0.L(10.0f), L5);
                if (f14 <= org.telegram.messenger.g0.L(29.0f)) {
                    L = org.telegram.messenger.g0.L(44.0f);
                    L2 = ((f14 / org.telegram.messenger.g0.L(29.0f)) * org.telegram.messenger.g0.L(40.0f)) + org.telegram.messenger.g0.L(f13);
                } else {
                    L = ((1.0f - ((f14 - org.telegram.messenger.g0.L(29.0f)) / org.telegram.messenger.g0.L(29.0f))) * org.telegram.messenger.g0.L(40.0f)) + org.telegram.messenger.g0.L(f13);
                    L2 = org.telegram.messenger.g0.L(44.0f);
                }
                boolean z10 = this.f40740h0;
                Path path2 = this.K;
                float[] fArr = this.M;
                if ((z10 && (fArr[i10] != L || fArr[6] != L2)) || (!z10 && (fArr[c2] != L || fArr[4] != L2))) {
                    if (z10) {
                        fArr[1] = L;
                        fArr[i10] = L;
                        fArr[7] = L2;
                        fArr[6] = L2;
                    } else {
                        fArr[3] = L;
                        fArr[c2] = L;
                        fArr[5] = L2;
                        fArr[4] = L2;
                    }
                    path2.reset();
                    if (z10) {
                        f15 = org.telegram.messenger.g0.L(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    if (z10) {
                        f16 = 98.0f;
                    } else {
                        f16 = 88.0f;
                    }
                    rectF.set(f15, 0.0f, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.f40750r;
                if (staticLayout == null) {
                    staticLayout = this.f40751s;
                }
                if (staticLayout != null) {
                    canvas.save();
                    float f18 = this.P;
                    canvas.scale(f18, f18, f17, L4 - L5);
                    canvas.drawPath(path2, paint);
                    canvas.translate(this.N, this.O);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
            }
        } else if (i14 == 1) {
            if (this.f40750r != null && this.W != 0.0f) {
                canvas.save();
                float f19 = (this.W * 0.3f) + 0.7f;
                canvas.scale(f19, f19, rectF.right - org.telegram.messenger.g0.L(12.0f), rectF.centerY());
                float centerY = rectF.centerY();
                float L6 = (rectF.left - (org.telegram.messenger.g0.L(30.0f) * this.P)) - org.telegram.messenger.g0.L(f11);
                this.f40750r.getHeight();
                org.telegram.messenger.g0.L(6.0f);
                rectF.set((L6 - (((1.0f - this.E) * this.H) + (this.E * this.f40750r.getWidth()))) - org.telegram.messenger.g0.L(f10), (centerY - (this.f40750r.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(f11), L6 - org.telegram.messenger.g0.L(12.0f), (this.f40750r.getHeight() / 2.0f) + centerY + org.telegram.messenger.g0.L(f11));
                Paint paint2 = this.d;
                int alpha = paint2.getAlpha();
                TextPaint textPaint = this.I;
                int alpha2 = textPaint.getAlpha();
                paint2.setAlpha((int) (alpha * this.W));
                if (this.f40739g0 != null) {
                    Rect rect = org.telegram.messenger.g0.Q;
                    rectF.round(rect);
                    rect.inset(-org.telegram.messenger.g0.L(f13), -org.telegram.messenger.g0.L(f13));
                    this.f40739g0.setBounds(rect);
                    this.f40739g0.setAlpha((int) (this.W * 255.0f));
                    this.f40739g0.draw(canvas);
                } else {
                    Drawable drawable2 = this.f40736e0;
                    drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    drawable2.setAlpha((int) (this.W * 255.0f));
                    drawable2.draw(canvas);
                }
                float f20 = this.E;
                if (f20 != 1.0f) {
                    float f21 = f20 + 0.10666667f;
                    this.E = f21;
                    if (f21 > 1.0f) {
                        this.E = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.E != 1.0f) {
                    canvas.save();
                    rectF.inset(org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(2.0f));
                    canvas.clipRect(rectF);
                    if (this.f40752w != null) {
                        textPaint.setAlpha((int) ((1.0f - this.E) * alpha2 * this.W));
                        canvas.save();
                        float width = (L6 - this.f40752w.getWidth()) - org.telegram.messenger.g0.L(f12);
                        float height = centerY - (this.f40752w.getHeight() / 2.0f);
                        if (this.F) {
                            i12 = -1;
                        } else {
                            i12 = 1;
                        }
                        canvas.translate(width, (org.telegram.messenger.g0.L(15.0f) * i12 * this.E) + height);
                        this.f40752w.draw(canvas);
                        canvas.restore();
                    }
                    if (this.f40753x != null) {
                        textPaint.setAlpha((int) (alpha2 * this.W * this.E));
                        canvas.save();
                        float width2 = (L6 - this.f40753x.getWidth()) - org.telegram.messenger.g0.L(f12);
                        float height2 = centerY - (this.f40753x.getHeight() / 2.0f);
                        if (this.F) {
                            i11 = 1;
                        } else {
                            i11 = -1;
                        }
                        canvas.translate(width2, com.google.android.recaptcha.internal.a.y(1.0f, this.E, org.telegram.messenger.g0.L(15.0f) * i11, height2));
                        this.f40753x.draw(canvas);
                        canvas.restore();
                    }
                    if (this.f40754y != null) {
                        textPaint.setAlpha((int) (alpha2 * this.W));
                        canvas.save();
                        canvas.translate((L6 - this.f40754y.getWidth()) - org.telegram.messenger.g0.L(f12), centerY - (this.f40754y.getHeight() / 2.0f));
                        this.f40754y.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                } else {
                    textPaint.setAlpha((int) (alpha2 * this.W));
                    canvas.save();
                    canvas.translate((L6 - this.f40750r.getWidth()) - org.telegram.messenger.g0.L(f12), com.google.android.recaptcha.internal.a.y(1.0f, this.E, org.telegram.messenger.g0.L(15.0f), centerY - (this.f40750r.getHeight() / 2.0f)));
                    this.f40750r.draw(canvas);
                    canvas.restore();
                }
                paint2.setAlpha(alpha);
                textPaint.setAlpha(alpha2);
                canvas.restore();
            } else {
                gh.g gVar2 = this.f40739g0;
                if (gVar2 != null) {
                    gVar2.setAlpha(i10);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.Q;
        if (j10 < 0 || j10 > 17) {
            j10 = 17;
        }
        boolean z11 = this.m0;
        if ((z11 && this.f40750r != null && this.P < 1.0f) || ((!z11 || this.f40750r == null) && this.P > 0.0f)) {
            this.Q = currentTimeMillis;
            invalidate();
            if (this.m0 && this.f40750r != null) {
                float f22 = (((float) j10) / 120.0f) + this.P;
                this.P = f22;
                if (f22 > 1.0f) {
                    this.P = 1.0f;
                }
            } else {
                float f23 = this.P - (((float) j10) / 120.0f);
                this.P = f23;
                if (f23 < 0.0f) {
                    this.P = 0.0f;
                }
            }
        }
        boolean z12 = this.V;
        if (z12) {
            float f24 = this.W;
            if (f24 != 1.0f) {
                float f25 = (((float) j10) / 120.0f) + f24;
                this.W = f25;
                if (f25 > 1.0f) {
                    this.W = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (!z12) {
            float f26 = this.W;
            if (f26 != 0.0f) {
                float f27 = f26 - (((float) j10) / 120.0f);
                this.W = f27;
                if (f27 < 0.0f) {
                    this.W = 0.0f;
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        if (this.S == 0) {
            f10 = 132.0f;
        } else {
            f10 = 240.0f;
        }
        setMeasuredDimension(org.telegram.messenger.g0.L(f10), View.MeasureSpec.getSize(i10));
        Path path = this.L;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        path.lineTo(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        path.close();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        if (this.f40748p0 != f10) {
            this.f40748p0 = f10;
            super.setAlpha(f10 * this.f40747o0);
        }
    }

    public void setIsVisible(boolean z10) {
        float f10;
        if (this.f40731b0 != z10) {
            this.f40731b0 = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f40747o0 = f10;
            super.setAlpha(this.f40748p0 * f10);
        }
    }

    public void setProgress(float f10) {
        this.f40735e = f10;
        invalidate();
    }

    public void setVisibilityAlpha(float f10) {
        if (this.f40747o0 != f10) {
            this.f40747o0 = f10;
            super.setAlpha(this.f40748p0 * f10);
        }
    }

    @Override
    public final void updateColors() {
        int f10;
        try {
            d();
            if (this.S != 0) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.f40749q0.f38460o2);
                this.d.setColor(w02);
                Drawable drawable = this.f40736e0;
                if (drawable != null && (f10 = i0.a.f(0.1f, w02, -1)) != this.f40743k0) {
                    this.f40743k0 = f10;
                    drawable.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
