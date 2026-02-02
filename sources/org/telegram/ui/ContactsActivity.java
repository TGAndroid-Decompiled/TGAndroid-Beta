package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.collection.LongSparseArray;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
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
import org.telegram.ui.Components.ContactsEmptyView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.MainTabsActivity;

public class ContactsActivity extends BaseFragment implements FactorAnimator.Target, NotificationCenter.NotificationCenterDelegate, MainTabsActivity.TabFragmentDelegate, WindowAnimatedInsetsProvider.Listener {
    private final int ADDITIONAL_LIST_HEIGHT_DP;
    private ImageView actionModeCloseView;
    private int additionFloatingButtonOffset;
    private int additionNavigationBarHeight;
    private float additionalFloatingTranslation;
    private boolean allowBots;
    private boolean allowSelf;
    private boolean allowUsernameSearch;
    private final BoolAnimator animatorSearchFieldVisible;
    private final BoolAnimator animatorSearchHasQuery;
    private boolean askAboutContacts;
    private BackDrawable backDrawable;
    private long channelId;
    private long chatId;
    private boolean checkPermission;
    private SizeNotifierFrameLayout contentView;
    private boolean createSecretChat;
    private boolean creatingChat;
    private ContactsActivityDelegate delegate;
    private boolean destroyAfterSelect;
    private boolean disableSections;
    private StickerEmptyView emptyView;
    private FragmentFloatingButton floatingButton;
    private boolean floatingButtonVisibleByScroll;
    private boolean hasMainTabs;
    private HeaderShadowView headerShadowView;
    private IBlur3Capture iBlur3Capture;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private LongSparseArray ignoreUsers;
    private int imeInsetAnimatedHeight;
    private String initialSearchString;
    private boolean lastIsEmpty;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ContactsAdapter listViewAdapter;
    private int navigationBarHeight;
    private boolean needFinishFragment;
    private boolean needForwardCount;
    private boolean needPhonebook;
    private boolean onlyUsers;
    private AlertDialog permissionDialog;
    private long permissionRequestTime;
    public int phonebookRow;
    private boolean resetDelegate;
    private boolean returnAsResult;
    boolean scheduled;
    private RecyclerAnimationScrollHelper scrollHelper;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private FragmentSearchField searchField;
    private ActionBarMenuItem searchItem;
    private SearchAdapter searchListViewAdapter;
    private String searchQuery;
    private boolean searchWas;
    private boolean searching;
    private String selectAlertString;
    private final LongSparseArray selectedContacts;
    private NumberTextView selectedContactsCountTextView;
    private boolean sortByName;
    Runnable sortContactsRunnable;
    private ActionBarMenuItem sortItem;

    public interface ContactsActivityDelegate {
        void didSelectContact(TLRPC.User user, String str, ContactsActivity contactsActivity);
    }

    public static boolean lambda$createView$1(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchFieldVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 350L);
        this.animatorSearchHasQuery = new BoolAnimator(2, this, cubicBezierInterpolator, 350L);
        this.phonebookRow = 0;
        this.floatingButtonVisibleByScroll = true;
        this.allowSelf = true;
        this.allowBots = true;
        this.needForwardCount = true;
        this.needFinishFragment = true;
        this.resetDelegate = true;
        this.selectAlertString = null;
        this.allowUsernameSearch = true;
        this.askAboutContacts = true;
        this.selectedContacts = new LongSparseArray();
        this.checkPermission = true;
        this.sortContactsRunnable = new Runnable() {
            @Override
            public void run() {
                ContactsActivity.this.listViewAdapter.sortOnlineContacts();
                ContactsActivity.this.scheduled = false;
            }
        };
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
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
            this.needPhonebook = this.arguments.getBoolean("needPhonebook", false);
            this.hasMainTabs = this.arguments.getBoolean("hasMainTabs", false);
        } else {
            this.needPhonebook = true;
        }
        if (!this.createSecretChat && !this.returnAsResult) {
            this.sortByName = SharedConfig.sortContactsByName;
        }
        getContactsController().checkInviteText();
        getContactsController().reloadContactsStatusesMaybe(false);
        this.additionNavigationBarHeight = this.hasMainTabs ? AndroidUtilities.dp(72.0f) : 0;
        this.additionFloatingButtonOffset = this.hasMainTabs ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.delegate = null;
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
    public android.view.View createView(android.content.Context r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ContactsActivity.createView(android.content.Context):android.view.View");
    }

    public void lambda$createView$0(View view) {
        hideActionMode();
    }

    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (((BaseFragment) ContactsActivity.this).actionBar.isActionModeShowed()) {
                    ContactsActivity.this.hideActionMode();
                    return;
                } else {
                    ContactsActivity.this.finishFragment();
                    return;
                }
            }
            if (i == 100) {
                ContactsActivity.this.performSelectedContactsDelete();
                return;
            }
            if (i == 1) {
                SharedConfig.toggleSortContactsByName();
                ContactsActivity.this.sortByName = SharedConfig.sortContactsByName;
                ContactsActivity.this.listViewAdapter.setSortType(ContactsActivity.this.sortByName ? 1 : 2, false);
                ContactsActivity.this.sortItem.setIcon(ContactsActivity.this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                return;
            }
            if (i == 0) {
                ContactsActivity.this.listView.smoothScrollToPosition(0);
                AndroidUtilities.doOnPreDraw(ContactsActivity.this.searchField.editText, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onItemClick$0();
                    }
                });
            }
        }

        public void lambda$onItemClick$0() {
            ContactsActivity.this.searchField.editText.requestFocus();
            AndroidUtilities.showKeyboard(ContactsActivity.this.searchField.editText);
        }
    }

    public void lambda$createView$3() {
        this.listView.postOnAnimation(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$2();
            }
        });
    }

    public void lambda$createView$5(int i, View view, int i2, float f, float f2) {
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchListViewAdapter;
        if (adapter == searchAdapter) {
            if (searchAdapter.includeSearch) {
                if (i2 == 0) {
                    return;
                } else {
                    i2--;
                }
            }
            Object item = searchAdapter.getItem(i2);
            if (!this.selectedContacts.isEmpty() && (view instanceof ProfileSearchCell)) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                if (profileSearchCell.getUser() == null || !profileSearchCell.getUser().contact) {
                    return;
                }
                showOrUpdateActionMode(profileSearchCell);
                return;
            }
            if (item instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) item;
                if (this.searchListViewAdapter.isGlobalSearch(i2)) {
                    ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                    arrayList.add(user);
                    getMessagesController().putUsers(arrayList, false);
                    MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, false, true);
                }
                if (this.returnAsResult) {
                    LongSparseArray longSparseArray = this.ignoreUsers;
                    if (longSparseArray == null || longSparseArray.indexOfKey(user.id) < 0) {
                        didSelectResult(user, true, null);
                        return;
                    }
                    return;
                }
                if (this.createSecretChat) {
                    if (user.id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                        return;
                    }
                    this.creatingChat = true;
                    SecretChatHelper.getInstance(this.currentAccount).startSecretChat(getParentActivity(), user);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new ChatActivity(bundle), this.needFinishFragment);
                    return;
                }
                return;
            }
            if (item instanceof String) {
                String str = (String) item;
                if (str.equals("section")) {
                    return;
                }
                if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    AccountFrozenAlert.show(this.currentAccount);
                    return;
                }
                NewContactBottomSheet newContactBottomSheet = new NewContactBottomSheet(this, getContext());
                newContactBottomSheet.setInitialPhoneNumber(str, true);
                newContactBottomSheet.show();
                return;
            }
            if (item instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) item;
                AlertsCreator.createContactInviteDialog(this, contact.first_name, contact.last_name, contact.phones.get(0));
                return;
            }
            return;
        }
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        if (contactsAdapter.includeSearch) {
            if (i2 == 0) {
                return;
            } else {
                i2--;
            }
        }
        int sectionForPosition = contactsAdapter.getSectionForPosition(i2);
        int positionInSectionForPosition = this.listViewAdapter.getPositionInSectionForPosition(i2);
        if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
            return;
        }
        if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof ContactsEmptyView)) {
            FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
            if (fragmentFloatingButton != null) {
                fragmentFloatingButton.performClick();
                return;
            }
            return;
        }
        if (!this.selectedContacts.isEmpty() && (view instanceof UserCell)) {
            showOrUpdateActionMode((UserCell) view);
            return;
        }
        if ((!this.onlyUsers || i != 0) && sectionForPosition == 0) {
            if (this.needPhonebook) {
                if (positionInSectionForPosition != 0) {
                    if (positionInSectionForPosition == 1) {
                        presentFragment(new CallLogActivity());
                        return;
                    }
                    return;
                } else if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    AccountFrozenAlert.show(this.currentAccount);
                    return;
                } else {
                    presentFragment(new InviteContactsActivity());
                    return;
                }
            }
            if (i != 0) {
                if (positionInSectionForPosition == 0) {
                    if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                        AccountFrozenAlert.show(this.currentAccount);
                        return;
                    }
                    long j = this.chatId;
                    if (j == 0) {
                        j = this.channelId;
                    }
                    presentFragment(new GroupInviteActivity(j));
                    return;
                }
                return;
            }
            if (positionInSectionForPosition == 0) {
                if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    AccountFrozenAlert.show(this.currentAccount);
                    return;
                } else {
                    presentFragment(new GroupCreateActivity(new Bundle()), false);
                    return;
                }
            }
            if (positionInSectionForPosition == 1) {
                if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
                    AccountFrozenAlert.show(this.currentAccount);
                    return;
                }
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("step", 0);
                    presentFragment(new ChannelCreateActivity(bundle2));
                    return;
                } else {
                    presentFragment(new ActionIntroActivity(0));
                    globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                    return;
                }
            }
            return;
        }
        Object item2 = this.listViewAdapter.getItem(this.listViewAdapter.getSectionForPosition(i2), this.listViewAdapter.getPositionInSectionForPosition(i2));
        if (item2 instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) item2;
            if (this.returnAsResult) {
                LongSparseArray longSparseArray2 = this.ignoreUsers;
                if (longSparseArray2 == null || longSparseArray2.indexOfKey(user2.id) < 0) {
                    didSelectResult(user2, true, null);
                    return;
                }
                return;
            }
            if (this.createSecretChat) {
                this.creatingChat = true;
                SecretChatHelper.getInstance(this.currentAccount).startSecretChat(getParentActivity(), user2);
                return;
            }
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", user2.id);
            if (getMessagesController().checkCanOpenChat(bundle3, this)) {
                presentFragment(new ChatActivity(bundle3), this.needFinishFragment);
                return;
            }
            return;
        }
        if (item2 instanceof ContactsController.Contact) {
            ContactsController.Contact contact2 = (ContactsController.Contact) item2;
            final String str2 = !contact2.phones.isEmpty() ? contact2.phones.get(0) : null;
            if (str2 == null || getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setMessage(LocaleController.getString(R.string.InviteUser));
            builder.setTitle(LocaleController.getString(R.string.AppName));
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    this.f$0.lambda$createView$4(str2, alertDialog, i3);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder.create());
        }
    }

    public void lambda$createView$4(String str, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(this.currentAccount).getInviteText(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean lambda$createView$6(View view, int i) {
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        if (adapter == contactsAdapter) {
            int sectionForPosition = contactsAdapter.getSectionForPosition(i);
            int positionInSectionForPosition = this.listViewAdapter.getPositionInSectionForPosition(i);
            if (Bulletin.getVisibleBulletin() != null) {
                Bulletin.getVisibleBulletin().hide();
            }
            if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
                return false;
            }
        }
        boolean z = this.returnAsResult;
        if (!z && !this.createSecretChat && (view instanceof UserCell)) {
            showOrUpdateActionMode((UserCell) view);
            return true;
        }
        if (z || this.createSecretChat || !(view instanceof ProfileSearchCell)) {
            return false;
        }
        ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
        if (profileSearchCell.getUser() != null && profileSearchCell.getUser().contact) {
            showOrUpdateActionMode(profileSearchCell);
        }
        return true;
    }

    public void lambda$createView$7(View view) {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
        } else {
            new NewContactBottomSheet(this, getContext()).show();
        }
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.setUseContainerForTitles();
        actionBarCreateActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.setAddToContainer(false);
        actionBarCreateActionBar.createAdditionalSubTitleOverlayContainer();
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        return actionBarCreateActionBar;
    }

    public boolean addOrRemoveSelectedContact(UserCell userCell) {
        long dialogId = userCell.getDialogId();
        if (this.selectedContacts.indexOfKey(dialogId) >= 0) {
            this.selectedContacts.remove(dialogId);
            userCell.setChecked(false, true);
        } else if (userCell.getCurrentObject() instanceof TLRPC.User) {
            this.selectedContacts.put(dialogId, (TLRPC.User) userCell.getCurrentObject());
            userCell.setChecked(true, true);
            return true;
        }
        return false;
    }

    public boolean addOrRemoveSelectedContact(ProfileSearchCell profileSearchCell) {
        long dialogId = profileSearchCell.getDialogId();
        if (this.selectedContacts.indexOfKey(dialogId) >= 0) {
            this.selectedContacts.remove(dialogId);
            profileSearchCell.setChecked(false, true);
        } else if (profileSearchCell.getUser() != null) {
            this.selectedContacts.put(dialogId, profileSearchCell.getUser());
            profileSearchCell.setChecked(true, true);
            return true;
        }
        return false;
    }

    private void showOrUpdateActionMode(Object obj) {
        boolean zAddOrRemoveSelectedContact;
        if (obj instanceof UserCell) {
            zAddOrRemoveSelectedContact = addOrRemoveSelectedContact((UserCell) obj);
        } else if (!(obj instanceof ProfileSearchCell)) {
            return;
        } else {
            zAddOrRemoveSelectedContact = addOrRemoveSelectedContact((ProfileSearchCell) obj);
        }
        boolean z = true;
        if (!this.actionBar.isActionModeShowed()) {
            if (zAddOrRemoveSelectedContact) {
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
            builder.setTitle(LocaleController.getString(R.string.DeleteContactTitle));
            builder.setMessage(LocaleController.getString(R.string.DeleteContactSubtitle));
        } else {
            builder.setTitle(LocaleController.formatPluralString("DeleteContactsTitle", this.selectedContacts.size(), new Object[0]));
            builder.setMessage(LocaleController.getString(R.string.DeleteContactsSubtitle));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$performSelectedContactsDelete$8(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.redPositive();
    }

    public void lambda$performSelectedContactsDelete$8(AlertDialog alertDialog, int i) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(this.selectedContacts.size());
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            arrayList.add((TLRPC.User) this.selectedContacts.get(this.selectedContacts.keyAt(i2)));
        }
        getContactsController().deleteContactsUndoable(getContext(), this, arrayList);
        hideActionMode();
    }

    private void didSelectResult(final TLRPC.User user, boolean z, final String str) {
        final EditTextBoldCursor editTextBoldCursor;
        if (z && this.selectAlertString != null) {
            if (getParentActivity() == null) {
                return;
            }
            if (user.bot) {
                if (user.bot_nochats) {
                    try {
                        BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.BotCantJoinGroups)).show();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                if (this.channelId != 0) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.channelId));
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    if (ChatObject.canAddAdmins(chat)) {
                        builder.setTitle(LocaleController.getString(R.string.AddBotAdminAlert));
                        builder.setMessage(LocaleController.getString(R.string.AddBotAsAdmin));
                        builder.setPositiveButton(LocaleController.getString(R.string.AddAsAdmin), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i) {
                                this.f$0.lambda$didSelectResult$10(user, str, alertDialog, i);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.CantAddBotAsAdmin));
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                    }
                    showDialog(builder.create());
                    return;
                }
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
            builder2.setTitle(LocaleController.getString(R.string.AppName));
            String stringSimple = LocaleController.formatStringSimple(this.selectAlertString, UserObject.getUserName(user));
            if (user.bot || !this.needForwardCount) {
                editTextBoldCursor = null;
            } else {
                stringSimple = String.format("%s\n\n%s", stringSimple, LocaleController.getString(R.string.AddToTheGroupForwardCount));
                editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
                editTextBoldCursor.setTextSize(1, 18.0f);
                editTextBoldCursor.setText("50");
                editTextBoldCursor.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
                editTextBoldCursor.setGravity(17);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setImeOptions(6);
                editTextBoldCursor.setBackground(Theme.createEditTextDrawable(getParentActivity(), true));
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
                            String string = editable.toString();
                            if (!string.isEmpty()) {
                                int iIntValue = Utilities.parseInt((CharSequence) string).intValue();
                                if (iIntValue < 0) {
                                    editTextBoldCursor.setText("0");
                                    EditText editText = editTextBoldCursor;
                                    editText.setSelection(editText.length());
                                } else if (iIntValue > 300) {
                                    editTextBoldCursor.setText("300");
                                    EditText editText2 = editTextBoldCursor;
                                    editText2.setSelection(editText2.length());
                                } else {
                                    if (!string.equals("" + iIntValue)) {
                                        editTextBoldCursor.setText("" + iIntValue);
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
            builder2.setMessage(stringSimple);
            builder2.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$didSelectResult$11(user, editTextBoldCursor, alertDialog, i);
                }
            });
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder2.create());
            if (editTextBoldCursor != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) editTextBoldCursor.getLayoutParams();
                if (marginLayoutParams != null) {
                    if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
                    }
                    int iDp = AndroidUtilities.dp(24.0f);
                    marginLayoutParams.leftMargin = iDp;
                    marginLayoutParams.rightMargin = iDp;
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
            contactsActivityDelegate.didSelectContact(user, str, this);
            if (this.resetDelegate) {
                this.delegate = null;
            }
        }
        if (this.needFinishFragment) {
            finishFragment();
        }
    }

    public void lambda$didSelectResult$10(TLRPC.User user, String str, AlertDialog alertDialog, int i) {
        ContactsActivityDelegate contactsActivityDelegate = this.delegate;
        if (contactsActivityDelegate != null) {
            contactsActivityDelegate.didSelectContact(user, str, this);
            this.delegate = null;
        }
    }

    public void lambda$didSelectResult$11(TLRPC.User user, EditText editText, AlertDialog alertDialog, int i) {
        didSelectResult(user, false, editText != null ? editText.getText().toString() : "0");
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (this.actionBar.isActionModeShowed()) {
            if (z) {
                hideActionMode();
            }
            return false;
        }
        if (!this.animatorSearchHasQuery.getValue()) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.searchField.editText.getText().clear();
        }
        return false;
    }

    @Override
    public void onResume() {
        super.onResume();
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        if (contactsAdapter != null) {
            contactsAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onBecomeFullyVisible() {
        Activity parentActivity;
        super.onBecomeFullyVisible();
        if (!this.checkPermission || Build.VERSION.SDK_INT < 23 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.checkPermission = false;
        if (parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                AlertDialog alertDialogCreate = AlertsCreator.createContactsPermissionDialog(parentActivity, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i) {
                        this.f$0.lambda$onBecomeFullyVisible$12(i);
                    }
                }).create();
                this.permissionDialog = alertDialogCreate;
                showDialog(alertDialogCreate);
                return;
            }
            askForPermissons(true);
        }
    }

    public void lambda$onBecomeFullyVisible$12(int i) {
        this.askAboutContacts = i != 0;
        if (i == 0) {
            return;
        }
        askForPermissons(false);
    }

    protected RecyclerListView getListView() {
        return this.listView;
    }

    @Override
    protected void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        AlertDialog alertDialog = this.permissionDialog;
        if (alertDialog == null || dialog != alertDialog || getParentActivity() == null || !this.askAboutContacts) {
            return;
        }
        askForPermissons(false);
    }

    private void askForPermissons(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z && this.askAboutContacts) {
            showDialog(AlertsCreator.createContactsPermissionDialog(parentActivity, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i) {
                    this.f$0.lambda$askForPermissons$13(i);
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

    public void lambda$askForPermissons$13(int i) {
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
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalNotificationsSettings().edit();
                    this.askAboutContacts = false;
                    editorEdit.putBoolean("askAboutContacts", false).commit();
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
        if (i == NotificationCenter.contactsDidLoad) {
            ContactsAdapter contactsAdapter = this.listViewAdapter;
            if (contactsAdapter != null) {
                if (!this.sortByName) {
                    contactsAdapter.setSortType(2, true);
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
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) != 0 || (MessagesController.UPDATE_MASK_NAME & iIntValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & iIntValue) != 0) {
                updateVisibleRows(iIntValue);
            }
            if ((iIntValue & MessagesController.UPDATE_MASK_STATUS) == 0 || this.sortByName || this.listViewAdapter == null) {
                return;
            }
            scheduleSort();
            return;
        }
        if (i == NotificationCenter.encryptedChatCreated) {
            if (this.createSecretChat && this.creatingChat) {
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
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

    public void setDelegate(ContactsActivityDelegate contactsActivityDelegate) {
        this.delegate = contactsActivityDelegate;
    }

    public void setInitialSearchString(String str) {
        this.initialSearchString = str;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$14();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        if (!this.hasMainTabs) {
            arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
        }
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
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
        int i = Theme.key_windowBackgroundWhiteBlackText;
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
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        if (this.floatingButton != null) {
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_chats_actionIcon));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_chats_actionBackground));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_chats_actionPressedBackground));
        }
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

    public void lambda$getThemeDescriptions$14() {
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
        ImageView imageView = this.actionModeCloseView;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector)));
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.updateColors();
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
        if (sizeNotifierFrameLayout != null) {
            sizeNotifierFrameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkUi_searchButton();
        } else if (i == 2) {
            checkUi_searchButton();
            checkUi_sortItem();
        }
    }

    @Override
    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        RecyclerListView recyclerListView = this.listView;
        return recyclerListView == null || recyclerListView.getFastScroll() == null || !this.listView.getFastScroll().isPressed();
    }

    @Override
    public View getAnimatedInsetsTargetView() {
        return this.fragmentView;
    }

    @Override
    public void onAnimatedInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat) {
        this.imeInsetAnimatedHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        checkUi_emptyView();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.navigationBarHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        checkUi_listViewPadding();
        checkUi_floatingButtonPosition();
        checkUi_emptyView();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.navigationBarHeight = i4;
        checkUi_listViewPadding();
        checkUi_floatingButtonPosition();
        checkUi_emptyView();
    }

    public void checkUi_emptyView() {
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.setKeyboardHeight(Math.max(this.navigationBarHeight + this.additionNavigationBarHeight, this.imeInsetAnimatedHeight), false);
        }
    }

    public void checkUi_listViewPadding() {
        this.listView.setPadding(0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP + 44) + this.actionBar.getMeasuredHeight(), 0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.navigationBarHeight + this.additionNavigationBarHeight);
    }

    public void checkUi_searchFieldHint() {
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        boolean z = contactsAdapter != null && contactsAdapter.isEmpty();
        if (this.lastIsEmpty != z || TextUtils.isEmpty(this.searchField.editText.getHint())) {
            this.searchField.editText.setHint(LocaleController.getString(z ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.searchField.editText.setContentDescription(LocaleController.getString(z ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.lastIsEmpty = z;
        }
    }

    public void checkUi_searchFieldY() {
        float y = this.listView.getY() + this.listView.getPaddingTop();
        int i = 0;
        while (true) {
            if (i >= this.listView.getChildCount()) {
                break;
            }
            View childAt = this.listView.getChildAt(i);
            int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == 0) {
                RecyclerView.ItemDecoration itemDecorationAt = this.listView.getItemDecorationAt(i);
                Rect rect = AndroidUtilities.rectTmp2;
                RecyclerListView recyclerListView = this.listView;
                itemDecorationAt.getItemOffsets(rect, childAt, recyclerListView, recyclerListView.mState);
                y = this.listView.getY() + (childAt.getY() - (this.listViewAdapter.isEmptyWithMainTabs ? 0 : rect.top));
            } else {
                if (childAdapterPosition > 0) {
                    y = -AndroidUtilities.dp(52.0f);
                    break;
                }
                i++;
            }
        }
        this.searchField.setTranslationY(y - AndroidUtilities.dp(48.0f));
        this.animatorSearchFieldVisible.setValue(y > (this.listView.getY() + ((float) this.listView.getPaddingTop())) - ((float) AndroidUtilities.dp(12.0f)), true);
    }

    public void checkUi_sortItem() {
        float floatValue = 1.0f - this.animatorSearchHasQuery.getFloatValue();
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        FragmentFloatingButton.setAnimatedVisibility(this.sortItem, floatValue * ((contactsAdapter == null || contactsAdapter.isEmpty()) ? 0.0f : 1.0f));
    }

    public void checkUi_searchButton() {
        FragmentFloatingButton.setAnimatedVisibility(this.searchItem, (1.0f - this.animatorSearchFieldVisible.getFloatValue()) * (1.0f - this.animatorSearchHasQuery.getFloatValue()));
    }

    public void checkUi_floatingButtonPosition() {
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(((-this.navigationBarHeight) - this.additionFloatingButtonOffset) - this.additionalFloatingTranslation);
        }
    }

    public void checkUi_floatingButtonVisible() {
        ContactsAdapter contactsAdapter;
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton == null || (contactsAdapter = this.listViewAdapter) == null) {
            return;
        }
        fragmentFloatingButton.setButtonVisible((!this.floatingButtonVisibleByScroll || this.searching || contactsAdapter.isEmpty()) ? false : true, true);
    }

    public void lambda$createView$2() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int iDp2 = AndroidUtilities.dp(44.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp + iDp2);
        this.iBlur3PositionMainTabs.set(0.0f, iDp3, this.fragmentView.getMeasuredWidth(), measuredHeight);
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, this.hasMainTabs ? 2 : 1);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override
    public BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public void onParentScrollToTop() {
        if (this.layoutManager.findFirstVisibleItemPosition() < 15) {
            this.listView.smoothScrollToPosition(0);
        } else {
            this.scrollHelper.setScrollDirection(1);
            this.scrollHelper.scrollToPosition(0, 0, false, true);
        }
        this.animatorSearchFieldVisible.setValue(true, true);
    }
}
