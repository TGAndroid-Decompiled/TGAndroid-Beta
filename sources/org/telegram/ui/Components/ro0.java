package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
public final class ro0 extends s4.r0 {
    public final int f28915a;
    public final org.telegram.ui.iy f28916b;

    public ro0(org.telegram.ui.iy iyVar, int i10) {
        this.f28915a = i10;
        this.f28916b = iyVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28915a) {
            case 0:
                this.f28916b.S(i10, i11);
                return;
            default:
                this.f28916b.S(i10, i11);
                return;
        }
    }
}
