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
import org.telegram.ui.cc1;
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.x5 {
    public static final int f24331o0 = 0;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public float I;
    public int J;
    public final GradientDrawable K;
    public int L;
    public int M;
    public final is N;
    public final SparseIntArray O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public float S;
    public int T;
    public int U;
    public int V;
    public float W;
    public final cc1 f24332a;
    public float f24333a0;
    public sn0 f24334b;
    public long f24335b0;
    public final org.telegram.ui.ActionBar.d6 f24336c;
    public View f24337c0;
    public boolean d;
    public final org.telegram.ui.Cells.t6 f24338d0;
    public boolean f24339e;
    public ch.d f24340e0;
    public boolean f24341f;
    public final Path f24342f0;
    public final RectF f24343g0;
    public int h;
    public final RectF f24344h0;
    public final g6 f24345i0;
    public final g6 f24346j0;
    public final g6 f24347k0;
    public boolean f24348l0;
    public boolean m0;
    public int f24349n;
    public boolean f24350n0;
    public int f24351r;
    public int f24352s;
    public int v;
    public int f24353w;
    public int f24354x;
    public int f24355y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24351r = -1;
        this.J = -1;
        this.L = org.telegram.ui.ActionBar.h6.I8;
        this.M = org.telegram.ui.ActionBar.h6.J8;
        is isVar = is.h;
        this.N = isVar;
        this.O = new SparseIntArray(5);
        this.P = new SparseIntArray(5);
        this.Q = new SparseIntArray(5);
        this.R = new SparseIntArray(5);
        this.f24335b0 = 200L;
        this.f24338d0 = new org.telegram.ui.Cells.t6(this, 22);
        this.f24342f0 = new Path();
        this.f24343g0 = new RectF();
        this.f24344h0 = new RectF();
        this.f24345i0 = new g6(this, 420L, isVar);
        this.f24346j0 = new g6(this, 420L, isVar);
        this.f24347k0 = new g6(this, 420L, isVar);
        this.m0 = true;
        this.f24336c = d6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.K = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        cc1 cc1Var = new cc1(this, context, 9);
        this.f24332a = cc1Var;
        cc1Var.setOrientation(0);
        cc1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        cc1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(cc1Var);
        e();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence replaceEmoji;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.f24351r == -1) {
            this.f24351r = i10;
        }
        this.O.put(i11, i10);
        this.P.put(i10, i11);
        int i12 = this.f24351r;
        if (i12 != -1 && i12 == i10) {
            this.f24349n = i11;
            this.f24354x = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new rn0(this, getContext(), i10);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new ci.m4(this, i10, 13));
            textView.setOnLongClickListener(new jh.g(this, i10, 1));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(ci.d4.g(replaceEmoji, textView.getPaint())));
        this.f24332a.addView(textView, w7.x5.n(0, -1));
        this.f24352s += dp;
        this.R.put(i11, dp);
        e();
    }

    public final void b() {
        float d = this.f24345i0.d(1.0f, false);
        RectF rectF = this.f24344h0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        int i10 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        RectF rectF2 = this.f24343g0;
        if (i10 >= 0) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f24342f0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        ch.d dVar = this.f24340e0;
        if (dVar != null) {
            dVar.setAlpha(255);
            this.f24340e0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f24340e0.q(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i10;
        int i11;
        int i12;
        cc1 cc1Var = this.f24332a;
        int childCount = cc1Var.getChildCount();
        int i13 = 0;
        while (true) {
            sparseIntArray = this.Q;
            sparseIntArray2 = this.R;
            if (i13 >= childCount) {
                break;
            }
            TextView textView = (TextView) cc1Var.getChildAt(i13);
            if (this.f24349n == i13) {
                i10 = this.L;
            } else {
                i10 = this.M;
            }
            textView.setTag(Integer.valueOf(i10));
            if (this.f24349n == i13) {
                i11 = this.L;
            } else {
                i11 = this.M;
            }
            textView.setTextColor(f(org.telegram.ui.ActionBar.h6.w0(i11, this.f24336c)));
            if (this.f24339e) {
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
        if (this.f24340e0 != null) {
            if (this.f24345i0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f24340e0.f4690p = this.f24347k0.e(this.m0);
            this.f24340e0.draw(canvas);
            canvas.clipPath(this.f24342f0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f24346j0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        cc1 cc1Var = this.f24332a;
        if (view == cc1Var) {
            boolean drawChild = super.drawChild(canvas, view, j3);
            int measuredHeight = getMeasuredHeight();
            float f7 = this.v + this.W;
            float f10 = this.f24353w + f7 + this.f24333a0;
            View childAt = cc1Var.getChildAt(this.f24349n);
            if (this.f24350n0 && childAt != null) {
                f7 += childAt.getTranslationX();
                f10 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.K;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (cc1Var.getAlpha() * alpha));
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
        cc1 cc1Var = this.f24332a;
        int childCount = cc1Var.getChildCount();
        int i11 = 0;
        while (true) {
            org.telegram.ui.ActionBar.d6 d6Var = this.f24336c;
            if (i11 < childCount) {
                TextView textView = (TextView) cc1Var.getChildAt(i11);
                if (this.f24349n == i11) {
                    i10 = this.L;
                } else {
                    i10 = this.M;
                }
                textView.setTextColor(f(org.telegram.ui.ActionBar.h6.w0(i10, d6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.15f, f(org.telegram.ui.ActionBar.h6.w0(this.L, d6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i11++;
            } else {
                this.K.setColor(org.telegram.ui.ActionBar.h6.m1(0.15f, f(org.telegram.ui.ActionBar.h6.w0(this.L, d6Var))));
                invalidate();
                return;
            }
        }
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            cc1 cc1Var = this.f24332a;
            int childCount = cc1Var.getChildCount();
            SparseIntArray sparseIntArray = this.O;
            if (i10 < childCount) {
                sparseArray.put(sparseIntArray.get(i10), cc1Var.getChildAt(i10));
                i10++;
            } else {
                sparseIntArray.clear();
                this.P.clear();
                this.Q.clear();
                this.R.clear();
                cc1Var.removeAllViews();
                this.f24352s = 0;
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
        return this.f24349n;
    }

    public int getCurrentTabId() {
        return this.f24351r;
    }

    public int getFirstTabId() {
        return this.O.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.K;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.f24332a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.O.get(i10)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f24332a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(View view, int i10, int i11) {
        boolean z10;
        sn0 sn0Var;
        if (i11 >= 0) {
            if (view != null || !this.H) {
                int i12 = this.f24349n;
                if (i11 == i12 && (sn0Var = this.f24334b) != null) {
                    sn0Var.C();
                    return;
                }
                if (i12 < i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.J = -1;
                this.T = i12;
                this.f24349n = i11;
                this.f24351r = i10;
                boolean z11 = this.H;
                org.telegram.ui.Cells.t6 t6Var = this.f24338d0;
                if (z11) {
                    AndroidUtilities.cancelRunOnUIThread(t6Var);
                    this.H = false;
                }
                this.S = 0.0f;
                this.H = true;
                this.f24355y = this.v;
                this.E = this.f24353w;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.G = textView.getMeasuredWidth();
                    this.F = hg.c.z(textView.getMeasuredWidth(), this.G, 2, textView.getLeft());
                }
                setEnabled(false);
                AndroidUtilities.runOnUIThread(t6Var, 16L);
                sn0 sn0Var2 = this.f24334b;
                if (sn0Var2 != null) {
                    sn0Var2.d(i10, z10);
                }
                i(i11, true);
            }
        }
    }

    public final void i(int i10, boolean z10) {
        if (this.h != 0 && this.J != i10) {
            this.J = i10;
            TextView textView = (TextView) this.f24332a.getChildAt(i10);
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
        if (i12 >= 0 && (i11 = this.f24349n) != i12) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            } else if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            cc1 cc1Var = this.f24332a;
            TextView textView = (TextView) cc1Var.getChildAt(i11);
            TextView textView2 = (TextView) cc1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.E = textView.getMeasuredWidth();
                this.f24355y = hg.c.z(textView.getMeasuredWidth(), this.E, 2, textView.getLeft());
                textView2.getLayout();
                this.G = textView2.getMeasuredWidth();
                this.F = hg.c.z(textView2.getMeasuredWidth(), this.G, 2, textView2.getLeft());
                k(textView2, textView, f7);
                if (f7 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.M));
                    textView2.setTag(Integer.valueOf(this.L));
                }
                i(cc1Var.indexOfChild(textView2), true);
            }
            if (f7 >= 1.0f) {
                this.f24349n = i12;
                this.f24351r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f7) {
        int i10 = this.L;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24336c;
        int f10 = f(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        int f11 = f(org.telegram.ui.ActionBar.h6.w0(this.M, d6Var));
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
        int i11 = this.f24355y;
        this.v = (int) (((this.F - i11) * f7) + i11);
        int i12 = this.E;
        this.f24353w = (int) (((this.G - i12) * f7) + i12);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.f24354x != i15) {
            this.f24354x = i15;
            this.J = -1;
            if (this.H) {
                AndroidUtilities.cancelRunOnUIThread(this.f24338d0);
                this.H = false;
                setEnabled(true);
                sn0 sn0Var = this.f24334b;
                if (sn0Var != null) {
                    sn0Var.u0(1.0f);
                }
            }
            TextView textView = (TextView) this.f24332a.getChildAt(this.f24349n);
            if (textView != null) {
                textView.getLayout();
                this.f24353w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.f24353w;
                int z11 = hg.c.z(measuredWidth, i16, 2, left);
                this.v = z11;
                int i17 = this.U;
                if (i17 > 0 && (i14 = this.V) > 0) {
                    if (i17 != z11 || i14 != i16) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new ci.b5(this, i17 - z11, i14 - i16, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(is.f27500f);
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
        cc1 cc1Var = this.f24332a;
        int childCount = cc1Var.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = cc1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f7 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z11 = this.f24339e;
            SparseIntArray sparseIntArray = this.R;
            if (z11) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i12);
            } else {
                int i14 = this.f24352s;
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
        float weightSum = cc1Var.getWeightSum();
        if (childCount != 1 && this.f24352s <= size) {
            cc1Var.setWeightSum(1.0f);
        } else {
            cc1Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - cc1Var.getWeightSum()) > 0.1f) {
            cc1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i10)) {
            z10 = true;
        }
        this.f24341f = z10;
        b();
    }

    public void setAnimationIdicatorProgress(float f7) {
        this.I = f7;
        int i10 = this.f24349n;
        cc1 cc1Var = this.f24332a;
        TextView textView = (TextView) cc1Var.getChildAt(i10);
        TextView textView2 = (TextView) cc1Var.getChildAt(this.T);
        if (textView2 != null && textView != null) {
            k(textView, textView2, f7);
            if (f7 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.M));
                textView.setTag(Integer.valueOf(this.L));
            }
            sn0 sn0Var = this.f24334b;
            if (sn0Var != null) {
                sn0Var.u0(f7);
            }
        }
    }

    public void setBlurredBackground(ch.d dVar) {
        this.f24340e0 = dVar;
        dVar.setCallback(this);
    }

    public void setDelegate(sn0 sn0Var) {
        this.f24334b = sn0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        cc1 cc1Var = this.f24332a;
        int childCount = cc1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            cc1Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.f24348l0 = true;
        this.f24351r = i10;
        int i11 = this.P.get(i10);
        if (((TextView) this.f24332a.getChildAt(i11)) != null) {
            this.f24349n = i11;
            this.f24354x = 0;
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
        if (!this.f24341f) {
            this.f24343g0.set(this.f24344h0);
            this.f24345i0.d(0.0f, true);
            if (!this.m0) {
                f11 = -6.0f;
            }
            this.f24346j0.d(AndroidUtilities.dp(f11), true);
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f24350n0 == z10) {
            return;
        }
        this.f24350n0 = z10;
        AndroidUtilities.forEachViews(this.f24332a, new ai.i(5));
    }

    public void setUseMinimalWidth(boolean z10) {
        int i10;
        this.f24339e = z10;
        if (this.f24339e) {
            i10 = -2;
        } else {
            i10 = -1;
        }
        this.f24332a.setLayoutParams(new FrameLayout.LayoutParams(i10, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f24340e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int f(int i10) {
        return i10;
    }
}
