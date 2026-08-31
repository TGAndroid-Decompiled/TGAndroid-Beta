package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class km0 implements View.OnClickListener {
    public final int f28415a;
    public final qm0 f28416b;

    public km0(qm0 qm0Var, int i10) {
        this.f28415a = i10;
        this.f28416b = qm0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28415a) {
            case 0:
                this.f28416b.f30431f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f28416b.f30431f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f28416b.f30431f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f28416b.f30431f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f28416b.f30431f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
