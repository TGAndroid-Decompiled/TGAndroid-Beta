package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

public final class SearchDownloadsContainer$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 1;
    public final SearchDownloadsContainer f$0;
    public final ArrayList f$1;
    public final String f$2;
    public final ArrayList f$3;

    public SearchDownloadsContainer$$ExternalSyntheticLambda0(SearchDownloadsContainer searchDownloadsContainer, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f$0 = searchDownloadsContainer;
        this.f$2 = str;
        this.f$1 = arrayList;
        this.f$3 = arrayList2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SearchDownloadsContainer searchDownloadsContainer = this.f$0;
                searchDownloadsContainer.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                while (true) {
                    ArrayList arrayList3 = this.f$1;
                    int size = arrayList3.size();
                    String str = this.f$2;
                    int i2 = searchDownloadsContainer.currentAccount;
                    if (i >= size) {
                        int i3 = 0;
                        while (true) {
                            ArrayList arrayList4 = this.f$3;
                            if (i3 >= arrayList4.size()) {
                                AndroidUtilities.runOnUIThread(new SearchDownloadsContainer$$ExternalSyntheticLambda0(searchDownloadsContainer, str, arrayList, arrayList2));
                            } else {
                                String documentFileName = FileLoader.getDocumentFileName(((MessageObject) arrayList4.get(i3)).getDocument());
                                if (documentFileName != null && documentFileName.toLowerCase().contains(str)) {
                                    MessageObject messageObject = new MessageObject(i2, ((MessageObject) arrayList4.get(i3)).messageOwner, false, false);
                                    messageObject.mediaExists = ((MessageObject) arrayList4.get(i3)).mediaExists;
                                    messageObject.setQuery(searchDownloadsContainer.searchQuery);
                                    arrayList2.add(messageObject);
                                }
                                i3++;
                            }
                        }
                    } else {
                        String documentFileName2 = FileLoader.getDocumentFileName(((MessageObject) arrayList3.get(i)).getDocument());
                        if (documentFileName2 != null && documentFileName2.toLowerCase().contains(str)) {
                            MessageObject messageObject2 = new MessageObject(i2, ((MessageObject) arrayList3.get(i)).messageOwner, false, false);
                            messageObject2.mediaExists = ((MessageObject) arrayList3.get(i)).mediaExists;
                            messageObject2.setQuery(searchDownloadsContainer.searchQuery);
                            arrayList.add(messageObject2);
                        }
                        i++;
                    }
                    break;
                }
                break;
            default:
                SearchDownloadsContainer searchDownloadsContainer2 = this.f$0;
                if (this.f$2.equals(searchDownloadsContainer2.lastQueryString)) {
                    if (searchDownloadsContainer2.rowCount == 0) {
                        searchDownloadsContainer2.itemsEnterAnimator.showItemsAnimated(0);
                    }
                    searchDownloadsContainer2.updateListInternal(this.f$1, this.f$3, true);
                    if (searchDownloadsContainer2.rowCount == 0) {
                        StickerEmptyView stickerEmptyView = searchDownloadsContainer2.emptyView;
                        stickerEmptyView.showProgress(false, true);
                        stickerEmptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        LinkSpanDrawable.LinksTextView linksTextView = stickerEmptyView.subtitle;
                        linksTextView.setVisibility(0);
                        linksTextView.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    }
                }
                break;
        }
    }

    public SearchDownloadsContainer$$ExternalSyntheticLambda0(SearchDownloadsContainer searchDownloadsContainer, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.f$0 = searchDownloadsContainer;
        this.f$1 = arrayList;
        this.f$2 = str;
        this.f$3 = arrayList2;
    }
}
