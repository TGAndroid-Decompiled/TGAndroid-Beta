package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.DialogCell;

public final class ChatEditActivity$$ExternalSyntheticLambda11 implements View.OnClickListener {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final Object f$1;
    public final long f$2;

    public ChatEditActivity$$ExternalSyntheticLambda11(BaseFragment baseFragment, Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = obj;
        this.f$2 = j;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatEditActivity) this.f$0).lambda$createView$20((boolean[]) this.f$1, this.f$2, view);
                break;
            case 1:
                ((DialogsActivity) this.f$0).lambda$showChatPreview$98((DialogCell) this.f$1, this.f$2, view);
                break;
            default:
                ((PaymentFormActivity) this.f$0).lambda$createView$15((TextView) this.f$1, this.f$2, view);
                break;
        }
    }
}
