package org.telegram.ui.Components;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12 implements Utilities.Callback {
    public final ItemOptions f$0;
    public final int f$1;
    public final long f$2;
    public final long f$3;
    public final BaseFragment f$4;
    public final Theme.ResourcesProvider f$5;

    public ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12(ItemOptions itemOptions, int i, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = itemOptions;
        this.f$1 = i;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = baseFragment;
        this.f$5 = resourcesProvider;
    }

    @Override
    public final void run(Object obj) {
        Integer num = (Integer) obj;
        this.f$0.dismiss();
        int iIntValue = num.intValue();
        int i = this.f$1;
        long j = this.f$2;
        long j2 = this.f$3;
        BaseFragment baseFragment = this.f$4;
        Theme.ResourcesProvider resourcesProvider = this.f$5;
        if (iIntValue != 0) {
            NotificationsController.getInstance(i).muteUntil(j, j2, num.intValue());
            if (BulletinFactory.canShowBulletin(baseFragment)) {
                BulletinFactory.createMuteBulletin(baseFragment, 5, num.intValue(), resourcesProvider).show();
                return;
            }
            return;
        }
        if (MessagesController.getInstance(i).isDialogMuted(j, j2)) {
            NotificationsController.getInstance(i).muteDialog(j, j2, false);
        }
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            BulletinFactory.createMuteBulletin(baseFragment, 4, num.intValue(), resourcesProvider).show();
        }
    }
}
