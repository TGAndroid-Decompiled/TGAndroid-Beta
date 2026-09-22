package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class hb0 extends ll0 {
    public final pb0 X2;

    public hb0(pb0 pb0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.X2 = pb0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Canvas canvas2;
        pb0 pb0Var;
        float f7;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessages currentMessagesGroup2;
        pb0 pb0Var2 = this.X2;
        org.telegram.ui.w8 w8Var = pb0Var2.f26995b;
        boolean z12 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                ((org.telegram.ui.Cells.t1) childAt).Z3(w8Var.getMeasuredWidth(), w8Var.getBackgroundSizeY());
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
            vb0 vb0Var = pb0Var2.f26998c0;
            ArrayList arrayList = vb0Var.E;
            hb0 hb0Var = pb0Var2.f26999f;
            vb0Var.E.clear();
            if (i12 != 2 || hb0Var.X1) {
                int i13 = 0;
                ?? r32 = z12;
                while (true) {
                    z10 = true;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt3 = hb0Var.getChildAt(i13);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= hb0Var.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = t1Var.getCurrentMessagesGroup()) != null && ((i12 != 0 || currentMessagesGroup.messages.size() != 1) && ((i12 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i12 != 0 || !t1Var.getMessageObject().deleted) && ((i12 != 1 || t1Var.getMessageObject().deleted) && ((i12 != 2 || t1Var.f21162oc) && (i12 == 2 || !t1Var.f21162oc))))))) {
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
                            if (t1Var.f21162oc) {
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
                        pb0Var = pb0Var2;
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
                        if (f13 > AndroidUtilities.dp(20.0f) + hb0Var.getMeasuredHeight()) {
                            f13 = AndroidUtilities.dp(20.0f) + hb0Var.getMeasuredHeight();
                        }
                        if (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            canvas.save();
                            pb0Var = pb0Var2;
                            canvas2 = canvas;
                            f7 = 2.0f;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.gms.internal.vision.e2.A(f12, f10, 2.0f, f10), com.google.android.gms.internal.vision.e2.A(f13, f11, 2.0f, f11));
                        } else {
                            canvas2 = canvas;
                            pb0Var = pb0Var2;
                            f7 = 2.0f;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        transitionParams4.cell.B1(canvas2, (int) f10, (int) f11, (int) f12, (int) f13, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z11) {
                            canvas.restore();
                            for (int i19 = 0; i19 < childCount; i19++) {
                                View childAt4 = hb0Var.getChildAt(i19);
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
                    pb0Var2 = pb0Var;
                }
            }
            i12++;
            z12 = false;
            pb0Var2 = pb0Var2;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean drawChild = super.drawChild(canvas, view, j3);
            t1Var.K1(canvas);
            canvas.save();
            canvas.translate(t1Var.getX(), t1Var.getY());
            canvas.save();
            canvas.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX(), t1Var.getPivotY());
            t1Var.P1(canvas, true);
            t1Var.u3(true);
            t1Var.V1(canvas);
            if (t1Var.getCurrentMessagesGroup() == null || ((t1Var.getCurrentPosition() != null && (((t1Var.getCurrentPosition().flags & t1Var.t0()) != 0 && (t1Var.getCurrentPosition().flags & 1) != 0) || (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().isDocuments))) || t1Var.getTransitionParams().f20910w0)) {
                t1Var.I1(t1Var.getAlpha(), canvas, false);
                t1Var.d2(canvas, t1Var.getAlpha(), null);
                t1Var.N1(canvas, t1Var.getAlpha());
            }
            if (t1Var.getCurrentMessagesGroup() != null || t1Var.getTransitionParams().f20910w0) {
                t1Var.W1(canvas, t1Var.getAlpha());
            }
            if ((t1Var.getCurrentPosition() != null && t1Var.getCurrentPosition().last) || t1Var.getTransitionParams().f20910w0) {
                t1Var.m2(t1Var.getAlpha(), canvas, true);
            }
            t1Var.Y1(canvas);
            canvas.restore();
            t1Var.getTransitionParams().i();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            this.X2.e.W();
        }
    }

    @Override
    public final void k0(int i10, int i11) {
        this.X2.e.H();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        pb0 pb0Var = this.X2;
        int i14 = pb0Var.f26993a;
        if (pb0Var.K) {
            if (i14 != 0) {
                u0(0);
            }
            pb0Var.K = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        pb0Var.i();
        hb0 hb0Var = pb0Var.f26999f;
        if (pb0Var.U) {
            if (hb0Var.computeVerticalScrollRange() > hb0Var.computeVerticalScrollExtent()) {
                pb0Var.postDelayed(new ab0(pb0Var, 0), 0L);
            }
            pb0Var.U = false;
        }
        if (pb0Var.N && i14 == 0) {
            int i15 = pb0Var.L;
            int i16 = pb0Var.M;
            pb0Var.N = false;
            post(new gg.n(this, i15, i16, 10));
        }
    }
}
