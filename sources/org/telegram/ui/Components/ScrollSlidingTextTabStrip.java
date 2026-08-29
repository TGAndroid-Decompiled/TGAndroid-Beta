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
import org.telegram.ui.ua1;
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.x5 {
    public static final int f26522k0 = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public float E;
    public int F;
    public final GradientDrawable G;
    public int H;
    public int I;
    public final jr J;
    public final SparseIntArray K;
    public final SparseIntArray L;
    public final SparseIntArray M;
    public final SparseIntArray N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public long U;
    public View V;
    public final rk0 W;
    public final ua1 f26523a;
    public ng.d f26524a0;
    public jm0 f26525b;
    public final Path f26526b0;
    public final org.telegram.ui.ActionBar.c6 f26527c;
    public final RectF f26528c0;
    public boolean d;
    public final RectF f26529d0;
    public boolean f26530e;
    public final d6 f26531e0;
    public boolean f26532f;
    public final d6 f26533f0;
    public final d6 f26534g0;
    public int h;
    public boolean f26535h0;
    public boolean f26536i0;
    public boolean f26537j0;
    public int f26538n;
    public int f26539r;
    public int f26540s;
    public int v;
    public int f26541w;
    public int f26542x;
    public int f26543y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26539r = -1;
        this.F = -1;
        this.H = org.telegram.ui.ActionBar.g6.I8;
        this.I = org.telegram.ui.ActionBar.g6.J8;
        jr jrVar = jr.h;
        this.J = jrVar;
        this.K = new SparseIntArray(5);
        this.L = new SparseIntArray(5);
        this.M = new SparseIntArray(5);
        this.N = new SparseIntArray(5);
        this.U = 200L;
        this.W = new rk0(this, 2);
        this.f26526b0 = new Path();
        this.f26528c0 = new RectF();
        this.f26529d0 = new RectF();
        this.f26531e0 = new d6(this, 420L, jrVar);
        this.f26533f0 = new d6(this, 420L, jrVar);
        this.f26534g0 = new d6(this, 420L, jrVar);
        this.f26536i0 = true;
        this.f26527c = c6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.G = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ua1 ua1Var = new ua1(this, context, 11);
        this.f26523a = ua1Var;
        ua1Var.setOrientation(0);
        ua1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        ua1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ua1Var);
        e();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence replaceEmoji;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.f26539r == -1) {
            this.f26539r = i10;
        }
        this.K.put(i11, i10);
        this.L.put(i10, i11);
        int i12 = this.f26539r;
        if (i12 != -1 && i12 == i10) {
            this.f26538n = i11;
            this.f26542x = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new im0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new jh.y0(this, i10, 12));
            textView.setOnLongClickListener(new gm0(this, i10, 0));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(nh.t3.g(replaceEmoji, textView.getPaint())));
        this.f26523a.addView(textView, i7.f6.n(0, -1));
        this.f26540s += dp;
        this.N.put(i11, dp);
        e();
    }

    public final void b() {
        float d = this.f26531e0.d(1.0f, false);
        RectF rectF = this.f26529d0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.f26528c0;
        if (d >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f26526b0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        ng.d dVar = this.f26524a0;
        if (dVar != null) {
            dVar.setAlpha(255);
            this.f26524a0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f26524a0.p(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i10;
        int i11;
        int i12;
        ua1 ua1Var = this.f26523a;
        int childCount = ua1Var.getChildCount();
        int i13 = 0;
        while (true) {
            sparseIntArray = this.M;
            sparseIntArray2 = this.N;
            if (i13 >= childCount) {
                break;
            }
            TextView textView = (TextView) ua1Var.getChildAt(i13);
            if (this.f26538n == i13) {
                i10 = this.H;
            } else {
                i10 = this.I;
            }
            textView.setTag(Integer.valueOf(i10));
            if (this.f26538n == i13) {
                i11 = this.H;
            } else {
                i11 = this.I;
            }
            textView.setTextColor(f(org.telegram.ui.ActionBar.g6.v0(i11, this.f26527c)));
            if (this.f26530e) {
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
        if (this.L.get(i10, -1) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f26524a0 != null) {
            if (this.f26531e0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f26524a0.f17350n = this.f26534g0.e(this.f26536i0);
            this.f26524a0.draw(canvas);
            canvas.clipPath(this.f26526b0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f26533f0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ua1 ua1Var = this.f26523a;
        if (view == ua1Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            int measuredHeight = getMeasuredHeight();
            float f9 = this.v + this.S;
            float f10 = this.f26541w + f9 + this.T;
            View childAt = ua1Var.getChildAt(this.f26538n);
            if (this.f26537j0 && childAt != null) {
                f9 += childAt.getTranslationX();
                f10 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.G;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (ua1Var.getAlpha() * alpha));
            gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) f9), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f10)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
            gradientDrawable.draw(canvas);
            gradientDrawable.setAlpha(alpha);
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        int i10;
        ua1 ua1Var = this.f26523a;
        int childCount = ua1Var.getChildCount();
        int i11 = 0;
        while (true) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f26527c;
            if (i11 < childCount) {
                TextView textView = (TextView) ua1Var.getChildAt(i11);
                if (this.f26538n == i11) {
                    i10 = this.H;
                } else {
                    i10 = this.I;
                }
                textView.setTextColor(f(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.15f, f(org.telegram.ui.ActionBar.g6.v0(this.H, c6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i11++;
            } else {
                this.G.setColor(org.telegram.ui.ActionBar.g6.l1(0.15f, f(org.telegram.ui.ActionBar.g6.v0(this.H, c6Var))));
                invalidate();
                return;
            }
        }
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            ua1 ua1Var = this.f26523a;
            int childCount = ua1Var.getChildCount();
            SparseIntArray sparseIntArray = this.K;
            if (i10 < childCount) {
                sparseArray.put(sparseIntArray.get(i10), ua1Var.getChildAt(i10));
                i10++;
            } else {
                sparseIntArray.clear();
                this.L.clear();
                this.M.clear();
                this.N.clear();
                ua1Var.removeAllViews();
                this.f26540s = 0;
                this.h = 0;
                return sparseArray;
            }
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.E;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCurrentPosition() {
        return this.f26538n;
    }

    public int getCurrentTabId() {
        return this.f26539r;
    }

    public int getFirstTabId() {
        return this.K.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.G;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.f26523a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.K.get(i10)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f26523a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(View view, int i10, int i11) {
        boolean z10;
        jm0 jm0Var;
        if (i11 >= 0) {
            if (view != null || !this.D) {
                int i12 = this.f26538n;
                if (i11 == i12 && (jm0Var = this.f26525b) != null) {
                    jm0Var.x();
                    return;
                }
                if (i12 < i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = -1;
                this.P = i12;
                this.f26538n = i11;
                this.f26539r = i10;
                boolean z11 = this.D;
                rk0 rk0Var = this.W;
                if (z11) {
                    AndroidUtilities.cancelRunOnUIThread(rk0Var);
                    this.D = false;
                }
                this.O = 0.0f;
                this.D = true;
                this.f26543y = this.v;
                this.A = this.f26541w;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.C = textView.getMeasuredWidth();
                    this.B = j7.l1.e(textView.getMeasuredWidth(), this.C, 2, textView.getLeft());
                }
                setEnabled(false);
                AndroidUtilities.runOnUIThread(rk0Var, 16L);
                jm0 jm0Var2 = this.f26525b;
                if (jm0Var2 != null) {
                    jm0Var2.e(i10, z10);
                }
                i(i11, true);
            }
        }
    }

    public final void i(int i10, boolean z10) {
        if (this.h != 0 && this.F != i10) {
            this.F = i10;
            TextView textView = (TextView) this.f26523a.getChildAt(i10);
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

    public final void j(float f9, int i10) {
        int i11;
        int i12 = this.L.get(i10, -1);
        if (i12 >= 0 && (i11 = this.f26538n) != i12) {
            if (f9 < 0.0f) {
                f9 = 0.0f;
            } else if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            ua1 ua1Var = this.f26523a;
            TextView textView = (TextView) ua1Var.getChildAt(i11);
            TextView textView2 = (TextView) ua1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.A = textView.getMeasuredWidth();
                this.f26543y = j7.l1.e(textView.getMeasuredWidth(), this.A, 2, textView.getLeft());
                textView2.getLayout();
                this.C = textView2.getMeasuredWidth();
                this.B = j7.l1.e(textView2.getMeasuredWidth(), this.C, 2, textView2.getLeft());
                k(textView2, textView, f9);
                if (f9 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.I));
                    textView2.setTag(Integer.valueOf(this.H));
                }
                i(ua1Var.indexOfChild(textView2), true);
            }
            if (f9 >= 1.0f) {
                this.f26538n = i12;
                this.f26539r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f9) {
        int i10 = this.H;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26527c;
        int f10 = f(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int f11 = f(org.telegram.ui.ActionBar.g6.v0(this.I, c6Var));
        int red = Color.red(f10);
        int green = Color.green(f10);
        int blue = Color.blue(f10);
        int alpha = Color.alpha(f10);
        int red2 = Color.red(f11);
        int green2 = Color.green(f11);
        int blue2 = Color.blue(f11);
        int alpha2 = Color.alpha(f11);
        textView2.setTextColor(Color.argb((int) (((alpha2 - alpha) * f9) + alpha), (int) (((red2 - red) * f9) + red), (int) (((green2 - green) * f9) + green), (int) (((blue2 - blue) * f9) + blue)));
        textView.setTextColor(Color.argb((int) (((alpha - alpha2) * f9) + alpha2), (int) (((red - red2) * f9) + red2), (int) (((green - green2) * f9) + green2), (int) (((blue - blue2) * f9) + blue2)));
        int i11 = this.f26543y;
        this.v = (int) (((this.B - i11) * f9) + i11);
        int i12 = this.A;
        this.f26541w = (int) (((this.C - i12) * f9) + i12);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.f26542x != i15) {
            this.f26542x = i15;
            this.F = -1;
            if (this.D) {
                AndroidUtilities.cancelRunOnUIThread(this.W);
                this.D = false;
                setEnabled(true);
                jm0 jm0Var = this.f26525b;
                if (jm0Var != null) {
                    jm0Var.u0(1.0f);
                }
            }
            TextView textView = (TextView) this.f26523a.getChildAt(this.f26538n);
            if (textView != null) {
                textView.getLayout();
                this.f26541w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.f26541w;
                int e10 = j7.l1.e(measuredWidth, i16, 2, left);
                this.v = e10;
                int i17 = this.Q;
                if (i17 > 0 && (i14 = this.R) > 0) {
                    if (i17 != e10 || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new bg.h0(this, i17 - e10, i14 - i16, 4));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(jr.f29800f);
                        ofFloat.start();
                    }
                    this.Q = 0;
                    this.R = 0;
                }
            }
        }
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(22.0f);
        ua1 ua1Var = this.f26523a;
        int childCount = ua1Var.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = ua1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f9 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z11 = this.f26530e;
            SparseIntArray sparseIntArray = this.N;
            if (z11) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i12);
            } else {
                int i14 = this.f26540s;
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
            if (Math.abs(f9 - layoutParams.weight) > 0.001f || i13 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = ua1Var.getWeightSum();
        if (childCount != 1 && this.f26540s <= size) {
            ua1Var.setWeightSum(1.0f);
        } else {
            ua1Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - ua1Var.getWeightSum()) > 0.1f) {
            ua1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i10)) {
            z10 = true;
        }
        this.f26532f = z10;
        b();
    }

    public void setAnimationIdicatorProgress(float f9) {
        this.E = f9;
        int i10 = this.f26538n;
        ua1 ua1Var = this.f26523a;
        TextView textView = (TextView) ua1Var.getChildAt(i10);
        TextView textView2 = (TextView) ua1Var.getChildAt(this.P);
        if (textView2 != null && textView != null) {
            k(textView, textView2, f9);
            if (f9 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.I));
                textView.setTag(Integer.valueOf(this.H));
            }
            jm0 jm0Var = this.f26525b;
            if (jm0Var != null) {
                jm0Var.u0(f9);
            }
        }
    }

    public void setBlurredBackground(ng.d dVar) {
        this.f26524a0 = dVar;
        dVar.setCallback(this);
    }

    public void setDelegate(jm0 jm0Var) {
        this.f26525b = jm0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ua1 ua1Var = this.f26523a;
        int childCount = ua1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ua1Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.f26535h0 = true;
        this.f26539r = i10;
        int i11 = this.L.get(i10);
        if (((TextView) this.f26523a.getChildAt(i11)) != null) {
            this.f26538n = i11;
            this.f26542x = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        float f9;
        float f10;
        if (z10 == this.f26536i0) {
            return;
        }
        this.f26536i0 = z10;
        float f11 = 6.0f;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 6.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        int paddingTop = getPaddingTop();
        if (this.f26536i0) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        setPadding(dp, paddingTop, AndroidUtilities.dp(f10), getPaddingBottom());
        invalidate();
        if (!this.f26532f) {
            this.f26528c0.set(this.f26529d0);
            this.f26531e0.d(0.0f, true);
            if (!this.f26536i0) {
                f11 = -6.0f;
            }
            this.f26533f0.d(AndroidUtilities.dp(f11), true);
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f26537j0 == z10) {
            return;
        }
        this.f26537j0 = z10;
        AndroidUtilities.forEachViews(this.f26523a, new l4.x0(18));
    }

    public void setUseMinimalWidth(boolean z10) {
        int i10;
        this.f26530e = z10;
        if (this.f26530e) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.f26523a.setLayoutParams(new FrameLayout.LayoutParams(i10, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f26524a0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int f(int i10) {
        return i10;
    }
}
