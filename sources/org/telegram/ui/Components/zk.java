package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
public final class zk implements q0.a {
    public final int f41054a;
    public final Object f41055b;
    public final boolean f41056c;

    public zk(int i3, Object obj, boolean z10) {
        this.f41054a = i3;
        this.f41055b = obj;
        this.f41056c = z10;
    }

    @Override
    public final void accept(Object obj) {
        ac acVar;
        int i3 = this.f41054a;
        boolean z10 = false;
        boolean z11 = this.f41056c;
        Object obj2 = this.f41055b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f31258r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    org.telegram.messenger.ye photoEntry = q5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z11) {
                        z10 = true;
                    }
                    q5Var.setHasSpoiler(z10);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f31258r1;
                if (view2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) view2;
                    org.telegram.messenger.ye photoEntry2 = q5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z11) {
                        z10 = true;
                    }
                    q5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f10 = (Float) obj;
                za zaVar = ((ua) obj2).f38706b.f31798p;
                if (zaVar != null && !z11) {
                    zaVar.c(acVar.f31788e.getHeight() - f10.floatValue());
                    return;
                }
                return;
        }
    }
}
