package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;

public final class s2 extends FrameLayout {

    public final int f23758a;

    public final Dialog f23759b;

    public s2(Dialog dialog, Context context, int i10) {
        super(context);
        this.f23758a = i10;
        this.f23759b = dialog;
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f23758a) {
            case 0:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int measuredWidth;
        int left;
        int measuredWidth2;
        switch (this.f23758a) {
            case 1:
                int childCount = getChildCount();
                int i14 = i12 - i10;
                int i15 = -1;
                if (!((b2) this.f23759b).G0) {
                    View view = null;
                    int i16 = 0;
                    while (i16 < childCount) {
                        View childAt = getChildAt(i16);
                        Integer num = (Integer) childAt.getTag();
                        if (num == null) {
                            int measuredWidth3 = childAt.getMeasuredWidth();
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            if (view != null) {
                                measuredWidth = ((view.getMeasuredWidth() - measuredWidth3) / 2) + view.getLeft();
                                measuredHeight = ((view.getMeasuredHeight() - measuredHeight2) / 2) + view.getTop();
                            } else {
                                measuredHeight = 0;
                                measuredWidth = 0;
                            }
                            childAt.layout(measuredWidth, measuredHeight, measuredWidth3 + measuredWidth, measuredHeight2 + measuredHeight);
                        } else if (num.intValue() == i15) {
                            if (LocaleController.isRTL) {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout((i14 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i14 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                            view = childAt;
                        } else if (num.intValue() == -2) {
                            if (LocaleController.isRTL) {
                                int paddingLeft = getPaddingLeft();
                                if (view != null) {
                                    paddingLeft = org.telegram.messenger.y1.C(8.0f, view.getMeasuredWidth(), paddingLeft);
                                }
                                childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingRight = (i14 - getPaddingRight()) - childAt.getMeasuredWidth();
                                if (view != null) {
                                    paddingRight = rl.u(8.0f, view.getMeasuredWidth(), paddingRight);
                                }
                                childAt.layout(paddingRight, getPaddingTop(), childAt.getMeasuredWidth() + paddingRight, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -4) {
                            View viewFindViewWithTag = findViewWithTag(-3);
                            if (LocaleController.isRTL) {
                                if (viewFindViewWithTag == null) {
                                    left = i14 - getPaddingRight();
                                    measuredWidth2 = childAt.getMeasuredWidth();
                                } else {
                                    left = viewFindViewWithTag.getLeft() - AndroidUtilities.dp(8.0f);
                                    measuredWidth2 = childAt.getMeasuredWidth();
                                }
                                int i17 = left - measuredWidth2;
                                childAt.layout(i17, getPaddingTop(), childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                int paddingLeft2 = viewFindViewWithTag == null ? getPaddingLeft() : viewFindViewWithTag.getRight() + AndroidUtilities.dp(8.0f);
                                childAt.layout(paddingLeft2, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft2, childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        } else if (num.intValue() == -3) {
                            if (LocaleController.isRTL) {
                                childAt.layout((i14 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i14 - getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop());
                            } else {
                                childAt.layout(getPaddingLeft(), getPaddingTop(), childAt.getMeasuredWidth() + getPaddingLeft(), childAt.getMeasuredHeight() + getPaddingTop());
                            }
                        }
                        i16++;
                        i15 = -1;
                    }
                } else {
                    View viewFindViewWithTag2 = findViewWithTag(-3);
                    View viewFindViewWithTag3 = findViewWithTag(-4);
                    View viewFindViewWithTag4 = findViewWithTag(-2);
                    View viewFindViewWithTag5 = findViewWithTag(-1);
                    int paddingLeft3 = getPaddingLeft();
                    int paddingRight2 = i14 - getPaddingRight();
                    int iMax = Math.max(0, ((paddingRight2 - paddingLeft3) - AndroidUtilities.dp(8.0f)) / 2);
                    boolean z11 = LocaleController.isRTL;
                    int i18 = z11 ? paddingRight2 - iMax : paddingLeft3;
                    if (!z11) {
                        paddingLeft3 = paddingRight2 - iMax;
                    }
                    int paddingTop = getPaddingTop();
                    int iDp = AndroidUtilities.dp(44.0f) + paddingTop;
                    if (viewFindViewWithTag2 != null) {
                        viewFindViewWithTag2.layout(i18, paddingTop, i18 + iMax, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (viewFindViewWithTag3 != null) {
                        viewFindViewWithTag3.layout(paddingLeft3, paddingTop, paddingLeft3 + iMax, AndroidUtilities.dp(40.0f) + paddingTop);
                    }
                    if (viewFindViewWithTag4 != null) {
                        viewFindViewWithTag4.layout(i18, iDp, i18 + iMax, AndroidUtilities.dp(40.0f) + iDp);
                    }
                    if (viewFindViewWithTag5 != null) {
                        viewFindViewWithTag5.layout(paddingLeft3, iDp, iMax + paddingLeft3, AndroidUtilities.dp(40.0f) + iDp);
                    }
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f23758a) {
            case 1:
                super.onMeasure(i10, i11);
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int childCount = getChildCount();
                int i12 = 0;
                if (((b2) this.f23759b).G0) {
                    int iMax = Math.max(0, (measuredWidth - AndroidUtilities.dp(8.0f)) / 2);
                    while (i12 < childCount) {
                        View childAt = getChildAt(i12);
                        if (childAt.getTag() != null) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
                        }
                        i12++;
                    }
                    break;
                } else {
                    int measuredWidth2 = 0;
                    while (i12 < childCount) {
                        View childAt2 = getChildAt(i12);
                        if ((childAt2 instanceof TextView) && childAt2.getTag() != null) {
                            measuredWidth2 = childAt2.getMeasuredWidth() + measuredWidth2;
                        }
                        i12++;
                    }
                    if (measuredWidth2 > measuredWidth) {
                        View viewFindViewWithTag = findViewWithTag(-2);
                        View viewFindViewWithTag2 = findViewWithTag(-4);
                        View viewFindViewWithTag3 = findViewWithTag(-3);
                        if (viewFindViewWithTag != null && viewFindViewWithTag3 != null) {
                            if (viewFindViewWithTag.getMeasuredWidth() >= viewFindViewWithTag3.getMeasuredWidth()) {
                                viewFindViewWithTag.measure(View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag.getMeasuredWidth() - (measuredWidth2 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag.getMeasuredHeight(), 1073741824));
                            } else {
                                viewFindViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag3.getMeasuredWidth() - (measuredWidth2 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag3.getMeasuredHeight(), 1073741824));
                            }
                            break;
                        } else if (viewFindViewWithTag2 != null && viewFindViewWithTag3 != null) {
                            if (viewFindViewWithTag2.getMeasuredWidth() >= viewFindViewWithTag3.getMeasuredWidth()) {
                                viewFindViewWithTag2.measure(View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag2.getMeasuredWidth() - (measuredWidth2 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag2.getMeasuredHeight(), 1073741824));
                            } else {
                                viewFindViewWithTag3.measure(View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag3.getMeasuredWidth() - (measuredWidth2 - measuredWidth), 1073741824), View.MeasureSpec.makeMeasureSpec(viewFindViewWithTag3.getMeasuredHeight(), 1073741824));
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f23758a) {
            case 0:
                super.setTranslationY(f10);
                e3 e3Var = (e3) this.f23759b;
                FrameLayout frameLayout = e3Var.topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((-(e3Var.container.getHeight() - e3Var.containerView.getY())) + e3Var.backgroundPaddingTop);
                }
                e3Var.onContainerTranslationYChanged(f10);
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
