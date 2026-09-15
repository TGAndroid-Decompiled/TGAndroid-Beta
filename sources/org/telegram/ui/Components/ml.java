package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class ml implements q0.a {
    public final int f26175a;
    public final Object f26176b;
    public final boolean f26177c;

    public ml(int i10, Object obj, boolean z10) {
        this.f26175a = i10;
        this.f26176b = obj;
        this.f26177c = z10;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f26175a;
        boolean z10 = false;
        boolean z11 = this.f26177c;
        Object obj2 = this.f26176b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f21898q1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z11) {
                        z10 = true;
                    }
                    s5Var.setHasSpoiler(z10);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f21898q1;
                if (view2 instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) view2;
                    MediaController.PhotoEntry photoEntry2 = s5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z11) {
                        z10 = true;
                    }
                    s5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f7 = (Float) obj;
                oc ocVar = ((hb) obj2).f24657b;
                mb mbVar = ocVar.f26760p;
                if (mbVar != null && !z11) {
                    mbVar.c(ocVar.e.getHeight() - f7.floatValue());
                    return;
                }
                return;
        }
    }
}
