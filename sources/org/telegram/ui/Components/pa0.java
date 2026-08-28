package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class pa0 extends wk0 {
    public final wa0 T2;

    public pa0(wa0 wa0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.T2 = wa0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        wa0 wa0Var;
        float f10;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessages currentMessagesGroup2;
        wa0 wa0Var2 = this.T2;
        fh.x4 x4Var = wa0Var2.f34169b;
        boolean z12 = false;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                ((org.telegram.ui.Cells.t1) childAt).Z3(x4Var.getMeasuredWidth(), x4Var.getBackgroundSizeY());
            }
        }
        int childCount = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.t1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                groupedMessages = currentMessagesGroup2;
            }
        }
        int i11 = 0;
        while (i11 < 3) {
            cb0 cb0Var = wa0Var2.V;
            ArrayList arrayList = cb0Var.A;
            pa0 pa0Var = wa0Var2.f34172f;
            cb0Var.A.clear();
            if (i11 != 2 || pa0Var.T1) {
                int i12 = 0;
                ?? r32 = z12;
                while (true) {
                    z10 = true;
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt3 = pa0Var.getChildAt(i12);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= pa0Var.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = t1Var.getCurrentMessagesGroup()) != null && ((i11 != 0 || currentMessagesGroup.messages.size() != 1) && ((i11 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i11 != 0 || !t1Var.getMessageObject().deleted) && ((i11 != 1 || t1Var.getMessageObject().deleted) && ((i11 != 2 || t1Var.f25455kc) && (i11 == 2 || !t1Var.f25455kc))))))) {
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
                            if (t1Var.f25455kc) {
                                currentMessagesGroup.transitionParams.cell = t1Var;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            int i13 = transitionParams2.top;
                            if (i13 == 0 || backgroundDrawableTop < i13) {
                                transitionParams2.top = backgroundDrawableTop;
                            }
                            int i14 = transitionParams2.bottom;
                            if (i14 == 0 || backgroundDrawableBottom > i14) {
                                transitionParams2.bottom = backgroundDrawableBottom;
                            }
                            int i15 = transitionParams2.left;
                            if (i15 == 0 || backgroundDrawableLeft < i15) {
                                transitionParams2.left = backgroundDrawableLeft;
                            }
                            int i16 = transitionParams2.right;
                            if (i16 == 0 || backgroundDrawableRight > i16) {
                                transitionParams2.right = backgroundDrawableRight;
                            }
                        }
                    }
                    i12++;
                    r32 = 0;
                }
                int i17 = 0;
                while (i17 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i17);
                    if (groupedMessages2 == null) {
                        wa0Var = wa0Var2;
                    } else {
                        float E2 = groupedMessages2.transitionParams.cell.E2(z10);
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
                        if (f14 > AndroidUtilities.dp(20.0f) + pa0Var.getMeasuredHeight()) {
                            f14 = AndroidUtilities.dp(20.0f) + pa0Var.getMeasuredHeight();
                        }
                        if (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            canvas.save();
                            wa0Var = wa0Var2;
                            canvas2 = canvas;
                            f10 = 2.0f;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), e2.c.A(f13, f11, 2.0f, f11), e2.c.A(f14, f12, 2.0f, f12));
                        } else {
                            canvas2 = canvas;
                            wa0Var = wa0Var2;
                            f10 = 2.0f;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        transitionParams4.cell.B1(canvas2, (int) f11, (int) f12, (int) f13, (int) f14, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z11) {
                            canvas.restore();
                            for (int i18 = 0; i18 < childCount; i18++) {
                                View childAt4 = pa0Var.getChildAt(i18);
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
                    i17++;
                    z10 = true;
                    wa0Var2 = wa0Var;
                }
            }
            i11++;
            z12 = false;
            wa0Var2 = wa0Var2;
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
            if (t1Var.getCurrentMessagesGroup() == null || ((t1Var.getCurrentPosition() != null && (((t1Var.getCurrentPosition().flags & t1Var.s0()) != 0 && (t1Var.getCurrentPosition().flags & 1) != 0) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().isDocuments))) || t1Var.getTransitionParams().f25235w0)) {
                t1Var.I1(t1Var.getAlpha(), canvas, false);
                t1Var.d2(canvas, t1Var.getAlpha(), null);
                t1Var.N1(canvas, t1Var.getAlpha());
            }
            if (t1Var.getCurrentMessagesGroup() != null || t1Var.getTransitionParams().f25235w0) {
                t1Var.W1(canvas, t1Var.getAlpha());
            }
            if ((t1Var.getCurrentPosition() != null && t1Var.getCurrentPosition().last) || t1Var.getTransitionParams().f25235w0) {
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
    public final void j0(int i9) {
        if (i9 == 0) {
            this.T2.f34171e.W();
        }
    }

    @Override
    public final void k0(int i9, int i10) {
        this.T2.f34171e.H();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wa0 wa0Var = this.T2;
        int i13 = wa0Var.f34168a;
        if (wa0Var.G) {
            if (i13 != 0) {
                u0(0);
            }
            wa0Var.G = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        wa0Var.i();
        pa0 pa0Var = wa0Var.f34172f;
        if (wa0Var.Q) {
            if (pa0Var.computeVerticalScrollRange() > pa0Var.computeVerticalScrollExtent()) {
                wa0Var.postDelayed(new ja0(wa0Var, 0), 0L);
            }
            wa0Var.Q = false;
        }
        if (wa0Var.J && i13 == 0) {
            int i14 = wa0Var.H;
            int i15 = wa0Var.I;
            wa0Var.J = false;
            post(new h3.y(this, i14, i15, 10));
        }
    }
}
