package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.dn0;
public final class y4 extends FrameLayout {
    public final int f28790a = 0;
    public int f28791b;
    public Object f28792c;
    public View d;
    public View f28793e;
    public Object f28794f;
    public final Object h;

    public y4(dn0 dn0Var, Context context) {
        super(context);
        this.h = dn0Var;
    }

    public m5 a() {
        m5 m5Var = new m5(getContext());
        m5Var.setGravity(17);
        m5Var.setTextSize(14);
        m5Var.setTextColor(((z4) this.h).f28827e0);
        addView(m5Var, ha.e(-2, -2, 51));
        return m5Var;
    }

    public void b(int i7) {
        z4 z4Var = (z4) this.h;
        m5[] m5VarArr = (m5[]) this.f28792c;
        if (m5VarArr[i7] != null) {
            return;
        }
        m5 m5Var = new m5(getContext());
        m5Var.setGravity(17);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(17);
        m5Var.setTextColor(z4Var.f28825d0);
        m5Var.setEmojiColor(z4Var.f28825d0);
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        m5Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        m5Var.setRightDrawableTopPadding(-org.telegram.messenger.g0.L(1.0f));
        m5VarArr[i7] = m5Var;
        addView(m5Var, 0, ha.e(-2, -2, 51));
    }

    public void c(CharSequence charSequence) {
        this.f28794f = charSequence;
        m5 m5Var = (m5) this.f28793e;
        int i7 = 8;
        if (m5Var != null) {
            m5Var.animate().cancel();
            ((m5) this.f28793e).setVisibility(8);
        }
        if (((m5) this.d) == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.d = a();
        }
        ((m5) this.d).animate().cancel();
        ((m5) this.d).setAlpha(1.0f);
        ((m5) this.d).setTranslationY(0.0f);
        ((m5) this.d).k(charSequence);
        m5 m5Var2 = (m5) this.d;
        if (!TextUtils.isEmpty(charSequence)) {
            i7 = 0;
        }
        m5Var2.setVisibility(i7);
        requestLayout();
    }

    public void d() {
        m5[] m5VarArr;
        z4 z4Var = (z4) this.h;
        for (m5 m5Var : (m5[]) this.f28792c) {
            if (m5Var != null) {
                m5Var.setTextColor(z4Var.f28825d0);
                m5Var.setEmojiColor(z4Var.f28825d0);
            }
        }
        m5 m5Var2 = (m5) this.d;
        if (m5Var2 != null) {
            m5Var2.setTextColor(z4Var.f28827e0);
        }
        m5 m5Var3 = (m5) this.f28793e;
        if (m5Var3 != null) {
            m5Var3.setTextColor(z4Var.f28827e0);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        int textHeight;
        switch (this.f28790a) {
            case 0:
                int i13 = i11 - i7;
                int i14 = i12 - i10;
                m5 m5Var = (m5) this.d;
                if (m5Var != null && m5Var.getVisibility() != 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m5[] m5VarArr = (m5[]) this.f28792c;
                for (m5 m5Var2 : m5VarArr) {
                    if (m5Var2 != null && m5Var2.getVisibility() != 8) {
                        if (z10) {
                            textHeight = org.telegram.messenger.g0.L(5.0f) + (((i14 / 2) - m5Var2.getTextHeight()) / 2);
                        } else {
                            textHeight = (i14 - m5Var2.getTextHeight()) / 2;
                        }
                        int measuredWidth = (i13 - m5Var2.getMeasuredWidth()) / 2;
                        int paddingTop = textHeight - m5Var2.getPaddingTop();
                        m5Var2.layout(measuredWidth, paddingTop, m5Var2.getMeasuredWidth() + measuredWidth, m5Var2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z10) {
                    m5[] m5VarArr2 = {(m5) this.d, (m5) this.f28793e};
                    for (int i15 = 0; i15 < 2; i15++) {
                        m5 m5Var3 = m5VarArr2[i15];
                        if (m5Var3 != null && m5Var3.getVisibility() != 8) {
                            int i16 = i14 / 2;
                            int textHeight2 = (((i16 - m5Var3.getTextHeight()) / 2) + i16) - org.telegram.messenger.g0.L(2.0f);
                            int measuredWidth2 = (i13 - m5Var3.getMeasuredWidth()) / 2;
                            m5Var3.layout(measuredWidth2, textHeight2, m5Var3.getMeasuredWidth() + measuredWidth2, m5Var3.getTextHeight() + textHeight2);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt != m5VarArr[0] && childAt != m5VarArr[1] && childAt != ((m5) this.d) && childAt != ((m5) this.f28793e) && childAt.getVisibility() != 8) {
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
        switch (this.f28790a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                int max = Math.max(0, size - (this.f28791b * 2));
                m5[] m5VarArr = (m5[]) this.f28792c;
                for (m5 m5Var : m5VarArr) {
                    if (m5Var != null && m5Var.getVisibility() != 8) {
                        m5Var.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m5Var.getPaddingBottom() + m5Var.getPaddingTop() + org.telegram.messenger.g0.L(24.0f), Integer.MIN_VALUE));
                    }
                }
                m5 m5Var2 = (m5) this.d;
                if (m5Var2 != null && m5Var2.getVisibility() != 8) {
                    ((m5) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                m5 m5Var3 = (m5) this.f28793e;
                if (m5Var3 != null && m5Var3.getVisibility() != 8) {
                    ((m5) this.f28793e).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != m5VarArr[0] && childAt != m5VarArr[1] && childAt != ((m5) this.d) && childAt != ((m5) this.f28793e) && childAt.getVisibility() != 8) {
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
        y4 y4Var;
        switch (this.f28790a) {
            case 1:
                super.setTranslationX(f10);
                dn0 dn0Var = (dn0) this.h;
                y4[] y4VarArr = dn0Var.f45019n;
                if (dn0Var.f45021s && (y4Var = y4VarArr[0]) == this) {
                    dn0Var.h.i(Math.abs(y4Var.getTranslationX()) / y4VarArr[0].getMeasuredWidth(), y4VarArr[1].f28791b);
                    return;
                }
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    public y4(z4 z4Var, Context context) {
        super(context);
        this.h = z4Var;
        this.f28792c = new m5[2];
        setClipChildren(false);
    }
}
