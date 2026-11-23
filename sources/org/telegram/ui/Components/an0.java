package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
public class an0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static float[] f33499l0;
    public static Path m0;
    public boolean E;
    public float F;
    public final org.telegram.ui.Cells.y G;
    public float H;
    public final int[] I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final org.telegram.ui.ActionBar.i6 O;
    public final w7 P;
    public boolean Q;
    public float R;
    public float S;
    public int T;
    public ArrayList U;
    public CharSequence V;
    public long W;
    public int f33500a;
    public float f33501a0;
    public final org.telegram.ui.ActionBar.t0 f33502b;
    public int f33503b0;
    public final Paint f33504c;
    public StaticLayout[] f33505c0;
    public final Paint d;
    public TextPaint f33506d0;
    public final int f33507e;
    public float f33508e0;
    public final int f33509f;
    public int f33510f0;
    public long f33511g0;
    public int h;
    public float f33512h0;
    public final RectF f33513i0;
    public int f33514j0;
    public int f33515k0;
    public final c6 f33516n;
    public int f33517r;
    public float f33518s;
    public float f33519w;
    public boolean f33520x;
    public zm0 f33521y;

    public an0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i7;
        int i10 = this.f33509f;
        float f10 = i10 / 2.0f;
        int i11 = 0;
        if (this.W > 600000) {
            i7 = org.telegram.messenger.g0.L(42.0f);
        } else {
            i7 = 0;
        }
        float f11 = f10 + i7;
        float measuredWidth = getMeasuredWidth() - (i10 / 2.0f);
        if (this.W > 600000) {
            i11 = org.telegram.messenger.g0.L(42.0f);
        }
        return (int) (Math.abs(f11 - (measuredWidth - i11)) - org.telegram.messenger.g0.L(66.0f));
    }

    private void setTimestampIndex(int i7) {
        if (this.f33514j0 != i7) {
            this.f33514j0 = i7;
            if (i7 >= 0 && i7 < this.U.size()) {
                this.P.setText((CharSequence) ((Pair) this.U.get(this.f33514j0)).second);
            }
        }
    }

    public final void a(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.an0.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final StaticLayout b(int i7, CharSequence charSequence) {
        if (this.f33506d0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.f33506d0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        }
        this.f33506d0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Jj, this.O));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f33506d0, i7).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(org.telegram.messenger.g0.L(400.0f), i7)).build();
    }

    public final int c() {
        return Math.max((int) (this.f33519w * (getMeasuredWidth() - this.f33509f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.G;
        int i7 = this.f33507e;
        int i10 = this.f33509f;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.Q) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.S) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.R) > viewConfiguration.getScaledTouchSlop()) {
                        this.Q = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        int measuredHeight = (getMeasuredHeight() - i7) / 2;
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            if (this.h - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.h + i7 + measuredHeight) {
                                int x10 = ((int) motionEvent.getX()) - (i7 / 2);
                                this.h = x10;
                                if (x10 < c()) {
                                    this.h = c();
                                } else if (this.h > getMeasuredWidth() - i10) {
                                    this.h = getMeasuredWidth() - i10;
                                }
                            }
                            this.f33517r = (int) (motionEvent.getX() - this.h);
                            this.f33520x = true;
                            this.f33521y.w();
                            if (yVar != null) {
                                yVar.setState(this.I);
                                yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.f33520x) {
                    int x11 = (int) (motionEvent.getX() - this.f33517r);
                    this.h = x11;
                    if (x11 < c()) {
                        this.h = c();
                    } else if (this.h > getMeasuredWidth() - i10) {
                        this.h = getMeasuredWidth() - i10;
                    }
                    if (this.E) {
                        if (this.N) {
                            float measuredWidth = (getMeasuredWidth() - i10) / 2;
                            float f10 = this.h;
                            if (f10 >= measuredWidth) {
                                f(false, (f10 - measuredWidth) / measuredWidth);
                            } else {
                                f(false, -Math.max(0.01f, 1.0f - ((measuredWidth - f10) / measuredWidth)));
                            }
                        } else {
                            f(false, this.h / (getMeasuredWidth() - i10));
                        }
                    }
                    if (yVar != null) {
                        yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                    invalidate();
                    return true;
                }
            }
        } else {
            this.Q = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.S) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight2 = (getMeasuredHeight() - i7) / 2;
                    if (this.h - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.h + i7 + measuredHeight2) {
                        int x12 = ((int) motionEvent.getX()) - (i7 / 2);
                        this.h = x12;
                        if (x12 < c()) {
                            this.h = c();
                        } else if (this.h > getMeasuredWidth() - i10) {
                            this.h = getMeasuredWidth() - i10;
                        }
                    }
                    this.f33517r = (int) (motionEvent.getX() - this.h);
                    this.f33520x = true;
                }
            }
            if (this.f33520x) {
                if (motionEvent.getAction() == 1) {
                    if (this.N) {
                        float measuredWidth2 = (getMeasuredWidth() - i10) / 2;
                        float f11 = this.h;
                        if (f11 >= measuredWidth2) {
                            f(false, (f11 - measuredWidth2) / measuredWidth2);
                        } else {
                            f(false, -Math.max(0.01f, 1.0f - ((measuredWidth2 - f11) / measuredWidth2)));
                        }
                    } else {
                        f(true, this.h / (getMeasuredWidth() - i10));
                    }
                }
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
                this.f33521y.w();
                this.f33520x = false;
                org.telegram.messenger.g0.h3(new eb0(this, 25), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(boolean z10, float f10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.f33518s = f10;
            return;
        }
        this.f33518s = -100.0f;
        boolean z11 = this.N;
        int i7 = this.f33509f;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i7) / 2;
            if (f10 < 0.0f) {
                ceil = Math.ceil(((-(f10 + 1.0f)) * measuredWidth) + measuredWidth);
            } else {
                ceil = Math.ceil((f10 * measuredWidth) + measuredWidth);
            }
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i7) * f10);
        }
        int i10 = (int) ceil;
        int i11 = this.h;
        if (i11 != i10) {
            if (z10) {
                this.K = i11;
                this.J = 0.0f;
            }
            this.h = i10;
            if (i10 < c()) {
                this.h = c();
            } else if (this.h > getMeasuredWidth() - i7) {
                this.h = getMeasuredWidth() - i7;
            }
            invalidate();
        }
    }

    public final void f(boolean z10, float f10) {
        zm0 zm0Var = this.f33521y;
        if (zm0Var != null) {
            zm0Var.j(z10, f10);
        }
        int i7 = this.L;
        if (i7 > 1) {
            int round = Math.round((i7 - 1) * f10);
            if (!z10 && round != this.T) {
                org.telegram.messenger.g0.a4(this);
            }
            this.T = round;
        }
    }

    public final void g(org.telegram.messenger.fj fjVar) {
        boolean z10;
        Integer z11;
        String str;
        if (fjVar == null) {
            this.U = null;
            this.f33503b0 = -1;
            this.f33501a0 = 0.0f;
            StaticLayout[] staticLayoutArr = this.f33505c0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        Long valueOf = Long.valueOf(((long) fjVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            this.U = null;
            this.f33503b0 = -1;
            this.f33501a0 = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.f33505c0;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        CharSequence charSequence = fjVar.f24131z;
        if (fjVar.e5()) {
            if (fjVar.B == null && (str = fjVar.f24073k.media.webpage.description) != null) {
                fjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.fj.h(fjVar.N3(), fjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = fjVar.B;
        }
        if (charSequence != this.V) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.W != valueOf.longValue()) {
            this.V = charSequence;
            this.W = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f33515k0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.U = null;
                this.f33503b0 = -1;
                this.f33501a0 = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.f33505c0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                r41[] r41VarArr = (r41[]) spanned.getSpans(0, spanned.length(), r41.class);
                this.U = new ArrayList();
                if (z10) {
                    this.f33501a0 = 0.0f;
                }
                if (this.f33506d0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f33506d0 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.f33506d0.setColor(-1);
                }
                for (r41 r41Var : r41VarArr) {
                    if (r41Var != null && r41Var.getURL() != null && r41Var.d != null && r41Var.getURL().startsWith("audio?")) {
                        if (Utilities.z(r41Var.getURL().substring(6)).intValue() >= 0) {
                            float intValue = ((float) (z11.intValue() * 1000)) / ((float) valueOf.longValue());
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r41Var.d);
                            org.telegram.messenger.j6.l(spannableStringBuilder, this.f33506d0.getFontMetricsInt(), false);
                            this.U.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                        }
                    }
                }
                Collections.sort(this.U, new org.telegram.ui.pe(14));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.U = null;
                this.f33503b0 = -1;
                this.f33501a0 = 0.0f;
                StaticLayout[] staticLayoutArr4 = this.f33505c0;
                if (staticLayoutArr4 != null) {
                    staticLayoutArr4[1] = null;
                    staticLayoutArr4[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.f33518s;
        }
        return this.h / (getMeasuredWidth() - this.f33509f);
    }

    public ym0 getSeekBarAccessibilityDelegate() {
        return this.f33502b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        int i7;
        int i10;
        float f13;
        float f14;
        float f15;
        float measuredWidth;
        Canvas canvas2 = canvas;
        int i11 = this.h;
        boolean z11 = this.N;
        int i12 = this.f33509f;
        if (!z11 && this.L > 1) {
            i11 = (int) this.f33516n.e(false, Math.round(i11 / measuredWidth) * ((getMeasuredWidth() - i12) / (this.L - 1.0f)));
        }
        int i13 = i11;
        int measuredHeight = getMeasuredHeight();
        int i14 = this.f33507e;
        int i15 = (measuredHeight - i14) / 2;
        int i16 = org.telegram.ui.ActionBar.n6.Kj;
        org.telegram.ui.ActionBar.i6 i6Var = this.O;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i16, i6Var);
        Paint paint = this.f33504c;
        paint.setColor(w02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f16 = i12 / 2.0f;
        int i17 = i12 / 2;
        float measuredWidth2 = getMeasuredWidth() - i17;
        float L = measuredHeight2 - (org.telegram.messenger.g0.L(this.M) / 2.0f);
        float L2 = (org.telegram.messenger.g0.L(this.M) / 2.0f) + measuredHeight2;
        RectF rectF = this.f33513i0;
        rectF.set(f16, L, measuredWidth2, L2);
        a(canvas2, rectF, paint);
        if (this.F > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Lj, i6Var));
            f10 = 0.0f;
            rectF.set(f16, L, (this.F * (getMeasuredWidth() - i12)) + f16, L2);
            a(canvas2, rectF, paint);
        } else {
            f10 = 0.0f;
        }
        boolean z12 = this.N;
        float f17 = 6.0f;
        Paint paint2 = this.d;
        if (z12) {
            canvas2.drawRect((getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(1.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + (getMeasuredWidth() / 2), org.telegram.messenger.g0.L(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i13 > (getMeasuredWidth() - i12) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), i17 + i13, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i17 + i13, (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() / 2, org.telegram.messenger.g0.L(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f16 = f16;
        } else {
            float f18 = this.f33519w;
            if (f18 >= f10) {
                float f19 = measuredWidth2 - f16;
                rectF.set((f18 * f19) + f16, L, i13 + f16, L2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f16, L, (this.f33519w * f19) + f16, L2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f16, L, i13 + f16, L2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.y yVar = this.G;
        if (yVar != null) {
            int L3 = (i17 + i13) - org.telegram.messenger.g0.L(16.0f);
            int L4 = ((i14 / 2) + i15) - org.telegram.messenger.g0.L(16.0f);
            yVar.setBounds(L3, L4, org.telegram.messenger.g0.L(32.0f) + L3, org.telegram.messenger.g0.L(32.0f) + L4);
            yVar.draw(canvas2);
        }
        if (this.f33520x) {
            f17 = 8.0f;
        }
        int L5 = org.telegram.messenger.g0.L(f17);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f20 = this.H;
        float f21 = L5;
        if (f20 != f21) {
            f11 = 16.0f;
            if (f20 < f21) {
                f12 = 8.0f;
                float c10 = com.google.android.gms.internal.vision.e2.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f20);
                this.H = c10;
                if (c10 > f21) {
                    this.H = f21;
                }
            } else {
                f12 = 8.0f;
                float w10 = org.telegram.messenger.m10.w((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f20);
                this.H = w10;
                if (w10 < f21) {
                    this.H = f21;
                }
            }
            z10 = true;
        } else {
            f11 = 16.0f;
            f12 = 8.0f;
            z10 = false;
        }
        float f22 = this.J;
        if (f22 < 1.0f) {
            float f23 = (((float) elapsedRealtime) / 225.0f) + f22;
            this.J = f23;
            if (f23 < 1.0f) {
                z10 = true;
            } else {
                this.J = 1.0f;
            }
        }
        float f24 = this.J;
        if (f24 < 1.0f) {
            float interpolation = 1.0f - ws.f41715c.getInterpolation(Math.min(1.0f, f24 * 3.0f));
            float interpolation2 = ws.d.getInterpolation(this.J);
            if (interpolation > f10) {
                canvas2.drawCircle(i17 + this.K, (i14 / 2) + i15, this.H * interpolation, paint2);
            }
            canvas2.drawCircle(i17 + i13, (i14 / 2) + i15, this.H * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i17 + i13, (i14 / 2) + i15, this.H, paint2);
        }
        ArrayList arrayList = this.U;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.U.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((Float) ((Pair) this.U.get(size)).first).floatValue() - 0.001f <= progress) {
                        break;
                    }
                } else {
                    size = -1;
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.f33505c0 == null) {
                this.f33505c0 = new StaticLayout[2];
            }
            if (this.W > 600000) {
                i7 = org.telegram.messenger.g0.L(42.0f);
            } else {
                i7 = 0;
            }
            float f25 = i7 + f16;
            float measuredWidth3 = getMeasuredWidth() - f16;
            if (this.W > 600000) {
                i10 = org.telegram.messenger.g0.L(42.0f);
            } else {
                i10 = 0;
            }
            float abs = Math.abs(f25 - (measuredWidth3 - i10)) - org.telegram.messenger.g0.L(66.0f);
            float f26 = this.f33512h0;
            if (f26 > f10 && Math.abs(f26 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.f33505c0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.f33505c0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.f33512h0 = abs;
            if (size != this.f33503b0) {
                StaticLayout[] staticLayoutArr3 = this.f33505c0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.f33520x) {
                    org.telegram.messenger.g0.a4(this);
                }
                if (size >= 0 && size < this.U.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.U.get(size)).second;
                    if (charSequence == null) {
                        this.f33505c0[0] = null;
                    } else {
                        this.f33505c0[0] = b((int) abs, charSequence);
                    }
                } else {
                    this.f33505c0[0] = null;
                }
                this.f33508e0 = f10;
                if (size == -1) {
                    this.f33510f0 = -1;
                } else {
                    int i18 = this.f33503b0;
                    if (i18 == -1) {
                        this.f33510f0 = 1;
                    } else if (size < i18) {
                        this.f33510f0 = -1;
                    } else if (size > i18) {
                        this.f33510f0 = 1;
                    }
                }
                this.f33503b0 = size;
            }
            if (this.f33508e0 < 1.0f) {
                long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f33511g0));
                if (this.U.size() > 8) {
                    f15 = 160.0f;
                } else {
                    f15 = 220.0f;
                }
                this.f33508e0 = Math.min((((float) min) / f15) + this.f33508e0, 1.0f);
                invalidate();
                this.f33511g0 = SystemClock.elapsedRealtime();
            }
            if (this.f33501a0 < 1.0f) {
                this.f33501a0 = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f33511g0))) / 200.0f) + this.f33501a0, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = kr.f36858f.getInterpolation(this.f33508e0);
            canvas2.save();
            canvas2.translate(f25 + org.telegram.messenger.g0.L(25.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(14.0f));
            this.f33506d0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Jj, i6Var));
            if (this.f33505c0[1] != null) {
                canvas2.save();
                if (this.f33510f0 != 0) {
                    f14 = 0.0f;
                    canvas2.translate((org.telegram.messenger.g0.L(f11) * (-this.f33510f0) * interpolation3) + org.telegram.messenger.g0.L(f12), 0.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas2.translate(f14, (-this.f33505c0[1].getHeight()) / 2.0f);
                this.f33506d0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.f33501a0));
                canvas2.restore();
            }
            if (this.f33505c0[0] != null) {
                canvas2.save();
                if (this.f33510f0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate(com.google.android.gms.internal.vision.e2.z(1.0f, interpolation3, org.telegram.messenger.g0.L(f11) * this.f33510f0, org.telegram.messenger.g0.L(f12)), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.f33505c0[0].getHeight()) / 2.0f);
                this.f33506d0.setAlpha((int) (interpolation3 * 255.0f * this.f33501a0));
                canvas2.restore();
            }
            canvas2.restore();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2);
        w7 w7Var = this.P;
        int measuredHeight = (w7Var.getMeasuredHeight() / 2) + L;
        int i14 = this.f33509f / 2;
        if (this.W > 600000) {
            i13 = org.telegram.messenger.g0.L(42.0f);
        } else {
            i13 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(25.0f) + i14 + i13;
        w7Var.layout(L2, measuredHeight - w7Var.getMeasuredHeight(), w7Var.getMeasuredWidth() + L2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f33515k0 = timestampLabelWidth;
        this.P.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f33518s != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.f33518s);
            this.f33518s = -100.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f10) {
        this.F = f10;
        invalidate();
    }

    public void setDelegate(zm0 zm0Var) {
        this.f33521y = zm0Var;
    }

    public void setInnerColor(int i7) {
        this.f33504c.setColor(i7);
    }

    public void setLineWidth(int i7) {
        this.M = i7;
    }

    public void setMinProgress(float f10) {
        this.f33519w = f10;
        float progress = getProgress();
        float f11 = this.f33519w;
        if (progress < f11) {
            e(false, f11);
        }
        invalidate();
    }

    public void setOuterColor(int i7) {
        this.d.setColor(i7);
        org.telegram.ui.Cells.y yVar = this.G;
        if (yVar != null) {
            org.telegram.ui.ActionBar.n6.H1(yVar, i0.a.o(i7, 40), true);
        }
    }

    public void setProgress(float f10) {
        e(false, f10);
    }

    public void setReportChanges(boolean z10) {
        this.E = z10;
    }

    public void setSeparatorsCount(int i7) {
        this.L = i7;
    }

    public void setTwoSided(boolean z10) {
        this.N = z10;
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            Paint paint = this.d;
            if (paint != null && paint.getColor() == this.f33500a && (w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Mj, this.O)) != this.f33500a) {
                this.f33500a = w02;
                setOuterColor(w02);
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.G) {
            return false;
        }
        return true;
    }

    public an0(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.f33516n = new c6(this, 0L, 60L, kr.f36859g);
        this.f33518s = -100.0f;
        this.f33519w = -1.0f;
        this.I = new int[]{16842910, 16842919};
        this.J = 1.0f;
        this.M = 3;
        this.f33501a0 = 0.0f;
        this.f33503b0 = -1;
        this.f33508e0 = 1.0f;
        this.f33512h0 = -1.0f;
        this.f33513i0 = new RectF();
        this.f33514j0 = -1;
        this.O = i6Var;
        setWillNotDraw(false);
        this.f33504c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i7 = org.telegram.ui.ActionBar.n6.Mj;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        this.f33500a = w02;
        paint.setColor(w02);
        this.f33509f = org.telegram.messenger.g0.L(32.0f);
        this.f33507e = org.telegram.messenger.g0.L(24.0f);
        this.H = org.telegram.messenger.g0.L(6.0f);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), 40), 1, org.telegram.messenger.g0.L(16.0f));
        this.G = h02;
        h02.setCallback(this);
        h02.setVisible(true, false);
        w7 w7Var = new w7(this, context, context, 2);
        this.P = w7Var;
        w7Var.f42736y = true;
        addView(w7Var, c8.na.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(this, z10);
        this.f33502b = t0Var;
        setAccessibilityDelegate(t0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
