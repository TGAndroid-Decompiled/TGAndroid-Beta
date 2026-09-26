package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ol implements q0.a {
    public final int f27054a;
    public final Object f27055b;
    public final boolean f27056c;

    public ol(int i10, Object obj, boolean z10) {
        this.f27054a = i10;
        this.f27055b = obj;
        this.f27056c = z10;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f27054a;
        boolean z10 = false;
        boolean z11 = this.f27056c;
        Object obj2 = this.f27055b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f22120q1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    MediaController.PhotoEntry photoEntry = t5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z11) {
                        z10 = true;
                    }
                    t5Var.setHasSpoiler(z10);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f22120q1;
                if (view2 instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var2 = (org.telegram.ui.Cells.t5) view2;
                    MediaController.PhotoEntry photoEntry2 = t5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z11) {
                        z10 = true;
                    }
                    t5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f7 = (Float) obj;
                qc qcVar = ((jb) obj2).f25370b;
                ob obVar = qcVar.f27641p;
                if (obVar != null && !z11) {
                    obVar.c(qcVar.e.getHeight() - f7.floatValue());
                    return;
                }
                return;
        }
    }
}
