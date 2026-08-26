package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
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
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.WeakHashMap;
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
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.SearchTextWatcher;
import org.telegram.tgnet.TLRPC;
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
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ContactsEmptyView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda24;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;

public class ContactsActivity extends BaseFragment implements FactorAnimator.Target, NotificationCenter.NotificationCenterDelegate, MainTabsActivity.TabFragmentDelegate, WindowAnimatedInsetsProvider.Listener {
    private static final int ANIMATOR_ID_SEARCH_FIELD_VISIBLE = 0;
    private static final int ANIMATOR_ID_SEARCH_HAS_QUERY = 2;
    private static final int delete = 100;
    private static final int search_button = 0;
    private static final int sort_button = 1;
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
    public boolean hasMainTabs;
    private HeaderShadowView headerShadowView;
    private IBlur3Capture iBlur3Capture;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList<RectF> iBlur3Positions;
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

    public class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        public void lambda$onItemClick$0() {
            ContactsActivity.this.searchField.editText.requestFocus();
            AndroidUtilities.showKeyboard(ContactsActivity.this.searchField.editText);
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
                AndroidUtilities.doOnPreDraw(ContactsActivity.this.searchField.editText, new ChatActivity$21$$ExternalSyntheticLambda4(this, 16));
            }
        }
    }

    public interface ContactsActivityDelegate {
        void didSelectContact(TLRPC.User user, String str, ContactsActivity contactsActivity);
    }

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchFieldVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 350L, false);
        this.animatorSearchHasQuery = new BoolAnimator(2, this, cubicBezierInterpolator, 350L, false);
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
        ArrayList<RectF> arrayList = new ArrayList<>();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
        }
    }

    private void askForPermissons(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z && this.askAboutContacts) {
            showDialog(AlertsCreator.createContactsPermissionDialog(parentActivity, new ContactsActivity$$ExternalSyntheticLambda3(this, 1)).create());
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

    public void lambda$createView$2() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int iDp2 = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp + iDp2);
        this.iBlur3PositionMainTabs.set(0.0f, iDp3, this.fragmentView.getMeasuredWidth(), measuredHeight);
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.hasMainTabs ? 2 : 1, this.iBlur3Positions);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public void checkUi_emptyView() {
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.setKeyboardHeight(Math.max(this.navigationBarHeight + this.additionNavigationBarHeight, this.imeInsetAnimatedHeight), false);
        }
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

    public void checkUi_listViewPadding() {
        this.listView.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP + 44), 0, AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.navigationBarHeight + this.additionNavigationBarHeight);
    }

    public void checkUi_searchButton() {
        FragmentFloatingButton.setAnimatedVisibility(this.searchItem, (1.0f - this.animatorSearchHasQuery.floatValue) * (1.0f - this.animatorSearchFieldVisible.floatValue));
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
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == 0) {
                RecyclerView.ItemDecoration itemDecorationAt = this.listView.getItemDecorationAt(i);
                Rect rect = AndroidUtilities.rectTmp2;
                RecyclerListView recyclerListView = this.listView;
                itemDecorationAt.getItemOffsets(rect, childAt, recyclerListView, recyclerListView.mState);
                y = this.listView.getY() + (childAt.getY() - (this.listViewAdapter.isEmptyWithMainTabs ? 0 : rect.top));
                break;
            }
            if (childAdapterPosition > 0) {
                y = -AndroidUtilities.dp(52.0f);
                break;
            }
        }
        this.searchField.setTranslationY(AndroidUtilities.lerp(y, this.listView.getY() + this.listView.getPaddingTop(), this.animatorSearchHasQuery.floatValue) - AndroidUtilities.dp(48.0f));
        this.animatorSearchFieldVisible.setValue(y > (this.listView.getY() + ((float) this.listView.getPaddingTop())) - ((float) AndroidUtilities.dp(12.0f)), true);
    }

    public void checkUi_sortItem() {
        float f = 1.0f - this.animatorSearchHasQuery.floatValue;
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        FragmentFloatingButton.setAnimatedVisibility(this.sortItem, f * ((contactsAdapter == null || contactsAdapter.isEmpty()) ? 0.0f : 1.0f));
    }

    private void didSelectResult(TLRPC.User user, boolean z, String str) {
        final EditTextBoldCursor editTextBoldCursor;
        if (!z || this.selectAlertString == null) {
            ContactsActivityDelegate contactsActivityDelegate = this.delegate;
            if (contactsActivityDelegate != null) {
                contactsActivityDelegate.didSelectContact(user, str, this);
                if (this.resetDelegate) {
                    this.delegate = null;
                }
            }
            if (this.needFinishFragment) {
                finishFragment();
                return;
            }
            return;
        }
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
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                if (ChatObject.canAddAdmins(chat)) {
                    builder.setTitle(LocaleController.getString(R.string.AddBotAdminAlert));
                    builder.setMessage(LocaleController.getString(R.string.AddBotAsAdmin));
                    builder.setPositiveButton(LocaleController.getString(R.string.AddAsAdmin), new WearAuthSheet$$ExternalSyntheticLambda5(this, user, str, 21));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                } else {
                    builder.setMessage(LocaleController.getString(R.string.CantAddBotAsAdmin));
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                }
                showDialog(builder.create());
                return;
            }
        }
        AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder2.setTitle(LocaleController.getString(R.string.AppName));
        String stringSimple = LocaleController.formatStringSimple(this.selectAlertString, UserObject.getUserName(user));
        if (user.bot || !this.needForwardCount) {
            editTextBoldCursor = null;
        } else {
            stringSimple = zzjx.m(stringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
            editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
            editTextBoldCursor.setTextSize(1, 18.0f);
            editTextBoldCursor.setText("50");
            editTextBoldCursor.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
            editTextBoldCursor.setGravity(17);
            editTextBoldCursor.setInputType(2);
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setBackground(Theme.createEditTextDrawable(getParentActivity()));
            editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                    try {
                        String string = editable.toString();
                        if (string.isEmpty()) {
                            return;
                        }
                        int iIntValue = Utilities.parseInt((CharSequence) string).intValue();
                        if (iIntValue < 0) {
                            editTextBoldCursor.setText("0");
                            EditText editText = editTextBoldCursor;
                            editText.setSelection(editText.length());
                            return;
                        }
                        if (iIntValue > 300) {
                            editTextBoldCursor.setText("300");
                            EditText editText2 = editTextBoldCursor;
                            editText2.setSelection(editText2.length());
                            return;
                        }
                        if (string.equals("" + iIntValue)) {
                            return;
                        }
                        editTextBoldCursor.setText("" + iIntValue);
                        EditText editText3 = editTextBoldCursor;
                        editText3.setSelection(editText3.length());
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            builder2.setView(editTextBoldCursor);
        }
        builder2.setMessage(stringSimple);
        builder2.setPositiveButton(LocaleController.getString(R.string.OK), new WearAuthSheet$$ExternalSyntheticLambda5(this, user, editTextBoldCursor, 22));
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
        }
    }

    public void hideActionMode() {
        CheckBox2 checkBox2;
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
                if (this.selectedContacts.indexOfKey(profileSearchCell.getDialogId()) >= 0 && (checkBox2 = profileSearchCell.checkBox) != null) {
                    checkBox2.setChecked(false, true);
                }
            }
        }
        this.selectedContacts.clear();
        this.backDrawable.setRotation(0.0f, true);
    }

    public void lambda$askForPermissons$13(int i) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        this.askAboutContacts = i != 0;
        if (i == 0) {
            return;
        }
        askForPermissons(false);
    }

    public void lambda$createView$0(View view) {
        hideActionMode();
    }

    public static boolean lambda$createView$1(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$createView$3() {
        this.listView.postOnAnimation(new ContactsActivity$$ExternalSyntheticLambda4(this, 0));
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
            if (!(item instanceof TLRPC.User)) {
                if (!(item instanceof String)) {
                    if (item instanceof ContactsController.Contact) {
                        ContactsController.Contact contact = (ContactsController.Contact) item;
                        AlertsCreator.createContactInviteDialog(this, contact.first_name, contact.last_name, contact.phones.get(0));
                        return;
                    }
                    return;
                }
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
        if ((this.onlyUsers && i == 0) || sectionForPosition != 0) {
            Object item2 = this.listViewAdapter.getItem(this.listViewAdapter.getSectionForPosition(i2), this.listViewAdapter.getPositionInSectionForPosition(i2));
            if (!(item2 instanceof TLRPC.User)) {
                if (item2 instanceof ContactsController.Contact) {
                    ContactsController.Contact contact2 = (ContactsController.Contact) item2;
                    String str2 = !contact2.phones.isEmpty() ? contact2.phones.get(0) : null;
                    if (str2 == null || getParentActivity() == null) {
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                    builder.setMessage(LocaleController.getString(R.string.InviteUser));
                    builder.setTitle(LocaleController.getString(R.string.AppName));
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), new DialogsActivity$$ExternalSyntheticLambda6(5, this, str2));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    showDialog(builder.create());
                    return;
                }
                return;
            }
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
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", user2.id);
            if (getMessagesController().checkCanOpenChat(bundle2, this)) {
                presentFragment(new ChatActivity(bundle2), this.needFinishFragment);
                return;
            }
            return;
        }
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
                presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")));
            } else {
                presentFragment(new ActionIntroActivity(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).commit();
            }
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
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1, -1));
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

    public void lambda$onBecomeFullyVisible$12(int i) {
        this.askAboutContacts = i != 0;
        if (i == 0) {
            return;
        }
        askForPermissons(false);
    }

    public void lambda$performSelectedContactsDelete$8(AlertDialog alertDialog, int i) {
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(this.selectedContacts.size());
        for (int i2 = 0; i2 < this.selectedContacts.size(); i2++) {
            arrayList.add((TLRPC.User) this.selectedContacts.get(this.selectedContacts.keyAt(i2)));
        }
        getContactsController().deleteContactsUndoable(getContext(), this, arrayList);
        hideActionMode();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.navigationBarHeight = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false).bottom;
        checkUi_listViewPadding();
        checkUi_floatingButtonPosition();
        checkUi_emptyView();
        return WindowInsetsCompat.CONSUMED;
    }

    public void performSelectedContactsDelete() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, getResourceProvider());
        if (this.selectedContacts.size() == 1) {
            builder.setTitle(LocaleController.getString(R.string.DeleteContactTitle));
            builder.setMessage(LocaleController.getString(R.string.DeleteContactSubtitle));
        } else {
            builder.setTitle(LocaleController.formatPluralString("DeleteContactsTitle", this.selectedContacts.size(), new Object[0]));
            builder.setMessage(LocaleController.getString(R.string.DeleteContactsSubtitle));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ContactsActivity$$ExternalSyntheticLambda8(this));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ChatActivity$$ExternalSyntheticLambda49(20));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.redPositive();
    }

    private void scheduleSort() {
        if (this.scheduled) {
            return;
        }
        this.scheduled = true;
        AndroidUtilities.cancelRunOnUIThread(this.sortContactsRunnable);
        AndroidUtilities.runOnUIThread(this.sortContactsRunnable, 5000L);
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

    public boolean addOrRemoveSelectedContact(UserCell userCell) {
        long dialogId = userCell.getDialogId();
        if (this.selectedContacts.indexOfKey(dialogId) >= 0) {
            this.selectedContacts.remove(dialogId);
            userCell.setChecked(false, true);
        } else if (userCell.getCurrentObject() instanceof TLRPC.User) {
            this.selectedContacts.put((TLRPC.User) userCell.getCurrentObject(), dialogId);
            userCell.setChecked(true, true);
            return true;
        }
        return false;
    }

    @Override
    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        RecyclerListView recyclerListView = this.listView;
        return recyclerListView == null || recyclerListView.getFastScroll() == null || !this.listView.getFastScroll().isPressed();
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

    @Override
    public View createView(Context context) {
        ?? CanUserDoAdminAction;
        int i;
        int i2 = 3;
        final int i3 = 0;
        this.searching = false;
        this.searchWas = false;
        this.actionBar.setAllowOverlayTitle(true);
        if (!this.destroyAfterSelect) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Contacts));
        } else if (this.returnAsResult) {
            this.actionBar.setTitle(LocaleController.getString(R.string.SelectContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(this.createSecretChat ? R.string.NewSecretChat : R.string.NewMessageTitle));
        }
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        if (!this.hasMainTabs) {
            this.actionBar.setBackButtonDrawable(backDrawable);
        }
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourceProvider);
        this.searchField = fragmentSearchField;
        fragmentSearchField.setSectionBackground();
        this.searchField.setPivotY(0.0f);
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode(false, null);
        actionBarMenuCreateActionMode.setBackgroundColor(0);
        if (this.hasMainTabs) {
            ImageView imageView = new ImageView(context);
            this.actionModeCloseView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.actionModeCloseView.setImageDrawable(new BackDrawable(true));
            this.actionModeCloseView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 1, -1));
            this.actionModeCloseView.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$createView$0(view);
                            break;
                        default:
                            this.f$0.lambda$createView$7(view);
                            break;
                    }
                }
            });
            actionBarMenuCreateActionMode.addView(this.actionModeCloseView, LayoutHelper.createLinear(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedContactsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedContactsCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedContactsCountTextView.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        actionBarMenuCreateActionMode.addView(this.selectedContactsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, this.hasMainTabs ? 18 : 72, 0, 0, 0));
        this.selectedContactsCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(14));
        actionBarMenuCreateActionMode.addItemWithWidth(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        EditTextBoldCursor editTextBoldCursor = this.searchField.editText;
        editTextBoldCursor.addTextChangedListener(new SearchTextWatcher(editTextBoldCursor, new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
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
                ContactsActivity.this.checkUi_floatingButtonVisible();
            }

            @Override
            public void onSearchExpand() {
                ContactsActivity.this.searching = true;
                ContactsActivity.this.checkUi_floatingButtonVisible();
            }

            @Override
            public void onTextChanged(EditText editText) {
                if (ContactsActivity.this.searchListViewAdapter == null) {
                    return;
                }
                String string = editText.getText().toString();
                ContactsActivity.this.animatorSearchHasQuery.setValue(!string.isEmpty(), true);
                ContactsActivity.this.searchQuery = string;
                if (string.isEmpty()) {
                    if (ContactsActivity.this.listView != null) {
                        ContactsActivity.this.listView.setAdapter(ContactsActivity.this.listViewAdapter);
                        ContactsActivity.this.listView.setSectionsType(1);
                        return;
                    }
                    return;
                }
                ContactsActivity.this.searchWas = true;
                if (ContactsActivity.this.listView != null) {
                    ContactsActivity.this.listView.setAdapter(ContactsActivity.this.searchListViewAdapter);
                    ContactsActivity.this.listView.setSectionsType(0);
                    ContactsActivity.this.searchListViewAdapter.notifyDataSetChanged();
                    ContactsActivity.this.listView.setFastScrollVisible(false);
                    ContactsActivity.this.listView.setVerticalScrollBarEnabled(true);
                }
                ContactsActivity.this.emptyView.showProgress(true, true);
                ContactsActivity.this.searchListViewAdapter.searchDialogs(string);
            }
        }));
        if (!this.createSecretChat && !this.returnAsResult) {
            ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateMenu.addItem(1, this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.sortItem = actionBarMenuItemAddItem2;
            actionBarMenuItemAddItem2.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        SearchAdapter searchAdapter = new SearchAdapter(recyclerListView, context, this.ignoreUsers, this.selectedContacts, this.allowUsernameSearch, false, false, this.allowBots, this.allowSelf, true, 0, this.resourceProvider) {
            {
                super(context, longSparseArray, longSparseArray, z, z, z, z, z, z, i);
            }

            @Override
            public void onSearchProgressChanged() {
                if (searchInProgress() || getItemCount() != 0) {
                    return;
                }
                ContactsActivity.this.emptyView.showProgress(false, true);
            }
        };
        this.searchListViewAdapter = searchAdapter;
        searchAdapter.includeSearch = false;
        if (this.chatId != 0) {
            CanUserDoAdminAction = ChatObject.canUserDoAdminAction(getMessagesController().getChat(Long.valueOf(this.chatId)), 3);
        } else if (this.channelId != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.channelId));
            if (!ChatObject.canUserDoAdminAction(chat, 3) || ChatObject.isPublic(chat)) {
                CanUserDoAdminAction = 0;
            } else {
                CanUserDoAdminAction = 2;
            }
        } else {
            CanUserDoAdminAction = 0;
        }
        ContactsAdapter contactsAdapter = new ContactsAdapter(context, this, this.onlyUsers ? 1 : 0, this.needPhonebook, this.ignoreUsers, this.selectedContacts, CanUserDoAdminAction) {
            @Override
            public int getSectionCount() {
                int sectionCount = super.getSectionCount();
                ContactsActivity.this.checkUi_floatingButtonVisible();
                ContactsActivity.this.checkUi_sortItem();
                ContactsActivity.this.checkUi_searchFieldHint();
                return sectionCount;
            }

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
        if (this.sortItem != null) {
            i = this.sortByName ? 1 : 2;
        } else {
            i = 0;
        }
        contactsAdapter.setSortType(i, false);
        this.listViewAdapter.setDisableSections(this.disableSections);
        this.listViewAdapter.includeSearch = false;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && ContactsActivity.this.scrollableViewNoiseSuppressor != null) {
                    ContactsActivity.this.lambda$createView$2();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (ContactsActivity.this.iBlur3SourceGlassFrosted != null && !ContactsActivity.this.iBlur3SourceGlassFrosted.inRecording) {
                        RecordingCanvas recordingCanvasBeginRecording = ContactsActivity.this.iBlur3SourceGlassFrosted.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording.drawColor(ContactsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            ContactsActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording, -3);
                        }
                        ContactsActivity.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    if (ContactsActivity.this.iBlur3SourceGlass != null && !ContactsActivity.this.iBlur3SourceGlass.inRecording) {
                        RecordingCanvas recordingCanvasBeginRecording2 = ContactsActivity.this.iBlur3SourceGlass.beginRecording(measuredWidth, measuredHeight);
                        recordingCanvasBeginRecording2.drawColor(ContactsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        if (SharedConfig.chatBlurEnabled()) {
                            ContactsActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording2, -2);
                        }
                        ContactsActivity.this.iBlur3SourceGlass.endRecording();
                    }
                    ContactsActivity.this.iBlur3Invalidated = false;
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
                if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || ContactsActivity.this.iBlur3SourceGlassFrosted == null) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                canvas.save();
                canvas.translate(0.0f, -f);
                ContactsActivity.this.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
            }

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                super.onLayout(z, i4, i5, i6, i7);
                ContactsActivity.this.checkUi_emptyView();
                ContactsActivity.this.checkUi_searchButton();
                ContactsActivity.this.checkUi_sortItem();
                ContactsActivity.this.checkUi_floatingButtonPosition();
                ContactsActivity.this.checkUi_searchFieldY();
            }

            @Override
            public void onMeasure(int i4, int i5) {
                measureChildWithMargins(((BaseFragment) ContactsActivity.this).actionBar, i4, 0, i5, 0);
                ((ViewGroup.MarginLayoutParams) ContactsActivity.this.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) ContactsActivity.this.headerShadowView.getLayoutParams()).topMargin = ((BaseFragment) ContactsActivity.this).actionBar.getMeasuredHeight();
                ContactsActivity.this.checkUi_listViewPadding();
                super.onMeasure(i4, i5);
            }
        };
        this.contentView = sizeNotifierFrameLayout;
        this.fragmentView = sizeNotifierFrameLayout;
        RecyclerListView recyclerListView2 = this.listView;
        Objects.requireNonNull(recyclerListView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView2, sizeNotifierFrameLayout, new EmojiView$$ExternalSyntheticLambda24(recyclerListView2));
        final int i4 = 1;
        this.listView.addEdgeEffectListener(new ContactsActivity$$ExternalSyntheticLambda4(this, i4));
        this.listView.setSections(true);
        this.contentView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        flickerLoadingView.setViewType(29);
        flickerLoadingView.showDate(false);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.showProgress(true, false);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.contentView.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setDurations(150L);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.listView.setSectionsType(1);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setFastScrollEnabled(0);
        ?? r0 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        r0.setLayoutManager(linearLayoutManager);
        this.listView.setAdapter(this.listViewAdapter);
        this.listView.setClipToPadding(false);
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.listView, this.layoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setScrollListener(new ContactsActivity$$ExternalSyntheticLambda8(this));
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.contentView;
        RecyclerListView recyclerListView3 = this.listView;
        float f = -this.ADDITIONAL_LIST_HEIGHT_DP;
        sizeNotifierFrameLayout2.addView(recyclerListView3, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, f, 0.0f, f));
        this.contentView.addView(this.searchField, LayoutHelper.createFrame(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAnimateEmptyView(true, 0);
        this.listView.setOnItemClickListener(new LaunchActivity$$ExternalSyntheticLambda23(this, CanUserDoAdminAction, i2));
        this.listView.setOnItemLongClickListener(new ContactsActivity$$ExternalSyntheticLambda8(this));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            private boolean lastScrollToDown;
            private boolean scrollUpdated;
            private boolean scrollingManually;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i5) {
                if (i5 != 1) {
                    this.scrollingManually = false;
                    return;
                }
                if ((ContactsActivity.this.searching && ContactsActivity.this.searchWas) || ContactsActivity.this.searchField.editText.isFocused()) {
                    AndroidUtilities.hideKeyboard(ContactsActivity.this.getParentActivity().getCurrentFocus());
                }
                this.scrollingManually = true;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                int iFindFirstVisibleItemPosition = ContactsActivity.this.layoutManager.findFirstVisibleItemPosition();
                View childAt = recyclerView.getChildAt(0);
                int top = childAt != null ? childAt.getTop() : 0;
                if (ContactsActivity.this.floatingButton != null && !ContactsActivity.this.searching) {
                    boolean z = i6 > 0;
                    if (i6 != 0 && this.scrollUpdated && (z || this.scrollingManually)) {
                        ContactsActivity.this.floatingButtonVisibleByScroll = !z;
                        ContactsActivity.this.checkUi_floatingButtonVisible();
                    }
                    this.scrollUpdated = true;
                }
                ContactsActivity.this.headerShadowView.setShadowVisible(iFindFirstVisibleItemPosition != 0 || top < ContactsActivity.this.listView.getPaddingTop(), true);
                this.lastScrollToDown = i6 < 0;
                if (Build.VERSION.SDK_INT >= 31 && ContactsActivity.this.scrollableViewNoiseSuppressor != null) {
                    ContactsActivity.this.scrollableViewNoiseSuppressor.onScrolled(i5, i6);
                    ContactsActivity.this.lambda$createView$2();
                }
                ContactsActivity.this.checkUi_searchFieldY();
            }
        });
        if (!this.createSecretChat && !this.returnAsResult) {
            FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
            this.floatingButton = fragmentFloatingButton;
            this.contentView.addView(fragmentFloatingButton, FragmentFloatingButton.createDefaultLayoutParams());
            this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$createView$0(view);
                            break;
                        default:
                            this.f$0.lambda$createView$7(view);
                            break;
                    }
                }
            });
            this.floatingButton.setAnimation(R.raw.write_contacts_fab_icon, 44);
            this.floatingButton.imageView.getAnimatedDrawable().setCurrentFrame(this.floatingButton.imageView.getAnimatedDrawable().getFramesCount() - 1);
            this.floatingButton.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.initialSearchString;
        if (str != null) {
            this.actionBar.openSearchField(str, false);
            this.initialSearchString = null;
        }
        this.contentView.addView(this.actionBar);
        HeaderShadowView headerShadowView = new HeaderShadowView(context, this.parentLayout);
        this.headerShadowView = headerShadowView;
        headerShadowView.setShadowVisible(false, false);
        this.contentView.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.actionBar.setDrawBlurBackground(this.contentView);
        this.animatorSearchFieldVisible.setValue(true, false);
        checkUi_searchFieldHint();
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public final boolean clipWithGradient(int i5) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i5);
            }

            @Override
            public int getBottomOffset(int i5) {
                return ContactsActivity.this.additionFloatingButtonOffset + ContactsActivity.this.navigationBarHeight;
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
            public final int getTopOffset(int i5) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i5);
            }

            @Override
            public void onBottomOffsetChange(float f2) {
                ContactsActivity contactsActivity = ContactsActivity.this;
                contactsActivity.additionalFloatingTranslation = Math.max(0.0f, (f2 - contactsActivity.navigationBarHeight) - ContactsActivity.this.additionFloatingButtonOffset);
                ContactsActivity.this.checkUi_floatingButtonPosition();
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
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.getRootAnimatedInsetsListener().listeners.add(this);
        }
        View view = this.fragmentView;
        ContactsActivity$$ExternalSyntheticLambda8 contactsActivity$$ExternalSyntheticLambda8 = new ContactsActivity$$ExternalSyntheticLambda8(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, contactsActivity$$ExternalSyntheticLambda8);
        return this.fragmentView;
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
        if (i != NotificationCenter.encryptedChatCreated) {
            if (i != NotificationCenter.closeChats || this.creatingChat) {
                return;
            }
            removeSelfFromStack(true);
            return;
        }
        if (this.createSecretChat && this.creatingChat) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            Bundle bundle = new Bundle();
            bundle.putInt("enc_id", encryptedChat.id);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            presentFragment(new ChatActivity(bundle), false);
        }
    }

    @Override
    public View getAnimatedInsetsTargetView() {
        return this.fragmentView;
    }

    @Override
    public BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    public RecyclerListView getListView() {
        return this.listView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 13);
        if (!this.hasMainTabs) {
            arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        }
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 524288, new Class[]{LetterSectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollText));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, introActivity$$ExternalSyntheticLambda0, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            arrayList.add(new ThemeDescription(fragmentFloatingButton.imageView, 8, null, null, null, null, Theme.key_chats_actionIcon));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, 32, null, null, null, null, Theme.key_chats_actionBackground));
            arrayList.add(new ThemeDescription(this.floatingButton.imageView, 65568, null, null, null, null, Theme.key_chats_actionPressedBackground));
        }
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, Theme.key_chats_verifiedCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, Theme.key_chats_verifiedBackground));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_offlinePaint, null, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_onlinePaint, null, null, Theme.key_windowBackgroundWhiteBlueText3));
        TextPaint[] textPaintArr = Theme.dialogs_namePaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, null, -1, null, Theme.key_chats_name));
        TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ProfileSearchCell.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, null, -1, null, Theme.key_chats_secretName));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onAnimatedInsetsChanged(View view, WindowInsetsCompat windowInsetsCompat) {
        this.imeInsetAnimatedHeight = windowInsetsCompat.mImpl.getInsets(8).bottom;
        checkUi_emptyView();
    }

    @Override
    public void onAnimatedInsetsFinished() {
    }

    @Override
    public void onAnimatedInsetsStarted() {
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (this.actionBar.isActionModeShowed()) {
            if (z) {
                hideActionMode();
            }
            return false;
        }
        if (!this.animatorSearchHasQuery.value) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.searchField.editText.getText().clear();
        }
        return false;
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
            if (!parentActivity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                askForPermissons(true);
                return;
            }
            AlertDialog alertDialogCreate = AlertsCreator.createContactsPermissionDialog(parentActivity, new ContactsActivity$$ExternalSyntheticLambda3(this, 0)).create();
            this.permissionDialog = alertDialogCreate;
            showDialog(alertDialogCreate);
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

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
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
    public void onInsets(int i, int i2, int i3, int i4) {
        this.navigationBarHeight = i4;
        checkUi_listViewPadding();
        checkUi_floatingButtonPosition();
        checkUi_emptyView();
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

    @Override
    public void onPause() {
        super.onPause();
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.closeSearchField();
        }
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
                    editorEdit.putBoolean("askAboutContacts", false).putBoolean("askAboutContacts2", false).apply();
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
    public void onResume() {
        super.onResume();
        ContactsAdapter contactsAdapter = this.listViewAdapter;
        if (contactsAdapter != null) {
            contactsAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void setDelegate(ContactsActivityDelegate contactsActivityDelegate) {
        this.delegate = contactsActivityDelegate;
    }

    public void setIgnoreUsers(LongSparseArray longSparseArray) {
        this.ignoreUsers = longSparseArray;
    }

    public void setInitialSearchString(String str) {
        this.initialSearchString = str;
    }

    public boolean addOrRemoveSelectedContact(ProfileSearchCell profileSearchCell) {
        long dialogId = profileSearchCell.getDialogId();
        int iIndexOfKey = this.selectedContacts.indexOfKey(dialogId);
        CheckBox2 checkBox2 = profileSearchCell.checkBox;
        if (iIndexOfKey >= 0) {
            this.selectedContacts.remove(dialogId);
            if (checkBox2 != null) {
                checkBox2.setChecked(false, true);
            }
        } else if (profileSearchCell.getUser() != null) {
            this.selectedContacts.put(profileSearchCell.getUser(), dialogId);
            if (checkBox2 != null) {
                checkBox2.setChecked(true, true);
            }
            return true;
        }
        return false;
    }
}
