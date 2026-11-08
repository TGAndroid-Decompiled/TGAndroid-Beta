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
public final class ui0 extends View implements org.telegram.ui.ActionBar.a6 {
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
    public boolean f38652a;
    public boolean f38653a0;
    public final RectF f38654b;
    public final float f38655b0;
    public final Paint f38656c;
    public final Drawable f38657c0;
    public final Paint d;
    public final Drawable f38658d0;
    public float f38659e;
    public fh.g f38660e0;
    public float f38661f;
    public fh.g f38662f0;
    public final boolean f38663g0;
    public float h;
    public int f38664h0;
    public final et f38665i0;
    public int f38666j0;
    public float f38667k0;
    public boolean f38668l0;
    public long m0;
    public boolean f38669n;
    public float f38670n0;
    public float f38671o0;
    public final pj0 f38672p0;
    public StaticLayout f38673r;
    public StaticLayout f38674s;
    public StaticLayout f38675w;
    public StaticLayout f38676x;
    public StaticLayout f38677y;

    public ui0(pj0 pj0Var, Context context, int i7) {
        super(context);
        int i10;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.f6 f6Var = pj0Var.f36981n2;
        this.f38672p0 = pj0Var;
        this.f38652a = true;
        this.f38654b = new RectF();
        this.f38656c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.D = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        this.J = new Path();
        this.K = new Path();
        this.L = new float[8];
        this.W = new int[2];
        this.f38665i0 = new et(this, 11);
        this.f38671o0 = 1.0f;
        this.R = i7;
        if (i7 == 0) {
            textPaint.setTextSize(org.telegram.messenger.g0.L(45.0f));
            this.f38663g0 = org.telegram.messenger.id.f23157a0;
        } else {
            this.f38663g0 = false;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            int i11 = org.telegram.ui.ActionBar.k6.f27852d6;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
            Drawable mutate = context.getDrawable(2131230910).mutate();
            this.f38658d0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, f6Var), -1), PorterDuff.Mode.MULTIPLY));
        }
        for (int i12 = 0; i12 < 8; i12++) {
            this.L[i12] = org.telegram.messenger.g0.L(44.0f);
        }
        if (this.f38663g0) {
            f10 = 10.0f;
        } else {
            if (i7 == 0) {
                i10 = 132;
            } else {
                i10 = 240;
            }
            f10 = i10 - 15;
        }
        int L = org.telegram.messenger.g0.L(f10);
        this.Q = L;
        if (pj0Var.b1()) {
            if (this.f38663g0) {
                f11 = -4.0f;
            } else {
                f11 = 6.0f;
            }
            this.Q = org.telegram.messenger.g0.L(f11) + L;
        }
        d();
        setFocusableInTouchMode(true);
        this.f38655b0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f38657c0 = context.getDrawable(2131231068);
    }

    public final void a(dh.c cVar, gh.e eVar) {
        pj0 pj0Var = this.f38672p0;
        fh.g c10 = cVar.c(pj0Var.f36963d1, eVar, false);
        this.f38660e0 = c10;
        c10.q(org.telegram.messenger.g0.L(4.0f));
        this.f38660e0.r(org.telegram.messenger.g0.L(24.0f));
        fh.g c11 = cVar.c(pj0Var.f36963d1, eVar, false);
        this.f38662f0 = c11;
        c11.q(org.telegram.messenger.g0.L(6.0f));
        this.f38662f0.u(org.telegram.messenger.g0.L(4.0f));
        this.f38662f0.r(org.telegram.messenger.g0.L(14.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28018m7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28000l7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28035n7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27852d6));
    }

    public final void b(boolean z9) {
        pj0 pj0Var = this.f38672p0;
        v4.n0 layoutManager = pj0Var.getLayoutManager();
        if (layoutManager instanceof v4.b0) {
            v4.b0 b0Var = (v4.b0) layoutManager;
            boolean z10 = true;
            if (b0Var.f57012o == 1) {
                v4.g0 adapter = pj0Var.getAdapter();
                if (adapter instanceof vi0) {
                    vi0 vi0Var = (vi0) adapter;
                    float f10 = this.f38659e;
                    int[] iArr = this.W;
                    vi0Var.G(pj0Var, f10, iArr);
                    if (z9) {
                        b0Var.h1(iArr[0], (-iArr[1]) + pj0Var.f36994u1);
                    }
                    String F = vi0Var.F(iArr[0]);
                    if (F == null) {
                        StaticLayout staticLayout = this.f38673r;
                        if (staticLayout != null) {
                            this.f38674s = staticLayout;
                        }
                        this.f38673r = null;
                    } else if (!F.equals(this.I)) {
                        this.I = F;
                        int i7 = this.R;
                        TextPaint textPaint = this.H;
                        if (i7 == 0) {
                            this.f38673r = new StaticLayout(F, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.f38675w = this.f38673r;
                            int measureText = ((int) textPaint.measureText(F)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.f38673r = new StaticLayout(F, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                            if (this.f38675w != null) {
                                String[] split = F.split(" ");
                                String[] split2 = this.f38675w.getText().toString().split(" ");
                                if (split != null && split2 != null && split.length == 2 && split2.length == 2 && split[1].equals(split2[1])) {
                                    String charSequence = this.f38675w.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.setSpan(new iy(false), split2[0].length(), charSequence.length(), 0);
                                    this.f38675w = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(charSequence)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(F);
                                    spannableStringBuilder2.setSpan(new iy(false), split[0].length(), F.length(), 0);
                                    this.f38676x = new StaticLayout(spannableStringBuilder2, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(F);
                                    spannableStringBuilder3.setSpan(new iy(false), 0, split[0].length(), 0);
                                    this.f38677y = new StaticLayout(spannableStringBuilder3, textPaint, measureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.f38676x = this.f38673r;
                                    this.f38677y = null;
                                }
                                this.G = this.f38675w.getWidth();
                                this.D = 0.0f;
                                if (getProgress() <= this.F) {
                                    z10 = false;
                                }
                                this.E = z10;
                            }
                            this.F = getProgress();
                        }
                        this.f38674s = null;
                        if (this.f38673r.getLineCount() > 0) {
                            this.f38673r.getLineWidth(0);
                            this.f38673r.getLineLeft(0);
                            if (this.f38663g0) {
                                this.M = (((org.telegram.messenger.g0.L(88.0f) - this.f38673r.getLineWidth(0)) / 2.0f) + org.telegram.messenger.g0.L(10.0f)) - this.f38673r.getLineLeft(0);
                            } else {
                                this.M = ((org.telegram.messenger.g0.L(88.0f) - this.f38673r.getLineWidth(0)) / 2.0f) - this.f38673r.getLineLeft(0);
                            }
                            this.N = (org.telegram.messenger.g0.L(88.0f) - this.f38673r.getHeight()) / 2;
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
        et etVar = this.f38665i0;
        org.telegram.messenger.g0.r(etVar);
        org.telegram.messenger.g0.i3(etVar, 2000L);
    }

    public final void d() {
        int o4;
        pj0 pj0Var = this.f38672p0;
        int i7 = this.R;
        if (i7 == 0) {
            o4 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28018m7, pj0Var.f36981n2);
        } else {
            o4 = i0.a.o(-16777216, 102);
        }
        this.S = o4;
        this.T = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28000l7, pj0Var.f36981n2);
        this.f38656c.setColor(this.S);
        TextPaint textPaint = this.H;
        if (i7 == 0) {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28035n7, pj0Var.f36981n2));
        } else {
            textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, pj0Var.f36981n2));
        }
        invalidate();
    }

    @Override
    public float getAlpha() {
        return this.f38671o0;
    }

    public float getProgress() {
        return this.f38659e;
    }

    public int getScrollBarY() {
        return org.telegram.messenger.g0.L(17.0f) + ((int) Math.ceil((getMeasuredHeight() - org.telegram.messenger.g0.L(54.0f)) * this.f38659e));
    }

    @Override
    public final boolean isPressed() {
        return this.f38669n;
    }

    @Override
    public final void layout(int i7, int i10, int i11, int i12) {
        if (!this.f38672p0.H1) {
            return;
        }
        super.layout(i7, i10, i11, i12);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        char c10;
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
        if (this.f38652a) {
            i7 = getPaddingTop();
        } else {
            i7 = 0;
        }
        int ceil = i7 + ((int) Math.ceil(((getMeasuredHeight() - i7) - org.telegram.messenger.g0.L(54.0f)) * this.f38659e));
        int i13 = this.Q;
        float f17 = i13;
        RectF rectF = this.f38654b;
        rectF.set(f17, org.telegram.messenger.g0.L(12.0f) + ceil, org.telegram.messenger.g0.L(5.0f) + i13, org.telegram.messenger.g0.L(42.0f) + ceil);
        int i14 = this.R;
        Paint paint = this.f38656c;
        if (i14 == 0) {
            f10 = 36.0f;
            f11 = 8.0f;
            paint.setColor(i0.a.f(this.O, this.S, this.T));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint);
            c10 = 2;
            f12 = 24.0f;
            f13 = 4.0f;
            i10 = 0;
        } else {
            f10 = 36.0f;
            f11 = 8.0f;
            int i15 = org.telegram.ui.ActionBar.k6.f27852d6;
            pj0 pj0Var = this.f38672p0;
            c10 = 2;
            paint.setColor(i0.a.f(0.1f, org.telegram.ui.ActionBar.k6.w0(i15, pj0Var.f36981n2), -1));
            float L3 = org.telegram.messenger.g0.L(27.0f) + ceil;
            fh.g gVar = this.f38660e0;
            if (gVar != null) {
                f12 = 24.0f;
                f13 = 4.0f;
                gVar.setBounds(org.telegram.messenger.g0.L(-20.0f) + i13, org.telegram.messenger.g0.L(-1.0f) + ceil, org.telegram.messenger.g0.L(36.0f) + i13, org.telegram.messenger.g0.L(55.0f) + ceil);
                this.f38660e0.draw(canvas);
                i10 = 0;
            } else {
                f12 = 24.0f;
                f13 = 4.0f;
                int measuredWidth = getMeasuredWidth();
                Drawable drawable = this.f38657c0;
                i10 = 0;
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (L3 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (L3 + (drawable.getIntrinsicHeight() / 2)));
                drawable.draw(canvas);
                canvas.drawCircle(org.telegram.messenger.g0.L(8.0f) + i13, org.telegram.messenger.g0.L(27.0f) + ceil, org.telegram.messenger.g0.L(24.0f), paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, pj0Var.f36981n2));
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(f13) + i13, (org.telegram.messenger.g0.L(2.0f) * this.O) + org.telegram.messenger.g0.L(34.0f) + ceil);
            Path path = this.K;
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(f13) + i13, (org.telegram.messenger.g0.L(f12) + ceil) - (org.telegram.messenger.g0.L(2.0f) * this.O));
            canvas.rotate(180.0f, 0.0f, -org.telegram.messenger.g0.L(2.0f));
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        if (i14 == 0) {
            if (this.f38668l0 || this.O != 0.0f) {
                paint.setAlpha((int) (this.O * 255.0f));
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
                boolean z9 = this.f38663g0;
                Path path2 = this.J;
                float[] fArr = this.L;
                if ((z9 && (fArr[i10] != L || fArr[6] != L2)) || (!z9 && (fArr[c10] != L || fArr[4] != L2))) {
                    if (z9) {
                        fArr[1] = L;
                        fArr[i10] = L;
                        fArr[7] = L2;
                        fArr[6] = L2;
                    } else {
                        fArr[3] = L;
                        fArr[c10] = L;
                        fArr[5] = L2;
                        fArr[4] = L2;
                    }
                    path2.reset();
                    if (z9) {
                        f15 = org.telegram.messenger.g0.L(10.0f);
                    } else {
                        f15 = 0.0f;
                    }
                    if (z9) {
                        f16 = 98.0f;
                    } else {
                        f16 = 88.0f;
                    }
                    rectF.set(f15, 0.0f, org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(88.0f));
                    path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                    path2.close();
                }
                StaticLayout staticLayout = this.f38673r;
                if (staticLayout == null) {
                    staticLayout = this.f38674s;
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
        } else if (i14 == 1) {
            if (this.f38673r != null && this.V != 0.0f) {
                canvas.save();
                float f19 = (this.V * 0.3f) + 0.7f;
                canvas.scale(f19, f19, rectF.right - org.telegram.messenger.g0.L(12.0f), rectF.centerY());
                float centerY = rectF.centerY();
                float L6 = (rectF.left - (org.telegram.messenger.g0.L(30.0f) * this.O)) - org.telegram.messenger.g0.L(f11);
                this.f38673r.getHeight();
                org.telegram.messenger.g0.L(6.0f);
                rectF.set((L6 - (((1.0f - this.D) * this.G) + (this.D * this.f38673r.getWidth()))) - org.telegram.messenger.g0.L(f10), (centerY - (this.f38673r.getHeight() / 2.0f)) - org.telegram.messenger.g0.L(f11), L6 - org.telegram.messenger.g0.L(12.0f), (this.f38673r.getHeight() / 2.0f) + centerY + org.telegram.messenger.g0.L(f11));
                Paint paint2 = this.d;
                int alpha = paint2.getAlpha();
                TextPaint textPaint = this.H;
                int alpha2 = textPaint.getAlpha();
                paint2.setAlpha((int) (alpha * this.V));
                if (this.f38662f0 != null) {
                    Rect rect = org.telegram.messenger.g0.Q;
                    rectF.round(rect);
                    rect.inset(-org.telegram.messenger.g0.L(f13), -org.telegram.messenger.g0.L(f13));
                    this.f38662f0.setBounds(rect);
                    this.f38662f0.setAlpha((int) (this.V * 255.0f));
                    this.f38662f0.draw(canvas);
                } else {
                    Drawable drawable2 = this.f38658d0;
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
                    rectF.inset(org.telegram.messenger.g0.L(f13), org.telegram.messenger.g0.L(2.0f));
                    canvas.clipRect(rectF);
                    if (this.f38675w != null) {
                        textPaint.setAlpha((int) ((1.0f - this.D) * alpha2 * this.V));
                        canvas.save();
                        float width = (L6 - this.f38675w.getWidth()) - org.telegram.messenger.g0.L(f12);
                        float height = centerY - (this.f38675w.getHeight() / 2.0f);
                        if (this.E) {
                            i12 = -1;
                        } else {
                            i12 = 1;
                        }
                        canvas.translate(width, (org.telegram.messenger.g0.L(15.0f) * i12 * this.D) + height);
                        this.f38675w.draw(canvas);
                        canvas.restore();
                    }
                    if (this.f38676x != null) {
                        textPaint.setAlpha((int) (alpha2 * this.V * this.D));
                        canvas.save();
                        float width2 = (L6 - this.f38676x.getWidth()) - org.telegram.messenger.g0.L(f12);
                        float height2 = centerY - (this.f38676x.getHeight() / 2.0f);
                        if (this.E) {
                            i11 = 1;
                        } else {
                            i11 = -1;
                        }
                        canvas.translate(width2, com.google.android.recaptcha.internal.a.z(1.0f, this.D, org.telegram.messenger.g0.L(15.0f) * i11, height2));
                        this.f38676x.draw(canvas);
                        canvas.restore();
                    }
                    if (this.f38677y != null) {
                        textPaint.setAlpha((int) (alpha2 * this.V));
                        canvas.save();
                        canvas.translate((L6 - this.f38677y.getWidth()) - org.telegram.messenger.g0.L(f12), centerY - (this.f38677y.getHeight() / 2.0f));
                        this.f38677y.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                } else {
                    textPaint.setAlpha((int) (alpha2 * this.V));
                    canvas.save();
                    canvas.translate((L6 - this.f38673r.getWidth()) - org.telegram.messenger.g0.L(f12), com.google.android.recaptcha.internal.a.z(1.0f, this.D, org.telegram.messenger.g0.L(15.0f), centerY - (this.f38673r.getHeight() / 2.0f)));
                    this.f38673r.draw(canvas);
                    canvas.restore();
                }
                paint2.setAlpha(alpha);
                textPaint.setAlpha(alpha2);
                canvas.restore();
            } else {
                fh.g gVar2 = this.f38662f0;
                if (gVar2 != null) {
                    gVar2.setAlpha(i10);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.P;
        if (j3 < 0 || j3 > 17) {
            j3 = 17;
        }
        boolean z10 = this.f38668l0;
        if ((z10 && this.f38673r != null && this.O < 1.0f) || ((!z10 || this.f38673r == null) && this.O > 0.0f)) {
            this.P = currentTimeMillis;
            invalidate();
            if (this.f38668l0 && this.f38673r != null) {
                float f22 = (((float) j3) / 120.0f) + this.O;
                this.O = f22;
                if (f22 > 1.0f) {
                    this.O = 1.0f;
                }
            } else {
                float f23 = this.O - (((float) j3) / 120.0f);
                this.O = f23;
                if (f23 < 0.0f) {
                    this.O = 0.0f;
                }
            }
        }
        boolean z11 = this.U;
        if (z11) {
            float f24 = this.V;
            if (f24 != 1.0f) {
                float f25 = (((float) j3) / 120.0f) + f24;
                this.V = f25;
                if (f25 > 1.0f) {
                    this.V = 1.0f;
                }
                invalidate();
                return;
            }
        }
        if (!z11) {
            float f26 = this.V;
            if (f26 != 0.0f) {
                float f27 = f26 - (((float) j3) / 120.0f);
                this.V = f27;
                if (f27 < 0.0f) {
                    this.V = 0.0f;
                }
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.R == 0) {
            f10 = 132.0f;
        } else {
            f10 = 240.0f;
        }
        setMeasuredDimension(org.telegram.messenger.g0.L(f10), View.MeasureSpec.getSize(i10));
        Path path = this.K;
        path.reset();
        path.setLastPoint(0.0f, 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        path.lineTo(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
        path.close();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ui0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        if (this.f38671o0 != f10) {
            this.f38671o0 = f10;
            super.setAlpha(f10 * this.f38670n0);
        }
    }

    public void setIsVisible(boolean z9) {
        float f10;
        if (this.f38653a0 != z9) {
            this.f38653a0 = z9;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f38670n0 = f10;
            super.setAlpha(this.f38671o0 * f10);
        }
    }

    public void setProgress(float f10) {
        this.f38659e = f10;
        invalidate();
    }

    public void setVisibilityAlpha(float f10) {
        if (this.f38670n0 != f10) {
            this.f38670n0 = f10;
            super.setAlpha(this.f38671o0 * f10);
        }
    }

    @Override
    public final void updateColors() {
        int f10;
        try {
            d();
            if (this.R != 0) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, this.f38672p0.f36981n2);
                this.d.setColor(w02);
                Drawable drawable = this.f38658d0;
                if (drawable != null && (f10 = i0.a.f(0.1f, w02, -1)) != this.f38666j0) {
                    this.f38666j0 = f10;
                    drawable.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
