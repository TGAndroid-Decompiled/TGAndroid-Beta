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
public final class n51 implements if0 {
    public final cn A;
    public final LinearGradient B;
    public final float C;
    public final h2.f D;
    public final org.telegram.messenger.fj E;
    public final NinePatchDrawable F;
    public final sj G;
    public final org.telegram.ui.Components.m5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.h6 N;
    public final PointF O;
    public final RectF P;
    public final RectF Q;
    public float[] R;
    public final float S;
    public float f48122a;
    public final Paint f48123b;
    public final boolean f48124c;
    public final ValueAnimator d;
    public final float f48125e;
    public final float f48126f;
    public final float f48127g;
    public final int h;
    public final int f48128i;
    public final float f48129j;
    public final org.telegram.messenger.ij f48130k;
    public final float f48131l;
    public final float f48132m;
    public final boolean f48133n;
    public final boolean f48134o;
    public final StaticLayout f48135p;
    public final StaticLayout f48136q;
    public final org.telegram.ui.Cells.q1 f48137r;
    public final org.telegram.ui.Components.pj0 f48138s;
    public final org.telegram.ui.Components.bi f48139t;
    public final Matrix f48140u;
    public final Paint v;
    public final int f48141w;
    public final float f48142x;
    public final float f48143y;
    public final float f48144z;

    public n51(org.telegram.ui.Cells.q1 q1Var, cn cnVar, org.telegram.ui.Components.pj0 pj0Var, org.telegram.ui.Components.bi biVar, org.telegram.ui.ActionBar.h6 h6Var) {
        float f10;
        boolean z9;
        int i7;
        float f11;
        float f12;
        int i10;
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.u4 L1;
        int i12;
        Object[] spans;
        boolean z11;
        Paint paint = new Paint(1);
        this.f48123b = paint;
        this.D = new h2.f((int[]) null);
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = h6Var;
        if (q1Var.getMessageObject().f23325z2 != null && q1Var.getMessageObject().f23325z2.size() <= 1 && !q1Var.getMessageObject().f23325z2.isEmpty() && ((org.telegram.messenger.fj) q1Var.getMessageObject().f23325z2.get(0)).f22428e.getLineCount() <= 10) {
            this.f48137r = q1Var;
            this.f48138s = pj0Var;
            this.f48139t = biVar;
            this.A = cnVar;
            sj sjVar = cnVar.Z;
            this.G = sjVar;
            if (sjVar != null && sjVar.getEditField() != null && sjVar.getEditField().getLayout() != null) {
                sjVar.getRecordCircle();
                paint.setFilterBitmap(true);
                this.f48130k = q1Var.getMessageObject();
                if (!q1Var.getTransitionParams().f30874w0) {
                    q1Var.draw(new Canvas());
                }
                q1Var.setEnterTransitionInProgress(true);
                Editable editText = sjVar.getEditText();
                CharSequence charSequence = q1Var.getMessageObject().v;
                this.f48133n = false;
                sjVar.getEditField().getLayout().getHeight();
                TextPaint textPaint = org.telegram.ui.ActionBar.m6.f28087o2;
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
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[0];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[2];
                                break;
                            }
                        case 3:
                            if (z11) {
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[1];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[3];
                                break;
                            }
                        case 4:
                            if (z11) {
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[2];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[4];
                                break;
                            }
                        case 5:
                            if (z11) {
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[3];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[5];
                                break;
                            }
                        case 6:
                            if (z11) {
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[4];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.m6.f28278y2[5];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.m6.f28278y2[5];
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
                    this.f48133n = true;
                    int[] iArr = new int[1];
                    CharSequence P3 = org.telegram.messenger.g0.P3(editText, iArr);
                    if (iArr[0] > 0) {
                        i7 = sjVar.getEditField().getLayout().getLineTop(sjVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        sjVar.getEditField().getLayout().getLineBottom(sjVar.getEditField().getLayout().getLineForOffset(P3.length() + iArr[0]));
                    } else {
                        i7 = 0;
                    }
                    org.telegram.ui.Components.q5.cloneSpans(charSequence);
                    charSequence = org.telegram.messenger.i6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
                }
                float textSize = sjVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.C = textSize;
                int lineCount = sjVar.getEditField().getLayout().getLineCount();
                int width = (int) (sjVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f48135p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.f48135p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.H = org.telegram.ui.Components.q5.update(2, (View) null, this.H, this.f48135p);
                jh.k.b(sjVar.getEditField(), cnVar.l1, pointF);
                float f13 = pointF.y;
                this.f48143y = pointF.x;
                this.f48144z = ((org.telegram.messenger.g0.L(10.0f) + f13) - sjVar.getEditField().getScrollY()) + i7;
                float f14 = 0.0f;
                this.f48131l = 0.0f;
                float f15 = Float.MAX_VALUE;
                for (int i13 = 0; i13 < this.f48135p.getLineCount(); i13++) {
                    float lineLeft = this.f48135p.getLineLeft(i13);
                    if (lineLeft < f15) {
                        f15 = lineLeft;
                    }
                }
                if (f15 != Float.MAX_VALUE) {
                    this.f48131l = f15;
                }
                this.f48135p.getHeight();
                float L = org.telegram.messenger.g0.L(f10) + f13;
                this.f48129j = L;
                float f16 = 12.0f;
                if (this.G.z0()) {
                    this.f48129j = L - org.telegram.messenger.g0.L(12.0f);
                }
                this.f48142x = f13 + sjVar.getEditField().getMeasuredHeight();
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) q1Var.getMessageObject().f23325z2.get(0);
                this.E = fjVar;
                StaticLayout staticLayout = fjVar.f22428e;
                int i14 = org.telegram.ui.ActionBar.m6.Tc;
                double h = i0.a.h(org.telegram.ui.ActionBar.m6.w0(i14, this.N));
                int i15 = org.telegram.ui.ActionBar.m6.Ie;
                if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.m6.w0(i15, this.N))) > 0.20000000298023224d) {
                    this.f48133n = true;
                    this.f48134o = true;
                }
                this.L = org.telegram.ui.ActionBar.m6.w0(i15, this.N);
                this.M = org.telegram.ui.ActionBar.m6.w0(i14, this.N);
                if (staticLayout.getLineCount() == this.f48135p.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i16 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i16 < lineCount) {
                            f12 = f16;
                            StaticLayout staticLayout2 = this.f48135p;
                            f11 = f14;
                            if (staticLayout2.getLineRight(i16) == staticLayout2.getWidth() && staticLayout2.getLineLeft(i16) != f11) {
                                i11++;
                            } else {
                                i10++;
                            }
                            if (staticLayout.getLineEnd(i16) != this.f48135p.getLineEnd(i16)) {
                                this.f48133n = true;
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
                    this.f48133n = true;
                    i10 = 0;
                    i11 = 0;
                }
                if (!this.f48133n && i11 > 0 && i10 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    float f17 = Float.MAX_VALUE;
                    int i17 = 0;
                    while (i17 < lineCount) {
                        StaticLayout staticLayout3 = this.f48135p;
                        if (staticLayout3.getLineRight(i17) == staticLayout3.getWidth() && staticLayout3.getLineLeft(i17) != f11) {
                            i12 = lineCount;
                            spannableString.setSpan(new org.telegram.ui.Components.hy(false), this.f48135p.getLineStart(i17), this.f48135p.getLineEnd(i17), 0);
                            float lineLeft2 = this.f48135p.getLineLeft(i17);
                            if (lineLeft2 < f17) {
                                f17 = lineLeft2;
                            }
                        } else {
                            i12 = lineCount;
                            spannableString2.setSpan(new org.telegram.ui.Components.hy(false), this.f48135p.getLineStart(i17), this.f48135p.getLineEnd(i17), 0);
                        }
                        i17++;
                        lineCount = i12;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.f48135p = hyphenationFrequency.setAlignment(alignment).build();
                        this.f48136q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.f48135p = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.f48136q = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.f48132m = this.f48135p.getWidth() - ((org.telegram.messenger.fj) q1Var.getMessageObject().f23325z2.get(0)).f22428e.getWidth();
                if (q1Var.getMessageObject().N1() != 0 && q1Var.P7 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f48124c = z10;
                if (z10) {
                    org.telegram.ui.ActionBar.m5 m5Var = ((org.telegram.ui.Components.yn[]) cnVar.f44433b0.f3758b)[0].f40621c;
                    jh.k.b(m5Var, cnVar.l1, this.O);
                    PointF pointF2 = this.O;
                    this.f48125e = pointF2.x;
                    this.f48127g = pointF2.y;
                    this.f48126f = ((View) m5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.m5 m5Var2 = ((org.telegram.ui.Components.yn[]) cnVar.f44433b0.f3758b)[0].d;
                    jh.k.b(m5Var2, cnVar.l1, this.O);
                    float f18 = this.O.y;
                    this.h = m5Var.getTextColor();
                    this.f48128i = m5Var2.getTextColor();
                    this.f48129j -= org.telegram.messenger.g0.L(46.0f);
                }
                this.S = pj0Var.getPaddingBottom() - (cnVar.Yc - org.telegram.messenger.g0.L(44.0f));
                this.f48140u = new Matrix();
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(f12), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                paint2.setShader(linearGradient);
                this.f48141w = q1Var.getMessageObject().f23268k1;
                float f19 = f11;
                sjVar.getEditField().setAlpha(f19);
                sjVar.setTextTransitionIsRunning(true);
                StaticLayout staticLayout4 = q1Var.P7;
                if (staticLayout4 != null && staticLayout4.getText().length() > 1 && q1Var.P7.getPrimaryHorizontal(0) != f19) {
                    this.K = q1Var.P7.getWidth() - q1Var.P7.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new us0(1, sjVar, this, biVar));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) biVar.f32272c).add(this);
                biVar.a();
                ((ViewGroup) biVar.d).invalidate();
                this.D.d();
                ofFloat.addListener(new org.telegram.ui.Components.i10(this, biVar, q1Var, sjVar, cnVar));
                if (org.telegram.messenger.iz.o() == 2 && (L1 = q1Var.L1(true)) != null) {
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ge, this.N);
                    Rect rect = L1.f28596o;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n51.a(android.graphics.Canvas):void");
    }

    public final int b(int i7) {
        return org.telegram.ui.ActionBar.m6.w0(i7, this.N);
    }
}
