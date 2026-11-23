package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
@Deprecated
public class UndoView extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final int f33173j0 = 0;
    public final TextPaint E;
    public final Paint F;
    public final RectF G;
    public long H;
    public int I;
    public String J;
    public int K;
    public int L;
    public ArrayList M;
    public Runnable N;
    public Runnable O;
    public long P;
    public float Q;
    public boolean R;
    public final boolean S;
    public CharSequence T;
    public int U;
    public final ShapeDrawable V;
    public final org.telegram.ui.ActionBar.h6 W;
    public int f33174a;
    public boolean f33175a0;
    public final org.telegram.ui.Cells.c2 f33176b;
    public final ArrayList f33177b0;
    public final TextView f33178c;
    public final ArrayList f33179c0;
    public final TextView d;
    public final ArrayList f33180d0;
    public final ImageView f33181e;
    public int f33182e0;
    public final rh0 f33183f;
    public StaticLayout f33184f0;
    public StaticLayout f33185g0;
    public final q9 h;
    public float f33186h0;
    public float f33187i0;
    public final LinearLayout f33188n;
    public int f33189r;
    public final org.telegram.ui.ActionBar.g2 f33190s;
    public Object f33191w;
    public Object f33192x;
    public final int f33193y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.wj));
    }

    public final boolean c() {
        int i7;
        Object obj;
        int i10 = this.L;
        if (i10 != 11 && i10 != 24 && i10 != 6 && i10 != 3 && i10 != 5 && i10 != 13 && i10 != 14 && i10 != 74) {
            if ((i10 != 7 || !org.telegram.messenger.np.u1(this.f33193y).Q0.isEmpty()) && (i7 = this.L) != 83 && i7 != 85) {
                if (i7 != 88 || (obj = this.f33192x) == null || ((Integer) obj).intValue() <= 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public void d(int i7, boolean z10) {
        boolean z11;
        if (getVisibility() == 0 && this.R) {
            this.f33191w = null;
            this.f33192x = null;
            this.R = false;
            Runnable runnable = this.N;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.N = null;
            }
            Runnable runnable2 = this.O;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.O = null;
            }
            int i10 = this.L;
            if (i10 == 0 || i10 == 1 || i10 == 95 || i10 == 26 || i10 == 27) {
                for (int i11 = 0; i11 < this.M.size(); i11++) {
                    long longValue = ((Long) this.M.get(i11)).longValue();
                    org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.f33193y);
                    int i12 = this.L;
                    if (i12 != 0 && i12 != 26) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    TLRPC.Dialog dialog = (TLRPC.Dialog) u12.R.f(longValue);
                    if (dialog != null) {
                        if (z11) {
                            u12.F0.l(longValue);
                        } else {
                            u12.E0.l(longValue);
                            if (!z10) {
                                u12.f25972y.add(dialog);
                                u12.f5(null);
                            }
                        }
                        if (!z10) {
                            u12.getNotificationCenter().k(org.telegram.messenger.ls.f25342s, Boolean.TRUE);
                        }
                    }
                    g(this.L, longValue);
                }
            }
            float f10 = 1.0f;
            boolean z12 = this.S;
            if (i7 != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i7 == 1) {
                    if (z12) {
                        f10 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f10 * (this.f33182e0 + this.f33189r)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new t11(this, 3));
                animatorSet.start();
                return;
            }
            if (z12) {
                f10 = -1.0f;
            }
            setEnterOffset(f10 * (this.f33182e0 + this.f33189r));
            setVisibility(4);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.Q != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f33187i0) + org.telegram.messenger.g0.L(9.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        int i7 = this.L;
        if (i7 != 12 && i7 != 15 && i7 != 24 && i7 != 74 && i7 != 83) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        int i7 = this.L;
        if (i7 != 6 && i7 != 3 && i7 != 5 && i7 != 7 && i7 != 8 && i7 != 87 && i7 != 9 && i7 != 10 && i7 != 13 && i7 != 14 && i7 != 19 && i7 != 20 && i7 != 21 && i7 != 22 && i7 != 23 && i7 != 30 && i7 != 31 && i7 != 32 && i7 != 102 && i7 != 33 && i7 != 34 && i7 != 35 && i7 != 36 && i7 != 74 && i7 != 37 && i7 != 38 && i7 != 39 && i7 != 40 && i7 != 42 && i7 != 43 && i7 != 77 && i7 != 44 && i7 != 78 && i7 != 79 && i7 != 100 && i7 != 101 && i7 != 83) {
            return false;
        }
        return true;
    }

    @Override
    public Drawable getBackground() {
        return this.V;
    }

    public Object getCurrentInfoObject() {
        return this.f33191w;
    }

    public float getEnterOffset() {
        return this.f33187i0;
    }

    public View getUndoButton() {
        return this.f33188n;
    }

    public final void h(int i7, int i10) {
        this.f33175a0 = true;
        org.telegram.ui.ActionBar.m6.C1(-115203550, this.V);
        org.telegram.ui.Cells.c2 c2Var = this.f33176b;
        org.telegram.ui.ActionBar.t6.q(c2Var);
        int i11 = org.telegram.ui.ActionBar.m6.xj;
        org.telegram.ui.ActionBar.h6 h6Var = this.W;
        org.telegram.ui.ActionBar.t6.G(c2Var, i11, h6Var);
        TextView textView = this.f33178c;
        org.telegram.ui.ActionBar.t6.q(textView);
        org.telegram.ui.ActionBar.t6.G(textView, i11, h6Var);
        c2Var.setTextColor(-1);
        textView.setTextColor(-1);
        ArrayList arrayList = this.f33177b0;
        int indexOf = arrayList.indexOf("info1");
        ArrayList arrayList2 = this.f33180d0;
        ArrayList arrayList3 = this.f33179c0;
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            arrayList3.remove(indexOf);
            arrayList2.remove(indexOf);
        }
        int indexOf2 = arrayList.indexOf("info2");
        if (indexOf2 >= 0) {
            arrayList.remove(indexOf2);
            arrayList3.remove(indexOf2);
            arrayList2.remove(indexOf2);
        }
        rh0 rh0Var = this.f33183f;
        rh0Var.h(-14540254, "info1");
        rh0Var.h(-14540254, "info2");
    }

    public final void i(int i7, String str, boolean z10) {
        int w02;
        ArrayList arrayList = this.f33177b0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.f33180d0;
        ArrayList arrayList3 = this.f33179c0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i7));
            arrayList2.set(indexOf, Boolean.valueOf(z10));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i7));
            arrayList2.add(Boolean.valueOf(z10));
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.W;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var) | (-16777216);
        } else {
            w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        }
        this.f33183f.h(w02, str);
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.f33176b.invalidate();
        this.f33183f.invalidate();
    }

    public final void j(int i7, long j3, Runnable runnable) {
        k(j3, i7, null, null, runnable, null);
    }

    public void k(long j3, int i7, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j3));
        n(arrayList, i7, obj, obj2, runnable, runnable2);
    }

    public final void l(long j3, int i7, Runnable runnable, Runnable runnable2) {
        k(j3, i7, null, null, runnable, runnable2);
    }

    public final void m(long j3, Object obj, int i7) {
        k(j3, i7, obj, null, null, null);
    }

    public final void n(java.util.ArrayList r40, int r41, java.lang.Object r42, java.lang.Object r43, java.lang.Runnable r44, java.lang.Runnable r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UndoView.n(java.util.ArrayList, int, java.lang.Object, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i7;
        String format;
        int i10 = (this.Q > 0.0f ? 1 : (this.Q == 0.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.V;
        if (i10 != 0) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f33187i0) + this.f33182e0 + org.telegram.messenger.g0.L(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i11 = this.L;
        if (i11 == 1 || i11 == 95 || i11 == 0 || i11 == 27 || i11 == 26 || i11 == 81 || i11 == 88) {
            if (this.H > 0) {
                i7 = (int) Math.ceil(((float) j3) / 1000.0f);
            } else {
                i7 = 0;
            }
            int i12 = this.I;
            TextPaint textPaint = this.E;
            if (i12 != i7) {
                this.I = i7;
                this.J = String.format("%d", Integer.valueOf(Math.max(1, i7)));
                StaticLayout staticLayout = this.f33184f0;
                if (staticLayout != null) {
                    this.f33185g0 = staticLayout;
                    this.f33186h0 = 0.0f;
                }
                this.K = (int) Math.ceil(textPaint.measureText(format));
                this.f33184f0 = new StaticLayout(this.J, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f10 = this.f33186h0;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.f33186h0 = f11;
                if (f11 > 1.0f) {
                    this.f33186h0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.f33185g0;
            RectF rectF = this.G;
            if (staticLayout2 != null) {
                float f12 = this.f33186h0;
                if (f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.K / 2), (org.telegram.messenger.g0.L(10.0f) * this.f33186h0) + org.telegram.messenger.g0.L(17.2f));
                    this.f33185g0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.f33184f0 != null) {
                float f13 = this.f33186h0;
                if (f13 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f13));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.K / 2), com.google.android.gms.internal.vision.e2.t(1.0f, this.f33186h0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(17.2f)));
                this.f33184f0.draw(canvas);
                if (this.f33186h0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (((float) this.H) / 5000.0f) * (-360.0f), false, this.F);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.H - (elapsedRealtime - this.P);
        this.H = j10;
        this.P = elapsedRealtime;
        if (j10 <= 0) {
            d(this.U, true);
        }
        if (this.L != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f33189r, 1073741824));
        this.V.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            setTranslationY(((this.f33187i0 - this.f33182e0) + org.telegram.messenger.g0.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.f33187i0 != f10) {
            this.f33187i0 = f10;
            setTranslationY(((f10 - this.f33182e0) + org.telegram.messenger.g0.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i7) {
        this.f33182e0 = i7;
    }

    public void setHideAnimationType(int i7) {
        this.U = i7;
    }

    public void setInfoText(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h6 h6Var;
        ArrayList arrayList = this.f33177b0;
        try {
            if (!this.f33175a0) {
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    h6Var = this.W;
                    if (i7 >= size) {
                        break;
                    }
                    int w02 = org.telegram.ui.ActionBar.m6.w0(((Integer) this.f33179c0.get(i7)).intValue(), h6Var);
                    rh0 rh0Var = this.f33183f;
                    String str = (String) arrayList.get(i7);
                    if (((Boolean) this.f33180d0.get(i7)).booleanValue()) {
                        w02 |= -16777216;
                    }
                    rh0Var.h(w02, str);
                    i7++;
                }
                Paint paint = this.F;
                int i10 = org.telegram.ui.ActionBar.m6.yj;
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
                this.E.setColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
                org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, h6Var), this.V);
                invalidate();
                LinearLayout linearLayout = this.f33188n;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.m6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var) & 587202559, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public UndoView(Context context, org.telegram.ui.x71 x71Var) {
        this(context, x71Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f33174a = 0;
        this.f33193y = org.telegram.messenger.k10.f24932t0;
        this.L = -1;
        this.U = 1;
        this.f33177b0 = new ArrayList();
        this.f33179c0 = new ArrayList();
        this.f33180d0 = new ArrayList();
        this.f33182e0 = org.telegram.messenger.g0.L(8.0f);
        this.f33186h0 = 1.0f;
        this.W = h6Var;
        this.f33190s = g2Var;
        this.S = z10;
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(this, context, h6Var);
        this.f33176b = c2Var;
        c2Var.setTextSize(1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.m6.yj;
        org.telegram.ui.ActionBar.t6.U(c2Var, i7, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.xj;
        org.telegram.ui.ActionBar.t6.G(c2Var, i10, h6Var);
        c2Var.setMovementMethod(new x41(this));
        addView(c2Var, c8.na.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f33178c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(textView, i10, h6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.c0(false));
        addView(textView, c8.na.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f33183f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.m6.wj;
        i(i11, "info1", true);
        i(i11, "info2", true);
        i(i7, "luc12", false);
        i(i7, "luc11", false);
        i(i7, "luc10", false);
        i(i7, "luc9", false);
        i(i7, "luc8", false);
        i(i7, "luc7", false);
        i(i7, "luc6", false);
        i(i7, "luc5", false);
        i(i7, "luc4", false);
        i(i7, "luc3", false);
        i(i7, "luc2", false);
        i(i7, "luc1", false);
        i(i7, "Oval", false);
        addView((View) imageView, c8.na.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        q9 q9Var = new q9(context);
        this.h = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(q9Var, c8.na.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33188n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i10, h6Var) & 587202559, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f)));
        addView(linearLayout, c8.na.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new w41(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.f33181e = imageView2;
        imageView2.setImageResource(2131231001);
        org.telegram.ui.ActionBar.t6.s(imageView2, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.na.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        i5.c.x(textView2, 1, 14.0f);
        org.telegram.messenger.o10.r(textView2, i10, h6Var, null, 2131743642);
        linearLayout.addView(textView2, c8.na.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        setWillNotDraw(false);
        this.V = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
        setOnTouchListener(new gi.a(27));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i7, long j3) {
    }
}
