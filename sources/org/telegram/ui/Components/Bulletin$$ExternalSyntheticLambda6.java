package org.telegram.ui.Components;

import androidx.core.util.Consumer;

public final class Bulletin$$ExternalSyntheticLambda6 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;

    public Bulletin$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Bulletin) this.f$0).lambda$hide$4((Float) obj);
                break;
            default:
                ((ChatAttachAlert) this.f$0).lambda$openColorsLayout$55(obj);
                break;
        }
    }
}
