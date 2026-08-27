package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class ed extends org.telegram.ui.Components.zu0 {

    public final int f37730s0;

    public boolean f37731t0;

    public final org.telegram.ui.ActionBar.n2 f37732u0;

    public ed(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.f37730s0 = i10;
        this.f37732u0 = n2Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int paddingTop;
        org.telegram.ui.Components.tt ttVar;
        int measuredHeight;
        int measuredHeight2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int paddingTop2;
        org.telegram.ui.Components.tt ttVar2;
        int measuredHeight3;
        int measuredHeight4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int paddingTop3;
        org.telegram.ui.Components.tt ttVar3;
        int measuredHeight5;
        int measuredHeight6;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int paddingTop4;
        org.telegram.ui.Components.yy yyVar;
        int measuredHeight7;
        int measuredHeight8;
        switch (this.f37730s0) {
            case 0:
                id idVar = (id) this.f37732u0;
                int childCount = getChildCount();
                int iR = R();
                int emojiPadding = (iR > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : idVar.f39033c.getEmojiPadding();
                setBottomClip(emojiPadding);
                for (int i34 = 0; i34 < childCount; i34++) {
                    View childAt = getChildAt(i34);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight9 = childAt.getMeasuredHeight();
                        int i35 = layoutParams.gravity;
                        if (i35 == -1) {
                            i35 = 51;
                        }
                        int i36 = i35 & 112;
                        int i37 = i35 & 7;
                        if (i37 != 1) {
                            if (i37 != 5) {
                                i16 = layoutParams.leftMargin;
                            } else {
                                i14 = i12 - measuredWidth;
                                i15 = layoutParams.rightMargin;
                            }
                            if (i36 != 16) {
                                if (i36 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i36 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i17 = ((i13 - emojiPadding) - i11) - measuredHeight9;
                                    i18 = layoutParams.bottomMargin;
                                }
                                ttVar = idVar.f39033c;
                                if (ttVar != null && ttVar.l(childAt)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight() + iR;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    paddingTop = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i16, paddingTop, measuredWidth + i16, measuredHeight9 + paddingTop);
                            } else {
                                i17 = ((((i13 - emojiPadding) - i11) - measuredHeight9) / 2) + layoutParams.topMargin;
                                i18 = layoutParams.bottomMargin;
                            }
                            paddingTop = i17 - i18;
                            ttVar = idVar.f39033c;
                            if (ttVar != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iR;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i16, paddingTop, measuredWidth + i16, measuredHeight9 + paddingTop);
                        } else {
                            i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i15 = layoutParams.rightMargin;
                        }
                        i16 = i14 - i15;
                        if (i36 != 16) {
                            if (i36 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                            } else if (i36 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i17 = ((i13 - emojiPadding) - i11) - measuredHeight9;
                                i18 = layoutParams.bottomMargin;
                            }
                            ttVar = idVar.f39033c;
                            if (ttVar != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iR;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i16, paddingTop, measuredWidth + i16, measuredHeight9 + paddingTop);
                        } else {
                            i17 = ((((i13 - emojiPadding) - i11) - measuredHeight9) / 2) + layoutParams.topMargin;
                            i18 = layoutParams.bottomMargin;
                        }
                        paddingTop = i17 - i18;
                        ttVar = idVar.f39033c;
                        if (ttVar != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + iR;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i16, paddingTop, measuredWidth + i16, measuredHeight9 + paddingTop);
                    }
                }
                S();
                break;
            case 1:
                jo joVar = (jo) this.f37732u0;
                int childCount2 = getChildCount();
                int iR2 = R();
                int emojiPadding2 = (iR2 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : joVar.v.getEmojiPadding();
                setBottomClip(emojiPadding2);
                for (int i38 = 0; i38 < childCount2; i38++) {
                    View childAt2 = getChildAt(i38);
                    if (childAt2.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight10 = childAt2.getMeasuredHeight();
                        int i39 = layoutParams2.gravity;
                        if (i39 == -1) {
                            i39 = 51;
                        }
                        int i40 = i39 & 112;
                        int i41 = i39 & 7;
                        if (i41 != 1) {
                            if (i41 != 5) {
                                i21 = layoutParams2.leftMargin;
                            } else {
                                i19 = i12 - measuredWidth2;
                                i20 = layoutParams2.rightMargin;
                            }
                            if (i40 != 16) {
                                if (i40 != 48) {
                                    paddingTop2 = layoutParams2.topMargin + getPaddingTop();
                                } else if (i40 != 80) {
                                    paddingTop2 = layoutParams2.topMargin;
                                } else {
                                    i22 = ((i13 - emojiPadding2) - i11) - measuredHeight10;
                                    i23 = layoutParams2.bottomMargin;
                                }
                                ttVar2 = joVar.v;
                                if (ttVar2 != null && ttVar2.l(childAt2)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight3 = getMeasuredHeight();
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    } else {
                                        measuredHeight3 = getMeasuredHeight() + iR2;
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    }
                                    paddingTop2 = measuredHeight3 - measuredHeight4;
                                }
                                childAt2.layout(i21, paddingTop2, measuredWidth2 + i21, measuredHeight10 + paddingTop2);
                            } else {
                                i22 = ((((i13 - emojiPadding2) - i11) - measuredHeight10) / 2) + layoutParams2.topMargin;
                                i23 = layoutParams2.bottomMargin;
                            }
                            paddingTop2 = i22 - i23;
                            ttVar2 = joVar.v;
                            if (ttVar2 != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight3 = getMeasuredHeight();
                                    measuredHeight4 = childAt2.getMeasuredHeight();
                                } else {
                                    measuredHeight3 = getMeasuredHeight() + iR2;
                                    measuredHeight4 = childAt2.getMeasuredHeight();
                                }
                                paddingTop2 = measuredHeight3 - measuredHeight4;
                            }
                            childAt2.layout(i21, paddingTop2, measuredWidth2 + i21, measuredHeight10 + paddingTop2);
                        } else {
                            i19 = (((i12 - i10) - measuredWidth2) / 2) + layoutParams2.leftMargin;
                            i20 = layoutParams2.rightMargin;
                        }
                        i21 = i19 - i20;
                        if (i40 != 16) {
                            if (i40 != 48) {
                                paddingTop2 = layoutParams2.topMargin + getPaddingTop();
                            } else if (i40 != 80) {
                                paddingTop2 = layoutParams2.topMargin;
                            } else {
                                i22 = ((i13 - emojiPadding2) - i11) - measuredHeight10;
                                i23 = layoutParams2.bottomMargin;
                            }
                            ttVar2 = joVar.v;
                            if (ttVar2 != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight3 = getMeasuredHeight();
                                    measuredHeight4 = childAt2.getMeasuredHeight();
                                } else {
                                    measuredHeight3 = getMeasuredHeight() + iR2;
                                    measuredHeight4 = childAt2.getMeasuredHeight();
                                }
                                paddingTop2 = measuredHeight3 - measuredHeight4;
                            }
                            childAt2.layout(i21, paddingTop2, measuredWidth2 + i21, measuredHeight10 + paddingTop2);
                        } else {
                            i22 = ((((i13 - emojiPadding2) - i11) - measuredHeight10) / 2) + layoutParams2.topMargin;
                            i23 = layoutParams2.bottomMargin;
                        }
                        paddingTop2 = i22 - i23;
                        ttVar2 = joVar.v;
                        if (ttVar2 != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight3 = getMeasuredHeight();
                                measuredHeight4 = childAt2.getMeasuredHeight();
                            } else {
                                measuredHeight3 = getMeasuredHeight() + iR2;
                                measuredHeight4 = childAt2.getMeasuredHeight();
                            }
                            paddingTop2 = measuredHeight3 - measuredHeight4;
                        }
                        childAt2.layout(i21, paddingTop2, measuredWidth2 + i21, measuredHeight10 + paddingTop2);
                    }
                }
                S();
                break;
            case 2:
                u60 u60Var = (u60) this.f37732u0;
                int childCount3 = getChildCount();
                int iR3 = R();
                int emojiPadding3 = (iR3 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : u60Var.f43135c.getEmojiPadding();
                setBottomClip(emojiPadding3);
                for (int i42 = 0; i42 < childCount3; i42++) {
                    View childAt3 = getChildAt(i42);
                    if (childAt3.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) childAt3.getLayoutParams();
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight11 = childAt3.getMeasuredHeight();
                        int i43 = layoutParams3.gravity;
                        if (i43 == -1) {
                            i43 = 51;
                        }
                        int i44 = i43 & 112;
                        int i45 = i43 & 7;
                        if (i45 != 1) {
                            if (i45 != 5) {
                                i26 = layoutParams3.leftMargin;
                            } else {
                                i24 = i12 - measuredWidth3;
                                i25 = layoutParams3.rightMargin;
                            }
                            if (i44 != 16) {
                                if (i44 != 48) {
                                    paddingTop3 = layoutParams3.topMargin + getPaddingTop();
                                } else if (i44 != 80) {
                                    paddingTop3 = layoutParams3.topMargin;
                                } else {
                                    i27 = ((i13 - emojiPadding3) - i11) - measuredHeight11;
                                    i28 = layoutParams3.bottomMargin;
                                }
                                ttVar3 = u60Var.f43135c;
                                if (ttVar3 != null && ttVar3.l(childAt3)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight5 = getMeasuredHeight();
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    } else {
                                        measuredHeight5 = getMeasuredHeight() + iR3;
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    }
                                    paddingTop3 = measuredHeight5 - measuredHeight6;
                                }
                                childAt3.layout(i26, paddingTop3, measuredWidth3 + i26, measuredHeight11 + paddingTop3);
                            } else {
                                i27 = ((((i13 - emojiPadding3) - i11) - measuredHeight11) / 2) + layoutParams3.topMargin;
                                i28 = layoutParams3.bottomMargin;
                            }
                            paddingTop3 = i27 - i28;
                            ttVar3 = u60Var.f43135c;
                            if (ttVar3 != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight5 = getMeasuredHeight();
                                    measuredHeight6 = childAt3.getMeasuredHeight();
                                } else {
                                    measuredHeight5 = getMeasuredHeight() + iR3;
                                    measuredHeight6 = childAt3.getMeasuredHeight();
                                }
                                paddingTop3 = measuredHeight5 - measuredHeight6;
                            }
                            childAt3.layout(i26, paddingTop3, measuredWidth3 + i26, measuredHeight11 + paddingTop3);
                        } else {
                            i24 = (((i12 - i10) - measuredWidth3) / 2) + layoutParams3.leftMargin;
                            i25 = layoutParams3.rightMargin;
                        }
                        i26 = i24 - i25;
                        if (i44 != 16) {
                            if (i44 != 48) {
                                paddingTop3 = layoutParams3.topMargin + getPaddingTop();
                            } else if (i44 != 80) {
                                paddingTop3 = layoutParams3.topMargin;
                            } else {
                                i27 = ((i13 - emojiPadding3) - i11) - measuredHeight11;
                                i28 = layoutParams3.bottomMargin;
                            }
                            ttVar3 = u60Var.f43135c;
                            if (ttVar3 != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight5 = getMeasuredHeight();
                                    measuredHeight6 = childAt3.getMeasuredHeight();
                                } else {
                                    measuredHeight5 = getMeasuredHeight() + iR3;
                                    measuredHeight6 = childAt3.getMeasuredHeight();
                                }
                                paddingTop3 = measuredHeight5 - measuredHeight6;
                            }
                            childAt3.layout(i26, paddingTop3, measuredWidth3 + i26, measuredHeight11 + paddingTop3);
                        } else {
                            i27 = ((((i13 - emojiPadding3) - i11) - measuredHeight11) / 2) + layoutParams3.topMargin;
                            i28 = layoutParams3.bottomMargin;
                        }
                        paddingTop3 = i27 - i28;
                        ttVar3 = u60Var.f43135c;
                        if (ttVar3 != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight5 = getMeasuredHeight();
                                measuredHeight6 = childAt3.getMeasuredHeight();
                            } else {
                                measuredHeight5 = getMeasuredHeight() + iR3;
                                measuredHeight6 = childAt3.getMeasuredHeight();
                            }
                            paddingTop3 = measuredHeight5 - measuredHeight6;
                        }
                        childAt3.layout(i26, paddingTop3, measuredWidth3 + i26, measuredHeight11 + paddingTop3);
                    }
                }
                S();
                break;
            default:
                yu0 yu0Var = (yu0) this.f37732u0;
                int childCount4 = getChildCount();
                int iR4 = R();
                int i46 = (iR4 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : yu0Var.R;
                setBottomClip(i46);
                for (int i47 = 0; i47 < childCount4; i47++) {
                    View childAt4 = getChildAt(i47);
                    if (childAt4.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) childAt4.getLayoutParams();
                        int measuredWidth4 = childAt4.getMeasuredWidth();
                        int measuredHeight12 = childAt4.getMeasuredHeight();
                        int i48 = layoutParams4.gravity;
                        if (i48 == -1) {
                            i48 = 51;
                        }
                        int i49 = i48 & 112;
                        int i50 = i48 & 7;
                        if (i50 != 1) {
                            if (i50 != 5) {
                                i31 = layoutParams4.leftMargin;
                            } else {
                                i29 = i12 - measuredWidth4;
                                i30 = layoutParams4.rightMargin;
                            }
                            if (i49 != 16) {
                                if (i49 != 48) {
                                    paddingTop4 = layoutParams4.topMargin + getPaddingTop();
                                } else if (i49 != 80) {
                                    paddingTop4 = layoutParams4.topMargin;
                                } else {
                                    i32 = ((i13 - i46) - i11) - measuredHeight12;
                                    i33 = layoutParams4.bottomMargin;
                                }
                                yyVar = yu0Var.N;
                                if (yyVar != null && yyVar == childAt4) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight7 = getMeasuredHeight();
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    } else {
                                        measuredHeight7 = getMeasuredHeight() + iR4;
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    }
                                    paddingTop4 = measuredHeight7 - measuredHeight8;
                                }
                                childAt4.layout(i31, paddingTop4, measuredWidth4 + i31, measuredHeight12 + paddingTop4);
                            } else {
                                i32 = ((((i13 - i46) - i11) - measuredHeight12) / 2) + layoutParams4.topMargin;
                                i33 = layoutParams4.bottomMargin;
                            }
                            paddingTop4 = i32 - i33;
                            yyVar = yu0Var.N;
                            if (yyVar != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight7 = getMeasuredHeight();
                                    measuredHeight8 = childAt4.getMeasuredHeight();
                                } else {
                                    measuredHeight7 = getMeasuredHeight() + iR4;
                                    measuredHeight8 = childAt4.getMeasuredHeight();
                                }
                                paddingTop4 = measuredHeight7 - measuredHeight8;
                            }
                            childAt4.layout(i31, paddingTop4, measuredWidth4 + i31, measuredHeight12 + paddingTop4);
                        } else {
                            i29 = (((i12 - i10) - measuredWidth4) / 2) + layoutParams4.leftMargin;
                            i30 = layoutParams4.rightMargin;
                        }
                        i31 = i29 - i30;
                        if (i49 != 16) {
                            if (i49 != 48) {
                                paddingTop4 = layoutParams4.topMargin + getPaddingTop();
                            } else if (i49 != 80) {
                                paddingTop4 = layoutParams4.topMargin;
                            } else {
                                i32 = ((i13 - i46) - i11) - measuredHeight12;
                                i33 = layoutParams4.bottomMargin;
                            }
                            yyVar = yu0Var.N;
                            if (yyVar != null) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight7 = getMeasuredHeight();
                                    measuredHeight8 = childAt4.getMeasuredHeight();
                                } else {
                                    measuredHeight7 = getMeasuredHeight() + iR4;
                                    measuredHeight8 = childAt4.getMeasuredHeight();
                                }
                                paddingTop4 = measuredHeight7 - measuredHeight8;
                            }
                            childAt4.layout(i31, paddingTop4, measuredWidth4 + i31, measuredHeight12 + paddingTop4);
                        } else {
                            i32 = ((((i13 - i46) - i11) - measuredHeight12) / 2) + layoutParams4.topMargin;
                            i33 = layoutParams4.bottomMargin;
                        }
                        paddingTop4 = i32 - i33;
                        yyVar = yu0Var.N;
                        if (yyVar != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight7 = getMeasuredHeight();
                                measuredHeight8 = childAt4.getMeasuredHeight();
                            } else {
                                measuredHeight7 = getMeasuredHeight() + iR4;
                                measuredHeight8 = childAt4.getMeasuredHeight();
                            }
                            paddingTop4 = measuredHeight7 - measuredHeight8;
                        }
                        childAt4.layout(i31, paddingTop4, measuredWidth4 + i31, measuredHeight12 + paddingTop4);
                    }
                }
                S();
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f37730s0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                id idVar = (id) this.f37732u0;
                measureChildWithMargins(((org.telegram.ui.ActionBar.n2) idVar).actionBar, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.f37731t0 = true;
                    idVar.f39033c.j();
                    this.f37731t0 = false;
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((org.telegram.ui.ActionBar.n2) idVar).actionBar) {
                        org.telegram.ui.Components.tt ttVar = idVar.f39033c;
                        if (ttVar == null || !ttVar.l(childAt)) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight), 1073741824));
                        }
                    }
                }
                break;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                int paddingTop2 = size4 - getPaddingTop();
                jo joVar = (jo) this.f37732u0;
                measureChildWithMargins(((org.telegram.ui.ActionBar.n2) joVar).actionBar, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.f37731t0 = true;
                    joVar.v.j();
                    this.f37731t0 = false;
                }
                int childCount2 = getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != null && childAt2.getVisibility() != 8 && childAt2 != ((org.telegram.ui.ActionBar.n2) joVar).actionBar) {
                        org.telegram.ui.Components.tt ttVar2 = joVar.v;
                        if (ttVar2 == null || !ttVar2.l(childAt2)) {
                            measureChildWithMargins(childAt2, i10, 0, i11, 0);
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight)), 1073741824));
                        } else {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight), 1073741824));
                        }
                    }
                }
                break;
            case 2:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                int paddingTop3 = size6 - getPaddingTop();
                u60 u60Var = (u60) this.f37732u0;
                measureChildWithMargins(((org.telegram.ui.ActionBar.n2) u60Var).actionBar, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    org.telegram.ui.Components.tt ttVar3 = u60Var.f43135c;
                    if (!ttVar3.f32878e) {
                        this.f37731t0 = true;
                        ttVar3.j();
                        this.f37731t0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt3 = getChildAt(i14);
                    if (childAt3 != null && childAt3.getVisibility() != 8 && childAt3 != ((org.telegram.ui.ActionBar.n2) u60Var).actionBar) {
                        org.telegram.ui.Components.tt ttVar4 = u60Var.f43135c;
                        if (ttVar4 == null || !ttVar4.l(childAt3)) {
                            measureChildWithMargins(childAt3, i10, 0, i11, 0);
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight)), 1073741824));
                        } else {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight), 1073741824));
                        }
                    }
                }
                break;
            default:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                int paddingTop4 = size8 - getPaddingTop();
                yu0 yu0Var = (yu0) this.f37732u0;
                measureChildWithMargins(((org.telegram.ui.ActionBar.n2) yu0Var).actionBar, i10, 0, i11, 0);
                int iR = R();
                if (iR > AndroidUtilities.dp(20.0f) && !yu0Var.L && !yu0Var.f44948x0) {
                    this.f37731t0 = true;
                    yu0Var.l0();
                    this.f37731t0 = false;
                }
                int iDp = (iR > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : yu0Var.R;
                if (iR > AndroidUtilities.dp(20.0f) && yu0Var.f44948x0) {
                    iDp = AndroidUtilities.dp(120.0f);
                }
                int i15 = iDp;
                int childCount4 = getChildCount();
                for (int i16 = 0; i16 < childCount4; i16++) {
                    View childAt4 = getChildAt(i16);
                    if (childAt4 != null && childAt4.getVisibility() != 8 && childAt4 != ((org.telegram.ui.ActionBar.n2) yu0Var).actionBar) {
                        org.telegram.ui.Components.yy yyVar = yu0Var.N;
                        if (yyVar == null || yyVar != childAt4) {
                            if (yu0Var.f44920c == childAt4) {
                                childAt4.measure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i15, 1073741824));
                            } else {
                                measureChildWithMargins(childAt4, i10, 0, i11, 0);
                            }
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight)), 1073741824));
                        } else {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight), 1073741824));
                        }
                    }
                }
                break;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f37730s0) {
            case 0:
                if (!this.f37731t0) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!this.f37731t0) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
                if (!this.f37731t0) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.f37731t0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }
}
