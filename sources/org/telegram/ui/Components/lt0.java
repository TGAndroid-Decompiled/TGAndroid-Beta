package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class lt0 extends rl0 {
    public final Context f28875c;
    public final yu0 d;

    public lt0(yu0 yu0Var, Context context) {
        this.d = yu0Var;
        this.f28875c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        nu0[] nu0VarArr = this.d.f33643q1;
        if (nu0VarArr[5].f29580a.size() == 0 && !nu0VarArr[5].f29585g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        nu0[] nu0VarArr = this.d.f33643q1;
        if (nu0VarArr[5].f29580a.size() == 0 && !nu0VarArr[5].f29585g) {
            return 1;
        }
        return nu0VarArr[5].f29580a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        nu0[] nu0VarArr = this.d.f33643q1;
        if (nu0VarArr[5].f29580a.size() == 0 && !nu0VarArr[5].f29585g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        char c3;
        if (m1Var.f5879f == 12) {
            yu0 yu0Var = this.d;
            MessageObject messageObject = (MessageObject) yu0Var.f33643q1[5].f29580a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = m1Var.f5875a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z4 = false;
                    if (yu0Var.f33666z1) {
                        SparseArray[] sparseArrayArr = yu0Var.W0;
                        if (messageObject.getDialogId() == yu0Var.f33624g1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                            z4 = true;
                        }
                        e2Var.c(z4, !yu0Var.Y0);
                        return;
                    }
                    e2Var.c(false, !yu0Var.Y0);
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = yu0Var.C1;
        Context context = this.f28875c;
        if (i10 == 11) {
            kt0 M = yu0.M(5, yu0Var.f33624g1, context, g6Var);
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
            if (this.d.f33625h0[0].C == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
