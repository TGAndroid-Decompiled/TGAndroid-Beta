package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.label.ImageLabel;
import com.google.mlkit.vision.segmentation.subject.Subject;
import com.google.mlkit.vision.segmentation.subject.SubjectSegmentationResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaController$$ExternalSyntheticLambda8;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.CacheControlActivity$$ExternalSyntheticLambda23;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Paint.ObjectDetectionEmojis;
import org.telegram.ui.Components.Paint.PaintTypeface$LazyTypeface$LazyTypefaceLoader;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Paint.Views.StickerView;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.QrActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.TopicsFragment;

public final class ProfileGooeyView$$ExternalSyntheticLambda0 implements SearchAdapterHelper.SearchAdapterHelperDelegate, PaintTypeface$LazyTypeface$LazyTypefaceLoader, UndoStore.UndoStoreDelegate, AlertDialog.OnButtonClickListener, StoryEntry.DecodeBitmap, OnSuccessListener, ImageReceiver.ImageReceiverDelegate, GenericProvider, LinkActionView.Delegate, PhotoEditorSeekBar.PhotoEditorSeekBarDelegate, Utilities.Callback5, RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener, DialogsActivity.DialogsActivityDelegate, StoriesListPlaceProvider.LoadNextInterface, MessagesStorage.StringCallback, WallpaperParallaxEffect.Callback, LanguageDetector.StringCallback {
    public final int $r8$classId;
    public final Object f$0;

    public ProfileGooeyView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public boolean canApplySearchResults(int i) {
        return true;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public Bitmap decode(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.f$0, options);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        long j;
        SearchViewPager searchViewPager = (SearchViewPager) this.f$0;
        searchViewPager.getClass();
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap map = searchViewPager.selectedFiles;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) map.get((FilteredSearchView.MessageHashId) it.next()));
        }
        map.clear();
        searchViewPager.showActionMode(false);
        int size = arrayList.size();
        int i3 = searchViewPager.currentAccount;
        if (size > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == AccountInstance.getInstance(i3).getUserConfig().getClientUserId() || charSequence != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                long j2 = ((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId;
                if (charSequence != null) {
                    j = j2;
                    AccountInstance.getInstance(i3).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                } else {
                    j = j2;
                }
                AccountInstance.getInstance(i3).getSendMessagesHelper().sendMessage(arrayList2, j, false, false, true, 0, 0L);
            }
            dialogsActivity.finishFragment();
            return true;
        }
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundleM = zzkw.m("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j3)) {
            bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
        } else {
            if (DialogObject.isUserDialog(j3)) {
                bundleM.putLong("user_id", j3);
            } else {
                bundleM.putLong("chat_id", -j3);
            }
            if (!AccountInstance.getInstance(i3).getMessagesController().checkCanOpenChat(bundleM, dialogsActivity)) {
                return true;
            }
        }
        ChatActivity chatActivity = new ChatActivity(bundleM);
        dialogsActivity.presentFragment(chatActivity, true);
        chatActivity.showFieldPanelForForward(arrayList2);
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        RLottieDrawable lottieAnimation;
        StickerView stickerView = (StickerView) this.f$0;
        stickerView.getClass();
        if (!z || z2 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        stickerView.didSetAnimatedSticker(lottieAnimation);
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void editLink() {
    }

    @Override
    public LongSparseArray getExcludeCallParticipants() {
        return null;
    }

    @Override
    public void getExcludeUsers() {
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void historyChanged() {
        PhotoViewer.AnonymousClass67 anonymousClass67 = (PhotoViewer.AnonymousClass67) this.f$0;
        boolean zCanUndo = anonymousClass67.undoStore.canUndo();
        ImageView imageView = anonymousClass67.undoButton;
        imageView.animate().cancel();
        imageView.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(zCanUndo);
        TextView textView = anonymousClass67.undoAllButton;
        textView.animate().cancel();
        textView.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(zCanUndo);
    }

    @Override
    public Typeface load() {
        return Typeface.createFromFile(((Font) this.f$0).getFile());
    }

    @Override
    public void loadNext(boolean z) {
        if (z) {
            ((StoriesController.StoriesList) this.f$0).load(30, Collections.EMPTY_LIST, false);
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 4:
                ((PhotoViewer$$ExternalSyntheticLambda16) this.f$0).run();
                break;
            case 5:
                ((LPhotoPaintView.AnonymousClass21) this.f$0).this$0.emojiView.clearRecentEmoji();
                break;
            case 15:
                ((MediaController$$ExternalSyntheticLambda8) this.f$0).run();
                break;
            case 16:
                ((SelectorBottomSheet$$ExternalSyntheticLambda0) this.f$0).run();
                break;
            case 17:
                ((SelectorBottomSheet$$ExternalSyntheticLambda0) this.f$0).run();
                break;
            case 18:
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    GiftInfoBottomSheet.show(lastFragment, ((TLRPC.TL_payments_giveawayInfoResults) this.f$0).gift_code_slug, null);
                    break;
                }
                break;
            case 27:
                StickersArchiveAlert stickersArchiveAlert = (StickersArchiveAlert) this.f$0;
                stickersArchiveAlert.parentFragment.presentFragment(new StickersActivity(stickersArchiveAlert.currentType, null));
                alertDialog.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((StickersDialogs.AnonymousClass1) this.f$0);
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void onDataSetChanged(int i) {
        InviteMembersBottomSheet.SearchAdapter searchAdapter = (InviteMembersBottomSheet.SearchAdapter) this.f$0;
        int i2 = searchAdapter.currentItemsCount - 1;
        InviteMembersBottomSheet inviteMembersBottomSheet = InviteMembersBottomSheet.this;
        inviteMembersBottomSheet.showItemsAnimated$2(i2);
        if (searchAdapter.searchRunnable == null && !searchAdapter.searchAdapterHelper.isSearchInProgress() && searchAdapter.getItemCount() <= 2) {
            inviteMembersBottomSheet.emptyView.showProgress(false, true);
        }
        searchAdapter.mObservable.notifyChanged();
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((SelectorBottomSheet) this.f$0).lambda$new$5(view);
    }

    @Override
    public void onOffsetsChanged(int i, int i2) {
        SizeNotifierFrameLayout sizeNotifierFrameLayout = (SizeNotifierFrameLayout) this.f$0;
        sizeNotifierFrameLayout.translationX = i;
        sizeNotifierFrameLayout.translationY = i2;
        QrActivity.AnonymousClass2 anonymousClass2 = sizeNotifierFrameLayout.backgroundView;
        if (anonymousClass2 != null) {
            anonymousClass2.invalidate();
        }
    }

    @Override
    public void onProgressChanged(int i, int i2) {
        PhotoFilterView photoFilterView = PhotoFilterView.this;
        if (i == photoFilterView.enhanceTool) {
            photoFilterView.enhanceValue = i2;
        } else if (i == photoFilterView.highlightsTool) {
            photoFilterView.highlightsValue = i2;
        } else if (i == photoFilterView.contrastTool) {
            photoFilterView.contrastValue = i2;
        } else if (i == photoFilterView.exposureTool) {
            photoFilterView.exposureValue = i2;
        } else if (i == photoFilterView.warmthTool) {
            photoFilterView.warmthValue = i2;
        } else if (i == photoFilterView.saturationTool) {
            photoFilterView.saturationValue = i2;
        } else if (i == photoFilterView.vignetteTool) {
            photoFilterView.vignetteValue = i2;
        } else if (i == photoFilterView.shadowsTool) {
            photoFilterView.shadowsValue = i2;
        } else if (i == photoFilterView.grainTool) {
            photoFilterView.grainValue = i2;
        } else if (i == photoFilterView.sharpenTool) {
            photoFilterView.sharpenValue = i2;
        } else if (i == photoFilterView.fadeTool) {
            photoFilterView.fadeValue = i2;
        } else if (i == photoFilterView.softenSkinTool) {
            photoFilterView.softenSkinValue = i2;
        }
        FilterGLThread filterGLThread = photoFilterView.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(true, false, false);
        }
        photoFilterView.updateFiltersEmpty();
    }

    @Override
    public void onSetHashtags(ArrayList arrayList) {
    }

    @Override
    public void onSuccess(Object obj) {
        Object obj2 = this.f$0;
        String str = null;
        switch (this.$r8$classId) {
            case 7:
                PhotoView photoView = (PhotoView) obj2;
                photoView.segmentingLoaded = true;
                photoView.segmentingLoading = false;
                break;
            case 8:
                List list = (List) obj;
                StickerMakerView stickerMakerView = (StickerMakerView) obj2;
                stickerMakerView.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                } else {
                    int i = ((ImageLabel) list.get(0)).zzc;
                    if (ObjectDetectionEmojis.labelEmojis == null) {
                        ObjectDetectionEmojis.labelEmojis = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i >= 0) {
                        String[] strArr = ObjectDetectionEmojis.labelEmojis;
                        if (i < strArr.length) {
                            str = strArr[i];
                        }
                    }
                    stickerMakerView.detectedEmoji = str;
                    FileLog.d("objimg: detected #" + ((ImageLabel) list.get(0)).zzc + " " + stickerMakerView.detectedEmoji + " " + ((ImageLabel) list.get(0)).zza);
                    Emoji.getEmojiDrawable(stickerMakerView.detectedEmoji);
                }
                break;
            default:
                SubjectSegmentationResult subjectSegmentationResult = (SubjectSegmentationResult) obj;
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < subjectSegmentationResult.zza.size(); i2++) {
                    Subject subject = (Subject) subjectSegmentationResult.zza.get(i2);
                    StickerMakerView.SubjectMock subjectMock = new StickerMakerView.SubjectMock();
                    subjectMock.bitmap = subject.zzb;
                    subjectMock.startX = subject.zze;
                    subjectMock.startY = subject.zzf;
                    subjectMock.width = subject.zzc;
                    subjectMock.height = subject.zzd;
                    arrayList.add(subjectMock);
                }
                ((CacheControlActivity$$ExternalSyntheticLambda23) obj2).run(arrayList);
                break;
        }
    }

    @Override
    public Object provide(Object obj) {
        return Float.valueOf(((FloatValueHolder) this.f$0).mValue / 100.0f);
    }

    @Override
    public void removeLink() {
    }

    @Override
    public void revokeLink() {
        ((PermanentLinkBottomSheet) this.f$0).generateLink$2(true);
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        PostsSearchContainer postsSearchContainer = (PostsSearchContainer) this.f$0;
        postsSearchContainer.getClass();
        Object obj6 = ((UItem) obj).object;
        if (obj6 instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj6;
            Bundle bundle = new Bundle();
            if (messageObject.getDialogId() >= 0) {
                bundle.putLong("user_id", messageObject.getDialogId());
            } else {
                bundle.putLong("chat_id", -messageObject.getDialogId());
            }
            bundle.putInt("message_id", messageObject.getId());
            ChatActivity chatActivity = new ChatActivity(bundle);
            DialogsActivity.highlightFoundQuote(chatActivity, messageObject);
            postsSearchContainer.fragment.presentFragment(chatActivity);
        }
    }

    @Override
    public void showUsersForPermanentLink() {
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ReactedUsersListView.OnProfileSelectedListener onProfileSelectedListener;
        switch (this.$r8$classId) {
            case 20:
                ReactedUsersListView reactedUsersListView = (ReactedUsersListView) this.f$0;
                if (reactedUsersListView.adapter.getItemViewType(i) != 0 || (onProfileSelectedListener = reactedUsersListView.onProfileSelectedLongListener) == null) {
                    return true;
                }
                ArrayList arrayList = reactedUsersListView.userReactions;
                onProfileSelectedListener.onProfileSelected(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i));
                return true;
            default:
                SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) this.f$0;
                SearchDownloadsContainer.DownloadsAdapter downloadsAdapter = searchDownloadsContainer.adapter;
                MessageObject message = downloadsAdapter.getMessage(i);
                if (message == null) {
                    return false;
                }
                boolean zActionModeShowing = searchDownloadsContainer.uiCallback.actionModeShowing();
                RecyclerView.AdapterDataObservable adapterDataObservable = downloadsAdapter.mObservable;
                SearchDownloadsContainer searchDownloadsContainer2 = downloadsAdapter.this$0;
                if (!zActionModeShowing) {
                    searchDownloadsContainer.uiCallback.showActionMode();
                    adapterDataObservable.notifyItemRangeChanged(0, searchDownloadsContainer2.rowCount, null);
                }
                if (searchDownloadsContainer.uiCallback.actionModeShowing()) {
                    searchDownloadsContainer.uiCallback.toggleItemSelection(message, view, 0);
                    if (!searchDownloadsContainer.uiCallback.actionModeShowing()) {
                        adapterDataObservable.notifyItemRangeChanged(0, searchDownloadsContainer2.rowCount, null);
                    }
                    int id = message.getId();
                    long dialogId = message.getDialogId();
                    FilteredSearchView.MessageHashId messageHashId = searchDownloadsContainer.messageHashIdTmp;
                    messageHashId.dialogId = dialogId;
                    messageHashId.messageId = id;
                }
                return true;
        }
    }

    @Override
    public void run(String str) {
        switch (this.$r8$classId) {
            case 24:
                final SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                StoriesController storiesController = sharedMediaLayout.getStoriesController();
                final int i = 0;
                storiesController.getStoryAlbumsList(sharedMediaLayout.dialog_id, true).createCollection(str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i2 = 18;
                        SharedMediaLayout sharedMediaLayout2 = sharedMediaLayout;
                        StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) obj;
                        switch (i) {
                            case 0:
                                int[] iArr = SharedMediaLayout.supportedFastScrollTypes;
                                AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(i2, sharedMediaLayout2, storyAlbum), 100L);
                                break;
                            default:
                                int[] iArr2 = SharedMediaLayout.supportedFastScrollTypes;
                                AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(i2, sharedMediaLayout2, storyAlbum), 100L);
                                break;
                        }
                    }
                });
                break;
            case 25:
                final SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                StoriesController storiesController2 = sharedMediaLayout2.getStoriesController();
                final int i2 = 1;
                storiesController2.getStoryAlbumsList(sharedMediaLayout2.dialog_id, true).createCollection(str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i3 = 18;
                        SharedMediaLayout sharedMediaLayout3 = sharedMediaLayout2;
                        StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) obj;
                        switch (i2) {
                            case 0:
                                int[] iArr = SharedMediaLayout.supportedFastScrollTypes;
                                AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(i3, sharedMediaLayout3, storyAlbum), 100L);
                                break;
                            default:
                                int[] iArr2 = SharedMediaLayout.supportedFastScrollTypes;
                                AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(i3, sharedMediaLayout3, storyAlbum), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                TranslateAlert3 translateAlert3 = (TranslateAlert3) this.f$0;
                translateAlert3.from_lang = str;
                translateAlert3.adapter.update(true);
                break;
        }
    }
}
