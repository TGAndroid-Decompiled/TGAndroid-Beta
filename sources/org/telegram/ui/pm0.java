package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class pm0 implements org.telegram.ui.Components.ri {
    public final kn0 f42457a;

    public pm0(kn0 kn0Var) {
        this.f42457a = kn0Var;
    }

    @Override
    public final void A(org.telegram.ui.Components.gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void R() {
        AndroidUtilities.hideKeyboard(this.f42457a.fragmentView.findFocus());
    }

    @Override
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.ti tiVar;
        kn0 kn0Var = this.f42457a;
        if (kn0Var.getParentActivity() != null && (tiVar = kn0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                tiVar.dismissWithButtonClick(i10);
                kn0Var.F1(i10);
                return;
            }
            if (i10 != 8) {
                tiVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = kn0Var.R0.f33002j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = kn0Var.R0.f33002j0.getSelectedPhotosOrder();
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
                kn0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final boolean x0() {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void T(Object obj) {
    }

    @Override
    public final void Y(TLRPC.User user) {
    }

    @Override
    public final void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
