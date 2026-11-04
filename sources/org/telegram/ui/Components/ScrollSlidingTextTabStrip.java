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
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.z5 {
    public static final int f31592p0 = 0;
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
    public final xq O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.s51 f31593a;
    public float f31594a0;
    public yk0 f31595b;
    public float f31596b0;
    public final org.telegram.ui.ActionBar.e6 f31597c;
    public long f31598c0;
    public boolean d;
    public View f31599d0;
    public boolean f31600e;
    public final lt f31601e0;
    public boolean f31602f;
    public gh.g f31603f0;
    public final Path f31604g0;
    public int h;
    public final RectF f31605h0;
    public final RectF f31606i0;
    public final u5 f31607j0;
    public final u5 f31608k0;
    public final u5 f31609l0;
    public boolean m0;
    public int f31610n;
    public boolean f31611n0;
    public boolean f31612o0;
    public int f31613r;
    public int f31614s;
    public int f31615w;
    public int f31616x;
    public int f31617y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f31613r = -1;
        this.K = -1;
        this.M = org.telegram.ui.ActionBar.k6.I8;
        this.N = org.telegram.ui.ActionBar.k6.J8;
        xq xqVar = xq.h;
        this.O = xqVar;
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.S = new SparseIntArray(5);
        this.f31598c0 = 200L;
        this.f31601e0 = new lt(this, 12);
        this.f31604g0 = new Path();
        this.f31605h0 = new RectF();
        this.f31606i0 = new RectF();
        this.f31607j0 = new u5(this, 420L, xqVar);
        this.f31608k0 = new u5(this, 420L, xqVar);
        this.f31609l0 = new u5(this, 420L, xqVar);
        this.f31611n0 = true;
        this.f31597c = e6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.L = gradientDrawable;
        float N = org.telegram.messenger.g0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.s51 s51Var = new org.telegram.ui.s51(15, context, this);
        this.f31593a = s51Var;
        s51Var.setOrientation(0);
        s51Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        s51Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(s51Var);
        updateColors();
    }

    public final void a(int i3, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence m10;
        int i10 = this.h;
        this.h = i10 + 1;
        if (i10 == 0 && this.f31613r == -1) {
            this.f31613r = i3;
        }
        this.P.put(i10, i3);
        this.Q.put(i3, i10);
        int i11 = this.f31613r;
        if (i11 != -1 && i11 == i3) {
            this.f31610n = i10;
            this.f31617y = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i3);
            sparseArray.delete(i3);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new xk0(this, getContext(), i3);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            textView.setOnClickListener(new bi.q(this, i3, 17));
            textView.setOnLongClickListener(new mh.g(this, i3, 1));
            org.telegram.messenger.hs.i(textView);
        }
        textView.setText(org.telegram.messenger.i6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
        int L = org.telegram.messenger.g0.L(32.0f) + ((int) Math.ceil(gi.l3.h(m10, textView.getPaint())));
        this.f31593a.addView(textView, b8.mf.o(0, -1));
        this.f31614s += L;
        this.S.put(i10, L);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.M));
    }

    public final void b() {
        float e10 = this.f31607j0.e(false, 1.0f);
        RectF rectF = this.f31606i0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        int i3 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        RectF rectF2 = this.f31605h0;
        if (i3 >= 0) {
            rectF2.set(rectF);
        } else {
            org.telegram.messenger.g0.Z1(rectF2, rectF, e10, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f31604g0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        gh.g gVar = this.f31603f0;
        if (gVar != null) {
            gVar.setAlpha(255);
            this.f31603f0.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f31603f0.r(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i3;
        int i10;
        int i11;
        org.telegram.ui.s51 s51Var = this.f31593a;
        int childCount = s51Var.getChildCount();
        int i12 = 0;
        while (true) {
            sparseIntArray = this.R;
            sparseIntArray2 = this.S;
            if (i12 >= childCount) {
                break;
            }
            TextView textView = (TextView) s51Var.getChildAt(i12);
            if (this.f31610n == i12) {
                i3 = this.M;
            } else {
                i3 = this.N;
            }
            textView.setTag(Integer.valueOf(i3));
            if (this.f31610n == i12) {
                i10 = this.M;
            } else {
                i10 = this.N;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i10, this.f31597c)));
            if (this.f31600e) {
                if (sparseIntArray.size() != sparseIntArray2.size() || sparseIntArray.get(i12) != sparseIntArray2.get(i12)) {
                    textView.requestLayout();
                }
            } else if (i12 == 0) {
                int i13 = textView.getLayoutParams().width;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (childCount == 1) {
                    i11 = -2;
                } else {
                    i11 = 0;
                }
                layoutParams.width = i11;
                if (i13 != textView.getLayoutParams().width) {
                    textView.requestLayout();
                }
            }
            i12++;
        }
        sparseIntArray.clear();
        for (int i14 = 0; i14 < sparseIntArray2.size(); i14++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i14), sparseIntArray2.valueAt(i14));
        }
    }

    public final boolean d(int i3) {
        if (this.Q.get(i3, -1) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f31603f0 != null) {
            if (this.f31607j0.e(false, 1.0f) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f31603f0.W = this.f31609l0.d(this.f31611n0);
            this.f31603f0.draw(canvas);
            canvas.clipPath(this.f31604g0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f31608k0.e(false, 0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.s51 s51Var = this.f31593a;
        if (view == s51Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            int measuredHeight = getMeasuredHeight();
            float f10 = this.f31615w + this.f31594a0;
            float f11 = this.f31616x + f10 + this.f31596b0;
            View childAt = s51Var.getChildAt(this.f31610n);
            if (this.f31612o0 && childAt != null) {
                f10 += childAt.getTranslationX();
                f11 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.L;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (s51Var.getAlpha() * alpha));
            gradientDrawable.setBounds(org.telegram.messenger.g0.L(4.0f) + getPaddingLeft() + ((int) f10), org.telegram.messenger.g0.L(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f11)) - org.telegram.messenger.g0.L(4.0f), (measuredHeight - getPaddingBottom()) - org.telegram.messenger.g0.L(4.0f));
            gradientDrawable.draw(canvas);
            gradientDrawable.setAlpha(alpha);
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final SparseArray f() {
        SparseArray sparseArray = new SparseArray();
        int i3 = 0;
        while (true) {
            org.telegram.ui.s51 s51Var = this.f31593a;
            int childCount = s51Var.getChildCount();
            SparseIntArray sparseIntArray = this.P;
            if (i3 < childCount) {
                sparseArray.put(sparseIntArray.get(i3), s51Var.getChildAt(i3));
                i3++;
            } else {
                sparseIntArray.clear();
                this.Q.clear();
                this.R.clear();
                this.S.clear();
                s51Var.removeAllViews();
                this.f31614s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public final void g(View view, int i3, int i10) {
        boolean z10;
        yk0 yk0Var;
        if (i10 >= 0) {
            if (view != null || !this.I) {
                int i11 = this.f31610n;
                if (i10 == i11 && (yk0Var = this.f31595b) != null) {
                    yk0Var.A();
                    return;
                }
                if (i11 < i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.K = -1;
                this.U = i11;
                this.f31610n = i10;
                this.f31613r = i3;
                boolean z11 = this.I;
                lt ltVar = this.f31601e0;
                if (z11) {
                    org.telegram.messenger.g0.r(ltVar);
                    this.I = false;
                }
                this.T = 0.0f;
                this.I = true;
                this.E = this.f31615w;
                this.F = this.f31616x;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.H = textView.getMeasuredWidth();
                    this.G = k2.p1.e(textView.getMeasuredWidth(), this.H, 2, textView.getLeft());
                }
                setEnabled(false);
                org.telegram.messenger.g0.i3(ltVar, 16L);
                yk0 yk0Var2 = this.f31595b;
                if (yk0Var2 != null) {
                    yk0Var2.f(i3, z10);
                }
                h(i10, true);
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.J;
    }

    public int getCurrentPosition() {
        return this.f31610n;
    }

    public int getCurrentTabId() {
        return this.f31613r;
    }

    public int getFirstTabId() {
        return this.P.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.L;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i3 = 0; i3 < this.f31593a.getChildCount(); i3++) {
            arrayList.add(Integer.valueOf(this.P.get(i3)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f31593a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(int i3, boolean z10) {
        if (this.h != 0 && this.K != i3) {
            this.K = i3;
            TextView textView = (TextView) this.f31593a.getChildAt(i3);
            if (textView != null) {
                int scrollX = getScrollX();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                if (left - org.telegram.messenger.g0.L(50.0f) < scrollX) {
                    if (z10) {
                        smoothScrollTo(left - org.telegram.messenger.g0.L(50.0f), 0);
                        return;
                    } else {
                        scrollTo(left - org.telegram.messenger.g0.L(50.0f), 0);
                        return;
                    }
                }
                int i10 = left + measuredWidth;
                if (org.telegram.messenger.g0.L(21.0f) + i10 > getWidth() + scrollX) {
                    if (z10) {
                        smoothScrollTo(i10, 0);
                    } else {
                        scrollTo(i10, 0);
                    }
                }
            }
        }
    }

    public final void i(float f10, int i3) {
        int i10;
        int i11 = this.Q.get(i3, -1);
        if (i11 >= 0 && (i10 = this.f31610n) != i11) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            org.telegram.ui.s51 s51Var = this.f31593a;
            TextView textView = (TextView) s51Var.getChildAt(i10);
            TextView textView2 = (TextView) s51Var.getChildAt(i11);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.F = textView.getMeasuredWidth();
                this.E = k2.p1.e(textView.getMeasuredWidth(), this.F, 2, textView.getLeft());
                textView2.getLayout();
                this.H = textView2.getMeasuredWidth();
                this.G = k2.p1.e(textView2.getMeasuredWidth(), this.H, 2, textView2.getLeft());
                j(textView2, textView, f10);
                if (f10 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.N));
                    textView2.setTag(Integer.valueOf(this.M));
                }
                h(s51Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.f31610n = i11;
                this.f31613r = i3;
            }
        }
    }

    public final void j(TextView textView, TextView textView2, float f10) {
        int i3 = this.M;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31597c;
        int e10 = e(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        int e11 = e(org.telegram.ui.ActionBar.k6.w0(this.N, e6Var));
        int red = Color.red(e10);
        int green = Color.green(e10);
        int blue = Color.blue(e10);
        int alpha = Color.alpha(e10);
        int red2 = Color.red(e11);
        int green2 = Color.green(e11);
        int blue2 = Color.blue(e11);
        int alpha2 = Color.alpha(e11);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f10) + alpha), (int) (((red2 - red) * f10) + red), (int) (((green2 - green) * f10) + green), (int) (((blue2 - blue) * f10) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f10) + alpha2), (int) (((red - red2) * f10) + red2), (int) (((green - green2) * f10) + green2), (int) (((blue - blue2) * f10) + blue2)));
        int i10 = this.E;
        this.f31615w = (int) (((this.G - i10) * f10) + i10);
        int i11 = this.F;
        this.f31616x = (int) (((this.H - i11) * f10) + i11);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        int i14 = i11 - i3;
        if (this.f31617y != i14) {
            this.f31617y = i14;
            this.K = -1;
            if (this.I) {
                org.telegram.messenger.g0.r(this.f31601e0);
                this.I = false;
                setEnabled(true);
                yk0 yk0Var = this.f31595b;
                if (yk0Var != null) {
                    yk0Var.F0(1.0f);
                }
            }
            TextView textView = (TextView) this.f31593a.getChildAt(this.f31610n);
            if (textView != null) {
                textView.getLayout();
                this.f31616x = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i15 = this.f31616x;
                int e10 = k2.p1.e(measuredWidth, i15, 2, left);
                this.f31615w = e10;
                int i16 = this.V;
                if (i16 > 0 && (i13 = this.W) > 0) {
                    if (i16 != e10 || i13 != i15) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new gi.h4(this, i16 - e10, i13 - i15, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(xq.f40452f);
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
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(22.0f);
        org.telegram.ui.s51 s51Var = this.f31593a;
        int childCount = s51Var.getChildCount();
        boolean z10 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = s51Var.getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i12 = layoutParams.width;
            boolean z11 = this.f31600e;
            SparseIntArray sparseIntArray = this.S;
            if (z11) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i11);
            } else {
                int i13 = this.f31614s;
                if (i13 > size) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else if (this.d) {
                    layoutParams.weight = 1.0f / childCount;
                    layoutParams.width = 0;
                } else if (i11 == 0 && childCount == 1) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else {
                    layoutParams.weight = org.telegram.messenger.g0.T1(1.0f / childCount, (1.0f / i13) * sparseIntArray.get(i11), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f10 - layoutParams.weight) > 0.001f || i12 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = s51Var.getWeightSum();
        if (childCount != 1 && this.f31614s <= size) {
            s51Var.setWeightSum(1.0f);
        } else {
            s51Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - s51Var.getWeightSum()) > 0.1f) {
            s51Var.requestLayout();
        }
        super.onMeasure(i3, i10);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i3)) {
            z10 = true;
        }
        this.f31602f = z10;
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.J = f10;
        int i3 = this.f31610n;
        org.telegram.ui.s51 s51Var = this.f31593a;
        TextView textView = (TextView) s51Var.getChildAt(i3);
        TextView textView2 = (TextView) s51Var.getChildAt(this.U);
        if (textView2 != null && textView != null) {
            j(textView, textView2, f10);
            if (f10 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.N));
                textView.setTag(Integer.valueOf(this.M));
            }
            yk0 yk0Var = this.f31595b;
            if (yk0Var != null) {
                yk0Var.F0(f10);
            }
        }
    }

    public void setBlurredBackground(gh.g gVar) {
        this.f31603f0 = gVar;
        gVar.setCallback(this);
    }

    public void setDelegate(yk0 yk0Var) {
        this.f31595b = yk0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        org.telegram.ui.s51 s51Var = this.f31593a;
        int childCount = s51Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            s51Var.getChildAt(i3).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i3) {
        this.m0 = true;
        this.f31613r = i3;
        int i10 = this.Q.get(i3);
        if (((TextView) this.f31593a.getChildAt(i10)) != null) {
            this.f31610n = i10;
            this.f31617y = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        float f10;
        float f11;
        if (z10 == this.f31611n0) {
            return;
        }
        this.f31611n0 = z10;
        float f12 = 6.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        int paddingTop = getPaddingTop();
        if (this.f31611n0) {
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
        }
        setPadding(L, paddingTop, org.telegram.messenger.g0.L(f11), getPaddingBottom());
        invalidate();
        if (!this.f31602f) {
            this.f31605h0.set(this.f31606i0);
            this.f31607j0.e(true, 0.0f);
            if (!this.f31611n0) {
                f12 = -6.0f;
            }
            this.f31608k0.e(true, org.telegram.messenger.g0.L(f12));
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f31612o0 == z10) {
            return;
        }
        this.f31612o0 = z10;
        org.telegram.messenger.g0.c0(this.f31593a, new ei.e(27));
    }

    public void setUseMinimalWidth(boolean z10) {
        int i3;
        this.f31600e = z10;
        if (this.f31600e) {
            i3 = -2;
        } else {
            i3 = -1;
        }
        this.f31593a.setLayoutParams(new FrameLayout.LayoutParams(i3, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var;
        int i3;
        org.telegram.ui.s51 s51Var = this.f31593a;
        int childCount = s51Var.getChildCount();
        int i10 = 0;
        while (true) {
            e6Var = this.f31597c;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) s51Var.getChildAt(i10);
            if (this.f31610n == i10) {
                i3 = this.M;
            } else {
                i3 = this.N;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
            textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.15f, e(org.telegram.ui.ActionBar.k6.w0(this.M, e6Var))), 7, org.telegram.messenger.g0.L(14.0f)), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
            i10++;
        }
        this.L.setColor(org.telegram.ui.ActionBar.k6.r1(0.15f, e(org.telegram.ui.ActionBar.k6.w0(this.M, e6Var))));
        gh.g gVar = this.f31603f0;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31603f0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int e(int i3) {
        return i3;
    }
}
