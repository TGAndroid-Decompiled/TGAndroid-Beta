package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class zm0 implements View.OnClickListener {
    public final int f32969a;
    public final gn0 f32970b;

    public zm0(gn0 gn0Var, int i10) {
        this.f32969a = i10;
        this.f32970b = gn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32969a) {
            case 0:
                this.f32970b.f26603f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f32970b.f26603f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f32970b.f26603f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f32970b.f26603f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f32970b.f26603f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
