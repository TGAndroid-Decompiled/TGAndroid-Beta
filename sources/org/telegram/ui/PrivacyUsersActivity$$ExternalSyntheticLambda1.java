package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RecyclerListView;

public final class PrivacyUsersActivity$$ExternalSyntheticLambda1 implements GenericProvider, RecyclerListView.OnItemLongClickListener, GroupCreateActivity.GroupCreateActivityDelegate {
    public final PrivacyUsersActivity f$0;

    public PrivacyUsersActivity$$ExternalSyntheticLambda1(PrivacyUsersActivity privacyUsersActivity) {
        this.f$0 = privacyUsersActivity;
    }

    @Override
    public void didSelectUsers(ArrayList arrayList, boolean z, boolean z2) {
        PrivacyUsersActivity privacyUsersActivity = this.f$0;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw null;
        }
        privacyUsersActivity.updateRows$15();
    }

    @Override
    public boolean onItemClick(int i, View view) {
        PrivacyUsersActivity privacyUsersActivity = this.f$0;
        if (i < privacyUsersActivity.usersStartRow || i >= privacyUsersActivity.usersEndRow) {
            return false;
        }
        if (privacyUsersActivity.currentType != 1) {
            throw null;
        }
        privacyUsersActivity.showUnblockAlert(Long.valueOf(privacyUsersActivity.getMessagesController().blockePeers.keyAt(i - privacyUsersActivity.usersStartRow)), view);
        return true;
    }

    @Override
    public Object provide(Object obj) {
        PrivacyUsersActivity privacyUsersActivity = this.f$0;
        privacyUsersActivity.getClass();
        if (((Integer) obj).intValue() == privacyUsersActivity.deleteAllRow) {
            return Integer.valueOf(Theme.multAlpha(0.12f, Theme.getColor(null, Theme.key_text_RedRegular, false)));
        }
        return null;
    }
}
