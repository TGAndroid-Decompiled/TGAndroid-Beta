package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class km0 implements org.telegram.ui.Components.ki {
    public final fn0 f38439a;

    public km0(fn0 fn0Var) {
        this.f38439a = fn0Var;
    }

    @Override
    public final void B0(org.telegram.ui.Components.wg wgVar) {
        wgVar.run();
    }

    @Override
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        org.telegram.ui.Components.mi miVar;
        fn0 fn0Var = this.f38439a;
        if (fn0Var.getParentActivity() != null && (miVar = fn0Var.O0) != null) {
            if (i10 != 8 && i10 != 7) {
                miVar.dismissWithButtonClick(i10);
                fn0Var.F1(i10);
                return;
            }
            if (i10 != 8) {
                miVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = fn0Var.O0.f29054g0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = fn0Var.O0.f29054g0.getSelectedPhotosOrder();
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
                fn0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final void Q0() {
        AndroidUtilities.hideKeyboard(this.f38439a.fragmentView.findFocus());
    }

    @Override
    public final boolean b2() {
        return false;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void o1(TLRPC.User user) {
    }

    @Override
    public final void y0() {
    }

    @Override
    public final void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
