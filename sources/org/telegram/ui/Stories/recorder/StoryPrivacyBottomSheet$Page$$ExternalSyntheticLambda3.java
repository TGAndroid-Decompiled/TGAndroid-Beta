package org.telegram.ui.Stories.recorder;

import android.view.View;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Stories.PeerStoriesView$8$$ExternalSyntheticLambda54;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.ThemeSetUrlActivity$$ExternalSyntheticLambda6;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;

public final class StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final StoryPrivacyBottomSheet.Page f$0;

    public StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda3(StoryPrivacyBottomSheet.Page page, int i) {
        this.$r8$classId = i;
        this.f$0 = page;
    }

    @Override
    public final void onClick(View view) {
        StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy;
        switch (this.$r8$classId) {
            case 0:
                StoryPrivacyBottomSheet.Page page = this.f$0;
                ArrayList arrayList = page.selectedUsers;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    LongSparseArray longSparseArray = page.changelog;
                    if (i >= size) {
                        HashMap map = page.selectedUsersByGroup;
                        for (ArrayList arrayList2 : map.values()) {
                            int size2 = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                longSparseArray.put(Boolean.FALSE, ((Long) obj).longValue());
                            }
                        }
                        arrayList.clear();
                        map.clear();
                        StoryPrivacyBottomSheet.this.messageUsers.clear();
                        page.searchField.spansContainer.removeAllSpans();
                        page.updateCheckboxes$1(true);
                        page.updateButton(true);
                    } else {
                        Object obj2 = arrayList.get(i);
                        i++;
                        longSparseArray.put(Boolean.FALSE, ((Long) obj2).longValue());
                    }
                    break;
                }
                break;
            case 1:
                StoryPrivacyBottomSheet.Page page2 = this.f$0;
                ButtonWithCounterView buttonWithCounterView = page2.button;
                if (!buttonWithCounterView.loading) {
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                    MessagesController messagesController = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount);
                    int i3 = page2.pageType;
                    ArrayList arrayList3 = page2.selectedUsers;
                    if (i3 == 5) {
                        StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda6 = storyPrivacyBottomSheet.onDone2;
                        if (storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda6 != null) {
                            storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda6.run(arrayList3);
                        }
                        storyPrivacyBottomSheet.lambda$showGiftOfferSheet$15();
                        break;
                    } else if (i3 == 1) {
                        TLRPC.TL_editCloseFriends tL_editCloseFriends = new TLRPC.TL_editCloseFriends();
                        tL_editCloseFriends.id.addAll(arrayList3);
                        buttonWithCounterView.setLoading(true);
                        ConnectionsManager.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).sendRequest(tL_editCloseFriends, new ThemeSetUrlActivity$$ExternalSyntheticLambda6(4, page2, messagesController));
                        break;
                    } else if (i3 == 0) {
                        int i4 = storyPrivacyBottomSheet.selectedType;
                        if (i4 == 3) {
                            ArrayList arrayList4 = storyPrivacyBottomSheet.selectedContacts;
                            HashMap map2 = storyPrivacyBottomSheet.selectedContactsByGroup;
                            storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(storyPrivacyBottomSheet.selectedType, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, new ArrayList(StoryPrivacyBottomSheet.mergeUsers(arrayList4, map2)));
                            ArrayList arrayList5 = storyPrivacy.selectedUserIds;
                            arrayList5.clear();
                            arrayList5.addAll(arrayList4);
                            HashMap map3 = storyPrivacy.selectedUserIdsByGroup;
                            map3.clear();
                            map3.putAll(map2);
                        } else if (i4 == 2) {
                            storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(i4, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, storyPrivacyBottomSheet.excludedContacts);
                        } else if (i4 == 4) {
                            ArrayList arrayList6 = storyPrivacyBottomSheet.excludedEveryone;
                            HashMap map4 = storyPrivacyBottomSheet.excludedEveryoneByGroup;
                            storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(storyPrivacyBottomSheet.selectedType, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, new ArrayList(StoryPrivacyBottomSheet.mergeUsers(arrayList6, map4)));
                            ArrayList arrayList7 = storyPrivacy.selectedUserIds;
                            arrayList7.clear();
                            arrayList7.addAll(arrayList6);
                            HashMap map5 = storyPrivacy.selectedUserIdsByGroup;
                            map5.clear();
                            map5.putAll(map4);
                        } else {
                            storyPrivacy = new StoryPrivacyBottomSheet.StoryPrivacy(i4, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, (ArrayList) null);
                        }
                        storyPrivacyBottomSheet.done(storyPrivacy, new PeerStoriesView$8$$ExternalSyntheticLambda54(storyPrivacyBottomSheet, 1), false);
                        break;
                    } else if (i3 == 2) {
                        if (storyPrivacyBottomSheet.isEdit) {
                            storyPrivacyBottomSheet.closeKeyboard();
                            storyPrivacyBottomSheet.done(new StoryPrivacyBottomSheet.StoryPrivacy(2, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, arrayList3), new PeerStoriesView$8$$ExternalSyntheticLambda54(storyPrivacyBottomSheet, 1), false);
                        } else {
                            storyPrivacyBottomSheet.closeKeyboard();
                            storyPrivacyBottomSheet.viewPager.scrollToPosition$1(0);
                        }
                        break;
                    } else {
                        HashMap map6 = page2.selectedUsersByGroup;
                        if (i3 != 3) {
                            if (i3 != 6) {
                                storyPrivacyBottomSheet.selectedType = i3;
                                storyPrivacyBottomSheet.closeKeyboard();
                                storyPrivacyBottomSheet.viewPager.scrollToPosition$1(0);
                                break;
                            } else {
                                HashSet hashSetMergeUsers = StoryPrivacyBottomSheet.mergeUsers(arrayList3, map6);
                                buttonWithCounterView.setLoading(true);
                                StoriesController storiesController = MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).getStoriesController();
                                StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1 = new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1(page2, 2);
                                storiesController.getClass();
                                TLRPC.TL_contacts_setBlocked tL_contacts_setBlocked = new TLRPC.TL_contacts_setBlocked();
                                tL_contacts_setBlocked.my_stories_from = true;
                                HashSet hashSet = storiesController.blocklist;
                                tL_contacts_setBlocked.limit = hashSet.size();
                                int size3 = storiesController.blocklistCount - hashSet.size();
                                storiesController.blocklistCount = size3;
                                if (size3 < 0) {
                                    storiesController.blocklistCount = 0;
                                }
                                hashSet.clear();
                                Iterator it = hashSetMergeUsers.iterator();
                                while (true) {
                                    boolean zHasNext = it.hasNext();
                                    int i5 = storiesController.currentAccount;
                                    if (!zHasNext) {
                                        storiesController.blocklistCount = hashSet.size() + storiesController.blocklistCount;
                                        tL_contacts_setBlocked.limit = Math.max(tL_contacts_setBlocked.limit, hashSet.size());
                                        ConnectionsManager.getInstance(i5).sendRequest(tL_contacts_setBlocked, new RichMediaUploader$$ExternalSyntheticLambda0(storyPrivacyBottomSheet$Page$$ExternalSyntheticLambda1, 2));
                                        break;
                                    } else {
                                        Long l = (Long) it.next();
                                        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i5).getInputPeer(l.longValue());
                                        if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
                                            hashSet.add(l);
                                            tL_contacts_setBlocked.id.add(inputPeer);
                                        }
                                    }
                                }
                            }
                        } else if (storyPrivacyBottomSheet.isEdit) {
                            HashSet hashSetMergeUsers2 = StoryPrivacyBottomSheet.mergeUsers(arrayList3, map6);
                            if (!hashSetMergeUsers2.isEmpty()) {
                                storyPrivacyBottomSheet.closeKeyboard();
                                StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy2 = new StoryPrivacyBottomSheet.StoryPrivacy(3, ((BottomSheet) storyPrivacyBottomSheet).currentAccount, new ArrayList(hashSetMergeUsers2));
                                ArrayList arrayList8 = storyPrivacy2.selectedUserIds;
                                arrayList8.clear();
                                arrayList8.addAll(arrayList3);
                                HashMap map7 = storyPrivacy2.selectedUserIdsByGroup;
                                map7.clear();
                                map7.putAll(map6);
                                storyPrivacyBottomSheet.done(storyPrivacy2, new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1(page2, 1), false);
                                break;
                            }
                        } else if (!StoryPrivacyBottomSheet.mergeUsers(arrayList3, map6).isEmpty()) {
                            storyPrivacyBottomSheet.selectedType = 3;
                            storyPrivacyBottomSheet.closeKeyboard();
                            storyPrivacyBottomSheet.viewPager.scrollToPosition$1(0);
                            break;
                        }
                    }
                }
                break;
            default:
                StoryPrivacyBottomSheet.Page page3 = this.f$0;
                StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = StoryPrivacyBottomSheet.this;
                if (storyPrivacyBottomSheet2.startedFromSendAsMessage) {
                    storyPrivacyBottomSheet2.activePage = 5;
                    storyPrivacyBottomSheet2.viewPager.scrollToPosition$1(1);
                } else {
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet3 = new StoryPrivacyBottomSheet(page3.getContext(), ((BottomSheet) storyPrivacyBottomSheet2).resourcesProvider);
                    storyPrivacyBottomSheet3.onDone2 = new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6(page3, 2);
                    storyPrivacyBottomSheet3.storyPeriod = storyPrivacyBottomSheet2.storyPeriod;
                    storyPrivacyBottomSheet3.show();
                }
                break;
        }
    }
}
