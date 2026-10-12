package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class nn0 implements View.OnClickListener {
    public final int f28870a;
    public final un0 f28871b;

    public nn0(un0 un0Var, int i10) {
        this.f28870a = i10;
        this.f28871b = un0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28870a) {
            case 0:
                this.f28871b.f31216f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f28871b.f31216f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f28871b.f31216f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f28871b.f31216f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f28871b.f31216f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
