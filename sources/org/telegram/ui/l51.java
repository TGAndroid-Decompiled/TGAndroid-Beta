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
public final class l51 implements jf0 {
    public final float A;
    public final bn B;
    public final LinearGradient C;
    public final float D;
    public final h2.f E;
    public final org.telegram.messenger.cj F;
    public final NinePatchDrawable G;
    public final rj H;
    public final org.telegram.ui.Components.t5 I;
    public float J;
    public float K;
    public final float L;
    public final int M;
    public final int N;
    public final org.telegram.ui.ActionBar.i6 O;
    public final PointF P;
    public final RectF Q;
    public final RectF R;
    public float[] S;
    public final float T;
    public float f49439a;
    public final Paint f49440b;
    public final boolean f49441c;
    public final ValueAnimator d;
    public final float f49442e;
    public final float f49443f;
    public final float f49444g;
    public final int h;
    public final int f49445i;
    public final float f49446j;
    public final org.telegram.messenger.fj f49447k;
    public final float f49448l;
    public final float f49449m;
    public final boolean f49450n;
    public final boolean f49451o;
    public final boolean f49452p;
    public final StaticLayout f49453q;
    public final StaticLayout f49454r;
    public final org.telegram.ui.Cells.r1 f49455s;
    public final org.telegram.ui.Components.ck0 f49456t;
    public final org.telegram.ui.Components.ri f49457u;
    public final Matrix v;
    public final Paint f49458w;
    public final int f49459x;
    public final float f49460y;
    public final float f49461z;

    public l51(org.telegram.ui.Cells.r1 r1Var, bn bnVar, org.telegram.ui.Components.ck0 ck0Var, org.telegram.ui.Components.ri riVar, org.telegram.ui.ActionBar.i6 i6Var) {
        boolean z10;
        float f10;
        boolean z11;
        int i7;
        float f11;
        float f12;
        int i10;
        int i11;
        boolean z12;
        org.telegram.ui.ActionBar.v4 M1;
        int i12;
        Object[] spans;
        boolean z13;
        Paint paint = new Paint(1);
        this.f49440b = paint;
        this.E = new h2.f((int[]) null);
        PointF pointF = new PointF();
        this.P = pointF;
        this.Q = new RectF();
        this.R = new RectF();
        this.O = i6Var;
        if (r1Var.getMessageObject().B2 != null && r1Var.getMessageObject().B2.size() <= 1 && !r1Var.getMessageObject().B2.isEmpty() && ((org.telegram.messenger.cj) r1Var.getMessageObject().B2.get(0)).f23361e.getLineCount() <= 10) {
            this.f49455s = r1Var;
            this.f49456t = ck0Var;
            this.f49457u = riVar;
            this.B = bnVar;
            rj rjVar = bnVar.f45923a0;
            this.H = rjVar;
            if (rjVar != null && rjVar.getEditField() != null && rjVar.getEditField().getLayout() != null) {
                rjVar.getRecordCircle();
                paint.setFilterBitmap(true);
                this.f49447k = r1Var.getMessageObject();
                if (!r1Var.getTransitionParams().f32438w0) {
                    r1Var.draw(new Canvas());
                }
                r1Var.setEnterTransitionInProgress(true);
                Editable editText = rjVar.getEditText();
                CharSequence charSequence = r1Var.getMessageObject().v;
                this.f49450n = false;
                if (rjVar.f32676r6 != 0 && SystemClock.uptimeMillis() - rjVar.f32676r6 < 1500) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f49451o = z10;
                rjVar.getEditField().getLayout().getHeight();
                TextPaint textPaint = org.telegram.ui.ActionBar.n6.f29591o2;
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
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[0];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[2];
                                break;
                            }
                        case 3:
                            if (z13) {
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[1];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[3];
                                break;
                            }
                        case 4:
                            if (z13) {
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[2];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[4];
                                break;
                            }
                        case 5:
                            if (z13) {
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[3];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[5];
                                break;
                            }
                        case 6:
                            if (z13) {
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[4];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.n6.f29782y2[5];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.n6.f29782y2[5];
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
                    this.f49450n = true;
                    int[] iArr = new int[1];
                    CharSequence N3 = org.telegram.messenger.g0.N3(editText, iArr);
                    if (iArr[0] > 0) {
                        i7 = rjVar.getEditField().getLayout().getLineTop(rjVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        rjVar.getEditField().getLayout().getLineBottom(rjVar.getEditField().getLayout().getLineForOffset(N3.length() + iArr[0]));
                    } else {
                        i7 = 0;
                    }
                    org.telegram.ui.Components.x5.cloneSpans(charSequence);
                    charSequence = org.telegram.messenger.j6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
                }
                float textSize = rjVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.D = textSize;
                int lineCount = rjVar.getEditField().getLayout().getLineCount();
                int width = (int) (rjVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f49453q = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.f49453q = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.I = org.telegram.ui.Components.x5.update(2, (View) null, this.I, this.f49453q);
                jh.k.b(rjVar.getEditField(), bnVar.f46084m1, pointF);
                float f13 = pointF.y;
                this.f49461z = pointF.x;
                this.A = ((org.telegram.messenger.g0.L(10.0f) + f13) - rjVar.getEditField().getScrollY()) + i7;
                float f14 = 0.0f;
                this.f49448l = 0.0f;
                float f15 = Float.MAX_VALUE;
                for (int i13 = 0; i13 < this.f49453q.getLineCount(); i13++) {
                    float lineLeft = this.f49453q.getLineLeft(i13);
                    if (lineLeft < f15) {
                        f15 = lineLeft;
                    }
                }
                if (f15 != Float.MAX_VALUE) {
                    this.f49448l = f15;
                }
                this.f49453q.getHeight();
                float L = org.telegram.messenger.g0.L(f10) + f13;
                this.f49446j = L;
                float f16 = 12.0f;
                if (this.H.V0()) {
                    this.f49446j = L - org.telegram.messenger.g0.L(12.0f);
                }
                this.f49460y = f13 + rjVar.getEditField().getMeasuredHeight();
                org.telegram.messenger.cj cjVar = (org.telegram.messenger.cj) r1Var.getMessageObject().B2.get(0);
                this.F = cjVar;
                StaticLayout staticLayout = cjVar.f23361e;
                int i14 = org.telegram.ui.ActionBar.n6.Wc;
                double h = i0.a.h(org.telegram.ui.ActionBar.n6.w0(i14, this.O));
                int i15 = org.telegram.ui.ActionBar.n6.Le;
                if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.n6.w0(i15, this.O))) > 0.20000000298023224d) {
                    this.f49450n = true;
                    this.f49452p = true;
                }
                this.M = org.telegram.ui.ActionBar.n6.w0(i15, this.O);
                this.N = org.telegram.ui.ActionBar.n6.w0(i14, this.O);
                if (staticLayout.getLineCount() == this.f49453q.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i16 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i16 < lineCount) {
                            f12 = f16;
                            StaticLayout staticLayout2 = this.f49453q;
                            f11 = f14;
                            if (staticLayout2.getLineRight(i16) == staticLayout2.getWidth() && staticLayout2.getLineLeft(i16) != f11) {
                                i11++;
                            } else {
                                i10++;
                            }
                            if (staticLayout.getLineEnd(i16) != this.f49453q.getLineEnd(i16)) {
                                this.f49450n = true;
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
                    this.f49450n = true;
                    i10 = 0;
                    i11 = 0;
                }
                if (!this.f49450n && i11 > 0 && i10 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    float f17 = Float.MAX_VALUE;
                    int i17 = 0;
                    while (i17 < lineCount) {
                        StaticLayout staticLayout3 = this.f49453q;
                        if (staticLayout3.getLineRight(i17) == staticLayout3.getWidth() && staticLayout3.getLineLeft(i17) != f11) {
                            i12 = lineCount;
                            spannableString.setSpan(new org.telegram.ui.Components.sy(false), this.f49453q.getLineStart(i17), this.f49453q.getLineEnd(i17), 0);
                            float lineLeft2 = this.f49453q.getLineLeft(i17);
                            if (lineLeft2 < f17) {
                                f17 = lineLeft2;
                            }
                        } else {
                            i12 = lineCount;
                            spannableString2.setSpan(new org.telegram.ui.Components.sy(false), this.f49453q.getLineStart(i17), this.f49453q.getLineEnd(i17), 0);
                        }
                        i17++;
                        lineCount = i12;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.f49453q = hyphenationFrequency.setAlignment(alignment).build();
                        this.f49454r = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.f49453q = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.f49454r = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.f49449m = this.f49453q.getWidth() - ((org.telegram.messenger.cj) r1Var.getMessageObject().B2.get(0)).f23361e.getWidth();
                if (r1Var.getMessageObject().N1() != 0 && r1Var.Q7 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f49441c = z12;
                if (z12) {
                    org.telegram.ui.ActionBar.n5 n5Var = ((org.telegram.ui.Components.qo[]) bnVar.f45952c0.f3400b)[0].f38849c;
                    jh.k.b(n5Var, bnVar.f46084m1, this.P);
                    PointF pointF2 = this.P;
                    this.f49442e = pointF2.x;
                    this.f49444g = pointF2.y;
                    this.f49443f = ((View) n5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.n5 n5Var2 = ((org.telegram.ui.Components.qo[]) bnVar.f45952c0.f3400b)[0].d;
                    jh.k.b(n5Var2, bnVar.f46084m1, this.P);
                    float f18 = this.P.y;
                    this.h = n5Var.getTextColor();
                    this.f49445i = n5Var2.getTextColor();
                    this.f49446j -= org.telegram.messenger.g0.L(46.0f);
                }
                this.T = ck0Var.getPaddingBottom() - (bnVar.f45936ad - rjVar.getRestingFieldHeight());
                this.v = new Matrix();
                Paint paint2 = new Paint(1);
                this.f49458w = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(f12), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.C = linearGradient;
                paint2.setShader(linearGradient);
                this.f49459x = r1Var.getMessageObject().f23975m1;
                float f19 = f11;
                rjVar.getEditField().setAlpha(f19);
                rjVar.setTextTransitionIsRunning(true);
                StaticLayout staticLayout4 = r1Var.Q7;
                if (staticLayout4 != null && staticLayout4.getText().length() > 1 && r1Var.Q7.getPrimaryHorizontal(0) != f19) {
                    this.L = r1Var.Q7.getWidth() - r1Var.Q7.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new ss0(this, rjVar, riVar, 1));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) riVar.f39153c).add(this);
                riVar.a();
                ((ViewGroup) riVar.d).invalidate();
                this.E.d();
                ofFloat.addListener(new org.telegram.ui.Components.t10(this, riVar, r1Var, rjVar, bnVar));
                if (org.telegram.messenger.bz.o() == 2 && (M1 = r1Var.M1(true)) != null) {
                    int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Je, this.O);
                    Rect rect = M1.f30107o;
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
        return org.telegram.ui.ActionBar.n6.w0(i7, this.O);
    }
}
