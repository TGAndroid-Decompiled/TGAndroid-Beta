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
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.collection.LongSparseArray;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
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
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LetterSectionCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ContactsEmptyView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;

public final class ContactsActivity extends BaseFragment implements FactorAnimator.Target, NotificationCenter.NotificationCenterDelegate, MainTabsActivity.TabFragmentDelegate, WindowAnimatedInsetsProvider.Listener {
    public final int ADDITIONAL_LIST_HEIGHT_DP;
    public ImageView actionModeCloseView;
    public int additionFloatingButtonOffset;
    public int additionNavigationBarHeight;
    public float additionalFloatingTranslation;
    public boolean allowBots;
    public boolean allowSelf;
    public boolean allowUsernameSearch;
    public final BoolAnimator animatorSearchFieldVisible;
    public final BoolAnimator animatorSearchHasQuery;
    public boolean askAboutContacts;
    public BackDrawable backDrawable;
    public long channelId;
    public long chatId;
    public boolean checkPermission;
    public LoginActivity.AnonymousClass2 contentView;
    public boolean createSecretChat;
    public boolean creatingChat;
    public ContactsActivityDelegate delegate;
    public boolean destroyAfterSelect;
    public boolean disableSections;
    public StickerEmptyView emptyView;
    public FragmentFloatingButton floatingButton;
    public boolean floatingButtonVisibleByScroll;
    public boolean hasMainTabs;
    public ChatActivity.AnonymousClass27 headerShadowView;
    public ViewGroupPartRenderer iBlur3Capture;
    public final RectF iBlur3PositionActionBar;
    public final RectF iBlur3PositionMainTabs;
    public final ArrayList iBlur3Positions;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public int imeInsetAnimatedHeight;
    public String initialSearchString;
    public boolean lastIsEmpty;
    public LinearLayoutManager layoutManager;
    public RecyclerListView listView;
    public AnonymousClass4 listViewAdapter;
    public int navigationBarHeight;
    public boolean needFinishFragment;
    public boolean needForwardCount;
    public boolean needPhonebook;
    public boolean onlyUsers;
    public AlertDialog permissionDialog;
    public long permissionRequestTime;
    public boolean resetDelegate;
    public boolean returnAsResult;
    public boolean scheduled;
    public RecyclerAnimationScrollHelper scrollHelper;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public FragmentSearchField searchField;
    public ActionBarMenuItem searchItem;
    public AnonymousClass3 searchListViewAdapter;
    public String searchQuery;
    public boolean searchWas;
    public boolean searching;
    public String selectAlertString;
    public final LongSparseArray selectedContacts;
    public NumberTextView selectedContactsCountTextView;
    public boolean sortByName;
    public final LaunchActivity.AnonymousClass18 sortContactsRunnable;
    public ActionBarMenuItem sortItem;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public AnonymousClass1() {
        }

        @Override
        public final void onItemClick(int i) {
            ContactsActivity contactsActivity = ContactsActivity.this;
            if (i == -1) {
                if (((BaseFragment) contactsActivity).actionBar.isActionModeShowed()) {
                    contactsActivity.hideActionMode$2();
                    return;
                } else {
                    contactsActivity.finishFragment();
                    return;
                }
            }
            if (i != 100) {
                if (i != 1) {
                    if (i == 0) {
                        contactsActivity.listView.smoothScrollToPosition(0);
                        AndroidUtilities.doOnPreDraw(contactsActivity.searchField.editText, new ComposeDrawable$$ExternalSyntheticLambda0(this, 5));
                        return;
                    }
                    return;
                }
                SharedConfig.toggleSortContactsByName();
                boolean z = SharedConfig.sortContactsByName;
                contactsActivity.sortByName = z;
                contactsActivity.listViewAdapter.setSortType(z ? 1 : 2, false);
                contactsActivity.sortItem.setIcon(contactsActivity.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
            LongSparseArray longSparseArray = contactsActivity.selectedContacts;
            int size = longSparseArray.size();
            AlertDialog alertDialog = builder.alertDialog;
            if (size == 1) {
                alertDialog.title = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog.message = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog.title = LocaleController.formatPluralString("DeleteContactsTitle", longSparseArray.size(), new Object[0]);
                alertDialog.message = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ContactsActivity$$ExternalSyntheticLambda7(contactsActivity));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(0));
            alertDialog.show();
            alertDialog.redPositive();
        }
    }

    public final class AnonymousClass3 extends SearchAdapter {
        public AnonymousClass3(Context context, LongSparseArray longSparseArray, boolean z, boolean z2, boolean z3) {
            super(context, longSparseArray, z, z2, z3);
        }
    }

    public final class AnonymousClass4 extends ContactsAdapter {
        public AnonymousClass4(Context context, int i, boolean z, LongSparseArray longSparseArray, int i2) {
            super(context, i, z, longSparseArray, i2);
        }

        @Override
        public final int getSectionCount() {
            int size;
            boolean z;
            boolean zIsEmpty;
            boolean z2 = false;
            this.isEmpty = false;
            int i = this.sortType;
            int i2 = this.currentAccount;
            int i3 = this.onlyUsers;
            int i4 = 1;
            if (i != 2) {
                size = (i3 == 2 ? ContactsController.getInstance(i2).sortedUsersMutualSectionsArray : ContactsController.getInstance(i2).sortedUsersSectionsArray).size();
                if (size == 0) {
                    this.isEmpty = true;
                }
                if (i3 == 0) {
                    size++;
                }
                z = this.isAdmin;
                if (z) {
                    size++;
                }
                zIsEmpty = ContactsController.getInstance(i2).phoneBookContacts.isEmpty();
                this.hasPhonebook = !zIsEmpty;
                if (this.isEmpty && this.needPhonebook && !z && i3 == 0) {
                    z2 = true;
                }
                this.isEmptyWithMainTabs = z2;
                if (z2) {
                    i4 = size;
                } else if (!zIsEmpty) {
                    i4 = 2;
                }
                ContactsActivity contactsActivity = ContactsActivity.this;
                ContactsActivity.access$900(contactsActivity);
                contactsActivity.checkUi_sortItem();
                contactsActivity.checkUi_searchFieldHint();
                return i4;
            }
            this.isEmpty = this.onlineContacts.isEmpty();
            size = 1;
            if (i3 == 0) {
                size++;
            }
            z = this.isAdmin;
            if (z) {
                size++;
            }
            zIsEmpty = ContactsController.getInstance(i2).phoneBookContacts.isEmpty();
            this.hasPhonebook = !zIsEmpty;
            if (this.isEmpty) {
                z2 = true;
            }
            this.isEmptyWithMainTabs = z2;
            if (z2) {
                i4 = size;
            } else if (!zIsEmpty) {
                i4 = 2;
            }
            ContactsActivity contactsActivity2 = ContactsActivity.this;
            ContactsActivity.access$900(contactsActivity2);
            contactsActivity2.checkUi_sortItem();
            contactsActivity2.checkUi_searchFieldHint();
            return i4;
        }

        @Override
        public final void notifyDataSetChanged() {
            update(false);
            ContactsActivity contactsActivity = ContactsActivity.this;
            RecyclerListView recyclerListView = contactsActivity.listView;
            if (recyclerListView == null || recyclerListView.getAdapter() != this) {
                return;
            }
            int itemCount = getItemCount();
            if (contactsActivity.needPhonebook) {
                contactsActivity.listView.setFastScrollVisible(itemCount != 2);
            } else {
                contactsActivity.listView.setFastScrollVisible(itemCount != 0);
            }
        }
    }

    public interface ContactsActivityDelegate {
        void didSelectContact(TLRPC.User user);
    }

    public ContactsActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchFieldVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 350L, false);
        this.animatorSearchHasQuery = new BoolAnimator(2, this, cubicBezierInterpolator, 350L, false);
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
        this.sortContactsRunnable = new LaunchActivity.AnonymousClass18(this, 8);
        ArrayList arrayList = new ArrayList();
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

    public static void access$3100(ContactsActivity contactsActivity) {
        float y = contactsActivity.listView.getY() + contactsActivity.listView.getPaddingTop();
        for (int i = 0; i < contactsActivity.listView.getChildCount(); i++) {
            View childAt = contactsActivity.listView.getChildAt(i);
            contactsActivity.listView.getClass();
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == 0) {
                RecyclerView.ItemDecoration itemDecorationAt = contactsActivity.listView.getItemDecorationAt(i);
                Rect rect = AndroidUtilities.rectTmp2;
                RecyclerListView recyclerListView = contactsActivity.listView;
                itemDecorationAt.getItemOffsets(rect, childAt, recyclerListView, recyclerListView.mState);
                y = contactsActivity.listView.getY() + (childAt.getY() - (contactsActivity.listViewAdapter.isEmptyWithMainTabs ? 0 : rect.top));
                break;
            }
            if (childAdapterPosition > 0) {
                y = -AndroidUtilities.dp(52.0f);
                break;
            }
        }
        contactsActivity.searchField.setTranslationY(AndroidUtilities.lerp(y, contactsActivity.listView.getY() + contactsActivity.listView.getPaddingTop(), contactsActivity.animatorSearchHasQuery.floatValue) - AndroidUtilities.dp(48.0f));
        contactsActivity.animatorSearchFieldVisible.setValue(y > (contactsActivity.listView.getY() + ((float) contactsActivity.listView.getPaddingTop())) - ((float) AndroidUtilities.dp(12.0f)), true);
    }

    public static void access$900(ContactsActivity contactsActivity) {
        AnonymousClass4 anonymousClass4;
        FragmentFloatingButton fragmentFloatingButton = contactsActivity.floatingButton;
        if (fragmentFloatingButton == null || (anonymousClass4 = contactsActivity.listViewAdapter) == null) {
            return;
        }
        fragmentFloatingButton.animatorButtonVisible.setValue((!contactsActivity.floatingButtonVisibleByScroll || contactsActivity.searching || anonymousClass4.isEmpty) ? false : true, true);
    }

    public final void askForPermissons(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null || !UserConfig.getInstance(this.currentAccount).syncContacts || parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return;
        }
        if (z && this.askAboutContacts) {
            showDialog(AlertsCreator.createContactsPermissionDialog(parentActivity, new ContactsActivity$$ExternalSyntheticLambda3(this, 1)).alertDialog);
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

    public final void blur3_InvalidateBlur$3() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int iDp2 = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp + iDp2);
        RectF rectF = this.iBlur3PositionMainTabs;
        rectF.set(0.0f, iDp3, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        downscaleScrollableNoiseSuppressor.setupRenderNodes(this.hasMainTabs ? 2 : 1, this.iBlur3Positions);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override
    public final boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        RecyclerListView recyclerListView = this.listView;
        return recyclerListView == null || recyclerListView.getFastScroll() == null || !this.listView.getFastScroll().pressed;
    }

    public final void checkUi_floatingButtonPosition() {
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(((-this.navigationBarHeight) - this.additionFloatingButtonOffset) - this.additionalFloatingTranslation);
        }
    }

    public final void checkUi_listViewPadding$2() {
        RecyclerListView recyclerListView = this.listView;
        int i = this.ADDITIONAL_LIST_HEIGHT_DP;
        recyclerListView.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i + 44), 0, AndroidUtilities.dp(i) + this.navigationBarHeight + this.additionNavigationBarHeight);
    }

    public final void checkUi_searchFieldHint() {
        AnonymousClass4 anonymousClass4 = this.listViewAdapter;
        boolean z = anonymousClass4 != null && anonymousClass4.isEmpty;
        if (this.lastIsEmpty != z || TextUtils.isEmpty(this.searchField.editText.getHint())) {
            this.searchField.editText.setHint(LocaleController.getString(z ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.searchField.editText.setContentDescription(LocaleController.getString(z ? R.string.SearchPeopleByUsername : R.string.SearchContacts));
            this.lastIsEmpty = z;
        }
    }

    public final void checkUi_sortItem() {
        float f = 1.0f - this.animatorSearchHasQuery.floatValue;
        AnonymousClass4 anonymousClass4 = this.listViewAdapter;
        FragmentFloatingButton.setAnimatedVisibility(this.sortItem, f * ((anonymousClass4 == null || anonymousClass4.isEmpty) ? 0.0f : 1.0f));
    }

    @Override
    public final ActionBar createActionBar(Context context) {
        ActionBar actionBarCreateActionBar = super.createActionBar(context);
        actionBarCreateActionBar.useContainerForTitles = true;
        if (actionBarCreateActionBar.titlesContainer == null) {
            PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(actionBarCreateActionBar.getContext(), 1);
            actionBarCreateActionBar.titlesContainer = anonymousClass19;
            actionBarCreateActionBar.addView(anonymousClass19);
        }
        actionBarCreateActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.setAddToContainer(false);
        if (actionBarCreateActionBar.additionalSubTitleOverlayContainer == null) {
            ActionBar.AnonymousClass9 anonymousClass9 = new ActionBar.AnonymousClass9(actionBarCreateActionBar, actionBarCreateActionBar.getContext(), actionBarCreateActionBar.resourcesProvider, actionBarCreateActionBar.ellipsizeSpanAnimator);
            actionBarCreateActionBar.additionalSubTitleOverlayContainer = anonymousClass9;
            anonymousClass9.setClipChildren(false);
            actionBarCreateActionBar.addView(actionBarCreateActionBar.additionalSubTitleOverlayContainer);
        }
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBarCreateActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        return actionBarCreateActionBar;
    }

    @Override
    public final View createView(Context context) {
        ?? CanUserDoAdminAction;
        int i;
        int i2 = 9;
        int i3 = 2;
        final int i4 = 0;
        this.searching = false;
        this.searchWas = false;
        final int i5 = 1;
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
        fragmentSearchField.isSectionBackground = true;
        fragmentSearchField.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        fragmentSearchField.updateColors$1();
        this.searchField.setPivotY(0.0f);
        ActionBar.AnonymousClass1 anonymousClass1CreateActionMode = this.actionBar.createActionMode(null);
        anonymousClass1CreateActionMode.setBackgroundColor(0);
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
                    switch (i4) {
                        case 0:
                            this.f$0.hideActionMode$2();
                            break;
                        default:
                            this.f$0.lambda$createView$7$1$1();
                            break;
                    }
                }
            });
            anonymousClass1CreateActionMode.addView(this.actionModeCloseView, LayoutHelper.createLinear(54, 54, 16));
        }
        NumberTextView numberTextView = new NumberTextView(anonymousClass1CreateActionMode.getContext());
        this.selectedContactsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedContactsCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedContactsCountTextView.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        anonymousClass1CreateActionMode.addView(this.selectedContactsCountTextView, LayoutHelper.createLinear(1.0f, 0, -1, this.hasMainTabs ? 18 : 72, 0, 0));
        this.selectedContactsCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        anonymousClass1CreateActionMode.addItemWithWidth(100, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.SearchContacts));
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.searchField.editText;
        anonymousClass4.addTextChangedListener(new SearchTextWatcher(anonymousClass4, new TopicsFragment.AnonymousClass3(this, 8)));
        if (!this.createSecretChat && !this.returnAsResult) {
            ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateMenu.addItem(1, this.sortByName ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            this.sortItem = actionBarMenuItemAddItem2;
            actionBarMenuItemAddItem2.setContentDescription(LocaleController.getString(R.string.AccDescrContactSorting));
        }
        this.listView = new RecyclerListView(context, null);
        this.searchListViewAdapter = new AnonymousClass3(context, this.selectedContacts, this.allowUsernameSearch, this.allowBots, this.allowSelf);
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
        AnonymousClass4 anonymousClass5 = new AnonymousClass4(context, this.onlyUsers ? 1 : 0, this.needPhonebook, this.selectedContacts, CanUserDoAdminAction);
        this.listViewAdapter = anonymousClass5;
        if (this.sortItem != null) {
            i = this.sortByName ? 1 : 2;
        } else {
            i = 0;
        }
        anonymousClass5.setSortType(i, false);
        this.listViewAdapter.disableSections = this.disableSections;
        LoginActivity.AnonymousClass2 anonymousClass2 = new LoginActivity.AnonymousClass2(this, context, i3);
        this.contentView = anonymousClass2;
        this.fragmentView = anonymousClass2;
        RecyclerListView recyclerListView = this.listView;
        Objects.requireNonNull(recyclerListView);
        this.iBlur3Capture = new ViewGroupPartRenderer(recyclerListView, anonymousClass2, new TopicsFragment$$ExternalSyntheticLambda7(recyclerListView, 3));
        this.listView.addEdgeEffectListener(new ContactsActivity$$ExternalSyntheticLambda6(this, i4));
        this.listView.setSections(true);
        this.contentView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        flickerLoadingView.setViewType(29);
        flickerLoadingView.showDate = false;
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, context, flickerLoadingView);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.showProgress(true, false);
        this.emptyView.title.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.contentView.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 64.0f, 12.0f, 0.0f));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.setDurations(150L);
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
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
        recyclerAnimationScrollHelper.scrollListener = new ContactsActivity$$ExternalSyntheticLambda7(this);
        LoginActivity.AnonymousClass2 anonymousClass3 = this.contentView;
        RecyclerListView recyclerListView2 = this.listView;
        float f = -this.ADDITIONAL_LIST_HEIGHT_DP;
        anonymousClass3.addView(recyclerListView2, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, f, 0.0f, f));
        this.contentView.addView(this.searchField, LayoutHelper.createFrame(-1, 52.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        this.listView.setEmptyView(this.emptyView);
        RecyclerListView recyclerListView3 = this.listView;
        recyclerListView3.animateEmptyView = true;
        recyclerListView3.emptyViewAnimationType = 0;
        recyclerListView3.setOnItemClickListener(new LaunchActivity$$ExternalSyntheticLambda9(this, (int) CanUserDoAdminAction, i2));
        this.listView.setOnItemLongClickListener(new ContactsActivity$$ExternalSyntheticLambda7(this));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            public boolean scrollUpdated;
            public boolean scrollingManually;

            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i6) {
                if (i6 != 1) {
                    this.scrollingManually = false;
                    return;
                }
                ContactsActivity contactsActivity = ContactsActivity.this;
                if ((contactsActivity.searching && contactsActivity.searchWas) || contactsActivity.searchField.editText.isFocused()) {
                    AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
                }
                this.scrollingManually = true;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                ContactsActivity contactsActivity = ContactsActivity.this;
                int iFindFirstVisibleItemPosition = contactsActivity.layoutManager.findFirstVisibleItemPosition();
                View childAt = recyclerView.getChildAt(0);
                int top = childAt != null ? childAt.getTop() : 0;
                if (contactsActivity.floatingButton != null && !contactsActivity.searching) {
                    boolean z = i7 > 0;
                    if (i7 != 0 && this.scrollUpdated && (z || this.scrollingManually)) {
                        contactsActivity.floatingButtonVisibleByScroll = !z;
                        ContactsActivity.access$900(contactsActivity);
                    }
                    this.scrollUpdated = true;
                }
                ((BoolAnimator) contactsActivity.headerShadowView.this$0).setValue(iFindFirstVisibleItemPosition != 0 || top < contactsActivity.listView.getPaddingTop(), true);
                if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = contactsActivity.scrollableViewNoiseSuppressor) != null) {
                    downscaleScrollableNoiseSuppressor.onScrolled(i6, i7);
                    contactsActivity.blur3_InvalidateBlur$3();
                }
                ContactsActivity.access$3100(contactsActivity);
            }
        });
        if (!this.createSecretChat && !this.returnAsResult) {
            FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider, false);
            this.floatingButton = fragmentFloatingButton;
            this.contentView.addView(fragmentFloatingButton, FragmentFloatingButton.createDefaultLayoutParams());
            this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
                public final ContactsActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            this.f$0.hideActionMode$2();
                            break;
                        default:
                            this.f$0.lambda$createView$7$1$1();
                            break;
                    }
                }
            });
            this.floatingButton.imageView.setAnimation(R.raw.write_contacts_fab_icon, 44, 44, null);
            this.floatingButton.imageView.getAnimatedDrawable().setCurrentFrame(this.floatingButton.imageView.getAnimatedDrawable().metaData[0] - 1, true, false);
            this.floatingButton.setContentDescription(LocaleController.getString(R.string.CreateNewContact));
        }
        String str = this.initialSearchString;
        if (str != null) {
            this.actionBar.openSearchField(str);
            this.initialSearchString = null;
        }
        this.contentView.addView(this.actionBar);
        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(context, this.parentLayout);
        this.headerShadowView = anonymousClass27;
        ((BoolAnimator) anonymousClass27.this$0).setValue(false, false);
        this.contentView.addView(this.headerShadowView, LayoutHelper.createFrame(-1, 5, 48));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.actionBar.setDrawBlurBackground(this.contentView);
        this.animatorSearchFieldVisible.setValue(true, false);
        checkUi_searchFieldHint();
        setBulletinDelegate(new ChatActivity.AnonymousClass103(this, i2));
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null) {
            launchActivity.rootAnimatedInsetsListener.listeners.add(this);
        }
        View view = this.fragmentView;
        ContactsActivity$$ExternalSyntheticLambda7 contactsActivity$$ExternalSyntheticLambda7 = new ContactsActivity$$ExternalSyntheticLambda7(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, contactsActivity$$ExternalSyntheticLambda7);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        if (i == NotificationCenter.contactsDidLoad) {
            AnonymousClass4 anonymousClass4 = this.listViewAdapter;
            if (anonymousClass4 != null) {
                if (!this.sortByName) {
                    anonymousClass4.setSortType(2, true);
                }
                this.listViewAdapter.notifyDataSetChanged();
            }
            if (this.searchListViewAdapter != null) {
                RecyclerView.Adapter adapter = this.listView.getAdapter();
                AnonymousClass3 anonymousClass3 = this.searchListViewAdapter;
                if (adapter == anonymousClass3) {
                    anonymousClass3.searchDialogs(this.searchQuery);
                    return;
                }
                return;
            }
            return;
        }
        if (i != NotificationCenter.updateInterfaces) {
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
                return;
            }
            return;
        }
        int iIntValue = ((Integer) objArr[0]).intValue();
        if (((MessagesController.UPDATE_MASK_AVATAR & iIntValue) != 0 || (MessagesController.UPDATE_MASK_NAME & iIntValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & iIntValue) != 0) && (recyclerListView = this.listView) != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.listView.getChildAt(i3);
                if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(iIntValue);
                }
            }
        }
        if ((iIntValue & MessagesController.UPDATE_MASK_STATUS) == 0 || this.sortByName || this.listViewAdapter == null || this.scheduled) {
            return;
        }
        this.scheduled = true;
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.sortContactsRunnable;
        AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
        AndroidUtilities.runOnUIThread(anonymousClass18, 5000L);
    }

    public final void didSelectResult(TLRPC.User user, boolean z, String str) {
        final EditTextBoldCursor editTextBoldCursor;
        if (!z || this.selectAlertString == null) {
            ContactsActivityDelegate contactsActivityDelegate = this.delegate;
            if (contactsActivityDelegate != null) {
                contactsActivityDelegate.didSelectContact(user);
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
                    BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.BotCantJoinGroups), null).show();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (this.channelId != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.channelId));
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                boolean zCanAddAdmins = ChatObject.canAddAdmins(chat);
                AlertDialog alertDialog = builder.alertDialog;
                if (zCanAddAdmins) {
                    alertDialog.title = LocaleController.getString(R.string.AddBotAdminAlert);
                    alertDialog.message = LocaleController.getString(R.string.AddBotAsAdmin);
                    builder.setPositiveButton(LocaleController.getString(R.string.AddAsAdmin), new RateCallLayout$$ExternalSyntheticLambda1(this, user, str));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                } else {
                    alertDialog.message = LocaleController.getString(R.string.CantAddBotAsAdmin);
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                }
                showDialog(alertDialog);
                return;
            }
        }
        AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog2 = builder2.alertDialog;
        alertDialog2.title = string;
        String stringSimple = LocaleController.formatStringSimple(this.selectAlertString, UserObject.getUserName(user));
        if (user.bot || !this.needForwardCount) {
            editTextBoldCursor = null;
        } else {
            stringSimple = zzkc.m(stringSimple, "\n\n", LocaleController.getString(R.string.AddToTheGroupForwardCount));
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
                public final void afterTextChanged(Editable editable) {
                    try {
                        String string2 = editable.toString();
                        if (string2.isEmpty()) {
                            return;
                        }
                        int iIntValue = Utilities.parseInt((CharSequence) string2).intValue();
                        EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                        if (iIntValue < 0) {
                            editTextBoldCursor2.setText("0");
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                            return;
                        }
                        if (iIntValue > 300) {
                            editTextBoldCursor2.setText("300");
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                            return;
                        }
                        if (string2.equals("" + iIntValue)) {
                            return;
                        }
                        editTextBoldCursor2.setText("" + iIntValue);
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            builder2.setView(editTextBoldCursor);
        }
        alertDialog2.message = stringSimple;
        builder2.setPositiveButton(LocaleController.getString(R.string.OK), new VoIPFragment$$ExternalSyntheticLambda42(this, user, editTextBoldCursor, 8));
        builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog2);
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

    @Override
    public final View getAnimatedInsetsTargetView() {
        return this.fragmentView;
    }

    @Override
    public final BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 24);
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
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

    public final void hideActionMode$2() {
        this.actionBar.hideActionMode$1();
        int childCount = this.listView.getChildCount();
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.selectedContacts;
            if (i >= childCount) {
                longSparseArray.clear();
                this.backDrawable.setRotation(0.0f, true);
                return;
            }
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof UserCell) {
                UserCell userCell = (UserCell) childAt;
                if (longSparseArray.indexOfKey(userCell.getDialogId()) >= 0) {
                    userCell.setChecked(false, true);
                }
            } else if (childAt instanceof ProfileSearchCell) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) childAt;
                if (longSparseArray.indexOfKey(profileSearchCell.getDialogId()) >= 0) {
                    profileSearchCell.setChecked(false, true);
                }
            }
            i++;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$askForPermissons$13(int i) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", false).commit();
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.contactsPermissionBadgeCheck, new Object[0]);
        this.askAboutContacts = i != 0;
        if (i == 0) {
            return;
        }
        askForPermissons(false);
    }

    public final void lambda$createView$4(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(this.currentAccount).getInviteText(1));
            getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void lambda$createView$5(View view, int i, int i2) {
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        AnonymousClass3 anonymousClass3 = this.searchListViewAdapter;
        LongSparseArray longSparseArray = this.selectedContacts;
        if (adapter == anonymousClass3) {
            anonymousClass3.getClass();
            Object item = this.searchListViewAdapter.getItem(i2);
            if (!longSparseArray.isEmpty() && (view instanceof ProfileSearchCell)) {
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
                NewContactBottomSheet newContactBottomSheet = new NewContactBottomSheet(getParentActivity(), this);
                newContactBottomSheet.setInitialPhoneNumber(str, true);
                newContactBottomSheet.show();
                return;
            }
            TLRPC.User user = (TLRPC.User) item;
            AnonymousClass3 anonymousClass4 = this.searchListViewAdapter;
            int size = anonymousClass4.searchResult.size();
            int size2 = anonymousClass4.unregistredContacts.size();
            SearchAdapterHelper searchAdapterHelper = anonymousClass4.searchAdapterHelper;
            int size3 = searchAdapterHelper.globalSearch.size();
            int size4 = searchAdapterHelper.phonesSearch.size();
            if ((i2 < 0 || i2 >= size) && ((i2 <= size || i2 >= size + size2 + 1) && ((i2 <= size + size2 + 1 || i2 >= size + size4 + size2 + 1) && i2 > size + size4 + size2 + 1 && i2 <= size3 + size4 + size + size2 + 1))) {
                ArrayList<TLRPC.User> arrayList = new ArrayList<>();
                arrayList.add(user);
                getMessagesController().putUsers(arrayList, false);
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, false, true);
            }
            if (this.returnAsResult) {
                didSelectResult(user, true, null);
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
        this.listViewAdapter.getClass();
        int sectionForPosition = this.listViewAdapter.getSectionForPosition(i2);
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
        if (!longSparseArray.isEmpty() && (view instanceof UserCell)) {
            showOrUpdateActionMode((UserCell) view);
            return;
        }
        if ((this.onlyUsers && i == 0) || sectionForPosition != 0) {
            Object item2 = this.listViewAdapter.getItem(this.listViewAdapter.getSectionForPosition(i2), this.listViewAdapter.getPositionInSectionForPosition(i2));
            if (item2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) item2;
                if (this.returnAsResult) {
                    didSelectResult(user2, true, null);
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
            if (item2 instanceof ContactsController.Contact) {
                ContactsController.Contact contact2 = (ContactsController.Contact) item2;
                String str2 = !contact2.phones.isEmpty() ? contact2.phones.get(0) : null;
                if (str2 == null || getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.InviteUser);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.message = string;
                alertDialog.title = LocaleController.getString(R.string.AppName);
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new RateCallLayout$$ExternalSyntheticLambda1(25, this, str2));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog);
                return;
            }
            return;
        }
        if (this.needPhonebook) {
            if (positionInSectionForPosition != 0) {
                if (positionInSectionForPosition == 1) {
                    presentFragment(new CallLogActivity(null));
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

    public final void lambda$createView$7$1$1() {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
        } else {
            new NewContactBottomSheet(getParentActivity(), this).show();
        }
    }

    public final void lambda$getThemeDescriptions$14() {
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
            actionBar.updateColors$1();
        }
        LoginActivity.AnonymousClass2 anonymousClass2 = this.contentView;
        if (anonymousClass2 != null) {
            anonymousClass2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        }
    }

    @Override
    public final void onAnimatedInsetsChanged(WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.mImpl.getInsets(8).bottom;
        this.imeInsetAnimatedHeight = i;
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.setKeyboardHeight(Math.max(this.navigationBarHeight + this.additionNavigationBarHeight, i), false);
        }
    }

    @Override
    public final void onAnimatedInsetsFinished() {
    }

    @Override
    public final void onAnimatedInsetsStarted() {
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.actionBar.isActionModeShowed()) {
            if (z) {
                hideActionMode$2();
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
    public final void onBecomeFullyVisible() {
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
            AlertDialog alertDialog = AlertsCreator.createContactsPermissionDialog(parentActivity, new ContactsActivity$$ExternalSyntheticLambda3(this, 0)).alertDialog;
            this.permissionDialog = alertDialog;
            showDialog(alertDialog);
        }
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        AlertDialog alertDialog = this.permissionDialog;
        if (alertDialog == null || dialog != alertDialog || getParentActivity() == null || !this.askAboutContacts) {
            return;
        }
        askForPermissons(false);
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        BoolAnimator boolAnimator = this.animatorSearchHasQuery;
        BoolAnimator boolAnimator2 = this.animatorSearchFieldVisible;
        if (i == 0) {
            FragmentFloatingButton.setAnimatedVisibility(this.searchItem, (1.0f - boolAnimator.floatValue) * (1.0f - boolAnimator2.floatValue));
        } else if (i == 2) {
            FragmentFloatingButton.setAnimatedVisibility(this.searchItem, (1.0f - boolAnimator.floatValue) * (1.0f - boolAnimator2.floatValue));
            checkUi_sortItem();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
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
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.encryptedChatCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        this.delegate = null;
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.navigationBarHeight = i4;
        checkUi_listViewPadding$2();
        checkUi_floatingButtonPosition();
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.setKeyboardHeight(Math.max(this.navigationBarHeight + this.additionNavigationBarHeight, this.imeInsetAnimatedHeight), false);
        }
    }

    @Override
    public final void onParentScrollToTop() {
        if (this.layoutManager.findFirstVisibleItemPosition() < 15) {
            this.listView.smoothScrollToPosition(0);
        } else {
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = this.scrollHelper;
            recyclerAnimationScrollHelper.scrollDirection = 1;
            recyclerAnimationScrollHelper.scrollToPosition(0, 0, false, false);
        }
        this.animatorSearchFieldVisible.setValue(true, true);
    }

    @Override
    public final void onPause() {
        super.onPause();
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.closeSearchField(true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
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
    public final void onResume() {
        super.onResume();
        AnonymousClass4 anonymousClass4 = this.listViewAdapter;
        if (anonymousClass4 != null) {
            anonymousClass4.notifyDataSetChanged();
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void setDelegate(LoginActivity$$ExternalSyntheticLambda31 loginActivity$$ExternalSyntheticLambda31) {
        this.delegate = loginActivity$$ExternalSyntheticLambda31;
    }

    public final void setInitialSearchString(String str) {
        this.initialSearchString = str;
    }

    public final void showOrUpdateActionMode(ViewGroup viewGroup) {
        boolean z;
        boolean z2 = viewGroup instanceof UserCell;
        boolean z3 = false;
        LongSparseArray longSparseArray = this.selectedContacts;
        if (z2) {
            UserCell userCell = (UserCell) viewGroup;
            long dialogId = userCell.getDialogId();
            if (longSparseArray.indexOfKey(dialogId) >= 0) {
                longSparseArray.remove(dialogId);
                userCell.setChecked(false, true);
            } else if (userCell.getCurrentObject() instanceof TLRPC.User) {
                longSparseArray.put((TLRPC.User) userCell.getCurrentObject(), dialogId);
                userCell.setChecked(true, true);
                z = true;
            }
            z = false;
        } else {
            if (!(viewGroup instanceof ProfileSearchCell)) {
                return;
            }
            ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewGroup;
            long dialogId2 = profileSearchCell.getDialogId();
            if (longSparseArray.indexOfKey(dialogId2) >= 0) {
                longSparseArray.remove(dialogId2);
                profileSearchCell.setChecked(false, true);
            } else if (profileSearchCell.getUser() != null) {
                longSparseArray.put(profileSearchCell.getUser(), dialogId2);
                profileSearchCell.setChecked(true, true);
                z = true;
            }
            z = false;
        }
        if (this.actionBar.isActionModeShowed()) {
            if (longSparseArray.isEmpty()) {
                hideActionMode$2();
                return;
            }
            z3 = true;
        } else if (z) {
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.showActionMode(null, null);
            this.backDrawable.setRotation(1.0f, true);
        }
        this.selectedContactsCountTextView.setNumber(longSparseArray.size(), z3);
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }
}
