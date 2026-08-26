package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetLayouted;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessageSeenCheckDrawable;
import org.telegram.ui.Components.Premium.FeaturesPageView;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchTagsList;
import org.telegram.ui.Components.SearchTagsList.TagButton;
import org.telegram.ui.Components.StatusBadgeComponent;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.WallpapersListActivity.ColorCell;

public final class MessageSeenView extends FrameLayout {
    public final AvatarsImageView avatarsImageView;
    public final int currentAccount;
    public final ArrayList dates;
    public final FlickerLoadingView flickerLoadingView;
    public boolean ignoreLayout;
    public final boolean isVoice;
    public AnonymousClass1 listView;
    public final ArrayList peerIds;
    public final SimpleTextView titleView;
    public final ArrayList users;

    public final class AnonymousClass1 extends RecyclerListView {
        public final int $r8$classId;

        public AnonymousClass1(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.$r8$classId = i;
        }

        @Override
        public Integer getSelectorColor(int i) {
            switch (this.$r8$classId) {
                case 3:
                    return 0;
                case 4:
                    return 0;
                case 8:
                    return 0;
                case 11:
                    return 0;
                default:
                    return super.getSelectorColor(i);
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 1:
                    if (getParent() != null && getParent().getParent() != null) {
                        getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                    }
                    break;
                case 2:
                    if (getParent() != null && getParent().getParent() != null) {
                        ViewParent parent = getParent().getParent();
                        boolean z = true;
                        if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                            z = false;
                        }
                        parent.requestDisallowInterceptTouchEvent(z);
                    }
                    break;
                case 6:
                    if (getParent() != null && getParent().getParent() != null) {
                        ViewParent parent2 = getParent().getParent();
                        boolean z2 = true;
                        if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                            z2 = false;
                        }
                        parent2.requestDisallowInterceptTouchEvent(z2);
                    }
                    break;
                case 13:
                    if (getParent() != null && getParent().getParent() != null) {
                        getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
                    }
                    break;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    int size = View.MeasureSpec.getSize(i2);
                    int itemCount = (getAdapter().getItemCount() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                    if (itemCount <= size) {
                        size = itemCount;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                    break;
                case 7:
                    int size2 = View.MeasureSpec.getSize(i2);
                    int itemCount2 = (getAdapter().getItemCount() * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(4.0f);
                    if (itemCount2 <= size2) {
                        size2 = itemCount2;
                    }
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 12:
                    if (motionEvent.getAction() == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    break;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void requestChildOnScreen(View view, View view2) {
            switch (this.$r8$classId) {
                case 5:
                    if (view instanceof PollEditTextCell) {
                        super.requestChildOnScreen(view, view2);
                        break;
                    }
                    break;
                case 10:
                    if (view instanceof PollEditTextCell) {
                        super.requestChildOnScreen(view, view2);
                        break;
                    }
                    break;
                default:
                    super.requestChildOnScreen(view, view2);
                    break;
            }
        }

        @Override
        public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
            switch (this.$r8$classId) {
                case 5:
                    rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                    return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z, false);
                case 10:
                    rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                    return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z, false);
                default:
                    return super.requestChildRectangleOnScreen(view, rect, z);
            }
        }

        @Override
        public boolean requestFocus(int i, Rect rect) {
            switch (this.$r8$classId) {
                case 9:
                    return false;
                default:
                    return super.requestFocus(i, rect);
            }
        }

        public AnonymousClass1(Context context) {
            super(context, null);
            this.$r8$classId = 12;
        }
    }

    public final class AnonymousClass2 extends RecyclerView.ItemDecoration {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            switch (this.$r8$classId) {
                case 0:
                    recyclerView.getClass();
                    if (RecyclerView.getChildAdapterPosition(view) == ((MessageSeenView) this.this$0).users.size() - 1) {
                        rect.bottom = AndroidUtilities.dp(4.0f);
                    }
                    break;
                case 1:
                    int adapterPosition = recyclerView.getChildViewHolder(view).getAdapterPosition();
                    if (adapterPosition == 0) {
                        rect.left = AndroidUtilities.dp(18.0f);
                    }
                    AppIconsSelectorCell appIconsSelectorCell = (AppIconsSelectorCell) this.this$0;
                    if (adapterPosition != appIconsSelectorCell.getAdapter().getItemCount() - 1) {
                        int itemCount = appIconsSelectorCell.getAdapter().getItemCount();
                        if (itemCount != 4) {
                            rect.right = AndroidUtilities.dp(24.0f);
                        } else {
                            rect.right = OKLCH.m$3(58.0f, itemCount, appIconsSelectorCell.getWidth() - AndroidUtilities.dp(36.0f)) / (itemCount - 1);
                        }
                    } else {
                        rect.right = AndroidUtilities.dp(18.0f);
                    }
                    break;
                case 2:
                    boolean z = view instanceof EmojiPacksAlert.SeparatorView;
                    EmojiPacksAlert emojiPacksAlert = (EmojiPacksAlert) this.this$0;
                    if (!z) {
                        emojiPacksAlert.listView.getClass();
                        if (RecyclerView.getChildAdapterPosition(view) == 1) {
                            rect.top = AndroidUtilities.dp(14.0f);
                        }
                    } else {
                        rect.left = -emojiPacksAlert.listView.getPaddingLeft();
                        rect.right = -emojiPacksAlert.listView.getPaddingRight();
                    }
                    break;
                case 3:
                    boolean z2 = view instanceof StickerSetNameCell;
                    EmojiView emojiView = (EmojiView) this.this$0;
                    if (!z2) {
                        if ((view instanceof RecyclerListView) || (view instanceof EmojiView.EmojiPackHeader)) {
                            EmojiView.AnonymousClass5 anonymousClass5 = emojiView.emojiGridView;
                            rect.left = -anonymousClass5.getPaddingLeft();
                            rect.right = -anonymousClass5.getPaddingRight();
                            if (view instanceof EmojiView.EmojiPackHeader) {
                                rect.top = AndroidUtilities.dp(8.0f);
                            }
                        } else if (view instanceof BackupImageView) {
                            rect.bottom = AndroidUtilities.dp(12.0f);
                        }
                        break;
                    } else {
                        rect.left = AndroidUtilities.dp(5.0f);
                        rect.right = AndroidUtilities.dp(5.0f);
                        recyclerView.getClass();
                        if (RecyclerView.getChildAdapterPosition(view) + 1 > emojiView.emojiAdapter.plainEmojisCount && !UserConfig.getInstance(emojiView.currentAccount).isPremium() && !emojiView.allowEmojisForNonPremium) {
                            rect.top = AndroidUtilities.dp(10.0f);
                            break;
                        }
                    }
                    break;
                case 4:
                    super.getItemOffsets(rect, view, recyclerView, state);
                    recyclerView.getClass();
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                    SelectorBottomSheet selectorBottomSheet = (SelectorBottomSheet) this.this$0;
                    if (childAdapterPosition == selectorBottomSheet.items.size()) {
                        rect.bottom = selectorBottomSheet.listPaddingTop;
                    }
                    break;
                case 5:
                    recyclerView.getClass();
                    if (RecyclerView.getChildAdapterPosition(view) == ((ArrayList) this.this$0).size() - 1) {
                        rect.bottom = AndroidUtilities.dp(4.0f);
                    }
                    break;
                case 6:
                    super.getItemOffsets(rect, view, recyclerView, state);
                    recyclerView.getClass();
                    int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(view);
                    MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet = (MultiContactsSelectorBottomSheet) this.this$0;
                    if (childAdapterPosition2 == multiContactsSelectorBottomSheet.items.size()) {
                        rect.bottom = multiContactsSelectorBottomSheet.listPaddingTop;
                    }
                    break;
                case 7:
                    recyclerView.getClass();
                    int childAdapterPosition3 = RecyclerView.getChildAdapterPosition(view);
                    PeerColorActivity.Page page = (PeerColorActivity.Page) this.this$0;
                    int i = page.giftsStartRow;
                    if (childAdapterPosition3 >= i) {
                        int i2 = page.giftsCount;
                        if (childAdapterPosition3 < i + i2) {
                            int i3 = childAdapterPosition3 - i;
                            int i4 = i3 / 3;
                            boolean z3 = i4 == 0;
                            boolean z4 = i4 == (i2 - 1) / 3;
                            int i5 = i3 % 3;
                            boolean z5 = i5 == 0;
                            boolean z6 = i5 == 2;
                            rect.top = z3 ? AndroidUtilities.dp(8.0f) : 0;
                            rect.bottom = z4 ? AndroidUtilities.dp(8.0f) : 0;
                            rect.left = z5 ? AndroidUtilities.dp(8.0f) : 0;
                            rect.right = z6 ? AndroidUtilities.dp(8.0f) : 0;
                            break;
                        }
                    }
                    break;
                default:
                    EmojiBottomSheet.GifPage.GifLayoutManager gifLayoutManager = ((EmojiBottomSheet.GifPage) this.this$0).layoutManager;
                    recyclerView.getClass();
                    int childAdapterPosition4 = RecyclerView.getChildAdapterPosition(view);
                    gifLayoutManager.checkLayout();
                    rect.right = gifLayoutManager.itemsToRow.get(childAdapterPosition4, Integer.MAX_VALUE) != Integer.MAX_VALUE ? 0 : AndroidUtilities.dp(4.0f);
                    rect.bottom = AndroidUtilities.dp(4.0f);
                    break;
            }
        }
    }

    public final class UserCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        public static final MessageSeenCheckDrawable seenDrawable;
        public static final MessageSeenCheckDrawable votedDrawable;
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarImageView;
        public final int currentAccount;
        public final SimpleTextView nameView;
        public TLObject object;
        public final TextView readView;
        public final StatusBadgeComponent statusBadgeComponent;

        static {
            int i = R.drawable.msg_mini_checks;
            int i2 = Theme.key_windowBackgroundWhiteGrayText;
            seenDrawable = new MessageSeenCheckDrawable(i, i2);
            votedDrawable = new MessageSeenCheckDrawable(R.drawable.mini_checklist_done_outline, i2);
        }

        public UserCell(Context context) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(18.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.nameView = simpleTextView;
            simpleTextView.setTextSize(16);
            simpleTextView.setEllipsizeByGradient(!LocaleController.isRTL);
            simpleTextView.setImportantForAccessibility(2);
            simpleTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
            simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.statusBadgeComponent = new StatusBadgeComponent(18, this);
            simpleTextView.setDrawablePadding(AndroidUtilities.dp(3.0f));
            TextView textView = new TextView(context);
            this.readView = textView;
            textView.setTextSize(1, 13.0f);
            textView.setLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setImportantForAccessibility(2);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            if (LocaleController.isRTL) {
                addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
                addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
                addView(textView, LayoutHelper.createFrame(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            } else {
                addView(backupImageView, LayoutHelper.createFrame(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
                addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
            }
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.userEmojiStatusUpdated) {
                TLRPC.User user = (TLRPC.User) objArr[0];
                TLObject tLObject = this.object;
                TLRPC.User user2 = tLObject instanceof TLRPC.User ? (TLRPC.User) tLObject : null;
                if (user2 == null || user == null || user2.id != user.id) {
                    return;
                }
                this.object = user;
                SimpleTextView simpleTextView = this.nameView;
                int color = Theme.getColor(null, Theme.key_chats_verifiedBackground, false);
                StatusBadgeComponent statusBadgeComponent = this.statusBadgeComponent;
                statusBadgeComponent.getClass();
                simpleTextView.setRightDrawable(statusBadgeComponent.updateDrawable(user, null, color, true));
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.statusBadgeComponent.statusDrawable.attach();
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userEmojiStatusUpdated);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.statusBadgeComponent.statusDrawable.detach();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            String string = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, this.nameView.getText());
            TextView textView = this.readView;
            if (textView.getVisibility() == 0) {
                StringBuilder sbM = Log.m(string, " ");
                sbM.append((Object) textView.getText());
                string = sbM.toString();
            }
            accessibilityNodeInfo.setText(string);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public final void setUser(TLObject tLObject, boolean z, int i) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawableUpdateDrawable;
            this.object = tLObject;
            SimpleTextView simpleTextView = this.nameView;
            int color = Theme.getColor(null, Theme.key_chats_verifiedBackground, false);
            StatusBadgeComponent statusBadgeComponent = this.statusBadgeComponent;
            statusBadgeComponent.getClass();
            if (tLObject instanceof TLRPC.User) {
                swapAnimatedEmojiDrawableUpdateDrawable = statusBadgeComponent.updateDrawable((TLRPC.User) tLObject, null, color, false);
            } else {
                swapAnimatedEmojiDrawableUpdateDrawable = tLObject instanceof TLRPC.Chat ? statusBadgeComponent.updateDrawable(null, (TLRPC.Chat) tLObject, color, false) : statusBadgeComponent.updateDrawable(null, null, color, false);
            }
            simpleTextView.setRightDrawable(swapAnimatedEmojiDrawableUpdateDrawable);
            if (tLObject != null) {
                AvatarDrawable avatarDrawable = this.avatarDrawable;
                int i2 = this.currentAccount;
                avatarDrawable.setInfo(i2, tLObject);
                this.avatarImageView.setImage(ImageLocation.getForUserOrChat(i2, tLObject, 1), "50_50", avatarDrawable, tLObject);
                simpleTextView.setText(ContactsController.formatName(tLObject), false);
            }
            TextView textView = this.readView;
            if (i <= 0) {
                textView.setVisibility(8);
                simpleTextView.setTranslationY(AndroidUtilities.dp(9.0f));
            } else {
                textView.setText(TextUtils.concat((z ? votedDrawable : seenDrawable).getSpanned(getContext(), null), LocaleController.formatSeenDate(i)));
                textView.setVisibility(0);
                simpleTextView.setTranslationY(0.0f);
            }
        }
    }

    public MessageSeenView(Context context, int i, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        this.peerIds = new ArrayList();
        this.dates = new ArrayList();
        this.users = new ArrayList();
        this.currentAccount = i;
        boolean z = messageObject.isRoundVideo() || messageObject.isVoice();
        this.isVoice = z;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        this.flickerLoadingView = flickerLoadingView;
        int i2 = Theme.key_actionBarDefaultSubmenuBackground;
        int i3 = Theme.key_listSelector;
        flickerLoadingView.colorKey1 = i2;
        flickerLoadingView.colorKey2 = i3;
        flickerLoadingView.colorKey3 = -1;
        flickerLoadingView.invalidate();
        flickerLoadingView.setViewType(13);
        flickerLoadingView.setIsSingleCell(false);
        addView(flickerLoadingView, LayoutHelper.createFrame(-1.0f, -2));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.titleView = simpleTextView;
        simpleTextView.setTextSize(16);
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(simpleTextView, LayoutHelper.createFrame(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
        this.avatarsImageView = avatarsImageView;
        avatarsImageView.setStyle(11);
        avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(avatarsImageView, LayoutHelper.createFrame(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable drawableMutate = context.getDrawable(z ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItemIcon, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(drawableMutate);
        avatarsImageView.setAlpha(0.0f);
        simpleTextView.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReadParticipants, new MessageSeenView$$ExternalSyntheticLambda0(this, peer != null ? peer.user_id : 0L, i, chat));
        setBackground(Theme.createRadSelectorDrawable(Theme.getColor(null, Theme.key_dialogButtonSelector, false), 6, 0));
        setEnabled(false);
    }

    public final AnonymousClass1 createListView() {
        AnonymousClass1 anonymousClass1 = this.listView;
        if (anonymousClass1 != null) {
            return anonymousClass1;
        }
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(getContext(), 0, null);
        this.listView = anonymousClass2;
        getContext();
        anonymousClass2.setLayoutManager(new LinearLayoutManager(1, false));
        int i = 0;
        this.listView.addItemDecoration(new AnonymousClass2(this, i));
        this.listView.setAdapter(new AnonymousClass3(this, i));
        return this.listView;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        this.ignoreLayout = true;
        FlickerLoadingView flickerLoadingView = this.flickerLoadingView;
        boolean z = flickerLoadingView.getVisibility() == 0;
        SimpleTextView simpleTextView = this.titleView;
        simpleTextView.setVisibility(8);
        if (z) {
            flickerLoadingView.setVisibility(8);
        }
        super.onMeasure(i, i2);
        if (z) {
            flickerLoadingView.getLayoutParams().width = getMeasuredWidth();
            flickerLoadingView.setVisibility(0);
        }
        simpleTextView.setVisibility(0);
        simpleTextView.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.ignoreLayout = false;
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void updateView() {
        AvatarsImageView avatarsImageView;
        ArrayList arrayList = this.users;
        setEnabled(arrayList.size() > 0);
        int i = 0;
        while (true) {
            avatarsImageView = this.avatarsImageView;
            if (i >= 3) {
                break;
            }
            int size = arrayList.size();
            int i2 = this.currentAccount;
            if (i < size) {
                avatarsImageView.avatarsDrawable.setObject(i, (TLObject) arrayList.get(i), i2);
            } else {
                avatarsImageView.avatarsDrawable.setObject(i, null, i2);
            }
            i++;
        }
        if (arrayList.size() == 1) {
            avatarsImageView.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            avatarsImageView.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            avatarsImageView.setTranslationX(0.0f);
        }
        SimpleTextView simpleTextView = this.titleView;
        simpleTextView.setRightPadding(AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38));
        avatarsImageView.avatarsDrawable.commitTransition(false, true);
        ArrayList arrayList2 = this.peerIds;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            simpleTextView.setText(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            simpleTextView.setText(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            simpleTextView.setText(LocaleController.formatPluralString(this.isVoice ? "MessagePlayed" : "MessageSeen", arrayList2.size(), new Object[0]), false);
        }
        simpleTextView.animate().alpha(1.0f).setDuration(220L).start();
        avatarsImageView.animate().alpha(1.0f).setDuration(220L).start();
        FlickerLoadingView flickerLoadingView = this.flickerLoadingView;
        flickerLoadingView.animate().alpha(0.0f).setDuration(220L).setListener(new ChatActivity.AnonymousClass77(flickerLoadingView)).start();
        AnonymousClass1 anonymousClass1 = this.listView;
        if (anonymousClass1 != null) {
            anonymousClass1.getAdapter();
        }
    }

    public final class AnonymousClass3 extends RecyclerListView.SelectionAdapter {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final int getItemCount() {
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    return ((MessageSeenView) obj).users.size();
                case 1:
                    return ((FiltersView) obj).usersFilters.size();
                case 2:
                    return 1;
                case 3:
                    return ((FeaturesPageView) obj).items.size();
                case 4:
                    return ((SearchTagsList) obj).items.size();
                case 5:
                    return ((StarGiftSheet) obj).heights.length;
                default:
                    int[][] iArr = WallpapersListActivity.defaultColorsLight;
                    return 12;
            }
        }

        @Override
        public int getItemViewType(int i) {
            switch (this.$r8$classId) {
                case 2:
                    return i;
                case 3:
                    return ((FeaturesPageView.Item) ((FeaturesPageView) this.this$0).items.get(i)).viewType;
                default:
                    return super.getItemViewType(i);
            }
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            switch (this.$r8$classId) {
                case 0:
                    return true;
                case 1:
                    return true;
                case 2:
                    return false;
                case 3:
                    return false;
                case 4:
                    return true;
                case 5:
                    return false;
                default:
                    return true;
            }
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            switch (this.$r8$classId) {
                case 0:
                    UserCell userCell = (UserCell) viewHolder.itemView;
                    MessageSeenView messageSeenView = (MessageSeenView) this.this$0;
                    userCell.setUser((TLObject) messageSeenView.users.get(i), false, ((Integer) messageSeenView.dates.get(i)).intValue());
                    break;
                case 1:
                    ((FiltersView.ViewHolder) viewHolder).filterView.setData((FiltersView.MediaFilterData) ((FiltersView) this.this$0).usersFilters.get(i));
                    break;
                case 2:
                    break;
                case 3:
                    FeaturesPageView featuresPageView = (FeaturesPageView) this.this$0;
                    if (((FeaturesPageView.Item) featuresPageView.items.get(i)).viewType == 1) {
                        FeaturesPageView.ItemCell itemCell = (FeaturesPageView.ItemCell) viewHolder.itemView;
                        itemCell.imageView.setColorFilter(new PorterDuffColorFilter(featuresPageView.bitmap.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                        ImageView imageView = itemCell.imageView;
                        Context context = featuresPageView.getContext();
                        ArrayList arrayList = featuresPageView.items;
                        imageView.setImageDrawable(context.getDrawable(((FeaturesPageView.Item) arrayList.get(i)).iconRes));
                        itemCell.textView.setText(((FeaturesPageView.Item) arrayList.get(i)).text);
                        itemCell.description.setText(((FeaturesPageView.Item) arrayList.get(i)).description);
                    }
                    break;
                case 4:
                    if (i >= 0) {
                        SearchTagsList searchTagsList = (SearchTagsList) this.this$0;
                        ArrayList arrayList2 = searchTagsList.items;
                        if (i < arrayList2.size()) {
                            SearchTagsList.Item item = (SearchTagsList.Item) arrayList2.get(i);
                            View view = viewHolder.itemView;
                            final SearchTagsList.TagButton tagButton = (SearchTagsList.TagButton) view;
                            ReactionsLayoutInBubble.VisibleReaction visibleReaction = tagButton.lastReaction;
                            boolean z = visibleReaction == null || !visibleReaction.equals(item.reaction);
                            if (z) {
                                final TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                                tL_reactionCount.reaction = item.reaction.toTLReaction();
                                tL_reactionCount.count = item.count;
                                SearchTagsList searchTagsList2 = SearchTagsList.this;
                                final int i2 = searchTagsList2.currentAccount;
                                final Theme.ResourcesProvider resourcesProvider = searchTagsList2.resourcesProvider;
                                ?? r1 = new ReactionsLayoutInBubble.ReactionButton(i2, tagButton, tL_reactionCount, resourcesProvider) {
                                    public AnonymousClass1(final int i3, final View tagButton2, final TLRPC.TL_reactionCount tL_reactionCount2, final Theme.ResourcesProvider resourcesProvider2) {
                                        super(null, i3, tagButton2, tL_reactionCount2, false, true, resourcesProvider2);
                                    }

                                    @Override
                                    public final boolean drawCounter() {
                                        return this.count > 0 || this.hasName || this.counterDrawable.countChangeProgress != 1.0f;
                                    }

                                    @Override
                                    public final boolean drawTagDot() {
                                        return !drawCounter();
                                    }

                                    @Override
                                    public final int getCacheType() {
                                        return 18;
                                    }

                                    @Override
                                    public final void updateColors(float f) {
                                        int i3 = this.fromTextColor;
                                        TagButton tagButton2 = TagButton.this;
                                        this.lastDrawnTextColor = ColorUtils.blendARGB(f, i3, Theme.getColor(tagButton2.chosen ? Theme.key_chat_inReactionButtonTextSelected : Theme.key_actionBarActionModeReactionText, SearchTagsList.this.resourcesProvider));
                                        int iBlendARGB = ColorUtils.blendARGB(f, this.fromBackgroundColor, tagButton2.chosen ? Theme.getColor(Theme.key_chat_inReactionButtonBackground, SearchTagsList.this.resourcesProvider) : 0);
                                        this.lastDrawnBackgroundColor = iBlendARGB;
                                        this.lastDrawnTextColor = Theme.blendOver(iBlendARGB, this.lastDrawnTextColor);
                                        this.lastDrawnTagDotColor = ColorUtils.blendARGB(f, this.fromTagDotColor, tagButton2.chosen ? 1526726655 : Theme.getColor(Theme.key_actionBarActionModeReactionDot, SearchTagsList.this.resourcesProvider));
                                    }
                                };
                                tagButton2.reactionButton = r1;
                                r1.counterDrawable.setSize(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(100.0f));
                                SearchTagsList.TagButton.AnonymousClass1 anonymousClass1 = tagButton2.reactionButton;
                                anonymousClass1.drawBgOnlyIfChosen = true;
                                anonymousClass1.isTag = true;
                            } else {
                                tagButton2.reactionButton.count = item.count;
                            }
                            tagButton2.lastReaction = item.reaction;
                            if (!z) {
                                SearchTagsList.TagButton.AnonymousClass1 anonymousClass2 = tagButton2.reactionButton;
                                anonymousClass2.animateFromWidth = anonymousClass2.width;
                            }
                            tagButton2.reactionButton.width = AndroidUtilities.dp(44.33f);
                            tagButton2.reactionButton.hasName = !TextUtils.isEmpty(item.name);
                            SearchTagsList.TagButton.AnonymousClass1 anonymousClass3 = tagButton2.reactionButton;
                            boolean z2 = anonymousClass3.hasName;
                            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = anonymousClass3.textDrawable;
                            if (z2) {
                                animatedTextDrawable.setText(Emoji.replaceEmoji(item.name, animatedTextDrawable.textPaint.getFontMetricsInt(), false), !z, true);
                            } else if (animatedTextDrawable != null) {
                                animatedTextDrawable.setText("", !z, true);
                            }
                            SearchTagsList.TagButton.AnonymousClass1 anonymousClass4 = tagButton2.reactionButton;
                            Integer.toString(item.count);
                            anonymousClass4.getClass();
                            tagButton2.reactionButton.counterDrawable.setCount(item.count, !z);
                            SearchTagsList.TagButton.AnonymousClass1 anonymousClass5 = tagButton2.reactionButton;
                            CounterView.CounterDrawable counterDrawable = anonymousClass5.counterDrawable;
                            if (counterDrawable != null && (anonymousClass5.count > 0 || anonymousClass5.hasName)) {
                                anonymousClass5.width = (int) (AndroidUtilities.dp(tagButton2.reactionButton.hasName ? 4.0f : 0.0f) + ((int) Math.ceil(counterDrawable.countLayoutWidth)) + tagButton2.reactionButton.textDrawable.currentWidth + anonymousClass5.width);
                            }
                            if (z) {
                                SearchTagsList.TagButton.AnonymousClass1 anonymousClass6 = tagButton2.reactionButton;
                                anonymousClass6.animateFromWidth = anonymousClass6.width;
                            }
                            tagButton2.reactionButton.height = AndroidUtilities.dp(28.0f);
                            SearchTagsList.TagButton.AnonymousClass1 anonymousClass7 = tagButton2.reactionButton;
                            anonymousClass7.choosen = tagButton2.chosen;
                            if (tagButton2.attached) {
                                anonymousClass7.attach();
                            }
                            if (!z) {
                                tagButton2.requestLayout();
                            }
                            ((SearchTagsList.TagButton) view).setChosen(item.reaction.hash == searchTagsList.chosen, false);
                            break;
                        }
                    }
                    break;
                case 5:
                    int[] iArr = ((StarGiftSheet) this.this$0).heights;
                    int length = (iArr.length - 1) - i;
                    BottomSheetLayouted.SpaceView spaceView = (BottomSheetLayouted.SpaceView) viewHolder.itemView;
                    int i3 = iArr[length];
                    if (spaceView.height != i3) {
                        spaceView.height = i3;
                        spaceView.requestLayout();
                    }
                    break;
                default:
                    ((WallpapersListActivity.ColorCell) viewHolder.itemView).color = WallpapersListActivity.searchColors[i];
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View fixedHeightEmptyCell;
            switch (this.$r8$classId) {
                case 0:
                    UserCell userCell = new UserCell(viewGroup.getContext());
                    userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(50.0f)));
                    return new RecyclerListView.Holder(userCell);
                case 1:
                    FiltersView.FilterView filterView = new FiltersView.FilterView(viewGroup.getContext(), ((FiltersView) this.this$0).resourcesProvider);
                    FiltersView.ViewHolder viewHolder = new FiltersView.ViewHolder(filterView);
                    filterView.setLayoutParams(new RecyclerView.LayoutParams(-2, AndroidUtilities.dp(30.0f)));
                    return viewHolder;
                case 2:
                    return new RecyclerListView.Holder(((BottomSheetLayouted) this.this$0).layout);
                case 3:
                    FeaturesPageView featuresPageView = (FeaturesPageView) this.this$0;
                    if (i == 0) {
                        fixedHeightEmptyCell = new FeaturesPageView.HeaderView(featuresPageView, featuresPageView.getContext());
                    } else {
                        fixedHeightEmptyCell = i == 2 ? new FixedHeightEmptyCell(featuresPageView.getContext(), 16) : new FeaturesPageView.ItemCell(featuresPageView, featuresPageView.getContext());
                    }
                    return zzkl.m(fixedHeightEmptyCell, fixedHeightEmptyCell);
                case 4:
                    SearchTagsList searchTagsList = (SearchTagsList) this.this$0;
                    return new RecyclerListView.Holder(searchTagsList.new TagButton(searchTagsList.getContext()));
                case 5:
                    BottomSheetLayouted.SpaceView spaceView = new BottomSheetLayouted.SpaceView(((StarGiftSheet) this.this$0).getContext());
                    spaceView.height = 0;
                    return new RecyclerListView.Holder(spaceView);
                default:
                    WallpapersListActivity.SearchAdapter searchAdapter = (WallpapersListActivity.SearchAdapter) this.this$0;
                    return new RecyclerListView.Holder(WallpapersListActivity.this.new ColorCell(searchAdapter.mContext));
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            switch (this.$r8$classId) {
                case 4:
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (adapterPosition >= 0) {
                        SearchTagsList searchTagsList = (SearchTagsList) this.this$0;
                        ArrayList arrayList = searchTagsList.items;
                        if (adapterPosition < arrayList.size()) {
                            ((SearchTagsList.TagButton) viewHolder.itemView).setChosen(((SearchTagsList.Item) arrayList.get(adapterPosition)).reaction.hash == searchTagsList.chosen, false);
                            break;
                        }
                    }
                    break;
            }
        }

        public void setHeights(int i, int i2) {
            int[] iArr = ((StarGiftSheet) this.this$0).heights;
            if (iArr[0] == i && iArr[1] == i2) {
                return;
            }
            iArr[0] = i;
            iArr[1] = i2;
            this.mObservable.notifyChanged();
        }

        private final void onBindViewHolder$org$telegram$ui$Components$BottomSheetLayouted$Adapter(RecyclerView.ViewHolder viewHolder, int i) {
        }
    }
}
