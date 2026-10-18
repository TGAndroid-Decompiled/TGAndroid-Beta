package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
public final class xl implements q0.a {
    public final int f32421a;
    public final Object f32422b;
    public final boolean f32423c;

    public xl(int i10, Object obj, boolean z10) {
        this.f32421a = i10;
        this.f32422b = obj;
        this.f32423c = z10;
    }

    @Override
    public final void accept(Object obj) {
        qc qcVar;
        int i10 = this.f32421a;
        boolean z10 = false;
        boolean z11 = this.f32423c;
        Object obj2 = this.f32422b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f24080q1;
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
                boolean z13 = ChatAttachAlertPhotoLayout.f24080q1;
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
                ob obVar = ((jb) obj2).f27497b.f29651p;
                if (obVar != null && !z11) {
                    obVar.c(qcVar.e.getHeight() - f7.floatValue());
                    return;
                }
                return;
        }
    }
}
