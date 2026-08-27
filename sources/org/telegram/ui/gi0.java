package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class gi0 extends org.telegram.ui.Components.zk0 {
    public final ArrayList T2;
    public final org.telegram.ui.Components.y5 U2;
    public final org.telegram.ui.Components.y5 V2;
    public final v10 W2;
    public final ni0 X2;

    public gi0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.X2 = ni0Var;
        this.T2 = new ArrayList(10);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.U2 = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.V2 = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.W2 = new v10();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i10;
        ni0 ni0Var;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.GroupedMessages currentMessagesGroup2;
        gi0 gi0Var;
        ArrayList arrayList4;
        ni0 ni0Var2;
        MessageObject.GroupedMessages currentMessagesGroup3;
        MessageObject.GroupedMessages currentMessagesGroup4;
        ni0 ni0Var3 = this.X2;
        fi0 fi0Var = ni0Var3.C;
        int measuredHeight = fi0Var.getMeasuredHeight();
        gi0 gi0Var2 = ni0Var3.G;
        int childCount = gi0Var2.getChildCount();
        boolean z10 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = gi0Var2.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                RectF rectF = qg.j.h;
                qg.j.c(s1Var2, fi0Var, rectF);
                float f10 = rectF.top;
                int i12 = (int) f10;
                childAt.getMeasuredHeight();
                int i13 = i12 >= 0 ? 0 : -i12;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i13 + measuredHeight;
                }
                s1Var2.a4(i13, measuredHeight2 - i13, measuredHeight, f10, f10, fi0Var.getMeasuredWidth(), fi0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, 255, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.s1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != groupedMessages)) {
                groupedMessages = currentMessagesGroup4;
            }
        }
        int i15 = 0;
        while (true) {
            arrayList = this.T2;
            int i16 = 2;
            if (i15 >= 3) {
                break;
            }
            arrayList.clear();
            if (i15 != 2 || gi0Var2.T1) {
                int i17 = 0;
                ?? r10 = z10;
                while (i17 < childCount2) {
                    View childAt3 = gi0Var2.getChildAt(i17);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= gi0Var2.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = s1Var3.getCurrentMessagesGroup()) != null && ((i15 != 0 || currentMessagesGroup3.messages.size() != z11) && ((i15 != z11 || currentMessagesGroup3.transitionParams.drawBackgroundForDeletedItems) && ((i15 != 0 || !s1Var3.getMessageObject().deleted) && ((i15 != z11 || s1Var3.getMessageObject().deleted) && ((i15 != i16 || s1Var3.kc) && (i15 == i16 || !s1Var3.kc))))))) {
                            if (!arrayList.contains(currentMessagesGroup3)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup3.transitionParams;
                                transitionParams.left = r10;
                                transitionParams.top = r10;
                                transitionParams.right = r10;
                                transitionParams.bottom = r10;
                                transitionParams.pinnedBotton = r10;
                                transitionParams.pinnedTop = r10;
                                transitionParams.cell = s1Var3;
                                arrayList.add(currentMessagesGroup3);
                            }
                            currentMessagesGroup3.transitionParams.pinnedTop = s1Var3.m3();
                            currentMessagesGroup3.transitionParams.pinnedBotton = s1Var3.l3();
                            int x8 = (int) (s1Var3.getX() + s1Var3.getBackgroundDrawableLeft());
                            int x10 = (int) (s1Var3.getX() + s1Var3.getBackgroundDrawableRight());
                            int y10 = (int) (s1Var3.getY() + s1Var3.getPaddingTop() + s1Var3.getBackgroundDrawableTop());
                            int y11 = (int) (s1Var3.getY() + s1Var3.getPaddingTop() + s1Var3.getBackgroundDrawableBottom());
                            if ((s1Var3.getCurrentPosition().flags & 4) == 0) {
                                y10 -= AndroidUtilities.dp(10.0f);
                            }
                            if ((s1Var3.getCurrentPosition().flags & 8) == 0) {
                                y11 += AndroidUtilities.dp(10.0f);
                            }
                            if (s1Var3.kc) {
                                currentMessagesGroup3.transitionParams.cell = s1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup3.transitionParams;
                            int i18 = transitionParams2.top;
                            if (i18 == 0 || y10 < i18) {
                                transitionParams2.top = y10;
                            }
                            int i19 = transitionParams2.bottom;
                            if (i19 == 0 || y11 > i19) {
                                transitionParams2.bottom = y11;
                            }
                            int i20 = transitionParams2.left;
                            if (i20 == 0 || x8 < i20) {
                                transitionParams2.left = x8;
                            }
                            int i21 = transitionParams2.right;
                            if (i21 == 0 || x10 > i21) {
                                transitionParams2.right = x10;
                            }
                        }
                        i17++;
                        i16 = 2;
                        r10 = 0;
                    }
                    i17++;
                    i16 = 2;
                    r10 = 0;
                }
                int i22 = 0;
                while (i22 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i22);
                    if (groupedMessages2 == null) {
                        arrayList4 = arrayList;
                        gi0Var = gi0Var2;
                        ni0Var2 = ni0Var3;
                    } else {
                        float fD2 = groupedMessages2.transitionParams.cell.D2(z11);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f11 = transitionParams3.left + fD2 + transitionParams3.offsetLeft;
                        float f12 = transitionParams3.top + transitionParams3.offsetTop;
                        float f13 = transitionParams3.offsetRight + transitionParams3.right + fD2;
                        float fDp = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (f12 < (-AndroidUtilities.dp(20.0f))) {
                            f12 = -AndroidUtilities.dp(20.0f);
                        }
                        float f14 = f12;
                        if (fDp > AndroidUtilities.dp(20.0f) + gi0Var2.getMeasuredHeight()) {
                            fDp = AndroidUtilities.dp(20.0f) + gi0Var2.getMeasuredHeight();
                        }
                        float f15 = fDp;
                        boolean z12 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                        if (z12) {
                            canvas2.save();
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.recaptcha.internal.a.A(f13, f11, 2.0f, f11), com.google.android.recaptcha.internal.a.A(f15, f14, 2.0f, f14));
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        gi0Var = gi0Var2;
                        arrayList4 = arrayList;
                        ni0Var2 = ni0Var3;
                        transitionParams4.cell.A1(canvas2, (int) f11, (int) f14, (int) f13, (int) f15, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z12) {
                            canvas.restore();
                            for (int i23 = 0; i23 < childCount2; i23++) {
                                View childAt4 = gi0Var.getChildAt(i23);
                                if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                    org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt4;
                                    if (s1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = s1Var4.getLeft();
                                        int top = s1Var4.getTop();
                                        childAt4.setPivotX(((f13 - f11) / 2.0f) + (f11 - left));
                                        childAt4.setPivotY(((f15 - f14) / 2.0f) + (f14 - top));
                                    }
                                }
                            }
                        }
                    }
                    i22++;
                    canvas2 = canvas;
                    gi0Var2 = gi0Var;
                    ni0Var3 = ni0Var2;
                    arrayList = arrayList4;
                    z11 = true;
                }
            }
            i15++;
            canvas2 = canvas;
            gi0Var2 = gi0Var2;
            ni0Var3 = ni0Var3;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList5 = arrayList;
        gi0 gi0Var3 = gi0Var2;
        ni0 ni0Var4 = ni0Var3;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        MessageObject.GroupedMessages groupedMessages3 = null;
        int i24 = 0;
        while (i24 < childCount3) {
            View childAt5 = getChildAt(i24);
            if (!(childAt5 instanceof org.telegram.ui.Cells.s1) || ((currentMessagesGroup2 = (s1Var = (org.telegram.ui.Cells.s1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == groupedMessages3)) {
                ni0Var = ni0Var4;
            } else {
                if (currentMessagesGroup2 == null) {
                    float boundsLeft = s1Var.getBoundsLeft();
                    float y12 = s1Var.getY();
                    float boundsRight = s1Var.getBoundsRight();
                    float y13 = s1Var.getY() + s1Var.getHeight();
                    ni0Var = ni0Var4;
                    ni0Var.j(canvas, boundsLeft, y12, boundsRight, y13);
                } else {
                    ni0Var = ni0Var4;
                }
                groupedMessages3 = currentMessagesGroup2;
            }
            i24++;
            ni0Var4 = ni0Var;
        }
        ni0 ni0Var5 = ni0Var4;
        int i25 = 0;
        while (i25 < 3) {
            arrayList5.clear();
            if (i25 != 2 || gi0Var3.T1) {
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt6 = gi0Var3.getChildAt(i26);
                    if (childAt6 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) childAt6;
                        if (childAt6.getY() > gi0Var3.getHeight() || childAt6.getY() + childAt6.getHeight() < 0.0f || (currentMessagesGroup = s1Var5.getCurrentMessagesGroup()) == null) {
                            arrayList3 = arrayList5;
                        } else {
                            if (i25 == 0) {
                                i10 = 1;
                                if (currentMessagesGroup.messages.size() == 1) {
                                    arrayList3 = arrayList5;
                                }
                            } else {
                                i10 = 1;
                            }
                            if ((i25 != i10 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && (!(i25 == 0 && s1Var5.getMessageObject().deleted) && ((i25 != 1 || s1Var5.getMessageObject().deleted) && ((i25 != 2 || s1Var5.kc) && (i25 == 2 || !s1Var5.kc))))) {
                                arrayList3 = arrayList5;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup.transitionParams;
                                    transitionParams6.left = 0;
                                    transitionParams6.top = 0;
                                    transitionParams6.right = 0;
                                    transitionParams6.bottom = 0;
                                    transitionParams6.pinnedBotton = false;
                                    transitionParams6.pinnedTop = false;
                                    transitionParams6.cell = s1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                currentMessagesGroup.transitionParams.pinnedTop = s1Var5.m3();
                                currentMessagesGroup.transitionParams.pinnedBotton = s1Var5.l3();
                                int x11 = (int) (s1Var5.getX() + s1Var5.getBackgroundDrawableLeft());
                                int x12 = (int) (s1Var5.getX() + s1Var5.getBackgroundDrawableRight());
                                int y14 = (int) (s1Var5.getY() + s1Var5.getPaddingTop() + s1Var5.getBackgroundDrawableTop());
                                int y15 = (int) (s1Var5.getY() + s1Var5.getPaddingTop() + s1Var5.getBackgroundDrawableBottom());
                                if ((s1Var5.getCurrentPosition().flags & 4) == 0) {
                                    y14 -= AndroidUtilities.dp(10.0f);
                                }
                                if ((s1Var5.getCurrentPosition().flags & 8) == 0) {
                                    y15 += AndroidUtilities.dp(10.0f);
                                }
                                if (s1Var5.kc) {
                                    currentMessagesGroup.transitionParams.cell = s1Var5;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup.transitionParams;
                                int i27 = transitionParams7.top;
                                if (i27 == 0 || y14 < i27) {
                                    transitionParams7.top = y14;
                                }
                                int i28 = transitionParams7.bottom;
                                if (i28 == 0 || y15 > i28) {
                                    transitionParams7.bottom = y15;
                                }
                                int i29 = transitionParams7.left;
                                if (i29 == 0 || x11 < i29) {
                                    transitionParams7.left = x11;
                                }
                                int i30 = transitionParams7.right;
                                if (i30 == 0 || x12 > i30) {
                                    transitionParams7.right = x12;
                                }
                            } else {
                                arrayList3 = arrayList5;
                            }
                        }
                    } else {
                        arrayList3 = arrayList5;
                    }
                    i26++;
                    arrayList5 = arrayList3;
                }
                arrayList2 = arrayList5;
                for (int i31 = 0; i31 < arrayList2.size(); i31++) {
                    MessageObject.GroupedMessages groupedMessages4 = (MessageObject.GroupedMessages) arrayList2.get(i31);
                    float fD3 = groupedMessages4.transitionParams.cell.D2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams8 = groupedMessages4.transitionParams;
                    float f16 = transitionParams8.left + fD3 + transitionParams8.offsetLeft;
                    float f17 = transitionParams8.top + transitionParams8.offsetTop;
                    float f18 = transitionParams8.right + fD3 + transitionParams8.offsetRight;
                    float fDp2 = transitionParams8.bottom + transitionParams8.offsetBottom;
                    if (f17 < (-AndroidUtilities.dp(20.0f))) {
                        f17 = -AndroidUtilities.dp(20.0f);
                    }
                    if (fDp2 > AndroidUtilities.dp(20.0f) + gi0Var3.getMeasuredHeight()) {
                        fDp2 = AndroidUtilities.dp(20.0f) + gi0Var3.getMeasuredHeight();
                    }
                    ni0Var5.j(canvas, f16, f17, f18, fDp2);
                    groupedMessages4.transitionParams.cell = null;
                }
            } else {
                arrayList2 = arrayList5;
            }
            i25++;
            arrayList5 = arrayList2;
        }
        canvas.save();
        float fE = this.U2.e(canScrollVertically(-1));
        float fE2 = this.V2.e(canScrollVertically(1));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, getScrollY(), getWidth(), AndroidUtilities.dp(14.0f) + getScrollY());
        v10 v10Var = this.W2;
        v10Var.b(canvas, rectF2, 1, fE);
        rectF2.set(0.0f, (getHeight() + getScrollY()) - AndroidUtilities.dp(14.0f), getWidth(), getHeight() + getScrollY());
        v10Var.b(canvas, rectF2, 3, fE2);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        ni0 ni0Var = this.X2;
        if (ni0Var.f40869w && ((view == (s1Var = ni0Var.M) && s1Var != null && s1Var.getCurrentPosition() == null) || view == ni0Var.T)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            return true;
        }
        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
        s1Var2.setInvalidatesParent(true);
        s1Var2.J1(canvas);
        canvas.save();
        canvas.translate(s1Var2.getX(), s1Var2.getY());
        canvas.scale(s1Var2.getScaleX(), s1Var2.getScaleY(), s1Var2.getPivotX(), s1Var2.getPivotY());
        if (s1Var2.B1() && s1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, s1Var2.getPaddingTop());
            s1Var2.C1(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(s1Var2.getX(), s1Var2.getY() + s1Var2.getPaddingTop());
        canvas.scale(s1Var2.getScaleX(), s1Var2.getScaleY(), s1Var2.getPivotX(), s1Var2.getPivotY());
        if (s1Var2.getCurrentPosition() != null && (((s1Var2.getCurrentPosition().flags & s1Var2.s0()) != 0 && (s1Var2.getCurrentPosition().flags & 1) != 0) || (s1Var2.getCurrentMessagesGroup() != null && s1Var2.getCurrentMessagesGroup().isDocuments))) {
            s1Var2.H1(s1Var2.getAlpha(), canvas, false);
        }
        if (s1Var2.getCurrentPosition() != null && (((s1Var2.getCurrentPosition().flags & 8) != 0 && (s1Var2.getCurrentPosition().flags & 1) != 0) || (s1Var2.getCurrentMessagesGroup() != null && s1Var2.getCurrentMessagesGroup().isDocuments))) {
            s1Var2.c2(canvas, s1Var2.getAlpha(), null);
            s1Var2.M1(canvas, s1Var2.getAlpha());
        }
        if (s1Var2.getCurrentPosition() != null) {
            s1Var2.V1(canvas, s1Var2.getAlpha());
        }
        if (s1Var2.getCurrentPosition() == null || s1Var2.getCurrentPosition().last) {
            s1Var2.l2(s1Var2.getAlpha(), canvas, true);
        }
        s1Var2.W1(canvas);
        s1Var2.getTransitionParams().i();
        canvas.restore();
        s1Var2.setInvalidatesParent(false);
        return zDrawChild;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof mi0)) {
                mi0 mi0Var = (mi0) childAt;
                mi0Var.Be = childAt.getTop();
                mi0Var.Ce = childAt.getBottom();
                mi0Var.De = mi0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ni0 ni0Var = this.X2;
        int iDp = AndroidUtilities.dp(ni0Var.J.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = ni0Var.V;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (iDp + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - ni0Var.f40847e.f10490b), Integer.MIN_VALUE));
        int iMax = Math.max(AndroidUtilities.dp(12.0f) + (ni0Var.f40853i0 ? ni0Var.U : ni0Var.S.l()), -((AndroidUtilities.dp(7.0f) + ni0Var.f40855k0[0]) - getMeasuredWidth()));
        float fMax = Math.max(1, getMeasuredWidth() - iMax) / Math.max(1, ((getMeasuredWidth() - iMax) - AndroidUtilities.dp(8.0f)) + Math.max(0, ni0Var.K - ((getMeasuredWidth() - iMax) - AndroidUtilities.dp((ni0Var.L.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(fMax);
        setScaleY(fMax);
    }
}
