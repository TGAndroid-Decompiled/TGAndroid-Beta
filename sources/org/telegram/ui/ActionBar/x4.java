package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.an0;
public final class x4 extends FrameLayout {
    public final int f28748a = 0;
    public int f28749b;
    public Object f28750c;
    public View d;
    public View f28751e;
    public Object f28752f;
    public final Object h;

    public x4(an0 an0Var, Context context) {
        super(context);
        this.h = an0Var;
    }

    public k5 a() {
        k5 k5Var = new k5(getContext());
        k5Var.setGravity(17);
        k5Var.setTextSize(14);
        k5Var.setTextColor(((y4) this.h).f28789e0);
        addView(k5Var, ha.e(-2, -2, 51));
        return k5Var;
    }

    public void b(int i7) {
        y4 y4Var = (y4) this.h;
        k5[] k5VarArr = (k5[]) this.f28750c;
        if (k5VarArr[i7] != null) {
            return;
        }
        k5 k5Var = new k5(getContext());
        k5Var.setGravity(17);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(17);
        k5Var.setTextColor(y4Var.f28787d0);
        k5Var.setEmojiColor(y4Var.f28787d0);
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        k5Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        k5Var.setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        k5VarArr[i7] = k5Var;
        addView(k5Var, 0, ha.e(-2, -2, 51));
    }

    public void c(CharSequence charSequence) {
        this.f28752f = charSequence;
        k5 k5Var = (k5) this.f28751e;
        int i7 = 8;
        if (k5Var != null) {
            k5Var.animate().cancel();
            ((k5) this.f28751e).setVisibility(8);
        }
        if (((k5) this.d) == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.d = a();
        }
        ((k5) this.d).animate().cancel();
        ((k5) this.d).setAlpha(1.0f);
        ((k5) this.d).setTranslationY(0.0f);
        ((k5) this.d).k(charSequence);
        k5 k5Var2 = (k5) this.d;
        if (!TextUtils.isEmpty(charSequence)) {
            i7 = 0;
        }
        k5Var2.setVisibility(i7);
        requestLayout();
    }

    public void d() {
        k5[] k5VarArr;
        y4 y4Var = (y4) this.h;
        for (k5 k5Var : (k5[]) this.f28750c) {
            if (k5Var != null) {
                k5Var.setTextColor(y4Var.f28787d0);
                k5Var.setEmojiColor(y4Var.f28787d0);
            }
        }
        k5 k5Var2 = (k5) this.d;
        if (k5Var2 != null) {
            k5Var2.setTextColor(y4Var.f28789e0);
        }
        k5 k5Var3 = (k5) this.f28751e;
        if (k5Var3 != null) {
            k5Var3.setTextColor(y4Var.f28789e0);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        int textHeight;
        switch (this.f28748a) {
            case 0:
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                k5 k5Var = (k5) this.d;
                if (k5Var != null && k5Var.getVisibility() != 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k5[] k5VarArr = (k5[]) this.f28750c;
                for (k5 k5Var2 : k5VarArr) {
                    if (k5Var2 != null && k5Var2.getVisibility() != 8) {
                        if (z10) {
                            textHeight = org.telegram.messenger.g0.L(5.0f) + (((i14 / 2) - k5Var2.getTextHeight()) / 2);
                        } else {
                            textHeight = (i14 - k5Var2.getTextHeight()) / 2;
                        }
                        int measuredWidth = (i13 - k5Var2.getMeasuredWidth()) / 2;
                        int paddingTop = textHeight - k5Var2.getPaddingTop();
                        k5Var2.layout(measuredWidth, paddingTop, k5Var2.getMeasuredWidth() + measuredWidth, k5Var2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z10) {
                    k5[] k5VarArr2 = {(k5) this.d, (k5) this.f28751e};
                    for (int i15 = 0; i15 < 2; i15++) {
                        k5 k5Var3 = k5VarArr2[i15];
                        if (k5Var3 != null && k5Var3.getVisibility() != 8) {
                            int i16 = i14 / 2;
                            int textHeight2 = (((i16 - k5Var3.getTextHeight()) / 2) + i16) - org.telegram.messenger.g0.L(2.0f);
                            int measuredWidth2 = (i13 - k5Var3.getMeasuredWidth()) / 2;
                            k5Var3.layout(measuredWidth2, textHeight2, k5Var3.getMeasuredWidth() + measuredWidth2, k5Var3.getTextHeight() + textHeight2);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt != k5VarArr[0] && childAt != k5VarArr[1] && childAt != ((k5) this.d) && childAt != ((k5) this.f28751e) && childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int i18 = layoutParams.leftMargin;
                        int measuredHeight = (((i14 - childAt.getMeasuredHeight()) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i18, measuredHeight, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + measuredHeight);
                    }
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f28748a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                int max = Math.max(0, size - (this.f28749b * 2));
                k5[] k5VarArr = (k5[]) this.f28750c;
                for (k5 k5Var : k5VarArr) {
                    if (k5Var != null && k5Var.getVisibility() != 8) {
                        k5Var.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(k5Var.getPaddingBottom() + k5Var.getPaddingTop() + org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
                    }
                }
                k5 k5Var2 = (k5) this.d;
                if (k5Var2 != null && k5Var2.getVisibility() != 8) {
                    ((k5) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                k5 k5Var3 = (k5) this.f28751e;
                if (k5Var3 != null && k5Var3.getVisibility() != 8) {
                    ((k5) this.f28751e).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != k5VarArr[0] && childAt != k5VarArr[1] && childAt != ((k5) this.d) && childAt != ((k5) this.f28751e) && childAt.getVisibility() != 8) {
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
        x4 x4Var;
        switch (this.f28748a) {
            case 1:
                super.setTranslationX(f10);
                an0 an0Var = (an0) this.h;
                x4[] x4VarArr = an0Var.f44060n;
                if (an0Var.f44062s && (x4Var = x4VarArr[0]) == this) {
                    an0Var.h.i(Math.abs(x4Var.getTranslationX()) / x4VarArr[0].getMeasuredWidth(), x4VarArr[1].f28749b);
                    return;
                }
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    public x4(y4 y4Var, Context context) {
        super(context);
        this.h = y4Var;
        this.f28750c = new k5[2];
        setClipChildren(false);
    }
}
