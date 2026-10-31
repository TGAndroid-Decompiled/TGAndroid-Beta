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
public class nn0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static float[] f28832k0;
    public static Path f28833l0;
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
    public final org.telegram.ui.ActionBar.p6 N;
    public final o7 O;
    public boolean P;
    public float Q;
    public float R;
    public int S;
    public ArrayList T;
    public CharSequence U;
    public long V;
    public float W;
    public int f28834a;
    public int f28835a0;
    public final org.telegram.ui.ActionBar.w0 f28836b;
    public StaticLayout[] f28837b0;
    public final Paint f28838c;
    public TextPaint f28839c0;
    public final Paint d;
    public float f28840d0;
    public final int e;
    public int f28841e0;
    public final int f28842f;
    public long f28843f0;
    public float f28844g0;
    public int h;
    public final RectF f28845h0;
    public int f28846i0;
    public int f28847j0;
    public final t5 f28848n;
    public int f28849r;
    public float f28850s;
    public float f28851w;
    public boolean f28852x;
    public mn0 f28853y;

    public nn0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i10;
        int i11 = this.f28842f;
        float f7 = i11 / 2.0f;
        int i12 = 0;
        if (this.V > 600000) {
            i10 = org.telegram.messenger.i0.L(42.0f);
        } else {
            i10 = 0;
        }
        float f10 = f7 + i10;
        float measuredWidth = getMeasuredWidth() - (i11 / 2.0f);
        if (this.V > 600000) {
            i12 = org.telegram.messenger.i0.L(42.0f);
        }
        return (int) (Math.abs(f10 - (measuredWidth - i12)) - org.telegram.messenger.i0.L(66.0f));
    }

    private void setTimestampIndex(int i10) {
        if (this.f28846i0 != i10) {
            this.f28846i0 = i10;
            if (i10 >= 0 && i10 < this.T.size()) {
                this.O.setText((CharSequence) ((Pair) this.T.get(this.f28846i0)).second);
            }
        }
    }

    public final void a(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nn0.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final StaticLayout b(int i10, CharSequence charSequence) {
        if (this.f28839c0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.f28839c0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        }
        this.f28839c0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gj, this.N));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f28839c0, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(org.telegram.messenger.i0.L(400.0f), i10)).build();
    }

    public final int c() {
        return Math.max((int) (this.f28851w * (getMeasuredWidth() - this.f28842f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.F;
        int i10 = this.e;
        int i11 = this.f28842f;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.P) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.R) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.Q) > viewConfiguration.getScaledTouchSlop()) {
                        this.P = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        int measuredHeight = (getMeasuredHeight() - i10) / 2;
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            if (this.h - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.h + i10 + measuredHeight) {
                                int x10 = ((int) motionEvent.getX()) - (i10 / 2);
                                this.h = x10;
                                if (x10 < c()) {
                                    this.h = c();
                                } else if (this.h > getMeasuredWidth() - i11) {
                                    this.h = getMeasuredWidth() - i11;
                                }
                            }
                            this.f28849r = (int) (motionEvent.getX() - this.h);
                            this.f28852x = true;
                            this.f28853y.C();
                            if (yVar != null) {
                                yVar.setState(this.H);
                                yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.f28852x) {
                    int x11 = (int) (motionEvent.getX() - this.f28849r);
                    this.h = x11;
                    if (x11 < c()) {
                        this.h = c();
                    } else if (this.h > getMeasuredWidth() - i11) {
                        this.h = getMeasuredWidth() - i11;
                    }
                    if (this.D) {
                        if (this.M) {
                            float measuredWidth = (getMeasuredWidth() - i11) / 2;
                            float f7 = this.h;
                            if (f7 >= measuredWidth) {
                                f(false, (f7 - measuredWidth) / measuredWidth);
                            } else {
                                f(false, -Math.max(0.01f, 1.0f - ((measuredWidth - f7) / measuredWidth)));
                            }
                        } else {
                            f(false, this.h / (getMeasuredWidth() - i11));
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
                    int measuredHeight2 = (getMeasuredHeight() - i10) / 2;
                    if (this.h - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.h + i10 + measuredHeight2) {
                        int x12 = ((int) motionEvent.getX()) - (i10 / 2);
                        this.h = x12;
                        if (x12 < c()) {
                            this.h = c();
                        } else if (this.h > getMeasuredWidth() - i11) {
                            this.h = getMeasuredWidth() - i11;
                        }
                    }
                    this.f28849r = (int) (motionEvent.getX() - this.h);
                    this.f28852x = true;
                }
            }
            if (this.f28852x) {
                if (motionEvent.getAction() == 1) {
                    if (this.M) {
                        float measuredWidth2 = (getMeasuredWidth() - i11) / 2;
                        float f10 = this.h;
                        if (f10 >= measuredWidth2) {
                            f(false, (f10 - measuredWidth2) / measuredWidth2);
                        } else {
                            f(false, -Math.max(0.01f, 1.0f - ((measuredWidth2 - f10) / measuredWidth2)));
                        }
                    } else {
                        f(true, this.h / (getMeasuredWidth() - i11));
                    }
                }
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
                this.f28853y.C();
                this.f28852x = false;
                org.telegram.messenger.i0.h3(new eb0(this, 27), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(boolean z10, float f7) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.f28850s = f7;
            return;
        }
        this.f28850s = -100.0f;
        boolean z11 = this.M;
        int i10 = this.f28842f;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i10) / 2;
            if (f7 < 0.0f) {
                ceil = Math.ceil(((-(f7 + 1.0f)) * measuredWidth) + measuredWidth);
            } else {
                ceil = Math.ceil((f7 * measuredWidth) + measuredWidth);
            }
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i10) * f7);
        }
        int i11 = (int) ceil;
        int i12 = this.h;
        if (i12 != i11) {
            if (z10) {
                this.J = i12;
                this.I = 0.0f;
            }
            this.h = i11;
            if (i11 < c()) {
                this.h = c();
            } else if (this.h > getMeasuredWidth() - i10) {
                this.h = getMeasuredWidth() - i10;
            }
            invalidate();
        }
    }

    public final void f(boolean z10, float f7) {
        mn0 mn0Var = this.f28853y;
        if (mn0Var != null) {
            mn0Var.k(z10, f7);
        }
        int i10 = this.K;
        if (i10 > 1) {
            int round = Math.round((i10 - 1) * f7);
            if (!z10 && round != this.S) {
                org.telegram.messenger.i0.b4(this);
            }
            this.S = round;
        }
    }

    public final void g(org.telegram.messenger.jj jjVar) {
        boolean z10;
        Integer z11;
        String str;
        if (jjVar == null) {
            this.T = null;
            this.f28835a0 = -1;
            this.W = 0.0f;
            StaticLayout[] staticLayoutArr = this.f28837b0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.U = null;
            this.V = -1L;
            return;
        }
        Long valueOf = Long.valueOf(((long) jjVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            this.T = null;
            this.f28835a0 = -1;
            this.W = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.f28837b0;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
            this.U = null;
            this.V = -1L;
            return;
        }
        CharSequence charSequence = jjVar.f16394z;
        if (jjVar.e5()) {
            if (jjVar.B == null && (str = jjVar.f16337k.media.webpage.description) != null) {
                jjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.jj.h(jjVar.N3(), jjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = jjVar.B;
        }
        if (charSequence != this.U) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.V != valueOf.longValue()) {
            this.U = charSequence;
            this.V = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f28847j0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.T = null;
                this.f28835a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.f28837b0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                e51[] e51VarArr = (e51[]) spanned.getSpans(0, spanned.length(), e51.class);
                this.T = new ArrayList();
                if (z10) {
                    this.W = 0.0f;
                }
                if (this.f28839c0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f28839c0 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
                    this.f28839c0.setColor(-1);
                }
                for (e51 e51Var : e51VarArr) {
                    if (e51Var != null && e51Var.getURL() != null && e51Var.d != null && e51Var.getURL().startsWith("audio?")) {
                        if (Utilities.z(e51Var.getURL().substring(6)).intValue() >= 0) {
                            float intValue = ((float) (z11.intValue() * 1000)) / ((float) valueOf.longValue());
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(e51Var.d);
                            org.telegram.messenger.k6.l(spannableStringBuilder, this.f28839c0.getFontMetricsInt(), false);
                            this.T.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                        }
                    }
                }
                Collections.sort(this.T, new org.telegram.ui.f6(17));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                this.T = null;
                this.f28835a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr4 = this.f28837b0;
                if (staticLayoutArr4 != null) {
                    staticLayoutArr4[1] = null;
                    staticLayoutArr4[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.f28850s;
        }
        return this.h / (getMeasuredWidth() - this.f28842f);
    }

    public ln0 getSeekBarAccessibilityDelegate() {
        return this.f28836b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10;
        int i10;
        int i11;
        float f12;
        float f13;
        float f14;
        float measuredWidth;
        Canvas canvas2 = canvas;
        int i12 = this.h;
        boolean z11 = this.M;
        int i13 = this.f28842f;
        if (!z11 && this.K > 1) {
            i12 = (int) this.f28848n.e(false, Math.round(i12 / measuredWidth) * ((getMeasuredWidth() - i13) / (this.K - 1.0f)));
        }
        int i14 = i12;
        int measuredHeight = getMeasuredHeight();
        int i15 = this.e;
        int i16 = (measuredHeight - i15) / 2;
        int i17 = org.telegram.ui.ActionBar.t6.Hj;
        org.telegram.ui.ActionBar.p6 p6Var = this.N;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var);
        Paint paint = this.f28838c;
        paint.setColor(w02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f15 = i13 / 2.0f;
        int i18 = i13 / 2;
        float measuredWidth2 = getMeasuredWidth() - i18;
        float L = measuredHeight2 - (org.telegram.messenger.i0.L(this.L) / 2.0f);
        float L2 = (org.telegram.messenger.i0.L(this.L) / 2.0f) + measuredHeight2;
        RectF rectF = this.f28845h0;
        rectF.set(f15, L, measuredWidth2, L2);
        a(canvas2, rectF, paint);
        if (this.E > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ij, p6Var));
            f7 = 0.0f;
            rectF.set(f15, L, (this.E * (getMeasuredWidth() - i13)) + f15, L2);
            a(canvas2, rectF, paint);
        } else {
            f7 = 0.0f;
        }
        boolean z12 = this.M;
        float f16 = 6.0f;
        Paint paint2 = this.d;
        if (z12) {
            canvas2.drawRect((getMeasuredWidth() / 2) - org.telegram.messenger.i0.L(1.0f), (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f) + (getMeasuredWidth() / 2), org.telegram.messenger.i0.L(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i14 > (getMeasuredWidth() - i13) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(1.0f), i18 + i14, org.telegram.messenger.i0.L(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i18 + i14, (getMeasuredHeight() / 2) - org.telegram.messenger.i0.L(1.0f), getMeasuredWidth() / 2, org.telegram.messenger.i0.L(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f15 = f15;
        } else {
            float f17 = this.f28851w;
            if (f17 >= f7) {
                float f18 = measuredWidth2 - f15;
                rectF.set((f17 * f18) + f15, L, i14 + f15, L2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f15, L, (this.f28851w * f18) + f15, L2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f15, L, i14 + f15, L2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            int L3 = (i18 + i14) - org.telegram.messenger.i0.L(16.0f);
            int L4 = ((i15 / 2) + i16) - org.telegram.messenger.i0.L(16.0f);
            yVar.setBounds(L3, L4, org.telegram.messenger.i0.L(32.0f) + L3, org.telegram.messenger.i0.L(32.0f) + L4);
            yVar.draw(canvas2);
        }
        if (this.f28852x) {
            f16 = 8.0f;
        }
        int L5 = org.telegram.messenger.i0.L(f16);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f19 = this.G;
        float f20 = L5;
        if (f19 != f20) {
            f10 = 16.0f;
            if (f19 < f20) {
                f11 = 8.0f;
                float c10 = a1.g.c((float) elapsedRealtime, 60.0f, org.telegram.messenger.i0.L(1.0f), f19);
                this.G = c10;
                if (c10 > f20) {
                    this.G = f20;
                }
            } else {
                f11 = 8.0f;
                float v = org.telegram.messenger.z20.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.i0.L(1.0f), f19);
                this.G = v;
                if (v < f20) {
                    this.G = f20;
                }
            }
            z10 = true;
        } else {
            f10 = 16.0f;
            f11 = 8.0f;
            z10 = false;
        }
        float f21 = this.I;
        if (f21 < 1.0f) {
            float f22 = (((float) elapsedRealtime) / 225.0f) + f21;
            this.I = f22;
            if (f22 < 1.0f) {
                z10 = true;
            } else {
                this.I = 1.0f;
            }
        }
        float f23 = this.I;
        if (f23 < 1.0f) {
            float interpolation = 1.0f - vs.f31838c.getInterpolation(Math.min(1.0f, f23 * 3.0f));
            float interpolation2 = vs.d.getInterpolation(this.I);
            if (interpolation > f7) {
                canvas2.drawCircle(i18 + this.J, (i15 / 2) + i16, this.G * interpolation, paint2);
            }
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.G * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.G, paint2);
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
            if (this.f28837b0 == null) {
                this.f28837b0 = new StaticLayout[2];
            }
            if (this.V > 600000) {
                i10 = org.telegram.messenger.i0.L(42.0f);
            } else {
                i10 = 0;
            }
            float f24 = i10 + f15;
            float measuredWidth3 = getMeasuredWidth() - f15;
            if (this.V > 600000) {
                i11 = org.telegram.messenger.i0.L(42.0f);
            } else {
                i11 = 0;
            }
            float abs = Math.abs(f24 - (measuredWidth3 - i11)) - org.telegram.messenger.i0.L(66.0f);
            float f25 = this.f28844g0;
            if (f25 > f7 && Math.abs(f25 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.f28837b0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.f28837b0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.f28844g0 = abs;
            if (size != this.f28835a0) {
                StaticLayout[] staticLayoutArr3 = this.f28837b0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.f28852x) {
                    org.telegram.messenger.i0.b4(this);
                }
                if (size >= 0 && size < this.T.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.T.get(size)).second;
                    if (charSequence == null) {
                        this.f28837b0[0] = null;
                    } else {
                        this.f28837b0[0] = b((int) abs, charSequence);
                    }
                } else {
                    this.f28837b0[0] = null;
                }
                this.f28840d0 = f7;
                if (size == -1) {
                    this.f28841e0 = -1;
                } else {
                    int i19 = this.f28835a0;
                    if (i19 == -1) {
                        this.f28841e0 = 1;
                    } else if (size < i19) {
                        this.f28841e0 = -1;
                    } else if (size > i19) {
                        this.f28841e0 = 1;
                    }
                }
                this.f28835a0 = size;
            }
            if (this.f28840d0 < 1.0f) {
                long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f28843f0));
                if (this.T.size() > 8) {
                    f14 = 160.0f;
                } else {
                    f14 = 220.0f;
                }
                this.f28840d0 = Math.min((((float) min) / f14) + this.f28840d0, 1.0f);
                invalidate();
                this.f28843f0 = SystemClock.elapsedRealtime();
            }
            if (this.W < 1.0f) {
                this.W = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f28843f0))) / 200.0f) + this.W, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = gr.f26495f.getInterpolation(this.f28840d0);
            canvas2.save();
            canvas2.translate(f24 + org.telegram.messenger.i0.L(25.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.i0.L(14.0f));
            this.f28839c0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Gj, p6Var));
            if (this.f28837b0[1] != null) {
                canvas2.save();
                if (this.f28841e0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate((org.telegram.messenger.i0.L(f10) * (-this.f28841e0) * interpolation3) + org.telegram.messenger.i0.L(f11), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.f28837b0[1].getHeight()) / 2.0f);
                this.f28839c0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.W));
                canvas2.restore();
            }
            if (this.f28837b0[0] != null) {
                canvas2.save();
                if (this.f28841e0 != 0) {
                    f12 = 0.0f;
                    canvas2.translate(c3.i0.z(1.0f, interpolation3, org.telegram.messenger.i0.L(f10) * this.f28841e0, org.telegram.messenger.i0.L(f11)), 0.0f);
                } else {
                    f12 = 0.0f;
                }
                canvas2.translate(f12, (-this.f28837b0[0].getHeight()) / 2.0f);
                this.f28839c0.setAlpha((int) (interpolation3 * 255.0f * this.W));
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int L = org.telegram.messenger.i0.L(14.0f) + (getMeasuredHeight() / 2);
        o7 o7Var = this.O;
        int measuredHeight = (o7Var.getMeasuredHeight() / 2) + L;
        int i15 = this.f28842f / 2;
        if (this.V > 600000) {
            i14 = org.telegram.messenger.i0.L(42.0f);
        } else {
            i14 = 0;
        }
        int L2 = org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.L(25.0f) + i15 + i14;
        o7Var.layout(L2, measuredHeight - o7Var.getMeasuredHeight(), o7Var.getMeasuredWidth() + L2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f28847j0 = timestampLabelWidth;
        this.O.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f28850s != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.f28850s);
            this.f28850s = -100.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f7) {
        this.E = f7;
        invalidate();
    }

    public void setDelegate(mn0 mn0Var) {
        this.f28853y = mn0Var;
    }

    public void setInnerColor(int i10) {
        this.f28838c.setColor(i10);
    }

    public void setLineWidth(int i10) {
        this.L = i10;
    }

    public void setMinProgress(float f7) {
        this.f28851w = f7;
        float progress = getProgress();
        float f10 = this.f28851w;
        if (progress < f10) {
            e(false, f10);
        }
        invalidate();
    }

    public void setOuterColor(int i10) {
        this.d.setColor(i10);
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            org.telegram.ui.ActionBar.t6.H1(yVar, i0.b.o(i10, 40), true);
        }
    }

    public void setProgress(float f7) {
        e(false, f7);
    }

    public void setReportChanges(boolean z10) {
        this.D = z10;
    }

    public void setSeparatorsCount(int i10) {
        this.K = i10;
    }

    public void setTwoSided(boolean z10) {
        this.M = z10;
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            Paint paint = this.d;
            if (paint != null && paint.getColor() == this.f28834a && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Jj, this.N)) != this.f28834a) {
                this.f28834a = w02;
                setOuterColor(w02);
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.F) {
            return false;
        }
        return true;
    }

    public nn0(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.f28848n = new t5(this, 0L, 60L, gr.f26496g);
        this.f28850s = -100.0f;
        this.f28851w = -1.0f;
        this.H = new int[]{16842910, 16842919};
        this.I = 1.0f;
        this.L = 3;
        this.W = 0.0f;
        this.f28835a0 = -1;
        this.f28840d0 = 1.0f;
        this.f28844g0 = -1.0f;
        this.f28845h0 = new RectF();
        this.f28846i0 = -1;
        this.N = p6Var;
        setWillNotDraw(false);
        this.f28838c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i10 = org.telegram.ui.ActionBar.t6.Jj;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.f28834a = w02;
        paint.setColor(w02);
        this.f28842f = org.telegram.messenger.i0.L(32.0f);
        this.e = org.telegram.messenger.i0.L(24.0f);
        this.G = org.telegram.messenger.i0.L(6.0f);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), 40), 1, org.telegram.messenger.i0.L(16.0f));
        this.F = h02;
        h02.setCallback(this);
        h02.setVisible(true, false);
        o7 o7Var = new o7(this, context, context, 2);
        this.O = o7Var;
        o7Var.f29856y = true;
        addView(o7Var, w7.b6.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(this, z10);
        this.f28836b = w0Var;
        setAccessibilityDelegate(w0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
