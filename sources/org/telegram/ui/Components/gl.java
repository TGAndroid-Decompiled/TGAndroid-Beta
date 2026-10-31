package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
public final class gl implements q0.a {
    public final int f26390a;
    public final Object f26391b;
    public final boolean f26392c;

    public gl(int i10, Object obj, boolean z10) {
        this.f26390a = i10;
        this.f26391b = obj;
        this.f26392c = z10;
    }

    @Override
    public final void accept(Object obj) {
        wb wbVar;
        int i10 = this.f26390a;
        boolean z10 = false;
        boolean z11 = this.f26392c;
        Object obj2 = this.f26391b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f23845q1;
                if (view instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                    org.telegram.messenger.ef photoEntry = v5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z11) {
                        z10 = true;
                    }
                    v5Var.setHasSpoiler(z10);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f23845q1;
                if (view2 instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var2 = (org.telegram.ui.Cells.v5) view2;
                    org.telegram.messenger.ef photoEntry2 = v5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z11) {
                        z10 = true;
                    }
                    v5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f7 = (Float) obj;
                ua uaVar = ((pa) obj2).f29327b.f32141p;
                if (uaVar != null && !z11) {
                    uaVar.c(wbVar.e.getHeight() - f7.floatValue());
                    return;
                }
                return;
        }
    }
}
