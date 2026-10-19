package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class bm0 implements org.telegram.ui.Components.ri {
    public final vm0 f35665a;

    public bm0(vm0 vm0Var) {
        this.f35665a = vm0Var;
    }

    @Override
    public final void J() {
        AndroidUtilities.hideKeyboard(this.f35665a.fragmentView.findFocus());
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.ti tiVar;
        vm0 vm0Var = this.f35665a;
        if (vm0Var.getParentActivity() != null && (tiVar = vm0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                tiVar.dismissWithButtonClick(i10);
                vm0Var.E1(i10);
                return;
            }
            if (i10 != 8) {
                tiVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = vm0Var.R0.f30546j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = vm0Var.R0.f30546j0.getSelectedPhotosOrder();
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
                vm0Var.F1(arrayList);
            }
        }
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final void u(org.telegram.ui.Components.gh ghVar) {
        ghVar.run();
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void E() {
    }

    @Override
    public final void O(Object obj) {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
