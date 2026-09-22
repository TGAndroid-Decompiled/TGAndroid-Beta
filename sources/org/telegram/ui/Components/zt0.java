package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class zt0 extends xl0 {
    public final Context f30951c;
    public final lv0 d;

    public zt0(lv0 lv0Var, Context context) {
        this.d = lv0Var;
        this.f30951c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        av0[] av0VarArr = this.d.f26230t1;
        if (av0VarArr[5].f22744a.size() == 0 && !av0VarArr[5].f22748g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        av0[] av0VarArr = this.d.f26230t1;
        if (av0VarArr[5].f22744a.size() == 0 && !av0VarArr[5].f22748g) {
            return 1;
        }
        return av0VarArr[5].f22744a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        av0[] av0VarArr = this.d.f26230t1;
        if (av0VarArr[5].f22744a.size() == 0 && !av0VarArr[5].f22748g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        if (c1Var.f42998f == 12) {
            lv0 lv0Var = this.d;
            MessageObject messageObject = (MessageObject) lv0Var.f26230t1[5].f22744a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = c1Var.f42995a;
                if (view instanceof org.telegram.ui.Cells.f2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    f2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (lv0Var.C1) {
                        SparseArray[] sparseArrayArr = lv0Var.Z0;
                        if (messageObject.getDialogId() == lv0Var.f26209j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        f2Var.c(z10, !lv0Var.f26189b1);
                        return;
                    }
                    f2Var.c(false, !lv0Var.f26189b1);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        lv0 lv0Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = lv0Var.F1;
        Context context = this.f30951c;
        if (i10 == 11) {
            yt0 M = lv0.M(5, lv0Var.f26209j1, context, f6Var);
            M.setLayoutParams(new s4.p0(-1, -1));
            return new s4.c1(M);
        }
        org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, f6Var, true);
        f2Var.setCanPreviewGif(true);
        return new s4.c1(f2Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        View view = c1Var.f42995a;
        if (view instanceof org.telegram.ui.Cells.f2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.f2) view).getPhotoImage();
            if (this.d.f26210k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
