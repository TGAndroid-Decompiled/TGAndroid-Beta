package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class us0 extends yk0 {

    public final Context f33208c;
    public final hu0 d;

    public us0(hu0 hu0Var, Context context) {
        this.d = hu0Var;
        this.f33208c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        wt0[] wt0VarArr = this.d.f29140p1;
        return wt0VarArr[5].f34325a.size() != 0 || wt0VarArr[5].f34330g;
    }

    @Override
    public final int h() {
        wt0[] wt0VarArr = this.d.f29140p1;
        if (wt0VarArr[5].f34325a.size() != 0 || wt0VarArr[5].f34330g) {
            return wt0VarArr[5].f34325a.size();
        }
        return 1;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        wt0[] wt0VarArr = this.d.f29140p1;
        return (wt0VarArr[5].f34325a.size() != 0 || wt0VarArr[5].f34330g) ? 12 : 11;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (o1Var.f5793f == 12) {
            hu0 hu0Var = this.d;
            MessageObject messageObject = (MessageObject) hu0Var.f29140p1[5].f34325a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = o1Var.f5789a;
                if (view instanceof org.telegram.ui.Cells.d2) {
                    org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                    d2Var.d(messageObject.messageOwner.date, document, messageObject);
                    if (hu0Var.f29163y1) {
                        d2Var.c(hu0Var.V0[(messageObject.getDialogId() > hu0Var.f29121f1 ? 1 : (messageObject.getDialogId() == hu0Var.f29121f1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !hu0Var.X0);
                    } else {
                        d2Var.c(false, !hu0Var.X0);
                    }
                }
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        hu0 hu0Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = hu0Var.B1;
        Context context = this.f33208c;
        if (i10 == 11) {
            ts0 ts0VarM = hu0.M(5, hu0Var.f29121f1, context, c6Var);
            ts0VarM.setLayoutParams(new f2.y0(-1, -1));
            return new lk0(ts0VarM);
        }
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(context, c6Var, true);
        d2Var.setCanPreviewGif(true);
        return new lk0(d2Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.d2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.d2) view).getPhotoImage();
            if (this.d.f29122g0[0].B == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
            } else {
                photoImage.setAllowStartAnimation(false);
                photoImage.stopAnimation();
            }
        }
    }
}
