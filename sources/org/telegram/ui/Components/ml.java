package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ml implements q0.a {
    public final int f26414a;
    public final Object f26415b;
    public final boolean f26416c;

    public ml(int i10, Object obj, boolean z10) {
        this.f26414a = i10;
        this.f26415b = obj;
        this.f26416c = z10;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f26414a;
        boolean z10 = false;
        boolean z11 = this.f26416c;
        Object obj2 = this.f26415b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f22119q1;
                if (view instanceof org.telegram.ui.Cells.u5) {
                    org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                    MediaController.PhotoEntry photoEntry = u5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z11) {
                        z10 = true;
                    }
                    u5Var.setHasSpoiler(z10);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f22119q1;
                if (view2 instanceof org.telegram.ui.Cells.u5) {
                    org.telegram.ui.Cells.u5 u5Var2 = (org.telegram.ui.Cells.u5) view2;
                    MediaController.PhotoEntry photoEntry2 = u5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z11) {
                        z10 = true;
                    }
                    u5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f7 = (Float) obj;
                pc pcVar = ((ib) obj2).f24984b;
                nb nbVar = pcVar.f27258p;
                if (nbVar != null && !z11) {
                    nbVar.c(pcVar.e.getHeight() - f7.floatValue());
                    return;
                }
                return;
        }
    }
}
