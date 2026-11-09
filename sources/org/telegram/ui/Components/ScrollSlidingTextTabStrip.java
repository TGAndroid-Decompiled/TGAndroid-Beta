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
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.b6 {
    public static final int f31525o0 = 0;
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
    public final org.telegram.ui.d61 f31526a;
    public float f31527a0;
    public vk0 f31528b;
    public long f31529b0;
    public final org.telegram.ui.ActionBar.g6 f31530c;
    public View f31531c0;
    public boolean d;
    public final et f31532d0;
    public boolean f31533e;
    public fh.g f31534e0;
    public boolean f31535f;
    public final Path f31536f0;
    public final RectF f31537g0;
    public int h;
    public final RectF f31538h0;
    public final w5 f31539i0;
    public final w5 f31540j0;
    public final w5 f31541k0;
    public boolean f31542l0;
    public boolean m0;
    public int f31543n;
    public boolean f31544n0;
    public int f31545r;
    public int f31546s;
    public int f31547w;
    public int f31548x;
    public int f31549y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f31545r = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.l6.I8;
        this.M = org.telegram.ui.ActionBar.l6.J8;
        xq xqVar = xq.h;
        this.N = xqVar;
        this.O = new SparseIntArray(5);
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.f31529b0 = 200L;
        this.f31532d0 = new et(this, 13);
        this.f31536f0 = new Path();
        this.f31537g0 = new RectF();
        this.f31538h0 = new RectF();
        this.f31539i0 = new w5(this, 420L, xqVar);
        this.f31540j0 = new w5(this, 420L, xqVar);
        this.f31541k0 = new w5(this, 420L, xqVar);
        this.m0 = true;
        this.f31530c = g6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        float N = org.telegram.messenger.g0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(14, context, this);
        this.f31526a = d61Var;
        d61Var.setOrientation(0);
        d61Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        d61Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(d61Var);
        updateColors();
    }

    public final void a(int i7, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence m10;
        int i10 = this.h;
        this.h = i10 + 1;
        if (i10 == 0 && this.f31545r == -1) {
            this.f31545r = i7;
        }
        this.O.put(i10, i7);
        this.P.put(i7, i10);
        int i11 = this.f31545r;
        if (i11 != -1 && i11 == i7) {
            this.f31543n = i10;
            this.f31549y = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i7);
            sparseArray.delete(i7);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new uk0(this, getContext(), i7);
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
        this.f31526a.addView(textView, c8.ha.o(0, -1));
        this.f31546s += L;
        this.R.put(i10, L);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.L));
    }

    public final void b() {
        float e10 = this.f31539i0.e(false, 1.0f);
        RectF rectF = this.f31538h0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        int i7 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        RectF rectF2 = this.f31537g0;
        if (i7 >= 0) {
            rectF2.set(rectF);
        } else {
            org.telegram.messenger.g0.Z1(rectF2, rectF, e10, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f31536f0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        fh.g gVar = this.f31534e0;
        if (gVar != null) {
            gVar.setAlpha(255);
            this.f31534e0.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f31534e0.r(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.d61 d61Var = this.f31526a;
        int childCount = d61Var.getChildCount();
        int i12 = 0;
        while (true) {
            sparseIntArray = this.Q;
            sparseIntArray2 = this.R;
            if (i12 >= childCount) {
                break;
            }
            TextView textView = (TextView) d61Var.getChildAt(i12);
            if (this.f31543n == i12) {
                i7 = this.L;
            } else {
                i7 = this.M;
            }
            textView.setTag(Integer.valueOf(i7));
            if (this.f31543n == i12) {
                i10 = this.L;
            } else {
                i10 = this.M;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.l6.w0(i10, this.f31530c)));
            if (this.f31533e) {
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
        if (this.f31534e0 != null) {
            if (this.f31539i0.e(false, 1.0f) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f31534e0.V = this.f31541k0.d(this.m0);
            this.f31534e0.draw(canvas);
            canvas.clipPath(this.f31536f0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f31540j0.e(false, 0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.d61 d61Var = this.f31526a;
        if (view == d61Var) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            int measuredHeight = getMeasuredHeight();
            float f10 = this.f31547w + this.W;
            float f11 = this.f31548x + f10 + this.f31527a0;
            View childAt = d61Var.getChildAt(this.f31543n);
            if (this.f31544n0 && childAt != null) {
                f10 += childAt.getTranslationX();
                f11 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.K;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (d61Var.getAlpha() * alpha));
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
            org.telegram.ui.d61 d61Var = this.f31526a;
            int childCount = d61Var.getChildCount();
            SparseIntArray sparseIntArray = this.O;
            if (i7 < childCount) {
                sparseArray.put(sparseIntArray.get(i7), d61Var.getChildAt(i7));
                i7++;
            } else {
                sparseIntArray.clear();
                this.P.clear();
                this.Q.clear();
                this.R.clear();
                d61Var.removeAllViews();
                this.f31546s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public final void g(View view, int i7, int i10) {
        boolean z9;
        vk0 vk0Var;
        if (i10 >= 0) {
            if (view != null || !this.H) {
                int i11 = this.f31543n;
                if (i10 == i11 && (vk0Var = this.f31528b) != null) {
                    vk0Var.c();
                    return;
                }
                if (i11 < i10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.J = -1;
                this.T = i11;
                this.f31543n = i10;
                this.f31545r = i7;
                boolean z10 = this.H;
                et etVar = this.f31532d0;
                if (z10) {
                    org.telegram.messenger.g0.r(etVar);
                    this.H = false;
                }
                this.S = 0.0f;
                this.H = true;
                this.D = this.f31547w;
                this.E = this.f31548x;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.G = textView.getMeasuredWidth();
                    this.F = jg.g.D(textView.getMeasuredWidth(), this.G, 2, textView.getLeft());
                }
                setEnabled(false);
                org.telegram.messenger.g0.i3(etVar, 16L);
                vk0 vk0Var2 = this.f31528b;
                if (vk0Var2 != null) {
                    vk0Var2.b(i7, z9);
                }
                h(i10, true);
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.I;
    }

    public int getCurrentPosition() {
        return this.f31543n;
    }

    public int getCurrentTabId() {
        return this.f31545r;
    }

    public int getFirstTabId() {
        return this.O.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < this.f31526a.getChildCount(); i7++) {
            arrayList.add(Integer.valueOf(this.O.get(i7)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f31526a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(int i7, boolean z9) {
        int left;
        int right;
        int i10;
        if (this.h != 0 && this.J != i7) {
            this.J = i7;
            org.telegram.ui.d61 d61Var = this.f31526a;
            TextView textView = (TextView) d61Var.getChildAt(i7);
            if (textView != null) {
                int scrollX = getScrollX();
                View childAt = d61Var.getChildAt(i7 - 1);
                View childAt2 = d61Var.getChildAt(i7 + 1);
                int left2 = d61Var.getLeft();
                if (childAt != null) {
                    left = childAt.getLeft();
                } else {
                    left = textView.getLeft();
                }
                int i11 = left2 + left;
                int left3 = d61Var.getLeft();
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
                if (z9) {
                    smoothScrollTo(i10, 0);
                } else {
                    scrollTo(i10, 0);
                }
            }
        }
    }

    public final void i(float f10, int i7) {
        int i10;
        int i11 = this.P.get(i7, -1);
        if (i11 >= 0 && (i10 = this.f31543n) != i11) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            org.telegram.ui.d61 d61Var = this.f31526a;
            TextView textView = (TextView) d61Var.getChildAt(i10);
            TextView textView2 = (TextView) d61Var.getChildAt(i11);
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
                h(d61Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.f31543n = i11;
                this.f31545r = i7;
            }
        }
    }

    public final void j(TextView textView, TextView textView2, float f10) {
        int i7 = this.L;
        org.telegram.ui.ActionBar.g6 g6Var = this.f31530c;
        int e10 = e(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        int e11 = e(org.telegram.ui.ActionBar.l6.w0(this.M, g6Var));
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
        this.f31547w = (int) (((this.F - i10) * f10) + i10);
        int i11 = this.E;
        this.f31548x = (int) (((this.G - i11) * f10) + i11);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        int i14 = i11 - i7;
        if (this.f31549y != i14) {
            this.f31549y = i14;
            this.J = -1;
            if (this.H) {
                org.telegram.messenger.g0.r(this.f31532d0);
                this.H = false;
                setEnabled(true);
                vk0 vk0Var = this.f31528b;
                if (vk0Var != null) {
                    vk0Var.F0(1.0f);
                }
            }
            TextView textView = (TextView) this.f31526a.getChildAt(this.f31543n);
            if (textView != null) {
                textView.getLayout();
                this.f31548x = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i15 = this.f31548x;
                int D = jg.g.D(measuredWidth, i15, 2, left);
                this.f31547w = D;
                int i16 = this.U;
                if (i16 > 0 && (i13 = this.V) > 0) {
                    if (i16 != D || i13 != i15) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new fi.k4(this, i16 - D, i13 - i15, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(xq.f40458f);
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
        org.telegram.ui.d61 d61Var = this.f31526a;
        int childCount = d61Var.getChildCount();
        boolean z9 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = d61Var.getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i12 = layoutParams.width;
            boolean z10 = this.f31533e;
            SparseIntArray sparseIntArray = this.R;
            if (z10) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i11);
            } else {
                int i13 = this.f31546s;
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
        float weightSum = d61Var.getWeightSum();
        if (childCount != 1 && this.f31546s <= size) {
            d61Var.setWeightSum(1.0f);
        } else {
            d61Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - d61Var.getWeightSum()) > 0.1f) {
            d61Var.requestLayout();
        }
        super.onMeasure(i7, i10);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i7)) {
            z9 = true;
        }
        this.f31535f = z9;
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.I = f10;
        int i7 = this.f31543n;
        org.telegram.ui.d61 d61Var = this.f31526a;
        TextView textView = (TextView) d61Var.getChildAt(i7);
        TextView textView2 = (TextView) d61Var.getChildAt(this.T);
        if (textView2 != null && textView != null) {
            j(textView, textView2, f10);
            if (f10 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.M));
                textView.setTag(Integer.valueOf(this.L));
            }
            vk0 vk0Var = this.f31528b;
            if (vk0Var != null) {
                vk0Var.F0(f10);
            }
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f31534e0 = gVar;
        gVar.setCallback(this);
    }

    public void setDelegate(vk0 vk0Var) {
        this.f31528b = vk0Var;
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        org.telegram.ui.d61 d61Var = this.f31526a;
        int childCount = d61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            d61Var.getChildAt(i7).setEnabled(z9);
        }
    }

    public void setInitialTabId(int i7) {
        this.f31542l0 = true;
        this.f31545r = i7;
        int i10 = this.P.get(i7);
        if (((TextView) this.f31526a.getChildAt(i10)) != null) {
            this.f31543n = i10;
            this.f31549y = 0;
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
        if (!this.f31535f) {
            this.f31537g0.set(this.f31538h0);
            this.f31539i0.e(true, 0.0f);
            if (!this.m0) {
                f12 = -6.0f;
            }
            this.f31540j0.e(true, org.telegram.messenger.g0.L(f12));
        }
        b();
    }

    public void setReordering(boolean z9) {
        if (this.f31544n0 == z9) {
            return;
        }
        this.f31544n0 = z9;
        org.telegram.messenger.g0.c0(this.f31526a, new pg.c(0));
    }

    public void setUseMinimalWidth(boolean z9) {
        int i7;
        this.f31533e = z9;
        if (this.f31533e) {
            i7 = -2;
        } else {
            i7 = -1;
        }
        this.f31526a.setLayoutParams(new FrameLayout.LayoutParams(i7, -1));
    }

    public void setUseSameWidth(boolean z9) {
        this.d = z9;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var;
        int i7;
        org.telegram.ui.d61 d61Var = this.f31526a;
        int childCount = d61Var.getChildCount();
        int i10 = 0;
        while (true) {
            g6Var = this.f31530c;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) d61Var.getChildAt(i10);
            if (this.f31543n == i10) {
                i7 = this.L;
            } else {
                i7 = this.M;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.l6.w0(i7, g6Var)));
            textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.r1(0.15f, e(org.telegram.ui.ActionBar.l6.w0(this.L, g6Var))), 7, org.telegram.messenger.g0.L(14.0f)), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
            i10++;
        }
        this.K.setColor(org.telegram.ui.ActionBar.l6.r1(0.15f, e(org.telegram.ui.ActionBar.l6.w0(this.L, g6Var))));
        fh.g gVar = this.f31534e0;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f31534e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int e(int i7) {
        return i7;
    }
}
