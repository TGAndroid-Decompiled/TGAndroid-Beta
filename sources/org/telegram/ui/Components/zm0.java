package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class zm0 implements View.OnClickListener {
    public final int f32976a;
    public final gn0 f32977b;

    public zm0(gn0 gn0Var, int i10) {
        this.f32976a = i10;
        this.f32977b = gn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32976a) {
            case 0:
                this.f32977b.f26610f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f32977b.f26610f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f32977b.f26610f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f32977b.f26610f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f32977b.f26610f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
