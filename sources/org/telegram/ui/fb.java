package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

public final class fb extends ob {
    public final qb T2;

    public fb(qb qbVar, Context context) {
        super(context, null);
        this.T2 = qbVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        ImageReceiver avatarImage;
        boolean z10;
        int y10;
        int iB;
        if (view instanceof org.telegram.ui.Cells.t1) {
            canvas.save();
            canvas.translate(view.getX(), view.getY());
            ((org.telegram.ui.Cells.t1) view).a(canvas);
            canvas.restore();
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if ((view instanceof org.telegram.ui.Cells.s1) && (avatarImage = (s1Var = (org.telegram.ui.Cells.s1) view).getAvatarImage()) != null) {
            boolean z11 = s1Var.getMessageObject().deleted;
            qb qbVar = this.T2;
            if (z11) {
                z10 = false;
            } else {
                qbVar.A.getClass();
                if (RecyclerView.R(s1Var) != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (s1Var.getMessageObject().deleted) {
                avatarImage.setVisible(false, false);
                return zDrawChild;
            }
            int y11 = (int) view.getY();
            if (s1Var.j() && (iB = qbVar.A.T(view).b()) >= 0) {
                if (qbVar.A.K(iB + 1) != null) {
                    avatarImage.setVisible(false, false);
                    return zDrawChild;
                }
            }
            float checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
            int layoutHeight = s1Var.getLayoutHeight() + ((int) view.getY());
            int measuredHeight = qbVar.A.getMeasuredHeight() - qbVar.A.getPaddingBottom();
            if (layoutHeight > measuredHeight) {
                layoutHeight = measuredHeight;
            }
            if (s1Var.h() && (iB = qbVar.A.T(view).b()) >= 0) {
                int i10 = 0;
                while (i10 < 20) {
                    i10++;
                    int iB2 = iB2 - 1;
                    f2.o1 o1VarK = qbVar.A.K(iB2);
                    if (o1VarK == null) {
                        break;
                    }
                    View view2 = o1VarK.f5789a;
                    int top = view2.getTop();
                    if (view2 instanceof org.telegram.ui.Cells.s1) {
                        s1Var = (org.telegram.ui.Cells.s1) view2;
                        if (s1Var.h()) {
                            y11 = top;
                        }
                    }
                    y11 = top;
                    break;
                }
            }
            if (layoutHeight - AndroidUtilities.dp(48.0f) < y11) {
                layoutHeight = AndroidUtilities.dp(48.0f) + y11;
            }
            if (!s1Var.j() && layoutHeight > (y10 = (int) (s1Var.getY() + s1Var.getMeasuredHeight()))) {
                layoutHeight = y10;
            }
            canvas.save();
            if (checkBoxTranslation != 0.0f) {
                canvas.translate(checkBoxTranslation, 0.0f);
            }
            if (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                layoutHeight = (int) (layoutHeight - s1Var.getTranslationY());
            }
            if (z10) {
                avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
            }
            if (s1Var.a()) {
                avatarImage.setAlpha(s1Var.getAlpha());
                canvas.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX() + s1Var.getX(), s1Var.getY() + (s1Var.getHeight() >> 1));
            } else {
                avatarImage.setAlpha(1.0f);
            }
            if (z10) {
                avatarImage.setVisible(true, false);
            }
            avatarImage.draw(canvas);
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        qb qbVar = this.T2;
        if (qbVar.A != null && qbVar.C != null && (i14 = qbVar.N0) >= 0) {
            if (qbVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    mb mbVar = qbVar.E;
                    if (i15 < mbVar.d) {
                        if (i15 < mbVar.f40427f || i15 >= mbVar.h) {
                            messageObject = null;
                        } else {
                            ArrayList arrayList = mbVar.f40428n.f41609o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - mbVar.f40427f)) - 1);
                        }
                        if (messageObject != null && messageObject.eventId == qbVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            qbVar.C.i1(i14, qbVar.O0, true);
            qbVar.N0 = -1;
            qbVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
