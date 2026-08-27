package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

public final class pl0 implements View.OnClickListener {

    public final int f31627a;

    public final vl0 f31628b;

    public pl0(vl0 vl0Var, int i10) {
        this.f31627a = i10;
        this.f31628b = vl0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31627a) {
            case 0:
                this.f31628b.f33450f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                this.f31628b.f33450f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                this.f31628b.f33450f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                this.f31628b.f33450f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                this.f31628b.f33450f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
