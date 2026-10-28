package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class yl implements q0.a {
    public final int f35104a;
    public final Object f35105b;
    public final boolean f35106c;

    public yl(int i10, Object obj, boolean z10) {
        this.f35104a = i10;
        this.f35105b = obj;
        this.f35106c = z10;
    }

    @Override
    public final void accept(Object obj) {
        qc qcVar;
        int i10 = this.f35104a;
        boolean z10 = false;
        boolean z11 = this.f35106c;
        Object obj2 = this.f35105b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f26017q1;
                if (view instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
                    MediaController.PhotoEntry photoEntry = x5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z11) {
                        z10 = true;
                    }
                    x5Var.setHasSpoiler(z10);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f26017q1;
                if (view2 instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var2 = (org.telegram.ui.Cells.x5) view2;
                    MediaController.PhotoEntry photoEntry2 = x5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z11) {
                        z10 = true;
                    }
                    x5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f7 = (Float) obj;
                ob obVar = ((jb) obj2).f29613b.f31868q;
                if (obVar != null && !z11) {
                    obVar.c(qcVar.e.getHeight() - f7.floatValue());
                    return;
                }
                return;
        }
    }
}
