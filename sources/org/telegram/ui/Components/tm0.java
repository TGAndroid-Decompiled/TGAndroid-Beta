package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class tm0 implements View.OnClickListener {
    public final int f31096a;
    public final an0 f31097b;

    public tm0(an0 an0Var, int i10) {
        this.f31096a = i10;
        this.f31097b = an0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31096a) {
            case 0:
                this.f31097b.f24587f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f31097b.f24587f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f31097b.f24587f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f31097b.f24587f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f31097b.f24587f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
