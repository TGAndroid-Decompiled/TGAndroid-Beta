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
public class mm0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public static float[] f35995k0;
    public static Path f35996l0;
    public boolean D;
    public float E;
    public final org.telegram.ui.Cells.y F;
    public float G;
    public final int[] H;
    public float I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.h6 N;
    public final s7 O;
    public boolean P;
    public float Q;
    public float R;
    public int S;
    public ArrayList T;
    public CharSequence U;
    public long V;
    public float W;
    public int f35997a;
    public int f35998a0;
    public final org.telegram.ui.ActionBar.u0 f35999b;
    public StaticLayout[] f36000b0;
    public final Paint f36001c;
    public TextPaint f36002c0;
    public final Paint d;
    public float f36003d0;
    public final int f36004e;
    public int f36005e0;
    public final int f36006f;
    public long f36007f0;
    public float f36008g0;
    public int h;
    public final RectF f36009h0;
    public int f36010i0;
    public int f36011j0;
    public final v5 f36012n;
    public int f36013r;
    public float f36014s;
    public float f36015w;
    public boolean f36016x;
    public lm0 f36017y;

    public mm0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i7;
        int i10 = this.f36006f;
        float f10 = i10 / 2.0f;
        int i11 = 0;
        if (this.V > 600000) {
            i7 = org.telegram.messenger.g0.L(42.0f);
        } else {
            i7 = 0;
        }
        float f11 = f10 + i7;
        float measuredWidth = getMeasuredWidth() - (i10 / 2.0f);
        if (this.V > 600000) {
            i11 = org.telegram.messenger.g0.L(42.0f);
        }
        return (int) (Math.abs(f11 - (measuredWidth - i11)) - org.telegram.messenger.g0.L(66.0f));
    }

    private void setTimestampIndex(int i7) {
        if (this.f36010i0 != i7) {
            this.f36010i0 = i7;
            if (i7 >= 0 && i7 < this.T.size()) {
                this.O.setText((CharSequence) ((Pair) this.T.get(this.f36010i0)).second);
            }
        }
    }

    public final void a(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mm0.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final StaticLayout b(int i7, CharSequence charSequence) {
        if (this.f36002c0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.f36002c0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        }
        this.f36002c0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gj, this.N));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f36002c0, i7).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(org.telegram.messenger.g0.L(400.0f), i7)).build();
    }

    public final int c() {
        return Math.max((int) (this.f36015w * (getMeasuredWidth() - this.f36006f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.F;
        int i7 = this.f36004e;
        int i10 = this.f36006f;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.P) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.R) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.Q) > viewConfiguration.getScaledTouchSlop()) {
                        this.P = true;
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
                            this.f36013r = (int) (motionEvent.getX() - this.h);
                            this.f36016x = true;
                            this.f36017y.D();
                            if (yVar != null) {
                                yVar.setState(this.H);
                                yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.f36016x) {
                    int x11 = (int) (motionEvent.getX() - this.f36013r);
                    this.h = x11;
                    if (x11 < c()) {
                        this.h = c();
                    } else if (this.h > getMeasuredWidth() - i10) {
                        this.h = getMeasuredWidth() - i10;
                    }
                    if (this.D) {
                        if (this.M) {
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
            this.P = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.R) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
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
                    this.f36013r = (int) (motionEvent.getX() - this.h);
                    this.f36016x = true;
                }
            }
            if (this.f36016x) {
                if (motionEvent.getAction() == 1) {
                    if (this.M) {
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
                this.f36017y.D();
                this.f36016x = false;
                org.telegram.messenger.g0.i3(new ob0(this, 22), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(boolean z9, float f10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.f36014s = f10;
            return;
        }
        this.f36014s = -100.0f;
        boolean z10 = this.M;
        int i7 = this.f36006f;
        if (z10) {
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
            if (z9) {
                this.J = i11;
                this.I = 0.0f;
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

    public final void f(boolean z9, float f10) {
        lm0 lm0Var = this.f36017y;
        if (lm0Var != null) {
            lm0Var.l(z9, f10);
        }
        int i7 = this.K;
        if (i7 > 1) {
            int round = Math.round((i7 - 1) * f10);
            if (!z9 && round != this.S) {
                org.telegram.messenger.g0.c4(this);
            }
            this.S = round;
        }
    }

    public final void g(org.telegram.messenger.ij ijVar) {
        boolean z9;
        Integer z10;
        String str;
        if (ijVar == null) {
            this.T = null;
            this.f35998a0 = -1;
            this.W = 0.0f;
            StaticLayout[] staticLayoutArr = this.f36000b0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.U = null;
            this.V = -1L;
            return;
        }
        Long valueOf = Long.valueOf(((long) ijVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            this.T = null;
            this.f35998a0 = -1;
            this.W = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.f36000b0;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
            this.U = null;
            this.V = -1L;
            return;
        }
        CharSequence charSequence = ijVar.f23322z;
        if (ijVar.e5()) {
            if (ijVar.B == null && (str = ijVar.f23266k.media.webpage.description) != null) {
                ijVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.ij.h(ijVar.N3(), ijVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = ijVar.B;
        }
        if (charSequence != this.U) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 || this.V != valueOf.longValue()) {
            this.U = charSequence;
            this.V = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f36011j0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.T = null;
                this.f35998a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.f36000b0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                b41[] b41VarArr = (b41[]) spanned.getSpans(0, spanned.length(), b41.class);
                this.T = new ArrayList();
                if (z9) {
                    this.W = 0.0f;
                }
                if (this.f36002c0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f36002c0 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.f36002c0.setColor(-1);
                }
                for (b41 b41Var : b41VarArr) {
                    if (b41Var != null && b41Var.getURL() != null && b41Var.d != null && b41Var.getURL().startsWith("audio?")) {
                        if (Utilities.z(b41Var.getURL().substring(6)).intValue() >= 0) {
                            float intValue = ((float) (z10.intValue() * 1000)) / ((float) valueOf.longValue());
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b41Var.d);
                            org.telegram.messenger.i6.l(spannableStringBuilder, this.f36002c0.getFontMetricsInt(), false);
                            this.T.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                        }
                    }
                }
                Collections.sort(this.T, new org.telegram.ui.pe(15));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.T = null;
                this.f35998a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr4 = this.f36000b0;
                if (staticLayoutArr4 != null) {
                    staticLayoutArr4[1] = null;
                    staticLayoutArr4[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.f36014s;
        }
        return this.h / (getMeasuredWidth() - this.f36006f);
    }

    public km0 getSeekBarAccessibilityDelegate() {
        return this.f35999b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z9;
        int i7;
        int i10;
        float f13;
        float f14;
        float f15;
        float measuredWidth;
        Canvas canvas2 = canvas;
        int i11 = this.h;
        boolean z10 = this.M;
        int i12 = this.f36006f;
        if (!z10 && this.K > 1) {
            i11 = (int) this.f36012n.e(false, Math.round(i11 / measuredWidth) * ((getMeasuredWidth() - i12) / (this.K - 1.0f)));
        }
        int i13 = i11;
        int measuredHeight = getMeasuredHeight();
        int i14 = this.f36004e;
        int i15 = (measuredHeight - i14) / 2;
        int i16 = org.telegram.ui.ActionBar.m6.Hj;
        org.telegram.ui.ActionBar.h6 h6Var = this.N;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i16, h6Var);
        Paint paint = this.f36001c;
        paint.setColor(w02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f16 = i12 / 2.0f;
        int i17 = i12 / 2;
        float measuredWidth2 = getMeasuredWidth() - i17;
        float L = measuredHeight2 - (org.telegram.messenger.g0.L(this.L) / 2.0f);
        float L2 = (org.telegram.messenger.g0.L(this.L) / 2.0f) + measuredHeight2;
        RectF rectF = this.f36009h0;
        rectF.set(f16, L, measuredWidth2, L2);
        a(canvas2, rectF, paint);
        if (this.E > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ij, h6Var));
            f10 = 0.0f;
            rectF.set(f16, L, (this.E * (getMeasuredWidth() - i12)) + f16, L2);
            a(canvas2, rectF, paint);
        } else {
            f10 = 0.0f;
        }
        boolean z11 = this.M;
        float f17 = 6.0f;
        Paint paint2 = this.d;
        if (z11) {
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
            float f18 = this.f36015w;
            if (f18 >= f10) {
                float f19 = measuredWidth2 - f16;
                rectF.set((f18 * f19) + f16, L, i13 + f16, L2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f16, L, (this.f36015w * f19) + f16, L2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f16, L, i13 + f16, L2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            int L3 = (i17 + i13) - org.telegram.messenger.g0.L(16.0f);
            int L4 = ((i14 / 2) + i15) - org.telegram.messenger.g0.L(16.0f);
            yVar.setBounds(L3, L4, org.telegram.messenger.g0.L(32.0f) + L3, org.telegram.messenger.g0.L(32.0f) + L4);
            yVar.draw(canvas2);
        }
        if (this.f36016x) {
            f17 = 8.0f;
        }
        int L5 = org.telegram.messenger.g0.L(f17);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f20 = this.G;
        float f21 = L5;
        if (f20 != f21) {
            f11 = 16.0f;
            if (f20 < f21) {
                f12 = 8.0f;
                float c10 = com.google.android.recaptcha.internal.a.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f20);
                this.G = c10;
                if (c10 > f21) {
                    this.G = f21;
                }
            } else {
                f12 = 8.0f;
                float v = org.telegram.messenger.camera.q.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f20);
                this.G = v;
                if (v < f21) {
                    this.G = f21;
                }
            }
            z9 = true;
        } else {
            f11 = 16.0f;
            f12 = 8.0f;
            z9 = false;
        }
        float f22 = this.I;
        if (f22 < 1.0f) {
            float f23 = (((float) elapsedRealtime) / 225.0f) + f22;
            this.I = f23;
            if (f23 < 1.0f) {
                z9 = true;
            } else {
                this.I = 1.0f;
            }
        }
        float f24 = this.I;
        if (f24 < 1.0f) {
            float interpolation = 1.0f - js.f35059c.getInterpolation(Math.min(1.0f, f24 * 3.0f));
            float interpolation2 = js.d.getInterpolation(this.I);
            if (interpolation > f10) {
                canvas2.drawCircle(i17 + this.J, (i14 / 2) + i15, this.G * interpolation, paint2);
            }
            canvas2.drawCircle(i17 + i13, (i14 / 2) + i15, this.G * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i17 + i13, (i14 / 2) + i15, this.G, paint2);
        }
        ArrayList arrayList = this.T;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.T.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((Float) ((Pair) this.T.get(size)).first).floatValue() - 0.001f <= progress) {
                        break;
                    }
                } else {
                    size = -1;
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.f36000b0 == null) {
                this.f36000b0 = new StaticLayout[2];
            }
            if (this.V > 600000) {
                i7 = org.telegram.messenger.g0.L(42.0f);
            } else {
                i7 = 0;
            }
            float f25 = i7 + f16;
            float measuredWidth3 = getMeasuredWidth() - f16;
            if (this.V > 600000) {
                i10 = org.telegram.messenger.g0.L(42.0f);
            } else {
                i10 = 0;
            }
            float abs = Math.abs(f25 - (measuredWidth3 - i10)) - org.telegram.messenger.g0.L(66.0f);
            float f26 = this.f36008g0;
            if (f26 > f10 && Math.abs(f26 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.f36000b0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.f36000b0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.f36008g0 = abs;
            if (size != this.f35998a0) {
                StaticLayout[] staticLayoutArr3 = this.f36000b0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.f36016x) {
                    org.telegram.messenger.g0.c4(this);
                }
                if (size >= 0 && size < this.T.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.T.get(size)).second;
                    if (charSequence == null) {
                        this.f36000b0[0] = null;
                    } else {
                        this.f36000b0[0] = b((int) abs, charSequence);
                    }
                } else {
                    this.f36000b0[0] = null;
                }
                this.f36003d0 = f10;
                if (size == -1) {
                    this.f36005e0 = -1;
                } else {
                    int i18 = this.f35998a0;
                    if (i18 == -1) {
                        this.f36005e0 = 1;
                    } else if (size < i18) {
                        this.f36005e0 = -1;
                    } else if (size > i18) {
                        this.f36005e0 = 1;
                    }
                }
                this.f35998a0 = size;
            }
            if (this.f36003d0 < 1.0f) {
                long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f36007f0));
                if (this.T.size() > 8) {
                    f15 = 160.0f;
                } else {
                    f15 = 220.0f;
                }
                this.f36003d0 = Math.min((((float) min) / f15) + this.f36003d0, 1.0f);
                invalidate();
                this.f36007f0 = SystemClock.elapsedRealtime();
            }
            if (this.W < 1.0f) {
                this.W = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f36007f0))) / 200.0f) + this.W, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = wq.f40046f.getInterpolation(this.f36003d0);
            canvas2.save();
            canvas2.translate(f25 + org.telegram.messenger.g0.L(25.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(14.0f));
            this.f36002c0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gj, h6Var));
            if (this.f36000b0[1] != null) {
                canvas2.save();
                if (this.f36005e0 != 0) {
                    f14 = 0.0f;
                    canvas2.translate((org.telegram.messenger.g0.L(f11) * (-this.f36005e0) * interpolation3) + org.telegram.messenger.g0.L(f12), 0.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas2.translate(f14, (-this.f36000b0[1].getHeight()) / 2.0f);
                this.f36002c0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.W));
                canvas2.restore();
            }
            if (this.f36000b0[0] != null) {
                canvas2.save();
                if (this.f36005e0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate(com.google.android.recaptcha.internal.a.z(1.0f, interpolation3, org.telegram.messenger.g0.L(f11) * this.f36005e0, org.telegram.messenger.g0.L(f12)), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.f36000b0[0].getHeight()) / 2.0f);
                this.f36002c0.setAlpha((int) (interpolation3 * 255.0f * this.W));
                canvas2.restore();
            }
            canvas2.restore();
        }
        if (z9) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(14.0f) + (getMeasuredHeight() / 2);
        s7 s7Var = this.O;
        int measuredHeight = (s7Var.getMeasuredHeight() / 2) + L;
        int i14 = this.f36006f / 2;
        if (this.V > 600000) {
            i13 = org.telegram.messenger.g0.L(42.0f);
        } else {
            i13 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(25.0f) + i14 + i13;
        s7Var.layout(L2, measuredHeight - s7Var.getMeasuredHeight(), s7Var.getMeasuredWidth() + L2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f36011j0 = timestampLabelWidth;
        this.O.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f36014s != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.f36014s);
            this.f36014s = -100.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f10) {
        this.E = f10;
        invalidate();
    }

    public void setDelegate(lm0 lm0Var) {
        this.f36017y = lm0Var;
    }

    public void setInnerColor(int i7) {
        this.f36001c.setColor(i7);
    }

    public void setLineWidth(int i7) {
        this.L = i7;
    }

    public void setMinProgress(float f10) {
        this.f36015w = f10;
        float progress = getProgress();
        float f11 = this.f36015w;
        if (progress < f11) {
            e(false, f11);
        }
        invalidate();
    }

    public void setOuterColor(int i7) {
        this.d.setColor(i7);
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            org.telegram.ui.ActionBar.m6.H1(yVar, i0.a.o(i7, 40), true);
        }
    }

    public void setProgress(float f10) {
        e(false, f10);
    }

    public void setReportChanges(boolean z9) {
        this.D = z9;
    }

    public void setSeparatorsCount(int i7) {
        this.K = i7;
    }

    public void setTwoSided(boolean z9) {
        this.M = z9;
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            Paint paint = this.d;
            if (paint != null && paint.getColor() == this.f35997a && (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jj, this.N)) != this.f35997a) {
                this.f35997a = w02;
                setOuterColor(w02);
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.F) {
            return false;
        }
        return true;
    }

    public mm0(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context);
        this.f36012n = new v5(this, 0L, 60L, wq.f40047g);
        this.f36014s = -100.0f;
        this.f36015w = -1.0f;
        this.H = new int[]{16842910, 16842919};
        this.I = 1.0f;
        this.L = 3;
        this.W = 0.0f;
        this.f35998a0 = -1;
        this.f36003d0 = 1.0f;
        this.f36008g0 = -1.0f;
        this.f36009h0 = new RectF();
        this.f36010i0 = -1;
        this.N = h6Var;
        setWillNotDraw(false);
        this.f36001c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i7 = org.telegram.ui.ActionBar.m6.Jj;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.f35997a = w02;
        paint.setColor(w02);
        this.f36006f = org.telegram.messenger.g0.L(32.0f);
        this.f36004e = org.telegram.messenger.g0.L(24.0f);
        this.G = org.telegram.messenger.g0.L(6.0f);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), 40), 1, org.telegram.messenger.g0.L(16.0f));
        this.F = h02;
        h02.setCallback(this);
        h02.setVisible(true, false);
        s7 s7Var = new s7(this, context, context, 2);
        this.O = s7Var;
        s7Var.f38911y = true;
        addView(s7Var, c8.ha.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(this, z9);
        this.f35999b = u0Var;
        setAccessibilityDelegate(u0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
