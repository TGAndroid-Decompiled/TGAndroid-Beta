package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class mt0 extends kl0 {
    public final Context f26248c;
    public final yu0 d;

    public mt0(yu0 yu0Var, Context context) {
        this.d = yu0Var;
        this.f26248c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        nu0[] nu0VarArr = this.d.f30388t1;
        if (nu0VarArr[5].f26576a.size() == 0 && !nu0VarArr[5].f26580g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        nu0[] nu0VarArr = this.d.f30388t1;
        if (nu0VarArr[5].f26576a.size() == 0 && !nu0VarArr[5].f26580g) {
            return 1;
        }
        return nu0VarArr[5].f26576a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        nu0[] nu0VarArr = this.d.f30388t1;
        if (nu0VarArr[5].f26576a.size() == 0 && !nu0VarArr[5].f26580g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f42678f == 12) {
            yu0 yu0Var = this.d;
            MessageObject messageObject = (MessageObject) yu0Var.f30388t1[5].f26576a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f42675a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (yu0Var.C1) {
                        SparseArray[] sparseArrayArr = yu0Var.Z0;
                        if (messageObject.getDialogId() == yu0Var.f30367j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        e2Var.c(z10, !yu0Var.f30347b1);
                        return;
                    }
                    e2Var.c(false, !yu0Var.f30347b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = yu0Var.F1;
        Context context = this.f26248c;
        if (i10 == 11) {
            lt0 M = yu0.M(5, yu0Var.f30367j1, context, e6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, e6Var, true);
        e2Var.setCanPreviewGif(true);
        return new s4.c1(e2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42675a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
            if (this.d.f30368k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
