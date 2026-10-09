package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class pu0 extends pm0 {
    public final Context f29947c;
    public final bw0 d;

    public pu0(bw0 bw0Var, Context context) {
        this.d = bw0Var;
        this.f29947c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        qv0[] qv0VarArr = this.d.f25162t1;
        if (qv0VarArr[5].f30274a.size() == 0 && !qv0VarArr[5].f30279g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        qv0[] qv0VarArr = this.d.f25162t1;
        if (qv0VarArr[5].f30274a.size() == 0 && !qv0VarArr[5].f30279g) {
            return 1;
        }
        return qv0VarArr[5].f30274a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        qv0[] qv0VarArr = this.d.f25162t1;
        if (qv0VarArr[5].f30274a.size() == 0 && !qv0VarArr[5].f30279g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        char c10;
        if (d1Var.f47662f == 12) {
            bw0 bw0Var = this.d;
            MessageObject messageObject = (MessageObject) bw0Var.f25162t1[5].f30274a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = d1Var.f47658a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (bw0Var.C1) {
                        SparseArray[] sparseArrayArr = bw0Var.Z0;
                        if (messageObject.getDialogId() == bw0Var.f25141j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !bw0Var.f25120b1);
                        return;
                    }
                    f2Var.c(false, !bw0Var.f25120b1);
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        bw0 bw0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = bw0Var.F1;
        Context context = this.f29947c;
        if (i10 == 11) {
            ou0 M = bw0.M(5, bw0Var.f25141j1, context, e6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new s4.d1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, e6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.d1(f2Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47658a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f25142k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
