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
import org.telegram.ui.ra1;

public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements org.telegram.ui.ActionBar.x5 {

    public static final int f26507k0 = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public float E;
    public int F;
    public final GradientDrawable G;
    public int H;
    public int I;
    public final er J;
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

    public final ra1 f26508a;

    public lg.d f26509a0;

    public zl0 f26510b;

    public final Path f26511b0;

    public final org.telegram.ui.ActionBar.c6 f26512c;

    public final RectF f26513c0;
    public boolean d;

    public final RectF f26514d0;

    public boolean f26515e;

    public final y5 f26516e0;

    public boolean f26517f;

    public final y5 f26518f0;

    public final y5 f26519g0;
    public int h;

    public boolean f26520h0;

    public boolean f26521i0;

    public boolean f26522j0;

    public int f26523n;

    public int f26524r;

    public int f26525s;
    public int v;

    public int f26526w;

    public int f26527x;

    public int f26528y;

    public ScrollSlidingTextTabStrip(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26524r = -1;
        this.F = -1;
        this.H = org.telegram.ui.ActionBar.g6.I8;
        this.I = org.telegram.ui.ActionBar.g6.J8;
        er erVar = er.h;
        this.J = erVar;
        this.K = new SparseIntArray(5);
        this.L = new SparseIntArray(5);
        this.M = new SparseIntArray(5);
        this.N = new SparseIntArray(5);
        this.U = 200L;
        this.W = new m.i3(this, 29);
        this.f26511b0 = new Path();
        this.f26513c0 = new RectF();
        this.f26514d0 = new RectF();
        this.f26516e0 = new y5(this, 420L, erVar);
        this.f26518f0 = new y5(this, 420L, erVar);
        this.f26519g0 = new y5(this, 420L, erVar);
        this.f26521i0 = true;
        this.f26512c = c6Var;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.G = gradientDrawable;
        float fDpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        ra1 ra1Var = new ra1(this, context, 11);
        this.f26508a = ra1Var;
        ra1Var.setOrientation(0);
        ra1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        ra1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(ra1Var);
        d();
    }

    public final void a(int i10, CharSequence charSequence, SparseArray sparseArray) {
        TextView yl0Var;
        int i11 = this.h;
        this.h = i11 + 1;
        if (i11 == 0 && this.f26524r == -1) {
            this.f26524r = i10;
        }
        this.K.put(i11, i10);
        this.L.put(i10, i11);
        int i12 = this.f26524r;
        if (i12 != -1 && i12 == i10) {
            this.f26523n = i11;
            this.f26527x = 0;
        }
        if (sparseArray != null) {
            yl0Var = (TextView) sparseArray.get(i10);
            sparseArray.delete(i10);
        } else {
            yl0Var = null;
        }
        if (yl0Var == null) {
            yl0Var = new yl0(this, getContext(), i10);
            yl0Var.setGravity(17);
            yl0Var.setTextAlignment(4);
            yl0Var.setTextSize(1, 15.0f);
            yl0Var.setSingleLine();
            yl0Var.setMaxLines(1);
            yl0Var.setTypeface(AndroidUtilities.bold());
            yl0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            yl0Var.setOnClickListener(new hh.z0(this, i10, 12));
            yl0Var.setOnLongClickListener(new wl0(this, i10, 0));
            NotificationCenter.listenEmojiLoading(yl0Var);
        }
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, yl0Var.getPaint().getFontMetricsInt(), false);
        yl0Var.setText(charSequenceReplaceEmoji);
        int iDp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(lh.w3.g(charSequenceReplaceEmoji, yl0Var.getPaint())));
        this.f26508a.addView(yl0Var, h7.z5.n(0, -1));
        this.f26525s += iDp;
        this.N.put(i11, iDp);
        d();
    }

    public final void b() {
        float fD = this.f26516e0.d(1.0f, false);
        float paddingLeft = getPaddingLeft();
        float measuredWidth = getMeasuredWidth() - getPaddingRight();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.f26514d0;
        rectF.set(paddingLeft, 0.0f, measuredWidth, measuredHeight);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.f26513c0;
        if (fD >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, fD, rectF);
        }
        float fHeight = rectF.height() / 2.0f;
        Path path = this.f26511b0;
        path.rewind();
        path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
        lg.d dVar = this.f26509a0;
        if (dVar != null) {
            dVar.setAlpha(255);
            this.f26509a0.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.f26509a0.p(fHeight);
        }
    }

    public final void c() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        ra1 ra1Var = this.f26508a;
        int childCount = ra1Var.getChildCount();
        int i10 = 0;
        while (true) {
            sparseIntArray = this.M;
            sparseIntArray2 = this.N;
            if (i10 >= childCount) {
                break;
            }
            TextView textView = (TextView) ra1Var.getChildAt(i10);
            textView.setTag(Integer.valueOf(this.f26523n == i10 ? this.H : this.I));
            textView.setTextColor(f(org.telegram.ui.ActionBar.g6.v0(this.f26523n == i10 ? this.H : this.I, this.f26512c)));
            if (this.f26515e) {
                if (sparseIntArray.size() != sparseIntArray2.size() || sparseIntArray.get(i10) != sparseIntArray2.get(i10)) {
                    textView.requestLayout();
                }
            } else if (i10 == 0) {
                int i11 = textView.getLayoutParams().width;
                textView.getLayoutParams().width = childCount == 1 ? -2 : 0;
                if (i11 != textView.getLayoutParams().width) {
                    textView.requestLayout();
                }
            }
            i10++;
        }
        sparseIntArray.clear();
        for (int i12 = 0; i12 < sparseIntArray2.size(); i12++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i12), sparseIntArray2.valueAt(i12));
        }
    }

    @Override
    public final void d() {
        ra1 ra1Var = this.f26508a;
        int childCount = ra1Var.getChildCount();
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f26512c;
            if (i10 >= childCount) {
                this.G.setColor(org.telegram.ui.ActionBar.g6.l1(0.15f, f(org.telegram.ui.ActionBar.g6.v0(this.H, c6Var))));
                invalidate();
                return;
            } else {
                TextView textView = (TextView) ra1Var.getChildAt(i10);
                textView.setTextColor(f(org.telegram.ui.ActionBar.g6.v0(this.f26523n == i10 ? this.H : this.I, c6Var)));
                textView.setBackground(new InsetDrawable((Drawable) org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.15f, f(org.telegram.ui.ActionBar.g6.v0(this.H, c6Var))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i10++;
            }
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.f26509a0 != null) {
            if (this.f26516e0.d(1.0f, false) < 1.0f) {
                b();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.f26509a0.f15604n = this.f26519g0.e(this.f26521i0);
            this.f26509a0.draw(canvas);
            canvas.clipPath(this.f26511b0);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.f26518f0.d(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ra1 ra1Var = this.f26508a;
        if (view != ra1Var) {
            return super.drawChild(canvas, view, j10);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        int measuredHeight = getMeasuredHeight();
        float translationX = this.v + this.S;
        float translationX2 = this.f26526w + translationX + this.T;
        View childAt = ra1Var.getChildAt(this.f26523n);
        if (this.f26522j0 && childAt != null) {
            translationX += childAt.getTranslationX();
            translationX2 += childAt.getTranslationX();
        }
        GradientDrawable gradientDrawable = this.G;
        int alpha = gradientDrawable.getAlpha();
        gradientDrawable.setAlpha((int) (ra1Var.getAlpha() * alpha));
        gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) translationX), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) translationX2)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
        gradientDrawable.draw(canvas);
        gradientDrawable.setAlpha(alpha);
        return zDrawChild;
    }

    public final boolean e(int i10) {
        return this.L.get(i10, -1) != -1;
    }

    public final SparseArray g() {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            ra1 ra1Var = this.f26508a;
            int childCount = ra1Var.getChildCount();
            SparseIntArray sparseIntArray = this.K;
            if (i10 >= childCount) {
                sparseIntArray.clear();
                this.L.clear();
                this.M.clear();
                this.N.clear();
                ra1Var.removeAllViews();
                this.f26525s = 0;
                this.h = 0;
                return sparseArray;
            }
            sparseArray.put(sparseIntArray.get(i10), ra1Var.getChildAt(i10));
            i10++;
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.E;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCurrentPosition() {
        return this.f26523n;
    }

    public int getCurrentTabId() {
        return this.f26524r;
    }

    public int getFirstTabId() {
        return this.K.get(0, 0);
    }

    public Drawable getSelectorDrawable() {
        return this.G;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < this.f26508a.getChildCount(); i10++) {
            arrayList.add(Integer.valueOf(this.K.get(i10)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.f26508a;
    }

    public int getTabsCount() {
        return this.h;
    }

    public final void h(View view, int i10, int i11) {
        zl0 zl0Var;
        if (i11 >= 0) {
            if (view == null && this.D) {
                return;
            }
            int i12 = this.f26523n;
            if (i11 == i12 && (zl0Var = this.f26510b) != null) {
                zl0Var.w();
                return;
            }
            boolean z10 = i12 < i11;
            this.F = -1;
            this.P = i12;
            this.f26523n = i11;
            this.f26524r = i10;
            boolean z11 = this.D;
            m.i3 i3Var = this.W;
            if (z11) {
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                this.D = false;
            }
            this.O = 0.0f;
            this.D = true;
            this.f26528y = this.v;
            this.A = this.f26526w;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.getLayout();
                this.C = textView.getMeasuredWidth();
                this.B = i0.a.B(textView.getMeasuredWidth(), this.C, 2, textView.getLeft());
            }
            setEnabled(false);
            AndroidUtilities.runOnUIThread(i3Var, 16L);
            zl0 zl0Var2 = this.f26510b;
            if (zl0Var2 != null) {
                zl0Var2.b(i10, z10);
            }
            i(i11, true);
        }
    }

    public final void i(int i10, boolean z10) {
        if (this.h == 0 || this.F == i10) {
            return;
        }
        this.F = i10;
        TextView textView = (TextView) this.f26508a.getChildAt(i10);
        if (textView == null) {
            return;
        }
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

    public final void j(float f10, int i10) {
        int i11;
        int i12 = this.L.get(i10, -1);
        if (i12 >= 0 && (i11 = this.f26523n) != i12) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            ra1 ra1Var = this.f26508a;
            TextView textView = (TextView) ra1Var.getChildAt(i11);
            TextView textView2 = (TextView) ra1Var.getChildAt(i12);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.A = textView.getMeasuredWidth();
                this.f26528y = i0.a.B(textView.getMeasuredWidth(), this.A, 2, textView.getLeft());
                textView2.getLayout();
                this.C = textView2.getMeasuredWidth();
                this.B = i0.a.B(textView2.getMeasuredWidth(), this.C, 2, textView2.getLeft());
                k(textView2, textView, f10);
                if (f10 >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.I));
                    textView2.setTag(Integer.valueOf(this.H));
                }
                i(ra1Var.indexOfChild(textView2), true);
            }
            if (f10 >= 1.0f) {
                this.f26523n = i12;
                this.f26524r = i10;
            }
        }
    }

    public final void k(TextView textView, TextView textView2, float f10) {
        int i10 = this.H;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26512c;
        int iF = f(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int iF2 = f(org.telegram.ui.ActionBar.g6.v0(this.I, c6Var));
        int iRed = Color.red(iF);
        int iGreen = Color.green(iF);
        int iBlue = Color.blue(iF);
        int iAlpha = Color.alpha(iF);
        int iRed2 = Color.red(iF2);
        int iGreen2 = Color.green(iF2);
        int iBlue2 = Color.blue(iF2);
        int iAlpha2 = Color.alpha(iF2);
        textView2.setTextColor(Color.argb((int) (((iAlpha2 - iAlpha) * f10) + iAlpha), (int) (((iRed2 - iRed) * f10) + iRed), (int) (((iGreen2 - iGreen) * f10) + iGreen), (int) (((iBlue2 - iBlue) * f10) + iBlue)));
        textView.setTextColor(Color.argb((int) (((iAlpha - iAlpha2) * f10) + iAlpha2), (int) (((iRed - iRed2) * f10) + iRed2), (int) (((iGreen - iGreen2) * f10) + iGreen2), (int) (((iBlue - iBlue2) * f10) + iBlue2)));
        int i11 = this.f26528y;
        this.v = (int) (((this.B - i11) * f10) + i11);
        int i12 = this.A;
        this.f26526w = (int) (((this.C - i12) * f10) + i12);
        invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        if (this.f26527x != i15) {
            this.f26527x = i15;
            this.F = -1;
            if (this.D) {
                AndroidUtilities.cancelRunOnUIThread(this.W);
                this.D = false;
                setEnabled(true);
                zl0 zl0Var = this.f26510b;
                if (zl0Var != null) {
                    zl0Var.o0(1.0f);
                }
            }
            TextView textView = (TextView) this.f26508a.getChildAt(this.f26523n);
            if (textView != null) {
                textView.getLayout();
                this.f26526w = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i16 = this.f26526w;
                int iB = i0.a.B(measuredWidth, i16, 2, left);
                this.v = iB;
                int i17 = this.Q;
                if (i17 > 0 && (i14 = this.R) > 0) {
                    if (i17 != iB || i14 != i16) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.addUpdateListener(new lh.t4(this, i17 - iB, i14 - i16, 3));
                        valueAnimatorOfFloat.setDuration(200L);
                        valueAnimatorOfFloat.setInterpolator(er.f28122f);
                        valueAnimatorOfFloat.start();
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
        ra1 ra1Var = this.f26508a;
        int childCount = ra1Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = ra1Var.getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f10 = layoutParams.weight;
            int i13 = layoutParams.width;
            boolean z10 = this.f26515e;
            SparseIntArray sparseIntArray = this.N;
            if (z10) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i12);
            } else {
                int i14 = this.f26525s;
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
        float weightSum = ra1Var.getWeightSum();
        if (childCount == 1 || this.f26525s > size) {
            ra1Var.setWeightSum(0.0f);
        } else {
            ra1Var.setWeightSum(1.0f);
        }
        if (Math.abs(weightSum - ra1Var.getWeightSum()) > 0.1f) {
            ra1Var.requestLayout();
        }
        super.onMeasure(i10, i11);
        this.f26517f = getMeasuredWidth() < View.MeasureSpec.getSize(i10);
        b();
    }

    public void setAnimationIdicatorProgress(float f10) {
        this.E = f10;
        int i10 = this.f26523n;
        ra1 ra1Var = this.f26508a;
        TextView textView = (TextView) ra1Var.getChildAt(i10);
        TextView textView2 = (TextView) ra1Var.getChildAt(this.P);
        if (textView2 == null || textView == null) {
            return;
        }
        k(textView, textView2, f10);
        if (f10 >= 1.0f) {
            textView2.setTag(Integer.valueOf(this.I));
            textView.setTag(Integer.valueOf(this.H));
        }
        zl0 zl0Var = this.f26510b;
        if (zl0Var != null) {
            zl0Var.o0(f10);
        }
    }

    public void setBlurredBackground(lg.d dVar) {
        this.f26509a0 = dVar;
        dVar.setCallback(this);
    }

    public void setDelegate(zl0 zl0Var) {
        this.f26510b = zl0Var;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ra1 ra1Var = this.f26508a;
        int childCount = ra1Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ra1Var.getChildAt(i10).setEnabled(z10);
        }
    }

    public void setInitialTabId(int i10) {
        this.f26520h0 = true;
        this.f26524r = i10;
        int i11 = this.L.get(i10);
        if (((TextView) this.f26508a.getChildAt(i11)) != null) {
            this.f26523n = i11;
            this.f26527x = 0;
            c();
            requestLayout();
        }
    }

    public void setOpen(boolean z10) {
        if (z10 == this.f26521i0) {
            return;
        }
        this.f26521i0 = z10;
        setPadding(AndroidUtilities.dp(z10 ? 0.0f : 6.0f), getPaddingTop(), AndroidUtilities.dp(this.f26521i0 ? 0.0f : 6.0f), getPaddingBottom());
        invalidate();
        if (!this.f26517f) {
            this.f26513c0.set(this.f26514d0);
            this.f26516e0.d(0.0f, true);
            this.f26518f0.d(AndroidUtilities.dp(this.f26521i0 ? 6.0f : -6.0f), true);
        }
        b();
    }

    public void setReordering(boolean z10) {
        if (this.f26522j0 == z10) {
            return;
        }
        this.f26522j0 = z10;
        AndroidUtilities.forEachViews(this.f26508a, new j4.w0(18));
    }

    public void setUseMinimalWidth(boolean z10) {
        this.f26515e = z10;
        this.f26508a.setLayoutParams(new FrameLayout.LayoutParams(this.f26515e ? -2 : -1, -1));
    }

    public void setUseSameWidth(boolean z10) {
        this.d = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f26509a0 || super.verifyDrawable(drawable);
    }

    public int f(int i10) {
        return i10;
    }
}
