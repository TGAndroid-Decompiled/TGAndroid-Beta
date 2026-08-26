package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.zzf;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
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
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
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
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class PrivacyControlActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ImageUpdater.ImageUpdaterDelegate {
    public int alwaysShareRow;
    public TLRPC.PhotoSize avatarForRest;
    public TLRPC.Photo avatarForRestPhoto;
    public RLottieDrawable cameraDrawable;
    public boolean currentGiftChannelsValue;
    public boolean currentGiftIconValue;
    public boolean currentGiftLimitedValue;
    public boolean currentGiftPremiumValue;
    public boolean currentGiftUniqueValue;
    public boolean currentGiftUnlimitedValue;
    public ArrayList currentMinus;
    public int currentPhotoForRestRow;
    public ArrayList currentPlus;
    public final boolean[] currentPlusChannels;
    public final boolean[] currentPlusMiniapps;
    public final boolean[] currentPlusPremium;
    public boolean currentReadValue;
    public long currentStars;
    public int currentSubType;
    public int currentType;
    public int detailRow;
    public int detailRow2;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public int everybodyRow;
    public int giftTypeChannelsRow;
    public int giftTypeLimitedRow;
    public int giftTypePremiumRow;
    public int giftTypeUniqueRow;
    public int giftTypeUnlimitedRow;
    public int giftTypesHeaderRow;
    public int giftTypesInfoRow;
    public final ImageUpdater imageUpdater;
    public final ArrayList initialMinus;
    public final ArrayList initialPlus;
    public final boolean[] initialPlusChannels;
    public final boolean[] initialPlusMiniapps;
    public final boolean[] initialPlusPremium;
    public int initialRulesSubType;
    public int initialRulesType;
    public long initialStars;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public SpannableString lockSpan;
    public MessageCell messageCell;
    public int messageRow;
    public int myContactsRow;
    public int neverShareRow;
    public int nobodyRow;
    public BackupImageView oldAvatarView;
    public ContactAddActivity.AnonymousClass4 oldPhotoCell;
    public int p2pDetailRow;
    public int p2pRow;
    public int p2pSectionRow;
    public int payRow;
    public int phoneContactsRow;
    public int phoneDetailRow;
    public int phoneEverybodyRow;
    public int phoneSectionRow;
    public int photoForRestDescriptionRow;
    public int photoForRestRow;
    public int priceButtonRow;
    public int priceHeaderRow;
    public int priceInfoRow;
    public int priceRow;
    public int readDetailRow;
    public int readPremiumDetailRow;
    public int readPremiumRow;
    public int readRow;
    public int rowCount;
    public final int rulesType;
    public int sectionRow;
    public boolean selectedGiftChannelsValue;
    public boolean selectedGiftIconValue;
    public boolean selectedGiftLimitedValue;
    public boolean selectedGiftPremiumValue;
    public boolean selectedGiftUniqueValue;
    public boolean selectedGiftUnlimitedValue;
    public boolean selectedReadValue;
    public TextCell setAvatarCell;
    public int setBirthdayRow;
    public int shakeDp;
    public int shareDetailRow;
    public int shareSectionRow;
    public int showGiftIconInfoRow;
    public int showGiftIconRow;

    public final class DiffCallback extends DiffUtil {
        public int oldRowCount;
        public final SparseIntArray oldPositionToItem = new SparseIntArray();
        public final SparseIntArray newPositionToItem = new SparseIntArray();

        public DiffCallback() {
        }

        @Override
        public final boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2);
        }

        @Override
        public final boolean areItemsTheSame(int i, int i2) {
            int i3 = this.oldPositionToItem.get(i, -1);
            return i3 == this.newPositionToItem.get(i2, -1) && i3 >= 0;
        }

        public final void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
            int i = privacyControlActivity.messageRow;
            if (i >= 0) {
                sparseIntArray.put(i, 1);
            }
            int i2 = privacyControlActivity.sectionRow;
            if (i2 >= 0) {
                sparseIntArray.put(i2, 2);
            }
            int i3 = privacyControlActivity.everybodyRow;
            if (i3 >= 0) {
                sparseIntArray.put(i3, 3);
            }
            int i4 = privacyControlActivity.myContactsRow;
            if (i4 >= 0) {
                sparseIntArray.put(i4, 4);
            }
            int i5 = privacyControlActivity.nobodyRow;
            if (i5 >= 0) {
                sparseIntArray.put(i5, 5);
            }
            int i6 = privacyControlActivity.payRow;
            if (i6 >= 0) {
                sparseIntArray.put(i6, 6);
            }
            int i7 = privacyControlActivity.detailRow;
            if (i7 >= 0) {
                sparseIntArray.put(i7, 7);
            }
            int i8 = privacyControlActivity.shareSectionRow;
            if (i8 >= 0) {
                sparseIntArray.put(i8, 8);
            }
            int i9 = privacyControlActivity.alwaysShareRow;
            if (i9 >= 0) {
                sparseIntArray.put(i9, 9);
            }
            int i10 = privacyControlActivity.neverShareRow;
            if (i10 >= 0) {
                sparseIntArray.put(i10, 10);
            }
            int i11 = privacyControlActivity.shareDetailRow;
            if (i11 >= 0) {
                sparseIntArray.put(i11, 11);
            }
            int i12 = privacyControlActivity.phoneSectionRow;
            if (i12 >= 0) {
                sparseIntArray.put(i12, 12);
            }
            int i13 = privacyControlActivity.phoneEverybodyRow;
            if (i13 >= 0) {
                sparseIntArray.put(i13, 13);
            }
            int i14 = privacyControlActivity.phoneContactsRow;
            if (i14 >= 0) {
                sparseIntArray.put(i14, 14);
            }
            int i15 = privacyControlActivity.phoneDetailRow;
            if (i15 >= 0) {
                sparseIntArray.put(i15, 15);
            }
            int i16 = privacyControlActivity.photoForRestRow;
            if (i16 >= 0) {
                sparseIntArray.put(i16, 16);
            }
            int i17 = privacyControlActivity.currentPhotoForRestRow;
            if (i17 >= 0) {
                sparseIntArray.put(i17, 17);
            }
            int i18 = privacyControlActivity.photoForRestDescriptionRow;
            if (i18 >= 0) {
                sparseIntArray.put(i18, 18);
            }
            int i19 = privacyControlActivity.p2pSectionRow;
            if (i19 >= 0) {
                sparseIntArray.put(i19, 19);
            }
            int i20 = privacyControlActivity.p2pRow;
            if (i20 >= 0) {
                sparseIntArray.put(i20, 20);
            }
            int i21 = privacyControlActivity.p2pDetailRow;
            if (i21 >= 0) {
                sparseIntArray.put(i21, 21);
            }
            int i22 = privacyControlActivity.readRow;
            if (i22 >= 0) {
                sparseIntArray.put(i22, 22);
            }
            int i23 = privacyControlActivity.readDetailRow;
            if (i23 >= 0) {
                sparseIntArray.put(i23, 23);
            }
            int i24 = privacyControlActivity.readPremiumRow;
            if (i24 >= 0) {
                sparseIntArray.put(i24, 24);
            }
            int i25 = privacyControlActivity.readPremiumDetailRow;
            if (i25 >= 0) {
                sparseIntArray.put(i25, 25);
            }
            int i26 = privacyControlActivity.priceHeaderRow;
            if (i26 >= 0) {
                sparseIntArray.put(i26, 26);
            }
            int i27 = privacyControlActivity.priceRow;
            if (i27 >= 0) {
                sparseIntArray.put(i27, 27);
            }
            int i28 = privacyControlActivity.priceInfoRow;
            if (i28 >= 0) {
                sparseIntArray.put(i28, 28);
            }
            int i29 = privacyControlActivity.showGiftIconRow;
            if (i29 >= 0) {
                sparseIntArray.put(i29, 29);
            }
            int i30 = privacyControlActivity.showGiftIconInfoRow;
            if (i30 >= 0) {
                sparseIntArray.put(i30, 30);
            }
            int i31 = privacyControlActivity.giftTypesHeaderRow;
            if (i31 >= 0) {
                sparseIntArray.put(i31, 31);
            }
            int i32 = privacyControlActivity.giftTypeLimitedRow;
            if (i32 >= 0) {
                sparseIntArray.put(i32, 32);
            }
            int i33 = privacyControlActivity.giftTypeUnlimitedRow;
            if (i33 >= 0) {
                sparseIntArray.put(i33, 33);
            }
            int i34 = privacyControlActivity.giftTypeUniqueRow;
            if (i34 >= 0) {
                sparseIntArray.put(i34, 34);
            }
            int i35 = privacyControlActivity.giftTypeChannelsRow;
            if (i35 >= 0) {
                sparseIntArray.put(i35, 35);
            }
            int i36 = privacyControlActivity.giftTypePremiumRow;
            if (i36 >= 0) {
                sparseIntArray.put(i36, 36);
            }
            int i37 = privacyControlActivity.giftTypesInfoRow;
            if (i37 >= 0) {
                sparseIntArray.put(i37, 37);
            }
        }

        @Override
        public final int getNewListSize() {
            return PrivacyControlActivity.this.rowCount;
        }

        @Override
        public final int getOldListSize() {
            return this.oldRowCount;
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return PrivacyControlActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
            if (i == privacyControlActivity.alwaysShareRow || i == privacyControlActivity.neverShareRow || i == privacyControlActivity.p2pRow || i == privacyControlActivity.readPremiumRow) {
                return 0;
            }
            if (i == privacyControlActivity.shareDetailRow || i == privacyControlActivity.detailRow || i == privacyControlActivity.detailRow2 || i == privacyControlActivity.priceInfoRow || i == privacyControlActivity.p2pDetailRow || i == privacyControlActivity.photoForRestDescriptionRow || i == privacyControlActivity.readDetailRow || i == privacyControlActivity.readPremiumDetailRow || i == privacyControlActivity.setBirthdayRow || i == privacyControlActivity.showGiftIconInfoRow || i == privacyControlActivity.giftTypesInfoRow) {
                return 1;
            }
            if (i == privacyControlActivity.sectionRow || i == privacyControlActivity.priceHeaderRow || i == privacyControlActivity.shareSectionRow || i == privacyControlActivity.p2pSectionRow || i == privacyControlActivity.phoneSectionRow || i == privacyControlActivity.giftTypesHeaderRow) {
                return 2;
            }
            if (i == privacyControlActivity.everybodyRow || i == privacyControlActivity.myContactsRow || i == privacyControlActivity.nobodyRow || i == privacyControlActivity.payRow || i == privacyControlActivity.phoneEverybodyRow || i == privacyControlActivity.phoneContactsRow) {
                return 3;
            }
            if (i == privacyControlActivity.messageRow) {
                return 4;
            }
            if (i == privacyControlActivity.phoneDetailRow) {
                return 5;
            }
            if (i == privacyControlActivity.photoForRestRow) {
                return 6;
            }
            if (i == privacyControlActivity.currentPhotoForRestRow) {
                return 7;
            }
            if (i == privacyControlActivity.readRow || i == privacyControlActivity.showGiftIconRow || i == privacyControlActivity.giftTypeUniqueRow || i == privacyControlActivity.giftTypeChannelsRow || i == privacyControlActivity.giftTypePremiumRow || i == privacyControlActivity.giftTypeUnlimitedRow || i == privacyControlActivity.giftTypeLimitedRow) {
                return 8;
            }
            if (i == privacyControlActivity.priceRow) {
                return 9;
            }
            return i == privacyControlActivity.priceButtonRow ? 10 : 0;
        }

        public final int getUsersCount(ArrayList arrayList) {
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                long jLongValue = ((Long) arrayList.get(i2)).longValue();
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

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
            if ((adapterPosition == privacyControlActivity.p2pRow && !ContactsController.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getLoadingPrivacyInfo(3)) || adapterPosition == privacyControlActivity.currentPhotoForRestRow || adapterPosition == privacyControlActivity.photoForRestDescriptionRow || adapterPosition == privacyControlActivity.photoForRestRow || adapterPosition == privacyControlActivity.readRow || adapterPosition == privacyControlActivity.showGiftIconRow || adapterPosition == privacyControlActivity.readPremiumRow || adapterPosition == privacyControlActivity.giftTypeUniqueRow || adapterPosition == privacyControlActivity.giftTypeChannelsRow || adapterPosition == privacyControlActivity.giftTypePremiumRow || adapterPosition == privacyControlActivity.giftTypeLimitedRow || adapterPosition == privacyControlActivity.giftTypeUnlimitedRow) {
                return true;
            }
            if (privacyControlActivity.rulesType == 12 && privacyControlActivity.areAllStarGiftsDisabled()) {
                return false;
            }
            return adapterPosition == privacyControlActivity.nobodyRow || adapterPosition == privacyControlActivity.myContactsRow || adapterPosition == privacyControlActivity.payRow || adapterPosition == privacyControlActivity.everybodyRow || adapterPosition == privacyControlActivity.neverShareRow || adapterPosition == privacyControlActivity.alwaysShareRow;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
            final int i3 = 1;
            final int i4 = 0;
            i = 0;
            int i5 = 0;
            i = 0;
            int i6 = 0;
            i = 0;
            int i7 = 0;
            i = 0;
            int i8 = 0;
            i4 = 0;
            View view = viewHolder.itemView;
            if (i2 == 8) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                textCheckCell.setCheckBoxIcon(0);
                if (i == privacyControlActivity.readRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.HideReadTime), privacyControlActivity.selectedReadValue, false);
                    return;
                }
                if (i == privacyControlActivity.showGiftIconRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsShowIcon), privacyControlActivity.selectedGiftIconValue, false);
                    return;
                }
                if (i == privacyControlActivity.giftTypeUnlimitedRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeUnlimited), privacyControlActivity.selectedGiftUnlimitedValue, true);
                    if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.selectedGiftUnlimitedValue) {
                        i5 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i5);
                    return;
                }
                if (i == privacyControlActivity.giftTypeLimitedRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeLimited), privacyControlActivity.selectedGiftLimitedValue, true);
                    if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.selectedGiftLimitedValue) {
                        i6 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i6);
                    return;
                }
                if (i == privacyControlActivity.giftTypeUniqueRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeUnique), privacyControlActivity.selectedGiftUniqueValue, true);
                    if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.selectedGiftUniqueValue) {
                        i7 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i7);
                    return;
                }
                if (i == privacyControlActivity.giftTypeChannelsRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypeFromChannels), privacyControlActivity.selectedGiftChannelsValue, true);
                    if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.selectedGiftChannelsValue) {
                        i8 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i8);
                    return;
                }
                if (i == privacyControlActivity.giftTypePremiumRow) {
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.PrivacyGiftsTypePremium), privacyControlActivity.selectedGiftPremiumValue, false);
                    if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.selectedGiftPremiumValue) {
                        i4 = R.drawable.permission_locked;
                    }
                    textCheckCell.setCheckBoxIcon(i4);
                    return;
                }
                return;
            }
            if (i2 == 9) {
                SlideIntChooseView slideIntChooseView = (SlideIntChooseView) view;
                if (i == privacyControlActivity.priceRow) {
                    int[] iArrCut = SlideIntChooseView.cut((int) privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    PhotoViewer$$ExternalSyntheticLambda115 photoViewer$$ExternalSyntheticLambda115 = new PhotoViewer$$ExternalSyntheticLambda115(this, 25);
                    SlideIntChooseView.Options options = new SlideIntChooseView.Options();
                    options.steps = iArrCut;
                    options.betweenSteps = 20;
                    options.toString = photoViewer$$ExternalSyntheticLambda115;
                    slideIntChooseView.set((int) Utilities.clamp(privacyControlActivity.currentStars, privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, 1L), options, new PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda4(this, i4));
                    return;
                }
                return;
            }
            int i9 = privacyControlActivity.rulesType;
            if (i2 == 0) {
                TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                textSettingsCell.setTextColor(privacyControlActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                int i10 = privacyControlActivity.alwaysShareRow;
                boolean[] zArr = privacyControlActivity.currentPlusMiniapps;
                if (i == i10) {
                    String pluralString = privacyControlActivity.currentPlus.size() != 0 ? LocaleController.formatPluralString("Users", getUsersCount(privacyControlActivity.currentPlus), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                    if (privacyControlActivity.currentPlusPremium[privacyControlActivity.currentType == 2 ? (char) 0 : (char) 1]) {
                        ArrayList arrayList = privacyControlActivity.currentPlus;
                        pluralString = (arrayList == null || arrayList.isEmpty()) ? LocaleController.formatString(R.string.PrivacyPremium, new Object[0]) : LocaleController.formatString(R.string.PrivacyPremiumAnd, pluralString);
                    }
                    if (i9 != 10) {
                        int i11 = privacyControlActivity.currentType;
                        if (zArr[i11] && i11 != 0) {
                            ArrayList arrayList2 = privacyControlActivity.currentPlus;
                            pluralString = (arrayList2 == null || arrayList2.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, pluralString);
                        }
                    }
                    if (i9 == 10) {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivateMessagesExceptions), pluralString, false, false);
                    } else if (i9 == 0 || i9 == 4 || i9 == 9 || i9 == 14) {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AlwaysShareWith), pluralString, false, privacyControlActivity.neverShareRow != -1);
                    } else {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.AlwaysAllow), pluralString, false, privacyControlActivity.neverShareRow != -1);
                    }
                    if (i9 == 12) {
                        textSettingsCell.setEnabled(!privacyControlActivity.areAllStarGiftsDisabled());
                        return;
                    }
                    return;
                }
                if (i != privacyControlActivity.neverShareRow) {
                    if (i == privacyControlActivity.p2pRow) {
                        textSettingsCell.setTextAndValue(LocaleController.getString(R.string.PrivacyP2P2), ContactsController.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getLoadingPrivacyInfo(3) ? LocaleController.getString(R.string.Loading) : PrivacySettingsActivity.formatRulesString(3, privacyControlActivity.getAccountInstance()), false, false);
                        return;
                    } else {
                        if (i == privacyControlActivity.readPremiumRow) {
                            textSettingsCell.setText(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumForPremium : R.string.PrivacyLastSeenPremium), false);
                            textSettingsCell.setTextColor(privacyControlActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlueText));
                            return;
                        }
                        return;
                    }
                }
                String pluralString2 = privacyControlActivity.currentMinus.size() != 0 ? LocaleController.formatPluralString("Users", getUsersCount(privacyControlActivity.currentMinus), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                int i12 = privacyControlActivity.currentType;
                if (zArr[i12] && i12 == 0) {
                    ArrayList arrayList3 = privacyControlActivity.currentMinus;
                    pluralString2 = (arrayList3 == null || arrayList3.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, pluralString2);
                }
                if (i9 == 0 || i9 == 4 || i9 == 9 || i9 == 14) {
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NeverShareWith), pluralString2, false, false);
                } else {
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.NeverAllow), pluralString2, false, false);
                }
                if (i9 == 12) {
                    textSettingsCell.setEnabled(!privacyControlActivity.areAllStarGiftsDisabled());
                    return;
                }
                return;
            }
            if (i2 == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                if (i == privacyControlActivity.detailRow2) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivateMessagesChargePriceInfo));
                } else {
                    int i13 = privacyControlActivity.detailRow;
                    if (i == i13 && i9 == 10) {
                        textInfoPrivacyCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyMessagesInfo), new Runnable(this) {
                            public final PrivacyControlActivity.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        PrivacyControlActivity.ListAdapter listAdapter = this.f$0;
                                        listAdapter.getClass();
                                        PrivacyControlActivity.this.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity.ListAdapter listAdapter2 = this.f$0;
                                        PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                                        privacyControlActivity2.showDialog(AlertsCreator.createBirthdayPickerDialog(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda4(listAdapter2, 1), null, false, false, privacyControlActivity2.getResourceProvider()).bottomSheet);
                                        break;
                                }
                            }
                        }));
                    } else if (i == i13 && i9 == 8) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo));
                    } else if (i == privacyControlActivity.setBirthdayRow) {
                        textInfoPrivacyCell.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyBirthdaySet), new Runnable(this) {
                            public final PrivacyControlActivity.ListAdapter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        PrivacyControlActivity.ListAdapter listAdapter = this.f$0;
                                        listAdapter.getClass();
                                        PrivacyControlActivity.this.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        PrivacyControlActivity.ListAdapter listAdapter2 = this.f$0;
                                        PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                                        privacyControlActivity2.showDialog(AlertsCreator.createBirthdayPickerDialog(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new PrivacyControlActivity$ListAdapter$$ExternalSyntheticLambda4(listAdapter2, 1), null, false, false, privacyControlActivity2.getResourceProvider()).bottomSheet);
                                        break;
                                }
                            }
                        }), true));
                    } else if (i == i13) {
                        if (i9 == 6) {
                            if (privacyControlActivity.currentType == 1 && privacyControlActivity.currentSubType == 1) {
                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyPhoneInfo3));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                final String strM = SurfaceContainer$$ExternalSyntheticOutline0.m("https://t.me/+", privacyControlActivity.getUserConfig().getClientPhone());
                                SpannableString spannableString = new SpannableString(strM);
                                spannableString.setSpan(new ClickableSpan() {
                                    @Override
                                    public final void onClick(View view2) {
                                        Bulletin bulletinCreate;
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", strM));
                                        BulletinFactory bulletinFactoryOf = BulletinFactory.of(PrivacyControlActivity.this);
                                        String string = LocaleController.getString(R.string.LinkCopied);
                                        Theme.ResourcesProvider resourceProvider = PrivacyControlActivity.this.getResourceProvider();
                                        bulletinFactoryOf.getClass();
                                        if (AndroidUtilities.shouldShowClipboardToast()) {
                                            Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(bulletinFactoryOf.getContext(), resourceProvider);
                                            lottieLayout.setAnimation(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
                                            lottieLayout.textView.setText(string);
                                            bulletinCreate = bulletinFactoryOf.create(lottieLayout, 1500);
                                        } else {
                                            bulletinCreate = new Bulletin.EmptyBulletin();
                                        }
                                        bulletinCreate.show();
                                    }
                                }, 0, strM.length(), 33);
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo)).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo4)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                textInfoPrivacyCell.setText(spannableStringBuilder);
                            }
                        } else if (i9 == 5) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyForwardsInfo));
                        } else if (i9 == 4) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo));
                        } else if (i9 == 9) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBioInfo3));
                        } else if (i9 == 14) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyMusicInfo3));
                        } else if (i9 == 11) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo));
                        } else if (i9 == 12) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyGiftsInfo));
                        } else if (i9 == 3) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyCallsP2PHelp));
                        } else if (i9 == 2) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.WhoCanCallMeInfo));
                        } else if (i9 == 1) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.WhoCanAddMeInfo));
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomHelp));
                        }
                    } else if (i == privacyControlActivity.shareDetailRow) {
                        if (i9 == 6) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyPhoneInfo2));
                        } else if (i9 == 5) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyForwardsInfo2));
                        } else if (i9 == 4) {
                            int i14 = privacyControlActivity.currentType;
                            if (i14 == 2) {
                                textInfoPrivacyCell.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo5)));
                            } else if (i14 == 0) {
                                textInfoPrivacyCell.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo3)));
                            } else {
                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo4));
                            }
                        } else if (i9 == 3) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomP2PInfo));
                        } else if (i9 == 9) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBioInfo));
                        } else if (i9 == 14) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyMusicInfo));
                        } else if (i9 == 11) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo3));
                        } else if (i9 == 2) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomCallInfo));
                        } else if (i9 == 1) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomShareInfo));
                        } else if (i9 == 12) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomShareGiftsInfo));
                        } else if (i9 == 8) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo2));
                        } else if (i9 == 10) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsInfo));
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.CustomShareSettingsHelp));
                        }
                    } else if (i == privacyControlActivity.photoForRestDescriptionRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PhotoForRestDescription));
                    } else if (i == privacyControlActivity.readDetailRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.HideReadTimeInfo));
                    } else if (i == privacyControlActivity.readPremiumDetailRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumInfoForPremium : R.string.PrivacyLastSeenPremiumInfo));
                    } else if (i == privacyControlActivity.priceInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.formatString(R.string.PrivateMessagesPriceInfo, AffiliateProgramFragment.percents(privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((double) ((int) ((((double) (privacyControlActivity.currentStars * (privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f))) / 1000.0d) * ((double) privacyControlActivity.getMessagesController().starsUsdWithdrawRate1000)))) / 100.0d)));
                    } else if (i == privacyControlActivity.showGiftIconInfoRow) {
                        SpannableString spannableString2 = new SpannableString("g");
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_input_gift);
                        coloredImageSpan.setScale(0.583f, 0.583f);
                        spannableString2.setSpan(coloredImageSpan, 0, 1, 33);
                        textInfoPrivacyCell.setText(LocaleController.formatSpannable(R.string.PrivacyGiftsShowIconInfo, spannableString2));
                    } else if (i == privacyControlActivity.giftTypesInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.PrivacyGiftsTypeInfo));
                    }
                }
                textInfoPrivacyCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                return;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                RadioCell radioCell = (RadioCell) view;
                radioCell.setRadioIcon(null);
                int i15 = privacyControlActivity.everybodyRow;
                if (i == i15 || i == privacyControlActivity.myContactsRow || i == privacyControlActivity.nobodyRow || i == privacyControlActivity.payRow) {
                    if (i == i15) {
                        if (i9 == 3) {
                            radioCell.setText(LocaleController.getString(R.string.P2PEverybody), privacyControlActivity.currentType == 0, true);
                        } else {
                            radioCell.setText(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.currentType == 0, true);
                        }
                    } else if (i == privacyControlActivity.myContactsRow) {
                        if ((i9 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i9 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                            radioCell.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        if (i9 == 3) {
                            radioCell.setText(LocaleController.getString(R.string.P2PContacts), privacyControlActivity.currentType == 2, (privacyControlActivity.nobodyRow == -1 && privacyControlActivity.payRow == -1) ? false : true);
                        } else if (i9 == 10) {
                            radioCell.setText(LocaleController.getString(R.string.PrivacyMessagesContactsAndPremium), privacyControlActivity.currentType == 2, (privacyControlActivity.nobodyRow == -1 && privacyControlActivity.payRow == -1) ? false : true);
                        } else {
                            radioCell.setText(LocaleController.getString(R.string.LastSeenContacts), privacyControlActivity.currentType == 2, (privacyControlActivity.nobodyRow == -1 && privacyControlActivity.payRow == -1) ? false : true);
                        }
                    } else if (i == privacyControlActivity.payRow) {
                        if (i9 == 10 && !privacyControlActivity.getUserConfig().isPremium()) {
                            radioCell.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        radioCell.setText(LocaleController.getString(R.string.PrivateMessagesChargePrice), privacyControlActivity.currentType == 3, false);
                    } else {
                        if ((i9 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i9 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                            radioCell.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                        }
                        if (i9 == 3) {
                            radioCell.setText(LocaleController.getString(R.string.P2PNobody), privacyControlActivity.currentType == 1, false);
                        } else {
                            radioCell.setText(LocaleController.getString(R.string.LastSeenNobody), privacyControlActivity.currentType == 1, false);
                        }
                    }
                } else if (i == privacyControlActivity.phoneContactsRow) {
                    radioCell.setText(LocaleController.getString(R.string.LastSeenContacts), privacyControlActivity.currentSubType == 1, false);
                } else if (i == privacyControlActivity.phoneEverybodyRow) {
                    radioCell.setText(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.currentSubType == 0, true);
                }
                if (i9 == 12) {
                    radioCell.setEnabled(null, !privacyControlActivity.areAllStarGiftsDisabled());
                    return;
                }
                return;
            }
            HeaderCell headerCell = (HeaderCell) view;
            if (i != privacyControlActivity.sectionRow) {
                if (i == privacyControlActivity.shareSectionRow) {
                    if (i9 == 10) {
                        headerCell.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsHeader));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.AddExceptions));
                        return;
                    }
                }
                if (i == privacyControlActivity.p2pSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.PrivacyP2PHeader));
                    return;
                }
                if (i == privacyControlActivity.phoneSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.PrivacyPhoneTitle2));
                    return;
                } else if (i == privacyControlActivity.priceHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.PrivateMessagesPriceHeader));
                    return;
                } else {
                    if (i == privacyControlActivity.giftTypesHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.PrivacyGiftsTypeHeader));
                        return;
                    }
                    return;
                }
            }
            if (i9 == 6) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyPhoneTitle));
                return;
            }
            if (i9 == 5) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyForwardsTitle));
                return;
            }
            if (i9 == 4) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyProfilePhotoTitle));
                return;
            }
            if (i9 == 9) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyBioTitle));
                return;
            }
            if (i9 == 14) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyMusicTitle));
                return;
            }
            if (i9 == 3) {
                headerCell.setText(LocaleController.getString(R.string.P2PEnabledWith));
                return;
            }
            if (i9 == 2) {
                headerCell.setText(LocaleController.getString(R.string.WhoCanCallMe));
                return;
            }
            if (i9 == 1) {
                headerCell.setText(LocaleController.getString(R.string.WhoCanAddMe));
                return;
            }
            if (i9 == 8) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesTitle));
                return;
            }
            if (i9 == 10) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyMessagesTitle));
                return;
            }
            if (i9 == 11) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyBirthdayTitle));
            } else if (i9 == 12) {
                headerCell.setText(LocaleController.getString(R.string.PrivacyGiftsTitle));
            } else {
                headerCell.setText(LocaleController.getString(R.string.LastSeenTitle));
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ?? textCheckCell;
            ?? textInfoPrivacyCell;
            PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
            Context context = this.mContext;
            switch (i) {
                case 0:
                    TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
                    textSettingsCell.setCanDisable(true);
                    textInfoPrivacyCell = textSettingsCell;
                    break;
                case 1:
                    textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                    break;
                case 2:
                    textInfoPrivacyCell = new HeaderCell(context);
                    break;
                case 3:
                    textInfoPrivacyCell = new RadioCell(context, null);
                    break;
                case 4:
                    textInfoPrivacyCell = privacyControlActivity.messageCell;
                    break;
                case 5:
                default:
                    textInfoPrivacyCell = new ShadowSectionCell(context, (Object) null);
                    break;
                case 6:
                    TextCell textCell = new TextCell(privacyControlActivity.getParentActivity());
                    privacyControlActivity.setAvatarCell = textCell;
                    if (privacyControlActivity.avatarForRest == null) {
                        textCell.setTextAndIcon(R.drawable.msg_addphoto, (CharSequence) LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                    } else {
                        textCell.setTextAndIcon(R.drawable.msg_addphoto, (CharSequence) LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                    }
                    privacyControlActivity.setAvatarCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    privacyControlActivity.setAvatarCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    int i2 = R.raw.camera_outline;
                    privacyControlActivity.cameraDrawable = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    privacyControlActivity.setAvatarCell.imageView.setTranslationX(-AndroidUtilities.dp(8.0f));
                    privacyControlActivity.setAvatarCell.imageView.setAnimation(privacyControlActivity.cameraDrawable);
                    textInfoPrivacyCell = privacyControlActivity.setAvatarCell;
                    break;
                case 7:
                    privacyControlActivity.oldAvatarView = new BackupImageView(privacyControlActivity.getParentActivity());
                    privacyControlActivity.oldPhotoCell = new ContactAddActivity.AnonymousClass4(this, privacyControlActivity.getParentActivity());
                    TLRPC.PhotoSize photoSize = privacyControlActivity.avatarForRest;
                    if (photoSize != null) {
                        TLRPC.Photo photo = privacyControlActivity.avatarForRestPhoto;
                        if (photo != null) {
                            privacyControlActivity.oldAvatarView.setImage(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getCurrentUser());
                        } else {
                            privacyControlActivity.oldAvatarView.setImage(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getCurrentUser());
                        }
                    }
                    privacyControlActivity.oldPhotoCell.addView(privacyControlActivity.oldAvatarView, LayoutHelper.createFrame(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                    privacyControlActivity.oldPhotoCell.setText(LocaleController.getString(R.string.RemovePublicPhoto), false);
                    privacyControlActivity.oldPhotoCell.getImageView().setVisibility(0);
                    privacyControlActivity.oldPhotoCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    ContactAddActivity.AnonymousClass4 anonymousClass4 = privacyControlActivity.oldPhotoCell;
                    int i3 = Theme.key_text_RedRegular;
                    anonymousClass4.setColors(i3, i3);
                    textInfoPrivacyCell = privacyControlActivity.oldPhotoCell;
                    break;
                case 8:
                    textCheckCell = new TextCheckCell(21, context, ((BaseFragment) privacyControlActivity).resourceProvider, false);
                    textInfoPrivacyCell = textCheckCell;
                    break;
                case 9:
                    textCheckCell = new SlideIntChooseView(context, ((BaseFragment) privacyControlActivity).resourceProvider);
                    textInfoPrivacyCell = textCheckCell;
                    break;
                case 10:
                    ?? frameLayout = new FrameLayout(context);
                    ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BaseFragment) privacyControlActivity).resourceProvider, true);
                    buttonWithCounterView.setRoundRadius(24);
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_mini_lock3);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                    spannableStringBuilder.append((CharSequence) " l");
                    spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    buttonWithCounterView.setText(spannableStringBuilder, false, true);
                    buttonWithCounterView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(this, 23));
                    frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                    textCheckCell = frameLayout;
                    textInfoPrivacyCell = textCheckCell;
                    break;
            }
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }
    }

    public final class MessageCell extends FrameLayout {
        public Drawable backgroundDrawable;
        public BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
        public final ChatMessageCell cell;
        public final HintView hintView;
        public final MessageObject messageObject;
        public final Drawable shadowDrawable;

        public MessageCell(PrivacyControlActivity privacyControlActivity, Context context) {
            super(context);
            setWillNotDraw(false);
            setClipToPadding(false);
            this.shadowDrawable = Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow);
            setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            TLRPC.User user = MessagesController.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getUser(Long.valueOf(UserConfig.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getClientUserId()));
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
            tL_peerUser.user_id = UserConfig.getInstance(((BaseFragment) privacyControlActivity).currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(((BaseFragment) privacyControlActivity).currentAccount, tL_message, true, false);
            this.messageObject = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            ChatMessageCell chatMessageCell = new ChatMessageCell(context, ((BaseFragment) privacyControlActivity).currentAccount, false, null, null);
            this.cell = chatMessageCell;
            chatMessageCell.setDelegate(new zzf(25));
            chatMessageCell.isChat = false;
            chatMessageCell.setFullyDraw(true);
            chatMessageCell.setMessageObject(messageObject, null, false, false, false, false);
            addView(chatMessageCell, LayoutHelper.createLinear(-1, -2));
            HintView hintView = new HintView(1, context, null, true);
            this.hintView = hintView;
            addView(hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            this.hintView.showForMessageCell(this.cell, null, 0, 0, false);
        }

        @Override
        public final void dispatchSetPressed(boolean z) {
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public final void invalidate() {
            super.invalidate();
            this.cell.invalidate();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BackgroundGradientDrawable.Disposable disposable = this.backgroundGradientDisposable;
            if (disposable != null) {
                disposable.dispose();
                this.backgroundGradientDisposable = null;
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
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
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            Drawable drawable4 = this.shadowDrawable;
            drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
            drawable4.draw(canvas);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public PrivacyControlActivity(int i, boolean z) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        super(null);
        this.initialPlus = new ArrayList();
        this.initialMinus = new ArrayList();
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
        if (i == 4) {
            ImageUpdater imageUpdater = new ImageUpdater(0, true, true);
            this.imageUpdater = imageUpdater;
            imageUpdater.parentFragment = this;
            imageUpdater.delegate = this;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, 1000)) == null) {
                return;
            }
            this.avatarForRest = closestPhotoSizeWithSize;
            this.avatarForRestPhoto = userFull.fallback_photo;
        }
    }

    public final void applyCurrentPrivacySettings() {
        final AtomicInteger atomicInteger;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        int i = this.rulesType;
        if (i == 10) {
            boolean[] zArr = {true, false};
            if (this.currentType == 3) {
                ArrayList arrayList = this.initialPlus;
                Collections.sort(arrayList);
                Collections.sort(this.currentPlus);
                if (!arrayList.equals(this.currentPlus)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.currentType != 0 && this.currentPlus.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i2 = 0; i2 < this.currentPlus.size(); i2++) {
                            Long l = (Long) this.currentPlus.get(i2);
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
                    getConnectionsManager().sendRequest(setprivacy, new ProfileActivity$$ExternalSyntheticLambda65(9, this, zArr));
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
            int i3 = this.currentType;
            if (i3 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.currentStars;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                globalPrivacySettings4.new_noncontact_peers_require_premium = i3 == 2;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new LoginActivity$$ExternalSyntheticLambda42(this, zArr, globalPrivacySettings, setglobalprivacysettings, 10));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i == 6) {
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
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i4) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity = this.f$0;
                                privacyControlActivity.getClass();
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                final int i5 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                privacyControlActivity.lambda$applyCurrentPrivacySettings$18(tL_error, tLObject, atomicInteger3);
                                                break;
                                            default:
                                                privacyControlActivity.lambda$applyCurrentPrivacySettings$20(tL_error, tLObject, atomicInteger3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final PrivacyControlActivity privacyControlActivity2 = this.f$0;
                                privacyControlActivity2.getClass();
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                final int i6 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                privacyControlActivity2.lambda$applyCurrentPrivacySettings$18(tL_error, tLObject, atomicInteger4);
                                                break;
                                            default:
                                                privacyControlActivity2.lambda$applyCurrentPrivacySettings$20(tL_error, tLObject, atomicInteger4);
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, 2);
            }
        } else if (i == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.currentType != 0 && this.currentPlus.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i5 = 0; i5 < this.currentPlus.size(); i5++) {
                Long l2 = (Long) this.currentPlus.get(i5);
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
                Long l3 = (Long) this.currentMinus.get(i6);
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
        int i9 = this.currentType;
        if (this.currentPlusMiniapps[i9]) {
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
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i10) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity = this.f$0;
                        privacyControlActivity.getClass();
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        final int i11 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        privacyControlActivity.lambda$applyCurrentPrivacySettings$18(tL_error, tLObject, atomicInteger3);
                                        break;
                                    default:
                                        privacyControlActivity.lambda$applyCurrentPrivacySettings$20(tL_error, tLObject, atomicInteger3);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final PrivacyControlActivity privacyControlActivity2 = this.f$0;
                        privacyControlActivity2.getClass();
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        final int i12 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        privacyControlActivity2.lambda$applyCurrentPrivacySettings$18(tL_error, tLObject, atomicInteger4);
                                        break;
                                    default:
                                        privacyControlActivity2.lambda$applyCurrentPrivacySettings$20(tL_error, tLObject, atomicInteger4);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }, 2);
        if (i != 0 || this.selectedReadValue == this.currentReadValue) {
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
                            final PrivacyControlActivity privacyControlActivity = this.f$0;
                            privacyControlActivity.getClass();
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            final int i12 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i12) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                            privacyControlActivity2.getClass();
                                            boolean z = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.currentReadValue = z;
                                            globalPrivacySettings7.hide_read_marks = z;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.finished();
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z2 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z2 != setglobalprivacysettings4.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z3 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity3.currentGiftIconValue = z3;
                                            globalPrivacySettings8.display_gifts_button = z3;
                                            if (globalPrivacySettings8.disallowed_stargifts == null) {
                                                globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings4.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings8.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings8.disallowed_stargifts;
                                                boolean z4 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z4;
                                                privacyControlActivity3.currentGiftUnlimitedValue = !z4;
                                                boolean z5 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z5;
                                                privacyControlActivity3.currentGiftLimitedValue = !z5;
                                                boolean z6 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z6;
                                                privacyControlActivity3.currentGiftUniqueValue = !z6;
                                                boolean z7 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z7;
                                                privacyControlActivity3.currentGiftChannelsValue = !z7;
                                                boolean z8 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z8;
                                                privacyControlActivity3.currentGiftPremiumValue = !z8;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.finished();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f$0;
                            privacyControlActivity2.getClass();
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            final int i13 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i13) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            boolean z = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity3.currentReadValue = z;
                                            globalPrivacySettings8.hide_read_marks = z;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.finished();
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity2;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings9 = globalPrivacySettings8;
                                            boolean z2 = globalPrivacySettings9.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings5 = setglobalprivacysettings4;
                                            if (z2 != setglobalprivacysettings5.settings.display_gifts_button && (userFull = privacyControlActivity4.getMessagesController().getUserFull(privacyControlActivity4.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings5.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z3 = setglobalprivacysettings5.settings.display_gifts_button;
                                            privacyControlActivity4.currentGiftIconValue = z3;
                                            globalPrivacySettings9.display_gifts_button = z3;
                                            if (globalPrivacySettings9.disallowed_stargifts == null) {
                                                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings5.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings9.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings9.disallowed_stargifts;
                                                boolean z4 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z4;
                                                privacyControlActivity4.currentGiftUnlimitedValue = !z4;
                                                boolean z5 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z5;
                                                privacyControlActivity4.currentGiftLimitedValue = !z5;
                                                boolean z6 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z6;
                                                privacyControlActivity4.currentGiftUniqueValue = !z6;
                                                boolean z7 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z7;
                                                privacyControlActivity4.currentGiftChannelsValue = !z7;
                                                boolean z8 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z8;
                                                privacyControlActivity4.currentGiftPremiumValue = !z8;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity4.finished();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        if (i == 12 && (this.selectedGiftIconValue != this.currentGiftIconValue || this.selectedGiftLimitedValue != this.currentGiftLimitedValue || this.selectedGiftUnlimitedValue != this.currentGiftUnlimitedValue || this.selectedGiftUniqueValue != this.currentGiftUniqueValue || this.selectedGiftPremiumValue != this.currentGiftPremiumValue)) {
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
                            final PrivacyControlActivity privacyControlActivity = this.f$0;
                            privacyControlActivity.getClass();
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings10 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            final int i13 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i13) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            boolean z = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity3.currentReadValue = z;
                                            globalPrivacySettings10.hide_read_marks = z;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.finished();
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings11 = globalPrivacySettings10;
                                            boolean z2 = globalPrivacySettings11.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings5 = setglobalprivacysettings4;
                                            if (z2 != setglobalprivacysettings5.settings.display_gifts_button && (userFull = privacyControlActivity4.getMessagesController().getUserFull(privacyControlActivity4.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings5.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z3 = setglobalprivacysettings5.settings.display_gifts_button;
                                            privacyControlActivity4.currentGiftIconValue = z3;
                                            globalPrivacySettings11.display_gifts_button = z3;
                                            if (globalPrivacySettings11.disallowed_stargifts == null) {
                                                globalPrivacySettings11.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings5.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings11.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3 = globalPrivacySettings11.disallowed_stargifts;
                                                boolean z4 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings3.disallow_unlimited_stargifts = z4;
                                                privacyControlActivity4.currentGiftUnlimitedValue = !z4;
                                                boolean z5 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings3.disallow_limited_stargifts = z5;
                                                privacyControlActivity4.currentGiftLimitedValue = !z5;
                                                boolean z6 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings3.disallow_unique_stargifts = z6;
                                                privacyControlActivity4.currentGiftUniqueValue = !z6;
                                                boolean z7 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings3.disallow_stargifts_from_channels = z7;
                                                privacyControlActivity4.currentGiftChannelsValue = !z7;
                                                boolean z8 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings3.disallow_premium_gifts = z8;
                                                privacyControlActivity4.currentGiftPremiumValue = !z8;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity4.finished();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f$0;
                            privacyControlActivity2.getClass();
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings11 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings5 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            final int i14 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i14) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            boolean z = setglobalprivacysettings5.settings.hide_read_marks;
                                            privacyControlActivity3.currentReadValue = z;
                                            globalPrivacySettings11.hide_read_marks = z;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.finished();
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity2;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings12 = globalPrivacySettings11;
                                            boolean z2 = globalPrivacySettings12.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings6 = setglobalprivacysettings5;
                                            if (z2 != setglobalprivacysettings6.settings.display_gifts_button && (userFull = privacyControlActivity4.getMessagesController().getUserFull(privacyControlActivity4.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings6.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z3 = setglobalprivacysettings6.settings.display_gifts_button;
                                            privacyControlActivity4.currentGiftIconValue = z3;
                                            globalPrivacySettings12.display_gifts_button = z3;
                                            if (globalPrivacySettings12.disallowed_stargifts == null) {
                                                globalPrivacySettings12.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings6.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings12.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3 = globalPrivacySettings12.disallowed_stargifts;
                                                boolean z4 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings3.disallow_unlimited_stargifts = z4;
                                                privacyControlActivity4.currentGiftUnlimitedValue = !z4;
                                                boolean z5 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings3.disallow_limited_stargifts = z5;
                                                privacyControlActivity4.currentGiftLimitedValue = !z5;
                                                boolean z6 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings3.disallow_unique_stargifts = z6;
                                                privacyControlActivity4.currentGiftUniqueValue = !z6;
                                                boolean z7 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings3.disallow_stargifts_from_channels = z7;
                                                privacyControlActivity4.currentGiftChannelsValue = !z7;
                                                boolean z8 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings3.disallow_premium_gifts = z8;
                                                privacyControlActivity4.currentGiftPremiumValue = !z8;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity4.finished();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        if (atomicInteger.get() > 0) {
            this.doneButtonDrawable.animateToProgress(1.0f);
        }
    }

    public final boolean areAllStarGiftsDisabled() {
        return (this.selectedGiftUniqueValue || this.selectedGiftUnlimitedValue || this.selectedGiftLimitedValue) ? false : true;
    }

    @Override
    public final boolean canBeginSlide() {
        return checkDiscard$6(true);
    }

    @Override
    public final boolean canFinishFragment() {
        return true;
    }

    public final boolean checkDiscard$6(boolean z) {
        if (this.doneButton.getAlpha() != 1.0f) {
            return true;
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new PrivacyControlActivity$$ExternalSyntheticLambda1(this, 0));
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new PrivacyControlActivity$$ExternalSyntheticLambda1(this, 2));
            showDialog(alertDialog);
        }
        return false;
    }

    public final void checkPrivacy() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i;
        boolean[] zArr;
        ArrayList<TLRPC.PrivacyRule> arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.initialPlus;
        int i2 = this.rulesType;
        if (i2 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            int i3 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 2;
            this.currentType = i3;
            this.initialRulesType = i3;
            this.currentMinus = new ArrayList();
            this.currentPlus = new ArrayList();
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
            this.currentPlus = new ArrayList();
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
            arrayList2.clear();
            arrayList2.addAll(this.currentPlus);
            return;
        }
        boolean z = i2 == 1;
        boolean[] zArr4 = this.initialPlusPremium;
        zArr4[0] = z;
        boolean[] zArr5 = this.currentPlusPremium;
        zArr5[0] = z;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.initialPlusMiniapps;
        zArr6[0] = false;
        boolean[] zArr7 = this.currentPlusMiniapps;
        zArr7[0] = false;
        boolean z2 = i2 == 12;
        zArr6[1] = z2;
        zArr7[1] = z2;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.initialPlusChannels;
        zArr8[0] = false;
        boolean[] zArr9 = this.currentPlusChannels;
        zArr9[0] = false;
        boolean z3 = i2 == 12;
        zArr8[1] = z3;
        zArr9[1] = z3;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.currentPlus = new ArrayList();
        this.currentMinus = new ArrayList();
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i2);
        if (privacyRules2 == null || privacyRules2.size() == 0) {
            this.currentType = 1;
        } else {
            Boolean bool2 = null;
            byte b = -1;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < privacyRules2.size()) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i5);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int iM2 = 0;
                    while (true) {
                        zArr = zArr6;
                        if (iM2 >= size2) {
                            break;
                        }
                        iM2 = MessagesController$$ExternalSyntheticOutline2.m(-tL_privacyValueAllowChatParticipants2.chats.get(iM2).longValue(), this.currentPlus, iM2, 1);
                        zArr6 = zArr;
                        privacyRules2 = privacyRules2;
                        tL_privacyValueAllowChatParticipants2 = tL_privacyValueAllowChatParticipants2;
                        zArr4 = zArr4;
                    }
                    arrayList = privacyRules2;
                    zArr2 = zArr4;
                } else {
                    zArr = zArr6;
                    arrayList = privacyRules2;
                    zArr2 = zArr4;
                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule2;
                        int iM3 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); iM3 < size3; size3 = size3) {
                            iM3 = MessagesController$$ExternalSyntheticOutline2.m(-tL_privacyValueDisallowChatParticipants.chats.get(iM3).longValue(), this.currentMinus, iM3, 1);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.currentPlus.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.currentMinus.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z4 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
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
                            bool2 = bool;
                        }
                    }
                    i5++;
                    zArr5 = zArr3;
                    zArr6 = zArr;
                    privacyRules2 = arrayList;
                    zArr4 = zArr2;
                }
                zArr3 = zArr5;
                i5++;
                zArr5 = zArr3;
                zArr6 = zArr;
                privacyRules2 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (b == 0 || (b == -1 && (this.currentMinus.size() > 0 || !(bool2 == null || bool2.booleanValue())))) {
                i = 2;
                this.currentType = 0;
            } else {
                i = 2;
                if (b == 2) {
                    this.currentType = i;
                } else if (b != -1 || this.currentMinus.size() <= 0 || this.currentPlus.size() <= 0) {
                    int i6 = 1;
                    if (b == 1) {
                        this.currentType = i6;
                    } else if (b == -1 && (this.currentPlus.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                        i6 = 1;
                        this.currentType = i6;
                    }
                    i = 2;
                } else {
                    i = 2;
                    this.currentType = i;
                }
            }
            int i7 = this.currentType;
            char c = i7 == i ? (char) 0 : (char) 1;
            zArr11[c] = z4;
            zArr12[c] = z4;
            boolean z8 = bool2 != null;
            zArr10[i7] = z8;
            zArr7[i7] = z8;
            zArr8[i7] = false;
            zArr9[i7] = false;
            ActionBarMenuItem actionBarMenuItem = this.doneButton;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setAlpha(0.0f);
                this.doneButton.setScaleX(0.0f);
                this.doneButton.setScaleY(0.0f);
                this.doneButton.setEnabled(false);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.initialMinus;
        arrayList3.clear();
        this.initialRulesType = this.currentType;
        arrayList2.addAll(this.currentPlus);
        arrayList3.addAll(this.currentMinus);
        if (i2 == 6) {
            ArrayList<TLRPC.PrivacyRule> privacyRules3 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules3 == null || privacyRules3.size() == 0) {
                this.currentSubType = 0;
            } else {
                for (int i8 = 0; i8 < privacyRules3.size(); i8++) {
                    TLRPC.PrivacyRule privacyRule3 = privacyRules3.get(i8);
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
        if (i2 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            boolean z9 = globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks;
            this.currentReadValue = z9;
            this.selectedReadValue = z9;
        }
        if (i2 == 12) {
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
        updateRows$6(false);
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    @Override
    public final View createView(Context context) {
        int i = this.rulesType;
        if (i == 5) {
            this.messageCell = new MessageCell(this, context);
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
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
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 14));
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i2 = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i2, false)));
        this.doneButtonDrawable = crossfadeDrawable;
        this.doneButton = actionBarMenuCreateMenu.addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), crossfadeDrawable);
        boolean zHasChanges$2 = hasChanges$2();
        this.doneButton.setAlpha(zHasChanges$2 ? 1.0f : 0.0f);
        this.doneButton.setScaleX(zHasChanges$2 ? 1.0f : 0.0f);
        this.doneButton.setScaleY(zHasChanges$2 ? 1.0f : 0.0f);
        this.doneButton.setEnabled(zHasChanges$2);
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        zzku.m(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).delayAnimations = false;
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 27));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                PrivacyControlActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        setMessageText();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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
    public final void didStartUpload(boolean z, boolean z2) {
    }

    @Override
    public final void didUploadFailed() {
    }

    @Override
    public final void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = this.f$0;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.avatarForRest = photoSize3;
                privacyControlActivity.avatarForRestPhoto = null;
                privacyControlActivity.updateAvatarForRestInfo();
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile3 != null || inputFile4 != null) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new LinkManager$$ExternalSyntheticLambda3(privacyControlActivity, 20));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().getCurrentUser().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().getCurrentUser().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().getCurrentUser().access_hash;
                    BulletinFactory.of(privacyControlActivity).createUsersBulletin(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip), null, null).show();
                }
                privacyControlActivity.updateRows$6(false);
            }
        });
    }

    public final void finished() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        this.doneButtonDrawable.animateToProgress(0.0f);
        int i = this.rulesType;
        if ((i == 10 || i == 1 || i == 2) && this.currentType != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = iArr[i2];
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i3);
                if (i3 != i && ContactsController.findRule(privacyRules, TLRPC.TL_privacyValueAllowAll.class) != null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, this.resourceProvider);
                    String string = LocaleController.getString(i3 == 1 ? R.string.CheckPrivacyInviteTitle : R.string.CheckPrivacyCallsTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.getString(i3 == 1 ? R.string.CheckPrivacyInviteText : R.string.CheckPrivacyCallsText);
                    builder.setPositiveButton(LocaleController.getString(R.string.CheckPrivacyReview), new LaunchActivity$$ExternalSyntheticLambda9(this, i3, 15));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new PrivacyControlActivity$$ExternalSyntheticLambda1(this, 1));
                    builder.show();
                    return;
                }
            }
        }
        finishFragment();
    }

    @Override
    public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
        Drawable[] drawableArr = Theme.chat_msgInDrawable.shadowDrawable;
        int i4 = Theme.key_chat_inBubbleShadow;
        arrayList.add(new ThemeDescription(recyclerListView, 0, null, null, drawableArr, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgInMediaDrawable.shadowDrawable, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubble));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient1));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient2));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutDrawable, Theme.chat_msgOutMediaDrawable}, null, Theme.key_chat_outBubbleGradient3));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, new Drawable[]{Theme.chat_msgOutSelectedDrawable, Theme.chat_msgOutMediaSelectedDrawable}, null, Theme.key_chat_outBubbleSelected));
        RecyclerListView recyclerListView2 = this.listView;
        Drawable[] drawableArr2 = Theme.chat_msgOutDrawable.shadowDrawable;
        int i5 = Theme.key_chat_outBubbleShadow;
        arrayList.add(new ThemeDescription(recyclerListView2, 0, null, null, drawableArr2, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, Theme.chat_msgOutMediaDrawable.shadowDrawable, null, i5));
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

    public final boolean hasChanges$2() {
        ArrayList arrayList;
        int i = this.rulesType;
        if (i == 0 && ((this.currentType != 0 || ((arrayList = this.currentMinus) != null && !arrayList.isEmpty())) && this.currentReadValue != this.selectedReadValue)) {
            return true;
        }
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
        if ((i == 10 && i3 == 3 && this.currentStars != this.initialStars) || this.initialPlusMiniapps[i3] != this.currentPlusMiniapps[i3]) {
            return true;
        }
        ArrayList arrayList2 = this.initialMinus;
        if (arrayList2.size() != this.currentMinus.size()) {
            return true;
        }
        ArrayList arrayList3 = this.initialPlus;
        if (arrayList3.size() != this.currentPlus.size()) {
            return true;
        }
        if (i != 10 || this.currentType == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.currentPlus);
            if (!arrayList3.equals(this.currentPlus)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.currentMinus);
            if (!arrayList2.equals(this.currentMinus)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$applyCurrentPrivacySettings$14(TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error != null) {
            showErrorAlert();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(this.currentAccount).setPrivacyRules(privacyrules.rules, 13);
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda7(21, this, zArr));
    }

    public final void lambda$applyCurrentPrivacySettings$18(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            BulletinFactory.of(this).showForError(false, tL_error);
            return;
        }
        ContactsController.getInstance(this.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
        if (atomicInteger.decrementAndGet() == 0) {
            finished();
        }
    }

    public final void lambda$applyCurrentPrivacySettings$20(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
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

    public final void lambda$createView$3$4$2() {
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
        updateRows$6(true);
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

    public final void lambda$didUploadPhoto$0(TLObject tLObject) {
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
                String strM = SurfaceContainer$$ExternalSyntheticOutline0.m(this.avatarForRest.location.local_id, "@50_50", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(strM, SurfaceContainer$$ExternalSyntheticOutline0.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 == null || this.avatarForRest == null) {
                return;
            }
            FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarForRest.location, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        return checkDiscard$6(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        checkPrivacy();
        updateRows$6(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onPause() {
        ChatAttachAlert chatAttachAlert;
        super.onPause();
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater == null || (chatAttachAlert = imageUpdater.chatAttachAlert) == null) {
            return;
        }
        chatAttachAlert.onPause();
    }

    @Override
    public final void onResume() {
        ChatAttachAlert chatAttachAlert;
        super.onResume();
        updateRows$6(false);
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater == null || (chatAttachAlert = imageUpdater.chatAttachAlert) == null) {
            return;
        }
        chatAttachAlert.onResume();
    }

    @Override
    public final void onUploadProgressChanged(float f) {
    }

    public final void processDone$9() {
        if (getParentActivity() == null) {
            return;
        }
        int i = this.rulesType;
        if (i == 10 && this.currentType == 3 && !getUserConfig().isPremium()) {
            showDialog(new PremiumFeatureBottomSheet(this, getParentActivity(), getCurrentAccount(), false, 27, true, null));
            return;
        }
        if (this.currentType != 0 && i == 0 && !getUserConfig().isPremium()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                AlertDialog alertDialog = builder.alertDialog;
                if (i == 1) {
                    alertDialog.message = LocaleController.getString(R.string.WhoCanAddMeInfo);
                } else {
                    alertDialog.message = LocaleController.getString(R.string.CustomHelp);
                }
                alertDialog.title = LocaleController.getString(R.string.AppName);
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(12, this, globalMainSettings));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog);
                return;
            }
        }
        applyCurrentPrivacySettings();
    }

    public final void setMessageText() {
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

    public final void showErrorAlert() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.AppName);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.PrivacyFloodControlError);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog);
    }

    public final void showPremiumBulletin() {
        BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new PrivacyControlActivity$$ExternalSyntheticLambda5(this, 1)).show();
    }

    @Override
    public final boolean supportsBulletin() {
        return false;
    }

    public final void updateAvatarForRestInfo() {
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
            backupImageView.setImage(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        } else {
            backupImageView.setImage(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        }
    }

    public final void updateDoneButton() {
        boolean zHasChanges$2 = hasChanges$2();
        this.doneButton.setEnabled(zHasChanges$2);
        this.doneButton.animate().alpha(zHasChanges$2 ? 1.0f : 0.0f).scaleX(zHasChanges$2 ? 1.0f : 0.0f).scaleY(zHasChanges$2 ? 1.0f : 0.0f).setDuration(180L).start();
    }

    public final void updateRows$6(boolean z) {
        DiffCallback diffCallback;
        ArrayList arrayList;
        int i;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        int i2;
        TLRPC.UserFull userFull;
        if (z) {
            diffCallback = new DiffCallback();
            diffCallback.fillPositions(diffCallback.oldPositionToItem);
            diffCallback.oldRowCount = this.rowCount;
        } else {
            diffCallback = null;
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
        if (i3 == 5) {
            int i5 = this.rowCount;
            this.rowCount = i5 + 1;
            this.messageRow = i5;
        }
        int i6 = this.rowCount;
        this.sectionRow = i6;
        this.everybodyRow = i6 + 1;
        int i7 = i6 + 3;
        this.rowCount = i7;
        this.myContactsRow = i6 + 2;
        if (i3 == 4 || i3 == 9 || i3 == 14 || i3 == 0 || i3 == 2 || i3 == 3 || i3 == 5 || i3 == 6 || i3 == 8 || i3 == 1 || i3 == 11 || i3 == 12) {
            this.rowCount = i6 + 4;
            this.nobodyRow = i7;
        }
        if (getMessagesController().starsPaidMessagesAvailable && i3 == 10) {
            int i8 = this.rowCount;
            this.rowCount = i8 + 1;
            this.payRow = i8;
        }
        if (i3 == 6 && this.currentType == 1) {
            int i9 = this.rowCount;
            this.phoneDetailRow = i9;
            this.phoneSectionRow = i9 + 1;
            this.phoneEverybodyRow = i9 + 2;
            this.rowCount = i9 + 4;
            this.phoneContactsRow = i9 + 3;
        }
        if (i3 == 10 && this.currentType == 3) {
            int i10 = this.rowCount;
            this.rowCount = i10 + 1;
            this.detailRow2 = i10;
        } else {
            int i11 = this.rowCount;
            this.rowCount = i11 + 1;
            this.detailRow = i11;
        }
        if (i3 == 10) {
            if (this.currentType == 3) {
                int i12 = this.rowCount;
                this.priceHeaderRow = i12;
                this.rowCount = i12 + 2;
                this.priceRow = i12 + 1;
                if (!getUserConfig().isPremium()) {
                    int i13 = this.rowCount;
                    this.rowCount = i13 + 1;
                    this.priceButtonRow = i13;
                }
                int i14 = this.rowCount;
                this.rowCount = i14 + 1;
                this.priceInfoRow = i14;
                if (getUserConfig().isPremium()) {
                    int i15 = this.rowCount;
                    this.shareSectionRow = i15;
                    this.alwaysShareRow = i15 + 1;
                    this.rowCount = i15 + 3;
                    this.shareDetailRow = i15 + 2;
                }
            }
        } else if (i3 != 8 || getUserConfig().isPremium()) {
            int i16 = this.rowCount;
            int i17 = i16 + 1;
            this.rowCount = i17;
            this.shareSectionRow = i16;
            int i18 = this.currentType;
            if (i18 == 1 || i18 == 2) {
                this.rowCount = i16 + 2;
                this.alwaysShareRow = i17;
            }
            if (i18 == 0 || i18 == 2) {
                int i19 = this.rowCount;
                this.rowCount = i19 + 1;
                this.neverShareRow = i19;
            }
            int i20 = this.rowCount;
            int i21 = i20 + 1;
            this.rowCount = i21;
            this.shareDetailRow = i20;
            if (i3 == 2) {
                this.p2pSectionRow = i21;
                this.p2pRow = i20 + 2;
                this.rowCount = i20 + 4;
                this.p2pDetailRow = i20 + 3;
            }
            if (i3 == 4 && (this.currentMinus.size() > 0 || (i = this.currentType) == 2 || i == 1)) {
                int i22 = this.rowCount;
                int i23 = i22 + 1;
                this.rowCount = i23;
                this.photoForRestRow = i22;
                if (this.avatarForRest != null) {
                    this.rowCount = i22 + 2;
                    this.currentPhotoForRestRow = i23;
                }
                int i24 = this.rowCount;
                this.rowCount = i24 + 1;
                this.photoForRestDescriptionRow = i24;
            }
            if (i3 == 0 && (this.currentType != 0 || ((arrayList = this.currentMinus) != null && !arrayList.isEmpty()))) {
                int i25 = this.rowCount;
                this.readRow = i25;
                this.rowCount = i25 + 2;
                this.readDetailRow = i25 + 1;
            }
            if (i3 == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i26 = this.rowCount;
                this.readPremiumRow = i26;
                this.rowCount = i26 + 2;
                this.readPremiumDetailRow = i26 + 1;
            }
        }
        if (i3 == 12) {
            int i27 = this.rowCount;
            this.giftTypesHeaderRow = i27;
            this.giftTypeLimitedRow = i27 + 1;
            this.giftTypeUnlimitedRow = i27 + 2;
            this.giftTypeUniqueRow = i27 + 3;
            this.giftTypeChannelsRow = i27 + 4;
            this.giftTypePremiumRow = i27 + 5;
            this.rowCount = i27 + 7;
            this.giftTypesInfoRow = i27 + 6;
        }
        setMessageText();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            if (!z) {
                listAdapter.mObservable.notifyChanged();
                return;
            }
            int childCount = this.listView.getChildCount();
            for (int i28 = 0; i28 < childCount; i28++) {
                View childAt = this.listView.getChildAt(i28);
                if ((childAt instanceof RadioCell) && (viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null) {
                    int adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition();
                    RadioCell radioCell = (RadioCell) childAt;
                    int i29 = this.everybodyRow;
                    if (adapterPosition == i29 || adapterPosition == this.myContactsRow || adapterPosition == this.nobodyRow || adapterPosition == this.payRow) {
                        if (adapterPosition == i29) {
                            i2 = 0;
                        } else if (adapterPosition == this.myContactsRow) {
                            i2 = 2;
                        } else {
                            i2 = adapterPosition == this.nobodyRow ? 1 : 3;
                        }
                        radioCell.radioButton.setChecked(this.currentType == i2, true);
                    } else {
                        radioCell.radioButton.setChecked(this.currentSubType == (adapterPosition == this.phoneContactsRow ? 1 : 0), true);
                    }
                }
            }
            diffCallback.fillPositions(diffCallback.newPositionToItem);
            DiffUtil.calculateDiff(diffCallback, true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this.listAdapter, 1));
            AndroidUtilities.updateVisibleRows(this.listView);
        }
    }

    public PrivacyControlActivity(int i) {
        this(i, false);
    }
}
