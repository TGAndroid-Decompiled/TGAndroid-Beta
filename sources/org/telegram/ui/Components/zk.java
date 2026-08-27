package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;

public final class zk implements q0.a {

    public final int f35253a;

    public final Object f35254b;

    public final boolean f35255c;

    public zk(int i10, Object obj, boolean z10) {
        this.f35253a = i10;
        this.f35254b = obj;
        this.f35255c = z10;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f35253a;
        boolean z10 = false;
        boolean z11 = this.f35255c;
        Object obj2 = this.f35254b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f26237m1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    MediaController.PhotoEntry photoEntry = q5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.imageId)) && z11) {
                        z10 = true;
                    }
                    q5Var.setHasSpoiler(z10);
                }
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f26237m1;
                if (view2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) view2;
                    MediaController.PhotoEntry photoEntry2 = q5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.imageId)) && z11) {
                        z10 = true;
                    }
                    q5Var2.setHighQuality(z10);
                }
                break;
            default:
                Float f10 = (Float) obj;
                ec ecVar = ((ya) obj2).f34873b;
                db dbVar = ecVar.f28026p;
                if (dbVar != null && !z11) {
                    dbVar.c(ecVar.f28016e.getHeight() - f10.floatValue());
                    break;
                }
                break;
        }
    }
}
