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
public final class i51 implements ff0 {
    public final an A;
    public final LinearGradient B;
    public final float C;
    public final h2.f D;
    public final org.telegram.messenger.dj E;
    public final NinePatchDrawable F;
    public final qj G;
    public final org.telegram.ui.Components.l5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.e6 N;
    public final PointF O;
    public final RectF P;
    public final RectF Q;
    public float[] R;
    public final float S;
    public float f47900a;
    public final Paint f47901b;
    public final boolean f47902c;
    public final ValueAnimator d;
    public final float f47903e;
    public final float f47904f;
    public final float f47905g;
    public final int h;
    public final int f47906i;
    public final float f47907j;
    public final org.telegram.messenger.gj f47908k;
    public final float f47909l;
    public final float f47910m;
    public final boolean f47911n;
    public final boolean f47912o;
    public final StaticLayout f47913p;
    public final StaticLayout f47914q;
    public final org.telegram.ui.Cells.q1 f47915r;
    public final org.telegram.ui.Components.uj0 f47916s;
    public final org.telegram.ui.Components.ji f47917t;
    public final Matrix f47918u;
    public final Paint v;
    public final int f47919w;
    public final float f47920x;
    public final float f47921y;
    public final float f47922z;

    public i51(org.telegram.ui.Cells.q1 q1Var, an anVar, org.telegram.ui.Components.uj0 uj0Var, org.telegram.ui.Components.ji jiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        float f10;
        boolean z10;
        int i7;
        float f11;
        float f12;
        int i10;
        int i11;
        boolean z11;
        org.telegram.ui.ActionBar.r4 M1;
        int i12;
        Object[] spans;
        boolean z12;
        Paint paint = new Paint(1);
        this.f47901b = paint;
        this.D = new h2.f((int[]) null);
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = e6Var;
        if (q1Var.getMessageObject().B2 != null && q1Var.getMessageObject().B2.size() <= 1 && !q1Var.getMessageObject().B2.isEmpty() && ((org.telegram.messenger.dj) q1Var.getMessageObject().B2.get(0)).f23101e.getLineCount() <= 10) {
            this.f47915r = q1Var;
            this.f47916s = uj0Var;
            this.f47917t = jiVar;
            this.A = anVar;
            qj qjVar = anVar.f45117a0;
            this.G = qjVar;
            if (qjVar != null && qjVar.getEditField() != null && qjVar.getEditField().getLayout() != null) {
                qjVar.getRecordCircle();
                paint.setFilterBitmap(true);
                this.f47908k = q1Var.getMessageObject();
                if (!q1Var.getTransitionParams().f32008w0) {
                    q1Var.draw(new Canvas());
                }
                q1Var.setEnterTransitionInProgress(true);
                Editable editText = qjVar.getEditText();
                CharSequence charSequence = q1Var.getMessageObject().v;
                this.f47911n = false;
                qjVar.getEditField().getLayout().getHeight();
                TextPaint textPaint = org.telegram.ui.ActionBar.j6.f29046o2;
                org.telegram.messenger.g0.L(20.0f);
                if (q1Var.getMessageObject().P1 != 0) {
                    if (q1Var.getMessageObject().P1 == q1Var.getMessageObject().Q1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f10 = 4.0f;
                    switch (Math.max(q1Var.getMessageObject().P1, q1Var.getMessageObject().Q1)) {
                        case 0:
                        case 1:
                        case 2:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[0];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[2];
                                break;
                            }
                        case 3:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[1];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[3];
                                break;
                            }
                        case 4:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[2];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[4];
                                break;
                            }
                        case 5:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[3];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[5];
                                break;
                            }
                        case 6:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[4];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.j6.f29237y2[5];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.j6.f29237y2[5];
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
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (editText.length() == charSequence.length() && !z10) {
                    i7 = 0;
                } else {
                    this.f47911n = true;
                    int[] iArr = new int[1];
                    CharSequence O3 = org.telegram.messenger.g0.O3(editText, iArr);
                    if (iArr[0] > 0) {
                        i7 = qjVar.getEditField().getLayout().getLineTop(qjVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        qjVar.getEditField().getLayout().getLineBottom(qjVar.getEditField().getLayout().getLineForOffset(O3.length() + iArr[0]));
                    } else {
                        i7 = 0;
                    }
                    org.telegram.ui.Components.p5.cloneSpans(charSequence);
                    charSequence = org.telegram.messenger.j6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
                }
                float textSize = qjVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.C = textSize;
                int lineCount = qjVar.getEditField().getLayout().getLineCount();
                int width = (int) (qjVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f47913p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.f47913p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.H = org.telegram.ui.Components.p5.update(2, (View) null, this.H, this.f47913p);
                jh.k.b(qjVar.getEditField(), anVar.f45277m1, pointF);
                float f13 = pointF.y;
                this.f47921y = pointF.x;
                this.f47922z = ((org.telegram.messenger.g0.L(10.0f) + f13) - qjVar.getEditField().getScrollY()) + i7;
                float f14 = 0.0f;
                this.f47909l = 0.0f;
                float f15 = Float.MAX_VALUE;
                for (int i13 = 0; i13 < this.f47913p.getLineCount(); i13++) {
                    float lineLeft = this.f47913p.getLineLeft(i13);
                    if (lineLeft < f15) {
                        f15 = lineLeft;
                    }
                }
                if (f15 != Float.MAX_VALUE) {
                    this.f47909l = f15;
                }
                this.f47913p.getHeight();
                float L = org.telegram.messenger.g0.L(f10) + f13;
                this.f47907j = L;
                float f16 = 12.0f;
                if (this.G.N0()) {
                    this.f47907j = L - org.telegram.messenger.g0.L(12.0f);
                }
                this.f47920x = f13 + qjVar.getEditField().getMeasuredHeight();
                org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) q1Var.getMessageObject().B2.get(0);
                this.E = djVar;
                StaticLayout staticLayout = djVar.f23101e;
                int i14 = org.telegram.ui.ActionBar.j6.Wc;
                double h = i0.a.h(org.telegram.ui.ActionBar.j6.w0(i14, this.N));
                int i15 = org.telegram.ui.ActionBar.j6.Le;
                if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.j6.w0(i15, this.N))) > 0.20000000298023224d) {
                    this.f47911n = true;
                    this.f47912o = true;
                }
                this.L = org.telegram.ui.ActionBar.j6.w0(i15, this.N);
                this.M = org.telegram.ui.ActionBar.j6.w0(i14, this.N);
                if (staticLayout.getLineCount() == this.f47913p.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i16 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i16 < lineCount) {
                            f12 = f16;
                            StaticLayout staticLayout2 = this.f47913p;
                            f11 = f14;
                            if (staticLayout2.getLineRight(i16) == staticLayout2.getWidth() && staticLayout2.getLineLeft(i16) != f11) {
                                i11++;
                            } else {
                                i10++;
                            }
                            if (staticLayout.getLineEnd(i16) != this.f47913p.getLineEnd(i16)) {
                                this.f47911n = true;
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
                    this.f47911n = true;
                    i10 = 0;
                    i11 = 0;
                }
                if (!this.f47911n && i11 > 0 && i10 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    float f17 = Float.MAX_VALUE;
                    int i17 = 0;
                    while (i17 < lineCount) {
                        StaticLayout staticLayout3 = this.f47913p;
                        if (staticLayout3.getLineRight(i17) == staticLayout3.getWidth() && staticLayout3.getLineLeft(i17) != f11) {
                            i12 = lineCount;
                            spannableString.setSpan(new org.telegram.ui.Components.my(false), this.f47913p.getLineStart(i17), this.f47913p.getLineEnd(i17), 0);
                            float lineLeft2 = this.f47913p.getLineLeft(i17);
                            if (lineLeft2 < f17) {
                                f17 = lineLeft2;
                            }
                        } else {
                            i12 = lineCount;
                            spannableString2.setSpan(new org.telegram.ui.Components.my(false), this.f47913p.getLineStart(i17), this.f47913p.getLineEnd(i17), 0);
                        }
                        i17++;
                        lineCount = i12;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.f47913p = hyphenationFrequency.setAlignment(alignment).build();
                        this.f47914q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.f47913p = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.f47914q = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.f47910m = this.f47913p.getWidth() - ((org.telegram.messenger.dj) q1Var.getMessageObject().B2.get(0)).f23101e.getWidth();
                if (q1Var.getMessageObject().N1() != 0 && q1Var.Q7 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f47902c = z11;
                if (z11) {
                    org.telegram.ui.ActionBar.j5 j5Var = ((org.telegram.ui.Components.jo[]) anVar.f45146c0.f3548b)[0].f36114c;
                    jh.k.b(j5Var, anVar.f45277m1, this.O);
                    PointF pointF2 = this.O;
                    this.f47903e = pointF2.x;
                    this.f47905g = pointF2.y;
                    this.f47904f = ((View) j5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.j5 j5Var2 = ((org.telegram.ui.Components.jo[]) anVar.f45146c0.f3548b)[0].d;
                    jh.k.b(j5Var2, anVar.f45277m1, this.O);
                    float f18 = this.O.y;
                    this.h = j5Var.getTextColor();
                    this.f47906i = j5Var2.getTextColor();
                    this.f47907j -= org.telegram.messenger.g0.L(46.0f);
                }
                this.S = uj0Var.getPaddingBottom() - (anVar.Zc - qjVar.getRestingFieldHeight());
                this.f47918u = new Matrix();
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(f12), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                paint2.setShader(linearGradient);
                this.f47919w = q1Var.getMessageObject().f23829m1;
                float f19 = f11;
                qjVar.getEditField().setAlpha(f19);
                qjVar.setTextTransitionIsRunning(true);
                StaticLayout staticLayout4 = q1Var.Q7;
                if (staticLayout4 != null && staticLayout4.getText().length() > 1 && q1Var.Q7.getPrimaryHorizontal(0) != f19) {
                    this.K = q1Var.Q7.getWidth() - q1Var.Q7.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new os0(this, qjVar, jiVar, 1));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) jiVar.f36007c).add(this);
                jiVar.a();
                ((ViewGroup) jiVar.d).invalidate();
                this.D.d();
                ofFloat.addListener(new org.telegram.ui.Components.m10(this, jiVar, q1Var, qjVar, anVar));
                if (org.telegram.messenger.gz.o() == 2 && (M1 = q1Var.M1(true)) != null) {
                    int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Je, this.N);
                    Rect rect = M1.f29566o;
                    if (M1.F == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(M1.b(50.0f), M1.b(40.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rect.set(M1.getBounds());
                        Paint paint3 = new Paint(1);
                        paint3.setColor(-1);
                        M1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        M1.c(canvas, paint3);
                        M1.F = new NinePatchDrawable(createBitmap, c8.o0.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
                        M1.setBounds(rect);
                    }
                    if (M1.G != w02) {
                        M1.G = w02;
                        M1.F.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                    }
                    this.F = M1.F;
                }
            }
        }
    }

    @Override
    public final void a(android.graphics.Canvas r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i51.a(android.graphics.Canvas):void");
    }

    public final int b(int i7) {
        return org.telegram.ui.ActionBar.j6.w0(i7, this.N);
    }
}
