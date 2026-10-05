package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class eu0 extends yl0 {
    public final Context f26211c;
    public final qv0 d;

    public eu0(qv0 qv0Var, Context context) {
        this.d = qv0Var;
        this.f26211c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        fv0[] fv0VarArr = this.d.f30259t1;
        if (fv0VarArr[5].f26591a.size() == 0 && !fv0VarArr[5].f26596g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        fv0[] fv0VarArr = this.d.f30259t1;
        if (fv0VarArr[5].f26591a.size() == 0 && !fv0VarArr[5].f26596g) {
            return 1;
        }
        return fv0VarArr[5].f26591a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        fv0[] fv0VarArr = this.d.f30259t1;
        if (fv0VarArr[5].f26591a.size() == 0 && !fv0VarArr[5].f26596g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f46542f == 12) {
            qv0 qv0Var = this.d;
            MessageObject messageObject = (MessageObject) qv0Var.f30259t1[5].f26591a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f46538a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (qv0Var.C1) {
                        SparseArray[] sparseArrayArr = qv0Var.Z0;
                        if (messageObject.getDialogId() == qv0Var.f30238j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !qv0Var.f30217b1);
                        return;
                    }
                    f2Var.c(false, !qv0Var.f30217b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qv0 qv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = qv0Var.F1;
        Context context = this.f26211c;
        if (i10 == 11) {
            du0 M = qv0.M(5, qv0Var.f30238j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.c1(f2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f46538a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f30239k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
