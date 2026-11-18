package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
public final class pl implements q0.a {
    public final int f38482a;
    public final Object f38483b;
    public final boolean f38484c;

    public pl(int i7, Object obj, boolean z10) {
        this.f38482a = i7;
        this.f38483b = obj;
        this.f38484c = z10;
    }

    @Override
    public final void accept(Object obj) {
        gc gcVar;
        int i7 = this.f38482a;
        boolean z10 = false;
        boolean z11 = this.f38484c;
        Object obj2 = this.f38483b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f32762r1;
                if (view instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                    org.telegram.messenger.ef photoEntry = r5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z11) {
                        z10 = true;
                    }
                    r5Var.setHasSpoiler(z10);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f32762r1;
                if (view2 instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var2 = (org.telegram.ui.Cells.r5) view2;
                    org.telegram.messenger.ef photoEntry2 = r5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z11) {
                        z10 = true;
                    }
                    r5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f10 = (Float) obj;
                fb fbVar = ((ab) obj2).f33324b.f35467p;
                if (fbVar != null && !z11) {
                    fbVar.c(gcVar.f35457e.getHeight() - f10.floatValue());
                    return;
                }
                return;
        }
    }
}
