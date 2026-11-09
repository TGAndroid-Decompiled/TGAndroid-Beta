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
public final class m51 implements hf0 {
    public final cn A;
    public final LinearGradient B;
    public final float C;
    public final h2.f D;
    public final org.telegram.messenger.fj E;
    public final NinePatchDrawable F;
    public final sj G;
    public final org.telegram.ui.Components.n5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.g6 N;
    public final PointF O;
    public final RectF P;
    public final RectF Q;
    public float[] R;
    public final float S;
    public float f47752a;
    public final Paint f47753b;
    public final boolean f47754c;
    public final ValueAnimator d;
    public final float f47755e;
    public final float f47756f;
    public final float f47757g;
    public final int h;
    public final int f47758i;
    public final float f47759j;
    public final org.telegram.messenger.ij f47760k;
    public final float f47761l;
    public final float f47762m;
    public final boolean f47763n;
    public final boolean f47764o;
    public final StaticLayout f47765p;
    public final StaticLayout f47766q;
    public final org.telegram.ui.Cells.q1 f47767r;
    public final org.telegram.ui.Components.qj0 f47768s;
    public final org.telegram.ui.Components.ci f47769t;
    public final Matrix f47770u;
    public final Paint v;
    public final int f47771w;
    public final float f47772x;
    public final float f47773y;
    public final float f47774z;

    public m51(org.telegram.ui.Cells.q1 q1Var, cn cnVar, org.telegram.ui.Components.qj0 qj0Var, org.telegram.ui.Components.ci ciVar, org.telegram.ui.ActionBar.g6 g6Var) {
        float f10;
        boolean z9;
        int i7;
        float f11;
        float f12;
        int i10;
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.t4 L1;
        int i12;
        Object[] spans;
        boolean z11;
        Paint paint = new Paint(1);
        this.f47753b = paint;
        this.D = new h2.f((int[]) null);
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = g6Var;
        if (q1Var.getMessageObject().f23321z2 != null && q1Var.getMessageObject().f23321z2.size() <= 1 && !q1Var.getMessageObject().f23321z2.isEmpty() && ((org.telegram.messenger.fj) q1Var.getMessageObject().f23321z2.get(0)).f22424e.getLineCount() <= 10) {
            this.f47767r = q1Var;
            this.f47768s = qj0Var;
            this.f47769t = ciVar;
            this.A = cnVar;
            sj sjVar = cnVar.Z;
            this.G = sjVar;
            if (sjVar != null && sjVar.getEditField() != null && sjVar.getEditField().getLayout() != null) {
                sjVar.getRecordCircle();
                paint.setFilterBitmap(true);
                this.f47760k = q1Var.getMessageObject();
                if (!q1Var.getTransitionParams().f30863w0) {
                    q1Var.draw(new Canvas());
                }
                q1Var.setEnterTransitionInProgress(true);
                Editable editText = sjVar.getEditText();
                CharSequence charSequence = q1Var.getMessageObject().v;
                this.f47763n = false;
                sjVar.getEditField().getLayout().getHeight();
                TextPaint textPaint = org.telegram.ui.ActionBar.l6.f28062o2;
                org.telegram.messenger.g0.L(20.0f);
                if (q1Var.getMessageObject().N1 != 0) {
                    if (q1Var.getMessageObject().N1 == q1Var.getMessageObject().O1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f10 = 4.0f;
                    switch (Math.max(q1Var.getMessageObject().N1, q1Var.getMessageObject().O1)) {
                        case 0:
                        case 1:
                        case 2:
                            if (z11) {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[0];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[2];
                                break;
                            }
                        case 3:
                            if (z11) {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[1];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[3];
                                break;
                            }
                        case 4:
                            if (z11) {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[2];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[4];
                                break;
                            }
                        case 5:
                            if (z11) {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[3];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[5];
                                break;
                            }
                        case 6:
                            if (z11) {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[4];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.l6.f28253y2[5];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.l6.f28253y2[5];
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
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (editText.length() == charSequence.length() && !z9) {
                    i7 = 0;
                } else {
                    this.f47763n = true;
                    int[] iArr = new int[1];
                    CharSequence P3 = org.telegram.messenger.g0.P3(editText, iArr);
                    if (iArr[0] > 0) {
                        i7 = sjVar.getEditField().getLayout().getLineTop(sjVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        sjVar.getEditField().getLayout().getLineBottom(sjVar.getEditField().getLayout().getLineForOffset(P3.length() + iArr[0]));
                    } else {
                        i7 = 0;
                    }
                    org.telegram.ui.Components.r5.cloneSpans(charSequence);
                    charSequence = org.telegram.messenger.i6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
                }
                float textSize = sjVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.C = textSize;
                int lineCount = sjVar.getEditField().getLayout().getLineCount();
                int width = (int) (sjVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f47765p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.f47765p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.H = org.telegram.ui.Components.r5.update(2, (View) null, this.H, this.f47765p);
                jh.k.b(sjVar.getEditField(), cnVar.l1, pointF);
                float f13 = pointF.y;
                this.f47773y = pointF.x;
                this.f47774z = ((org.telegram.messenger.g0.L(10.0f) + f13) - sjVar.getEditField().getScrollY()) + i7;
                float f14 = 0.0f;
                this.f47761l = 0.0f;
                float f15 = Float.MAX_VALUE;
                for (int i13 = 0; i13 < this.f47765p.getLineCount(); i13++) {
                    float lineLeft = this.f47765p.getLineLeft(i13);
                    if (lineLeft < f15) {
                        f15 = lineLeft;
                    }
                }
                if (f15 != Float.MAX_VALUE) {
                    this.f47761l = f15;
                }
                this.f47765p.getHeight();
                float L = org.telegram.messenger.g0.L(f10) + f13;
                this.f47759j = L;
                float f16 = 12.0f;
                if (this.G.z0()) {
                    this.f47759j = L - org.telegram.messenger.g0.L(12.0f);
                }
                this.f47772x = f13 + sjVar.getEditField().getMeasuredHeight();
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) q1Var.getMessageObject().f23321z2.get(0);
                this.E = fjVar;
                StaticLayout staticLayout = fjVar.f22424e;
                int i14 = org.telegram.ui.ActionBar.l6.Tc;
                double h = i0.a.h(org.telegram.ui.ActionBar.l6.w0(i14, this.N));
                int i15 = org.telegram.ui.ActionBar.l6.Ie;
                if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.l6.w0(i15, this.N))) > 0.20000000298023224d) {
                    this.f47763n = true;
                    this.f47764o = true;
                }
                this.L = org.telegram.ui.ActionBar.l6.w0(i15, this.N);
                this.M = org.telegram.ui.ActionBar.l6.w0(i14, this.N);
                if (staticLayout.getLineCount() == this.f47765p.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i16 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i16 < lineCount) {
                            f12 = f16;
                            StaticLayout staticLayout2 = this.f47765p;
                            f11 = f14;
                            if (staticLayout2.getLineRight(i16) == staticLayout2.getWidth() && staticLayout2.getLineLeft(i16) != f11) {
                                i11++;
                            } else {
                                i10++;
                            }
                            if (staticLayout.getLineEnd(i16) != this.f47765p.getLineEnd(i16)) {
                                this.f47763n = true;
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
                    this.f47763n = true;
                    i10 = 0;
                    i11 = 0;
                }
                if (!this.f47763n && i11 > 0 && i10 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    float f17 = Float.MAX_VALUE;
                    int i17 = 0;
                    while (i17 < lineCount) {
                        StaticLayout staticLayout3 = this.f47765p;
                        if (staticLayout3.getLineRight(i17) == staticLayout3.getWidth() && staticLayout3.getLineLeft(i17) != f11) {
                            i12 = lineCount;
                            spannableString.setSpan(new org.telegram.ui.Components.iy(false), this.f47765p.getLineStart(i17), this.f47765p.getLineEnd(i17), 0);
                            float lineLeft2 = this.f47765p.getLineLeft(i17);
                            if (lineLeft2 < f17) {
                                f17 = lineLeft2;
                            }
                        } else {
                            i12 = lineCount;
                            spannableString2.setSpan(new org.telegram.ui.Components.iy(false), this.f47765p.getLineStart(i17), this.f47765p.getLineEnd(i17), 0);
                        }
                        i17++;
                        lineCount = i12;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.f47765p = hyphenationFrequency.setAlignment(alignment).build();
                        this.f47766q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.f47765p = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.f47766q = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.f47762m = this.f47765p.getWidth() - ((org.telegram.messenger.fj) q1Var.getMessageObject().f23321z2.get(0)).f22424e.getWidth();
                if (q1Var.getMessageObject().N1() != 0 && q1Var.P7 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f47754c = z10;
                if (z10) {
                    org.telegram.ui.ActionBar.l5 l5Var = ((org.telegram.ui.Components.zn[]) cnVar.f44392b0.f3761b)[0].f41025c;
                    jh.k.b(l5Var, cnVar.l1, this.O);
                    PointF pointF2 = this.O;
                    this.f47755e = pointF2.x;
                    this.f47757g = pointF2.y;
                    this.f47756f = ((View) l5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.l5 l5Var2 = ((org.telegram.ui.Components.zn[]) cnVar.f44392b0.f3761b)[0].d;
                    jh.k.b(l5Var2, cnVar.l1, this.O);
                    float f18 = this.O.y;
                    this.h = l5Var.getTextColor();
                    this.f47758i = l5Var2.getTextColor();
                    this.f47759j -= org.telegram.messenger.g0.L(46.0f);
                }
                this.S = qj0Var.getPaddingBottom() - (cnVar.Yc - org.telegram.messenger.g0.L(44.0f));
                this.f47770u = new Matrix();
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(f12), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                paint2.setShader(linearGradient);
                this.f47771w = q1Var.getMessageObject().f23264k1;
                float f19 = f11;
                sjVar.getEditField().setAlpha(f19);
                sjVar.setTextTransitionIsRunning(true);
                StaticLayout staticLayout4 = q1Var.P7;
                if (staticLayout4 != null && staticLayout4.getText().length() > 1 && q1Var.P7.getPrimaryHorizontal(0) != f19) {
                    this.K = q1Var.P7.getWidth() - q1Var.P7.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new ts0(1, sjVar, this, ciVar));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) ciVar.f32696c).add(this);
                ciVar.a();
                ((ViewGroup) ciVar.d).invalidate();
                this.D.d();
                ofFloat.addListener(new org.telegram.ui.Components.j10(this, ciVar, q1Var, sjVar, cnVar));
                if (org.telegram.messenger.iz.o() == 2 && (L1 = q1Var.L1(true)) != null) {
                    int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ge, this.N);
                    Rect rect = L1.f28527o;
                    if (L1.F == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(L1.b(50.0f), L1.b(40.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rect.set(L1.getBounds());
                        Paint paint3 = new Paint(1);
                        paint3.setColor(-1);
                        L1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        L1.c(canvas, paint3);
                        L1.F = new NinePatchDrawable(createBitmap, c8.n0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
                        L1.setBounds(rect);
                    }
                    if (L1.G != w02) {
                        L1.G = w02;
                        L1.F.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                    }
                    this.F = L1.F;
                }
            }
        }
    }

    @Override
    public final void a(android.graphics.Canvas r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m51.a(android.graphics.Canvas):void");
    }

    public final int b(int i7) {
        return org.telegram.ui.ActionBar.l6.w0(i7, this.N);
    }
}
