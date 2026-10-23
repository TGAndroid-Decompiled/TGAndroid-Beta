package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class lu0 extends lm0 {
    public final Context f28426c;
    public final xv0 d;

    public lu0(xv0 xv0Var, Context context) {
        this.d = xv0Var;
        this.f28426c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        mv0[] mv0VarArr = this.d.f32707t1;
        if (mv0VarArr[5].f28757a.size() == 0 && !mv0VarArr[5].f28761g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        mv0[] mv0VarArr = this.d.f32707t1;
        if (mv0VarArr[5].f28757a.size() == 0 && !mv0VarArr[5].f28761g) {
            return 1;
        }
        return mv0VarArr[5].f28757a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        mv0[] mv0VarArr = this.d.f32707t1;
        if (mv0VarArr[5].f28757a.size() == 0 && !mv0VarArr[5].f28761g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        char c10;
        if (b1Var.f46346f == 12) {
            xv0 xv0Var = this.d;
            MessageObject messageObject = (MessageObject) xv0Var.f32707t1[5].f28757a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = b1Var.f46343a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (xv0Var.C1) {
                        SparseArray[] sparseArrayArr = xv0Var.Z0;
                        if (messageObject.getDialogId() == xv0Var.f32686j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        e2Var.c(z10, !xv0Var.f32663b1);
                        return;
                    }
                    e2Var.c(false, !xv0Var.f32663b1);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xv0 xv0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = xv0Var.F1;
        Context context = this.f28426c;
        if (i10 == 11) {
            ku0 N = xv0.N(5, xv0Var.f32686j1, context, g6Var);
            N.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(N);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, g6Var, true);
        e2Var.setCanPreviewGif(true);
        return new s4.b1(e2Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f46343a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
            if (this.d.f32687k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
