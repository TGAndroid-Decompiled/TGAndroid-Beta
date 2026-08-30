package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class gl implements q0.a {
    public final int f25187a;
    public final Object f25188b;
    public final boolean f25189c;

    public gl(int i10, Object obj, boolean z4) {
        this.f25187a = i10;
        this.f25188b = obj;
        this.f25189c = z4;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f25187a;
        boolean z4 = false;
        boolean z10 = this.f25189c;
        Object obj2 = this.f25188b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f22894n1;
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
                boolean z12 = ChatAttachAlertPhotoLayout.f22894n1;
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
                ic icVar = ((ab) obj2).f23338b;
                fb fbVar = icVar.f25678p;
                if (fbVar != null && !z10) {
                    fbVar.c(icVar.e.getHeight() - f10.floatValue());
                    return;
                }
                return;
        }
    }
}
