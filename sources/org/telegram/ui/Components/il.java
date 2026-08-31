package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class il implements q0.a {
    public final int f27852a;
    public final Object f27853b;
    public final boolean f27854c;

    public il(int i10, Object obj, boolean z4) {
        this.f27852a = i10;
        this.f27853b = obj;
        this.f27854c = z4;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f27852a;
        boolean z4 = false;
        boolean z10 = this.f27854c;
        Object obj2 = this.f27853b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f24736n1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z10) {
                        z4 = true;
                    }
                    t5Var.setHasSpoiler(z4);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f24736n1;
                if (view2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) view2;
                    MediaController.PhotoEntry photoEntry2 = t5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z10) {
                        z4 = true;
                    }
                    t5Var2.setHighQuality(z4);
                    return;
                }
                return;
            default:
                Float f10 = (Float) obj;
                ic icVar = ((ab) obj2).f25215b;
                fb fbVar = icVar.f27751p;
                if (fbVar != null && !z10) {
                    fbVar.c(icVar.f27741e.getHeight() - f10.floatValue());
                    return;
                }
                return;
        }
    }
}
