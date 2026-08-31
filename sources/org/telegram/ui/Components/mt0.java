package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class mt0 extends sl0 {
    public final Context f29247c;
    public final zu0 d;

    public mt0(zu0 zu0Var, Context context) {
        this.d = zu0Var;
        this.f29247c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        ou0[] ou0VarArr = this.d.f33998q1;
        if (ou0VarArr[5].f29851a.size() == 0 && !ou0VarArr[5].f29856g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ou0[] ou0VarArr = this.d.f33998q1;
        if (ou0VarArr[5].f29851a.size() == 0 && !ou0VarArr[5].f29856g) {
            return 1;
        }
        return ou0VarArr[5].f29851a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        ou0[] ou0VarArr = this.d.f33998q1;
        if (ou0VarArr[5].f29851a.size() == 0 && !ou0VarArr[5].f29856g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        char c3;
        if (m1Var.f5879f == 12) {
            zu0 zu0Var = this.d;
            MessageObject messageObject = (MessageObject) zu0Var.f33998q1[5].f29851a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = m1Var.f5875a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z4 = false;
                    if (zu0Var.f34021z1) {
                        SparseArray[] sparseArrayArr = zu0Var.W0;
                        if (messageObject.getDialogId() == zu0Var.f33979g1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                            z4 = true;
                        }
                        e2Var.c(z4, !zu0Var.Y0);
                        return;
                    }
                    e2Var.c(false, !zu0Var.Y0);
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        zu0 zu0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = zu0Var.C1;
        Context context = this.f29247c;
        if (i10 == 11) {
            lt0 M = zu0.M(5, zu0Var.f33979g1, context, g6Var);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new f2.m1(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, g6Var, true);
        e2Var.setCanPreviewGif(true);
        return new f2.m1(e2Var);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
            if (this.d.f33980h0[0].C == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
