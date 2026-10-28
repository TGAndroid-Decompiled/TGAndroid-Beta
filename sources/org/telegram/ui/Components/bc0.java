package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class bc0 extends nm0 {
    public final ic0 f26802f3;

    public bc0(ic0 ic0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f26802f3 = ic0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ic0 ic0Var;
        float f7;
        Canvas canvas2;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessages currentMessagesGroup2;
        ic0 ic0Var2 = this.f26802f3;
        org.telegram.ui.a9 a9Var = ic0Var2.f29303b;
        boolean z12 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                ((org.telegram.ui.Cells.s1) childAt).b4(a9Var.getMeasuredWidth(), a9Var.getBackgroundSizeY());
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
            oc0 oc0Var = ic0Var2.f29306c0;
            ArrayList arrayList = oc0Var.E;
            bc0 bc0Var = ic0Var2.f29307f;
            oc0Var.E.clear();
            if (i12 != 2 || bc0Var.V1) {
                int i13 = z12 ? 1 : 0;
                ?? r32 = z12;
                while (true) {
                    z10 = true;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt3 = bc0Var.getChildAt(i13);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= bc0Var.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = s1Var.getCurrentMessagesGroup()) != null && ((i12 != 0 || currentMessagesGroup.messages.size() != 1) && ((i12 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i12 != 0 || !s1Var.getMessageObject().deleted) && ((i12 != 1 || s1Var.getMessageObject().deleted) && ((i12 != 2 || s1Var.f25227oc) && (i12 == 2 || !s1Var.f25227oc))))))) {
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
                            if (s1Var.f25227oc) {
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
                        ic0Var = ic0Var2;
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
                        if (f13 > AndroidUtilities.dp(20.0f) + bc0Var.getMeasuredHeight()) {
                            f13 = AndroidUtilities.dp(20.0f) + bc0Var.getMeasuredHeight();
                        }
                        if (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if (z11) {
                            canvas.save();
                            ic0Var = ic0Var2;
                            f7 = 2.0f;
                            canvas2 = canvas;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), c3.h0.B(f12, f10, 2.0f, f10), c3.h0.B(f13, f11, 2.0f, f11));
                        } else {
                            ic0Var = ic0Var2;
                            f7 = 2.0f;
                            canvas2 = canvas;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        transitionParams4.cell.B1(canvas2, (int) f10, (int) f11, (int) f12, (int) f13, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z11) {
                            canvas.restore();
                            for (int i19 = 0; i19 < childCount; i19++) {
                                View childAt4 = bc0Var.getChildAt(i19);
                                if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt4;
                                    if (s1Var2.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = s1Var2.getLeft();
                                        int top = s1Var2.getTop();
                                        childAt4.setPivotX(((f12 - f10) / f7) + (f10 - left));
                                        childAt4.setPivotY(((f13 - f11) / f7) + (f11 - top));
                                    }
                                }
                            }
                        }
                    }
                    i18++;
                    z10 = true;
                    ic0Var2 = ic0Var;
                }
            }
            i12++;
            z12 = false;
            ic0Var2 = ic0Var2;
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
            s1Var.w3(true);
            s1Var.V1(canvas);
            if (s1Var.getCurrentMessagesGroup() == null || ((s1Var.getCurrentPosition() != null && (((s1Var.getCurrentPosition().flags & s1Var.s0()) != 0 && (s1Var.getCurrentPosition().flags & 1) != 0) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().isDocuments))) || s1Var.getTransitionParams().f24943w0)) {
                s1Var.I1(s1Var.getAlpha(), canvas, false);
                s1Var.d2(canvas, s1Var.getAlpha(), null);
                s1Var.N1(canvas, s1Var.getAlpha());
            }
            if (s1Var.getCurrentMessagesGroup() != null || s1Var.getTransitionParams().f24943w0) {
                s1Var.W1(canvas, s1Var.getAlpha());
            }
            if ((s1Var.getCurrentPosition() != null && s1Var.getCurrentPosition().last) || s1Var.getTransitionParams().f24943w0) {
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
    public final void k0(int i10) {
        if (i10 == 0) {
            this.f26802f3.e.V();
        }
    }

    @Override
    public final void l0(int i10) {
        this.f26802f3.e.G();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ic0 ic0Var = this.f26802f3;
        int i14 = ic0Var.f29301a;
        if (ic0Var.K) {
            if (i14 != 0) {
                v0(0);
            }
            ic0Var.K = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        ic0Var.j();
        bc0 bc0Var = ic0Var.f29307f;
        if (ic0Var.U) {
            if (bc0Var.computeVerticalScrollRange() > bc0Var.computeVerticalScrollExtent()) {
                ic0Var.postDelayed(new ub0(ic0Var, 0), 0L);
            }
            ic0Var.U = false;
        }
        if (ic0Var.N && i14 == 0) {
            int i15 = ic0Var.L;
            int i16 = ic0Var.M;
            ic0Var.N = false;
            post(new i2.v(this, i15, i16, 10));
        }
    }
}
