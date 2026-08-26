package org.telegram.ui.Adapters;

import androidx.activity.ComponentDialog$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda3;

public final class DialogsSearchAdapter$$ExternalSyntheticLambda23 implements Runnable {
    public final int $r8$classId;
    public final SearchViewPager.AnonymousClass1 f$0;
    public final String f$1;
    public final int f$2;
    public final String f$3;

    public DialogsSearchAdapter$$ExternalSyntheticLambda23(SearchViewPager.AnonymousClass1 anonymousClass1, int i, String str, String str2) {
        this.$r8$classId = 1;
        this.f$0 = anonymousClass1;
        this.f$2 = i;
        this.f$1 = str;
        this.f$3 = str2;
    }

    @Override
    public final void run() throws Throwable {
        String str;
        int i;
        int i2;
        switch (this.$r8$classId) {
            case 0:
                SearchViewPager.AnonymousClass1 anonymousClass1 = this.f$0;
                anonymousClass1.searchRunnable = null;
                String str2 = this.f$1;
                int i3 = this.f$2;
                if (anonymousClass1.needMessagesSearch == 2) {
                    str = str2;
                    i = i3;
                } else {
                    String lowerCase = str2.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        anonymousClass1.lastSearchId = 0;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        new ArrayList();
                        AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(anonymousClass1, anonymousClass1.lastSearchId, arrayList, arrayList2, arrayList3, 8));
                        str = str2;
                        i = i3;
                    } else {
                        str = str2;
                        i = i3;
                        MessagesStorage.getInstance(anonymousClass1.currentAccount).getStorageQueue().postRunnable(new DialogsSearchAdapter$$ExternalSyntheticLambda23(anonymousClass1, lowerCase, i, str, 2));
                    }
                }
                if (anonymousClass1.dialogsType != 15) {
                    DialogsSearchAdapter$$ExternalSyntheticLambda23 dialogsSearchAdapter$$ExternalSyntheticLambda23 = new DialogsSearchAdapter$$ExternalSyntheticLambda23(anonymousClass1, i, str, this.f$3);
                    anonymousClass1.searchRunnable2 = dialogsSearchAdapter$$ExternalSyntheticLambda23;
                    AndroidUtilities.runOnUIThread(dialogsSearchAdapter$$ExternalSyntheticLambda23);
                } else {
                    anonymousClass1.waitingResponseCount -= 2;
                }
                break;
            case 1:
                SearchViewPager.AnonymousClass1 anonymousClass2 = this.f$0;
                anonymousClass2.searchRunnable2 = null;
                int i4 = anonymousClass2.lastSearchId;
                int i5 = this.f$2;
                if (i5 == i4) {
                    int i6 = anonymousClass2.needMessagesSearch;
                    int i7 = anonymousClass2.dialogsType;
                    if (i6 == 2 || i7 == 6 || i7 == 5) {
                        i2 = i7;
                        anonymousClass2.waitingResponseCount -= 2;
                    } else if (anonymousClass2.delegate.getSearchForumDialogId() == 0) {
                        boolean z = i7 != 4;
                        boolean z2 = (i7 == 4 || i7 == 11) ? false : true;
                        boolean z3 = i7 == 2 || i7 == 1;
                        boolean z4 = i7 == 0;
                        DialogsActivity.AnonymousClass48 anonymousClass48 = anonymousClass2.delegate;
                        i2 = i7;
                        anonymousClass2.searchAdapterHelper.queryServerSearch(this.f$1, true, z, true, z2, z3, 0L, z4, 0, i5, anonymousClass48 != null ? anonymousClass48.getSearchForumDialogId() : 0L, null);
                    } else {
                        i2 = i7;
                        anonymousClass2.waitingResponseCount -= 2;
                    }
                    if (i6 == 0 || i2 == 15) {
                        anonymousClass2.waitingResponseCount--;
                    } else {
                        String str3 = this.f$3;
                        anonymousClass2.searchTopics(str3);
                        anonymousClass2.searchMessagesInternal(i5, str3);
                        anonymousClass2.searchForumMessagesInternal(i5, str3);
                    }
                    break;
                }
                break;
            default:
                SearchViewPager.AnonymousClass1 anonymousClass3 = this.f$0;
                anonymousClass3.getClass();
                ArrayList<Object> arrayList4 = new ArrayList<>();
                ArrayList<CharSequence> arrayList5 = new ArrayList<>();
                ArrayList<TLRPC.User> arrayList6 = new ArrayList<>();
                new ArrayList();
                MessagesStorage messagesStorage = MessagesStorage.getInstance(anonymousClass3.currentAccount);
                ArrayList<Long> arrayList7 = anonymousClass3.filterDialogIds;
                String str4 = this.f$1;
                messagesStorage.localSearch(anonymousClass3.dialogsType, str4, arrayList4, arrayList5, arrayList6, arrayList7, -1);
                AndroidUtilities.runOnUIThread(new WearAuthSheet$$ExternalSyntheticLambda3(anonymousClass3, this.f$2, arrayList4, arrayList5, arrayList6, 8));
                FiltersView.fillTipDates(str4, anonymousClass3.localTipDates);
                anonymousClass3.localTipArchive = false;
                if (str4.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str4) || "archive".startsWith(this.f$3))) {
                    anonymousClass3.localTipArchive = true;
                }
                AndroidUtilities.runOnUIThread(new ComponentDialog$$ExternalSyntheticLambda1(anonymousClass3, 29));
                break;
        }
    }

    public DialogsSearchAdapter$$ExternalSyntheticLambda23(SearchViewPager.AnonymousClass1 anonymousClass1, String str, int i, String str2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = anonymousClass1;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = str2;
    }
}
