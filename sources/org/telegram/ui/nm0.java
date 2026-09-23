package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class nm0 implements org.telegram.ui.Components.ui {
    public final in0 f35556a;

    public nm0(in0 in0Var) {
        this.f35556a = in0Var;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.wi wiVar;
        in0 in0Var = this.f35556a;
        if (in0Var.getParentActivity() != null && (wiVar = in0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                wiVar.dismissWithButtonClick(i10);
                in0Var.F1(i10);
                return;
            }
            if (i10 != 8) {
                wiVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = in0Var.R0.f29677j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = in0Var.R0.f29677j0.getSelectedPhotosOrder();
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
                in0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final void K0() {
        AndroidUtilities.hideKeyboard(this.f35556a.fragmentView.findFocus());
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
    public final void x0(org.telegram.ui.Components.gh ghVar) {
        ghVar.run();
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
