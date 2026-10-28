package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.xq0;
public final class q5 extends FrameLayout {
    public final int f22989a = 0;
    public int f22990b;
    public Object f22991c;
    public View d;
    public View e;
    public Object f22992f;
    public final Object h;

    public q5(xq0 xq0Var, Context context) {
        super(context);
        this.h = xq0Var;
    }

    public b6 a() {
        b6 b6Var = new b6(getContext());
        b6Var.setGravity(17);
        b6Var.setTextSize(14);
        b6Var.setTextColor(((r5) this.h).f23034c0);
        addView(b6Var, kb1.i(-2, -2, 51));
        return b6Var;
    }

    public void b(int i10) {
        r5 r5Var = (r5) this.h;
        b6[] b6VarArr = (b6[]) this.f22991c;
        if (b6VarArr[i10] != null) {
            return;
        }
        b6 b6Var = new b6(getContext());
        b6Var.setGravity(17);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setTextSize(17);
        b6Var.setTextColor(r5Var.f23032b0);
        b6Var.setEmojiColor(r5Var.f23032b0);
        b6Var.setDrawablePadding(AndroidUtilities.dp(4.0f));
        b6Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        b6Var.setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        b6VarArr[i10] = b6Var;
        addView(b6Var, 0, kb1.i(-2, -2, 51));
    }

    public void c(CharSequence charSequence) {
        this.f22992f = charSequence;
        b6 b6Var = (b6) this.e;
        int i10 = 8;
        if (b6Var != null) {
            b6Var.animate().cancel();
            ((b6) this.e).setVisibility(8);
        }
        if (((b6) this.d) == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.d = a();
        }
        ((b6) this.d).animate().cancel();
        ((b6) this.d).setAlpha(1.0f);
        ((b6) this.d).setTranslationY(0.0f);
        ((b6) this.d).k(charSequence);
        b6 b6Var2 = (b6) this.d;
        if (!TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        }
        b6Var2.setVisibility(i10);
        requestLayout();
    }

    public void d() {
        b6[] b6VarArr;
        r5 r5Var = (r5) this.h;
        for (b6 b6Var : (b6[]) this.f22991c) {
            if (b6Var != null) {
                b6Var.setTextColor(r5Var.f23032b0);
                b6Var.setEmojiColor(r5Var.f23032b0);
            }
        }
        b6 b6Var2 = (b6) this.d;
        if (b6Var2 != null) {
            b6Var2.setTextColor(r5Var.f23034c0);
        }
        b6 b6Var3 = (b6) this.e;
        if (b6Var3 != null) {
            b6Var3.setTextColor(r5Var.f23034c0);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int textHeight;
        switch (this.f22989a) {
            case 0:
                int i14 = i12 - i10;
                int i15 = i13 - i11;
                b6 b6Var = (b6) this.d;
                if (b6Var != null && b6Var.getVisibility() != 8) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b6[] b6VarArr = (b6[]) this.f22991c;
                for (b6 b6Var2 : b6VarArr) {
                    if (b6Var2 != null && b6Var2.getVisibility() != 8) {
                        if (z11) {
                            textHeight = AndroidUtilities.dp(5.0f) + (((i15 / 2) - b6Var2.getTextHeight()) / 2);
                        } else {
                            textHeight = (i15 - b6Var2.getTextHeight()) / 2;
                        }
                        int measuredWidth = (i14 - b6Var2.getMeasuredWidth()) / 2;
                        int paddingTop = textHeight - b6Var2.getPaddingTop();
                        b6Var2.layout(measuredWidth, paddingTop, b6Var2.getMeasuredWidth() + measuredWidth, b6Var2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z11) {
                    b6[] b6VarArr2 = {(b6) this.d, (b6) this.e};
                    for (int i16 = 0; i16 < 2; i16++) {
                        b6 b6Var3 = b6VarArr2[i16];
                        if (b6Var3 != null && b6Var3.getVisibility() != 8) {
                            int i17 = i15 / 2;
                            int textHeight2 = (((i17 - b6Var3.getTextHeight()) / 2) + i17) - AndroidUtilities.dp(2.0f);
                            int measuredWidth2 = (i14 - b6Var3.getMeasuredWidth()) / 2;
                            b6Var3.layout(measuredWidth2, textHeight2, b6Var3.getMeasuredWidth() + measuredWidth2, b6Var3.getTextHeight() + textHeight2);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt != b6VarArr[0] && childAt != b6VarArr[1] && childAt != ((b6) this.d) && childAt != ((b6) this.e) && childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int i19 = layoutParams.leftMargin;
                        int measuredHeight = (((i15 - childAt.getMeasuredHeight()) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i19, measuredHeight, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + measuredHeight);
                    }
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f22989a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                int max = Math.max(0, size - (this.f22990b * 2));
                b6[] b6VarArr = (b6[]) this.f22991c;
                for (b6 b6Var : b6VarArr) {
                    if (b6Var != null && b6Var.getVisibility() != 8) {
                        b6Var.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(b6Var.getPaddingBottom() + b6Var.getPaddingTop() + AndroidUtilities.dp(24.0f), Integer.MIN_VALUE));
                    }
                }
                b6 b6Var2 = (b6) this.d;
                if (b6Var2 != null && b6Var2.getVisibility() != 8) {
                    ((b6) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                b6 b6Var3 = (b6) this.e;
                if (b6Var3 != null && b6Var3.getVisibility() != 8) {
                    ((b6) this.e).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), Integer.MIN_VALUE));
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt != b6VarArr[0] && childAt != b6VarArr[1] && childAt != ((b6) this.d) && childAt != ((b6) this.e) && childAt.getVisibility() != 8) {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        q5 q5Var;
        switch (this.f22989a) {
            case 1:
                super.setTranslationX(f7);
                xq0 xq0Var = (xq0) this.h;
                q5[] q5VarArr = xq0Var.f45764n;
                if (xq0Var.f45766s && (q5Var = q5VarArr[0]) == this) {
                    xq0Var.h.i(Math.abs(q5Var.getTranslationX()) / q5VarArr[0].getMeasuredWidth(), q5VarArr[1].f22990b);
                    return;
                }
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    public q5(r5 r5Var, Context context) {
        super(context);
        this.h = r5Var;
        this.f22991c = new b6[2];
        setClipChildren(false);
    }
}
