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
import org.telegram.ui.u71;
@Deprecated
public class UndoView extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public static final int f31591i0 = 0;
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
    public final org.telegram.ui.ActionBar.f6 V;
    public boolean W;
    public int f31592a;
    public final ArrayList f31593a0;
    public final org.telegram.ui.Cells.b2 f31594b;
    public final ArrayList f31595b0;
    public final TextView f31596c;
    public final ArrayList f31597c0;
    public final TextView d;
    public int f31598d0;
    public final ImageView f31599e;
    public StaticLayout f31600e0;
    public final ch0 f31601f;
    public StaticLayout f31602f0;
    public float f31603g0;
    public final l9 h;
    public float f31604h0;
    public final LinearLayout f31605n;
    public int f31606r;
    public final org.telegram.ui.ActionBar.f2 f31607s;
    public Object f31608w;
    public Object f31609x;
    public final int f31610y;

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
        int i7;
        Object obj;
        int i10 = this.K;
        if (i10 != 11 && i10 != 24 && i10 != 6 && i10 != 3 && i10 != 5 && i10 != 13 && i10 != 14 && i10 != 74) {
            if ((i10 != 7 || !org.telegram.messenger.qp.s1(this.f31610y).P0.isEmpty()) && (i7 = this.K) != 83 && i7 != 85) {
                if (i7 != 88 || (obj = this.f31609x) == null || ((Integer) obj).intValue() <= 0) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public void d(int i7, boolean z9) {
        boolean z10;
        if (getVisibility() == 0 && this.Q) {
            this.f31608w = null;
            this.f31609x = null;
            this.Q = false;
            Runnable runnable = this.M;
            if (runnable != null) {
                if (z9) {
                    runnable.run();
                }
                this.M = null;
            }
            Runnable runnable2 = this.N;
            if (runnable2 != null) {
                if (!z9) {
                    runnable2.run();
                }
                this.N = null;
            }
            int i10 = this.K;
            if (i10 == 0 || i10 == 1 || i10 == 95 || i10 == 26 || i10 == 27) {
                for (int i11 = 0; i11 < this.L.size(); i11++) {
                    long longValue = ((Long) this.L.get(i11)).longValue();
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(this.f31610y);
                    int i12 = this.K;
                    if (i12 != 0 && i12 != 26) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    TLRPC.Dialog dialog = (TLRPC.Dialog) s12.Q.f(longValue);
                    if (dialog != null) {
                        if (z10) {
                            s12.E0.l(longValue);
                        } else {
                            s12.D0.l(longValue);
                            if (!z9) {
                                s12.f24929y.add(dialog);
                                s12.T4(null);
                            }
                        }
                        if (!z9) {
                            s12.getNotificationCenter().k(org.telegram.messenger.qs.f25053s, Boolean.TRUE);
                        }
                    }
                    g(this.K, longValue);
                }
            }
            float f10 = 1.0f;
            boolean z11 = this.R;
            if (i7 != 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (i7 == 1) {
                    if (z11) {
                        f10 = -1.0f;
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f10 * (this.f31598d0 + this.f31606r)));
                    animatorSet.setDuration(250L);
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f));
                    animatorSet.setDuration(180L);
                }
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new e11(this, 3));
                animatorSet.start();
                return;
            }
            if (z11) {
                f10 = -1.0f;
            }
            setEnterOffset(f10 * (this.f31598d0 + this.f31606r));
            setVisibility(4);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.P != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f31604h0) + org.telegram.messenger.g0.L(9.0f);
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
        int i7 = this.K;
        if (i7 != 12 && i7 != 15 && i7 != 24 && i7 != 74 && i7 != 83) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        int i7 = this.K;
        if (i7 != 6 && i7 != 3 && i7 != 5 && i7 != 7 && i7 != 8 && i7 != 87 && i7 != 9 && i7 != 10 && i7 != 13 && i7 != 14 && i7 != 19 && i7 != 20 && i7 != 21 && i7 != 22 && i7 != 23 && i7 != 30 && i7 != 31 && i7 != 32 && i7 != 102 && i7 != 33 && i7 != 34 && i7 != 35 && i7 != 36 && i7 != 74 && i7 != 37 && i7 != 38 && i7 != 39 && i7 != 40 && i7 != 42 && i7 != 43 && i7 != 77 && i7 != 44 && i7 != 78 && i7 != 79 && i7 != 100 && i7 != 101 && i7 != 83) {
            return false;
        }
        return true;
    }

    @Override
    public Drawable getBackground() {
        return this.U;
    }

    public Object getCurrentInfoObject() {
        return this.f31608w;
    }

    public float getEnterOffset() {
        return this.f31604h0;
    }

    public View getUndoButton() {
        return this.f31605n;
    }

    public final void h(int i7, int i10) {
        this.W = true;
        org.telegram.ui.ActionBar.k6.C1(-115203550, this.U);
        org.telegram.ui.Cells.b2 b2Var = this.f31594b;
        org.telegram.ui.ActionBar.r6.r(b2Var);
        int i11 = org.telegram.ui.ActionBar.k6.uj;
        org.telegram.ui.ActionBar.f6 f6Var = this.V;
        org.telegram.ui.ActionBar.r6.H(b2Var, i11, f6Var);
        TextView textView = this.f31596c;
        org.telegram.ui.ActionBar.r6.r(textView);
        org.telegram.ui.ActionBar.r6.H(textView, i11, f6Var);
        b2Var.setTextColor(-1);
        textView.setTextColor(-1);
        ArrayList arrayList = this.f31593a0;
        int indexOf = arrayList.indexOf("info1");
        ArrayList arrayList2 = this.f31597c0;
        ArrayList arrayList3 = this.f31595b0;
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
        ch0 ch0Var = this.f31601f;
        ch0Var.h(-14540254, "info1");
        ch0Var.h(-14540254, "info2");
    }

    public final void i(int i7, String str, boolean z9) {
        int w02;
        ArrayList arrayList = this.f31593a0;
        int indexOf = arrayList.indexOf(str);
        ArrayList arrayList2 = this.f31597c0;
        ArrayList arrayList3 = this.f31595b0;
        if (indexOf >= 0) {
            arrayList3.set(indexOf, Integer.valueOf(i7));
            arrayList2.set(indexOf, Boolean.valueOf(z9));
        } else {
            arrayList.add(str);
            arrayList3.add(Integer.valueOf(i7));
            arrayList2.add(Boolean.valueOf(z9));
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.V;
        if (z9) {
            w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var) | (-16777216);
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        }
        this.f31601f.h(w02, str);
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.f31594b.invalidate();
        this.f31601f.invalidate();
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

    public final void n(java.util.ArrayList r38, int r39, java.lang.Object r40, java.lang.Object r41, java.lang.Runnable r42, java.lang.Runnable r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UndoView.n(java.util.ArrayList, int, java.lang.Object, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        int i7;
        String format;
        int i10 = (this.P > 0.0f ? 1 : (this.P == 0.0f ? 0 : -1));
        ShapeDrawable shapeDrawable = this.U;
        if (i10 != 0) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.f31604h0) + this.f31598d0 + org.telegram.messenger.g0.L(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i11 = this.K;
        if (i11 == 1 || i11 == 95 || i11 == 0 || i11 == 27 || i11 == 26 || i11 == 81 || i11 == 88) {
            if (this.G > 0) {
                i7 = (int) Math.ceil(((float) j3) / 1000.0f);
            } else {
                i7 = 0;
            }
            int i12 = this.H;
            TextPaint textPaint = this.D;
            if (i12 != i7) {
                this.H = i7;
                this.I = String.format("%d", Integer.valueOf(Math.max(1, i7)));
                StaticLayout staticLayout = this.f31600e0;
                if (staticLayout != null) {
                    this.f31602f0 = staticLayout;
                    this.f31603g0 = 0.0f;
                }
                this.J = (int) Math.ceil(textPaint.measureText(format));
                this.f31600e0 = new StaticLayout(this.I, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f10 = this.f31603g0;
            if (f10 < 1.0f) {
                float f11 = f10 + 0.10666667f;
                this.f31603g0 = f11;
                if (f11 > 1.0f) {
                    this.f31603g0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.f31602f0;
            RectF rectF = this.F;
            if (staticLayout2 != null) {
                float f12 = this.f31603g0;
                if (f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f12) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.J / 2), (org.telegram.messenger.g0.L(10.0f) * this.f31603g0) + org.telegram.messenger.g0.L(17.2f));
                    this.f31602f0.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.f31600e0 != null) {
                float f13 = this.f31603g0;
                if (f13 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f13));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.J / 2), com.google.android.recaptcha.internal.a.v(1.0f, this.f31603g0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(17.2f)));
                this.f31600e0.draw(canvas);
                if (this.f31603g0 != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (((float) this.G) / 5000.0f) * (-360.0f), false, this.E);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.G - (elapsedRealtime - this.O);
        this.G = j10;
        this.O = elapsedRealtime;
        if (j10 <= 0) {
            d(this.T, true);
        }
        if (this.K != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f31606r, 1073741824));
        this.U.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAdditionalTranslationY(float f10) {
        if (this.P != f10) {
            this.P = f10;
            setTranslationY(((this.f31604h0 - this.f31598d0) + org.telegram.messenger.g0.L(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffset(float f10) {
        if (this.f31604h0 != f10) {
            this.f31604h0 = f10;
            setTranslationY(((f10 - this.f31598d0) + org.telegram.messenger.g0.L(8.0f)) - this.P);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i7) {
        this.f31598d0 = i7;
    }

    public void setHideAnimationType(int i7) {
        this.T = i7;
    }

    public void setInfoText(CharSequence charSequence) {
        this.S = charSequence;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var;
        ArrayList arrayList = this.f31593a0;
        try {
            if (!this.W) {
                int i7 = 0;
                while (true) {
                    int size = arrayList.size();
                    f6Var = this.V;
                    if (i7 >= size) {
                        break;
                    }
                    int w02 = org.telegram.ui.ActionBar.k6.w0(((Integer) this.f31595b0.get(i7)).intValue(), f6Var);
                    ch0 ch0Var = this.f31601f;
                    String str = (String) arrayList.get(i7);
                    if (((Boolean) this.f31597c0.get(i7)).booleanValue()) {
                        w02 |= -16777216;
                    }
                    ch0Var.h(w02, str);
                    i7++;
                }
                Paint paint = this.E;
                int i10 = org.telegram.ui.ActionBar.k6.vj;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
                this.D.setColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, f6Var), this.U);
                invalidate();
                LinearLayout linearLayout = this.f31605n;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.k6.H1(linearLayout.getBackground(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, f6Var) & 587202559, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public UndoView(Context context, u71 u71Var) {
        this(context, u71Var, false, null);
    }

    public UndoView(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f31592a = 0;
        this.f31610y = org.telegram.messenger.p10.f24459s0;
        this.K = -1;
        this.T = 1;
        this.f31593a0 = new ArrayList();
        this.f31595b0 = new ArrayList();
        this.f31597c0 = new ArrayList();
        this.f31598d0 = org.telegram.messenger.g0.L(8.0f);
        this.f31603g0 = 1.0f;
        this.V = f6Var;
        this.f31607s = f2Var;
        this.R = z9;
        org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(this, context, f6Var);
        this.f31594b = b2Var;
        b2Var.setTextSize(1, 15.0f);
        int i7 = org.telegram.ui.ActionBar.k6.vj;
        org.telegram.ui.ActionBar.r6.V(b2Var, i7, f6Var);
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        org.telegram.ui.ActionBar.r6.H(b2Var, i10, f6Var);
        b2Var.setMovementMethod(new f41(this));
        addView(b2Var, c8.ha.d(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f31596c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(textView, i10, f6Var);
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new org.telegram.messenger.c0(false));
        addView(textView, c8.ha.d(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f31601f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.k6.tj;
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
        addView((View) imageView, c8.ha.d(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        l9 l9Var = new l9(context);
        this.h = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(l9Var, c8.ha.d(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31605n = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i10, f6Var) & 587202559, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f)));
        addView(linearLayout, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new e41(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.f31599e = imageView2;
        imageView2.setImageResource(2131231001);
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, f6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView2, c8.ha.t(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        com.google.android.recaptcha.internal.a.q(textView2, 1, 14.0f);
        org.telegram.messenger.camera.q.o(textView2, i10, f6Var, null, 2131743886);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 19, 6, 4, 8, 4));
        this.F = new RectF(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(33.0f), org.telegram.messenger.g0.L(33.0f));
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        TextPaint textPaint = new TextPaint(1);
        this.D = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        setWillNotDraw(false);
        this.U = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), org.telegram.ui.ActionBar.k6.w0(i11, f6Var));
        setOnTouchListener(new ei.b(26));
        setVisibility(4);
    }

    public void b(CharacterStyle characterStyle) {
    }

    public void g(int i7, long j3) {
    }
}
