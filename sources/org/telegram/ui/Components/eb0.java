package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class eb0 extends jl0 {
    public final lb0 T2;

    public eb0(lb0 lb0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = lb0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        lb0 lb0Var;
        float f9;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessages currentMessagesGroup2;
        lb0 lb0Var2 = this.T2;
        ih.j4 j4Var = lb0Var2.f30274b;
        boolean z12 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                ((org.telegram.ui.Cells.s1) childAt).Z3(j4Var.getMeasuredWidth(), j4Var.getBackgroundSizeY());
            }
        }
        int childCount = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.s1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                groupedMessages = currentMessagesGroup2;
            }
        }
        int i12 = 0;
        while (i12 < 3) {
            rb0 rb0Var = lb0Var2.V;
            ArrayList arrayList = rb0Var.A;
            eb0 eb0Var = lb0Var2.f30277f;
            rb0Var.A.clear();
            if (i12 != 2 || eb0Var.T1) {
                int i13 = 0;
                ?? r32 = z12;
                while (true) {
                    z10 = true;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt3 = eb0Var.getChildAt(i13);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= eb0Var.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = s1Var.getCurrentMessagesGroup()) != null && ((i12 != 0 || currentMessagesGroup.messages.size() != 1) && ((i12 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i12 != 0 || !s1Var.getMessageObject().deleted) && ((i12 != 1 || s1Var.getMessageObject().deleted) && ((i12 != 2 || s1Var.f25420kc) && (i12 == 2 || !s1Var.f25420kc))))))) {
                            if (!arrayList.contains(currentMessagesGroup)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                transitionParams.left = r32;
                                transitionParams.top = r32;
                                transitionParams.right = r32;
                                transitionParams.bottom = r32;
                                transitionParams.pinnedBotton = r32;
                                transitionParams.pinnedTop = r32;
                                transitionParams.cell = s1Var;
                                arrayList.add(currentMessagesGroup);
                            }
                            currentMessagesGroup.transitionParams.pinnedTop = s1Var.n3();
                            currentMessagesGroup.transitionParams.pinnedBotton = s1Var.m3();
                            int backgroundDrawableLeft = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                            int backgroundDrawableRight = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                            int backgroundDrawableTop = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                            int backgroundDrawableBottom = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                            if ((s1Var.getCurrentPosition().flags & 4) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            if ((s1Var.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom += AndroidUtilities.dp(10.0f);
                            }
                            if (s1Var.f25420kc) {
                                currentMessagesGroup.transitionParams.cell = s1Var;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            int i14 = transitionParams2.top;
                            if (i14 == 0 || backgroundDrawableTop < i14) {
                                transitionParams2.top = backgroundDrawableTop;
                            }
                            int i15 = transitionParams2.bottom;
                            if (i15 == 0 || backgroundDrawableBottom > i15) {
                                transitionParams2.bottom = backgroundDrawableBottom;
                            }
                            int i16 = transitionParams2.left;
                            if (i16 == 0 || backgroundDrawableLeft < i16) {
                                transitionParams2.left = backgroundDrawableLeft;
                            }
                            int i17 = transitionParams2.right;
                            if (i17 == 0 || backgroundDrawableRight > i17) {
                                transitionParams2.right = backgroundDrawableRight;
                            }
                        }
                    }
                    i13++;
                    r32 = 0;
                }
                int i18 = 0;
                while (i18 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i18);
                    if (groupedMessages2 == null) {
                        lb0Var = lb0Var2;
                    } else {
                        float E2 = groupedMessages2.transitionParams.cell.E2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f10 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                        float f11 = transitionParams3.top + transitionParams3.offsetTop;
                        float f12 = transitionParams3.right + E2 + transitionParams3.offsetRight;
                        float f13 = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (!transitionParams3.backgroundChangeBounds) {
                            f11 += transitionParams3.cell.getTranslationY();
                            f13 += groupedMessages2.transitionParams.cell.getTranslationY();
                        }
                        if (f11 < (-AndroidUtilities.dp(20.0f))) {
                            f11 = -AndroidUtilities.dp(20.0f);
                        }
                        if (f13 > AndroidUtilities.dp(20.0f) + eb0Var.getMeasuredHeight()) {
                            f13 = AndroidUtilities.dp(20.0f) + eb0Var.getMeasuredHeight();
                        }
                        if (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            canvas.save();
                            lb0Var = lb0Var2;
                            canvas2 = canvas;
                            f9 = 2.0f;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.recaptcha.internal.a.A(f12, f10, 2.0f, f10), com.google.android.recaptcha.internal.a.A(f13, f11, 2.0f, f11));
                        } else {
                            canvas2 = canvas;
                            lb0Var = lb0Var2;
                            f9 = 2.0f;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        transitionParams4.cell.B1(canvas2, (int) f10, (int) f11, (int) f12, (int) f13, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z11) {
                            canvas.restore();
                            for (int i19 = 0; i19 < childCount; i19++) {
                                View childAt4 = eb0Var.getChildAt(i19);
                                if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt4;
                                    if (s1Var2.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = s1Var2.getLeft();
                                        int top = s1Var2.getTop();
                                        childAt4.setPivotX(((f12 - f10) / f9) + (f10 - left));
                                        childAt4.setPivotY(((f13 - f11) / f9) + (f11 - top));
                                    }
                                }
                            }
                        }
                    }
                    i18++;
                    z10 = true;
                    lb0Var2 = lb0Var;
                }
            }
            i12++;
            z12 = false;
            lb0Var2 = lb0Var2;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            boolean drawChild = super.drawChild(canvas, view, j10);
            s1Var.K1(canvas);
            canvas.save();
            canvas.translate(s1Var.getX(), s1Var.getY());
            canvas.save();
            canvas.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX(), s1Var.getPivotY());
            s1Var.P1(canvas, true);
            s1Var.u3(true);
            s1Var.V1(canvas);
            if (s1Var.getCurrentMessagesGroup() == null || ((s1Var.getCurrentPosition() != null && (((s1Var.getCurrentPosition().flags & s1Var.t0()) != 0 && (s1Var.getCurrentPosition().flags & 1) != 0) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().isDocuments))) || s1Var.getTransitionParams().f25191w0)) {
                s1Var.I1(s1Var.getAlpha(), canvas, false);
                s1Var.d2(canvas, s1Var.getAlpha(), null);
                s1Var.N1(canvas, s1Var.getAlpha());
            }
            if (s1Var.getCurrentMessagesGroup() != null || s1Var.getTransitionParams().f25191w0) {
                s1Var.W1(canvas, s1Var.getAlpha());
            }
            if ((s1Var.getCurrentPosition() != null && s1Var.getCurrentPosition().last) || s1Var.getTransitionParams().f25191w0) {
                s1Var.m2(s1Var.getAlpha(), canvas, true);
            }
            s1Var.Y1(canvas);
            canvas.restore();
            s1Var.getTransitionParams().i();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            this.T2.f30276e.W();
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        this.T2.f30276e.H();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        lb0 lb0Var = this.T2;
        int i14 = lb0Var.f30273a;
        if (lb0Var.G) {
            if (i14 != 0) {
                u0(0);
            }
            lb0Var.G = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        lb0Var.i();
        eb0 eb0Var = lb0Var.f30277f;
        if (lb0Var.Q) {
            if (eb0Var.computeVerticalScrollRange() > eb0Var.computeVerticalScrollExtent()) {
                lb0Var.postDelayed(new xa0(lb0Var, 0), 0L);
            }
            lb0Var.Q = false;
        }
        if (lb0Var.J && i14 == 0) {
            int i15 = lb0Var.H;
            int i16 = lb0Var.I;
            lb0Var.J = false;
            post(new j3.y(this, i15, i16, 9));
        }
    }
}
