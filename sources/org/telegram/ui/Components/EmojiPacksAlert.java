package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkn;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.IdenticonActivity;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda22;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda68;
import org.telegram.ui.PremiumPreviewFragment;

public class EmojiPacksAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static Pattern urlPattern;
    public Adapter adapter;
    public int adaptiveEmojiColor;
    public PorterDuffColorFilter adaptiveEmojiColorFilter;
    public final TextView addButtonView;
    public LongSparseArray animatedEmojiDrawables;
    public final FrameLayout buttonsView;
    public final ContentView contentView;
    public final AnonymousClass2 customEmojiPacks;
    public final BaseFragment fragment;
    public final GridLayoutManager gridLayoutManager;
    public boolean hasDescription;
    public final AnimatedFloat highlightAlpha;
    public int highlightEndPosition;
    public int highlightIndex;
    public int highlightStartPosition;
    public final boolean limitCount;
    public final ArticleViewer.PageLayout.AnonymousClass1 listView;
    public ValueAnimator loadAnimator;
    public float loadT;
    public boolean loaded;
    public final PaymentFormActivity.AnonymousClass2 paddingView;
    public ActionBarPopupWindow popupWindow;
    public long premiumButtonClicked;
    public final PremiumButtonView premiumButtonView;
    public final AnonymousClass1 previewDelegate;
    public final CircularProgressDrawable progressDrawable;
    public final TextView removeButtonView;
    public final RecyclerAnimationScrollHelper scrollHelper;
    public final View shadowView;
    public boolean shown;

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
            return true;
        }

        @Override
        public final boolean canAddCaption() {
            return false;
        }

        @Override
        public final boolean canDeleteSticker() {
            return false;
        }

        @Override
        public final boolean canEditSticker() {
            return false;
        }

        @Override
        public final boolean canSchedule() {
            return false;
        }

        @Override
        public final boolean canSendSticker() {
            return true;
        }

        @Override
        public final Boolean canSetAsStatus(TLRPC.Document document) {
            TLRPC.User currentUser;
            if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || !MessageObject.isAnimatedEmoji(document) || (currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser()) == null) {
                return null;
            }
            Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(currentUser);
            return Boolean.valueOf(document != null && (emojiStatusDocumentId == null || emojiStatusDocumentId.longValue() != document.id));
        }

        @Override
        public final void copyEmoji(TLRPC.Document document) {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.findAnimatedEmojiEmoticon(document));
            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document.id, 1.2f, null);
            animatedEmojiSpan.document = document;
            spannableStringBuilderValueOf.setSpan(animatedEmojiSpan, 0, spannableStringBuilderValueOf.length(), 33);
            if (AndroidUtilities.addToClipboard(spannableStringBuilderValueOf)) {
                EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
                zzkn.m(R.string.EmojiCopied, new BulletinFactory((FrameLayout) ((BottomSheet) emojiPacksAlert).containerView, ((BottomSheet) emojiPacksAlert).resourcesProvider));
            }
        }

        @Override
        public final void deleteSticker(TLRPC.Document document) {
        }

        @Override
        public final void editSticker(TLRPC.Document document) {
        }

        @Override
        public final ItemOptions getCustomItemOptions(IntroActivity.AnonymousClass1 anonymousClass1) {
            return null;
        }

        @Override
        public final long getDialogId() {
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
            BaseFragment baseFragment = EmojiPacksAlert.this.fragment;
            if (baseFragment instanceof ChatActivity) {
                return ((ChatActivity) baseFragment).isInScheduleMode();
            }
            return false;
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
            return UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && MessageObject.isAnimatedEmoji(document);
        }

        @Override
        public final boolean needOpen() {
            return true;
        }

        @Override
        public final boolean needRemove() {
            return false;
        }

        @Override
        public final boolean needRemoveFromRecent(TLRPC.Document document) {
            return false;
        }

        @Override
        public final boolean needSend(int i) {
            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
            BaseFragment baseFragment = emojiPacksAlert.fragment;
            if (!(baseFragment instanceof ChatActivity) || !((ChatActivity) baseFragment).canSendMessage()) {
                return false;
            }
            if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                return true;
            }
            return ((ChatActivity) emojiPacksAlert.fragment).getCurrentUser() != null && UserObject.isUserSelf(((ChatActivity) emojiPacksAlert.fragment).getCurrentUser());
        }

        @Override
        public final void newStickerPackSelected(CharSequence charSequence, String str, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
        }

        @Override
        public final void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        }

        @Override
        public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
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
            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
            BaseFragment baseFragment = emojiPacksAlert.fragment;
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).sendAnimatedEmoji(document);
            }
            emojiPacksAlert.onCloseByLink();
            emojiPacksAlert.lambda$showGiftOfferSheet$15();
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
            TLRPC.EmojiStatus tL_emojiStatusEmpty;
            if (document == null) {
                tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = document.id;
                tL_emojiStatusEmpty = tL_emojiStatus;
            }
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            Object tL_emojiStatusEmpty2 = currentUser == null ? new TLRPC.TL_emojiStatusEmpty() : currentUser.emoji_status;
            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
            MessagesController.getInstance(((BottomSheet) emojiPacksAlert).currentAccount).updateEmojiStatus(tL_emojiStatusEmpty);
            EmojiView$2$$ExternalSyntheticLambda1 emojiView$2$$ExternalSyntheticLambda1 = new EmojiView$2$$ExternalSyntheticLambda1(19, this, tL_emojiStatusEmpty2);
            if (document != null) {
                new BulletinFactory((FrameLayout) ((BottomSheet) emojiPacksAlert).containerView, ((BottomSheet) emojiPacksAlert).resourcesProvider).createEmojiBulletin(document, LocaleController.getString(R.string.SetAsEmojiStatusInfo), LocaleController.getString(R.string.UndoNoCaps), emojiView$2$$ExternalSyntheticLambda1).show();
                return;
            }
            Bulletin.SimpleLayout simpleLayout = new Bulletin.SimpleLayout(emojiPacksAlert.getContext(), ((BottomSheet) emojiPacksAlert).resourcesProvider);
            simpleLayout.textView.setText(LocaleController.getString(R.string.RemoveStatusInfo));
            simpleLayout.imageView.setImageResource(R.drawable.msg_settings_premium);
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(emojiPacksAlert.getContext(), ((BottomSheet) emojiPacksAlert).resourcesProvider, true, false);
            undoButton.undoAction = emojiView$2$$ExternalSyntheticLambda1;
            simpleLayout.setButton(undoButton);
            Bulletin.make((FrameLayout) ((BottomSheet) emojiPacksAlert).containerView, simpleLayout, 1500).show();
        }

        @Override
        public final void setIntroSticker(String str) {
        }

        @Override
        public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
        }

        @Override
        public final void sendSticker(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        }
    }

    public final class AnonymousClass2 extends EmojiPacksLoader {
        public final EmojiPacksAlert this$0;

        public AnonymousClass2(int i, ArrayList arrayList, EmojiPacksAlert emojiPacksAlert) {
            super(i, arrayList, emojiPacksAlert);
            this.this$0 = emojiPacksAlert;
        }
    }

    public final class AnonymousClass9 extends ShareAlert {
        public AnonymousClass9(Context context, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
            super(context, str, str2, resourcesProvider);
        }

        @Override
        public final void onSend(androidx.collection.LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(this, longSparseArray, i, 18), 100L);
        }
    }

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            int size;
            ArrayList arrayList;
            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
            boolean zIsPremium = UserConfig.getInstance(((BottomSheet) emojiPacksAlert).currentAccount).isPremium();
            AnonymousClass2 anonymousClass2 = emojiPacksAlert.customEmojiPacks;
            ?? r1 = (zIsPremium || (arrayList = anonymousClass2.stickerSets) == null || arrayList.size() != 1 || !MessageObject.isPremiumEmojiPack((TLRPC.TL_messages_stickerSet) anonymousClass2.stickerSets.get(0))) ? 0 : 1;
            emojiPacksAlert.hasDescription = r1;
            int i = r1 + 1;
            if (anonymousClass2.data != null) {
                int i2 = 0;
                size = 0;
                while (true) {
                    ArrayList[] arrayListArr = anonymousClass2.data;
                    if (i2 >= arrayListArr.length) {
                        break;
                    }
                    ArrayList arrayList2 = arrayListArr[i2];
                    if (arrayList2 != null) {
                        size = (arrayListArr.length == 1 ? arrayList2.size() : Math.min(((EmojiPacksLoader) anonymousClass2).this$0.gridLayoutManager.mSpanCount * 2, arrayList2.size())) + size + 1;
                    }
                    i2++;
                }
            } else {
                size = 0;
            }
            return Math.max(0, anonymousClass2.data.length - 1) + i + size;
        }

        @Override
        public final int getItemViewType(int i) {
            int i2 = 0;
            if (i == 0) {
                return 0;
            }
            int i3 = i - 1;
            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
            if (emojiPacksAlert.hasDescription) {
                if (i3 == 1) {
                    return 3;
                }
                if (i3 > 0) {
                    i3 = i - 2;
                }
            }
            int i4 = 0;
            while (true) {
                ArrayList[] arrayListArr = emojiPacksAlert.customEmojiPacks.data;
                if (i2 >= arrayListArr.length) {
                    return 1;
                }
                if (i3 == i4) {
                    return 2;
                }
                int size = arrayListArr[i2].size();
                if (emojiPacksAlert.customEmojiPacks.data.length > 1) {
                    size = Math.min(emojiPacksAlert.gridLayoutManager.mSpanCount * 2, size);
                }
                int i5 = size + 1 + i4;
                if (i3 == i5) {
                    return 4;
                }
                i4 = i5 + 1;
                i2++;
            }
        }

        public final int getSetHeaderPosition(int i) {
            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
            int i2 = emojiPacksAlert.hasDescription ? 2 : 1;
            int i3 = 0;
            while (true) {
                ArrayList[] arrayListArr = emojiPacksAlert.customEmojiPacks.data;
                if (i3 >= arrayListArr.length || i3 == i) {
                    break;
                }
                int size = arrayListArr[i3].size();
                if (emojiPacksAlert.customEmojiPacks.data.length > 1) {
                    size = Math.min(emojiPacksAlert.gridLayoutManager.mSpanCount * 2, size);
                }
                i2 += size + 2;
                i3++;
            }
            return i2;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            EmojiView.CustomEmoji customEmoji;
            TLRPC.Document document;
            boolean z;
            TextView textView;
            TextView textView2;
            TextView textView3;
            EmojiPacksAlert emojiPacksAlert;
            PremiumButtonView premiumButtonView;
            TLRPC.StickerSet stickerSet;
            ArrayList<TLRPC.Document> arrayList;
            int i2 = i - 1;
            int i3 = viewHolder.mItemViewType;
            EmojiPacksAlert emojiPacksAlert2 = EmojiPacksAlert.this;
            ?? r4 = 0;
            r4 = 0;
            GridLayoutManager gridLayoutManager = emojiPacksAlert2.gridLayoutManager;
            AnonymousClass2 anonymousClass2 = emojiPacksAlert2.customEmojiPacks;
            int i4 = 0;
            View view = viewHolder.itemView;
            if (i3 == 1) {
                if (emojiPacksAlert2.hasDescription) {
                    i2 = i - 2;
                }
                EmojiImageView emojiImageView = (EmojiImageView) view;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    ArrayList[] arrayListArr = anonymousClass2.data;
                    if (i5 >= arrayListArr.length) {
                        customEmoji = null;
                        break;
                    }
                    int size = arrayListArr[i5].size();
                    if (anonymousClass2.data.length > 1) {
                        size = Math.min(gridLayoutManager.mSpanCount * 2, size);
                    }
                    if (i2 > i6 && i2 <= i6 + size) {
                        customEmoji = (EmojiView.CustomEmoji) anonymousClass2.data[i5].get((i2 - i6) - 1);
                        break;
                    } else {
                        i6 += size + 2;
                        i5++;
                    }
                }
                AnimatedEmojiSpan animatedEmojiSpan = emojiImageView.span;
                if ((animatedEmojiSpan != null || customEmoji == null) && ((customEmoji != null || animatedEmojiSpan == null) && (customEmoji == null || animatedEmojiSpan.documentId == customEmoji.documentId))) {
                    return;
                }
                if (customEmoji == null) {
                    emojiImageView.span = null;
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = customEmoji.stickerSet;
                TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                tL_inputStickerSetID.id = stickerSet2.id;
                tL_inputStickerSetID.short_name = stickerSet2.short_name;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                if (tL_messages_stickerSet.documents != null) {
                    while (true) {
                        if (i4 >= customEmoji.stickerSet.documents.size()) {
                            document = null;
                            break;
                        }
                        document = customEmoji.stickerSet.documents.get(i4);
                        if (document != null && document.id == customEmoji.documentId) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else {
                    document = null;
                    break;
                }
                if (document == null) {
                    emojiImageView.span = new AnimatedEmojiSpan(customEmoji.documentId, 1.2f, null);
                    return;
                }
                AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(document.id, 1.2f, null);
                animatedEmojiSpan2.document = document;
                emojiImageView.span = animatedEmojiSpan2;
                return;
            }
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                TextView textView4 = (TextView) view;
                textView4.setTextSize(1, 13.0f);
                textView4.setTextColor(emojiPacksAlert2.getThemedColor(Theme.key_chat_emojiPanelTrendingDescription));
                textView4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PremiumPreviewEmojiPack)));
                textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(14.0f));
                return;
            }
            if (emojiPacksAlert2.hasDescription && i2 > 0) {
                i2 = i - 2;
            }
            int i7 = 0;
            int i8 = 0;
            while (true) {
                ArrayList[] arrayListArr2 = anonymousClass2.data;
                if (i7 >= arrayListArr2.length) {
                    break;
                }
                int size2 = arrayListArr2[i7].size();
                if (anonymousClass2.data.length > 1) {
                    size2 = Math.min(gridLayoutManager.mSpanCount * 2, size2);
                }
                if (i2 == i8) {
                    break;
                }
                i8 += size2 + 2;
                i7++;
            }
            ArrayList arrayList2 = anonymousClass2.stickerSets;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (arrayList2 == null || i7 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) anonymousClass2.stickerSets.get(i7);
            if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.documents != null) {
                int i9 = 0;
                while (true) {
                    if (i9 >= tL_messages_stickerSet2.documents.size()) {
                        z = false;
                        break;
                    } else {
                        if (!MessageObject.isFreeEmoji(tL_messages_stickerSet2.documents.get(i9))) {
                            z = true;
                            break;
                        }
                        i9++;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (i7 < anonymousClass2.data.length) {
                final EmojiPackHeader emojiPackHeader = (EmojiPackHeader) view;
                int size3 = (tL_messages_stickerSet2 == null || (arrayList = tL_messages_stickerSet2.documents) == null) ? 0 : arrayList.size();
                emojiPackHeader.set = tL_messages_stickerSet2;
                ?? r2 = emojiPackHeader.titleView;
                if (tL_messages_stickerSet2 == null || tL_messages_stickerSet2.set == null) {
                    r2.setText(null);
                } else {
                    try {
                        if (EmojiPacksAlert.urlPattern == null) {
                            EmojiPacksAlert.urlPattern = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                        }
                        Matcher matcher = EmojiPacksAlert.urlPattern.matcher(tL_messages_stickerSet2.set.title);
                        while (true) {
                            ?? r5 = r4;
                            if (!matcher.find()) {
                                break;
                            }
                            if (r4 == 0) {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messages_stickerSet2.set.title);
                                try {
                                    r2.setMovementMethod(new IdenticonActivity.LinkMovementMethodMy(1));
                                    r5 = spannableStringBuilder;
                                } catch (Exception e) {
                                    e = e;
                                    r4 = spannableStringBuilder;
                                    FileLog.e(e);
                                    if (r4 == 0) {
                                        r4 = tL_messages_stickerSet2.set.title;
                                    }
                                    r2.setText(r4);
                                    textView = emojiPackHeader.subtitleView;
                                    if (textView != null) {
                                        if (tL_messages_stickerSet2 != null) {
                                            textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                                        } else {
                                            textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                                        }
                                    }
                                    textView2 = emojiPackHeader.removeButtonView;
                                    textView3 = emojiPackHeader.addButtonView;
                                    emojiPacksAlert = emojiPackHeader.this$0;
                                    premiumButtonView = emojiPackHeader.unlockButtonView;
                                    if (!z) {
                                    }
                                    if (premiumButtonView != null) {
                                        premiumButtonView.setVisibility(8);
                                    }
                                    if (textView3 != null) {
                                        textView3.setVisibility(0);
                                    }
                                    if (textView2 != null) {
                                        textView2.setVisibility(0);
                                    }
                                    emojiPackHeader.toggle(tL_messages_stickerSet2 == null && MediaDataController.getInstance(((BottomSheet) emojiPacksAlert).currentAccount).isStickerPackInstalled(tL_messages_stickerSet2.set.id), false);
                                }
                            }
                            int iStart = matcher.start();
                            int iEnd = matcher.end();
                            if (tL_messages_stickerSet2.set.title.charAt(iStart) != '@') {
                                iStart++;
                            }
                            r5.setSpan(new URLSpanNoUnderline(tL_messages_stickerSet2.set.title.subSequence(iStart + 1, iEnd).toString()) {
                                @Override
                                public final void onClick(View view2) {
                                    EmojiPackHeader emojiPackHeader2 = EmojiPackHeader.this;
                                    MessagesController messagesController = MessagesController.getInstance(((BottomSheet) emojiPackHeader2.this$0).currentAccount);
                                    String url = getURL();
                                    EmojiPacksAlert emojiPacksAlert3 = emojiPackHeader2.this$0;
                                    messagesController.openByUserName(url, emojiPacksAlert3.fragment, 1);
                                    emojiPacksAlert3.onCloseByLink();
                                    emojiPacksAlert3.lambda$showGiftOfferSheet$15();
                                }
                            }, iStart, iEnd, 0);
                            r4 = r5;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r4 = r4;
                    }
                    if (r4 == 0) {
                        r4 = tL_messages_stickerSet2.set.title;
                    }
                    r2.setText(r4);
                }
                textView = emojiPackHeader.subtitleView;
                if (textView != null) {
                    if (tL_messages_stickerSet2 != null || (stickerSet = tL_messages_stickerSet2.set) == null || stickerSet.emojis) {
                        textView.setText(LocaleController.formatPluralString("EmojiCount", size3, new Object[0]));
                    } else {
                        textView.setText(LocaleController.formatPluralString("Stickers", size3, new Object[0]));
                    }
                }
                textView2 = emojiPackHeader.removeButtonView;
                textView3 = emojiPackHeader.addButtonView;
                emojiPacksAlert = emojiPackHeader.this$0;
                premiumButtonView = emojiPackHeader.unlockButtonView;
                if (!z && premiumButtonView != null && !UserConfig.getInstance(((BottomSheet) emojiPacksAlert).currentAccount).isPremium()) {
                    premiumButtonView.setVisibility(0);
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (premiumButtonView != null) {
                    premiumButtonView.setVisibility(8);
                }
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                emojiPackHeader.toggle(tL_messages_stickerSet2 == null && MediaDataController.getInstance(((BottomSheet) emojiPacksAlert).currentAccount).isStickerPackInstalled(tL_messages_stickerSet2.set.id), false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View separatorView;
            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
            if (i == 0) {
                view = emojiPacksAlert.paddingView;
            } else {
                if (i == 1) {
                    separatorView = new EmojiImageView(emojiPacksAlert.getContext());
                } else if (i == 2) {
                    separatorView = new EmojiPackHeader(emojiPacksAlert, emojiPacksAlert.getContext(), emojiPacksAlert.customEmojiPacks.data.length <= 1);
                } else if (i == 3) {
                    separatorView = new TextView(emojiPacksAlert.getContext());
                } else if (i == 4) {
                    separatorView = new SeparatorView(emojiPacksAlert.getContext());
                    int i2 = Theme.key_chat_emojiPanelShadowLine;
                    Pattern pattern = EmojiPacksAlert.urlPattern;
                    separatorView.setBackgroundColor(emojiPacksAlert.getThemedColor(i2));
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, AndroidUtilities.getShadowHeight());
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AndroidUtilities.dp(14.0f);
                    separatorView.setLayoutParams(layoutParams);
                } else {
                    view = null;
                }
                view = separatorView;
            }
            return new RecyclerListView.Holder(view);
        }
    }

    public final class ContentView extends FrameLayout {
        public boolean attached;
        public Boolean lastOpen;
        public final ArrayList lineDrawables;
        public final ArrayList lineDrawablesTmp;
        public final Paint paint;
        public final Path path;
        public ImageReceiver previewImageReceiver;
        public boolean previewImageVisible;
        public final AnimatedFloat previewImageVisibleT;
        public final AnimatedFloat statusBarT;
        public final ArrayList unusedArrays;
        public final ArrayList unusedLineDrawables;
        public final SparseArray viewsGroupedByLines;

        public final class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
            public final ArrayList drawInBackgroundViews = new ArrayList();
            public ArrayList imageViewEmojis;
            public int position;

            public DrawingInBackgroundLine() {
            }

            @Override
            public final void draw(Canvas canvas, long j, int i, int i2, float f) {
                ArrayList arrayList = this.imageViewEmojis;
                if (arrayList == null) {
                    return;
                }
                boolean z = true;
                int i3 = 0;
                boolean z2 = arrayList.size() <= 3 || SharedConfig.getDevicePerformanceClass() == 0;
                if (!z2) {
                    while (true) {
                        if (i3 >= this.imageViewEmojis.size()) {
                            z = z2;
                            break;
                        }
                        EmojiImageView emojiImageView = (EmojiImageView) this.imageViewEmojis.get(i3);
                        if (emojiImageView.pressedProgress != 0.0f || emojiImageView.backAnimator != null || emojiImageView.getTranslationX() != 0.0f || emojiImageView.getTranslationY() != 0.0f || emojiImageView.getAlpha() != 1.0f) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    z = z2;
                    break;
                }
                if (!z) {
                    super.draw(canvas, j, i, i2, 1.0f);
                    return;
                }
                prepareDraw(System.currentTimeMillis());
                drawInUiThread(canvas, 1.0f);
                reset();
            }

            @Override
            public final void drawInBackground(Canvas canvas) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.drawInBackgroundViews;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    EmojiImageView emojiImageView = (EmojiImageView) arrayList.get(i);
                    emojiImageView.imageReceiver.draw(canvas, emojiImageView.backgroundThreadDrawHolder[this.threadIndex]);
                    i++;
                }
            }

            @Override
            public final void drawInUiThread(Canvas canvas, float f) {
                AnimatedEmojiDrawable animatedEmojiDrawable;
                if (this.imageViewEmojis != null) {
                    for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                        EmojiImageView emojiImageView = (EmojiImageView) this.imageViewEmojis.get(i);
                        AnimatedEmojiSpan animatedEmojiSpan = emojiImageView.span;
                        if (animatedEmojiSpan != null && (animatedEmojiDrawable = (AnimatedEmojiDrawable) EmojiPacksAlert.this.animatedEmojiDrawables.get(animatedEmojiSpan.getDocumentId())) != null && animatedEmojiDrawable.imageReceiver != null && emojiImageView.imageReceiver != null) {
                            animatedEmojiDrawable.setAlpha((int) (emojiImageView.getAlpha() * 255.0f * f));
                            float width = ((emojiImageView.getWidth() - emojiImageView.getPaddingLeft()) - emojiImageView.getPaddingRight()) / 2.0f;
                            float height = ((emojiImageView.getHeight() - emojiImageView.getPaddingTop()) - emojiImageView.getPaddingBottom()) / 2.0f;
                            float right = (emojiImageView.getRight() + emojiImageView.getLeft()) / 2.0f;
                            float paddingTop = emojiImageView.getPaddingTop() + height;
                            float f2 = emojiImageView.pressedProgress;
                            float f3 = f2 != 0.0f ? 1.0f * (((1.0f - f2) * 0.2f) + 0.8f) : 1.0f;
                            animatedEmojiDrawable.setBounds((int) (right - ((emojiImageView.getScaleX() * width) * f3)), (int) (paddingTop - ((emojiImageView.getScaleY() * height) * f3)), (int) ((emojiImageView.getScaleX() * width * f3) + right), (int) ((emojiImageView.getScaleY() * height * f3) + paddingTop));
                            animatedEmojiDrawable.draw(canvas);
                        }
                    }
                }
            }

            @Override
            public final void onFrameReady() {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.drawInBackgroundViews;
                    if (i >= arrayList.size()) {
                        ((BottomSheet) EmojiPacksAlert.this).containerView.invalidate();
                        return;
                    } else {
                        ((EmojiImageView) arrayList.get(i)).backgroundThreadDrawHolder[this.threadIndex].release();
                        i++;
                    }
                }
            }

            @Override
            public final void prepareDraw(long j) {
                ArrayList arrayList = this.drawInBackgroundViews;
                arrayList.clear();
                for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                    EmojiImageView emojiImageView = (EmojiImageView) this.imageViewEmojis.get(i);
                    AnimatedEmojiSpan animatedEmojiSpan = emojiImageView.span;
                    if (animatedEmojiSpan != null) {
                        ContentView contentView = ContentView.this;
                        AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) EmojiPacksAlert.this.animatedEmojiDrawables.get(animatedEmojiSpan.getDocumentId());
                        if (animatedEmojiDrawable != null && animatedEmojiDrawable.imageReceiver != null) {
                            animatedEmojiDrawable.update(j);
                            PhotoViewer.AnonymousClass11 anonymousClass11 = animatedEmojiDrawable.imageReceiver;
                            ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = emojiImageView.backgroundThreadDrawHolder;
                            int i2 = this.threadIndex;
                            backgroundThreadDrawHolderArr[i2] = anonymousClass11.setDrawInBackgroundThread(backgroundThreadDrawHolderArr[i2], i2);
                            backgroundThreadDrawHolderArr[i2].time = j;
                            animatedEmojiDrawable.setAlpha(255);
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(emojiImageView.getPaddingLeft() + emojiImageView.getLeft(), emojiImageView.getPaddingTop(), emojiImageView.getRight() - emojiImageView.getPaddingRight(), emojiImageView.getMeasuredHeight() - emojiImageView.getPaddingBottom());
                            backgroundThreadDrawHolderArr[i2].setBounds(rect);
                            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
                            int themedColor = emojiPacksAlert.getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
                            if (themedColor != emojiPacksAlert.adaptiveEmojiColor || emojiPacksAlert.adaptiveEmojiColorFilter == null) {
                                emojiPacksAlert.adaptiveEmojiColor = themedColor;
                                emojiPacksAlert.adaptiveEmojiColorFilter = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                            }
                            animatedEmojiDrawable.setColorFilter(emojiPacksAlert.adaptiveEmojiColorFilter);
                            emojiImageView.imageReceiver = animatedEmojiDrawable.imageReceiver;
                            arrayList.add(emojiImageView);
                        }
                    }
                }
            }
        }

        public ContentView(Context context) {
            super(context);
            this.paint = new Paint();
            this.path = new Path();
            this.lastOpen = null;
            this.viewsGroupedByLines = new SparseArray();
            this.lineDrawables = new ArrayList();
            this.lineDrawablesTmp = new ArrayList();
            this.unusedArrays = new ArrayList();
            this.unusedLineDrawables = new ArrayList();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.statusBarT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
            this.previewImageVisibleT = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            float f2;
            SparseArray sparseArray;
            ArrayList arrayList;
            ArrayList arrayList2;
            DrawingInBackgroundLine drawingInBackgroundLine;
            DrawingInBackgroundLine drawingInBackgroundLine2;
            AnimatedEmojiSpan animatedEmojiSpan;
            Canvas canvas2 = canvas;
            if (this.attached) {
                Paint paint = this.paint;
                int i = Theme.key_dialogBackground;
                EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
                paint.setColor(emojiPacksAlert.getThemedColor(i));
                float f3 = 1.0f;
                paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.default_shadow_color);
                Path path = this.path;
                path.reset();
                float listTop = emojiPacksAlert.getListTop();
                float f4 = this.statusBarT.set(listTop <= ((float) ((BottomSheet) emojiPacksAlert).containerView.getPaddingTop()));
                float fLerp = AndroidUtilities.lerp(listTop, 0.0f, f4);
                if (this.previewImageReceiver != null) {
                    float fDp = AndroidUtilities.dp(140.0f);
                    f = 20.0f;
                    float fDp2 = AndroidUtilities.dp(20.0f);
                    if (fLerp < fDp + fDp2) {
                        this.previewImageVisible = false;
                    }
                    f2 = 2.0f;
                    this.previewImageReceiver.setAlpha(this.previewImageVisibleT.set(this.previewImageVisible));
                    if (this.previewImageReceiver.getAlpha() > 0.0f) {
                        float alpha = ((this.previewImageReceiver.getAlpha() * 0.4f) + 0.6f) * fDp;
                        float f5 = alpha / 2.0f;
                        this.previewImageReceiver.setImageCoords((getWidth() / 2.0f) - f5, ((fLerp - fDp2) - (fDp / 2.0f)) - f5, alpha, alpha);
                        this.previewImageReceiver.draw(canvas2);
                    } else {
                        this.previewImageReceiver.onDetachedFromWindow();
                        this.previewImageReceiver = null;
                    }
                } else {
                    f = 20.0f;
                    f2 = 2.0f;
                }
                float fDp3 = AndroidUtilities.dp((1.0f - f4) * 14.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getPaddingLeft(), fLerp, getWidth() - getPaddingRight(), getBottom() + fDp3);
                path.addRoundRect(rectF, fDp3, fDp3, Path.Direction.CW);
                canvas2.drawPath(path, paint);
                boolean z = f4 > 0.5f;
                Boolean bool = this.lastOpen;
                if (bool == null || z != bool.booleanValue()) {
                    this.lastOpen = Boolean.valueOf(z);
                    boolean z2 = AndroidUtilities.computePerceivedBrightness(emojiPacksAlert.getThemedColor(i)) > 0.721f;
                    boolean z3 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(emojiPacksAlert.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                    if (!z) {
                        z2 = z3;
                    }
                    AndroidUtilities.setLightStatusBar(emojiPacksAlert, z2);
                }
                Theme.dialogs_onlineCirclePaint.setColor(emojiPacksAlert.getThemedColor(Theme.key_sheet_scrollUp));
                Theme.dialogs_onlineCirclePaint.setAlpha((int) (MathUtils.clamp(fLerp / AndroidUtilities.dp(f), 0.0f, 1.0f) * Theme.dialogs_onlineCirclePaint.getAlpha()));
                int iDp = AndroidUtilities.dp(36.0f);
                float fDp4 = fLerp + AndroidUtilities.dp(10.0f);
                rectF.set((getMeasuredWidth() - iDp) / 2, fDp4, (getMeasuredWidth() + iDp) / 2, AndroidUtilities.dp(4.0f) + fDp4);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), Theme.dialogs_onlineCirclePaint);
                View view = emojiPacksAlert.shadowView;
                ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = emojiPacksAlert.listView;
                view.setVisibility((anonymousClass1.canScrollVertically(1) || emojiPacksAlert.removeButtonView.getVisibility() == 0) ? 0 : 4);
                if (anonymousClass1 != null) {
                    canvas2.save();
                    canvas2.translate(anonymousClass1.getLeft(), anonymousClass1.getY() + 0.0f);
                    canvas2.clipRect(0, 0, anonymousClass1.getWidth(), anonymousClass1.getHeight());
                    canvas2.saveLayerAlpha(0.0f, 0.0f, anonymousClass1.getWidth(), anonymousClass1.getHeight(), (int) (anonymousClass1.getAlpha() * 255.0f), 31);
                    int i2 = 0;
                    while (true) {
                        sparseArray = this.viewsGroupedByLines;
                        int size = sparseArray.size();
                        arrayList = this.unusedArrays;
                        if (i2 >= size) {
                            break;
                        }
                        ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i2);
                        arrayList3.clear();
                        arrayList.add(arrayList3);
                        i2++;
                    }
                    sparseArray.clear();
                    int i3 = 0;
                    while (i3 < anonymousClass1.getChildCount()) {
                        View childAt = anonymousClass1.getChildAt(i3);
                        if (childAt instanceof EmojiImageView) {
                            EmojiImageView emojiImageView = (EmojiImageView) childAt;
                            if (emojiImageView.isPressed()) {
                                float f6 = emojiImageView.pressedProgress;
                                if (f6 != f3) {
                                    emojiImageView.pressedProgress = Utilities.clamp(f6 + 0.16f, f3, 0.0f);
                                    emojiImageView.invalidate();
                                }
                            }
                            if (emojiPacksAlert.animatedEmojiDrawables != null && (animatedEmojiSpan = emojiImageView.span) != null) {
                                AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) emojiPacksAlert.animatedEmojiDrawables.get(animatedEmojiSpan.getDocumentId());
                                if (animatedEmojiDrawable != null) {
                                    int themedColor = emojiPacksAlert.getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
                                    if (themedColor != emojiPacksAlert.adaptiveEmojiColor || emojiPacksAlert.adaptiveEmojiColorFilter == null) {
                                        emojiPacksAlert.adaptiveEmojiColor = themedColor;
                                        emojiPacksAlert.adaptiveEmojiColorFilter = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN);
                                    }
                                    animatedEmojiDrawable.setColorFilter(emojiPacksAlert.adaptiveEmojiColorFilter);
                                    ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                    if (arrayList4 == null) {
                                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) arrayList.remove(arrayList.size() - 1) : new ArrayList();
                                        sparseArray.put(childAt.getTop(), arrayList4);
                                    }
                                    arrayList4.add(emojiImageView);
                                }
                            }
                        } else {
                            canvas2.save();
                            canvas2.translate(childAt.getLeft(), childAt.getTop());
                            childAt.draw(canvas2);
                            canvas2.restore();
                        }
                        i3++;
                        f3 = 1.0f;
                    }
                    ArrayList arrayList5 = this.lineDrawablesTmp;
                    arrayList5.clear();
                    ArrayList arrayList6 = this.lineDrawables;
                    arrayList5.addAll(arrayList6);
                    arrayList6.clear();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i4 = 0;
                    while (true) {
                        int size2 = sparseArray.size();
                        arrayList2 = this.unusedLineDrawables;
                        if (i4 >= size2) {
                            break;
                        }
                        ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i4);
                        View view2 = (View) arrayList7.get(0);
                        anonymousClass1.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(view2);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList5.size()) {
                                drawingInBackgroundLine = null;
                                break;
                            } else {
                                if (((DrawingInBackgroundLine) arrayList5.get(i5)).position == childAdapterPosition) {
                                    drawingInBackgroundLine = (DrawingInBackgroundLine) arrayList5.get(i5);
                                    arrayList5.remove(i5);
                                    break;
                                }
                                i5++;
                            }
                        }
                        if (drawingInBackgroundLine == null) {
                            if (arrayList2.isEmpty()) {
                                drawingInBackgroundLine2 = new DrawingInBackgroundLine();
                                drawingInBackgroundLine2.currentLayerNum = 7;
                                if (drawingInBackgroundLine2.attachedToWindow) {
                                    drawingInBackgroundLine2.currentOpenedLayerFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~drawingInBackgroundLine2.currentLayerNum);
                                }
                            } else {
                                drawingInBackgroundLine2 = (DrawingInBackgroundLine) arrayList2.remove(arrayList2.size() - 1);
                            }
                            drawingInBackgroundLine = drawingInBackgroundLine2;
                            drawingInBackgroundLine.position = childAdapterPosition;
                            drawingInBackgroundLine.onAttachToWindow();
                        }
                        arrayList6.add(drawingInBackgroundLine);
                        drawingInBackgroundLine.imageViewEmojis = arrayList7;
                        canvas2.save();
                        canvas2.translate(0.0f, view2.getY() + view2.getPaddingTop());
                        int measuredWidth = getMeasuredWidth();
                        int measuredHeight = view2.getMeasuredHeight() - view2.getPaddingBottom();
                        int i6 = i4;
                        Canvas canvas3 = canvas2;
                        drawingInBackgroundLine.draw(canvas3, jCurrentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                        canvas2 = canvas3;
                        canvas2.restore();
                        i4 = i6 + 1;
                    }
                    for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                        if (arrayList2.size() < 3) {
                            arrayList2.add((DrawingInBackgroundLine) arrayList5.get(i7));
                            ((DrawingInBackgroundLine) arrayList5.get(i7)).imageViewEmojis = null;
                            ((DrawingInBackgroundLine) arrayList5.get(i7)).reset();
                        } else {
                            ((DrawingInBackgroundLine) arrayList5.get(i7)).onDetachFromWindow();
                        }
                    }
                    arrayList5.clear();
                    canvas2.restore();
                    canvas2.restore();
                    if (anonymousClass1.getAlpha() < 1.0f) {
                        int width = getWidth() / 2;
                        int height = (getHeight() + ((int) fDp4)) / 2;
                        int iDp2 = AndroidUtilities.dp(16.0f);
                        CircularProgressDrawable circularProgressDrawable = emojiPacksAlert.progressDrawable;
                        circularProgressDrawable.paint.setAlpha((int) ((1.0f - anonymousClass1.getAlpha()) * 255.0f));
                        circularProgressDrawable.setBounds(width - iDp2, height - iDp2, width + iDp2, height + iDp2);
                        circularProgressDrawable.draw(canvas2);
                        invalidate();
                    }
                }
                super.dispatchDraw(canvas);
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                float y = motionEvent.getY();
                EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
                if (y < emojiPacksAlert.getListTop() - AndroidUtilities.dp(6.0f)) {
                    emojiPacksAlert.lambda$showGiftOfferSheet$15();
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            ImageReceiver imageReceiver = this.previewImageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onAttachedToWindow();
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            ArrayList arrayList;
            super.onDetachedFromWindow();
            int i = 0;
            this.attached = false;
            int i2 = 0;
            while (true) {
                arrayList = this.lineDrawables;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((DrawingInBackgroundLine) arrayList.get(i2)).onDetachFromWindow();
                i2++;
            }
            while (true) {
                ArrayList arrayList2 = this.unusedLineDrawables;
                if (i >= arrayList2.size()) {
                    break;
                }
                ((DrawingInBackgroundLine) arrayList2.get(i)).onDetachFromWindow();
                i++;
            }
            arrayList.clear();
            AnimatedEmojiSpan.release(this, (LongSparseArray<AnimatedEmojiDrawable>) EmojiPacksAlert.this.animatedEmojiDrawables);
            ImageReceiver imageReceiver = this.previewImageReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
            }
        }

        public final void updateEmojiDrawables() {
            AnimatedEmojiSpan[] animatedEmojiSpanArr;
            EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
            ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = emojiPacksAlert.listView;
            if (anonymousClass1 == null) {
                animatedEmojiSpanArr = new AnimatedEmojiSpan[0];
            } else {
                animatedEmojiSpanArr = new AnimatedEmojiSpan[anonymousClass1.getChildCount()];
                for (int i = 0; i < emojiPacksAlert.listView.getChildCount(); i++) {
                    View childAt = emojiPacksAlert.listView.getChildAt(i);
                    if (childAt instanceof EmojiImageView) {
                        animatedEmojiSpanArr[i] = ((EmojiImageView) childAt).span;
                    }
                }
            }
            emojiPacksAlert.animatedEmojiDrawables = AnimatedEmojiSpan.update(3, this, animatedEmojiSpanArr, (LongSparseArray<AnimatedEmojiDrawable>) emojiPacksAlert.animatedEmojiDrawables);
        }
    }

    public final class EmojiImageView extends View {
        public ValueAnimator backAnimator;
        public final ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
        public PhotoViewer.AnonymousClass11 imageReceiver;
        public float pressedProgress;
        public AnimatedEmojiSpan span;

        public EmojiImageView(Context context) {
            super(context);
            this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
        }

        public TLRPC.Document getDocument() {
            AnimatedEmojiSpan animatedEmojiSpan = this.span;
            if (animatedEmojiSpan == null) {
                return null;
            }
            TLRPC.Document document = animatedEmojiSpan.document;
            if (document != null) {
                return document;
            }
            return AnimatedEmojiDrawable.findDocument(UserConfig.selectedAccount, animatedEmojiSpan.getDocumentId());
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            if (isPressed() != z) {
                super.setPressed(z);
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 5));
                    this.backAnimator.addListener(new CheckBox.AnonymousClass1(this, 27));
                    this.backAnimator.setInterpolator(new OvershootInterpolator(5.0f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }
    }

    public final class EmojiPackHeader extends FrameLayout {
        public final TextView addButtonView;
        public ValueAnimator animator;
        public final SendGiftSheet.AnonymousClass8 dummyFragment;
        public final ActionBarMenuItem optionsButton;
        public final TextView removeButtonView;
        public TLRPC.TL_messages_stickerSet set;
        public final boolean single;
        public final TextView subtitleView;
        public final EmojiPacksAlert this$0;
        public final LinkSpanDrawable.LinksTextView titleView;
        public float toggleT;
        public boolean toggled;
        public final PremiumButtonView unlockButtonView;

        public EmojiPackHeader(EmojiPacksAlert emojiPacksAlert, Context context, boolean z) {
            float fMax;
            float f;
            float f2;
            super(context);
            final int i = 1;
            this.this$0 = emojiPacksAlert;
            final int i2 = 2;
            this.dummyFragment = new SendGiftSheet.AnonymousClass8(this, i2);
            final int i3 = 0;
            this.toggled = false;
            this.toggleT = 0.0f;
            this.single = z;
            if (z) {
                fMax = 32.0f;
            } else {
                float fDp = 8.0f;
                if (UserConfig.getInstance(((BottomSheet) emojiPacksAlert).currentAccount).isPremium()) {
                    f = 28.0f;
                    f2 = 16.0f;
                } else {
                    f2 = 16.0f;
                    f = 28.0f;
                    PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(4.0f), context, ((BottomSheet) emojiPacksAlert).resourcesProvider, false);
                    this.unlockButtonView = premiumButtonView;
                    premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new View.OnClickListener(this) {
                        public final EmojiPacksAlert.EmojiPackHeader f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            EmojiPacksAlert.EmojiPackHeader emojiPackHeader = this.f$0;
                            switch (i3) {
                                case 0:
                                    emojiPackHeader.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    EmojiPacksAlert emojiPacksAlert2 = emojiPackHeader.this$0;
                                    emojiPacksAlert2.premiumButtonClicked = jElapsedRealtime;
                                    BaseFragment baseFragment = emojiPacksAlert2.fragment;
                                    if (baseFragment != null) {
                                        new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
                                    } else if (emojiPacksAlert2.getContext() instanceof LaunchActivity) {
                                        ((LaunchActivity) emojiPacksAlert2.getContext()).presentFragment(new PremiumPreviewFragment(0, null));
                                    }
                                    break;
                                case 1:
                                    EmojiPacksAlert.installSet(emojiPackHeader.dummyFragment, emojiPackHeader.set, true, null, null);
                                    emojiPackHeader.toggle(true, true);
                                    break;
                                case 2:
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = emojiPackHeader.set;
                                    HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = new HintView$1$$ExternalSyntheticLambda0(emojiPackHeader, 3);
                                    Pattern pattern = EmojiPacksAlert.urlPattern;
                                    SendGiftSheet.AnonymousClass8 anonymousClass8 = emojiPackHeader.dummyFragment;
                                    if (anonymousClass8 != null && tL_messages_stickerSet != null && anonymousClass8.getFragmentView() != null) {
                                        MediaDataController.getInstance(anonymousClass8.getCurrentAccount()).toggleStickerSet(anonymousClass8.getFragmentView().getContext(), tL_messages_stickerSet, 0, anonymousClass8, true, true, hintView$1$$ExternalSyntheticLambda0, true);
                                    }
                                    emojiPackHeader.toggle(false, true);
                                    break;
                                default:
                                    emojiPackHeader.optionsButton.toggleSubMenu(null, null);
                                    break;
                            }
                        }
                    }, false);
                    premiumButtonView.setIcon(R.raw.unlock_icon);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) premiumButtonView.getIconView().getLayoutParams();
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
                    marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
                    int iDp = AndroidUtilities.dp(20.0f);
                    marginLayoutParams.height = iDp;
                    marginLayoutParams.width = iDp;
                    ((ViewGroup.MarginLayoutParams) premiumButtonView.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
                    premiumButtonView.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                    addView(premiumButtonView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                    premiumButtonView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                    fDp = (AndroidUtilities.dp(16.0f) + premiumButtonView.getMeasuredWidth()) / AndroidUtilities.density;
                }
                TextView textView = new TextView(context);
                this.addButtonView = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(emojiPacksAlert.getThemedColor(Theme.key_featuredStickers_buttonText));
                int i4 = Theme.key_featuredStickers_addButton;
                int themedColor = emojiPacksAlert.getThemedColor(i4);
                textView.setBackground(Theme.AdaptiveRipple.createRect(new float[]{14.0f}, themedColor, Theme.AdaptiveRipple.calcRippleColor(themedColor)));
                textView.setPadding(zzlm.m(18.0f, R.string.Add, textView), 0, AndroidUtilities.dp(18.0f), 0);
                textView.setGravity(17);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final EmojiPacksAlert.EmojiPackHeader f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        EmojiPacksAlert.EmojiPackHeader emojiPackHeader = this.f$0;
                        switch (i) {
                            case 0:
                                emojiPackHeader.getClass();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                EmojiPacksAlert emojiPacksAlert2 = emojiPackHeader.this$0;
                                emojiPacksAlert2.premiumButtonClicked = jElapsedRealtime;
                                BaseFragment baseFragment = emojiPacksAlert2.fragment;
                                if (baseFragment != null) {
                                    new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
                                } else if (emojiPacksAlert2.getContext() instanceof LaunchActivity) {
                                    ((LaunchActivity) emojiPacksAlert2.getContext()).presentFragment(new PremiumPreviewFragment(0, null));
                                }
                                break;
                            case 1:
                                EmojiPacksAlert.installSet(emojiPackHeader.dummyFragment, emojiPackHeader.set, true, null, null);
                                emojiPackHeader.toggle(true, true);
                                break;
                            case 2:
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = emojiPackHeader.set;
                                HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = new HintView$1$$ExternalSyntheticLambda0(emojiPackHeader, 3);
                                Pattern pattern = EmojiPacksAlert.urlPattern;
                                SendGiftSheet.AnonymousClass8 anonymousClass8 = emojiPackHeader.dummyFragment;
                                if (anonymousClass8 != null && tL_messages_stickerSet != null && anonymousClass8.getFragmentView() != null) {
                                    MediaDataController.getInstance(anonymousClass8.getCurrentAccount()).toggleStickerSet(anonymousClass8.getFragmentView().getContext(), tL_messages_stickerSet, 0, anonymousClass8, true, true, hintView$1$$ExternalSyntheticLambda0, true);
                                }
                                emojiPackHeader.toggle(false, true);
                                break;
                            default:
                                emojiPackHeader.optionsButton.toggleSubMenu(null, null);
                                break;
                        }
                    }
                });
                addView(textView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                textView.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f), 1073741824));
                float fMax2 = Math.max(fDp, (AndroidUtilities.dp(f2) + textView.getMeasuredWidth()) / AndroidUtilities.density);
                TextView textView2 = new TextView(context);
                this.removeButtonView = textView2;
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setTextColor(emojiPacksAlert.getThemedColor(i4));
                textView2.setBackground(Theme.createRadSelectorDrawable(emojiPacksAlert.getThemedColor(i4) & 268435455, 4, 4));
                textView2.setPadding(zzlm.m(12.0f, R.string.StickersRemove, textView2), 0, AndroidUtilities.dp(12.0f), 0);
                textView2.setGravity(17);
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final EmojiPacksAlert.EmojiPackHeader f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        EmojiPacksAlert.EmojiPackHeader emojiPackHeader = this.f$0;
                        switch (i2) {
                            case 0:
                                emojiPackHeader.getClass();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                EmojiPacksAlert emojiPacksAlert2 = emojiPackHeader.this$0;
                                emojiPacksAlert2.premiumButtonClicked = jElapsedRealtime;
                                BaseFragment baseFragment = emojiPacksAlert2.fragment;
                                if (baseFragment != null) {
                                    new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
                                } else if (emojiPacksAlert2.getContext() instanceof LaunchActivity) {
                                    ((LaunchActivity) emojiPacksAlert2.getContext()).presentFragment(new PremiumPreviewFragment(0, null));
                                }
                                break;
                            case 1:
                                EmojiPacksAlert.installSet(emojiPackHeader.dummyFragment, emojiPackHeader.set, true, null, null);
                                emojiPackHeader.toggle(true, true);
                                break;
                            case 2:
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = emojiPackHeader.set;
                                HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = new HintView$1$$ExternalSyntheticLambda0(emojiPackHeader, 3);
                                Pattern pattern = EmojiPacksAlert.urlPattern;
                                SendGiftSheet.AnonymousClass8 anonymousClass8 = emojiPackHeader.dummyFragment;
                                if (anonymousClass8 != null && tL_messages_stickerSet != null && anonymousClass8.getFragmentView() != null) {
                                    MediaDataController.getInstance(anonymousClass8.getCurrentAccount()).toggleStickerSet(anonymousClass8.getFragmentView().getContext(), tL_messages_stickerSet, 0, anonymousClass8, true, true, hintView$1$$ExternalSyntheticLambda0, true);
                                }
                                emojiPackHeader.toggle(false, true);
                                break;
                            default:
                                emojiPackHeader.optionsButton.toggleSubMenu(null, null);
                                break;
                        }
                    }
                });
                textView2.setClickable(false);
                addView(textView2, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                textView2.setScaleX(0.0f);
                textView2.setScaleY(0.0f);
                textView2.setAlpha(0.0f);
                textView2.measure(View.MeasureSpec.makeMeasureSpec(99999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f), 1073741824));
                fMax = Math.max(fMax2, (AndroidUtilities.dp(f2) + textView2.getMeasuredWidth()) / AndroidUtilities.density);
            }
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, ((BottomSheet) emojiPacksAlert).resourcesProvider);
            this.titleView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
            linksTextView.setTypeface(AndroidUtilities.bold());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            linksTextView.setEllipsize(truncateAt);
            linksTextView.setSingleLine(true);
            linksTextView.setLines(1);
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, ((BottomSheet) emojiPacksAlert).resourcesProvider));
            linksTextView.setTextColor(emojiPacksAlert.getThemedColor(Theme.key_dialogTextBlack));
            if (z) {
                linksTextView.setTextSize(1, 20.0f);
                addView(linksTextView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, fMax, 0.0f));
            } else {
                linksTextView.setTextSize(1, 17.0f);
                addView(linksTextView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, fMax, 0.0f));
            }
            if (!z) {
                TextView textView3 = new TextView(context);
                this.subtitleView = textView3;
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(emojiPacksAlert.getThemedColor(Theme.key_dialogTextGray2));
                textView3.setEllipsize(truncateAt);
                textView3.setSingleLine(true);
                textView3.setLines(1);
                addView(textView3, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, fMax, 0.0f));
            }
            if (z) {
                ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, emojiPacksAlert.getThemedColor(Theme.key_sheet_other), false, ((BottomSheet) emojiPacksAlert).resourcesProvider);
                this.optionsButton = actionBarMenuItem;
                actionBarMenuItem.setLongClickEnabled(false);
                actionBarMenuItem.setSubMenuOpenSide(2);
                actionBarMenuItem.setIcon(R.drawable.ic_ab_other);
                actionBarMenuItem.setBackgroundDrawable(Theme.createSelectorDrawable(emojiPacksAlert.getThemedColor(Theme.key_player_actionBarSelector), 1, -1));
                addView(actionBarMenuItem, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (((BottomSheet) emojiPacksAlert).backgroundPaddingLeft / AndroidUtilities.density), 0.0f));
                actionBarMenuItem.addSubItem(1, R.drawable.msg_share, LocaleController.getString(R.string.StickersShare));
                actionBarMenuItem.addSubItem(2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink));
                final int i5 = 3;
                actionBarMenuItem.setOnClickListener(new View.OnClickListener(this) {
                    public final EmojiPacksAlert.EmojiPackHeader f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        EmojiPacksAlert.EmojiPackHeader emojiPackHeader = this.f$0;
                        switch (i5) {
                            case 0:
                                emojiPackHeader.getClass();
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                EmojiPacksAlert emojiPacksAlert2 = emojiPackHeader.this$0;
                                emojiPacksAlert2.premiumButtonClicked = jElapsedRealtime;
                                BaseFragment baseFragment = emojiPacksAlert2.fragment;
                                if (baseFragment != null) {
                                    new PremiumFeatureBottomSheet(baseFragment, 11, false).show();
                                } else if (emojiPacksAlert2.getContext() instanceof LaunchActivity) {
                                    ((LaunchActivity) emojiPacksAlert2.getContext()).presentFragment(new PremiumPreviewFragment(0, null));
                                }
                                break;
                            case 1:
                                EmojiPacksAlert.installSet(emojiPackHeader.dummyFragment, emojiPackHeader.set, true, null, null);
                                emojiPackHeader.toggle(true, true);
                                break;
                            case 2:
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = emojiPackHeader.set;
                                HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = new HintView$1$$ExternalSyntheticLambda0(emojiPackHeader, 3);
                                Pattern pattern = EmojiPacksAlert.urlPattern;
                                SendGiftSheet.AnonymousClass8 anonymousClass8 = emojiPackHeader.dummyFragment;
                                if (anonymousClass8 != null && tL_messages_stickerSet != null && anonymousClass8.getFragmentView() != null) {
                                    MediaDataController.getInstance(anonymousClass8.getCurrentAccount()).toggleStickerSet(anonymousClass8.getFragmentView().getContext(), tL_messages_stickerSet, 0, anonymousClass8, true, true, hintView$1$$ExternalSyntheticLambda0, true);
                                }
                                emojiPackHeader.toggle(false, true);
                                break;
                            default:
                                emojiPackHeader.optionsButton.toggleSubMenu(null, null);
                                break;
                        }
                    }
                });
                actionBarMenuItem.setDelegate(new ColorPicker$$ExternalSyntheticLambda6(emojiPacksAlert, 23));
                actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.single ? 42.0f : 56.0f), 1073741824));
        }

        public final void toggle(boolean z, boolean z2) {
            TextView textView;
            if (this.toggled == z) {
                return;
            }
            this.toggled = z;
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.animator = null;
            }
            TextView textView2 = this.addButtonView;
            if (textView2 == null || (textView = this.removeButtonView) == null) {
                return;
            }
            textView2.setClickable(!z);
            textView.setClickable(z);
            if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.toggleT, z ? 1.0f : 0.0f);
                this.animator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 6));
                this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.animator.setDuration(250L);
                this.animator.start();
                return;
            }
            this.toggleT = z ? 1.0f : 0.0f;
            textView2.setScaleX(z ? 0.0f : 1.0f);
            textView2.setScaleY(z ? 0.0f : 1.0f);
            textView2.setAlpha(z ? 0.0f : 1.0f);
            textView.setScaleX(z ? 1.0f : 0.0f);
            textView.setScaleY(z ? 1.0f : 0.0f);
            textView.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public abstract class EmojiPacksLoader implements NotificationCenter.NotificationCenterDelegate {
        public final int currentAccount;
        public ArrayList[] data;
        public final ArrayList inputStickerSets;
        public boolean started = false;
        public ArrayList stickerSets;
        public final EmojiPacksAlert this$0;

        public EmojiPacksLoader(int i, ArrayList arrayList, EmojiPacksAlert emojiPacksAlert) {
            this.this$0 = emojiPacksAlert;
            this.currentAccount = i;
            this.inputStickerSets = arrayList == null ? new ArrayList() : arrayList;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            TLRPC.StickerSet stickerSet;
            if (i == NotificationCenter.groupStickersDidLoad) {
                for (int i3 = 0; i3 < this.stickerSets.size(); i3++) {
                    if (this.stickerSets.get(i3) == null) {
                        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
                        ArrayList arrayList = this.inputStickerSets;
                        TLRPC.TL_messages_stickerSet stickerSet2 = mediaDataController.getStickerSet((TLRPC.InputStickerSet) arrayList.get(i3), true);
                        if (this.stickerSets.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                            EmojiPacksAlert emojiPacksAlert = this.this$0;
                            emojiPacksAlert.lambda$showGiftOfferSheet$15();
                            Context context = emojiPacksAlert.getContext();
                            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i3);
                            BaseFragment baseFragment = emojiPacksAlert.fragment;
                            new StickersAlert(context, emojiPacksAlert.fragment, inputStickerSet, null, baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).chatActivityEnterView : null, ((BottomSheet) emojiPacksAlert).resourcesProvider).show();
                            return;
                        }
                        this.stickerSets.set(i3, stickerSet2);
                        if (stickerSet2 != null) {
                            putStickerSet(i3, stickerSet2);
                        }
                    }
                }
                EmojiPacksAlert emojiPacksAlert2 = ((AnonymousClass2) this).this$0;
                emojiPacksAlert2.updateButton$1();
                ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = emojiPacksAlert2.listView;
                if (anonymousClass1 == null || anonymousClass1.getAdapter() == null) {
                    return;
                }
                anonymousClass1.getAdapter().notifyDataSetChanged();
            }
        }

        public final void putStickerSet(int i, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            ArrayList<Long> arrayList;
            if (i >= 0) {
                ArrayList[] arrayListArr = this.data;
                if (i >= arrayListArr.length) {
                    return;
                }
                if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                    arrayListArr[i] = new ArrayList(12);
                    for (int i2 = 0; i2 < 12; i2++) {
                        this.data[i].add(null);
                    }
                    return;
                }
                arrayListArr[i] = new ArrayList();
                for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i3);
                    if (document == null) {
                        this.data[i].add(null);
                    } else {
                        EmojiView.CustomEmoji customEmoji = new EmojiView.CustomEmoji();
                        long j = document.id;
                        for (int i4 = 0; i4 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i4).documents) == null || !arrayList.contains(Long.valueOf(j))); i4++) {
                        }
                        customEmoji.stickerSet = tL_messages_stickerSet;
                        customEmoji.documentId = document.id;
                        this.data[i].add(customEmoji);
                        if (this.this$0.limitCount) {
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            if (this.data[i].size() >= ((stickerSet == null || stickerSet.emojis) ? 16 : 10)) {
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    public final class SeparatorView extends View {
    }

    public EmojiPacksAlert(BaseFragment baseFragment, Context context, Theme.ResourcesProvider resourcesProvider, ArrayList arrayList) {
        Theme.ResourcesProvider resourceProvider = (baseFragment == null || baseFragment.getResourceProvider() == null) ? resourcesProvider : baseFragment.getResourceProvider();
        super(context, resourceProvider, false, false);
        this.highlightStartPosition = -1;
        this.highlightEndPosition = -1;
        this.previewDelegate = new AnonymousClass1();
        this.highlightIndex = -1;
        this.shown = false;
        this.loaded = true;
        this.fragment = baseFragment;
        fixNavigationBar();
        if (arrayList != null) {
            this.limitCount = arrayList.size() > 1;
        }
        this.customEmojiPacks = new AnonymousClass2(this.currentAccount, arrayList, this);
        float fDp = AndroidUtilities.dp(32.0f);
        float fDp2 = AndroidUtilities.dp(3.5f);
        int i = Theme.key_featuredStickers_addButton;
        this.progressDrawable = new CircularProgressDrawable(fDp, fDp2, getThemedColor(i));
        ContentView contentView = new ContentView(context);
        this.contentView = contentView;
        this.containerView = contentView;
        this.paddingView = new PaymentFormActivity.AnonymousClass2(context, 9);
        ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = new ArticleViewer.PageLayout.AnonymousClass1(this, context, this.resourcesProvider);
        this.listView = anonymousClass1;
        this.highlightAlpha = new AnimatedFloat(0.0f, anonymousClass1, 0L, 1250L, CubicBezierInterpolator.EASE_IN);
        ViewGroup viewGroup = this.containerView;
        int i2 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i2, AndroidUtilities.statusBarHeight, i2, 0);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        this.containerView.setWillNotDraw(false);
        anonymousClass1.setWillNotDraw(false);
        anonymousClass1.setSelectorRadius(AndroidUtilities.dp(6.0f));
        anonymousClass1.setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, resourceProvider));
        anonymousClass1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(this.limitCount ? 8.0f : 68.0f));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(8);
        this.gridLayoutManager = gridLayoutManager;
        anonymousClass1.setLayoutManager(gridLayoutManager);
        anonymousClass1.addItemDecoration(new MessageSeenView.AnonymousClass2(this, 2));
        anonymousClass1.addOnScrollListener(new ChatActivity.AnonymousClass53(this, 24));
        EmojiPacksAlert$$ExternalSyntheticLambda0 emojiPacksAlert$$ExternalSyntheticLambda0 = new EmojiPacksAlert$$ExternalSyntheticLambda0(this, arrayList, baseFragment, resourceProvider);
        anonymousClass1.setOnItemClickListener(emojiPacksAlert$$ExternalSyntheticLambda0);
        anonymousClass1.setOnItemLongClickListener((RecyclerListView.OnItemLongClickListener) new RateCallLayout$$ExternalSyntheticLambda1(5, this, context));
        anonymousClass1.setOnTouchListener(new PassportActivity$$ExternalSyntheticLambda22(4, this, emojiPacksAlert$$ExternalSyntheticLambda0));
        gridLayoutManager.setReverseLayout(false);
        gridLayoutManager.mSpanSizeLookup = new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int i3) {
                TLRPC.StickerSet stickerSet;
                EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
                if (emojiPacksAlert.listView.getAdapter() == null || emojiPacksAlert.listView.getAdapter().getItemViewType(i3) != 1) {
                    return emojiPacksAlert.gridLayoutManager.mSpanCount;
                }
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    ArrayList[] arrayListArr = emojiPacksAlert.customEmojiPacks.data;
                    if (i4 >= arrayListArr.length) {
                        break;
                    }
                    int size = arrayListArr[i4].size();
                    if (emojiPacksAlert.customEmojiPacks.data.length > 1) {
                        size = Math.min(emojiPacksAlert.gridLayoutManager.mSpanCount * 2, size);
                    }
                    i5 += size + 2;
                    if (i3 < i5) {
                        break;
                    }
                    i4++;
                }
                ArrayList arrayList2 = emojiPacksAlert.customEmojiPacks.stickerSets;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList2 == null || i4 >= arrayList2.size()) ? null : (TLRPC.TL_messages_stickerSet) emojiPacksAlert.customEmojiPacks.stickerSets.get(i4);
                return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
            }
        };
        this.scrollHelper = new RecyclerAnimationScrollHelper(anonymousClass1, gridLayoutManager);
        this.containerView.addView(anonymousClass1, LayoutHelper.createFrame(-1, -1, 51));
        View view = new View(context);
        this.shadowView = view;
        view.setBackgroundColor(Theme.getColor(null, Theme.key_dialogShadowLine, false));
        this.containerView.addView(view, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density), 80));
        view.setTranslationY(-AndroidUtilities.dp(68.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonsView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 68, 87));
        TextView textView = new TextView(context);
        this.addButtonView = textView;
        textView.setVisibility(8);
        int themedColor = getThemedColor(i);
        textView.setBackground(Theme.AdaptiveRipple.createRect(new float[]{24.0f}, themedColor, Theme.AdaptiveRipple.calcRippleColor(themedColor)));
        textView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        ScaleStateListAnimator.apply(textView, 0.02f, 1.2f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
        TextView textView2 = new TextView(context);
        this.removeButtonView = textView2;
        textView2.setVisibility(8);
        int i3 = Theme.key_text_RedBold;
        textView2.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i3) & 268435455, 0, 0));
        textView2.setTextColor(getThemedColor(i3));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setClickable(true);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 19.0f));
        PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(8.0f), context, this.resourcesProvider, false);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.setButton(LocaleController.getString(R.string.UnlockPremiumEmoji), new ChatActivity$16$$ExternalSyntheticLambda4(this, 15), false);
        premiumButtonView.setIcon(R.raw.unlock_icon);
        premiumButtonView.buttonLayout.setClickable(true);
        frameLayout.addView(premiumButtonView, LayoutHelper.createFrame(-1, 48.0f, 80, 12.0f, 10.0f, 12.0f, 10.0f));
    }

    public static void access$6500(EmojiPacksAlert emojiPacksAlert, int i) {
        ArrayList arrayList;
        String str;
        AnonymousClass2 anonymousClass2 = emojiPacksAlert.customEmojiPacks;
        if (anonymousClass2 == null || (arrayList = anonymousClass2.stickerSets) == null || arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) anonymousClass2.stickerSets.get(0);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            str = "https://" + MessagesController.getInstance(emojiPacksAlert.currentAccount).linkPrefix + "/addstickers/" + tL_messages_stickerSet.set.short_name;
        } else {
            str = "https://" + MessagesController.getInstance(emojiPacksAlert.currentAccount).linkPrefix + "/addemoji/" + tL_messages_stickerSet.set.short_name;
        }
        String str2 = str;
        if (i != 1) {
            if (i == 2) {
                try {
                    AndroidUtilities.addToClipboard(str2);
                    new BulletinFactory((FrameLayout) emojiPacksAlert.containerView, emojiPacksAlert.resourcesProvider).createCopyLinkBulletin(false).show();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        BaseFragment baseFragment = emojiPacksAlert.fragment;
        Context parentActivity = baseFragment != null ? baseFragment.getParentActivity() : null;
        if (parentActivity == null) {
            parentActivity = emojiPacksAlert.getContext();
        }
        AnonymousClass9 anonymousClass9 = emojiPacksAlert.new AnonymousClass9(parentActivity, str2, str2, emojiPacksAlert.resourcesProvider);
        if (baseFragment != null) {
            baseFragment.showDialog(anonymousClass9);
        } else {
            anonymousClass9.show();
        }
    }

    public static void installSet(final BaseFragment baseFragment, TLObject tLObject, final boolean z, final PhotoViewer$$ExternalSyntheticLambda68 photoViewer$$ExternalSyntheticLambda68, final HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0) {
        final int currentAccount = baseFragment == null ? UserConfig.selectedAccount : baseFragment.getCurrentAccount();
        TLRPC.StickerSet stickerSet = null;
        final View fragmentView = baseFragment == null ? null : baseFragment.getFragmentView();
        if (tLObject == null) {
            return;
        }
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet = tLObject instanceof TLRPC.TL_messages_stickerSet ? (TLRPC.TL_messages_stickerSet) tLObject : null;
        if (tL_messages_stickerSet != null) {
            stickerSet = tL_messages_stickerSet.set;
        } else if (tLObject instanceof TLRPC.StickerSet) {
            stickerSet = (TLRPC.StickerSet) tLObject;
        }
        final TLRPC.StickerSet stickerSet2 = stickerSet;
        if (stickerSet2 == null) {
            return;
        }
        if (MediaDataController.getInstance(currentAccount).cancelRemovingStickerSet(stickerSet2.id)) {
            if (photoViewer$$ExternalSyntheticLambda68 != null) {
                photoViewer$$ExternalSyntheticLambda68.run(Boolean.TRUE);
            }
        } else {
            TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
            tL_inputStickerSetID.id = stickerSet2.id;
            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final TLRPC.StickerSet stickerSet3 = stickerSet2;
                    final PhotoViewer$$ExternalSyntheticLambda68 photoViewer$$ExternalSyntheticLambda69 = photoViewer$$ExternalSyntheticLambda68;
                    final HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda1 = hintView$1$$ExternalSyntheticLambda0;
                    final boolean z2 = z;
                    final View view = fragmentView;
                    final BaseFragment baseFragment2 = baseFragment;
                    final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                    final int i = currentAccount;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            int i2;
                            TLObject tLObject3 = tLObject2;
                            TLRPC.StickerSet stickerSet4 = stickerSet3;
                            if (stickerSet4.masks) {
                                i2 = 1;
                            } else {
                                i2 = stickerSet4.emojis ? 5 : 0;
                            }
                            TLRPC.TL_error tL_error2 = tL_error;
                            View view2 = view;
                            BaseFragment baseFragment3 = baseFragment2;
                            int i3 = i;
                            PhotoViewer$$ExternalSyntheticLambda68 photoViewer$$ExternalSyntheticLambda610 = photoViewer$$ExternalSyntheticLambda69;
                            try {
                                if (tL_error2 == null) {
                                    if (z2 && view2 != null) {
                                        Context context = baseFragment3.getFragmentView().getContext();
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                                        Bulletin.make(baseFragment3, new StickerSetBulletinLayout(context, tL_messages_stickerSet3 == null ? stickerSet4 : tL_messages_stickerSet3, 1, 2, null, baseFragment3.getResourceProvider()), 1500).show();
                                    }
                                    if (tLObject3 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                        MediaDataController.getInstance(i3).processStickerSetInstallResultArchive(baseFragment3, true, i2, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject3);
                                    }
                                    if (photoViewer$$ExternalSyntheticLambda610 != null) {
                                        photoViewer$$ExternalSyntheticLambda610.run(Boolean.TRUE);
                                    }
                                } else if (view2 != null) {
                                    Toast.makeText(baseFragment3.getFragmentView().getContext(), LocaleController.getString(R.string.ErrorOccurred), 0).show();
                                    if (photoViewer$$ExternalSyntheticLambda610 != null) {
                                        photoViewer$$ExternalSyntheticLambda610.run(Boolean.FALSE);
                                    }
                                } else if (photoViewer$$ExternalSyntheticLambda610 != null) {
                                    photoViewer$$ExternalSyntheticLambda610.run(Boolean.FALSE);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            MediaDataController.getInstance(i3).loadStickers(i2, false, true, false, new DialogCell$$ExternalSyntheticLambda6(hintView$1$$ExternalSyntheticLambda1, 18));
                        }
                    });
                }
            });
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        EmojiPackHeader emojiPackHeader;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i != NotificationCenter.stickersDidLoad) {
            return;
        }
        int i3 = 0;
        while (true) {
            ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = this.listView;
            if (i3 >= anonymousClass1.getChildCount()) {
                updateButton$1();
                return;
            }
            View childAt = anonymousClass1.getChildAt(i3);
            if ((childAt instanceof EmojiPackHeader) && (tL_messages_stickerSet = (emojiPackHeader = (EmojiPackHeader) childAt).set) != null && tL_messages_stickerSet.set != null) {
                emojiPackHeader.toggle(MediaDataController.getInstance(this.currentAccount).isStickerPackInstalled(emojiPackHeader.set.set.id), true);
            }
            i3++;
        }
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        ContentView contentView = this.contentView;
        if (contentView != null && contentView.previewImageVisible) {
            contentView.previewImageVisible = false;
            contentView.invalidate();
        }
        super.lambda$showGiftOfferSheet$15();
        AnonymousClass2 anonymousClass2 = this.customEmojiPacks;
        if (anonymousClass2 != null) {
            NotificationCenter.getInstance(anonymousClass2.currentAccount).removeObserver(anonymousClass2, NotificationCenter.groupStickersDidLoad);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
    }

    @Override
    public final int getContainerViewHeight() {
        ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = this.listView;
        int measuredHeight = (anonymousClass1 == null ? 0 : anonymousClass1.getMeasuredHeight()) - getListTop();
        ViewGroup viewGroup = this.containerView;
        return AndroidUtilities.dp(8.0f) + measuredHeight + (viewGroup != null ? viewGroup.getPaddingTop() : 0) + AndroidUtilities.navigationBarHeight;
    }

    public final int getListTop() {
        if (this.containerView == null) {
            return 0;
        }
        ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = this.listView;
        if (anonymousClass1 == null || anonymousClass1.getChildCount() < 1) {
            return this.containerView.getPaddingTop();
        }
        View childAt = anonymousClass1.getChildAt(0);
        PaymentFormActivity.AnonymousClass2 anonymousClass2 = this.paddingView;
        return childAt != anonymousClass2 ? this.containerView.getPaddingTop() : anonymousClass2.getBottom() + ((int) anonymousClass1.getY());
    }

    public final void lambda$loadAnimation$8(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.loadT = fFloatValue;
        this.listView.setAlpha(fFloatValue);
        this.addButtonView.setAlpha(this.loadT);
        this.removeButtonView.setAlpha(this.loadT);
        this.containerView.invalidate();
    }

    public final void lambda$new$0(ArrayList arrayList, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, View view, int i) {
        AnonymousClass2 anonymousClass2;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
        int i2 = 0;
        if (arrayList == null || arrayList.size() <= 1) {
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow != null) {
                actionBarPopupWindow.dismiss(true);
                this.popupWindow = null;
                return;
            }
            if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).chatActivityEnterView.getVisibility() == 0 && (view instanceof EmojiImageView)) {
                AnimatedEmojiSpan animatedEmojiSpan = ((EmojiImageView) view).span;
                try {
                    TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                    if (documentFindDocument == null) {
                        documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                    }
                    SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(documentFindDocument));
                    spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                    ((ChatActivity) baseFragment).chatActivityEnterView.messageEditText.getText().append((CharSequence) spannableString);
                    onCloseByLink();
                    lambda$showGiftOfferSheet$15();
                } catch (Exception unused) {
                }
                try {
                    view.performHapticFeedback(3, 1);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
            return;
        }
        if (SystemClock.elapsedRealtime() - this.premiumButtonClicked >= 250) {
            int i3 = 0;
            while (true) {
                anonymousClass2 = this.customEmojiPacks;
                ArrayList[] arrayListArr = anonymousClass2.data;
                if (i2 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i2].size();
                if (anonymousClass2.data.length > 1) {
                    size = Math.min(this.gridLayoutManager.mSpanCount * 2, size);
                }
                i3 += size + 2;
                if (i < i3) {
                    break;
                } else {
                    i2++;
                }
            }
            ArrayList arrayList2 = anonymousClass2.stickerSets;
            if (arrayList2 != null && i2 < arrayList2.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) anonymousClass2.stickerSets.get(i2);
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                ArrayList arrayList3 = new ArrayList();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.id = stickerSet.id;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                arrayList3.add(tL_inputStickerSetID);
                new EmojiPacksAlert(baseFragment, getContext(), resourcesProvider, arrayList3) {
                    @Override
                    public final void onCloseByLink() {
                        EmojiPacksAlert.this.lambda$showGiftOfferSheet$15();
                    }
                }.show();
            }
        }
    }

    public final void lambda$new$1(AnimatedEmojiSpan animatedEmojiSpan) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null) {
            return;
        }
        actionBarPopupWindow.dismiss(true);
        this.popupWindow = null;
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId())));
        spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
        if (AndroidUtilities.addToClipboard(spannableString)) {
            zzkn.m(R.string.EmojiCopied, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider));
        }
    }

    public final boolean lambda$new$3(EmojiPacksAlert$$ExternalSyntheticLambda0 emojiPacksAlert$$ExternalSyntheticLambda0, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.listView, emojiPacksAlert$$ExternalSyntheticLambda0, this.previewDelegate, this.resourcesProvider);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void lambda$openCrafting$8() {
        if (ContentPreviewViewer.getInstance().isVisible) {
            ContentPreviewViewer.getInstance().closeWithMenu();
        } else {
            super.lambda$openCrafting$8();
        }
    }

    public void onButtonClicked(boolean z) {
    }

    public void onCloseByLink() {
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public final void show() {
        TLRPC.StickerSet stickerSet;
        super.show();
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        this.listView.setAdapter(adapter);
        int i = 0;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        AnonymousClass2 anonymousClass2 = this.customEmojiPacks;
        if (!anonymousClass2.started) {
            anonymousClass2.started = true;
            ArrayList arrayList = anonymousClass2.inputStickerSets;
            anonymousClass2.stickerSets = new ArrayList(arrayList.size());
            anonymousClass2.data = new ArrayList[arrayList.size()];
            int i2 = anonymousClass2.currentAccount;
            NotificationCenter.getInstance(i2).addObserver(anonymousClass2, NotificationCenter.groupStickersDidLoad);
            boolean[] zArr = new boolean[1];
            int i3 = 0;
            while (true) {
                if (i3 >= anonymousClass2.data.length) {
                    EmojiPacksAlert emojiPacksAlert = anonymousClass2.this$0;
                    emojiPacksAlert.updateButton$1();
                    ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = emojiPacksAlert.listView;
                    if (anonymousClass1 != null && anonymousClass1.getAdapter() != null) {
                        anonymousClass1.getAdapter().notifyDataSetChanged();
                        break;
                    } else {
                        break;
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(i2).getStickerSet((TLRPC.InputStickerSet) arrayList.get(i3), null, false, new ArticleViewer$$ExternalSyntheticLambda21(25, anonymousClass2, zArr));
                if (anonymousClass2.data.length == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                    AndroidUtilities.runOnUIThread(new EmojiPacksAlert$EmojiPacksLoader$$ExternalSyntheticLambda1(anonymousClass2, i));
                    EmojiPacksAlert emojiPacksAlert2 = ((EmojiPacksLoader) anonymousClass2).this$0;
                    Context context = emojiPacksAlert2.getContext();
                    TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i3);
                    BaseFragment baseFragment = emojiPacksAlert2.fragment;
                    new StickersAlert(context, baseFragment, inputStickerSet, null, baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).chatActivityEnterView : null, emojiPacksAlert2.resourcesProvider).show();
                    break;
                }
                anonymousClass2.stickerSets.add(stickerSet2);
                anonymousClass2.putStickerSet(i3, stickerSet2);
                i3++;
            }
        }
        updateButton$1();
        BaseFragment baseFragment2 = this.fragment;
        MediaDataController.getInstance(baseFragment2 == null ? UserConfig.selectedAccount : baseFragment2.getCurrentAccount()).checkStickers(5);
    }

    public final void updateButton$1() {
        TLRPC.StickerSet stickerSet;
        int i = 4;
        final int i2 = 1;
        if (this.buttonsView == null) {
            return;
        }
        AnonymousClass2 anonymousClass2 = this.customEmojiPacks;
        ArrayList arrayList = anonymousClass2.stickerSets == null ? new ArrayList() : new ArrayList(anonymousClass2.stickerSets);
        int i3 = 0;
        while (i3 < arrayList.size()) {
            if (arrayList.get(i3) == null) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(this.currentAccount);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i4);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (mediaDataController.isStickerPackInstalled(stickerSet.id)) {
                    arrayList2.add(tL_messages_stickerSet);
                } else {
                    arrayList3.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        ArrayList arrayList5 = anonymousClass2.inputStickerSets;
        boolean z = arrayList5 != null && arrayList.size() == arrayList5.size();
        if (!this.loaded && z && this.loadAnimator == null) {
            this.loadAnimator = ValueAnimator.ofFloat(this.loadT, 1.0f);
            this.containerView.getY();
            this.loadAnimator.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, i));
            this.loadAnimator.setDuration(250L);
            this.loadAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.loadAnimator.start();
        }
        this.loaded = z;
        ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = this.listView;
        if (!z) {
            anonymousClass1.setAlpha(0.0f);
        } else if (this.highlightIndex >= 0) {
            int iFindFirstVisibleItemPosition = this.gridLayoutManager.findFirstVisibleItemPosition();
            int setHeaderPosition = this.adapter.getSetHeaderPosition(this.highlightIndex);
            if (Math.abs(iFindFirstVisibleItemPosition - setHeaderPosition) > 54) {
                RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = this.scrollHelper;
                recyclerAnimationScrollHelper.scrollDirection = iFindFirstVisibleItemPosition < setHeaderPosition ? 0 : 1;
                recyclerAnimationScrollHelper.scrollToPosition(setHeaderPosition, (AndroidUtilities.displaySize.y / 2) - AndroidUtilities.dp(170.0f), false, false);
            } else {
                anonymousClass1.smoothScrollToPosition(setHeaderPosition);
            }
            this.highlightStartPosition = this.adapter.getSetHeaderPosition(this.highlightIndex);
            Adapter adapter = this.adapter;
            int i5 = this.highlightIndex;
            int i6 = EmojiPacksAlert.this.hasDescription ? 2 : 1;
            int i7 = 0;
            while (true) {
                EmojiPacksAlert emojiPacksAlert = EmojiPacksAlert.this;
                AnonymousClass2 anonymousClass3 = emojiPacksAlert.customEmojiPacks;
                ArrayList[] arrayListArr = anonymousClass3.data;
                if (i7 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i7].size();
                if (anonymousClass3.data.length > 1) {
                    size = Math.min(emojiPacksAlert.gridLayoutManager.mSpanCount * 2, size);
                }
                if (i7 == i5) {
                    i6 = i6 + size + 1;
                    break;
                } else {
                    i6 += size + 2;
                    i7++;
                }
            }
            this.highlightEndPosition = i6;
            this.highlightAlpha.set(1.0f, true);
            anonymousClass1.invalidate();
            this.highlightIndex = -1;
        }
        boolean z2 = this.loaded;
        PremiumButtonView premiumButtonView = this.premiumButtonView;
        TextView textView = this.removeButtonView;
        TextView textView2 = this.addButtonView;
        if (!z2 || this.limitCount) {
            premiumButtonView.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            updateShowButton(false);
            return;
        }
        premiumButtonView.setVisibility(4);
        if (arrayList4.size() > 0) {
            final int i8 = 0;
            textView2.setVisibility(0);
            textView.setVisibility(8);
            if (arrayList4.size() == 1) {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), new Object[0]));
            } else {
                textView2.setText(LocaleController.formatPluralString("AddManyEmojiPacksCount", arrayList4.size(), new Object[0]));
            }
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i8) {
                        case 0:
                            EmojiPacksAlert emojiPacksAlert2 = this;
                            emojiPacksAlert2.getClass();
                            ArrayList arrayList6 = arrayList4;
                            int size2 = arrayList6.size();
                            int[] iArr = new int[2];
                            for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                                EmojiPacksAlert.installSet(emojiPacksAlert2.fragment, (TLObject) arrayList6.get(i9), size2 == 1, size2 > 1 ? new PhotoViewer$$ExternalSyntheticLambda68(emojiPacksAlert2, iArr, size2, arrayList6) : null, null);
                            }
                            emojiPacksAlert2.onButtonClicked(true);
                            if (size2 <= 1) {
                                emojiPacksAlert2.lambda$showGiftOfferSheet$15();
                            }
                            break;
                        default:
                            EmojiPacksAlert emojiPacksAlert3 = this;
                            emojiPacksAlert3.lambda$showGiftOfferSheet$15();
                            ArrayList<TLRPC.TL_messages_stickerSet> arrayList7 = arrayList4;
                            BaseFragment baseFragment = emojiPacksAlert3.fragment;
                            if (baseFragment != null) {
                                MediaDataController.getInstance(baseFragment.getCurrentAccount()).removeMultipleStickerSets(baseFragment.getContext(), baseFragment, arrayList7);
                            } else {
                                int i10 = 0;
                                while (i10 < arrayList7.size()) {
                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList7.get(i10);
                                    Context context = emojiPacksAlert3.getContext();
                                    boolean z3 = i10 == 0;
                                    if (tL_messages_stickerSet2 != null) {
                                        MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z3, null, true);
                                    }
                                    i10++;
                                }
                            }
                            emojiPacksAlert3.onButtonClicked(false);
                            break;
                    }
                }
            });
            updateShowButton(true);
            return;
        }
        if (arrayList2.size() <= 0) {
            textView2.setVisibility(8);
            textView.setVisibility(8);
            updateShowButton(false);
            return;
        }
        textView2.setVisibility(8);
        textView.setVisibility(0);
        if (arrayList2.size() == 1) {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiCount", ((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("RemoveManyEmojiPacksCount", arrayList2.size(), new Object[0]));
        }
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        EmojiPacksAlert emojiPacksAlert2 = this;
                        emojiPacksAlert2.getClass();
                        ArrayList arrayList6 = arrayList2;
                        int size2 = arrayList6.size();
                        int[] iArr = new int[2];
                        for (int i9 = 0; i9 < arrayList6.size(); i9++) {
                            EmojiPacksAlert.installSet(emojiPacksAlert2.fragment, (TLObject) arrayList6.get(i9), size2 == 1, size2 > 1 ? new PhotoViewer$$ExternalSyntheticLambda68(emojiPacksAlert2, iArr, size2, arrayList6) : null, null);
                        }
                        emojiPacksAlert2.onButtonClicked(true);
                        if (size2 <= 1) {
                            emojiPacksAlert2.lambda$showGiftOfferSheet$15();
                        }
                        break;
                    default:
                        EmojiPacksAlert emojiPacksAlert3 = this;
                        emojiPacksAlert3.lambda$showGiftOfferSheet$15();
                        ArrayList<TLRPC.TL_messages_stickerSet> arrayList7 = arrayList2;
                        BaseFragment baseFragment = emojiPacksAlert3.fragment;
                        if (baseFragment != null) {
                            MediaDataController.getInstance(baseFragment.getCurrentAccount()).removeMultipleStickerSets(baseFragment.getContext(), baseFragment, arrayList7);
                        } else {
                            int i10 = 0;
                            while (i10 < arrayList7.size()) {
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = arrayList7.get(i10);
                                Context context = emojiPacksAlert3.getContext();
                                boolean z3 = i10 == 0;
                                if (tL_messages_stickerSet2 != null) {
                                    MediaDataController.getInstance(UserConfig.selectedAccount).toggleStickerSet(context, tL_messages_stickerSet2, 0, null, true, z3, null, true);
                                }
                                i10++;
                            }
                        }
                        emojiPacksAlert3.onButtonClicked(false);
                        break;
                }
            }
        });
        updateShowButton(true);
    }

    public final void updateShowButton(boolean z) {
        boolean z2 = !this.shown && z;
        float fDp = this.removeButtonView.getVisibility() == 0 ? AndroidUtilities.dp(19.0f) : 0;
        View view = this.shadowView;
        FrameLayout frameLayout = this.buttonsView;
        boolean z3 = this.limitCount;
        ArticleViewer.PageLayout.AnonymousClass1 anonymousClass1 = this.listView;
        float fDp2 = 0.0f;
        if (z2) {
            ViewPropertyAnimator duration = frameLayout.animate().translationY(z ? fDp : AndroidUtilities.dp(16.0f)).alpha(z ? 1.0f : 0.0f).setDuration(250L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            view.animate().translationY(z ? -(AndroidUtilities.dp(68.0f) - fDp) : 0.0f).alpha(z ? 1.0f : 0.0f).setDuration(250L).setInterpolator(cubicBezierInterpolator).start();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = anonymousClass1.animate();
            if (!z3 && !z) {
                fDp2 = AndroidUtilities.dp(68.0f) - fDp;
            }
            viewPropertyAnimatorAnimate.translationY(fDp2).setDuration(250L).setInterpolator(cubicBezierInterpolator).start();
        } else {
            frameLayout.setAlpha(z ? 1.0f : 0.0f);
            frameLayout.setTranslationY(z ? fDp : AndroidUtilities.dp(16.0f));
            view.setAlpha(z ? 1.0f : 0.0f);
            view.setTranslationY(z ? -(AndroidUtilities.dp(68.0f) - fDp) : 0.0f);
            if (!z3 && !z) {
                fDp2 = AndroidUtilities.dp(68.0f) - fDp;
            }
            anonymousClass1.setTranslationY(fDp2);
        }
        this.shown = z;
    }
}
