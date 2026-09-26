package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class yt0 extends wl0 {
    public final Context f30703c;
    public final kv0 d;

    public yt0(kv0 kv0Var, Context context) {
        this.d = kv0Var;
        this.f30703c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        zu0[] zu0VarArr = this.d.f25862t1;
        if (zu0VarArr[5].f30969a.size() == 0 && !zu0VarArr[5].f30973g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        zu0[] zu0VarArr = this.d.f25862t1;
        if (zu0VarArr[5].f30969a.size() == 0 && !zu0VarArr[5].f30973g) {
            return 1;
        }
        return zu0VarArr[5].f30969a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        zu0[] zu0VarArr = this.d.f25862t1;
        if (zu0VarArr[5].f30969a.size() == 0 && !zu0VarArr[5].f30973g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f42962f == 12) {
            kv0 kv0Var = this.d;
            MessageObject messageObject = (MessageObject) kv0Var.f25862t1[5].f30969a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f42959a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (kv0Var.C1) {
                        SparseArray[] sparseArrayArr = kv0Var.Z0;
                        if (messageObject.getDialogId() == kv0Var.f25841j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !kv0Var.f25821b1);
                        return;
                    }
                    f2Var.c(false, !kv0Var.f25821b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        kv0 kv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = kv0Var.F1;
        Context context = this.f30703c;
        if (i10 == 11) {
            xt0 M = kv0.M(5, kv0Var.f25841j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.c1(f2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42959a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f25842k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
