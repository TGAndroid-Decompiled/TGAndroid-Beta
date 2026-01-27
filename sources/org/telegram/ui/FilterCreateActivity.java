package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditEmojiTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EditTextSuggestionsFix;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.UsersSelectActivity;

public class FilterCreateActivity extends BaseFragment {
    private ListAdapter adapter;
    private CreateLinkCell createLinkCell;
    private boolean creatingNew;
    private boolean doNotCloseWhenSave;
    private ActionBarMenuItem doneItem;
    private boolean excludeExpanded;
    private MessagesController.DialogFilter filter;
    private HeaderCellColorPreview folderTagsHeader;
    private boolean hasUserChanged;
    private boolean includeExpanded;
    private ArrayList invites;
    private ArrayList items;
    private RecyclerListView listView;
    private boolean loadingInvites;
    private boolean nameChangedManually;
    private EditEmojiTextCell nameEditTextCell;
    private HeaderCellWithRight nameHeaderCell;
    private int nameRow;
    private ArrayList newAlwaysShow;
    private boolean newFilterAnimations;
    private int newFilterColor;
    private int newFilterFlags;
    private CharSequence newFilterName;
    private ArrayList newNeverShow;
    private LongSparseIntArray newPinned;
    private ArrayList oldItems;
    private int requestingInvitesReqId;
    private HintView saveHintView;
    float shiftDp;
    private Runnable showBulletinOnResume;
    private boolean showedUpdateBulletin;

    private boolean canCreateLink() {
        return !(TextUtils.isEmpty(this.newFilterName) && TextUtils.isEmpty(this.filter.name)) && (this.newFilterFlags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && this.newNeverShow.isEmpty() && !this.newAlwaysShow.isEmpty();
    }

    public static class HintInnerCell extends FrameLayout {
        private RLottieImageView imageView;

        public HintInnerCell(Context context) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.filter_new, 100, 100);
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.playAnimation();
            addView(this.imageView, LayoutHelper.createFrame(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
            this.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
        }

        public void lambda$new$0(View view) {
            if (this.imageView.isPlaying()) {
                return;
            }
            this.imageView.setProgress(0.0f);
            this.imageView.playAnimation();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(156.0f), 1073741824));
        }
    }

    public FilterCreateActivity() {
        this(null, null);
    }

    public FilterCreateActivity(MessagesController.DialogFilter dialogFilter) {
        this(dialogFilter, null);
    }

    public FilterCreateActivity(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        this.nameRow = -1;
        this.newFilterAnimations = true;
        this.invites = new ArrayList();
        this.oldItems = new ArrayList();
        this.items = new ArrayList();
        this.shiftDp = -5.0f;
        this.filter = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.filter = dialogFilter2;
            dialogFilter2.id = 2;
            while (getMessagesController().dialogFiltersById.get(this.filter.id) != null) {
                this.filter.id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.filter;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.creatingNew = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.filter.name);
        this.newFilterName = spannableStringBuilder;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.newFilterName = charSequenceReplaceEmoji;
        this.newFilterName = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, this.filter.entities, textPaint.getFontMetricsInt());
        boolean z = !this.filter.title_noanimate;
        this.newFilterAnimations = z;
        AnimatedEmojiDrawable.toggleAnimations(this.currentAccount, z);
        MessagesController.DialogFilter dialogFilter4 = this.filter;
        this.newFilterFlags = dialogFilter4.flags;
        this.newFilterColor = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.filter.alwaysShow);
        this.newAlwaysShow = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.newNeverShow = new ArrayList(this.filter.neverShow);
        this.newPinned = this.filter.pinnedDialogs.clone();
    }

    @Override
    public boolean onFragmentCreate() {
        updateRows();
        return super.onFragmentCreate();
    }

    public void loadInvites() {
        MessagesController.DialogFilter dialogFilter;
        if (this.loadingInvites || (dialogFilter = this.filter) == null || !dialogFilter.isChatlist()) {
            return;
        }
        this.loadingInvites = true;
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.filter.id;
        this.requestingInvitesReqId = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadInvites$1(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadInvites$1(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadInvites$0(tLObject);
            }
        });
    }

    public void lambda$loadInvites$0(TLObject tLObject) {
        this.loadingInvites = false;
        if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
            TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
            getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
            getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
            this.invites.clear();
            this.invites.addAll(tL_chatlists_exportedInvites.invites);
            updateRows();
        }
        this.requestingInvitesReqId = 0;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.requestingInvitesReqId != 0) {
            getConnectionsManager().cancelRequest(this.requestingInvitesReqId, true);
        }
    }

    private void updateRows() {
        updateRows(true);
    }

    private void updateRows(boolean z) {
        String string;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        this.items.add(ItemInner.asAnimatedHeader(LocaleController.getString(R.string.FilterNameHeader), hasAnimatedEmojis(this.newFilterName) ? LocaleController.getString(this.newFilterAnimations ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable) : null, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$updateRows$2(view);
            }
        }));
        this.nameRow = this.items.size();
        this.items.add(ItemInner.asEdit());
        this.items.add(ItemInner.asShadow(null));
        this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.FilterInclude)));
        this.items.add(ItemInner.asButton(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false).whenClicked(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$updateRows$3(view);
            }
        }));
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            this.items.add(ItemInner.asChat(true, LocaleController.getString(R.string.FilterContacts), "contacts", MessagesController.DIALOG_FILTER_FLAG_CONTACTS));
        }
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            this.items.add(ItemInner.asChat(true, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS));
        }
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            this.items.add(ItemInner.asChat(true, LocaleController.getString(R.string.FilterGroups), "groups", MessagesController.DIALOG_FILTER_FLAG_GROUPS));
        }
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            this.items.add(ItemInner.asChat(true, LocaleController.getString(R.string.FilterChannels), "channels", MessagesController.DIALOG_FILTER_FLAG_CHANNELS));
        }
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            this.items.add(ItemInner.asChat(true, LocaleController.getString(R.string.FilterBots), "bots", MessagesController.DIALOG_FILTER_FLAG_BOTS));
        }
        if (!this.newAlwaysShow.isEmpty()) {
            int size = (this.includeExpanded || this.newAlwaysShow.size() < 8) ? this.newAlwaysShow.size() : Math.min(5, this.newAlwaysShow.size());
            for (int i = 0; i < size; i++) {
                this.items.add(ItemInner.asChat(true, ((Long) this.newAlwaysShow.get(i)).longValue()));
            }
            if (size != this.newAlwaysShow.size()) {
                this.items.add(ItemInner.asButton(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.newAlwaysShow.size() - 5, new Object[0]), false).whenClicked(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$updateRows$4(view);
                    }
                }));
            }
        }
        this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.FilterIncludeInfo)));
        if (!this.filter.isChatlist()) {
            this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.FilterExclude)));
            this.items.add(ItemInner.asButton(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false).whenClicked(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$updateRows$5(view);
                }
            }));
            if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                this.items.add(ItemInner.asChat(false, LocaleController.getString(R.string.FilterMuted), "muted", MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED));
            }
            if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                this.items.add(ItemInner.asChat(false, LocaleController.getString(R.string.FilterRead), "read", MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ));
            }
            if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                this.items.add(ItemInner.asChat(false, LocaleController.getString(R.string.FilterArchived), "archived", MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED));
            }
            if (!this.newNeverShow.isEmpty()) {
                int size2 = (this.excludeExpanded || this.newNeverShow.size() < 8) ? this.newNeverShow.size() : Math.min(5, this.newNeverShow.size());
                for (int i2 = 0; i2 < size2; i2++) {
                    this.items.add(ItemInner.asChat(false, ((Long) this.newNeverShow.get(i2)).longValue()));
                }
                if (size2 != this.newNeverShow.size()) {
                    this.items.add(ItemInner.asButton(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.newNeverShow.size() - 5, new Object[0]), false).whenClicked(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$updateRows$6(view);
                        }
                    }));
                }
            }
            this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            this.items.add(new ItemInner(9, false));
            this.items.add(new ItemInner(10, false));
            this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        if (this.invites.isEmpty()) {
            this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.FilterShareFolder), true));
            this.items.add(ItemInner.asButton(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            this.items.add(ItemInner.asShadow(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.FilterInviteLinks), true));
            this.items.add(ItemInner.asCreateLink());
            for (int i3 = 0; i3 < this.invites.size(); i3++) {
                this.items.add(ItemInner.asLink((TL_chatlists.TL_exportedChatlistInvite) this.invites.get(i3)));
            }
            ArrayList arrayList = this.items;
            MessagesController.DialogFilter dialogFilter = this.filter;
            if (dialogFilter != null && dialogFilter.isChatlist()) {
                string = LocaleController.getString(R.string.FilterInviteLinksHintNew);
            } else {
                string = LocaleController.getString(R.string.FilterInviteLinksHint);
            }
            arrayList.add(ItemInner.asShadow(string));
        }
        if (!this.creatingNew) {
            this.items.add(ItemInner.asButton(0, LocaleController.getString(R.string.FilterDelete), true).whenClicked(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.deleteFolder(view);
                }
            }));
            this.items.add(ItemInner.asShadow(null));
        }
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            if (z) {
                listAdapter.setItems(this.oldItems, this.items);
            } else {
                listAdapter.notifyDataSetChanged();
            }
        }
    }

    public void lambda$updateRows$2(View view) {
        String string;
        this.newFilterAnimations = !this.newFilterAnimations;
        HeaderCellWithRight headerCellWithRight = this.nameHeaderCell;
        if (headerCellWithRight != null) {
            AnimatedTextView animatedTextView = headerCellWithRight.rightTextView;
            if (hasAnimatedEmojis(this.newFilterName)) {
                string = LocaleController.getString(this.newFilterAnimations ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
            } else {
                string = null;
            }
            animatedTextView.setText(string);
        }
        AnimatedEmojiDrawable.toggleAnimations(this.currentAccount, this.newFilterAnimations);
        checkDoneButton(true);
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            if (actionBar.getTitleTextView() != null) {
                this.actionBar.getTitleTextView().setEmojiCacheType(this.newFilterAnimations ? 0 : 26);
            }
            if (this.actionBar.getTitleTextView2() != null) {
                this.actionBar.getTitleTextView2().setEmojiCacheType(this.newFilterAnimations ? 0 : 26);
            }
        }
    }

    public void lambda$updateRows$3(View view) {
        selectChatsFor(true);
    }

    public void lambda$updateRows$4(View view) {
        this.includeExpanded = true;
        updateRows();
    }

    public void lambda$updateRows$5(View view) {
        selectChatsFor(false);
    }

    public void lambda$updateRows$6(View view) {
        this.excludeExpanded = true;
        updateRows();
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        if (this.creatingNew) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.filter.name, titleFontMetricsInt, false), this.filter.entities, titleFontMetricsInt));
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                if (actionBar.getTitleTextView() != null) {
                    this.actionBar.getTitleTextView().setEmojiCacheType(this.newFilterAnimations ? 0 : 26);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    this.actionBar.getTitleTextView2().setEmojiCacheType(this.newFilterAnimations ? 0 : 26);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (FilterCreateActivity.this.checkDiscard(true)) {
                        FilterCreateActivity.this.finishFragment();
                    }
                } else if (i == 1) {
                    FilterCreateActivity.this.processDone();
                }
            }
        });
        this.doneItem = actionBarMenuCreateMenu.addItem(1, LocaleController.getString(R.string.Save).toUpperCase());
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            public void addView(View view) {
                if (view instanceof EmojiView) {
                    ViewGroup.LayoutParams layoutParams = ((EmojiView) view).getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    if (layoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) layoutParams).gravity = 87;
                    }
                    view.setLayoutParams(layoutParams);
                }
                super.addView(view);
            }

            @Override
            protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.FilterCreateActivity.AnonymousClass2.onLayout(boolean, int, int, int, int):void");
            }
        };
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean requestFocus(int i, Rect rect) {
                return false;
            }

            @Override
            public Integer getSelectorColor(int i) {
                ItemInner itemInner = (i < 0 || i >= FilterCreateActivity.this.items.size()) ? null : (ItemInner) FilterCreateActivity.this.items.get(i);
                if (itemInner != null && itemInner.isRed) {
                    return Integer.valueOf(Theme.multAlpha(getThemedColor(Theme.key_text_RedRegular), 0.12f));
                }
                return Integer.valueOf(getThemedColor(Theme.key_listSelector));
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        sizeNotifierFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                this.f$0.lambda$createView$8(view, i);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                return this.f$0.lambda$createView$9(view, i);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (!FilterCreateActivity.this.listView.scrollingByUser || FilterCreateActivity.this.nameEditTextCell == null || FilterCreateActivity.this.nameEditTextCell.editTextEmoji == null) {
                    return;
                }
                if (FilterCreateActivity.this.nameEditTextCell.editTextEmoji.isPopupShowing()) {
                    FilterCreateActivity.this.nameEditTextCell.editTextEmoji.hidePopup(true);
                } else {
                    FilterCreateActivity.this.nameEditTextCell.editTextEmoji.closeKeyboard();
                }
            }
        });
        checkDoneButton(false);
        loadInvites();
        return this.fragmentView;
    }

    public void lambda$createView$8(View view, int i) {
        final ItemInner itemInner;
        if (getParentActivity() == null || (itemInner = (ItemInner) this.items.get(i)) == null) {
            return;
        }
        if (itemInner.onClickListener == null) {
            int i2 = itemInner.viewType;
            if (i2 == 1) {
                UserCell userCell = (UserCell) view;
                showRemoveAlert(itemInner, userCell.getName(), userCell.getCurrentObject(), itemInner.include);
                return;
            }
            if (i2 == 7) {
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$7(itemInner);
                    }
                };
                if (this.doneItem.isEnabled()) {
                    save(false, runnable);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            }
            if (i2 == 8 || (i2 == 4 && itemInner.iconResId == R.drawable.msg2_link2)) {
                onClickCreateLink(view);
                return;
            }
            return;
        }
        itemInner.onClickListener.onClick(view);
    }

    public void lambda$createView$7(ItemInner itemInner) {
        FilterChatlistActivity filterChatlistActivity = new FilterChatlistActivity(this.filter, itemInner.link);
        filterChatlistActivity.setOnEdit(new FilterCreateActivity$$ExternalSyntheticLambda23(this));
        filterChatlistActivity.setOnDelete(new FilterCreateActivity$$ExternalSyntheticLambda24(this));
        presentFragment(filterChatlistActivity);
    }

    public boolean lambda$createView$9(View view, int i) {
        ItemInner itemInner = (ItemInner) this.items.get(i);
        if (itemInner == null || !(view instanceof UserCell)) {
            return false;
        }
        UserCell userCell = (UserCell) view;
        showRemoveAlert(itemInner, userCell.getName(), userCell.getCurrentObject(), itemInner.include);
        return true;
    }

    public boolean hasAnimatedEmojis(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(0, spanned.length(), AnimatedEmojiSpan.class);
        return animatedEmojiSpanArr != null && animatedEmojiSpanArr.length > 0;
    }

    private void onClickCreateLink(View view) {
        if (this.creatingNew && this.doneItem.getAlpha() > 0.0f) {
            float f = -this.shiftDp;
            this.shiftDp = f;
            AndroidUtilities.shakeViewSpring(view, f);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            this.doNotCloseWhenSave = true;
            showSaveHint();
            return;
        }
        if (!canCreateLink()) {
            float f2 = -this.shiftDp;
            this.shiftDp = f2;
            AndroidUtilities.shakeViewSpring(view, f2);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (TextUtils.isEmpty(this.newFilterName) && TextUtils.isEmpty(this.filter.name)) {
                BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.FilterInviteErrorEmptyName)).show();
                return;
            }
            if ((this.newFilterFlags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                if (!this.newNeverShow.isEmpty()) {
                    BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.FilterInviteErrorTypesExcluded)).show();
                    return;
                } else {
                    BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.FilterInviteErrorTypes)).show();
                    return;
                }
            }
            if (this.newAlwaysShow.isEmpty()) {
                BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.FilterInviteErrorEmpty)).show();
                return;
            } else {
                BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.FilterInviteErrorExcluded)).show();
                return;
            }
        }
        save(false, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onClickCreateLink$13();
            }
        });
    }

    public void lambda$onClickCreateLink$13() {
        getMessagesController().updateFilterDialogs(this.filter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.filter.alwaysShow.size(); i++) {
            long jLongValue = this.filter.alwaysShow.get(i).longValue();
            if (jLongValue < 0 && canAddToFolder(getMessagesController().getChat(Long.valueOf(-jLongValue)))) {
                arrayList.add(getMessagesController().getInputPeer(jLongValue));
            }
        }
        if (arrayList.size() > (getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault)) {
            showDialog(new LimitReachedBottomSheet(this, getContext(), 4, this.currentAccount, null));
            return;
        }
        if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.filter.id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$onClickCreateLink$12(tLObject, tL_error);
                }
            });
            return;
        }
        FilterChatlistActivity filterChatlistActivity = new FilterChatlistActivity(this.filter, null);
        filterChatlistActivity.setOnEdit(new FilterCreateActivity$$ExternalSyntheticLambda23(this));
        filterChatlistActivity.setOnDelete(new FilterCreateActivity$$ExternalSyntheticLambda24(this));
        presentFragment(filterChatlistActivity);
    }

    public void lambda$onClickCreateLink$12(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onClickCreateLink$11(tL_error, tLObject);
            }
        });
    }

    public void lambda$onClickCreateLink$11(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (processErrors(tL_error, this, BulletinFactory.of(this)) && (tLObject instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite)) {
            hideNew(0);
            getMessagesController().loadRemoteFilters(true);
            final TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite = (TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject;
            FilterChatlistActivity filterChatlistActivity = new FilterChatlistActivity(this.filter, tL_chatlists_exportedChatlistInvite.invite);
            filterChatlistActivity.setOnEdit(new FilterCreateActivity$$ExternalSyntheticLambda23(this));
            filterChatlistActivity.setOnDelete(new FilterCreateActivity$$ExternalSyntheticLambda24(this));
            presentFragment(filterChatlistActivity);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onClickCreateLink$10(tL_chatlists_exportedChatlistInvite);
                }
            }, 200L);
        }
    }

    public void lambda$onClickCreateLink$10(TL_chatlists.TL_chatlists_exportedChatlistInvite tL_chatlists_exportedChatlistInvite) {
        onEdit(tL_chatlists_exportedChatlistInvite.invite);
    }

    private void showSaveHint() {
        HintView hintView = this.saveHintView;
        if (hintView == null || hintView.getVisibility() != 0) {
            HintView hintView2 = new HintView(getContext(), 6, true) {
                @Override
                public void setVisibility(int i) {
                    super.setVisibility(i);
                    if (i != 0) {
                        try {
                            ((ViewGroup) getParent()).removeView(this);
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            this.saveHintView = hintView2;
            hintView2.textView.setMaxWidth(AndroidUtilities.displaySize.x);
            this.saveHintView.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
            this.saveHintView.setText(LocaleController.getString(R.string.FilterFinishCreating));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
            getParentLayout().getOverlayContainerView().addView(this.saveHintView, marginLayoutParams);
            this.saveHintView.showForView(this.doneItem, true);
        }
    }

    public static boolean canAddToFolder(TLRPC.Chat chat) {
        return ChatObject.canUserDoAdminAction(chat, 3) || (ChatObject.isPublic(chat) && !chat.join_request);
    }

    public void onDelete(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.invites.size()) {
                i = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) this.invites.get(i)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            this.invites.remove(i);
            if (this.invites.isEmpty()) {
                this.filter.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
            }
            updateRows();
        }
    }

    public void onEdit(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.invites.size()) {
                i = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) this.invites.get(i)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            this.invites.add(tL_exportedChatlistInvite);
        } else {
            this.invites.set(i, tL_exportedChatlistInvite);
        }
        updateRows();
    }

    public void deleteFolder(View view) {
        MessagesController.DialogFilter dialogFilter = this.filter;
        if (dialogFilter != null && dialogFilter.isChatlist()) {
            FolderBottomSheet.showForDeletion(this, this.filter.id, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$deleteFolder$14((Boolean) obj);
                }
            });
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.FilterDelete));
        builder.setMessage(LocaleController.getString(R.string.FilterDeleteAlert));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$deleteFolder$17(alertDialog, i);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public void lambda$deleteFolder$14(Boolean bool) {
        finishFragment();
    }

    public void lambda$deleteFolder$17(AlertDialog alertDialog, int i) {
        final AlertDialog alertDialog2;
        if (getParentActivity() != null) {
            alertDialog2 = new AlertDialog(getParentActivity(), 3);
            alertDialog2.setCanCancel(false);
            alertDialog2.show();
        } else {
            alertDialog2 = null;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = this.filter.id;
        getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteFolder$16(alertDialog2, tLObject, tL_error);
            }
        });
    }

    public void lambda$deleteFolder$16(final AlertDialog alertDialog, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteFolder$15(alertDialog);
            }
        });
    }

    public void lambda$deleteFolder$15(AlertDialog alertDialog) {
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        getMessagesController().removeFilter(this.filter);
        getMessagesStorage().deleteDialogFilter(this.filter);
        finishFragment();
    }

    private void onUpdate(boolean z, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int size2;
        if (arrayList == null || arrayList2 == null) {
            if (arrayList != null) {
                size = arrayList.size();
            } else if (arrayList2 != null) {
                size2 = arrayList2.size();
                size = 0;
            } else {
                size = 0;
            }
            size2 = 0;
        } else {
            size = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!arrayList2.contains(arrayList.get(i))) {
                    size++;
                }
            }
            size2 = 0;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (!arrayList.contains(arrayList2.get(i2))) {
                    size2++;
                }
            }
        }
        if (!z) {
            if (size2 > 0) {
                onUpdate(false, size2);
            }
        } else if (size2 > 0 && size2 > size) {
            onUpdate(true, size2);
        } else if (size > 0) {
            onUpdate(false, size);
        }
    }

    private void selectChatsFor(final boolean z) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(z, z ? this.newAlwaysShow : this.newNeverShow, this.newFilterFlags);
        usersSelectActivity.noChatTypes = this.filter.isChatlist();
        usersSelectActivity.setDelegate(new UsersSelectActivity.FilterUsersActivityDelegate() {
            @Override
            public final void didSelectChats(ArrayList arrayList, int i) {
                this.f$0.lambda$selectChatsFor$18(z, arrayList, i);
            }
        });
        presentFragment(usersSelectActivity);
    }

    public void lambda$selectChatsFor$18(boolean z, ArrayList arrayList, int i) {
        this.newFilterFlags = i;
        if (z) {
            onUpdate(true, this.newAlwaysShow, arrayList);
            this.newAlwaysShow = arrayList;
            for (int i2 = 0; i2 < this.newAlwaysShow.size(); i2++) {
                this.newNeverShow.remove(this.newAlwaysShow.get(i2));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = this.newPinned.size();
            for (int i3 = 0; i3 < size; i3++) {
                long jKeyAt = this.newPinned.keyAt(i3);
                Long lValueOf = Long.valueOf(jKeyAt);
                if (!DialogObject.isEncryptedDialog(jKeyAt) && !this.newAlwaysShow.contains(lValueOf)) {
                    arrayList2.add(lValueOf);
                }
            }
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                this.newPinned.delete(((Long) arrayList2.get(i4)).longValue());
            }
        } else {
            onUpdate(false, this.newNeverShow, arrayList);
            this.newNeverShow = arrayList;
            for (int i5 = 0; i5 < this.newNeverShow.size(); i5++) {
                Long l = (Long) this.newNeverShow.get(i5);
                this.newAlwaysShow.remove(l);
                this.newPinned.delete(l.longValue());
            }
        }
        fillFilterName();
        checkDoneButton(false);
        updateRows();
    }

    @Override
    public void onResume() {
        super.onResume();
        updateRows();
        Runnable runnable = this.showBulletinOnResume;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        EditTextEmoji editTextEmoji;
        EditEmojiTextCell editEmojiTextCell = this.nameEditTextCell;
        if (editEmojiTextCell == null || (editTextEmoji = editEmojiTextCell.editTextEmoji) == null || !editTextEmoji.isPopupShowing()) {
            return checkDiscard(z);
        }
        if (!z) {
            return false;
        }
        this.nameEditTextCell.editTextEmoji.hidePopup(true);
        return false;
    }

    private void fillFilterName() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.FilterCreateActivity.fillFilterName():void");
    }

    public boolean checkDiscard(boolean z) {
        if (this.doneItem.getAlpha() != 1.0f) {
            return true;
        }
        if (!z) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        if (this.creatingNew) {
            builder.setTitle(LocaleController.getString(R.string.FilterDiscardNewTitle));
            builder.setMessage(LocaleController.getString(R.string.FilterDiscardNewAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.FilterDiscardNewSave), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$checkDiscard$19(alertDialog, i);
                }
            });
        } else {
            builder.setTitle(LocaleController.getString(R.string.FilterDiscardTitle));
            builder.setMessage(LocaleController.getString(R.string.FilterDiscardAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$checkDiscard$20(alertDialog, i);
                }
            });
        }
        builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$checkDiscard$21(alertDialog, i);
            }
        });
        showDialog(builder.create());
        return false;
    }

    public void lambda$checkDiscard$19(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$checkDiscard$20(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$checkDiscard$21(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    private void showRemoveAlert(final ItemInner itemInner, CharSequence charSequence, Object obj, final boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        if (z) {
            builder.setTitle(LocaleController.getString(R.string.FilterRemoveInclusionTitle));
            if (obj instanceof String) {
                builder.setMessage(LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence));
            } else if (obj instanceof TLRPC.User) {
                builder.setMessage(LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence));
            } else {
                builder.setMessage(LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence));
            }
        } else {
            builder.setTitle(LocaleController.getString(R.string.FilterRemoveExclusionTitle));
            if (obj instanceof String) {
                builder.setMessage(LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence));
            } else if (obj instanceof TLRPC.User) {
                builder.setMessage(LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence));
            } else {
                builder.setMessage(LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence));
            }
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.StickersRemove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$showRemoveAlert$22(itemInner, z, alertDialog, i);
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public void lambda$showRemoveAlert$22(ItemInner itemInner, boolean z, AlertDialog alertDialog, int i) {
        if (itemInner.flags > 0) {
            this.newFilterFlags = (~itemInner.flags) & this.newFilterFlags;
        } else {
            (z ? this.newAlwaysShow : this.newNeverShow).remove(Long.valueOf(itemInner.did));
        }
        fillFilterName();
        updateRows();
        checkDoneButton(true);
        if (z) {
            onUpdate(false, 1);
        }
    }

    public void processDone() {
        HintView hintView = this.saveHintView;
        if (hintView != null) {
            hintView.hide(true);
            this.saveHintView = null;
        }
        save(true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processDone$23();
            }
        });
    }

    public void lambda$processDone$23() {
        if (this.doNotCloseWhenSave) {
            this.doNotCloseWhenSave = false;
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitleAnimated(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.filter.name, titleFontMetricsInt, false), this.filter.entities, titleFontMetricsInt), true, 220L);
            return;
        }
        finishFragment();
    }

    private void save(boolean z, final Runnable runnable) {
        CharSequence[] charSequenceArr = {this.newFilterName};
        saveFilterToServer(this.filter, this.newFilterFlags, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), !this.newFilterAnimations, this.newFilterColor, this.newAlwaysShow, this.newNeverShow, this.newPinned, this.creatingNew, false, this.hasUserChanged, true, z, this, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$save$24(runnable);
            }
        });
    }

    public void lambda$save$24(Runnable runnable) {
        this.hasUserChanged = false;
        this.creatingNew = false;
        this.filter.flags = this.newFilterFlags;
        checkDoneButton(true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
    }

    private static void processAddFilter(MessagesController.DialogFilter dialogFilter, int i, String str, ArrayList arrayList, boolean z, int i2, ArrayList arrayList2, ArrayList arrayList3, boolean z2, boolean z3, boolean z4, boolean z5, BaseFragment baseFragment, Runnable runnable) {
        if (dialogFilter.flags != i || z4) {
            dialogFilter.pendingUnreadCount = -1;
            if (z5) {
                dialogFilter.unreadCount = -1;
            }
        }
        dialogFilter.flags = i;
        dialogFilter.name = str;
        dialogFilter.entities = arrayList;
        dialogFilter.color = i2;
        dialogFilter.neverShow = arrayList3;
        dialogFilter.alwaysShow = arrayList2;
        dialogFilter.title_noanimate = z;
        if (z2) {
            baseFragment.getMessagesController().addFilter(dialogFilter, z3);
        } else {
            baseFragment.getMessagesController().onFilterUpdate(dialogFilter);
        }
        baseFragment.getMessagesStorage().saveDialogFilter(dialogFilter, z3, true);
        if (z3) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = baseFragment.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int i3 = 0; i3 < size; i3++) {
                tL_messages_updateDialogFiltersOrder.order.add(Integer.valueOf(dialogFilters.get(i3).id));
            }
            baseFragment.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void saveFilterToServer(final MessagesController.DialogFilter dialogFilter, final int i, final String str, final ArrayList arrayList, final boolean z, final int i2, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final BaseFragment baseFragment, final Runnable runnable) {
        AlertDialog alertDialog;
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        final LongSparseIntArray longSparseIntArray2 = longSparseIntArray;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        int i3 = 3;
        int i4 = 0;
        if (z6) {
            alertDialog = new AlertDialog(baseFragment.getParentActivity(), 3);
            alertDialog.setCanCancel(false);
            alertDialog.show();
        } else {
            alertDialog = null;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = dialogFilter.id;
        int i5 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        tL_dialogFilter.contacts = (i & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0;
        tL_dialogFilter.non_contacts = (i & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0;
        tL_dialogFilter.groups = (i & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0;
        tL_dialogFilter.broadcasts = (i & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0;
        tL_dialogFilter.bots = (i & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0;
        tL_dialogFilter.exclude_muted = (i & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0;
        tL_dialogFilter.exclude_read = (i & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0;
        tL_dialogFilter.exclude_archived = (i & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0;
        tL_dialogFilter.id = dialogFilter.id;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z;
        if (i2 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= 134217728;
            tL_dialogFilter2.color = i2;
        }
        MessagesController messagesController = baseFragment.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i6 = 0; i6 < size; i6++) {
                long jKeyAt = longSparseIntArray2.keyAt(i6);
                if (!DialogObject.isEncryptedDialog(jKeyAt)) {
                    arrayList6.add(Long.valueOf(jKeyAt));
                }
            }
            Collections.sort(arrayList6, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return FilterCreateActivity.lambda$saveFilterToServer$25(longSparseIntArray2, (Long) obj, (Long) obj2);
                }
            });
        }
        int i7 = 0;
        while (i7 < i3) {
            if (i7 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i7 == i5) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            while (i4 < size2) {
                Long l = (Long) arrayList5.get(i4);
                ArrayList arrayList7 = arrayList5;
                long jLongValue = l.longValue();
                if ((i7 != 0 || longSparseIntArray2.indexOfKey(jLongValue) < 0) && !DialogObject.isEncryptedDialog(jLongValue)) {
                    if (jLongValue > 0) {
                        TLRPC.User user = messagesController.getUser(l);
                        if (user != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = jLongValue;
                            tL_inputPeerUser.access_hash = user.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j = -jLongValue;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
                        if (chat != null) {
                            if (ChatObject.isChannel(chat)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j;
                                tL_inputPeerChannel.access_hash = chat.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i4++;
                longSparseIntArray2 = longSparseIntArray;
                arrayList5 = arrayList7;
            }
            i7++;
            longSparseIntArray2 = longSparseIntArray;
            i3 = 3;
            i4 = 0;
            i5 = 1;
        }
        final AlertDialog alertDialog2 = alertDialog;
        baseFragment.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                FilterCreateActivity.lambda$saveFilterToServer$27(z6, alertDialog2, dialogFilter, i, str, arrayList, z, i2, arrayList2, arrayList3, z2, z3, z4, z5, baseFragment, runnable, tLObject, tL_error);
            }
        });
        if (z6) {
            return;
        }
        processAddFilter(dialogFilter, i, str, arrayList, z, i2, arrayList2, arrayList3, z2, z3, z4, z5, baseFragment, null);
    }

    public static int lambda$saveFilterToServer$25(LongSparseIntArray longSparseIntArray, Long l, Long l2) {
        int i = longSparseIntArray.get(l.longValue());
        int i2 = longSparseIntArray.get(l2.longValue());
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    public static void lambda$saveFilterToServer$27(final boolean z, final AlertDialog alertDialog, final MessagesController.DialogFilter dialogFilter, final int i, final String str, final ArrayList arrayList, final boolean z2, final int i2, final ArrayList arrayList2, final ArrayList arrayList3, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final BaseFragment baseFragment, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FilterCreateActivity.lambda$saveFilterToServer$26(z, alertDialog, dialogFilter, i, str, arrayList, z2, i2, arrayList2, arrayList3, z3, z4, z5, z6, baseFragment, runnable);
            }
        });
    }

    public static void lambda$saveFilterToServer$26(boolean z, AlertDialog alertDialog, MessagesController.DialogFilter dialogFilter, int i, String str, ArrayList arrayList, boolean z2, int i2, ArrayList arrayList2, ArrayList arrayList3, boolean z3, boolean z4, boolean z5, boolean z6, BaseFragment baseFragment, Runnable runnable) {
        if (!z) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (alertDialog != null) {
                try {
                    alertDialog.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            processAddFilter(dialogFilter, i, str, arrayList, z2, i2, arrayList2, arrayList3, z3, z4, z5, z6, baseFragment, runnable);
        }
    }

    @Override
    public boolean canBeginSlide() {
        return checkDiscard(true);
    }

    private boolean hasChanges() {
        this.hasUserChanged = false;
        if (this.filter.alwaysShow.size() != this.newAlwaysShow.size()) {
            this.hasUserChanged = true;
        }
        if (this.filter.neverShow.size() != this.newNeverShow.size()) {
            this.hasUserChanged = true;
        }
        MessagesController.DialogFilter dialogFilter = this.filter;
        if (dialogFilter.color != this.newFilterColor) {
            this.hasUserChanged = true;
        }
        if (!this.hasUserChanged) {
            Collections.sort(dialogFilter.alwaysShow);
            Collections.sort(this.newAlwaysShow);
            if (!this.filter.alwaysShow.equals(this.newAlwaysShow)) {
                this.hasUserChanged = true;
            }
            Collections.sort(this.filter.neverShow);
            Collections.sort(this.newNeverShow);
            if (!this.filter.neverShow.equals(this.newNeverShow)) {
                this.hasUserChanged = true;
            }
        }
        MessagesController.DialogFilter dialogFilter2 = this.filter;
        if (dialogFilter2.title_noanimate == (!this.newFilterAnimations) && TextUtils.equals(dialogFilter2.name, this.newFilterName) && this.filter.flags == this.newFilterFlags) {
            return this.hasUserChanged;
        }
        return true;
    }

    public void checkDoneButton(boolean z) {
        boolean zHasChanges = !TextUtils.isEmpty(this.newFilterName) && this.newFilterName.length() <= 12;
        if (zHasChanges) {
            boolean z2 = ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.newAlwaysShow.isEmpty()) ? false : true;
            zHasChanges = (!z2 || this.creatingNew) ? z2 : hasChanges();
        }
        if (this.doneItem.isEnabled() == zHasChanges) {
            return;
        }
        this.doneItem.setEnabled(zHasChanges);
        if (z) {
            this.doneItem.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneItem.setAlpha(zHasChanges ? 1.0f : 0.0f);
        this.doneItem.setScaleX(zHasChanges ? 1.0f : 0.0f);
        this.doneItem.setScaleY(zHasChanges ? 1.0f : 0.0f);
    }

    static class ItemInner extends AdapterWithDiffUtils.Item {
        private String chatType;
        private long did;
        private int flags;
        private int iconResId;
        private boolean include;
        private boolean isRed;
        private TL_chatlists.TL_exportedChatlistInvite link;
        private boolean newSpan;
        private View.OnClickListener onClickListener;
        private CharSequence subtext;
        private CharSequence text;

        public ItemInner(int i, boolean z) {
            super(i, z);
        }

        public static ItemInner asHeader(CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(0, false);
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asHeader(CharSequence charSequence, boolean z) {
            ItemInner itemInner = new ItemInner(0, false);
            itemInner.text = charSequence;
            itemInner.newSpan = z;
            return itemInner;
        }

        public static ItemInner asAnimatedHeader(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
            ItemInner itemInner = new ItemInner(11, false);
            itemInner.text = charSequence;
            itemInner.subtext = charSequence2;
            itemInner.onClickListener = onClickListener;
            return itemInner;
        }

        public static ItemInner asChat(boolean z, long j) {
            ItemInner itemInner = new ItemInner(1, false);
            itemInner.include = z;
            itemInner.did = j;
            return itemInner;
        }

        public static ItemInner asChat(boolean z, CharSequence charSequence, String str, int i) {
            ItemInner itemInner = new ItemInner(1, false);
            itemInner.include = z;
            itemInner.text = charSequence;
            itemInner.chatType = str;
            itemInner.flags = i;
            return itemInner;
        }

        public static ItemInner asEdit() {
            return new ItemInner(2, false);
        }

        public static ItemInner asShadow(CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(TextUtils.isEmpty(charSequence) ? 3 : 6, false);
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asLink(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
            ItemInner itemInner = new ItemInner(7, false);
            itemInner.link = tL_exportedChatlistInvite;
            return itemInner;
        }

        public static ItemInner asButton(int i, CharSequence charSequence, boolean z) {
            ItemInner itemInner = new ItemInner(4, false);
            itemInner.iconResId = i;
            itemInner.text = charSequence;
            itemInner.isRed = z;
            return itemInner;
        }

        public static ItemInner asCreateLink() {
            return new ItemInner(8, false);
        }

        public ItemInner whenClicked(View.OnClickListener onClickListener) {
            this.onClickListener = onClickListener;
            return this;
        }

        public boolean isShadow() {
            int i = this.viewType;
            return i == 3 || i == 6;
        }

        public boolean equals(Object obj) {
            TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
            TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ItemInner itemInner = (ItemInner) obj;
            int i = this.viewType;
            if (i != itemInner.viewType) {
                return false;
            }
            if (i == 11) {
                return TextUtils.equals(this.text, itemInner.text) && TextUtils.equals(this.subtext, itemInner.subtext);
            }
            if ((i == 0 || i == 1 || i == 3 || i == 4) && !TextUtils.equals(this.text, itemInner.text)) {
                return false;
            }
            int i2 = this.viewType;
            if (i2 == 0) {
                return this.newSpan == itemInner.newSpan;
            }
            if (i2 == 1) {
                return this.did == itemInner.did && TextUtils.equals(this.chatType, itemInner.chatType) && this.flags == itemInner.flags;
            }
            if (i2 != 7 || (tL_exportedChatlistInvite = this.link) == (tL_exportedChatlistInvite2 = itemInner.link)) {
                return true;
            }
            if (TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.link;
                boolean z = tL_exportedChatlistInvite3.revoked;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = itemInner.link;
                if (z == tL_exportedChatlistInvite4.revoked && TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) && this.link.peers.size() == itemInner.link.peers.size()) {
                    return true;
                }
            }
            return false;
        }
    }

    class ListAdapter extends AdapterWithDiffUtils {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 3 || itemViewType == 0 || itemViewType == 2 || itemViewType == 5 || itemViewType == 9 || itemViewType == 11) ? false : true;
        }

        @Override
        public int getItemCount() {
            return FilterCreateActivity.this.items.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            UserCell userCell;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(this.mContext, 22);
                    break;
                case 1:
                    UserCell userCell2 = new UserCell(this.mContext, 6, 0, false);
                    userCell2.setSelfAsSavedMessages(true);
                    userCell = userCell2;
                    headerCell = userCell;
                    break;
                case 2:
                    boolean z = false;
                    EditEmojiTextCell editEmojiTextCell = FilterCreateActivity.this.nameEditTextCell = new EditEmojiTextCell(this.mContext, (SizeNotifierFrameLayout) FilterCreateActivity.this.fragmentView, LocaleController.getString(R.string.FilterNameHint), z, 12, 4, ((BaseFragment) FilterCreateActivity.this).resourceProvider) {
                        @Override
                        public int emojiCacheType() {
                            return 25;
                        }
                    };
                    editEmojiTextCell.setAllowEntities(false);
                    editEmojiTextCell.editTextEmoji.getEditText().setEmojiColor(Integer.valueOf(FilterCreateActivity.this.getThemedColor(Theme.key_featuredStickers_addButton)));
                    editEmojiTextCell.editTextEmoji.setEmojiViewCacheType(25);
                    editEmojiTextCell.editTextEmoji.setText(FilterCreateActivity.this.newFilterName);
                    AnimatedEmojiDrawable.toggleAnimations(((BaseFragment) FilterCreateActivity.this).currentAccount, FilterCreateActivity.this.newFilterAnimations);
                    EditTextCaption editText = editEmojiTextCell.editTextEmoji.getEditText();
                    editText.addTextChangedListener(new EditTextSuggestionsFix());
                    editText.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        }

                        @Override
                        public void afterTextChanged(Editable editable) {
                            String string;
                            if (!TextUtils.equals(editable, FilterCreateActivity.this.newFilterName)) {
                                FilterCreateActivity.this.nameChangedManually = !TextUtils.isEmpty(editable);
                                FilterCreateActivity.this.newFilterName = AnimatedEmojiSpan.onlyEmojiSpans(editable);
                                if (FilterCreateActivity.this.folderTagsHeader != null) {
                                    FilterCreateActivity.this.folderTagsHeader.setPreviewText(AnimatedEmojiSpan.cloneSpans(FilterCreateActivity.this.newFilterName, -1, FilterCreateActivity.this.folderTagsHeader.getPreviewTextPaint().getFontMetricsInt(), 0.5f), true);
                                }
                                if (FilterCreateActivity.this.nameHeaderCell != null) {
                                    AnimatedTextView animatedTextView = FilterCreateActivity.this.nameHeaderCell.rightTextView;
                                    FilterCreateActivity filterCreateActivity = FilterCreateActivity.this;
                                    if (filterCreateActivity.hasAnimatedEmojis(filterCreateActivity.newFilterName)) {
                                        string = LocaleController.getString(FilterCreateActivity.this.newFilterAnimations ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                                    } else {
                                        string = null;
                                    }
                                    animatedTextView.setText(string);
                                }
                                ((BaseFragment) FilterCreateActivity.this).actionBar.setTitle(AnimatedEmojiSpan.cloneSpans(FilterCreateActivity.this.newFilterName, -1, ((BaseFragment) FilterCreateActivity.this).actionBar.getTitleFontMetricsInt()));
                            }
                            FilterCreateActivity.this.checkDoneButton(true);
                        }
                    });
                    editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                    editEmojiTextCell.editTextEmoji.getEditText().setImeOptions(268435462);
                    userCell = editEmojiTextCell;
                    headerCell = userCell;
                    break;
                case 3:
                    headerCell = new ShadowSectionCell(this.mContext);
                    break;
                case 4:
                    headerCell = new ButtonCell(this.mContext);
                    break;
                case 5:
                    headerCell = new HintInnerCell(this.mContext);
                    break;
                case 6:
                default:
                    headerCell = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 7:
                    Context context = this.mContext;
                    FilterCreateActivity filterCreateActivity = FilterCreateActivity.this;
                    headerCell = new LinkCell(context, filterCreateActivity, ((BaseFragment) filterCreateActivity).currentAccount, FilterCreateActivity.this.filter.id) {
                        @Override
                        protected void onDelete(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
                            FilterCreateActivity.this.onDelete(tL_exportedChatlistInvite);
                        }
                    };
                    break;
                case 8:
                    headerCell = new CreateLinkCell(this.mContext);
                    break;
                case 9:
                    headerCell = FilterCreateActivity.this.new HeaderCellColorPreview(this.mContext);
                    break;
                case 10:
                    headerCell = new PeerColorActivity.PeerColorGrid(FilterCreateActivity.this.getContext(), 2, ((BaseFragment) FilterCreateActivity.this).currentAccount, ((BaseFragment) FilterCreateActivity.this).resourceProvider);
                    break;
                case 11:
                    FilterCreateActivity filterCreateActivity2 = FilterCreateActivity.this;
                    headerCell = filterCreateActivity2.new HeaderCellWithRight(this.mContext, ((BaseFragment) filterCreateActivity2).resourceProvider);
                    break;
            }
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 2 && itemViewType == 9) {
                ((HeaderCellColorPreview) viewHolder.itemView).setPreviewText(AnimatedEmojiSpan.cloneSpans(FilterCreateActivity.this.newFilterName, -1, FilterCreateActivity.this.folderTagsHeader.getPreviewTextPaint().getFontMetricsInt(), 0.5f), true);
            }
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 2) {
                EditEmojiTextCell editEmojiTextCell = (EditEmojiTextCell) viewHolder.itemView;
                editEmojiTextCell.editTextEmoji.hidePopup(true);
                editEmojiTextCell.editTextEmoji.closeKeyboard();
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String string2;
            ItemInner itemInner = (ItemInner) FilterCreateActivity.this.items.get(i);
            if (itemInner == null) {
                return;
            }
            int i2 = i + 1;
            boolean z = i2 < FilterCreateActivity.this.items.size() && !((ItemInner) FilterCreateActivity.this.items.get(i2)).isShadow();
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (itemInner.newSpan) {
                    headerCell.setText(FilterCreateActivity.withNew(0, itemInner.text, false));
                    return;
                } else {
                    headerCell.setText(itemInner.text);
                    return;
                }
            }
            if (itemViewType != 1) {
                if (itemViewType != 4) {
                    switch (itemViewType) {
                        case 6:
                            ((TextInfoPrivacyCell) viewHolder.itemView).setText(itemInner.text);
                            break;
                        case 7:
                            ((LinkCell) viewHolder.itemView).setInvite(itemInner.link, z);
                            break;
                        case 8:
                            FilterCreateActivity.this.createLinkCell = (CreateLinkCell) viewHolder.itemView;
                            FilterCreateActivity.this.createLinkCell.setDivider(z);
                            break;
                        case 9:
                            FilterCreateActivity.this.folderTagsHeader = (HeaderCellColorPreview) viewHolder.itemView;
                            FilterCreateActivity.this.folderTagsHeader.setPreviewText(AnimatedEmojiSpan.cloneSpans(FilterCreateActivity.this.newFilterName, -1, FilterCreateActivity.this.folderTagsHeader.getPreviewTextPaint().getFontMetricsInt(), 0.5f), false);
                            FilterCreateActivity.this.folderTagsHeader.setPreviewColor(FilterCreateActivity.this.getUserConfig().isPremium() ? FilterCreateActivity.this.newFilterColor : -1, false);
                            FilterCreateActivity.this.folderTagsHeader.setText(LocaleController.getString(R.string.FolderTagColor));
                            break;
                        case 10:
                            final PeerColorActivity.PeerColorGrid peerColorGrid = (PeerColorActivity.PeerColorGrid) viewHolder.itemView;
                            peerColorGrid.setCloseAsLock(!FilterCreateActivity.this.getUserConfig().isPremium());
                            peerColorGrid.setSelected(FilterCreateActivity.this.getUserConfig().isPremium() ? FilterCreateActivity.this.newFilterColor : -1, false);
                            peerColorGrid.setOnColorClick(new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    this.f$0.lambda$onBindViewHolder$0(peerColorGrid, (Integer) obj);
                                }
                            });
                            break;
                        case 11:
                            HeaderCellWithRight headerCellWithRight = (HeaderCellWithRight) viewHolder.itemView;
                            FilterCreateActivity.this.nameHeaderCell = headerCellWithRight;
                            headerCellWithRight.setText(itemInner.text);
                            headerCellWithRight.rightTextView.setText(itemInner.subtext);
                            headerCellWithRight.rightTextView.setOnClickListener(itemInner.onClickListener);
                            break;
                    }
                    return;
                }
                ButtonCell buttonCell = (ButtonCell) viewHolder.itemView;
                buttonCell.setRed(itemInner.isRed);
                buttonCell.set(itemInner.iconResId, itemInner.text, z);
                return;
            }
            UserCell userCell = (UserCell) viewHolder.itemView;
            if (itemInner.chatType != null) {
                userCell.setData(itemInner.chatType, itemInner.text, null, 0, z);
                return;
            }
            long j = itemInner.did;
            if (j > 0) {
                TLRPC.User user = FilterCreateActivity.this.getMessagesController().getUser(Long.valueOf(j));
                if (user != null) {
                    if (user.bot) {
                        string2 = LocaleController.getString(R.string.Bot);
                    } else if (user.contact) {
                        string2 = LocaleController.getString(R.string.FilterContact);
                    } else {
                        string2 = LocaleController.getString(R.string.FilterNonContact);
                    }
                    userCell.setData(user, null, string2, 0, z);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = FilterCreateActivity.this.getMessagesController().getChat(Long.valueOf(-j));
            if (chat != null) {
                if (chat.participants_count != 0) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        string = LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                    } else {
                        string = LocaleController.formatPluralStringComma("Members", chat.participants_count);
                    }
                } else if (!ChatObject.isPublic(chat)) {
                    if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        string = LocaleController.getString(R.string.ChannelPrivate);
                    } else {
                        string = LocaleController.getString(R.string.MegaPrivate);
                    }
                } else if (ChatObject.isChannel(chat) && !chat.megagroup) {
                    string = LocaleController.getString(R.string.ChannelPublic);
                } else {
                    string = LocaleController.getString(R.string.MegaPublic);
                }
                userCell.setData(chat, null, string, 0, z);
            }
        }

        public void lambda$onBindViewHolder$0(PeerColorActivity.PeerColorGrid peerColorGrid, Integer num) {
            if (FilterCreateActivity.this.getUserConfig().isPremium()) {
                peerColorGrid.setSelected(FilterCreateActivity.this.newFilterColor = num.intValue(), true);
                if (FilterCreateActivity.this.folderTagsHeader != null) {
                    FilterCreateActivity.this.folderTagsHeader.setPreviewColor(!FilterCreateActivity.this.getUserConfig().isPremium() ? -1 : FilterCreateActivity.this.newFilterColor, true);
                }
                FilterCreateActivity.this.checkDoneButton(true);
                return;
            }
            FilterCreateActivity.this.showDialog(new PremiumFeatureBottomSheet(FilterCreateActivity.this, 35, true));
        }

        @Override
        public int getItemViewType(int i) {
            ItemInner itemInner = (ItemInner) FilterCreateActivity.this.items.get(i);
            if (itemInner == null) {
                return 3;
            }
            return itemInner.viewType;
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$28();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, TextCell.class, UserCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"ImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{UserCell.class}, new String[]{"adminTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_profile_creatorIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$28() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                }
            }
        }
    }

    private static class ButtonCell extends FrameLayout {
        private boolean divider;
        private ImageView imageView;
        private int lastIconResId;
        private TextView textView;
        private Boolean translateText;

        public ButtonCell(Context context) {
            super(context);
            this.divider = true;
            this.translateText = null;
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            this.textView.setLines(1);
            this.textView.setSingleLine();
            TextView textView2 = this.textView;
            boolean z = LocaleController.isRTL;
            textView2.setPadding(z ? 24 : 0, 0, z ? 0 : 24, 0);
            this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
            TextView textView3 = this.textView;
            boolean z2 = LocaleController.isRTL;
            addView(textView3, LayoutHelper.createFrame(-1, -2.0f, 23, z2 ? 0.0f : 72.0f, 0.0f, z2 ? 72.0f : 0.0f, 0.0f));
        }

        public void setRed(boolean z) {
            this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(z ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteBlueText2), PorterDuff.Mode.MULTIPLY));
            this.textView.setTextColor(Theme.getColor(z ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteBlueText4));
        }

        public void set(int i, CharSequence charSequence, boolean z) {
            int i2 = LocaleController.isRTL ? -1 : 1;
            boolean z2 = false;
            if (i == 0) {
                this.imageView.setVisibility(8);
            } else {
                this.imageView.setVisibility(0);
                this.imageView.setImageResource(i);
            }
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(i == 0 ? 24.0f : 72.0f);
            } else {
                ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(i == 0 ? 24.0f : 72.0f);
            }
            this.textView.setText(charSequence);
            if (!z && i != 0) {
                z2 = true;
            }
            Boolean bool = this.translateText;
            if (bool == null || bool.booleanValue() != z2) {
                this.translateText = Boolean.valueOf(z2);
                if (this.lastIconResId == i) {
                    this.textView.clearAnimation();
                    this.textView.animate().translationX(z2 ? AndroidUtilities.dp(i2 * (-7)) : 0.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                } else {
                    this.textView.setTranslationX(z2 ? AndroidUtilities.dp(i2 * (-7)) : 0.0f);
                }
            }
            this.divider = z;
            setWillNotDraw(!z);
            this.lastIconResId = i;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.divider) {
                canvas.drawRect(this.textView.getLeft(), getMeasuredHeight() - 1, this.textView.getRight(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }
    }

    private static class CreateLinkCell extends FrameLayout {
        ImageView imageView;
        boolean needDivider;
        TextView textView;

        public CreateLinkCell(Context context) throws Resources.NotFoundException {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.textView.setTextSize(1, 16.0f);
            this.textView.setText(LocaleController.getString(R.string.CreateNewLink));
            this.textView.setGravity(LocaleController.isRTL ? 5 : 3);
            TextView textView2 = this.textView;
            boolean z = LocaleController.isRTL;
            textView2.setPadding(z ? 16 : 0, 0, z ? 0 : 16, 0);
            TextView textView3 = this.textView;
            boolean z2 = LocaleController.isRTL;
            addView(textView3, LayoutHelper.createFrame(-1, -2.0f, 23, z2 ? 0.0f : 64.0f, 0.0f, z2 ? 64.0f : 0.0f, 0.0f));
            this.imageView = new ImageView(context);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int color = Theme.getColor(Theme.key_featuredStickers_addButton);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_checkboxCheck), mode));
            this.imageView.setImageDrawable(new CombinedDrawable(drawable, drawable2));
            this.imageView.setScaleType(ImageView.ScaleType.CENTER);
            ImageView imageView = this.imageView;
            boolean z3 = LocaleController.isRTL;
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, (z3 ? 5 : 3) | 16, z3 ? 0.0f : 16.0f, 0.0f, z3 ? 16.0f : 0.0f, 0.0f));
        }

        public void setText(String str) {
            this.textView.setText(str);
        }

        public void setDivider(boolean z) {
            if (this.needDivider != z) {
                this.needDivider = z;
                setWillNotDraw(!z);
            }
        }

        @Override
        public void setEnabled(boolean z) {
            super.setEnabled(z);
            this.textView.setAlpha(z ? 1.0f : 0.5f);
            this.imageView.setAlpha(z ? 1.0f : 0.5f);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                canvas.drawRect(this.textView.getLeft(), getMeasuredHeight() - 1, this.textView.getRight(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
        }
    }

    static class LinkCell extends FrameLayout {
        private int currentAccount;
        private int filterId;
        private BaseFragment fragment;
        private TL_chatlists.TL_exportedChatlistInvite lastInvite;
        private boolean lastRevoked;
        protected String lastUrl;
        Drawable linkIcon;
        boolean needDivider;
        ImageView optionsIcon;
        Paint paint;
        float revokeT;
        Drawable revokedLinkIcon;
        Paint revokedPaint;
        AnimatedTextView subtitleTextView;
        AnimatedTextView titleTextView;
        private ValueAnimator valueAnimator;

        protected abstract void onDelete(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

        public LinkCell(Context context, BaseFragment baseFragment, int i, int i2) {
            super(context);
            this.fragment = baseFragment;
            this.currentAccount = i;
            this.filterId = i2;
            setImportantForAccessibility(1);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, false);
            this.titleTextView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(15.66f));
            this.titleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.titleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.titleTextView.setEllipsizeByGradient(true);
            AnimatedTextView animatedTextView2 = this.titleTextView;
            boolean z = LocaleController.isRTL;
            addView(animatedTextView2, LayoutHelper.createFrame(-1, 20.0f, 55, z ? 56.0f : 64.0f, 10.33f, z ? 64.0f : 56.0f, 0.0f));
            AnimatedTextView animatedTextView3 = new AnimatedTextView(context, false, false, false);
            this.subtitleTextView = animatedTextView3;
            animatedTextView3.setTextSize(AndroidUtilities.dp(13.0f));
            this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
            this.subtitleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            AnimatedTextView animatedTextView4 = this.subtitleTextView;
            boolean z2 = LocaleController.isRTL;
            addView(animatedTextView4, LayoutHelper.createFrame(-1, 16.0f, 55, z2 ? 56.0f : 64.0f, 33.33f, z2 ? 64.0f : 56.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.optionsIcon = imageView;
            imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
            this.optionsIcon.setScaleType(ImageView.ScaleType.CENTER);
            this.optionsIcon.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector)));
            ImageView imageView2 = this.optionsIcon;
            int color = Theme.getColor(Theme.key_stickers_menu);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView2.setColorFilter(new PorterDuffColorFilter(color, mode));
            this.optionsIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
            this.optionsIcon.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            ImageView imageView3 = this.optionsIcon;
            boolean z3 = LocaleController.isRTL;
            addView(imageView3, LayoutHelper.createFrame(40, 40.0f, (z3 ? 3 : 5) | 16, z3 ? 8.0f : 4.0f, 4.0f, z3 ? 4.0f : 8.0f, 4.0f));
            Paint paint = new Paint();
            this.paint = paint;
            paint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton));
            Paint paint2 = new Paint();
            this.revokedPaint = paint2;
            paint2.setColor(Theme.getColor(Theme.key_color_red));
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
            this.linkIcon = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
            Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
            this.revokedLinkIcon = drawableMutate2;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            setWillNotDraw(false);
        }

        public void lambda$new$0(View view) {
            options();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int measuredWidth = LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(32.0f);
            float f = measuredWidth;
            canvas.drawCircle(f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.paint);
            if (this.revokeT > 0.0f) {
                canvas.drawCircle(f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f) * this.revokeT, this.revokedPaint);
            }
            float f2 = this.revokeT;
            if (f2 < 1.0f) {
                this.linkIcon.setAlpha((int) ((1.0f - f2) * 255.0f));
                this.linkIcon.setBounds(measuredWidth - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + measuredWidth, (getMeasuredHeight() / 2) + AndroidUtilities.dp(14.0f));
                this.linkIcon.draw(canvas);
            }
            float f3 = this.revokeT;
            if (f3 > 0.0f) {
                this.revokedLinkIcon.setAlpha((int) (f3 * 255.0f));
                this.revokedLinkIcon.setBounds(measuredWidth - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), measuredWidth + AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) + AndroidUtilities.dp(14.0f));
                this.revokedLinkIcon.draw(canvas);
            }
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        public void setRevoked(final boolean z, boolean z2) {
            this.lastRevoked = z;
            if ((z ? 1.0f : 0.0f) != this.revokeT) {
                ValueAnimator valueAnimator = this.valueAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.valueAnimator = null;
                }
                if (z2) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.revokeT, z ? 1.0f : 0.0f);
                    this.valueAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            this.f$0.lambda$setRevoked$1(valueAnimator2);
                        }
                    });
                    this.valueAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            LinkCell linkCell = LinkCell.this;
                            linkCell.revokeT = z ? 1.0f : 0.0f;
                            linkCell.invalidate();
                        }
                    });
                    this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.valueAnimator.setDuration(350L);
                    this.valueAnimator.start();
                    return;
                }
                this.revokeT = z ? 1.0f : 0.0f;
                invalidate();
            }
        }

        public void lambda$setRevoked$1(ValueAnimator valueAnimator) {
            this.revokeT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void setInvite(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z) {
            boolean z2 = this.lastInvite == tL_exportedChatlistInvite;
            this.lastInvite = tL_exportedChatlistInvite;
            String strSubstring = tL_exportedChatlistInvite.url;
            this.lastUrl = strSubstring;
            if (strSubstring.startsWith("http://")) {
                strSubstring = strSubstring.substring(7);
            }
            if (strSubstring.startsWith("https://")) {
                strSubstring = strSubstring.substring(8);
            }
            if (TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                this.titleTextView.setText(strSubstring, z2);
            } else {
                this.titleTextView.setText(tL_exportedChatlistInvite.title, z2);
            }
            this.subtitleTextView.setText(LocaleController.formatPluralString("FilterInviteChats", tL_exportedChatlistInvite.peers.size(), new Object[0]), z2);
            if (this.needDivider != z) {
                this.needDivider = z;
                invalidate();
            }
            setRevoked(tL_exportedChatlistInvite.revoked, z2);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        }

        public void options() {
            BaseFragment baseFragment = this.fragment;
            if (baseFragment == null) {
                return;
            }
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(baseFragment, this);
            itemOptionsMakeOptions.add(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.qrcode();
                }
            });
            itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.DeleteLink), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.deleteLink();
                }
            });
            if (LocaleController.isRTL) {
                itemOptionsMakeOptions.setGravity(3);
            }
            itemOptionsMakeOptions.show();
        }

        private String getSlug() {
            String str = this.lastUrl;
            if (str == null) {
                return null;
            }
            return str.substring(str.lastIndexOf(47) + 1);
        }

        public void deleteLink() {
            String slug = getSlug();
            if (slug == null) {
                return;
            }
            TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.filterId;
            tL_chatlists_deleteExportedInvite.slug = slug;
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteLink$4();
                }
            };
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_chatlists_deleteExportedInvite, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$deleteLink$6(runnable, tLObject, tL_error);
                }
            });
            AndroidUtilities.runOnUIThread(runnable, 150L);
        }

        public void lambda$deleteLink$4() {
            onDelete(this.lastInvite);
        }

        public void lambda$deleteLink$6(final Runnable runnable, TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteLink$5(tL_error, runnable);
                }
            });
        }

        public void lambda$deleteLink$5(TLRPC.TL_error tL_error, Runnable runnable) {
            if (tL_error != null) {
                BulletinFactory.of(this.fragment).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
        }

        public void qrcode() {
            if (this.lastUrl == null) {
                return;
            }
            QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(getContext(), LocaleController.getString(R.string.InviteByQRCode), this.lastUrl, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
            qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
            qRCodeBottomSheet.show();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            StringBuilder sb = new StringBuilder();
            TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.lastInvite;
            String str2 = "";
            if (tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                str = "";
            } else {
                str = this.lastInvite.title + "\n ";
            }
            sb.append(str);
            sb.append(LocaleController.getString(R.string.InviteLink));
            sb.append(", ");
            sb.append((Object) this.subtitleTextView.getText());
            TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.lastInvite;
            if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
                str2 = "\n\n" + this.lastInvite.url;
            }
            sb.append(str2);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
    }

    public static void hideNew(int i) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("n_" + i, true).apply();
    }

    public static CharSequence withNew(int i, CharSequence charSequence, boolean z) {
        Context context;
        if (i >= 0) {
            if (MessagesController.getGlobalMainSettings().getBoolean("n_" + i, false) || (context = ApplicationLoader.applicationContext) == null) {
                return charSequence;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            SpannableString spannableString = new SpannableString("NEW");
            if (z) {
                Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_other_new_outline).mutate();
                drawableMutate.setBounds(0, -AndroidUtilities.dp(8.0f), drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight() - AndroidUtilities.dp(8.0f));
                spannableString.setSpan(new ColorImageSpan(drawableMutate, 0), 0, spannableString.length(), 33);
            } else {
                Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.msg_other_new_filled).mutate();
                Drawable drawableMutate3 = context.getResources().getDrawable(R.drawable.msg_other_new_filled_text).mutate();
                int color = Theme.getColor(Theme.key_featuredStickers_unread);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawableMutate2.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawableMutate3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_buttonText), mode));
                CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate2, drawableMutate3);
                combinedDrawable.setBounds(0, 0, combinedDrawable.getIntrinsicWidth(), combinedDrawable.getIntrinsicHeight());
                spannableString.setSpan(new ImageSpan(combinedDrawable, 0), 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) spannableString);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public static class ColorImageSpan extends ImageSpan {
        int lastColor;

        public ColorImageSpan(Drawable drawable, int i) {
            super(drawable, i);
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            if (paint.getColor() != this.lastColor && getDrawable() != null) {
                Drawable drawable = getDrawable();
                int color = paint.getColor();
                this.lastColor = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            }
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        }
    }

    public static class NewSpan extends ReplacementSpan {
        Paint bgPaint;
        private int color;
        private int fontSize;
        float height;
        StaticLayout layout;
        private boolean outline;
        private CharSequence text;
        TextPaint textPaint;
        public boolean usePaintAlpha;
        float width;

        public NewSpan(boolean z, int i) {
            this.textPaint = new TextPaint(1);
            this.bgPaint = new Paint(1);
            this.text = "NEW";
            this.outline = z;
            this.fontSize = i;
            this.textPaint.setTypeface(AndroidUtilities.bold());
            if (z) {
                this.bgPaint.setStyle(Paint.Style.STROKE);
                this.bgPaint.setStrokeWidth(AndroidUtilities.dpf2(1.33f));
                this.textPaint.setTextSize(AndroidUtilities.dp(i < 0 ? 10.0f : i));
                this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.2f));
                this.textPaint.setLetterSpacing(0.03f);
                return;
            }
            this.bgPaint.setStyle(Paint.Style.FILL);
            this.textPaint.setTextSize(AndroidUtilities.dp(i < 0 ? 12.0f : i));
        }

        public void setTypeface(Typeface typeface) {
            this.textPaint.setTypeface(typeface);
        }

        public NewSpan(float f) {
            this.textPaint = new TextPaint(1);
            this.bgPaint = new Paint(1);
            this.text = "NEW";
            this.outline = false;
            this.textPaint.setTypeface(AndroidUtilities.bold());
            this.bgPaint.setStyle(Paint.Style.FILL);
            this.textPaint.setTextSize(AndroidUtilities.dp(f));
        }

        public void setColor(int i) {
            this.color = i;
        }

        public void setText(CharSequence charSequence) {
            this.text = charSequence;
            if (this.layout != null) {
                this.layout = null;
                makeLayout();
            }
        }

        public StaticLayout makeLayout() {
            if (this.layout == null) {
                StaticLayout staticLayout = new StaticLayout(this.text, this.textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.layout = staticLayout;
                this.width = staticLayout.getLineWidth(0);
                this.height = this.layout.getHeight();
            }
            return this.layout;
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            makeLayout();
            return (int) (AndroidUtilities.dp(10.0f) + this.width);
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            float fDp;
            makeLayout();
            float alpha = this.usePaintAlpha ? paint.getAlpha() / 255.0f : 1.0f;
            int color = this.color;
            if (color == 0) {
                color = paint.getColor();
            }
            this.bgPaint.setColor(color);
            if (this.outline) {
                this.textPaint.setColor(color);
            } else {
                this.textPaint.setColor(AndroidUtilities.computePerceivedBrightness(color) > 0.721f ? -16777216 : -1);
            }
            this.bgPaint.setAlpha((int) (r4.getAlpha() * alpha));
            this.textPaint.setAlpha((int) (r4.getAlpha() * alpha));
            float fDp2 = f + AndroidUtilities.dp(2.0f);
            float fDp3 = (i4 - this.height) + AndroidUtilities.dp(1.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fDp2, fDp3, this.width + fDp2, this.height + fDp3);
            if (this.outline) {
                fDp = AndroidUtilities.dp(3.66f);
                rectF.left -= AndroidUtilities.dp(4.0f);
                rectF.top -= AndroidUtilities.dp(2.33f);
                rectF.right += AndroidUtilities.dp(3.66f);
                rectF.bottom += AndroidUtilities.dp(1.33f);
            } else {
                fDp = AndroidUtilities.dp(4.4f);
                rectF.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(this.fontSize == 8 ? -3.66f : -2.33f));
            }
            canvas.drawRoundRect(rectF, fDp, fDp, this.bgPaint);
            canvas.save();
            canvas.translate(fDp2, fDp3);
            this.layout.draw(canvas);
            canvas.restore();
        }
    }

    public static class TextSpan extends ReplacementSpan {
        Paint bgPaint = new Paint(1);
        private int colorKey;
        private final Theme.ResourcesProvider resourcesProvider;
        private Text text;

        public TextSpan(String str, float f, int i, Theme.ResourcesProvider resourcesProvider) {
            this.resourcesProvider = resourcesProvider;
            this.colorKey = i;
            this.text = new Text(str, f, AndroidUtilities.bold());
            this.bgPaint.setStyle(Paint.Style.FILL);
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) (AndroidUtilities.dp(9.33f) + this.text.getWidth());
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int color = Theme.getColor(this.colorKey, this.resourcesProvider);
            this.bgPaint.setColor(Theme.multAlpha(color, 0.15f));
            float f2 = (i5 + i3) / 2.0f;
            float fDp = AndroidUtilities.dp(14.66f);
            RectF rectF = AndroidUtilities.rectTmp;
            float f3 = fDp / 2.0f;
            rectF.set(f, f2 - f3, this.text.getWidth() + f + AndroidUtilities.dp(9.33f), f3 + f2);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.bgPaint);
            this.text.draw(canvas, f + AndroidUtilities.dp(4.66f), f2, color, 1.0f);
        }
    }

    private void onUpdate(final boolean z, final int i) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.showedUpdateBulletin && (dialogFilter = this.filter) != null && dialogFilter.isChatlist() && this.filter.isMyChatlist()) {
            this.showedUpdateBulletin = true;
            this.showBulletinOnResume = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onUpdate$29(z, i);
                }
            };
            if (getLayoutContainer() != null) {
                this.showBulletinOnResume.run();
                this.showBulletinOnResume = null;
            }
        }
    }

    public void lambda$onUpdate$29(boolean z, int i) {
        String pluralString;
        BulletinFactory bulletinFactoryOf = BulletinFactory.of(this);
        int i2 = z ? R.raw.folder_in : R.raw.folder_out;
        if (z) {
            pluralString = LocaleController.formatPluralString("FolderLinkAddedChats", i, new Object[0]);
        } else {
            pluralString = LocaleController.formatPluralString("FolderLinkRemovedChats", i, new Object[0]);
        }
        bulletinFactoryOf.createSimpleBulletin(i2, pluralString, LocaleController.getString(R.string.FolderLinkChatlistUpdate)).setDuration(5000).show();
    }

    public static class FilterInvitesBottomSheet extends BottomSheetWithRecyclerListView {
        private AdapterWithDiffUtils adapter;
        private FrameLayout bulletinContainer;
        private TextView button;
        private MessagesController.DialogFilter filter;
        private ArrayList invites;
        private final ArrayList items;
        private final ArrayList oldItems;

        public static void show(final BaseFragment baseFragment, final MessagesController.DialogFilter dialogFilter, final Runnable runnable) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
            baseFragment.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    FilterCreateActivity.FilterInvitesBottomSheet.lambda$show$1(baseFragment, dialogFilter, runnable, jCurrentTimeMillis, tLObject, tL_error);
                }
            });
        }

        public static void lambda$show$1(final BaseFragment baseFragment, final MessagesController.DialogFilter dialogFilter, final Runnable runnable, final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    FilterCreateActivity.FilterInvitesBottomSheet.lambda$show$0(baseFragment, tLObject, dialogFilter, tL_error, runnable, j);
                }
            });
        }

        public static void lambda$show$0(BaseFragment baseFragment, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j) {
            if (baseFragment == null || baseFragment.getContext() == null) {
                return;
            }
            if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                baseFragment.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                baseFragment.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                new FilterInvitesBottomSheet(baseFragment, dialogFilter, tL_chatlists_exportedInvites.invites).show();
            } else if (tL_error != null && "FILTER_ID_INVALID".equals(tL_error.text) && !dialogFilter.isDefault()) {
                new FilterInvitesBottomSheet(baseFragment, dialogFilter, null).show();
            } else {
                BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
            }
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 200 - (System.currentTimeMillis() - j)));
            }
        }

        public FilterInvitesBottomSheet(BaseFragment baseFragment, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
            super(baseFragment, false, false);
            this.invites = new ArrayList();
            this.oldItems = new ArrayList();
            this.items = new ArrayList();
            this.filter = dialogFilter;
            if (arrayList != null) {
                this.invites.addAll(arrayList);
            }
            updateRows(false);
            this.actionBar.setTitle(getTitle());
            fixNavigationBar(Theme.getColor(Theme.key_dialogBackground));
            TextView textView = new TextView(getContext());
            this.button = textView;
            textView.setTextSize(1, 14.0f);
            this.button.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
            this.button.setTypeface(AndroidUtilities.bold());
            this.button.setBackground(Theme.AdaptiveRipple.filledRectByKey(Theme.key_featuredStickers_addButton, 8.0f));
            this.button.setText(LocaleController.getString(R.string.FolderLinkShareButton));
            this.button.setGravity(17);
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$2(view);
                }
            });
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
            int i = layoutParamsCreateFrame.leftMargin;
            int i2 = this.backgroundPaddingLeft;
            layoutParamsCreateFrame.leftMargin = i + i2;
            layoutParamsCreateFrame.rightMargin += i2;
            this.containerView.addView(this.button, layoutParamsCreateFrame);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.bulletinContainer = frameLayout;
            this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
            updateCreateInviteButton();
        }

        public void lambda$new$2(View view) {
            createLink();
        }

        public void updateCreateInviteButton() {
            this.button.setVisibility(this.invites.isEmpty() ? 0 : 8);
            this.recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), this.invites.isEmpty() ? AndroidUtilities.dp(68.0f) : 0);
        }

        @Override
        protected CharSequence getTitle() {
            return getTitle(null);
        }

        protected CharSequence getTitle(TextView textView) {
            Object objReplaceAnimatedEmoji;
            if (this.filter == null) {
                objReplaceAnimatedEmoji = "";
            } else {
                Paint.FontMetricsInt fontMetricsInt = textView == null ? null : textView.getPaint().getFontMetricsInt();
                objReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(this.filter.name), fontMetricsInt, false), this.filter.entities, fontMetricsInt);
            }
            return LocaleController.formatSpannable(R.string.FolderLinkShareTitle2, objReplaceAnimatedEmoji);
        }

        public void updateRows(boolean z) {
            this.oldItems.clear();
            this.oldItems.addAll(this.items);
            this.items.clear();
            this.items.add(ItemInner.asHeader(null));
            if (!this.invites.isEmpty()) {
                this.items.add(ItemInner.asShadow(null));
                this.items.add(ItemInner.asCreateLink());
                for (int i = 0; i < this.invites.size(); i++) {
                    this.items.add(ItemInner.asLink((TL_chatlists.TL_exportedChatlistInvite) this.invites.get(i)));
                }
            }
            AdapterWithDiffUtils adapterWithDiffUtils = this.adapter;
            if (adapterWithDiffUtils != null) {
                if (z) {
                    adapterWithDiffUtils.setItems(this.oldItems, this.items);
                } else {
                    notifyDataSetChanged();
                }
            }
        }

        @Override
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            AdapterWithDiffUtils adapterWithDiffUtils = new AdapterWithDiffUtils() {
                private RecyclerView.Adapter realAdapter() {
                    return ((BottomSheetWithRecyclerListView) FilterInvitesBottomSheet.this).recyclerListView.getAdapter();
                }

                @Override
                public void notifyItemChanged(int i) {
                    realAdapter().notifyItemChanged(i + 1);
                }

                @Override
                public void notifyItemMoved(int i, int i2) {
                    realAdapter().notifyItemMoved(i + 1, i2);
                }

                @Override
                public void notifyItemRangeChanged(int i, int i2) {
                    realAdapter().notifyItemRangeChanged(i + 1, i2);
                }

                @Override
                public void notifyItemRangeChanged(int i, int i2, Object obj) {
                    realAdapter().notifyItemRangeChanged(i + 1, i2, obj);
                }

                @Override
                public void notifyItemRangeInserted(int i, int i2) {
                    realAdapter().notifyItemRangeInserted(i + 1, i2);
                }

                @Override
                public void notifyItemRangeRemoved(int i, int i2) {
                    realAdapter().notifyItemRangeRemoved(i + 1, i2);
                }

                @Override
                public void notifyDataSetChanged() {
                    realAdapter().notifyDataSetChanged();
                }

                @Override
                public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                    int itemViewType = viewHolder.getItemViewType();
                    return itemViewType == 8 || itemViewType == 7;
                }

                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    View textInfoPrivacyCell;
                    if (i == 8) {
                        textInfoPrivacyCell = new CreateLinkCell(FilterInvitesBottomSheet.this.getContext());
                        textInfoPrivacyCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground));
                    } else if (i == 7) {
                        textInfoPrivacyCell = new C00431(FilterInvitesBottomSheet.this.getContext(), null, ((BottomSheet) FilterInvitesBottomSheet.this).currentAccount, FilterInvitesBottomSheet.this.filter.id);
                        textInfoPrivacyCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground));
                    } else if (i == 6 || i == 3) {
                        textInfoPrivacyCell = new TextInfoPrivacyCell(FilterInvitesBottomSheet.this.getContext());
                        textInfoPrivacyCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
                    } else {
                        FilterInvitesBottomSheet filterInvitesBottomSheet = FilterInvitesBottomSheet.this;
                        textInfoPrivacyCell = filterInvitesBottomSheet.new HeaderView(filterInvitesBottomSheet.getContext());
                    }
                    return new RecyclerListView.Holder(textInfoPrivacyCell);
                }

                class C00431 extends LinkCell {
                    C00431(Context context, BaseFragment baseFragment, int i, int i2) {
                        super(context, baseFragment, i, i2);
                    }

                    @Override
                    public void options() {
                        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(FilterInvitesBottomSheet.this.container, this);
                        itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.copy();
                            }
                        });
                        itemOptionsMakeOptions.add(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.qrcode();
                            }
                        });
                        itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.DeleteLink), true, new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.deleteLink();
                            }
                        });
                        if (LocaleController.isRTL) {
                            itemOptionsMakeOptions.setGravity(3);
                        }
                        itemOptionsMakeOptions.show();
                    }

                    public void copy() {
                        String str = this.lastUrl;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            BulletinFactory.of(FilterInvitesBottomSheet.this.bulletinContainer, null).createCopyLinkBulletin().show();
                        }
                    }

                    @Override
                    protected void onDelete(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
                        FilterInvitesBottomSheet.this.invites.remove(tL_exportedChatlistInvite);
                        FilterInvitesBottomSheet.this.updateCreateInviteButton();
                        FilterInvitesBottomSheet.this.updateRows(true);
                    }
                }

                @Override
                public int getItemViewType(int i) {
                    return ((ItemInner) FilterInvitesBottomSheet.this.items.get(i)).viewType;
                }

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    int itemViewType = viewHolder.getItemViewType();
                    ItemInner itemInner = (ItemInner) FilterInvitesBottomSheet.this.items.get(i);
                    int i2 = i + 1;
                    boolean z = i2 < FilterInvitesBottomSheet.this.items.size() && !((ItemInner) FilterInvitesBottomSheet.this.items.get(i2)).isShadow();
                    if (itemViewType == 7) {
                        ((LinkCell) viewHolder.itemView).setInvite(itemInner.link, z);
                        return;
                    }
                    if (itemViewType != 6 && itemViewType != 3) {
                        if (itemViewType != 0 && itemViewType == 8) {
                            CreateLinkCell createLinkCell = (CreateLinkCell) viewHolder.itemView;
                            createLinkCell.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                            createLinkCell.setDivider(z);
                            return;
                        }
                        return;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (itemViewType == 6) {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(itemInner.text);
                    } else {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText("");
                    }
                }

                @Override
                public int getItemCount() {
                    return FilterInvitesBottomSheet.this.items.size();
                }
            };
            this.adapter = adapterWithDiffUtils;
            return adapterWithDiffUtils;
        }

        class HeaderView extends FrameLayout {
            private final ImageView closeImageView;
            private final ImageView imageView;
            private final TextView subtitleView;
            private final SpoilersTextView titleView;

            public HeaderView(Context context) {
                String string;
                super(context);
                ImageView imageView = new ImageView(context);
                this.imageView = imageView;
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                imageView.setScaleType(scaleType);
                imageView.setImageResource(R.drawable.msg_limit_links);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                addView(imageView, LayoutHelper.createFrame(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
                SpoilersTextView spoilersTextView = new SpoilersTextView(context);
                this.titleView = spoilersTextView;
                spoilersTextView.setTypeface(AndroidUtilities.bold());
                spoilersTextView.setTextSize(1, 20.0f);
                int i = Theme.key_dialogTextBlack;
                spoilersTextView.setTextColor(Theme.getColor(i));
                spoilersTextView.setGravity(1);
                spoilersTextView.setText(FilterInvitesBottomSheet.this.getTitle(spoilersTextView));
                spoilersTextView.cacheType = (FilterInvitesBottomSheet.this.filter == null || !FilterInvitesBottomSheet.this.filter.title_noanimate) ? 0 : 26;
                addView(spoilersTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
                TextView textView = new TextView(context);
                this.subtitleView = textView;
                if (FilterInvitesBottomSheet.this.invites.isEmpty()) {
                    string = LocaleController.getString(R.string.FolderLinkShareSubtitleEmpty);
                } else {
                    string = LocaleController.getString(R.string.FolderLinkShareSubtitle);
                }
                textView.setText(string);
                textView.setLines(2);
                textView.setGravity(1);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(Theme.getColor(i));
                addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
                ImageView imageView2 = new ImageView(context);
                this.closeImageView = imageView2;
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.msg_close);
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText5), PorterDuff.Mode.MULTIPLY));
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$new$0(view);
                    }
                });
                addView(imageView2, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
            }

            public void lambda$new$0(View view) {
                FilterInvitesBottomSheet.this.lambda$new$0();
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(171.0f), 1073741824));
            }
        }

        private void createLink() {
            ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.filter.alwaysShow.size(); i++) {
                long jLongValue = this.filter.alwaysShow.get(i).longValue();
                if (jLongValue < 0 && FilterCreateActivity.canAddToFolder(getBaseFragment().getMessagesController().getChat(Long.valueOf(-jLongValue)))) {
                    arrayList.add(getBaseFragment().getMessagesController().getInputPeer(jLongValue));
                }
            }
            if (arrayList.isEmpty()) {
                lambda$new$0();
                getBaseFragment().presentFragment(new FilterChatlistActivity(this.filter, null));
                return;
            }
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.filter.id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            getBaseFragment().getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$createLink$4(tLObject, tL_error);
                }
            });
        }

        public void lambda$createLink$4(final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createLink$3(tL_error, tLObject);
                }
            });
        }

        public void lambda$createLink$3(TLRPC.TL_error tL_error, TLObject tLObject) {
            if (FilterCreateActivity.processErrors(tL_error, getBaseFragment(), BulletinFactory.of(this.bulletinContainer, null)) && (tLObject instanceof TL_chatlists.TL_chatlists_exportedChatlistInvite)) {
                FilterCreateActivity.hideNew(0);
                lambda$new$0();
                getBaseFragment().getMessagesController().loadRemoteFilters(true);
                getBaseFragment().presentFragment(new FilterChatlistActivity(this.filter, ((TL_chatlists.TL_chatlists_exportedChatlistInvite) tLObject).invite));
            }
        }

        @Override
        public void onViewCreated(FrameLayout frameLayout) {
            super.onViewCreated(frameLayout);
            this.recyclerListView.setOverScrollMode(2);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    this.f$0.lambda$onViewCreated$5(view, i);
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
        }

        public void lambda$onViewCreated$5(View view, int i) {
            int i2 = i - 1;
            if (i2 < 0 || i2 >= this.items.size()) {
                return;
            }
            ItemInner itemInner = (ItemInner) this.items.get(i2);
            int i3 = itemInner.viewType;
            if (i3 == 7) {
                lambda$new$0();
                getBaseFragment().presentFragment(new FilterChatlistActivity(this.filter, itemInner.link));
            } else if (i3 == 8) {
                createLink();
            }
        }
    }

    public static boolean processErrors(TLRPC.TL_error tL_error, BaseFragment baseFragment, BulletinFactory bulletinFactory) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 4, baseFragment.getCurrentAccount(), null).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                bulletinFactory.createErrorBulletin(LocaleController.getString(R.string.FolderLinkNoChatsError)).show();
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                bulletinFactory.createErrorBulletin(LocaleController.getString(R.string.FolderLinkOtherAdminLimitError)).show();
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 5, baseFragment.getCurrentAccount(), null).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 12, baseFragment.getCurrentAccount(), null).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 13, baseFragment.getCurrentAccount(), null).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                bulletinFactory.createErrorBulletin(LocaleController.getString(R.string.NoFolderFound)).show();
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 4, baseFragment.getCurrentAccount(), null).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new LimitReachedBottomSheet(baseFragment, baseFragment.getContext(), 3, baseFragment.getCurrentAccount(), null).show();
            } else {
                bulletinFactory.createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
            }
        }
        return true;
    }

    private class HeaderCellColorPreview extends HeaderCell {
        private final AnimatedColor animatedColor;
        private int currentColor;
        public final TextView noTag;
        private boolean noTagShown;
        public final AnimatedTextView previewView;

        public HeaderCellColorPreview(Context context) {
            super(context, Theme.key_windowBackgroundWhiteBlueHeader, 22, 15, false, ((BaseFragment) FilterCreateActivity.this).resourceProvider);
            TextView textView = new TextView(getContext());
            this.noTag = textView;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(FilterCreateActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
            textView.setText(LocaleController.getString(FilterCreateActivity.this.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium));
            textView.setGravity(5);
            int i = (LocaleController.isRTL ? 3 : 5) | 48;
            float f = this.padding;
            addView(textView, LayoutHelper.createFrame(-1, -1.0f, i, f, 16.66f, f, this.bottomMargin));
            textView.setAlpha(0.0f);
            AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), false, true, true) {
                private final Paint backgroundPaint = new Paint(1);

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    int i2 = HeaderCellColorPreview.this.animatedColor.set(HeaderCellColorPreview.this.currentColor);
                    setTextColor(i2);
                    this.backgroundPaint.setColor(Theme.multAlpha(i2, Theme.isCurrentThemeDark() ? 0.2f : 0.1f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getWidth() - getDrawable().getCurrentWidth()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (getHeight() + AndroidUtilities.dpf2(14.66f)) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.backgroundPaint);
                    super.dispatchDraw(canvas);
                }
            };
            this.previewView = animatedTextView;
            this.animatedColor = new AnimatedColor(animatedTextView, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            animatedTextView.setTextSize(AndroidUtilities.dp(10.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setGravity(5);
            animatedTextView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
            int i2 = LocaleController.isRTL ? 3 : 5;
            float f2 = this.padding;
            addView(animatedTextView, LayoutHelper.createFrame(-1, -1.0f, i2 | 48, f2, 16.66f, f2, this.bottomMargin));
        }

        public void setPreviewColor(int i, boolean z) {
            this.noTag.setText(LocaleController.getString(FilterCreateActivity.this.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium));
            int themedColor = 0;
            boolean z2 = i < 0;
            if (!z2) {
                FilterCreateActivity filterCreateActivity = FilterCreateActivity.this;
                int[] iArr = Theme.keys_avatar_nameInMessage;
                themedColor = filterCreateActivity.getThemedColor(iArr[i % iArr.length]);
            }
            this.currentColor = themedColor;
            if (!z2) {
                this.previewView.setEmojiColor(themedColor);
            }
            if (!z) {
                this.animatedColor.set(this.currentColor, true);
            }
            if (z2 != this.noTagShown) {
                this.noTagShown = z2;
                ViewPropertyAnimator duration = this.noTag.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(320L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                duration.setInterpolator(cubicBezierInterpolator).start();
                this.previewView.animate().alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            }
        }

        public void setPreviewText(CharSequence charSequence, boolean z) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z2 = false;
            if (charSequence.length() > 12) {
                charSequence = charSequence.subSequence(0, 12);
            }
            AnimatedTextView animatedTextView = this.previewView;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, animatedTextView.getPaint().getFontMetricsInt(), false);
            if (z && !LocaleController.isRTL) {
                z2 = true;
            }
            animatedTextView.setText(charSequenceReplaceEmoji, z2);
        }

        public TextPaint getPreviewTextPaint() {
            return this.previewView.getPaint();
        }
    }

    private class HeaderCellWithRight extends HeaderCell {
        private final AnimatedTextView rightTextView;

        public HeaderCellWithRight(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, true) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    setPivotX(getMeasuredWidth());
                }
            };
            this.rightTextView = animatedTextView;
            animatedTextView.setGravity(LocaleController.isRTL ? 3 : 5);
            animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
            animatedTextView.setTextSize(AndroidUtilities.dpf2(15.0f));
            addView(animatedTextView, LayoutHelper.createFrame(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
            ScaleStateListAnimator.apply(animatedTextView, 0.04f, 1.2f);
        }
    }
}
