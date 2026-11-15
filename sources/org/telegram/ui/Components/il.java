package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
public final class il implements q0.a {
    public final int f35635a;
    public final Object f35636b;
    public final boolean f35637c;

    public il(int i7, Object obj, boolean z10) {
        this.f35635a = i7;
        this.f35636b = obj;
        this.f35637c = z10;
    }

    @Override
    public final void accept(Object obj) {
        xb xbVar;
        int i7 = this.f35635a;
        boolean z10 = false;
        boolean z11 = this.f35637c;
        Object obj2 = this.f35636b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f32365r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    org.telegram.messenger.ff photoEntry = q5Var.getPhotoEntry();
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
                boolean z13 = ChatAttachAlertPhotoLayout.f32365r1;
                if (view2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) view2;
                    org.telegram.messenger.ff photoEntry2 = q5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z11) {
                        z10 = true;
                    }
                    q5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f10 = (Float) obj;
                wa waVar = ((ra) obj2).f38908b.f41641p;
                if (waVar != null && !z11) {
                    waVar.c(xbVar.f41631e.getHeight() - f10.floatValue());
                    return;
                }
                return;
        }
    }
}
