package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class lt0 extends ql0 {
    public final Context f26874c;
    public final yu0 d;

    public lt0(yu0 yu0Var, Context context) {
        this.d = yu0Var;
        this.f26874c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        nu0[] nu0VarArr = this.d.f31149q1;
        if (nu0VarArr[5].f27368a.size() == 0 && !nu0VarArr[5].f27372g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        nu0[] nu0VarArr = this.d.f31149q1;
        if (nu0VarArr[5].f27368a.size() == 0 && !nu0VarArr[5].f27372g) {
            return 1;
        }
        return nu0VarArr[5].f27368a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        nu0[] nu0VarArr = this.d.f31149q1;
        if (nu0VarArr[5].f27368a.size() == 0 && !nu0VarArr[5].f27372g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        char c3;
        if (l1Var.f5777f == 12) {
            yu0 yu0Var = this.d;
            MessageObject messageObject = (MessageObject) yu0Var.f31149q1[5].f27368a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = l1Var.f5774a;
                if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    d2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z4 = false;
                    if (yu0Var.f31172z1) {
                        SparseArray[] sparseArrayArr = yu0Var.W0;
                        if (messageObject.getDialogId() == yu0Var.f31130g1) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                            z4 = true;
                        }
                        d2Var.c(z4, !yu0Var.Y0);
                        return;
                    }
                    d2Var.c(false, !yu0Var.Y0);
                }
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        yu0 yu0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = yu0Var.C1;
        Context context = this.f26874c;
        if (i10 == 11) {
            kt0 M = yu0.M(5, yu0Var.f31130g1, context, f6Var);
            M.setLayoutParams(new f2.w0(-1, -1));
            return new f2.l1(M);
        }
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, f6Var, true);
        d2Var.setCanPreviewGif(true);
        return new f2.l1(d2Var);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.d2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) view).getPhotoImage();
            if (this.d.f31131h0[0].C == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
