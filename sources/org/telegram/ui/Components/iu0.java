package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class iu0 extends im0 {
    public final Context f27341c;
    public final uv0 d;

    public iu0(uv0 uv0Var, Context context) {
        this.d = uv0Var;
        this.f27341c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        jv0[] jv0VarArr = this.d.f31070t1;
        if (jv0VarArr[5].f27644a.size() == 0 && !jv0VarArr[5].f27648g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        jv0[] jv0VarArr = this.d.f31070t1;
        if (jv0VarArr[5].f27644a.size() == 0 && !jv0VarArr[5].f27648g) {
            return 1;
        }
        return jv0VarArr[5].f27644a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        jv0[] jv0VarArr = this.d.f31070t1;
        if (jv0VarArr[5].f27644a.size() == 0 && !jv0VarArr[5].f27648g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        char c10;
        if (b1Var.f45923f == 12) {
            uv0 uv0Var = this.d;
            MessageObject messageObject = (MessageObject) uv0Var.f31070t1[5].f27644a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = b1Var.f45920a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (uv0Var.C1) {
                        SparseArray[] sparseArrayArr = uv0Var.Z0;
                        if (messageObject.getDialogId() == uv0Var.f31049j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !uv0Var.f31029b1);
                        return;
                    }
                    f2Var.c(false, !uv0Var.f31029b1);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        uv0 uv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = uv0Var.F1;
        Context context = this.f27341c;
        if (i10 == 11) {
            hu0 M = uv0.M(5, uv0Var.f31049j1, context, d6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.b1(f2Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f45920a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f31050k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
