package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatUsersActivity$8$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.PremiumFeatureCell;
import org.telegram.ui.PremiumPreviewFragment;

public final class SearchTagsList$$ExternalSyntheticLambda1 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final BaseFragment f$2;

    public SearchTagsList$$ExternalSyntheticLambda1(Object obj, int i, BaseFragment baseFragment, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = baseFragment;
    }

    @Override
    public final void onItemClick(int i, View view) {
        switch (this.$r8$classId) {
            case 0:
                SearchTagsList searchTagsList = (SearchTagsList) this.f$0;
                if (i < 0) {
                    searchTagsList.getClass();
                    break;
                } else {
                    ArrayList arrayList = searchTagsList.items;
                    if (i < arrayList.size()) {
                        if (!UserConfig.getInstance(this.f$1).isPremium()) {
                            new PremiumFeatureBottomSheet(this.f$2, 24, true).show();
                            break;
                        } else {
                            long j = ((SearchTagsList.Item) arrayList.get(i)).reaction.hash;
                            if (searchTagsList.setFilter(searchTagsList.chosen == j ? null : ((SearchTagsList.Item) arrayList.get(i)).reaction)) {
                                int i2 = 0;
                                while (true) {
                                    ChatActivity.AnonymousClass34 anonymousClass34 = searchTagsList.listView;
                                    if (i2 >= anonymousClass34.getChildCount()) {
                                        anonymousClass34.forAllChild(new ChatUsersActivity$8$$ExternalSyntheticLambda1(3));
                                        if (searchTagsList.chosen != j) {
                                            searchTagsList.chosen = j;
                                            ((SearchTagsList.TagButton) view).setChosen(true, true);
                                        } else {
                                            searchTagsList.chosen = 0L;
                                        }
                                    } else {
                                        if (anonymousClass34.getChildAt(i2) == view) {
                                            if (i2 <= 1) {
                                                anonymousClass34.smoothScrollBy(-AndroidUtilities.dp(i2 == 0 ? 90.0f : 50.0f), 0, null);
                                            } else if (i2 >= anonymousClass34.getChildCount() - 2) {
                                                anonymousClass34.smoothScrollBy(AndroidUtilities.dp(i2 == anonymousClass34.getChildCount() - 1 ? 80.0f : 50.0f), 0, null);
                                            }
                                        }
                                        i2++;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                PremiumPreviewBottomSheet premiumPreviewBottomSheet = (PremiumPreviewBottomSheet) this.f$0;
                if (view instanceof PremiumFeatureCell) {
                    PremiumFeatureCell premiumFeatureCell = (PremiumFeatureCell) view;
                    PremiumPreviewFragment.sentShowFeaturePreview(this.f$1, premiumFeatureCell.data.type);
                    premiumPreviewBottomSheet.showDialog(new PremiumFeatureBottomSheet(this.f$2, premiumFeatureCell.data.type, false));
                }
                break;
        }
    }
}
