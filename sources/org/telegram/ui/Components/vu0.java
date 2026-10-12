package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vu0 extends vm0 {
    public final Context f32178c;
    public final hw0 d;

    public vu0(hw0 hw0Var, Context context) {
        this.d = hw0Var;
        this.f32178c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        wv0[] wv0VarArr = this.d.f26953t1;
        if (wv0VarArr[5].f32552a.size() == 0 && !wv0VarArr[5].f32557g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        wv0[] wv0VarArr = this.d.f26953t1;
        if (wv0VarArr[5].f32552a.size() == 0 && !wv0VarArr[5].f32557g) {
            return 1;
        }
        return wv0VarArr[5].f32552a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        wv0[] wv0VarArr = this.d.f26953t1;
        if (wv0VarArr[5].f32552a.size() == 0 && !wv0VarArr[5].f32557g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        char c10;
        if (d1Var.f47901f == 12) {
            hw0 hw0Var = this.d;
            MessageObject messageObject = (MessageObject) hw0Var.f26953t1[5].f32552a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = d1Var.f47897a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (hw0Var.C1) {
                        SparseArray[] sparseArrayArr = hw0Var.Z0;
                        if (messageObject.getDialogId() == hw0Var.f26932j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !hw0Var.f26911b1);
                        return;
                    }
                    f2Var.c(false, !hw0Var.f26911b1);
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        hw0 hw0Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = hw0Var.F1;
        Context context = this.f32178c;
        if (i10 == 11) {
            uu0 M = hw0.M(5, hw0Var.f26932j1, context, c6Var);
            M.setLayoutParams(new s4.q0(-1, -1));
            return new s4.d1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, c6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.d1(f2Var);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        View view = d1Var.f47897a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f26933k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
