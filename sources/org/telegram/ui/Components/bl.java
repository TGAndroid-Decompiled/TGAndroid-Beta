package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
public final class bl implements q0.a {
    public final int f32272a;
    public final Object f32273b;
    public final boolean f32274c;

    public bl(int i7, Object obj, boolean z9) {
        this.f32272a = i7;
        this.f32273b = obj;
        this.f32274c = z9;
    }

    @Override
    public final void accept(Object obj) {
        cc ccVar;
        int i7 = this.f32272a;
        boolean z9 = false;
        boolean z10 = this.f32274c;
        Object obj2 = this.f32273b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.f31193q1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    org.telegram.messenger.gf photoEntry = q5Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z10) {
                        z9 = true;
                    }
                    q5Var.setHasSpoiler(z9);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f31193q1;
                if (view2 instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var2 = (org.telegram.ui.Cells.q5) view2;
                    org.telegram.messenger.gf photoEntry2 = q5Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z10) {
                        z9 = true;
                    }
                    q5Var2.setHighQuality(z9);
                    return;
                }
                return;
            default:
                Float f10 = (Float) obj;
                ab abVar = ((va) obj2).f39018b.f32633p;
                if (abVar != null && !z10) {
                    abVar.c(ccVar.f32623e.getHeight() - f10.floatValue());
                    return;
                }
                return;
        }
    }
}
