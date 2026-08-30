package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class im0 implements org.telegram.ui.Components.ji {
    public final dn0 f35140a;

    public im0(dn0 dn0Var) {
        this.f35140a = dn0Var;
    }

    @Override
    public final void C() {
        AndroidUtilities.hideKeyboard(this.f35140a.fragmentView.findFocus());
    }

    @Override
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        org.telegram.ui.Components.li liVar;
        dn0 dn0Var = this.f35140a;
        if (dn0Var.getParentActivity() != null && (liVar = dn0Var.O0) != null) {
            if (i10 != 8 && i10 != 7) {
                liVar.dismissWithButtonClick(i10);
                dn0Var.F1(i10);
                return;
            }
            if (i10 != 8) {
                liVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = dn0Var.O0.f26702g0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = dn0Var.O0.f26702g0.getSelectedPhotosOrder();
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
                dn0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final boolean V() {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void x(org.telegram.ui.Components.wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void D(Object obj) {
    }

    @Override
    public final void G(TLRPC.User user) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
