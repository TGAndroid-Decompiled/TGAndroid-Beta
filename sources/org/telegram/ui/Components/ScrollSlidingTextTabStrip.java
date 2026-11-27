package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements snb {
    public static final int p0 = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public float J;
    public int K;
    public final GradientDrawable L;
    public int M;
    public int N;
    public final k43 O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final oob a;
    public float a0;
    public bv9 b;
    public float b0;
    public final vnb c;
    public short c0;
    public boolean d;
    public View d0;
    public boolean e;
    public final ki7 e0;
    public boolean f;
    public jl0 f0;
    public final Path g0;
    public int h;
    public final RectF h0;
    public final RectF i0;
    public final mm j0;
    public final mm k0;
    public final mm l0;
    public boolean m0;
    public int n;
    public boolean n0;
    public boolean o0;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public ScrollSlidingTextTabStrip(Context context, vnb vnbVar) {
        super(context);
        this.r = -1;
        this.K = -1;
        this.M = aob.I8;
        this.N = aob.J8;
        k43 k43Var = k43.h;
        this.O = k43Var;
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.S = new SparseIntArray(5);
        this.c0 = (short) 200;
        this.e0 = new ki7(this, (byte) 24);
        this.g0 = new Path();
        this.h0 = new RectF();
        this.i0 = new RectF();
        this.j0 = new mm(420L, this, k43Var);
        this.k0 = new mm(420L, this, k43Var);
        this.l0 = new mm(420L, this, k43Var);
        this.n0 = true;
        this.c = vnbVar;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.L = gradientDrawable;
        float N = hl.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        oob oobVar = new oob((byte) 16, context, this);
        this.a = oobVar;
        oobVar.setOrientation(0);
        oobVar.setPadding(hl.L(7.0f), 0, hl.L(7.0f), 0);
        oobVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(oobVar);
        updateColors();
    }

    public final void a(final int i, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence m;
        int i2 = this.h;
        this.h = i2 + 1;
        if (i2 == 0 && this.r == -1) {
            this.r = i;
        }
        this.P.put(i2, i);
        this.Q.put(i, i2);
        int i3 = this.r;
        if (i3 != -1 && i3 == i) {
            this.n = i2;
            this.y = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i);
            sparseArray.delete(i);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new av9(this, getContext(), i);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(hl.o());
            textView.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
            textView.setOnClickListener(new w0(this, i, (byte) 23));
            textView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    bv9 bv9Var;
                    int i4 = ScrollSlidingTextTabStrip.p0;
                    ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ScrollSlidingTextTabStrip.this;
                    if (!scrollSlidingTextTabStrip.o0 && (bv9Var = scrollSlidingTextTabStrip.b) != null && bv9Var.B0(i, view)) {
                        return true;
                    }
                    return false;
                }
            });
            jn7.i(textView);
        }
        textView.setText(pv3.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
        int L = hl.L(32.0f) + ((int) Math.ceil(kg5.h(m, textView.getPaint())));
        this.a.addView(textView, tre.o(0, -1));
        this.s += L;
        this.S.put(i2, L);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.M));
    }

    public final void b() {
        float e = this.j0.e(false, 1.0f);
        RectF rectF = this.i0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(hl.L(7.0f), hl.L(7.0f));
        int i = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        RectF rectF2 = this.h0;
        if (i >= 0) {
            rectF2.set(rectF);
        } else {
            hl.X1(rectF2, rectF, e, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.g0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        jl0 jl0Var = this.f0;
        if (jl0Var != null) {
            jl0Var.setAlpha(255);
            this.f0.setBounds(((int) rectF.left) - hl.L(7.0f), 0, hl.L(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f0.r(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i;
        int i2;
        int i3;
        oob oobVar = this.a;
        int childCount = oobVar.getChildCount();
        int i4 = 0;
        while (true) {
            sparseIntArray = this.R;
            sparseIntArray2 = this.S;
            if (i4 >= childCount) {
                break;
            }
            TextView textView = (TextView) oobVar.getChildAt(i4);
            if (this.n == i4) {
                i = this.M;
            } else {
                i = this.N;
            }
            textView.setTag(Integer.valueOf(i));
            if (this.n == i4) {
                i2 = this.M;
            } else {
                i2 = this.N;
            }
            textView.setTextColor(e(aob.v0(i2, this.c)));
            if (this.e) {
                if (sparseIntArray.size() != sparseIntArray2.size() || sparseIntArray.get(i4) != sparseIntArray2.get(i4)) {
                    textView.requestLayout();
                }
            } else if (i4 == 0) {
                int i5 = textView.getLayoutParams().width;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (childCount == 1) {
                    i3 = -2;
                } else {
                    i3 = 0;
                }
                layoutParams.width = i3;
                if (i5 != textView.getLayoutParams().width) {
                    textView.requestLayout();
                }
            }
            i4++;
        }
        sparseIntArray.clear();
        for (int i6 = 0; i6 < sparseIntArray2.size(); i6++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i6), sparseIntArray2.valueAt(i6));
        }
    }

    public final boolean d(int i) {
        if (this.Q.get(i, -1) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f0 != null) {
            if (this.j0.e(false, 1.0f) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f0.X = this.l0.d(this.n0);
            this.f0.draw(canvas);
            canvas.clipPath(this.g0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.k0.e(false, 0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        oob oobVar = this.a;
        if (view == oobVar) {
            boolean drawChild = super.drawChild(canvas, view, j);
            int measuredHeight = getMeasuredHeight();
            float f = this.w + this.a0;
            float f2 = this.x + f + this.b0;
            View childAt = oobVar.getChildAt(this.n);
            if (this.o0 && childAt != null) {
                f += childAt.getTranslationX();
                f2 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.L;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (oobVar.getAlpha() * alpha));
            gradientDrawable.setBounds(hl.L(4.0f) + getPaddingLeft() + ((int) f), hl.L(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f2)) - hl.L(4.0f), (measuredHeight - getPaddingBottom()) - hl.L(4.0f));
            gradientDrawable.draw(canvas);
            gradientDrawable.setAlpha(alpha);
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final SparseArray f() {
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            oob oobVar = this.a;
            int childCount = oobVar.getChildCount();
            SparseIntArray sparseIntArray = this.P;
            if (i < childCount) {
                sparseArray.put(sparseIntArray.get(i), oobVar.getChildAt(i));
                i++;
            } else {
                sparseIntArray.clear();
                this.Q.clear();
                this.R.clear();
                this.S.clear();
                oobVar.removeAllViews();
                this.s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public final void g(View view, int i, int i2) {
        boolean z;
        bv9 bv9Var;
        if (i2 >= 0) {
            if (view != null || !this.I) {
                int i3 = this.n;
                if (i2 == i3 && (bv9Var = this.b) != null) {
                    bv9Var.e();
                    return;
                }
                if (i3 < i2) {
                    z = true;
                } else {
                    z = false;
                }
                this.K = -1;
                this.U = i3;
                this.n = i2;
                this.r = i;
                boolean z2 = this.I;
                ki7 ki7Var = this.e0;
                if (z2) {
                    hl.r(ki7Var);
                    this.I = false;
                }
                this.T = 0.0f;
                this.I = true;
                this.E = this.w;
                this.F = this.x;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.H = textView.getMeasuredWidth();
                    this.G = ik8.g(textView.getMeasuredWidth(), this.H, 2, textView.getLeft());
                }
                setEnabled(false);
                hl.d3(ki7Var, 16L);
                bv9 bv9Var2 = this.b;
                if (bv9Var2 != null) {
                    bv9Var2.c(i, z);
                }
                h(i2, true);
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.J;
    }

    public int getCurrentPosition() {
        return this.n;
    }

    public int getCurrentTabId() {
        return this.r;
    }

    public int getFirstTabId() {
        return this.P.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.L;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.a.getChildCount(); i++) {
            arrayList.add(Integer.valueOf(this.P.get(i)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(int i, boolean z) {
        int left;
        int right;
        int i2;
        if (this.h != 0 && this.K != i) {
            this.K = i;
            oob oobVar = this.a;
            TextView textView = (TextView) oobVar.getChildAt(i);
            if (textView != null) {
                int scrollX = getScrollX();
                View childAt = oobVar.getChildAt(i - 1);
                View childAt2 = oobVar.getChildAt(i + 1);
                int left2 = oobVar.getLeft();
                if (childAt != null) {
                    left = childAt.getLeft();
                } else {
                    left = textView.getLeft();
                }
                int i3 = left2 + left;
                int left3 = oobVar.getLeft();
                if (childAt2 != null) {
                    right = childAt2.getRight();
                } else {
                    right = textView.getRight();
                }
                int i4 = left3 + right;
                int L = hl.L(7.0f) + getPaddingLeft() + scrollX;
                int width = ((getWidth() + scrollX) - getPaddingRight()) - hl.L(7.0f);
                if (i3 < L) {
                    i2 = (scrollX + i3) - L;
                } else if (i4 > width) {
                    i2 = (scrollX + i4) - width;
                } else {
                    return;
                }
                if (z) {
                    smoothScrollTo(i2, 0);
                } else {
                    scrollTo(i2, 0);
                }
            }
        }
    }

    public final void i(float f, int i) {
        int i2;
        int i3 = this.Q.get(i, -1);
        if (i3 >= 0 && (i2 = this.n) != i3) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            oob oobVar = this.a;
            TextView textView = (TextView) oobVar.getChildAt(i2);
            TextView textView2 = (TextView) oobVar.getChildAt(i3);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.F = textView.getMeasuredWidth();
                this.E = ik8.g(textView.getMeasuredWidth(), this.F, 2, textView.getLeft());
                textView2.getLayout();
                this.H = textView2.getMeasuredWidth();
                this.G = ik8.g(textView2.getMeasuredWidth(), this.H, 2, textView2.getLeft());
                j(textView2, textView, f);
                if (f >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.N));
                    textView2.setTag(Integer.valueOf(this.M));
                }
                h(oobVar.indexOfChild(textView2), true);
            }
            if (f >= 1.0f) {
                this.n = i3;
                this.r = i;
            }
        }
    }

    public final void j(TextView textView, TextView textView2, float f) {
        int i = this.M;
        vnb vnbVar = this.c;
        int e = e(aob.v0(i, vnbVar));
        int e2 = e(aob.v0(this.N, vnbVar));
        int red = Color.red(e);
        int green = Color.green(e);
        int blue = Color.blue(e);
        int alpha = Color.alpha(e);
        int red2 = Color.red(e2);
        int green2 = Color.green(e2);
        int blue2 = Color.blue(e2);
        int alpha2 = Color.alpha(e2);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f) + alpha), (int) (((red2 - red) * f) + red), (int) (((green2 - green) * f) + green), (int) (((blue2 - blue) * f) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f) + alpha2), (int) (((red - red2) * f) + red2), (int) (((green - green2) * f) + green2), (int) (((blue - blue2) * f) + blue2)));
        int i2 = this.E;
        this.w = (int) (((this.G - i2) * f) + i2);
        int i3 = this.F;
        this.x = (int) (((this.H - i3) * f) + i3);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = i3 - i;
        if (this.y != i6) {
            this.y = i6;
            this.K = -1;
            if (this.I) {
                hl.r(this.e0);
                this.I = false;
                setEnabled(true);
                bv9 bv9Var = this.b;
                if (bv9Var != null) {
                    bv9Var.a(1.0f);
                }
            }
            TextView textView = (TextView) this.a.getChildAt(this.n);
            if (textView != null) {
                textView.getLayout();
                this.x = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i7 = this.x;
                int g = ik8.g(measuredWidth, i7, 2, left);
                this.w = g;
                int i8 = this.V;
                if (i8 > 0 && (i5 = this.W) > 0) {
                    if (i8 != g || i5 != i7) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new cn(this, i8 - g, i5 - i7, (byte) 4));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(k43.f);
                        ofFloat.start();
                    }
                    this.V = 0;
                    this.W = 0;
                }
            }
        }
        b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - hl.L(22.0f);
        oob oobVar = this.a;
        int childCount = oobVar.getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = oobVar.getChildAt(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f = layoutParams.weight;
            int i4 = layoutParams.width;
            boolean z2 = this.e;
            SparseIntArray sparseIntArray = this.S;
            if (z2) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i3);
            } else {
                int i5 = this.s;
                if (i5 > size) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else if (this.d) {
                    layoutParams.weight = 1.0f / childCount;
                    layoutParams.width = 0;
                } else if (i3 == 0 && childCount == 1) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else {
                    layoutParams.weight = hl.R1(1.0f / childCount, (1.0f / i5) * sparseIntArray.get(i3), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f - layoutParams.weight) > 0.001f || i4 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = oobVar.getWeightSum();
        if (childCount != 1 && this.s <= size) {
            oobVar.setWeightSum(1.0f);
        } else {
            oobVar.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - oobVar.getWeightSum()) > 0.1f) {
            oobVar.requestLayout();
        }
        super.onMeasure(i, i2);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i)) {
            z = true;
        }
        this.f = z;
        b();
    }

    public void setAnimationIdicatorProgress(float f) {
        this.J = f;
        int i = this.n;
        oob oobVar = this.a;
        TextView textView = (TextView) oobVar.getChildAt(i);
        TextView textView2 = (TextView) oobVar.getChildAt(this.U);
        if (textView2 != null && textView != null) {
            j(textView, textView2, f);
            if (f >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.N));
                textView.setTag(Integer.valueOf(this.M));
            }
            bv9 bv9Var = this.b;
            if (bv9Var != null) {
                bv9Var.a(f);
            }
        }
    }

    public void setBlurredBackground(jl0 jl0Var) {
        this.f0 = jl0Var;
        jl0Var.setCallback(this);
    }

    public void setDelegate(bv9 bv9Var) {
        this.b = bv9Var;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        oob oobVar = this.a;
        int childCount = oobVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            oobVar.getChildAt(i).setEnabled(z);
        }
    }

    public void setInitialTabId(int i) {
        this.m0 = true;
        this.r = i;
        int i2 = this.Q.get(i);
        if (((TextView) this.a.getChildAt(i2)) != null) {
            this.n = i2;
            this.y = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z) {
        float f;
        float f2;
        if (z == this.n0) {
            return;
        }
        this.n0 = z;
        float f3 = 6.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 6.0f;
        }
        int L = hl.L(f);
        int paddingTop = getPaddingTop();
        if (this.n0) {
            f2 = 0.0f;
        } else {
            f2 = 6.0f;
        }
        setPadding(L, paddingTop, hl.L(f2), getPaddingBottom());
        invalidate();
        if (!this.f) {
            this.h0.set(this.i0);
            this.j0.e(true, 0.0f);
            if (!this.n0) {
                f3 = -6.0f;
            }
            this.k0.e(true, hl.L(f3));
        }
        b();
    }

    public void setReordering(boolean z) {
        if (this.o0 == z) {
            return;
        }
        this.o0 = z;
        hl.c0(this.a, new bm0((byte) 12));
    }

    public void setUseMinimalWidth(boolean z) {
        int i;
        this.e = z;
        if (this.e) {
            i = -2;
        } else {
            i = -1;
        }
        this.a.setLayoutParams(new FrameLayout.LayoutParams(i, -1));
    }

    public void setUseSameWidth(boolean z) {
        this.d = z;
    }

    @Override
    public final void updateColors() {
        vnb vnbVar;
        int i;
        oob oobVar = this.a;
        int childCount = oobVar.getChildCount();
        int i2 = 0;
        while (true) {
            vnbVar = this.c;
            if (i2 >= childCount) {
                break;
            }
            TextView textView = (TextView) oobVar.getChildAt(i2);
            if (this.n == i2) {
                i = this.M;
            } else {
                i = this.N;
            }
            textView.setTextColor(e(aob.v0(i, vnbVar)));
            textView.setBackground(new InsetDrawable((Drawable) aob.f0(aob.p1(0.15f, e(aob.v0(this.M, vnbVar))), 7, hl.L(14.0f)), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f)));
            i2++;
        }
        this.L.setColor(aob.p1(0.15f, e(aob.v0(this.M, vnbVar))));
        jl0 jl0Var = this.f0;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int e(int i) {
        return i;
    }
}
