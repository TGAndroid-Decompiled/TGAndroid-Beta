package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class an0 implements View.OnClickListener {
    public final int f24684a;
    public final hn0 f24685b;

    public an0(hn0 hn0Var, int i10) {
        this.f24684a = i10;
        this.f24685b = hn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24684a) {
            case 0:
                this.f24685b.f26935f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f24685b.f26935f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f24685b.f26935f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f24685b.f26935f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f24685b.f26935f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
