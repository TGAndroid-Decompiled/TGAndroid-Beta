package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class EmojiPacksAlert$$ExternalSyntheticLambda8 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Theme.ResourcesProvider f$3;

    public EmojiPacksAlert$$ExternalSyntheticLambda8(ChatAttachAlertPollLayout chatAttachAlertPollLayout, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert, Context context) {
        this.f$0 = chatAttachAlertPollLayout;
        this.f$3 = resourcesProvider;
        this.f$1 = chatAttachAlert;
        this.f$2 = context;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((EmojiPacksAlert) this.f$0).lambda$new$0((ArrayList) this.f$1, (BaseFragment) this.f$2, this.f$3, view, i);
                break;
            default:
                ((ChatAttachAlertPollLayout) this.f$0).lambda$new$4(this.f$3, (ChatAttachAlert) this.f$1, (Context) this.f$2, view, i);
                break;
        }
    }

    public EmojiPacksAlert$$ExternalSyntheticLambda8(EmojiPacksAlert emojiPacksAlert, ArrayList arrayList, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = emojiPacksAlert;
        this.f$1 = arrayList;
        this.f$2 = baseFragment;
        this.f$3 = resourcesProvider;
    }
}
