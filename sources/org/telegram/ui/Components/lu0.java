package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class lu0 extends lm0 {
    public final Context f26831c;
    public final xv0 d;

    public lu0(xv0 xv0Var, Context context) {
        this.d = xv0Var;
        this.f26831c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        mv0[] mv0VarArr = this.d.f31065t1;
        if (mv0VarArr[5].f27211a.size() == 0 && !mv0VarArr[5].f27215g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        mv0[] mv0VarArr = this.d.f31065t1;
        if (mv0VarArr[5].f27211a.size() == 0 && !mv0VarArr[5].f27215g) {
            return 1;
        }
        return mv0VarArr[5].f27211a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        mv0[] mv0VarArr = this.d.f31065t1;
        if (mv0VarArr[5].f27211a.size() == 0 && !mv0VarArr[5].f27215g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        char c10;
        if (b1Var.f44841f == 12) {
            xv0 xv0Var = this.d;
            MessageObject messageObject = (MessageObject) xv0Var.f31065t1[5].f27211a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = b1Var.f44838a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (xv0Var.C1) {
                        SparseArray[] sparseArrayArr = xv0Var.Z0;
                        if (messageObject.getDialogId() == xv0Var.f31044j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !xv0Var.f31024b1);
                        return;
                    }
                    f2Var.c(false, !xv0Var.f31024b1);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        xv0 xv0Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = xv0Var.F1;
        Context context = this.f26831c;
        if (i10 == 11) {
            ku0 M = xv0.M(5, xv0Var.f31044j1, context, c6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, c6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.b1(f2Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f31045k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
