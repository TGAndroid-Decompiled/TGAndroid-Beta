package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
public final class rl implements q0.a {
    public final int f39266a;
    public final Object f39267b;
    public final boolean f39268c;

    public rl(int i7, Object obj, boolean z10) {
        this.f39266a = i7;
        this.f39267b = obj;
        this.f39268c = z10;
    }

    @Override
    public final void accept(Object obj) {
        gc gcVar;
        int i7 = this.f39266a;
        boolean z10 = false;
        boolean z11 = this.f39268c;
        Object obj2 = this.f39267b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f32795r1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    org.telegram.messenger.ef photoEntry = s5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z11) {
                        z10 = true;
                    }
                    s5Var.setHasSpoiler(z10);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f32795r1;
                if (view2 instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) view2;
                    org.telegram.messenger.ef photoEntry2 = s5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z11) {
                        z10 = true;
                    }
                    s5Var2.setHighQuality(z10);
                    return;
                }
                return;
            default:
                Float f10 = (Float) obj;
                fb fbVar = ((ab) obj2).f33465b.f35514p;
                if (fbVar != null && !z11) {
                    fbVar.c(gcVar.f35504e.getHeight() - f10.floatValue());
                    return;
                }
                return;
        }
    }
}
