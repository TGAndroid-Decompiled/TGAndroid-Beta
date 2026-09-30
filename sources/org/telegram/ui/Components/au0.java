package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class au0 extends yl0 {
    public final Context f22715c;
    public final mv0 d;

    public au0(mv0 mv0Var, Context context) {
        this.d = mv0Var;
        this.f22715c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        bv0[] bv0VarArr = this.d.f26445t1;
        if (bv0VarArr[5].f23015a.size() == 0 && !bv0VarArr[5].f23019g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        bv0[] bv0VarArr = this.d.f26445t1;
        if (bv0VarArr[5].f23015a.size() == 0 && !bv0VarArr[5].f23019g) {
            return 1;
        }
        return bv0VarArr[5].f23015a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        bv0[] bv0VarArr = this.d.f26445t1;
        if (bv0VarArr[5].f23015a.size() == 0 && !bv0VarArr[5].f23019g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f43071f == 12) {
            mv0 mv0Var = this.d;
            MessageObject messageObject = (MessageObject) mv0Var.f26445t1[5].f23015a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f43068a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (mv0Var.C1) {
                        SparseArray[] sparseArrayArr = mv0Var.Z0;
                        if (messageObject.getDialogId() == mv0Var.f26424j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !mv0Var.f26404b1);
                        return;
                    }
                    f2Var.c(false, !mv0Var.f26404b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        mv0 mv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = mv0Var.F1;
        Context context = this.f22715c;
        if (i10 == 11) {
            zt0 M = mv0.M(5, mv0Var.f26424j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.c1(f2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f43068a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f26425k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
