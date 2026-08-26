package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class TopicsNotifySettingsFragments$2$$ExternalSyntheticLambda1 implements TopicsFragment.OnTopicSelectedListener, AlertDialog.OnButtonClickListener {
    public final TopicsNotifySettingsFragments.AnonymousClass2 f$0;

    public TopicsNotifySettingsFragments$2$$ExternalSyntheticLambda1(TopicsNotifySettingsFragments.AnonymousClass2 anonymousClass2) {
        this.f$0 = anonymousClass2;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$onItemClick$2(alertDialog, i);
    }

    @Override
    public void onTopicSelected(TLRPC.TL_forumTopic tL_forumTopic) {
        this.f$0.lambda$onItemClick$1(tL_forumTopic);
    }
}
