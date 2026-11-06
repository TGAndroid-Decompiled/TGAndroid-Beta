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
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.a6 {
    public static final int f31515o0 = 0;
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
    public final xq N;
    public final SparseIntArray O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public float S;
    public int T;
    public int U;
    public int V;
    public float W;
    public final org.telegram.ui.c61 f31516a;
    public float f31517a0;
    public uk0 f31518b;
    public long f31519b0;
    public final org.telegram.ui.ActionBar.f6 f31520c;
    public View f31521c0;
    public boolean d;
    public final dt f31522d0;
    public boolean f31523e;
    public fh.g f31524e0;
    public boolean f31525f;
    public final Path f31526f0;
    public final RectF f31527g0;
    public int h;
    public final RectF f31528h0;
    public final w5 f31529i0;
    public final w5 f31530j0;
    public final w5 f31531k0;
    public boolean f31532l0;
    public boolean m0;
    public int f31533n;
    public boolean f31534n0;
    public int f31535r;
    public int f31536s;
    public int f31537w;
    public int f31538x;
    public int f31539y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f31535r = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.k6.I8;
        this.M = org.telegram.ui.ActionBar.k6.J8;
        xq xqVar = xq.h;
        this.N = xqVar;
        this.O = new SparseIntArray(5);
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.f31519b0 = 200L;
        this.f31522d0 = new dt(this, 13);
        this.f31526f0 = new Path();
        this.f31527g0 = new RectF();
        this.f31528h0 = new RectF();
        this.f31529i0 = new w5(this, 420L, xqVar);
        this.f31530j0 = new w5(this, 420L, xqVar);
        this.f31531k0 = new w5(this, 420L, xqVar);
        this.m0 = true;
        this.f31520c = f6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        float N = org.telegram.messenger.g0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.c61 c61Var = new org.telegram.ui.c61(14, context, this);
        this.f31516a = c61Var;
        c61Var.setOrientation(0);
        c61Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        c61Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(c61Var);
        updateColors();
    }

    public final void a(int i7, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence m10;
        int i10 = this.h;
        this.h = i10 + 1;
        if (i10 == 0 && this.f31535r == -1) {
            this.f31535r = i7;
        }
        this.O.put(i10, i7);
        this.P.put(i7, i10);
        int i11 = this.f31535r;
        if (i11 != -1 && i11 == i7) {
            this.f31533n = i10;
            this.f31539y = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i7);
            sparseArray.delete(i7);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new tk0(this, getContext(), i7);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            textView.setOnClickListener(new ai.v(this, i7, 17));
            textView.setOnLongClickListener(new lh.g(this, i7, 1));
            org.telegram.messenger.qs.i(textView);
        }
        textView.setText(org.telegram.messenger.i6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
        int L = org.telegram.messenger.g0.L(32.0f) + ((int) Math.ceil(fi.m3.h(m10, textView.getPaint())));
        this.f31516a.addView(textView, c8.ha.o(0, -1));
        this.f31536s += L;
        this.R.put(i10, L);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.L));
    }

    public final void b() {
        float e10 = this.f31529i0.e(false, 1.0f);
        RectF rectF = this.f31528h0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        int i7 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        RectF rectF2 = this.f31527g0;
        if (i7 >= 0) {
            rectF2.set(rectF);
        } else {
            org.telegram.messenger.g0.Z1(rectF2, rectF, e10, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f31526f0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        fh.g gVar = this.f31524e0;
        if (gVar != null) {
            gVar.setAlpha(255);
            this.f31524e0.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f31524e0.r(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.c61 c61Var = this.f31516a;
        int childCount = c61Var.getChildCount();
        int i12 = 0;
        while (true) {
            sparseIntArray = this.Q;
            sparseIntArray2 = this.R;
            if (i12 >= childCount) {
                break;
            }
            TextView textView = (TextView) c61Var.getChildAt(i12);
            if (this.f31533n == i12) {
                i7 = this.L;
            } else {
                i7 = this.M;
            }
            textView.setTag(Integer.valueOf(i7));
            if (this.f31533n == i12) {
                i10 = this.L;
            } else {
                i10 = this.M;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i10, this.f31520c)));
            if (this.f31523e) {
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
        if (this.P.get(i7, -1) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f31524e0 != null) {
            if (this.f31529i0.e(false, 1.0f) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f31524e0.V = this.f31531k0.d(this.m0);
            this.f31524e0.draw(canvas);
            canvas.clipPath(this.f31526f0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f31530j0.e(false, 0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.c61 c61Var = this.f31516a;
        if (view == c61Var) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            int measuredHeight = getMeasuredHeight();
            float f10 = this.f31537w + this.W;
            float f11 = this.f31538x + f10 + this.f31517a0;
            View childAt = c61Var.getChildAt(this.f31533n);
            if (this.f31534n0 && childAt != null) {
                f10 += childAt.getTranslationX();
                f11 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.K;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (c61Var.getAlpha() * alpha));
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
            org.telegram.ui.c61 c61Var = this.f31516a;
            int childCount = c61Var.getChildCount();
            SparseIntArray sparseIntArray = this.O;
            if (i7 < childCount) {
                sparseArray.put(sparseIntArray.get(i7), c61Var.getChildAt(i7));
                i7++;
            } else {
                sparseIntArray.clear();
                this.P.clear();
                this.Q.clear();
                this.R.clear();
                c61Var.removeAllViews();
                this.f31536s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public final void g(View view, int i7, int i10) {
        boolean z9;
        uk0 uk0Var;
        if (i10 >= 0) {
            if (view != null || !this.H) {
                int i11 = this.f31533n;
                if (i10 == i11 && (uk0Var = this.f31518b) != null) {
                    uk0Var.c();
                    return;
                }
                if (i11 < i10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.J = -1;
                this.T = i11;
                this.f31533n = i10;
                this.f31535r = i7;
                boolean z10 = this.H;
                dt dtVar = this.f31522d0;
                if (z10) {
                    org.telegram.messenger.g0.r(dtVar);
                    this.H = false;
                }
                this.S = 0.0f;
                this.H = true;
                this.D = this.f31537w;
                this.E = this.f31538x;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.G = textView.getMeasuredWidth();
                    this.F = jg.g.D(textView.getMeasuredWidth(), this.G, 2, textView.getLeft());
                }
                setEnabled(false);
                org.telegram.messenger.g0.i3(dtVar, 16L);
                uk0 uk0Var2 = this.f31518b;
                if (uk0Var2 != null) {
                    uk0Var2.b(i7, z9);
                }
                h(i10, true);
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.I;
    }

    public int getCurrentPosition() {
        return this.f31533n;
    }

    public int getCurrentTabId() {
        return this.f31535r;
    }

    public int getFirstTabId() {
        return this.O.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < this.f31516a.getChildCount(); i7++) {
            arrayList.add(Integer.valueOf(this.O.get(i7)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f31516a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(int i7, boolean z9) {
        if (this.h != 0 && this.J != i7) {
            this.J = i7;
            TextView textView = (TextView) this.f31516a.getChildAt(i7);
            if (textView != null) {
                int scrollX = getScrollX();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                if (left - org.telegram.messenger.g0.L(50.0f) < scrollX) {
                    if (z9) {
                        smoothScrollTo(left - org.telegram.messenger.g0.L(50.0f), 0);
                        return;
                    } else {
                        scrollTo(left - org.telegram.messenger.g0.L(50.0f), 0);
                        return;
                    }
                }
                int i10 = left + measuredWidth;
                if (org.telegram.messenger.g0.L(21.0f) + i10 > getWidth() + scrollX) {
                    if (z9) {
                        smoothScrollTo(i10, 0);
                    } else {
                        scrollTo(i10, 0);
                    }
                }
            }
        }
    }

    public final void i(float f10, int i7) {
        int i10;
        int i11 = this.P.get(i7, -1);
        if (i11 >= 0 && (i10 = this.f31533n) != i11) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            org.telegram.ui.c61 c61Var = this.f31516a;
            TextView textView = (TextView) c61Var.getChildAt(i10);
            TextView textView2 = (TextView) c61Var.getChildAt(i11);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.E = textView.getMeasuredWidth();
                this.D = jg.g.D(textView.getMeasuredWidth(), this.E, 2, textView.getLeft());
                textView2.getLayout();
                this.G = textView2.getMeasuredWidth();
                this.F = jg.g.D(textView2.getMeasuredWidth(), this.G, 2, textView2.getLeft());
                j(textView2, textView, f10);
                if (f10 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.M));
                    textView2.setTag(Integer.valueOf(this.L));
                }
                h(c61Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.f31533n = i11;
                this.f31535r = i7;
            }
        }
    }

    public final void j(TextView textView, TextView textView2, float f10) {
        int i7 = this.L;
        org.telegram.ui.ActionBar.f6 f6Var = this.f31520c;
        int e10 = e(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        int e11 = e(org.telegram.ui.ActionBar.k6.w0(this.M, f6Var));
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
        int i10 = this.D;
        this.f31537w = (int) (((this.F - i10) * f10) + i10);
        int i11 = this.E;
        this.f31538x = (int) (((this.G - i11) * f10) + i11);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        int i14 = i11 - i7;
        if (this.f31539y != i14) {
            this.f31539y = i14;
            this.J = -1;
            if (this.H) {
                org.telegram.messenger.g0.r(this.f31522d0);
                this.H = false;
                setEnabled(true);
                uk0 uk0Var = this.f31518b;
                if (uk0Var != null) {
                    uk0Var.F0(1.0f);
                }
            }
            TextView textView = (TextView) this.f31516a.getChildAt(this.f31533n);
            if (textView != null) {
                textView.getLayout();
                this.f31538x = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i15 = this.f31538x;
                int D = jg.g.D(measuredWidth, i15, 2, left);
                this.f31537w = D;
                int i16 = this.U;
                if (i16 > 0 && (i13 = this.V) > 0) {
                    if (i16 != D || i13 != i15) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new fi.k4(this, i16 - D, i13 - i15, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(xq.f40310f);
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
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(22.0f);
        org.telegram.ui.c61 c61Var = this.f31516a;
        int childCount = c61Var.getChildCount();
        boolean z9 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = c61Var.getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i12 = layoutParams.width;
            boolean z10 = this.f31523e;
            SparseIntArray sparseIntArray = this.R;
            if (z10) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i11);
            } else {
                int i13 = this.f31536s;
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
        float weightSum = c61Var.getWeightSum();
        if (childCount != 1 && this.f31536s <= size) {
            c61Var.setWeightSum(1.0f);
        } else {
            c61Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - c61Var.getWeightSum()) > 0.1f) {
            c61Var.requestLayout();
        }
        super.onMeasure(i7, i10);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i7)) {
            z9 = true;
        }
        this.f31525f = z9;
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.I = f10;
        int i7 = this.f31533n;
        org.telegram.ui.c61 c61Var = this.f31516a;
        TextView textView = (TextView) c61Var.getChildAt(i7);
        TextView textView2 = (TextView) c61Var.getChildAt(this.T);
        if (textView2 != null && textView != null) {
            j(textView, textView2, f10);
            if (f10 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.M));
                textView.setTag(Integer.valueOf(this.L));
            }
            uk0 uk0Var = this.f31518b;
            if (uk0Var != null) {
                uk0Var.F0(f10);
            }
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f31524e0 = gVar;
        gVar.setCallback(this);
    }

    public void setDelegate(uk0 uk0Var) {
        this.f31518b = uk0Var;
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        org.telegram.ui.c61 c61Var = this.f31516a;
        int childCount = c61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            c61Var.getChildAt(i7).setEnabled(z9);
        }
    }

    public void setInitialTabId(int i7) {
        this.f31532l0 = true;
        this.f31535r = i7;
        int i10 = this.P.get(i7);
        if (((TextView) this.f31516a.getChildAt(i10)) != null) {
            this.f31533n = i10;
            this.f31539y = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z9) {
        float f10;
        float f11;
        if (z9 == this.m0) {
            return;
        }
        this.m0 = z9;
        float f12 = 6.0f;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        int paddingTop = getPaddingTop();
        if (this.m0) {
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
        }
        setPadding(L, paddingTop, org.telegram.messenger.g0.L(f11), getPaddingBottom());
        invalidate();
        if (!this.f31525f) {
            this.f31527g0.set(this.f31528h0);
            this.f31529i0.e(true, 0.0f);
            if (!this.m0) {
                f12 = -6.0f;
            }
            this.f31530j0.e(true, org.telegram.messenger.g0.L(f12));
        }
        b();
    }

    public void setReordering(boolean z9) {
        if (this.f31534n0 == z9) {
            return;
        }
        this.f31534n0 = z9;
        org.telegram.messenger.g0.c0(this.f31516a, new pg.c(0));
    }

    public void setUseMinimalWidth(boolean z9) {
        int i7;
        this.f31523e = z9;
        if (this.f31523e) {
            i7 = -2;
        } else {
            i7 = -1;
        }
        this.f31516a.setLayoutParams(new FrameLayout.LayoutParams(i7, -1));
    }

    public void setUseSameWidth(boolean z9) {
        this.d = z9;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i7;
        org.telegram.ui.c61 c61Var = this.f31516a;
        int childCount = c61Var.getChildCount();
        int i10 = 0;
        while (true) {
            f6Var = this.f31520c;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) c61Var.getChildAt(i10);
            if (this.f31533n == i10) {
                i7 = this.L;
            } else {
                i7 = this.M;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.k6.w0(i7, f6Var)));
            textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.r1(0.15f, e(org.telegram.ui.ActionBar.k6.w0(this.L, f6Var))), 7, org.telegram.messenger.g0.L(14.0f)), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
            i10++;
        }
        this.K.setColor(org.telegram.ui.ActionBar.k6.r1(0.15f, e(org.telegram.ui.ActionBar.k6.w0(this.L, f6Var))));
        fh.g gVar = this.f31524e0;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31524e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int e(int i7) {
        return i7;
    }
}
