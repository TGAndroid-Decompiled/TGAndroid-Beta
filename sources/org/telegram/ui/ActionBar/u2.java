package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class u2 extends FrameLayout {
    public final int f20600a;
    public final Dialog f20601b;

    public u2(Dialog dialog, Context context, int i10) {
        super(context);
        this.f20600a = i10;
        this.f20601b = dialog;
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f20600a) {
            case 0:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int right;
        int left;
        int measuredWidth;
        int i16;
        switch (this.f20600a) {
            case 1:
                int childCount = getChildCount();
                int i17 = i12 - i10;
                int i18 = -1;
                if (((d2) this.f20601b).H0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i17 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - AndroidUtilities.dp(8.0f)) / 2);
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i16 = paddingRight - max;
                    } else {
                        i16 = paddingLeft;
                    }
                    if (!z10) {
                        paddingLeft = paddingRight - max;
                    }
                    int paddingTop = getPaddingTop();
                    int dp = AndroidUtilities.dp(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i16, paddingTop, i16 + max, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i16, dp, i16 + max, AndroidUtilities.dp(40.0f) + dp);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, dp, max + paddingLeft, AndroidUtilities.dp(40.0f) + dp);
                        return;
                    }
                    return;
                }
                View view = null;
                int i19 = 0;
                while (i19 < childCount) {
                    View childAt = getChildAt(i19);
                    Integer num = (Integer) childAt.getTag();
                    if (num != null) {
                        if (num.intValue() == i18) {
                            if (LocaleController.isRTL) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (LocaleController.isRTL) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.y3.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i17 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = org.telegram.ui.b.t(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (LocaleController.isRTL) {
                                if (findViewWithTag5 == null) {
                                    left = i17 - getPaddingRight();
                                    measuredWidth = childAt.getMeasuredWidth();
                                } else {
                                    left = findViewWithTag5.getLeft() - AndroidUtilities.dp(8.0f);
                                    measuredWidth = childAt.getMeasuredWidth();
                                }
                                int i20 = left - measuredWidth;
                                childAt.layout(i20, getPaddingTop(), childAt.getMeasuredWidth() + i20, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                if (findViewWithTag5 == null) {
                                    right = getPaddingLeft();
                                } else {
                                    right = findViewWithTag5.getRight() + AndroidUtilities.dp(8.0f);
                                }
                                childAt.layout(right, getPaddingTop(), childAt.getMeasuredWidth() + right, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -3) {
                            if (LocaleController.isRTL) {
                                childAt.layout((i17 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i17 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                    } else {
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (view != null) {
                            i15 = ((view.getMeasuredWidth() - measuredWidth2) / 2) + view.getLeft();
                            i14 = ((view.getMeasuredHeight() - measuredHeight) / 2) + view.getTop();
                        } else {
                            i14 = 0;
                            i15 = 0;
                        }
                        childAt.layout(i15, i14, measuredWidth2 + i15, measuredHeight + i14);
                    }
                    i19++;
                    i18 = -1;
                }
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f20600a) {
            case 1:
                super.onMeasure(i10, i11);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i12 = 0;
                if (((d2) this.f20601b).H0) {
                    int max = Math.max(0, (measuredWidth - AndroidUtilities.dp(8.0f)) / 2);
                    while (i12 < childCount) {
                        View childAt = getChildAt(i12);
                        if (childAt.getTag() != null) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                        }
                        i12++;
                    }
                    return;
                }
                int i13 = 0;
                while (i12 < childCount) {
                    View childAt2 = getChildAt(i12);
                    if ((childAt2 instanceof TextView) && childAt2.getTag() != null) {
                        i13 = childAt2.getMeasuredWidth() + i13;
                    }
                    i12++;
                }
                if (i13 > measuredWidth) {
                    View findViewWithTag = findViewWithTag(-2);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-3);
                    if (findViewWithTag != null && findViewWithTag3 != null) {
                        if (findViewWithTag.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i13 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i13 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                        if (findViewWithTag2.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i13 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i13 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f20600a) {
            case 0:
                super.setTranslationY(f10);
                g3 g3Var = (g3) this.f20601b;
                FrameLayout frameLayout = g3Var.topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(g3Var.container.getHeight() - g3Var.containerView.getY())) + g3Var.backgroundPaddingTop);
                }
                g3Var.onContainerTranslationYChanged(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
