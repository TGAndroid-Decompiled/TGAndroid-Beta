package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class am0 implements org.telegram.ui.Components.li {
    public final vm0 f36570a;

    public am0(vm0 vm0Var) {
        this.f36570a = vm0Var;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.ni niVar;
        vm0 vm0Var = this.f36570a;
        if (vm0Var.getParentActivity() != null && (niVar = vm0Var.N0) != null) {
            if (i10 != 8 && i10 != 7) {
                niVar.dismissWithButtonClick(i10);
                vm0Var.F1(i10);
                return;
            }
            if (i10 != 8) {
                niVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = vm0Var.N0.f31005f0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = vm0Var.N0.f31005f0.getSelectedPhotosOrder();
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
                vm0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final void L0() {
        AndroidUtilities.hideKeyboard(this.f36570a.fragmentView.findFocus());
    }

    @Override
    public final boolean T1() {
        return false;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void x0(org.telegram.ui.Components.zg zgVar) {
        zgVar.run();
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
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
