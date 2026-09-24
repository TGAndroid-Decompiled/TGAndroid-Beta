package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class xt0 extends vl0 {
    public final Context f30394c;
    public final jv0 d;

    public xt0(jv0 jv0Var, Context context) {
        this.d = jv0Var;
        this.f30394c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        yu0[] yu0VarArr = this.d.f25539t1;
        if (yu0VarArr[5].f30682a.size() == 0 && !yu0VarArr[5].f30686g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        yu0[] yu0VarArr = this.d.f25539t1;
        if (yu0VarArr[5].f30682a.size() == 0 && !yu0VarArr[5].f30686g) {
            return 1;
        }
        return yu0VarArr[5].f30682a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        yu0[] yu0VarArr = this.d.f25539t1;
        if (yu0VarArr[5].f30682a.size() == 0 && !yu0VarArr[5].f30686g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f42949f == 12) {
            jv0 jv0Var = this.d;
            MessageObject messageObject = (MessageObject) jv0Var.f25539t1[5].f30682a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f42946a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (jv0Var.C1) {
                        SparseArray[] sparseArrayArr = jv0Var.Z0;
                        if (messageObject.getDialogId() == jv0Var.f25518j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !jv0Var.f25498b1);
                        return;
                    }
                    f2Var.c(false, !jv0Var.f25498b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = jv0Var.F1;
        Context context = this.f30394c;
        if (i10 == 11) {
            wt0 M = jv0.M(5, jv0Var.f25518j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.c1(f2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42946a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f25519k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
