package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

public final class dm0 implements org.telegram.ui.Components.ei {

    public final xm0 f37445a;

    public dm0(xm0 xm0Var) {
        this.f37445a = xm0Var;
    }

    @Override
    public final void F() {
        AndroidUtilities.hideKeyboard(this.f37445a.fragmentView.findFocus());
    }

    @Override
    public final boolean N0() {
        return false;
    }

    @Override
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.gi giVar;
        xm0 xm0Var = this.f37445a;
        if (xm0Var.getParentActivity() == null || (giVar = xm0Var.N0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            giVar.dismissWithButtonClick(i10);
            xm0Var.F1(i10);
            return;
        }
        if (i10 != 8) {
            giVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = xm0Var.N0.f28650f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = xm0Var.N0.f28650f0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i13));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            String str = photoEntry.imagePath;
            if (str != null) {
                sendingMediaInfo.path = str;
            } else {
                sendingMediaInfo.path = photoEntry.path;
            }
            arrayList.add(sendingMediaInfo);
            photoEntry.reset();
        }
        xm0Var.G1(arrayList);
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void y(org.telegram.ui.Components.sg sgVar) {
        sgVar.run();
    }

    @Override
    public final void I(Object obj) {
    }

    @Override
    public final void g0(TLRPC.User user) {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
