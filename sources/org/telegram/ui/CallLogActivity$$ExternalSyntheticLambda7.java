package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;

public final class CallLogActivity$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final CallLogActivity f$0;

    public CallLogActivity$$ExternalSyntheticLambda7(CallLogActivity callLogActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = callLogActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CallLogActivity callLogActivity = this.f$0;
                callLogActivity.listView.postOnAnimation(new CallLogActivity$$ExternalSyntheticLambda7(callLogActivity, 5));
                break;
            case 1:
                CallLogActivity callLogActivity2 = this.f$0;
                callLogActivity2.blur3_InvalidateBlur();
                callLogActivity2.checkUi_listViewPadding();
                break;
            case 2:
                CallLogActivity callLogActivity3 = this.f$0;
                callLogActivity3.setCallsTabVisible(false);
                Bulletin bulletinCreateSimpleBulletin = (callLogActivity3.hasMainTabs ? BulletinFactory.global() : BulletinFactory.of(callLogActivity3)).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasHiddenTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new CallLogActivity$$ExternalSyntheticLambda7(callLogActivity3, 6));
                bulletinCreateSimpleBulletin.duration = 5000;
                bulletinCreateSimpleBulletin.show();
                break;
            case 3:
                this.f$0.showDeleteAlert(true);
                break;
            case 4:
                this.f$0.setCallsTabVisible(false);
                break;
            case 5:
                CallLogActivity callLogActivity4 = this.f$0;
                callLogActivity4.checkUi_listClip();
                callLogActivity4.blur3_InvalidateBlur();
                break;
            default:
                this.f$0.setCallsTabVisible(true);
                break;
        }
    }
}
