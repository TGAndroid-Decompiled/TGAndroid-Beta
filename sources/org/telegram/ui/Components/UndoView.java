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
import org.telegram.ui.k91;
@Deprecated
public class UndoView extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int f24238i0 = 0;
    public final TextPaint D;
    public final Paint E;
    public final RectF F;
    public long G;
    public int H;
    public String I;
    public int J;
    public int K;
    public ArrayList L;
    public Runnable M;
    public Runnable N;
    public long O;
    public float P;
    public boolean Q;
    public final boolean R;
    public CharSequence S;
    public int T;
    public final ShapeDrawable U;
    public final org.telegram.ui.ActionBar.p6 V;
    public boolean W;
    public int f24239a;
    public final ArrayList f24240a0;
    public final org.telegram.ui.Cells.b2 f24241b;
    public final ArrayList f24242b0;
    public final TextView f24243c;
    public final ArrayList f24244c0;
    public final TextView d;
    public int f24245d0;
    public final ImageView e;
    public StaticLayout f24246e0;
    public final fi0 f24247f;
    public StaticLayout f24248f0;
    public float f24249g0;
    public final g9 h;
    public float f24250h0;
    public final LinearLayout f24251n;
    public int f24252r;
    public final org.telegram.ui.ActionBar.k2 f24253s;
    public Object f24254w;
    public Object f24255x;
    public final int f24256y;

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean a() {
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
    }

    public final boolean c() {
        int i10;
        Object obj;
        int i11 = this.K;
        if (i11 != 11 && i11 != 24 && i11 != 6 && i11 != 3 && i11 != 5 && i11 != 13 && i11 != 14 && i11 != 74) {
            if ((i11 != 7 || !org.telegram.messenger.wp.r1(this.f24256y).P0.isEmpty()) && (i10 = this.K) != 83 && i10 != 85) {
                if (i10 != 88 || (obj = this.f24255x) == null || ((Integer) obj).intValue() <= 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public void d(int i10, boolean z10) {
        boolean z11;
        if (getVisibility() == 0 && this.Q) {
            this.f24254w = null;
            this.f24255x = null;
            this.Q = false;
            Runnable runnable = this.M;
            if (runnable != null) {
                if (z10) {
                    runnable.run();
                }
                this.M = null;
            }
            Runnable runnable2 = this.N;
            if (runnable2 != null) {
                if (!z10) {
                    runnable2.run();
                }
                this.N = null;
            }
            int i11 = this.K;
            if (i11 == 0 || i11 == 1 || i11 == 95 || i11 == 26 || i11 == 27) {
                for (int i12 = 0; i12 < this.L.size(); i12++) {
                    long longValue = ((Long) this.L.get(i12)).longValue();
                    org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(this.f24256y);
                    int i13 = this.K;
                    if (i13 != 0 && i13 != 26) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    TLRPC.Dialog dialog = (TLRPC.Dialog) r12.Q.f(longValue);
                    if (dialog != null) {
                        if (z11) {
                            r12.E0.l(longValue);
                        } else {
                            r12.D0.l(longValue);
                            if (!z10) {
                                r12.f19293y.add(dialog);
                                r12.Q4(null);
                            }
                        }
                        if (!z10) {
                            r12.getNotificationCenter().k(org.telegram.messenger.at.f14779s, Boolean.TRUE);
                        }
                    }
                    g(this.K, longValue);
                }
            }
            float f7 = 1.0f;
            boolean z12 = this.R;
            if (i10 != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i10 == 1) {
                    if (z12) {
                        f7 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f7 * (this.f24245d0 + this.f24252r)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new q11(this, 4));
                animatorSet.start();
                return;
            }
            if (z12) {
                f7 = -1.0f;
            }
            setEnterOffset(f7 * (this.f24245d0 + this.f24252r));
            setVisibility(4);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.P != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f24250h0) + org.telegram.messenger.i0.L(9.0f);
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
        int i10 = this.K;
        if (i10 != 12 && i10 != 15 && i10 != 24 && i10 != 74 && i10 != 83) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        int i10 = this.K;
        if (i10 != 6 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 8 && i10 != 87 && i10 != 9 && i10 != 10 && i10 != 13 && i10 != 14 && i10 != 19 && i10 != 20 && i10 != 21 && i10 != 22 && i10 != 23 && i10 != 30 && i10 != 31 && i10 != 32 && i10 != 102 && i10 != 33 && i10 != 34 && i10 != 35 && i10 != 36 && i10 != 74 && i10 != 37 && i10 != 38 && i10 != 39 && i10 != 40 && i10 != 42 && i10 != 43 && i10 != 77 && i10 != 44 && i10 != 78 && i10 != 79 && i10 != 100 && i10 != 101 && i10 != 83) {
            return false;
        }
        return true;
    }

    @Override
    public Drawable getBackground() {
        return this.U;
    }

    public Object getCurrentInfoObject() {
        return this.f24254w;
    }

    public float getEnterOffset() {
        return this.f24250h0;
    }

    public View getUndoButton() {
        return this.f24251n;
    }

    public final void h(int i10, int i11) {
        this.W = true;
        org.telegram.ui.ActionBar.t6.C1(-115203550, this.U);
        org.telegram.ui.Cells.b2 b2Var = this.f24241b;
        org.telegram.ui.ActionBar.a7.r(b2Var);
        int i12 = org.telegram.ui.ActionBar.t6.uj;
        org.telegram.ui.ActionBar.p6 p6Var = this.V;
        org.telegram.ui.ActionBar.a7.H(b2Var, i12, p6Var);
        TextView textView = this.f24243c;
        org.telegram.ui.ActionBar.a7.r(textView);
        org.telegram.ui.ActionBar.a7.H(textView, i12, p6Var);
        b2Var.setTextColor(-1);
        textView.setTextColor(-1);
        ArrayList arrayList = this.f24240a0;
        int indexOf = arrayList.indexOf("info1");
        ArrayList arrayList2 = this.f24244c0;
        ArrayList arrayList3 = this.f24242b0;
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
        fi0 fi0Var = this.f24247f;
        fi0Var.h(-14540254, "info1");
        fi0Var.h(-14540254, "info2");
    }

    public final void i(int i10, String str, boolean z10) {
        int w02;
        ArrayList arrayList = this.f24240a0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.f24244c0;
        ArrayList arrayList3 = this.f24242b0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i10));
            arrayList2.set(indexOf, Boolean.valueOf(z10));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i10));
            arrayList2.add(Boolean.valueOf(z10));
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.V;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var) | (-16777216);
        } else {
            w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        }
        this.f24247f.h(w02, str);
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.f24241b.invalidate();
        this.f24247f.invalidate();
    }

    public final void j(int i10, long j10, Runnable runnable) {
        k(j10, i10, null, null, runnable, null);
    }

    public void k(long j10, int i10, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        n(arrayList, i10, obj, obj2, runnable, runnable2);
    }

    public final void l(long j10, int i10, Runnable runnable, Runnable runnable2) {
        k(j10, i10, null, null, runnable, runnable2);
    }

    public final void m(long j10, Object obj, int i10) {
        k(j10, i10, obj, null, null, null);
    }

    public final void n(java.util.ArrayList r37, int r38, java.lang.Object r39, java.lang.Object r40, java.lang.Runnable r41, java.lang.Runnable r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UndoView.n(java.util.ArrayList, int, java.lang.Object, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        int i10;
        String format;
        int i11 = (this.P > 0.0f ? 1 : (this.P == 0.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.U;
        if (i11 != 0) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f24250h0) + this.f24245d0 + org.telegram.messenger.i0.L(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i12 = this.K;
        if (i12 == 1 || i12 == 95 || i12 == 0 || i12 == 27 || i12 == 26 || i12 == 81 || i12 == 88) {
            if (this.G > 0) {
                i10 = (int) Math.ceil(((float) j10) / 1000.0f);
            } else {
                i10 = 0;
            }
            int i13 = this.H;
            TextPaint textPaint = this.D;
            if (i13 != i10) {
                this.H = i10;
                this.I = String.format("%d", Integer.valueOf(Math.max(1, i10)));
                StaticLayout staticLayout = this.f24246e0;
                if (staticLayout != null) {
                    this.f24248f0 = staticLayout;
                    this.f24249g0 = 0.0f;
                }
                this.J = (int) Math.ceil(textPaint.measureText(format));
                this.f24246e0 = new StaticLayout(this.I, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f7 = this.f24249g0;
            if (f7 < 1.0f) {
                float f10 = f7 + 0.10666667f;
                this.f24249g0 = f10;
                if (f10 > 1.0f) {
                    this.f24249g0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.f24248f0;
            RectF rectF = this.F;
            if (staticLayout2 != null) {
                float f11 = this.f24249g0;
                if (f11 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f11) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.J / 2), (org.telegram.messenger.i0.L(10.0f) * this.f24249g0) + org.telegram.messenger.i0.L(17.2f));
                    this.f24248f0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.f24246e0 != null) {
                float f12 = this.f24249g0;
                if (f12 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f12));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.J / 2), sc.e.z(1.0f, this.f24249g0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(17.2f)));
                this.f24246e0.draw(canvas);
                if (this.f24249g0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (((float) this.G) / 5000.0f) * (-360.0f), false, this.E);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.G - (elapsedRealtime - this.O);
        this.G = j11;
        this.O = elapsedRealtime;
        if (j11 <= 0) {
            d(this.T, true);
        }
        if (this.K != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24252r, 1073741824));
        this.U.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f7) {
        if (this.P != f7) {
            this.P = f7;
            setTranslationY(((this.f24250h0 - this.f24245d0) + org.telegram.messenger.i0.L(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffset(float f7) {
        if (this.f24250h0 != f7) {
            this.f24250h0 = f7;
            setTranslationY(((f7 - this.f24245d0) + org.telegram.messenger.i0.L(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i10) {
        this.f24245d0 = i10;
    }

    public void setHideAnimationType(int i10) {
        this.T = i10;
    }

    public void setInfoText(CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var;
        ArrayList arrayList = this.f24240a0;
        try {
            if (!this.W) {
                int i10 = 0;
                while (true) {
                    int size = arrayList.size();
                    p6Var = this.V;
                    if (i10 >= size) {
                        break;
                    }
                    int w02 = org.telegram.ui.ActionBar.t6.w0(((Integer) this.f24242b0.get(i10)).intValue(), p6Var);
                    fi0 fi0Var = this.f24247f;
                    String str = (String) arrayList.get(i10);
                    if (((Boolean) this.f24244c0.get(i10)).booleanValue()) {
                        w02 |= -16777216;
                    }
                    fi0Var.h(w02, str);
                    i10++;
                }
                Paint paint = this.E;
                int i11 = org.telegram.ui.ActionBar.t6.vj;
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
                this.D.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, p6Var), this.U);
                invalidate();
                LinearLayout linearLayout = this.f24251n;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.t6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var) & 587202559, true);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public UndoView(Context context, k91 k91Var) {
        this(context, k91Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.k2 k2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f24239a = 0;
        this.f24256y = org.telegram.messenger.e20.f15506s0;
        this.K = -1;
        this.T = 1;
        this.f24240a0 = new ArrayList();
        this.f24242b0 = new ArrayList();
        this.f24244c0 = new ArrayList();
        this.f24245d0 = org.telegram.messenger.i0.L(8.0f);
        this.f24249g0 = 1.0f;
        this.V = p6Var;
        this.f24253s = k2Var;
        this.R = z10;
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, context, p6Var);
        this.f24241b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        int i10 = org.telegram.ui.ActionBar.t6.vj;
        org.telegram.ui.ActionBar.a7.V(b2Var, i10, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.uj;
        org.telegram.ui.ActionBar.a7.H(b2Var, i11, p6Var);
        b2Var.setMovementMethod(new l51(this));
        addView(b2Var, w7.b6.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f24243c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(textView, i11, p6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.e0(false));
        addView(textView, w7.b6.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f24247f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.t6.tj;
        i(i12, "info1", true);
        i(i12, "info2", true);
        i(i10, "luc12", false);
        i(i10, "luc11", false);
        i(i10, "luc10", false);
        i(i10, "luc9", false);
        i(i10, "luc8", false);
        i(i10, "luc7", false);
        i(i10, "luc6", false);
        i(i10, "luc5", false);
        i(i10, "luc4", false);
        i(i10, "luc3", false);
        i(i10, "luc2", false);
        i(i10, "luc1", false);
        i(i10, "Oval", false);
        addView((View) imageView, w7.b6.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        g9 g9Var = new g9(context);
        this.h = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(15.0f));
        addView(g9Var, w7.b6.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24251n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var) & 587202559, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f)));
        addView(linearLayout, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new j51(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setImageResource(2131231001);
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, p6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, w7.b6.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        sc.e.t(textView2, 1, 14.0f);
        org.telegram.messenger.a30.p(textView2, i11, p6Var, null, 2131743910);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 19, 6, 4, 8, 4));
        this.F = new RectF(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(33.0f), org.telegram.messenger.i0.L(33.0f));
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        TextPaint textPaint = new TextPaint(1);
        this.D = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        setWillNotDraw(false);
        this.U = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(10.0f), org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        setOnTouchListener(new org.telegram.ui.ActionBar.n2(25));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i10, long j10) {
    }
}
