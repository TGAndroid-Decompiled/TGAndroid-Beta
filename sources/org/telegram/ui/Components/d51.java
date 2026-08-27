package org.telegram.ui.Components;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class d51 extends zu0 {

    public final int f27654s0;

    public d51(Context context, org.telegram.ui.ActionBar.b5 b5Var, int i10) {
        super(context, b5Var);
        this.f27654s0 = i10;
    }

    @Override
    public boolean P() {
        switch (this.f27654s0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
            default:
                return super.P();
            case 4:
                return false;
        }
    }

    @Override
    public void addView(View view) {
        switch (this.f27654s0) {
            case 3:
                if (view instanceof yy) {
                    ViewGroup.LayoutParams layoutParams = ((yy) view).getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 87;
                    }
                    view.setLayoutParams(layoutParams);
                }
                super.addView(view);
                break;
            default:
                super.addView(view);
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        switch (this.f27654s0) {
            case 3:
                int childCount = getChildCount();
                int iR = R();
                int paddingLeft = getPaddingLeft();
                int paddingRight = (i12 - i10) - getPaddingRight();
                int paddingTop = getPaddingTop();
                int i20 = i13 - i11;
                int paddingBottom = i20 - getPaddingBottom();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = getChildAt(i21);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i22 = layoutParams.gravity;
                        if (i22 == -1) {
                            i22 = 51;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection());
                        int i23 = i22 & 112;
                        int i24 = absoluteGravity & 7;
                        if (i24 != 1) {
                            if (i24 != 5) {
                                i16 = layoutParams.leftMargin + paddingLeft;
                            } else {
                                i14 = paddingRight - measuredWidth;
                                i15 = layoutParams.rightMargin;
                            }
                            if (i23 == 16) {
                                i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                                i18 = layoutParams.bottomMargin;
                            } else if (i23 == 48 && i23 == 80) {
                                i17 = paddingBottom - measuredHeight;
                                i18 = layoutParams.bottomMargin;
                            } else {
                                i19 = i + paddingTop;
                                if (childAt instanceof yy) {
                                    if (AndroidUtilities.isTablet()) {
                                        i19 = i20 - measuredHeight;
                                    } else {
                                        i19 = (i20 + iR) - measuredHeight;
                                    }
                                }
                                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                            }
                            i19 = i17 - i18;
                            if (childAt instanceof yy) {
                                if (AndroidUtilities.isTablet()) {
                                    i19 = i20 - measuredHeight;
                                } else {
                                    i19 = (i20 + iR) - measuredHeight;
                                }
                            }
                            childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                        } else {
                            i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                            i15 = layoutParams.rightMargin;
                        }
                        i16 = i14 - i15;
                        if (i23 == 16) {
                            int i25 = i23 == 48 ? layoutParams.topMargin : layoutParams.topMargin;
                            i19 = i25 + paddingTop;
                            if (childAt instanceof yy) {
                                if (AndroidUtilities.isTablet()) {
                                    i19 = i20 - measuredHeight;
                                } else {
                                    i19 = (i20 + iR) - measuredHeight;
                                }
                            }
                            childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                        } else {
                            i17 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                            i18 = layoutParams.bottomMargin;
                        }
                        i19 = i17 - i18;
                        if (childAt instanceof yy) {
                            if (AndroidUtilities.isTablet()) {
                                i19 = i20 - measuredHeight;
                            } else {
                                i19 = (i20 + iR) - measuredHeight;
                            }
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    }
                }
                S();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f27654s0) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
