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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ib1;
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.b6 {
    public static final int f25009l0 = 0;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public float F;
    public int G;
    public final GradientDrawable H;
    public int I;
    public int J;
    public final pr K;
    public final SparseIntArray L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public final SparseIntArray O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public long V;
    public View W;
    public final ib1 f25010a;
    public final ul0 f25011a0;
    public um0 f25012b;
    public qg.b f25013b0;
    public final org.telegram.ui.ActionBar.g6 f25014c;
    public final Path f25015c0;
    public boolean d;
    public final RectF f25016d0;
    public boolean f25017e;
    public final RectF f25018e0;
    public boolean f25019f;
    public final z5 f25020f0;
    public final z5 f25021g0;
    public int h;
    public final z5 f25022h0;
    public boolean f25023i0;
    public boolean f25024j0;
    public boolean f25025k0;
    public int f25026n;
    public int f25027r;
    public int f25028s;
    public int v;
    public int f25029w;
    public int f25030x;
    public int f25031y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f25027r = -1;
        this.G = -1;
        this.I = org.telegram.ui.ActionBar.k6.I8;
        this.J = org.telegram.ui.ActionBar.k6.J8;
        pr prVar = pr.h;
        this.K = prVar;
        this.L = new SparseIntArray(5);
        this.M = new SparseIntArray(5);
        this.N = new SparseIntArray(5);
        this.O = new SparseIntArray(5);
        this.V = 200L;
        this.f25011a0 = new ul0(this, 1);
        this.f25015c0 = new Path();
        this.f25016d0 = new RectF();
        this.f25018e0 = new RectF();
        this.f25020f0 = new z5(this, 420L, prVar);
        this.f25021g0 = new z5(this, 420L, prVar);
        this.f25022h0 = new z5(this, 420L, prVar);
        this.f25024j0 = true;
        this.f25014c = g6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.H = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ib1 ib1Var = new ib1(this, context, 10);
        this.f25010a = ib1Var;
        ib1Var.setOrientation(0);
        ib1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        ib1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ib1Var);
        e();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence replaceEmoji;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.f25027r == -1) {
            this.f25027r = i10;
        }
        this.L.put(i11, i10);
        this.M.put(i10, i11);
        int i12 = this.f25027r;
        if (i12 != -1 && i12 == i10) {
            this.f25026n = i11;
            this.f25030x = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new tm0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new mh.x0(this, i10, 10));
            textView.setOnLongClickListener(new rm0(this, i10, 0));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(qh.f3.g(replaceEmoji, textView.getPaint())));
        this.f25010a.addView(textView, k7.c6.n(0, -1));
        this.f25028s += dp;
        this.O.put(i11, dp);
        e();
    }

    public final void b() {
        float d = this.f25020f0.d(1.0f, false);
        RectF rectF = this.f25018e0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.f25016d0;
        if (d >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f25015c0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        qg.b bVar = this.f25013b0;
        if (bVar != null) {
            bVar.setAlpha(255);
            this.f25013b0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f25013b0.p(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i10;
        int i11;
        int i12;
        ib1 ib1Var = this.f25010a;
        int childCount = ib1Var.getChildCount();
        int i13 = 0;
        while (true) {
            sparseIntArray = this.N;
            sparseIntArray2 = this.O;
            if (i13 >= childCount) {
                break;
            }
            TextView textView = (TextView) ib1Var.getChildAt(i13);
            if (this.f25026n == i13) {
                i10 = this.I;
            } else {
                i10 = this.J;
            }
            textView.setTag(Integer.valueOf(i10));
            if (this.f25026n == i13) {
                i11 = this.I;
            } else {
                i11 = this.J;
            }
            textView.setTextColor(f(org.telegram.ui.ActionBar.k6.v0(i11, this.f25014c)));
            if (this.f25017e) {
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
        if (this.M.get(i10, -1) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f25013b0 != null) {
            if (this.f25020f0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f25013b0.f44860n = this.f25022h0.e(this.f25024j0);
            this.f25013b0.draw(canvas);
            canvas.clipPath(this.f25015c0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f25021g0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ib1 ib1Var = this.f25010a;
        if (view == ib1Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            int measuredHeight = getMeasuredHeight();
            float f10 = this.v + this.T;
            float f11 = this.f25029w + f10 + this.U;
            View childAt = ib1Var.getChildAt(this.f25026n);
            if (this.f25025k0 && childAt != null) {
                f10 += childAt.getTranslationX();
                f11 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.H;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (ib1Var.getAlpha() * alpha));
            gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) f10), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f11)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
            gradientDrawable.draw(canvas);
            gradientDrawable.setAlpha(alpha);
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        int i10;
        ib1 ib1Var = this.f25010a;
        int childCount = ib1Var.getChildCount();
        int i11 = 0;
        while (true) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f25014c;
            if (i11 < childCount) {
                TextView textView = (TextView) ib1Var.getChildAt(i11);
                if (this.f25026n == i11) {
                    i10 = this.I;
                } else {
                    i10 = this.J;
                }
                textView.setTextColor(f(org.telegram.ui.ActionBar.k6.v0(i10, g6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.15f, f(org.telegram.ui.ActionBar.k6.v0(this.I, g6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i11++;
            } else {
                this.H.setColor(org.telegram.ui.ActionBar.k6.l1(0.15f, f(org.telegram.ui.ActionBar.k6.v0(this.I, g6Var))));
                invalidate();
                return;
            }
        }
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            ib1 ib1Var = this.f25010a;
            int childCount = ib1Var.getChildCount();
            SparseIntArray sparseIntArray = this.L;
            if (i10 < childCount) {
                sparseArray.put(sparseIntArray.get(i10), ib1Var.getChildAt(i10));
                i10++;
            } else {
                sparseIntArray.clear();
                this.M.clear();
                this.N.clear();
                this.O.clear();
                ib1Var.removeAllViews();
                this.f25028s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.F;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCurrentPosition() {
        return this.f25026n;
    }

    public int getCurrentTabId() {
        return this.f25027r;
    }

    public int getFirstTabId() {
        return this.L.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.H;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.f25010a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.L.get(i10)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f25010a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(View view, int i10, int i11) {
        boolean z4;
        um0 um0Var;
        if (i11 >= 0) {
            if (view != null || !this.E) {
                int i12 = this.f25026n;
                if (i11 == i12 && (um0Var = this.f25012b) != null) {
                    um0Var.B();
                    return;
                }
                if (i12 < i11) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.G = -1;
                this.Q = i12;
                this.f25026n = i11;
                this.f25027r = i10;
                boolean z10 = this.E;
                ul0 ul0Var = this.f25011a0;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(ul0Var);
                    this.E = false;
                }
                this.P = 0.0f;
                this.E = true;
                this.f25031y = this.v;
                this.B = this.f25029w;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.D = textView.getMeasuredWidth();
                    this.C = l.d.d(textView.getMeasuredWidth(), this.D, 2, textView.getLeft());
                }
                setEnabled(false);
                AndroidUtilities.runOnUIThread(ul0Var, 16L);
                um0 um0Var2 = this.f25012b;
                if (um0Var2 != null) {
                    um0Var2.f(i10, z4);
                }
                i(i11, true);
            }
        }
    }

    public final void i(int i10, boolean z4) {
        if (this.h != 0 && this.G != i10) {
            this.G = i10;
            TextView textView = (TextView) this.f25010a.getChildAt(i10);
            if (textView != null) {
                int scrollX = getScrollX();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                if (left - AndroidUtilities.dp(50.0f) < scrollX) {
                    if (z4) {
                        smoothScrollTo(left - AndroidUtilities.dp(50.0f), 0);
                        return;
                    } else {
                        scrollTo(left - AndroidUtilities.dp(50.0f), 0);
                        return;
                    }
                }
                int i11 = left + measuredWidth;
                if (AndroidUtilities.dp(21.0f) + i11 > getWidth() + scrollX) {
                    if (z4) {
                        smoothScrollTo(i11, 0);
                    } else {
                        scrollTo(i11, 0);
                    }
                }
            }
        }
    }

    public final void j(float f10, int i10) {
        int i11;
        int i12 = this.M.get(i10, -1);
        if (i12 >= 0 && (i11 = this.f25026n) != i12) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            ib1 ib1Var = this.f25010a;
            TextView textView = (TextView) ib1Var.getChildAt(i11);
            TextView textView2 = (TextView) ib1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.B = textView.getMeasuredWidth();
                this.f25031y = l.d.d(textView.getMeasuredWidth(), this.B, 2, textView.getLeft());
                textView2.getLayout();
                this.D = textView2.getMeasuredWidth();
                this.C = l.d.d(textView2.getMeasuredWidth(), this.D, 2, textView2.getLeft());
                k(textView2, textView, f10);
                if (f10 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.J));
                    textView2.setTag(Integer.valueOf(this.I));
                }
                i(ib1Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.f25026n = i12;
                this.f25027r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f10) {
        int i10 = this.I;
        org.telegram.ui.ActionBar.g6 g6Var = this.f25014c;
        int f11 = f(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        int f12 = f(org.telegram.ui.ActionBar.k6.v0(this.J, g6Var));
        int red = Color.red(f11);
        int green = Color.green(f11);
        int blue = Color.blue(f11);
        int alpha = Color.alpha(f11);
        int red2 = Color.red(f12);
        int green2 = Color.green(f12);
        int blue2 = Color.blue(f12);
        int alpha2 = Color.alpha(f12);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f10) + alpha), (int) (((red2 - red) * f10) + red), (int) (((green2 - green) * f10) + green), (int) (((blue2 - blue) * f10) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f10) + alpha2), (int) (((red - red2) * f10) + red2), (int) (((green - green2) * f10) + green2), (int) (((blue - blue2) * f10) + blue2)));
        int i11 = this.f25031y;
        this.v = (int) (((this.C - i11) * f10) + i11);
        int i12 = this.B;
        this.f25029w = (int) (((this.D - i12) * f10) + i12);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.f25030x != i15) {
            this.f25030x = i15;
            this.G = -1;
            if (this.E) {
                AndroidUtilities.cancelRunOnUIThread(this.f25011a0);
                this.E = false;
                setEnabled(true);
                um0 um0Var = this.f25012b;
                if (um0Var != null) {
                    um0Var.w0(1.0f);
                }
            }
            TextView textView = (TextView) this.f25010a.getChildAt(this.f25026n);
            if (textView != null) {
                textView.getLayout();
                this.f25029w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.f25029w;
                int d = l.d.d(measuredWidth, i16, 2, left);
                this.v = d;
                int i17 = this.R;
                if (i17 > 0 && (i14 = this.S) > 0) {
                    if (i17 != d || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new eg.e0(this, i17 - d, i14 - i16, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(pr.f30183f);
                        ofFloat.start();
                    }
                    this.R = 0;
                    this.S = 0;
                }
            }
        }
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(22.0f);
        ib1 ib1Var = this.f25010a;
        int childCount = ib1Var.getChildCount();
        boolean z4 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = ib1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z10 = this.f25017e;
            SparseIntArray sparseIntArray = this.O;
            if (z10) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i12);
            } else {
                int i14 = this.f25028s;
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
                    layoutParams.weight = AndroidUtilities.lerp(1.0f / childCount, (1.0f / i14) * sparseIntArray.get(i12), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f10 - layoutParams.weight) > 0.001f || i13 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = ib1Var.getWeightSum();
        if (childCount != 1 && this.f25028s <= size) {
            ib1Var.setWeightSum(1.0f);
        } else {
            ib1Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - ib1Var.getWeightSum()) > 0.1f) {
            ib1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i10)) {
            z4 = true;
        }
        this.f25019f = z4;
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.F = f10;
        int i10 = this.f25026n;
        ib1 ib1Var = this.f25010a;
        TextView textView = (TextView) ib1Var.getChildAt(i10);
        TextView textView2 = (TextView) ib1Var.getChildAt(this.Q);
        if (textView2 != null && textView != null) {
            k(textView, textView2, f10);
            if (f10 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.J));
                textView.setTag(Integer.valueOf(this.I));
            }
            um0 um0Var = this.f25012b;
            if (um0Var != null) {
                um0Var.w0(f10);
            }
        }
    }

    public void setBlurredBackground(qg.b bVar) {
        this.f25013b0 = bVar;
        bVar.setCallback(this);
    }

    public void setDelegate(um0 um0Var) {
        this.f25012b = um0Var;
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        ib1 ib1Var = this.f25010a;
        int childCount = ib1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ib1Var.getChildAt(i10).setEnabled(z4);
        }
    }

    public void setInitialTabId(int i10) {
        this.f25023i0 = true;
        this.f25027r = i10;
        int i11 = this.M.get(i10);
        if (((TextView) this.f25010a.getChildAt(i11)) != null) {
            this.f25026n = i11;
            this.f25030x = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z4) {
        float f10;
        float f11;
        if (z4 == this.f25024j0) {
            return;
        }
        this.f25024j0 = z4;
        float f12 = 6.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        int paddingTop = getPaddingTop();
        if (this.f25024j0) {
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
        }
        setPadding(dp, paddingTop, AndroidUtilities.dp(f11), getPaddingBottom());
        invalidate();
        if (!this.f25019f) {
            this.f25016d0.set(this.f25018e0);
            this.f25020f0.d(0.0f, true);
            if (!this.f25024j0) {
                f12 = -6.0f;
            }
            this.f25021g0.d(AndroidUtilities.dp(f12), true);
        }
        b();
    }

    public void setReordering(boolean z4) {
        if (this.f25025k0 == z4) {
            return;
        }
        this.f25025k0 = z4;
        AndroidUtilities.forEachViews(this.f25010a, new ag.d(0));
    }

    public void setUseMinimalWidth(boolean z4) {
        int i10;
        this.f25017e = z4;
        if (this.f25017e) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.f25010a.setLayoutParams(new FrameLayout.LayoutParams(i10, -1));
    }

    public void setUseSameWidth(boolean z4) {
        this.d = z4;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f25013b0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int f(int i10) {
        return i10;
    }
}
