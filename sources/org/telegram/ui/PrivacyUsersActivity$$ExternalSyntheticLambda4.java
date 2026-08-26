package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.RecyclerListView;

public final class PrivacyUsersActivity$$ExternalSyntheticLambda4 implements GroupCreateActivity.GroupCreateActivityDelegate, GenericProvider, RecyclerListView.OnItemLongClickListener {
    public final PrivacyUsersActivity f$0;

    public PrivacyUsersActivity$$ExternalSyntheticLambda4(PrivacyUsersActivity privacyUsersActivity) {
        this.f$0 = privacyUsersActivity;
    }

    @Override
    public void didSelectUsers(boolean z, boolean z2, ArrayList arrayList) {
        this.f$0.lambda$createView$2(z, z2, arrayList);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createView$4(view, i);
    }

    @Override
    public Object provide(Object obj) {
        return this.f$0.lambda$createView$0((Integer) obj);
    }
}
