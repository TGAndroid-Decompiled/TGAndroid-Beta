package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchDownloadsContainer;

public final class PeerColorActivity$Page$$ExternalSyntheticLambda0 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final int f$1;

    public PeerColorActivity$Page$$ExternalSyntheticLambda0(FrameLayout frameLayout, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = frameLayout;
        this.f$1 = i;
    }

    @Override
    public final void onItemClick(int i, View view) throws Throwable {
        PeerColorActivity.ProfilePreview profilePreview;
        PeerColorActivity.Page page;
        int iCenterX;
        int i2;
        ReactionsLayoutInBubble.VisibleReaction visibleReaction;
        TLRPC.Document document;
        switch (this.$r8$classId) {
            case 0:
                final PeerColorActivity.Page page2 = (PeerColorActivity.Page) this.f$0;
                page2.getClass();
                boolean z = view instanceof PeerColorActivity.Page.SetReplyIconCell;
                PeerColorActivity peerColorActivity = PeerColorActivity.this;
                if (z) {
                    final PeerColorActivity.Page.SetReplyIconCell setReplyIconCell = (PeerColorActivity.Page.SetReplyIconCell) view;
                    if (page2.selectAnimatedEmojiDialog == null) {
                        if (setReplyIconCell != null) {
                            final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
                            int iMin = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                            int iMin2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = setReplyIconCell.imageDrawable;
                            int i3 = page2.type;
                            if (swapAnimatedEmojiDrawable != null) {
                                swapAnimatedEmojiDrawable.play();
                                setReplyIconCell.updateImageBounds();
                                Rect rect = AndroidUtilities.rectTmp2;
                                rect.set(swapAnimatedEmojiDrawable.getBounds());
                                int iDp = i3 == 1 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - iMin : (-(setReplyIconCell.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                                iCenterX = rect.centerX() - (AndroidUtilities.displaySize.x - iMin2);
                                i2 = iDp;
                            } else {
                                iCenterX = 0;
                                i2 = 0;
                            }
                            ?? r11 = new SelectAnimatedEmojiDialog(peerColorActivity, page2.getContext(), Integer.valueOf(iCenterX), i3 == 1 ? 5 : 7, peerColorActivity.getResourceProvider(), i3 == 1 ? 24 : 16, setReplyIconCell.getColor()) {
                                public final SetReplyIconCell val$cell;
                                public final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] val$popup;

                                public AnonymousClass7(BaseFragment peerColorActivity2, Context context, Integer num, int i4, Theme.ResourcesProvider resourcesProvider, int i5, int i6) {
                                    super(peerColorActivity2, context, true, num, i4, true, resourcesProvider, i5, i6);
                                    setReplyIconCell = setReplyIconCell;
                                    selectAnimatedEmojiDialogWindowArr = selectAnimatedEmojiDialogWindowArr;
                                }

                                @Override
                                public final float getScrimDrawableTranslationY() {
                                    return 0.0f;
                                }

                                @Override
                                public final void onEmojiSelected(View view2, Long l, TLRPC.Document document2, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                                    Page page3 = Page.this;
                                    if (tL_starGiftUnique != null) {
                                        if (page3.type == 0) {
                                            TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                            if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                                                return;
                                            }
                                            page3.selectedPeerCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                                            page3.selectedEmojiCollectible = null;
                                        } else {
                                            page3.selectedPeerCollectible = null;
                                            page3.selectedEmojiCollectible = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        }
                                        page3.selectedResaleGift = null;
                                        page3.selectedColor = -1;
                                    } else {
                                        page3.selectedEmoji = l == null ? 0L : l.longValue();
                                        page3.selectedEmojiCollectible = null;
                                        page3.selectedPeerCollectible = null;
                                        page3.selectedResaleGift = null;
                                    }
                                    SetReplyIconCell setReplyIconCell2 = setReplyIconCell;
                                    if (setReplyIconCell2 != null) {
                                        setReplyIconCell2.update(true);
                                    }
                                    page3.updateProfilePreview(true);
                                    page3.updateMessages();
                                    page3.updateButton();
                                    SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = selectAnimatedEmojiDialogWindowArr[0];
                                    if (selectAnimatedEmojiDialogWindow != null) {
                                        page3.selectAnimatedEmojiDialog = null;
                                        selectAnimatedEmojiDialogWindow.dismiss();
                                    }
                                }
                            };
                            r11.useAccentForPlus = true;
                            long j = page2.selectedEmoji;
                            r11.setSelected(j == 0 ? null : Long.valueOf(j));
                            r11.setSaveState(3);
                            r11.setScrimDrawable(swapAnimatedEmojiDrawable, setReplyIconCell);
                            ?? r3 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(r11) {
                                public AnonymousClass8(AnonymousClass7 r12) {
                                    super(r12);
                                }

                                @Override
                                public final void dismiss() {
                                    super.dismiss();
                                    Page.this.selectAnimatedEmojiDialog = null;
                                }
                            };
                            page2.selectAnimatedEmojiDialog = r3;
                            selectAnimatedEmojiDialogWindowArr[0] = r3;
                            r3.showAsDropDown(setReplyIconCell, 0, i2, (LocaleController.isRTL ? 3 : 5) | 48);
                            selectAnimatedEmojiDialogWindowArr[0].dimBehind();
                        }
                    }
                    break;
                } else {
                    int i4 = page2.clearRow;
                    int i5 = this.f$1;
                    if (i != i4) {
                        int i6 = page2.giftsStartRow;
                        if (i >= i6 && i < page2.giftsEndRow) {
                            int i7 = i - i6;
                            TL_stars.StarGift starGift = page2.selectedTabGift;
                            ArrayList arrayList = page2.uniqueGifts;
                            if (starGift != null) {
                                if (page2.resaleGifts != null && i7 >= 0 && i7 < arrayList.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i7);
                                    if (i5 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            page2.selectedEmoji = 0L;
                                            page2.selectedColor = -1;
                                            page2.selectedEmojiCollectible = null;
                                            page2.selectedPeerCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        page2.selectedEmoji = 0L;
                                        page2.selectedColor = -1;
                                        page2.selectedEmojiCollectible = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                                        page2.selectedPeerCollectible = null;
                                    }
                                    page2.selectedResaleGift = tL_starGiftUnique;
                                    page2.updateProfilePreview(true);
                                    page2.updateMessages();
                                    page2.updateButton();
                                    PeerColorActivity.Page.SetReplyIconCell setReplyIconCell2 = page2.setReplyIconCell;
                                    if (setReplyIconCell2 != null) {
                                        setReplyIconCell2.update(true);
                                    }
                                    break;
                                }
                            } else if (i7 >= 0 && i7 < arrayList.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i7);
                                if (i5 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        page2.selectedEmoji = 0L;
                                        page2.selectedColor = -1;
                                        page2.selectedResaleGift = null;
                                        page2.selectedEmojiCollectible = null;
                                        page2.selectedPeerCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    page2.selectedEmoji = 0L;
                                    page2.selectedColor = -1;
                                    page2.selectedResaleGift = null;
                                    page2.selectedEmojiCollectible = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique2);
                                    page2.selectedPeerCollectible = null;
                                }
                                page2.updateProfilePreview(true);
                                page2.updateMessages();
                                page2.updateButton();
                                PeerColorActivity.Page.SetReplyIconCell setReplyIconCell3 = page2.setReplyIconCell;
                                if (setReplyIconCell3 != null) {
                                    setReplyIconCell3.update(true);
                                }
                                break;
                            }
                        }
                    } else {
                        page2.selectedColor = -1;
                        page2.selectedEmoji = 0L;
                        page2.selectedEmojiCollectible = null;
                        page2.selectedPeerCollectible = null;
                        page2.selectedResaleGift = null;
                        page2.updateMessages();
                        if (i5 == 0) {
                            peerColorActivity2.namePage.updateMessages();
                        }
                        PeerColorActivity.Page.SetReplyIconCell setReplyIconCell4 = page2.setReplyIconCell;
                        if (setReplyIconCell4 != null) {
                            setReplyIconCell4.update(true);
                        }
                        page2.updateProfilePreview(true);
                        page2.updateButton();
                        PeerColorActivity.Page page3 = peerColorActivity2.profilePage;
                        if (page3 != null && (profilePreview = page3.profilePreview) != null && (page = peerColorActivity2.namePage) != null) {
                            profilePreview.overrideAvatarColor(page.selectedColor);
                            break;
                        }
                    }
                }
                break;
            case 1:
                SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) this.f$0;
                SearchDownloadsContainer.DownloadsAdapter downloadsAdapter = searchDownloadsContainer.adapter;
                MessageObject message = downloadsAdapter.getMessage(i);
                if (message != null) {
                    boolean z2 = false;
                    if (!searchDownloadsContainer.uiCallback.actionModeShowing()) {
                        if (view instanceof SearchDownloadsContainer.Cell) {
                            SharedDocumentCell sharedDocumentCell = ((SearchDownloadsContainer.Cell) view).sharedDocumentCell;
                            MessageObject message2 = sharedDocumentCell.getMessage();
                            TLRPC.Document document2 = message2.getDocument();
                            if (sharedDocumentCell.loaded) {
                                if (message2.isRoundVideo() || message2.isVoice()) {
                                    MediaController.getInstance().playMessage(message2);
                                } else {
                                    boolean zCanPreviewDocument = message2.canPreviewDocument();
                                    if (zCanPreviewDocument) {
                                        z2 = zCanPreviewDocument;
                                    } else {
                                        TLRPC.Message message3 = message2.messageOwner;
                                        boolean z3 = message3 != null && message3.noforwards;
                                        TLRPC.Chat chat = message.messageOwner.peer_id.channel_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(message.messageOwner.peer_id.channel_id)) : null;
                                        if (chat == null) {
                                            chat = message.messageOwner.peer_id.chat_id != 0 ? MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(message.messageOwner.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z3 = chat.noforwards;
                                        }
                                        if (zCanPreviewDocument || z3) {
                                            z2 = true;
                                        }
                                    }
                                    BaseFragment baseFragment = searchDownloadsContainer.parentFragment;
                                    if (z2) {
                                        PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(message2);
                                        PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
                                        PhotoViewer.getInstance().openPhoto(arrayList2, 0, 0L, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider());
                                    } else {
                                        AndroidUtilities.openDocument(message2, searchDownloadsContainer.parentActivity, baseFragment);
                                    }
                                }
                                break;
                            } else if (sharedDocumentCell.loading) {
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().cancelLoadFile(document2);
                                sharedDocumentCell.updateFileExistIcon(true);
                            } else {
                                message.putInDownloadsStore = true;
                                AccountInstance.getInstance(UserConfig.selectedAccount).getFileLoader().loadFile(document2, message, 0, 0);
                                sharedDocumentCell.updateFileExistIcon(true);
                                DownloadController.getInstance(this.f$1).updateFilesLoadingPriority();
                            }
                            searchDownloadsContainer.update(true);
                        }
                        if (view instanceof SharedAudioCell) {
                            ((SharedAudioCell) view).didPressedButton();
                        }
                    } else {
                        searchDownloadsContainer.uiCallback.toggleItemSelection(message, view, 0);
                        int id = message.getId();
                        long dialogId = message.getDialogId();
                        FilteredSearchView.MessageHashId messageHashId = searchDownloadsContainer.messageHashIdTmp;
                        messageHashId.dialogId = dialogId;
                        messageHashId.messageId = id;
                        downloadsAdapter.notifyItemChanged(i);
                        if (!searchDownloadsContainer.uiCallback.actionModeShowing()) {
                            downloadsAdapter.mObservable.notifyItemRangeChanged(0, SearchDownloadsContainer.this.rowCount, null);
                        }
                    }
                    break;
                }
                break;
            default:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
                selectAnimatedEmojiDialog.getClass();
                boolean z4 = view instanceof SelectAnimatedEmojiDialog.ImageViewEmoji;
                int i8 = this.f$1;
                try {
                    if (z4) {
                        SelectAnimatedEmojiDialog.ImageViewEmoji imageViewEmoji = (SelectAnimatedEmojiDialog.ImageViewEmoji) view;
                        if (imageViewEmoji.isDefaultReaction || (((visibleReaction = imageViewEmoji.reaction) != null && visibleReaction.isStar) || i8 == 13 || i8 == 14)) {
                            selectAnimatedEmojiDialog.incrementHintUse();
                            selectAnimatedEmojiDialog.onReactionClick(imageViewEmoji, imageViewEmoji.reaction);
                        } else if (!imageViewEmoji.isStaticIcon || (document = imageViewEmoji.document) == null) {
                            selectAnimatedEmojiDialog.onEmojiClick(imageViewEmoji.span, imageViewEmoji);
                        } else if (selectAnimatedEmojiDialog.type == 6) {
                            selectAnimatedEmojiDialog.onEmojiSelected(imageViewEmoji, Long.valueOf(document.id), document, imageViewEmoji.starGift, null);
                        } else {
                            selectAnimatedEmojiDialog.onEmojiSelected(imageViewEmoji, null, document, imageViewEmoji.starGift, null);
                        }
                        if (i8 != 1 && i8 != 11) {
                            selectAnimatedEmojiDialog.performHapticFeedback(3, 1);
                        }
                    } else if (view instanceof ImageView) {
                        selectAnimatedEmojiDialog.onEmojiClick(null, view);
                        if (i8 != 1 && i8 != 11) {
                            selectAnimatedEmojiDialog.performHapticFeedback(3, 1);
                        }
                    } else if (!(view instanceof SelectAnimatedEmojiDialog.EmojiPackExpand)) {
                        if (view != null) {
                            view.callOnClick();
                        }
                        break;
                    } else {
                        selectAnimatedEmojiDialog.expand(i, (SelectAnimatedEmojiDialog.EmojiPackExpand) view);
                        if (i8 != 1 && i8 != 11) {
                            selectAnimatedEmojiDialog.performHapticFeedback(3, 1);
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
