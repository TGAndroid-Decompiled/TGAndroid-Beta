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
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.c6 {
    public static final int f33196p0 = 0;
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
    public final kr O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.b61 f33197a;
    public float f33198a0;
    public jl0 f33199b;
    public float f33200b0;
    public final org.telegram.ui.ActionBar.i6 f33201c;
    public long f33202c0;
    public boolean d;
    public View f33203d0;
    public boolean f33204e;
    public final rc f33205e0;
    public boolean f33206f;
    public fh.g f33207f0;
    public final Path f33208g0;
    public int h;
    public final RectF f33209h0;
    public final RectF f33210i0;
    public final c6 f33211j0;
    public final c6 f33212k0;
    public final c6 f33213l0;
    public boolean m0;
    public int f33214n;
    public boolean f33215n0;
    public boolean f33216o0;
    public int f33217r;
    public int f33218s;
    public int f33219w;
    public int f33220x;
    public int f33221y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f33217r = -1;
        this.K = -1;
        this.M = org.telegram.ui.ActionBar.n6.I8;
        this.N = org.telegram.ui.ActionBar.n6.J8;
        kr krVar = kr.h;
        this.O = krVar;
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.S = new SparseIntArray(5);
        this.f33202c0 = 200L;
        this.f33205e0 = new rc(this, 18);
        this.f33208g0 = new Path();
        this.f33209h0 = new RectF();
        this.f33210i0 = new RectF();
        this.f33211j0 = new c6(this, 420L, krVar);
        this.f33212k0 = new c6(this, 420L, krVar);
        this.f33213l0 = new c6(this, 420L, krVar);
        this.f33215n0 = true;
        this.f33201c = i6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.L = gradientDrawable;
        float N = org.telegram.messenger.g0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(15, context, this);
        this.f33197a = b61Var;
        b61Var.setOrientation(0);
        b61Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        b61Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(b61Var);
        updateColors();
    }

    public final void a(int i7, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence m10;
        int i10 = this.h;
        this.h = i10 + 1;
        if (i10 == 0 && this.f33217r == -1) {
            this.f33217r = i7;
        }
        this.P.put(i10, i7);
        this.Q.put(i7, i10);
        int i11 = this.f33217r;
        if (i11 != -1 && i11 == i7) {
            this.f33214n = i10;
            this.f33221y = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i7);
            sparseArray.delete(i7);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new il0(this, getContext(), i7);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            textView.setOnClickListener(new ci.q(this, i7, 19));
            textView.setOnLongClickListener(new lh.g(this, i7, 1));
            org.telegram.messenger.ks.i(textView);
        }
        textView.setText(org.telegram.messenger.j6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
        int L = org.telegram.messenger.g0.L(32.0f) + ((int) Math.ceil(hi.u3.h(m10, textView.getPaint())));
        this.f33197a.addView(textView, c8.na.o(0, -1));
        this.f33218s += L;
        this.S.put(i10, L);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.M));
    }

    public final void b() {
        float e10 = this.f33211j0.e(false, 1.0f);
        RectF rectF = this.f33210i0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        int i7 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        RectF rectF2 = this.f33209h0;
        if (i7 >= 0) {
            rectF2.set(rectF);
        } else {
            org.telegram.messenger.g0.Z1(rectF2, rectF, e10, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f33208g0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        fh.g gVar = this.f33207f0;
        if (gVar != null) {
            gVar.setAlpha(255);
            this.f33207f0.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f33207f0.r(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.b61 b61Var = this.f33197a;
        int childCount = b61Var.getChildCount();
        int i12 = 0;
        while (true) {
            sparseIntArray = this.R;
            sparseIntArray2 = this.S;
            if (i12 >= childCount) {
                break;
            }
            TextView textView = (TextView) b61Var.getChildAt(i12);
            if (this.f33214n == i12) {
                i7 = this.M;
            } else {
                i7 = this.N;
            }
            textView.setTag(Integer.valueOf(i7));
            if (this.f33214n == i12) {
                i10 = this.M;
            } else {
                i10 = this.N;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.n6.w0(i10, this.f33201c)));
            if (this.f33204e) {
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

    public final boolean d(int i7) {
        if (this.Q.get(i7, -1) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f33207f0 != null) {
            if (this.f33211j0.e(false, 1.0f) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f33207f0.W = this.f33213l0.d(this.f33215n0);
            this.f33207f0.draw(canvas);
            canvas.clipPath(this.f33208g0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f33212k0.e(false, 0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.b61 b61Var = this.f33197a;
        if (view == b61Var) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            int measuredHeight = getMeasuredHeight();
            float f10 = this.f33219w + this.f33198a0;
            float f11 = this.f33220x + f10 + this.f33200b0;
            View childAt = b61Var.getChildAt(this.f33214n);
            if (this.f33216o0 && childAt != null) {
                f10 += childAt.getTranslationX();
                f11 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.L;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (b61Var.getAlpha() * alpha));
            gradientDrawable.setBounds(org.telegram.messenger.g0.L(4.0f) + getPaddingLeft() + ((int) f10), org.telegram.messenger.g0.L(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f11)) - org.telegram.messenger.g0.L(4.0f), (measuredHeight - getPaddingBottom()) - org.telegram.messenger.g0.L(4.0f));
            gradientDrawable.draw(canvas);
            gradientDrawable.setAlpha(alpha);
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final SparseArray f() {
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        while (true) {
            org.telegram.ui.b61 b61Var = this.f33197a;
            int childCount = b61Var.getChildCount();
            SparseIntArray sparseIntArray = this.P;
            if (i7 < childCount) {
                sparseArray.put(sparseIntArray.get(i7), b61Var.getChildAt(i7));
                i7++;
            } else {
                sparseIntArray.clear();
                this.Q.clear();
                this.R.clear();
                this.S.clear();
                b61Var.removeAllViews();
                this.f33218s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public final void g(View view, int i7, int i10) {
        boolean z10;
        jl0 jl0Var;
        if (i10 >= 0) {
            if (view != null || !this.I) {
                int i11 = this.f33214n;
                if (i10 == i11 && (jl0Var = this.f33199b) != null) {
                    jl0Var.y();
                    return;
                }
                if (i11 < i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.K = -1;
                this.U = i11;
                this.f33214n = i10;
                this.f33217r = i7;
                boolean z11 = this.I;
                rc rcVar = this.f33205e0;
                if (z11) {
                    org.telegram.messenger.g0.r(rcVar);
                    this.I = false;
                }
                this.T = 0.0f;
                this.I = true;
                this.E = this.f33219w;
                this.F = this.f33220x;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.H = textView.getMeasuredWidth();
                    this.G = i5.c.e(textView.getMeasuredWidth(), this.H, 2, textView.getLeft());
                }
                setEnabled(false);
                org.telegram.messenger.g0.h3(rcVar, 16L);
                jl0 jl0Var2 = this.f33199b;
                if (jl0Var2 != null) {
                    jl0Var2.a(i7, z10);
                }
                h(i10, true);
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.J;
    }

    public int getCurrentPosition() {
        return this.f33214n;
    }

    public int getCurrentTabId() {
        return this.f33217r;
    }

    public int getFirstTabId() {
        return this.P.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.L;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < this.f33197a.getChildCount(); i7++) {
            arrayList.add(Integer.valueOf(this.P.get(i7)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f33197a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(int i7, boolean z10) {
        int left;
        int right;
        int i10;
        if (this.h != 0 && this.K != i7) {
            this.K = i7;
            org.telegram.ui.b61 b61Var = this.f33197a;
            TextView textView = (TextView) b61Var.getChildAt(i7);
            if (textView != null) {
                int scrollX = getScrollX();
                View childAt = b61Var.getChildAt(i7 - 1);
                View childAt2 = b61Var.getChildAt(i7 + 1);
                int left2 = b61Var.getLeft();
                if (childAt != null) {
                    left = childAt.getLeft();
                } else {
                    left = textView.getLeft();
                }
                int i11 = left2 + left;
                int left3 = b61Var.getLeft();
                if (childAt2 != null) {
                    right = childAt2.getRight();
                } else {
                    right = textView.getRight();
                }
                int i12 = left3 + right;
                int L = org.telegram.messenger.g0.L(7.0f) + getPaddingLeft() + scrollX;
                int width = ((getWidth() + scrollX) - getPaddingRight()) - org.telegram.messenger.g0.L(7.0f);
                if (i11 < L) {
                    i10 = (scrollX + i11) - L;
                } else if (i12 > width) {
                    i10 = (scrollX + i12) - width;
                } else {
                    return;
                }
                if (z10) {
                    smoothScrollTo(i10, 0);
                } else {
                    scrollTo(i10, 0);
                }
            }
        }
    }

    public final void i(float f10, int i7) {
        int i10;
        int i11 = this.Q.get(i7, -1);
        if (i11 >= 0 && (i10 = this.f33214n) != i11) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            org.telegram.ui.b61 b61Var = this.f33197a;
            TextView textView = (TextView) b61Var.getChildAt(i10);
            TextView textView2 = (TextView) b61Var.getChildAt(i11);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.F = textView.getMeasuredWidth();
                this.E = i5.c.e(textView.getMeasuredWidth(), this.F, 2, textView.getLeft());
                textView2.getLayout();
                this.H = textView2.getMeasuredWidth();
                this.G = i5.c.e(textView2.getMeasuredWidth(), this.H, 2, textView2.getLeft());
                j(textView2, textView, f10);
                if (f10 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.N));
                    textView2.setTag(Integer.valueOf(this.M));
                }
                h(b61Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.f33214n = i11;
                this.f33217r = i7;
            }
        }
    }

    public final void j(TextView textView, TextView textView2, float f10) {
        int i7 = this.M;
        org.telegram.ui.ActionBar.i6 i6Var = this.f33201c;
        int e10 = e(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        int e11 = e(org.telegram.ui.ActionBar.n6.w0(this.N, i6Var));
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
        this.f33219w = (int) (((this.G - i10) * f10) + i10);
        int i11 = this.F;
        this.f33220x = (int) (((this.H - i11) * f10) + i11);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        int i14 = i11 - i7;
        if (this.f33221y != i14) {
            this.f33221y = i14;
            this.K = -1;
            if (this.I) {
                org.telegram.messenger.g0.r(this.f33205e0);
                this.I = false;
                setEnabled(true);
                jl0 jl0Var = this.f33199b;
                if (jl0Var != null) {
                    jl0Var.c(1.0f);
                }
            }
            TextView textView = (TextView) this.f33197a.getChildAt(this.f33214n);
            if (textView != null) {
                textView.getLayout();
                this.f33220x = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i15 = this.f33220x;
                int e10 = i5.c.e(measuredWidth, i15, 2, left);
                this.f33219w = e10;
                int i16 = this.V;
                if (i16 > 0 && (i13 = this.W) > 0) {
                    if (i16 != e10 || i13 != i15) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new hi.q4(this, i16 - e10, i13 - i15, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(kr.f36858f);
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
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(22.0f);
        org.telegram.ui.b61 b61Var = this.f33197a;
        int childCount = b61Var.getChildCount();
        boolean z10 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = b61Var.getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i12 = layoutParams.width;
            boolean z11 = this.f33204e;
            SparseIntArray sparseIntArray = this.S;
            if (z11) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i11);
            } else {
                int i13 = this.f33218s;
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
        float weightSum = b61Var.getWeightSum();
        if (childCount != 1 && this.f33218s <= size) {
            b61Var.setWeightSum(1.0f);
        } else {
            b61Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - b61Var.getWeightSum()) > 0.1f) {
            b61Var.requestLayout();
        }
        super.onMeasure(i7, i10);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i7)) {
            z10 = true;
        }
        this.f33206f = z10;
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.J = f10;
        int i7 = this.f33214n;
        org.telegram.ui.b61 b61Var = this.f33197a;
        TextView textView = (TextView) b61Var.getChildAt(i7);
        TextView textView2 = (TextView) b61Var.getChildAt(this.U);
        if (textView2 != null && textView != null) {
            j(textView, textView2, f10);
            if (f10 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.N));
                textView.setTag(Integer.valueOf(this.M));
            }
            jl0 jl0Var = this.f33199b;
            if (jl0Var != null) {
                jl0Var.c(f10);
            }
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f33207f0 = gVar;
        gVar.setCallback(this);
    }

    public void setDelegate(jl0 jl0Var) {
        this.f33199b = jl0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        org.telegram.ui.b61 b61Var = this.f33197a;
        int childCount = b61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            b61Var.getChildAt(i7).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i7) {
        this.m0 = true;
        this.f33217r = i7;
        int i10 = this.Q.get(i7);
        if (((TextView) this.f33197a.getChildAt(i10)) != null) {
            this.f33214n = i10;
            this.f33221y = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        float f10;
        float f11;
        if (z10 == this.f33215n0) {
            return;
        }
        this.f33215n0 = z10;
        float f12 = 6.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        int paddingTop = getPaddingTop();
        if (this.f33215n0) {
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
        }
        setPadding(L, paddingTop, org.telegram.messenger.g0.L(f11), getPaddingBottom());
        invalidate();
        if (!this.f33206f) {
            this.f33209h0.set(this.f33210i0);
            this.f33211j0.e(true, 0.0f);
            if (!this.f33215n0) {
                f12 = -6.0f;
            }
            this.f33212k0.e(true, org.telegram.messenger.g0.L(f12));
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f33216o0 == z10) {
            return;
        }
        this.f33216o0 = z10;
        org.telegram.messenger.g0.c0(this.f33197a, new pg.c(0));
    }

    public void setUseMinimalWidth(boolean z10) {
        int i7;
        this.f33204e = z10;
        if (this.f33204e) {
            i7 = -2;
        } else {
            i7 = -1;
        }
        this.f33197a.setLayoutParams(new FrameLayout.LayoutParams(i7, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var;
        int i7;
        org.telegram.ui.b61 b61Var = this.f33197a;
        int childCount = b61Var.getChildCount();
        int i10 = 0;
        while (true) {
            i6Var = this.f33201c;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) b61Var.getChildAt(i10);
            if (this.f33214n == i10) {
                i7 = this.M;
            } else {
                i7 = this.N;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)));
            textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.15f, e(org.telegram.ui.ActionBar.n6.w0(this.M, i6Var))), 7, org.telegram.messenger.g0.L(14.0f)), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
            i10++;
        }
        this.L.setColor(org.telegram.ui.ActionBar.n6.r1(0.15f, e(org.telegram.ui.ActionBar.n6.w0(this.M, i6Var))));
        fh.g gVar = this.f33207f0;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f33207f0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int e(int i7) {
        return i7;
    }
}
