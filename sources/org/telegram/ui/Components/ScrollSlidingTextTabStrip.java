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
import org.telegram.ui.ic1;
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.x5 {
    public static final int f23285o0 = 0;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public float I;
    public int J;
    public final GradientDrawable K;
    public int L;
    public int M;
    public final es N;
    public final SparseIntArray O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public float S;
    public int T;
    public int U;
    public int V;
    public float W;
    public final ic1 f23286a;
    public float f23287a0;
    public nn0 f23288b;
    public long f23289b0;
    public final org.telegram.ui.ActionBar.c6 f23290c;
    public View f23291c0;
    public boolean d;
    public final org.telegram.ui.Cells.t6 f23292d0;
    public boolean e;
    public dh.d f23293e0;
    public boolean f23294f;
    public final Path f23295f0;
    public final RectF f23296g0;
    public int h;
    public final RectF f23297h0;
    public final g6 f23298i0;
    public final g6 f23299j0;
    public final g6 f23300k0;
    public boolean f23301l0;
    public boolean m0;
    public int f23302n;
    public boolean f23303n0;
    public int f23304r;
    public int f23305s;
    public int v;
    public int f23306w;
    public int f23307x;
    public int f23308y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f23304r = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.g6.I8;
        this.M = org.telegram.ui.ActionBar.g6.J8;
        es esVar = es.h;
        this.N = esVar;
        this.O = new SparseIntArray(5);
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.f23289b0 = 200L;
        this.f23292d0 = new org.telegram.ui.Cells.t6(this, 22);
        this.f23295f0 = new Path();
        this.f23296g0 = new RectF();
        this.f23297h0 = new RectF();
        this.f23298i0 = new g6(this, 420L, esVar);
        this.f23299j0 = new g6(this, 420L, esVar);
        this.f23300k0 = new g6(this, 420L, esVar);
        this.m0 = true;
        this.f23290c = c6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ic1 ic1Var = new ic1(this, context, 9);
        this.f23286a = ic1Var;
        ic1Var.setOrientation(0);
        ic1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        ic1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ic1Var);
        d();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence replaceEmoji;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.f23304r == -1) {
            this.f23304r = i10;
        }
        this.O.put(i11, i10);
        this.P.put(i10, i11);
        int i12 = this.f23304r;
        if (i12 != -1 && i12 == i10) {
            this.f23302n = i11;
            this.f23307x = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new mn0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new di.m4(this, i10, 13));
            textView.setOnLongClickListener(new kh.g(this, i10, 1));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(di.d4.g(replaceEmoji, textView.getPaint())));
        this.f23286a.addView(textView, w7.a6.n(0, -1));
        this.f23305s += dp;
        this.R.put(i11, dp);
        d();
    }

    public final void b() {
        float d = this.f23298i0.d(1.0f, false);
        RectF rectF = this.f23297h0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        int i10 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        RectF rectF2 = this.f23296g0;
        if (i10 >= 0) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f23295f0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        dh.d dVar = this.f23293e0;
        if (dVar != null) {
            dVar.setAlpha(255);
            this.f23293e0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f23293e0.q(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i10;
        int i11;
        int i12;
        ic1 ic1Var = this.f23286a;
        int childCount = ic1Var.getChildCount();
        int i13 = 0;
        while (true) {
            sparseIntArray = this.Q;
            sparseIntArray2 = this.R;
            if (i13 >= childCount) {
                break;
            }
            TextView textView = (TextView) ic1Var.getChildAt(i13);
            if (this.f23302n == i13) {
                i10 = this.L;
            } else {
                i10 = this.M;
            }
            textView.setTag(Integer.valueOf(i10));
            if (this.f23302n == i13) {
                i11 = this.L;
            } else {
                i11 = this.M;
            }
            textView.setTextColor(f(org.telegram.ui.ActionBar.g6.w0(i11, this.f23290c)));
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

    @Override
    public final void d() {
        int i10;
        ic1 ic1Var = this.f23286a;
        int childCount = ic1Var.getChildCount();
        int i11 = 0;
        while (true) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f23290c;
            if (i11 < childCount) {
                TextView textView = (TextView) ic1Var.getChildAt(i11);
                if (this.f23302n == i11) {
                    i10 = this.L;
                } else {
                    i10 = this.M;
                }
                textView.setTextColor(f(org.telegram.ui.ActionBar.g6.w0(i10, c6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.m1(0.15f, f(org.telegram.ui.ActionBar.g6.w0(this.L, c6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i11++;
            } else {
                this.K.setColor(org.telegram.ui.ActionBar.g6.m1(0.15f, f(org.telegram.ui.ActionBar.g6.w0(this.L, c6Var))));
                invalidate();
                return;
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f23293e0 != null) {
            if (this.f23298i0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f23293e0.f6564p = this.f23300k0.e(this.m0);
            this.f23293e0.draw(canvas);
            canvas.clipPath(this.f23295f0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f23299j0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ic1 ic1Var = this.f23286a;
        if (view == ic1Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            int measuredHeight = getMeasuredHeight();
            float f7 = this.v + this.W;
            float f10 = this.f23306w + f7 + this.f23287a0;
            View childAt = ic1Var.getChildAt(this.f23302n);
            if (this.f23303n0 && childAt != null) {
                f7 += childAt.getTranslationX();
                f10 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.K;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (ic1Var.getAlpha() * alpha));
            gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) f7), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f10)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
            gradientDrawable.draw(canvas);
            gradientDrawable.setAlpha(alpha);
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final boolean e(int i10) {
        if (this.P.get(i10, -1) != -1) {
            return true;
        }
        return false;
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            ic1 ic1Var = this.f23286a;
            int childCount = ic1Var.getChildCount();
            SparseIntArray sparseIntArray = this.O;
            if (i10 < childCount) {
                sparseArray.put(sparseIntArray.get(i10), ic1Var.getChildAt(i10));
                i10++;
            } else {
                sparseIntArray.clear();
                this.P.clear();
                this.Q.clear();
                this.R.clear();
                ic1Var.removeAllViews();
                this.f23305s = 0;
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
        return this.f23302n;
    }

    public int getCurrentTabId() {
        return this.f23304r;
    }

    public int getFirstTabId() {
        return this.O.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.f23286a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.O.get(i10)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f23286a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(View view, int i10, int i11) {
        boolean z10;
        nn0 nn0Var;
        if (i11 >= 0) {
            if (view != null || !this.H) {
                int i12 = this.f23302n;
                if (i11 == i12 && (nn0Var = this.f23288b) != null) {
                    nn0Var.C();
                    return;
                }
                if (i12 < i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.J = -1;
                this.T = i12;
                this.f23302n = i11;
                this.f23304r = i10;
                boolean z11 = this.H;
                org.telegram.ui.Cells.t6 t6Var = this.f23292d0;
                if (z11) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    this.H = false;
                }
                this.S = 0.0f;
                this.H = true;
                this.f23308y = this.v;
                this.E = this.f23306w;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.G = textView.getMeasuredWidth();
                    this.F = i2.d.z(textView.getMeasuredWidth(), this.G, 2, textView.getLeft());
                }
                setEnabled(false);
                AndroidUtilities.runOnUIThread(t6Var, 16L);
                nn0 nn0Var2 = this.f23288b;
                if (nn0Var2 != null) {
                    nn0Var2.e(i10, z10);
                }
                i(i11, true);
            }
        }
    }

    public final void i(int i10, boolean z10) {
        if (this.h != 0 && this.J != i10) {
            this.J = i10;
            TextView textView = (TextView) this.f23286a.getChildAt(i10);
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
        if (i12 >= 0 && (i11 = this.f23302n) != i12) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            ic1 ic1Var = this.f23286a;
            TextView textView = (TextView) ic1Var.getChildAt(i11);
            TextView textView2 = (TextView) ic1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.E = textView.getMeasuredWidth();
                this.f23308y = i2.d.z(textView.getMeasuredWidth(), this.E, 2, textView.getLeft());
                textView2.getLayout();
                this.G = textView2.getMeasuredWidth();
                this.F = i2.d.z(textView2.getMeasuredWidth(), this.G, 2, textView2.getLeft());
                k(textView2, textView, f7);
                if (f7 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.M));
                    textView2.setTag(Integer.valueOf(this.L));
                }
                i(ic1Var.indexOfChild(textView2), true);
            }
            if (f7 >= 1.0f) {
                this.f23302n = i12;
                this.f23304r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f7) {
        int i10 = this.L;
        org.telegram.ui.ActionBar.c6 c6Var = this.f23290c;
        int f10 = f(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        int f11 = f(org.telegram.ui.ActionBar.g6.w0(this.M, c6Var));
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
        int i11 = this.f23308y;
        this.v = (int) (((this.F - i11) * f7) + i11);
        int i12 = this.E;
        this.f23306w = (int) (((this.G - i12) * f7) + i12);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.f23307x != i15) {
            this.f23307x = i15;
            this.J = -1;
            if (this.H) {
                AndroidUtilities.cancelRunOnUIThread(this.f23292d0);
                this.H = false;
                setEnabled(true);
                nn0 nn0Var = this.f23288b;
                if (nn0Var != null) {
                    nn0Var.B0(1.0f);
                }
            }
            TextView textView = (TextView) this.f23286a.getChildAt(this.f23302n);
            if (textView != null) {
                textView.getLayout();
                this.f23306w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.f23306w;
                int z11 = i2.d.z(measuredWidth, i16, 2, left);
                this.v = z11;
                int i17 = this.U;
                if (i17 > 0 && (i14 = this.V) > 0) {
                    if (i17 != z11 || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new di.b5(this, i17 - z11, i14 - i16, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(es.f24771f);
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
        ic1 ic1Var = this.f23286a;
        int childCount = ic1Var.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = ic1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f7 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z11 = this.e;
            SparseIntArray sparseIntArray = this.R;
            if (z11) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i12);
            } else {
                int i14 = this.f23305s;
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
        float weightSum = ic1Var.getWeightSum();
        if (childCount != 1 && this.f23305s <= size) {
            ic1Var.setWeightSum(1.0f);
        } else {
            ic1Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - ic1Var.getWeightSum()) > 0.1f) {
            ic1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i10)) {
            z10 = true;
        }
        this.f23294f = z10;
        b();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.I = f7;
        int i10 = this.f23302n;
        ic1 ic1Var = this.f23286a;
        TextView textView = (TextView) ic1Var.getChildAt(i10);
        TextView textView2 = (TextView) ic1Var.getChildAt(this.T);
        if (textView2 != null && textView != null) {
            k(textView, textView2, f7);
            if (f7 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.M));
                textView.setTag(Integer.valueOf(this.L));
            }
            nn0 nn0Var = this.f23288b;
            if (nn0Var != null) {
                nn0Var.B0(f7);
            }
        }
    }

    public void setBlurredBackground(dh.d dVar) {
        this.f23293e0 = dVar;
        dVar.setCallback(this);
    }

    public void setDelegate(nn0 nn0Var) {
        this.f23288b = nn0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ic1 ic1Var = this.f23286a;
        int childCount = ic1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ic1Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.f23301l0 = true;
        this.f23304r = i10;
        int i11 = this.P.get(i10);
        if (((TextView) this.f23286a.getChildAt(i11)) != null) {
            this.f23302n = i11;
            this.f23307x = 0;
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
        if (!this.f23294f) {
            this.f23296g0.set(this.f23297h0);
            this.f23298i0.d(0.0f, true);
            if (!this.m0) {
                f11 = -6.0f;
            }
            this.f23299j0.d(AndroidUtilities.dp(f11), true);
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f23303n0 == z10) {
            return;
        }
        this.f23303n0 = z10;
        AndroidUtilities.forEachViews(this.f23286a, new bi.f(5));
    }

    public void setUseMinimalWidth(boolean z10) {
        int i10;
        this.e = z10;
        if (this.e) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.f23286a.setLayoutParams(new FrameLayout.LayoutParams(i10, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f23293e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int f(int i10) {
        return i10;
    }
}
