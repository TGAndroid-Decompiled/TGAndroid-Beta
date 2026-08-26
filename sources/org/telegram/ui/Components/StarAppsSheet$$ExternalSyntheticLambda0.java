package org.telegram.ui.Components;

import android.view.View;

public final class StarAppsSheet$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public StarAppsSheet$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onItemClick(View view, int i) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((StarAppsSheet) this.f$0).lambda$new$0(view, i);
                break;
            case 1:
                ((AvatarConstructorFragment.BackgroundSelectView) this.f$0).lambda$new$0(view, i);
                break;
            case 2:
                ((EmojiView.EmojiGridAdapter) this.f$0).lambda$onCreateViewHolder$1(view, i);
                break;
            case 3:
                ((EmojiView.StickersGridAdapter) this.f$0).lambda$onCreateViewHolder$4(view, i);
                break;
            case 4:
                ((AIEditorAlert) this.f$0).lambda$new$14(view, i);
                break;
            case 5:
                ((AIEditorAlert.AiStyleAlert) this.f$0).lambda$new$1(view, i);
                break;
            case 6:
                ((ChatThemeBottomSheet) this.f$0).lambda$new$2(view, i);
                break;
            case 7:
                ((CreateGroupCallBottomSheet) this.f$0).lambda$new$2(view, i);
                break;
            case 8:
                ((FiltersListBottomSheet) this.f$0).lambda$new$0(view, i);
                break;
            case 9:
                ((FolderBottomSheet) this.f$0).lambda$onViewCreated$19(view, i);
                break;
            case 10:
                ((GroupVoipInviteAlert) this.f$0).lambda$new$0(view, i);
                break;
            case 11:
                ((ReactedUsersListView) this.f$0).lambda$new$0(view, i);
                break;
            case 12:
                ((ReactionsContainerLayout) this.f$0).lambda$new$0(view, i);
                break;
            case 13:
                ((ShareAlert.ShareSearchAdapter) this.f$0).lambda$onCreateViewHolder$5(view, i);
                break;
            case 14:
                ((SharingLocationsAlert) this.f$0).lambda$new$0(view, i);
                break;
            case 15:
                ((StickerCategoriesListView) this.f$0).lambda$new$1(view, i);
                break;
            case 16:
                ((StickerMasksAlert) this.f$0).lambda$new$1(view, i);
                break;
            case 17:
                ((StickersAlert) this.f$0).lambda$init$11(view, i);
                break;
            case 18:
                ((SuggestEmojiView) this.f$0).lambda$createListView$1(view, i);
                break;
            case 19:
                ((ThemeEditorView.EditorAlert) this.f$0).lambda$new$0(view, i);
                break;
            default:
                ((TrendingStickersLayout) this.f$0).lambda$new$0(view, i);
                break;
        }
    }
}
