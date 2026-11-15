package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.ui.cn0;
public final class v4 extends FrameLayout {
    public final int f29754a = 0;
    public int f29755b;
    public Object f29756c;
    public View d;
    public View f29757e;
    public Object f29758f;
    public final Object h;

    public v4(cn0 cn0Var, Context context) {
        super(context);
        this.h = cn0Var;
    }

    public j5 a() {
        j5 j5Var = new j5(getContext());
        j5Var.setGravity(17);
        j5Var.setTextSize(14);
        j5Var.setTextColor(((w4) this.h).f29816f0);
        addView(j5Var, ja.e(-2, -2, 51));
        return j5Var;
    }

    public void b(int i7) {
        w4 w4Var = (w4) this.h;
        j5[] j5VarArr = (j5[]) this.f29756c;
        if (j5VarArr[i7] != null) {
            return;
        }
        j5 j5Var = new j5(getContext());
        j5Var.setGravity(17);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(17);
        j5Var.setTextColor(w4Var.f29814e0);
        j5Var.setEmojiColor(w4Var.f29814e0);
        j5Var.setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        j5Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        j5Var.setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        j5VarArr[i7] = j5Var;
        addView(j5Var, 0, ja.e(-2, -2, 51));
    }

    public void c(CharSequence charSequence) {
        this.f29758f = charSequence;
        j5 j5Var = (j5) this.f29757e;
        int i7 = 8;
        if (j5Var != null) {
            j5Var.animate().cancel();
            ((j5) this.f29757e).setVisibility(8);
        }
        if (((j5) this.d) == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.d = a();
        }
        ((j5) this.d).animate().cancel();
        ((j5) this.d).setAlpha(1.0f);
        ((j5) this.d).setTranslationY(0.0f);
        ((j5) this.d).k(charSequence);
        j5 j5Var2 = (j5) this.d;
        if (!TextUtils.isEmpty(charSequence)) {
            i7 = 0;
        }
        j5Var2.setVisibility(i7);
        requestLayout();
    }

    public void d() {
        j5[] j5VarArr;
        w4 w4Var = (w4) this.h;
        for (j5 j5Var : (j5[]) this.f29756c) {
            if (j5Var != null) {
                j5Var.setTextColor(w4Var.f29814e0);
                j5Var.setEmojiColor(w4Var.f29814e0);
            }
        }
        j5 j5Var2 = (j5) this.d;
        if (j5Var2 != null) {
            j5Var2.setTextColor(w4Var.f29816f0);
        }
        j5 j5Var3 = (j5) this.f29757e;
        if (j5Var3 != null) {
            j5Var3.setTextColor(w4Var.f29816f0);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11;
        int textHeight;
        switch (this.f29754a) {
            case 0:
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                j5 j5Var = (j5) this.d;
                if (j5Var != null && j5Var.getVisibility() != 8) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j5[] j5VarArr = (j5[]) this.f29756c;
                for (j5 j5Var2 : j5VarArr) {
                    if (j5Var2 != null && j5Var2.getVisibility() != 8) {
                        if (z11) {
                            textHeight = org.telegram.messenger.g0.L(5.0f) + (((i14 / 2) - j5Var2.getTextHeight()) / 2);
                        } else {
                            textHeight = (i14 - j5Var2.getTextHeight()) / 2;
                        }
                        int measuredWidth = (i13 - j5Var2.getMeasuredWidth()) / 2;
                        int paddingTop = textHeight - j5Var2.getPaddingTop();
                        j5Var2.layout(measuredWidth, paddingTop, j5Var2.getMeasuredWidth() + measuredWidth, j5Var2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z11) {
                    j5[] j5VarArr2 = {(j5) this.d, (j5) this.f29757e};
                    for (int i15 = 0; i15 < 2; i15++) {
                        j5 j5Var3 = j5VarArr2[i15];
                        if (j5Var3 != null && j5Var3.getVisibility() != 8) {
                            int i16 = i14 / 2;
                            int textHeight2 = (((i16 - j5Var3.getTextHeight()) / 2) + i16) - org.telegram.messenger.g0.L(2.0f);
                            int measuredWidth2 = (i13 - j5Var3.getMeasuredWidth()) / 2;
                            j5Var3.layout(measuredWidth2, textHeight2, j5Var3.getMeasuredWidth() + measuredWidth2, j5Var3.getTextHeight() + textHeight2);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt != j5VarArr[0] && childAt != j5VarArr[1] && childAt != ((j5) this.d) && childAt != ((j5) this.f29757e) && childAt.getVisibility() != 8) {
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
        switch (this.f29754a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                int max = Math.max(0, size - (this.f29755b * 2));
                j5[] j5VarArr = (j5[]) this.f29756c;
                for (j5 j5Var : j5VarArr) {
                    if (j5Var != null && j5Var.getVisibility() != 8) {
                        j5Var.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(j5Var.getPaddingBottom() + j5Var.getPaddingTop() + org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
                    }
                }
                j5 j5Var2 = (j5) this.d;
                if (j5Var2 != null && j5Var2.getVisibility() != 8) {
                    ((j5) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                j5 j5Var3 = (j5) this.f29757e;
                if (j5Var3 != null && j5Var3.getVisibility() != 8) {
                    ((j5) this.f29757e).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != j5VarArr[0] && childAt != j5VarArr[1] && childAt != ((j5) this.d) && childAt != ((j5) this.f29757e) && childAt.getVisibility() != 8) {
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
        v4 v4Var;
        switch (this.f29754a) {
            case 1:
                super.setTranslationX(f10);
                cn0 cn0Var = (cn0) this.h;
                v4[] v4VarArr = cn0Var.f46188n;
                if (cn0Var.f46190s && (v4Var = v4VarArr[0]) == this) {
                    cn0Var.h.i(Math.abs(v4Var.getTranslationX()) / v4VarArr[0].getMeasuredWidth(), v4VarArr[1].f29755b);
                    return;
                }
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    public v4(w4 w4Var, Context context) {
        super(context);
        this.h = w4Var;
        this.f29756c = new j5[2];
        setClipChildren(false);
    }
}
