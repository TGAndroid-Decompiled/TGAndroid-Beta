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
import org.telegram.ui.ta1;
public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.w5 {
    public static final int f26511k0 = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public float E;
    public int F;
    public final GradientDrawable G;
    public int H;
    public int I;
    public final gr J;
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
    public final m.i3 W;
    public final ta1 f26512a;
    public kg.d f26513a0;
    public wl0 f26514b;
    public final Path f26515b0;
    public final org.telegram.ui.ActionBar.b6 f26516c;
    public final RectF f26517c0;
    public boolean d;
    public final RectF f26518d0;
    public boolean f26519e;
    public final y5 f26520e0;
    public boolean f26521f;
    public final y5 f26522f0;
    public final y5 f26523g0;
    public int h;
    public boolean f26524h0;
    public boolean f26525i0;
    public boolean f26526j0;
    public int f26527n;
    public int f26528r;
    public int f26529s;
    public int v;
    public int f26530w;
    public int f26531x;
    public int f26532y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f26528r = -1;
        this.F = -1;
        this.H = org.telegram.ui.ActionBar.f6.I8;
        this.I = org.telegram.ui.ActionBar.f6.J8;
        gr grVar = gr.h;
        this.J = grVar;
        this.K = new SparseIntArray(5);
        this.L = new SparseIntArray(5);
        this.M = new SparseIntArray(5);
        this.N = new SparseIntArray(5);
        this.U = 200L;
        this.W = new m.i3(this, 29);
        this.f26515b0 = new Path();
        this.f26517c0 = new RectF();
        this.f26518d0 = new RectF();
        this.f26520e0 = new y5(this, 420L, grVar);
        this.f26522f0 = new y5(this, 420L, grVar);
        this.f26523g0 = new y5(this, 420L, grVar);
        this.f26525i0 = true;
        this.f26516c = b6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.G = gradientDrawable;
        float dpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ta1 ta1Var = new ta1(this, context, 10);
        this.f26512a = ta1Var;
        ta1Var.setOrientation(0);
        ta1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        ta1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ta1Var);
        d();
    }

    public final void a(int i9, CharSequence charSequence, SparseArray sparseArray) {
        TextView textView;
        CharSequence replaceEmoji;
        int i10 = this.h;
        this.h = i10 + 1;
        if (i10 == 0 && this.f26528r == -1) {
            this.f26528r = i9;
        }
        this.K.put(i10, i9);
        this.L.put(i9, i10);
        int i11 = this.f26528r;
        if (i11 != -1 && i11 == i9) {
            this.f26527n = i10;
            this.f26531x = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i9);
            sparseArray.delete(i9);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new vl0(this, getContext(), i9);
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new gh.z0(this, i9, 12));
            textView.setOnLongClickListener(new tl0(this, i9, 0));
            NotificationCenter.listenEmojiLoading(textView);
        }
        textView.setText(Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false));
        int dp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(kh.x3.g(replaceEmoji, textView.getPaint())));
        this.f26512a.addView(textView, g7.e6.n(0, -1));
        this.f26529s += dp;
        this.N.put(i10, dp);
        d();
    }

    public final void b() {
        float d = this.f26520e0.d(1.0f, false);
        RectF rectF = this.f26518d0;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.f26517c0;
        if (d >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, d, rectF);
        }
        float height = rectF.height() / 2.0f;
        Path path = this.f26515b0;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        kg.d dVar = this.f26513a0;
        if (dVar != null) {
            dVar.setAlpha(255);
            this.f26513a0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f26513a0.p(height);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        int i9;
        int i10;
        int i11;
        ta1 ta1Var = this.f26512a;
        int childCount = ta1Var.getChildCount();
        int i12 = 0;
        while (true) {
            sparseIntArray = this.M;
            sparseIntArray2 = this.N;
            if (i12 >= childCount) {
                break;
            }
            TextView textView = (TextView) ta1Var.getChildAt(i12);
            if (this.f26527n == i12) {
                i9 = this.H;
            } else {
                i9 = this.I;
            }
            textView.setTag(Integer.valueOf(i9));
            if (this.f26527n == i12) {
                i10 = this.H;
            } else {
                i10 = this.I;
            }
            textView.setTextColor(f(org.telegram.ui.ActionBar.f6.v0(i10, this.f26516c)));
            if (this.f26519e) {
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

    @Override
    public final void d() {
        int i9;
        ta1 ta1Var = this.f26512a;
        int childCount = ta1Var.getChildCount();
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.b6 b6Var = this.f26516c;
            if (i10 < childCount) {
                TextView textView = (TextView) ta1Var.getChildAt(i10);
                if (this.f26527n == i10) {
                    i9 = this.H;
                } else {
                    i9 = this.I;
                }
                textView.setTextColor(f(org.telegram.ui.ActionBar.f6.v0(i9, b6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.15f, f(org.telegram.ui.ActionBar.f6.v0(this.H, b6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i10++;
            } else {
                this.G.setColor(org.telegram.ui.ActionBar.f6.l1(0.15f, f(org.telegram.ui.ActionBar.f6.v0(this.H, b6Var))));
                invalidate();
                return;
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f26513a0 != null) {
            if (this.f26520e0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f26513a0.f14826n = this.f26523g0.e(this.f26525i0);
            this.f26513a0.draw(canvas);
            canvas.clipPath(this.f26515b0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f26522f0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ta1 ta1Var = this.f26512a;
        if (view == ta1Var) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            int measuredHeight = getMeasuredHeight();
            float f10 = this.v + this.S;
            float f11 = this.f26530w + f10 + this.T;
            View childAt = ta1Var.getChildAt(this.f26527n);
            if (this.f26526j0 && childAt != null) {
                f10 += childAt.getTranslationX();
                f11 += childAt.getTranslationX();
            }
            GradientDrawable gradientDrawable = this.G;
            int alpha = gradientDrawable.getAlpha();
            gradientDrawable.setAlpha((int) (ta1Var.getAlpha() * alpha));
            gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) f10), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) f11)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
            gradientDrawable.draw(canvas);
            gradientDrawable.setAlpha(alpha);
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final boolean e(int i9) {
        if (this.L.get(i9, -1) != -1) {
            return true;
        }
        return false;
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i9 = 0;
        while (true) {
            ta1 ta1Var = this.f26512a;
            int childCount = ta1Var.getChildCount();
            SparseIntArray sparseIntArray = this.K;
            if (i9 < childCount) {
                sparseArray.put(sparseIntArray.get(i9), ta1Var.getChildAt(i9));
                i9++;
            } else {
                sparseIntArray.clear();
                this.L.clear();
                this.M.clear();
                this.N.clear();
                ta1Var.removeAllViews();
                this.f26529s = 0;
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
        return this.f26527n;
    }

    public int getCurrentTabId() {
        return this.f26528r;
    }

    public int getFirstTabId() {
        return this.K.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.G;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i9 = 0; i9 < this.f26512a.getChildCount(); i9++) {
            arrayList.add(Integer.valueOf(this.K.get(i9)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f26512a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(View view, int i9, int i10) {
        boolean z10;
        wl0 wl0Var;
        if (i10 >= 0) {
            if (view != null || !this.D) {
                int i11 = this.f26527n;
                if (i10 == i11 && (wl0Var = this.f26514b) != null) {
                    wl0Var.p();
                    return;
                }
                if (i11 < i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = -1;
                this.P = i11;
                this.f26527n = i10;
                this.f26528r = i9;
                boolean z11 = this.D;
                m.i3 i3Var = this.W;
                if (z11) {
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                    this.D = false;
                }
                this.O = 0.0f;
                this.D = true;
                this.f26532y = this.v;
                this.A = this.f26530w;
                if (view != null) {
                    TextView textView = (TextView) view;
                    textView.getLayout();
                    this.C = textView.getMeasuredWidth();
                    this.B = j3.r0.d(textView.getMeasuredWidth(), this.C, 2, textView.getLeft());
                }
                setEnabled(false);
                AndroidUtilities.runOnUIThread(i3Var, 16L);
                wl0 wl0Var2 = this.f26514b;
                if (wl0Var2 != null) {
                    wl0Var2.b(i9, z10);
                }
                i(i10, true);
            }
        }
    }

    public final void i(int i9, boolean z10) {
        if (this.h != 0 && this.F != i9) {
            this.F = i9;
            TextView textView = (TextView) this.f26512a.getChildAt(i9);
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
                int i10 = left + measuredWidth;
                if (AndroidUtilities.dp(21.0f) + i10 > getWidth() + scrollX) {
                    if (z10) {
                        smoothScrollTo(i10, 0);
                    } else {
                        scrollTo(i10, 0);
                    }
                }
            }
        }
    }

    public final void j(float f10, int i9) {
        int i10;
        int i11 = this.L.get(i9, -1);
        if (i11 >= 0 && (i10 = this.f26527n) != i11) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            ta1 ta1Var = this.f26512a;
            TextView textView = (TextView) ta1Var.getChildAt(i10);
            TextView textView2 = (TextView) ta1Var.getChildAt(i11);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.A = textView.getMeasuredWidth();
                this.f26532y = j3.r0.d(textView.getMeasuredWidth(), this.A, 2, textView.getLeft());
                textView2.getLayout();
                this.C = textView2.getMeasuredWidth();
                this.B = j3.r0.d(textView2.getMeasuredWidth(), this.C, 2, textView2.getLeft());
                k(textView2, textView, f10);
                if (f10 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.I));
                    textView2.setTag(Integer.valueOf(this.H));
                }
                i(ta1Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.f26527n = i11;
                this.f26528r = i9;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f10) {
        int i9 = this.H;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26516c;
        int f11 = f(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        int f12 = f(org.telegram.ui.ActionBar.f6.v0(this.I, b6Var));
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
        int i10 = this.f26532y;
        this.v = (int) (((this.B - i10) * f10) + i10);
        int i11 = this.A;
        this.f26530w = (int) (((this.C - i11) * f10) + i11);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        int i14 = i11 - i9;
        if (this.f26531x != i14) {
            this.f26531x = i14;
            this.F = -1;
            if (this.D) {
                AndroidUtilities.cancelRunOnUIThread(this.W);
                this.D = false;
                setEnabled(true);
                wl0 wl0Var = this.f26514b;
                if (wl0Var != null) {
                    wl0Var.v0(1.0f);
                }
            }
            TextView textView = (TextView) this.f26512a.getChildAt(this.f26527n);
            if (textView != null) {
                textView.getLayout();
                this.f26530w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i15 = this.f26530w;
                int d = j3.r0.d(measuredWidth, i15, 2, left);
                this.v = d;
                int i16 = this.Q;
                if (i16 > 0 && (i13 = this.R) > 0) {
                    if (i16 != d || i13 != i15) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new kh.v4(this, i16 - d, i13 - i15, 3));
                        ofFloat.setDuration(200L);
                        ofFloat.setInterpolator(gr.f28844f);
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
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(22.0f);
        ta1 ta1Var = this.f26512a;
        int childCount = ta1Var.getChildCount();
        boolean z10 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = ta1Var.getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i12 = layoutParams.width;
            boolean z11 = this.f26519e;
            SparseIntArray sparseIntArray = this.N;
            if (z11) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i11);
            } else {
                int i13 = this.f26529s;
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
                    layoutParams.weight = AndroidUtilities.lerp(1.0f / childCount, (1.0f / i13) * sparseIntArray.get(i11), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f10 - layoutParams.weight) > 0.001f || i12 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = ta1Var.getWeightSum();
        if (childCount != 1 && this.f26529s <= size) {
            ta1Var.setWeightSum(1.0f);
        } else {
            ta1Var.setWeightSum(0.0f);
        }
        if (Math.abs(weightSum - ta1Var.getWeightSum()) > 0.1f) {
            ta1Var.requestLayout();
        }
        super.onMeasure(i9, i10);
        if (getMeasuredWidth() < View.MeasureSpec.getSize(i9)) {
            z10 = true;
        }
        this.f26521f = z10;
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.E = f10;
        int i9 = this.f26527n;
        ta1 ta1Var = this.f26512a;
        TextView textView = (TextView) ta1Var.getChildAt(i9);
        TextView textView2 = (TextView) ta1Var.getChildAt(this.P);
        if (textView2 != null && textView != null) {
            k(textView, textView2, f10);
            if (f10 >= 1.0f) {
                textView2.setTag(Integer.valueOf(this.I));
                textView.setTag(Integer.valueOf(this.H));
            }
            wl0 wl0Var = this.f26514b;
            if (wl0Var != null) {
                wl0Var.v0(f10);
            }
        }
    }

    public void setBlurredBackground(kg.d dVar) {
        this.f26513a0 = dVar;
        dVar.setCallback(this);
    }

    public void setDelegate(wl0 wl0Var) {
        this.f26514b = wl0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ta1 ta1Var = this.f26512a;
        int childCount = ta1Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ta1Var.getChildAt(i9).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i9) {
        this.f26524h0 = true;
        this.f26528r = i9;
        int i10 = this.L.get(i9);
        if (((TextView) this.f26512a.getChildAt(i10)) != null) {
            this.f26527n = i10;
            this.f26531x = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        float f10;
        float f11;
        if (z10 == this.f26525i0) {
            return;
        }
        this.f26525i0 = z10;
        float f12 = 6.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 6.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        int paddingTop = getPaddingTop();
        if (this.f26525i0) {
            f11 = 0.0f;
        } else {
            f11 = 6.0f;
        }
        setPadding(dp, paddingTop, AndroidUtilities.dp(f11), getPaddingBottom());
        invalidate();
        if (!this.f26521f) {
            this.f26517c0.set(this.f26518d0);
            this.f26520e0.d(0.0f, true);
            if (!this.f26525i0) {
                f12 = -6.0f;
            }
            this.f26522f0.d(AndroidUtilities.dp(f12), true);
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f26526j0 == z10) {
            return;
        }
        this.f26526j0 = z10;
        AndroidUtilities.forEachViews(this.f26512a, new ih.e(18));
    }

    public void setUseMinimalWidth(boolean z10) {
        int i9;
        this.f26519e = z10;
        if (this.f26519e) {
            i9 = -2;
        } else {
            i9 = -1;
        }
        this.f26512a.setLayoutParams(new FrameLayout.LayoutParams(i9, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f26513a0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public int f(int i9) {
        return i9;
    }
}
