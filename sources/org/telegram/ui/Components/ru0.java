package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ru0 extends rm0 {
    public final Context f30545c;
    public final dw0 d;

    public ru0(dw0 dw0Var, Context context) {
        this.d = dw0Var;
        this.f30545c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        sv0[] sv0VarArr = this.d.f25731t1;
        if (sv0VarArr[5].f30867a.size() == 0 && !sv0VarArr[5].f30872g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        sv0[] sv0VarArr = this.d.f25731t1;
        if (sv0VarArr[5].f30867a.size() == 0 && !sv0VarArr[5].f30872g) {
            return 1;
        }
        return sv0VarArr[5].f30867a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        sv0[] sv0VarArr = this.d.f25731t1;
        if (sv0VarArr[5].f30867a.size() == 0 && !sv0VarArr[5].f30872g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        char c10;
        if (d1Var.f47752f == 12) {
            dw0 dw0Var = this.d;
            MessageObject messageObject = (MessageObject) dw0Var.f25731t1[5].f30867a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = d1Var.f47748a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (dw0Var.C1) {
                        SparseArray[] sparseArrayArr = dw0Var.Z0;
                        if (messageObject.getDialogId() == dw0Var.f25710j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !dw0Var.f25689b1);
                        return;
                    }
                    f2Var.c(false, !dw0Var.f25689b1);
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        dw0 dw0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = dw0Var.F1;
        Context context = this.f30545c;
        if (i10 == 11) {
            qu0 M = dw0.M(5, dw0Var.f25710j1, context, d6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new s4.d1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.d1(f2Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47748a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f25711k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
