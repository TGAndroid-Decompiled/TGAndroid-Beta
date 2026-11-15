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
    public static final int f32699p0 = 0;
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
    public final er O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final org.telegram.ui.z51 f32700a;
    public float f32701a0;
    public zk0 f32702b;
    public float f32703b0;
    public final org.telegram.ui.ActionBar.e6 f32704c;
    public long f32705c0;
    public boolean d;
    public View f32706d0;
    public boolean f32707e;
    public final zj f32708e0;
    public boolean f32709f;
    public fh.g f32710f0;
    public final Path f32711g0;
    public int h;
    public final RectF f32712h0;
    public final RectF f32713i0;
    public final u5 f32714j0;
    public final u5 f32715k0;
    public final u5 f32716l0;
    public boolean m0;
    public int f32717n;
    public boolean f32718n0;
    public boolean f32719o0;
    public int f32720r;
    public int f32721s;
    public int f32722w;
    public int f32723x;
    public int f32724y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32720r = -1;
        this.K = -1;
        this.M = org.telegram.ui.ActionBar.j6.I8;
        this.N = org.telegram.ui.ActionBar.j6.J8;
        er erVar = er.h;
        this.O = erVar;
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.S = new SparseIntArray(5);
        this.f32705c0 = 200L;
        this.f32708e0 = new zj(this, 16);
        this.f32711g0 = new Path();
        this.f32712h0 = new RectF();
        this.f32713i0 = new RectF();
        this.f32714j0 = new u5(this, 420L, erVar);
        this.f32715k0 = new u5(this, 420L, erVar);
        this.f32716l0 = new u5(this, 420L, erVar);
        this.f32718n0 = true;
        this.f32704c = e6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.L = gradientDrawable;
        float N = org.telegram.messenger.g0.N(14.0f);
        gradientDrawable.setCornerRadii(new float[]{N, N, N, N, N, N, N, N});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(16, context, this);
        this.f32700a = z51Var;
        z51Var.setOrientation(0);
        z51Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
        z51Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(z51Var);
        updateColors();
    }

    public final void a(int i7, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence m10;
        int i10 = this.h;
        this.h = i10 + 1;
        if (i10 == 0 && this.f32720r == -1) {
            this.f32720r = i7;
        }
        this.P.put(i10, i7);
        this.Q.put(i7, i10);
        int i11 = this.f32720r;
        if (i11 != -1 && i11 == i7) {
            this.f32717n = i10;
            this.f32724y = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i7);
            sparseArray.delete(i7);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new yk0(this, getContext(), i7);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
            textView.setOnClickListener(new ci.q(this, i7, 17));
            textView.setOnLongClickListener(new lh.g(this, i7, 1));
            org.telegram.messenger.ns.i(textView);
        }
        textView.setText(org.telegram.messenger.j6.m(charSequence, textView.getPaint().getFontMetricsInt(), false, null, 0));
        int L = org.telegram.messenger.g0.L(32.0f) + ((int) Math.ceil(hi.l3.h(m10, textView.getPaint())));
        this.f32700a.addView(textView, c8.ja.o(0, -1));
        this.f32721s += L;
        this.S.put(i10, L);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.M));
    }

    public final void b() {
        float e10 = this.f32714j0.e(false, 1.0f);
        RectF rectF = this.f32713i0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        int i7 = (e10 > 1.0f ? 1 : (e10 == 1.0f ? 0 : -1));
        RectF rectF2 = this.f32712h0;
        if (i7 >= 0) {
            rectF2.set(rectF);
        } else {
            org.telegram.messenger.g0.Z1(rectF2, rectF, e10, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f32711g0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        fh.g gVar = this.f32710f0;
        if (gVar != null) {
            gVar.setAlpha(255);
            this.f32710f0.setBounds(((int) rectF.left) - org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f32710f0.r(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i7;
        int i10;
        int i11;
        org.telegram.ui.z51 z51Var = this.f32700a;
        int childCount = z51Var.getChildCount();
        int i12 = 0;
        while (true) {
            sparseIntArray = this.R;
            sparseIntArray2 = this.S;
            if (i12 >= childCount) {
                break;
            }
            TextView textView = (TextView) z51Var.getChildAt(i12);
            if (this.f32717n == i12) {
                i7 = this.M;
            } else {
                i7 = this.N;
            }
            textView.setTag(Integer.valueOf(i7));
            if (this.f32717n == i12) {
                i10 = this.M;
            } else {
                i10 = this.N;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.j6.w0(i10, this.f32704c)));
            if (this.f32707e) {
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
        if (this.f32710f0 != null) {
            if (this.f32714j0.e(false, 1.0f) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f32710f0.W = this.f32716l0.d(this.f32718n0);
            this.f32710f0.draw(canvas);
            canvas.clipPath(this.f32711g0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f32715k0.e(false, 0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.z51 z51Var = this.f32700a;
        if (view == z51Var) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            int measuredHeight = getMeasuredHeight();
            float f10 = this.f32722w + this.f32701a0;
            float f11 = this.f32723x + f10 + this.f32703b0;
            View childAt = z51Var.getChildAt(this.f32717n);
            if (this.f32719o0 && childAt != null) {
                f10 += childAt.getTranslationX();
                f11 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.L;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (z51Var.getAlpha() * alpha));
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
            org.telegram.ui.z51 z51Var = this.f32700a;
            int childCount = z51Var.getChildCount();
            SparseIntArray sparseIntArray = this.P;
            if (i7 < childCount) {
                sparseArray.put(sparseIntArray.get(i7), z51Var.getChildAt(i7));
                i7++;
            } else {
                sparseIntArray.clear();
                this.Q.clear();
                this.R.clear();
                this.S.clear();
                z51Var.removeAllViews();
                this.f32721s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public final void g(View view, int i7, int i10) {
        boolean z10;
        zk0 zk0Var;
        if (i10 >= 0) {
            if (view != null || !this.I) {
                int i11 = this.f32717n;
                if (i10 == i11 && (zk0Var = this.f32702b) != null) {
                    zk0Var.D();
                    return;
                }
                if (i11 < i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.K = -1;
                this.U = i11;
                this.f32717n = i10;
                this.f32720r = i7;
                boolean z11 = this.I;
                zj zjVar = this.f32708e0;
                if (z11) {
                    org.telegram.messenger.g0.r(zjVar);
                    this.I = false;
                }
                this.T = 0.0f;
                this.I = true;
                this.E = this.f32722w;
                this.F = this.f32723x;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.H = textView.getMeasuredWidth();
                    this.G = i5.c.e(textView.getMeasuredWidth(), this.H, 2, textView.getLeft());
                }
                setEnabled(false);
                org.telegram.messenger.g0.i3(zjVar, 16L);
                zk0 zk0Var2 = this.f32702b;
                if (zk0Var2 != null) {
                    zk0Var2.b(i7, z10);
                }
                h(i10, true);
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.J;
    }

    public int getCurrentPosition() {
        return this.f32717n;
    }

    public int getCurrentTabId() {
        return this.f32720r;
    }

    public int getFirstTabId() {
        return this.P.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.L;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < this.f32700a.getChildCount(); i7++) {
            arrayList.add(Integer.valueOf(this.P.get(i7)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f32700a;
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
            org.telegram.ui.z51 z51Var = this.f32700a;
            TextView textView = (TextView) z51Var.getChildAt(i7);
            if (textView != null) {
                int scrollX = getScrollX();
                View childAt = z51Var.getChildAt(i7 - 1);
                View childAt2 = z51Var.getChildAt(i7 + 1);
                int left2 = z51Var.getLeft();
                if (childAt != null) {
                    left = childAt.getLeft();
                } else {
                    left = textView.getLeft();
                }
                int i11 = left2 + left;
                int left3 = z51Var.getLeft();
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
        if (i11 >= 0 && (i10 = this.f32717n) != i11) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            org.telegram.ui.z51 z51Var = this.f32700a;
            TextView textView = (TextView) z51Var.getChildAt(i10);
            TextView textView2 = (TextView) z51Var.getChildAt(i11);
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
                h(z51Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.f32717n = i11;
                this.f32720r = i7;
            }
        }
    }

    public final void j(TextView textView, TextView textView2, float f10) {
        int i7 = this.M;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32704c;
        int e10 = e(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        int e11 = e(org.telegram.ui.ActionBar.j6.w0(this.N, e6Var));
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
        this.f32722w = (int) (((this.G - i10) * f10) + i10);
        int i11 = this.F;
        this.f32723x = (int) (((this.H - i11) * f10) + i11);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        int i14 = i11 - i7;
        if (this.f32724y != i14) {
            this.f32724y = i14;
            this.K = -1;
            if (this.I) {
                org.telegram.messenger.g0.r(this.f32708e0);
                this.I = false;
                setEnabled(true);
                zk0 zk0Var = this.f32702b;
                if (zk0Var != null) {
                    zk0Var.D0(1.0f);
                }
            }
            TextView textView = (TextView) this.f32700a.getChildAt(this.f32717n);
            if (textView != null) {
                textView.getLayout();
                this.f32723x = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i15 = this.f32723x;
                int e10 = i5.c.e(measuredWidth, i15, 2, left);
                this.f32722w = e10;
                int i16 = this.V;
                if (i16 > 0 && (i13 = this.W) > 0) {
                    if (i16 != e10 || i13 != i15) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new hi.g4(this, i16 - e10, i13 - i15, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(er.f34420f);
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
        org.telegram.ui.z51 z51Var = this.f32700a;
        int childCount = z51Var.getChildCount();
        boolean z10 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = z51Var.getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i12 = layoutParams.width;
            boolean z11 = this.f32707e;
            SparseIntArray sparseIntArray = this.S;
            if (z11) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i11);
            } else {
                int i13 = this.f32721s;
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
        float weightSum = z51Var.getWeightSum();
        if (childCount != 1 && this.f32721s <= size) {
            z51Var.setWeightSum(1.0f);
        } else {
            z51Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - z51Var.getWeightSum()) > 0.1f) {
            z51Var.requestLayout();
        }
        super.onMeasure(i7, i10);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i7)) {
            z10 = true;
        }
        this.f32709f = z10;
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.J = f10;
        int i7 = this.f32717n;
        org.telegram.ui.z51 z51Var = this.f32700a;
        TextView textView = (TextView) z51Var.getChildAt(i7);
        TextView textView2 = (TextView) z51Var.getChildAt(this.U);
        if (textView2 != null && textView != null) {
            j(textView, textView2, f10);
            if (f10 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.N));
                textView.setTag(Integer.valueOf(this.M));
            }
            zk0 zk0Var = this.f32702b;
            if (zk0Var != null) {
                zk0Var.D0(f10);
            }
        }
    }

    public void setBlurredBackground(fh.g gVar) {
        this.f32710f0 = gVar;
        gVar.setCallback(this);
    }

    public void setDelegate(zk0 zk0Var) {
        this.f32702b = zk0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        org.telegram.ui.z51 z51Var = this.f32700a;
        int childCount = z51Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            z51Var.getChildAt(i7).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i7) {
        this.m0 = true;
        this.f32720r = i7;
        int i10 = this.Q.get(i7);
        if (((TextView) this.f32700a.getChildAt(i10)) != null) {
            this.f32717n = i10;
            this.f32724y = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        float f10;
        float f11;
        if (z10 == this.f32718n0) {
            return;
        }
        this.f32718n0 = z10;
        float f12 = 6.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        int paddingTop = getPaddingTop();
        if (this.f32718n0) {
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
        }
        setPadding(L, paddingTop, org.telegram.messenger.g0.L(f11), getPaddingBottom());
        invalidate();
        if (!this.f32709f) {
            this.f32712h0.set(this.f32713i0);
            this.f32714j0.e(true, 0.0f);
            if (!this.f32718n0) {
                f12 = -6.0f;
            }
            this.f32715k0.e(true, org.telegram.messenger.g0.L(f12));
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f32719o0 == z10) {
            return;
        }
        this.f32719o0 = z10;
        org.telegram.messenger.g0.c0(this.f32700a, new pg.c(0));
    }

    public void setUseMinimalWidth(boolean z10) {
        int i7;
        this.f32707e = z10;
        if (this.f32707e) {
            i7 = -2;
        } else {
            i7 = -1;
        }
        this.f32700a.setLayoutParams(new FrameLayout.LayoutParams(i7, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var;
        int i7;
        org.telegram.ui.z51 z51Var = this.f32700a;
        int childCount = z51Var.getChildCount();
        int i10 = 0;
        while (true) {
            e6Var = this.f32704c;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) z51Var.getChildAt(i10);
            if (this.f32717n == i10) {
                i7 = this.M;
            } else {
                i7 = this.N;
            }
            textView.setTextColor(e(org.telegram.ui.ActionBar.j6.w0(i7, e6Var)));
            textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.r1(0.15f, e(org.telegram.ui.ActionBar.j6.w0(this.M, e6Var))), 7, org.telegram.messenger.g0.L(14.0f)), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
            i10++;
        }
        this.L.setColor(org.telegram.ui.ActionBar.j6.r1(0.15f, e(org.telegram.ui.ActionBar.j6.w0(this.M, e6Var))));
        fh.g gVar = this.f32710f0;
        if (gVar != null) {
            gVar.updateColors();
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32710f0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int e(int i7) {
        return i7;
    }
}
