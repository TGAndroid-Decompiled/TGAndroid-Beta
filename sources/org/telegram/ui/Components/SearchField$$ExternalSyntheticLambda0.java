package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class SearchField$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public SearchField$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((SearchField) this.f$0).lambda$new$0(view);
                break;
            case 1:
                ((JoinCallAlert) this.f$0).lambda$new$8(view);
                break;
            case 2:
                ((JoinCallByUrlAlert) this.f$0).lambda$new$0(view);
                break;
            case 3:
                ((JoinGroupAlert) this.f$0).lambda$new$0(view);
                break;
            case 4:
                ((ActionBarMenu) this.f$0).onItemClick(2);
                break;
            case 5:
                ((MessagePrivateSeenView) this.f$0).lambda$request$0(view);
                break;
            case 6:
                ((OverlayActionBarLayoutDialog) this.f$0).lambda$new$0(view);
                break;
            case 7:
                ((PermanentLinkBottomSheet) this.f$0).lambda$new$0(view);
                break;
            case 8:
                ((PhotoFilterView.ToolsAdapter) this.f$0).lambda$onCreateViewHolder$1(view);
                break;
            case 9:
                ((PipVideoOverlay) this.f$0).lambda$showInternal$11(view);
                break;
            case 10:
                ((PollVotesAlert.SectionCell) this.f$0).lambda$new$0(view);
                break;
            case 11:
                ((ScrimOptions) this.f$0).lambda$new$0(view);
                break;
            case 12:
                ((SearchTagsList) this.f$0).lambda$createPremiumLayout$0(view);
                break;
            case 13:
                ((SearchViewPager) this.f$0).lambda$showActionMode$0(view);
                break;
            case 14:
                ((ShareTopView.Layout) this.f$0).lambda$new$0(view);
                break;
            case 15:
                ((StickerEmptyView) this.f$0).lambda$new$0(view);
                break;
            case 16:
                ((EditTextBoldCursor) this.f$0).setText("");
                break;
            case 17:
                ((TopViewCell) this.f$0).lambda$new$0(view);
                break;
            case 18:
                ((TranslateAlert2) this.f$0).lambda$new$0(view);
                break;
            case 19:
                ((TranslateButton) this.f$0).lambda$new$0(view);
                break;
            default:
                TranslateButton.lambda$onMenuClick$2((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$0, view);
                break;
        }
    }
}
