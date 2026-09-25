package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class lm0 implements org.telegram.ui.Components.ui {
    public final gn0 f35386a;

    public lm0(gn0 gn0Var) {
        this.f35386a = gn0Var;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.wi wiVar;
        gn0 gn0Var = this.f35386a;
        if (gn0Var.getParentActivity() != null && (wiVar = gn0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                wiVar.dismissWithButtonClick(i10);
                gn0Var.F1(i10);
                return;
            }
            if (i10 != 8) {
                wiVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = gn0Var.R0.f30018j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = gn0Var.R0.f30018j0.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
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
                gn0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final void K0() {
        AndroidUtilities.hideKeyboard(this.f35386a.fragmentView.findFocus());
    }

    @Override
    public final boolean S1() {
        return false;
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(org.telegram.ui.Components.hh hhVar) {
        hhVar.run();
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
