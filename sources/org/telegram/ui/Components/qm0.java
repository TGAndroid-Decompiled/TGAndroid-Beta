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
public class qm0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static float[] f38705l0;
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
    public final org.telegram.ui.ActionBar.e6 O;
    public final q7 P;
    public boolean Q;
    public float R;
    public float S;
    public int T;
    public ArrayList U;
    public CharSequence V;
    public long W;
    public int f38706a;
    public float f38707a0;
    public final org.telegram.ui.ActionBar.u0 f38708b;
    public int f38709b0;
    public final Paint f38710c;
    public StaticLayout[] f38711c0;
    public final Paint d;
    public TextPaint f38712d0;
    public final int f38713e;
    public float f38714e0;
    public final int f38715f;
    public int f38716f0;
    public long f38717g0;
    public int h;
    public float f38718h0;
    public final RectF f38719i0;
    public int f38720j0;
    public int f38721k0;
    public final u5 f38722n;
    public int f38723r;
    public float f38724s;
    public float f38725w;
    public boolean f38726x;
    public pm0 f38727y;

    public qm0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i7;
        int i10 = this.f38715f;
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
        if (this.f38720j0 != i7) {
            this.f38720j0 = i7;
            if (i7 >= 0 && i7 < this.U.size()) {
                this.P.setText((CharSequence) ((Pair) this.U.get(this.f38720j0)).second);
            }
        }
    }

    public final void a(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qm0.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final StaticLayout b(int i7, CharSequence charSequence) {
        if (this.f38712d0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.f38712d0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        }
        this.f38712d0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Jj, this.O));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f38712d0, i7).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(org.telegram.messenger.g0.L(400.0f), i7)).build();
    }

    public final int c() {
        return Math.max((int) (this.f38725w * (getMeasuredWidth() - this.f38715f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.G;
        int i7 = this.f38713e;
        int i10 = this.f38715f;
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
                            this.f38723r = (int) (motionEvent.getX() - this.h);
                            this.f38726x = true;
                            this.f38727y.C();
                            if (yVar != null) {
                                yVar.setState(this.I);
                                yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.f38726x) {
                    int x11 = (int) (motionEvent.getX() - this.f38723r);
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
                    this.f38723r = (int) (motionEvent.getX() - this.h);
                    this.f38726x = true;
                }
            }
            if (this.f38726x) {
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
                this.f38727y.C();
                this.f38726x = false;
                org.telegram.messenger.g0.i3(new wa0(this, 25), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(boolean z10, float f10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.f38724s = f10;
            return;
        }
        this.f38724s = -100.0f;
        boolean z11 = this.N;
        int i7 = this.f38715f;
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
        pm0 pm0Var = this.f38727y;
        if (pm0Var != null) {
            pm0Var.l(z10, f10);
        }
        int i7 = this.L;
        if (i7 > 1) {
            int round = Math.round((i7 - 1) * f10);
            if (!z10 && round != this.T) {
                org.telegram.messenger.g0.b4(this);
            }
            this.T = round;
        }
    }

    public final void g(org.telegram.messenger.gj gjVar) {
        boolean z10;
        Integer z11;
        String str;
        if (gjVar == null) {
            this.U = null;
            this.f38709b0 = -1;
            this.f38707a0 = 0.0f;
            StaticLayout[] staticLayoutArr = this.f38711c0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        Long valueOf = Long.valueOf(((long) gjVar.L0()) * 1000);
        if (valueOf.longValue() < 0) {
            this.U = null;
            this.f38709b0 = -1;
            this.f38707a0 = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.f38711c0;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
            this.V = null;
            this.W = -1L;
            return;
        }
        CharSequence charSequence = gjVar.f23875z;
        if (gjVar.e5()) {
            if (gjVar.B == null && (str = gjVar.f23817k.media.webpage.description) != null) {
                gjVar.B = SpannableString.valueOf(str);
                org.telegram.messenger.gj.h(gjVar.N3(), gjVar.B, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = gjVar.B;
        }
        if (charSequence != this.V) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.W != valueOf.longValue()) {
            this.V = charSequence;
            this.W = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f38721k0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.U = null;
                this.f38709b0 = -1;
                this.f38707a0 = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.f38711c0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                f41[] f41VarArr = (f41[]) spanned.getSpans(0, spanned.length(), f41.class);
                this.U = new ArrayList();
                if (z10) {
                    this.f38707a0 = 0.0f;
                }
                if (this.f38712d0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f38712d0 = textPaint;
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    this.f38712d0.setColor(-1);
                }
                for (f41 f41Var : f41VarArr) {
                    if (f41Var != null && f41Var.getURL() != null && f41Var.d != null && f41Var.getURL().startsWith("audio?")) {
                        if (Utilities.z(f41Var.getURL().substring(6)).intValue() >= 0) {
                            float intValue = ((float) (z11.intValue() * 1000)) / ((float) valueOf.longValue());
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f41Var.d);
                            org.telegram.messenger.j6.l(spannableStringBuilder, this.f38712d0.getFontMetricsInt(), false);
                            this.U.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                        }
                    }
                }
                Collections.sort(this.U, new org.telegram.ui.me(14));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                this.U = null;
                this.f38709b0 = -1;
                this.f38707a0 = 0.0f;
                StaticLayout[] staticLayoutArr4 = this.f38711c0;
                if (staticLayoutArr4 != null) {
                    staticLayoutArr4[1] = null;
                    staticLayoutArr4[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.f38724s;
        }
        return this.h / (getMeasuredWidth() - this.f38715f);
    }

    public om0 getSeekBarAccessibilityDelegate() {
        return this.f38708b;
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
        int i12 = this.f38715f;
        if (!z11 && this.L > 1) {
            i11 = (int) this.f38722n.e(false, Math.round(i11 / measuredWidth) * ((getMeasuredWidth() - i12) / (this.L - 1.0f)));
        }
        int i13 = i11;
        int measuredHeight = getMeasuredHeight();
        int i14 = this.f38713e;
        int i15 = (measuredHeight - i14) / 2;
        int i16 = org.telegram.ui.ActionBar.j6.Kj;
        org.telegram.ui.ActionBar.e6 e6Var = this.O;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var);
        Paint paint = this.f38710c;
        paint.setColor(w02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f16 = i12 / 2.0f;
        int i17 = i12 / 2;
        float measuredWidth2 = getMeasuredWidth() - i17;
        float L = measuredHeight2 - (org.telegram.messenger.g0.L(this.M) / 2.0f);
        float L2 = (org.telegram.messenger.g0.L(this.M) / 2.0f) + measuredHeight2;
        RectF rectF = this.f38719i0;
        rectF.set(f16, L, measuredWidth2, L2);
        a(canvas2, rectF, paint);
        if (this.F > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Lj, e6Var));
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
            float f18 = this.f38725w;
            if (f18 >= f10) {
                float f19 = measuredWidth2 - f16;
                rectF.set((f18 * f19) + f16, L, i13 + f16, L2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f16, L, (this.f38725w * f19) + f16, L2);
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
        if (this.f38726x) {
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
                float v = org.telegram.messenger.i20.v((float) elapsedRealtime, 60.0f, org.telegram.messenger.g0.L(1.0f), f20);
                this.H = v;
                if (v < f21) {
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
            float interpolation = 1.0f - qs.f38758c.getInterpolation(Math.min(1.0f, f24 * 3.0f));
            float interpolation2 = qs.d.getInterpolation(this.J);
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
            if (this.f38711c0 == null) {
                this.f38711c0 = new StaticLayout[2];
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
            float f26 = this.f38718h0;
            if (f26 > f10 && Math.abs(f26 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.f38711c0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.f38711c0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.f38718h0 = abs;
            if (size != this.f38709b0) {
                StaticLayout[] staticLayoutArr3 = this.f38711c0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.f38726x) {
                    org.telegram.messenger.g0.b4(this);
                }
                if (size >= 0 && size < this.U.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.U.get(size)).second;
                    if (charSequence == null) {
                        this.f38711c0[0] = null;
                    } else {
                        this.f38711c0[0] = b((int) abs, charSequence);
                    }
                } else {
                    this.f38711c0[0] = null;
                }
                this.f38714e0 = f10;
                if (size == -1) {
                    this.f38716f0 = -1;
                } else {
                    int i18 = this.f38709b0;
                    if (i18 == -1) {
                        this.f38716f0 = 1;
                    } else if (size < i18) {
                        this.f38716f0 = -1;
                    } else if (size > i18) {
                        this.f38716f0 = 1;
                    }
                }
                this.f38709b0 = size;
            }
            if (this.f38714e0 < 1.0f) {
                long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f38717g0));
                if (this.U.size() > 8) {
                    f15 = 160.0f;
                } else {
                    f15 = 220.0f;
                }
                this.f38714e0 = Math.min((((float) min) / f15) + this.f38714e0, 1.0f);
                invalidate();
                this.f38717g0 = SystemClock.elapsedRealtime();
            }
            if (this.f38707a0 < 1.0f) {
                this.f38707a0 = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f38717g0))) / 200.0f) + this.f38707a0, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = er.f34420f.getInterpolation(this.f38714e0);
            canvas2.save();
            canvas2.translate(f25 + org.telegram.messenger.g0.L(25.0f), (getMeasuredHeight() / 2.0f) + org.telegram.messenger.g0.L(14.0f));
            this.f38712d0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Jj, e6Var));
            if (this.f38711c0[1] != null) {
                canvas2.save();
                if (this.f38716f0 != 0) {
                    f14 = 0.0f;
                    canvas2.translate((org.telegram.messenger.g0.L(f11) * (-this.f38716f0) * interpolation3) + org.telegram.messenger.g0.L(f12), 0.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas2.translate(f14, (-this.f38711c0[1].getHeight()) / 2.0f);
                this.f38712d0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.f38707a0));
                canvas2.restore();
            }
            if (this.f38711c0[0] != null) {
                canvas2.save();
                if (this.f38716f0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate(com.google.android.gms.internal.vision.e2.z(1.0f, interpolation3, org.telegram.messenger.g0.L(f11) * this.f38716f0, org.telegram.messenger.g0.L(f12)), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.f38711c0[0].getHeight()) / 2.0f);
                this.f38712d0.setAlpha((int) (interpolation3 * 255.0f * this.f38707a0));
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
        q7 q7Var = this.P;
        int measuredHeight = (q7Var.getMeasuredHeight() / 2) + L;
        int i14 = this.f38715f / 2;
        if (this.W > 600000) {
            i13 = org.telegram.messenger.g0.L(42.0f);
        } else {
            i13 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(25.0f) + i14 + i13;
        q7Var.layout(L2, measuredHeight - q7Var.getMeasuredHeight(), q7Var.getMeasuredWidth() + L2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f38721k0 = timestampLabelWidth;
        this.P.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f38724s != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.f38724s);
            this.f38724s = -100.0f;
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

    public void setDelegate(pm0 pm0Var) {
        this.f38727y = pm0Var;
    }

    public void setInnerColor(int i7) {
        this.f38710c.setColor(i7);
    }

    public void setLineWidth(int i7) {
        this.M = i7;
    }

    public void setMinProgress(float f10) {
        this.f38725w = f10;
        float progress = getProgress();
        float f11 = this.f38725w;
        if (progress < f11) {
            e(false, f11);
        }
        invalidate();
    }

    public void setOuterColor(int i7) {
        this.d.setColor(i7);
        org.telegram.ui.Cells.y yVar = this.G;
        if (yVar != null) {
            org.telegram.ui.ActionBar.j6.H1(yVar, i0.a.o(i7, 40), true);
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
            if (paint != null && paint.getColor() == this.f38706a && (w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Mj, this.O)) != this.f38706a) {
                this.f38706a = w02;
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

    public qm0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f38722n = new u5(this, 0L, 60L, er.f34421g);
        this.f38724s = -100.0f;
        this.f38725w = -1.0f;
        this.I = new int[]{16842910, 16842919};
        this.J = 1.0f;
        this.M = 3;
        this.f38707a0 = 0.0f;
        this.f38709b0 = -1;
        this.f38714e0 = 1.0f;
        this.f38718h0 = -1.0f;
        this.f38719i0 = new RectF();
        this.f38720j0 = -1;
        this.O = e6Var;
        setWillNotDraw(false);
        this.f38710c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i7 = org.telegram.ui.ActionBar.j6.Mj;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        this.f38706a = w02;
        paint.setColor(w02);
        this.f38715f = org.telegram.messenger.g0.L(32.0f);
        this.f38713e = org.telegram.messenger.g0.L(24.0f);
        this.H = org.telegram.messenger.g0.L(6.0f);
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(i0.a.o(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), 40), 1, org.telegram.messenger.g0.L(16.0f));
        this.G = h02;
        h02.setCallback(this);
        h02.setVisible(true, false);
        q7 q7Var = new q7(this, context, context, 2);
        this.P = q7Var;
        q7Var.f39575y = true;
        addView(q7Var, c8.ja.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(this, z10);
        this.f38708b = u0Var;
        setAccessibilityDelegate(u0Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
