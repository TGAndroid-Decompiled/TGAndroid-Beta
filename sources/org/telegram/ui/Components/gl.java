package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class gl implements q0.a {
    public final int f25193a;
    public final Object f25194b;
    public final boolean f25195c;

    public gl(int i10, Object obj, boolean z4) {
        this.f25193a = i10;
        this.f25194b = obj;
        this.f25195c = z4;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f25193a;
        boolean z4 = false;
        boolean z10 = this.f25195c;
        Object obj2 = this.f25194b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f22867n1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z10) {
                        z4 = true;
                    }
                    s5Var.setHasSpoiler(z4);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f22867n1;
                if (view2 instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) view2;
                    MediaController.PhotoEntry photoEntry2 = s5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z10) {
                        z4 = true;
                    }
                    s5Var2.setHighQuality(z4);
                    return;
                }
                return;
            default:
                Float f10 = (Float) obj;
                ic icVar = ((ab) obj2).f23355b;
                fb fbVar = icVar.f25677p;
                if (fbVar != null && !z10) {
                    fbVar.c(icVar.e.getHeight() - f10.floatValue());
                    return;
                }
                return;
        }
    }
}
