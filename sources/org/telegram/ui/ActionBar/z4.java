package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.ui.fn0;
public final class z4 extends FrameLayout {
    public final int f30316a = 0;
    public int f30317b;
    public Object f30318c;
    public View d;
    public View f30319e;
    public Object f30320f;
    public final Object h;

    public z4(fn0 fn0Var, Context context) {
        super(context);
        this.h = fn0Var;
    }

    public n5 a() {
        n5 n5Var = new n5(getContext());
        n5Var.setGravity(17);
        n5Var.setTextSize(14);
        n5Var.setTextColor(((a5) this.h).f28768f0);
        addView(n5Var, ma.e(-2, -2, 51));
        return n5Var;
    }

    public void b(int i7) {
        a5 a5Var = (a5) this.h;
        n5[] n5VarArr = (n5[]) this.f30318c;
        if (n5VarArr[i7] != null) {
            return;
        }
        n5 n5Var = new n5(getContext());
        n5Var.setGravity(17);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(17);
        n5Var.setTextColor(a5Var.f28766e0);
        n5Var.setEmojiColor(a5Var.f28766e0);
        n5Var.setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        n5Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        n5Var.setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        n5VarArr[i7] = n5Var;
        addView(n5Var, 0, ma.e(-2, -2, 51));
    }

    public void c(CharSequence charSequence) {
        this.f30320f = charSequence;
        n5 n5Var = (n5) this.f30319e;
        int i7 = 8;
        if (n5Var != null) {
            n5Var.animate().cancel();
            ((n5) this.f30319e).setVisibility(8);
        }
        if (((n5) this.d) == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.d = a();
        }
        ((n5) this.d).animate().cancel();
        ((n5) this.d).setAlpha(1.0f);
        ((n5) this.d).setTranslationY(0.0f);
        ((n5) this.d).k(charSequence);
        n5 n5Var2 = (n5) this.d;
        if (!TextUtils.isEmpty(charSequence)) {
            i7 = 0;
        }
        n5Var2.setVisibility(i7);
        requestLayout();
    }

    public void d() {
        n5[] n5VarArr;
        a5 a5Var = (a5) this.h;
        for (n5 n5Var : (n5[]) this.f30318c) {
            if (n5Var != null) {
                n5Var.setTextColor(a5Var.f28766e0);
                n5Var.setEmojiColor(a5Var.f28766e0);
            }
        }
        n5 n5Var2 = (n5) this.d;
        if (n5Var2 != null) {
            n5Var2.setTextColor(a5Var.f28768f0);
        }
        n5 n5Var3 = (n5) this.f30319e;
        if (n5Var3 != null) {
            n5Var3.setTextColor(a5Var.f28768f0);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        int textHeight;
        switch (this.f30316a) {
            case 0:
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                n5 n5Var = (n5) this.d;
                if (n5Var != null && n5Var.getVisibility() != 8) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n5[] n5VarArr = (n5[]) this.f30318c;
                for (n5 n5Var2 : n5VarArr) {
                    if (n5Var2 != null && n5Var2.getVisibility() != 8) {
                        if (z11) {
                            textHeight = org.telegram.messenger.g0.L(5.0f) + (((i14 / 2) - n5Var2.getTextHeight()) / 2);
                        } else {
                            textHeight = (i14 - n5Var2.getTextHeight()) / 2;
                        }
                        int measuredWidth = (i13 - n5Var2.getMeasuredWidth()) / 2;
                        int paddingTop = textHeight - n5Var2.getPaddingTop();
                        n5Var2.layout(measuredWidth, paddingTop, n5Var2.getMeasuredWidth() + measuredWidth, n5Var2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z11) {
                    n5[] n5VarArr2 = {(n5) this.d, (n5) this.f30319e};
                    for (int i15 = 0; i15 < 2; i15++) {
                        n5 n5Var3 = n5VarArr2[i15];
                        if (n5Var3 != null && n5Var3.getVisibility() != 8) {
                            int i16 = i14 / 2;
                            int textHeight2 = (((i16 - n5Var3.getTextHeight()) / 2) + i16) - org.telegram.messenger.g0.L(2.0f);
                            int measuredWidth2 = (i13 - n5Var3.getMeasuredWidth()) / 2;
                            n5Var3.layout(measuredWidth2, textHeight2, n5Var3.getMeasuredWidth() + measuredWidth2, n5Var3.getTextHeight() + textHeight2);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt != n5VarArr[0] && childAt != n5VarArr[1] && childAt != ((n5) this.d) && childAt != ((n5) this.f30319e) && childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int i18 = layoutParams.leftMargin;
                        int measuredHeight = (((i14 - childAt.getMeasuredHeight()) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i18, measuredHeight, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + measuredHeight);
                    }
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f30316a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                int max = Math.max(0, size - (this.f30317b * 2));
                n5[] n5VarArr = (n5[]) this.f30318c;
                for (n5 n5Var : n5VarArr) {
                    if (n5Var != null && n5Var.getVisibility() != 8) {
                        n5Var.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(n5Var.getPaddingBottom() + n5Var.getPaddingTop() + org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
                    }
                }
                n5 n5Var2 = (n5) this.d;
                if (n5Var2 != null && n5Var2.getVisibility() != 8) {
                    ((n5) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                n5 n5Var3 = (n5) this.f30319e;
                if (n5Var3 != null && n5Var3.getVisibility() != 8) {
                    ((n5) this.f30319e).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != n5VarArr[0] && childAt != n5VarArr[1] && childAt != ((n5) this.d) && childAt != ((n5) this.f30319e) && childAt.getVisibility() != 8) {
                        measureChildWithMargins(childAt, i7, 0, i10, 0);
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f10) {
        z4 z4Var;
        switch (this.f30316a) {
            case 1:
                super.setTranslationX(f10);
                fn0 fn0Var = (fn0) this.h;
                z4[] z4VarArr = fn0Var.f47728n;
                if (fn0Var.f47730s && (z4Var = z4VarArr[0]) == this) {
                    fn0Var.h.i(Math.abs(z4Var.getTranslationX()) / z4VarArr[0].getMeasuredWidth(), z4VarArr[1].f30317b);
                    return;
                }
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    public z4(a5 a5Var, Context context) {
        super(context);
        this.h = a5Var;
        this.f30318c = new n5[2];
        setClipChildren(false);
    }
}
