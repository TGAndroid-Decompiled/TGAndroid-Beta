package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.ContactsAdapter;
import org.telegram.ui.Adapters.SearchAdapter;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LetterSectionCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.ContactsActivity;

public class ContactsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private boolean allowBots;
    private boolean allowSelf;
    private boolean allowUsernameSearch;
    private int animationIndex;
    private boolean askAboutContacts;
    private BackDrawable backDrawable;
    private AnimatorSet bounceIconAnimator;
    private long channelId;
    private long chatId;
    private boolean checkPermission;
    private boolean createSecretChat;
    private boolean creatingChat;
    private ContactsActivityDelegate delegate;
    private ActionBarMenuItem deleteItem;
    private boolean destroyAfterSelect;
    private boolean disableSections;
    private StickerEmptyView emptyView;
    private RLottieImageView floatingButton;
    private FrameLayout floatingButtonContainer;
    private boolean floatingHidden;
    private AccelerateDecelerateInterpolator floatingInterpolator;
    private boolean hasGps;
    private LongSparseArray<TLRPC$User> ignoreUsers;
    private String initialSearchString;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ContactsAdapter listViewAdapter;
    private boolean needFinishFragment;
    private boolean needForwardCount;
    private boolean needPhonebook;
    private boolean onlyUsers;
    private AlertDialog permissionDialog;
    private long permissionRequestTime;
    private int prevPosition;
    private int prevTop;
    private boolean resetDelegate;
    private boolean returnAsResult;
    boolean scheduled;
    private boolean scrollUpdated;
    private SearchAdapter searchListViewAdapter;
    private String searchQuery;
    private boolean searchWas;
    private boolean searching;
    private String selectAlertString;
    private LongSparseArray<TLRPC$User> selectedContacts;
    private NumberTextView selectedContactsCountTextView;
    private boolean sortByName;
    Runnable sortContactsRunnable;
    private ActionBarMenuItem sortItem;

    public interface ContactsActivityDelegate {
        void didSelectContact(TLRPC$User tLRPC$User, String str, ContactsActivity contactsActivity);
    }

    public static boolean lambda$createView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        this.floatingInterpolator = new AccelerateDecelerateInterpolator();
        this.allowSelf = true;
        this.allowBots = true;
        this.needForwardCount = true;
        this.needFinishFragment = true;
        this.resetDelegate = true;
        this.selectAlertString = null;
        this.allowUsernameSearch = true;
        this.askAboutContacts = true;
        this.selectedContacts = new LongSparseArray<>();
        this.checkPermission = true;
        this.animationIndex = -1;
        this.sortContactsRunnable = new Runnable() {
            @Override
            public void run() {
                ContactsActivity.this.listViewAdapter.sortOnlineContacts();
                ContactsActivity.this.scheduled = false;
            }
        };
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        this.checkPermission = UserConfig.getInstance(this.currentAccount).syncContacts;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.onlyUsers = bundle.getBoolean("onlyUsers", false);
            this.destroyAfterSelect = this.arguments.getBoolean("destroyAfterSelect", false);
            this.returnAsResult = this.arguments.getBoolean("returnAsResult", false);
            this.createSecretChat = this.arguments.getBoolean("createSecretChat", false);
            this.selectAlertString = this.arguments.getString("selectAlertString");
            this.allowUsernameSearch = this.arguments.getBoolean("allowUsernameSearch", true);
            this.needForwardCount = this.arguments.getBoolean("needForwardCount", true);
            this.allowBots = this.arguments.getBoolean("allowBots", true);
            this.allowSelf = this.arguments.getBoolean("allowSelf", true);
            this.channelId = this.arguments.getLong("channelId", 0L);
            this.needFinishFragment = this.arguments.getBoolean("needFinishFragment", true);
            this.chatId = this.arguments.getLong("chat_id", 0L);
            this.disableSections = this.arguments.getBoolean("disableSections", false);
            this.resetDelegate = this.arguments.getBoolean("resetDelegate", false);
        } else {
            this.needPhonebook = true;
        }
        if (!this.createSecretChat && !this.returnAsResult) {
            this.sortByName = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        MessagesController.getInstance(this.currentAccount).getStoriesController().loadHiddenStories();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.delegate = null;
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        getNotificationCenter().onAnimationFinish(this.animationIndex);
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public View createView(Context context) {
        final int i;
        Property property;
        this.searching = false;
        this.searchWas = false;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.destroyAfterSelect) {
            if (this.returnAsResult) {
                this.actionBar.setTitle(LocaleController.getString("SelectContact", R.string.SelectContact));
            } else if (this.createSecretChat) {
                this.actionBar.setTitle(LocaleController.getString("NewSecretChat", R.string.NewSecretChat));
            } else {
                this.actionBar.setTitle(LocaleController.getString("NewMessageTitle", R.string.NewMessageTitle));
            }
        } else {
            this.actionBar.setTitle(LocaleController.getString("Contacts", R.string.Contacts));
        }
        ActionBar actionBar = this.actionBar;
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        actionBar.setBackButtonDrawable(backDrawable);
        ActionBarMenu createActionMode = this.actionBar.createActionMode(false, null);
        createActionMode.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        createActionMode.drawBlur = false;
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedContactsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedContactsCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedContactsCountTextView.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon));
        createActionMode.addView(this.selectedContactsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedContactsCountTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$createView$0;
                lambda$createView$0 = ContactsActivity.lambda$createView$0(view, motionEvent);
                return lambda$createView$0;
            }
        });
        this.deleteItem = createActionMode.addItemWithWidth(100, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString("Delete", R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (((BaseFragment) ContactsActivity.this).actionBar.isActionModeShowed()) {
                        ContactsActivity.this.hideActionMode();
                        return;
                    } else {
                        ContactsActivity.this.lambda$onBackPressed$308();
                        return;
                    }
                }
                if (i2 == 100) {
                    ContactsActivity.this.performSelectedContactsDelete();
                    return;
                }
                if (i2 == 1) {
                    SharedConfig.toggleSortContactsByName();
                    ContactsActivity.this.sortByName = SharedConfig.sortContactsByName;
                    ContactsActivity.this.listViewAdapter.setSortType(ContactsActivity.this.sortByName ? 1 : 2, false);
                    ContactsActivity.this.sortItem.setIcon(ContactsActivity.this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                }
            }
        });
        ActionBarMenu createMenu = this.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                ContactsActivity.this.searching = true;
                if (ContactsActivity.this.floatingButtonContainer != null) {
                    ContactsActivity.this.floatingButtonContainer.setVisibility(8);
                }
                if (ContactsActivity.this.sortItem != null) {
                    ContactsActivity.this.sortItem.setVisibility(8);
                }
            }

            @Override
            public void onSearchCollapse() {
                ContactsActivity.this.searchListViewAdapter.searchDialogs(null);
                ContactsActivity.this.searching = false;
                ContactsActivity.this.searchWas = false;
                ContactsActivity.this.listView.setAdapter(ContactsActivity.this.listViewAdapter);
                ContactsActivity.this.listView.setSectionsType(1);
                ContactsActivity.this.listViewAdapter.notifyDataSetChanged();
                ContactsActivity.this.listView.setFastScrollVisible(true);
                ContactsActivity.this.listView.setVerticalScrollBarEnabled(false);
                ContactsActivity.this.listView.getFastScroll().topOffset = AndroidUtilities.dp(90.0f);
                if (ContactsActivity.this.floatingButtonContainer != null) {
                    ContactsActivity.this.floatingButtonContainer.setVisibility(0);
                    ContactsActivity.this.floatingHidden = true;
                    ContactsActivity.this.floatingButtonContainer.setTranslationY(AndroidUtilities.dp(100.0f));
                    ContactsActivity.this.hideFloatingButton(false);
                }
                if (ContactsActivity.this.sortItem != null) {
                    ContactsActivity.this.sortItem.setVisibility(0);
                }
            }

            @Override
            public void onTextChanged(EditText editText) {
                if (ContactsActivity.this.searchListViewAdapter == null) {
                    return;
                }
                String obj = editText.getText().toString();
                ContactsActivity.this.searchQuery = obj;
                if (obj.length() != 0) {
                    ContactsActivity.this.searchWas = true;
                    if (ContactsActivity.this.listView != null) {
                        ContactsActivity.this.listView.setAdapter(ContactsActivity.this.searchListViewAdapter);
                        ContactsActivity.this.listView.setSectionsType(0);
                        ContactsActivity.this.searchListViewAdapter.notifyDataSetChanged();
                        ContactsActivity.this.listView.setFastScrollVisible(false);
                        ContactsActivity.this.listView.setVerticalScrollBarEnabled(true);
                    }
                    ContactsActivity.this.emptyView.showProgress(true, true);
                    ContactsActivity.this.searchListViewAdapter.searchDialogs(obj);
                    return;
                }
                if (ContactsActivity.this.listView != null) {
                    ContactsActivity.this.listView.setAdapter(ContactsActivity.this.listViewAdapter);
                    ContactsActivity.this.listView.setSectionsType(1);
                }
            }
        });
        int i2 = R.string.Search;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString("Search", i2));
        actionBarMenuItemSearchListener.setContentDescription(LocaleController.getString("Search", i2));
        if (!this.createSecretChat && !this.returnAsResult) {
            ActionBarMenuItem addItem = createMenu.addItem(1, this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.sortItem = addItem;
            addItem.setContentDescription(LocaleController.getString("AccDescrContactSorting", R.string.AccDescrContactSorting));
        }
        this.searchListViewAdapter = new SearchAdapter(context, this.ignoreUsers, this.selectedContacts, this.allowUsernameSearch, false, false, this.allowBots, this.allowSelf, true, 0) {
            @Override
            protected void onSearchProgressChanged() {
                if (!searchInProgress() && getItemCount() == 0) {
                    ContactsActivity.this.emptyView.showProgress(false, true);
                }
                ContactsActivity.this.showItemsAnimated();
            }
        };
        if (this.chatId != 0) {
            i = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.chatId)), 3) ? 1 : 0;
        } else {
            if (this.channelId != 0) {
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.channelId));
                if (ChatObject.canUserDoAdminAction(chat, 3) && !ChatObject.isPublic(chat)) {
                    i = 2;
                }
            }
            i = 0;
        }
        try {
            this.hasGps = ApplicationLoader.applicationContext.getPackageManager().hasSystemFeature("android.hardware.location.gps");
        } catch (Throwable unused) {
            this.hasGps = false;
        }
        ContactsAdapter contactsAdapter = new ContactsAdapter(context, this, this.onlyUsers ? 1 : 0, this.needPhonebook, this.ignoreUsers, this.selectedContacts, i, this.hasGps) {
            @Override
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                if (ContactsActivity.this.listView == null || ContactsActivity.this.listView.getAdapter() != this) {
                    return;
                }
                int itemCount = super.getItemCount();
                if (ContactsActivity.this.needPhonebook) {
                    ContactsActivity.this.listView.setFastScrollVisible(itemCount != 2);
                } else {
                    ContactsActivity.this.listView.setFastScrollVisible(itemCount != 0);
                }
            }
        };
        this.listViewAdapter = contactsAdapter;
        contactsAdapter.setSortType(this.sortItem != null ? this.sortByName ? 1 : 2 : 0, false);
        this.listViewAdapter.setDisableSections(this.disableSections);
        FrameLayout frameLayout = new FrameLayout(context) {
            Paint actionBarPaint = new Paint();

            @Override
            protected void dispatchDraw(Canvas canvas) {
                this.actionBarPaint.setColor(Theme.getColor(Theme.key_actionBarDefault));
                float measuredHeight = ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight();
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight(), this.actionBarPaint);
                ((BaseFragment) ContactsActivity.this).parentLayout.drawHeaderShadow(canvas, (int) measuredHeight);
                super.dispatchDraw(canvas);
            }

            @Override
            protected void onMeasure(int i3, int i4) {
                measureChildWithMargins(((BaseFragment) ContactsActivity.this).actionBar, i3, 0, i4, 0);
                ((ViewGroup.MarginLayoutParams) ContactsActivity.this.emptyView.getLayoutParams()).topMargin = ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) ContactsActivity.this.listView.getLayoutParams()).topMargin = ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight();
                super.onMeasure(i3, i4);
            }

            @Override
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                if (ContactsActivity.this.listView.getAdapter() == ContactsActivity.this.listViewAdapter) {
                    if (ContactsActivity.this.emptyView.getVisibility() == 0) {
                        ContactsActivity.this.emptyView.setTranslationY(AndroidUtilities.dp(74.0f));
                        return;
                    }
                    return;
                }
                ContactsActivity.this.emptyView.setTranslationY(AndroidUtilities.dp(0.0f));
            }
        };
        this.fragmentView = frameLayout;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        flickerLoadingView.setViewType(6);
        flickerLoadingView.showDate(false);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.showProgress(true, false);
        this.emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
        this.emptyView.subtitle.setText(LocaleController.getString("SearchEmptyViewFilteredSubtitle2", R.string.SearchEmptyViewFilteredSubtitle2));
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView = new RecyclerListView(context) {
            @Override
            public void setPadding(int i3, int i4, int i5, int i6) {
                super.setPadding(i3, i4, i5, i6);
                if (ContactsActivity.this.emptyView != null) {
                    ContactsActivity.this.emptyView.setPadding(i3, i4, i5, i6);
                }
            }
        };
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setDurations(150L);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setSectionsType(1);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setFastScrollEnabled(0);
        RecyclerListView recyclerListView = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        this.listView.setAdapter(this.listViewAdapter);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAnimateEmptyView(true, 0);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i3) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i3);
            }

            @Override
            public void onDoubleTap(View view, int i3, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i3, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i3, float f, float f2) {
                ContactsActivity.this.lambda$createView$2(i, view, i3, f, f2);
            }
        });
        this.listView.setOnItemLongClickListener(new AnonymousClass7());
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            private boolean scrollingManually;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                if (i3 == 1) {
                    if (ContactsActivity.this.searching && ContactsActivity.this.searchWas) {
                        AndroidUtilities.hideKeyboard(ContactsActivity.this.getParentActivity().getCurrentFocus());
                    }
                    this.scrollingManually = true;
                    return;
                }
                this.scrollingManually = false;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                boolean z;
                super.onScrolled(recyclerView, i3, i4);
                if (ContactsActivity.this.floatingButtonContainer == null || ContactsActivity.this.floatingButtonContainer.getVisibility() == 8) {
                    return;
                }
                int findFirstVisibleItemPosition = ContactsActivity.this.layoutManager.findFirstVisibleItemPosition();
                boolean z2 = false;
                View childAt = recyclerView.getChildAt(0);
                int top = childAt != null ? childAt.getTop() : 0;
                if (ContactsActivity.this.prevPosition == findFirstVisibleItemPosition) {
                    int i5 = ContactsActivity.this.prevTop - top;
                    z = top < ContactsActivity.this.prevTop;
                    if (Math.abs(i5) > 1) {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                    z = findFirstVisibleItemPosition > ContactsActivity.this.prevPosition;
                }
                if (z2 && ContactsActivity.this.scrollUpdated && (z || this.scrollingManually)) {
                    ContactsActivity.this.hideFloatingButton(z);
                }
                ContactsActivity.this.prevPosition = findFirstVisibleItemPosition;
                ContactsActivity.this.prevTop = top;
                ContactsActivity.this.scrollUpdated = true;
            }
        });
        if (!this.createSecretChat && !this.returnAsResult) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.floatingButtonContainer = frameLayout2;
            int i3 = Build.VERSION.SDK_INT;
            int i4 = (i3 >= 21 ? 56 : 60) + 20;
            float f = (i3 >= 21 ? 56 : 60) + 20;
            boolean z = LocaleController.isRTL;
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(i4, f, (z ? 3 : 5) | 80, z ? 4.0f : 0.0f, 0.0f, z ? 0.0f : 4.0f, 0.0f));
            this.floatingButtonContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ContactsActivity.this.lambda$createView$3(view);
                }
            });
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.floatingButton = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(Theme.key_chats_actionBackground), Theme.getColor(Theme.key_chats_actionPressedBackground));
            if (i3 < 21) {
                Drawable mutate = context.getResources().getDrawable(R.drawable.floating_shadow).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
                combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                createSimpleSelectorCircleDrawable = combinedDrawable;
            }
            this.floatingButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable);
            this.floatingButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_actionIcon), PorterDuff.Mode.MULTIPLY));
            boolean z2 = MessagesController.getGlobalMainSettings().getBoolean("view_animations", true);
            if (getMessagesController().storiesEnabled()) {
                this.floatingButton.setAnimation(z2 ? R.raw.write_contacts_fab_icon_camera : R.raw.write_contacts_fab_icon_reverse_camera, 56, 56);
            } else {
                this.floatingButton.setAnimation(z2 ? R.raw.write_contacts_fab_icon : R.raw.write_contacts_fab_icon_reverse, 52, 52);
            }
            this.floatingButtonContainer.setContentDescription(LocaleController.getString("CreateNewContact", R.string.CreateNewContact));
            if (i3 >= 21) {
                StateListAnimator stateListAnimator = new StateListAnimator();
                RLottieImageView rLottieImageView2 = this.floatingButton;
                property = View.TRANSLATION_Z;
                stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(rLottieImageView2, (Property<RLottieImageView, Float>) property, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f)).setDuration(200L));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButton, (Property<RLottieImageView, Float>) property, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f)).setDuration(200L));
                this.floatingButton.setStateListAnimator(stateListAnimator);
                this.floatingButton.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    @SuppressLint({"NewApi"})
                    public void getOutline(View view, Outline outline) {
                        outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    }
                });
            }
            this.floatingButtonContainer.addView(this.floatingButton, LayoutHelper.createFrame(i3 >= 21 ? 56 : 60, i3 >= 21 ? 56 : 60, 51, 10.0f, 6.0f, 10.0f, 0.0f));
        }
        String str = this.initialSearchString;
        if (str != null) {
            this.actionBar.openSearchField(str, false);
            this.initialSearchString = null;
        }
        ((FrameLayout) this.fragmentView).addView(this.actionBar);
        this.listViewAdapter.setStories(getMessagesController().storiesController.getHiddenList(), false);
        return this.fragmentView;
    }

    public void lambda$createView$2(int r7, android.view.View r8, int r9, float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContactsActivity.lambda$createView$2(int, android.view.View, int, float, float):void");
    }

    public void lambda$createView$1(String str, DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(this.currentAccount).getInviteText(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public class AnonymousClass7 implements RecyclerListView.OnItemLongClickListener {
        AnonymousClass7() {
        }

        @Override
        public boolean onItemClick(View view, int i) {
            if (ContactsActivity.this.listView.getAdapter() == ContactsActivity.this.listViewAdapter) {
                int sectionForPosition = ContactsActivity.this.listViewAdapter.getSectionForPosition(i);
                int positionInSectionForPosition = ContactsActivity.this.listViewAdapter.getPositionInSectionForPosition(i);
                if (Bulletin.getVisibleBulletin() != null) {
                    Bulletin.getVisibleBulletin().hide();
                }
                if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
                    return false;
                }
                if (ContactsActivity.this.listViewAdapter.hasStories && sectionForPosition == 1 && (view instanceof UserCell)) {
                    final long dialogId = ((UserCell) view).getDialogId();
                    final TLRPC$User user = MessagesController.getInstance(((BaseFragment) ContactsActivity.this).currentAccount).getUser(Long.valueOf(dialogId));
                    final String sharedPrefKey = NotificationsController.getSharedPrefKey(dialogId, 0L);
                    boolean areStoriesNotMuted = NotificationsCustomSettingsActivity.areStoriesNotMuted(((BaseFragment) ContactsActivity.this).currentAccount, dialogId);
                    ItemOptions addIf = ItemOptions.makeOptions(ContactsActivity.this, view).setScrimViewBackground(Theme.createRoundRectDrawable(0, 0, Theme.getColor(Theme.key_windowBackgroundWhite))).add(R.drawable.msg_discussion, LocaleController.getString("SendMessage", R.string.SendMessage), new Runnable() {
                        @Override
                        public final void run() {
                            ContactsActivity.AnonymousClass7.this.lambda$onItemClick$0(dialogId);
                        }
                    }).add(R.drawable.msg_openprofile, LocaleController.getString("OpenProfile", R.string.OpenProfile), new Runnable() {
                        @Override
                        public final void run() {
                            ContactsActivity.AnonymousClass7.this.lambda$onItemClick$1(dialogId);
                        }
                    }).addIf(areStoriesNotMuted, R.drawable.msg_mute, LocaleController.getString("NotificationsStoryMute", R.string.NotificationsStoryMute), new Runnable() {
                        @Override
                        public final void run() {
                            ContactsActivity.AnonymousClass7.this.lambda$onItemClick$2(sharedPrefKey, dialogId, user);
                        }
                    }).addIf(!areStoriesNotMuted, R.drawable.msg_unmute, LocaleController.getString("NotificationsStoryUnmute", R.string.NotificationsStoryUnmute), new Runnable() {
                        @Override
                        public final void run() {
                            ContactsActivity.AnonymousClass7.this.lambda$onItemClick$3(sharedPrefKey, dialogId, user);
                        }
                    });
                    addIf.add(R.drawable.msg_viewintopic, LocaleController.getString("ShowInChats", R.string.ShowInChats), new Runnable() {
                        @Override
                        public final void run() {
                            ContactsActivity.AnonymousClass7.this.lambda$onItemClick$6(dialogId, user);
                        }
                    });
                    addIf.setGravity(5).show();
                    return true;
                }
            }
            if (ContactsActivity.this.returnAsResult || ContactsActivity.this.createSecretChat || !(view instanceof UserCell)) {
                if (ContactsActivity.this.returnAsResult || ContactsActivity.this.createSecretChat || !(view instanceof ProfileSearchCell)) {
                    return false;
                }
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                if (profileSearchCell.getUser() == null || !profileSearchCell.getUser().contact) {
                    return true;
                }
                ContactsActivity.this.showOrUpdateActionMode(profileSearchCell);
                return true;
            }
            ContactsActivity.this.showOrUpdateActionMode((UserCell) view);
            return true;
        }

        public void lambda$onItemClick$0(long j) {
            ContactsActivity.this.presentFragment(ChatActivity.of(j));
        }

        public void lambda$onItemClick$1(long j) {
            ContactsActivity.this.presentFragment(ProfileActivity.of(j));
        }

        public void lambda$onItemClick$2(String str, long j, TLRPC$User tLRPC$User) {
            MessagesController.getNotificationsSettings(((BaseFragment) ContactsActivity.this).currentAccount).edit().putBoolean("stories_" + str, false).apply();
            ContactsActivity.this.getNotificationsController().updateServerNotificationsSettings(j, 0L);
            String trim = tLRPC$User == null ? "" : tLRPC$User.first_name.trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            BulletinFactory.of(ContactsActivity.this).createUsersBulletin(Arrays.asList(tLRPC$User), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, trim))).show();
        }

        public void lambda$onItemClick$3(String str, long j, TLRPC$User tLRPC$User) {
            MessagesController.getNotificationsSettings(((BaseFragment) ContactsActivity.this).currentAccount).edit().putBoolean("stories_" + str, true).apply();
            ContactsActivity.this.getNotificationsController().updateServerNotificationsSettings(j, 0L);
            String trim = tLRPC$User == null ? "" : tLRPC$User.first_name.trim();
            int indexOf = trim.indexOf(" ");
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            BulletinFactory.of(ContactsActivity.this).createUsersBulletin(Arrays.asList(tLRPC$User), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, trim))).show();
        }

        public void lambda$onItemClick$6(final long j, TLRPC$User tLRPC$User) {
            ContactsActivity.this.getMessagesController().getStoriesController().toggleHidden(j, false, false, true);
            BulletinFactory.UndoObject undoObject = new BulletinFactory.UndoObject();
            undoObject.onUndo = new Runnable() {
                @Override
                public final void run() {
                    ContactsActivity.AnonymousClass7.this.lambda$onItemClick$4(j);
                }
            };
            undoObject.onAction = new Runnable() {
                @Override
                public final void run() {
                    ContactsActivity.AnonymousClass7.this.lambda$onItemClick$5(j);
                }
            };
            BulletinFactory.global().createUsersBulletin(Arrays.asList(tLRPC$User), AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, ContactsController.formatName(tLRPC$User.first_name, null, 20))), null, undoObject).show();
        }

        public void lambda$onItemClick$4(long j) {
            ContactsActivity.this.getMessagesController().getStoriesController().toggleHidden(j, true, false, true);
        }

        public void lambda$onItemClick$5(long j) {
            ContactsActivity.this.getMessagesController().getStoriesController().toggleHidden(j, false, true, true);
        }
    }

    public void lambda$createView$3(View view) {
        AndroidUtilities.requestAdjustNothing(getParentActivity(), getClassGuid());
        new NewContactBottomSheet(this, getContext()) {
            @Override
            public void dismissInternal() {
                super.dismissInternal();
                AndroidUtilities.requestAdjustResize(ContactsActivity.this.getParentActivity(), this.classGuid);
            }
        }.show();
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar createActionBar = super.createActionBar(context);
        createActionBar.setBackground(null);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    public boolean addOrRemoveSelectedContact(UserCell userCell) {
        long dialogId = userCell.getDialogId();
        if (this.selectedContacts.indexOfKey(dialogId) >= 0) {
            this.selectedContacts.remove(dialogId);
            userCell.setChecked(false, true);
            return false;
        }
        if (!(userCell.getCurrentObject() instanceof TLRPC$User)) {
            return false;
        }
        this.selectedContacts.put(dialogId, (TLRPC$User) userCell.getCurrentObject());
        userCell.setChecked(true, true);
        return true;
    }

    public boolean addOrRemoveSelectedContact(ProfileSearchCell profileSearchCell) {
        long dialogId = profileSearchCell.getDialogId();
        if (this.selectedContacts.indexOfKey(dialogId) >= 0) {
            this.selectedContacts.remove(dialogId);
            profileSearchCell.setChecked(false, true);
            return false;
        }
        if (profileSearchCell.getUser() == null) {
            return false;
        }
        this.selectedContacts.put(dialogId, profileSearchCell.getUser());
        profileSearchCell.setChecked(true, true);
        return true;
    }

    public void showOrUpdateActionMode(Object obj) {
        boolean addOrRemoveSelectedContact;
        if (obj instanceof UserCell) {
            addOrRemoveSelectedContact = addOrRemoveSelectedContact((UserCell) obj);
        } else if (!(obj instanceof ProfileSearchCell)) {
            return;
        } else {
            addOrRemoveSelectedContact = addOrRemoveSelectedContact((ProfileSearchCell) obj);
        }
        boolean z = true;
        if (!this.actionBar.isActionModeShowed()) {
            if (addOrRemoveSelectedContact) {
                AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
                this.actionBar.showActionMode();
                this.backDrawable.setRotation(1.0f, true);
            }
            z = false;
        } else if (this.selectedContacts.isEmpty()) {
            hideActionMode();
            return;
        }
        this.selectedContactsCountTextView.setNumber(this.selectedContacts.size(), z);
    }

    public void hideActionMode() {
        this.actionBar.hideActionMode();
        int childCount = this.listView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof UserCell) {
                UserCell userCell = (UserCell) childAt;
                if (this.selectedContacts.indexOfKey(userCell.getDialogId()) >= 0) {
                    userCell.setChecked(false, true);
                }
            } else if (childAt instanceof ProfileSearchCell) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) childAt;
                if (this.selectedContacts.indexOfKey(profileSearchCell.getDialogId()) >= 0) {
                    profileSearchCell.setChecked(false, true);
                }
            }
        }
        this.selectedContacts.clear();
        this.backDrawable.setRotation(0.0f, true);
    }

    public void performSelectedContactsDelete() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), getResourceProvider());
        if (this.selectedContacts.size() == 1) {
            builder.setTitle(LocaleController.getString("DeleteContactTitle", R.string.DeleteContactTitle));
            builder.setMessage(LocaleController.getString("DeleteContactSubtitle", R.string.DeleteContactSubtitle));
        } else {
            builder.setTitle(LocaleController.formatPluralString("DeleteContactsTitle", this.selectedContacts.size(), new Object[0]));
            builder.setMessage(LocaleController.getString("DeleteContactsSubtitle", R.string.DeleteContactsSubtitle));
        }
        builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ContactsActivity.this.lambda$performSelectedContactsDelete$4(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog create = builder.create();
        create.show();
        create.redPositive();
    }

    public void lambda$performSelectedContactsDelete$4(DialogInterface dialogInterface, int i) {
        ArrayList<TLRPC$User> arrayList = new ArrayList<>(this.selectedContacts.size());
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            arrayList.add(this.selectedContacts.get(this.selectedContacts.keyAt(i2)));
        }
        getContactsController().deleteContactsUndoable(getContext(), this, arrayList);
        hideActionMode();
    }

    private void didSelectResult(final TLRPC$User tLRPC$User, boolean z, final String str) {
        final EditTextBoldCursor editTextBoldCursor;
        if (z && this.selectAlertString != null) {
            if (getParentActivity() == null) {
                return;
            }
            if (tLRPC$User.bot) {
                if (tLRPC$User.bot_nochats) {
                    try {
                        BulletinFactory.of(this).createErrorBulletin(LocaleController.getString("BotCantJoinGroups", R.string.BotCantJoinGroups)).show();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                if (this.channelId != 0) {
                    TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.channelId));
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    if (ChatObject.canAddAdmins(chat)) {
                        builder.setTitle(LocaleController.getString("AddBotAdminAlert", R.string.AddBotAdminAlert));
                        builder.setMessage(LocaleController.getString("AddBotAsAdmin", R.string.AddBotAsAdmin));
                        builder.setPositiveButton(LocaleController.getString("AddAsAdmin", R.string.AddAsAdmin), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ContactsActivity.this.lambda$didSelectResult$6(tLRPC$User, str, dialogInterface, i);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    } else {
                        builder.setMessage(LocaleController.getString("CantAddBotAsAdmin", R.string.CantAddBotAsAdmin));
                        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
                    }
                    showDialog(builder.create());
                    return;
                }
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
            builder2.setTitle(LocaleController.getString("AppName", R.string.AppName));
            String formatStringSimple = LocaleController.formatStringSimple(this.selectAlertString, UserObject.getUserName(tLRPC$User));
            if (tLRPC$User.bot || !this.needForwardCount) {
                editTextBoldCursor = null;
            } else {
                formatStringSimple = String.format("%s\n\n%s", formatStringSimple, LocaleController.getString("AddToTheGroupForwardCount", R.string.AddToTheGroupForwardCount));
                editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setText("50");
                editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                editTextBoldCursor.setGravity(17);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setBackgroundDrawable(Theme.createEditTextDrawable(getParentActivity(), true));
                editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        try {
                            String obj = editable.toString();
                            if (obj.length() != 0) {
                                int intValue = Utilities.parseInt((CharSequence) obj).intValue();
                                if (intValue < 0) {
                                    editTextBoldCursor.setText("0");
                                    EditText editText = editTextBoldCursor;
                                    editText.setSelection(editText.length());
                                } else if (intValue > 300) {
                                    editTextBoldCursor.setText("300");
                                    EditText editText2 = editTextBoldCursor;
                                    editText2.setSelection(editText2.length());
                                } else {
                                    if (!obj.equals("" + intValue)) {
                                        editTextBoldCursor.setText("" + intValue);
                                        EditText editText3 = editTextBoldCursor;
                                        editText3.setSelection(editText3.length());
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                    }
                });
                builder2.setView(editTextBoldCursor);
            }
            builder2.setMessage(formatStringSimple);
            builder2.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ContactsActivity.this.lambda$didSelectResult$7(tLRPC$User, editTextBoldCursor, dialogInterface, i);
                }
            });
            builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showDialog(builder2.create());
            if (editTextBoldCursor != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                if (marginLayoutParams != null) {
                    if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                    }
                    int dp = AndroidUtilities.dp(24.0f);
                    marginLayoutParams.leftMargin = dp;
                    marginLayoutParams.rightMargin = dp;
                    marginLayoutParams.height = AndroidUtilities.dp(36.0f);
                    editTextBoldCursor.setLayoutParams(marginLayoutParams);
                }
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                return;
            }
            return;
        }
        ContactsActivityDelegate contactsActivityDelegate = this.delegate;
        if (contactsActivityDelegate != null) {
            contactsActivityDelegate.didSelectContact(tLRPC$User, str, this);
            if (this.resetDelegate) {
                this.delegate = null;
            }
        }
        if (this.needFinishFragment) {
            lambda$onBackPressed$308();
        }
    }

    public void lambda$didSelectResult$6(TLRPC$User tLRPC$User, String str, DialogInterface dialogInterface, int i) {
        ContactsActivityDelegate contactsActivityDelegate = this.delegate;
        if (contactsActivityDelegate != null) {
            contactsActivityDelegate.didSelectContact(tLRPC$User, str, this);
            this.delegate = null;
        }
    }

    public void lambda$didSelectResult$7(TLRPC$User tLRPC$User, EditText editText, DialogInterface dialogInterface, int i) {
        didSelectResult(tLRPC$User, false, editText != null ? editText.getText().toString() : "0");
    }

    @Override
    public boolean onBackPressed() {
        if (this.actionBar.isActionModeShowed()) {
            hideActionMode();
            return false;
        }
        return super.onBackPressed();
    }

    @Override
    public void onResume() {
        Activity parentActivity;
        int checkSelfPermission;
        boolean shouldShowRequestPermissionRationale;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        if (contactsAdapter != null) {
            contactsAdapter.notifyDataSetChanged();
        }
        if (!this.checkPermission || Build.VERSION.SDK_INT < 23 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.checkPermission = false;
        checkSelfPermission = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS");
        if (checkSelfPermission != 0) {
            shouldShowRequestPermissionRationale = parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS");
            if (shouldShowRequestPermissionRationale) {
                AlertDialog create = AlertsCreator.createContactsPermissionDialog(parentActivity, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i) {
                        ContactsActivity.this.lambda$onResume$8(i);
                    }
                }).create();
                this.permissionDialog = create;
                showDialog(create);
                return;
            }
            askForPermissons(true);
        }
    }

    public void lambda$onResume$8(int i) {
        this.askAboutContacts = i != 0;
        if (i == 0) {
            return;
        }
        askForPermissons(false);
    }

    public RecyclerListView getListView() {
        return this.listView;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FrameLayout frameLayout = this.floatingButtonContainer;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    ContactsActivity.this.floatingButtonContainer.setTranslationY(ContactsActivity.this.floatingHidden ? AndroidUtilities.dp(100.0f) : 0);
                    ContactsActivity.this.floatingButtonContainer.setClickable(!ContactsActivity.this.floatingHidden);
                    if (ContactsActivity.this.floatingButtonContainer != null) {
                        ContactsActivity.this.floatingButtonContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                }
            });
        }
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        AlertDialog alertDialog = this.permissionDialog;
        if (alertDialog == null || dialog != alertDialog || getParentActivity() == null || !this.askAboutContacts) {
            return;
        }
        askForPermissons(false);
    }

    @TargetApi(23)
    private void askForPermissons(boolean z) {
        int checkSelfPermission;
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts) {
            return;
        }
        checkSelfPermission = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS");
        if (checkSelfPermission == 0) {
            return;
        }
        if (z && this.askAboutContacts) {
            showDialog(AlertsCreator.createContactsPermissionDialog(parentActivity, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i) {
                    ContactsActivity.this.lambda$askForPermissons$9(i);
                }
            }).create());
            return;
        }
        this.permissionRequestTime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.add("android.permission.GET_ACCOUNTS");
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$askForPermissons$9(int i) {
        this.askAboutContacts = i != 0;
        if (i == 0) {
            return;
        }
        askForPermissons(false);
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 1) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr.length > i2 && "android.permission.READ_CONTACTS".equals(strArr[i2])) {
                    if (iArr[i2] == 0) {
                        ContactsController.getInstance(this.currentAccount).forceImportContacts();
                        return;
                    }
                    SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                    this.askAboutContacts = false;
                    edit.putBoolean("askAboutContacts", false).commit();
                    if (SystemClock.elapsedRealtime() - this.permissionRequestTime < 200) {
                        try {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", ApplicationLoader.applicationContext.getPackageName(), null));
                            getParentActivity().startActivity(intent);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.closeSearchField();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated) {
            ContactsAdapter contactsAdapter = this.listViewAdapter;
            if (contactsAdapter != null) {
                contactsAdapter.setStories(getMessagesController().getStoriesController().getHiddenList(), true);
            }
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadHiddenStories();
            return;
        }
        if (i == NotificationCenter.contactsDidLoad) {
            ContactsAdapter contactsAdapter2 = this.listViewAdapter;
            if (contactsAdapter2 != null) {
                if (!this.sortByName) {
                    contactsAdapter2.setSortType(2, true);
                }
                this.listViewAdapter.notifyDataSetChanged();
            }
            if (this.searchListViewAdapter != null) {
                RecyclerView.Adapter adapter = this.listView.getAdapter();
                SearchAdapter searchAdapter = this.searchListViewAdapter;
                if (adapter == searchAdapter) {
                    searchAdapter.searchDialogs(this.searchQuery);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                updateVisibleRows(intValue);
            }
            if ((intValue & MessagesController.UPDATE_MASK_STATUS) == 0 || this.sortByName || this.listViewAdapter == null) {
                return;
            }
            scheduleSort();
            return;
        }
        if (i == NotificationCenter.encryptedChatCreated) {
            if (this.createSecretChat && this.creatingChat) {
                TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", tLRPC$EncryptedChat.id);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                presentFragment(new ChatActivity(bundle), false);
                return;
            }
            return;
        }
        if (i != NotificationCenter.closeChats || this.creatingChat) {
            return;
        }
        removeSelfFromStack(true);
    }

    private void scheduleSort() {
        if (this.scheduled) {
            return;
        }
        this.scheduled = true;
        AndroidUtilities.cancelRunOnUIThread(this.sortContactsRunnable);
        AndroidUtilities.runOnUIThread(this.sortContactsRunnable, 5000L);
    }

    private void updateVisibleRows(int i) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.listView.getChildAt(i2);
                if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(i);
                }
            }
        }
    }

    public void hideFloatingButton(boolean z) {
        if (this.floatingHidden == z) {
            return;
        }
        this.floatingHidden = z;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.floatingButtonContainer, (Property<FrameLayout, Float>) View.TRANSLATION_Y, this.floatingHidden ? AndroidUtilities.dp(100.0f) : 0));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(this.floatingInterpolator);
        this.floatingButtonContainer.setClickable(!z);
        animatorSet.start();
    }

    public void setDelegate(ContactsActivityDelegate contactsActivityDelegate) {
        this.delegate = contactsActivityDelegate;
    }

    public void setInitialSearchString(String str) {
        this.initialSearchString = str;
    }

    public void showItemsAnimated() {
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        final int findLastVisibleItemPosition = linearLayoutManager == null ? 0 : linearLayoutManager.findLastVisibleItemPosition();
        this.listView.invalidate();
        this.listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                ContactsActivity.this.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = ContactsActivity.this.listView.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i = 0; i < childCount; i++) {
                    View childAt = ContactsActivity.this.listView.getChildAt(i);
                    if (ContactsActivity.this.listView.getChildAdapterPosition(childAt) > findLastVisibleItemPosition) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(ContactsActivity.this.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / ContactsActivity.this.listView.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return true;
            }
        });
    }

    @Override
    public AnimatorSet onCustomTransitionAnimation(final boolean z, final Runnable runnable) {
        final ValueAnimator ofFloat = z ? ValueAnimator.ofFloat(1.0f, 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
        final ViewGroup viewGroup = (ViewGroup) this.fragmentView.getParent();
        BaseFragment baseFragment = this.parentLayout.getFragmentStack().size() > 1 ? this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) : null;
        DialogsActivity dialogsActivity = baseFragment instanceof DialogsActivity ? (DialogsActivity) baseFragment : null;
        if (dialogsActivity == null) {
            return null;
        }
        final boolean z2 = dialogsActivity.storiesEnabled;
        final RLottieImageView floatingButton = dialogsActivity.getFloatingButton();
        View view = floatingButton.getParent() != null ? (View) floatingButton.getParent() : null;
        if (this.floatingButton != null && (this.floatingButtonContainer == null || view == null || floatingButton.getVisibility() != 0 || Math.abs(view.getTranslationY()) > AndroidUtilities.dp(4.0f) || Math.abs(this.floatingButtonContainer.getTranslationY()) > AndroidUtilities.dp(4.0f))) {
            if (z2) {
                this.floatingButton.setAnimation(R.raw.write_contacts_fab_icon_camera, 56, 56);
            } else {
                this.floatingButton.setAnimation(R.raw.write_contacts_fab_icon, 52, 52);
            }
            this.floatingButton.getAnimatedDrawable().setCurrentFrame(this.floatingButton.getAnimatedDrawable().getFramesCount() - 1);
            return null;
        }
        view.setVisibility(8);
        if (z) {
            viewGroup.setAlpha(0.0f);
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ContactsActivity.lambda$onCustomTransitionAnimation$10(ofFloat, viewGroup, valueAnimator);
            }
        });
        FrameLayout frameLayout = this.floatingButtonContainer;
        if (frameLayout != null) {
            ((ViewGroup) this.fragmentView).removeView(frameLayout);
            this.parentLayout.getOverlayContainerView().addView(this.floatingButtonContainer);
        }
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        final AnimatorSet animatorSet = new AnimatorSet();
        final View view2 = view;
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ContactsActivity.this.floatingButtonContainer != null) {
                    if (ContactsActivity.this.floatingButtonContainer.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ContactsActivity.this.floatingButtonContainer.getParent()).removeView(ContactsActivity.this.floatingButtonContainer);
                    }
                    ContactsActivity contactsActivity = ContactsActivity.this;
                    ((ViewGroup) contactsActivity.fragmentView).addView(contactsActivity.floatingButtonContainer);
                    view2.setVisibility(0);
                    if (!z) {
                        if (z2) {
                            floatingButton.setAnimation(R.raw.write_contacts_fab_icon_reverse_camera, 56, 56);
                        } else {
                            floatingButton.setAnimation(R.raw.write_contacts_fab_icon_reverse, 52, 52);
                        }
                        floatingButton.getAnimatedDrawable().setCurrentFrame(ContactsActivity.this.floatingButton.getAnimatedDrawable().getCurrentFrame());
                        floatingButton.playAnimation();
                    }
                }
                runnable.run();
            }
        });
        animatorSet.playTogether(ofFloat);
        final View view3 = view;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ContactsActivity.this.lambda$onCustomTransitionAnimation$11(animatorSet, z2, z, view3);
            }
        }, 50L);
        return animatorSet;
    }

    public static void lambda$onCustomTransitionAnimation$10(ValueAnimator valueAnimator, ViewGroup viewGroup, ValueAnimator valueAnimator2) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        viewGroup.setTranslationX(AndroidUtilities.dp(48.0f) * floatValue);
        viewGroup.setAlpha(1.0f - floatValue);
    }

    public void lambda$onCustomTransitionAnimation$11(AnimatorSet animatorSet, boolean z, boolean z2, final View view) {
        if (this.floatingButton == null) {
            return;
        }
        this.animationIndex = getNotificationCenter().setAnimationInProgress(this.animationIndex, new int[]{NotificationCenter.diceStickersDidLoad}, false);
        animatorSet.start();
        if (z) {
            this.floatingButton.setAnimation(z2 ? R.raw.write_contacts_fab_icon_camera : R.raw.write_contacts_fab_icon_reverse_camera, 56, 56);
        } else {
            this.floatingButton.setAnimation(z2 ? R.raw.write_contacts_fab_icon : R.raw.write_contacts_fab_icon_reverse, 52, 52);
        }
        this.floatingButton.playAnimation();
        AnimatorSet animatorSet2 = this.bounceIconAnimator;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.bounceIconAnimator = new AnimatorSet();
        float duration = (float) this.floatingButton.getAnimatedDrawable().getDuration();
        long j = 0;
        if (z2) {
            for (int i = 0; i < 6; i++) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                if (i == 0) {
                    RLottieImageView rLottieImageView = this.floatingButton;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, 1.0f, 0.9f);
                    RLottieImageView rLottieImageView2 = this.floatingButton;
                    Property property2 = View.SCALE_Y;
                    animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(rLottieImageView2, (Property<RLottieImageView, Float>) property2, 1.0f, 0.9f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.9f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f, 0.9f));
                    animatorSet3.setDuration(0.12765957f * duration);
                    animatorSet3.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                } else if (i == 1) {
                    RLottieImageView rLottieImageView3 = this.floatingButton;
                    Property property3 = View.SCALE_X;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rLottieImageView3, (Property<RLottieImageView, Float>) property3, 0.9f, 1.06f);
                    RLottieImageView rLottieImageView4 = this.floatingButton;
                    Property property4 = View.SCALE_Y;
                    animatorSet3.playTogether(ofFloat2, ObjectAnimator.ofFloat(rLottieImageView4, (Property<RLottieImageView, Float>) property4, 0.9f, 1.06f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, 0.9f, 1.06f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property4, 0.9f, 1.06f));
                    animatorSet3.setDuration(0.3617021f * duration);
                    animatorSet3.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                } else if (i == 2) {
                    RLottieImageView rLottieImageView5 = this.floatingButton;
                    Property property5 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(rLottieImageView5, (Property<RLottieImageView, Float>) property5, 1.06f, 0.9f);
                    RLottieImageView rLottieImageView6 = this.floatingButton;
                    Property property6 = View.SCALE_Y;
                    animatorSet3.playTogether(ofFloat3, ObjectAnimator.ofFloat(rLottieImageView6, (Property<RLottieImageView, Float>) property6, 1.06f, 0.9f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property5, 1.06f, 0.9f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property6, 1.06f, 0.9f));
                    animatorSet3.setDuration(0.21276596f * duration);
                    animatorSet3.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                } else if (i == 3) {
                    RLottieImageView rLottieImageView7 = this.floatingButton;
                    Property property7 = View.SCALE_X;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(rLottieImageView7, (Property<RLottieImageView, Float>) property7, 0.9f, 1.03f);
                    RLottieImageView rLottieImageView8 = this.floatingButton;
                    Property property8 = View.SCALE_Y;
                    animatorSet3.playTogether(ofFloat4, ObjectAnimator.ofFloat(rLottieImageView8, (Property<RLottieImageView, Float>) property8, 0.9f, 1.03f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property7, 0.9f, 1.03f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property8, 0.9f, 1.03f));
                    animatorSet3.setDuration(duration * 0.10638298f);
                    animatorSet3.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                } else if (i == 4) {
                    RLottieImageView rLottieImageView9 = this.floatingButton;
                    Property property9 = View.SCALE_X;
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(rLottieImageView9, (Property<RLottieImageView, Float>) property9, 1.03f, 0.98f);
                    RLottieImageView rLottieImageView10 = this.floatingButton;
                    Property property10 = View.SCALE_Y;
                    animatorSet3.playTogether(ofFloat5, ObjectAnimator.ofFloat(rLottieImageView10, (Property<RLottieImageView, Float>) property10, 1.03f, 0.98f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property9, 1.03f, 0.98f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property10, 1.03f, 0.98f));
                    animatorSet3.setDuration(duration * 0.10638298f);
                    animatorSet3.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                } else {
                    RLottieImageView rLottieImageView11 = this.floatingButton;
                    Property property11 = View.SCALE_X;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(rLottieImageView11, (Property<RLottieImageView, Float>) property11, 0.98f, 1.0f);
                    RLottieImageView rLottieImageView12 = this.floatingButton;
                    Property property12 = View.SCALE_Y;
                    animatorSet3.playTogether(ofFloat6, ObjectAnimator.ofFloat(rLottieImageView12, (Property<RLottieImageView, Float>) property12, 0.98f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property11, 0.98f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property12, 0.98f, 1.0f));
                    animatorSet3.setDuration(0.08510638f * duration);
                    animatorSet3.setInterpolator(CubicBezierInterpolator.EASE_IN);
                }
                animatorSet3.setStartDelay(j);
                j += animatorSet3.getDuration();
                this.bounceIconAnimator.playTogether(animatorSet3);
            }
        } else {
            for (int i2 = 0; i2 < 5; i2++) {
                AnimatorSet animatorSet4 = new AnimatorSet();
                if (i2 == 0) {
                    RLottieImageView rLottieImageView13 = this.floatingButton;
                    Property property13 = View.SCALE_X;
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(rLottieImageView13, (Property<RLottieImageView, Float>) property13, 1.0f, 0.9f);
                    RLottieImageView rLottieImageView14 = this.floatingButton;
                    Property property14 = View.SCALE_Y;
                    animatorSet4.playTogether(ofFloat7, ObjectAnimator.ofFloat(rLottieImageView14, (Property<RLottieImageView, Float>) property14, 1.0f, 0.9f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property13, 1.0f, 0.9f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property14, 1.0f, 0.9f));
                    animatorSet4.setDuration(0.19444445f * duration);
                    animatorSet4.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                } else if (i2 == 1) {
                    RLottieImageView rLottieImageView15 = this.floatingButton;
                    Property property15 = View.SCALE_X;
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(rLottieImageView15, (Property<RLottieImageView, Float>) property15, 0.9f, 1.06f);
                    RLottieImageView rLottieImageView16 = this.floatingButton;
                    Property property16 = View.SCALE_Y;
                    animatorSet4.playTogether(ofFloat8, ObjectAnimator.ofFloat(rLottieImageView16, (Property<RLottieImageView, Float>) property16, 0.9f, 1.06f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property15, 0.9f, 1.06f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property16, 0.9f, 1.06f));
                    animatorSet4.setDuration(0.22222222f * duration);
                    animatorSet4.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                } else if (i2 == 2) {
                    RLottieImageView rLottieImageView17 = this.floatingButton;
                    Property property17 = View.SCALE_X;
                    ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(rLottieImageView17, (Property<RLottieImageView, Float>) property17, 1.06f, 0.92f);
                    RLottieImageView rLottieImageView18 = this.floatingButton;
                    Property property18 = View.SCALE_Y;
                    animatorSet4.playTogether(ofFloat9, ObjectAnimator.ofFloat(rLottieImageView18, (Property<RLottieImageView, Float>) property18, 1.06f, 0.92f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property17, 1.06f, 0.92f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property18, 1.06f, 0.92f));
                    animatorSet4.setDuration(0.19444445f * duration);
                    animatorSet4.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                    animatorSet4.setStartDelay(j);
                    j += animatorSet4.getDuration();
                    this.bounceIconAnimator.playTogether(animatorSet4);
                } else if (i2 == 3) {
                    RLottieImageView rLottieImageView19 = this.floatingButton;
                    Property property19 = View.SCALE_X;
                    ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(rLottieImageView19, (Property<RLottieImageView, Float>) property19, 0.92f, 1.02f);
                    RLottieImageView rLottieImageView20 = this.floatingButton;
                    Property property20 = View.SCALE_Y;
                    animatorSet4.playTogether(ofFloat10, ObjectAnimator.ofFloat(rLottieImageView20, (Property<RLottieImageView, Float>) property20, 0.92f, 1.02f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property19, 0.92f, 1.02f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property20, 0.92f, 1.02f));
                    animatorSet4.setDuration(0.25f * duration);
                    animatorSet4.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                } else {
                    RLottieImageView rLottieImageView21 = this.floatingButton;
                    Property property21 = View.SCALE_X;
                    ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(rLottieImageView21, (Property<RLottieImageView, Float>) property21, 1.02f, 1.0f);
                    RLottieImageView rLottieImageView22 = this.floatingButton;
                    Property property22 = View.SCALE_Y;
                    animatorSet4.playTogether(ofFloat11, ObjectAnimator.ofFloat(rLottieImageView22, (Property<RLottieImageView, Float>) property22, 1.02f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property21, 1.02f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property22, 1.02f, 1.0f));
                    animatorSet4.setDuration(duration * 0.10638298f);
                    animatorSet4.setInterpolator(CubicBezierInterpolator.EASE_IN);
                    animatorSet4.setStartDelay(j);
                    j += animatorSet4.getDuration();
                    this.bounceIconAnimator.playTogether(animatorSet4);
                }
                animatorSet4.setStartDelay(j);
                j += animatorSet4.getDuration();
                this.bounceIconAnimator.playTogether(animatorSet4);
            }
        }
        this.bounceIconAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ContactsActivity.this.floatingButton.setScaleX(1.0f);
                ContactsActivity.this.floatingButton.setScaleY(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                ContactsActivity.this.bounceIconAnimator = null;
                ContactsActivity.this.getNotificationCenter().onAnimationFinish(ContactsActivity.this.animationIndex);
            }
        });
        this.bounceIconAnimator.start();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ContactsActivity.this.lambda$getThemeDescriptions$12();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SECTIONS, new Class[]{LetterSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, Theme.key_fastScrollText));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
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
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.floatingButton, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_chats_actionIcon));
        arrayList.add(new ThemeDescription(this.floatingButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_chats_actionBackground));
        arrayList.add(new ThemeDescription(this.floatingButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_chats_actionPressedBackground));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, Theme.key_chats_verifiedCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, Theme.key_chats_verifiedBackground));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_offlinePaint, null, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_onlinePaint, null, null, Theme.key_windowBackgroundWhiteBlueText3));
        TextPaint[] textPaintArr = Theme.dialogs_namePaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_name));
        TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_secretName));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$12() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                } else if (childAt instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) childAt).update(0);
                }
            }
        }
    }
}
