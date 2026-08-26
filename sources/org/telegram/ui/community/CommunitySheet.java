package org.telegram.ui.community;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.CacheControlActivity$$ExternalSyntheticLambda23;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda85;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda1;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.cells.CommunityRequestsCell;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;

public final class CommunitySheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target, DialogCell.DialogCellDelegate {
    public static final int $r8$clinit = 0;
    public ButtonWithCounterView addChatToCommunityButton;
    public final BoolAnimator animatorSearchChatsVisible;
    public final BoolAnimator animatorSearchMessagesVisible;
    public final Paint backgroundPaint;
    public final ChatsToAddListPage chatsPage;
    public final RichDetailsCell.AnonymousClass2 chatsPageFadeView;
    public final FragmentSearchField chatsSearchView;
    public final CacheControlActivity$$ExternalSyntheticLambda23 chatsToAddCallback;
    public ArrayList chatsToAddToCommunity;
    public ButtonWithCounterView closeChatToCommunityButton;
    public boolean collapsedInDialogs;
    public final long communityId;
    public final CommunityPage communityPage;
    public final RichDetailsCell.AnonymousClass2 communityPageFadeView;
    public TLRPC.Chat currentCommunity;
    public final View fakeAnchorView;
    public final FilteredSearchView filteredSearchView;
    public final UniversalRecyclerView foundChatsView;
    public final GradientProtectionDrawable gradientProtectionDrawableBottom;
    public final GradientProtectionDrawable gradientProtectionDrawableTop;
    public String lastSearchChatsString;
    public String lastSearchString;
    public final FragmentSearchField messagesSearchView;
    public final boolean onlyChatsMode;
    public final BaseFragment parentFragment;
    public final CommunityUtils.PendingRequests pendingRequestsList;
    public final PendingRequestsPage requestsPage;
    public Insets systemAndImeInsets;
    public Insets systemInsets;
    public final PollItemMenu.AnonymousClass3 viewPager;

    public final class AnonymousClass4 implements SearchViewPager.ChatPreviewDelegate {
        @Override
        public final void finish() {
        }

        @Override
        public final void move(float f) {
        }

        @Override
        public final void startChatPreview(DialogCell dialogCell) {
        }
    }

    public final class AnonymousClass8 implements Bulletin.Delegate {
        @Override
        public final boolean allowLayoutChanges() {
            return true;
        }

        @Override
        public final boolean bottomOffsetAnimated() {
            return true;
        }

        @Override
        public final boolean clipWithGradient(int i) {
            return false;
        }

        @Override
        public final int getBottomOffset(int i) {
            return AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight;
        }

        @Override
        public final int getTopOffset() {
            return 0;
        }

        @Override
        public final void onBottomOffsetChange(float f) {
        }

        @Override
        public final void onHide(Bulletin bulletin) {
        }

        @Override
        public final void onShow(Bulletin bulletin) {
        }
    }

    public final class ChatsToAddListPage extends Page {
        public ChatsToAddListPage(Context context) {
            super(context);
            AndroidUtilities.removeFromParent(this.fadeView);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new CommunitySheet$$ExternalSyntheticLambda0(CommunitySheet.this, 3), new CommunitySheet$$ExternalSyntheticLambda1(CommunitySheet.this, 2), null, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            UniversalRecyclerView universalRecyclerView2 = this.listView;
            universalRecyclerView2.adapter.applyBackground = false;
            universalRecyclerView2.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
            this.contentView.addView(CommunitySheet.this.foundChatsView, LayoutHelper.createFrame(-1.0f, -1));
            this.contentView.addView(this.listView, 0, LayoutHelper.createFrame(-1.0f, -1));
            this.contentView.addView(CommunitySheet.this.chatsPageFadeView, LayoutHelper.createFrame(-1.0f, -1));
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            this.actionBar.setTitleColor(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            ActionBar actionBar2 = this.actionBar;
            boolean z = CommunitySheet.this.onlyChatsMode;
            actionBar2.setBackButtonImage(z ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 10));
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            this.contentView.addView(CommunitySheet.this.chatsSearchView, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            actionBarMenuCreateMenu.setGlassMode(true);
            actionBarMenuCreateMenu.setTranslationX(-AndroidUtilities.dp(7.0f));
            actionBarMenuCreateMenu.addItem(3, R.drawable.outline_header_search);
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), ((BottomSheet) CommunitySheet.this).resourcesProvider, true);
            CommunitySheet.this.closeChatToCommunityButton = buttonWithCounterView;
            buttonWithCounterView.setRoundRadius(24);
            CommunitySheet.this.closeChatToCommunityButton.setText(LocaleController.getString(R.string.OK));
            CommunitySheet.this.closeChatToCommunityButton.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(this, 7));
            if (z) {
                CommunitySheet.this.closeChatToCommunityButton.setVisibility(8);
            }
            this.contentView.addView(CommunitySheet.this.closeChatToCommunityButton, LayoutHelper.createFrameMarginPx(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            afterInit();
        }

        @Override
        public final float top() {
            return FBool.not(CommunitySheet.this.animatorSearchChatsVisible.floatValue) * super.top();
        }

        @Override
        public final void updateTops() {
            super.updateTops();
            CommunitySheet.this.chatsSearchView.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, top() + AndroidUtilities.dp(4.0f)));
        }
    }

    public final class CommunityPage extends Page {
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarImage;

        public CommunityPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new CommunitySheet$$ExternalSyntheticLambda0(CommunitySheet.this, 4), new CommunitySheet$$ExternalSyntheticLambda1(CommunitySheet.this, 3), new CommunitySheet$$ExternalSyntheticLambda1(CommunitySheet.this, 4), ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            UniversalRecyclerView universalRecyclerView2 = this.listView;
            universalRecyclerView2.adapter.applyBackground = false;
            universalRecyclerView2.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
            AndroidUtilities.removeFromParent(this.fadeView);
            this.contentView.addView(CommunitySheet.this.filteredSearchView, LayoutHelper.createFrame(-1.0f, -1));
            this.contentView.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
            this.contentView.addView(CommunitySheet.this.communityPageFadeView, LayoutHelper.createFrame(-1.0f, -1));
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            this.actionBar.setTitleColor(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(DialogObject.getName(CommunitySheet.this.currentCommunity));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 11));
            AvatarDrawable avatarDrawable = new AvatarDrawable(CommunitySheet.this.currentCommunity);
            this.avatarDrawable = avatarDrawable;
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(9.0f));
            backupImageView.imageReceiver.setForUserOrChat(CommunitySheet.this.currentCommunity, avatarDrawable);
            backupImageView.onNewImageSet();
            this.actionBar.addView(backupImageView, LayoutHelper.createFrame(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            this.contentView.addView(CommunitySheet.this.messagesSearchView, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            actionBarMenuCreateMenu.setGlassMode(true);
            actionBarMenuCreateMenu.setTranslationX(-AndroidUtilities.dp(7.0f));
            actionBarMenuCreateMenu.addItem(3, R.drawable.outline_header_search);
            if (ChatObject.hasAdminRights(CommunitySheet.this.currentCommunity)) {
                actionBarMenuCreateMenu.addItem(2, R.drawable.msg_download_settings);
            }
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), ((BottomSheet) CommunitySheet.this).resourcesProvider, true);
            buttonWithCounterView.setRoundRadius(24);
            if (ChatObject.canAddChatToCommunity(CommunitySheet.this.currentCommunity)) {
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.filled_add_album);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                buttonWithCounterView.setText(spannableStringBuilder);
            } else {
                buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
            }
            CommunitySheet.this.addChatToCommunityButton = buttonWithCounterView;
            buttonWithCounterView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(this, 8));
            this.contentView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            afterInit();
        }

        @Override
        public final float top() {
            return FBool.not(CommunitySheet.this.animatorSearchMessagesVisible.floatValue) * super.top();
        }

        @Override
        public final void updateTops() {
            super.updateTops();
            CommunitySheet.this.messagesSearchView.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, top() + AndroidUtilities.dp(4.0f)));
        }
    }

    public abstract class Page extends FrameLayout {
        public ActionBar actionBar;
        public final FrameLayout contentView;
        public final ChatActivityFadeView fadeView;
        public UniversalRecyclerView listView;
        public boolean wasAtTop;

        public Page(Context context) {
            super(context);
            FrameLayout frameLayout = new FrameLayout(context);
            this.contentView = frameLayout;
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setClipToPadding(true);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(getContext());
            this.fadeView = chatActivityFadeView;
            chatActivityFadeView.setupColorKey(Theme.key_windowBackgroundGray);
            chatActivityFadeView.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
            chatActivityFadeView.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            chatActivityFadeView.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
            chatActivityFadeView.fadeDrawableTop.setFadeHeight(-AndroidUtilities.dp(20.0f), false);
            frameLayout.addView(chatActivityFadeView, LayoutHelper.createFrame(-1.0f, -1));
        }

        public final void afterInit() {
            this.listView.addOnScrollListener(new SettingsActivity.AnonymousClass5(this, 24));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                public final boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
                    return true;
                }

                @Override
                public final void onAddAnimationUpdate() {
                    Page page = Page.this;
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    page.contentView.invalidate();
                }

                @Override
                public final void onChangeAnimationUpdate() {
                    Page page = Page.this;
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    page.contentView.invalidate();
                }

                @Override
                public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    Page page = Page.this;
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    page.contentView.invalidate();
                    page.listView.invalidate();
                }

                @Override
                public final void onRemoveAnimationUpdate() {
                    Page page = Page.this;
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    page.contentView.invalidate();
                }
            };
            defaultItemAnimator.setDurations(350L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.delayAnimations = false;
            defaultItemAnimator.mSupportsChangeAnimations = false;
            this.listView.setItemAnimator(defaultItemAnimator);
        }

        public float top() {
            float fMin = AndroidUtilities.displaySize.y;
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(childAt);
                if (childViewHolder != null) {
                    UItem item = this.listView.adapter.getItem(childViewHolder.getAdapterPosition());
                    if (item != null && item.id != 99) {
                        fMin = Math.min(childAt.getY() + this.contentView.getPaddingTop(), fMin);
                    }
                }
            }
            return fMin;
        }

        public void updateTops() {
            float pVar = top();
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, pVar));
            }
        }
    }

    public final class PendingRequestsPage extends Page {
        public PendingRequestsPage(Context context) {
            super(context);
            int i = 5;
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new CommunitySheet$$ExternalSyntheticLambda0(CommunitySheet.this, i), new CommunitySheet$$ExternalSyntheticLambda1(CommunitySheet.this, i), null, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            UniversalRecyclerView universalRecyclerView2 = this.listView;
            universalRecyclerView2.adapter.applyBackground = false;
            universalRecyclerView2.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
            this.listView.addOnScrollListener(new SettingsActivity.AnonymousClass5(this, 25));
            this.contentView.addView(this.listView, 0, LayoutHelper.createFrame(-1.0f, -1));
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            ActionBar actionBar2 = this.actionBar;
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            actionBar2.setTitleColor(CommunitySheet.this.getThemedColor(i2));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 12));
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            LinearLayout linearLayoutM = zzkf.m(context, 0);
            linearLayoutM.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BottomSheet) CommunitySheet.this).resourcesProvider, true);
            buttonWithCounterView.setNeutral();
            buttonWithCounterView.setColor(ColorUtils.blendARGB(0.125f, CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhite), CommunitySheet.this.getThemedColor(i2)));
            buttonWithCounterView.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
            buttonWithCounterView.setRoundRadius(24);
            final int i3 = 0;
            buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                public final CommunitySheet.PendingRequestsPage f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(false, true);
                            break;
                        default:
                            CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(true, true);
                            break;
                    }
                }
            });
            linearLayoutM.addView(buttonWithCounterView, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, ((BottomSheet) CommunitySheet.this).resourcesProvider, true);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
            buttonWithCounterView2.setRoundRadius(24);
            final int i4 = 1;
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener(this) {
                public final CommunitySheet.PendingRequestsPage f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(false, true);
                            break;
                        default:
                            CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(true, true);
                            break;
                    }
                }
            });
            linearLayoutM.addView(buttonWithCounterView2, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
            this.contentView.addView(linearLayoutM, LayoutHelper.createFrameMarginPx(-2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
            afterInit();
        }
    }

    public CommunitySheet(final BaseFragment baseFragment, long j, ArrayList arrayList, CacheControlActivity$$ExternalSyntheticLambda23 cacheControlActivity$$ExternalSyntheticLambda23) {
        super(baseFragment.getContext(), baseFragment.getResourceProvider(), true, true);
        int i = 5;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchMessagesVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 350L, false);
        this.animatorSearchChatsVisible = new BoolAnimator(2, this, cubicBezierInterpolator, 350L, false);
        int i2 = 2;
        this.gradientProtectionDrawableTop = new GradientProtectionDrawable(2);
        int i3 = 8;
        this.gradientProtectionDrawableBottom = new GradientProtectionDrawable(8);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Insets insets = Insets.NONE;
        this.systemAndImeInsets = insets;
        this.systemInsets = insets;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.parentFragment = baseFragment;
        int i4 = 0;
        this.onlyChatsMode = arrayList != null;
        this.chatsToAddToCommunity = arrayList;
        this.chatsToAddCallback = cacheControlActivity$$ExternalSyntheticLambda23;
        Context context = baseFragment.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i5 = Theme.key_windowBackgroundGray;
        paint.setColor(Theme.getColor(i5, this.resourcesProvider));
        fixNavigationBar(Theme.getColor(i5, this.resourcesProvider));
        this.containerView = new ContainerView(this, context);
        PollItemMenu.AnonymousClass3 anonymousClass3 = new PollItemMenu.AnonymousClass3(this, context, i3);
        this.viewPager = anonymousClass3;
        int i6 = this.backgroundPaddingLeft;
        anonymousClass3.setPadding(i6, 0, i6, 0);
        this.containerView.addView(anonymousClass3, LayoutHelper.createFrame(-1, -1, 119));
        this.communityPageFadeView = new RichDetailsCell.AnonymousClass2(this, context, i);
        this.chatsPageFadeView = new RichDetailsCell.AnonymousClass2(this, context, i);
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourcesProvider);
        this.messagesSearchView = fragmentSearchField;
        fragmentSearchField.setCloseButtonVisible(true);
        fragmentSearchField.isWhiteBackground = true;
        fragmentSearchField.updateColors$1();
        int i7 = R.string.Search;
        String string = LocaleController.getString(i7);
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = fragmentSearchField.editText;
        anonymousClass4.setHint(string);
        anonymousClass4.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                String string2 = editable.toString();
                CommunitySheet communitySheet = CommunitySheet.this;
                boolean zIsEmpty = TextUtils.isEmpty(communitySheet.lastSearchString);
                communitySheet.lastSearchString = string2;
                communitySheet.filteredSearchView.search(0L, communitySheet.communityId, 0L, 0L, null, false, string2, zIsEmpty);
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }
        });
        fragmentSearchField.setVisibility(8);
        FragmentSearchField fragmentSearchField2 = new FragmentSearchField(context, this.resourcesProvider);
        this.chatsSearchView = fragmentSearchField2;
        fragmentSearchField2.setCloseButtonVisible(true);
        fragmentSearchField2.isWhiteBackground = true;
        fragmentSearchField2.updateColors$1();
        String string2 = LocaleController.getString(i7);
        UsersSelectActivity.AnonymousClass4 anonymousClass5 = fragmentSearchField2.editText;
        anonymousClass5.setHint(string2);
        anonymousClass5.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                String string3 = editable.toString();
                CommunitySheet communitySheet = CommunitySheet.this;
                communitySheet.lastSearchChatsString = string3;
                communitySheet.foundChatsView.adapter.update(true);
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }
        });
        fragmentSearchField2.setVisibility(8);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, 0, new CommunitySheet$$ExternalSyntheticLambda0(this, i4), new CommunitySheet$$ExternalSyntheticLambda1(this, i4), null, this.resourcesProvider);
        this.foundChatsView = universalRecyclerView;
        universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i8, int i9) {
                CommunitySheet communitySheet = CommunitySheet.this;
                if (communitySheet.foundChatsView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(communitySheet.chatsSearchView.editText);
                }
            }
        });
        universalRecyclerView.setClipToPadding(false);
        universalRecyclerView.setVisibility(8);
        universalRecyclerView.setSections();
        universalRecyclerView.adapter.applyBackground = false;
        universalRecyclerView.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        FilteredSearchView filteredSearchView = new FilteredSearchView(baseFragment);
        this.filteredSearchView = filteredSearchView;
        filteredSearchView.setVisibility(8);
        filteredSearchView.setBackground(null);
        filteredSearchView.setChatPreviewDelegate(new AnonymousClass4());
        filteredSearchView.setUiCallback(new FilteredSearchView.UiCallback() {
            @Override
            public final boolean actionModeShowing() {
                return false;
            }

            @Override
            public final void goToMessage(MessageObject messageObject) {
                CommunitySheet communitySheet = CommunitySheet.this;
                communitySheet.parentFragment.presentFragment(SearchViewPager.createFragmentFromMessage(messageObject, ((BottomSheet) communitySheet).currentAccount));
                communitySheet.lambda$showGiftOfferSheet$15();
            }

            @Override
            public final boolean isSelected(FilteredSearchView.MessageHashId messageHashId) {
                return false;
            }

            @Override
            public final void showActionMode() {
            }

            @Override
            public final void toggleItemSelection(MessageObject messageObject, View view, int i8) {
            }
        });
        filteredSearchView.recyclerListView.setClipToPadding(false);
        this.fakeAnchorView = new View(getContext());
        Context context2 = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        CommunityUtils.PendingRequests pendingRequests = new CommunityUtils.PendingRequests(context2, resourcesProvider, new BulletinFactory((FrameLayout) this.containerView, resourcesProvider), this.currentAccount, j);
        this.pendingRequestsList = pendingRequests;
        pendingRequests.delegate = new CommunityUtils.PendingRequests.Delegate() {
            @Override
            public final void close() {
                CommunitySheet.this.viewPager.scrollToPosition$1(0);
            }

            @Override
            public final void onClickGroupOwner(long j2) {
                baseFragment.presentFragment(ChatActivity.of(j2));
                CommunitySheet.this.lambda$showGiftOfferSheet$15();
            }

            @Override
            public final void updateAdapter() {
                CommunitySheet communitySheet = CommunitySheet.this;
                communitySheet.requestsPage.listView.adapter.update(true);
                communitySheet.communityPage.listView.adapter.update(true);
            }
        };
        this.communityId = j;
        this.currentCommunity = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
        MessagesController.getInstance(this.currentAccount).getChatFull(j);
        TLRPC.Chat chat = this.currentCommunity;
        this.collapsedInDialogs = chat != null && chat.collapsed_in_dialogs;
        FiltersView.MediaFilterData mediaFilterData = new FiltersView.MediaFilterData(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        mediaFilterData.chat = this.currentCommunity;
        mediaFilterData.removable = false;
        ArrayList arrayList2 = fragmentSearchField.currentSearchFilters;
        arrayList2.add(mediaFilterData);
        fragmentSearchField.selectedFilterIndex = arrayList2.size() - 1;
        fragmentSearchField.onFiltersChanged();
        setBackgroundColor(Theme.getColor(i5, this.resourcesProvider));
        this.requestsPage = new PendingRequestsPage(context);
        this.communityPage = new CommunityPage(context);
        this.chatsPage = new ChatsToAddListPage(context);
        anonymousClass3.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public final void bindView(View view, int i8, int i9) {
                ((Page) view).getClass();
            }

            @Override
            public final View createView(int i8) {
                CommunitySheet communitySheet = CommunitySheet.this;
                if (i8 == 2) {
                    return communitySheet.chatsPage;
                }
                return i8 == 0 ? communitySheet.communityPage : communitySheet.requestsPage;
            }

            @Override
            public final int getItemCount() {
                return CommunitySheet.this.onlyChatsMode ? 1 : 3;
            }

            @Override
            public final int getItemViewType(int i8) {
                if (CommunitySheet.this.onlyChatsMode || i8 == 2) {
                    return 2;
                }
                return i8 == 0 ? 0 : 1;
            }
        });
        fragmentSearchField.setCloseButtonOnClickListener(new CommunitySheet$$ExternalSyntheticLambda2(this, i4));
        fragmentSearchField2.setCloseButtonOnClickListener(new CommunitySheet$$ExternalSyntheticLambda2(this, i2));
        pendingRequests.loadNext();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j, 0, true);
        FrameLayout frameLayout = (FrameLayout) this.containerView;
        AnonymousClass8 anonymousClass8 = new AnonymousClass8();
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, anonymousClass8);
        }
        ViewGroup viewGroup = this.containerView;
        CommunitySheet$$ExternalSyntheticLambda1 communitySheet$$ExternalSyntheticLambda1 = new CommunitySheet$$ExternalSyntheticLambda1(this, 1);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(viewGroup, communitySheet$$ExternalSyntheticLambda1);
    }

    public static void access$3100(CommunitySheet communitySheet, UItem uItem, View view) {
        long j;
        TLRPC.Chat chat;
        if (communitySheet.checkPendingRequestClick(uItem)) {
            return;
        }
        int i = uItem.id;
        boolean zIsChannelAndNotMegaGroup = false;
        if (i == 101) {
            communitySheet.collapsedInDialogs = !communitySheet.collapsedInDialogs;
            MessagesController.getInstance(communitySheet.currentAccount).toggleCommunityCollapsedInDialogs(communitySheet.communityId, communitySheet.collapsedInDialogs);
            if (!(view instanceof TextCheckCell2)) {
                communitySheet.communityPage.listView.adapter.update(false);
                return;
            } else {
                Switch checkBox = ((TextCheckCell2) view).getCheckBox();
                checkBox.setChecked(checkBox.drawIconType, communitySheet.collapsedInDialogs, true);
                return;
            }
        }
        if (i == 100) {
            communitySheet.viewPager.scrollToPosition$1(1);
            communitySheet.pendingRequestsList.markAsViewed();
            return;
        }
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) obj;
            zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            j = -chat.id;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                return;
            }
            j = ((TLRPC.User) obj).id;
            chat = null;
        }
        TLRPC.Chat chat2 = chat;
        int communityChatType = CommunityUtils.getCommunityChatType(communitySheet.currentAccount, j);
        if (communityChatType != 1 && communityChatType != 2) {
            if (communityChatType == 3) {
                JoinGroupAlert joinGroupAlert = new JoinGroupAlert(communitySheet.getContext(), chat2, null, communitySheet.parentFragment, communitySheet.resourcesProvider);
                joinGroupAlert.bulletinFactory = new BulletinFactory((FrameLayout) communitySheet.containerView, communitySheet.resourcesProvider);
                joinGroupAlert.show();
                return;
            } else {
                if (communityChatType == 4) {
                    FactCheckController$$ExternalSyntheticOutline0.m(zIsChannelAndNotMegaGroup ? R.string.CommunityHiddenChannelUnavailable : R.string.CommunityHiddenGroupUnavailable, new BulletinFactory((FrameLayout) communitySheet.containerView, communitySheet.resourcesProvider), R.raw.e_hand_2, 36);
                    return;
                }
                return;
            }
        }
        BaseFragment baseFragment = communitySheet.parentFragment;
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            TLRPC.Chat chat3 = chatActivity.currentChat;
            TLRPC.User currentUser = chatActivity.getCurrentUser();
            if ((chat3 != null && chat3.id == (-j)) || (currentUser != null && currentUser.id == j)) {
                communitySheet.lambda$showGiftOfferSheet$15();
                return;
            }
        }
        Bundle bundle = new Bundle();
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        if (!ChatObject.isForum(chat2)) {
            baseFragment.presentFragment(new ChatActivity(bundle));
        } else if (ChatObject.areTabsEnabled(chat2)) {
            ChatActivity chatActivity2 = new ChatActivity(bundle);
            ForumUtilities.applyTopic(chatActivity2, MessagesStorage.TopicKey.of(j, MessagesController.getInstance(communitySheet.currentAccount).getForumLastTopicId(chat2.id)));
            baseFragment.presentFragment(chatActivity2);
        } else {
            baseFragment.presentFragment(new TopicsFragment(bundle));
        }
        communitySheet.lambda$showGiftOfferSheet$15();
    }

    public static void access$3200(CommunitySheet communitySheet, ArrayList arrayList) {
        boolean z;
        ArrayList arrayList2;
        communitySheet.getClass();
        arrayList.add(UItem.asSpace(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i = 0;
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        UItem uItem = new UItem(39);
        uItem.id = 101;
        uItem.text = string;
        uItem.intValue = 0;
        uItem.setChecked(communitySheet.collapsedInDialogs);
        arrayList.add(uItem);
        arrayList.add(UItem.asShadow(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        CommunityUtils.PendingRequests pendingRequests = communitySheet.pendingRequestsList;
        if (pendingRequests.finished && pendingRequests.totalCount == 1 && (arrayList2 = pendingRequests.pendingRequests) != null && arrayList2.size() == 1) {
            arrayList.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            pendingRequests.fillItems(arrayList);
            arrayList.add(UItem.asSpace(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i2 = pendingRequests.totalCount;
            if (i2 > 0) {
                int i3 = pendingRequests.unreadPendingRequests;
                int i4 = R.drawable.filled_requests_24;
                String string2 = i2 == i3 ? LocaleController.getString(R.string.CommunityPendingRequests) : LocaleController.formatPluralString("CommunityPendingRequestsRow", i2, new Object[0]);
                String string3 = i3 > 0 ? Integer.toString(i3) : null;
                int i5 = CommunityRequestsCell.Factory.$r8$clinit;
                UItem uItemOfFactory = UItem.ofFactory(CommunityRequestsCell.Factory.class);
                uItemOfFactory.id = 100;
                uItemOfFactory.iconResId = i4;
                uItemOfFactory.text = string2;
                uItemOfFactory.textValue = string3;
                uItemOfFactory.longValue = (((long) (-15497247)) << 32) | (((long) (-14899731)) & 4294967295L);
                uItemOfFactory.accent = true;
                arrayList.add(uItemOfFactory);
                arrayList.add(UItem.asSpace(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog communityPeersDialogBuildCommunityPeers = MessagesController.getInstance(communitySheet.currentAccount).buildCommunityPeers(communitySheet.communityId);
        if (communityPeersDialogBuildCommunityPeers == null) {
            return;
        }
        if (communityPeersDialogBuildCommunityPeers.chatsYouAreIn.isEmpty()) {
            z = false;
        } else {
            arrayList.add(UItem.asHeader(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = communityPeersDialogBuildCommunityPeers.chatsYouAreIn;
            int size = arrayList3.size();
            int i6 = 0;
            while (i6 < size) {
                MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i6);
                i6++;
                arrayList.add(CommunityUtils.DialogCellFactory.asCell(communityPeerDialog, communitySheet));
            }
            z = true;
        }
        if (!communityPeersDialogBuildCommunityPeers.chatsYouCanView.isEmpty()) {
            if (z) {
                arrayList.add(UItem.asSpace(22, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(UItem.asHeader(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = communityPeersDialogBuildCommunityPeers.chatsYouCanView;
            int size2 = arrayList4.size();
            int i7 = 0;
            while (i7 < size2) {
                MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i7);
                i7++;
                arrayList.add(CommunityUtils.DialogCellFactory.asCell(communityPeerDialog2, communitySheet));
            }
            z = true;
        }
        if (!communityPeersDialogBuildCommunityPeers.chatsYouCanJoin.isEmpty()) {
            if (z) {
                arrayList.add(UItem.asSpace(24, AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(UItem.asHeader(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
            ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = communityPeersDialogBuildCommunityPeers.chatsYouCanJoin;
            int size3 = arrayList5.size();
            int i8 = 0;
            while (i8 < size3) {
                MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i8);
                i8++;
                arrayList.add(CommunityUtils.DialogCellFactory.asCell(communityPeerDialog3, communitySheet));
            }
            z = true;
        }
        if (communityPeersDialogBuildCommunityPeers.chatsOther.isEmpty()) {
            return;
        }
        if (z) {
            arrayList.add(UItem.asSpace(26, AndroidUtilities.dp(12.0f)));
        }
        arrayList.add(UItem.asHeader(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
        ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = communityPeersDialogBuildCommunityPeers.chatsOther;
        int size4 = arrayList6.size();
        while (i < size4) {
            MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i);
            i++;
            arrayList.add(CommunityUtils.DialogCellFactory.asCell(communityPeerDialog4, communitySheet));
        }
    }

    @Override
    public final boolean canClickButtonInside() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.animatorSearchMessagesVisible.value || this.animatorSearchChatsVisible.value) {
            return false;
        }
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return ((Page) currentView).wasAtTop;
        }
        return true;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    public final boolean checkPendingRequestClick(UItem uItem) {
        Object obj = uItem.object;
        if (!(obj instanceof CommunityPendingRequestCell.Data)) {
            return false;
        }
        CommunityPendingRequestCell.Data data = (CommunityPendingRequestCell.Data) obj;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-data.dialogToAdd));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(data.dialogToAdd));
        BaseFragment baseFragment = this.parentFragment;
        if (user != null) {
            baseFragment.presentFragment(ChatActivity.of(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            baseFragment.presentFragment(ChatActivity.of(-chat.id));
            return true;
        }
        new CommunityInviteOnlySheet(getContext(), chat, new RichTableCell$$ExternalSyntheticLambda3(9, this, data)).show();
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.chatInfoDidLoad;
        long j = this.communityId;
        CommunityPage communityPage = this.communityPage;
        if (i == i3) {
            if (((TLRPC.ChatFull) objArr[0]).id == j) {
                communityPage.listView.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            this.currentCommunity = chat;
            communityPage.actionBar.setTitle(DialogObject.getName(chat));
            BackupImageView backupImageView = communityPage.avatarImage;
            backupImageView.imageReceiver.setForUserOrChat(this.currentCommunity, communityPage.avatarDrawable);
            backupImageView.onNewImageSet();
        }
    }

    @Override
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    public final void fillItemsChatsToAddImpl(ArrayList arrayList, boolean z) {
        String str;
        int i = 0;
        if (!z) {
            arrayList.add(UItem.asSpace(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.chatsToAddToCommunity != null) {
            String lowerCase = (!z || (str = this.lastSearchChatsString) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.chatsToAddToCommunity;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z || TextUtils.isEmpty(lowerCase)) {
                    UItem uItem = new UItem(32);
                    uItem.object = chat;
                    arrayList.add(uItem);
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        UItem uItem2 = new UItem(32);
                        uItem2.object = chat;
                        arrayList.add(uItem2);
                    }
                }
            }
        }
    }

    public final void lambda$linkToCommunity$10(boolean z, TLRPC.TL_error tL_error) {
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        if (tL_error == null) {
            CommunityUtils.showCommunityLinkSuccessToast(new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), 1, z);
            anonymousClass3.scrollToPosition$1(0);
        } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
            zzlu.m((FrameLayout) this.containerView, this.resourcesProvider, tL_error);
        } else {
            CommunityUtils.showCommunityLinkSuccessToast(new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), 2, z);
            anonymousClass3.scrollToPosition$1(0);
        }
    }

    public final void lambda$linkToCommunity$9(AlertDialog alertDialog, long j, boolean z, long j2) {
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        linkToCommunity(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2)), j, z);
    }

    public final void lambda$loadChatsToAddToCommunity$8(ArrayList arrayList, TLRPC.TL_error tL_error) {
        this.addChatToCommunityButton.setLoading(false);
        if (tL_error != null) {
            zzlu.m((FrameLayout) this.containerView, this.resourcesProvider, tL_error);
            return;
        }
        if (arrayList != null) {
            this.chatsToAddToCommunity = arrayList;
            if (!arrayList.isEmpty()) {
                this.chatsPage.listView.adapter.update(false);
                this.viewPager.scrollToPosition$1(2);
            } else {
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.CommunityNoChatsToAdd, new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider), R.raw.info, 36);
            }
        }
    }

    public final void lambda$onLongClickCommunity$4(TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            zzlu.m((FrameLayout) this.containerView, this.resourcesProvider, tL_error);
        }
    }

    public final void lambda$onLongClickCommunity$5(long j) {
        MessagesController.getInstance(this.currentAccount).unlinkCommunity(j, this.communityId, new CommunitySheet$$ExternalSyntheticLambda0(this, 1));
    }

    public final void lambda$onLongClickCommunity$6(long j, boolean z, boolean z2) {
        int i;
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z) {
            i = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else {
            i = z2 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        AlertDialog alertDialogCreateSimpleConfirmAlert = AlertsCreator.createSimpleConfirmAlert(context, resourcesProvider, string, LocaleController.getString(i), LocaleController.getString(R.string.Remove), new LinkManager$3$$ExternalSyntheticLambda0(this, j, 29));
        alertDialogCreateSimpleConfirmAlert.show();
        TextView textView = (TextView) alertDialogCreateSimpleConfirmAlert.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public final void linkToCommunity(TLRPC.Chat chat, long j, boolean z) {
        long j2 = -chat.id;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (ChatObject.isChannel(chat)) {
            MessagesController.getInstance(this.currentAccount).linkCommunity(j2, j, z, new ProfileActivity$$ExternalSyntheticLambda85(zIsChannelAndNotMegaGroup, this, 2));
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 250L);
        MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j2, null, new CommunitySheet$$ExternalSyntheticLambda6(this, alertDialog, j, z, 0));
    }

    public final void loadChatsToAddToCommunity() {
        ButtonWithCounterView buttonWithCounterView = this.addChatToCommunityButton;
        if (buttonWithCounterView.loading) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        MessagesController.getInstance(this.currentAccount).fetchChatsToAddToCommunity(new CommunitySheet$$ExternalSyntheticLambda0(this, 2));
    }

    @Override
    public final void lambda$openCrafting$8() {
        PollItemMenu.AnonymousClass3 anonymousClass3 = this.viewPager;
        if (anonymousClass3.getCurrentPosition() <= 0) {
            super.lambda$openCrafting$8();
            return;
        }
        if (anonymousClass3.getCurrentPosition() == 2) {
            BoolAnimator boolAnimator = this.animatorSearchChatsVisible;
            if (boolAnimator.value) {
                this.chatsPage.listView.layoutManager.scrollToPositionWithOffset(1, this.systemInsets.top);
                boolAnimator.setValue(false, true);
                setAllowNestedScroll(true);
                FragmentSearchField fragmentSearchField = this.chatsSearchView;
                AndroidUtilities.hideKeyboard(fragmentSearchField.editText);
                fragmentSearchField.editText.clearFocus();
                return;
            }
        }
        anonymousClass3.scrollToPosition$1(0);
    }

    @Override
    public final void onButtonClicked(DialogCell dialogCell) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        if (dialogCell.getMessage() == null || (tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-dialogCell.getDialogId(), MessageObject.getTopicId(this.currentAccount, dialogCell.getMessage().messageOwner, true))) == null) {
            return;
        }
        ForumUtilities.openTopic(this.parentFragment, -dialogCell.getDialogId(), tL_forumTopicFindTopic, 0);
    }

    @Override
    public final void onButtonLongPress(DialogCell dialogCell) {
    }

    public final void onClickChatToAdd(UItem uItem) {
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.onlyChatsMode) {
                new CommunityAddOptionsSheet(getContext(), this.currentCommunity, -chat.id, new ThemeActivity$$ExternalSyntheticLambda19(16, this, chat)).show();
            } else {
                this.chatsToAddCallback.run(chat);
                lambda$showGiftOfferSheet$15();
            }
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 1) {
            float fNot = FBool.not(f);
            float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fNot);
            CommunityPage communityPage = this.communityPage;
            communityPage.actionBar.setAlpha(fNot);
            communityPage.actionBar.setScaleX(fLerp);
            communityPage.actionBar.setScaleY(fLerp);
            communityPage.actionBar.setVisibility(fNot > 0.0f ? 0 : 8);
            float fLerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f);
            FragmentSearchField fragmentSearchField = this.messagesSearchView;
            fragmentSearchField.setAlpha(f);
            fragmentSearchField.setScaleX(fLerp2);
            fragmentSearchField.setScaleY(fLerp2);
            fragmentSearchField.setVisibility(f > 0.0f ? 0 : 8);
            communityPage.listView.setAlpha(fNot);
            communityPage.listView.setVisibility(fNot > 0.0f ? 0 : 8);
            this.addChatToCommunityButton.setAlpha(fNot);
            this.addChatToCommunityButton.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, fNot));
            this.addChatToCommunityButton.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, fNot));
            this.addChatToCommunityButton.setVisibility(fNot > 0.0f ? 0 : 8);
            FilteredSearchView filteredSearchView = this.filteredSearchView;
            filteredSearchView.setAlpha(f);
            filteredSearchView.setVisibility(f > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.communityPageFadeView.invalidate();
        }
        if (i == 2) {
            float fNot2 = FBool.not(f);
            float fLerp3 = AndroidUtilities.lerp(0.9f, 1.0f, fNot2);
            ChatsToAddListPage chatsToAddListPage = this.chatsPage;
            chatsToAddListPage.actionBar.setAlpha(fNot2);
            chatsToAddListPage.actionBar.setScaleX(fLerp3);
            chatsToAddListPage.actionBar.setScaleY(fLerp3);
            chatsToAddListPage.actionBar.setVisibility(fNot2 > 0.0f ? 0 : 8);
            float fLerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f);
            FragmentSearchField fragmentSearchField2 = this.chatsSearchView;
            fragmentSearchField2.setAlpha(f);
            fragmentSearchField2.setScaleX(fLerp4);
            fragmentSearchField2.setScaleY(fLerp4);
            fragmentSearchField2.setVisibility(f > 0.0f ? 0 : 8);
            chatsToAddListPage.listView.setAlpha(fNot2);
            chatsToAddListPage.listView.setVisibility(fNot2 > 0.0f ? 0 : 8);
            if (!this.onlyChatsMode) {
                this.closeChatToCommunityButton.setAlpha(fNot2);
                this.closeChatToCommunityButton.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, fNot2));
                this.closeChatToCommunityButton.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, fNot2));
                this.closeChatToCommunityButton.setVisibility(fNot2 > 0.0f ? 0 : 8);
            }
            UniversalRecyclerView universalRecyclerView = this.foundChatsView;
            universalRecyclerView.setAlpha(f);
            universalRecyclerView.setVisibility(f > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.chatsPageFadeView.invalidate();
        }
    }

    @Override
    public final void openHiddenStories() {
    }

    @Override
    public final void openStory(DialogCell dialogCell) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStories(dialogCell.getDialogId())) {
            BaseFragment baseFragment = this.parentFragment;
            baseFragment.getOrCreateStoryViewer().getClass();
            baseFragment.getOrCreateStoryViewer().open(baseFragment.getContext(), dialogCell.getDialogId(), new StoriesListPlaceProvider((RecyclerListView) dialogCell.getParent(), false));
        }
    }

    @Override
    public final void showChatPreview(DialogCell dialogCell) {
    }

    public final class ContainerView extends FrameLayout {
        public final int $r8$classId = 1;
        public final Object isActionBar;
        public final Path path;
        public final Object this$0;
        public float top;

        public ContainerView(Activity activity) {
            super(activity);
            Paint paint = new Paint();
            this.isActionBar = paint;
            this.this$0 = new float[8];
            this.path = new Path();
            setWillNotDraw(false);
            paint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            float paddingTop;
            float y;
            switch (this.$r8$classId) {
                case 0:
                    CommunitySheet communitySheet = (CommunitySheet) this.this$0;
                    View[] viewPages = communitySheet.viewPager.getViewPages();
                    this.top = 0.0f;
                    for (View view : viewPages) {
                        if (view != null) {
                            Page page = (Page) view;
                            this.top = (page.top() * Utilities.clamp(1.0f - Math.abs(page.getTranslationX() / page.getMeasuredWidth()), 1.0f, 0.0f)) + this.top;
                            if (page.getVisibility() == 0) {
                                page.updateTops();
                            }
                        }
                    }
                    float f = ((AnimatedFloat) this.isActionBar).set(this.top <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                    this.top = (Math.max(AndroidUtilities.statusBarHeight, this.top) - (AndroidUtilities.statusBarHeight * f)) - (AndroidUtilities.dp(10.0f) * Math.max(communitySheet.animatorSearchMessagesVisible.floatValue, communitySheet.animatorSearchChatsVisible.floatValue));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((BottomSheet) communitySheet).backgroundPaddingLeft, this.top, getWidth() - ((BottomSheet) communitySheet).backgroundPaddingLeft, AndroidUtilities.dp(8.0f) + getHeight());
                    float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, f);
                    canvas.drawRoundRect(rectF, fLerp, fLerp, communitySheet.backgroundPaint);
                    canvas.save();
                    Path path = this.path;
                    path.rewind();
                    path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
                    canvas.clipPath(path);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    break;
                case 1:
                default:
                    super.dispatchDraw(canvas);
                    break;
                case 2:
                    StoryPrivacyBottomSheet storyPrivacyBottomSheet = (StoryPrivacyBottomSheet) this.this$0;
                    View[] viewPages2 = storyPrivacyBottomSheet.viewPager.getViewPages();
                    float f2 = 0.0f;
                    this.top = 0.0f;
                    int i = 0;
                    while (i < viewPages2.length) {
                        View view2 = viewPages2[i];
                        if (view2 != null) {
                            StoryPrivacyBottomSheet.Page page2 = (StoryPrivacyBottomSheet.Page) view2;
                            float fClamp = Utilities.clamp(1.0f - Math.abs(page2.getTranslationX() / page2.getMeasuredWidth()), 1.0f, f2);
                            float f3 = this.top;
                            LinearLayoutManager linearLayoutManager = page2.layoutManager;
                            float fMin = (linearLayoutManager.mReverseLayout || page2.pageType == 0) ? AndroidUtilities.displaySize.y : 0.0f;
                            int i2 = 0;
                            while (true) {
                                RecyclerListView recyclerListView = page2.listView;
                                if (i2 < recyclerListView.getChildCount()) {
                                    View childAt = recyclerListView.getChildAt(i2);
                                    boolean z = linearLayoutManager.mReverseLayout;
                                    FrameLayout frameLayout = page2.contentView;
                                    if (z) {
                                        float y2 = childAt.getY() + frameLayout.getPaddingTop();
                                        float alpha = childAt.getAlpha();
                                        if (y2 < fMin) {
                                            fMin = AndroidUtilities.lerp(fMin, y2, alpha);
                                        }
                                    } else if (page2.pageType != 0) {
                                        if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 33) {
                                            paddingTop = childAt.getBottom() + frameLayout.getPaddingTop();
                                            y = childAt.getTranslationY();
                                        } else if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                            paddingTop = frameLayout.getPaddingTop();
                                            y = childAt.getY();
                                        }
                                        fMin = y + paddingTop;
                                    } else if (!(childAt instanceof StoryPrivacyBottomSheet.Page.PadView)) {
                                        fMin = Math.min(childAt.getY() + frameLayout.getPaddingTop(), fMin);
                                    }
                                    i2++;
                                }
                            }
                            this.top = (fMin * fClamp) + f3;
                            ((BottomSheet) storyPrivacyBottomSheet).keyboardVisible;
                            if (page2.getVisibility() == 0) {
                                page2.updateTops();
                            }
                        }
                        i++;
                        f2 = 0.0f;
                    }
                    float f4 = ((AnimatedFloat) this.isActionBar).set(this.top <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                    this.top = Math.max(AndroidUtilities.statusBarHeight, this.top) - (AndroidUtilities.statusBarHeight * f4);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(((BottomSheet) storyPrivacyBottomSheet).backgroundPaddingLeft, this.top, getWidth() - ((BottomSheet) storyPrivacyBottomSheet).backgroundPaddingLeft, AndroidUtilities.dp(8.0f) + getHeight());
                    float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, f4);
                    canvas.drawRoundRect(rectF2, fLerp2, fLerp2, storyPrivacyBottomSheet.backgroundPaint);
                    canvas.save();
                    Path path2 = this.path;
                    path2.rewind();
                    path2.addRoundRect(rectF2, fLerp2, fLerp2, Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    break;
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.top) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    ((CommunitySheet) this.this$0).lambda$showGiftOfferSheet$15();
                    return true;
                case 1:
                default:
                    return super.dispatchTouchEvent(motionEvent);
                case 2:
                    if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.top) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    ((StoryPrivacyBottomSheet) this.this$0).lambda$showGiftOfferSheet$15();
                    return true;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 1:
                    super.onDraw(canvas);
                    float measuredWidth = getMeasuredWidth() / 2.0f;
                    Path path = this.path;
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.top), getMeasuredHeight());
                    float fDp = AndroidUtilities.dp(8.0f);
                    float fLerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.top);
                    float[] fArr = (float[]) this.this$0;
                    fArr[7] = fDp;
                    fArr[6] = fDp;
                    fArr[1] = fDp;
                    fArr[0] = fDp;
                    fArr[5] = fLerp;
                    fArr[4] = fLerp;
                    fArr[3] = fLerp;
                    fArr[2] = fLerp;
                    Path.Direction direction = Path.Direction.CW;
                    path.addRoundRect(rectF, fArr, direction);
                    Paint paint = (Paint) this.isActionBar;
                    canvas.drawPath(path, paint);
                    path.rewind();
                    rectF.set(measuredWidth + AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.top), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    float fLerp2 = AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.top);
                    float fDp2 = AndroidUtilities.dp(8.0f);
                    fArr[7] = fLerp2;
                    fArr[6] = fLerp2;
                    fArr[1] = fLerp2;
                    fArr[0] = fLerp2;
                    fArr[5] = fDp2;
                    fArr[4] = fDp2;
                    fArr[3] = fDp2;
                    fArr[2] = fDp2;
                    path.addRoundRect(rectF, fArr, direction);
                    canvas.drawPath(path, paint);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                    break;
                case 1:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 2:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                    break;
            }
        }

        public ContainerView(StoryPrivacyBottomSheet storyPrivacyBottomSheet, Context context) {
            super(context);
            this.this$0 = storyPrivacyBottomSheet;
            this.isActionBar = new AnimatedFloat(250L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.path = new Path();
        }

        public ContainerView(CommunitySheet communitySheet, Context context) {
            super(context);
            this.this$0 = communitySheet;
            this.isActionBar = new AnimatedFloat(250L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.path = new Path();
        }
    }
}
