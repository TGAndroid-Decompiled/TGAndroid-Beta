package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class nm0 implements View.OnClickListener {
    public final int f26743a;
    public final um0 f26744b;

    public nm0(um0 um0Var, int i10) {
        this.f26743a = i10;
        this.f26744b = um0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26743a) {
            case 0:
                this.f26744b.f28820f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f26744b.f28820f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f26744b.f28820f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f26744b.f28820f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f26744b.f28820f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
