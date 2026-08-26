package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda9;

public final class AffiliateProgramFragment$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final AffiliateProgramFragment f$0;

    public AffiliateProgramFragment$$ExternalSyntheticLambda0(AffiliateProgramFragment affiliateProgramFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = affiliateProgramFragment;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(29, this.f$0, (TLRPC.UserFull) obj));
                break;
            case 1:
                AffiliateProgramFragment affiliateProgramFragment = this.f$0;
                affiliateProgramFragment.program.commission_permille = ((Integer) obj).intValue();
                affiliateProgramFragment.updateEnabled();
                break;
            default:
                AffiliateProgramFragment affiliateProgramFragment2 = this.f$0;
                affiliateProgramFragment2.program.duration_months = ((Integer) affiliateProgramFragment2.durationValues.get(((Integer) obj).intValue())).intValue();
                affiliateProgramFragment2.updateEnabled();
                break;
        }
    }
}
