package org.telegram.ui.bots;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Stars.BotStarsActivity;

public final class AffiliateProgramFragment$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final AffiliateProgramFragment f$0;

    public AffiliateProgramFragment$$ExternalSyntheticLambda3(AffiliateProgramFragment affiliateProgramFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = affiliateProgramFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AffiliateProgramFragment affiliateProgramFragment = this.f$0;
                BotStarsActivity.AnonymousClass6 anonymousClass6 = affiliateProgramFragment.button;
                int i = affiliateProgramFragment.program.end_date;
                anonymousClass6.setSubText(i == 0 ? null : SelectorUserCell.buildCountDownTime(((long) (i - affiliateProgramFragment.getConnectionsManager().getCurrentTime())) * 1000), true);
                if (affiliateProgramFragment.program.end_date != 0 && affiliateProgramFragment.attached) {
                    AndroidUtilities.runOnUIThread(affiliateProgramFragment.updateTimerRunnable, 1000L);
                    break;
                }
                break;
            case 1:
                AffiliateProgramFragment affiliateProgramFragment2 = this.f$0;
                Browser.openUrl(affiliateProgramFragment2.getParentActivity(), LocaleController.getString((affiliateProgramFragment2.new_program || affiliateProgramFragment2.program.end_date != 0) ? R.string.AffiliateProgramUpdateInfoLink : R.string.AffiliateProgramStartInfoLink));
                break;
            default:
                AffiliateProgramFragment affiliateProgramFragment3 = this.f$0;
                affiliateProgramFragment3.getClass();
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = affiliateProgramFragment3.getMessagesController().getInputUser(affiliateProgramFragment3.bot_id);
                TL_payments.starRefProgram starrefprogram = affiliateProgramFragment3.program;
                updatestarrefprogram.commission_permille = starrefprogram.commission_permille;
                int i2 = starrefprogram.duration_months;
                updatestarrefprogram.duration_months = i2;
                if (i2 > 0) {
                    updatestarrefprogram.flags |= 1;
                    starrefprogram.duration_months = i2 | 1;
                } else {
                    updatestarrefprogram.flags &= -2;
                    starrefprogram.duration_months = i2 & (-2);
                }
                AlertDialog alertDialog = new AlertDialog(affiliateProgramFragment3.getParentActivity(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 150L);
                affiliateProgramFragment3.getConnectionsManager().sendRequest(updatestarrefprogram, new AffiliateProgramFragment$$ExternalSyntheticLambda10(affiliateProgramFragment3, alertDialog, 1));
                break;
        }
    }
}
