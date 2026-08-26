package org.telegram.ui;

import java.util.Iterator;
import org.telegram.ui.ActionBar.AlertDialog;

public final class TopicsNotifySettingsFragments$2$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener {
    public final TopicsNotifySettingsFragments.AnonymousClass2 f$0;

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        TopicsNotifySettingsFragments topicsNotifySettingsFragments = this.f$0.this$0;
        Iterator it = topicsNotifySettingsFragments.exceptionsTopics.iterator();
        while (it.hasNext()) {
            topicsNotifySettingsFragments.removeException(((Integer) it.next()).intValue());
        }
        topicsNotifySettingsFragments.exceptionsTopics.clear();
        topicsNotifySettingsFragments.updateRows$29();
    }
}
