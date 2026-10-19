package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class hu0 extends hm0 {
    public final Context f26934c;
    public final tv0 d;

    public hu0(tv0 tv0Var, Context context) {
        this.d = tv0Var;
        this.f26934c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        iv0[] iv0VarArr = this.d.f30728t1;
        if (iv0VarArr[5].f27361a.size() == 0 && !iv0VarArr[5].f27365g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        iv0[] iv0VarArr = this.d.f30728t1;
        if (iv0VarArr[5].f27361a.size() == 0 && !iv0VarArr[5].f27365g) {
            return 1;
        }
        return iv0VarArr[5].f27361a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        iv0[] iv0VarArr = this.d.f30728t1;
        if (iv0VarArr[5].f27361a.size() == 0 && !iv0VarArr[5].f27365g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        char c10;
        if (b1Var.f45915f == 12) {
            tv0 tv0Var = this.d;
            MessageObject messageObject = (MessageObject) tv0Var.f30728t1[5].f27361a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = b1Var.f45912a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (tv0Var.C1) {
                        SparseArray[] sparseArrayArr = tv0Var.Z0;
                        if (messageObject.getDialogId() == tv0Var.f30707j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !tv0Var.f30687b1);
                        return;
                    }
                    f2Var.c(false, !tv0Var.f30687b1);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        tv0 tv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = tv0Var.F1;
        Context context = this.f26934c;
        if (i10 == 11) {
            gu0 M = tv0.M(5, tv0Var.f30707j1, context, d6Var);
            M.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.b1(f2Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f45912a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f30708k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
