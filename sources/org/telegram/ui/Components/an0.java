package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class an0 implements View.OnClickListener {
    public final int f24680a;
    public final hn0 f24681b;

    public an0(hn0 hn0Var, int i10) {
        this.f24680a = i10;
        this.f24681b = hn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24680a) {
            case 0:
                this.f24681b.f26931f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f24681b.f26931f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f24681b.f26931f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f24681b.f26931f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f24681b.f26931f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
