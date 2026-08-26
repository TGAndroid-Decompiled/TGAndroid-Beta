package org.telegram.ui.Stories;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;

public final class SelfStoryViewsPage$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public SelfStoryViewsPage$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onItemClick(View view, int i) {
        int size;
        ArrayList arrayList;
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        UItem item;
        switch (this.$r8$classId) {
            case 0:
                SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = (SelfStoryViewsView.AnonymousClass4.AnonymousClass1) this.f$0;
                if (i >= 0) {
                    SelfStoryViewsPage.ListAdapter listAdapter = anonymousClass1.listAdapter;
                    if (i < listAdapter.items.size()) {
                        SelfStoryViewsPage.Item item2 = (SelfStoryViewsPage.Item) listAdapter.items.get(i);
                        TL_stories.StoryView storyView = item2.view;
                        boolean z = storyView instanceof TL_stories.TL_storyView;
                        StoryViewer storyViewer = (StoryViewer) this.f$1;
                        if (z) {
                            storyViewer.presentFragment(ProfileActivity.of(storyView.user_id));
                        } else {
                            boolean z2 = storyView instanceof TL_stories.TL_storyViewPublicRepost;
                            SelfStoryViewsPage.AnonymousClass1 anonymousClass2 = anonymousClass1.recyclerListView;
                            if (z2) {
                                storyViewer.fragment.createOverlayStoryViewer().open(UserConfig.selectedAccount, anonymousClass1.getContext(), ((TL_stories.TL_storyViewPublicRepost) item2.view).story, new StoriesListPlaceProvider(anonymousClass2, false));
                            } else {
                                TL_stories.StoryReaction storyReaction = item2.reaction;
                                if (storyReaction instanceof TL_stories.TL_storyReaction) {
                                    storyViewer.presentFragment(ProfileActivity.of(DialogObject.getPeerDialogId(storyReaction.peer_id)));
                                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                    ArrayList arrayList2 = new ArrayList();
                                    SelfStoryViewsPage.ViewsModel viewsModel = anonymousClass1.currentModel;
                                    int size2 = -1;
                                    if (viewsModel == null || (arrayList = viewsModel.reactions) == null) {
                                        size = 0;
                                    } else {
                                        size = arrayList.size();
                                        for (int i2 = 0; i2 < anonymousClass1.currentModel.reactions.size(); i2++) {
                                            TL_stories.StoryReaction storyReaction2 = (TL_stories.StoryReaction) anonymousClass1.currentModel.reactions.get(i2);
                                            if ((storyReaction2 instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction2).story) != null) {
                                                storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                                                if (storyReaction2 == storyReaction) {
                                                    size2 = arrayList2.size();
                                                }
                                                arrayList2.add(storyItem);
                                            }
                                        }
                                    }
                                    if (size2 < 0 || arrayList2.size() <= 1) {
                                        anonymousClass1.currentRepostsList = null;
                                        storyViewer.fragment.createOverlayStoryViewer().open(UserConfig.selectedAccount, anonymousClass1.getContext(), ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, new StoriesListPlaceProvider(anonymousClass2, false));
                                    } else {
                                        anonymousClass1.currentRepostsList = new StoriesController.StoryRepostsList(anonymousClass1.currentAccount, arrayList2);
                                        anonymousClass1.repostsListConsumedCount = size;
                                        SelfStoryViewsPage.ViewsModel viewsModel2 = anonymousClass1.currentModel;
                                        StoryViewer storyViewerCreateOverlayStoryViewer = storyViewer.fragment.createOverlayStoryViewer();
                                        Context context = anonymousClass1.getContext();
                                        StoriesController.StoryRepostsList storyRepostsList = anonymousClass1.currentRepostsList;
                                        StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider(anonymousClass2, false);
                                        storiesListPlaceProvider.loadNextInterface = new GiftSheet$$ExternalSyntheticLambda6(viewsModel2, 26);
                                        storyViewerCreateOverlayStoryViewer.open(context, size2, storyRepostsList, storiesListPlaceProvider);
                                    }
                                } else {
                                    boolean z3 = storyReaction instanceof TL_stories.TL_storyReactionPublicForward;
                                    if (z3 || (storyView instanceof TL_stories.TL_storyViewPublicForward)) {
                                        TLRPC.Message message = z3 ? storyReaction.message : storyView.message;
                                        Bundle bundle = new Bundle();
                                        long peerDialogId = DialogObject.getPeerDialogId(message.peer_id);
                                        if (peerDialogId >= 0) {
                                            bundle.putLong("user_id", peerDialogId);
                                        } else {
                                            bundle.putLong("chat_id", -peerDialogId);
                                        }
                                        bundle.putInt("message_id", message.id);
                                        storyViewer.presentFragment(new ChatActivity(bundle));
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 1:
                ((BoostViaGiftsBottomSheet) this.f$0).lambda$new$2((BaseFragment) this.f$1, view);
                break;
            case 2:
                ((ReassignBoostBottomSheet) this.f$0).lambda$new$4((TLRPC.Chat) this.f$1, view);
                break;
            case 3:
                BotPreviewsEditContainer.ChooseLanguageSheet chooseLanguageSheet = (BotPreviewsEditContainer.ChooseLanguageSheet) this.f$0;
                UniversalAdapter universalAdapter = chooseLanguageSheet.adapter;
                if (universalAdapter != null && (item = universalAdapter.getItem(i - 1)) != null) {
                    Object obj = item.object;
                    if (obj instanceof TranslateController.Language) {
                        ((RichEditor$$ExternalSyntheticLambda53) this.f$1).run(((TranslateController.Language) obj).code);
                        chooseLanguageSheet.lambda$showGiftOfferSheet$15();
                    }
                }
                break;
            default:
                ((ChannelAffiliateProgramsFragment) this.f$0).lambda$createView$0(i, (Context) this.f$1);
                break;
        }
    }
}
