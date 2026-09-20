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
import org.telegram.ui.dc1;
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.z5 {
    public static final int f22386o0 = 0;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public float I;
    public int J;
    public final GradientDrawable K;
    public int L;
    public int M;
    public final qr N;
    public final SparseIntArray O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public float S;
    public int T;
    public int U;
    public int V;
    public float W;
    public final dc1 f22387a;
    public float f22388a0;
    public xm0 f22389b;
    public long f22390b0;
    public final org.telegram.ui.ActionBar.f6 f22391c;
    public View f22392c0;
    public boolean d;
    public final org.telegram.ui.Cells.u6 f22393d0;
    public boolean e;
    public ch.d f22394e0;
    public boolean f22395f;
    public final Path f22396f0;
    public final RectF f22397g0;
    public int h;
    public final RectF f22398h0;
    public final d6 f22399i0;
    public final d6 f22400j0;
    public final d6 f22401k0;
    public boolean f22402l0;
    public boolean m0;
    public int f22403n;
    public boolean f22404n0;
    public int f22405r;
    public int f22406s;
    public int v;
    public int f22407w;
    public int f22408x;
    public int f22409y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22405r = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.j6.I8;
        this.M = org.telegram.ui.ActionBar.j6.J8;
        qr qrVar = qr.h;
        this.N = qrVar;
        this.O = new SparseIntArray(5);
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.f22390b0 = 200L;
        this.f22393d0 = new org.telegram.ui.Cells.u6(this, 24);
        this.f22396f0 = new Path();
        this.f22397g0 = new RectF();
        this.f22398h0 = new RectF();
        this.f22399i0 = new d6(this, 420L, qrVar);
        this.f22400j0 = new d6(this, 420L, qrVar);
        this.f22401k0 = new d6(this, 420L, qrVar);
        this.m0 = true;
        this.f22391c = f6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        dc1 dc1Var = new dc1(this, context, 9);
        this.f22387a = dc1Var;
        dc1Var.setOrientation(0);
        dc1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        dc1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(dc1Var);
        e();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence replaceEmoji;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.f22405r == -1) {
            this.f22405r = i10;
        }
        this.O.put(i11, i10);
        this.P.put(i10, i11);
        int i12 = this.f22405r;
        if (i12 != -1 && i12 == i10) {
            this.f22403n = i11;
            this.f22408x = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new wm0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new ci.o4(this, i10, 13));
            textView.setOnLongClickListener(new jh.g(this, i10, 1));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(ci.f4.g(replaceEmoji, textView.getPaint())));
        this.f22387a.addView(textView, w7.y5.n(0, -1));
        this.f22406s += dp;
        this.R.put(i11, dp);
        e();
    }

    public final void b() {
        float d = this.f22399i0.d(1.0f, false);
        RectF rectF = this.f22398h0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.f22397g0;
        if (d >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f22396f0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        ch.d dVar = this.f22394e0;
        if (dVar != null) {
            dVar.setAlpha(255);
            this.f22394e0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f22394e0.q(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i10;
        int i11;
        int i12;
        dc1 dc1Var = this.f22387a;
        int childCount = dc1Var.getChildCount();
        int i13 = 0;
        while (true) {
            sparseIntArray = this.Q;
            sparseIntArray2 = this.R;
            if (i13 >= childCount) {
                break;
            }
            TextView textView = (TextView) dc1Var.getChildAt(i13);
            if (this.f22403n == i13) {
                i10 = this.L;
            } else {
                i10 = this.M;
            }
            textView.setTag(Integer.valueOf(i10));
            if (this.f22403n == i13) {
                i11 = this.L;
            } else {
                i11 = this.M;
            }
            textView.setTextColor(f(org.telegram.ui.ActionBar.j6.v0(i11, this.f22391c)));
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
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f22394e0 != null) {
            if (this.f22399i0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f22394e0.f4295p = this.f22401k0.e(this.m0);
            this.f22394e0.draw(canvas);
            canvas.clipPath(this.f22396f0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f22400j0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        dc1 dc1Var = this.f22387a;
        if (view == dc1Var) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            int measuredHeight = getMeasuredHeight();
            float f7 = this.v + this.W;
            float f10 = this.f22407w + f7 + this.f22388a0;
            View childAt = dc1Var.getChildAt(this.f22403n);
            if (this.f22404n0 && childAt != null) {
                f7 += childAt.getTranslationX();
                f10 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.K;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (dc1Var.getAlpha() * alpha));
            gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) f7), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f10)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
            gradientDrawable.draw(canvas);
            gradientDrawable.setAlpha(alpha);
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        int i10;
        dc1 dc1Var = this.f22387a;
        int childCount = dc1Var.getChildCount();
        int i11 = 0;
        while (true) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f22391c;
            if (i11 < childCount) {
                TextView textView = (TextView) dc1Var.getChildAt(i11);
                if (this.f22403n == i11) {
                    i10 = this.L;
                } else {
                    i10 = this.M;
                }
                textView.setTextColor(f(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.15f, f(org.telegram.ui.ActionBar.j6.v0(this.L, f6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i11++;
            } else {
                this.K.setColor(org.telegram.ui.ActionBar.j6.l1(0.15f, f(org.telegram.ui.ActionBar.j6.v0(this.L, f6Var))));
                invalidate();
                return;
            }
        }
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            dc1 dc1Var = this.f22387a;
            int childCount = dc1Var.getChildCount();
            SparseIntArray sparseIntArray = this.O;
            if (i10 < childCount) {
                sparseArray.put(sparseIntArray.get(i10), dc1Var.getChildAt(i10));
                i10++;
            } else {
                sparseIntArray.clear();
                this.P.clear();
                this.Q.clear();
                this.R.clear();
                dc1Var.removeAllViews();
                this.f22406s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.I;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCurrentPosition() {
        return this.f22403n;
    }

    public int getCurrentTabId() {
        return this.f22405r;
    }

    public int getFirstTabId() {
        return this.O.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.f22387a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.O.get(i10)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f22387a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(View view, int i10, int i11) {
        boolean z10;
        xm0 xm0Var;
        if (i11 >= 0) {
            if (view != null || !this.H) {
                int i12 = this.f22403n;
                if (i11 == i12 && (xm0Var = this.f22389b) != null) {
                    xm0Var.C();
                    return;
                }
                if (i12 < i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.J = -1;
                this.T = i12;
                this.f22403n = i11;
                this.f22405r = i10;
                boolean z11 = this.H;
                org.telegram.ui.Cells.u6 u6Var = this.f22393d0;
                if (z11) {
                    AndroidUtilities.cancelRunOnUIThread(u6Var);
                    this.H = false;
                }
                this.S = 0.0f;
                this.H = true;
                this.f22409y = this.v;
                this.E = this.f22407w;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.G = textView.getMeasuredWidth();
                    this.F = hg.k0.z(textView.getMeasuredWidth(), this.G, 2, textView.getLeft());
                }
                setEnabled(false);
                AndroidUtilities.runOnUIThread(u6Var, 16L);
                xm0 xm0Var2 = this.f22389b;
                if (xm0Var2 != null) {
                    xm0Var2.d(i10, z10);
                }
                i(i11, true);
            }
        }
    }

    public final void i(int i10, boolean z10) {
        if (this.h != 0 && this.J != i10) {
            this.J = i10;
            TextView textView = (TextView) this.f22387a.getChildAt(i10);
            if (textView != null) {
                int scrollX = getScrollX();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                if (left - AndroidUtilities.dp(50.0f) < scrollX) {
                    if (z10) {
                        smoothScrollTo(left - AndroidUtilities.dp(50.0f), 0);
                        return;
                    } else {
                        scrollTo(left - AndroidUtilities.dp(50.0f), 0);
                        return;
                    }
                }
                int i11 = left + measuredWidth;
                if (AndroidUtilities.dp(21.0f) + i11 > getWidth() + scrollX) {
                    if (z10) {
                        smoothScrollTo(i11, 0);
                    } else {
                        scrollTo(i11, 0);
                    }
                }
            }
        }
    }

    public final void j(float f7, int i10) {
        int i11;
        int i12 = this.P.get(i10, -1);
        if (i12 >= 0 && (i11 = this.f22403n) != i12) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            dc1 dc1Var = this.f22387a;
            TextView textView = (TextView) dc1Var.getChildAt(i11);
            TextView textView2 = (TextView) dc1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.E = textView.getMeasuredWidth();
                this.f22409y = hg.k0.z(textView.getMeasuredWidth(), this.E, 2, textView.getLeft());
                textView2.getLayout();
                this.G = textView2.getMeasuredWidth();
                this.F = hg.k0.z(textView2.getMeasuredWidth(), this.G, 2, textView2.getLeft());
                k(textView2, textView, f7);
                if (f7 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.M));
                    textView2.setTag(Integer.valueOf(this.L));
                }
                i(dc1Var.indexOfChild(textView2), true);
            }
            if (f7 >= 1.0f) {
                this.f22403n = i12;
                this.f22405r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f7) {
        int i10 = this.L;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22391c;
        int f10 = f(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int f11 = f(org.telegram.ui.ActionBar.j6.v0(this.M, f6Var));
        int red = Color.red(f10);
        int green = Color.green(f10);
        int blue = Color.blue(f10);
        int alpha = Color.alpha(f10);
        int red2 = Color.red(f11);
        int green2 = Color.green(f11);
        int blue2 = Color.blue(f11);
        int alpha2 = Color.alpha(f11);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f7) + alpha), (int) (((red2 - red) * f7) + red), (int) (((green2 - green) * f7) + green), (int) (((blue2 - blue) * f7) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f7) + alpha2), (int) (((red - red2) * f7) + red2), (int) (((green - green2) * f7) + green2), (int) (((blue - blue2) * f7) + blue2)));
        int i11 = this.f22409y;
        this.v = (int) (((this.F - i11) * f7) + i11);
        int i12 = this.E;
        this.f22407w = (int) (((this.G - i12) * f7) + i12);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.f22408x != i15) {
            this.f22408x = i15;
            this.J = -1;
            if (this.H) {
                AndroidUtilities.cancelRunOnUIThread(this.f22393d0);
                this.H = false;
                setEnabled(true);
                xm0 xm0Var = this.f22389b;
                if (xm0Var != null) {
                    xm0Var.y0(1.0f);
                }
            }
            TextView textView = (TextView) this.f22387a.getChildAt(this.f22403n);
            if (textView != null) {
                textView.getLayout();
                this.f22407w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.f22407w;
                int z11 = hg.k0.z(measuredWidth, i16, 2, left);
                this.v = z11;
                int i17 = this.U;
                if (i17 > 0 && (i14 = this.V) > 0) {
                    if (i17 != z11 || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new ci.d5(this, i17 - z11, i14 - i16, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(qr.f27642f);
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
        int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(22.0f);
        dc1 dc1Var = this.f22387a;
        int childCount = dc1Var.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = dc1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f7 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z11 = this.e;
            SparseIntArray sparseIntArray = this.R;
            if (z11) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i12);
            } else {
                int i14 = this.f22406s;
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
            if (Math.abs(f7 - layoutParams.weight) > 0.001f || i13 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = dc1Var.getWeightSum();
        if (childCount != 1 && this.f22406s <= size) {
            dc1Var.setWeightSum(1.0f);
        } else {
            dc1Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - dc1Var.getWeightSum()) > 0.1f) {
            dc1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i10)) {
            z10 = true;
        }
        this.f22395f = z10;
        b();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.I = f7;
        int i10 = this.f22403n;
        dc1 dc1Var = this.f22387a;
        TextView textView = (TextView) dc1Var.getChildAt(i10);
        TextView textView2 = (TextView) dc1Var.getChildAt(this.T);
        if (textView2 != null && textView != null) {
            k(textView, textView2, f7);
            if (f7 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.M));
                textView.setTag(Integer.valueOf(this.L));
            }
            xm0 xm0Var = this.f22389b;
            if (xm0Var != null) {
                xm0Var.y0(f7);
            }
        }
    }

    public void setBlurredBackground(ch.d dVar) {
        this.f22394e0 = dVar;
        dVar.setCallback(this);
    }

    public void setDelegate(xm0 xm0Var) {
        this.f22389b = xm0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        dc1 dc1Var = this.f22387a;
        int childCount = dc1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            dc1Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.f22402l0 = true;
        this.f22405r = i10;
        int i11 = this.P.get(i10);
        if (((TextView) this.f22387a.getChildAt(i11)) != null) {
            this.f22403n = i11;
            this.f22408x = 0;
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
        int dp = AndroidUtilities.dp(f7);
        int paddingTop = getPaddingTop();
        if (this.m0) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        setPadding(dp, paddingTop, AndroidUtilities.dp(f10), getPaddingBottom());
        invalidate();
        if (!this.f22395f) {
            this.f22397g0.set(this.f22398h0);
            this.f22399i0.d(0.0f, true);
            if (!this.m0) {
                f11 = -6.0f;
            }
            this.f22400j0.d(AndroidUtilities.dp(f11), true);
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f22404n0 == z10) {
            return;
        }
        this.f22404n0 = z10;
        AndroidUtilities.forEachViews(this.f22387a, new ai.i(18));
    }

    public void setUseMinimalWidth(boolean z10) {
        int i10;
        this.e = z10;
        if (this.e) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.f22387a.setLayoutParams(new FrameLayout.LayoutParams(i10, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22394e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int f(int i10) {
        return i10;
    }
}
