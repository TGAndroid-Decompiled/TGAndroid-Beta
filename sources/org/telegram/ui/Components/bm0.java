package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class bm0 implements View.OnClickListener {
    public final int f24747a;
    public final im0 f24748b;

    public bm0(im0 im0Var, int i10) {
        this.f24747a = i10;
        this.f24748b = im0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24747a) {
            case 0:
                this.f24748b.f27173f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f24748b.f27173f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f24748b.f27173f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f24748b.f27173f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f24748b.f27173f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
