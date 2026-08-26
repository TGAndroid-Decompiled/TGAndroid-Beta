package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.Theme;

public final class ArticleViewer$$ExternalSyntheticLambda1 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ArticleViewer$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer) this.f$0).lambda$showCopyPopup$0((String) this.f$1, dialogInterface, i);
                break;
            case 1:
                ((ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1) this.f$0).lambda$didPressUrl$1((String) this.f$1, dialogInterface, i);
                break;
            case 2:
                ((FilteredSearchView.SharedLinksAdapter.AnonymousClass1) this.f$0).lambda$onLinkPress$0((String) this.f$1, dialogInterface, i);
                break;
            case 3:
                ((GroupCallActivity.AnonymousClass6) this.f$0).lambda$onItemClick$11((ArrayList) this.f$1, dialogInterface, i);
                break;
            case 4:
                ((ProfileActivity.AnonymousClass15) this.f$0).lambda$onItemClick$3((Context) this.f$1, dialogInterface, i);
                break;
            case 5:
                ((ThemeActivity.ListAdapter) this.f$0).lambda$showOptionsForTheme$1((Theme.ThemeInfo) this.f$1, dialogInterface, i);
                break;
            case 6:
                ((ChatActivity) this.f$0).lambda$didLongPressCopyButton$441((String) this.f$1, dialogInterface, i);
                break;
            case 7:
                ((PassportActivity) this.f$0).lambda$openAddDocumentAlert$23((ArrayList) this.f$1, dialogInterface, i);
                break;
            default:
                ((SessionBottomSheet) this.f$0).lambda$copyText$1((String) this.f$1, dialogInterface, i);
                break;
        }
    }
}
