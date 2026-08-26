package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.util.Property;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_vision_common.zzlo;
import com.google.firebase.messaging.GmsRpc;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda151;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda206;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda488;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.DialogsActivity$50$$ExternalSyntheticLambda2;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.GroupStickersActivity;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda3;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda8;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda42;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda61;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda4;

public class StickersAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public GridAdapter adapter;
    public ArrayList animatingDescriptions;
    public int buttonTextColorKey;
    public int checkReqId;
    public IntroActivity$$ExternalSyntheticLambda5 checkRunnable;
    public boolean clearsInputField;
    public GroupStickersActivity.AnonymousClass4 customButtonDelegate;
    public final StickersAlertDelegate delegate;
    public ActionBarMenuSubItem deleteItem;
    public ItemTouchHelper dragAndDropHelper;
    public TLRPC.Document draggedDocument;
    public ChatActivity.AnonymousClass60 emptyView;
    public ChatActivity.AnonymousClass34 gridView;
    public boolean ignoreLayout;
    public final String importingSoftware;
    public final ArrayList importingStickers;
    public ArrayList importingStickersPaths;
    public TLRPC.InputStickerSet inputStickerSet;
    public StickersAlertInstallDelegate installDelegate;
    public boolean isEditModeEnabled;
    public int itemHeight;
    public int itemSize;
    public String lastCheckName;
    public boolean lastNameAvailable;
    public AnonymousClass7 layoutManager;
    public Runnable onDismissListener;
    public ActionBarMenuItem optionsButton;
    public final Activity parentActivity;
    public final BaseFragment parentFragment;
    public FrameLayout pickerBottomFrameLayout;
    public AnimatedTextView pickerBottomLayout;
    public PremiumButtonView premiumButtonView;
    public final AnonymousClass1 previewDelegate;
    public TextView previewSendButton;
    public View previewSendButtonShadow;
    public boolean probablyEmojis;
    public int reqId;
    public int scrollOffsetY;
    public TLRPC.Document selectedSticker;
    public SendMessagesHelper.ImportingSticker selectedStickerPath;
    public String setTitle;
    public final View[] shadow;
    public final AnimatorSet[] shadowAnimation;
    public boolean showEmoji;
    public boolean showTooltipWhenToggle;
    public TextView stickerEmojiTextView;
    public BackupImageView stickerImageView;
    public FrameLayout stickerPreviewLayout;
    public TLRPC.TL_messages_stickerSet stickerSet;
    public ArrayList stickerSetCovereds;
    public PhotoViewer$$ExternalSyntheticLambda61 stickersOnItemClickListener;
    public final GmsRpc stickersShaker;
    public LinkSpanDrawable.LinksTextView titleTextView;
    public HashMap uploadImportStickers;
    public Pattern urlPattern;

    public final class AnonymousClass1 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
        public AnonymousClass1() {
        }

        @Override
        public final void addCaptionToGif(TLObject tLObject, Object obj) {
        }

        @Override
        public final void addToFavoriteSelected(String str) {
        }

        @Override
        public final boolean can() {
            TLRPC.StickerSet stickerSet;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = StickersAlert.this.stickerSet;
            return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
        }

        @Override
        public final boolean canAddCaption() {
            return false;
        }

        @Override
        public final boolean canDeleteSticker() {
            return true;
        }

        @Override
        public final boolean canEditSticker() {
            return true;
        }

        @Override
        public final boolean canSchedule() {
            StickersAlertDelegate stickersAlertDelegate = StickersAlert.this.delegate;
            return stickersAlertDelegate != null && stickersAlertDelegate.canSchedule();
        }

        @Override
        public final boolean canSendSticker() {
            return true;
        }

        @Override
        public final Boolean canSetAsStatus(TLRPC.Document document) {
            return null;
        }

        @Override
        public final void copyEmoji(TLRPC.Document document) {
        }

        @Override
        public final void deleteSticker(TLRPC.Document document) {
            StickersAlert stickersAlert = StickersAlert.this;
            stickersAlert.stickerSet.documents.remove(document);
            boolean zIsEmpty = stickersAlert.stickerSet.documents.isEmpty();
            if (zIsEmpty) {
                stickersAlert.lambda$showGiftOfferSheet$15();
            }
            stickersAlert.adapter.notifyDataSetChanged();
            AlertDialog alertDialog = new AlertDialog(stickersAlert.getContext(), 3, ((BottomSheet) stickersAlert).resourcesProvider);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 350L);
            TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
            tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
            ConnectionsManager.getInstance(((BottomSheet) stickersAlert).currentAccount).sendRequest(tL_stickers_removeStickerFromSet, new DialogsActivity$50$$ExternalSyntheticLambda2(this, zIsEmpty, alertDialog, 3));
        }

        @Override
        public final void editSticker(TLRPC.Document document) {
            StickersAlert stickersAlert = StickersAlert.this;
            StickersAlert.editSticker(stickersAlert.parentFragment, stickersAlert.stickerSet, document);
        }

        @Override
        public final ItemOptions getCustomItemOptions(IntroActivity.AnonymousClass1 anonymousClass1) {
            return null;
        }

        @Override
        public final long getDialogId() {
            BaseFragment baseFragment = StickersAlert.this.parentFragment;
            if (baseFragment instanceof ChatActivity) {
                return ((ChatActivity) baseFragment).getDialogId();
            }
            return 0L;
        }

        @Override
        public final TLRPC.TL_messageMediaPoll getPoll() {
            return null;
        }

        @Override
        public final TLRPC.PollAnswer getPollAnswer() {
            return null;
        }

        @Override
        public final MessageObject getPollMessageObject() {
            return null;
        }

        @Override
        public final String getQuery(boolean z) {
            return null;
        }

        @Override
        public final void gifAddedOrDeleted() {
        }

        @Override
        public final boolean isInScheduleMode() {
            StickersAlertDelegate stickersAlertDelegate = StickersAlert.this.delegate;
            return stickersAlertDelegate != null && stickersAlertDelegate.isInScheduleMode();
        }

        @Override
        public final boolean isPhotoEditor() {
            return false;
        }

        @Override
        public final boolean isReplacedSticker() {
            return false;
        }

        @Override
        public final boolean isSettingIntroSticker() {
            return false;
        }

        @Override
        public final boolean isStickerEditor() {
            return false;
        }

        @Override
        public final boolean needCopy(TLRPC.Document document) {
            return false;
        }

        @Override
        public final boolean needOpen() {
            return false;
        }

        @Override
        public final boolean needRemove() {
            return StickersAlert.this.importingStickers != null;
        }

        @Override
        public final boolean needRemoveFromRecent(TLRPC.Document document) {
            return false;
        }

        @Override
        public final boolean needSend(int i) {
            return StickersAlert.this.delegate != null;
        }

        @Override
        public final void newStickerPackSelected(CharSequence charSequence, String str, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
        }

        @Override
        public final void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        }

        @Override
        public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
            StickersAlert.this.removeSticker(importingSticker);
        }

        @Override
        public final void removeFromRecent(TLRPC.Document document) {
        }

        @Override
        public final void resetTouch() {
        }

        @Override
        public final void retractVote() {
        }

        @Override
        public final void sendEmoji(TLRPC.Document document) {
        }

        @Override
        public final void sendGif(int i, int i2, Object obj, TLObject tLObject, boolean z) {
        }

        @Override
        public final void sendSticker(String str) {
        }

        @Override
        public final void sendVote() {
        }

        @Override
        public final void setAsEmojiStatus(TLRPC.Document document) {
        }

        @Override
        public final void setIntroSticker(String str) {
        }

        @Override
        public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
        }

        @Override
        public final void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
            StickersAlert stickersAlert = StickersAlert.this;
            StickersAlertDelegate stickersAlertDelegate = stickersAlert.delegate;
            if (stickersAlertDelegate == null) {
                return;
            }
            stickersAlertDelegate.onStickerSelected(document, str, obj, null, stickersAlert.clearsInputField, z, i, 0);
            stickersAlert.lambda$showGiftOfferSheet$15();
        }
    }

    public final class AnonymousClass13 extends ShareAlert {
        public AnonymousClass13(Context context, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
            super(context, str, str2, resourcesProvider);
        }

        @Override
        public final void dismissInternal() {
            super.dismissInternal();
            StickersAlert stickersAlert = StickersAlert.this;
            BaseFragment baseFragment = stickersAlert.parentFragment;
            if (baseFragment instanceof ChatActivity) {
                Activity parentActivity = baseFragment.getParentActivity();
                BaseFragment baseFragment2 = stickersAlert.parentFragment;
                AndroidUtilities.requestAdjustResize(parentActivity, baseFragment2.getClassGuid());
                if (((ChatActivity) baseFragment2).chatActivityEnterView.getVisibility() == 0) {
                    baseFragment2.getFragmentView().requestLayout();
                }
            }
        }

        @Override
        public final void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            if (z) {
                AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(this, longSparseArray, i, 11), 100L);
            }
        }
    }

    public final class AnonymousClass2 extends PhotoViewer.EmptyPhotoViewerProvider {
        @Override
        public final boolean allowCaption() {
            return false;
        }
    }

    public final class AnonymousClass3 extends PhotoViewer.EmptyPhotoViewerProvider {
        @Override
        public final boolean allowCaption() {
            return false;
        }

        @Override
        public final boolean isEditingSticker() {
            return true;
        }
    }

    public final class AnonymousClass7 extends GridLayoutManager {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;

        public AnonymousClass7(ChatAttachAlert.AttachAlertLayout attachAlertLayout, int i, int i2) {
            super(i);
            this.$r8$classId = i2;
            this.this$0 = attachAlertLayout;
        }

        @Override
        public boolean isLayoutRTL() {
            switch (this.$r8$classId) {
                case 0:
                    return ((StickersAlert) this.this$0).stickerSetCovereds != null && LocaleController.isRTL;
                default:
                    return super.isLayoutRTL();
            }
        }

        @Override
        public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            switch (this.$r8$classId) {
                case 3:
                    if (((BotPreviewsEditContainer.BotPreviewsEditLangContainer) this.this$0).columnsAnimation) {
                        i = 0;
                    }
                    return super.scrollVerticallyBy(i, recycler, state);
                default:
                    return super.scrollVerticallyBy(i, recycler, state);
            }
        }

        @Override
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            switch (this.$r8$classId) {
                case 1:
                    final Context context = recyclerView.getContext();
                    LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context) {
                        @Override
                        public final int calculateDyToMakeVisible(int i2, View view) {
                            return RichMessageLayout$$ExternalSyntheticOutline1.m(((ChatAttachAlertColorsLayout) this.this$1.this$0).gridView.getPaddingTop(), 7.0f, super.calculateDyToMakeVisible(i2, view));
                        }

                        @Override
                        public final int calculateTimeForDeceleration(int i2) {
                            return super.calculateTimeForDeceleration(i2) * 2;
                        }
                    };
                    linearSmoothScroller.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScroller);
                    break;
                case 2:
                    final Context context2 = recyclerView.getContext();
                    LinearSmoothScroller linearSmoothScroller2 = new LinearSmoothScroller(context2) {
                        @Override
                        public final int calculateDyToMakeVisible(int i2, View view) {
                            int iCalculateDyToMakeVisible = super.calculateDyToMakeVisible(i2, view);
                            StickersAlert.AnonymousClass7 anonymousClass7 = this.this$1;
                            return iCalculateDyToMakeVisible - (((ChatAttachAlertPhotoLayout) anonymousClass7.this$0).gridView.getPaddingTop() - ((ChatAttachAlertPhotoLayout) anonymousClass7.this$0).getTopScrollOffset());
                        }

                        @Override
                        public final int calculateTimeForDeceleration(int i2) {
                            return super.calculateTimeForDeceleration(i2) * 2;
                        }
                    };
                    linearSmoothScroller2.mTargetPosition = i;
                    startSmoothScroll(linearSmoothScroller2);
                    break;
                default:
                    super.smoothScrollToPosition(recyclerView, state, i);
                    break;
            }
        }

        @Override
        public boolean supportsPredictiveItemAnimations() {
            switch (this.$r8$classId) {
                case 1:
                    return false;
                case 2:
                    return false;
                case 3:
                    return false;
                default:
                    return super.supportsPredictiveItemAnimations();
            }
        }

        public AnonymousClass7(StickersAlert stickersAlert) {
            super(5);
            this.$r8$classId = 0;
            this.this$0 = stickersAlert;
        }

        public AnonymousClass7(BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer) {
            super(3);
            this.$r8$classId = 3;
            this.this$0 = botPreviewsEditLangContainer;
        }
    }

    public final class AddStickerBtnView extends FrameLayout {
    }

    public final class GridAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;
        public int stickersPerRow;
        public int stickersRowCount;
        public int totalItems;
        public final SparseArray cache = new SparseArray();
        public final SparseArray positionsToSets = new SparseArray();

        public GridAdapter(Context context) {
            this.context = context;
        }

        @Override
        public final int getItemCount() {
            return this.totalItems;
        }

        @Override
        public final int getItemViewType(int i) {
            StickersAlert stickersAlert = StickersAlert.this;
            if (stickersAlert.stickerSetCovereds == null) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickersAlert.stickerSet;
                return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i) ? 0 : 3;
            }
            Object obj = this.cache.get(i);
            if (obj != null) {
                return obj instanceof TLRPC.Document ? 0 : 2;
            }
            return 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void notifyDataSetChanged() {
            int iCeil;
            int i;
            StickersAlert stickersAlert = StickersAlert.this;
            if (stickersAlert.stickerSetCovereds != null) {
                int measuredWidth = stickersAlert.gridView.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                int iDp = measuredWidth / AndroidUtilities.dp(72.0f);
                this.stickersPerRow = iDp;
                stickersAlert.layoutManager.setSpanCount(iDp);
                SparseArray sparseArray = this.cache;
                sparseArray.clear();
                SparseArray sparseArray2 = this.positionsToSets;
                sparseArray2.clear();
                this.totalItems = 0;
                this.stickersRowCount = 0;
                for (int i2 = 0; i2 < stickersAlert.stickerSetCovereds.size(); i2++) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) stickersAlert.stickerSetCovereds.get(i2);
                    List listSubList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                    if (listSubList != null) {
                        listSubList = listSubList.subList(0, Math.min(listSubList.size(), this.stickersPerRow));
                    }
                    if (listSubList != null && (!listSubList.isEmpty() || stickerSetCovered.cover != null)) {
                        this.stickersRowCount++;
                        sparseArray2.put(this.totalItems, stickerSetCovered);
                        int i3 = this.totalItems;
                        this.totalItems = i3 + 1;
                        sparseArray.put(i3, Integer.valueOf(i2));
                        int i4 = this.totalItems / this.stickersPerRow;
                        if (listSubList.isEmpty()) {
                            sparseArray.put(this.totalItems, stickerSetCovered.cover);
                            iCeil = 1;
                        } else {
                            iCeil = (int) Math.ceil(listSubList.size() / this.stickersPerRow);
                            for (int i5 = 0; i5 < listSubList.size(); i5++) {
                                sparseArray.put(this.totalItems + i5, listSubList.get(i5));
                            }
                        }
                        int i6 = 0;
                        while (true) {
                            i = this.stickersPerRow * iCeil;
                            if (i6 >= i) {
                                break;
                            }
                            sparseArray2.put(this.totalItems + i6, stickerSetCovered);
                            i6++;
                        }
                        this.totalItems = i + this.totalItems;
                    }
                }
            } else {
                ArrayList arrayList = stickersAlert.importingStickersPaths;
                if (arrayList != null) {
                    this.totalItems = arrayList.size();
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickersAlert.stickerSet;
                    this.totalItems = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickersAlert.stickerSet;
                    if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                        TLRPC.StickerSet stickerSet = stickersAlert.stickerSet.set;
                        if (!stickerSet.masks && !stickerSet.emojis) {
                            this.totalItems++;
                        }
                    }
                }
            }
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            StickersAlert stickersAlert = StickersAlert.this;
            ArrayList arrayList = stickersAlert.stickerSetCovereds;
            View view = viewHolder.itemView;
            if (arrayList == null) {
                if (stickersAlert.importingStickers != null) {
                    ((StickerEmojiCell) view).setSticker((SendMessagesHelper.ImportingSticker) stickersAlert.importingStickersPaths.get(i));
                    return;
                }
                if (viewHolder.mItemViewType != 3) {
                    StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickersAlert.stickerSet;
                    if (tL_messages_stickerSet == null) {
                        return;
                    }
                    stickerEmojiCell.setSticker(tL_messages_stickerSet.documents.get(i), null, stickersAlert.stickerSet, null, stickersAlert.showEmoji, stickersAlert.isEditModeEnabled);
                    stickerEmojiCell.editModeIcon.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(17, this, stickerEmojiCell));
                    return;
                }
                return;
            }
            int i2 = viewHolder.mItemViewType;
            SparseArray sparseArray = this.cache;
            if (i2 == 0) {
                ((StickerEmojiCell) view).setSticker((TLRPC.Document) sparseArray.get(i), null, this.positionsToSets.get(i), null, false, false);
            } else if (i2 == 1) {
                ((EmptyCell) view).setHeight(AndroidUtilities.dp(82.0f));
            } else {
                if (i2 != 2) {
                    return;
                }
                ((FeaturedStickerSetInfoCell) view).setStickerSet((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue()), false, false, 0, 0, false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View featuredStickerSetInfoCell;
            StickersAlert stickersAlert = StickersAlert.this;
            Context context = this.context;
            if (i != 0) {
                if (i == 1) {
                    featuredStickerSetInfoCell = new EmptyCell(context);
                } else if (i == 2) {
                    featuredStickerSetInfoCell = new FeaturedStickerSetInfoCell(8, this.context, ((BottomSheet) stickersAlert).resourcesProvider, true, false);
                } else if (i != 3) {
                    featuredStickerSetInfoCell = null;
                } else {
                    Theme.ResourcesProvider resourcesProvider = ((BottomSheet) stickersAlert).resourcesProvider;
                    AddStickerBtnView addStickerBtnView = new AddStickerBtnView(context);
                    View view2 = new View(context);
                    int iDp = AndroidUtilities.dp(28.0f);
                    int i2 = Theme.key_chat_emojiPanelIcon;
                    ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(iDp, Theme.multAlpha(0.12f, Theme.getColor(i2, resourcesProvider)));
                    Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                    CombinedDrawable combinedDrawable = new CombinedDrawable(shapeDrawableCreateRoundRectDrawable, drawableMutate);
                    int iDp2 = AndroidUtilities.dp(56.0f);
                    int iDp3 = AndroidUtilities.dp(56.0f);
                    combinedDrawable.backWidth = iDp2;
                    combinedDrawable.backHeight = iDp3;
                    int iDp4 = AndroidUtilities.dp(24.0f);
                    int iDp5 = AndroidUtilities.dp(24.0f);
                    combinedDrawable.iconWidth = iDp4;
                    combinedDrawable.iconHeight = iDp5;
                    view2.setBackground(combinedDrawable);
                    ScaleStateListAnimator.apply(view2, 0.1f, 1.5f);
                    addStickerBtnView.addView(view2, LayoutHelper.createFrame(56, 56, 17));
                    view = addStickerBtnView;
                }
                return new RecyclerListView.Holder(featuredStickerSetInfoCell);
            }
            StickerEmojiCell stickerEmojiCell = new StickerEmojiCell(context, ((BottomSheet) stickersAlert).resourcesProvider) {
                @Override
                public final void onMeasure(int i3, int i4) {
                    GridAdapter gridAdapter = GridAdapter.this;
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(StickersAlert.this.itemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(StickersAlert.this.itemSize, 1073741824));
                }
            };
            stickerEmojiCell.getImageView().setLayerNum(7);
            view = stickerEmojiCell;
            featuredStickerSetInfoCell = view;
            return new RecyclerListView.Holder(featuredStickerSetInfoCell);
        }
    }

    public interface StickersAlertDelegate {
        boolean canSchedule();

        boolean isInScheduleMode();

        void onStickerSelected(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, boolean z2, int i, int i2);
    }

    public interface StickersAlertInstallDelegate {
        void onStickerSetInstalled();
    }

    public StickersAlert(Activity activity, MessageObject messageObject, TLObject tLObject, Theme.ResourcesProvider resourcesProvider) {
        super(activity, resourcesProvider, false, false);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.stickersShaker = new GmsRpc(12);
        this.previewDelegate = new AnonymousClass1();
        this.resourcesProvider = resourcesProvider;
        fixNavigationBar();
        this.parentActivity = activity;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        PhotoViewer.AnonymousClass16.AnonymousClass2 anonymousClass2 = (PhotoViewer.AnonymousClass16.AnonymousClass2) this;
        this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new LoginActivity$$ExternalSyntheticLambda42(anonymousClass2, messageObject, tL_messages_getAttachedStickers, new LinkManager$$ExternalSyntheticLambda8(9, anonymousClass2, tL_messages_getAttachedStickers), 6));
        init$1(activity);
    }

    public static void access$2700(StickersAlert stickersAlert) {
        if (stickersAlert.gridView.getChildCount() <= 0) {
            stickersAlert.setScrollOffsetY$1(stickersAlert.gridView.getPaddingTop());
            return;
        }
        int i = 0;
        View view = null;
        int i2 = -1;
        for (int i3 = 0; i3 < stickersAlert.gridView.getChildCount(); i3++) {
            View childAt = stickersAlert.gridView.getChildAt(i3);
            stickersAlert.gridView.getClass();
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
            if (i2 == -1 || i2 > childAdapterPosition) {
                view = childAt;
                i2 = childAdapterPosition;
            }
        }
        if (view == null || view.getTop() < 0) {
            stickersAlert.runShadowAnimation$2(0, true);
        } else {
            int top = view.getTop();
            stickersAlert.runShadowAnimation$2(0, false);
            i = top;
        }
        stickersAlert.runShadowAnimation$2(1, true);
        if (stickersAlert.scrollOffsetY != i) {
            stickersAlert.setScrollOffsetY$1(i);
        }
    }

    public static void editSticker(BaseFragment baseFragment, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (baseFragment == null) {
            return;
        }
        ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
        boolean z = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (!MessageObject.isStaticStickerDocument(document)) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda488(baseFragment, tL_messages_stickerSet, document, chatActivity, z), 300L);
            return;
        }
        ArrayList arrayList = new ArrayList();
        File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
        if (pathToAttach == null || !pathToAttach.exists()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new StickersAlert$$ExternalSyntheticLambda35(pathToAttach, arrayList, baseFragment, chatActivity, document, z, tL_messages_stickerSet), 300L);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void checkPremiumStickers() {
        if (this.stickerSet != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSetFilterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.stickerSet);
            this.stickerSet = tL_messages_stickerSetFilterPremiumStickers;
            if (tL_messages_stickerSetFilterPremiumStickers == null) {
                lambda$showGiftOfferSheet$15();
            }
        }
    }

    public final void checkUrlAvailable(TextView textView, String str, boolean z) {
        if (z) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGreenText));
            this.lastNameAvailable = true;
            this.lastCheckName = str;
            return;
        }
        IntroActivity$$ExternalSyntheticLambda5 introActivity$$ExternalSyntheticLambda5 = this.checkRunnable;
        if (introActivity$$ExternalSyntheticLambda5 != null) {
            AndroidUtilities.cancelRunOnUIThread(introActivity$$ExternalSyntheticLambda5);
            this.checkRunnable = null;
            this.lastCheckName = null;
            if (this.checkReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkReqId, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
            textView.setTextColor(getThemedColor(Theme.key_dialogTextGray2));
            return;
        }
        this.lastNameAvailable = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalid));
                textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
                return;
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    textView.setText(LocaleController.getString(R.string.ImportStickersEnterUrlInfo));
                    textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
                    return;
                }
            }
        }
        if (str == null || str.length() < 5) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidShort));
            textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
        } else {
            if (str.length() > 32) {
                textView.setText(LocaleController.getString(R.string.ImportStickersLinkInvalidLong));
                textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
                return;
            }
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkChecking));
            textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText8));
            this.lastCheckName = str;
            IntroActivity$$ExternalSyntheticLambda5 introActivity$$ExternalSyntheticLambda6 = new IntroActivity$$ExternalSyntheticLambda5((Object) this, str, (Object) textView, 7);
            this.checkRunnable = introActivity$$ExternalSyntheticLambda6;
            AndroidUtilities.runOnUIThread(introActivity$$ExternalSyntheticLambda6, 300L);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            ChatActivity.AnonymousClass34 anonymousClass34 = this.gridView;
            if (anonymousClass34 != null) {
                int childCount = anonymousClass34.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.gridView.getChildAt(i3).invalidate();
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileUploaded) {
            HashMap map = this.uploadImportStickers;
            if (map == null) {
                return;
            }
            String str = (String) objArr[0];
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) map.get(str);
            if (importingSticker != null) {
                importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new IntroActivity$$ExternalSyntheticLambda5((Object) this, str, (Object) importingSticker, 4));
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileUploadFailed) {
            HashMap map2 = this.uploadImportStickers;
            if (map2 == null) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker2 = (SendMessagesHelper.ImportingSticker) map2.remove((String) objArr[0]);
            if (importingSticker2 != null) {
                removeSticker(importingSticker2);
            }
            if (this.uploadImportStickers.isEmpty()) {
                updateFields();
                return;
            }
            return;
        }
        if (i == NotificationCenter.stickersDidLoad) {
            TLRPC.TL_messages_stickerSet stickerSetByName = null;
            if (this.inputStickerSet != null) {
                MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                String str2 = this.inputStickerSet.short_name;
                stickerSetByName = str2 != null ? mediaDataController.getStickerSetByName(str2) : null;
                if (stickerSetByName == null) {
                    stickerSetByName = mediaDataController.getStickerSetById(this.inputStickerSet.id);
                }
            }
            if (stickerSetByName != null && stickerSetByName != this.stickerSet) {
                this.stickerSet = stickerSetByName;
                loadStickerSet();
            }
            updateFields();
        }
    }

    public final void disableEditMode() {
        if (this.isEditModeEnabled) {
            this.dragAndDropHelper.attachToRecyclerView(null);
            this.isEditModeEnabled = false;
            this.stickersShaker.stopShake(true);
            AndroidUtilities.forEachViews((RecyclerView) this.gridView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(8));
            this.optionsButton.postDelayed(new StickersAlert$$ExternalSyntheticLambda30(this, 0), 200L);
            this.pickerBottomLayout.setText(LocaleController.getString(R.string.EditStickers), true, true);
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        this.stickersShaker.stopShake(false);
        Runnable runnable = this.onDismissListener;
        if (runnable != null) {
            runnable.run();
        }
        if (this.reqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.importingStickers != null) {
            ArrayList arrayList = this.importingStickersPaths;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.importingStickersPaths.get(i);
                    if (!importingSticker.validated) {
                        FileLoader.getInstance(this.currentAccount).cancelFileUpload(importingSticker.path, false);
                    }
                    if (importingSticker.animated) {
                        new File(importingSticker.path).delete();
                    }
                }
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    public final void enableEditMode() {
        int i = 3;
        if (this.isEditModeEnabled) {
            return;
        }
        this.dragAndDropHelper.attachToRecyclerView(this.gridView);
        this.isEditModeEnabled = true;
        GmsRpc gmsRpc = this.stickersShaker;
        gmsRpc.stopShake(false);
        ArrayList arrayList = (ArrayList) gmsRpc.userAgentPublisher;
        boolean zIsEmpty = arrayList.isEmpty();
        Float fValueOf = Float.valueOf(0.0f);
        if (zIsEmpty) {
            for (int i2 = 0; i2 < 6; i2++) {
                arrayList.add(fValueOf);
                ((ArrayList) gmsRpc.heartbeatInfo).add(fValueOf);
                ((ArrayList) gmsRpc.firebaseInstallations).add(fValueOf);
            }
        }
        int i3 = 0;
        for (int i4 = 6; i3 < i4; i4 = 6) {
            long jNextFloat = (long) (Utilities.random.nextFloat() * 300);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new StickersAlert$StickersShaker$$ExternalSyntheticLambda0(gmsRpc, i3, i));
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setCurrentPlayTime(jNextFloat);
            long j = 300;
            valueAnimatorOfFloat.setDuration(j);
            valueAnimatorOfFloat.start();
            float fDp = AndroidUtilities.dp(0.5f);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, fDp, 0.0f, -fDp, 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(new StickersAlert$StickersShaker$$ExternalSyntheticLambda0(gmsRpc, i3, 4));
            valueAnimatorOfFloat2.setRepeatCount(-1);
            valueAnimatorOfFloat2.setRepeatMode(1);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setCurrentPlayTime(jNextFloat);
            valueAnimatorOfFloat2.setDuration((long) (((double) 300) * 1.2d));
            valueAnimatorOfFloat2.start();
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, fDp, 0.0f - fDp, 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new StickersAlert$StickersShaker$$ExternalSyntheticLambda0(gmsRpc, i3, 5));
            valueAnimatorOfFloat3.setRepeatCount(-1);
            valueAnimatorOfFloat3.setRepeatMode(1);
            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat3.setCurrentPlayTime(jNextFloat);
            valueAnimatorOfFloat3.setDuration(j);
            valueAnimatorOfFloat3.start();
            ((ArrayList) gmsRpc.app).add(valueAnimatorOfFloat);
            ((ArrayList) gmsRpc.metadata).add(valueAnimatorOfFloat2);
            ((ArrayList) gmsRpc.rpc).add(valueAnimatorOfFloat3);
            i3++;
            i = 3;
        }
        AndroidUtilities.forEachViews((RecyclerView) this.gridView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(9));
        this.optionsButton.postDelayed(new StickersAlert$$ExternalSyntheticLambda30(this, 2), 200L);
        this.pickerBottomLayout.setText(LocaleController.getString(R.string.Done), true, true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 21);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(viewGroup, 0, null, null, drawableArr, null, i));
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        StickersAlert stickersAlert = StickersAlert.this;
        if (stickersAlert.stickerSetCovereds != null) {
            FeaturedStickerSetInfoCell.createThemeDescriptions(arrayList, stickersAlert.gridView, chatActivity$$ExternalSyntheticLambda94);
        }
        View[] viewArr = this.shadow;
        View view = viewArr[0];
        int i2 = Theme.key_dialogShadowLine;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(viewArr[1], 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.gridView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.titleTextView, 4, null, null, null, null, Theme.key_dialogTextBlack));
        arrayList.add(new ThemeDescription(this.titleTextView, 2, null, null, null, null, Theme.key_dialogTextLink));
        arrayList.add(new ThemeDescription(this.optionsButton, 65568, null, null, null, null, Theme.key_player_actionBarSelector));
        arrayList.add(new ThemeDescription(this.pickerBottomLayout, 32, null, null, null, null, i));
        AnimatedTextView animatedTextView = this.pickerBottomLayout;
        int i3 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(animatedTextView, 65568, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.pickerBottomLayout, 4, null, null, null, null, this.buttonTextColorKey));
        arrayList.add(new ThemeDescription(this.previewSendButton, 4, null, null, null, null, Theme.key_dialogTextBlue2));
        arrayList.add(new ThemeDescription(this.previewSendButton, 32, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.previewSendButton, 65568, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.previewSendButtonShadow, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_dialogLinkSelection));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_sheet_other));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_dialogButtonSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_actionBarDefaultSubmenuBackground));
        return arrayList;
    }

    public final void init$1(Context context) {
        FrameLayout frameLayout = new FrameLayout(context) {
            public boolean fullHeight;
            public int lastNotifyWidth;
            public final RectF rect = new RectF();
            public Boolean statusBarOpen;

            @Override
            public final void onDraw(Canvas canvas) {
                float fMin;
                int iMin;
                RectF rectF;
                boolean z;
                Boolean bool;
                boolean z2;
                boolean z3;
                StickersAlert stickersAlert = StickersAlert.this;
                int iDp = AndroidUtilities.dp(6.0f) + (stickersAlert.scrollOffsetY - ((BottomSheet) stickersAlert).backgroundPaddingTop);
                int iDp2 = (stickersAlert.scrollOffsetY - ((BottomSheet) stickersAlert).backgroundPaddingTop) - AndroidUtilities.dp(13.0f);
                int i = AndroidUtilities.statusBarHeight;
                int i2 = iDp2 + i;
                int i3 = iDp + i;
                if (this.fullHeight) {
                    int i4 = ((BottomSheet) stickersAlert).backgroundPaddingTop + i2;
                    int i5 = AndroidUtilities.statusBarHeight;
                    int i6 = i5 * 2;
                    if (i4 < i6) {
                        int iMin2 = Math.min(i5, (i6 - i2) - ((BottomSheet) stickersAlert).backgroundPaddingTop);
                        i2 -= iMin2;
                        fMin = 1.0f - Math.min(1.0f, (iMin2 * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        fMin = 1.0f;
                    }
                    int i7 = ((BottomSheet) stickersAlert).backgroundPaddingTop + i2;
                    int i8 = AndroidUtilities.statusBarHeight;
                    iMin = i7 < i8 ? Math.min(i8, (i8 - i2) - ((BottomSheet) stickersAlert).backgroundPaddingTop) : 0;
                    ((BottomSheet) stickersAlert).shadowDrawable.setBounds(0, i2, getMeasuredWidth(), getMeasuredHeight());
                    ((BottomSheet) stickersAlert).shadowDrawable.draw(canvas);
                    rectF = this.rect;
                    if (fMin != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(stickersAlert.getThemedColor(Theme.key_dialogBackground));
                        rectF.set(((BottomSheet) stickersAlert).backgroundPaddingLeft, ((BottomSheet) stickersAlert).backgroundPaddingTop + i2, getMeasuredWidth() - ((BottomSheet) stickersAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) stickersAlert).backgroundPaddingTop + i2);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                    }
                    int iDp3 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - iDp3) / 2, i3, (getMeasuredWidth() + iDp3) / 2, AndroidUtilities.dp(4.0f) + i3);
                    Theme.dialogs_onlineCirclePaint.setColor(stickersAlert.getThemedColor(Theme.key_sheet_scrollUp));
                    Paint paint = Theme.dialogs_onlineCirclePaint;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i3 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * paint.getAlpha()));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    if (iMin > AndroidUtilities.statusBarHeight / 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bool = this.statusBarOpen;
                    if (bool != null || bool.booleanValue() != z) {
                        if (AndroidUtilities.computePerceivedBrightness(stickersAlert.getThemedColor(Theme.key_dialogBackground)) > 0.721f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(stickersAlert.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                        this.statusBarOpen = Boolean.valueOf(z);
                        if (!z) {
                            z2 = z3;
                        }
                        AndroidUtilities.setLightStatusBar(stickersAlert.getWindow(), z2);
                    }
                    if (iMin > 0) {
                        Theme.dialogs_onlineCirclePaint.setColor(stickersAlert.getThemedColor(Theme.key_dialogBackground));
                        canvas.drawRect(((BottomSheet) stickersAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) stickersAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                    }
                }
                fMin = 1.0f;
                ((BottomSheet) stickersAlert).shadowDrawable.setBounds(0, i2, getMeasuredWidth(), getMeasuredHeight());
                ((BottomSheet) stickersAlert).shadowDrawable.draw(canvas);
                rectF = this.rect;
                if (fMin != 1.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(stickersAlert.getThemedColor(Theme.key_dialogBackground));
                    rectF.set(((BottomSheet) stickersAlert).backgroundPaddingLeft, ((BottomSheet) stickersAlert).backgroundPaddingTop + i2, getMeasuredWidth() - ((BottomSheet) stickersAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) stickersAlert).backgroundPaddingTop + i2);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                }
                int iDp4 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - iDp4) / 2, i3, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + i3);
                Theme.dialogs_onlineCirclePaint.setColor(stickersAlert.getThemedColor(Theme.key_sheet_scrollUp));
                Paint paint2 = Theme.dialogs_onlineCirclePaint;
                paint2.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i3 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * paint2.getAlpha()));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                if (iMin > AndroidUtilities.statusBarHeight / 2) {
                    z = true;
                } else {
                    z = false;
                }
                bool = this.statusBarOpen;
                if (bool != null) {
                    if (AndroidUtilities.computePerceivedBrightness(stickersAlert.getThemedColor(Theme.key_dialogBackground)) > 0.721f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(Theme.blendOver(stickersAlert.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f) {
                    }
                    this.statusBarOpen = Boolean.valueOf(z);
                    if (!z) {
                        z2 = z3;
                    }
                    AndroidUtilities.setLightStatusBar(stickersAlert.getWindow(), z2);
                } else {
                    if (AndroidUtilities.computePerceivedBrightness(stickersAlert.getThemedColor(Theme.key_dialogBackground)) > 0.721f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (AndroidUtilities.computePerceivedBrightness(Theme.blendOver(stickersAlert.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f) {
                    }
                    this.statusBarOpen = Boolean.valueOf(z);
                    if (!z) {
                        z2 = z3;
                    }
                    AndroidUtilities.setLightStatusBar(stickersAlert.getWindow(), z2);
                }
                if (iMin > 0) {
                    Theme.dialogs_onlineCirclePaint.setColor(stickersAlert.getThemedColor(Theme.key_dialogBackground));
                    canvas.drawRect(((BottomSheet) stickersAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) stickersAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                }
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    StickersAlert stickersAlert = StickersAlert.this;
                    if (stickersAlert.scrollOffsetY != 0 && motionEvent.getY() < stickersAlert.scrollOffsetY) {
                        stickersAlert.lambda$showGiftOfferSheet$15();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int i5 = this.lastNotifyWidth;
                int i6 = i3 - i;
                StickersAlert stickersAlert = StickersAlert.this;
                if (i5 != i6) {
                    this.lastNotifyWidth = i6;
                    GridAdapter gridAdapter = stickersAlert.adapter;
                    if (gridAdapter != null && stickersAlert.stickerSetCovereds != null) {
                        gridAdapter.notifyDataSetChanged();
                    }
                }
                super.onLayout(z, i, i2, i3, i4);
                StickersAlert.access$2700(stickersAlert);
            }

            @Override
            public final void onMeasure(int i, int i2) {
                int iMax;
                int i3;
                int size;
                float f;
                int iDp;
                int size2 = View.MeasureSpec.getSize(i2);
                StickersAlert stickersAlert = StickersAlert.this;
                stickersAlert.ignoreLayout = true;
                setPadding(((BottomSheet) stickersAlert).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) stickersAlert).backgroundPaddingLeft, 0);
                stickersAlert.ignoreLayout = false;
                if (stickersAlert.isEmoji()) {
                    int measuredWidth = stickersAlert.gridView.getMeasuredWidth();
                    if (measuredWidth == 0) {
                        measuredWidth = AndroidUtilities.displaySize.x;
                    }
                    stickersAlert.adapter.stickersPerRow = Math.max(1, measuredWidth / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f));
                    int size3 = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(36.0f)) / stickersAlert.adapter.stickersPerRow;
                    stickersAlert.itemSize = size3;
                    stickersAlert.itemHeight = size3;
                } else {
                    stickersAlert.adapter.stickersPerRow = 5;
                    stickersAlert.itemSize = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(36.0f)) / stickersAlert.adapter.stickersPerRow;
                    stickersAlert.itemHeight = AndroidUtilities.dp(82.0f);
                }
                float f2 = stickersAlert.adapter.stickersPerRow;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) stickersAlert.gridView.getLayoutParams();
                ArrayList arrayList = stickersAlert.importingStickers;
                if (arrayList == null) {
                    if (stickersAlert.stickerSetCovereds != null) {
                        size = ((BottomSheet) stickersAlert).backgroundPaddingTop + (stickersAlert.adapter.stickersRowCount * stickersAlert.itemHeight) + (stickersAlert.stickerSetCovereds.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.dp(24.0f);
                    } else {
                        int iDp2 = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                        int i4 = stickersAlert.isEmoji() ? 2 : 3;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickersAlert.stickerSet;
                        iMax = ((BottomSheet) stickersAlert).backgroundPaddingTop + (Math.max(i4, tL_messages_stickerSet != null ? (int) Math.ceil(tL_messages_stickerSet.documents.size() / f2) : 0) * stickersAlert.itemHeight) + iDp2;
                        i3 = AndroidUtilities.statusBarHeight;
                    }
                    if (stickersAlert.isEmoji()) {
                        size = (int) ((stickersAlert.itemHeight * 0.15f) + size);
                    }
                    f = size2 / 5.0f;
                    if (size < ((double) f) * 3.2d) {
                        iDp = 0;
                    } else {
                        iDp = (int) (f * 2.0f);
                    }
                    if (iDp != 0 && size < size2) {
                        iDp -= size2 - size;
                    }
                    if (iDp == 0) {
                        iDp = ((BottomSheet) stickersAlert).backgroundPaddingTop;
                    }
                    if (stickersAlert.stickerSetCovereds != null) {
                        iDp += AndroidUtilities.dp(8.0f);
                    }
                    if (stickersAlert.gridView.getPaddingTop() != iDp) {
                        stickersAlert.ignoreLayout = true;
                        stickersAlert.gridView.setPadding(AndroidUtilities.dp(10.0f), iDp, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
                        stickersAlert.emptyView.setPadding(0, iDp, 0, 0);
                        stickersAlert.ignoreLayout = false;
                    }
                    this.fullHeight = size >= size2;
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(size, size2), 1073741824));
                }
                iMax = ((BottomSheet) stickersAlert).backgroundPaddingTop + (Math.max(3, (int) Math.ceil(arrayList.size() / f2)) * stickersAlert.itemHeight) + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                i3 = AndroidUtilities.statusBarHeight;
                size = iMax + i3;
                if (stickersAlert.isEmoji()) {
                    size = (int) ((stickersAlert.itemHeight * 0.15f) + size);
                }
                f = size2 / 5.0f;
                if (size < ((double) f) * 3.2d) {
                    iDp = 0;
                } else {
                    iDp = (int) (f * 2.0f);
                }
                if (iDp != 0) {
                    iDp -= size2 - size;
                }
                if (iDp == 0) {
                    iDp = ((BottomSheet) stickersAlert).backgroundPaddingTop;
                }
                if (stickersAlert.stickerSetCovereds != null) {
                    iDp += AndroidUtilities.dp(8.0f);
                }
                if (stickersAlert.gridView.getPaddingTop() != iDp) {
                    stickersAlert.ignoreLayout = true;
                    stickersAlert.gridView.setPadding(AndroidUtilities.dp(10.0f), iDp, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
                    stickersAlert.emptyView.setPadding(0, iDp, 0, 0);
                    stickersAlert.ignoreLayout = false;
                }
                this.fullHeight = size >= size2;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(size, size2), 1073741824));
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return !StickersAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public final void requestLayout() {
                if (StickersAlert.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.setPadding(i, 0, i, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        View[] viewArr = this.shadow;
        viewArr[0] = view;
        int i2 = Theme.key_dialogShadowLine;
        view.setBackgroundColor(getThemedColor(i2));
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.containerView.addView(viewArr[0], layoutParams);
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 19);
        this.gridView = anonymousClass34;
        anonymousClass34.setTag(14);
        ChatActivity.AnonymousClass34 anonymousClass35 = this.gridView;
        getContext();
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(this);
        this.layoutManager = anonymousClass7;
        anonymousClass35.setLayoutManager(anonymousClass7);
        this.layoutManager.mSpanSizeLookup = new PeerColorActivity.Page.AnonymousClass2(this, 4);
        this.dragAndDropHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback() {
            public int movedPos = -1;

            @Override
            public final boolean onMove(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                int i3 = viewHolder.mItemViewType;
                if (i3 == 3 || i3 != viewHolder2.mItemViewType) {
                    return false;
                }
                StickersAlert stickersAlert = StickersAlert.this;
                if (stickersAlert.stickerSet == null) {
                    return false;
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = viewHolder2.getAdapterPosition();
                stickersAlert.stickerSet.documents.add(adapterPosition2, stickersAlert.stickerSet.documents.remove(adapterPosition));
                stickersAlert.adapter.mObservable.notifyItemMoved(adapterPosition, adapterPosition2);
                this.movedPos = adapterPosition2;
                return true;
            }

            @Override
            public final void onMoved(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i3, int i4, int i5) {
            }

            @Override
            public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i3) {
                StickersAlert stickersAlert = StickersAlert.this;
                if (i3 != 0 || stickersAlert.draggedDocument == null || this.movedPos <= 0) {
                    if (i3 == 2) {
                        stickersAlert.draggedDocument = ((StickerEmojiCell) viewHolder.itemView).getSticker();
                    }
                } else {
                    TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
                    tL_stickers_changeStickerPosition.position = this.movedPos;
                    tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(stickersAlert.draggedDocument, "").document;
                    this.movedPos = -1;
                    stickersAlert.draggedDocument = null;
                }
            }

            @Override
            public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
            }
        });
        ChatActivity.AnonymousClass34 anonymousClass36 = this.gridView;
        GridAdapter gridAdapter = new GridAdapter(context);
        this.adapter = gridAdapter;
        anonymousClass36.setAdapter(gridAdapter);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.addItemDecoration(new FiltersView.AnonymousClass2(6));
        this.gridView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.gridView.setClipToPadding(false);
        this.gridView.setEnabled(true);
        this.gridView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.gridView.setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 8));
        this.gridView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 9));
        PhotoViewer$$ExternalSyntheticLambda61 photoViewer$$ExternalSyntheticLambda61 = new PhotoViewer$$ExternalSyntheticLambda61(this, 1);
        this.stickersOnItemClickListener = photoViewer$$ExternalSyntheticLambda61;
        this.gridView.setOnItemClickListener(photoViewer$$ExternalSyntheticLambda61);
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 27);
        this.emptyView = anonymousClass60;
        this.containerView.addView(anonymousClass60, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.gridView.setEmptyView(this.emptyView);
        this.emptyView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(23));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        this.titleTextView = linksTextView;
        linksTextView.setLines(1);
        this.titleTextView.setSingleLine(true);
        this.titleTextView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        this.titleTextView.setTextSize(1, 20.0f);
        this.titleTextView.setLinkTextColor(getThemedColor(Theme.key_dialogTextLink));
        this.titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleTextView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f));
        this.titleTextView.setGravity(16);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.titleTextView, LayoutHelper.createFrame(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, getThemedColor(Theme.key_sheet_other), false, this.resourcesProvider);
        this.optionsButton = actionBarMenuItem;
        actionBarMenuItem.setLongClickEnabled(false);
        this.optionsButton.setSubMenuOpenSide(2);
        this.optionsButton.setIcon(R.drawable.ic_ab_other);
        this.optionsButton.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(Theme.key_player_actionBarSelector), 1, -1));
        this.containerView.addView(this.optionsButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.optionsButton.addSubItem(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
        this.optionsButton.addSubItem(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
        this.optionsButton.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 1));
        this.optionsButton.setDelegate(new StickersAlert$$ExternalSyntheticLambda16(this));
        this.optionsButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.optionsButton.setVisibility(this.inputStickerSet != null ? 0 : 8);
        this.emptyView.addView(new RadialProgressView(context, null), LayoutHelper.createFrame(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        view2.setBackgroundColor(getThemedColor(i2));
        this.containerView.addView(viewArr[1], layoutParams2);
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, false, false);
        this.pickerBottomLayout = animatedTextView;
        int i3 = Theme.key_dialogBackground;
        int themedColor = getThemedColor(i3);
        int i4 = Theme.key_listSelector;
        animatedTextView.setBackground(Theme.createSelectorWithBackgroundDrawable(themedColor, getThemedColor(i4)));
        AnimatedTextView animatedTextView2 = this.pickerBottomLayout;
        int i5 = Theme.key_dialogTextBlue2;
        this.buttonTextColorKey = i5;
        animatedTextView2.setTextColor(getThemedColor(i5));
        this.pickerBottomLayout.setTextSize(AndroidUtilities.dp(14.0f));
        this.pickerBottomLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        this.pickerBottomLayout.setTypeface(AndroidUtilities.bold());
        this.pickerBottomLayout.setGravity(17);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.pickerBottomFrameLayout = frameLayout2;
        frameLayout2.addView(this.pickerBottomLayout, LayoutHelper.createFrame(48.0f, -1));
        this.containerView.addView(this.pickerBottomFrameLayout, LayoutHelper.createFrame(-1, -2, 83));
        PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(24.0f), context, this.resourcesProvider, false);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.setIcon(R.raw.unlock_icon);
        this.premiumButtonView.setVisibility(4);
        this.containerView.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.stickerPreviewLayout = frameLayout3;
        frameLayout3.setVisibility(8);
        this.stickerPreviewLayout.setSoundEffectsEnabled(false);
        this.containerView.addView(this.stickerPreviewLayout, LayoutHelper.createFrame(-1.0f, -1));
        this.stickerPreviewLayout.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 2));
        BackupImageView backupImageView = new BackupImageView(context);
        this.stickerImageView = backupImageView;
        backupImageView.setAspectFit(true);
        this.stickerImageView.setLayerNum(7);
        this.stickerPreviewLayout.addView(this.stickerImageView);
        TextView textView = new TextView(context);
        this.stickerEmojiTextView = textView;
        textView.setTextSize(1, 30.0f);
        this.stickerEmojiTextView.setGravity(85);
        this.stickerPreviewLayout.addView(this.stickerEmojiTextView);
        TextView textView2 = new TextView(context);
        this.previewSendButton = textView2;
        textView2.setTextSize(1, 14.0f);
        this.previewSendButton.setTextColor(getThemedColor(i5));
        this.previewSendButton.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(i3), getThemedColor(i4)));
        this.previewSendButton.setGravity(17);
        this.previewSendButton.setPadding(AndroidUtilities.dp(29.0f), 0, AndroidUtilities.dp(29.0f), 0);
        this.previewSendButton.setTypeface(AndroidUtilities.bold());
        this.stickerPreviewLayout.addView(this.previewSendButton, LayoutHelper.createFrame(-1, 48, 83));
        this.previewSendButton.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view3 = new View(context);
        this.previewSendButtonShadow = view3;
        view3.setBackgroundColor(getThemedColor(i2));
        this.stickerPreviewLayout.addView(this.previewSendButtonShadow, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.importingStickers != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        updateFields();
        updateSendButton();
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.stickerSet);
        }
        updateColors(false);
        this.adapter.notifyDataSetChanged();
    }

    public final boolean isEmoji() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.probablyEmojis;
        }
        return true;
    }

    public final void lambda$checkOptions$17() {
        this.optionsButton.closeSubMenu();
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, true, true);
    }

    public final void lambda$checkOptions$18() {
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, false, false);
    }

    public final void lambda$checkOptions$19() {
        this.optionsButton.closeSubMenu();
        StickersDialogs.showDeleteForEveryOneDialog(this.stickerSet.set, this.resourcesProvider, getContext(), new StickersAlert$$ExternalSyntheticLambda30(this, 4));
    }

    public final void lambda$checkOptions$20() {
        MessagesController.getInstance(this.currentAccount).openByUserName("stickers", this.parentFragment, 1);
    }

    public final void lambda$checkUrlAvailable$47(TextView textView, String str) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        this.checkReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stickers_checkShortName, new BoostsActivity$$ExternalSyntheticLambda7(this, str, textView, 23), 2);
    }

    public final void lambda$init$11(int i, View view) {
        TLRPC.StickerSet stickerSet;
        if (view instanceof AddStickerBtnView) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            AddStickerBtnView addStickerBtnView = (AddStickerBtnView) view;
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null) {
                return;
            }
            Context context = baseFragment.getContext();
            if (!(baseFragment instanceof ChatActivity)) {
                StickersDialogs.openStickerPickerDialog(tL_messages_stickerSet, baseFragment, resourcesProvider);
                return;
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert3, 0, context, resourcesProvider);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.StickersCreateNewSticker));
            zzlo.m(R.drawable.menu_sticker_add, 0, arrayList3, arrayList2);
            arrayList.add(LocaleController.getString(R.string.StickersAddAnExistingSticker));
            arrayList3.add(Integer.valueOf(R.drawable.menu_sticker_select));
            arrayList2.add(1);
            ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout);
            OAuthSheet$$ExternalSyntheticLambda6 oAuthSheet$$ExternalSyntheticLambda6 = new OAuthSheet$$ExternalSyntheticLambda6((Object) actionBarPopupWindow, arrayList2, (Object) tL_messages_stickerSet, (Object) baseFragment, (Object) resourcesProvider, 7);
            int i2 = 0;
            while (i2 < arrayList.size()) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = actionBarPopupWindowLayout;
                ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout2, ((Integer) arrayList3.get(i2)).intValue(), (CharSequence) arrayList.get(i2), false, resourcesProvider);
                actionBarMenuSubItemAddItem.setTag(Integer.valueOf(i2));
                actionBarMenuSubItemAddItem.setOnClickListener(oAuthSheet$$ExternalSyntheticLambda6);
                i2++;
                arrayList3 = arrayList3;
                actionBarPopupWindowLayout = actionBarPopupWindowLayout2;
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout3 = actionBarPopupWindowLayout;
            actionBarPopupWindow.dismissAnimationDuration = 100;
            actionBarPopupWindow.scaleOut = true;
            actionBarPopupWindow.setOutsideTouchable(true);
            actionBarPopupWindow.setClippingEnabled(true);
            actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            actionBarPopupWindow.setFocusable(true);
            actionBarPopupWindowLayout3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            actionBarPopupWindow.setInputMethodMode(2);
            actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
            int[] iArr = new int[2];
            addStickerBtnView.getLocationInWindow(iArr);
            actionBarPopupWindow.showAtLocation(addStickerBtnView, 0, ((addStickerBtnView.getMeasuredWidth() / 2) + iArr[0]) - (actionBarPopupWindowLayout3.getMeasuredWidth() / 2), ((addStickerBtnView.getMeasuredHeight() / 2) + iArr[1]) - (actionBarPopupWindowLayout3.getMeasuredHeight() / 2));
            actionBarPopupWindow.dimBehind(0.2f);
            return;
        }
        if (this.isEditModeEnabled) {
            return;
        }
        if (this.stickerSetCovereds != null) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.adapter.positionsToSets.get(i);
            if (stickerSetCovered != null) {
                lambda$showGiftOfferSheet$15();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                tL_inputStickerSetID.id = stickerSet2.id;
                new StickersAlert(this.parentActivity, this.parentFragment, tL_inputStickerSetID, null, null, this.resourcesProvider).show();
                return;
            }
            return;
        }
        ArrayList arrayList4 = this.importingStickersPaths;
        if (arrayList4 != null) {
            if (i < 0 || i >= arrayList4.size()) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.importingStickersPaths.get(i);
            this.selectedStickerPath = importingSticker;
            if (importingSticker.validated) {
                TextView textView = this.stickerEmojiTextView;
                textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                this.stickerImageView.setImage(ImageLocation.getForPath(this.selectedStickerPath.path), null, null, null, null, this.selectedStickerPath.animated ? "tgs" : null, 0, null);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.stickerPreviewLayout.getLayoutParams();
                layoutParams.topMargin = this.scrollOffsetY;
                this.stickerPreviewLayout.setLayoutParams(layoutParams);
                this.stickerPreviewLayout.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.stickerPreviewLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSet;
        if (tL_messages_stickerSet2 == null || i < 0 || i >= tL_messages_stickerSet2.documents.size()) {
            return;
        }
        this.selectedSticker = this.stickerSet.documents.get(i);
        int i3 = 0;
        while (true) {
            if (i3 < this.selectedSticker.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = this.selectedSticker.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        TextView textView2 = this.stickerEmojiTextView;
                        textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        break;
                    }
                    break;
                }
                i3++;
            }
            this.stickerEmojiTextView.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.currentAccount).getEmojiForSticker(this.selectedSticker.id), this.stickerEmojiTextView.getPaint().getFontMetricsInt(), false));
            break;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.stickerSet;
        if ((tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !stickerSet.emojis) && !ContentPreviewViewer.getInstance().showMenuFor(view)) {
            this.stickerImageView.getImageReceiver().setImage(ImageLocation.getForDocument(this.selectedSticker), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.selectedSticker.thumbs, 90), this.selectedSticker), (String) null, "webp", this.stickerSet, 1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.stickerPreviewLayout.getLayoutParams();
            layoutParams2.topMargin = this.scrollOffsetY;
            this.stickerPreviewLayout.setLayoutParams(layoutParams2);
            this.stickerPreviewLayout.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.stickerPreviewLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }

    public final void lambda$init$13() {
        TLRPC.StickerSet stickerSet;
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
        boolean z = tL_messages_stickerSet == null || !mediaDataController.isStickerPackInstalled(tL_messages_stickerSet.set.id);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSet;
        if (tL_messages_stickerSet2 != null && (stickerSet = tL_messages_stickerSet2.set) != null && stickerSet.creator && this.deleteItem == null) {
            this.optionsButton.addSubItem(3, R.drawable.tabs_reorder, LocaleController.getString(R.string.StickersReorder));
            this.optionsButton.addSubItem(4, R.drawable.msg_edit, LocaleController.getString(R.string.EditName));
            if (z) {
                this.deleteItem = this.optionsButton.addSubItem(5, R.drawable.msg_delete, LocaleController.getString(R.string.Delete));
            } else {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(0, 0, getContext(), this.resourcesProvider);
                actionBarPopupWindowLayout.setFitItems(true);
                ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, this.resourcesProvider).setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 4));
                ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, this.resourcesProvider);
                int themedColor = getThemedColor(Theme.key_text_RedBold);
                actionBarMenuSubItemAddItem.setTextColor(themedColor);
                actionBarMenuSubItemAddItem.setIconColor(themedColor);
                actionBarMenuSubItemAddItem.setSelectorColor(Theme.multAlpha(0.1f, themedColor));
                ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, this.resourcesProvider).setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 6));
                actionBarMenuSubItemAddItem.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 7));
                this.deleteItem = this.optionsButton.addSwipeBackItem(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindowLayout);
            }
            this.optionsButton.addColoredGap(-1);
            MessageContainsEmojiButton messageContainsEmojiButton = new MessageContainsEmojiButton(this.currentAccount, getContext(), this.resourcesProvider, new ArrayList(), 4);
            messageContainsEmojiButton.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 8));
            messageContainsEmojiButton.setTag(R.id.fit_width_tag, 1);
            ActionBarMenuItem actionBarMenuItem = this.optionsButton;
            actionBarMenuItem.createPopupLayout();
            actionBarMenuItem.popupLayout.linearLayout.addView(messageContainsEmojiButton, new LinearLayout.LayoutParams(-1, -2));
            int themedColor2 = getThemedColor(Theme.key_text_RedBold);
            ActionBarMenuSubItem actionBarMenuSubItem = this.deleteItem;
            actionBarMenuSubItem.setTextColor(themedColor2);
            actionBarMenuSubItem.setIconColor(themedColor2);
            this.deleteItem.setSelectorColor(Theme.multAlpha(0.1f, themedColor2));
            if (this.deleteItem.getRightIcon() != null) {
                this.deleteItem.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (this.optionsButton.getPopupLayout() != null) {
            this.optionsButton.getPopupLayout().requestLayout();
        }
        this.optionsButton.toggleSubMenu(null, null);
    }

    public final boolean lambda$init$9(MotionEvent motionEvent) {
        if (this.isEditModeEnabled) {
            return false;
        }
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.gridView, this.stickersOnItemClickListener, this.previewDelegate, this.resourcesProvider);
    }

    public final void lambda$loadStickerSet$7(MediaDataController mediaDataController, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.StickerSet stickerSet;
        boolean z = false;
        this.reqId = 0;
        if (tL_error != null) {
            lambda$showGiftOfferSheet$15();
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment != null) {
                UserNameResolver$$ExternalSyntheticOutline0.m(R.string.AddStickersNotFound, BulletinFactory.of(baseFragment), null);
                return;
            }
            return;
        }
        PhotoViewer.AnonymousClass75 anonymousClass75 = new PhotoViewer.AnonymousClass75(this, 2);
        anonymousClass75.addTarget(this.containerView);
        TransitionManager.beginDelayedTransition(this.container, anonymousClass75);
        this.optionsButton.setVisibility(0);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
        this.stickerSet = tL_messages_stickerSet;
        mediaDataController.putStickerSet(tL_messages_stickerSet, false);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSet;
        if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents.isEmpty()) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.stickerSet;
        if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && !stickerSet.masks) {
            z = true;
        }
        this.showEmoji = z;
        checkPremiumStickers();
        mediaDataController.preloadStickerSetThumb(this.stickerSet);
        updateSendButton();
        updateFields();
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.stickerSet);
        }
        this.adapter.notifyDataSetChanged();
    }

    public final void lambda$new$2(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
        this.reqId = 0;
        if (tL_error != null || !(tLObject instanceof Vector)) {
            AlertsCreator.processError(this.currentAccount, tL_error, this.parentFragment, tL_messages_getAttachedStickers, new Object[0]);
            lambda$showGiftOfferSheet$15();
            return;
        }
        Vector vector = (Vector) tLObject;
        if (vector.objects.isEmpty()) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        if (vector.objects.size() == 1) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            this.inputStickerSet = tL_inputStickerSetID;
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            loadStickerSet();
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.stickerSetCovereds = arrayList;
        arrayList.addAll(vector.objects);
        this.gridView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.titleTextView.setVisibility(8);
        this.shadow[0].setVisibility(8);
        this.adapter.notifyDataSetChanged();
    }

    public final void lambda$new$4(MessageObject messageObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, LinkManager$$ExternalSyntheticLambda8 linkManager$$ExternalSyntheticLambda8, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || messageObject == null) {
            linkManager$$ExternalSyntheticLambda8.run(tLObject, tL_error);
        } else {
            FileRefController.getInstance(this.currentAccount).requestReference(messageObject, tL_messages_getAttachedStickers, linkManager$$ExternalSyntheticLambda8);
        }
    }

    public final void lambda$new$5(ArrayList arrayList, Boolean bool) {
        this.importingStickersPaths = arrayList;
        if (arrayList.isEmpty()) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        this.adapter.notifyDataSetChanged();
        if (bool.booleanValue()) {
            this.uploadImportStickers = new HashMap();
            int size = this.importingStickersPaths.size();
            for (int i = 0; i < size; i++) {
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.importingStickersPaths.get(i);
                this.uploadImportStickers.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(this.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        updateFields();
    }

    public final void lambda$onSubItemClick$25() {
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, false, false);
    }

    public final void lambda$showNameEnterAlert$43() {
        new ImportingAlert(getContext(), this.lastCheckName, null, this.resourcesProvider).show();
    }

    public final void lambda$showNameEnterAlert$44(int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog.Builder builder) {
        int i = iArr[0];
        if (i == 1) {
            return;
        }
        if (i == 0) {
            iArr[0] = 1;
            TLRPC.TL_stickers_suggestShortName tL_stickers_suggestShortName = new TLRPC.TL_stickers_suggestShortName();
            String string = editTextBoldCursor.getText().toString();
            this.setTitle = string;
            tL_stickers_suggestShortName.title = string;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stickers_suggestShortName, new ChatActivity$$ExternalSyntheticLambda206(this, editTextBoldCursor, textView, textView2, iArr, 7));
            return;
        }
        if (i == 2) {
            iArr[0] = 3;
            if (!this.lastNameAvailable) {
                AndroidUtilities.shakeView(editTextBoldCursor);
                try {
                    editTextBoldCursor.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            SendMessagesHelper.getInstance(this.currentAccount).prepareImportStickers(this.setTitle, this.lastCheckName, this.importingSoftware, this.importingStickersPaths, new StickersAlert$$ExternalSyntheticLambda16(this));
            builder.alertDialog.dismissRunnable.run();
            lambda$showGiftOfferSheet$15();
        }
    }

    public final void lambda$updateFields$28(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        TLRPC.StickerSet stickerSet = this.stickerSet.set;
        if (stickerSet.masks) {
            i = 1;
        } else {
            i = stickerSet.emojis ? 5 : 0;
        }
        try {
            if (tL_error == null) {
                boolean z = this.showTooltipWhenToggle;
                BaseFragment baseFragment = this.parentFragment;
                if (z) {
                    Bulletin.make(baseFragment, new StickerSetBulletinLayout(this.pickerBottomFrameLayout.getContext(), this.stickerSet, 1, 2, null, this.resourcesProvider), 1500).show();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(this.currentAccount).processStickerSetInstallResultArchive(baseFragment, true, i, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(this.currentAccount).loadStickers(i, false, true);
    }

    public final void lambda$updateFields$30() {
        lambda$showGiftOfferSheet$15();
        StickersAlertInstallDelegate stickersAlertInstallDelegate = this.installDelegate;
        if (stickersAlertInstallDelegate != null) {
            stickersAlertInstallDelegate.onStickerSetInstalled();
        }
        if (this.inputStickerSet == null || MediaDataController.getInstance(this.currentAccount).cancelRemovingStickerSet(this.inputStickerSet.id)) {
            return;
        }
        TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
        tL_messages_installStickerSet.stickerset = this.inputStickerSet;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_installStickerSet, new LinkManager$$ExternalSyntheticLambda3(this, 3));
    }

    public final void lambda$updateFields$32() {
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, true, this.showTooltipWhenToggle);
    }

    public final void lambda$updateFields$33() {
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 0, this.parentFragment, true, this.showTooltipWhenToggle);
    }

    public final void loadStickerSet() {
        String str;
        if (this.inputStickerSet != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (this.stickerSet == null && (str = this.inputStickerSet.short_name) != null) {
                this.stickerSet = mediaDataController.getStickerSetByName(str);
            }
            if (this.stickerSet == null) {
                this.stickerSet = mediaDataController.getStickerSetById(this.inputStickerSet.id);
            }
            if (this.stickerSet == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.inputStickerSet;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new LinkManager$$ExternalSyntheticLambda8(8, this, mediaDataController));
            } else {
                if (this.adapter != null) {
                    updateSendButton();
                    updateFields();
                    this.adapter.notifyDataSetChanged();
                }
                if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                    MessageObject.isPremiumEmojiPack(this.stickerSet);
                }
                mediaDataController.preloadStickerSetThumb(this.stickerSet);
                checkPremiumStickers();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
        if (tL_messages_stickerSet != null) {
            this.showEmoji = !tL_messages_stickerSet.set.masks;
        }
        checkPremiumStickers();
    }

    @Override
    public final void lambda$openCrafting$8() {
        if (ContentPreviewViewer.getInstance().isVisible) {
            ContentPreviewViewer.getInstance().closeWithMenu();
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Bulletin.addDelegate((FrameLayout) this.containerView, new ChatActivity.AnonymousClass103(this, 8));
    }

    @Override
    public final void onStop() {
        super.onStop();
        Bulletin.removeDelegate((FrameLayout) this.containerView);
    }

    public final void onSubItemClick$2(int i) {
        String str;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
        if (tL_messages_stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/addstickers/" + this.stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/addemoji/" + this.stickerSet.set.short_name;
        }
        String str2 = str;
        if (i == 1) {
            BaseFragment baseFragment = this.parentFragment;
            Context context = this.parentActivity;
            if (context == null && baseFragment != null) {
                context = baseFragment.getParentActivity();
            }
            if (context == null) {
                context = getContext();
            }
            AnonymousClass13 anonymousClass13 = new AnonymousClass13(context, str2, str2, this.resourcesProvider);
            if (baseFragment == null) {
                anonymousClass13.show();
                return;
            }
            baseFragment.showDialog(anonymousClass13);
            if (baseFragment instanceof ChatActivity) {
                anonymousClass13.setCalcMandatoryInsets(((ChatActivity) baseFragment).isKeyboardVisible());
                return;
            }
            return;
        }
        if (i == 2) {
            try {
                AndroidUtilities.addToClipboard(str2);
                new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider).createCopyLinkBulletin(false).show();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i == 3) {
            if (this.isEditModeEnabled) {
                disableEditMode();
                return;
            } else {
                enableEditMode();
                return;
            }
        }
        if (i == 4) {
            StickersDialogs.showNameEditorDialog(this.stickerSet.set, this.resourcesProvider, getContext(), new GiftSheet$$ExternalSyntheticLambda8(this, 9));
        } else if (i == 5) {
            StickersDialogs.showDeleteForEveryOneDialog(this.stickerSet.set, this.resourcesProvider, getContext(), new StickersAlert$$ExternalSyntheticLambda30(this, 1));
        }
    }

    public final void removeSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        int iIndexOf = this.importingStickersPaths.indexOf(importingSticker);
        if (iIndexOf >= 0) {
            this.importingStickersPaths.remove(iIndexOf);
            GridAdapter gridAdapter = this.adapter;
            ArrayList arrayList = StickersAlert.this.importingStickersPaths;
            if (arrayList != null) {
                gridAdapter.totalItems = arrayList.size();
            }
            gridAdapter.mObservable.notifyItemRangeRemoved(iIndexOf, 1);
            if (this.importingStickersPaths.isEmpty()) {
                lambda$showGiftOfferSheet$15();
            } else {
                updateFields();
            }
        }
    }

    public final void runShadowAnimation$2(int i, boolean z) {
        int i2 = 1;
        if (this.stickerSetCovereds != null) {
            return;
        }
        View[] viewArr = this.shadow;
        if ((!z || viewArr[i].getTag() == null) && (z || viewArr[i].getTag() != null)) {
            return;
        }
        viewArr[i].setTag(z ? null : 1);
        if (z) {
            viewArr[i].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.shadowAnimation;
        AnimatorSet animatorSet = animatorSetArr[i];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[i], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        animatorSetArr[i].setDuration(150L);
        animatorSetArr[i].addListener(new MediaActivity.AnonymousClass7(this, i, z, i2));
        animatorSetArr[i].start();
    }

    public final void setButton(View.OnClickListener onClickListener, String str, int i, int i2, int i3) {
        if (i >= 0) {
            AnimatedTextView animatedTextView = this.pickerBottomLayout;
            this.buttonTextColorKey = i;
            animatedTextView.setTextColor(getThemedColor(i));
        }
        this.pickerBottomLayout.setText(str, false, true);
        this.pickerBottomLayout.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.pickerBottomLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.shadow[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.gridView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams();
        if (onClickListener == null) {
            this.pickerBottomLayout.setAlpha(0.0f);
        } else if (i2 < 0 || i3 < 0) {
            this.pickerBottomLayout.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(Theme.key_dialogBackground), Theme.multAlpha(0.1f, getThemedColor(Theme.key_text_RedBold))));
            this.pickerBottomFrameLayout.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int iDp = AndroidUtilities.dp(48.0f);
            marginLayoutParams2.bottomMargin = iDp;
            marginLayoutParams3.bottomMargin = iDp;
            marginLayoutParams4.bottomMargin = iDp;
            if (this.pickerBottomLayout.getAlpha() < 1.0f) {
                OKLCH.m(this.pickerBottomLayout.animate().alpha(1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 240L);
            }
        } else {
            AnimatedTextView animatedTextView2 = this.pickerBottomLayout;
            int iDp2 = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i2);
            int themedColor2 = getThemedColor(i3);
            animatedTextView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, themedColor, themedColor2, themedColor2));
            this.pickerBottomFrameLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
            int iDp3 = AndroidUtilities.dp(8.0f);
            marginLayoutParams.bottomMargin = iDp3;
            marginLayoutParams.rightMargin = iDp3;
            marginLayoutParams.topMargin = iDp3;
            marginLayoutParams.leftMargin = iDp3;
            int iDp4 = AndroidUtilities.dp(64.0f);
            marginLayoutParams2.bottomMargin = iDp4;
            marginLayoutParams3.bottomMargin = iDp4;
            marginLayoutParams4.bottomMargin = iDp4;
            if (this.pickerBottomLayout.getAlpha() < 1.0f) {
                OKLCH.m(this.pickerBottomLayout.animate().alpha(1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 240L);
            }
        }
        this.containerView.requestLayout();
    }

    @Override
    public final void setOnDismissListener(Runnable runnable) {
        this.onDismissListener = runnable;
    }

    public final void setScrollOffsetY$1(int i) {
        this.scrollOffsetY = i;
        if (this.stickerSetCovereds == null) {
            float f = i;
            this.titleTextView.setTranslationY(f);
            if (this.importingStickers == null) {
                this.optionsButton.setTranslationY(f);
            }
            this.shadow[0].setTranslationY(f);
        }
        this.containerView.invalidate();
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public final void updateColors(boolean z) {
        GridAdapter gridAdapter = this.adapter;
        StickersAlert stickersAlert = StickersAlert.this;
        if (stickersAlert.stickerSetCovereds != null) {
            int childCount = stickersAlert.gridView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = StickersAlert.this.gridView.getChildAt(i);
                if (childAt instanceof FeaturedStickerSetInfoCell) {
                    ((FeaturedStickerSetInfoCell) childAt).updateColors();
                }
            }
        }
        this.titleTextView.setHighlightColor(getThemedColor(Theme.key_dialogLinkSelection));
        this.stickerPreviewLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground) & (-536870913));
        this.optionsButton.setIconColor(getThemedColor(Theme.key_sheet_other));
        this.optionsButton.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false);
        this.optionsButton.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), true);
        this.optionsButton.setPopupItemsSelectorColor(getThemedColor(Theme.key_dialogButtonSelector));
        this.optionsButton.redrawPopup(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        if (this.deleteItem != null) {
            int themedColor = getThemedColor(Theme.key_text_RedBold);
            ActionBarMenuSubItem actionBarMenuSubItem = this.deleteItem;
            actionBarMenuSubItem.setTextColor(themedColor);
            actionBarMenuSubItem.setIconColor(themedColor);
            this.deleteItem.setSelectorColor(Theme.multAlpha(0.1f, themedColor));
            if (this.deleteItem.getRightIcon() != null) {
                this.deleteItem.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z) {
            if (Theme.animatingColors != null && this.animatingDescriptions == null) {
                ArrayList themeDescriptions = getThemeDescriptions();
                this.animatingDescriptions = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ThemeDescription themeDescription = (ThemeDescription) this.animatingDescriptions.get(i2);
                    ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = themeDescription.delegate;
                    themeDescription.delegate = null;
                }
            }
            int size2 = this.animatingDescriptions.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ThemeDescription themeDescription2 = (ThemeDescription) this.animatingDescriptions.get(i3);
                themeDescription2.setColor(getThemedColor(themeDescription2.currentKey), false, false);
            }
        }
        if (Theme.animatingColors == null && this.animatingDescriptions != null) {
            this.animatingDescriptions = null;
        }
    }

    public final void updateFields() {
        ArrayList<TLRPC.Document> arrayList;
        boolean z;
        TLRPC.StickerSet stickerSet;
        String pluralString;
        String pluralString2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        int i;
        int i2;
        TLRPC.StickerSet stickerSet6;
        boolean z2;
        TLRPC.StickerSet stickerSet7;
        int i3 = 5;
        int i4 = 0;
        if (this.titleTextView == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
        if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
            ArrayList arrayList3 = this.importingStickers;
            if (arrayList3 == null) {
                setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 14), LocaleController.getString(R.string.Close), Theme.key_dialogTextBlue2, -1, -1);
                return;
            }
            LinkSpanDrawable.LinksTextView linksTextView = this.titleTextView;
            ArrayList arrayList4 = this.importingStickersPaths;
            linksTextView.setText(LocaleController.formatPluralString("Stickers", arrayList4 != null ? arrayList4.size() : arrayList3.size(), new Object[0]));
            HashMap map = this.uploadImportStickers;
            if (map != null && !map.isEmpty()) {
                setButton(null, LocaleController.getString(R.string.ImportStickersProcessing), Theme.key_dialogTextGray2, -1, -1);
                this.pickerBottomLayout.setEnabled(false);
                return;
            }
            StickersAlert$$ExternalSyntheticLambda0 stickersAlert$$ExternalSyntheticLambda0 = new StickersAlert$$ExternalSyntheticLambda0(this, 13);
            int i5 = R.string.ImportStickers;
            ArrayList arrayList5 = this.importingStickersPaths;
            setButton(stickersAlert$$ExternalSyntheticLambda0, LocaleController.formatString("ImportStickers", i5, LocaleController.formatPluralString("Stickers", arrayList5 != null ? arrayList5.size() : arrayList3.size(), new Object[0])), Theme.key_dialogTextBlue2, -1, -1);
            this.pickerBottomLayout.setEnabled(true);
            return;
        }
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(this.stickerSet.set.title, this.titleTextView.getPaint().getFontMetricsInt(), false);
        try {
            if (this.urlPattern == null) {
                this.urlPattern = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
            }
            Matcher matcher = this.urlPattern.matcher(charSequenceReplaceEmoji);
            SpannableStringBuilder spannableStringBuilder = null;
            while (matcher.find()) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(charSequenceReplaceEmoji);
                }
                int iStart = matcher.start();
                int iEnd = matcher.end();
                if (this.stickerSet.set.title.charAt(iStart) != '@') {
                    iStart++;
                }
                spannableStringBuilder.setSpan(new StickersActivity.AnonymousClass4(charSequenceReplaceEmoji.subSequence(iStart + 1, iEnd).toString(), 2, this), iStart, iEnd, 0);
            }
            if (spannableStringBuilder != null) {
                charSequenceReplaceEmoji = spannableStringBuilder;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.titleTextView.setText(charSequenceReplaceEmoji);
        if (isEmoji()) {
            int measuredWidth = this.gridView.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.adapter.stickersPerRow = Math.max(1, measuredWidth / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f));
        } else {
            this.adapter.stickersPerRow = 5;
        }
        this.layoutManager.setSpanCount(this.adapter.stickersPerRow);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSet;
        if (tL_messages_stickerSet2 == null || (stickerSet7 = tL_messages_stickerSet2.set) == null || !stickerSet7.emojis || UserConfig.getInstance(this.currentAccount).isPremium() || this.customButtonDelegate != null) {
            this.premiumButtonView.setVisibility(4);
        } else if (this.stickerSet.documents != null) {
            for (int i6 = 0; i6 < this.stickerSet.documents.size(); i6++) {
                if (!MessageObject.isFreeEmoji(this.stickerSet.documents.get(i6))) {
                    this.premiumButtonView.setVisibility(0);
                    this.pickerBottomLayout.setBackground(null);
                    setButton(null, null, -1, -1, -1);
                    this.premiumButtonView.setButton(LocaleController.getString(R.string.UnlockPremiumEmoji), new StickersAlert$$ExternalSyntheticLambda0(this, i4), false);
                    return;
                }
            }
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.stickerSet;
        if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
            z = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !mediaDataController.isStickerPackInstalled(stickerSet.id);
        } else {
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
            int i7 = 0;
            while (true) {
                if (stickerSets == null || i7 >= stickerSets.size()) {
                    z2 = false;
                    break;
                }
                if (stickerSets.get(i7) != null && stickerSets.get(i7).set != null && stickerSets.get(i7).set.id == this.stickerSet.set.id) {
                    z2 = true;
                    break;
                }
                i7++;
            }
            z = !z2;
        }
        GroupStickersActivity.AnonymousClass4 anonymousClass4 = this.customButtonDelegate;
        if (anonymousClass4 != null) {
            StickersAlert$$ExternalSyntheticLambda0 stickersAlert$$ExternalSyntheticLambda1 = new StickersAlert$$ExternalSyntheticLambda0(this, i3);
            boolean z3 = GroupStickersActivity.this.isEmoji;
            boolean z4 = anonymousClass4.val$isSelected;
            String string = z3 ? LocaleController.getString(z4 ? R.string.RemoveGroupEmojiPackSet : R.string.SetAsGroupEmojiPackSet) : LocaleController.getString(z4 ? R.string.RemoveGroupStickerSet : R.string.SetAsGroupStickerSet);
            boolean z5 = this.customButtonDelegate.val$isSelected;
            int i8 = z5 ? Theme.key_text_RedBold : Theme.key_featuredStickers_buttonText;
            int i9 = !z5 ? Theme.key_featuredStickers_addButton : -1;
            if (z5) {
                i = i9;
                i2 = -1;
            } else {
                int i10 = i9;
                i2 = Theme.key_featuredStickers_addButtonPressed;
                i = i10;
            }
            setButton(stickersAlert$$ExternalSyntheticLambda1, string, i8, i, i2);
            return;
        }
        if (z) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.stickerSet;
            i3 = (tL_messages_stickerSet4 == null || (stickerSet5 = tL_messages_stickerSet4.set) == null || !stickerSet5.emojis) ? (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) ? 0 : 1 : 5;
            if (!mediaDataController.areStickersLoaded(i3)) {
                mediaDataController.checkStickers(i3);
                setButton(null, "", -1, -1, -1);
                return;
            }
        }
        if (z) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.stickerSet;
            if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                ArrayList<TLRPC.Document> arrayList6 = tL_messages_stickerSet5.documents;
                pluralString2 = LocaleController.formatPluralString("AddManyMasksCount", arrayList6 == null ? 0 : arrayList6.size(), new Object[0]);
            } else if (tL_messages_stickerSet5 == null || (stickerSet2 = tL_messages_stickerSet5.set) == null || !stickerSet2.emojis) {
                pluralString2 = LocaleController.formatPluralString("AddManyStickersCount", (tL_messages_stickerSet5 == null || (arrayList2 = tL_messages_stickerSet5.documents) == null) ? 0 : arrayList2.size(), new Object[0]);
            } else {
                ArrayList<TLRPC.Document> arrayList7 = tL_messages_stickerSet5.documents;
                pluralString2 = LocaleController.formatPluralString("AddManyEmojiCount", arrayList7 == null ? 0 : arrayList7.size(), new Object[0]);
            }
            setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 9), pluralString2, Theme.key_featuredStickers_buttonText, Theme.key_featuredStickers_addButton, Theme.key_featuredStickers_addButtonPressed);
        } else {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.stickerSet;
            TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
            boolean z6 = stickerSet8.creator;
            if (z6) {
                pluralString = LocaleController.getString(this.isEditModeEnabled ? R.string.Done : R.string.EditStickers);
            } else if (stickerSet8.masks) {
                pluralString = LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
            } else {
                pluralString = stickerSet8.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
            }
            if (z6) {
                setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 10), pluralString, Theme.key_featuredStickers_buttonText, Theme.key_featuredStickers_addButton, Theme.key_featuredStickers_addButtonPressed);
            } else {
                String str = pluralString;
                if (this.stickerSet.set.official) {
                    setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 11), str, Theme.key_text_RedBold, -1, -1);
                } else {
                    setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 12), str, Theme.key_text_RedBold, -1, -1);
                }
            }
        }
        this.adapter.notifyDataSetChanged();
    }

    public final void updateSendButton() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = AndroidUtilities.displaySize;
        int iMin = (int) ((Math.min(point.x, point.y) / 2) / AndroidUtilities.density);
        if (this.importingStickers != null) {
            this.previewSendButton.setText(LocaleController.getString(R.string.ImportStickersRemove));
            this.previewSendButton.setTextColor(getThemedColor(Theme.key_text_RedBold));
            float f = iMin;
            this.stickerImageView.setLayoutParams(LayoutHelper.createFrame(iMin, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.stickerEmojiTextView.setLayoutParams(LayoutHelper.createFrame(iMin, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.previewSendButton.setVisibility(0);
            this.previewSendButtonShadow.setVisibility(0);
            return;
        }
        if (this.delegate == null || ((tL_messages_stickerSet = this.stickerSet) != null && tL_messages_stickerSet.set.masks)) {
            this.previewSendButton.setText(LocaleController.getString(R.string.Close));
            this.stickerImageView.setLayoutParams(LayoutHelper.createFrame(iMin, iMin, 17));
            this.stickerEmojiTextView.setLayoutParams(LayoutHelper.createFrame(iMin, iMin, 17));
            this.previewSendButton.setVisibility(8);
            this.previewSendButtonShadow.setVisibility(8);
            return;
        }
        this.previewSendButton.setText(LocaleController.getString(R.string.SendSticker));
        float f2 = iMin;
        this.stickerImageView.setLayoutParams(LayoutHelper.createFrame(iMin, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.stickerEmojiTextView.setLayoutParams(LayoutHelper.createFrame(iMin, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.previewSendButton.setVisibility(0);
        this.previewSendButtonShadow.setVisibility(0);
    }

    public final void updateStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.stickerSet = tL_messages_stickerSet;
        if (this.adapter != null) {
            updateSendButton();
            updateFields();
            this.adapter.notifyDataSetChanged();
        }
        if (this.containerView != null && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            MessageObject.isPremiumEmojiPack(this.stickerSet);
        }
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.stickerSet);
        checkPremiumStickers();
    }

    public StickersAlert(Context context, BaseFragment baseFragment, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, StickersAlertDelegate stickersAlertDelegate, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, false, false);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.stickersShaker = new GmsRpc(12);
        this.previewDelegate = new AnonymousClass1();
        fixNavigationBar();
        this.delegate = stickersAlertDelegate;
        this.inputStickerSet = inputStickerSet;
        this.stickerSet = tL_messages_stickerSet;
        this.parentFragment = baseFragment;
        loadStickerSet();
        init$1(context);
    }

    public StickersAlert(LaunchActivity launchActivity, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(launchActivity, null, false, false);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.stickersShaker = new GmsRpc(12);
        this.previewDelegate = new AnonymousClass1();
        fixNavigationBar();
        this.parentActivity = launchActivity;
        this.importingStickers = arrayList;
        this.importingSoftware = str;
        Utilities.globalQueue.postRunnable(new IntroActivity$$ExternalSyntheticLambda5(this, arrayList, arrayList2, 8));
        init$1(launchActivity);
    }
}
