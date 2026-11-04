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
import org.telegram.ui.l71;
@Deprecated
public class UndoView extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public static final int f31669j0 = 0;
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
    public final org.telegram.ui.ActionBar.e6 W;
    public int f31670a;
    public boolean f31671a0;
    public final org.telegram.ui.Cells.b2 f31672b;
    public final ArrayList f31673b0;
    public final TextView f31674c;
    public final ArrayList f31675c0;
    public final TextView d;
    public final ArrayList f31676d0;
    public final ImageView f31677e;
    public int f31678e0;
    public final fh0 f31679f;
    public StaticLayout f31680f0;
    public StaticLayout f31681g0;
    public final k9 h;
    public float f31682h0;
    public float f31683i0;
    public final LinearLayout f31684n;
    public int f31685r;
    public final org.telegram.ui.ActionBar.d2 f31686s;
    public Object f31687w;
    public Object f31688x;
    public final int f31689y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
    }

    public final boolean c() {
        int i3;
        Object obj;
        int i10 = this.L;
        if (i10 != 11 && i10 != 24 && i10 != 6 && i10 != 3 && i10 != 5 && i10 != 13 && i10 != 14 && i10 != 74) {
            if ((i10 != 7 || !org.telegram.messenger.hp.s1(this.f31689y).Q0.isEmpty()) && (i3 = this.L) != 83 && i3 != 85) {
                if (i3 != 88 || (obj = this.f31688x) == null || ((Integer) obj).intValue() <= 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public void d(int i3, boolean z10) {
        boolean z11;
        if (getVisibility() == 0 && this.R) {
            this.f31687w = null;
            this.f31688x = null;
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
                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(this.f31689y);
                    int i12 = this.L;
                    if (i12 != 0 && i12 != 26) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    TLRPC.Dialog dialog = (TLRPC.Dialog) s12.R.f(longValue);
                    if (dialog != null) {
                        if (z11) {
                            s12.F0.l(longValue);
                        } else {
                            s12.E0.l(longValue);
                            if (!z10) {
                                s12.f23169y.add(dialog);
                                s12.T4(null);
                            }
                        }
                        if (!z10) {
                            s12.getNotificationCenter().k(org.telegram.messenger.hs.f23298s, Boolean.TRUE);
                        }
                    }
                    g(this.L, longValue);
                }
            }
            float f10 = 1.0f;
            boolean z12 = this.S;
            if (i3 != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i3 == 1) {
                    if (z12) {
                        f10 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f10 * (this.f31678e0 + this.f31685r)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new j01(this, 4));
                animatorSet.start();
                return;
            }
            if (z12) {
                f10 = -1.0f;
            }
            setEnterOffset(f10 * (this.f31678e0 + this.f31685r));
            setVisibility(4);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.Q != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f31683i0) + org.telegram.messenger.g0.L(9.0f);
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
        int i3 = this.L;
        if (i3 != 12 && i3 != 15 && i3 != 24 && i3 != 74 && i3 != 83) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        int i3 = this.L;
        if (i3 != 6 && i3 != 3 && i3 != 5 && i3 != 7 && i3 != 8 && i3 != 87 && i3 != 9 && i3 != 10 && i3 != 13 && i3 != 14 && i3 != 19 && i3 != 20 && i3 != 21 && i3 != 22 && i3 != 23 && i3 != 30 && i3 != 31 && i3 != 32 && i3 != 102 && i3 != 33 && i3 != 34 && i3 != 35 && i3 != 36 && i3 != 74 && i3 != 37 && i3 != 38 && i3 != 39 && i3 != 40 && i3 != 42 && i3 != 43 && i3 != 77 && i3 != 44 && i3 != 78 && i3 != 79 && i3 != 100 && i3 != 101 && i3 != 83) {
            return false;
        }
        return true;
    }

    @Override
    public Drawable getBackground() {
        return this.V;
    }

    public Object getCurrentInfoObject() {
        return this.f31687w;
    }

    public float getEnterOffset() {
        return this.f31683i0;
    }

    public View getUndoButton() {
        return this.f31684n;
    }

    public final void h(int i3, int i10) {
        this.f31671a0 = true;
        org.telegram.ui.ActionBar.k6.C1(-115203550, this.V);
        org.telegram.ui.Cells.b2 b2Var = this.f31672b;
        org.telegram.ui.ActionBar.r6.r(b2Var);
        int i11 = org.telegram.ui.ActionBar.k6.uj;
        org.telegram.ui.ActionBar.e6 e6Var = this.W;
        org.telegram.ui.ActionBar.r6.H(b2Var, i11, e6Var);
        TextView textView = this.f31674c;
        org.telegram.ui.ActionBar.r6.r(textView);
        org.telegram.ui.ActionBar.r6.H(textView, i11, e6Var);
        b2Var.setTextColor(-1);
        textView.setTextColor(-1);
        ArrayList arrayList = this.f31673b0;
        int indexOf = arrayList.indexOf("info1");
        ArrayList arrayList2 = this.f31676d0;
        ArrayList arrayList3 = this.f31675c0;
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
        fh0 fh0Var = this.f31679f;
        fh0Var.h(-14540254, "info1");
        fh0Var.h(-14540254, "info2");
    }

    public final void i(int i3, String str, boolean z10) {
        int w02;
        ArrayList arrayList = this.f31673b0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.f31676d0;
        ArrayList arrayList3 = this.f31675c0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i3));
            arrayList2.set(indexOf, Boolean.valueOf(z10));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i3));
            arrayList2.add(Boolean.valueOf(z10));
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.W;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var) | (-16777216);
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        }
        this.f31679f.h(w02, str);
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.f31672b.invalidate();
        this.f31679f.invalidate();
    }

    public final void j(int i3, long j10, Runnable runnable) {
        k(j10, i3, null, null, runnable, null);
    }

    public void k(long j10, int i3, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        n(arrayList, i3, obj, obj2, runnable, runnable2);
    }

    public final void l(long j10, int i3, Runnable runnable, Runnable runnable2) {
        k(j10, i3, null, null, runnable, runnable2);
    }

    public final void m(long j10, Object obj, int i3) {
        k(j10, i3, obj, null, null, null);
    }

    public final void n(java.util.ArrayList r37, int r38, java.lang.Object r39, java.lang.Object r40, java.lang.Runnable r41, java.lang.Runnable r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UndoView.n(java.util.ArrayList, int, java.lang.Object, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        int i3;
        String format;
        int i10 = (this.Q > 0.0f ? 1 : (this.Q == 0.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.V;
        if (i10 != 0) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f31683i0) + this.f31678e0 + org.telegram.messenger.g0.L(1.0f);
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
                i3 = (int) Math.ceil(((float) j10) / 1000.0f);
            } else {
                i3 = 0;
            }
            int i12 = this.I;
            TextPaint textPaint = this.E;
            if (i12 != i3) {
                this.I = i3;
                this.J = String.format("%d", Integer.valueOf(Math.max(1, i3)));
                StaticLayout staticLayout = this.f31680f0;
                if (staticLayout != null) {
                    this.f31681g0 = staticLayout;
                    this.f31682h0 = 0.0f;
                }
                this.K = (int) Math.ceil(textPaint.measureText(format));
                this.f31680f0 = new StaticLayout(this.J, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f10 = this.f31682h0;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.f31682h0 = f11;
                if (f11 > 1.0f) {
                    this.f31682h0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.f31681g0;
            RectF rectF = this.G;
            if (staticLayout2 != null) {
                float f12 = this.f31682h0;
                if (f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.K / 2), (org.telegram.messenger.g0.L(10.0f) * this.f31682h0) + org.telegram.messenger.g0.L(17.2f));
                    this.f31681g0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.f31680f0 != null) {
                float f13 = this.f31682h0;
                if (f13 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f13));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.K / 2), a1.g.D(1.0f, this.f31682h0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(17.2f)));
                this.f31680f0.draw(canvas);
                if (this.f31682h0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (((float) this.H) / 5000.0f) * (-360.0f), false, this.F);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.H - (elapsedRealtime - this.P);
        this.H = j11;
        this.P = elapsedRealtime;
        if (j11 <= 0) {
            d(this.U, true);
        }
        if (this.L != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f31685r, 1073741824));
        this.V.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            setTranslationY(((this.f31683i0 - this.f31678e0) + org.telegram.messenger.g0.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.f31683i0 != f10) {
            this.f31683i0 = f10;
            setTranslationY(((f10 - this.f31678e0) + org.telegram.messenger.g0.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i3) {
        this.f31678e0 = i3;
    }

    public void setHideAnimationType(int i3) {
        this.U = i3;
    }

    public void setInfoText(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var;
        ArrayList arrayList = this.f31673b0;
        try {
            if (!this.f31671a0) {
                int i3 = 0;
                while (true) {
                    int size = arrayList.size();
                    e6Var = this.W;
                    if (i3 >= size) {
                        break;
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(((Integer) this.f31675c0.get(i3)).intValue(), e6Var);
                    fh0 fh0Var = this.f31679f;
                    String str = (String) arrayList.get(i3);
                    if (((Boolean) this.f31676d0.get(i3)).booleanValue()) {
                        w02 |= -16777216;
                    }
                    fh0Var.h(w02, str);
                    i3++;
                }
                Paint paint = this.F;
                int i10 = org.telegram.ui.ActionBar.k6.vj;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
                this.E.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, e6Var), this.V);
                invalidate();
                LinearLayout linearLayout = this.f31684n;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.k6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var) & 587202559, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public UndoView(Context context, l71 l71Var) {
        this(context, l71Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.d2 d2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f31670a = 0;
        this.f31689y = org.telegram.messenger.h10.f22829t0;
        this.L = -1;
        this.U = 1;
        this.f31673b0 = new ArrayList();
        this.f31675c0 = new ArrayList();
        this.f31676d0 = new ArrayList();
        this.f31678e0 = org.telegram.messenger.g0.L(8.0f);
        this.f31682h0 = 1.0f;
        this.W = e6Var;
        this.f31686s = d2Var;
        this.S = z10;
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, context, e6Var);
        this.f31672b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        int i3 = org.telegram.ui.ActionBar.k6.vj;
        org.telegram.ui.ActionBar.r6.V(b2Var, i3, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        org.telegram.ui.ActionBar.r6.H(b2Var, i10, e6Var);
        b2Var.setMovementMethod(new a41(this));
        addView(b2Var, b8.mf.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f31674c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(textView, i10, e6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.c0(false));
        addView(textView, b8.mf.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f31679f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.k6.tj;
        i(i11, "info1", true);
        i(i11, "info2", true);
        i(i3, "luc12", false);
        i(i3, "luc11", false);
        i(i3, "luc10", false);
        i(i3, "luc9", false);
        i(i3, "luc8", false);
        i(i3, "luc7", false);
        i(i3, "luc6", false);
        i(i3, "luc5", false);
        i(i3, "luc4", false);
        i(i3, "luc3", false);
        i(i3, "luc2", false);
        i(i3, "luc1", false);
        i(i3, "Oval", false);
        addView((View) imageView, b8.mf.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        k9 k9Var = new k9(context);
        this.h = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(k9Var, b8.mf.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31684n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var) & 587202559, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f)));
        addView(linearLayout, b8.mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new z31(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.f31677e = imageView2;
        imageView2.setImageResource(2131231001);
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, b8.mf.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        k2.p1.t(textView2, 1, 14.0f);
        org.telegram.messenger.camera.q.o(textView2, i10, e6Var, null, 2131743895);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        setWillNotDraw(false);
        this.V = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        setOnTouchListener(new fi.a(26));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i3, long j10) {
    }
}
