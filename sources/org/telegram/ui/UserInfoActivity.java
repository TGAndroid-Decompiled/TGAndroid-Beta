package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.bots.BotBiometrySettings;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.SuggestedAffiliateProgramsFragment;
import org.telegram.ui.community.CommunityCreateActivity;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.community.CommunityPendingRequestsActivity;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.web.HistoryFragment;

public final class UserInfoActivity extends UniversalFragment implements NotificationCenter.NotificationCenterDelegate {
    public AnonymousClass1 bioEdit;
    public CharSequence bioInfo;
    public TL_account.TL_birthday birthday;
    public CharSequence birthdayInfo;
    public TLRPC.Chat channel;
    public String currentBio;
    public TL_account.TL_birthday currentBirthday;
    public long currentChannel;
    public String currentFirstName;
    public String currentLastName;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public AnonymousClass1 firstNameEdit;
    public boolean hadHours;
    public boolean hadLocation;
    public AnonymousClass1 lastNameEdit;
    public UniversalFragment.AnonymousClass3 listView;
    public boolean valueSet;
    public int bioInfoHash = Integer.MIN_VALUE;
    public ArrayList bots = new ArrayList();
    public final ArrayList accountNumbers = new ArrayList();
    public final AdminedChannelsFetcher channels = new AdminedChannelsFetcher(this.currentAccount);
    public boolean wasSaved = false;
    public int shiftDp = -4;

    public final class AnonymousClass1 extends EditTextCell {
        public final int $r8$classId;
        public final UserInfoActivity this$0;

        public AnonymousClass1(UserInfoActivity userInfoActivity, Context context, String str, Theme.ResourcesProvider resourcesProvider, int i) {
            super(context, str, false, false, -1, resourcesProvider);
            this.$r8$classId = i;
            this.this$0 = userInfoActivity;
        }

        @Override
        public final void onTextChanged(Editable editable) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.checkDone$4(true);
                    break;
                case 1:
                    this.this$0.checkDone$4(true);
                    break;
                default:
                    UserInfoActivity userInfoActivity = this.this$0;
                    userInfoActivity.checkDone$4(true);
                    userInfoActivity.updateBioInfo();
                    break;
            }
        }

        public AnonymousClass1(UserInfoActivity userInfoActivity, Context context, String str, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, str, true, false, i, resourcesProvider);
            this.$r8$classId = 2;
            this.this$0 = userInfoActivity;
        }
    }

    public final class AnonymousClass4 extends ActionBar.ActionBarMenuOnItemClick {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass4(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onItemClick(int i) {
            switch (this.$r8$classId) {
                case 0:
                    UserInfoActivity userInfoActivity = (UserInfoActivity) this.this$0;
                    if (i != -1) {
                        if (i == 1) {
                            userInfoActivity.processDone$1(true);
                        }
                    } else if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                    }
                    break;
                case 1:
                    if (i == -1) {
                        ((TopicsNotifySettingsFragments) this.this$0).finishFragment();
                    }
                    break;
                case 2:
                    if (i == -1) {
                        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.this$0;
                        if (twoStepVerificationActivity.otherwiseReloginDays < 0) {
                            twoStepVerificationActivity.finishFragment();
                        } else {
                            twoStepVerificationActivity.showSetForcePasswordAlert();
                        }
                    }
                    break;
                case 3:
                    UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.this$0;
                    if (i == -1) {
                        usersSelectActivity.finishFragment();
                    } else if (i == 1) {
                        usersSelectActivity.onDonePressed$1$1();
                    }
                    break;
                case 4:
                    if (i == -1) {
                        ((BotBiometrySettings) this.this$0).finishFragment();
                    }
                    break;
                case 5:
                    if (i == -1) {
                        ((BotWebViewSheet) this.this$0).onCheckDismissByUser();
                    }
                    break;
                case 6:
                    if (i == -1) {
                        ((SuggestedAffiliateProgramsFragment) this.this$0).finishFragment();
                    }
                    break;
                case 7:
                    if (i == -1) {
                        ((CommunityCreateActivity) this.this$0).finishFragment();
                    }
                    break;
                case 8:
                    if (i == -1) {
                        ((CommunityEditActivity) this.this$0).finishFragment();
                    }
                    break;
                case 9:
                    if (i == -1) {
                        ((CommunityPendingRequestsActivity) this.this$0).finishFragment();
                    }
                    break;
                case 10:
                    CommunitySheet.ChatsToAddListPage chatsToAddListPage = (CommunitySheet.ChatsToAddListPage) this.this$0;
                    if (i == -1) {
                        CommunitySheet communitySheet = CommunitySheet.this;
                        if (!communitySheet.onlyChatsMode) {
                            communitySheet.communityPage.listView.adapter.update(false);
                            CommunitySheet.this.viewPager.scrollToPosition$1(0);
                        } else {
                            communitySheet.lambda$showGiftOfferSheet$15();
                        }
                    } else if (i == 3) {
                        CommunitySheet.this.animatorSearchChatsVisible.setValue(true, true);
                        CommunitySheet communitySheet2 = CommunitySheet.this;
                        communitySheet2.setAllowNestedScroll(false);
                        communitySheet2.lastSearchChatsString = null;
                        communitySheet2.foundChatsView.adapter.update(true);
                        communitySheet2.chatsSearchView.editText.getText().clear();
                        communitySheet2.chatsSearchView.editText.requestFocus();
                        AndroidUtilities.showKeyboard(communitySheet2.chatsSearchView.editText);
                    }
                    break;
                case 11:
                    CommunitySheet.CommunityPage communityPage = (CommunitySheet.CommunityPage) this.this$0;
                    if (i == 2) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("community_id", CommunitySheet.this.communityId);
                        CommunitySheet.this.parentFragment.presentFragment(new CommunityEditActivity(bundle));
                        CommunitySheet.this.lambda$showGiftOfferSheet$15();
                    } else if (i == 3) {
                        CommunitySheet.this.animatorSearchMessagesVisible.setValue(true, true);
                        CommunitySheet.this.setAllowNestedScroll(false);
                        CommunitySheet communitySheet3 = CommunitySheet.this;
                        TextUtils.isEmpty(communitySheet3.lastSearchString);
                        communitySheet3.lastSearchString = null;
                        communitySheet3.filteredSearchView.search(0L, communitySheet3.communityId, 0L, 0L, null, false, null, true);
                        CommunitySheet.this.messagesSearchView.editText.getText().clear();
                        CommunitySheet.this.messagesSearchView.editText.requestFocus();
                        AndroidUtilities.showKeyboard(CommunitySheet.this.messagesSearchView.editText);
                    }
                    break;
                case 12:
                    if (i == -1) {
                        CommunitySheet.PendingRequestsPage pendingRequestsPage = (CommunitySheet.PendingRequestsPage) this.this$0;
                        CommunitySheet.this.communityPage.listView.adapter.update(false);
                        CommunitySheet.this.viewPager.scrollToPosition$1(0);
                    }
                    break;
                default:
                    if (i == -1) {
                        HistoryFragment historyFragment = (HistoryFragment) this.this$0;
                        if (!((BaseFragment) historyFragment).actionBar.isActionModeShowed()) {
                            historyFragment.finishFragment();
                        } else {
                            ((BaseFragment) historyFragment).actionBar.hideActionMode$1();
                            historyFragment.selected.clear();
                            AndroidUtilities.forEachViews((RecyclerView) historyFragment.listView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(17));
                        }
                    }
                    break;
            }
        }
    }

    public final class AdminedChannelsFetcher {
        public final int currentAccount;
        public boolean loaded;
        public boolean loading;
        public final ArrayList chats = new ArrayList();
        public final ArrayList callbacks = new ArrayList();
        public final boolean for_personal = true;

        public AdminedChannelsFetcher(int i) {
            this.currentAccount = i;
        }
    }

    public final class ChooseChannelFragment extends UniversalFragment {
        public final AdminedChannelsFetcher channels;
        public boolean invalidateAfterPause = false;
        public String query;
        public ActionBarMenuItem searchItem;
        public final long selectedChannel;
        public final UserInfoActivity$$ExternalSyntheticLambda5 whenSelected;

        public ChooseChannelFragment(AdminedChannelsFetcher adminedChannelsFetcher, long j, UserInfoActivity$$ExternalSyntheticLambda5 userInfoActivity$$ExternalSyntheticLambda5) {
            this.channels = adminedChannelsFetcher;
            this.selectedChannel = j;
            this.whenSelected = userInfoActivity$$ExternalSyntheticLambda5;
            UserInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0 userInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0 = new UserInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0(this, 1);
            if (adminedChannelsFetcher.loaded) {
                userInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0.run();
            } else {
                adminedChannelsFetcher.callbacks.add(userInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0);
            }
        }

        @Override
        public final View createView(Context context) {
            ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search, getResourceProvider());
            actionBarMenuItemAddItem.setIsSearchField$1();
            actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 19);
            this.searchItem = actionBarMenuItemAddItem;
            int i = R.string.Search;
            actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(i));
            this.searchItem.setContentDescription(LocaleController.getString(i));
            this.searchItem.setVisibility(8);
            super.createView(context);
            this.listView.setSections();
            this.actionBar.setAdaptiveBackground(this.listView);
            return this.fragmentView;
        }

        @Override
        public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
            long j;
            boolean z;
            boolean zIsEmpty = TextUtils.isEmpty(this.query);
            long j2 = this.selectedChannel;
            if (zIsEmpty && j2 != 0) {
                UItem uItemAsButton = UItem.asButton(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
                uItemAsButton.red = true;
                UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItemAsButton, 7);
                uItemM.text = null;
                arrayList.add(uItemM);
            }
            if (TextUtils.isEmpty(this.query)) {
                String string = LocaleController.getString(R.string.EditProfileChannelSelect);
                UItem uItem = new UItem(0);
                uItem.text = string;
                arrayList.add(uItem);
            }
            ArrayList arrayList2 = this.channels.chats;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (chat != null && !ChatObject.isMegagroup(chat)) {
                    i2++;
                    if (TextUtils.isEmpty(this.query)) {
                        j = chat.id;
                        UItem uItem2 = new UItem(11);
                        uItem2.include = true;
                        uItem2.dialogId = -j;
                        if (j2 == j) {
                            z = true;
                        } else {
                            z = false;
                        }
                        uItem2.setChecked(z);
                        arrayList.add(uItem2);
                    } else {
                        String lowerCase = this.query.toLowerCase();
                        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                        String lowerCase2 = chat.title.toLowerCase();
                        String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                        if (lowerCase2.startsWith(lowerCase) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", lowerCase, lowerCase2) || strTranslitSafe2.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, strTranslitSafe2)) {
                            j = chat.id;
                            UItem uItem3 = new UItem(11);
                            uItem3.include = true;
                            uItem3.dialogId = -j;
                            if (j2 == j) {
                                z = true;
                            } else {
                                z = false;
                            }
                            uItem3.setChecked(z);
                            arrayList.add(uItem3);
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(this.query) && i2 == 0) {
                UItem uItemAsButton2 = UItem.asButton(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
                uItemAsButton2.accent = true;
                arrayList.add(uItemAsButton2);
            }
            UItem uItem4 = new UItem(7);
            uItem4.text = null;
            arrayList.add(uItem4);
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(i2 > 5 ? 0 : 8);
            }
        }

        @Override
        public final CharSequence getTitle() {
            return LocaleController.getString(R.string.EditProfileChannelTitle);
        }

        @Override
        public final void onClick$1(UItem uItem, View view) {
            int i = uItem.id;
            UserInfoActivity$$ExternalSyntheticLambda5 userInfoActivity$$ExternalSyntheticLambda5 = this.whenSelected;
            if (i == 1) {
                userInfoActivity$$ExternalSyntheticLambda5.run(null);
                finishFragment();
                return;
            }
            if (i != 2) {
                if (uItem.viewType == 12) {
                    finishFragment();
                    userInfoActivity$$ExternalSyntheticLambda5.run(getMessagesController().getChat(Long.valueOf(-uItem.dialogId)));
                    return;
                }
                return;
            }
            this.invalidateAfterPause = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new ChannelCreateActivity(NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(0, "step")));
            } else {
                presentFragment(new ActionIntroActivity(0));
                globalMainSettings.edit().putBoolean("channel_intro", true).apply();
            }
        }

        @Override
        public final boolean onLongClick(UItem uItem, View view) {
            return false;
        }

        @Override
        public final void onResume() {
            super.onResume();
            if (this.invalidateAfterPause) {
                AdminedChannelsFetcher adminedChannelsFetcher = this.channels;
                adminedChannelsFetcher.loaded = false;
                adminedChannelsFetcher.callbacks.add(new UserInfoActivity$ChooseChannelFragment$$ExternalSyntheticLambda0(this, 0));
                this.invalidateAfterPause = false;
            }
        }
    }

    public final class InfoCell extends LinearLayout {
        public boolean accent;
        public final ImageView icon2View;
        public final ImageView iconView;
        public boolean red;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView subtitleView;
        public final LinearLayout textLayout;
        public final TextView titleView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                int i;
                int i2;
                int i3;
                int i4;
                InfoCell infoCell = (InfoCell) view;
                int i5 = uItem.iconResId;
                CharSequence charSequence = uItem.text;
                CharSequence charSequence2 = uItem.subtext;
                boolean z2 = uItem.accent;
                boolean z3 = uItem.red;
                int i6 = uItem.intValue;
                infoCell.accent = z2;
                infoCell.red = z3;
                ImageView imageView = infoCell.iconView;
                imageView.setImageResource(i5);
                ImageView imageView2 = infoCell.icon2View;
                if (i6 != 0) {
                    imageView2.setVisibility(0);
                    imageView2.setImageResource(i6);
                } else {
                    imageView2.setVisibility(8);
                }
                TextView textView = infoCell.titleView;
                textView.setText(charSequence);
                TextView textView2 = infoCell.subtitleView;
                textView2.setText(charSequence2);
                textView2.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
                int iDp = AndroidUtilities.dp(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
                infoCell.textLayout.setPadding(0, iDp, 0, iDp);
                if (infoCell.red) {
                    i = Theme.key_text_RedBold;
                } else {
                    i = infoCell.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText;
                }
                Theme.ResourcesProvider resourcesProvider = infoCell.resourcesProvider;
                int color = Theme.getColor(i, resourcesProvider);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                if (infoCell.red) {
                    i2 = Theme.key_text_RedBold;
                } else {
                    i2 = infoCell.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText;
                }
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), mode));
                if (infoCell.red) {
                    i3 = Theme.key_text_RedRegular;
                } else {
                    i3 = infoCell.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteBlackText;
                }
                textView.setTextColor(Theme.getColor(i3, resourcesProvider));
                if (infoCell.red) {
                    i4 = Theme.key_text_RedRegular;
                } else {
                    i4 = infoCell.accent ? Theme.key_windowBackgroundWhiteBlueText : Theme.key_windowBackgroundWhiteGrayText;
                }
                textView2.setTextColor(Theme.getColor(i4, resourcesProvider));
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new InfoCell(context, resourcesProvider);
            }
        }

        public InfoCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setOrientation(0);
            this.resourcesProvider = resourcesProvider;
            ImageView imageView = new ImageView(context);
            this.iconView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            addView(imageView, LayoutHelper.createLinear(40, 40, 19, 12, 0, 12, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            this.textLayout = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
            addView(linearLayout, LayoutHelper.createLinear(0, -2, 1.0f, 23, 0, 0, 32, 0));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 16.0f);
            TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 0), context);
            this.subtitleView = textViewM;
            textViewM.setTextSize(1, 13.0f);
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.icon2View = imageView2;
            imageView2.setScaleType(scaleType);
            addView(imageView2, LayoutHelper.createLinear(40, 40, 21, 12, 0, 12, 0));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public static String birthdayString(TL_account.TL_birthday tL_birthday) {
        if (tL_birthday == null) {
            return "—";
        }
        if ((tL_birthday.flags & 1) == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2, tL_birthday.month - 1);
            calendar.set(5, tL_birthday.day);
            return LocaleController.getInstance().getFormatterDayMonth().format(calendar.getTimeInMillis());
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, tL_birthday.year);
        calendar2.set(2, tL_birthday.month - 1);
        calendar2.set(5, tL_birthday.day);
        return LocaleController.getInstance().getFormatterBoostExpired().format(calendar2.getTimeInMillis());
    }

    public static boolean birthdaysEqual(TL_account.TL_birthday tL_birthday, TL_account.TL_birthday tL_birthday2) {
        return (tL_birthday == null) != (tL_birthday2 != null) && (tL_birthday == null || (tL_birthday.day == tL_birthday2.day && tL_birthday.month == tL_birthday2.month && tL_birthday.year == tL_birthday2.year));
    }

    public final void checkDone$4(boolean z) {
        boolean z2;
        if (this.doneButton == null) {
            return;
        }
        String str = this.currentFirstName;
        if (str == null) {
            str = "";
        }
        if (TextUtils.equals(str, this.firstNameEdit.getText().toString())) {
            String str2 = this.currentLastName;
            if (str2 == null) {
                str2 = "";
            }
            if (TextUtils.equals(str2, this.lastNameEdit.getText().toString())) {
                String str3 = this.currentBio;
                if (TextUtils.equals(str3 != null ? str3 : "", this.bioEdit.getText().toString()) && birthdaysEqual(this.currentBirthday, this.birthday)) {
                    long j = this.currentChannel;
                    TLRPC.Chat chat = this.channel;
                    if (j != (chat != null ? chat.id : 0L)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = true;
                }
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        this.doneButton.setEnabled(z2);
        if (z) {
            this.doneButton.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.0f).scaleY(z2 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(z2 ? 1.0f : 0.0f);
        this.doneButton.setScaleX(z2 ? 1.0f : 0.0f);
        this.doneButton.setScaleY(z2 ? 1.0f : 0.0f);
    }

    @Override
    public final View createView(Context context) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, context, LocaleController.getString(R.string.EditProfileFirstName), this.resourceProvider, 0);
        this.firstNameEdit = anonymousClass1;
        anonymousClass1.setDivider(true);
        this.firstNameEdit.hideKeyboardOnEnter();
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(this, context, LocaleController.getString(R.string.EditProfileLastName), this.resourceProvider, 1);
        this.lastNameEdit = anonymousClass2;
        anonymousClass2.hideKeyboardOnEnter();
        AnonymousClass1 anonymousClass3 = new AnonymousClass1(this, context, LocaleController.getString(R.string.EditProfileBioHint2), getMessagesController().getAboutLimit(), this.resourceProvider);
        this.bioEdit = anonymousClass3;
        anonymousClass3.setShowLimitWhenEmpty(true);
        updateBioInfo();
        this.bioInfo = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfo2), new UserInfoActivity$$ExternalSyntheticLambda0(this, 0));
        super.createView(context);
        UniversalFragment.AnonymousClass3 anonymousClass4 = super.listView;
        this.listView = anonymousClass4;
        anonymousClass4.setSections();
        this.listView.setClipToPadding(false);
        this.actionBar.setAdaptiveBackground(this.listView);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass4(this, 0));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone$4(false);
        setValue$5();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (i == NotificationCenter.userInfoDidLoad) {
            setValue$5();
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
            if (anonymousClass3 != null) {
                anonymousClass3.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.privacyRulesUpdated) {
            updateBioInfo();
            UniversalFragment.AnonymousClass3 anonymousClass4 = this.listView;
            if (anonymousClass4 != null) {
                anonymousClass4.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updatedChatbot) {
            TL_account.connectedBots connectedbots = BusinessChatbotController.getInstance(this.currentAccount).value;
            if (connectedbots == null || (arrayList = connectedbots.connected_bots) == null) {
                arrayList = new ArrayList<>();
            }
            this.bots = arrayList;
            UniversalFragment.AnonymousClass3 anonymousClass5 = this.listView;
            if (anonymousClass5 != null) {
                anonymousClass5.adapter.update(true);
            }
        }
    }

    @Override
    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        ArrayList<TLRPC.PrivacyRule> privacyRules;
        int i = 2;
        ArrayList arrayList2 = this.accountNumbers;
        arrayList2.clear();
        for (int i2 = 0; i2 < 4; i2++) {
            if (UserConfig.getInstance(i2).isClientActivated() && this.currentAccount != i2) {
                arrayList2.add(Integer.valueOf(i2));
            }
        }
        Collections.sort(arrayList2, new OAuthSheet$$ExternalSyntheticLambda3(20));
        String string = LocaleController.getString(R.string.EditProfileName);
        UItem uItem = new UItem(0);
        uItem.text = string;
        arrayList.add(uItem);
        arrayList.size();
        arrayList.add(UItem.asCustom(this.firstNameEdit));
        arrayList.size();
        arrayList.add(UItem.asCustom(this.lastNameEdit));
        arrayList.add(UItem.asShadow(-1, null));
        arrayList.size();
        arrayList.add(UItem.asCustom(this.bioEdit));
        CharSequence charSequence = this.bioInfo;
        UItem uItem2 = new UItem(7);
        uItem2.text = charSequence;
        arrayList.add(uItem2);
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        String string2 = LocaleController.getString(R.string.EditAccountInfoHeader);
        UItem uItem3 = new UItem(0);
        uItem3.text = string2;
        arrayList.add(uItem3);
        if (currentUser != null) {
            arrayList.size();
            arrayList.add(SettingsActivity.SettingCell.Factory.of(7, -11154873, -14175180, R.drawable.settings_calls, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), currentUser.phone, PhoneFormat.getInstance()), LocaleController.getString(R.string.TapToChangePhone), null));
        }
        arrayList.size();
        if (UserObject.getPublicUsername(currentUser) != null) {
            arrayList.add(SettingsActivity.SettingCell.Factory.of(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, "@" + UserObject.getPublicUsername(currentUser), LocaleController.getString(R.string.Username), null));
        } else {
            arrayList.add(SettingsActivity.SettingCell.Factory.of(8, -1007845, -1996271, R.drawable.filled_chatlist_mention, LocaleController.getString(R.string.AddUsername), null, null));
        }
        arrayList.size();
        TL_account.TL_birthday tL_birthday = this.birthday;
        if (tL_birthday != null) {
            arrayList.add(SettingsActivity.SettingCell.Factory.of(9, -14899731, -15431455, R.drawable.filled_birthday, birthdayString(tL_birthday), LocaleController.getString(R.string.ContactBirthday), null));
        } else {
            arrayList.add(SettingsActivity.SettingCell.Factory.of(9, -14899731, -15431455, R.drawable.filled_birthday, LocaleController.getString(R.string.AddBirthday), null, null));
        }
        if (!getContactsController().getLoadingPrivacyInfo(11) && (privacyRules = getContactsController().getPrivacyRules(11)) != null && this.birthdayInfo == null) {
            String string3 = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
            if (!privacyRules.isEmpty()) {
                for (int i3 = 0; i3 < privacyRules.size(); i3++) {
                    if (privacyRules.get(i3) instanceof TLRPC.TL_privacyValueAllowContacts) {
                        string3 = LocaleController.getString(R.string.EditProfileBirthdayInfoContacts);
                        break;
                    }
                    if ((privacyRules.get(i3) instanceof TLRPC.TL_privacyValueAllowAll) || (privacyRules.get(i3) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                        string3 = LocaleController.getString(R.string.EditProfileBirthdayInfo);
                    }
                }
            }
            this.birthdayInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string3, new UserInfoActivity$$ExternalSyntheticLambda0(this, i)), true);
        }
        CharSequence charSequence2 = this.birthdayInfo;
        UItem uItem4 = new UItem(7);
        uItem4.text = charSequence2;
        arrayList.add(uItem4);
        arrayList.size();
        if (this.channel == null) {
            arrayList.add(SettingsActivity.SettingCell.Factory.of(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), null, LocaleController.getString(R.string.EditProfileChannelAdd)));
        } else {
            arrayList.add(SettingsActivity.SettingCell.Factory.of(3, -1007845, -1996271, R.drawable.msg_filled_menu_channels, LocaleController.getString(R.string.EditProfileChannelTitle), this.channel.title, null));
        }
        if (this.hadHours) {
            arrayList.add(SettingsActivity.SettingCell.Factory.of(4, -881871, -1940716, R.drawable.filled_premium_hours, LocaleController.getString(R.string.EditProfileHours), null, null));
        }
        if (this.hadLocation) {
            arrayList.add(SettingsActivity.SettingCell.Factory.of(5, -765355, -2148011, R.drawable.filled_location, LocaleController.getString(R.string.EditProfileLocation), null, null));
        }
        ArrayList arrayList3 = this.bots;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            arrayList.add(SettingsActivity.SettingCell.Factory.of(6, -3903756, -6335009, R.drawable.premium_ai_editor, TextCell.applyNewSpan(LocaleController.getString(R.string.EditProfileChatAutomation)), null, null));
        } else {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList4 = this.bots;
            int size = arrayList4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList4.get(i4);
                i4++;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (user != null) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(UserObject.getUserName(user));
                }
            }
            arrayList.add(SettingsActivity.SettingCell.Factory.of(6, -3903756, -6335009, R.drawable.premium_ai_editor, LocaleController.getString(R.string.EditProfileChatAutomation), sb, null));
        }
        arrayList.add(UItem.asShadow(-3, LocaleController.getString(R.string.EditProfileChatAutomationInfo)));
        boolean z = UserConfig.getActivatedAccountsCount() < 4;
        if (z) {
            arrayList.size();
            int i5 = R.drawable.outline_add_account;
            String string4 = LocaleController.getString(R.string.AddAccount);
            int i6 = InfoCell.Factory.$r8$clinit;
            UItem uItemOfFactory = UItem.ofFactory(InfoCell.Factory.class);
            uItemOfFactory.id = 10;
            uItemOfFactory.iconResId = i5;
            uItemOfFactory.text = string4;
            uItemOfFactory.subtext = null;
            uItemOfFactory.intValue = 0;
            uItemOfFactory.accent = true;
            arrayList.add(uItemOfFactory);
        }
        if (!arrayList2.isEmpty()) {
            if (!z) {
                String string5 = LocaleController.getString(R.string.SettingsAccounts);
                UItem uItem5 = new UItem(0);
                uItem5.text = string5;
                arrayList.add(uItem5);
            }
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                int iIntValue = ((Integer) arrayList2.get(i7)).intValue();
                int i8 = SettingsActivity.AccountCell.Factory.$r8$clinit;
                UItem uItemOfFactory2 = UItem.ofFactory(SettingsActivity.AccountCell.Factory.class);
                uItemOfFactory2.id = i7;
                uItemOfFactory2.intValue = iIntValue;
                arrayList.add(uItemOfFactory2);
            }
            if (UserConfig.hasPremiumOnAccounts()) {
                UItem uItem6 = new UItem(7);
                uItem6.text = null;
                arrayList.add(uItem6);
            } else {
                int iMax = Math.max(0, UserConfig.getMaxAccountCount() - UserConfig.getActivatedAccountsCount());
                CharSequence charSequenceConcat = TextUtils.concat(iMax > 0 ? LocaleController.formatPluralStringComma("AddAccountInfo1", iMax) + " " : "", AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("AddAccountInfo2", UserConfig.getMaxAccountCount()), new UserInfoActivity$$ExternalSyntheticLambda0(this, 3)));
                UItem uItem7 = new UItem(7);
                uItem7.text = charSequenceConcat;
                arrayList.add(uItem7);
            }
        }
        arrayList.size();
        int i9 = R.drawable.msg_leave;
        String string6 = LocaleController.getString(R.string.LogOut);
        int i10 = InfoCell.Factory.$r8$clinit;
        UItem uItemOfFactory3 = UItem.ofFactory(InfoCell.Factory.class);
        uItemOfFactory3.id = 11;
        uItemOfFactory3.iconResId = i9;
        uItemOfFactory3.text = string6;
        uItemOfFactory3.subtext = null;
        uItemOfFactory3.intValue = 0;
        uItemOfFactory3.red = true;
        arrayList.add(uItemOfFactory3);
        arrayList.add(UItem.asShadow(-4, null));
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.EditAccountInfo2);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$processDone$6(TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        String str;
        if (tL_error == null) {
            if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                this.doneButtonDrawable.animateToProgress(0.0f);
                UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(this), null);
                return;
            }
            this.wasSaved = true;
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i == arrayList.size()) {
                finishFragment();
                return;
            }
            return;
        }
        this.doneButtonDrawable.animateToProgress(0.0f);
        boolean z = tLObject instanceof TL_account.updateBirthday;
        if (!z || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            BulletinFactory.showError(tL_error);
        } else if (getParentActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, this.resourceProvider);
            String string = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
            showDialog(alertDialog);
        }
        if (z) {
            if (tL_birthday != null) {
                userFull.flags |= 32;
            } else {
                userFull.flags &= -33;
            }
            userFull.birthday = tL_birthday;
            getMessagesStorage().updateUserInfo(userFull, false);
        }
    }

    @Override
    public final void onClick$1(UItem uItem, View view) {
        int i = 0;
        Integer numValueOf = null;
        if (uItem.id == 10) {
            for (int i2 = 3; i2 >= 0; i2--) {
                if (!UserConfig.getInstance(i2).isClientActivated()) {
                    i++;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i2);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i--;
            }
            if (i > 0 && numValueOf != null) {
                presentFragment(new LoginActivity(numValueOf.intValue()));
                return;
            } else {
                if (UserConfig.hasPremiumOnAccounts()) {
                    return;
                }
                showDialog(new LimitReachedBottomSheet(7, this.currentAccount, getParentActivity(), this, null));
                return;
            }
        }
        if (uItem.instanceOf(SettingsActivity.AccountCell.Factory.class)) {
            int i3 = uItem.intValue;
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                launchActivity.switchToAccount(i3);
                return;
            }
            return;
        }
        int i4 = uItem.id;
        if (i4 == 1 || i4 == 9) {
            Activity parentActivity = getParentActivity();
            String string = LocaleController.getString(R.string.EditProfileBirthdayTitle);
            String string2 = LocaleController.getString(R.string.EditProfileBirthdayButton);
            TL_account.TL_birthday tL_birthday = this.birthday;
            showDialog(AlertsCreator.createBirthdayPickerDialog(parentActivity, string, string2, tL_birthday, new UserInfoActivity$$ExternalSyntheticLambda5(this, 1), null, false, tL_birthday != null, getResourceProvider()).bottomSheet);
            return;
        }
        if (i4 == 2) {
            this.birthday = null;
            UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
            if (anonymousClass3 != null) {
                anonymousClass3.adapter.update(true);
            }
            checkDone$4(true);
            return;
        }
        if (i4 == 3) {
            TLRPC.Chat chat = this.channel;
            presentFragment(new ChooseChannelFragment(this.channels, chat == null ? 0L : chat.id, new UserInfoActivity$$ExternalSyntheticLambda5(this, 0)));
            return;
        }
        if (i4 == 5) {
            presentFragment(new org.telegram.ui.Business.LocationActivity());
            return;
        }
        if (i4 == 4) {
            presentFragment(new OpeningHoursActivity());
            return;
        }
        if (i4 == 6) {
            presentFragment(new ChatbotsActivity());
            return;
        }
        if (i4 == 7) {
            presentFragment(new ActionIntroActivity(3));
        } else if (i4 == 8) {
            presentFragment(new ChangeUsernameActivity(null));
        } else if (i4 == 11) {
            presentFragment(new LogoutActivity(null));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.updatedChatbot);
        getContactsController().loadPrivacySettings();
        BusinessChatbotController.getInstance(this.currentAccount).load(null);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.updatedChatbot);
        super.onFragmentDestroy();
        if (this.wasSaved) {
            return;
        }
        processDone$1(false);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final boolean onLongClick(UItem uItem, View view) {
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        AdminedChannelsFetcher adminedChannelsFetcher = this.channels;
        adminedChannelsFetcher.loaded = false;
        adminedChannelsFetcher.callbacks.add(new UserInfoActivity$$ExternalSyntheticLambda0(this, 1));
        if (!adminedChannelsFetcher.loaded && !adminedChannelsFetcher.loading) {
            adminedChannelsFetcher.loading = true;
            TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
            tL_channels_getAdminedPublicChannels.for_personal = adminedChannelsFetcher.for_personal;
            ConnectionsManager.getInstance(adminedChannelsFetcher.currentAccount).sendRequest(tL_channels_getAdminedPublicChannels, new RichMediaUploader$$ExternalSyntheticLambda0(adminedChannelsFetcher, 10));
        }
        this.birthdayInfo = null;
        UniversalFragment.AnonymousClass3 anonymousClass3 = this.listView;
        if (anonymousClass3 != null) {
            anonymousClass3.adapter.update(true);
        }
    }

    public final void processDone$1(boolean z) {
        if (this.doneButtonDrawable.progress <= 0.0f) {
            if (z && TextUtils.isEmpty(this.firstNameEdit.getText())) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                AnonymousClass1 anonymousClass1 = this.firstNameEdit;
                int i = -this.shiftDp;
                this.shiftDp = i;
                AndroidUtilities.shakeViewSpring(anonymousClass1, i);
                return;
            }
            this.doneButtonDrawable.animateToProgress(1.0f);
            TLRPC.User currentUser = getUserConfig().getCurrentUser();
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
            if (currentUser != null && userFull != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(this.firstNameEdit.getText()) && (!TextUtils.equals(this.currentFirstName, this.firstNameEdit.getText().toString()) || !TextUtils.equals(this.currentLastName, this.lastNameEdit.getText().toString()) || !TextUtils.equals(this.currentBio, this.bioEdit.getText().toString()))) {
                    TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                    updateprofile.flags |= 1;
                    String string = this.firstNameEdit.getText().toString();
                    currentUser.first_name = string;
                    updateprofile.first_name = string;
                    updateprofile.flags |= 2;
                    String string2 = this.lastNameEdit.getText().toString();
                    currentUser.last_name = string2;
                    updateprofile.last_name = string2;
                    updateprofile.flags |= 4;
                    String string3 = this.bioEdit.getText().toString();
                    userFull.about = string3;
                    updateprofile.about = string3;
                    userFull.flags = TextUtils.isEmpty(string3) ? userFull.flags & (-3) : userFull.flags | 2;
                    arrayList.add(updateprofile);
                }
                TL_account.TL_birthday tL_birthday = userFull.birthday;
                if (!birthdaysEqual(this.currentBirthday, this.birthday)) {
                    TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                    TL_account.TL_birthday tL_birthday2 = this.birthday;
                    if (tL_birthday2 != null) {
                        userFull.flags2 |= 32;
                        userFull.birthday = tL_birthday2;
                        updatebirthday.flags |= 1;
                        updatebirthday.birthday = tL_birthday2;
                    } else {
                        userFull.flags2 &= -33;
                        userFull.birthday = null;
                    }
                    arrayList.add(updatebirthday);
                    getMessagesController().invalidateContentSettings();
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
                }
                long j = this.currentChannel;
                TLRPC.Chat chat = this.channel;
                if (j != (chat != null ? chat.id : 0L)) {
                    TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
                    updatepersonalchannel.channel = MessagesController.getInputChannel(this.channel);
                    TLRPC.Chat chat2 = this.channel;
                    if (chat2 != null) {
                        userFull.flags |= 64;
                        long j2 = userFull.personal_channel_id;
                        long j3 = chat2.id;
                        if (j2 != j3) {
                            userFull.personal_channel_message = 0;
                        }
                        userFull.personal_channel_id = j3;
                    } else {
                        userFull.flags &= -65;
                        userFull.personal_channel_message = 0;
                        userFull.personal_channel_id = 0L;
                    }
                    arrayList.add(updatepersonalchannel);
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLObject tLObject = (TLObject) arrayList.get(i2);
                    getConnectionsManager().sendRequest(tLObject, new UserInfoActivity$$ExternalSyntheticLambda1(this, tLObject, tL_birthday, userFull, iArr, arrayList, 0), 1024);
                }
                getMessagesStorage().updateUserInfo(userFull, false);
                getUserConfig().saveConfig(true);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            }
        }
    }

    public final void setValue$5() {
        UniversalAdapter universalAdapter;
        if (this.valueSet) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TLRPC.User currentUser = userFull.user;
        if (currentUser == null) {
            currentUser = getUserConfig().getCurrentUser();
        }
        if (currentUser == null) {
            return;
        }
        AnonymousClass1 anonymousClass1 = this.firstNameEdit;
        String str = currentUser.first_name;
        this.currentFirstName = str;
        anonymousClass1.setText(str);
        AnonymousClass1 anonymousClass2 = this.lastNameEdit;
        String str2 = currentUser.last_name;
        this.currentLastName = str2;
        anonymousClass2.setText(str2);
        AnonymousClass1 anonymousClass3 = this.bioEdit;
        String str3 = userFull.about;
        this.currentBio = str3;
        anonymousClass3.setText(str3);
        TL_account.TL_birthday tL_birthday = userFull.birthday;
        this.currentBirthday = tL_birthday;
        this.birthday = tL_birthday;
        if ((userFull.flags2 & 64) != 0) {
            this.currentChannel = userFull.personal_channel_id;
            this.channel = getMessagesController().getChat(Long.valueOf(this.currentChannel));
        } else {
            this.currentChannel = 0L;
            this.channel = null;
        }
        this.hadHours = userFull.business_work_hours != null;
        this.hadLocation = userFull.business_location != null;
        checkDone$4(true);
        UniversalFragment.AnonymousClass3 anonymousClass4 = this.listView;
        if (anonymousClass4 != null && (universalAdapter = anonymousClass4.adapter) != null) {
            universalAdapter.update(true);
        }
        this.valueSet = true;
    }

    public final void updateBioInfo() {
        boolean z;
        UniversalFragment.AnonymousClass3 anonymousClass3;
        int i = this.bioInfoHash;
        AnonymousClass1 anonymousClass1 = this.bioEdit;
        int i2 = 0;
        if (anonymousClass1 == null || TextUtils.isEmpty(anonymousClass1.getText())) {
            z = true;
            this.bioInfo = LocaleController.getString(R.string.EditProfileBioInfo2);
            this.bioInfoHash = Objects.hash(0);
        } else {
            ArrayList<TLRPC.PrivacyRule> privacyRules = getContactsController().getPrivacyRules(9);
            if (privacyRules == null) {
                this.bioInfo = LocaleController.getString(R.string.Loading);
                this.bioInfoHash = Objects.hash(1);
                z = true;
            } else {
                int i3 = -1;
                byte b = -1;
                int size = 0;
                int size2 = 0;
                boolean z2 = false;
                for (int i4 = 0; i4 < privacyRules.size(); i4++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i4);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size3 = tL_privacyValueAllowChatParticipants.chats.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            TLRPC.Chat chat = getMessagesController().getChat(tL_privacyValueAllowChatParticipants.chats.get(i5));
                            if (chat != null) {
                                size2 = Math.max(0, chat.participants_count - 1) + size2;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule;
                        int size4 = tL_privacyValueDisallowChatParticipants.chats.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            TLRPC.Chat chat2 = getMessagesController().getChat(tL_privacyValueDisallowChatParticipants.chats.get(i6));
                            if (chat2 != null) {
                                size = Math.max(0, chat2.participants_count - 1) + size;
                            }
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        size2 += ((TLRPC.TL_privacyValueAllowUsers) privacyRule).users.size();
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        size += ((TLRPC.TL_privacyValueDisallowUsers) privacyRule).users.size();
                    } else {
                        boolean z3 = privacyRule instanceof TLRPC.TL_privacyValueAllowAll;
                        if (z3) {
                            b = 0;
                        } else {
                            boolean z4 = privacyRule instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (z4 && !z2) {
                                b = 1;
                            } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                                b = 2;
                                z2 = true;
                            } else if (b == -1) {
                                if (z3) {
                                    b = 0;
                                } else if (!z4 || z2) {
                                    b = 2;
                                } else {
                                    b = 1;
                                }
                            }
                        }
                    }
                }
                if (b == 0 || (b == -1 && size > 0)) {
                    i3 = 0;
                } else if (b == 2 || (b == -1 && size > 0 && size2 > 0)) {
                    i3 = 2;
                } else if (b == 1 || (b == -1 && size2 > 0)) {
                    i3 = 1;
                }
                if (i3 == 0) {
                    if (size <= 0) {
                        this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoEveryone), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                    } else {
                        this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoEveryoneExcept, Integer.valueOf(size)), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                    }
                } else if (i3 == 2) {
                    if (size > 0 || size2 > 0) {
                        String strM = size2 > 0 ? DiffUtil.m(size2, "+") : "";
                        if (size > 0) {
                            if (strM.length() > 0) {
                                strM = strM.concat(", ");
                            }
                            strM = strM + "-" + size;
                        }
                        this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoContactsExtra, strM), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                    } else {
                        this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoContacts), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                    }
                } else if (i3 != 0) {
                    this.bioInfo = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoUnknown), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2));
                } else if (size2 <= 0) {
                    this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.EditProfileBioInfoNobody), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                } else {
                    this.bioInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.EditProfileBioInfoNobodyExcept, Integer.valueOf(size2)), new UserInfoActivity$$ExternalSyntheticLambda0(this, i2)), true);
                }
                z = true;
                this.bioInfoHash = Objects.hash(Integer.valueOf(i3 + 10), Integer.valueOf(size2), Integer.valueOf(size));
            }
        }
        if (i == this.bioInfoHash || (anonymousClass3 = this.listView) == null) {
            return;
        }
        anonymousClass3.adapter.update(z);
    }
}
