package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class jc0 extends rm0 {
    public final qc0 V2;

    public jc0(qc0 qc0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V2 = qc0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        qc0 qc0Var;
        float f7;
        Canvas canvas2;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessages currentMessagesGroup2;
        qc0 qc0Var2 = this.V2;
        org.telegram.ui.v8 v8Var = qc0Var2.f30180b;
        boolean z12 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                ((org.telegram.ui.Cells.u1) childAt).Z3(v8Var.getMeasuredWidth(), v8Var.getBackgroundSizeY());
            }
        }
        int childCount = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if ((childAt2 instanceof org.telegram.ui.Cells.u1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.u1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                groupedMessages = currentMessagesGroup2;
            }
        }
        int i12 = 0;
        while (i12 < 3) {
            wc0 wc0Var = qc0Var2.f30183c0;
            ArrayList arrayList = wc0Var.E;
            jc0 jc0Var = qc0Var2.f30185f;
            wc0Var.E.clear();
            if (i12 != 2 || jc0Var.V1) {
                int i13 = z12 ? 1 : 0;
                ?? r32 = z12;
                while (true) {
                    z10 = true;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt3 = jc0Var.getChildAt(i13);
                    if (childAt3 instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt3;
                        if (childAt3.getY() <= jc0Var.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = u1Var.getCurrentMessagesGroup()) != null && ((i12 != 0 || currentMessagesGroup.messages.size() != 1) && ((i12 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i12 != 0 || !u1Var.getMessageObject().deleted) && ((i12 != 1 || u1Var.getMessageObject().deleted) && ((i12 != 2 || u1Var.f23320oc) && (i12 == 2 || !u1Var.f23320oc))))))) {
                            if (!arrayList.contains(currentMessagesGroup)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                transitionParams.left = r32;
                                transitionParams.top = r32;
                                transitionParams.right = r32;
                                transitionParams.bottom = r32;
                                transitionParams.pinnedBotton = r32;
                                transitionParams.pinnedTop = r32;
                                transitionParams.cell = u1Var;
                                arrayList.add(currentMessagesGroup);
                            }
                            currentMessagesGroup.transitionParams.pinnedTop = u1Var.n3();
                            currentMessagesGroup.transitionParams.pinnedBotton = u1Var.m3();
                            int backgroundDrawableLeft = u1Var.getBackgroundDrawableLeft() + u1Var.getLeft();
                            int backgroundDrawableRight = u1Var.getBackgroundDrawableRight() + u1Var.getLeft();
                            int backgroundDrawableTop = u1Var.getBackgroundDrawableTop() + u1Var.getPaddingTop() + u1Var.getTop();
                            int backgroundDrawableBottom = u1Var.getBackgroundDrawableBottom() + u1Var.getPaddingTop() + u1Var.getTop();
                            if ((u1Var.getCurrentPosition().flags & 4) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            if ((u1Var.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom += AndroidUtilities.dp(10.0f);
                            }
                            if (u1Var.f23320oc) {
                                currentMessagesGroup.transitionParams.cell = u1Var;
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
                        qc0Var = qc0Var2;
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
                        if (f13 > AndroidUtilities.dp(20.0f) + jc0Var.getMeasuredHeight()) {
                            f13 = AndroidUtilities.dp(20.0f) + jc0Var.getMeasuredHeight();
                        }
                        if (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if (z11) {
                            canvas.save();
                            qc0Var = qc0Var2;
                            f7 = 2.0f;
                            canvas2 = canvas;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.gms.internal.vision.e2.z(f12, f10, 2.0f, f10), com.google.android.gms.internal.vision.e2.z(f13, f11, 2.0f, f11));
                        } else {
                            qc0Var = qc0Var2;
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
                                View childAt4 = jc0Var.getChildAt(i19);
                                if (childAt4 instanceof org.telegram.ui.Cells.u1) {
                                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt4;
                                    if (u1Var2.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = u1Var2.getLeft();
                                        int top = u1Var2.getTop();
                                        childAt4.setPivotX(((f12 - f10) / f7) + (f10 - left));
                                        childAt4.setPivotY(((f13 - f11) / f7) + (f11 - top));
                                    }
                                }
                            }
                        }
                    }
                    i18++;
                    z10 = true;
                    qc0Var2 = qc0Var;
                }
            }
            i12++;
            z12 = false;
            qc0Var2 = qc0Var2;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean drawChild = super.drawChild(canvas, view, j3);
            u1Var.K1(canvas);
            canvas.save();
            canvas.translate(u1Var.getX(), u1Var.getY());
            canvas.save();
            canvas.scale(u1Var.getScaleX(), u1Var.getScaleY(), u1Var.getPivotX(), u1Var.getPivotY());
            u1Var.P1(canvas, true);
            u1Var.u3(true);
            u1Var.V1(canvas);
            if (u1Var.getCurrentMessagesGroup() == null || ((u1Var.getCurrentPosition() != null && (((u1Var.getCurrentPosition().flags & u1Var.t0()) != 0 && (u1Var.getCurrentPosition().flags & 1) != 0) || (u1Var.getCurrentMessagesGroup() != null && u1Var.getCurrentMessagesGroup().isDocuments))) || u1Var.getTransitionParams().f23023w0)) {
                u1Var.I1(u1Var.getAlpha(), canvas, false);
                u1Var.d2(canvas, u1Var.getAlpha(), null);
                u1Var.N1(canvas, u1Var.getAlpha());
            }
            if (u1Var.getCurrentMessagesGroup() != null || u1Var.getTransitionParams().f23023w0) {
                u1Var.W1(canvas, u1Var.getAlpha());
            }
            if ((u1Var.getCurrentPosition() != null && u1Var.getCurrentPosition().last) || u1Var.getTransitionParams().f23023w0) {
                u1Var.m2(u1Var.getAlpha(), canvas, true);
            }
            u1Var.Y1(canvas);
            canvas.restore();
            u1Var.getTransitionParams().i();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            this.V2.f30184e.V();
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        this.V2.f30184e.G();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        qc0 qc0Var = this.V2;
        int i14 = qc0Var.f30178a;
        if (qc0Var.K) {
            if (i14 != 0) {
                u0(0);
            }
            qc0Var.K = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        qc0Var.i();
        jc0 jc0Var = qc0Var.f30185f;
        if (qc0Var.U) {
            if (jc0Var.computeVerticalScrollRange() > jc0Var.computeVerticalScrollExtent()) {
                qc0Var.postDelayed(new cc0(qc0Var, 0), 0L);
            }
            qc0Var.U = false;
        }
        if (qc0Var.N && i14 == 0) {
            int i15 = qc0Var.L;
            int i16 = qc0Var.M;
            qc0Var.N = false;
            post(new gg.n(this, i15, i16, 9));
        }
    }
}
