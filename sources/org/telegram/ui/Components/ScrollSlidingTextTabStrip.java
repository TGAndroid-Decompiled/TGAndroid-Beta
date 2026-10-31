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
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.k6 {
    public static final int f24164o0 = 0;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public float I;
    public int J;
    public final GradientDrawable K;
    public int L;
    public int M;
    public final gr N;
    public final SparseIntArray O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public float S;
    public int T;
    public int U;
    public int V;
    public float W;
    public final org.telegram.ui.u71 f24165a;
    public float f24166a0;
    public xl0 f24167b;
    public long f24168b0;
    public final org.telegram.ui.ActionBar.p6 f24169c;
    public View f24170c0;
    public boolean d;
    public final ew f24171d0;
    public boolean e;
    public vg.f f24172e0;
    public boolean f24173f;
    public final Path f24174f0;
    public final RectF f24175g0;
    public int h;
    public final RectF f24176h0;
    public final t5 f24177i0;
    public final t5 f24178j0;
    public final t5 f24179k0;
    public boolean f24180l0;
    public boolean m0;
    public int f24181n;
    public boolean f24182n0;
    public int f24183r;
    public int f24184s;
    public int f24185w;
    public int f24186x;
    public int f24187y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f24183r = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.t6.I8;
        this.M = org.telegram.ui.ActionBar.t6.J8;
        gr grVar = gr.h;
        this.N = grVar;
        this.O = new SparseIntArray(5);
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.f24168b0 = 200L;
        this.f24171d0 = new ew(this, 11);
        this.f24174f0 = new Path();
        this.f24175g0 = new RectF();
        this.f24176h0 = new RectF();
        this.f24177i0 = new t5(this, 420L, grVar);
        this.f24178j0 = new t5(this, 420L, grVar);
        this.f24179k0 = new t5(this, 420L, grVar);
        this.m0 = true;
        this.f24169c = p6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        float N = org.telegram.messenger.i0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(this, context, 10);
        this.f24165a = u71Var;
        u71Var.setOrientation(0);
        u71Var.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
        u71Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(u71Var);
        updateColors();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence m10;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.f24183r == -1) {
            this.f24183r = i10;
        }
        this.O.put(i11, i10);
        this.P.put(i10, i11);
        int i12 = this.f24183r;
        if (i12 != -1 && i12 == i10) {
            this.f24181n = i11;
            this.f24187y = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new wl0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
            textView.setOnClickListener(new bh.f(this, i10, 12));
            textView.setOnLongClickListener(new bh.j(this, i10, 1));
            org.telegram.messenger.zs.i(textView);
        }
        textView.setText(org.telegram.messenger.k6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
        int L = org.telegram.messenger.i0.L(32.0f) + ((int) Math.ceil(vh.p2.g(m10, textView.getPaint())));
        this.f24165a.addView(textView, w7.b6.o(0, -1));
        this.f24184s += L;
        this.R.put(i11, L);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.L));
    }

    public final void b() {
        float e = this.f24177i0.e(false, 1.0f);
        RectF rectF = this.f24176h0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        int i10 = (e > 1.0f ? 1 : (e == 1.0f ? 0 : -1));
        RectF rectF2 = this.f24175g0;
        if (i10 >= 0) {
            rectF2.set(rectF);
        } else {
            org.telegram.messenger.i0.Z1(rectF2, rectF, e, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f24174f0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        vg.f fVar = this.f24172e0;
        if (fVar != null) {
            fVar.setAlpha(255);
            this.f24172e0.setBounds(((int) rectF.left) - org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f24172e0.q(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.u71 u71Var = this.f24165a;
        int childCount = u71Var.getChildCount();
        int i13 = 0;
        while (true) {
            sparseIntArray = this.Q;
            sparseIntArray2 = this.R;
            if (i13 >= childCount) {
                break;
            }
            TextView textView = (TextView) u71Var.getChildAt(i13);
            if (this.f24181n == i13) {
                i10 = this.L;
            } else {
                i10 = this.M;
            }
            textView.setTag(Integer.valueOf(i10));
            if (this.f24181n == i13) {
                i11 = this.L;
            } else {
                i11 = this.M;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(i11, this.f24169c)));
            if (this.e) {
                if (sparseIntArray.size() != sparseIntArray2.size() || sparseIntArray.get(i13) != sparseIntArray2.get(i13)) {
                    textView.requestLayout();
                }
            } else if (i13 == 0) {
                int i14 = textView.getLayoutParams().width;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (childCount == 1) {
                    i12 = -2;
                } else {
                    i12 = 0;
                }
                layoutParams.width = i12;
                if (i14 != textView.getLayoutParams().width) {
                    textView.requestLayout();
                }
            }
            i13++;
        }
        sparseIntArray.clear();
        for (int i15 = 0; i15 < sparseIntArray2.size(); i15++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i15), sparseIntArray2.valueAt(i15));
        }
    }

    public final boolean d(int i10) {
        if (this.P.get(i10, -1) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f24172e0 != null) {
            if (this.f24177i0.e(false, 1.0f) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f24172e0.R = this.f24179k0.d(this.m0);
            this.f24172e0.draw(canvas);
            canvas.clipPath(this.f24174f0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f24178j0.e(false, 0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.u71 u71Var = this.f24165a;
        if (view == u71Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            int measuredHeight = getMeasuredHeight();
            float f7 = this.f24185w + this.W;
            float f10 = this.f24186x + f7 + this.f24166a0;
            View childAt = u71Var.getChildAt(this.f24181n);
            if (this.f24182n0 && childAt != null) {
                f7 += childAt.getTranslationX();
                f10 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.K;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (u71Var.getAlpha() * alpha));
            gradientDrawable.setBounds(org.telegram.messenger.i0.L(4.0f) + getPaddingLeft() + ((int) f7), org.telegram.messenger.i0.L(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f10)) - org.telegram.messenger.i0.L(4.0f), (measuredHeight - getPaddingBottom()) - org.telegram.messenger.i0.L(4.0f));
            gradientDrawable.draw(canvas);
            gradientDrawable.setAlpha(alpha);
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final SparseArray f() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            org.telegram.ui.u71 u71Var = this.f24165a;
            int childCount = u71Var.getChildCount();
            SparseIntArray sparseIntArray = this.O;
            if (i10 < childCount) {
                sparseArray.put(sparseIntArray.get(i10), u71Var.getChildAt(i10));
                i10++;
            } else {
                sparseIntArray.clear();
                this.P.clear();
                this.Q.clear();
                this.R.clear();
                u71Var.removeAllViews();
                this.f24184s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public final void g(View view, int i10, int i11) {
        boolean z10;
        xl0 xl0Var;
        if (i11 >= 0) {
            if (view != null || !this.H) {
                int i12 = this.f24181n;
                if (i11 == i12 && (xl0Var = this.f24167b) != null) {
                    xl0Var.D();
                    return;
                }
                if (i12 < i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.J = -1;
                this.T = i12;
                this.f24181n = i11;
                this.f24183r = i10;
                boolean z11 = this.H;
                ew ewVar = this.f24171d0;
                if (z11) {
                    org.telegram.messenger.i0.r(ewVar);
                    this.H = false;
                }
                this.S = 0.0f;
                this.H = true;
                this.D = this.f24185w;
                this.E = this.f24186x;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.G = textView.getMeasuredWidth();
                    this.F = i0.a.u(textView.getMeasuredWidth(), this.G, 2, textView.getLeft());
                }
                setEnabled(false);
                org.telegram.messenger.i0.h3(ewVar, 16L);
                xl0 xl0Var2 = this.f24167b;
                if (xl0Var2 != null) {
                    xl0Var2.d(i10, z10);
                }
                h(i11, true);
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.I;
    }

    public int getCurrentPosition() {
        return this.f24181n;
    }

    public int getCurrentTabId() {
        return this.f24183r;
    }

    public int getFirstTabId() {
        return this.O.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.f24165a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.O.get(i10)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f24165a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(int i10, boolean z10) {
        if (this.h != 0 && this.J != i10) {
            this.J = i10;
            TextView textView = (TextView) this.f24165a.getChildAt(i10);
            if (textView != null) {
                int scrollX = getScrollX();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                if (left - org.telegram.messenger.i0.L(50.0f) < scrollX) {
                    if (z10) {
                        smoothScrollTo(left - org.telegram.messenger.i0.L(50.0f), 0);
                        return;
                    } else {
                        scrollTo(left - org.telegram.messenger.i0.L(50.0f), 0);
                        return;
                    }
                }
                int i11 = left + measuredWidth;
                if (org.telegram.messenger.i0.L(21.0f) + i11 > getWidth() + scrollX) {
                    if (z10) {
                        smoothScrollTo(i11, 0);
                    } else {
                        scrollTo(i11, 0);
                    }
                }
            }
        }
    }

    public final void i(float f7, int i10) {
        int i11;
        int i12 = this.P.get(i10, -1);
        if (i12 >= 0 && (i11 = this.f24181n) != i12) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            org.telegram.ui.u71 u71Var = this.f24165a;
            TextView textView = (TextView) u71Var.getChildAt(i11);
            TextView textView2 = (TextView) u71Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.E = textView.getMeasuredWidth();
                this.D = i0.a.u(textView.getMeasuredWidth(), this.E, 2, textView.getLeft());
                textView2.getLayout();
                this.G = textView2.getMeasuredWidth();
                this.F = i0.a.u(textView2.getMeasuredWidth(), this.G, 2, textView2.getLeft());
                j(textView2, textView, f7);
                if (f7 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.M));
                    textView2.setTag(Integer.valueOf(this.L));
                }
                h(u71Var.indexOfChild(textView2), true);
            }
            if (f7 >= 1.0f) {
                this.f24181n = i12;
                this.f24183r = i10;
            }
        }
    }

    public final void j(TextView textView, TextView textView2, float f7) {
        int i10 = this.L;
        org.telegram.ui.ActionBar.p6 p6Var = this.f24169c;
        int e = e(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        int e7 = e(org.telegram.ui.ActionBar.t6.w0(this.M, p6Var));
        int red = Color.red(e);
        int green = Color.green(e);
        int blue = Color.blue(e);
        int alpha = Color.alpha(e);
        int red2 = Color.red(e7);
        int green2 = Color.green(e7);
        int blue2 = Color.blue(e7);
        int alpha2 = Color.alpha(e7);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f7) + alpha), (int) (((red2 - red) * f7) + red), (int) (((green2 - green) * f7) + green), (int) (((blue2 - blue) * f7) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f7) + alpha2), (int) (((red - red2) * f7) + red2), (int) (((green - green2) * f7) + green2), (int) (((blue - blue2) * f7) + blue2)));
        int i11 = this.D;
        this.f24185w = (int) (((this.F - i11) * f7) + i11);
        int i12 = this.E;
        this.f24186x = (int) (((this.G - i12) * f7) + i12);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.f24187y != i15) {
            this.f24187y = i15;
            this.J = -1;
            if (this.H) {
                org.telegram.messenger.i0.r(this.f24171d0);
                this.H = false;
                setEnabled(true);
                xl0 xl0Var = this.f24167b;
                if (xl0Var != null) {
                    xl0Var.E0(1.0f);
                }
            }
            TextView textView = (TextView) this.f24165a.getChildAt(this.f24181n);
            if (textView != null) {
                textView.getLayout();
                this.f24186x = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.f24186x;
                int u10 = i0.a.u(measuredWidth, i16, 2, left);
                this.f24185w = u10;
                int i17 = this.U;
                if (i17 > 0 && (i14 = this.V) > 0) {
                    if (i17 != u10 || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new jg.a0(this, i17 - u10, i14 - i16, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(gr.f26495f);
                        ofFloat.start();
                    }
                    this.U = 0;
                    this.V = 0;
                }
            }
        }
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(22.0f);
        org.telegram.ui.u71 u71Var = this.f24165a;
        int childCount = u71Var.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = u71Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f7 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z11 = this.e;
            SparseIntArray sparseIntArray = this.R;
            if (z11) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i12);
            } else {
                int i14 = this.f24184s;
                if (i14 > size) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else if (this.d) {
                    layoutParams.weight = 1.0f / childCount;
                    layoutParams.width = 0;
                } else if (i12 == 0 && childCount == 1) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else {
                    layoutParams.weight = org.telegram.messenger.i0.T1(1.0f / childCount, (1.0f / i14) * sparseIntArray.get(i12), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f7 - layoutParams.weight) > 0.001f || i13 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = u71Var.getWeightSum();
        if (childCount != 1 && this.f24184s <= size) {
            u71Var.setWeightSum(1.0f);
        } else {
            u71Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - u71Var.getWeightSum()) > 0.1f) {
            u71Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i10)) {
            z10 = true;
        }
        this.f24173f = z10;
        b();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.I = f7;
        int i10 = this.f24181n;
        org.telegram.ui.u71 u71Var = this.f24165a;
        TextView textView = (TextView) u71Var.getChildAt(i10);
        TextView textView2 = (TextView) u71Var.getChildAt(this.T);
        if (textView2 != null && textView != null) {
            j(textView, textView2, f7);
            if (f7 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.M));
                textView.setTag(Integer.valueOf(this.L));
            }
            xl0 xl0Var = this.f24167b;
            if (xl0Var != null) {
                xl0Var.E0(f7);
            }
        }
    }

    public void setBlurredBackground(vg.f fVar) {
        this.f24172e0 = fVar;
        fVar.setCallback(this);
    }

    public void setDelegate(xl0 xl0Var) {
        this.f24167b = xl0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        org.telegram.ui.u71 u71Var = this.f24165a;
        int childCount = u71Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            u71Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.f24180l0 = true;
        this.f24183r = i10;
        int i11 = this.P.get(i10);
        if (((TextView) this.f24165a.getChildAt(i11)) != null) {
            this.f24181n = i11;
            this.f24187y = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        float f7;
        float f10;
        if (z10 == this.m0) {
            return;
        }
        this.m0 = z10;
        float f11 = 6.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 6.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        int paddingTop = getPaddingTop();
        if (this.m0) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        setPadding(L, paddingTop, org.telegram.messenger.i0.L(f10), getPaddingBottom());
        invalidate();
        if (!this.f24173f) {
            this.f24175g0.set(this.f24176h0);
            this.f24177i0.e(true, 0.0f);
            if (!this.m0) {
                f11 = -6.0f;
            }
            this.f24178j0.e(true, org.telegram.messenger.i0.L(f11));
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f24182n0 == z10) {
            return;
        }
        this.f24182n0 = z10;
        org.telegram.messenger.i0.c0(this.f24165a, new ag.z0(2));
    }

    public void setUseMinimalWidth(boolean z10) {
        int i10;
        this.e = z10;
        if (this.e) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.f24165a.setLayoutParams(new FrameLayout.LayoutParams(i10, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.p6 p6Var;
        int i10;
        org.telegram.ui.u71 u71Var = this.f24165a;
        int childCount = u71Var.getChildCount();
        int i11 = 0;
        while (true) {
            p6Var = this.f24169c;
            if (i11 >= childCount) {
                break;
            }
            TextView textView = (TextView) u71Var.getChildAt(i11);
            if (this.f24181n == i11) {
                i10 = this.L;
            } else {
                i10 = this.M;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
            textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.r1(0.15f, e(org.telegram.ui.ActionBar.t6.w0(this.L, p6Var))), 7, org.telegram.messenger.i0.L(14.0f)), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f)));
            i11++;
        }
        this.K.setColor(org.telegram.ui.ActionBar.t6.r1(0.15f, e(org.telegram.ui.ActionBar.t6.w0(this.L, p6Var))));
        vg.f fVar = this.f24172e0;
        if (fVar != null) {
            fVar.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f24172e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int e(int i10) {
        return i10;
    }
}
