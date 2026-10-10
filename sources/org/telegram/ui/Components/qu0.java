package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class qu0 extends qm0 {
    public final Context f30294c;
    public final cw0 d;

    public qu0(cw0 cw0Var, Context context) {
        this.d = cw0Var;
        this.f30294c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        rv0[] rv0VarArr = this.d.f25470t1;
        if (rv0VarArr[5].f30578a.size() == 0 && !rv0VarArr[5].f30583g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        rv0[] rv0VarArr = this.d.f25470t1;
        if (rv0VarArr[5].f30578a.size() == 0 && !rv0VarArr[5].f30583g) {
            return 1;
        }
        return rv0VarArr[5].f30578a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        rv0[] rv0VarArr = this.d.f25470t1;
        if (rv0VarArr[5].f30578a.size() == 0 && !rv0VarArr[5].f30583g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        char c10;
        if (d1Var.f47706f == 12) {
            cw0 cw0Var = this.d;
            MessageObject messageObject = (MessageObject) cw0Var.f25470t1[5].f30578a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = d1Var.f47702a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (cw0Var.C1) {
                        SparseArray[] sparseArrayArr = cw0Var.Z0;
                        if (messageObject.getDialogId() == cw0Var.f25449j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !cw0Var.f25428b1);
                        return;
                    }
                    f2Var.c(false, !cw0Var.f25428b1);
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        cw0 cw0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = cw0Var.F1;
        Context context = this.f30294c;
        if (i10 == 11) {
            pu0 M = cw0.M(5, cw0Var.f25449j1, context, e6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new s4.d1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, e6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.d1(f2Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47702a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f25450k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
