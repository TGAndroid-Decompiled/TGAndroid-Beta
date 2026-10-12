package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class nn0 implements View.OnClickListener {
    public final int f28874a;
    public final un0 f28875b;

    public nn0(un0 un0Var, int i10) {
        this.f28874a = i10;
        this.f28875b = un0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28874a) {
            case 0:
                this.f28875b.f31208f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f28875b.f31208f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f28875b.f31208f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f28875b.f31208f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f28875b.f31208f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
