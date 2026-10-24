package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ku0 extends km0 {
    public final Context f28086c;
    public final wv0 d;

    public ku0(wv0 wv0Var, Context context) {
        this.d = wv0Var;
        this.f28086c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        lv0[] lv0VarArr = this.d.f32406t1;
        if (lv0VarArr[5].f28439a.size() == 0 && !lv0VarArr[5].f28443g) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        lv0[] lv0VarArr = this.d.f32406t1;
        if (lv0VarArr[5].f28439a.size() == 0 && !lv0VarArr[5].f28443g) {
            return 1;
        }
        return lv0VarArr[5].f28439a.size();
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        lv0[] lv0VarArr = this.d.f32406t1;
        if (lv0VarArr[5].f28439a.size() == 0 && !lv0VarArr[5].f28443g) {
            return 11;
        }
        return 12;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        char c10;
        if (b1Var.f46345f == 12) {
            wv0 wv0Var = this.d;
            MessageObject messageObject = (MessageObject) wv0Var.f32406t1[5].f28439a.get(i10);
            TLRPC.Document document = messageObject.getDocument();
            if (document != null) {
                View view = b1Var.f46342a;
                if (view instanceof org.telegram.ui.Cells.e2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    e2Var.d(messageObject.messageOwner.date, document, messageObject);
                    boolean z10 = false;
                    if (wv0Var.C1) {
                        SparseArray[] sparseArrayArr = wv0Var.Z0;
                        if (messageObject.getDialogId() == wv0Var.f32385j1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                            z10 = true;
                        }
                        e2Var.c(z10, !wv0Var.f32362b1);
                        return;
                    }
                    e2Var.c(false, !wv0Var.f32362b1);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        wv0 wv0Var = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = wv0Var.F1;
        Context context = this.f28086c;
        if (i10 == 11) {
            ju0 N = wv0.N(5, wv0Var.f32385j1, context, g6Var);
            N.setLayoutParams(new s4.o0(-1, -1));
            return new s4.b1(N);
        }
        org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, g6Var, true);
        e2Var.setCanPreviewGif(true);
        return new s4.b1(e2Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if (view instanceof org.telegram.ui.Cells.e2) {
            ImageReceiver photoImage = ((org.telegram.ui.Cells.e2) view).getPhotoImage();
            if (this.d.f32386k0[0].F == 5) {
                photoImage.setAllowStartAnimation(true);
                photoImage.startAnimation();
                return;
            }
            photoImage.setAllowStartAnimation(false);
            photoImage.stopAnimation();
        }
    }
}
