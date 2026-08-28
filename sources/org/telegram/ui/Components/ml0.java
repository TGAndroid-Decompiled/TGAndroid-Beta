package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;
public final class ml0 implements View.OnClickListener {
    public final int f30885a;
    public final sl0 f30886b;

    public ml0(sl0 sl0Var, int i9) {
        this.f30885a = i9;
        this.f30886b = sl0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30885a) {
            case 0:
                this.f30886b.f32502f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 1:
                this.f30886b.f32502f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 2:
                this.f30886b.f32502f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            case 3:
                this.f30886b.f32502f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
            default:
                this.f30886b.f32502f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                return;
        }
    }
}
