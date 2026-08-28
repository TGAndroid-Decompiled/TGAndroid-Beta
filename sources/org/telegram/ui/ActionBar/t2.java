package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
public final class t2 extends FrameLayout {
    public final int f23768a;
    public final Dialog f23769b;

    public t2(Dialog dialog, Context context, int i9) {
        super(context);
        this.f23768a = i9;
        this.f23769b = dialog;
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f23768a) {
            case 0:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int right;
        int left;
        int measuredWidth;
        int i15;
        switch (this.f23768a) {
            case 1:
                int childCount = getChildCount();
                int i16 = i11 - i9;
                int i17 = -1;
                if (((c2) this.f23769b).G0) {
                    View findViewWithTag = findViewWithTag(-3);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-2);
                    View findViewWithTag4 = findViewWithTag(-1);
                    int paddingLeft = getPaddingLeft();
                    int paddingRight = i16 - getPaddingRight();
                    int max = Math.max(0, ((paddingRight - paddingLeft) - AndroidUtilities.dp(8.0f)) / 2);
                    boolean z11 = LocaleController.isRTL;
                    if (z11) {
                        i15 = paddingRight - max;
                    } else {
                        i15 = paddingLeft;
                    }
                    if (!z11) {
                        paddingLeft = paddingRight - max;
                    }
                    int paddingTop = getPaddingTop();
                    int dp = AndroidUtilities.dp(44.0f) + paddingTop;
                    if (findViewWithTag != null) {
                        findViewWithTag.layout(i15, paddingTop, i15 + max, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (findViewWithTag2 != null) {
                        findViewWithTag2.layout(paddingLeft, paddingTop, paddingLeft + max, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (findViewWithTag3 != null) {
                        findViewWithTag3.layout(i15, dp, i15 + max, AndroidUtilities.dp(40.0f) + dp);
                    }
                    if (findViewWithTag4 != null) {
                        findViewWithTag4.layout(paddingLeft, dp, max + paddingLeft, AndroidUtilities.dp(40.0f) + dp);
                        return;
                    }
                    return;
                }
                View view = null;
                int i18 = 0;
                while (i18 < childCount) {
                    View childAt = getChildAt(i18);
                    Integer num = (Integer) childAt.getTag();
                    if (num != null) {
                        if (num.intValue() == i17) {
                            if (LocaleController.isRTL) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i16 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i16 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (LocaleController.isRTL) {
                                int paddingLeft2 = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft2 = org.telegram.messenger.l0.C(8.0f, view.getMeasuredWidth(), paddingLeft2);
                                }
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight2 = (i16 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight2 = ll.w(8.0f, view.getMeasuredWidth(), paddingRight2);
                                }
                                childAt.layout(paddingRight2, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View findViewWithTag5 = findViewWithTag(-3);
                            if (LocaleController.isRTL) {
                                if (findViewWithTag5 == null) {
                                    left = i16 - getPaddingRight();
                                    measuredWidth = childAt.getMeasuredWidth();
                                } else {
                                    left = findViewWithTag5.getLeft() - AndroidUtilities.dp(8.0f);
                                    measuredWidth = childAt.getMeasuredWidth();
                                }
                                int i19 = left - measuredWidth;
                                childAt.layout(i19, getPaddingTop(), childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + getPaddingTop());
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
                                childAt.layout((i16 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i16 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                    } else {
                        int measuredWidth2 = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (view != null) {
                            i14 = ((view.getMeasuredWidth() - measuredWidth2) / 2) + view.getLeft();
                            i13 = ((view.getMeasuredHeight() - measuredHeight) / 2) + view.getTop();
                        } else {
                            i13 = 0;
                            i14 = 0;
                        }
                        childAt.layout(i14, i13, measuredWidth2 + i14, measuredHeight + i13);
                    }
                    i18++;
                    i17 = -1;
                }
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f23768a) {
            case 1:
                super.onMeasure(i9, i10);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i11 = 0;
                if (((c2) this.f23769b).G0) {
                    int max = Math.max(0, (measuredWidth - AndroidUtilities.dp(8.0f)) / 2);
                    while (i11 < childCount) {
                        View childAt = getChildAt(i11);
                        if (childAt.getTag() != null) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(max, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                        }
                        i11++;
                    }
                    return;
                }
                int i12 = 0;
                while (i11 < childCount) {
                    View childAt2 = getChildAt(i11);
                    if ((childAt2 instanceof TextView) && childAt2.getTag() != null) {
                        i12 = childAt2.getMeasuredWidth() + i12;
                    }
                    i11++;
                }
                if (i12 > measuredWidth) {
                    View findViewWithTag = findViewWithTag(-2);
                    View findViewWithTag2 = findViewWithTag(-4);
                    View findViewWithTag3 = findViewWithTag(-3);
                    if (findViewWithTag != null && findViewWithTag3 != null) {
                        if (findViewWithTag.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i12 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredWidth() - (i12 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else if (findViewWithTag2 != null && findViewWithTag3 != null) {
                        if (findViewWithTag2.getMeasuredWidth() < findViewWithTag3.getMeasuredWidth()) {
                            findViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredWidth() - (i12 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag3.getMeasuredHeight(), 1073741824));
                            return;
                        } else {
                            findViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredWidth() - (i12 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(findViewWithTag2.getMeasuredHeight(), 1073741824));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f23768a) {
            case 0:
                super.setTranslationY(f10);
                f3 f3Var = (f3) this.f23769b;
                FrameLayout frameLayout = f3Var.topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(f3Var.container.getHeight() - f3Var.containerView.getY())) + f3Var.backgroundPaddingTop);
                }
                f3Var.onContainerTranslationYChanged(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
