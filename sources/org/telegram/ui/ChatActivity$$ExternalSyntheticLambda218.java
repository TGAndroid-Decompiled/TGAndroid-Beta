package org.telegram.ui;

import androidx.core.util.Consumer;
import java.util.List;
import org.telegram.ui.Components.ReactedUsersListView;

public final class ChatActivity$$ExternalSyntheticLambda218 implements Consumer {
    public final ReactedUsersListView f$0;

    @Override
    public final void accept(Object obj) {
        this.f$0.setSeenUsers((List) obj);
    }
}
