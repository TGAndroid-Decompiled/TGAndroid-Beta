package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class hl implements q0.a {
    public final int f29198a;
    public final Object f29199b;
    public final boolean f29200c;

    public hl(int i10, Object obj, boolean z10) {
        this.f29198a = i10;
        this.f29199b = obj;
        this.f29200c = z10;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f29198a;
        boolean z10 = false;
        boolean z11 = this.f29200c;
        Object obj2 = this.f29199b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f26252m1;
                if (view instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                    MediaController.PhotoEntry photoEntry = r5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z11) {
                        z10 = true;
                    }
                    r5Var.setHasSpoiler(z10);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f26252m1;
                if (view2 instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) view2;
                    MediaController.PhotoEntry photoEntry2 = r5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z11) {
                        z10 = true;
                    }
                    r5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f9 = (Float) obj;
                mc mcVar = ((fb) obj2).f28367b;
                kb kbVar = mcVar.f30658p;
                if (kbVar != null && !z11) {
                    kbVar.c(mcVar.f30648e.getHeight() - f9.floatValue());
                    return;
                }
                return;
        }
    }
}
