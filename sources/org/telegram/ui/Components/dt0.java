package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class dt0 extends il0 {
    public final Context f27873c;
    public final qu0 d;

    public dt0(qu0 qu0Var, Context context) {
        this.d = qu0Var;
        this.f27873c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        fu0[] fu0VarArr = this.d.f32088p1;
        if (fu0VarArr[5].f28534a.size() == 0 && !fu0VarArr[5].f28539g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        fu0[] fu0VarArr = this.d.f32088p1;
        if (fu0VarArr[5].f28534a.size() == 0 && !fu0VarArr[5].f28539g) {
            return 1;
        }
        return fu0VarArr[5].f28534a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        fu0[] fu0VarArr = this.d.f32088p1;
        if (fu0VarArr[5].f28534a.size() == 0 && !fu0VarArr[5].f28539g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        char c3;
        if (n1Var.f6436f == 12) {
            qu0 qu0Var = this.d;
            MessageObject messageObject = (MessageObject) qu0Var.f32088p1[5].f28534a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = n1Var.f6432a;
                if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    d2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (qu0Var.f32111y1) {
                        SparseArray[] sparseArrayArr = qu0Var.V0;
                        if (messageObject.getDialogId() == qu0Var.f32069f1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        d2Var.c(z10, !qu0Var.X0);
                        return;
                    }
                    d2Var.c(false, !qu0Var.X0);
                }
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        qu0 qu0Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.f27873c;
        if (i10 == 11) {
            ct0 M = qu0.M(5, qu0Var.f32069f1, context, c6Var);
            M.setLayoutParams(new f2.x0(-1, -1));
            return new f2.n1(M);
        }
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, c6Var, true);
        d2Var.setCanPreviewGif(true);
        return new f2.n1(d2Var);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof org.telegram.ui.Cells.d2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) view).getPhotoImage();
            if (this.d.f32070g0[0].B == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
