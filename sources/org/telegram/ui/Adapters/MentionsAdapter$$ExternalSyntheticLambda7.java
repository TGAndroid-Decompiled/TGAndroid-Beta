package org.telegram.ui.Adapters;

import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.ContextLinkCell;

public final class MentionsAdapter$$ExternalSyntheticLambda7 implements MediaDataController.KeywordResultCallback, ContextLinkCell.ContextLinkCellDelegate {
    public final MentionsAdapter f$0;

    public MentionsAdapter$$ExternalSyntheticLambda7(MentionsAdapter mentionsAdapter) {
        this.f$0 = mentionsAdapter;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        MentionsAdapter mentionsAdapter = this.f$0;
        mentionsAdapter.searchResultSuggestions = arrayList;
        mentionsAdapter.searchResultHashtags = null;
        mentionsAdapter.stickers = null;
        mentionsAdapter.searchResultUsernames = null;
        mentionsAdapter.searchResultUsernamesMap = null;
        mentionsAdapter.searchResultCommands = null;
        mentionsAdapter.searchResultCommandsEphemeral = null;
        mentionsAdapter.quickReplies = null;
        mentionsAdapter.searchResultCommandsHelp = null;
        mentionsAdapter.searchResultCommandsUsers = null;
        mentionsAdapter.notifyDataSetChanged();
        ArrayList arrayList2 = mentionsAdapter.searchResultSuggestions;
        mentionsAdapter.delegate.needChangePanelVisibility((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
