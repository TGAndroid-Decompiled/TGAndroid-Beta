package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.RecyclerListView;

public final class TopicsFragment$$ExternalSyntheticLambda11 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public TopicsFragment$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((TopicsFragment) this.f$0).lambda$createView$3(view, i);
                break;
            case 1:
                ((PrivacyUsersActivity) this.f$0).lambda$createView$3(view, i);
                break;
            case 2:
                ((ProfileActivity) this.f$0).lambda$createView$30(view, i);
                break;
            case 3:
                ((ProxyListActivity) this.f$0).lambda$createView$1(view, i);
                break;
            case 4:
                ((ReactionsDoubleTapManageActivity) this.f$0).lambda$createView$0(view, i);
                break;
            case 5:
                ((RestrictedLanguagesSelectActivity) this.f$0).lambda$createView$1(view, i);
                break;
            case 6:
                ((SelectChatUserSheet) this.f$0).lambda$new$1(view, i);
                break;
            case 7:
                ((SelectStoriesBottomSheet) this.f$0).onItemClick(view, i);
                break;
            case 8:
                ((SessionsActivity) this.f$0).lambda$createView$20(view, i);
                break;
            case 9:
                ((StatisticActivity) this.f$0).lambda$createView$6(view, i);
                break;
            case 10:
                ((ThemePreviewActivity) this.f$0).lambda$createView$15(view, i);
                break;
            case 11:
                ((TooManyCommunitiesActivity) this.f$0).lambda$new$0(view, i);
                break;
            case 12:
                ((TwoStepVerificationActivity) this.f$0).lambda$createView$7(view, i);
                break;
            default:
                ((WallpapersListActivity) this.f$0).lambda$createView$4(view, i);
                break;
        }
    }
}
