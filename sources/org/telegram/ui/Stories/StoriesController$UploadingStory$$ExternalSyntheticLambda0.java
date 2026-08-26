package org.telegram.ui.Stories;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda33;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class StoriesController$UploadingStory$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final StoriesController.UploadingStory f$0;

    public StoriesController$UploadingStory$$ExternalSyntheticLambda0(StoriesController.UploadingStory uploadingStory, int i) {
        this.$r8$classId = i;
        this.f$0 = uploadingStory;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArticleViewer$$ExternalSyntheticLambda33 articleViewer$$ExternalSyntheticLambda33;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        TL_update.TL_updateStoryID tL_updateStoryID;
        switch (this.$r8$classId) {
            case 0:
                StoriesController.UploadingStory uploadingStory = this.f$0;
                uploadingStory.getClass();
                boolean z3 = tLObject instanceof TLRPC.Updates;
                StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = null;
                boolean z4 = uploadingStory.edit;
                StoryEntry storyEntry = uploadingStory.entry;
                if (!z3) {
                    if (tLObject instanceof TL_bots.botPreviewMedia) {
                        uploadingStory.previewMedia = (TL_bots.botPreviewMedia) tLObject;
                    } else if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && storyEntry.editingCoverDocument != null && (articleViewer$$ExternalSyntheticLambda33 = storyEntry.updateDocumentRef) != null) {
                        articleViewer$$ExternalSyntheticLambda33.run(new StoriesController$UploadingStory$$ExternalSyntheticLambda5(uploadingStory, 0));
                        storyEntry.updateDocumentRef = null;
                    } else if (tL_error != null && !z4) {
                        AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(1, uploadingStory, tL_error));
                    }
                    break;
                } else {
                    int i6 = 0;
                    uploadingStory.failed = false;
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    boolean z5 = storyEntry.isEditingCover;
                    int i7 = StoriesController.this.currentAccount;
                    if (z5) {
                        MessagesController.getInstance(i7).processUpdates(updates, false);
                        AndroidUtilities.runOnUIThread(new StoriesController$UploadingStory$$ExternalSyntheticLambda1(uploadingStory, 0));
                        break;
                    } else {
                        TL_stories.StoryItem tL_storyItem = null;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < updates.updates.size()) {
                            boolean z6 = updates.updates.get(i8) instanceof TL_stories.TL_updateStory;
                            String str = uploadingStory.firstFramePath;
                            if (z6) {
                                TL_stories.StoryItem storyItem = ((TL_stories.TL_updateStory) updates.updates.get(i8)).story;
                                storyItem.attachPath = uploadingStory.path;
                                storyItem.firstFramePath = str;
                                storyItem.justUploaded = !z4;
                                int i10 = storyItem.id;
                                if (tL_storyItem == null) {
                                    tL_storyItem = storyItem;
                                } else {
                                    tL_storyItem.media = storyItem.media;
                                }
                                i9 = i10;
                            }
                            if (updates.updates.get(i8) instanceof TL_update.TL_updateStoryID) {
                                TL_update.TL_updateStoryID tL_updateStoryID2 = (TL_update.TL_updateStoryID) updates.updates.get(i8);
                                if (tL_storyItem == null) {
                                    tL_storyItem = new TL_stories.TL_storyItem();
                                    int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                                    tL_storyItem.date = currentTime;
                                    int i11 = storyEntry.period;
                                    if (i11 == Integer.MAX_VALUE) {
                                        i11 = 86400;
                                    }
                                    tL_storyItem.expire_date = currentTime + i11;
                                    tL_storyItem.parsedPrivacy = storyPrivacy;
                                    ArrayList arrayList = storyEntry.privacyRules;
                                    ArrayList<TLRPC.PrivacyRule> arrayList2 = new ArrayList<>();
                                    while (i6 < arrayList.size()) {
                                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList.get(i6);
                                        if (inputPrivacyRule != null) {
                                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                                                arrayList2.add(new TLRPC.TL_privacyValueAllowAll());
                                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                                                arrayList2.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                                            } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                                                arrayList2.add(new TLRPC.TL_privacyValueAllowContacts());
                                            } else {
                                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                                    i3 = i6;
                                                    int iM = 0;
                                                    while (iM < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                                        iM = MessagesController$$ExternalSyntheticOutline2.m(tL_inputPrivacyValueDisallowUsers.users.get(iM).user_id, tL_privacyValueDisallowUsers.users, iM, 1);
                                                        i8 = i8;
                                                        tL_inputPrivacyValueDisallowUsers = tL_inputPrivacyValueDisallowUsers;
                                                        z4 = z4;
                                                    }
                                                    i4 = i8;
                                                    z2 = z4;
                                                    arrayList2.add(tL_privacyValueDisallowUsers);
                                                } else {
                                                    i3 = i6;
                                                    i4 = i8;
                                                    z2 = z4;
                                                    if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                                        TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                                        int iM2 = 0;
                                                        while (iM2 < tL_inputPrivacyValueAllowUsers.users.size()) {
                                                            iM2 = MessagesController$$ExternalSyntheticOutline2.m(tL_inputPrivacyValueAllowUsers.users.get(iM2).user_id, tL_privacyValueAllowUsers.users, iM2, 1);
                                                            i7 = i7;
                                                            tL_updateStoryID2 = tL_updateStoryID2;
                                                        }
                                                        i5 = i7;
                                                        tL_updateStoryID = tL_updateStoryID2;
                                                        arrayList2.add(tL_privacyValueAllowUsers);
                                                    }
                                                }
                                                i5 = i7;
                                                tL_updateStoryID = tL_updateStoryID2;
                                            }
                                            i3 = i6;
                                            i4 = i8;
                                            z2 = z4;
                                            i5 = i7;
                                            tL_updateStoryID = tL_updateStoryID2;
                                        } else {
                                            i3 = i6;
                                            i4 = i8;
                                            z2 = z4;
                                            i5 = i7;
                                            tL_updateStoryID = tL_updateStoryID2;
                                        }
                                        i6 = i3 + 1;
                                        i7 = i5;
                                        i8 = i4;
                                        tL_updateStoryID2 = tL_updateStoryID;
                                        z4 = z2;
                                    }
                                    i = i8;
                                    z = z4;
                                    i2 = i7;
                                    TL_update.TL_updateStoryID tL_updateStoryID3 = tL_updateStoryID2;
                                    tL_storyItem.privacy = arrayList2;
                                    tL_storyItem.pinned = storyEntry.period == Integer.MAX_VALUE;
                                    tL_storyItem.dialogId = UserConfig.getInstance(i2).clientUserId;
                                    tL_storyItem.attachPath = uploadingStory.path;
                                    tL_storyItem.firstFramePath = str;
                                    tL_storyItem.id = tL_updateStoryID3.id;
                                    tL_storyItem.justUploaded = !z;
                                } else {
                                    i = i8;
                                    z = z4;
                                    i2 = i7;
                                }
                            } else {
                                i = i8;
                                z = z4;
                                i2 = i7;
                            }
                            i8 = i + 1;
                            i7 = i2;
                            z4 = z;
                            i6 = 0;
                            storyPrivacy = null;
                        }
                        boolean z7 = z4;
                        int i12 = i7;
                        boolean z8 = uploadingStory.canceled;
                        long j = uploadingStory.dialogId;
                        if (z8) {
                            TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                            TLRPC.InputPeer inputPeer = MessagesController.getInstance(i12).getInputPeer(j);
                            tL_stories_deleteStories.peer = inputPeer;
                            if (inputPeer != null) {
                                tL_stories_deleteStories.id.add(Integer.valueOf(i9));
                                ConnectionsManager.getInstance(i12).sendRequest(tL_stories_deleteStories, new StoriesController$UploadingStory$$ExternalSyntheticLambda0(uploadingStory, 1));
                            }
                        } else {
                            if ((i9 == 0 || z7) && tL_storyItem != null) {
                                TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                                tL_updateStory.peer = MessagesController.getInstance(i12).getPeer(j);
                                tL_updateStory.story = tL_storyItem;
                                AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(29, uploadingStory, tL_updateStory));
                            }
                            TLRPC.MessageMedia messageMedia = tL_storyItem.media;
                            if (messageMedia != null && tL_storyItem.attachPath != null) {
                                if (messageMedia.document != null) {
                                    FileLoader.getInstance(i12).setLocalPathTo(tL_storyItem.media.document, tL_storyItem.attachPath);
                                } else {
                                    TLRPC.Photo photo = messageMedia.photo;
                                    if (photo != null) {
                                        FileLoader.getInstance(i12).setLocalPathTo(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE), tL_storyItem.attachPath);
                                    }
                                }
                            }
                            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda12(uploadingStory, j, tL_storyItem, 27));
                            MessagesController.getInstance(i12).processUpdateArray(updates.updates, updates.users, updates.chats, false, updates.date);
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new StoriesController$UploadingStory$$ExternalSyntheticLambda1(uploadingStory, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new StoriesController$$ExternalSyntheticLambda9(StoriesController.this, 2));
                break;
        }
    }
}
