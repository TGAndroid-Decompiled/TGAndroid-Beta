package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class dl implements q0.a {
    public final int f27751a;
    public final Object f27752b;
    public final boolean f27753c;

    public dl(int i9, Object obj, boolean z10) {
        this.f27751a = i9;
        this.f27752b = obj;
        this.f27753c = z10;
    }

    @Override
    public final void accept(Object obj) {
        int i9 = this.f27751a;
        boolean z10 = false;
        boolean z11 = this.f27753c;
        Object obj2 = this.f27752b;
        switch (i9) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f26241m1;
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
                boolean z13 = ChatAttachAlertPhotoLayout.f26241m1;
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
                Float f10 = (Float) obj;
                gc gcVar = ((ab) obj2).f26745b;
                fb fbVar = gcVar.f28743p;
                if (fbVar != null && !z11) {
                    fbVar.c(gcVar.f28733e.getHeight() - f10.floatValue());
                    return;
                }
                return;
        }
    }
}
