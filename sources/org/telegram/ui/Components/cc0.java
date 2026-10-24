package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class cc0 extends lm0 {
    public final jc0 Y2;

    public cc0(jc0 jc0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.Y2 = jc0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        jc0 jc0Var;
        float f7;
        Canvas canvas2;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessages currentMessagesGroup2;
        jc0 jc0Var2 = this.Y2;
        org.telegram.ui.y8 y8Var = jc0Var2.f27671b;
        boolean z12 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                ((org.telegram.ui.Cells.t1) childAt).Y3(y8Var.getMeasuredWidth(), y8Var.getBackgroundSizeY());
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
            pc0 pc0Var = jc0Var2.f27674c0;
            ArrayList arrayList = pc0Var.E;
            cc0 cc0Var = jc0Var2.f27675f;
            pc0Var.E.clear();
            if (i12 != 2 || cc0Var.V1) {
                int i13 = z12 ? 1 : 0;
                ?? r32 = z12;
                while (true) {
                    z10 = true;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt3 = cc0Var.getChildAt(i13);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= cc0Var.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = t1Var.getCurrentMessagesGroup()) != null && ((i12 != 0 || currentMessagesGroup.messages.size() != 1) && ((i12 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i12 != 0 || !t1Var.getMessageObject().deleted) && ((i12 != 1 || t1Var.getMessageObject().deleted) && ((i12 != 2 || t1Var.oc) && (i12 == 2 || !t1Var.oc))))))) {
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
                            currentMessagesGroup.transitionParams.pinnedTop = t1Var.m3();
                            currentMessagesGroup.transitionParams.pinnedBotton = t1Var.l3();
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
                            if (t1Var.oc) {
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
                        jc0Var = jc0Var2;
                    } else {
                        float D2 = groupedMessages2.transitionParams.cell.D2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f10 = transitionParams3.left + D2 + transitionParams3.offsetLeft;
                        float f11 = transitionParams3.top + transitionParams3.offsetTop;
                        float f12 = transitionParams3.right + D2 + transitionParams3.offsetRight;
                        float f13 = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (!transitionParams3.backgroundChangeBounds) {
                            f11 += transitionParams3.cell.getTranslationY();
                            f13 += groupedMessages2.transitionParams.cell.getTranslationY();
                        }
                        if (f11 < (-AndroidUtilities.dp(20.0f))) {
                            f11 = -AndroidUtilities.dp(20.0f);
                        }
                        if (f13 > AndroidUtilities.dp(20.0f) + cc0Var.getMeasuredHeight()) {
                            f13 = AndroidUtilities.dp(20.0f) + cc0Var.getMeasuredHeight();
                        }
                        if (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if (z11) {
                            canvas.save();
                            jc0Var = jc0Var2;
                            f7 = 2.0f;
                            canvas2 = canvas;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.gms.internal.play_billing.k3.z(f12, f10, 2.0f, f10), com.google.android.gms.internal.play_billing.k3.z(f13, f11, 2.0f, f11));
                        } else {
                            jc0Var = jc0Var2;
                            f7 = 2.0f;
                            canvas2 = canvas;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        transitionParams4.cell.A1(canvas2, (int) f10, (int) f11, (int) f12, (int) f13, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z11) {
                            canvas.restore();
                            for (int i19 = 0; i19 < childCount; i19++) {
                                View childAt4 = cc0Var.getChildAt(i19);
                                if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt4;
                                    if (t1Var2.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = t1Var2.getLeft();
                                        int top = t1Var2.getTop();
                                        childAt4.setPivotX(((f12 - f10) / f7) + (f10 - left));
                                        childAt4.setPivotY(((f13 - f11) / f7) + (f11 - top));
                                    }
                                }
                            }
                        }
                    }
                    i18++;
                    z10 = true;
                    jc0Var2 = jc0Var;
                }
            }
            i12++;
            z12 = false;
            jc0Var2 = jc0Var2;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean drawChild = super.drawChild(canvas, view, j10);
            t1Var.J1(canvas);
            canvas.save();
            canvas.translate(t1Var.getX(), t1Var.getY());
            canvas.save();
            canvas.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX(), t1Var.getPivotY());
            t1Var.O1(canvas, true);
            t1Var.t3(true);
            t1Var.U1(canvas);
            if (t1Var.getCurrentMessagesGroup() == null || ((t1Var.getCurrentPosition() != null && (((t1Var.getCurrentPosition().flags & t1Var.s0()) != 0 && (t1Var.getCurrentPosition().flags & 1) != 0) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().isDocuments))) || t1Var.getTransitionParams().f23224w0)) {
                t1Var.H1(t1Var.getAlpha(), canvas, false);
                t1Var.c2(canvas, t1Var.getAlpha(), null);
                t1Var.M1(canvas, t1Var.getAlpha());
            }
            if (t1Var.getCurrentMessagesGroup() != null || t1Var.getTransitionParams().f23224w0) {
                t1Var.V1(canvas, t1Var.getAlpha());
            }
            if ((t1Var.getCurrentPosition() != null && t1Var.getCurrentPosition().last) || t1Var.getTransitionParams().f23224w0) {
                t1Var.l2(t1Var.getAlpha(), canvas, true);
            }
            t1Var.X1(canvas);
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
            this.Y2.e.V();
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        this.Y2.e.G();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        jc0 jc0Var = this.Y2;
        int i14 = jc0Var.f27669a;
        if (jc0Var.K) {
            if (i14 != 0) {
                u0(0);
            }
            jc0Var.K = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        jc0Var.j();
        cc0 cc0Var = jc0Var.f27675f;
        if (jc0Var.U) {
            if (cc0Var.computeVerticalScrollRange() > cc0Var.computeVerticalScrollExtent()) {
                jc0Var.postDelayed(new ub0(jc0Var, 0), 0L);
            }
            jc0Var.U = false;
        }
        if (jc0Var.N && i14 == 0) {
            int i15 = jc0Var.L;
            int i16 = jc0Var.M;
            jc0Var.N = false;
            post(new hg.n(this, i15, i16, 10));
        }
    }
}
