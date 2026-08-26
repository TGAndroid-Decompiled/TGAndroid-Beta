package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;

public final class PassportActivity$$ExternalSyntheticLambda70 implements View.OnClickListener {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;

    public PassportActivity$$ExternalSyntheticLambda70(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, PassportActivity passportActivity, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = passportActivity;
        this.f$1 = arrayList;
        this.f$2 = tL_secureRequiredType;
        this.f$3 = z;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((PassportActivity) this.f$0).lambda$addField$64((ArrayList) this.f$1, (TLRPC.TL_secureRequiredType) this.f$2, this.f$3, view);
                break;
            case 1:
                ((DataSettingsActivity) this.f$0).lambda$createView$5((String) this.f$1, this.f$3, (AlertDialog.Builder) this.f$2, view);
                break;
            case 2:
                ((PaymentFormActivity) this.f$0).lambda$sendData$64((Bulletin) this.f$1, this.f$3, (TLRPC.Message) this.f$2, view);
                break;
            default:
                ((PaymentFormActivity) this.f$0).lambda$sendData$59((Bulletin) this.f$1, this.f$3, (TLRPC.Message[]) this.f$2, view);
                break;
        }
    }

    public PassportActivity$$ExternalSyntheticLambda70(BaseFragment baseFragment, Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = obj;
        this.f$3 = z;
        this.f$2 = obj2;
    }
}
