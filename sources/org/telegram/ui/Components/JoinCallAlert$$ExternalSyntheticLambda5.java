package org.telegram.ui.Components;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class JoinCallAlert$$ExternalSyntheticLambda5 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final KeyEvent.Callback f$0;
    public final Object f$1;

    public JoinCallAlert$$ExternalSyntheticLambda5(KeyEvent.Callback callback, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = obj;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((JoinCallAlert) this.f$0).lambda$new$6((TLRPC.Chat) this.f$1, view, i);
                break;
            case 1:
                ((AIEditorAlert.CreateAiStyleAlert) this.f$0).lambda$new$5((Theme.ResourcesProvider) this.f$1, view, i);
                break;
            case 2:
                ((ChatAttachAlert) this.f$0).lambda$new$14((Theme.ResourcesProvider) this.f$1, view, i);
                break;
            case 3:
                ((ChatAttachAlertContactsLayout) this.f$0).lambda$new$1((Theme.ResourcesProvider) this.f$1, view, i);
                break;
            case 4:
                ((MentionsContainerView) this.f$0).lambda$withDelegate$4((MentionsContainerView.Delegate) this.f$1, view, i);
                break;
            case 5:
                ((PollVotesAlert) this.f$0).lambda$new$4((Context) this.f$1, view, i);
                break;
            default:
                ((TranslateAlert3) this.f$0).lambda$new$1((Theme.ResourcesProvider) this.f$1, view, i);
                break;
        }
    }
}
