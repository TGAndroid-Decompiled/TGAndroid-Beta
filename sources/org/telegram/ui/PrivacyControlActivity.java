package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.AffiliateProgramFragment;

public class PrivacyControlActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    public static final int PRIVACY_RULES_TYPE_ADDED_BY_PHONE = 7;
    public static final int PRIVACY_RULES_TYPE_BIO = 9;
    public static final int PRIVACY_RULES_TYPE_BIRTHDAY = 11;
    public static final int PRIVACY_RULES_TYPE_CALLS = 2;
    public static final int PRIVACY_RULES_TYPE_FORWARDS = 5;
    public static final int PRIVACY_RULES_TYPE_GIFTS = 12;
    public static final int PRIVACY_RULES_TYPE_INVITE = 1;
    public static final int PRIVACY_RULES_TYPE_LASTSEEN = 0;
    public static final int PRIVACY_RULES_TYPE_MESSAGES = 10;
    public static final int PRIVACY_RULES_TYPE_MUSIC = 14;
    public static final int PRIVACY_RULES_TYPE_P2P = 3;
    public static final int PRIVACY_RULES_TYPE_PHONE = 6;
    public static final int PRIVACY_RULES_TYPE_PHOTO = 4;
    public static final int PRIVACY_RULES_TYPE_VOICE_MESSAGES = 8;
    public static final int TYPE_CONTACTS = 2;
    public static final int TYPE_EVERYBODY = 0;
    public static final int TYPE_NOBODY = 1;
    public static final int TYPE_PAY = 3;
    private static final int done_button = 1;
    private int alwaysShareRow;
    private TLRPC.PhotoSize avatarForRest;
    private TLRPC.Photo avatarForRestPhoto;
    private RLottieDrawable cameraDrawable;
    private boolean currentGiftChannelsValue;
    private boolean currentGiftIconValue;
    private boolean currentGiftLimitedValue;
    private boolean currentGiftPremiumValue;
    private boolean currentGiftUniqueValue;
    private boolean currentGiftUnlimitedValue;
    private ArrayList<Long> currentMinus;
    private int currentPhotoForRestRow;
    private ArrayList<Long> currentPlus;
    private final boolean[] currentPlusChannels;
    private final boolean[] currentPlusMiniapps;
    private final boolean[] currentPlusPremium;
    private boolean currentReadValue;
    private long currentStars;
    private int currentSubType;
    private int currentType;
    private int detailRow;
    private int detailRow2;
    private View doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private int everybodyRow;
    private int giftTypeChannelsRow;
    private int giftTypeLimitedRow;
    private int giftTypePremiumRow;
    private int giftTypeUniqueRow;
    private int giftTypeUnlimitedRow;
    private int giftTypesHeaderRow;
    private int giftTypesInfoRow;
    ImageUpdater imageUpdater;
    private ArrayList<Long> initialMinus;
    private ArrayList<Long> initialPlus;
    private final boolean[] initialPlusChannels;
    private final boolean[] initialPlusMiniapps;
    private final boolean[] initialPlusPremium;
    private int initialRulesSubType;
    private int initialRulesType;
    private long initialStars;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private CharSequence lockSpan;
    private MessageCell messageCell;
    private int messageRow;
    private int myContactsRow;
    private int neverShareRow;
    private int nobodyRow;
    private BackupImageView oldAvatarView;
    private TextCell oldPhotoCell;
    private int p2pDetailRow;
    private int p2pRow;
    private int p2pSectionRow;
    private int payRow;
    private int phoneContactsRow;
    private int phoneDetailRow;
    private int phoneEverybodyRow;
    private int phoneSectionRow;
    private int photoForRestDescriptionRow;
    private int photoForRestRow;
    private boolean prevSubtypeContacts;
    private int priceButtonRow;
    private int priceHeaderRow;
    private int priceInfoRow;
    private int priceRow;
    private int readDetailRow;
    private int readPremiumDetailRow;
    private int readPremiumRow;
    private int readRow;
    private int rowCount;
    private int rulesType;
    private int sectionRow;
    private boolean selectedGiftChannelsValue;
    private boolean selectedGiftIconValue;
    private boolean selectedGiftLimitedValue;
    private boolean selectedGiftPremiumValue;
    private boolean selectedGiftUniqueValue;
    private boolean selectedGiftUnlimitedValue;
    private boolean selectedReadValue;
    private TextCell setAvatarCell;
    private int setBirthdayRow;
    private int shakeDp;
    private int shareDetailRow;
    private int shareSectionRow;
    private int showGiftIconInfoRow;
    private int showGiftIconRow;

    public class DiffCallback extends DiffUtil.Callback {
        SparseIntArray newPositionToItem;
        SparseIntArray oldPositionToItem;
        int oldRowCount;

        private DiffCallback() {
            this.oldPositionToItem = new SparseIntArray();
            this.newPositionToItem = new SparseIntArray();
        }

        private void put(int i, int i2, SparseIntArray sparseIntArray) {
            if (i2 >= 0) {
                sparseIntArray.put(i2, i);
            }
        }

        @Override
        public boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2);
        }

        @Override
        public boolean areItemsTheSame(int i, int i2) {
            int i3 = this.oldPositionToItem.get(i, -1);
            return i3 == this.newPositionToItem.get(i2, -1) && i3 >= 0;
        }

        public void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            put(1, PrivacyControlActivity.this.messageRow, sparseIntArray);
            put(2, PrivacyControlActivity.this.sectionRow, sparseIntArray);
            put(3, PrivacyControlActivity.this.everybodyRow, sparseIntArray);
            put(4, PrivacyControlActivity.this.myContactsRow, sparseIntArray);
            put(5, PrivacyControlActivity.this.nobodyRow, sparseIntArray);
            put(6, PrivacyControlActivity.this.payRow, sparseIntArray);
            put(7, PrivacyControlActivity.this.detailRow, sparseIntArray);
            put(8, PrivacyControlActivity.this.shareSectionRow, sparseIntArray);
            put(9, PrivacyControlActivity.this.alwaysShareRow, sparseIntArray);
            put(10, PrivacyControlActivity.this.neverShareRow, sparseIntArray);
            put(11, PrivacyControlActivity.this.shareDetailRow, sparseIntArray);
            put(12, PrivacyControlActivity.this.phoneSectionRow, sparseIntArray);
            put(13, PrivacyControlActivity.this.phoneEverybodyRow, sparseIntArray);
            put(14, PrivacyControlActivity.this.phoneContactsRow, sparseIntArray);
            put(15, PrivacyControlActivity.this.phoneDetailRow, sparseIntArray);
            put(16, PrivacyControlActivity.this.photoForRestRow, sparseIntArray);
            put(17, PrivacyControlActivity.this.currentPhotoForRestRow, sparseIntArray);
            put(18, PrivacyControlActivity.this.photoForRestDescriptionRow, sparseIntArray);
            put(19, PrivacyControlActivity.this.p2pSectionRow, sparseIntArray);
            put(20, PrivacyControlActivity.this.p2pRow, sparseIntArray);
            put(21, PrivacyControlActivity.this.p2pDetailRow, sparseIntArray);
            put(22, PrivacyControlActivity.this.readRow, sparseIntArray);
            put(23, PrivacyControlActivity.this.readDetailRow, sparseIntArray);
            put(24, PrivacyControlActivity.this.readPremiumRow, sparseIntArray);
            put(25, PrivacyControlActivity.this.readPremiumDetailRow, sparseIntArray);
            put(26, PrivacyControlActivity.this.priceHeaderRow, sparseIntArray);
            put(27, PrivacyControlActivity.this.priceRow, sparseIntArray);
            put(28, PrivacyControlActivity.this.priceInfoRow, sparseIntArray);
            put(29, PrivacyControlActivity.this.showGiftIconRow, sparseIntArray);
            put(30, PrivacyControlActivity.this.showGiftIconInfoRow, sparseIntArray);
            put(31, PrivacyControlActivity.this.giftTypesHeaderRow, sparseIntArray);
            put(32, PrivacyControlActivity.this.giftTypeLimitedRow, sparseIntArray);
            put(33, PrivacyControlActivity.this.giftTypeUnlimitedRow, sparseIntArray);
            put(34, PrivacyControlActivity.this.giftTypeUniqueRow, sparseIntArray);
            put(35, PrivacyControlActivity.this.giftTypeChannelsRow, sparseIntArray);
            put(36, PrivacyControlActivity.this.giftTypePremiumRow, sparseIntArray);
            put(37, PrivacyControlActivity.this.giftTypesInfoRow, sparseIntArray);
        }

        @Override
        public int getNewListSize() {
            return PrivacyControlActivity.this.rowCount;
        }

        @Override
        public int getOldListSize() {
            return this.oldRowCount;
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        private int getUsersCount(ArrayList<Long> arrayList) {
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                long jLongValue = arrayList.get(i2).longValue();
                if (jLongValue > 0) {
                    i++;
                } else {
                    TLRPC.Chat chat = PrivacyControlActivity.this.getMessagesController().getChat(Long.valueOf(-jLongValue));
                    if (chat != null) {
                        i += chat.participants_count;
                    }
                }
            }
            return i;
        }

        public void lambda$onBindViewHolder$1() {
            PrivacyControlActivity.this.presentFragment(new PremiumPreviewFragment("noncontacts"));
        }

        public void lambda$onBindViewHolder$2(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
            String str;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                BulletinFactory.of(PrivacyControlActivity.this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.PrivacyBirthdaySetDone)).setDuration(5000).show();
                return;
            }
            if (userFull != null) {
                if (tL_birthday == null) {
                    userFull.flags2 &= -33;
                } else {
                    userFull.flags2 |= 32;
                }
                userFull.birthday = tL_birthday;
                PrivacyControlActivity.this.getMessagesStorage().updateUserInfo(userFull, false);
            }
            if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
                FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(PrivacyControlActivity.this), R.raw.error);
            } else if (PrivacyControlActivity.this.getContext() != null) {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                privacyControlActivity.showDialog(new AlertDialog.Builder(privacyControlActivity.getContext(), 0, ((BaseFragment) PrivacyControlActivity.this).resourceProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
            }
        }

        public void lambda$onBindViewHolder$3(TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((Object) this, (Object) tLObject, (Object) userFull, (Object) tL_birthday, tL_error, 6));
        }

        public void lambda$onBindViewHolder$4(TL_account.TL_birthday tL_birthday) {
            TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
            updatebirthday.flags |= 1;
            updatebirthday.birthday = tL_birthday;
            TLRPC.UserFull userFull = PrivacyControlActivity.this.getMessagesController().getUserFull(PrivacyControlActivity.this.getUserConfig().getClientUserId());
            TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
            if (userFull != null) {
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                PrivacyControlActivity.this.getMessagesStorage().updateUserInfo(userFull, false);
            }
            PrivacyControlActivity.this.getMessagesController().invalidateContentSettings();
            PrivacyControlActivity.this.getConnectionsManager().sendRequest(updatebirthday, new LinkManager$$ExternalSyntheticLambda0(this, userFull, tL_birthday2, 5), 1024);
            MessagesController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
            NotificationCenter.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.premiumPromoUpdated, new Object[0]);
            PrivacyControlActivity.this.updateRows(true);
        }

        public void lambda$onBindViewHolder$5() {
            PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
            privacyControlActivity.showDialog(AlertsCreator.createBirthdayPickerDialog(privacyControlActivity.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda1(this, 0), null, false, false, PrivacyControlActivity.this.getResourceProvider()).bottomSheet);
        }

        public CharSequence lambda$onBindViewHolder$6(Integer num, Integer num2) {
            if (num.intValue() != 0) {
                return LocaleController.formatNumber(num2.intValue(), ',');
            }
            if (PrivacyControlActivity.this.getUserConfig().isPremium()) {
                return LocaleController.formatPluralStringComma("Stars", num2.intValue());
            }
            if (PrivacyControlActivity.this.lockSpan == null) {
                SpannableString spannableString = new SpannableString("l");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
                coloredImageSpan.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                spannableString.setSpan(coloredImageSpan, 0, 1, 33);
                PrivacyControlActivity.this.lockSpan = spannableString;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(PrivacyControlActivity.this.lockSpan);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", num2.intValue()));
            return spannableStringBuilder;
        }

        public void lambda$onBindViewHolder$7(Integer num) {
            PrivacyControlActivity.this.currentStars = num.intValue();
            AndroidUtilities.updateVisibleRow(PrivacyControlActivity.this.listView, PrivacyControlActivity.this.priceInfoRow);
            PrivacyControlActivity.this.updateDoneButton();
        }

        public void lambda$onCreateViewHolder$0(View view) {
            PrivacyControlActivity.this.showDialog(new PremiumFeatureBottomSheet((BaseFragment) PrivacyControlActivity.this, 27, false));
        }

        @Override
        public int getItemCount() {
            return PrivacyControlActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == PrivacyControlActivity.this.alwaysShareRow || i == PrivacyControlActivity.this.neverShareRow || i == PrivacyControlActivity.this.p2pRow || i == PrivacyControlActivity.this.readPremiumRow) {
                return 0;
            }
            if (i == PrivacyControlActivity.this.shareDetailRow || i == PrivacyControlActivity.this.detailRow || i == PrivacyControlActivity.this.detailRow2 || i == PrivacyControlActivity.this.priceInfoRow || i == PrivacyControlActivity.this.p2pDetailRow || i == PrivacyControlActivity.this.photoForRestDescriptionRow || i == PrivacyControlActivity.this.readDetailRow || i == PrivacyControlActivity.this.readPremiumDetailRow || i == PrivacyControlActivity.this.setBirthdayRow || i == PrivacyControlActivity.this.showGiftIconInfoRow || i == PrivacyControlActivity.this.giftTypesInfoRow) {
                return 1;
            }
            if (i == PrivacyControlActivity.this.sectionRow || i == PrivacyControlActivity.this.priceHeaderRow || i == PrivacyControlActivity.this.shareSectionRow || i == PrivacyControlActivity.this.p2pSectionRow || i == PrivacyControlActivity.this.phoneSectionRow || i == PrivacyControlActivity.this.giftTypesHeaderRow) {
                return 2;
            }
            if (i == PrivacyControlActivity.this.everybodyRow || i == PrivacyControlActivity.this.myContactsRow || i == PrivacyControlActivity.this.nobodyRow || i == PrivacyControlActivity.this.payRow || i == PrivacyControlActivity.this.phoneEverybodyRow || i == PrivacyControlActivity.this.phoneContactsRow) {
                return 3;
            }
            if (i == PrivacyControlActivity.this.messageRow) {
                return 4;
            }
            if (i == PrivacyControlActivity.this.phoneDetailRow) {
                return 5;
            }
            if (i == PrivacyControlActivity.this.photoForRestRow) {
                return 6;
            }
            if (i == PrivacyControlActivity.this.currentPhotoForRestRow) {
                return 7;
            }
            if (i == PrivacyControlActivity.this.readRow || i == PrivacyControlActivity.this.showGiftIconRow || i == PrivacyControlActivity.this.giftTypeUniqueRow || i == PrivacyControlActivity.this.giftTypeChannelsRow || i == PrivacyControlActivity.this.giftTypePremiumRow || i == PrivacyControlActivity.this.giftTypeUnlimitedRow || i == PrivacyControlActivity.this.giftTypeLimitedRow) {
                return 8;
            }
            if (i == PrivacyControlActivity.this.priceRow) {
                return 9;
            }
            return i == PrivacyControlActivity.this.priceButtonRow ? 10 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if ((adapterPosition == PrivacyControlActivity.this.p2pRow && !ContactsController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getLoadingPrivacyInfo(3)) || adapterPosition == PrivacyControlActivity.this.currentPhotoForRestRow || adapterPosition == PrivacyControlActivity.this.photoForRestDescriptionRow || adapterPosition == PrivacyControlActivity.this.photoForRestRow || adapterPosition == PrivacyControlActivity.this.readRow || adapterPosition == PrivacyControlActivity.this.showGiftIconRow || adapterPosition == PrivacyControlActivity.this.readPremiumRow || adapterPosition == PrivacyControlActivity.this.giftTypeUniqueRow || adapterPosition == PrivacyControlActivity.this.giftTypeChannelsRow || adapterPosition == PrivacyControlActivity.this.giftTypePremiumRow || adapterPosition == PrivacyControlActivity.this.giftTypeLimitedRow || adapterPosition == PrivacyControlActivity.this.giftTypeUnlimitedRow) {
                return true;
            }
            if (PrivacyControlActivity.this.rulesType == 12 && PrivacyControlActivity.this.areAllStarGiftsDisabled()) {
                return false;
            }
            return adapterPosition == PrivacyControlActivity.this.nobodyRow || adapterPosition == PrivacyControlActivity.this.myContactsRow || adapterPosition == PrivacyControlActivity.this.payRow || adapterPosition == PrivacyControlActivity.this.everybodyRow || adapterPosition == PrivacyControlActivity.this.neverShareRow || adapterPosition == PrivacyControlActivity.this.alwaysShareRow;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            char c = 1;
            char c2 = 1;
            final int i2 = 0;
            i = 0;
            int i3 = 0;
            i = 0;
            int i4 = 0;
            i = 0;
            int i5 = 0;
            i = 0;
            int i6 = 0;
            i2 = 0;
            if (itemViewType == 8) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                textCheckCell.setCheckBoxIcon(0);
                if (i == PrivacyControlActivity.this.readRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.HideReadTime), PrivacyControlActivity.this.selectedReadValue, false);
                    return;
                }
                if (i == PrivacyControlActivity.this.showGiftIconRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsShowIcon), PrivacyControlActivity.this.selectedGiftIconValue, false);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypeUnlimitedRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeUnlimited), PrivacyControlActivity.this.selectedGiftUnlimitedValue, true);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftUnlimitedValue) {
                        i3 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i3);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypeLimitedRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeLimited), PrivacyControlActivity.this.selectedGiftLimitedValue, true);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftLimitedValue) {
                        i4 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i4);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypeUniqueRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeUnique), PrivacyControlActivity.this.selectedGiftUniqueValue, true);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftUniqueValue) {
                        i5 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i5);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypeChannelsRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeFromChannels), PrivacyControlActivity.this.selectedGiftChannelsValue, true);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftChannelsValue) {
                        i6 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i6);
                    return;
                }
                if (i == PrivacyControlActivity.this.giftTypePremiumRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypePremium), PrivacyControlActivity.this.selectedGiftPremiumValue, false);
                    if (!PrivacyControlActivity.this.getUserConfig().isPremium() && PrivacyControlActivity.this.selectedGiftPremiumValue) {
                        i2 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i2);
                    return;
                }
                return;
            }
            if (itemViewType == 9) {
                SlideIntChooseView slideIntChooseView = (SlideIntChooseView) viewHolder.itemView;
                if (i == PrivacyControlActivity.this.priceRow) {
                    int[] iArrCut = SlideIntChooseView.cut((int) PrivacyControlActivity.this.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    PhotoViewer$55$$ExternalSyntheticLambda2 photoViewer$55$$ExternalSyntheticLambda2 = new PhotoViewer$55$$ExternalSyntheticLambda2(this, 18);
                    SlideIntChooseView.Options options = new SlideIntChooseView.Options();
                    options.steps = iArrCut;
                    options.betweenSteps = 20;
                    options.toString = photoViewer$55$$ExternalSyntheticLambda2;
                    slideIntChooseView.set((int) Utilities.clamp(PrivacyControlActivity.this.currentStars, PrivacyControlActivity.this.getMessagesController().starsPaidMessageAmountMax, 1L), options, new PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda1(this, c == true ? 1 : 0));
                    return;
                }
                return;
            }
            if (itemViewType == 0) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                textSettingsCell.setTextColor(PrivacyControlActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                if (i == PrivacyControlActivity.this.alwaysShareRow) {
                    String pluralString = PrivacyControlActivity.this.currentPlus.size() != 0 ? LocaleController.formatPluralString("Users", getUsersCount(PrivacyControlActivity.this.currentPlus), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                    if (PrivacyControlActivity.this.currentPlusPremium[PrivacyControlActivity.this.currentType == 2 ? (char) 0 : (char) 1]) {
                        pluralString = (PrivacyControlActivity.this.currentPlus == null || PrivacyControlActivity.this.currentPlus.isEmpty()) ? LocaleController.formatString(R.string.PrivacyPremium, new Object[0]) : LocaleController.formatString(R.string.PrivacyPremiumAnd, pluralString);
                    }
                    if (PrivacyControlActivity.this.rulesType != 10 && PrivacyControlActivity.this.currentPlusMiniapps[PrivacyControlActivity.this.currentType] && PrivacyControlActivity.this.currentType != 0) {
                        pluralString = (PrivacyControlActivity.this.currentPlus == null || PrivacyControlActivity.this.currentPlus.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, pluralString);
                    }
                    if (PrivacyControlActivity.this.rulesType == 10) {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivateMessagesExceptions), pluralString, false, false);
                    } else if (PrivacyControlActivity.this.rulesType == 0 || PrivacyControlActivity.this.rulesType == 4 || PrivacyControlActivity.this.rulesType == 9 || PrivacyControlActivity.this.rulesType == 14) {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AlwaysShareWith), pluralString, false, PrivacyControlActivity.this.neverShareRow != -1);
                    } else {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AlwaysAllow), pluralString, false, PrivacyControlActivity.this.neverShareRow != -1);
                    }
                    if (PrivacyControlActivity.this.rulesType == 12) {
                        textSettingsCell.setEnabled(!PrivacyControlActivity.this.areAllStarGiftsDisabled());
                        return;
                    }
                    return;
                }
                if (i != PrivacyControlActivity.this.neverShareRow) {
                    if (i == PrivacyControlActivity.this.p2pRow) {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyP2P2), ContactsController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getLoadingPrivacyInfo(3) ? LocaleController.getString(R.string.Loading) : PrivacySettingsActivity.formatRulesString(PrivacyControlActivity.this.getAccountInstance(), 3), false, false);
                        return;
                    } else {
                        if (i == PrivacyControlActivity.this.readPremiumRow) {
                            textSettingsCell.setText(LocaleController.getString(PrivacyControlActivity.this.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumForPremium : R.string.PrivacyLastSeenPremium), false);
                            textSettingsCell.setTextColor(PrivacyControlActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText));
                            return;
                        }
                        return;
                    }
                }
                String pluralString2 = PrivacyControlActivity.this.currentMinus.size() != 0 ? LocaleController.formatPluralString("Users", getUsersCount(PrivacyControlActivity.this.currentMinus), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                if (PrivacyControlActivity.this.currentPlusMiniapps[PrivacyControlActivity.this.currentType] && PrivacyControlActivity.this.currentType == 0) {
                    pluralString2 = (PrivacyControlActivity.this.currentMinus == null || PrivacyControlActivity.this.currentMinus.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, pluralString2);
                }
                if (PrivacyControlActivity.this.rulesType == 0 || PrivacyControlActivity.this.rulesType == 4 || PrivacyControlActivity.this.rulesType == 9 || PrivacyControlActivity.this.rulesType == 14) {
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NeverShareWith), pluralString2, false, false);
                } else {
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NeverAllow), pluralString2, false, false);
                }
                if (PrivacyControlActivity.this.rulesType == 12) {
                    textSettingsCell.setEnabled(!PrivacyControlActivity.this.areAllStarGiftsDisabled());
                    return;
                }
                return;
            }
            if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == PrivacyControlActivity.this.detailRow2) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivateMessagesChargePriceInfo));
                } else if (i == PrivacyControlActivity.this.detailRow && PrivacyControlActivity.this.rulesType == 10) {
                    textInfoPrivacyCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyMessagesInfo), new Runnable(this) {
                        public final PrivacyControlActivity.ListAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.f$0.lambda$onBindViewHolder$1();
                                    break;
                                default:
                                    this.f$0.lambda$onBindViewHolder$5();
                                    break;
                            }
                        }
                    }));
                } else if (i == PrivacyControlActivity.this.detailRow && PrivacyControlActivity.this.rulesType == 8) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo));
                } else if (i == PrivacyControlActivity.this.setBirthdayRow) {
                    String string = LocaleController.getString(R.string.PrivacyBirthdaySet);
                    final char c3 = c2 == true ? 1 : 0;
                    textInfoPrivacyCell.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new Runnable(this) {
                        public final PrivacyControlActivity.ListAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (c3) {
                                case 0:
                                    this.f$0.lambda$onBindViewHolder$1();
                                    break;
                                default:
                                    this.f$0.lambda$onBindViewHolder$5();
                                    break;
                            }
                        }
                    }), true));
                } else if (i == PrivacyControlActivity.this.detailRow) {
                    if (PrivacyControlActivity.this.rulesType == 6) {
                        PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                        if (privacyControlActivity.prevSubtypeContacts = privacyControlActivity.currentType == 1 && PrivacyControlActivity.this.currentSubType == 1) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyPhoneInfo3));
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            Locale locale = Locale.ENGLISH;
                            final String strM = Fragment$$ExternalSyntheticOutline0.m("https://t.me/+", PrivacyControlActivity.this.getUserConfig().getClientPhone());
                            SpannableString spannableString = new SpannableString(strM);
                            spannableString.setSpan(new ClickableSpan() {
                                @Override
                                public void onClick(View view) {
                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", strM));
                                    BulletinFactory.of(PrivacyControlActivity.this).createCopyLinkBulletin(LocaleController.getString(R.string.LinkCopied), PrivacyControlActivity.this.getResourceProvider()).show();
                                }
                            }, 0, strM.length(), 33);
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo)).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo4)).append((CharSequence) "\n").append((CharSequence) spannableString);
                            textInfoPrivacyCell.setText(spannableStringBuilder);
                        }
                    } else if (PrivacyControlActivity.this.rulesType == 5) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyForwardsInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 4) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 9) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBioInfo3));
                    } else if (PrivacyControlActivity.this.rulesType == 14) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyMusicInfo3));
                    } else if (PrivacyControlActivity.this.rulesType == 11) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 12) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyGiftsInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 3) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyCallsP2PHelp));
                    } else if (PrivacyControlActivity.this.rulesType == 2) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.WhoCanCallMeInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 1) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.WhoCanAddMeInfo));
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomHelp));
                    }
                } else if (i == PrivacyControlActivity.this.shareDetailRow) {
                    if (PrivacyControlActivity.this.rulesType == 6) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyPhoneInfo2));
                    } else if (PrivacyControlActivity.this.rulesType == 5) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyForwardsInfo2));
                    } else if (PrivacyControlActivity.this.rulesType == 4) {
                        if (PrivacyControlActivity.this.currentType == 2) {
                            textInfoPrivacyCell.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo5)));
                        } else if (PrivacyControlActivity.this.currentType == 0) {
                            textInfoPrivacyCell.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo3)));
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo4));
                        }
                    } else if (PrivacyControlActivity.this.rulesType == 3) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomP2PInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 9) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBioInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 14) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyMusicInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 11) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo3));
                    } else if (PrivacyControlActivity.this.rulesType == 2) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomCallInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 1) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomShareInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 12) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomShareGiftsInfo));
                    } else if (PrivacyControlActivity.this.rulesType == 8) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo2));
                    } else if (PrivacyControlActivity.this.rulesType == 10) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsInfo));
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomShareSettingsHelp));
                    }
                } else if (i == PrivacyControlActivity.this.photoForRestDescriptionRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PhotoForRestDescription));
                } else if (i == PrivacyControlActivity.this.readDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.HideReadTimeInfo));
                } else if (i == PrivacyControlActivity.this.readPremiumDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(PrivacyControlActivity.this.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumInfoForPremium : R.string.PrivacyLastSeenPremiumInfo));
                } else if (i == PrivacyControlActivity.this.priceInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.formatString(R.string.PrivateMessagesPriceInfo, AffiliateProgramFragment.percents(PrivacyControlActivity.this.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((double) ((int) ((((double) (PrivacyControlActivity.this.currentStars * (PrivacyControlActivity.this.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f))) / 1000.0d) * ((double) PrivacyControlActivity.this.getMessagesController().starsUsdWithdrawRate1000)))) / 100.0d)));
                } else if (i == PrivacyControlActivity.this.showGiftIconInfoRow) {
                    SpannableString spannableString2 = new SpannableString("g");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_input_gift);
                    coloredImageSpan.setScale(0.583f, 0.583f);
                    spannableString2.setSpan(coloredImageSpan, 0, 1, 33);
                    textInfoPrivacyCell.setText(LocaleController.formatSpannable(R.string.PrivacyGiftsShowIconInfo, spannableString2));
                } else if (i == PrivacyControlActivity.this.giftTypesInfoRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyGiftsTypeInfo));
                }
                textInfoPrivacyCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                return;
            }
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                RadioCell radioCell = (RadioCell) viewHolder.itemView;
                radioCell.setRadioIcon(null);
                if (i == PrivacyControlActivity.this.everybodyRow || i == PrivacyControlActivity.this.myContactsRow || i == PrivacyControlActivity.this.nobodyRow || i == PrivacyControlActivity.this.payRow) {
                    if (i == PrivacyControlActivity.this.everybodyRow) {
                        if (PrivacyControlActivity.this.rulesType == 3) {
                            radioCell.setText(LocaleController.getString(R.string.P2PEverybody), PrivacyControlActivity.this.currentType == 0, true);
                        } else {
                            radioCell.setText(LocaleController.getString(R.string.LastSeenEverybody), PrivacyControlActivity.this.currentType == 0, true);
                        }
                    } else if (i == PrivacyControlActivity.this.myContactsRow) {
                        if ((PrivacyControlActivity.this.rulesType == 8 && !PrivacyControlActivity.this.getUserConfig().isPremium()) || (PrivacyControlActivity.this.rulesType == 10 && !PrivacyControlActivity.this.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !PrivacyControlActivity.this.getUserConfig().isPremium())) {
                            radioCell.setRadioIcon(PrivacyControlActivity.this.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        if (PrivacyControlActivity.this.rulesType == 3) {
                            radioCell.setText(LocaleController.getString(R.string.P2PContacts), PrivacyControlActivity.this.currentType == 2, (PrivacyControlActivity.this.nobodyRow == -1 && PrivacyControlActivity.this.payRow == -1) ? false : true);
                        } else if (PrivacyControlActivity.this.rulesType == 10) {
                            radioCell.setText(LocaleController.getString(R.string.PrivacyMessagesContactsAndPremium), PrivacyControlActivity.this.currentType == 2, (PrivacyControlActivity.this.nobodyRow == -1 && PrivacyControlActivity.this.payRow == -1) ? false : true);
                        } else {
                            radioCell.setText(LocaleController.getString(R.string.LastSeenContacts), PrivacyControlActivity.this.currentType == 2, (PrivacyControlActivity.this.nobodyRow == -1 && PrivacyControlActivity.this.payRow == -1) ? false : true);
                        }
                    } else if (i == PrivacyControlActivity.this.payRow) {
                        if (PrivacyControlActivity.this.rulesType == 10 && !PrivacyControlActivity.this.getUserConfig().isPremium()) {
                            radioCell.setRadioIcon(PrivacyControlActivity.this.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        radioCell.setText(LocaleController.getString(R.string.PrivateMessagesChargePrice), PrivacyControlActivity.this.currentType == 3, false);
                    } else {
                        if ((PrivacyControlActivity.this.rulesType == 8 && !PrivacyControlActivity.this.getUserConfig().isPremium()) || (PrivacyControlActivity.this.rulesType == 10 && !PrivacyControlActivity.this.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !PrivacyControlActivity.this.getUserConfig().isPremium())) {
                            radioCell.setRadioIcon(PrivacyControlActivity.this.getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        if (PrivacyControlActivity.this.rulesType == 3) {
                            radioCell.setText(LocaleController.getString(R.string.P2PNobody), PrivacyControlActivity.this.currentType == 1, false);
                        } else {
                            radioCell.setText(LocaleController.getString(R.string.LastSeenNobody), PrivacyControlActivity.this.currentType == 1, false);
                        }
                    }
                } else if (i == PrivacyControlActivity.this.phoneContactsRow) {
                    radioCell.setText(LocaleController.getString(R.string.LastSeenContacts), PrivacyControlActivity.this.currentSubType == 1, false);
                } else if (i == PrivacyControlActivity.this.phoneEverybodyRow) {
                    radioCell.setText(LocaleController.getString(R.string.LastSeenEverybody), PrivacyControlActivity.this.currentSubType == 0, true);
                }
                if (PrivacyControlActivity.this.rulesType == 12) {
                    radioCell.setEnabled(!PrivacyControlActivity.this.areAllStarGiftsDisabled(), null);
                    return;
                }
                return;
            }
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            if (i != PrivacyControlActivity.this.sectionRow) {
                if (i == PrivacyControlActivity.this.shareSectionRow) {
                    if (PrivacyControlActivity.this.rulesType == 10) {
                        headerCell.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsHeader));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.AddExceptions));
                        return;
                    }
                }
                if (i == PrivacyControlActivity.this.p2pSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.PrivacyP2PHeader));
                    return;
                }
                if (i == PrivacyControlActivity.this.phoneSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.PrivacyPhoneTitle2));
                    return;
                } else if (i == PrivacyControlActivity.this.priceHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.PrivateMessagesPriceHeader));
                    return;
                } else {
                    if (i == PrivacyControlActivity.this.giftTypesHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.PrivacyGiftsTypeHeader));
                        return;
                    }
                    return;
                }
            }
            if (PrivacyControlActivity.this.rulesType == 6) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyPhoneTitle));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 5) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyForwardsTitle));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 4) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyProfilePhotoTitle));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 9) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyBioTitle));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 14) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyMusicTitle));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 3) {
                headerCell.setText(LocaleController.getString(R.string.P2PEnabledWith));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 2) {
                headerCell.setText(LocaleController.getString(R.string.WhoCanCallMe));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 1) {
                headerCell.setText(LocaleController.getString(R.string.WhoCanAddMe));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 8) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesTitle));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 10) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyMessagesTitle));
                return;
            }
            if (PrivacyControlActivity.this.rulesType == 11) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyBirthdayTitle));
            } else if (PrivacyControlActivity.this.rulesType == 12) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyGiftsTitle));
            } else {
                headerCell.setText(LocaleController.getString(R.string.LastSeenTitle));
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ?? r11;
            ?? textInfoPrivacyCell;
            switch (i) {
                case 0:
                    TextSettingsCell textSettingsCell = new TextSettingsCell(this.mContext, null, 0);
                    textSettingsCell.setCanDisable(true);
                    r11 = textSettingsCell;
                    textInfoPrivacyCell = r11;
                    break;
                case 1:
                    textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                    break;
                case 2:
                    textInfoPrivacyCell = new HeaderCell(this.mContext);
                    break;
                case 3:
                    textInfoPrivacyCell = new RadioCell(this.mContext, null);
                    break;
                case 4:
                    textInfoPrivacyCell = PrivacyControlActivity.this.messageCell;
                    break;
                case 5:
                default:
                    textInfoPrivacyCell = new ShadowSectionCell(this.mContext, null, 0);
                    break;
                case 6:
                    PrivacyControlActivity.this.setAvatarCell = new TextCell(PrivacyControlActivity.this.getContext());
                    if (PrivacyControlActivity.this.avatarForRest == null) {
                        PrivacyControlActivity.this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), R.drawable.msg_addphoto, false);
                    } else {
                        PrivacyControlActivity.this.setAvatarCell.setTextAndIcon((CharSequence) LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), R.drawable.msg_addphoto, true);
                    }
                    PrivacyControlActivity.this.setAvatarCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    PrivacyControlActivity.this.setAvatarCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                    int i2 = R.raw.camera_outline;
                    privacyControlActivity.cameraDrawable = new RLottieDrawable(i2, Fragment$$ExternalSyntheticOutline0.m(i2, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    PrivacyControlActivity.this.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
                    PrivacyControlActivity.this.setAvatarCell.imageView.setAnimation(PrivacyControlActivity.this.cameraDrawable);
                    textInfoPrivacyCell = PrivacyControlActivity.this.setAvatarCell;
                    break;
                case 7:
                    PrivacyControlActivity.this.oldAvatarView = new BackupImageView(PrivacyControlActivity.this.getContext());
                    PrivacyControlActivity.this.oldPhotoCell = new TextCell(PrivacyControlActivity.this.getContext()) {
                        @Override
                        public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                            super.onLayout(z, i3, i4, i5, i6);
                            int iDp = AndroidUtilities.dp(21.0f);
                            int measuredHeight = (getMeasuredHeight() - PrivacyControlActivity.this.oldAvatarView.getMeasuredHeight()) / 2;
                            PrivacyControlActivity.this.oldAvatarView.layout(iDp, measuredHeight, PrivacyControlActivity.this.oldAvatarView.getMeasuredWidth() + iDp, PrivacyControlActivity.this.oldAvatarView.getMeasuredHeight() + measuredHeight);
                        }

                        @Override
                        public void onMeasure(int i3, int i4) {
                            super.onMeasure(i3, i4);
                            PrivacyControlActivity.this.oldAvatarView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                            PrivacyControlActivity.this.oldAvatarView.setRoundRadius(AndroidUtilities.dp(30.0f));
                        }
                    };
                    if (PrivacyControlActivity.this.avatarForRest != null) {
                        if (PrivacyControlActivity.this.avatarForRestPhoto != null) {
                            PrivacyControlActivity.this.oldAvatarView.setImage(ImageLocation.getForPhoto(PrivacyControlActivity.this.avatarForRest, PrivacyControlActivity.this.avatarForRestPhoto), "50_50", (Drawable) null, UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getCurrentUser());
                        } else {
                            PrivacyControlActivity.this.oldAvatarView.setImage(ImageLocation.getForLocal(PrivacyControlActivity.this.avatarForRest.location), "50_50", (Drawable) null, UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getCurrentUser());
                        }
                    }
                    PrivacyControlActivity.this.oldPhotoCell.addView(PrivacyControlActivity.this.oldAvatarView, LayoutHelper.createFrame(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    PrivacyControlActivity.this.oldPhotoCell.setText(LocaleController.getString(R.string.RemovePublicPhoto), false);
                    PrivacyControlActivity.this.oldPhotoCell.getImageView().setVisibility(0);
                    PrivacyControlActivity.this.oldPhotoCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    TextCell textCell = PrivacyControlActivity.this.oldPhotoCell;
                    int i3 = Theme.key_text_RedRegular;
                    textCell.setColors(i3, i3);
                    textInfoPrivacyCell = PrivacyControlActivity.this.oldPhotoCell;
                    break;
                case 8:
                    textInfoPrivacyCell = new TextCheckCell(this.mContext, 21, false, ((BaseFragment) PrivacyControlActivity.this).resourceProvider);
                    break;
                case 9:
                    textInfoPrivacyCell = new SlideIntChooseView(this.mContext, ((BaseFragment) PrivacyControlActivity.this).resourceProvider);
                    break;
                case 10:
                    ?? frameLayout = new FrameLayout(this.mContext);
                    ButtonWithCounterView round = new ButtonWithCounterView(this.mContext, true, ((BaseFragment) PrivacyControlActivity.this).resourceProvider).setRound();
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                    spannableStringBuilder.append((CharSequence) " l");
                    spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    round.setText(spannableStringBuilder, false);
                    round.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 21));
                    frameLayout.addView(round, LayoutHelper.createFrame(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                    r11 = frameLayout;
                    textInfoPrivacyCell = r11;
                    break;
            }
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }
    }

    public class MessageCell extends FrameLayout {
        private Drawable backgroundDrawable;
        private BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
        private ChatMessageCell cell;
        private HintView hintView;
        private final Runnable invalidateRunnable;
        private MessageObject messageObject;
        private Drawable shadowDrawable;

        public MessageCell(Context context) {
            super(context);
            this.invalidateRunnable = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 1);
            setWillNotDraw(false);
            setClipToPadding(false);
            this.shadowDrawable = Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow);
            setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            TLRPC.User user = MessagesController.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getUser(Long.valueOf(UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getClientUserId()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(R.string.PrivacyForwardsMessageLine);
            tL_message.date = iCurrentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 261;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = ContactsController.formatName(user.first_name, user.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(((BaseFragment) PrivacyControlActivity.this).currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(((BaseFragment) PrivacyControlActivity.this).currentAccount, tL_message, true, false);
            this.messageObject = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            ChatMessageCell chatMessageCell = new ChatMessageCell(context, ((BaseFragment) PrivacyControlActivity.this).currentAccount, false, null, null);
            this.cell = chatMessageCell;
            chatMessageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                @Override
                public boolean allowAddPollOptions() {
                    return false;
                }

                @Override
                public boolean canDrawOutboundsContent() {
                    return true;
                }

                @Override
                public boolean canPerformActions() {
                    return false;
                }

                @Override
                public boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public boolean canSaveRichDocument(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                @Override
                public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i, float f, float f2) {
                    return false;
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell2, TLRPC.PollAnswer pollAnswer) {
                    return false;
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem) {
                    return false;
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2) {
                    return false;
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell2, AnimatedEmojiSpan animatedEmojiSpan) {
                    return false;
                }

                @Override
                public void didPressAppUpdateButton() {
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell2, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell2, TLObject tLObject, boolean z) {
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell2, MessageObject.TextLayoutBlock textLayoutBlock) {
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell2, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                public void didPressDialogButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell2) {
                }

                public void didPressEmojiStatus() {
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell2, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell2, int i, int i2) {
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell2, int i) {
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell2, int i) {
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell2, float f, float f2, boolean z) {
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell2, int i) {
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didPressPollMedia(ChatMessageCell chatMessageCell2, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i) {
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell2, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell2, int i, float f, float f2, boolean z) {
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell2, TLRPC.Document document, float f, float f2) {
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell2, boolean z) {
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell2, TLRPC.TodoItem todoItem, boolean z) {
                    return false;
                }

                public void didPressTopicButton(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell2, CharacterStyle characterStyle, boolean z) {
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell2, TLRPC.User user2, float f, float f2, boolean z) {
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell2, TLRPC.User user2, TLRPC.Document document, String str) {
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell2, String str) {
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell2, long j) {
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell2, ArrayList arrayList, int i, int i2, int i3) {
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell2, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell2.getContext(), str);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell2, float f, float f2) {
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject2) {
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell2) {
                }

                @Override
                public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell2, boolean z, Runnable runnable) {
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject2) {
                    return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject2);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell2) {
                }

                public boolean drawingVideoPlayerContainer() {
                    return false;
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z) {
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell2, boolean z) {
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell2) {
                    return 0;
                }

                @Override
                public String getAdminRank(long j) {
                    return null;
                }

                @Override
                public int getChatMode() {
                    return 0;
                }

                @Override
                public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return null;
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return null;
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell2) {
                    return null;
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell2) {
                    return null;
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return null;
                }

                @Override
                public boolean hasSelectedMessages() {
                    return false;
                }

                @Override
                public void invalidateBlur() {
                }

                @Override
                public boolean isAdmin(long j) {
                    return false;
                }

                @Override
                public boolean isLandscape() {
                    return false;
                }

                @Override
                public boolean isOwner(long j) {
                    return false;
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell2, int i) {
                    return false;
                }

                @Override
                public boolean isReplyOrSelf() {
                    return false;
                }

                @Override
                public boolean keyboardIsOpened() {
                    return false;
                }

                @Override
                public void needOpenWebView(MessageObject messageObject2, String str, String str2, String str3, String str4, int i, int i2) {
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell2, MessageObject messageObject2, boolean z) {
                    return false;
                }

                @Override
                public void needReloadPolls() {
                }

                @Override
                public void needShowPremiumBulletin(int i) {
                }

                public void needShowPremiumFeatures(String str) {
                }

                @Override
                public boolean onAccessibilityAction(int i, Bundle bundle) {
                    return false;
                }

                @Override
                public void onDiceFinished() {
                }

                @Override
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell2, TL_iv.PageBlock pageBlock) {
                    return false;
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject2) {
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell2, boolean z) {
                    return false;
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject2) {
                    return true;
                }

                public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell2) {
                    return false;
                }

                @Override
                public void videoTimerReached() {
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell2, boolean z, boolean z2) {
                    forceUpdate(chatMessageCell2, z);
                }
            });
            ChatMessageCell chatMessageCell2 = this.cell;
            chatMessageCell2.isChat = false;
            chatMessageCell2.setFullyDraw(true);
            this.cell.setMessageObject(this.messageObject, null, false, false, false);
            addView(this.cell, LayoutHelper.createLinear(-1, -2));
            HintView hintView = new HintView(context, 1, true);
            this.hintView = hintView;
            addView(hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            this.hintView.showForMessageCell(this.cell, false);
        }

        @Override
        public void dispatchSetPressed(boolean z) {
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public void invalidate() {
            super.invalidate();
            this.cell.invalidate();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
            if (disposable != null) {
                disposable.dispose();
                this.backgroundGradientDisposable = null;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            Drawable drawable = Theme.themedWallpaper;
            if (drawable == null) {
                drawable = Theme.wallpaper;
            }
            if (drawable != null && this.backgroundDrawable != drawable) {
                BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
                if (disposable != null) {
                    disposable.dispose();
                    this.backgroundGradientDisposable = null;
                }
                this.backgroundDrawable = drawable;
            }
            Drawable drawable2 = this.backgroundDrawable;
            if ((drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable) || (drawable2 instanceof MotionBackgroundDrawable)) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                Drawable drawable3 = this.backgroundDrawable;
                if (drawable3 instanceof BackgroundGradientDrawable) {
                    this.backgroundGradientDisposable = ((BackgroundGradientDrawable) drawable3).drawExactBoundsSize(canvas, this);
                } else {
                    drawable3.draw(canvas);
                }
            } else if (drawable2 instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f = 2.0f / AndroidUtilities.density;
                    canvas.scale(f, f);
                    this.backgroundDrawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float fMax = Math.max(getMeasuredWidth() / this.backgroundDrawable.getIntrinsicWidth(), measuredHeight / this.backgroundDrawable.getIntrinsicHeight());
                    int iCeil = (int) Math.ceil(this.backgroundDrawable.getIntrinsicWidth() * fMax);
                    int iCeil2 = (int) Math.ceil(this.backgroundDrawable.getIntrinsicHeight() * fMax);
                    int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                    int i = (measuredHeight - iCeil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, iCeil, getMeasuredHeight());
                    this.backgroundDrawable.setBounds(measuredWidth, i, iCeil + measuredWidth, iCeil2 + i);
                }
                this.backgroundDrawable.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
            this.shadowDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.shadowDrawable.draw(canvas);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public PrivacyControlActivity(int i, boolean z) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        super(null);
        this.initialPlus = new ArrayList<>();
        this.initialMinus = new ArrayList<>();
        this.initialPlusPremium = new boolean[4];
        this.initialPlusMiniapps = new boolean[4];
        this.initialPlusChannels = new boolean[4];
        this.currentPlusPremium = new boolean[4];
        this.currentPlusMiniapps = new boolean[4];
        this.currentPlusChannels = new boolean[4];
        this.currentStars = 10L;
        this.shakeDp = 4;
        this.rulesType = i;
        if (z) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (this.rulesType == 4) {
            ImageUpdater imageUpdater = new ImageUpdater(true, 0, true);
            this.imageUpdater = imageUpdater;
            imageUpdater.parentFragment = this;
            imageUpdater.setDelegate(this);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, 1000)) == null) {
                return;
            }
            this.avatarForRest = closestPhotoSizeWithSize;
            this.avatarForRestPhoto = userFull.fallback_photo;
        }
    }

    private void applyCurrentPrivacySettings() {
        final AtomicInteger atomicInteger;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        if (this.rulesType == 10) {
            boolean[] zArr = {true, false};
            if (this.currentType == 3) {
                Collections.sort(this.initialPlus);
                Collections.sort(this.currentPlus);
                if (!this.initialPlus.equals(this.currentPlus)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.currentType != 0 && this.currentPlus.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i = 0; i < this.currentPlus.size(); i++) {
                            Long l = this.currentPlus.get(i);
                            long jLongValue = l.longValue();
                            if (DialogObject.isUserDialog(jLongValue)) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l);
                                if (user != null && (inputUser3 = MessagesController.getInstance(this.currentAccount).getInputUser(user)) != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-jLongValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new LinkManager$$ExternalSyntheticLambda15(12, this, zArr));
                }
            }
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                globalPrivacySettings2.flags = globalPrivacySettings.flags;
                globalPrivacySettings2.disallowed_stargifts = globalPrivacySettings.disallowed_stargifts;
                globalPrivacySettings2.archive_and_mute_new_noncontact_peers = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                globalPrivacySettings2.noncontact_peers_paid_stars = globalPrivacySettings.noncontact_peers_paid_stars;
                globalPrivacySettings2.keep_archived_folders = globalPrivacySettings.keep_archived_folders;
                globalPrivacySettings2.keep_archived_unmuted = globalPrivacySettings.keep_archived_unmuted;
                globalPrivacySettings2.hide_read_marks = globalPrivacySettings.hide_read_marks;
            }
            int i2 = this.currentType;
            if (i2 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.currentStars;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                globalPrivacySettings4.new_noncontact_peers_require_premium = i2 == 2;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new LoginActivity$$ExternalSyntheticLambda27(6, this, zArr, globalPrivacySettings, setglobalprivacysettings));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        int i3 = this.rulesType;
        if (i3 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.currentType == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.currentSubType == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                final int i4 = 0;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {
                    public final PrivacyControlActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$applyCurrentPrivacySettings$19(atomicInteger2, tLObject, tL_error);
                                break;
                            default:
                                this.f$0.lambda$applyCurrentPrivacySettings$21(atomicInteger2, tLObject, tL_error);
                                break;
                        }
                    }
                }, 2);
            }
        } else if (i3 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i3 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i3 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i3 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i3 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i3 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i3 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i3 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i3 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i3 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.currentType != 0 && this.currentPlus.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i5 = 0; i5 < this.currentPlus.size(); i5++) {
                Long l2 = this.currentPlus.get(i5);
                long jLongValue2 = l2.longValue();
                if (DialogObject.isUserDialog(jLongValue2)) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(l2);
                    if (user2 != null && (inputUser2 = MessagesController.getInstance(this.currentAccount).getInputUser(user2)) != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(inputUser2);
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-jLongValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.currentType != 1 && this.currentMinus.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i6 = 0; i6 < this.currentMinus.size(); i6++) {
                Long l3 = this.currentMinus.get(i6);
                long jLongValue3 = l3.longValue();
                if (DialogObject.isUserDialog(jLongValue3)) {
                    TLRPC.User user3 = getMessagesController().getUser(l3);
                    if (user3 != null && (inputUser = getMessagesController().getInputUser(user3)) != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-jLongValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i7 = this.currentType;
        if (i7 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i7 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i7 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i8 = this.currentType;
        if (i8 != 0) {
            if (this.currentPlusPremium[i8 != 2 ? (char) 1 : (char) 0]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        boolean[] zArr2 = this.currentPlusMiniapps;
        int i9 = this.currentType;
        if (zArr2[i9]) {
            if (i9 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        final int i10 = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {
            public final PrivacyControlActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i10) {
                    case 0:
                        this.f$0.lambda$applyCurrentPrivacySettings$19(atomicInteger2, tLObject, tL_error);
                        break;
                    default:
                        this.f$0.lambda$applyCurrentPrivacySettings$21(atomicInteger2, tLObject, tL_error);
                        break;
                }
            }
        }, 2);
        if (this.rulesType != 0 || this.selectedReadValue == this.currentReadValue) {
            atomicInteger = atomicInteger2;
        } else {
            atomicInteger2.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.selectedReadValue;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            final int i11 = 0;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) {
                public final PrivacyControlActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            this.f$0.lambda$applyCurrentPrivacySettings$23(globalPrivacySettings5, setglobalprivacysettings2, atomicInteger, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$applyCurrentPrivacySettings$25(globalPrivacySettings5, setglobalprivacysettings2, atomicInteger, tLObject, tL_error);
                            break;
                    }
                }
            });
        }
        if (this.rulesType == 12 && (this.selectedGiftIconValue != this.currentGiftIconValue || this.selectedGiftLimitedValue != this.currentGiftLimitedValue || this.selectedGiftUnlimitedValue != this.currentGiftUnlimitedValue || this.selectedGiftUniqueValue != this.currentGiftUniqueValue || this.selectedGiftPremiumValue != this.currentGiftPremiumValue)) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
            globalPrivacySettings8.archive_and_mute_new_noncontact_peers = globalPrivacySettings7.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings8.keep_archived_folders = globalPrivacySettings7.keep_archived_folders;
            globalPrivacySettings8.keep_archived_unmuted = globalPrivacySettings7.keep_archived_unmuted;
            globalPrivacySettings8.new_noncontact_peers_require_premium = globalPrivacySettings7.new_noncontact_peers_require_premium;
            globalPrivacySettings8.noncontact_peers_paid_stars = globalPrivacySettings7.noncontact_peers_paid_stars;
            globalPrivacySettings8.hide_read_marks = globalPrivacySettings7.hide_read_marks;
            globalPrivacySettings8.display_gifts_button = this.selectedGiftIconValue;
            if (getUserConfig().isPremium()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.selectedGiftUnlimitedValue;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.selectedGiftLimitedValue;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.selectedGiftUniqueValue;
                disallowedGiftsSettings.disallow_premium_gifts = !this.selectedGiftPremiumValue;
            }
            final int i12 = 1;
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) {
                public final PrivacyControlActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            this.f$0.lambda$applyCurrentPrivacySettings$23(globalPrivacySettings7, setglobalprivacysettings3, atomicInteger, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$applyCurrentPrivacySettings$25(globalPrivacySettings7, setglobalprivacysettings3, atomicInteger, tLObject, tL_error);
                            break;
                    }
                }
            });
        }
        if (atomicInteger.get() > 0) {
            this.doneButtonDrawable.animateToProgress(1.0f);
        }
    }

    public boolean areAllStarGiftsDisabled() {
        return (this.selectedGiftUniqueValue || this.selectedGiftUnlimitedValue || this.selectedGiftLimitedValue) ? false : true;
    }

    public boolean checkDiscard(boolean z) {
        if (this.doneButton.getAlpha() != 1.0f) {
            return true;
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.UserRestrictionsApplyChanges));
            builder.setMessage(LocaleController.getString(R.string.PrivacySettingsChangedAlert));
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new PrivacyControlActivity$$ExternalSyntheticLambda9(this, 1));
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new PrivacyControlActivity$$ExternalSyntheticLambda9(this, 2));
            showDialog(builder.create());
        }
        return false;
    }

    private void checkPrivacy() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i;
        int i2 = this.rulesType;
        if (i2 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            int i3 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 2;
            this.currentType = i3;
            this.initialRulesType = i3;
            this.currentMinus = new ArrayList<>();
            this.currentPlus = new ArrayList<>();
            if (globalPrivacySettings == null || (globalPrivacySettings.flags & 32) == 0) {
                this.currentStars = 10L;
                this.initialStars = 10L;
            } else {
                long jClamp = Utilities.clamp(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.currentStars = jClamp;
                this.initialStars = jClamp;
                this.currentType = 3;
                this.initialRulesType = 3;
            }
            ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(13);
            this.currentPlus = new ArrayList<>();
            if (privacyRules != null) {
                for (int i4 = 0; i4 < privacyRules.size(); i4++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i4);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int iM = 0;
                        while (iM < size) {
                            iM = MessagesController$$ExternalSyntheticOutline2.m(-tL_privacyValueAllowChatParticipants.chats.get(iM).longValue(), this.currentPlus, iM, 1);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.currentPlus.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            this.initialPlus.clear();
            this.initialPlus.addAll(this.currentPlus);
            return;
        }
        boolean[] zArr = this.currentPlusPremium;
        boolean[] zArr2 = this.initialPlusPremium;
        boolean z = i2 == 1;
        zArr2[0] = z;
        zArr[0] = z;
        zArr2[1] = false;
        zArr[1] = false;
        boolean[] zArr3 = this.currentPlusMiniapps;
        boolean[] zArr4 = this.initialPlusMiniapps;
        zArr4[0] = false;
        zArr3[0] = false;
        boolean z2 = i2 == 12;
        zArr4[1] = z2;
        zArr3[1] = z2;
        zArr4[2] = false;
        zArr3[2] = false;
        zArr4[3] = false;
        zArr3[3] = false;
        boolean[] zArr5 = this.currentPlusChannels;
        boolean[] zArr6 = this.initialPlusChannels;
        zArr6[0] = false;
        zArr5[0] = false;
        boolean z3 = i2 == 12;
        zArr6[1] = z3;
        zArr5[1] = z3;
        zArr6[2] = false;
        zArr5[2] = false;
        zArr6[3] = false;
        zArr5[3] = false;
        this.currentPlus = new ArrayList<>();
        this.currentMinus = new ArrayList<>();
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(this.rulesType);
        if (privacyRules2 == null || privacyRules2.size() == 0) {
            this.currentType = 1;
        } else {
            Boolean bool = null;
            int i5 = 0;
            byte b = -1;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < privacyRules2.size()) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i5);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int iM2 = 0;
                    while (iM2 < size2) {
                        iM2 = MessagesController$$ExternalSyntheticOutline2.m(-tL_privacyValueAllowChatParticipants2.chats.get(iM2).longValue(), this.currentPlus, iM2, 1);
                        i5 = i5;
                    }
                    i = i5;
                } else {
                    i = i5;
                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule2;
                        int size3 = tL_privacyValueDisallowChatParticipants.chats.size();
                        int iM3 = 0;
                        while (iM3 < size3) {
                            iM3 = MessagesController$$ExternalSyntheticOutline2.m(-tL_privacyValueDisallowChatParticipants.chats.get(iM3).longValue(), this.currentMinus, iM3, 1);
                        }
                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.currentPlus.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                        this.currentMinus.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                        z4 = true;
                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                        bool = Boolean.TRUE;
                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                        bool = Boolean.FALSE;
                    } else {
                        boolean z6 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                        if (z6) {
                            b = 0;
                        } else {
                            boolean z7 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                            if (z7 && !z5) {
                                b = 1;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                b = 2;
                                z5 = true;
                            } else if (b == -1) {
                                if (z6) {
                                    b = 0;
                                } else if (!z7 || z5) {
                                    b = 2;
                                } else {
                                    b = 1;
                                }
                            }
                        }
                    }
                }
                i5 = i + 1;
            }
            if (b == 0 || (b == -1 && (this.currentMinus.size() > 0 || !(bool == null || bool.booleanValue())))) {
                this.currentType = 0;
            } else if (b == 2 || (b == -1 && this.currentMinus.size() > 0 && this.currentPlus.size() > 0)) {
                this.currentType = 2;
            } else if (b == 1 || (b == -1 && (this.currentPlus.size() > 0 || (bool != null && bool.booleanValue())))) {
                this.currentType = 1;
            }
            int i6 = this.currentType;
            char c = i6 == 2 ? (char) 0 : (char) 1;
            boolean[] zArr7 = this.currentPlusPremium;
            this.initialPlusPremium[c] = z4;
            zArr7[c] = z4;
            boolean[] zArr8 = this.currentPlusMiniapps;
            boolean[] zArr9 = this.initialPlusMiniapps;
            boolean z8 = bool != null;
            zArr9[i6] = z8;
            zArr8[i6] = z8;
            boolean[] zArr10 = this.currentPlusChannels;
            this.initialPlusChannels[i6] = false;
            zArr10[i6] = false;
            View view = this.doneButton;
            if (view != null) {
                view.setAlpha(0.0f);
                this.doneButton.setScaleX(0.0f);
                this.doneButton.setScaleY(0.0f);
                this.doneButton.setEnabled(false);
            }
        }
        this.initialPlus.clear();
        this.initialMinus.clear();
        this.initialRulesType = this.currentType;
        this.initialPlus.addAll(this.currentPlus);
        this.initialMinus.addAll(this.currentMinus);
        if (this.rulesType == 6) {
            ArrayList<TLRPC.PrivacyRule> privacyRules3 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules3 == null || privacyRules3.size() == 0) {
                this.currentSubType = 0;
            } else {
                for (int i7 = 0; i7 < privacyRules3.size(); i7++) {
                    TLRPC.PrivacyRule privacyRule3 = privacyRules3.get(i7);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.currentSubType = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.currentSubType = 2;
                        break;
                    } else {
                        if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            this.currentSubType = 1;
                            break;
                        }
                    }
                }
            }
            this.initialRulesSubType = this.currentSubType;
        }
        if (this.rulesType == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            boolean z9 = globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks;
            this.currentReadValue = z9;
            this.selectedReadValue = z9;
        }
        if (this.rulesType == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().getGlobalPrivacySettings();
            boolean z10 = globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button;
            this.currentGiftIconValue = z10;
            this.selectedGiftIconValue = z10;
            if (globalPrivacySettings3 == null || (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) == null) {
                this.selectedGiftUnlimitedValue = true;
                this.currentGiftUnlimitedValue = true;
                this.selectedGiftLimitedValue = true;
                this.currentGiftLimitedValue = true;
                this.selectedGiftUniqueValue = true;
                this.currentGiftUniqueValue = true;
                this.selectedGiftChannelsValue = true;
                this.currentGiftChannelsValue = true;
                this.selectedGiftPremiumValue = true;
                this.currentGiftPremiumValue = true;
            } else {
                boolean z11 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.selectedGiftUnlimitedValue = z11;
                this.currentGiftUnlimitedValue = z11;
                boolean z12 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.selectedGiftLimitedValue = z12;
                this.currentGiftLimitedValue = z12;
                boolean z13 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.selectedGiftUniqueValue = z13;
                this.currentGiftUniqueValue = z13;
                boolean z14 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.selectedGiftChannelsValue = z14;
                this.currentGiftChannelsValue = z14;
                boolean z15 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.selectedGiftPremiumValue = z15;
                this.currentGiftPremiumValue = z15;
            }
        }
        updateRows(false);
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    private void finished() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        this.doneButtonDrawable.animateToProgress(0.0f);
        int i = this.rulesType;
        if ((i == 10 || i == 1 || i == 2) && this.currentType != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = iArr[i2];
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i3);
                if (i3 != this.rulesType && ContactsController.findRule(privacyRules, TLRPC.TL_privacyValueAllowAll.class) != null) {
                    new AlertDialog.Builder(getContext(), 0, this.resourceProvider).setTitle(LocaleController.getString(i3 == 1 ? R.string.CheckPrivacyInviteTitle : R.string.CheckPrivacyCallsTitle)).setMessage(LocaleController.getString(i3 == 1 ? R.string.CheckPrivacyInviteText : R.string.CheckPrivacyCallsText)).setPositiveButton(LocaleController.getString(R.string.CheckPrivacyReview), new LaunchActivity$$ExternalSyntheticLambda23(this, i3, 8)).setNegativeButton(LocaleController.getString(R.string.Cancel), new PrivacyControlActivity$$ExternalSyntheticLambda9(this, 0)).show();
                    return;
                }
            }
        }
        finishFragment();
    }

    private boolean hasChanges() {
        ArrayList<Long> arrayList;
        if (this.rulesType == 0 && ((this.currentType != 0 || ((arrayList = this.currentMinus) != null && !arrayList.isEmpty())) && this.currentReadValue != this.selectedReadValue)) {
            return true;
        }
        int i = this.rulesType;
        if (i == 12 && (this.currentGiftIconValue != this.selectedGiftIconValue || this.currentGiftLimitedValue != this.selectedGiftLimitedValue || this.currentGiftUnlimitedValue != this.selectedGiftUnlimitedValue || this.currentGiftUniqueValue != this.selectedGiftUniqueValue || this.currentGiftChannelsValue != this.selectedGiftChannelsValue || this.currentGiftPremiumValue != this.selectedGiftPremiumValue)) {
            return true;
        }
        int i2 = this.initialRulesType;
        int i3 = this.currentType;
        if (i2 != i3) {
            return true;
        }
        if (i == 6 && i3 == 1 && this.initialRulesSubType != this.currentSubType) {
            return true;
        }
        if (i3 != 0) {
            if (this.initialPlusPremium[i3 == 2 ? (char) 0 : (char) 1] != this.currentPlusPremium[i3 == 2 ? (char) 0 : (char) 1]) {
                return true;
            }
        }
        if ((i == 10 && i3 == 3 && this.currentStars != this.initialStars) || this.initialPlusMiniapps[i3] != this.currentPlusMiniapps[i3] || this.initialMinus.size() != this.currentMinus.size() || this.initialPlus.size() != this.currentPlus.size()) {
            return true;
        }
        if (this.rulesType != 10 || this.currentType == 3) {
            Collections.sort(this.initialPlus);
            Collections.sort(this.currentPlus);
            if (!this.initialPlus.equals(this.currentPlus)) {
                return true;
            }
            Collections.sort(this.initialMinus);
            Collections.sort(this.currentMinus);
            if (!this.initialMinus.equals(this.currentMinus)) {
                return true;
            }
        }
        return false;
    }

    public void lambda$applyCurrentPrivacySettings$13(boolean[] zArr) {
        zArr[0] = true;
        if (zArr[1]) {
            finished();
        }
    }

    public void lambda$applyCurrentPrivacySettings$14(TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error != null) {
            showErrorAlert();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(this.currentAccount).setPrivacyRules(privacyrules.rules, 13);
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda5(7, this, zArr));
    }

    public void lambda$applyCurrentPrivacySettings$15(boolean[] zArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(16, this, tL_error, tLObject, zArr));
    }

    public void lambda$applyCurrentPrivacySettings$16(TLRPC.TL_error tL_error, boolean[] zArr, TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings) {
        if (tL_error != null) {
            showErrorAlert();
            return;
        }
        zArr[1] = true;
        if (globalPrivacySettings != null) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
            globalPrivacySettings.new_noncontact_peers_require_premium = globalPrivacySettings2.new_noncontact_peers_require_premium;
            int i = globalPrivacySettings2.flags;
            globalPrivacySettings.flags = i;
            globalPrivacySettings.disallowed_stargifts = globalPrivacySettings2.disallowed_stargifts;
            long j = globalPrivacySettings2.noncontact_peers_paid_stars;
            if (j > 0) {
                globalPrivacySettings.flags = i | 32;
                globalPrivacySettings.noncontact_peers_paid_stars = j;
            } else {
                globalPrivacySettings.flags = i & (-33);
                globalPrivacySettings.noncontact_peers_paid_stars = 0L;
            }
        }
        if (zArr[0]) {
            finished();
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.privacyRulesUpdated, new Object[0]);
    }

    public void lambda$applyCurrentPrivacySettings$17(boolean[] zArr, TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda52(this, tL_error, zArr, globalPrivacySettings, setglobalprivacysettings, 3));
    }

    public void lambda$applyCurrentPrivacySettings$18(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
            return;
        }
        ContactsController.getInstance(this.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    public void lambda$applyCurrentPrivacySettings$19(AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PrivacyControlActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, atomicInteger, 0));
    }

    public void lambda$applyCurrentPrivacySettings$20(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            showErrorAlert();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(this.currentAccount).setPrivacyRules(privacyrules.rules, this.rulesType);
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    public void lambda$applyCurrentPrivacySettings$21(AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PrivacyControlActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, atomicInteger, 1));
    }

    public void lambda$applyCurrentPrivacySettings$22(TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, AtomicInteger atomicInteger) {
        boolean z = setglobalprivacysettings.settings.hide_read_marks;
        this.currentReadValue = z;
        globalPrivacySettings.hide_read_marks = z;
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    public void lambda$applyCurrentPrivacySettings$23(TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PrivacyControlActivity$$ExternalSyntheticLambda20(this, globalPrivacySettings, setglobalprivacysettings, atomicInteger, 0));
    }

    public void lambda$applyCurrentPrivacySettings$24(TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, AtomicInteger atomicInteger) {
        TLRPC.UserFull userFull;
        if (globalPrivacySettings.display_gifts_button != setglobalprivacysettings.settings.display_gifts_button && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null) {
            userFull.display_gifts_button = setglobalprivacysettings.settings.display_gifts_button;
            getMessagesStorage().updateUserInfo(userFull, false);
        }
        boolean z = setglobalprivacysettings.settings.display_gifts_button;
        this.currentGiftIconValue = z;
        globalPrivacySettings.display_gifts_button = z;
        if (globalPrivacySettings.disallowed_stargifts == null) {
            globalPrivacySettings.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings.settings.disallowed_stargifts;
        if (disallowedGiftsSettings != null) {
            globalPrivacySettings.flags |= 64;
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings.disallowed_stargifts;
            boolean z2 = disallowedGiftsSettings.disallow_unlimited_stargifts;
            disallowedGiftsSettings2.disallow_unlimited_stargifts = z2;
            this.currentGiftUnlimitedValue = !z2;
            boolean z3 = disallowedGiftsSettings.disallow_limited_stargifts;
            disallowedGiftsSettings2.disallow_limited_stargifts = z3;
            this.currentGiftLimitedValue = !z3;
            boolean z4 = disallowedGiftsSettings.disallow_unique_stargifts;
            disallowedGiftsSettings2.disallow_unique_stargifts = z4;
            this.currentGiftUniqueValue = !z4;
            boolean z5 = disallowedGiftsSettings.disallow_stargifts_from_channels;
            disallowedGiftsSettings2.disallow_stargifts_from_channels = z5;
            this.currentGiftChannelsValue = !z5;
            boolean z6 = disallowedGiftsSettings.disallow_premium_gifts;
            disallowedGiftsSettings2.disallow_premium_gifts = z6;
            this.currentGiftPremiumValue = !z6;
        }
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    public void lambda$applyCurrentPrivacySettings$25(TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PrivacyControlActivity$$ExternalSyntheticLambda20(this, globalPrivacySettings, setglobalprivacysettings, atomicInteger, 1));
    }

    public void lambda$checkDiscard$27(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$checkDiscard$28(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$createView$3() {
        TLRPC.Photo photo;
        this.avatarForRest = null;
        this.avatarForRestPhoto = null;
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
        if (userFull == null || (photo = userFull.fallback_photo) == null) {
            return;
        }
        userFull.flags &= -4194305;
        userFull.fallback_photo = null;
        getMessagesStorage().updateUserInfo(userFull, true);
        updateAvatarForRestInfo();
        updateRows(true);
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.access_hash = photo.access_hash;
        byte[] bArr = photo.file_reference;
        tL_inputPhoto.file_reference = bArr;
        if (bArr == null) {
            tL_inputPhoto.file_reference = new byte[0];
        }
        MessagesController.getInstance(this.currentAccount).deleteUserPhoto(tL_inputPhoto);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
    }

    public static void lambda$createView$4() {
    }

    public void lambda$createView$5(DialogInterface dialogInterface) {
        if (this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCurrentFrame(0, false);
        } else {
            this.cameraDrawable.setCustomEndFrame(86);
            this.setAvatarCell.imageView.playAnimation();
        }
    }

    public void lambda$createView$6() {
        presentFragment(new PremiumPreviewFragment("noncontacts"));
    }

    public void lambda$createView$7() {
        presentFragment(new PremiumPreviewFragment("settings"));
    }

    public void lambda$createView$8(int i, boolean z, boolean z2, boolean z3, ArrayList arrayList) {
        int i2 = 0;
        if (i == this.neverShareRow) {
            this.currentMinus = arrayList;
            this.currentPlusMiniapps[this.currentType] = z && z3;
            while (i2 < this.currentMinus.size()) {
                this.currentPlus.remove(this.currentMinus.get(i2));
                i2++;
            }
        } else {
            boolean[] zArr = this.currentPlusPremium;
            int i3 = this.currentType;
            zArr[i3 == 2 ? (char) 0 : (char) 1] = z2;
            this.currentPlusMiniapps[i3] = z && z3;
            this.currentPlus = arrayList;
            while (i2 < this.currentPlus.size()) {
                this.currentMinus.remove(this.currentPlus.get(i2));
                i2++;
            }
        }
        updateDoneButton();
        this.listAdapter.notifyDataSetChanged();
    }

    public void lambda$createView$9(View view, int i) {
        boolean z;
        int i2;
        if (i == this.currentPhotoForRestRow) {
            AlertDialog alertDialogCreate = AlertsCreator.createSimpleAlert(getContext(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new PrivacyControlActivity$$ExternalSyntheticLambda0(this, 1), null).create();
            alertDialogCreate.show();
            alertDialogCreate.redPositive();
            return;
        }
        int i3 = 0;
        z = false;
        boolean z2 = false;
        if (i == this.photoForRestRow) {
            ImageUpdater imageUpdater = this.imageUpdater;
            if (imageUpdater != null) {
                imageUpdater.openMenu(false, new OAuthSheet$$ExternalSyntheticLambda5(21), new OAuthSheet$$ExternalSyntheticLambda18(this, 13), 0);
                this.cameraDrawable.setCurrentFrame(0);
                this.cameraDrawable.setCustomEndFrame(43);
                this.setAvatarCell.imageView.playAnimation();
                return;
            }
            return;
        }
        if (this.rulesType == 10 && i == this.myContactsRow && !getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !getUserConfig().isPremium()) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new PrivacyControlActivity$$ExternalSyntheticLambda0(this, 2)).show();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i4 = -this.shakeDp;
            this.shakeDp = i4;
            AndroidUtilities.shakeViewSpring(view, i4);
            return;
        }
        if (this.rulesType == 8 && ((i == this.myContactsRow || i == this.nobodyRow) && !getUserConfig().isPremium())) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new PrivacyControlActivity$$ExternalSyntheticLambda0(this, 3)).show();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i5 = -this.shakeDp;
            this.shakeDp = i5;
            AndroidUtilities.shakeViewSpring(view, i5);
            return;
        }
        if (i == this.nobodyRow || i == this.everybodyRow || i == this.myContactsRow || i == this.payRow) {
            if (this.rulesType == 12 && areAllStarGiftsDisabled()) {
                int i6 = -this.shakeDp;
                this.shakeDp = i6;
                AndroidUtilities.shakeViewSpring(view, i6);
                return;
            }
            if (i == this.nobodyRow) {
                i3 = 1;
            } else if (i != this.everybodyRow) {
                i3 = i == this.payRow ? 3 : 2;
            }
            if (i3 == this.currentType) {
                return;
            }
            this.currentType = i3;
            Bulletin.hideVisible();
            updateDoneButton();
            updateRows(true);
            return;
        }
        if (i == this.phoneContactsRow || i == this.phoneEverybodyRow) {
            int i7 = i != this.phoneEverybodyRow ? 1 : 0;
            if (i7 == this.currentSubType) {
                return;
            }
            this.currentSubType = i7;
            updateDoneButton();
            updateRows(true);
            return;
        }
        if (i == this.neverShareRow || i == this.alwaysShareRow) {
            if (this.rulesType == 12 && areAllStarGiftsDisabled()) {
                int i8 = -this.shakeDp;
                this.shakeDp = i8;
                AndroidUtilities.shakeViewSpring(view, i8);
                return;
            }
            ArrayList<Long> arrayList = i == this.neverShareRow ? this.currentMinus : this.currentPlus;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i == this.neverShareRow ? "isNeverShare" : "isAlwaysShare", true);
            bundle.putInt("chatAddType", this.rulesType != 0 ? 1 : 0);
            if (i == this.alwaysShareRow && this.rulesType == 1) {
                bundle.putBoolean("allowPremium", true);
            }
            boolean z3 = this.rulesType == 12 && ((i2 = this.currentType) != 1 ? !(i2 != 2 ? !(i2 == 0 && i == this.neverShareRow) : i != this.alwaysShareRow) : i == this.alwaysShareRow);
            bundle.putBoolean("allowMiniapps", z3);
            GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle);
            if (this.rulesType == 10) {
                groupCreateActivity.setTitle(LocaleController.getString(R.string.RemoveMessageFeeTitle));
            }
            if (i == this.alwaysShareRow) {
                if (this.currentPlusPremium[this.currentType == 2 ? (char) 0 : (char) 1]) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z3 && this.currentPlusMiniapps[this.currentType]) {
                z2 = true;
            }
            groupCreateActivity.select(arrayList, z, z2);
            groupCreateActivity.setDelegate(new ChatActivity$16$$ExternalSyntheticLambda8(this, z3, i));
            groupCreateActivity.setShowDiscardConfirm(true);
            presentFragment(groupCreateActivity);
            return;
        }
        if (i == this.p2pRow) {
            presentFragment(new PrivacyControlActivity(3));
            return;
        }
        if (i == this.readRow) {
            this.selectedReadValue = !this.selectedReadValue;
            updateDoneButton();
            ((TextCheckCell) view).setChecked(this.selectedReadValue);
            return;
        }
        if (i == this.readPremiumRow) {
            presentFragment(new PremiumPreviewFragment("lastseen"));
            return;
        }
        if (i == this.showGiftIconRow) {
            this.selectedGiftIconValue = !this.selectedGiftIconValue;
            updateDoneButton();
            ((TextCheckCell) view).setChecked(this.selectedGiftIconValue);
            return;
        }
        if (i == this.giftTypeLimitedRow) {
            if (this.selectedGiftLimitedValue && !getUserConfig().isPremium()) {
                int i9 = -this.shakeDp;
                this.shakeDp = i9;
                AndroidUtilities.shakeViewSpring(view, i9);
                showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled = areAllStarGiftsDisabled();
            this.selectedGiftLimitedValue = !this.selectedGiftLimitedValue;
            updateDoneButton();
            TextCheckCell textCheckCell = (TextCheckCell) view;
            textCheckCell.setChecked(this.selectedGiftLimitedValue);
            if (this.selectedGiftLimitedValue && !getUserConfig().isPremium()) {
                textCheckCell.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled != areAllStarGiftsDisabled()) {
                updateRows(true);
                AndroidUtilities.updateVisibleRows(this.listView);
                return;
            }
            return;
        }
        if (i == this.giftTypeUnlimitedRow) {
            if (this.selectedGiftUnlimitedValue && !getUserConfig().isPremium()) {
                int i10 = -this.shakeDp;
                this.shakeDp = i10;
                AndroidUtilities.shakeViewSpring(view, i10);
                showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled2 = areAllStarGiftsDisabled();
            this.selectedGiftUnlimitedValue = !this.selectedGiftUnlimitedValue;
            updateDoneButton();
            TextCheckCell textCheckCell2 = (TextCheckCell) view;
            textCheckCell2.setChecked(this.selectedGiftUnlimitedValue);
            if (this.selectedGiftUnlimitedValue && !getUserConfig().isPremium()) {
                textCheckCell2.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled2 != areAllStarGiftsDisabled()) {
                updateRows(true);
                AndroidUtilities.updateVisibleRows(this.listView);
                return;
            }
            return;
        }
        if (i == this.giftTypeUniqueRow) {
            if (this.selectedGiftUniqueValue && !getUserConfig().isPremium()) {
                int i11 = -this.shakeDp;
                this.shakeDp = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled3 = areAllStarGiftsDisabled();
            this.selectedGiftUniqueValue = !this.selectedGiftUniqueValue;
            updateDoneButton();
            TextCheckCell textCheckCell3 = (TextCheckCell) view;
            textCheckCell3.setChecked(this.selectedGiftUniqueValue);
            if (this.selectedGiftUniqueValue && !getUserConfig().isPremium()) {
                textCheckCell3.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled3 != areAllStarGiftsDisabled()) {
                updateRows(true);
                AndroidUtilities.updateVisibleRows(this.listView);
                return;
            }
            return;
        }
        if (i == this.giftTypeChannelsRow) {
            if (this.selectedGiftChannelsValue && !getUserConfig().isPremium()) {
                int i12 = -this.shakeDp;
                this.shakeDp = i12;
                AndroidUtilities.shakeViewSpring(view, i12);
                showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled4 = areAllStarGiftsDisabled();
            this.selectedGiftChannelsValue = !this.selectedGiftChannelsValue;
            updateDoneButton();
            TextCheckCell textCheckCell4 = (TextCheckCell) view;
            textCheckCell4.setChecked(this.selectedGiftChannelsValue);
            if (this.selectedGiftChannelsValue && !getUserConfig().isPremium()) {
                textCheckCell4.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled4 != areAllStarGiftsDisabled()) {
                updateRows(true);
                AndroidUtilities.updateVisibleRows(this.listView);
                return;
            }
            return;
        }
        if (i == this.giftTypePremiumRow) {
            if (this.selectedGiftPremiumValue && !getUserConfig().isPremium()) {
                int i13 = -this.shakeDp;
                this.shakeDp = i13;
                AndroidUtilities.shakeViewSpring(view, i13);
                showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled5 = areAllStarGiftsDisabled();
            this.selectedGiftPremiumValue = !this.selectedGiftPremiumValue;
            updateDoneButton();
            TextCheckCell textCheckCell5 = (TextCheckCell) view;
            textCheckCell5.setChecked(this.selectedGiftPremiumValue);
            if (this.selectedGiftPremiumValue && !getUserConfig().isPremium()) {
                textCheckCell5.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled5 != areAllStarGiftsDisabled()) {
                updateRows(true);
                AndroidUtilities.updateVisibleRows(this.listView);
            }
        }
    }

    public void lambda$didUploadPhoto$0(TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            userFull.flags |= 4194304;
            userFull.fallback_photo = tL_photos_photo.photo;
            getMessagesStorage().updateUserInfo(userFull, true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
            if (closestPhotoSizeWithSize != null && this.avatarForRest != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarForRest, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(this.avatarForRest.location.volume_id);
                sb.append("_");
                String strM = Fragment$$ExternalSyntheticOutline0.m(this.avatarForRest.location.local_id, "@50_50", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(strM, Fragment$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 == null || this.avatarForRest == null) {
                return;
            }
            FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarForRest.location, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
        }
    }

    public void lambda$didUploadPhoto$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda5(6, this, tLObject));
    }

    public void lambda$didUploadPhoto$2(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2) {
        this.avatarForRest = photoSize;
        this.avatarForRestPhoto = null;
        updateAvatarForRestInfo();
        if (inputFile != null || inputFile2 != null) {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            tL_photos_uploadProfilePhoto.fallback = true;
            tL_photos_uploadProfilePhoto.flags |= 8;
            getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new LinkManager$$ExternalSyntheticLambda10(this, 19));
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            tL_user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_small = photoSize.location;
            tL_userProfilePhoto.photo_big = photoSize2.location;
            tL_user.first_name = getUserConfig().getCurrentUser().first_name;
            tL_user.last_name = getUserConfig().getCurrentUser().last_name;
            tL_user.access_hash = getUserConfig().getCurrentUser().access_hash;
            BulletinFactory.of(this).createUsersBulletin(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip)).show();
        }
        updateRows(false);
    }

    public void lambda$finished$11(int i, AlertDialog alertDialog, int i2) {
        presentFragment(new PrivacyControlActivity(i), true);
    }

    public void lambda$finished$12(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    public void lambda$processDone$26(SharedPreferences sharedPreferences, AlertDialog alertDialog, int i) {
        applyCurrentPrivacySettings();
        sharedPreferences.edit().putBoolean("privacyAlertShowed", true).commit();
    }

    public void lambda$showPremiumBulletin$10() {
        presentFragment(new PremiumPreviewFragment("noncontacts"));
    }

    public void processDone() {
        if (getParentActivity() == null) {
            return;
        }
        if (this.rulesType == 10 && this.currentType == 3 && !getUserConfig().isPremium()) {
            showDialog(new PremiumFeatureBottomSheet(this, getContext(), getCurrentAccount(), false, 27, true, null));
            return;
        }
        if (this.currentType != 0 && this.rulesType == 0 && !getUserConfig().isPremium()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                if (this.rulesType == 1) {
                    builder.setMessage(LocaleController.getString(R.string.WhoCanAddMeInfo));
                } else {
                    builder.setMessage(LocaleController.getString(R.string.CustomHelp));
                }
                builder.setTitle(LocaleController.getString(R.string.AppName));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new TodoItemMenu$$ExternalSyntheticLambda7(10, this, globalMainSettings));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(builder.create());
                return;
            }
        }
        applyCurrentPrivacySettings();
    }

    private void setMessageText() {
        MessageCell messageCell = this.messageCell;
        if (messageCell != null) {
            messageCell.messageObject.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i = this.currentType;
            if (i == 0) {
                this.messageCell.hintView.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsEverybody));
                this.messageCell.messageObject.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i == 1) {
                this.messageCell.hintView.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                this.messageCell.messageObject.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.messageCell.hintView.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsContacts));
                this.messageCell.messageObject.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.messageCell.cell.forceResetMessageObject();
        }
    }

    private void showErrorAlert() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setMessage(LocaleController.getString(R.string.PrivacyFloodControlError));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(builder.create());
    }

    private void showPremiumBulletin() {
        BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new PrivacyControlActivity$$ExternalSyntheticLambda0(this, 0)).show();
    }

    private void updateAvatarForRestInfo() {
        TLRPC.PhotoSize photoSize;
        TextCell textCell = this.setAvatarCell;
        if (textCell != null) {
            if (this.avatarForRest == null) {
                textCell.getTextView().setText(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.setAvatarCell.setNeedDivider(false);
            } else {
                textCell.getTextView().setText(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.setAvatarCell.setNeedDivider(true);
            }
        }
        BackupImageView backupImageView = this.oldAvatarView;
        if (backupImageView == null || (photoSize = this.avatarForRest) == null) {
            return;
        }
        TLRPC.Photo photo = this.avatarForRestPhoto;
        if (photo != null) {
            backupImageView.setImage(ImageLocation.getForPhoto(photoSize, photo), "50_50", (Drawable) null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        } else {
            backupImageView.setImage(ImageLocation.getForLocal(photoSize.location), "50_50", (Drawable) null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        }
    }

    public void updateDoneButton() {
        boolean zHasChanges = hasChanges();
        this.doneButton.setEnabled(zHasChanges);
        this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
    }

    public void updateRows(boolean z) {
        ArrayList<Long> arrayList;
        int i;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        int i2;
        TLRPC.UserFull userFull;
        DiffCallback diffCallback = null;
        Object[] objArr = 0;
        if (z) {
            DiffCallback diffCallback2 = new DiffCallback();
            diffCallback2.fillPositions(diffCallback2.oldPositionToItem);
            diffCallback2.oldRowCount = this.rowCount;
            diffCallback = diffCallback2;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.photoForRestDescriptionRow = -1;
        this.messageRow = -1;
        this.setBirthdayRow = -1;
        this.phoneDetailRow = -1;
        this.phoneSectionRow = -1;
        this.phoneEverybodyRow = -1;
        this.phoneContactsRow = -1;
        this.alwaysShareRow = -1;
        this.neverShareRow = -1;
        this.p2pSectionRow = -1;
        this.p2pRow = -1;
        this.detailRow = -1;
        this.detailRow2 = -1;
        this.p2pDetailRow = -1;
        this.readDetailRow = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.shareSectionRow = -1;
        this.shareDetailRow = -1;
        this.payRow = -1;
        this.priceHeaderRow = -1;
        this.priceRow = -1;
        this.priceInfoRow = -1;
        this.priceButtonRow = -1;
        this.readPremiumRow = -1;
        this.readPremiumDetailRow = -1;
        this.showGiftIconRow = -1;
        this.showGiftIconInfoRow = -1;
        this.giftTypesHeaderRow = -1;
        this.giftTypeUnlimitedRow = -1;
        this.giftTypeLimitedRow = -1;
        this.giftTypeUniqueRow = -1;
        this.giftTypeChannelsRow = -1;
        this.giftTypePremiumRow = -1;
        this.giftTypesInfoRow = -1;
        this.rowCount = 0;
        int i3 = this.rulesType;
        if (i3 == 12) {
            this.showGiftIconRow = 0;
            this.rowCount = 2;
            this.showGiftIconInfoRow = 1;
        }
        if (i3 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i4 = this.rowCount;
            this.rowCount = i4 + 1;
            this.setBirthdayRow = i4;
        }
        int i5 = this.rulesType;
        if (i5 == 5) {
            int i6 = this.rowCount;
            this.rowCount = i6 + 1;
            this.messageRow = i6;
        }
        int i7 = this.rowCount;
        this.sectionRow = i7;
        this.everybodyRow = i7 + 1;
        int i8 = i7 + 3;
        this.rowCount = i8;
        this.myContactsRow = i7 + 2;
        if (i5 == 4 || i5 == 9 || i5 == 14 || i5 == 0 || i5 == 2 || i5 == 3 || i5 == 5 || i5 == 6 || i5 == 8 || i5 == 1 || i5 == 11 || i5 == 12) {
            this.rowCount = i7 + 4;
            this.nobodyRow = i8;
        }
        if (getMessagesController().starsPaidMessagesAvailable && this.rulesType == 10) {
            int i9 = this.rowCount;
            this.rowCount = i9 + 1;
            this.payRow = i9;
        }
        int i10 = this.rulesType;
        if (i10 == 6 && this.currentType == 1) {
            int i11 = this.rowCount;
            this.phoneDetailRow = i11;
            this.phoneSectionRow = i11 + 1;
            this.phoneEverybodyRow = i11 + 2;
            this.rowCount = i11 + 4;
            this.phoneContactsRow = i11 + 3;
        }
        if (i10 == 10 && this.currentType == 3) {
            int i12 = this.rowCount;
            this.rowCount = i12 + 1;
            this.detailRow2 = i12;
        } else {
            int i13 = this.rowCount;
            this.rowCount = i13 + 1;
            this.detailRow = i13;
        }
        if (i10 == 10) {
            if (this.currentType == 3) {
                int i14 = this.rowCount;
                this.priceHeaderRow = i14;
                this.rowCount = i14 + 2;
                this.priceRow = i14 + 1;
                if (!getUserConfig().isPremium()) {
                    int i15 = this.rowCount;
                    this.rowCount = i15 + 1;
                    this.priceButtonRow = i15;
                }
                int i16 = this.rowCount;
                this.rowCount = i16 + 1;
                this.priceInfoRow = i16;
                if (getUserConfig().isPremium()) {
                    int i17 = this.rowCount;
                    this.shareSectionRow = i17;
                    this.alwaysShareRow = i17 + 1;
                    this.rowCount = i17 + 3;
                    this.shareDetailRow = i17 + 2;
                }
            }
        } else if (i10 != 8 || getUserConfig().isPremium()) {
            int i18 = this.rowCount;
            int i19 = i18 + 1;
            this.rowCount = i19;
            this.shareSectionRow = i18;
            int i20 = this.currentType;
            if (i20 == 1 || i20 == 2) {
                this.rowCount = i18 + 2;
                this.alwaysShareRow = i19;
            }
            if (i20 == 0 || i20 == 2) {
                int i21 = this.rowCount;
                this.rowCount = i21 + 1;
                this.neverShareRow = i21;
            }
            int i22 = this.rowCount;
            int i23 = i22 + 1;
            this.rowCount = i23;
            this.shareDetailRow = i22;
            int i24 = this.rulesType;
            if (i24 == 2) {
                this.p2pSectionRow = i23;
                this.p2pRow = i22 + 2;
                this.rowCount = i22 + 4;
                this.p2pDetailRow = i22 + 3;
            }
            if (i24 == 4 && (this.currentMinus.size() > 0 || (i = this.currentType) == 2 || i == 1)) {
                int i25 = this.rowCount;
                int i26 = i25 + 1;
                this.rowCount = i26;
                this.photoForRestRow = i25;
                if (this.avatarForRest != null) {
                    this.rowCount = i25 + 2;
                    this.currentPhotoForRestRow = i26;
                }
                int i27 = this.rowCount;
                this.rowCount = i27 + 1;
                this.photoForRestDescriptionRow = i27;
            }
            if (this.rulesType == 0 && (this.currentType != 0 || ((arrayList = this.currentMinus) != null && !arrayList.isEmpty()))) {
                int i28 = this.rowCount;
                this.readRow = i28;
                this.rowCount = i28 + 2;
                this.readDetailRow = i28 + 1;
            }
            if (this.rulesType == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i29 = this.rowCount;
                this.readPremiumRow = i29;
                this.rowCount = i29 + 2;
                this.readPremiumDetailRow = i29 + 1;
            }
        }
        if (this.rulesType == 12) {
            int i30 = this.rowCount;
            this.giftTypesHeaderRow = i30;
            this.giftTypeLimitedRow = i30 + 1;
            this.giftTypeUnlimitedRow = i30 + 2;
            this.giftTypeUniqueRow = i30 + 3;
            this.giftTypeChannelsRow = i30 + 4;
            this.giftTypePremiumRow = i30 + 5;
            this.rowCount = i30 + 7;
            this.giftTypesInfoRow = i30 + 6;
        }
        setMessageText();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            if (!z) {
                listAdapter.notifyDataSetChanged();
                return;
            }
            int childCount = this.listView.getChildCount();
            for (int i31 = 0; i31 < childCount; i31++) {
                View childAt = this.listView.getChildAt(i31);
                if ((childAt instanceof RadioCell) && (viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null) {
                    int adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition();
                    RadioCell radioCell = (RadioCell) childAt;
                    int i32 = this.everybodyRow;
                    if (adapterPosition == i32 || adapterPosition == this.myContactsRow || adapterPosition == this.nobodyRow || adapterPosition == this.payRow) {
                        if (adapterPosition == i32) {
                            i2 = 0;
                        } else if (adapterPosition == this.myContactsRow) {
                            i2 = 2;
                        } else {
                            i2 = adapterPosition == this.nobodyRow ? 1 : 3;
                        }
                        radioCell.setChecked(this.currentType == i2, true);
                    } else {
                        radioCell.setChecked(this.currentSubType == (adapterPosition == this.phoneContactsRow ? 1 : 0), true);
                    }
                }
            }
            diffCallback.fillPositions(diffCallback.newPositionToItem);
            DiffUtil.calculateDiff(diffCallback, true).dispatchUpdatesTo(new OpReorderer(this.listAdapter));
            AndroidUtilities.updateVisibleRows(this.listView);
        }
    }

    @Override
    public boolean canBeginSlide() {
        return checkDiscard(true);
    }

    @Override
    public final boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public View createView(Context context) {
        if (this.rulesType == 5) {
            this.messageCell = new MessageCell(context);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.rulesType;
        if (i == 6) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyPhone));
        } else if (i == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyForwards));
        } else if (i == 4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyProfilePhoto));
        } else if (i == 9) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBio));
        } else if (i == 14) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMusic));
        } else if (i == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyP2P));
        } else if (i == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyInvites));
        } else if (i == 8) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyVoiceMessages));
        } else if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyLastSeen));
        } else if (i == 10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMessages));
        } else if (i == 11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBirthday));
        } else if (i == 12) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyGifts));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (PrivacyControlActivity.this.checkDiscard(true)) {
                        PrivacyControlActivity.this.finishFragment();
                    }
                } else if (i2 == 1) {
                    PrivacyControlActivity.this.processDone();
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i2 = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i2, false)));
        this.doneButtonDrawable = crossfadeDrawable;
        this.doneButton = actionBarMenuCreateMenu.addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), crossfadeDrawable);
        boolean zHasChanges = hasChanges();
        this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setEnabled(zHasChanges);
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.listView, false);
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 29));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                PrivacyControlActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        setMessageText();
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessageCell messageCell;
        if (i == NotificationCenter.privacyRulesUpdated) {
            checkPrivacy();
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            this.listView.invalidateViews();
        } else {
            if (i != NotificationCenter.didSetNewWallpapper || (messageCell = this.messageCell) == null) {
                return;
            }
            messageCell.invalidate();
        }
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
    }

    @Override
    public final void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$2(photoSize2, inputFile, inputFile2, d, videoSize, photoSize);
            }
        });
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public final String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, HeaderCell.class, RadioCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        int i3 = Theme.key_windowBackgroundGray;
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{ShadowSectionCell.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{RadioCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 8192, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackground));
        arrayList.add(new ThemeDescription(this.listView, 16384, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackgroundChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgInDrawable, Theme.chat_msgInMediaDrawable}, null, Theme.key_chat_inBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgInSelectedDrawable, Theme.chat_msgInMediaSelectedDrawable}, null, Theme.key_chat_inBubbleSelected));
        RecyclerListView recyclerListView = this.listView;
        Drawable[] shadowDrawables = Theme.chat_msgInDrawable.getShadowDrawables();
        int i4 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(recyclerListView, 0, null, null, shadowDrawables, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgInMediaDrawable.getShadowDrawables(), null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
        RecyclerListView recyclerListView2 = this.listView;
        Drawable[] shadowDrawables2 = Theme.chat_msgOutDrawable.getShadowDrawables();
        int i5 = Theme.key_chat_outBubbleShadow;
        arrayList.add(new ThemeDescription(recyclerListView2, 0, null, null, shadowDrawables2, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgOutMediaDrawable.getShadowDrawables(), null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_messageTextIn));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_messageTextOut));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckDrawable}, null, Theme.key_chat_outSentCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadDrawable, Theme.chat_msgOutHalfCheckDrawable}, null, Theme.key_chat_outSentCheckRead));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutCheckReadSelectedDrawable, Theme.chat_msgOutHalfCheckSelectedDrawable}, null, Theme.key_chat_outSentCheckReadSelected));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgMediaCheckDrawable, Theme.chat_msgMediaHalfCheckDrawable}, null, Theme.key_chat_mediaSentCheck));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyLine));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyLine));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyNameText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyNameText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyMessageText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyMessageText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outReplyMediaMessageSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inTimeText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outTimeText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_inTimeSelectedText));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_chat_outTimeSelectedText));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        return checkDiscard(z);
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        checkPrivacy();
        updateRows(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public void onPause() {
        super.onPause();
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onPause();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        updateRows(false);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onResume();
        }
    }

    @Override
    public final void onUploadProgressChanged(float f) {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$onUploadProgressChanged(this, f);
    }

    @Override
    public final boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    public PrivacyControlActivity(int i) {
        this(i, false);
    }
}
