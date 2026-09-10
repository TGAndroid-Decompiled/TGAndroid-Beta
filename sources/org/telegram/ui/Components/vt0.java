package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vt0 extends ul0 {
    public final Context f28597c;
    public final iv0 d;

    public vt0(iv0 iv0Var, Context context) {
        this.d = iv0Var;
        this.f28597c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        xu0[] xu0VarArr = this.d.f24127t1;
        if (xu0VarArr[5].f29156a.size() == 0 && !xu0VarArr[5].f29160g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        xu0[] xu0VarArr = this.d.f24127t1;
        if (xu0VarArr[5].f29156a.size() == 0 && !xu0VarArr[5].f29160g) {
            return 1;
        }
        return xu0VarArr[5].f29156a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        xu0[] xu0VarArr = this.d.f24127t1;
        if (xu0VarArr[5].f29156a.size() == 0 && !xu0VarArr[5].f29160g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f41613f == 12) {
            iv0 iv0Var = this.d;
            MessageObject messageObject = (MessageObject) iv0Var.f24127t1[5].f29156a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f41610a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (iv0Var.C1) {
                        SparseArray[] sparseArrayArr = iv0Var.Z0;
                        if (messageObject.getDialogId() == iv0Var.f24106j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        e2Var.c(z10, !iv0Var.f24086b1);
                        return;
                    }
                    e2Var.c(false, !iv0Var.f24086b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        iv0 iv0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.f28597c;
        if (i10 == 11) {
            ut0 M = iv0.M(5, iv0Var.f24106j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, f6Var, true);
        e2Var.setCanPreviewGif(true);
        return new s4.c1(e2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
            if (this.d.f24107k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
