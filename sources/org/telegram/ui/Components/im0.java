package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class im0 implements View.OnClickListener {
    public final int f25742a;
    public final om0 f25743b;

    public im0(om0 om0Var, int i10) {
        this.f25742a = i10;
        this.f25743b = om0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25742a) {
            case 0:
                this.f25743b.f27602f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f25743b.f27602f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f25743b.f27602f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f25743b.f27602f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f25743b.f27602f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
