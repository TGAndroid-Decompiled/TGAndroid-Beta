package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ss0 extends vk0 {
    public final Context f32550c;
    public final eu0 d;

    public ss0(eu0 eu0Var, Context context) {
        this.d = eu0Var;
        this.f32550c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        tt0[] tt0VarArr = this.d.f28155p1;
        if (tt0VarArr[5].f32788a.size() == 0 && !tt0VarArr[5].f32793g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        tt0[] tt0VarArr = this.d.f28155p1;
        if (tt0VarArr[5].f32788a.size() == 0 && !tt0VarArr[5].f32793g) {
            return 1;
        }
        return tt0VarArr[5].f32788a.size();
    }

    @Override
    public final long i(int i9) {
        return i9;
    }

    @Override
    public final int j(int i9) {
        tt0[] tt0VarArr = this.d.f28155p1;
        if (tt0VarArr[5].f32788a.size() == 0 && !tt0VarArr[5].f32793g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        char c10;
        if (q1Var.f5505f == 12) {
            eu0 eu0Var = this.d;
            MessageObject messageObject = (MessageObject) eu0Var.f28155p1[5].f32788a.get(i9);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = q1Var.f5501a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (eu0Var.f28178y1) {
                        SparseArray[] sparseArrayArr = eu0Var.V0;
                        if (messageObject.getDialogId() == eu0Var.f28136f1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        e2Var.c(z10, !eu0Var.X0);
                        return;
                    }
                    e2Var.c(false, !eu0Var.X0);
                }
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        eu0 eu0Var = this.d;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.f32550c;
        if (i9 == 11) {
            rs0 M = eu0.M(5, eu0Var.f28136f1, context, b6Var);
            M.setLayoutParams(new f2.a1(-1, -1));
            return new f2.q1(M);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, b6Var, true);
        e2Var.setCanPreviewGif(true);
        return new f2.q1(e2Var);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
            if (this.d.f28137g0[0].B == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
