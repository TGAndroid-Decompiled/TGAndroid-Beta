package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionValues;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.io.FileOutputStream;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
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
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda24;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.StoryEntry;

public class StickersAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static final boolean DISABLE_STICKER_EDITOR = false;
    public static final int STICKERS_MAX_COUNT = 120;
    private GridAdapter adapter;
    private List<ThemeDescription> animatingDescriptions;
    private int buttonTextColorKey;
    private int checkReqId;
    private Runnable checkRunnable;
    private boolean clearsInputField;
    private StickersAlertCustomButtonDelegate customButtonDelegate;
    private StickersAlertDelegate delegate;
    private ActionBarMenuSubItem deleteItem;
    private TextView descriptionTextView;
    private ItemTouchHelper dragAndDropHelper;
    private TLRPC.Document draggedDocument;
    private FrameLayout emptyView;
    private RecyclerListView gridView;
    private boolean ignoreLayout;
    private boolean ignoreMasterDismiss;
    private String importingSoftware;
    private ArrayList<Parcelable> importingStickers;
    private ArrayList<SendMessagesHelper.ImportingSticker> importingStickersPaths;
    private TLRPC.InputStickerSet inputStickerSet;
    private StickersAlertInstallDelegate installDelegate;
    private boolean isEditModeEnabled;
    private int itemHeight;
    private int itemSize;
    private String lastCheckName;
    private boolean lastNameAvailable;
    private GridLayoutManager layoutManager;
    private Runnable masterDismissListener;
    private Runnable onDismissListener;
    private ActionBarMenuItem optionsButton;
    private Activity parentActivity;
    private BaseFragment parentFragment;
    private FrameLayout pickerBottomFrameLayout;
    private AnimatedTextView pickerBottomLayout;
    private PremiumButtonView premiumButtonView;
    private ContentPreviewViewer.ContentPreviewViewerDelegate previewDelegate;
    private TextView previewSendButton;
    private View previewSendButtonShadow;
    public boolean probablyEmojis;
    private int reqId;
    private int scrollOffsetY;
    private TLRPC.Document selectedSticker;
    private SendMessagesHelper.ImportingSticker selectedStickerPath;
    private String setTitle;
    private View[] shadow;
    private AnimatorSet[] shadowAnimation;
    private boolean showEmoji;
    private boolean showTooltipWhenToggle;
    private TextView stickerEmojiTextView;
    private BackupImageView stickerImageView;
    private FrameLayout stickerPreviewLayout;
    public TLRPC.TL_messages_stickerSet stickerSet;
    private ArrayList<TLRPC.StickerSetCovered> stickerSetCovereds;
    private RecyclerListView.OnItemClickListener stickersOnItemClickListener;
    private final StickersShaker stickersShaker;
    private LinkSpanDrawable.LinksTextView titleTextView;
    private HashMap<String, SendMessagesHelper.ImportingSticker> uploadImportStickers;
    private Pattern urlPattern;
    private boolean wasLightStatusBar;

    public class AnonymousClass1 implements ContentPreviewViewer.ContentPreviewViewerDelegate {
        public AnonymousClass1() {
        }

        public void lambda$deleteSticker$0(TLObject tLObject, boolean z, AlertDialog alertDialog) {
            if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
                if (z) {
                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tLObject, 0, null, false, false);
                } else {
                    StickersAlert stickersAlert = StickersAlert.this;
                    stickersAlert.stickerSet = tL_messages_stickerSet;
                    stickersAlert.loadStickerSet(false);
                    StickersAlert.this.updateFields();
                }
            }
            alertDialog.dismiss();
        }

        public void lambda$deleteSticker$1(boolean z, AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new JoinGroupAlert$$ExternalSyntheticLambda3(this, tLObject, z, alertDialog, 1));
        }

        @Override
        public final void addCaptionToGif(Object obj, Object obj2, boolean z, int i, int i2) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addCaptionToGif(this, obj, obj2, z, i, i2);
        }

        @Override
        public final void addToFavoriteSelected(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addToFavoriteSelected(this, str);
        }

        @Override
        public boolean can() {
            TLRPC.StickerSet stickerSet;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = StickersAlert.this.stickerSet;
            return tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis;
        }

        @Override
        public final boolean canAddCaption(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canAddCaption(this, document);
        }

        @Override
        public boolean canDeleteSticker(TLRPC.Document document) {
            return true;
        }

        @Override
        public boolean canEditSticker() {
            return true;
        }

        @Override
        public boolean canSchedule() {
            return StickersAlert.this.delegate != null && StickersAlert.this.delegate.canSchedule();
        }

        @Override
        public final boolean canSendSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSendSticker(this);
        }

        @Override
        public final Boolean canSetAsStatus(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, document);
        }

        @Override
        public final void copyEmoji(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, document);
        }

        @Override
        public void deleteSticker(TLRPC.Document document) {
            StickersAlert.this.stickerSet.documents.remove(document);
            final boolean zIsEmpty = StickersAlert.this.stickerSet.documents.isEmpty();
            if (zIsEmpty) {
                StickersAlert.this.lambda$showGiftOfferSheet$15();
            }
            StickersAlert.this.adapter.notifyDataSetChanged();
            final AlertDialog alertDialog = new AlertDialog(StickersAlert.this.getContext(), 3, ((BottomSheet) StickersAlert.this).resourcesProvider);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 350L);
            TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
            tL_stickers_removeStickerFromSet.sticker = MediaDataController.getInputStickerSetItem(document, "").document;
            ConnectionsManager.getInstance(((BottomSheet) StickersAlert.this).currentAccount).sendRequest(tL_stickers_removeStickerFromSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$deleteSticker$1(zIsEmpty, alertDialog, tLObject, tL_error);
                }
            });
        }

        @Override
        public void editSticker(TLRPC.Document document) {
            StickersAlert.editSticker(StickersAlert.this.parentFragment, StickersAlert.this.stickerSet, document);
        }

        @Override
        public final ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getCustomItemOptions(this, viewGroup, view);
        }

        @Override
        public long getDialogId() {
            if (StickersAlert.this.parentFragment instanceof ChatActivity) {
                return ((ChatActivity) StickersAlert.this.parentFragment).getDialogId();
            }
            return 0L;
        }

        @Override
        public final TLRPC.TL_messageMediaPoll getPoll() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPoll(this);
        }

        @Override
        public final TLRPC.PollAnswer getPollAnswer() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollAnswer(this);
        }

        @Override
        public final MessageObject getPollMessageObject() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollMessageObject(this);
        }

        @Override
        public final String getQuery(boolean z) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
        }

        @Override
        public final void gifAddedOrDeleted() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
        }

        @Override
        public boolean isInScheduleMode() {
            return StickersAlert.this.delegate != null && StickersAlert.this.delegate.isInScheduleMode();
        }

        @Override
        public final boolean isPhotoEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isPhotoEditor(this);
        }

        @Override
        public final boolean isReplacedSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isReplacedSticker(this);
        }

        @Override
        public final boolean isSettingIntroSticker() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isSettingIntroSticker(this);
        }

        @Override
        public final boolean isStickerEditor() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isStickerEditor(this);
        }

        @Override
        public final boolean needCopy(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, document);
        }

        @Override
        public final boolean needMenu() {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
        }

        @Override
        public boolean needOpen() {
            return false;
        }

        @Override
        public boolean needRemove() {
            return StickersAlert.this.importingStickers != null;
        }

        @Override
        public final boolean needRemoveFromRecent(TLRPC.Document document) {
            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, document);
        }

        @Override
        public boolean needSend(int i) {
            return StickersAlert.this.delegate != null;
        }

        @Override
        public final void newStickerPackSelected(CharSequence charSequence, String str, Utilities.Callback callback) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$newStickerPackSelected(this, charSequence, str, callback);
        }

        @Override
        public void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        }

        @Override
        public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
            StickersAlert.this.removeSticker(importingSticker);
        }

        @Override
        public final void removeFromRecent(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, document);
        }

        @Override
        public final void resetTouch() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
        }

        @Override
        public final void retractVote() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$retractVote(this);
        }

        @Override
        public final void sendEmoji(TLRPC.Document document) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, document);
        }

        @Override
        public final void sendGif(Object obj, Object obj2, boolean z, int i, int i2) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj, obj2, z, i, i2);
        }

        @Override
        public final void sendIntroSticker() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendIntroSticker(this);
        }

        @Override
        public final void sendSticker(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, str);
        }

        @Override
        public final void sendVote() {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendVote(this);
        }

        @Override
        public final void setAsEmojiStatus(TLRPC.Document document, Integer num) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, document, num);
        }

        @Override
        public final void setIntroSticker(String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setIntroSticker(this, str);
        }

        @Override
        public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$stickerSetSelected(this, stickerSet, str);
        }

        @Override
        public void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
            if (StickersAlert.this.delegate == null) {
                return;
            }
            StickersAlert.this.delegate.lambda$onStickerSelected$97(document, str, obj, null, StickersAlert.this.clearsInputField, z, i, 0);
            StickersAlert.this.lambda$showGiftOfferSheet$15();
        }
    }

    public class AnonymousClass13 extends ShareAlert {
        public AnonymousClass13(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider) {
            super(context, arrayList, str, z, str2, z2, resourcesProvider);
        }

        public void lambda$onSend$0(LongSparseArray longSparseArray, int i) {
            UndoView undoView;
            if (StickersAlert.this.parentFragment instanceof ChatActivity) {
                undoView = ((ChatActivity) StickersAlert.this.parentFragment).getUndoView();
            } else {
                undoView = StickersAlert.this.parentFragment instanceof ProfileActivity ? ((ProfileActivity) StickersAlert.this.parentFragment).getUndoView() : null;
            }
            UndoView undoView2 = undoView;
            if (undoView2 != null) {
                if (longSparseArray.size() == 1) {
                    undoView2.showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 53, Integer.valueOf(i));
                } else {
                    undoView2.showWithAction(0L, 53, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                }
            }
        }

        @Override
        public void dismissInternal() {
            super.dismissInternal();
            if (StickersAlert.this.parentFragment instanceof ChatActivity) {
                AndroidUtilities.requestAdjustResize(StickersAlert.this.parentFragment.getParentActivity(), StickersAlert.this.parentFragment.getClassGuid());
                if (((ChatActivity) StickersAlert.this.parentFragment).getChatActivityEnterView().getVisibility() == 0) {
                    StickersAlert.this.parentFragment.getFragmentView().requestLayout();
                }
            }
        }

        @Override
        public void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            if (z) {
                AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda9(this, longSparseArray, i, 11), 100L);
            }
        }

        @Override
        public void setLastVisible(boolean z) {
        }
    }

    public class AnonymousClass4 extends Transition {
        public AnonymousClass4() {
        }

        public void lambda$createAnimator$0(int i, int i2, ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            StickersAlert.this.gridView.setAlpha(animatedFraction);
            StickersAlert.this.titleTextView.setAlpha(animatedFraction);
            if (i != 0) {
                int i3 = (int) ((1.0f - animatedFraction) * i);
                StickersAlert.this.setScrollOffsetY(i2 + i3);
                StickersAlert.this.gridView.setTranslationY(i3);
            }
        }

        @Override
        public void captureEndValues(TransitionValues transitionValues) {
            transitionValues.values.put("start", Boolean.FALSE);
            transitionValues.values.put("offset", Integer.valueOf(StickersAlert.this.scrollOffsetY + ((BottomSheet) StickersAlert.this).containerView.getTop()));
        }

        @Override
        public void captureStartValues(TransitionValues transitionValues) {
            transitionValues.values.put("start", Boolean.TRUE);
            transitionValues.values.put("offset", Integer.valueOf(StickersAlert.this.scrollOffsetY + ((BottomSheet) StickersAlert.this).containerView.getTop()));
        }

        @Override
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            int i = StickersAlert.this.scrollOffsetY;
            int iIntValue = ((Integer) transitionValues.values.get("offset")).intValue() - ((Integer) transitionValues2.values.get("offset")).intValue();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.addUpdateListener(new StickersAlert$4$$ExternalSyntheticLambda0(this, iIntValue, i, 0));
            return valueAnimatorOfFloat;
        }
    }

    public static class AddStickerBtnView extends FrameLayout {
        public AddStickerBtnView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            View view = new View(context);
            int iDp = AndroidUtilities.dp(28.0f);
            int i = Theme.key_chat_emojiPanelIcon;
            ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(iDp, Theme.multAlpha(0.12f, Theme.getColor(i, resourcesProvider)));
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(shapeDrawableCreateRoundRectDrawable, drawableMutate);
            combinedDrawable.setCustomSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
            view.setBackground(combinedDrawable);
            ScaleStateListAnimator.apply(view);
            addView(view, LayoutHelper.createFrame(56, 56, 17));
        }
    }

    public class GridAdapter extends RecyclerListView.SelectionAdapter {
        public static final int TYPE_ADD_STICKER = 3;
        private Context context;
        private int stickersPerRow;
        private int stickersRowCount;
        private int totalItems;
        private SparseArray<Object> cache = new SparseArray<>();
        private SparseArray<TLRPC.StickerSetCovered> positionsToSets = new SparseArray<>();

        public GridAdapter(Context context) {
            this.context = context;
        }

        public void lambda$onBindViewHolder$0(StickerEmojiCell stickerEmojiCell, View view) {
            ContentPreviewViewer.getInstance().setDelegate(StickersAlert.this.previewDelegate);
            ContentPreviewViewer.getInstance().showMenuFor(stickerEmojiCell);
        }

        @Override
        public int getItemCount() {
            return this.totalItems;
        }

        @Override
        public int getItemViewType(int i) {
            if (StickersAlert.this.stickerSetCovereds == null) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = StickersAlert.this.stickerSet;
                return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i) ? 0 : 3;
            }
            Object obj = this.cache.get(i);
            if (obj != null) {
                return obj instanceof TLRPC.Document ? 0 : 2;
            }
            return 1;
        }

        public void getThemeDescriptions(List<ThemeDescription> list, ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate) {
            if (StickersAlert.this.stickerSetCovereds != null) {
                FeaturedStickerSetInfoCell.createThemeDescriptions(list, StickersAlert.this.gridView, themeDescriptionDelegate);
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void notifyDataSetChanged() {
            int iCeil;
            int i;
            if (StickersAlert.this.stickerSetCovereds != null) {
                int measuredWidth = StickersAlert.this.gridView.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.stickersPerRow = measuredWidth / AndroidUtilities.dp(72.0f);
                StickersAlert.this.layoutManager.setSpanCount(this.stickersPerRow);
                this.cache.clear();
                this.positionsToSets.clear();
                this.totalItems = 0;
                this.stickersRowCount = 0;
                for (int i2 = 0; i2 < StickersAlert.this.stickerSetCovereds.size(); i2++) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) StickersAlert.this.stickerSetCovereds.get(i2);
                    List listSubList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                    if (listSubList != null) {
                        listSubList = listSubList.subList(0, Math.min(listSubList.size(), this.stickersPerRow));
                    }
                    if (listSubList != null && (!listSubList.isEmpty() || stickerSetCovered.cover != null)) {
                        this.stickersRowCount++;
                        this.positionsToSets.put(this.totalItems, stickerSetCovered);
                        SparseArray<Object> sparseArray = this.cache;
                        int i3 = this.totalItems;
                        this.totalItems = i3 + 1;
                        sparseArray.put(i3, Integer.valueOf(i2));
                        int i4 = this.totalItems / this.stickersPerRow;
                        if (listSubList.isEmpty()) {
                            this.cache.put(this.totalItems, stickerSetCovered.cover);
                            iCeil = 1;
                        } else {
                            iCeil = (int) Math.ceil(listSubList.size() / this.stickersPerRow);
                            for (int i5 = 0; i5 < listSubList.size(); i5++) {
                                this.cache.put(this.totalItems + i5, listSubList.get(i5));
                            }
                        }
                        int i6 = 0;
                        while (true) {
                            i = this.stickersPerRow * iCeil;
                            if (i6 >= i) {
                                break;
                            }
                            this.positionsToSets.put(this.totalItems + i6, stickerSetCovered);
                            i6++;
                        }
                        this.totalItems = i + this.totalItems;
                    }
                }
            } else if (StickersAlert.this.importingStickersPaths != null) {
                this.totalItems = StickersAlert.this.importingStickersPaths.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = StickersAlert.this.stickerSet;
                this.totalItems = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = StickersAlert.this.stickerSet;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = StickersAlert.this.stickerSet.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.totalItems++;
                    }
                }
            }
            super.notifyDataSetChanged();
        }

        @Override
        public void notifyItemRemoved(int i) {
            if (StickersAlert.this.importingStickersPaths != null) {
                this.totalItems = StickersAlert.this.importingStickersPaths.size();
            }
            super.notifyItemRemoved(i);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (StickersAlert.this.stickerSetCovereds != null) {
                int itemViewType = viewHolder.getItemViewType();
                if (itemViewType == 0) {
                    ((StickerEmojiCell) viewHolder.itemView).setSticker((TLRPC.Document) this.cache.get(i), this.positionsToSets.get(i), false);
                    return;
                } else if (itemViewType == 1) {
                    ((EmptyCell) viewHolder.itemView).setHeight(AndroidUtilities.dp(82.0f));
                    return;
                } else {
                    if (itemViewType != 2) {
                        return;
                    }
                    ((FeaturedStickerSetInfoCell) viewHolder.itemView).setStickerSet((TLRPC.StickerSetCovered) StickersAlert.this.stickerSetCovereds.get(((Integer) this.cache.get(i)).intValue()), false, false, 0, 0, false);
                    return;
                }
            }
            if (StickersAlert.this.importingStickers != null) {
                ((StickerEmojiCell) viewHolder.itemView).setSticker((SendMessagesHelper.ImportingSticker) StickersAlert.this.importingStickersPaths.get(i));
                return;
            }
            if (viewHolder.getItemViewType() != 3) {
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = StickersAlert.this.stickerSet;
                if (tL_messages_stickerSet == null) {
                    return;
                }
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i);
                StickersAlert stickersAlert = StickersAlert.this;
                stickerEmojiCell.setSticker(document, null, stickersAlert.stickerSet, null, stickersAlert.showEmoji, StickersAlert.this.isEditModeEnabled);
                stickerEmojiCell.editModeIcon.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(6, this, stickerEmojiCell));
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View featuredStickerSetInfoCell;
            if (i == 0) {
                StickerEmojiCell stickerEmojiCell = new StickerEmojiCell(this.context, false, ((BottomSheet) StickersAlert.this).resourcesProvider) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(StickersAlert.this.itemSize, 1073741824), View.MeasureSpec.makeMeasureSpec(StickersAlert.this.itemSize, 1073741824));
                    }
                };
                stickerEmojiCell.getImageView().setLayerNum(7);
                featuredStickerSetInfoCell = stickerEmojiCell;
            } else if (i == 1) {
                featuredStickerSetInfoCell = new EmptyCell(this.context);
            } else if (i != 2) {
                featuredStickerSetInfoCell = i != 3 ? null : new AddStickerBtnView(this.context, ((BottomSheet) StickersAlert.this).resourcesProvider);
            } else {
                featuredStickerSetInfoCell = new FeaturedStickerSetInfoCell(8, this.context, ((BottomSheet) StickersAlert.this).resourcesProvider, true, false);
            }
            return new RecyclerListView.Holder(featuredStickerSetInfoCell);
        }

        public void updateColors() {
            if (StickersAlert.this.stickerSetCovereds != null) {
                int childCount = StickersAlert.this.gridView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = StickersAlert.this.gridView.getChildAt(i);
                    if (childAt instanceof FeaturedStickerSetInfoCell) {
                        ((FeaturedStickerSetInfoCell) childAt).updateColors();
                    }
                }
            }
        }
    }

    public interface StickersAlertCustomButtonDelegate {
        int getCustomButtonColorKey();

        int getCustomButtonRippleColorKey();

        String getCustomButtonText();

        int getCustomButtonTextColorKey();

        boolean onCustomButtonPressed();
    }

    public interface StickersAlertDelegate {
        boolean canSchedule();

        boolean isInScheduleMode();

        void lambda$onStickerSelected$97(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, boolean z2, int i, int i2);
    }

    public interface StickersAlertInstallDelegate {
        void onStickerSetInstalled();

        void onStickerSetUninstalled();
    }

    public StickersAlert(Context context, BaseFragment baseFragment, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, StickersAlertDelegate stickersAlertDelegate, boolean z) {
        this(context, baseFragment, inputStickerSet, tL_messages_stickerSet, stickersAlertDelegate, null, z);
    }

    private void checkOptions() {
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
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext(), 0, this.resourcesProvider, 0);
                actionBarPopupWindowLayout.setFitItems(true);
                ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, this.resourcesProvider).setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 1));
                ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersDeleteForEveryone), false, this.resourcesProvider);
                int themedColor = getThemedColor(Theme.key_text_RedBold);
                actionBarMenuSubItemAddItem.setColors(themedColor, themedColor);
                actionBarMenuSubItemAddItem.setSelectorColor(Theme.multAlpha(0.1f, themedColor));
                ActionBarMenuItem.addItem(actionBarPopupWindowLayout, 0, LocaleController.getString(R.string.StickersRemoveForMe), false, this.resourcesProvider).setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 2));
                actionBarMenuSubItemAddItem.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 3));
                this.deleteItem = this.optionsButton.addSwipeBackItem(R.drawable.msg_delete, null, LocaleController.getString(R.string.Delete), actionBarPopupWindowLayout);
            }
            this.optionsButton.addColoredGap();
            MessageContainsEmojiButton messageContainsEmojiButton = new MessageContainsEmojiButton(this.currentAccount, getContext(), this.resourcesProvider, new ArrayList(), 4);
            messageContainsEmojiButton.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 4));
            messageContainsEmojiButton.setTag(R.id.fit_width_tag, 1);
            this.optionsButton.addSubItem(messageContainsEmojiButton, -1, -2);
            int themedColor2 = getThemedColor(Theme.key_text_RedBold);
            this.deleteItem.setColors(themedColor2, themedColor2);
            this.deleteItem.setSelectorColor(Theme.multAlpha(0.1f, themedColor2));
            if (this.deleteItem.getRightIcon() != null) {
                this.deleteItem.getRightIcon().setColorFilter(themedColor2);
            }
        }
        if (this.optionsButton.getPopupLayout() != null) {
            this.optionsButton.getPopupLayout().requestLayout();
        }
    }

    private void checkPremiumStickers() {
        if (this.stickerSet != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSetFilterPremiumStickers = MessagesController.getInstance(this.currentAccount).filterPremiumStickers(this.stickerSet);
            this.stickerSet = tL_messages_stickerSetFilterPremiumStickers;
            if (tL_messages_stickerSetFilterPremiumStickers == null) {
                lambda$showGiftOfferSheet$15();
            }
        }
    }

    public void checkUrlAvailable(TextView textView, String str, boolean z) {
        if (z) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGreenText));
            this.lastNameAvailable = true;
            this.lastCheckName = str;
            return;
        }
        Runnable runnable = this.checkRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
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
            ShareAlert$$ExternalSyntheticLambda12 shareAlert$$ExternalSyntheticLambda12 = new ShareAlert$$ExternalSyntheticLambda12(this, str, textView, 5);
            this.checkRunnable = shareAlert$$ExternalSyntheticLambda12;
            AndroidUtilities.runOnUIThread(shareAlert$$ExternalSyntheticLambda12, 300L);
        }
    }

    public static void editSticker(final BaseFragment baseFragment, final TLRPC.TL_messages_stickerSet tL_messages_stickerSet, final TLRPC.Document document) {
        TLRPC.StickerSet stickerSet;
        if (baseFragment == null) {
            return;
        }
        final ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
        boolean z = (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.creator) ? false : true;
        if (!MessageObject.isStaticStickerDocument(document)) {
            AndroidUtilities.runOnUIThread(new StickersAlert$$ExternalSyntheticLambda48(baseFragment, tL_messages_stickerSet, document, chatActivity, z), 300L);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
        if (pathToAttach == null || !pathToAttach.exists()) {
            return;
        }
        final boolean z2 = z;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickersAlert.lambda$editSticker$0(pathToAttach, arrayList, baseFragment, chatActivity, document, z2, tL_messages_stickerSet);
            }
        }, 300L);
    }

    private void hidePreview() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.stickerPreviewLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                StickersAlert.this.stickerPreviewLayout.setVisibility(8);
                StickersAlert.this.stickerImageView.setImageDrawable(null);
            }
        });
        animatorSet.start();
    }

    private void init(Context context) {
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean fullHeight;
            private int lastNotifyWidth;
            private RectF rect = new RectF();
            private Boolean statusBarOpen;

            private void updateLightStatusBar(boolean z) {
                Boolean bool = this.statusBarOpen;
                if (bool == null || bool.booleanValue() != z) {
                    boolean z2 = AndroidUtilities.computePerceivedBrightness(StickersAlert.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                    boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(StickersAlert.this.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                    this.statusBarOpen = Boolean.valueOf(z);
                    if (!z) {
                        z2 = z3;
                    }
                    AndroidUtilities.setLightStatusBar(StickersAlert.this.getWindow(), z2);
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
                float fMin;
                int iMin;
                int iDp = AndroidUtilities.dp(6.0f) + (StickersAlert.this.scrollOffsetY - ((BottomSheet) StickersAlert.this).backgroundPaddingTop);
                int iDp2 = (StickersAlert.this.scrollOffsetY - ((BottomSheet) StickersAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(13.0f);
                int i = AndroidUtilities.statusBarHeight;
                int i2 = iDp2 + i;
                int i3 = iDp + i;
                if (this.fullHeight) {
                    int i4 = ((BottomSheet) StickersAlert.this).backgroundPaddingTop + i2;
                    int i5 = AndroidUtilities.statusBarHeight;
                    int i6 = i5 * 2;
                    if (i4 < i6) {
                        int iMin2 = Math.min(i5, (i6 - i2) - ((BottomSheet) StickersAlert.this).backgroundPaddingTop);
                        i2 -= iMin2;
                        fMin = 1.0f - Math.min(1.0f, (iMin2 * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        fMin = 1.0f;
                    }
                    int i7 = ((BottomSheet) StickersAlert.this).backgroundPaddingTop + i2;
                    int i8 = AndroidUtilities.statusBarHeight;
                    iMin = i7 < i8 ? Math.min(i8, (i8 - i2) - ((BottomSheet) StickersAlert.this).backgroundPaddingTop) : 0;
                    ((BottomSheet) StickersAlert.this).shadowDrawable.setBounds(0, i2, getMeasuredWidth(), getMeasuredHeight());
                    ((BottomSheet) StickersAlert.this).shadowDrawable.draw(canvas);
                    if (fMin != 1.0f) {
                        Theme.dialogs_onlineCirclePaint.setColor(StickersAlert.this.getThemedColor(Theme.key_dialogBackground));
                        this.rect.set(((BottomSheet) StickersAlert.this).backgroundPaddingLeft, ((BottomSheet) StickersAlert.this).backgroundPaddingTop + i2, getMeasuredWidth() - ((BottomSheet) StickersAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) StickersAlert.this).backgroundPaddingTop + i2);
                        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                    }
                    int iDp3 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - iDp3) / 2, i3, (getMeasuredWidth() + iDp3) / 2, AndroidUtilities.dp(4.0f) + i3);
                    Theme.dialogs_onlineCirclePaint.setColor(StickersAlert.this.getThemedColor(Theme.key_sheet_scrollUp));
                    Paint paint = Theme.dialogs_onlineCirclePaint;
                    paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i3 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * paint.getAlpha()));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    updateLightStatusBar(iMin > AndroidUtilities.statusBarHeight / 2);
                    if (iMin > 0) {
                        Theme.dialogs_onlineCirclePaint.setColor(StickersAlert.this.getThemedColor(Theme.key_dialogBackground));
                        canvas.drawRect(((BottomSheet) StickersAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) StickersAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                    }
                }
                fMin = 1.0f;
                ((BottomSheet) StickersAlert.this).shadowDrawable.setBounds(0, i2, getMeasuredWidth(), getMeasuredHeight());
                ((BottomSheet) StickersAlert.this).shadowDrawable.draw(canvas);
                if (fMin != 1.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(StickersAlert.this.getThemedColor(Theme.key_dialogBackground));
                    this.rect.set(((BottomSheet) StickersAlert.this).backgroundPaddingLeft, ((BottomSheet) StickersAlert.this).backgroundPaddingTop + i2, getMeasuredWidth() - ((BottomSheet) StickersAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) StickersAlert.this).backgroundPaddingTop + i2);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * fMin, AndroidUtilities.dp(12.0f) * fMin, Theme.dialogs_onlineCirclePaint);
                }
                int iDp4 = AndroidUtilities.dp(36.0f);
                this.rect.set((getMeasuredWidth() - iDp4) / 2, i3, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + i3);
                Theme.dialogs_onlineCirclePaint.setColor(StickersAlert.this.getThemedColor(Theme.key_sheet_scrollUp));
                Paint paint2 = Theme.dialogs_onlineCirclePaint;
                paint2.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i3 - AndroidUtilities.statusBarHeight) / AndroidUtilities.dp(16.0f))) * paint2.getAlpha()));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                updateLightStatusBar(iMin > AndroidUtilities.statusBarHeight / 2);
                if (iMin > 0) {
                    Theme.dialogs_onlineCirclePaint.setColor(StickersAlert.this.getThemedColor(Theme.key_dialogBackground));
                    canvas.drawRect(((BottomSheet) StickersAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight - iMin, getMeasuredWidth() - ((BottomSheet) StickersAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
                }
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || StickersAlert.this.scrollOffsetY == 0 || motionEvent.getY() >= StickersAlert.this.scrollOffsetY) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                StickersAlert.this.lambda$showGiftOfferSheet$15();
                return true;
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                int i5 = i3 - i;
                if (this.lastNotifyWidth != i5) {
                    this.lastNotifyWidth = i5;
                    if (StickersAlert.this.adapter != null && StickersAlert.this.stickerSetCovereds != null) {
                        StickersAlert.this.adapter.notifyDataSetChanged();
                    }
                }
                super.onLayout(z, i, i2, i3, i4);
                StickersAlert.this.updateLayout();
            }

            @Override
            public void onMeasure(int i, int i2) {
                int iMax;
                int i3;
                int size;
                float f;
                int iDp;
                int size2 = View.MeasureSpec.getSize(i2);
                StickersAlert.this.ignoreLayout = true;
                setPadding(((BottomSheet) StickersAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) StickersAlert.this).backgroundPaddingLeft, 0);
                StickersAlert.this.ignoreLayout = false;
                if (StickersAlert.this.isEmoji()) {
                    int measuredWidth = StickersAlert.this.gridView.getMeasuredWidth();
                    if (measuredWidth == 0) {
                        measuredWidth = AndroidUtilities.displaySize.x;
                    }
                    StickersAlert.this.adapter.stickersPerRow = Math.max(1, measuredWidth / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f));
                    StickersAlert.this.itemSize = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(36.0f)) / StickersAlert.this.adapter.stickersPerRow;
                    StickersAlert stickersAlert = StickersAlert.this;
                    stickersAlert.itemHeight = stickersAlert.itemSize;
                } else {
                    StickersAlert.this.adapter.stickersPerRow = 5;
                    StickersAlert.this.itemSize = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(36.0f)) / StickersAlert.this.adapter.stickersPerRow;
                    StickersAlert.this.itemHeight = AndroidUtilities.dp(82.0f);
                }
                float f2 = StickersAlert.this.adapter.stickersPerRow;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) StickersAlert.this.gridView.getLayoutParams();
                if (StickersAlert.this.importingStickers == null) {
                    if (StickersAlert.this.stickerSetCovereds != null) {
                        size = ((BottomSheet) StickersAlert.this).backgroundPaddingTop + (StickersAlert.this.itemHeight * StickersAlert.this.adapter.stickersRowCount) + (StickersAlert.this.stickerSetCovereds.size() * AndroidUtilities.dp(60.0f)) + AndroidUtilities.dp(8.0f) + marginLayoutParams.bottomMargin + AndroidUtilities.dp(24.0f);
                    } else {
                        int iDp2 = AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                        int i4 = StickersAlert.this.isEmoji() ? 2 : 3;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = StickersAlert.this.stickerSet;
                        iMax = ((BottomSheet) StickersAlert.this).backgroundPaddingTop + (StickersAlert.this.itemHeight * Math.max(i4, tL_messages_stickerSet != null ? (int) Math.ceil(tL_messages_stickerSet.documents.size() / f2) : 0)) + iDp2;
                        i3 = AndroidUtilities.statusBarHeight;
                    }
                    if (StickersAlert.this.isEmoji()) {
                        size = (int) ((StickersAlert.this.itemHeight * 0.15f) + size);
                    }
                    if (StickersAlert.this.descriptionTextView != null) {
                        StickersAlert.this.descriptionTextView.measure(i, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
                        size += StickersAlert.this.descriptionTextView.getMeasuredHeight();
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
                        iDp = ((BottomSheet) StickersAlert.this).backgroundPaddingTop;
                    }
                    if (StickersAlert.this.descriptionTextView != null) {
                        iDp += StickersAlert.this.descriptionTextView.getMeasuredHeight() + AndroidUtilities.dp(32.0f);
                    }
                    if (StickersAlert.this.stickerSetCovereds != null) {
                        iDp += AndroidUtilities.dp(8.0f);
                    }
                    if (StickersAlert.this.gridView.getPaddingTop() != iDp) {
                        StickersAlert.this.ignoreLayout = true;
                        StickersAlert.this.gridView.setPadding(AndroidUtilities.dp(10.0f), iDp, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
                        StickersAlert.this.emptyView.setPadding(0, iDp, 0, 0);
                        StickersAlert.this.ignoreLayout = false;
                    }
                    this.fullHeight = size >= size2;
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(size, size2), 1073741824));
                }
                iMax = ((BottomSheet) StickersAlert.this).backgroundPaddingTop + (StickersAlert.this.itemHeight * Math.max(3, (int) Math.ceil(StickersAlert.this.importingStickers.size() / f2))) + AndroidUtilities.dp(48.0f) + marginLayoutParams.bottomMargin;
                i3 = AndroidUtilities.statusBarHeight;
                size = iMax + i3;
                if (StickersAlert.this.isEmoji()) {
                    size = (int) ((StickersAlert.this.itemHeight * 0.15f) + size);
                }
                if (StickersAlert.this.descriptionTextView != null) {
                    StickersAlert.this.descriptionTextView.measure(i, View.MeasureSpec.makeMeasureSpec(9999, Integer.MIN_VALUE));
                    size += StickersAlert.this.descriptionTextView.getMeasuredHeight();
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
                    iDp = ((BottomSheet) StickersAlert.this).backgroundPaddingTop;
                }
                if (StickersAlert.this.descriptionTextView != null) {
                    iDp += StickersAlert.this.descriptionTextView.getMeasuredHeight() + AndroidUtilities.dp(32.0f);
                }
                if (StickersAlert.this.stickerSetCovereds != null) {
                    iDp += AndroidUtilities.dp(8.0f);
                }
                if (StickersAlert.this.gridView.getPaddingTop() != iDp) {
                    StickersAlert.this.ignoreLayout = true;
                    StickersAlert.this.gridView.setPadding(AndroidUtilities.dp(10.0f), iDp, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(8.0f));
                    StickersAlert.this.emptyView.setPadding(0, iDp, 0, 0);
                    StickersAlert.this.ignoreLayout = false;
                }
                this.fullHeight = size >= size2;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(size, size2), 1073741824));
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !StickersAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
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
        this.shadow[0] = new View(context);
        View view = this.shadow[0];
        int i2 = Theme.key_dialogShadowLine;
        view.setBackgroundColor(getThemedColor(i2));
        this.shadow[0].setAlpha(0.0f);
        this.shadow[0].setVisibility(4);
        this.shadow[0].setTag(1);
        this.containerView.addView(this.shadow[0], layoutParams);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view2, long j) {
                if (!(view2 instanceof StickerEmojiCell) || !StickersAlert.this.isEditModeEnabled) {
                    return super.drawChild(canvas, view2, j);
                }
                int adapterPosition = StickersAlert.this.gridView.getChildViewHolder(view2).getAdapterPosition();
                canvas.save();
                canvas.rotate(StickersAlert.this.stickersShaker.getRotationValueForPos(adapterPosition), (view2.getMeasuredWidth() / 2.0f) + view2.getLeft(), (view2.getMeasuredHeight() / 2.0f) + view2.getTop());
                canvas.translate(StickersAlert.this.stickersShaker.getTranslateXValueForPos(adapterPosition), StickersAlert.this.stickersShaker.getTranslateYValueForPos(adapterPosition));
                boolean zDrawChild = super.drawChild(canvas, view2, j);
                canvas.restore();
                invalidate();
                return zDrawChild;
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (StickersAlert.this.isEditModeEnabled) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, StickersAlert.this.gridView, 0, StickersAlert.this.previewDelegate, this.resourcesProvider);
            }

            @Override
            public void requestLayout() {
                if (StickersAlert.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.gridView = recyclerListView;
        recyclerListView.setTag(14);
        RecyclerListView recyclerListView2 = this.gridView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 5) {
            {
                super(i);
            }

            @Override
            public boolean isLayoutRTL() {
                return StickersAlert.this.stickerSetCovereds != null && LocaleController.isRTL;
            }
        };
        this.layoutManager = gridLayoutManager;
        recyclerListView2.setLayoutManager(gridLayoutManager);
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i3) {
                if ((StickersAlert.this.stickerSetCovereds == null || !(StickersAlert.this.adapter.cache.get(i3) instanceof Integer)) && i3 != StickersAlert.this.adapter.totalItems) {
                    return 1;
                }
                return StickersAlert.this.adapter.stickersPerRow;
            }
        });
        this.dragAndDropHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(15, 0) {
            private int movedPos = -1;

            @Override
            public int getDragDirs(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                if (viewHolder.getItemViewType() == 3) {
                    return 0;
                }
                return super.getDragDirs(recyclerView, viewHolder);
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                if (viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() != viewHolder2.getItemViewType() || StickersAlert.this.stickerSet == null) {
                    return false;
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = viewHolder2.getAdapterPosition();
                StickersAlert.this.stickerSet.documents.add(adapterPosition2, StickersAlert.this.stickerSet.documents.remove(adapterPosition));
                StickersAlert.this.adapter.notifyItemMoved(adapterPosition, adapterPosition2);
                this.movedPos = adapterPosition2;
                return true;
            }

            @Override
            public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i3, RecyclerView.ViewHolder viewHolder2, int i4, int i5, int i6) {
            }

            @Override
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i3) {
                super.onSelectedChanged(viewHolder, i3);
                if (i3 != 0 || StickersAlert.this.draggedDocument == null || this.movedPos <= 0) {
                    if (i3 == 2) {
                        StickersAlert.this.draggedDocument = ((StickerEmojiCell) viewHolder.itemView).getSticker();
                        return;
                    }
                    return;
                }
                TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
                tL_stickers_changeStickerPosition.position = this.movedPos;
                tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(StickersAlert.this.draggedDocument, "").document;
                this.movedPos = -1;
                StickersAlert.this.draggedDocument = null;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i3) {
            }
        });
        RecyclerListView recyclerListView3 = this.gridView;
        GridAdapter gridAdapter = new GridAdapter(context);
        this.adapter = gridAdapter;
        recyclerListView3.setAdapter(gridAdapter);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
            }
        });
        this.gridView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.gridView.setClipToPadding(false);
        this.gridView.setEnabled(true);
        this.gridView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.gridView.setOnTouchListener(new ItemOptions$$ExternalSyntheticLambda1(this, 4));
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                StickersAlert.this.updateLayout();
            }
        });
        StarAppsSheet$$ExternalSyntheticLambda0 starAppsSheet$$ExternalSyntheticLambda0 = new StarAppsSheet$$ExternalSyntheticLambda0(this, 17);
        this.stickersOnItemClickListener = starAppsSheet$$ExternalSyntheticLambda0;
        this.gridView.setOnItemClickListener(starAppsSheet$$ExternalSyntheticLambda0);
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            public void requestLayout() {
                if (StickersAlert.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.emptyView = frameLayout2;
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.gridView.setEmptyView(this.emptyView);
        this.emptyView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(29));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
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
        this.optionsButton.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 7));
        this.optionsButton.setDelegate(new StickersAlert$$ExternalSyntheticLambda20(this));
        this.optionsButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.optionsButton.setVisibility(this.inputStickerSet != null ? 0 : 8);
        this.emptyView.addView(new RadialProgressView(context), LayoutHelper.createFrame(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.shadow[1] = new View(context);
        this.shadow[1].setBackgroundColor(getThemedColor(i2));
        this.containerView.addView(this.shadow[1], layoutParams2);
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
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
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.pickerBottomFrameLayout = frameLayout3;
        frameLayout3.addView(this.pickerBottomLayout, LayoutHelper.createFrame(-1, 48.0f));
        this.containerView.addView(this.pickerBottomFrameLayout, LayoutHelper.createFrame(-1, -2, 83));
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, AndroidUtilities.dp(24.0f), false, this.resourcesProvider);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.setIcon(R.raw.unlock_icon);
        this.premiumButtonView.setVisibility(4);
        this.containerView.addView(this.premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.stickerPreviewLayout = frameLayout4;
        frameLayout4.setVisibility(8);
        this.stickerPreviewLayout.setSoundEffectsEnabled(false);
        this.containerView.addView(this.stickerPreviewLayout, LayoutHelper.createFrame(-1, -1.0f));
        this.stickerPreviewLayout.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 8));
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
        this.previewSendButton.setOnClickListener(new StickersAlert$$ExternalSyntheticLambda0(this, 10));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams3.bottomMargin = AndroidUtilities.dp(48.0f);
        View view2 = new View(context);
        this.previewSendButtonShadow = view2;
        view2.setBackgroundColor(getThemedColor(i2));
        this.stickerPreviewLayout.addView(this.previewSendButtonShadow, layoutParams3);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.importingStickers != null) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        updateFields();
        updateSendButton();
        updateDescription();
        updateColors();
        this.adapter.notifyDataSetChanged();
    }

    public boolean isEmoji() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            return tL_messages_stickerSet == null && this.probablyEmojis;
        }
        return true;
    }

    public void lambda$checkOptions$16(View view) {
        this.optionsButton.getPopupLayout().getSwipeBack().closeForeground();
    }

    public void lambda$checkOptions$17(View view) {
        this.optionsButton.closeSubMenu();
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, true, true);
    }

    public void lambda$checkOptions$18() {
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, false, false);
    }

    public void lambda$checkOptions$19(View view) {
        this.optionsButton.closeSubMenu();
        StickersDialogs.showDeleteForEveryOneDialog(this.stickerSet.set, this.resourcesProvider, getContext(), new StickersAlert$$ExternalSyntheticLambda32(this, 2));
    }

    public void lambda$checkOptions$20() {
        MessagesController.getInstance(this.currentAccount).openByUserName("stickers", this.parentFragment, 1);
    }

    public void lambda$checkOptions$21(View view) {
        this.optionsButton.closeSubMenu();
        lambda$showGiftOfferSheet$15();
        AndroidUtilities.runOnUIThread(new StickersAlert$$ExternalSyntheticLambda32(this, 1), 200L);
    }

    public void lambda$checkUrlAvailable$45(String str, TLRPC.TL_error tL_error, TLObject tLObject, TextView textView) {
        this.checkReqId = 0;
        String str2 = this.lastCheckName;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
            textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGreenText));
            this.lastNameAvailable = true;
        } else {
            textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
            textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
            this.lastNameAvailable = false;
        }
    }

    public void lambda$checkUrlAvailable$46(String str, TextView textView, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new GroupCallPip$9$$ExternalSyntheticLambda0(this, str, tL_error, tLObject, textView, 2));
    }

    public void lambda$checkUrlAvailable$47(String str, TextView textView) {
        TLRPC.TL_stickers_checkShortName tL_stickers_checkShortName = new TLRPC.TL_stickers_checkShortName();
        tL_stickers_checkShortName.short_name = str;
        this.checkReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stickers_checkShortName, new StickersAlert$$ExternalSyntheticLambda28(this, str, textView, 0), 2);
    }

    public void lambda$didReceivedNotification$48(String str, SendMessagesHelper.ImportingSticker importingSticker) {
        if (isDismissed()) {
            return;
        }
        this.uploadImportStickers.remove(str);
        if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
            importingSticker.validated = true;
            int iIndexOf = this.importingStickersPaths.indexOf(importingSticker);
            if (iIndexOf >= 0) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.gridView.findViewHolderForAdapterPosition(iIndexOf);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    ((StickerEmojiCell) viewHolderFindViewHolderForAdapterPosition.itemView).setSticker(importingSticker);
                }
            } else {
                this.adapter.notifyDataSetChanged();
            }
        } else {
            removeSticker(importingSticker);
        }
        if (this.uploadImportStickers.isEmpty()) {
            updateFields();
        }
    }

    public static void lambda$disableEditMode$51(View view) {
        if (view instanceof StickerEmojiCell) {
            ((StickerEmojiCell) view).disableEditMode(true);
        }
    }

    public void lambda$disableEditMode$52() {
        this.adapter.notifyDataSetChanged();
    }

    public static void lambda$editSticker$0(File file, ArrayList arrayList, BaseFragment baseFragment, ChatActivity chatActivity, TLRPC.Document document, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getAbsolutePath(), 0, false, 0, 0, 0L));
        PhotoViewer.getInstance().setParentActivity(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 11, false, new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public boolean allowCaption() {
                return false;
            }

            @Override
            public boolean isEditingSticker() {
                return true;
            }
        }, chatActivity);
        PhotoViewer.getInstance().enableStickerMode(document, z ? document : null, false, null);
        ContentPreviewViewer.getInstance().setStickerSetForCustomSticker(z ? tL_messages_stickerSet : null);
    }

    public static void lambda$editSticker$1(BaseFragment baseFragment, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document, ChatActivity chatActivity, boolean z) {
        int i;
        File fileMakeCacheFile = StoryEntry.makeCacheFile(baseFragment.getCurrentAccount(), "webp");
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            i = devicePerformanceClass != 2 ? 2560 : 3840;
        } else {
            i = 1280;
        }
        float f = 512;
        Size size = new Size(f, f);
        float f2 = i;
        size.width = f2;
        double d = (f2 * f) / f;
        float fFloor = (float) Math.floor(d);
        size.height = fFloor;
        if (fFloor > f2) {
            size.height = f2;
            size.width = (float) Math.floor(d);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile));
        } catch (Throwable th) {
            FileLog.e(th);
        }
        bitmapCreateBitmap.recycle();
        ArrayList<Object> arrayList = new ArrayList<>();
        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileMakeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
        arrayList.add(photoEntry);
        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
        mediaEntity.type = (byte) 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
        mediaEntity.parentObject = tL_messages_stickerSet2;
        mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true).getAbsolutePath();
        mediaEntity.x = 0.5f - ((Math.min(512, 512) / f) / 2.0f);
        mediaEntity.y = 0.5f - ((Math.min(512, 512) / f) / 2.0f);
        mediaEntity.width = Math.min(512, 512) / f;
        mediaEntity.height = Math.min(512, 512) / f;
        int iFloor = (int) Math.floor(((double) size.width) * 0.5d);
        mediaEntity.viewWidth = iFloor;
        mediaEntity.viewHeight = iFloor;
        mediaEntity.scale = 2.0f;
        mediaEntity.document = document;
        if (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoStickerDocument(document)) {
            mediaEntity.subType = (byte) ((MessageObject.isAnimatedStickerDocument(document, true) ? (byte) 1 : (byte) 4) | mediaEntity.subType);
        }
        ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
        photoEntry.mediaEntities = arrayList2;
        arrayList2.add(mediaEntity);
        photoEntry.averageDuration = 3000L;
        if (MessageObject.isAnimatedStickerDocument(document, true)) {
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
            if (pathToAttach != null) {
                try {
                    photoEntry.averageDuration = (long) (RLottieNative.getDuration(pathToAttach.getAbsolutePath(), null) * 1000.0d);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (MessageObject.isVideoStickerDocument(document)) {
            photoEntry.averageDuration = (long) (MessageObject.getDocumentDuration(document) * 1000.0d);
        }
        PhotoViewer.getInstance().setParentActivity(baseFragment.getParentActivity(), baseFragment.getResourceProvider());
        PhotoViewer.getInstance().openPhotoForSelect(arrayList, 0, 11, false, new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public boolean allowCaption() {
                return false;
            }

            @Override
            public boolean isEditingSticker() {
                return true;
            }
        }, chatActivity);
        PhotoViewer.getInstance().enableStickerMode(document, z ? document : null, true, null);
        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
        if (!z) {
            tL_messages_stickerSet2 = null;
        }
        contentPreviewViewer.setStickerSetForCustomSticker(tL_messages_stickerSet2);
    }

    public static void lambda$enableEditMode$49(View view) {
        if (view instanceof StickerEmojiCell) {
            ((StickerEmojiCell) view).enableEditMode(true);
        }
    }

    public void lambda$enableEditMode$50() {
        this.adapter.notifyDataSetChanged();
    }

    public void lambda$init$10(DialogInterface dialogInterface) {
        this.masterDismissListener.run();
    }

    public void lambda$init$11(View view, int i) {
        TLRPC.StickerSet stickerSet;
        if (view instanceof AddStickerBtnView) {
            StickersDialogs.showAddStickerDialog(this.stickerSet, view, this.parentFragment, this.resourcesProvider);
            return;
        }
        if (this.isEditModeEnabled) {
            return;
        }
        if (this.stickerSetCovereds != null) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.adapter.positionsToSets.get(i);
            if (stickerSetCovered != null) {
                this.ignoreMasterDismiss = true;
                lambda$showGiftOfferSheet$15();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                tL_inputStickerSetID.id = stickerSet2.id;
                StickersAlert stickersAlert = new StickersAlert(this.parentActivity, this.parentFragment, tL_inputStickerSetID, null, null, this.resourcesProvider, false);
                if (this.masterDismissListener != null) {
                    stickersAlert.setOnDismissListener(new SearchTagsList$$ExternalSyntheticLambda5(this, 6));
                }
                stickersAlert.show();
                return;
            }
            return;
        }
        ArrayList<SendMessagesHelper.ImportingSticker> arrayList = this.importingStickersPaths;
        if (arrayList != null) {
            if (i < 0 || i >= arrayList.size()) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingSticker = this.importingStickersPaths.get(i);
            this.selectedStickerPath = importingSticker;
            if (importingSticker.validated) {
                TextView textView = this.stickerEmojiTextView;
                textView.setText(Emoji.replaceEmoji(importingSticker.emoji, textView.getPaint().getFontMetricsInt(), false));
                this.stickerImageView.setImage(ImageLocation.getForPath(this.selectedStickerPath.path), (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Bitmap) null, this.selectedStickerPath.animated ? "tgs" : null, 0, (Object) null);
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
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
        if (tL_messages_stickerSet == null || i < 0 || i >= tL_messages_stickerSet.documents.size()) {
            return;
        }
        this.selectedSticker = this.stickerSet.documents.get(i);
        int i2 = 0;
        while (true) {
            if (i2 < this.selectedSticker.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = this.selectedSticker.attributes.get(i2);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        TextView textView2 = this.stickerEmojiTextView;
                        textView2.setText(Emoji.replaceEmoji(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false));
                        break;
                    }
                    break;
                }
                i2++;
            }
            this.stickerEmojiTextView.setText(Emoji.replaceEmoji(MediaDataController.getInstance(this.currentAccount).getEmojiForSticker(this.selectedSticker.id), this.stickerEmojiTextView.getPaint().getFontMetricsInt(), false));
            break;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSet;
        if ((tL_messages_stickerSet2 == null || (stickerSet = tL_messages_stickerSet2.set) == null || !stickerSet.emojis) && !ContentPreviewViewer.getInstance().showMenuFor(view)) {
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

    public static boolean lambda$init$12(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$init$13(View view) {
        checkOptions();
        this.optionsButton.toggleSubMenu();
    }

    public void lambda$init$14(View view) {
        hidePreview();
    }

    public void lambda$init$15(View view) {
        if (this.importingStickersPaths == null) {
            this.delegate.lambda$onStickerSelected$97(this.selectedSticker, null, this.stickerSet, null, this.clearsInputField, true, 0, 0);
            lambda$showGiftOfferSheet$15();
        } else {
            removeSticker(this.selectedStickerPath);
            hidePreview();
            this.selectedStickerPath = null;
        }
    }

    public boolean lambda$init$9(View view, MotionEvent motionEvent) {
        if (this.isEditModeEnabled) {
            return false;
        }
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.gridView, 0, this.stickersOnItemClickListener, this.previewDelegate, this.resourcesProvider);
    }

    public void lambda$loadStickerSet$7(TLRPC.TL_error tL_error, TLObject tLObject, MediaDataController mediaDataController) {
        TLRPC.StickerSet stickerSet;
        boolean z = false;
        this.reqId = 0;
        if (tL_error != null) {
            lambda$showGiftOfferSheet$15();
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment != null) {
                UserNameResolver$$ExternalSyntheticOutline0.m(BulletinFactory.of(baseFragment), R.string.AddStickersNotFound);
                return;
            }
            return;
        }
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.addTarget(this.containerView);
        TransitionManager.beginDelayedTransition(this.container, anonymousClass4);
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
        updateDescription();
        this.adapter.notifyDataSetChanged();
    }

    public void lambda$loadStickerSet$8(MediaDataController mediaDataController, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda1(17, this, tL_error, tLObject, mediaDataController));
    }

    public void lambda$new$2(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers) {
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
            loadStickerSet(false);
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = new ArrayList<>();
        this.stickerSetCovereds = arrayList;
        arrayList.addAll(vector.objects);
        this.gridView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.titleTextView.setVisibility(8);
        this.shadow[0].setVisibility(8);
        this.adapter.notifyDataSetChanged();
    }

    public void lambda$new$3(TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda1(16, this, tL_error, tLObject, tL_messages_getAttachedStickers));
    }

    public void lambda$new$4(Object obj, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj == null) {
            requestDelegate.run(tLObject, tL_error);
        } else {
            FileRefController.getInstance(this.currentAccount).requestReference(obj, tL_messages_getAttachedStickers, requestDelegate);
        }
    }

    public void lambda$new$5(ArrayList arrayList, Boolean bool) {
        this.importingStickersPaths = arrayList;
        if (arrayList.isEmpty()) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        this.adapter.notifyDataSetChanged();
        if (bool.booleanValue()) {
            this.uploadImportStickers = new HashMap<>();
            int size = this.importingStickersPaths.size();
            for (int i = 0; i < size; i++) {
                SendMessagesHelper.ImportingSticker importingSticker = this.importingStickersPaths.get(i);
                this.uploadImportStickers.put(importingSticker.path, importingSticker);
                FileLoader.getInstance(this.currentAccount).uploadFile(importingSticker.path, false, true, 67108864);
            }
        }
        updateFields();
    }

    public void lambda$new$6(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        Uri uri;
        String stickerExt;
        int i;
        ArrayList arrayList3 = new ArrayList();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int size = arrayList.size();
        Boolean boolValueOf = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            if ((obj instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj))) != null) {
                boolean zEquals = "tgs".equals(stickerExt);
                if (boolValueOf == null) {
                    boolValueOf = Boolean.valueOf(zEquals);
                } else if (boolValueOf.booleanValue() != zEquals) {
                    continue;
                }
                if (isDismissed()) {
                    return;
                }
                SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                importingSticker.animated = zEquals;
                String strCopyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (zEquals ? 64 : 512) * 1024);
                importingSticker.path = strCopyFileToCache;
                if (strCopyFileToCache != null) {
                    if (zEquals) {
                        importingSticker.mimeType = "application/x-tgsticker";
                    } else {
                        BitmapFactory.decodeFile(strCopyFileToCache, options);
                        int i3 = options.outWidth;
                        if ((i3 == 512 && (i = options.outHeight) > 0 && i <= 512) || (options.outHeight == 512 && i3 > 0 && i3 <= 512)) {
                            importingSticker.mimeType = "image/".concat(stickerExt);
                            importingSticker.validated = true;
                        }
                    }
                    if (arrayList2 != null && arrayList2.size() == size && (arrayList2.get(i2) instanceof String)) {
                        importingSticker.emoji = (String) arrayList2.get(i2);
                    } else {
                        importingSticker.emoji = "#️⃣";
                    }
                    arrayList3.add(importingSticker);
                    if (arrayList3.size() >= 200) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda12(this, arrayList3, boolValueOf, 8));
    }

    public static void lambda$onSubItemClick$22(TLObject tLObject, Utilities.Callback callback) {
        boolean z;
        if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            MediaDataController.getInstance(UserConfig.selectedAccount).putStickerSet(tL_messages_stickerSet);
            if (!MediaDataController.getInstance(UserConfig.selectedAccount).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(null, tL_messages_stickerSet, 2, null, false, false);
            }
            z = true;
        } else {
            z = false;
        }
        callback.run(Boolean.valueOf(z));
    }

    public static void lambda$onSubItemClick$23(Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new UndoView$$ExternalSyntheticLambda3(tLObject, callback));
    }

    public void lambda$onSubItemClick$24(CharSequence charSequence, Utilities.Callback callback) {
        this.titleTextView.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(this.stickerSet.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new UndoView$$ExternalSyntheticLambda0(callback, 15));
    }

    public void lambda$onSubItemClick$25() {
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, false, false);
    }

    public static void lambda$showNameEnterAlert$36(AlertDialog alertDialog, int i) {
    }

    public static boolean lambda$showNameEnterAlert$37(AlertDialog.Builder builder, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        builder.create().getButton(-1).callOnClick();
        return true;
    }

    public static void lambda$showNameEnterAlert$39(EditTextBoldCursor editTextBoldCursor) {
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(editTextBoldCursor);
    }

    public static void lambda$showNameEnterAlert$40(EditTextBoldCursor editTextBoldCursor, DialogInterface dialogInterface) {
        AndroidUtilities.runOnUIThread(new TagEditCell$$ExternalSyntheticLambda3(7, editTextBoldCursor));
    }

    public void lambda$showNameEnterAlert$41(TLObject tLObject, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        boolean z;
        String str;
        if (!(tLObject instanceof TLRPC.TL_stickers_suggestedShortName) || (str = ((TLRPC.TL_stickers_suggestedShortName) tLObject).short_name) == null) {
            z = false;
        } else {
            editTextBoldCursor.setText(str);
            editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
            z = true;
            checkUrlAvailable(textView, editTextBoldCursor.getText().toString(), true);
        }
        textView2.setVisibility(0);
        editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
        if (!z) {
            editTextBoldCursor.setText("");
        }
        iArr[0] = 2;
    }

    public void lambda$showNameEnterAlert$42(EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24(this, tLObject, editTextBoldCursor, textView, textView2, iArr, 4, false));
    }

    public void lambda$showNameEnterAlert$43(String str) {
        new ImportingAlert(getContext(), this.lastCheckName, null, this.resourcesProvider).show();
    }

    public void lambda$showNameEnterAlert$44(int[] iArr, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, AlertDialog.Builder builder, View view) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stickers_suggestShortName, new StickersAlert$$ExternalSyntheticLambda19(this, editTextBoldCursor, textView, textView2, iArr, 0));
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
            SendMessagesHelper.getInstance(this.currentAccount).prepareImportStickers(this.setTitle, this.lastCheckName, this.importingSoftware, this.importingStickersPaths, new StickersAlert$$ExternalSyntheticLambda20(this));
            builder.getDismissRunnable().run();
            lambda$showGiftOfferSheet$15();
        }
    }

    public void lambda$updateFields$26(View view) {
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null) {
            new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).lambda$runLinkRequest$100(new PremiumPreviewFragment(null));
        }
    }

    public void lambda$updateFields$27(View view) {
        if (this.customButtonDelegate.onCustomButtonPressed()) {
            lambda$showGiftOfferSheet$15();
        }
    }

    public void lambda$updateFields$28(TLRPC.TL_error tL_error, TLObject tLObject) {
        int i;
        TLRPC.StickerSet stickerSet = this.stickerSet.set;
        if (stickerSet.masks) {
            i = 1;
        } else {
            i = stickerSet.emojis ? 5 : 0;
        }
        try {
            if (tL_error == null) {
                if (this.showTooltipWhenToggle) {
                    Bulletin.make(this.parentFragment, new StickerSetBulletinLayout(this.pickerBottomFrameLayout.getContext(), this.stickerSet, 2, null, this.resourcesProvider), 1500).show();
                }
                if (tLObject instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                    MediaDataController.getInstance(this.currentAccount).processStickerSetInstallResultArchive(this.parentFragment, true, i, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject);
                }
            } else {
                Toast.makeText(getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        MediaDataController.getInstance(this.currentAccount).loadStickers(i, false, true);
    }

    public void lambda$updateFields$29(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda12(tLObject, tL_error, this));
    }

    public void lambda$updateFields$30(View view) {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_installStickerSet, new UndoView$$ExternalSyntheticLambda0(this, 16));
    }

    public void lambda$updateFields$31(View view) {
        if (this.isEditModeEnabled) {
            disableEditMode();
        } else {
            enableEditMode();
        }
    }

    public void lambda$updateFields$32(View view) {
        StickersAlertInstallDelegate stickersAlertInstallDelegate = this.installDelegate;
        if (stickersAlertInstallDelegate != null) {
            stickersAlertInstallDelegate.onStickerSetUninstalled();
        }
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 1, this.parentFragment, true, this.showTooltipWhenToggle);
    }

    public void lambda$updateFields$33(View view) {
        StickersAlertInstallDelegate stickersAlertInstallDelegate = this.installDelegate;
        if (stickersAlertInstallDelegate != null) {
            stickersAlertInstallDelegate.onStickerSetUninstalled();
        }
        lambda$showGiftOfferSheet$15();
        MediaDataController.getInstance(this.currentAccount).toggleStickerSet(getContext(), this.stickerSet, 0, this.parentFragment, true, this.showTooltipWhenToggle);
    }

    public void lambda$updateFields$34(View view) {
        showNameEnterAlert();
    }

    public void lambda$updateFields$35(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void onSubItemClick(int i) {
        String str;
        BaseFragment baseFragment;
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
            Context context = this.parentActivity;
            if (context == null && (baseFragment = this.parentFragment) != null) {
                context = baseFragment.getParentActivity();
            }
            if (context == null) {
                context = getContext();
            }
            AnonymousClass13 anonymousClass13 = new AnonymousClass13(context, null, str2, false, str2, false, this.resourcesProvider);
            BaseFragment baseFragment2 = this.parentFragment;
            if (baseFragment2 == null) {
                anonymousClass13.show();
                return;
            }
            baseFragment2.showDialog(anonymousClass13);
            BaseFragment baseFragment3 = this.parentFragment;
            if (baseFragment3 instanceof ChatActivity) {
                anonymousClass13.setCalcMandatoryInsets(((ChatActivity) baseFragment3).isKeyboardVisible());
                return;
            }
            return;
        }
        if (i == 2) {
            try {
                AndroidUtilities.addToClipboard(str2);
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createCopyLinkBulletin().show();
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
            StickersDialogs.showNameEditorDialog(this.stickerSet.set, this.resourcesProvider, getContext(), new EmojiView$$ExternalSyntheticLambda18(this, 19));
        } else if (i == 5) {
            StickersDialogs.showDeleteForEveryOneDialog(this.stickerSet.set, this.resourcesProvider, getContext(), new StickersAlert$$ExternalSyntheticLambda32(this, 4));
        }
    }

    public void removeSticker(SendMessagesHelper.ImportingSticker importingSticker) {
        int iIndexOf = this.importingStickersPaths.indexOf(importingSticker);
        if (iIndexOf >= 0) {
            this.importingStickersPaths.remove(iIndexOf);
            this.adapter.notifyItemRemoved(iIndexOf);
            if (this.importingStickersPaths.isEmpty()) {
                lambda$showGiftOfferSheet$15();
            } else {
                updateFields();
            }
        }
    }

    private void runShadowAnimation(final int i, final boolean z) {
        if (this.stickerSetCovereds != null) {
            return;
        }
        if ((!z || this.shadow[i].getTag() == null) && (z || this.shadow[i].getTag() != null)) {
            return;
        }
        this.shadow[i].setTag(z ? null : 1);
        if (z) {
            this.shadow[i].setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation[i];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.shadowAnimation[i] = new AnimatorSet();
        this.shadowAnimation[i].playTogether(ObjectAnimator.ofFloat(this.shadow[i], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation[i].setDuration(150L);
        this.shadowAnimation[i].addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                if (StickersAlert.this.shadowAnimation[i] == null || !StickersAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                StickersAlert.this.shadowAnimation[i] = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (StickersAlert.this.shadowAnimation[i] == null || !StickersAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                if (!z) {
                    StickersAlert.this.shadow[i].setVisibility(4);
                }
                StickersAlert.this.shadowAnimation[i] = null;
            }
        });
        this.shadowAnimation[i].start();
    }

    private void setButton(View.OnClickListener onClickListener, String str, int i) {
        setButton(onClickListener, str, i, -1, -1);
    }

    public void setScrollOffsetY(int i) {
        this.scrollOffsetY = i;
        if (this.stickerSetCovereds == null) {
            float f = i;
            this.titleTextView.setTranslationY(f);
            TextView textView = this.descriptionTextView;
            if (textView != null) {
                textView.setTranslationY(f);
            }
            if (this.importingStickers == null) {
                this.optionsButton.setTranslationY(f);
            }
            this.shadow[0].setTranslationY(f);
        }
        this.containerView.invalidate();
    }

    private void showNameEnterAlert() {
        Context context = getContext();
        final int[] iArr = {0};
        FrameLayout frameLayout = new FrameLayout(context);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
        builder.setTitle(LocaleController.getString(R.string.ImportStickersEnterName));
        builder.setPositiveButton(LocaleController.getString(R.string.Next), new ShareAlert$$ExternalSyntheticLambda26(8));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setView(linearLayout);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 36, 51, 24, 6, 24, 0));
        final TextView textView = new TextView(context);
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 16.0f);
        textViewM.setTextColor(getThemedColor(Theme.key_dialogTextHint));
        textViewM.setMaxLines(1);
        textViewM.setLines(1);
        textViewM.setText("t.me/addstickers/");
        textViewM.setInputType(16385);
        textViewM.setGravity(51);
        textViewM.setSingleLine(true);
        textViewM.setVisibility(4);
        textViewM.setImeOptions(6);
        textViewM.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        frameLayout.addView(textViewM, LayoutHelper.createFrame(-2, 36, 51));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setLineColors(Theme.getColor(null, Theme.key_dialogInputField, false), Theme.getColor(null, Theme.key_dialogInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedBold, false));
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(5);
        editTextBoldCursor.setCursorColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (iArr[0] != 2) {
                    return;
                }
                StickersAlert.this.checkUrlAvailable(textView, editTextBoldCursor.getText().toString(), false);
            }
        });
        frameLayout.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, 36, 51));
        editTextBoldCursor.setOnEditorActionListener(new ReportAlert$$ExternalSyntheticLambda0(builder, 8));
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new StickersAlert$$ExternalSyntheticLambda25(0, editTextBoldCursor));
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ImportStickersEnterNameInfo)));
        textView.setTextSize(1, 14.0f);
        textView.setPadding(AndroidUtilities.dp(23.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(6.0f));
        textView.setTextColor(getThemedColor(Theme.key_dialogTextGray2));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnShowListener(new AlertsCreator$$ExternalSyntheticLambda63(8, editTextBoldCursor));
        alertDialogCreate.show();
        editTextBoldCursor.requestFocus();
        alertDialogCreate.getButton(-1).setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda50(this, iArr, editTextBoldCursor, textView, textViewM, builder, 3));
    }

    private void updateDescription() {
        if (this.containerView == null || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return;
        }
        MessageObject.isPremiumEmojiPack(this.stickerSet);
    }

    public void updateFields() {
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
        TLRPC.StickerSet stickerSet6;
        boolean z2;
        TLRPC.StickerSet stickerSet7;
        int i = 5;
        int i2 = 0;
        if (this.titleTextView != null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickerSet;
            if (tL_messages_stickerSet == null || (arrayList = tL_messages_stickerSet.documents) == null || arrayList.isEmpty()) {
                ArrayList<Parcelable> arrayList3 = this.importingStickers;
                if (arrayList3 == null) {
                    setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 14), LocaleController.getString(R.string.Close), Theme.key_dialogTextBlue2);
                    return;
                }
                LinkSpanDrawable.LinksTextView linksTextView = this.titleTextView;
                ArrayList<SendMessagesHelper.ImportingSticker> arrayList4 = this.importingStickersPaths;
                linksTextView.setText(LocaleController.formatPluralString("Stickers", arrayList4 != null ? arrayList4.size() : arrayList3.size(), new Object[0]));
                HashMap<String, SendMessagesHelper.ImportingSticker> map = this.uploadImportStickers;
                if (map != null && !map.isEmpty()) {
                    setButton(null, LocaleController.getString(R.string.ImportStickersProcessing), Theme.key_dialogTextGray2);
                    this.pickerBottomLayout.setEnabled(false);
                    return;
                }
                StickersAlert$$ExternalSyntheticLambda0 stickersAlert$$ExternalSyntheticLambda0 = new StickersAlert$$ExternalSyntheticLambda0(this, 13);
                int i3 = R.string.ImportStickers;
                ArrayList arrayList5 = this.importingStickersPaths;
                if (arrayList5 == null) {
                    arrayList5 = this.importingStickers;
                }
                setButton(stickersAlert$$ExternalSyntheticLambda0, LocaleController.formatString("ImportStickers", i3, LocaleController.formatPluralString("Stickers", arrayList5.size(), new Object[0])), Theme.key_dialogTextBlue2);
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
                    spannableStringBuilder.setSpan(new URLSpanNoUnderline(charSequenceReplaceEmoji.subSequence(iStart + 1, iEnd).toString()) {
                        @Override
                        public void onClick(View view) {
                            MessagesController.getInstance(((BottomSheet) StickersAlert.this).currentAccount).openByUserName(getURL(), StickersAlert.this.parentFragment, 1);
                            StickersAlert.this.lambda$showGiftOfferSheet$15();
                        }
                    }, iStart, iEnd, 0);
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
                for (int i4 = 0; i4 < this.stickerSet.documents.size(); i4++) {
                    if (!MessageObject.isFreeEmoji(this.stickerSet.documents.get(i4))) {
                        this.premiumButtonView.setVisibility(0);
                        this.pickerBottomLayout.setBackground(null);
                        setButton(null, null, -1);
                        this.premiumButtonView.setButton(LocaleController.getString(R.string.UnlockPremiumEmoji), new StickersAlert$$ExternalSyntheticLambda0(this, i2), false);
                    }
                }
            }
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.stickerSet;
            if (tL_messages_stickerSet3 == null || (stickerSet6 = tL_messages_stickerSet3.set) == null || !stickerSet6.emojis) {
                z = tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || !mediaDataController.isStickerPackInstalled(stickerSet.id);
            } else {
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = mediaDataController.getStickerSets(5);
                int i5 = 0;
                while (true) {
                    if (stickerSets == null || i5 >= stickerSets.size()) {
                        z2 = false;
                        break;
                    }
                    if (stickerSets.get(i5) != null && stickerSets.get(i5).set != null && stickerSets.get(i5).set.id == this.stickerSet.set.id) {
                        z2 = true;
                        break;
                    }
                    i5++;
                }
                z = !z2;
            }
            StickersAlertCustomButtonDelegate stickersAlertCustomButtonDelegate = this.customButtonDelegate;
            if (stickersAlertCustomButtonDelegate != null) {
                setButton(new StickersAlert$$ExternalSyntheticLambda0(this, i), stickersAlertCustomButtonDelegate.getCustomButtonText(), this.customButtonDelegate.getCustomButtonTextColorKey(), this.customButtonDelegate.getCustomButtonColorKey(), this.customButtonDelegate.getCustomButtonRippleColorKey());
                return;
            }
            if (z) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.stickerSet;
                i = (tL_messages_stickerSet4 == null || (stickerSet5 = tL_messages_stickerSet4.set) == null || !stickerSet5.emojis) ? (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) ? 0 : 1 : 5;
                if (!mediaDataController.areStickersLoaded(i)) {
                    mediaDataController.checkStickers(i);
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
                setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 6), pluralString2, Theme.key_featuredStickers_buttonText, Theme.key_featuredStickers_addButton, Theme.key_featuredStickers_addButtonPressed);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.stickerSet;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z3 = stickerSet8.creator;
                if (z3) {
                    pluralString = LocaleController.getString(this.isEditModeEnabled ? R.string.Done : R.string.EditStickers);
                } else if (stickerSet8.masks) {
                    pluralString = LocaleController.formatPluralString("RemoveManyMasksCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                } else {
                    pluralString = stickerSet8.emojis ? LocaleController.formatPluralString("RemoveManyEmojiCount", tL_messages_stickerSet6.documents.size(), new Object[0]) : LocaleController.formatPluralString("RemoveManyStickersCount", tL_messages_stickerSet6.documents.size(), new Object[0]);
                }
                String str = pluralString;
                if (z3) {
                    setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 9), str, Theme.key_featuredStickers_buttonText, Theme.key_featuredStickers_addButton, Theme.key_featuredStickers_addButtonPressed);
                } else if (this.stickerSet.set.official) {
                    setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 11), str, Theme.key_text_RedBold);
                } else {
                    setButton(new StickersAlert$$ExternalSyntheticLambda0(this, 12), str, Theme.key_text_RedBold);
                }
            }
            this.adapter.notifyDataSetChanged();
        }
    }

    public void updateLayout() {
        if (this.gridView.getChildCount() <= 0) {
            setScrollOffsetY(this.gridView.getPaddingTop());
            return;
        }
        int i = 0;
        View view = null;
        int i2 = -1;
        for (int i3 = 0; i3 < this.gridView.getChildCount(); i3++) {
            View childAt = this.gridView.getChildAt(i3);
            int childAdapterPosition = this.gridView.getChildAdapterPosition(childAt);
            if (i2 == -1 || i2 > childAdapterPosition) {
                view = childAt;
                i2 = childAdapterPosition;
            }
        }
        if (view == null || view.getTop() < 0) {
            runShadowAnimation(0, true);
        } else {
            int top = view.getTop();
            runShadowAnimation(0, false);
            i = top;
        }
        runShadowAnimation(1, true);
        if (this.scrollOffsetY != i) {
            setScrollOffsetY(i);
        }
    }

    private void updateSendButton() {
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

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        SendMessagesHelper.ImportingSticker importingSticker;
        if (i == NotificationCenter.emojiLoaded) {
            RecyclerListView recyclerListView = this.gridView;
            if (recyclerListView != null) {
                int childCount = recyclerListView.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.gridView.getChildAt(i3).invalidate();
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileUploaded) {
            HashMap<String, SendMessagesHelper.ImportingSticker> map = this.uploadImportStickers;
            if (map == null || (importingSticker = map.get((str = (String) objArr[0]))) == null) {
                return;
            }
            importingSticker.uploadMedia(this.currentAccount, (TLRPC.InputFile) objArr[1], new ShareAlert$$ExternalSyntheticLambda12(this, str, importingSticker, 7));
            return;
        }
        if (i == NotificationCenter.fileUploadFailed) {
            HashMap<String, SendMessagesHelper.ImportingSticker> map2 = this.uploadImportStickers;
            if (map2 == null) {
                return;
            }
            SendMessagesHelper.ImportingSticker importingStickerRemove = map2.remove((String) objArr[0]);
            if (importingStickerRemove != null) {
                removeSticker(importingStickerRemove);
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
                loadStickerSet(false);
            }
            updateFields();
        }
    }

    public void disableEditMode() {
        if (this.isEditModeEnabled) {
            this.dragAndDropHelper.attachToRecyclerView(null);
            this.isEditModeEnabled = false;
            this.stickersShaker.stopShake(true);
            AndroidUtilities.forEachViews((RecyclerView) this.gridView, (Consumer) new StickersAlert$$ExternalSyntheticLambda31(0));
            this.optionsButton.postDelayed(new StickersAlert$$ExternalSyntheticLambda32(this, 0), 200L);
            this.pickerBottomLayout.setText(LocaleController.getString(R.string.EditStickers), true);
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        Runnable runnable;
        super.lambda$showGiftOfferSheet$15();
        this.stickersShaker.stopShake(false);
        if (!this.ignoreMasterDismiss && (runnable = this.masterDismissListener) != null) {
            runnable.run();
        }
        Runnable runnable2 = this.onDismissListener;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (this.reqId != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            this.reqId = 0;
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.importingStickers != null) {
            ArrayList<SendMessagesHelper.ImportingSticker> arrayList = this.importingStickersPaths;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    SendMessagesHelper.ImportingSticker importingSticker = this.importingStickersPaths.get(i);
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

    public void enableEditMode() {
        if (this.isEditModeEnabled) {
            return;
        }
        this.dragAndDropHelper.attachToRecyclerView(this.gridView);
        this.isEditModeEnabled = true;
        this.stickersShaker.startShake();
        AndroidUtilities.forEachViews((RecyclerView) this.gridView, (Consumer) new StickersAlert$$ExternalSyntheticLambda31(3));
        this.optionsButton.postDelayed(new StickersAlert$$ExternalSyntheticLambda32(this, 3), 200L);
        this.pickerBottomLayout.setText(LocaleController.getString(R.string.Done), true);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ColorPicker$$ExternalSyntheticLambda7 colorPicker$$ExternalSyntheticLambda7 = new ColorPicker$$ExternalSyntheticLambda7(this, 9);
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(viewGroup, 0, null, null, drawableArr, null, i));
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        this.adapter.getThemeDescriptions(arrayList, colorPicker$$ExternalSyntheticLambda7);
        View view = this.shadow[0];
        int i2 = Theme.key_dialogShadowLine;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.shadow[1], 1, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.gridView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.titleTextView, 4, null, null, null, null, Theme.key_dialogTextBlack));
        TextView textView = this.descriptionTextView;
        if (textView != null) {
            arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, Theme.key_chat_emojiPanelTrendingDescription));
        }
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
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_dialogLinkSelection));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_sheet_other));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_dialogButtonSelector));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, colorPicker$$ExternalSyntheticLambda7, Theme.key_actionBarDefaultSubmenuBackground));
        return arrayList;
    }

    public boolean isClearsInputField() {
        return this.clearsInputField;
    }

    public boolean isShowTooltipWhenToggle() {
        return this.showTooltipWhenToggle;
    }

    public void loadStickerSet(boolean z) {
        String str;
        if (this.inputStickerSet != null) {
            MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
            if (!z) {
                if (this.stickerSet == null && (str = this.inputStickerSet.short_name) != null) {
                    this.stickerSet = mediaDataController.getStickerSetByName(str);
                }
                if (this.stickerSet == null) {
                    this.stickerSet = mediaDataController.getStickerSetById(this.inputStickerSet.id);
                }
            }
            if (this.stickerSet == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.inputStickerSet;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getStickerSet, new ShareAlert$$ExternalSyntheticLambda13(11, this, mediaDataController));
            } else {
                if (this.adapter != null) {
                    updateSendButton();
                    updateFields();
                    this.adapter.notifyDataSetChanged();
                }
                updateDescription();
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
    public void lambda$openCrafting$8() {
        if (ContentPreviewViewer.getInstance().isVisible()) {
            ContentPreviewViewer.getInstance().closeWithMenu();
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Bulletin.addDelegate((FrameLayout) this.containerView, new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public final boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getBottomOffset(int i) {
                if (StickersAlert.this.pickerBottomFrameLayout != null) {
                    return StickersAlert.this.pickerBottomFrameLayout.getHeight();
                }
                return 0;
            }

            @Override
            public final int getLeftPadding() {
                return Bulletin.Delegate.CC.$default$getLeftPadding(this);
            }

            @Override
            public final int getRightPadding() {
                return Bulletin.Delegate.CC.$default$getRightPadding(this);
            }

            @Override
            public final int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public final void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public final void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public final void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }
        });
    }

    @Override
    public void onStop() {
        super.onStop();
        Bulletin.removeDelegate((FrameLayout) this.containerView);
    }

    public void setClearsInputField(boolean z) {
        this.clearsInputField = z;
    }

    public void setCustomButtonDelegate(StickersAlertCustomButtonDelegate stickersAlertCustomButtonDelegate) {
        this.customButtonDelegate = stickersAlertCustomButtonDelegate;
        updateFields();
    }

    public void setInstallDelegate(StickersAlertInstallDelegate stickersAlertInstallDelegate) {
        this.installDelegate = stickersAlertInstallDelegate;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    @Override
    public void setOnDismissListener(Runnable runnable) {
        this.onDismissListener = runnable;
    }

    public void setOnMasterDismiss(Runnable runnable) {
        this.masterDismissListener = runnable;
    }

    public void setShowTooltipWhenToggle(boolean z) {
        this.showTooltipWhenToggle = z;
    }

    @Override
    public void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
    }

    public void updateColors() {
        updateColors(false);
    }

    public void updateStickerSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.stickerSet = tL_messages_stickerSet;
        if (this.adapter != null) {
            updateSendButton();
            updateFields();
            this.adapter.notifyDataSetChanged();
        }
        updateDescription();
        MediaDataController.getInstance(this.currentAccount).preloadStickerSetThumb(this.stickerSet);
        checkPremiumStickers();
    }

    public StickersAlert(Context context, Object obj, TLObject tLObject, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, false, resourcesProvider);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.stickersShaker = new StickersShaker(null);
        this.previewDelegate = new AnonymousClass1();
        this.resourcesProvider = resourcesProvider;
        fixNavigationBar();
        this.parentActivity = (Activity) context;
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
        this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getAttachedStickers, new StickersAlert$$ExternalSyntheticLambda44(0, this, obj, tL_messages_getAttachedStickers, new ShareAlert$$ExternalSyntheticLambda13(12, this, tL_messages_getAttachedStickers)));
        init(context);
    }

    private void setButton(View.OnClickListener onClickListener, String str, int i, int i2, int i3) {
        if (i >= 0) {
            AnimatedTextView animatedTextView = this.pickerBottomLayout;
            this.buttonTextColorKey = i;
            animatedTextView.setTextColor(getThemedColor(i));
        }
        this.pickerBottomLayout.setText(str, false);
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

    public void updateColors(boolean z) {
        this.adapter.updateColors();
        this.titleTextView.setHighlightColor(getThemedColor(Theme.key_dialogLinkSelection));
        this.stickerPreviewLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground) & (-536870913));
        this.optionsButton.setIconColor(getThemedColor(Theme.key_sheet_other));
        this.optionsButton.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false);
        this.optionsButton.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), true);
        this.optionsButton.setPopupItemsSelectorColor(getThemedColor(Theme.key_dialogButtonSelector));
        this.optionsButton.redrawPopup(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        if (this.deleteItem != null) {
            int themedColor = getThemedColor(Theme.key_text_RedBold);
            this.deleteItem.setColors(themedColor, themedColor);
            this.deleteItem.setSelectorColor(Theme.multAlpha(0.1f, themedColor));
            if (this.deleteItem.getRightIcon() != null) {
                this.deleteItem.getRightIcon().setColorFilter(themedColor);
            }
        }
        if (z) {
            if (Theme.animatingColors != null && this.animatingDescriptions == null) {
                ArrayList<ThemeDescription> themeDescriptions = getThemeDescriptions();
                this.animatingDescriptions = themeDescriptions;
                int size = themeDescriptions.size();
                for (int i = 0; i < size; i++) {
                    ThemeDescription themeDescription = this.animatingDescriptions.get(i);
                    ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = themeDescription.delegate;
                    themeDescription.delegate = null;
                }
            }
            int size2 = this.animatingDescriptions.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ThemeDescription themeDescription2 = this.animatingDescriptions.get(i2);
                themeDescription2.setColor(getThemedColor(themeDescription2.currentKey), false, false);
            }
        }
        if (Theme.animatingColors == null && this.animatingDescriptions != null) {
            this.animatingDescriptions = null;
        }
    }

    public static class StickersShaker {
        private static final int MAX_SHAKERS = 6;
        private final List<Float> imageRotations;
        private final List<Float> imageTranslationsX;
        private final List<Float> imageTranslationsY;
        private final List<ValueAnimator> rotateAnimators;
        private final List<ValueAnimator> translateXAnimators;
        private final List<ValueAnimator> translateYAnimators;

        private StickersShaker() {
            this.rotateAnimators = new ArrayList();
            this.translateXAnimators = new ArrayList();
            this.translateYAnimators = new ArrayList();
            this.imageRotations = new ArrayList();
            this.imageTranslationsX = new ArrayList();
            this.imageTranslationsY = new ArrayList();
        }

        private void init() {
            if (this.imageRotations.isEmpty()) {
                for (int i = 0; i < 6; i++) {
                    this.imageRotations.add(Float.valueOf(0.0f));
                    this.imageTranslationsX.add(Float.valueOf(0.0f));
                    this.imageTranslationsY.add(Float.valueOf(0.0f));
                }
            }
        }

        public void lambda$startShake$0(int i, ValueAnimator valueAnimator) {
            List<Float> list = this.imageRotations;
            Float f = (Float) valueAnimator.getAnimatedValue();
            f.getClass();
            list.set(i, f);
        }

        public void lambda$startShake$1(int i, ValueAnimator valueAnimator) {
            List<Float> list = this.imageTranslationsX;
            Float f = (Float) valueAnimator.getAnimatedValue();
            f.getClass();
            list.set(i, f);
        }

        public void lambda$startShake$2(int i, ValueAnimator valueAnimator) {
            List<Float> list = this.imageTranslationsY;
            Float f = (Float) valueAnimator.getAnimatedValue();
            f.getClass();
            list.set(i, f);
        }

        public void lambda$stopShake$3(int i, ValueAnimator valueAnimator) {
            List<Float> list = this.imageRotations;
            Float f = (Float) valueAnimator.getAnimatedValue();
            f.getClass();
            list.set(i, f);
        }

        public void lambda$stopShake$4(int i, ValueAnimator valueAnimator) {
            List<Float> list = this.imageTranslationsX;
            Float f = (Float) valueAnimator.getAnimatedValue();
            f.getClass();
            list.set(i, f);
        }

        public void lambda$stopShake$5(int i, ValueAnimator valueAnimator) {
            List<Float> list = this.imageTranslationsY;
            Float f = (Float) valueAnimator.getAnimatedValue();
            f.getClass();
            list.set(i, f);
        }

        public float getRotationValueForPos(int i) {
            if (this.imageRotations.isEmpty()) {
                return 0.0f;
            }
            return this.imageRotations.get(i - ((i / 6) * 6)).floatValue();
        }

        public float getTranslateXValueForPos(int i) {
            if (this.imageTranslationsX.isEmpty()) {
                return 0.0f;
            }
            return this.imageTranslationsX.get(i - ((i / 6) * 6)).floatValue();
        }

        public float getTranslateYValueForPos(int i) {
            if (this.imageTranslationsY.isEmpty()) {
                return 0.0f;
            }
            return this.imageTranslationsY.get(i - ((i / 6) * 6)).floatValue();
        }

        public void startShake() {
            int i = 4;
            int i2 = 3;
            int i3 = 5;
            stopShake(false);
            init();
            int i4 = 0;
            while (i4 < 6) {
                long jNextFloat = (long) (Utilities.random.nextFloat() * 300);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new StickersAlert$StickersShaker$$ExternalSyntheticLambda0(this, i4, i2));
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setRepeatMode(1);
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.setCurrentPlayTime(jNextFloat);
                long j = 300;
                valueAnimatorOfFloat.setDuration(j);
                valueAnimatorOfFloat.start();
                float fDp = AndroidUtilities.dp(0.5f);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, fDp, 0.0f, -fDp, 0.0f);
                valueAnimatorOfFloat2.addUpdateListener(new StickersAlert$StickersShaker$$ExternalSyntheticLambda0(this, i4, i));
                valueAnimatorOfFloat2.setRepeatCount(-1);
                valueAnimatorOfFloat2.setRepeatMode(1);
                valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat2.setCurrentPlayTime(jNextFloat);
                valueAnimatorOfFloat2.setDuration((long) (((double) 300) * 1.2d));
                valueAnimatorOfFloat2.start();
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, fDp, 0.0f - fDp, 0.0f);
                valueAnimatorOfFloat3.addUpdateListener(new StickersAlert$StickersShaker$$ExternalSyntheticLambda0(this, i4, i3));
                valueAnimatorOfFloat3.setRepeatCount(-1);
                valueAnimatorOfFloat3.setRepeatMode(1);
                valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat3.setCurrentPlayTime(jNextFloat);
                valueAnimatorOfFloat3.setDuration(j);
                valueAnimatorOfFloat3.start();
                this.rotateAnimators.add(valueAnimatorOfFloat);
                this.translateXAnimators.add(valueAnimatorOfFloat2);
                this.translateYAnimators.add(valueAnimatorOfFloat3);
                i4++;
                i2 = 3;
            }
        }

        public void stopShake(boolean z) {
            int i = 2;
            int i2 = 1;
            int i3 = 0;
            for (int i4 = 0; i4 < this.rotateAnimators.size(); i4++) {
                this.rotateAnimators.get(i4).cancel();
                if (z) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.imageRotations.get(i4).floatValue(), 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new StickersAlert$StickersShaker$$ExternalSyntheticLambda0(this, i4, i3));
                    valueAnimatorOfFloat.setDuration(100L);
                    valueAnimatorOfFloat.start();
                }
            }
            for (int i5 = 0; i5 < this.translateXAnimators.size(); i5++) {
                this.translateXAnimators.get(i5).cancel();
                if (z) {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.imageTranslationsX.get(i5).floatValue(), 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new StickersAlert$StickersShaker$$ExternalSyntheticLambda0(this, i5, i2));
                    valueAnimatorOfFloat2.setDuration(100L);
                    valueAnimatorOfFloat2.start();
                }
            }
            for (int i6 = 0; i6 < this.translateYAnimators.size(); i6++) {
                this.translateYAnimators.get(i6).cancel();
                if (z) {
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.imageTranslationsY.get(i6).floatValue(), 0.0f);
                    valueAnimatorOfFloat3.addUpdateListener(new StickersAlert$StickersShaker$$ExternalSyntheticLambda0(this, i6, i));
                    valueAnimatorOfFloat3.setDuration(100L);
                    valueAnimatorOfFloat3.start();
                }
            }
            this.translateYAnimators.clear();
            this.translateXAnimators.clear();
            this.rotateAnimators.clear();
        }

        public StickersShaker(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public StickersAlert(Context context, String str, ArrayList<Parcelable> arrayList, ArrayList<String> arrayList2, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, false, resourcesProvider);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.stickersShaker = new StickersShaker(null);
        this.previewDelegate = new AnonymousClass1();
        fixNavigationBar();
        this.parentActivity = (Activity) context;
        this.importingStickers = arrayList;
        this.importingSoftware = str;
        Utilities.globalQueue.postRunnable(new ShareAlert$$ExternalSyntheticLambda12(this, arrayList, arrayList2, 6));
        init(context);
    }

    public StickersAlert(Context context, Vector<TLRPC.StickerSetCovered> vector, Theme.ResourcesProvider resourcesProvider) {
        super(context, false, false, resourcesProvider);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.stickersShaker = new StickersShaker(null);
        this.previewDelegate = new AnonymousClass1();
        this.resourcesProvider = resourcesProvider;
        fixNavigationBar();
        this.parentActivity = (Activity) context;
        if (vector.objects.isEmpty()) {
            return;
        }
        if (vector.objects.size() == 1) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            this.inputStickerSet = tL_inputStickerSetID;
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            tL_inputStickerSetID.id = stickerSet.id;
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            loadStickerSet(false);
            init(context);
            return;
        }
        ArrayList<TLRPC.StickerSetCovered> arrayList = new ArrayList<>();
        this.stickerSetCovereds = arrayList;
        arrayList.addAll(vector.objects);
        init(context);
        this.gridView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.titleTextView.setVisibility(8);
        this.shadow[0].setVisibility(8);
        this.adapter.notifyDataSetChanged();
    }

    public StickersAlert(Context context, BaseFragment baseFragment, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, StickersAlertDelegate stickersAlertDelegate, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context, false, false, resourcesProvider);
        this.shadowAnimation = new AnimatorSet[2];
        this.shadow = new View[2];
        this.showTooltipWhenToggle = true;
        this.stickersShaker = new StickersShaker(null);
        this.previewDelegate = new AnonymousClass1();
        fixNavigationBar();
        this.delegate = stickersAlertDelegate;
        this.inputStickerSet = inputStickerSet;
        this.stickerSet = tL_messages_stickerSet;
        this.parentFragment = baseFragment;
        loadStickerSet(z);
        init(context);
    }
}
