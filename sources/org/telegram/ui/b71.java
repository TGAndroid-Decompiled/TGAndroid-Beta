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
public final class b71 implements lg0 {
    public final un A;
    public final LinearGradient B;
    public final float C;
    public final e2.f D;
    public final org.telegram.messenger.hj E;
    public final NinePatchDrawable F;
    public final mk G;
    public final org.telegram.ui.Components.k5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.p6 N;
    public final PointF O;
    public final RectF P;
    public final RectF Q;
    public float[] R;
    public final float S;
    public float f35971a;
    public final Paint f35972b;
    public final boolean f35973c;
    public final ValueAnimator d;
    public final float e;
    public final float f35974f;
    public final float f35975g;
    public final int h;
    public final int f35976i;
    public final float f35977j;
    public final org.telegram.messenger.kj f35978k;
    public final float f35979l;
    public final float f35980m;
    public final boolean f35981n;
    public final boolean f35982o;
    public final StaticLayout f35983p;
    public final StaticLayout f35984q;
    public final org.telegram.ui.Cells.q1 f35985r;
    public final org.telegram.ui.Components.uk0 f35986s;
    public final ih.e f35987t;
    public final Matrix f35988u;
    public final Paint v;
    public final int f35989w;
    public final float f35990x;
    public final float f35991y;
    public final float f35992z;

    public b71(org.telegram.ui.Cells.q1 q1Var, un unVar, org.telegram.ui.Components.uk0 uk0Var, ih.e eVar, org.telegram.ui.ActionBar.p6 p6Var) {
        float f7;
        boolean z10;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        boolean z11;
        org.telegram.ui.ActionBar.c5 J1;
        int i13;
        Object[] spans;
        boolean z12;
        Paint paint = new Paint(1);
        this.f35972b = paint;
        this.D = new e2.f((int[]) null);
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = p6Var;
        if (q1Var.getMessageObject().f16750z2 != null && q1Var.getMessageObject().f16750z2.size() <= 1 && !q1Var.getMessageObject().f16750z2.isEmpty() && ((org.telegram.messenger.hj) q1Var.getMessageObject().f16750z2.get(0)).e.getLineCount() <= 10) {
            this.f35985r = q1Var;
            this.f35986s = uk0Var;
            this.f35987t = eVar;
            this.A = unVar;
            mk mkVar = unVar.Z;
            this.G = mkVar;
            if (mkVar != null && mkVar.getEditField() != null && mkVar.getEditField().getLayout() != null) {
                mkVar.getRecordCircle();
                paint.setFilterBitmap(true);
                this.f35978k = q1Var.getMessageObject();
                if (!q1Var.getTransitionParams().f23551w0) {
                    q1Var.draw(new Canvas());
                }
                q1Var.setEnterTransitionInProgress(true);
                Editable editText = mkVar.getEditText();
                CharSequence charSequence = q1Var.getMessageObject().v;
                this.f35981n = false;
                mkVar.getEditField().getLayout().getHeight();
                TextPaint textPaint = org.telegram.ui.ActionBar.t6.f21131o2;
                org.telegram.messenger.i0.L(20.0f);
                if (q1Var.getMessageObject().N1 != 0) {
                    if (q1Var.getMessageObject().N1 == q1Var.getMessageObject().O1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f7 = 4.0f;
                    switch (Math.max(q1Var.getMessageObject().N1, q1Var.getMessageObject().O1)) {
                        case 0:
                        case 1:
                        case 2:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[0];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[2];
                                break;
                            }
                        case 3:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[1];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[3];
                                break;
                            }
                        case 4:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[2];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[4];
                                break;
                            }
                        case 5:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[3];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[5];
                                break;
                            }
                        case 6:
                            if (z12) {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[4];
                                break;
                            } else {
                                textPaint = org.telegram.ui.ActionBar.t6.f21309y2[5];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.t6.f21309y2[5];
                            break;
                    }
                    if (textPaint != null) {
                        textPaint.getTextSize();
                        org.telegram.messenger.i0.L(4.0f);
                    }
                } else {
                    f7 = 4.0f;
                }
                if ((charSequence instanceof Spannable) && (spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) != null && spans.length > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (editText.length() == charSequence.length() && !z10) {
                    i10 = 0;
                } else {
                    this.f35981n = true;
                    int[] iArr = new int[1];
                    CharSequence O3 = org.telegram.messenger.i0.O3(editText, iArr);
                    if (iArr[0] > 0) {
                        i10 = mkVar.getEditField().getLayout().getLineTop(mkVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        mkVar.getEditField().getLayout().getLineBottom(mkVar.getEditField().getLayout().getLineForOffset(O3.length() + iArr[0]));
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.o5.cloneSpans(charSequence);
                    charSequence = org.telegram.messenger.k6.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
                }
                float textSize = mkVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.C = textSize;
                int lineCount = mkVar.getEditField().getLayout().getLineCount();
                int width = (int) (mkVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT >= 24) {
                    this.f35983p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.f35983p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.H = org.telegram.ui.Components.o5.update(2, (View) null, this.H, this.f35983p);
                zg.h.b(mkVar.getEditField(), unVar.l1, pointF);
                float f12 = pointF.y;
                this.f35991y = pointF.x;
                this.f35992z = ((org.telegram.messenger.i0.L(10.0f) + f12) - mkVar.getEditField().getScrollY()) + i10;
                float f13 = 0.0f;
                this.f35979l = 0.0f;
                float f14 = Float.MAX_VALUE;
                for (int i14 = 0; i14 < this.f35983p.getLineCount(); i14++) {
                    float lineLeft = this.f35983p.getLineLeft(i14);
                    if (lineLeft < f14) {
                        f14 = lineLeft;
                    }
                }
                if (f14 != Float.MAX_VALUE) {
                    this.f35979l = f14;
                }
                this.f35983p.getHeight();
                float L = org.telegram.messenger.i0.L(f7) + f12;
                this.f35977j = L;
                float f15 = 12.0f;
                if (this.G.x0()) {
                    this.f35977j = L - org.telegram.messenger.i0.L(12.0f);
                }
                this.f35990x = f12 + mkVar.getEditField().getMeasuredHeight();
                org.telegram.messenger.hj hjVar = (org.telegram.messenger.hj) q1Var.getMessageObject().f16750z2.get(0);
                this.E = hjVar;
                StaticLayout staticLayout = hjVar.e;
                int i15 = org.telegram.ui.ActionBar.t6.Tc;
                double h = i0.b.h(org.telegram.ui.ActionBar.t6.w0(i15, this.N));
                int i16 = org.telegram.ui.ActionBar.t6.Ie;
                if (Math.abs(h - i0.b.h(org.telegram.ui.ActionBar.t6.w0(i16, this.N))) > 0.20000000298023224d) {
                    this.f35981n = true;
                    this.f35982o = true;
                }
                this.L = org.telegram.ui.ActionBar.t6.w0(i16, this.N);
                this.M = org.telegram.ui.ActionBar.t6.w0(i15, this.N);
                if (staticLayout.getLineCount() == this.f35983p.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i17 = 0;
                    i11 = 0;
                    i12 = 0;
                    while (true) {
                        if (i17 < lineCount) {
                            f11 = f15;
                            StaticLayout staticLayout2 = this.f35983p;
                            f10 = f13;
                            if (staticLayout2.getLineRight(i17) == staticLayout2.getWidth() && staticLayout2.getLineLeft(i17) != f10) {
                                i12++;
                            } else {
                                i11++;
                            }
                            if (staticLayout.getLineEnd(i17) != this.f35983p.getLineEnd(i17)) {
                                this.f35981n = true;
                            } else {
                                i17++;
                                f15 = f11;
                                f13 = f10;
                            }
                        } else {
                            f10 = f13;
                            f11 = f15;
                        }
                    }
                } else {
                    f10 = 0.0f;
                    f11 = 12.0f;
                    this.f35981n = true;
                    i11 = 0;
                    i12 = 0;
                }
                if (!this.f35981n && i12 > 0 && i11 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    float f16 = Float.MAX_VALUE;
                    int i18 = 0;
                    while (i18 < lineCount) {
                        StaticLayout staticLayout3 = this.f35983p;
                        if (staticLayout3.getLineRight(i18) == staticLayout3.getWidth() && staticLayout3.getLineLeft(i18) != f10) {
                            i13 = lineCount;
                            spannableString.setSpan(new org.telegram.ui.Components.wy(false), this.f35983p.getLineStart(i18), this.f35983p.getLineEnd(i18), 0);
                            float lineLeft2 = this.f35983p.getLineLeft(i18);
                            if (lineLeft2 < f16) {
                                f16 = lineLeft2;
                            }
                        } else {
                            i13 = lineCount;
                            spannableString2.setSpan(new org.telegram.ui.Components.wy(false), this.f35983p.getLineStart(i18), this.f35983p.getLineEnd(i18), 0);
                        }
                        i18++;
                        lineCount = i13;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.f35983p = hyphenationFrequency.setAlignment(alignment).build();
                        this.f35984q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.f35983p = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.f35984q = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.f35980m = this.f35983p.getWidth() - ((org.telegram.messenger.hj) q1Var.getMessageObject().f16750z2.get(0)).e.getWidth();
                if (q1Var.getMessageObject().O1() != 0 && q1Var.O7 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f35973c = z11;
                if (z11) {
                    org.telegram.ui.ActionBar.u5 u5Var = ((org.telegram.ui.Components.io[]) unVar.f42003b0.f10085b)[0].f27131c;
                    zg.h.b(u5Var, unVar.l1, this.O);
                    PointF pointF2 = this.O;
                    this.e = pointF2.x;
                    this.f35975g = pointF2.y;
                    this.f35974f = ((View) u5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.u5 u5Var2 = ((org.telegram.ui.Components.io[]) unVar.f42003b0.f10085b)[0].d;
                    zg.h.b(u5Var2, unVar.l1, this.O);
                    float f17 = this.O.y;
                    this.h = u5Var.getTextColor();
                    this.f35976i = u5Var2.getTextColor();
                    this.f35977j -= org.telegram.messenger.i0.L(46.0f);
                }
                this.S = uk0Var.getPaddingBottom() - (unVar.Pc - org.telegram.messenger.i0.L(44.0f));
                this.f35988u = new Matrix();
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.i0.L(f11), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                paint2.setShader(linearGradient);
                this.f35989w = q1Var.getMessageObject().f16692k1;
                float f18 = f10;
                mkVar.getEditField().setAlpha(f18);
                mkVar.setTextTransitionIsRunning(true);
                StaticLayout staticLayout4 = q1Var.O7;
                if (staticLayout4 != null && staticLayout4.getText().length() > 1 && q1Var.O7.getPrimaryHorizontal(0) != f18) {
                    this.K = q1Var.O7.getWidth() - q1Var.O7.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new zt0(1, mkVar, this, eVar));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) eVar.f8536c).add(this);
                eVar.a();
                ((ViewGroup) eVar.d).invalidate();
                this.D.d();
                ofFloat.addListener(new org.telegram.ui.Components.a20(this, eVar, q1Var, mkVar, unVar));
                if (org.telegram.messenger.uz.o() == 2 && (J1 = q1Var.J1(true)) != null) {
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ge, this.N);
                    Rect rect = J1.f20222o;
                    if (J1.F == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(J1.b(50.0f), J1.b(40.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rect.set(J1.getBounds());
                        Paint paint3 = new Paint(1);
                        paint3.setColor(-1);
                        J1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        J1.c(canvas, paint3);
                        J1.F = new NinePatchDrawable(createBitmap, w7.k9.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
                        J1.setBounds(rect);
                    }
                    if (J1.G != w02) {
                        J1.G = w02;
                        J1.F.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                    }
                    this.F = J1.F;
                }
            }
        }
    }

    @Override
    public final void a(android.graphics.Canvas r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b71.a(android.graphics.Canvas):void");
    }

    public final int b(int i10) {
        return org.telegram.ui.ActionBar.t6.w0(i10, this.N);
    }
}
