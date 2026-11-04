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
public final class a51 implements ze0 {
    public final wm A;
    public final LinearGradient B;
    public final float C;
    public final g2.g D;
    public final org.telegram.messenger.wi E;
    public final NinePatchDrawable F;
    public final mj G;
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
    public float f43612a;
    public final Paint f43613b;
    public final boolean f43614c;
    public final ValueAnimator d;
    public final float f43615e;
    public final float f43616f;
    public final float f43617g;
    public final int h;
    public final int f43618i;
    public final float f43619j;
    public final org.telegram.messenger.zi f43620k;
    public final float f43621l;
    public final float f43622m;
    public final boolean f43623n;
    public final boolean f43624o;
    public final StaticLayout f43625p;
    public final StaticLayout f43626q;
    public final org.telegram.ui.Cells.q1 f43627r;
    public final org.telegram.ui.Components.tj0 f43628s;
    public final org.telegram.ui.Components.ai f43629t;
    public final Matrix f43630u;
    public final Paint v;
    public final int f43631w;
    public final float f43632x;
    public final float f43633y;
    public final float f43634z;

    public a51(org.telegram.ui.Cells.q1 q1Var, wm wmVar, org.telegram.ui.Components.tj0 tj0Var, org.telegram.ui.Components.ai aiVar, org.telegram.ui.ActionBar.e6 e6Var) {
        float f10;
        boolean z10;
        int i3;
        float f11;
        float f12;
        int i10;
        int i11;
        boolean z11;
        org.telegram.ui.ActionBar.t4 L1;
        int i12;
        Object[] spans;
        boolean z12;
        Paint paint = new Paint(1);
        this.f43613b = paint;
        this.D = new g2.g((int[]) null);
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = e6Var;
        if (q1Var.getMessageObject().f26927z2 != null && q1Var.getMessageObject().f26927z2.size() <= 1 && !q1Var.getMessageObject().f26927z2.isEmpty() && ((org.telegram.messenger.wi) q1Var.getMessageObject().f26927z2.get(0)).f26210e.getLineCount() <= 10) {
            this.f43627r = q1Var;
            this.f43628s = tj0Var;
            this.f43629t = aiVar;
            this.A = wmVar;
            mj mjVar = wmVar.f51237a0;
            this.G = mjVar;
            if (mjVar != null && mjVar.getEditField() != null && mjVar.getEditField().getLayout() != null) {
                mjVar.getRecordCircle();
                paint.setFilterBitmap(true);
                this.f43620k = q1Var.getMessageObject();
                if (!q1Var.getTransitionParams().f30932w0) {
                    q1Var.draw(new Canvas());
                }
                q1Var.setEnterTransitionInProgress(true);
                Editable editText = mjVar.getEditText();
                CharSequence charSequence = q1Var.getMessageObject().v;
                this.f43623n = false;
                mjVar.getEditField().getLayout().getHeight();
                TextPaint textPaint = org.telegram.ui.ActionBar.k6.f28077o2;
                org.telegram.messenger.g0.L(20.0f);
                if (q1Var.getMessageObject().N1 != 0) {
                    if (q1Var.getMessageObject().N1 == q1Var.getMessageObject().O1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f10 = 4.0f;
                    switch (Math.max(q1Var.getMessageObject().N1, q1Var.getMessageObject().O1)) {
                        case 0:
                        case 1:
                        case 2:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[0];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[2];
                                break;
                            }
                        case 3:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[1];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[3];
                                break;
                            }
                        case 4:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[2];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[4];
                                break;
                            }
                        case 5:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[3];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[5];
                                break;
                            }
                        case 6:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[4];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.k6.f28269y2[5];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.k6.f28269y2[5];
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
                    i3 = 0;
                } else {
                    this.f43623n = true;
                    int[] iArr = new int[1];
                    CharSequence P3 = org.telegram.messenger.g0.P3(editText, iArr);
                    if (iArr[0] > 0) {
                        i3 = mjVar.getEditField().getLayout().getLineTop(mjVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        mjVar.getEditField().getLayout().getLineBottom(mjVar.getEditField().getLayout().getLineForOffset(P3.length() + iArr[0]));
                    } else {
                        i3 = 0;
                    }
                    org.telegram.ui.Components.p5.cloneSpans(charSequence);
                    charSequence = org.telegram.messenger.i6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
                }
                float textSize = mjVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.C = textSize;
                int lineCount = mjVar.getEditField().getLayout().getLineCount();
                int width = (int) (mjVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f43625p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.f43625p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.H = org.telegram.ui.Components.p5.update(2, (View) null, this.H, this.f43625p);
                kh.k.b(mjVar.getEditField(), wmVar.m1, pointF);
                float f13 = pointF.y;
                this.f43633y = pointF.x;
                this.f43634z = ((org.telegram.messenger.g0.L(10.0f) + f13) - mjVar.getEditField().getScrollY()) + i3;
                float f14 = 0.0f;
                this.f43621l = 0.0f;
                float f15 = Float.MAX_VALUE;
                for (int i13 = 0; i13 < this.f43625p.getLineCount(); i13++) {
                    float lineLeft = this.f43625p.getLineLeft(i13);
                    if (lineLeft < f15) {
                        f15 = lineLeft;
                    }
                }
                if (f15 != Float.MAX_VALUE) {
                    this.f43621l = f15;
                }
                this.f43625p.getHeight();
                float L = org.telegram.messenger.g0.L(f10) + f13;
                this.f43619j = L;
                float f16 = 12.0f;
                if (this.G.y0()) {
                    this.f43619j = L - org.telegram.messenger.g0.L(12.0f);
                }
                this.f43632x = f13 + mjVar.getEditField().getMeasuredHeight();
                org.telegram.messenger.wi wiVar = (org.telegram.messenger.wi) q1Var.getMessageObject().f26927z2.get(0);
                this.E = wiVar;
                StaticLayout staticLayout = wiVar.f26210e;
                int i14 = org.telegram.ui.ActionBar.k6.Tc;
                double h = i0.a.h(org.telegram.ui.ActionBar.k6.w0(i14, this.N));
                int i15 = org.telegram.ui.ActionBar.k6.Ie;
                if (Math.abs(h - i0.a.h(org.telegram.ui.ActionBar.k6.w0(i15, this.N))) > 0.20000000298023224d) {
                    this.f43623n = true;
                    this.f43624o = true;
                }
                this.L = org.telegram.ui.ActionBar.k6.w0(i15, this.N);
                this.M = org.telegram.ui.ActionBar.k6.w0(i14, this.N);
                if (staticLayout.getLineCount() == this.f43625p.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i16 = 0;
                    i10 = 0;
                    i11 = 0;
                    while (true) {
                        if (i16 < lineCount) {
                            f12 = f16;
                            StaticLayout staticLayout2 = this.f43625p;
                            f11 = f14;
                            if (staticLayout2.getLineRight(i16) == staticLayout2.getWidth() && staticLayout2.getLineLeft(i16) != f11) {
                                i11++;
                            } else {
                                i10++;
                            }
                            if (staticLayout.getLineEnd(i16) != this.f43625p.getLineEnd(i16)) {
                                this.f43623n = true;
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
                    this.f43623n = true;
                    i10 = 0;
                    i11 = 0;
                }
                if (!this.f43623n && i11 > 0 && i10 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    float f17 = Float.MAX_VALUE;
                    int i17 = 0;
                    while (i17 < lineCount) {
                        StaticLayout staticLayout3 = this.f43625p;
                        if (staticLayout3.getLineRight(i17) == staticLayout3.getWidth() && staticLayout3.getLineLeft(i17) != f11) {
                            i12 = lineCount;
                            spannableString.setSpan(new org.telegram.ui.Components.fy(false), this.f43625p.getLineStart(i17), this.f43625p.getLineEnd(i17), 0);
                            float lineLeft2 = this.f43625p.getLineLeft(i17);
                            if (lineLeft2 < f17) {
                                f17 = lineLeft2;
                            }
                        } else {
                            i12 = lineCount;
                            spannableString2.setSpan(new org.telegram.ui.Components.fy(false), this.f43625p.getLineStart(i17), this.f43625p.getLineEnd(i17), 0);
                        }
                        i17++;
                        lineCount = i12;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.f43625p = hyphenationFrequency.setAlignment(alignment).build();
                        this.f43626q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.f43625p = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.f43626q = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.f43622m = this.f43625p.getWidth() - ((org.telegram.messenger.wi) q1Var.getMessageObject().f26927z2.get(0)).f26210e.getWidth();
                if (q1Var.getMessageObject().O1() != 0 && q1Var.P7 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f43614c = z11;
                if (z11) {
                    org.telegram.ui.ActionBar.k5 k5Var = ((org.telegram.ui.Components.yn[]) wmVar.f51266c0.f852b)[0].f40788c;
                    kh.k.b(k5Var, wmVar.m1, this.O);
                    PointF pointF2 = this.O;
                    this.f43615e = pointF2.x;
                    this.f43617g = pointF2.y;
                    this.f43616f = ((View) k5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.k5 k5Var2 = ((org.telegram.ui.Components.yn[]) wmVar.f51266c0.f852b)[0].d;
                    kh.k.b(k5Var2, wmVar.m1, this.O);
                    float f18 = this.O.y;
                    this.h = k5Var.getTextColor();
                    this.f43618i = k5Var2.getTextColor();
                    this.f43619j -= org.telegram.messenger.g0.L(46.0f);
                }
                this.S = tj0Var.getPaddingBottom() - (wmVar.Xc - org.telegram.messenger.g0.L(44.0f));
                this.f43630u = new Matrix();
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(f12), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                paint2.setShader(linearGradient);
                this.f43631w = q1Var.getMessageObject().k1;
                float f19 = f11;
                mjVar.getEditField().setAlpha(f19);
                mjVar.setTextTransitionIsRunning(true);
                StaticLayout staticLayout4 = q1Var.P7;
                if (staticLayout4 != null && staticLayout4.getText().length() > 1 && q1Var.P7.getPrimaryHorizontal(0) != f19) {
                    this.K = q1Var.P7.getWidth() - q1Var.P7.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new hs0(1, mjVar, this, aiVar));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) aiVar.f31850c).add(this);
                aiVar.a();
                ((ViewGroup) aiVar.d).invalidate();
                this.D.d();
                ofFloat.addListener(new org.telegram.ui.Components.f10(this, aiVar, q1Var, mjVar, wmVar));
                if (org.telegram.messenger.az.o() == 2 && (L1 = q1Var.L1(true)) != null) {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, this.N);
                    Rect rect = L1.f28645o;
                    if (L1.F == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(L1.b(50.0f), L1.b(40.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rect.set(L1.getBounds());
                        Paint paint3 = new Paint(1);
                        paint3.setColor(-1);
                        L1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        L1.c(canvas, paint3);
                        L1.F = new NinePatchDrawable(createBitmap, b8.ld.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a51.a(android.graphics.Canvas):void");
    }

    public final int b(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.N);
    }
}
