package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextDetailSettingsCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stars.BotStarsActivity;

public final class LogoutActivity extends BaseFragment {
    public int addAccountRow;
    public int alternativeSectionRow;
    public int cacheRow;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public int logoutRow;
    public int logoutSectionRow;
    public int passcodeRow;
    public int phoneRow;
    public int rowCount;
    public int supportRow;

    public final class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onItemClick(int i) {
            Bitmap bitmapCreateBitmap;
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    if (i == -1) {
                        ((LogoutActivity) obj).finishFragment();
                    }
                    break;
                case 1:
                    if (i == -1) {
                        ((ManageLinksActivity) obj).finishFragment();
                    }
                    break;
                case 2:
                    if (i == -1) {
                        ((MemberRequestsActivity) obj).finishFragment();
                    }
                    break;
                case 3:
                    MessageStatisticActivity messageStatisticActivity = (MessageStatisticActivity) obj;
                    if (i == -1) {
                        messageStatisticActivity.finishFragment();
                    } else if (i == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", messageStatisticActivity.chatId);
                        messageStatisticActivity.presentFragment(new StatisticActivity(bundle));
                    }
                    break;
                case 4:
                    if (i == -1) {
                        ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    }
                    break;
                case 5:
                    if (i == -1) {
                        ((NotificationsSettingsActivity) obj).finishFragment();
                    }
                    break;
                case 6:
                    if (i == -1) {
                        ((PasscodeActivity) obj).finishFragment();
                    }
                    break;
                case 7:
                    if (i == -1) {
                        ((PasskeysActivity) obj).finishFragment();
                    }
                    break;
                case 8:
                    PhotoCropActivity photoCropActivity = (PhotoCropActivity) obj;
                    if (i == -1) {
                        photoCropActivity.finishFragment();
                    } else if (i == 1) {
                        if (photoCropActivity.delegate != null && !photoCropActivity.doneButtonPressed) {
                            PhotoCropActivity.PhotoCropView photoCropView = photoCropActivity.view;
                            float f = photoCropView.rectX - photoCropView.bitmapX;
                            float f2 = photoCropView.bitmapWidth;
                            float f3 = (photoCropView.rectY - photoCropView.bitmapY) / photoCropView.bitmapHeight;
                            float f4 = photoCropView.rectSizeX / f2;
                            float f5 = photoCropView.rectSizeY / f2;
                            PhotoCropActivity photoCropActivity2 = PhotoCropActivity.this;
                            int width = (int) ((f / f2) * photoCropActivity2.imageToCrop.getWidth());
                            int height = (int) (f3 * photoCropActivity2.imageToCrop.getHeight());
                            int width2 = (int) (f4 * photoCropActivity2.imageToCrop.getWidth());
                            int width3 = (int) (f5 * photoCropActivity2.imageToCrop.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > photoCropActivity2.imageToCrop.getWidth()) {
                                width2 = photoCropActivity2.imageToCrop.getWidth() - width;
                            }
                            if (height + width3 > photoCropActivity2.imageToCrop.getHeight()) {
                                width3 = photoCropActivity2.imageToCrop.getHeight() - height;
                            }
                            try {
                                bitmapCreateBitmap = Bitmaps.createBitmap(photoCropActivity2.imageToCrop, width, height, width2, width3);
                            } catch (Throwable th) {
                                FileLog.e(th);
                                System.gc();
                                try {
                                    bitmapCreateBitmap = Bitmaps.createBitmap(photoCropActivity2.imageToCrop, width, height, width2, width3);
                                } catch (Throwable th2) {
                                    FileLog.e(th2);
                                    bitmapCreateBitmap = null;
                                }
                            }
                            if (bitmapCreateBitmap == photoCropActivity.imageToCrop) {
                                photoCropActivity.sameBitmap = true;
                            }
                            photoCropActivity.delegate.processBitmap(false, bitmapCreateBitmap, null);
                            photoCropActivity.doneButtonPressed = true;
                        }
                        photoCropActivity.finishFragment();
                    }
                    break;
                case 9:
                    PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) obj;
                    if (i == -1) {
                        photoPickerActivity.finishFragment();
                    } else if (i == 1) {
                        boolean z = photoPickerActivity.listSort;
                        photoPickerActivity.listSort = !z;
                        if (z) {
                            photoPickerActivity.listView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            photoPickerActivity.listView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        photoPickerActivity.listView.stopScroll();
                        PhotoPickerActivity.AnonymousClass6 anonymousClass6 = photoPickerActivity.layoutManager;
                        anonymousClass6.scrollToPositionWithOffset(0, 0, anonymousClass6.mShouldReverseLayout);
                        photoPickerActivity.listAdapter.mObservable.notifyChanged();
                    } else if (i == 2) {
                        PhotoPickerActivity.PhotoPickerActivityDelegate photoPickerActivityDelegate = photoPickerActivity.delegate;
                        if (photoPickerActivityDelegate != null) {
                            photoPickerActivityDelegate.onOpenInPressed();
                        }
                        photoPickerActivity.finishFragment();
                    }
                    break;
                case 10:
                    if (i == -1) {
                        ((PhotoPickerSearchActivity) obj).finishFragment();
                    }
                    break;
                case 11:
                    PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                    if (i == -1) {
                        popupNotificationActivity.onFinish$1();
                        popupNotificationActivity.finish();
                    } else if (i == 1) {
                        int i2 = PopupNotificationActivity.$r8$clinit;
                        popupNotificationActivity.openCurrentMessage();
                    } else if (i == 2) {
                        int i3 = PopupNotificationActivity.$r8$clinit;
                        popupNotificationActivity.switchToNextMessage();
                    }
                    break;
                case 12:
                    PostSuggestionsEditActivity postSuggestionsEditActivity = (PostSuggestionsEditActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            postSuggestionsEditActivity.processDone$16();
                        }
                    } else if (postSuggestionsEditActivity.onBackPressed(true)) {
                        postSuggestionsEditActivity.finishFragment();
                    }
                    break;
                case 13:
                    if (i == -1) {
                        ((PremiumPreviewFragment) obj).finishFragment();
                    }
                    break;
                case 14:
                    PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                    if (i != -1) {
                        if (i == 1) {
                            privacyControlActivity.processDone$9();
                        }
                    } else if (privacyControlActivity.checkDiscard$6(true)) {
                        privacyControlActivity.finishFragment();
                    }
                    break;
                case 15:
                    if (i == -1) {
                        ((PrivacySettingsActivity) obj).finishFragment();
                    }
                    break;
                case 16:
                    if (i == -1) {
                        ((PrivacyUsersActivity) obj).finishFragment();
                    }
                    break;
                case 17:
                    if (i == -1) {
                        ((ProxyListActivity) obj).finishFragment();
                    }
                    break;
                case 18:
                    if (i == -1) {
                        ((QuickRepliesSettingsActivity) obj).finishFragment();
                    }
                    break;
                case 19:
                    if (i == -1) {
                        ((ReactionsDoubleTapManageActivity) obj).finishFragment();
                    }
                    break;
                case 20:
                    if (i == -1) {
                        ((RestrictedLanguagesSelectActivity) obj).finishFragment();
                    }
                    break;
                case 21:
                    if (i == -1) {
                        ((SaveToGallerySettingsActivity) obj).finishFragment();
                    }
                    break;
                case 22:
                    if (i == -1) {
                        ((SecretMediaViewer) obj).closePhoto(true, false);
                    }
                    break;
                case 23:
                    if (i == -1) {
                        ((SessionsActivity) obj).finishFragment();
                    }
                    break;
                case 24:
                    SettingsActivity settingsActivity = (SettingsActivity) obj;
                    if (i == -1) {
                        settingsActivity.finishFragment();
                    } else if (i == 2) {
                        settingsActivity.presentSettingFragment(new LogoutActivity(null));
                    }
                    break;
                case 25:
                    if (i == -1) {
                        ((BotStarsActivity) obj).finishFragment();
                    }
                    break;
                case 26:
                    if (i == -1) {
                        ((StatisticActivity) obj).finishFragment();
                    }
                    break;
                case 27:
                    StickersActivity stickersActivity = (StickersActivity) obj;
                    if (i != -1) {
                        stickersActivity.processSelectionMenu(i);
                    } else if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                    }
                    break;
                case 28:
                    ThemeSetUrlActivity themeSetUrlActivity = (ThemeSetUrlActivity) obj;
                    if (i == -1) {
                        themeSetUrlActivity.finishFragment();
                    } else if (i == 1) {
                        themeSetUrlActivity.saveTheme();
                    }
                    break;
                default:
                    if (i == -1) {
                        ((TooManyCommunitiesActivity) obj).finishFragment();
                    }
                    break;
            }
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return LogoutActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            LogoutActivity logoutActivity = LogoutActivity.this;
            logoutActivity.getClass();
            if (i == 0) {
                return 0;
            }
            if (i == logoutActivity.addAccountRow || i == logoutActivity.passcodeRow || i == logoutActivity.cacheRow || i == logoutActivity.phoneRow || i == logoutActivity.supportRow) {
                return 1;
            }
            if (i == logoutActivity.alternativeSectionRow) {
                return 2;
            }
            return i == logoutActivity.logoutRow ? 3 : 4;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            LogoutActivity logoutActivity = LogoutActivity.this;
            return adapterPosition == logoutActivity.addAccountRow || adapterPosition == logoutActivity.passcodeRow || adapterPosition == logoutActivity.cacheRow || adapterPosition == logoutActivity.phoneRow || adapterPosition == logoutActivity.supportRow || adapterPosition == logoutActivity.logoutRow;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == 0) {
                    headerCell.setText(LocaleController.getString(R.string.AlternativeOptions));
                    return;
                }
                return;
            }
            LogoutActivity logoutActivity = LogoutActivity.this;
            if (i2 != 1) {
                if (i2 == 3) {
                    TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                    if (i == logoutActivity.logoutRow) {
                        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                        textSettingsCell.setText(LocaleController.getString(R.string.LogOutTitle), false);
                        return;
                    }
                    return;
                }
                if (i2 != 4) {
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                if (i == logoutActivity.logoutSectionRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.LogOutInfo));
                    return;
                }
                return;
            }
            TextDetailSettingsCell textDetailSettingsCell = (TextDetailSettingsCell) view;
            if (i == logoutActivity.addAccountRow) {
                textDetailSettingsCell.setTextAndValueAndIcon(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
                return;
            }
            if (i == logoutActivity.passcodeRow) {
                textDetailSettingsCell.setTextAndValueAndIcon(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
                return;
            }
            if (i == logoutActivity.cacheRow) {
                textDetailSettingsCell.setTextAndValueAndIcon(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
            } else if (i == logoutActivity.phoneRow) {
                textDetailSettingsCell.setTextAndValueAndIcon(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
            } else if (i == logoutActivity.supportRow) {
                textDetailSettingsCell.setTextAndValueAndIcon(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            Context context = this.mContext;
            if (i == 0) {
                HeaderCell headerCell = new HeaderCell(context);
                headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                shadowSectionCell = headerCell;
            } else if (i == 1) {
                TextDetailSettingsCell textDetailSettingsCell = new TextDetailSettingsCell(context);
                textDetailSettingsCell.setMultilineDetail(true);
                textDetailSettingsCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                shadowSectionCell = textDetailSettingsCell;
            } else if (i == 2) {
                shadowSectionCell = new ShadowSectionCell(context, (Object) null);
            } else if (i != 3) {
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                shadowSectionCell = textInfoPrivacyCell;
            } else {
                TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
                textSettingsCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                shadowSectionCell = textSettingsCell;
            }
            return zzkl.m(shadowSectionCell, shadowSectionCell);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.LogOutTitle));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1(this, 0));
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setVerticalScrollBarEnabled(false);
        zzku.m(this.listView);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda115(this, 8));
        this.listView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, HeaderCell.class, TextDetailSettingsCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        return arrayList;
    }

    public final void lambda$createView$0$1(int i) {
        int i2 = 0;
        Integer numValueOf = null;
        if (i == this.addAccountRow) {
            for (int i3 = 3; i3 >= 0; i3--) {
                if (!UserConfig.getInstance(i3).isClientActivated()) {
                    i2++;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i3);
                    }
                }
            }
            if (!UserConfig.hasPremiumOnAccounts()) {
                i2--;
            }
            if (i2 > 0 && numValueOf != null) {
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
        if (i == this.passcodeRow) {
            presentFragment(PasscodeActivity.determineOpenFragment());
            return;
        }
        if (i == this.cacheRow) {
            presentFragment(new CacheControlActivity());
            return;
        }
        if (i == this.phoneRow) {
            presentFragment(new ActionIntroActivity(3));
            return;
        }
        if (i == this.supportRow) {
            showDialog(AlertsCreator.createSupportAlert(this, null));
            return;
        }
        if (i != this.logoutRow || getParentActivity() == null) {
            return;
        }
        Activity parentActivity = getParentActivity();
        int i4 = this.currentAccount;
        AlertDialog.Builder builder = new AlertDialog.Builder(parentActivity, 0, null);
        String string = LocaleController.getString(R.string.AreYouSureLogout);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.message = string;
        int i5 = R.string.LogOut;
        alertDialog.title = LocaleController.getString(i5);
        builder.setPositiveButton(LocaleController.getString(i5), new LogoutActivity$$ExternalSyntheticLambda1(i4, 0));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
        showDialog(alertDialog);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        this.rowCount = 1;
        if (UserConfig.getActivatedAccountsCount() < 4) {
            int i = this.rowCount;
            this.rowCount = i + 1;
            this.addAccountRow = i;
        } else {
            this.addAccountRow = -1;
        }
        if (SharedConfig.passcodeHash.length() <= 0) {
            int i2 = this.rowCount;
            this.rowCount = i2 + 1;
            this.passcodeRow = i2;
        } else {
            this.passcodeRow = -1;
        }
        int i3 = this.rowCount;
        this.cacheRow = i3;
        this.phoneRow = i3 + 1;
        this.supportRow = i3 + 2;
        this.alternativeSectionRow = i3 + 3;
        this.logoutRow = i3 + 4;
        this.rowCount = i3 + 6;
        this.logoutSectionRow = i3 + 5;
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }
}
