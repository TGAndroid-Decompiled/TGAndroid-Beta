package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class kb0 extends tl0 {
    public final sb0 U2;

    public kb0(sb0 sb0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = sb0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        boolean z10;
        Canvas canvas2;
        sb0 sb0Var;
        float f10;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessages currentMessagesGroup2;
        sb0 sb0Var2 = this.U2;
        lh.j4 j4Var = sb0Var2.f31028b;
        boolean z11 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                ((org.telegram.ui.Cells.t1) childAt).Z3(j4Var.getMeasuredWidth(), j4Var.getBackgroundSizeY());
            }
        }
        int childCount = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.t1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                groupedMessages = currentMessagesGroup2;
            }
        }
        int i12 = 0;
        while (i12 < 3) {
            yb0 yb0Var = sb0Var2.W;
            ArrayList arrayList = yb0Var.B;
            kb0 kb0Var = sb0Var2.f31031f;
            yb0Var.B.clear();
            if (i12 != 2 || kb0Var.U1) {
                int i13 = 0;
                ?? r32 = z11;
                while (true) {
                    z4 = true;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt3 = kb0Var.getChildAt(i13);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= kb0Var.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = t1Var.getCurrentMessagesGroup()) != null && ((i12 != 0 || currentMessagesGroup.messages.size() != 1) && ((i12 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i12 != 0 || !t1Var.getMessageObject().deleted) && ((i12 != 1 || t1Var.getMessageObject().deleted) && ((i12 != 2 || t1Var.f23937lc) && (i12 == 2 || !t1Var.f23937lc))))))) {
                            if (!arrayList.contains(currentMessagesGroup)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                transitionParams.left = r32;
                                transitionParams.top = r32;
                                transitionParams.right = r32;
                                transitionParams.bottom = r32;
                                transitionParams.pinnedBotton = r32;
                                transitionParams.pinnedTop = r32;
                                transitionParams.cell = t1Var;
                                arrayList.add(currentMessagesGroup);
                            }
                            currentMessagesGroup.transitionParams.pinnedTop = t1Var.n3();
                            currentMessagesGroup.transitionParams.pinnedBotton = t1Var.m3();
                            int backgroundDrawableLeft = t1Var.getBackgroundDrawableLeft() + t1Var.getLeft();
                            int backgroundDrawableRight = t1Var.getBackgroundDrawableRight() + t1Var.getLeft();
                            int backgroundDrawableTop = t1Var.getBackgroundDrawableTop() + t1Var.getPaddingTop() + t1Var.getTop();
                            int backgroundDrawableBottom = t1Var.getBackgroundDrawableBottom() + t1Var.getPaddingTop() + t1Var.getTop();
                            if ((t1Var.getCurrentPosition().flags & 4) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            if ((t1Var.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom += AndroidUtilities.dp(10.0f);
                            }
                            if (t1Var.f23937lc) {
                                currentMessagesGroup.transitionParams.cell = t1Var;
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
                        sb0Var = sb0Var2;
                    } else {
                        float E2 = groupedMessages2.transitionParams.cell.E2(z4);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f11 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                        float f12 = transitionParams3.top + transitionParams3.offsetTop;
                        float f13 = transitionParams3.right + E2 + transitionParams3.offsetRight;
                        float f14 = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (!transitionParams3.backgroundChangeBounds) {
                            f12 += transitionParams3.cell.getTranslationY();
                            f14 += groupedMessages2.transitionParams.cell.getTranslationY();
                        }
                        if (f12 < (-AndroidUtilities.dp(20.0f))) {
                            f12 = -AndroidUtilities.dp(20.0f);
                        }
                        if (f14 > AndroidUtilities.dp(20.0f) + kb0Var.getMeasuredHeight()) {
                            f14 = AndroidUtilities.dp(20.0f) + kb0Var.getMeasuredHeight();
                        }
                        if (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            canvas.save();
                            sb0Var = sb0Var2;
                            canvas2 = canvas;
                            f10 = 2.0f;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), e2.c.x(f13, f11, 2.0f, f11), e2.c.x(f14, f12, 2.0f, f12));
                        } else {
                            canvas2 = canvas;
                            sb0Var = sb0Var2;
                            f10 = 2.0f;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        transitionParams4.cell.B1(canvas2, (int) f11, (int) f12, (int) f13, (int) f14, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z10) {
                            canvas.restore();
                            for (int i19 = 0; i19 < childCount; i19++) {
                                View childAt4 = kb0Var.getChildAt(i19);
                                if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt4;
                                    if (t1Var2.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = t1Var2.getLeft();
                                        int top = t1Var2.getTop();
                                        childAt4.setPivotX(((f13 - f11) / f10) + (f11 - left));
                                        childAt4.setPivotY(((f14 - f12) / f10) + (f12 - top));
                                    }
                                }
                            }
                        }
                    }
                    i18++;
                    z4 = true;
                    sb0Var2 = sb0Var;
                }
            }
            i12++;
            z11 = false;
            sb0Var2 = sb0Var2;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean drawChild = super.drawChild(canvas, view, j10);
            t1Var.K1(canvas);
            canvas.save();
            canvas.translate(t1Var.getX(), t1Var.getY());
            canvas.save();
            canvas.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX(), t1Var.getPivotY());
            t1Var.P1(canvas, true);
            t1Var.u3(true);
            t1Var.V1(canvas);
            if (t1Var.getCurrentMessagesGroup() == null || ((t1Var.getCurrentPosition() != null && (((t1Var.getCurrentPosition().flags & t1Var.t0()) != 0 && (t1Var.getCurrentPosition().flags & 1) != 0) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().isDocuments))) || t1Var.getTransitionParams().f23706w0)) {
                t1Var.I1(t1Var.getAlpha(), canvas, false);
                t1Var.d2(canvas, t1Var.getAlpha(), null);
                t1Var.N1(canvas, t1Var.getAlpha());
            }
            if (t1Var.getCurrentMessagesGroup() != null || t1Var.getTransitionParams().f23706w0) {
                t1Var.W1(canvas, t1Var.getAlpha());
            }
            if ((t1Var.getCurrentPosition() != null && t1Var.getCurrentPosition().last) || t1Var.getTransitionParams().f23706w0) {
                t1Var.m2(t1Var.getAlpha(), canvas, true);
            }
            t1Var.Y1(canvas);
            canvas.restore();
            t1Var.getTransitionParams().i();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            this.U2.f31030e.W();
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        this.U2.f31030e.H();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        sb0 sb0Var = this.U2;
        int i14 = sb0Var.f31027a;
        if (sb0Var.H) {
            if (i14 != 0) {
                u0(0);
            }
            sb0Var.H = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        sb0Var.i();
        kb0 kb0Var = sb0Var.f31031f;
        if (sb0Var.R) {
            if (kb0Var.computeVerticalScrollRange() > kb0Var.computeVerticalScrollExtent()) {
                sb0Var.postDelayed(new eb0(sb0Var, 0), 0L);
            }
            sb0Var.R = false;
        }
        if (sb0Var.K && i14 == 0) {
            int i15 = sb0Var.I;
            int i16 = sb0Var.J;
            sb0Var.K = false;
            post(new j3.v(this, i15, i16, 9));
        }
    }
}
