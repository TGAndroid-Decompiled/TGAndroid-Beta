package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class hn0 implements View.OnClickListener {
    public final int f27095a;
    public final on0 f27096b;

    public hn0(on0 on0Var, int i10) {
        this.f27095a = i10;
        this.f27096b = on0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27095a) {
            case 0:
                this.f27096b.f29527f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f27096b.f29527f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f27096b.f29527f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f27096b.f29527f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f27096b.f29527f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
