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
public class UndoView extends FrameLayout implements snb {
    public static final int j0 = 0;
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
    public final vnb W;
    public byte a;
    public boolean a0;
    public final te1 b;
    public final ArrayList b0;
    public final TextView c;
    public final ArrayList c0;
    public final TextView d;
    public final ArrayList d0;
    public final ImageView e;
    public int e0;
    public final e29 f;
    public StaticLayout f0;
    public StaticLayout g0;
    public final de0 h;
    public float h0;
    public float i0;
    public final LinearLayout n;
    public int r;
    public final org.telegram.ui.ActionBar.e s;
    public Object w;
    public Object x;
    public final int y;

    public UndoView(Context context, org.telegram.ui.ActionBar.e eVar, boolean z, vnb vnbVar) {
        super(context);
        this.a = (byte) 0;
        this.y = yac.t0;
        this.L = -1;
        this.U = 1;
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = hl.L(8.0f);
        this.h0 = 1.0f;
        this.W = vnbVar;
        this.s = eVar;
        this.S = z;
        te1 te1Var = new te1(this, context, vnbVar);
        this.b = te1Var;
        te1Var.setTextSize(1, 15.0f);
        int i = aob.yj;
        yob.X(te1Var, i, vnbVar);
        int i2 = aob.xj;
        yob.G(te1Var, i2, vnbVar);
        te1Var.setMovementMethod(new c9c(this));
        addView(te1Var, tre.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        yob.X(textView, i, vnbVar);
        yob.G(textView, i2, vnbVar);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new dl((byte) 0));
        addView(textView, tre.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = aob.wj;
        i(i3, "info1", true);
        i(i3, "info2", true);
        i(i, "luc12", false);
        i(i, "luc11", false);
        i(i, "luc10", false);
        i(i, "luc9", false);
        i(i, "luc8", false);
        i(i, "luc7", false);
        i(i, "luc6", false);
        i(i, "luc5", false);
        i(i, "luc4", false);
        i(i, "luc3", false);
        i(i, "luc2", false);
        i(i, "luc1", false);
        i(i, "Oval", false);
        addView((View) imageView, tre.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.h = de0Var;
        de0Var.setRoundRadius(hl.L(15.0f));
        addView(de0Var, tre.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(aob.Y(aob.v0(i2, vnbVar) & 587202559, hl.L(2.0f), hl.L(2.0f)));
        addView(linearLayout, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new b9c(this, (byte) 0));
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setImageResource(2131231003);
        yob.s(imageView2, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, tre.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        bs2.t(textView2, 1, 14.0f);
        ik8.x(textView2, i2, vnbVar, null, 2131743540);
        linearLayout.addView(textView2, tre.t(-2, -2, 19, 6, 4, 8, 4));
        this.G = new RectF(hl.L(15.0f), hl.L(15.0f), hl.L(33.0f), hl.L(33.0f));
        Paint paint = new Paint(1);
        this.F = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(aob.v0(i, vnbVar));
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setTypeface(hl.o());
        textPaint.setColor(aob.v0(i, vnbVar));
        setWillNotDraw(false);
        this.V = aob.b0(hl.L(10.0f), aob.v0(i3, vnbVar));
        setOnTouchListener(new vqb((byte) 4));
        setVisibility(4);
    }

    public boolean a() {
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.wj));
    }

    public final boolean c() {
        int i;
        Object obj;
        int i2 = this.L;
        if (i2 != 11 && i2 != 24 && i2 != 6 && i2 != 3 && i2 != 5 && i2 != 13 && i2 != 14 && i2 != 74) {
            if ((i2 != 7 || !uc7.s1(this.y).G0.isEmpty()) && (i = this.L) != 83 && i != 85) {
                if (i != 88 || (obj = this.x) == null || ((Integer) obj).intValue() <= 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public void d(int i, boolean z) {
        boolean z2;
        if (getVisibility() == 0 && this.R) {
            this.w = null;
            this.x = null;
            this.R = false;
            Runnable runnable = this.N;
            if (runnable != null) {
                if (z) {
                    runnable.run();
                }
                this.N = null;
            }
            Runnable runnable2 = this.O;
            if (runnable2 != null) {
                if (!z) {
                    runnable2.run();
                }
                this.O = null;
            }
            int i2 = this.L;
            if (i2 == 0 || i2 == 1 || i2 == 95 || i2 == 26 || i2 == 27) {
                for (int i3 = 0; i3 < this.M.size(); i3++) {
                    long longValue = ((Long) this.M.get(i3)).longValue();
                    uc7 s1 = uc7.s1(this.y);
                    int i4 = this.L;
                    if (i4 != 0 && i4 != 26) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    TLRPC.Dialog dialog = (TLRPC.Dialog) s1.R.f(longValue);
                    if (dialog != null) {
                        if (z2) {
                            s1.v0.l(longValue);
                        } else {
                            s1.u0.l(longValue);
                            if (!z) {
                                s1.y.add(dialog);
                                s1.h5(null);
                            }
                        }
                        if (!z) {
                            s1.getNotificationCenter().k(jn7.r, Boolean.TRUE);
                        }
                    }
                    g(this.L, longValue);
                }
            }
            float f = 1.0f;
            boolean z3 = this.S;
            if (i != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i == 1) {
                    if (z3) {
                        f = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f * (this.e0 + this.r)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new omb(this, (byte) 11));
                animatorSet.start();
                return;
            }
            if (z3) {
                f = -1.0f;
            }
            setEnterOffset(f * (this.e0 + this.r));
            setVisibility(4);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.Q != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.i0) + hl.L(9.0f);
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
        int i = this.L;
        if (i != 12 && i != 15 && i != 24 && i != 74 && i != 83) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        int i = this.L;
        if (i != 6 && i != 3 && i != 5 && i != 7 && i != 8 && i != 87 && i != 9 && i != 10 && i != 13 && i != 14 && i != 19 && i != 20 && i != 21 && i != 22 && i != 23 && i != 30 && i != 31 && i != 32 && i != 102 && i != 33 && i != 34 && i != 35 && i != 36 && i != 74 && i != 37 && i != 38 && i != 39 && i != 40 && i != 42 && i != 43 && i != 77 && i != 44 && i != 78 && i != 79 && i != 100 && i != 101 && i != 83) {
            return false;
        }
        return true;
    }

    @Override
    public Drawable getBackground() {
        return this.V;
    }

    public Object getCurrentInfoObject() {
        return this.w;
    }

    public float getEnterOffset() {
        return this.i0;
    }

    public View getUndoButton() {
        return this.n;
    }

    public final void h(int i, int i2) {
        this.a0 = true;
        aob.A1(-115203550, this.V);
        te1 te1Var = this.b;
        yob.q(te1Var);
        int i3 = aob.xj;
        vnb vnbVar = this.W;
        yob.G(te1Var, i3, vnbVar);
        TextView textView = this.c;
        yob.q(textView);
        yob.G(textView, i3, vnbVar);
        te1Var.setTextColor(-1);
        textView.setTextColor(-1);
        ArrayList arrayList = this.b0;
        int indexOf = arrayList.indexOf("info1");
        ArrayList arrayList2 = this.d0;
        ArrayList arrayList3 = this.c0;
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
        e29 e29Var = this.f;
        e29Var.h(-14540254, "info1");
        e29Var.h(-14540254, "info2");
    }

    public final void i(int i, String str, boolean z) {
        ArrayList arrayList = this.b0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.d0;
        ArrayList arrayList3 = this.c0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i));
            arrayList2.set(indexOf, Boolean.valueOf(z));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i));
            arrayList2.add(Boolean.valueOf(z));
        }
        int v0 = aob.v0(i, this.W);
        if (z) {
            v0 |= -16777216;
        }
        this.f.h(v0, str);
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.b.invalidate();
        this.f.invalidate();
    }

    public final void j(int i, long j, Runnable runnable) {
        k(j, i, null, null, runnable, null);
    }

    public void k(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        n(arrayList, i, obj, obj2, runnable, runnable2);
    }

    public final void l(long j, int i, Runnable runnable, Runnable runnable2) {
        k(j, i, null, null, runnable, runnable2);
    }

    public final void m(long j, Object obj, int i) {
        k(j, i, obj, null, null, null);
    }

    public final void n(java.util.ArrayList r38, int r39, java.lang.Object r40, java.lang.Object r41, java.lang.Runnable r42, java.lang.Runnable r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UndoView.n(java.util.ArrayList, int, java.lang.Object, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j;
        int i;
        String format;
        int i2 = (this.Q > 0.0f ? 1 : (this.Q == 0.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.V;
        if (i2 != 0) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.i0) + this.e0 + hl.L(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i3 = this.L;
        if (i3 == 1 || i3 == 95 || i3 == 0 || i3 == 27 || i3 == 26 || i3 == 81 || i3 == 88) {
            if (this.H > 0) {
                i = (int) Math.ceil(((float) j) / 1000.0f);
            } else {
                i = 0;
            }
            int i4 = this.I;
            TextPaint textPaint = this.E;
            if (i4 != i) {
                this.I = i;
                this.J = String.format("%d", Integer.valueOf(Math.max(1, i)));
                StaticLayout staticLayout = this.f0;
                if (staticLayout != null) {
                    this.g0 = staticLayout;
                    this.h0 = 0.0f;
                }
                this.K = (int) Math.ceil(textPaint.measureText(format));
                this.f0 = new StaticLayout(this.J, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f = this.h0;
            if (f < 1.0f) {
                float f2 = f + 0.10666667f;
                this.h0 = f2;
                if (f2 > 1.0f) {
                    this.h0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.g0;
            RectF rectF = this.G;
            if (staticLayout2 != null) {
                float f3 = this.h0;
                if (f3 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f3) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.K / 2), (hl.L(10.0f) * this.h0) + hl.L(17.2f));
                    this.g0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.f0 != null) {
                float f4 = this.h0;
                if (f4 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f4));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.K / 2), qu6.B(1.0f, this.h0, hl.L(10.0f), hl.L(17.2f)));
                this.f0.draw(canvas);
                if (this.h0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (((float) this.H) / 5000.0f) * (-360.0f), false, this.F);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.H - (elapsedRealtime - this.P);
        this.H = j2;
        this.P = elapsedRealtime;
        if (j2 <= 0) {
            d(this.U, true);
        }
        if (this.L != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.r, 1073741824));
        this.V.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f) {
        if (this.Q != f) {
            this.Q = f;
            setTranslationY(((this.i0 - this.e0) + hl.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffset(float f) {
        if (this.i0 != f) {
            this.i0 = f;
            setTranslationY(((f - this.e0) + hl.L(8.0f)) - this.Q);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i) {
        this.e0 = i;
    }

    public void setHideAnimationType(int i) {
        this.U = i;
    }

    public void setInfoText(CharSequence charSequence) {
        this.T = charSequence;
    }

    @Override
    public final void updateColors() {
        vnb vnbVar;
        ArrayList arrayList = this.b0;
        try {
            if (!this.a0) {
                int i = 0;
                while (true) {
                    int size = arrayList.size();
                    vnbVar = this.W;
                    if (i >= size) {
                        break;
                    }
                    int v0 = aob.v0(((Integer) this.c0.get(i)).intValue(), vnbVar);
                    e29 e29Var = this.f;
                    String str = (String) arrayList.get(i);
                    if (((Boolean) this.d0.get(i)).booleanValue()) {
                        v0 |= -16777216;
                    }
                    e29Var.h(v0, str);
                    i++;
                }
                Paint paint = this.F;
                int i2 = aob.yj;
                paint.setColor(aob.v0(i2, vnbVar));
                this.E.setColor(aob.v0(i2, vnbVar));
                aob.A1(aob.v0(aob.wj, vnbVar), this.V);
                invalidate();
                LinearLayout linearLayout = this.n;
                if (linearLayout != null) {
                    aob.F1(linearLayout.getBackground(), aob.v0(aob.xj, vnbVar) & 587202559, true);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i, long j) {
    }

    public UndoView(pqb pqbVar, Context context) {
        this(context, pqbVar, false, null);
    }

    public UndoView(Context context) {
        this(context, null, false, null);
    }
}
