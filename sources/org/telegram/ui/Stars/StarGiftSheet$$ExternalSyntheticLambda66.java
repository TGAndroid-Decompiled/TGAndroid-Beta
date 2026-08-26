package org.telegram.ui.Stars;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

public final class StarGiftSheet$$ExternalSyntheticLambda66 implements Utilities.Callback3 {
    public final int $r8$classId;
    public final StarGiftSheet f$0;

    public StarGiftSheet$$ExternalSyntheticLambda66(StarGiftSheet starGiftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openCrafting$5((ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                this.f$0.showHint((CharSequence) obj, (View) obj2, zBooleanValue);
                break;
        }
    }
}
