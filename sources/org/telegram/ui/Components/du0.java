package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class du0 extends yl0 {
    public final Context f25824c;
    public final pv0 d;

    public du0(pv0 pv0Var, Context context) {
        this.d = pv0Var;
        this.f25824c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        ev0[] ev0VarArr = this.d.f29796t1;
        if (ev0VarArr[5].f26138a.size() == 0 && !ev0VarArr[5].f26143g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        ev0[] ev0VarArr = this.d.f29796t1;
        if (ev0VarArr[5].f26138a.size() == 0 && !ev0VarArr[5].f26143g) {
            return 1;
        }
        return ev0VarArr[5].f26138a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        ev0[] ev0VarArr = this.d.f29796t1;
        if (ev0VarArr[5].f26138a.size() == 0 && !ev0VarArr[5].f26143g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f46527f == 12) {
            pv0 pv0Var = this.d;
            MessageObject messageObject = (MessageObject) pv0Var.f29796t1[5].f26138a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f46523a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (pv0Var.C1) {
                        SparseArray[] sparseArrayArr = pv0Var.Z0;
                        if (messageObject.getDialogId() == pv0Var.f29775j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !pv0Var.f29754b1);
                        return;
                    }
                    f2Var.c(false, !pv0Var.f29754b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        pv0 pv0Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = pv0Var.F1;
        Context context = this.f25824c;
        if (i10 == 11) {
            cu0 M = pv0.M(5, pv0Var.f29775j1, context, d6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, d6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.c1(f2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f46523a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f29776k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
