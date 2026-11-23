package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
public final class l51 implements if0 {
    public final float A;
    public final bn B;
    public final LinearGradient C;
    public final float D;
    public final h2.f E;
    public final org.telegram.messenger.dj F;
    public final NinePatchDrawable G;
    public final rj H;
    public final org.telegram.ui.Components.u5 I;
    public float J;
    public float K;
    public final float L;
    public final int M;
    public final int N;
    public final org.telegram.ui.ActionBar.h6 O;
    public final PointF P;
    public final RectF Q;
    public final RectF R;
    public float[] S;
    public final float T;
    public float f49481a;
    public final Paint f49482b;
    public final boolean f49483c;
    public final ValueAnimator d;
    public final float f49484e;
    public final float f49485f;
    public final float f49486g;
    public final int h;
    public final int f49487i;
    public final float f49488j;
    public final org.telegram.messenger.gj f49489k;
    public final float f49490l;
    public final float f49491m;
    public final boolean f49492n;
    public final boolean f49493o;
    public final boolean f49494p;
    public final StaticLayout f49495q;
    public final StaticLayout f49496r;
    public final org.telegram.ui.Cells.r1 f49497s;
    public final org.telegram.ui.Components.ek0 f49498t;
    public final org.telegram.ui.Components.ti f49499u;
    public final Matrix v;
    public final Paint f49500w;
    public final int f49501x;
    public final float f49502y;
    public final float f49503z;

    public l51(org.telegram.ui.Cells.r1 r1Var, bn bnVar, org.telegram.ui.Components.ek0 ek0Var, org.telegram.ui.Components.ti tiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        boolean z10;
        float f10;
        boolean z11;
        int i7;
        float f11;
        float f12;
        int i10;
        int i11;
        boolean z12;
        org.telegram.ui.ActionBar.u4 M1;
        int i12;
        Object[] spans;
        boolean z13;
        Paint paint = new Paint(1);
        this.f49482b = paint;
        this.E = new h2.f((int[]) null);
        PointF pointF = new PointF();
        this.P = pointF;
        this.Q = new RectF();
        this.R = new RectF();
        this.O = h6Var;
        if (r1Var.getMessageObject().B2 != null && r1Var.getMessageObject().B2.size() <= 1 && !r1Var.getMessageObject().B2.isEmpty() && ((org.telegram.messenger.dj) r1Var.getMessageObject().B2.get(0)).f23561e.getLineCount() <= 10) {
            this.f49497s = r1Var;
            this.f49498t = ek0Var;
            this.f49499u = tiVar;
            this.B = bnVar;
            rj rjVar = bnVar.f45950a0;
            this.H = rjVar;
            if (rjVar != null && rjVar.getEditField() != null && rjVar.getEditField().getLayout() != null) {
                rjVar.getRecordCircle();
                paint.setFilterBitmap(true);
                this.f49489k = r1Var.getMessageObject();
                if (!r1Var.getTransitionParams().f32469w0) {
                    r1Var.draw(new Canvas());
                }
                r1Var.setEnterTransitionInProgress(true);
                Editable editText = rjVar.getEditText();
                CharSequence charSequence = r1Var.getMessageObject().v;
                this.f49492n = false;
                if (rjVar.t6 != 0 && SystemClock.uptimeMillis() - rjVar.t6 < 1500) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f49493o = z10;
                rjVar.getEditField().getLayout().getHeight();
                TextPaint textPaint = org.telegram.ui.ActionBar.m6.f29578o2;
                org.telegram.messenger.g0.L(20.0f);
                if (r1Var.getMessageObject().P1 != 0) {
                    if (r1Var.getMessageObject().P1 == r1Var.getMessageObject().Q1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    f10 = 4.0f;
                    switch (Math.max(r1Var.getMessageObject().P1, r1Var.getMessageObject().Q1)) {
                        case 0:
                        case 1:
                        case 2:
                            if (z13) {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[0];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[2];
                                break;
                            }
                        case 3:
                            if (z13) {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[1];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[3];
                                break;
                            }
                        case 4:
                            if (z13) {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[2];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[4];
                                break;
                            }
                        case 5:
                            if (z13) {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[3];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[5];
                                break;
                            }
                        case 6:
                            if (z13) {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[4];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f29769y2[5];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.m6.f29769y2[5];
                            break;
                    }
                    if (textPaint != null) {
                        textPaint.getTextSize();
                        org.telegram.messenger.g0.L(4.0f);
                    }
                } else {
                    f10 = 4.0f;
                }
                if ((charSequence instanceof Spannable) && (spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) != null && spans.length > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (editText.length() == charSequence.length() && !z11) {
                    i7 = 0;
                } else {
                    this.f49492n = true;
                    int[] iArr = new int[1];
                    CharSequence N3 = org.telegram.messenger.g0.N3(editText, iArr);
                    if (iArr[0] > 0) {
                        i7 = rjVar.getEditField().getLayout().getLineTop(rjVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        rjVar.getEditField().getLayout().getLineBottom(rjVar.getEditField().getLayout().getLineForOffset(N3.length() + iArr[0]));
                    } else {
                        i7 = 0;
                    }
                    org.telegram.ui.Components.y5.cloneSpans(charSequence);
                    charSequence = org.telegram.messenger.j6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
                }
                float textSize = rjVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.D = textSize;
                int lineCount = rjVar.getEditField().getLayout().getLineCount();
                int width = (int) (rjVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f49495q = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.f49495q = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.I = org.telegram.ui.Components.y5.update(2, (View) null, this.I, this.f49495q);
                jh.k.b(rjVar.getEditField(), bnVar.f46111m1, pointF);
                float f13 = pointF.y;
                this.f49503z = pointF.x;
                this.A = ((org.telegram.messenger.g0.L(10.0f) + f13) - rjVar.getEditField().getScrollY()) + i7;
                float f14 = 0.0f;
                this.f49490l = 0.0f;
                float f15 = Float.MAX_VALUE;
                for (int i13 = 0; i13 < this.f49495q.getLineCount(); i13++) {
                    float lineLeft = this.f49495q.getLineLeft(i13);
                    if (lineLeft < f15) {
                        f15 = lineLeft;
                    }
                }
                if (f15 != Float.MAX_VALUE) {
                    this.f49490l = f15;
                }
                this.f49495q.getHeight();
                float L = org.telegram.messenger.g0.L(f10) + f13;
                this.f49488j = L;
                float f16 = 12.0f;
                if (this.H.Z0()) {
                    this.f49488j = L - org.telegram.messenger.g0.L(12.0f);
                }
                this.f49502y = f13 + rjVar.getEditField().getMeasuredHeight();
                org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) r1Var.getMessageObject().B2.get(0);
                this.F = djVar;
                StaticLayout staticLayout = djVar.f23561e;
                int i14 = org.telegram.ui.ActionBar.m6.Wc;
                double h = i0.a.h(org.telegram.ui.ActionBar.m6.w0(i14, this.O));
                int i15 = org.telegram.ui.ActionBar.m6.Le;
                if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.m6.w0(i15, this.O))) > 0.20000000298023224d) {
                    this.f49492n = true;
                    this.f49494p = true;
                }
                this.M = org.telegram.ui.ActionBar.m6.w0(i15, this.O);
                this.N = org.telegram.ui.ActionBar.m6.w0(i14, this.O);
                if (staticLayout.getLineCount() == this.f49495q.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i16 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i16 < lineCount) {
                            f12 = f16;
                            StaticLayout staticLayout2 = this.f49495q;
                            f11 = f14;
                            if (staticLayout2.getLineRight(i16) == staticLayout2.getWidth() && staticLayout2.getLineLeft(i16) != f11) {
                                i11++;
                            } else {
                                i10++;
                            }
                            if (staticLayout.getLineEnd(i16) != this.f49495q.getLineEnd(i16)) {
                                this.f49492n = true;
                            } else {
                                i16++;
                                f16 = f12;
                                f14 = f11;
                            }
                        } else {
                            f11 = f14;
                            f12 = f16;
                        }
                    }
                } else {
                    f11 = 0.0f;
                    f12 = 12.0f;
                    this.f49492n = true;
                    i10 = 0;
                    i11 = 0;
                }
                if (!this.f49492n && i11 > 0 && i10 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    float f17 = Float.MAX_VALUE;
                    int i17 = 0;
                    while (i17 < lineCount) {
                        StaticLayout staticLayout3 = this.f49495q;
                        if (staticLayout3.getLineRight(i17) == staticLayout3.getWidth() && staticLayout3.getLineLeft(i17) != f11) {
                            i12 = lineCount;
                            spannableString.setSpan(new org.telegram.ui.Components.uy(false), this.f49495q.getLineStart(i17), this.f49495q.getLineEnd(i17), 0);
                            float lineLeft2 = this.f49495q.getLineLeft(i17);
                            if (lineLeft2 < f17) {
                                f17 = lineLeft2;
                            }
                        } else {
                            i12 = lineCount;
                            spannableString2.setSpan(new org.telegram.ui.Components.uy(false), this.f49495q.getLineStart(i17), this.f49495q.getLineEnd(i17), 0);
                        }
                        i17++;
                        lineCount = i12;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.f49495q = hyphenationFrequency.setAlignment(alignment).build();
                        this.f49496r = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.f49495q = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.f49496r = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.f49491m = this.f49495q.getWidth() - ((org.telegram.messenger.dj) r1Var.getMessageObject().B2.get(0)).f23561e.getWidth();
                if (r1Var.getMessageObject().N1() != 0 && r1Var.Q7 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f49483c = z12;
                if (z12) {
                    org.telegram.ui.ActionBar.m5 m5Var = ((org.telegram.ui.Components.so[]) bnVar.f45979c0.f3595b)[0].f39638c;
                    jh.k.b(m5Var, bnVar.f46111m1, this.P);
                    PointF pointF2 = this.P;
                    this.f49484e = pointF2.x;
                    this.f49486g = pointF2.y;
                    this.f49485f = ((View) m5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.m5 m5Var2 = ((org.telegram.ui.Components.so[]) bnVar.f45979c0.f3595b)[0].d;
                    jh.k.b(m5Var2, bnVar.f46111m1, this.P);
                    float f18 = this.P.y;
                    this.h = m5Var.getTextColor();
                    this.f49487i = m5Var2.getTextColor();
                    this.f49488j -= org.telegram.messenger.g0.L(46.0f);
                }
                this.T = ek0Var.getPaddingBottom() - (bnVar.f45963ad - rjVar.getRestingFieldHeight());
                this.v = new Matrix();
                Paint paint2 = new Paint(1);
                this.f49500w = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(f12), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.C = linearGradient;
                paint2.setShader(linearGradient);
                this.f49501x = r1Var.getMessageObject().f24223m1;
                float f19 = f11;
                rjVar.getEditField().setAlpha(f19);
                rjVar.setTextTransitionIsRunning(true);
                StaticLayout staticLayout4 = r1Var.Q7;
                if (staticLayout4 != null && staticLayout4.getText().length() > 1 && r1Var.Q7.getPrimaryHorizontal(0) != f19) {
                    this.L = r1Var.Q7.getWidth() - r1Var.Q7.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new ss0(this, rjVar, tiVar, 1));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) tiVar.f39920c).add(this);
                tiVar.a();
                ((ViewGroup) tiVar.d).invalidate();
                this.E.d();
                ofFloat.addListener(new org.telegram.ui.Components.w10(this, tiVar, r1Var, rjVar, bnVar));
                if (org.telegram.messenger.cz.o() == 2 && (M1 = r1Var.M1(true)) != null) {
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Je, this.O);
                    Rect rect = M1.f30093o;
                    if (M1.F == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(M1.b(50.0f), M1.b(40.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rect.set(M1.getBounds());
                        Paint paint3 = new Paint(1);
                        paint3.setColor(-1);
                        M1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        M1.c(canvas, paint3);
                        M1.F = new NinePatchDrawable(createBitmap, c8.q0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
                        M1.setBounds(rect);
                    }
                    if (M1.G != w02) {
                        M1.G = w02;
                        M1.F.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                    }
                    this.G = M1.F;
                }
            }
        }
    }

    @Override
    public final void a(android.graphics.Canvas r62) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l51.a(android.graphics.Canvas):void");
    }

    public final int b(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.O);
    }
}
