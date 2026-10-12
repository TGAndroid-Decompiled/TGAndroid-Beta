package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class dn0 implements View.OnClickListener {
    public final int f24459a;
    public final kn0 f24460b;

    public dn0(kn0 kn0Var, int i10) {
        this.f24459a = i10;
        this.f24460b = kn0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24459a) {
            case 0:
                this.f24460b.f26742f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f24460b.f26742f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f24460b.f26742f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f24460b.f26742f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f24460b.f26742f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
