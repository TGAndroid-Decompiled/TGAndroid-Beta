package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class cm0 implements org.telegram.ui.Components.ii {
    public final wm0 f37235a;

    public cm0(wm0 wm0Var) {
        this.f37235a = wm0Var;
    }

    @Override
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.ki kiVar;
        wm0 wm0Var = this.f37235a;
        if (wm0Var.getParentActivity() != null && (kiVar = wm0Var.N0) != null) {
            if (i9 != 8 && i9 != 7) {
                kiVar.dismissWithButtonClick(i9);
                wm0Var.F1(i9);
                return;
            }
            if (i9 != 8) {
                kiVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = wm0Var.N0.f30114f0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = wm0Var.N0.f30114f0.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i12));
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
                wm0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void t(org.telegram.ui.Components.wg wgVar) {
        wgVar.run();
    }

    @Override
    public final boolean t0() {
        return false;
    }

    @Override
    public final void u() {
        AndroidUtilities.hideKeyboard(this.f37235a.fragmentView.findFocus());
    }

    @Override
    public final void A(Object obj) {
    }

    @Override
    public final void E(TLRPC.User user) {
    }

    @Override
    public final void o() {
    }

    @Override
    public final void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
