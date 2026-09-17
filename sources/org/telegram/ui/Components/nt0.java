package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class nt0 extends ll0 {
    public final Context f26539c;
    public final zu0 d;

    public nt0(zu0 zu0Var, Context context) {
        this.d = zu0Var;
        this.f26539c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        ou0[] ou0VarArr = this.d.f30652t1;
        if (ou0VarArr[5].f26849a.size() == 0 && !ou0VarArr[5].f26853g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ou0[] ou0VarArr = this.d.f30652t1;
        if (ou0VarArr[5].f26849a.size() == 0 && !ou0VarArr[5].f26853g) {
            return 1;
        }
        return ou0VarArr[5].f26849a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        ou0[] ou0VarArr = this.d.f30652t1;
        if (ou0VarArr[5].f26849a.size() == 0 && !ou0VarArr[5].f26853g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f42700f == 12) {
            zu0 zu0Var = this.d;
            MessageObject messageObject = (MessageObject) zu0Var.f30652t1[5].f26849a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f42697a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (zu0Var.C1) {
                        SparseArray[] sparseArrayArr = zu0Var.Z0;
                        if (messageObject.getDialogId() == zu0Var.f30631j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        e2Var.c(z10, !zu0Var.f30611b1);
                        return;
                    }
                    e2Var.c(false, !zu0Var.f30611b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = zu0Var.F1;
        Context context = this.f26539c;
        if (i10 == 11) {
            mt0 M = zu0.M(5, zu0Var.f30631j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, f6Var, true);
        e2Var.setCanPreviewGif(true);
        return new s4.c1(e2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42697a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
            if (this.d.f30632k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
