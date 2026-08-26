package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextColorCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda156;
import org.telegram.ui.Stars.StarGiftPreviewSheet$$ExternalSyntheticLambda5;

public final class NotificationsCustomSettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ListAdapter adapter;
    public AnimatorSet animatorSet;
    public ArrayList autoExceptions;
    public final int currentType;
    public EmptyTextProgressView emptyView;
    public ArrayList exceptions;
    public final HashMap exceptionsDict;
    public boolean expanded;
    public final ArrayList items;
    public RecyclerListView listView;
    public final ArrayList oldItems;
    public final int[] popupOptions;
    public final int[] priorityOptions;
    public SearchAdapter searchAdapter;
    public boolean searching;
    public boolean showAutoExceptions;
    public boolean storiesAuto;
    public Boolean storiesEnabled;
    public final int[] vibrateLabels;

    public final class AnonymousClass3 implements ChatNotificationsPopupWrapper.Callback {
        public final ArrayList val$arrayList;
        public final boolean val$defaultEnabled;
        public final long val$did;
        public final NotificationsSettingsActivity.NotificationException val$exception;
        public final boolean val$newException;
        public final int val$position;

        public AnonymousClass3(long j, boolean z, NotificationsSettingsActivity.NotificationException notificationException, boolean z2, int i, ArrayList arrayList) {
            this.val$did = j;
            this.val$defaultEnabled = z;
            this.val$exception = notificationException;
            this.val$newException = z2;
            this.val$position = i;
            this.val$arrayList = arrayList;
        }

        @Override
        public final void dismiss() {
        }

        @Override
        public final void muteFor(int i) {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
            if (i == 0) {
                if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.val$did, 0)) {
                    toggleMute();
                }
                if (BulletinFactory.canShowBulletin(notificationsCustomSettingsActivity)) {
                    BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity, 4, i, notificationsCustomSettingsActivity.getResourceProvider()).show();
                }
            } else {
                notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.val$did, 0, i);
                if (BulletinFactory.canShowBulletin(notificationsCustomSettingsActivity)) {
                    BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity, 5, i, notificationsCustomSettingsActivity.getResourceProvider()).show();
                }
            }
            update();
        }

        @Override
        public final void openExceptions() {
        }

        public final void setDefault() {
            int iIndexOf;
            if (this.val$newException) {
                return;
            }
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
            ArrayList arrayList = notificationsCustomSettingsActivity.exceptions;
            NotificationsSettingsActivity.NotificationException notificationException = this.val$exception;
            ArrayList arrayList2 = this.val$arrayList;
            if (arrayList2 != arrayList && (iIndexOf = arrayList.indexOf(notificationException)) >= 0) {
                notificationsCustomSettingsActivity.exceptions.remove(iIndexOf);
                notificationsCustomSettingsActivity.exceptionsDict.remove(Long.valueOf(notificationException.did));
            }
            arrayList2.remove(notificationException);
            if (arrayList2 == notificationsCustomSettingsActivity.exceptions) {
                notificationsCustomSettingsActivity.updateRows(true);
                notificationsCustomSettingsActivity.checkRowsEnabled();
            } else {
                notificationsCustomSettingsActivity.updateRows(true);
                notificationsCustomSettingsActivity.searchAdapter.notifyItemChanged(this.val$position);
            }
            ((BaseFragment) notificationsCustomSettingsActivity).actionBar.closeSearchField(true);
        }

        @Override
        public final void showCustomize() {
            long j = this.val$did;
            if (j != 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", j);
                ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle, null);
                profileNotificationsActivity.delegate = new PhotoViewer.AnonymousClass18(this, 23);
                NotificationsCustomSettingsActivity.this.presentFragment(profileNotificationsActivity);
            }
        }

        @Override
        public final void toggleMute() {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
            MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
            long j = 0;
            long j2 = this.val$did;
            notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.val$did, j, !messagesController.isDialogMuted(j2, j));
            BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j2, j), null).show();
            update();
        }

        @Override
        public final void toggleSound() {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.val$did, 0);
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) notificationsCustomSettingsActivity).currentAccount);
            boolean z = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
            boolean z2 = !z;
            notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z2).apply();
            if (BulletinFactory.canShowBulletin(notificationsCustomSettingsActivity)) {
                BulletinFactory.createSoundEnabledBulletin(z ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).show();
            }
        }

        public final void update() {
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.val$did, 0) != this.val$defaultEnabled) {
                setDefault();
                return;
            }
            SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
            StringBuilder sb = new StringBuilder("custom_");
            NotificationsSettingsActivity.NotificationException notificationException = this.val$exception;
            sb.append(notificationException.did);
            notificationException.hasCustom = notificationsSettings.getBoolean(sb.toString(), false);
            int i = notificationsSettings.getInt("notify2_" + notificationException.did, 0);
            notificationException.notify = i;
            if (i != 0) {
                int i2 = notificationsSettings.getInt("notifyuntil_" + notificationException.did, -1);
                if (i2 != -1) {
                    notificationException.muteUntil = i2;
                }
            }
            if (this.val$newException) {
                notificationsCustomSettingsActivity.exceptions.add(notificationException);
                notificationsCustomSettingsActivity.exceptionsDict.put(Long.valueOf(notificationException.did), notificationException);
                notificationsCustomSettingsActivity.updateRows(true);
            } else {
                notificationsCustomSettingsActivity.listView.getAdapter().notifyItemChanged(this.val$position);
            }
            ((BaseFragment) notificationsCustomSettingsActivity).actionBar.closeSearchField(true);
        }
    }

    public final class ExpandView extends TextCell {
        public final ImageView imageView;

        public ExpandView(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), PorterDuff.Mode.SRC_IN));
            imageView.setImageResource(R.drawable.msg_expand);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int iDp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i3 - i) - AndroidUtilities.dp(41.0f);
            int iM$2 = OKLCH.m$2(24.0f, i4 - i2, 2);
            this.imageView.layout(iDp, iM$2, AndroidUtilities.dp(24.0f) + iDp, AndroidUtilities.dp(24.0f) + iM$2);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.imageView.measure(i, i2);
        }
    }

    public final class ItemInner extends AdapterWithDiffUtils.Item {
        public boolean checked;
        public int color;
        public NotificationsSettingsActivity.NotificationException exception;
        public int id;
        public int resId;
        public String text;
        public String text2;

        public static ItemInner asCheck(int i, String str, boolean z) {
            ItemInner itemInner = new ItemInner(1, true);
            itemInner.id = i;
            itemInner.text = str;
            itemInner.checked = z;
            return itemInner;
        }

        @Override
        public final boolean contentsEquals(AdapterWithDiffUtils.Item item) {
            if (this == item) {
                return true;
            }
            if (ItemInner.class != item.getClass()) {
                return false;
            }
            ItemInner itemInner = (ItemInner) item;
            return this.id == itemInner.id && this.resId == itemInner.resId && this.color == itemInner.color && this.checked == itemInner.checked && Objects.equals(this.text, itemInner.text) && Objects.equals(this.text2, itemInner.text2) && this.exception == itemInner.exception;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ItemInner.class == obj.getClass()) {
                ItemInner itemInner = (ItemInner) obj;
                if (this.id == itemInner.id && this.color == itemInner.color && ((this.viewType == 8 || (this.resId == itemInner.resId && Objects.equals(this.text, itemInner.text) && (this.viewType == 6 || Objects.equals(this.text2, itemInner.text2)))) && this.exception == itemInner.exception)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class ListAdapter extends AdapterWithDiffUtils {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return NotificationsCustomSettingsActivity.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            if (i < 0) {
                return 5;
            }
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
            if (i >= notificationsCustomSettingsActivity.items.size()) {
                return 5;
            }
            return ((ItemInner) notificationsCustomSettingsActivity.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return (i == 0 || i == 4) ? false : true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i >= 0) {
                ArrayList arrayList = NotificationsCustomSettingsActivity.this.items;
                if (i >= arrayList.size()) {
                    return;
                }
                ItemInner itemInner = (ItemInner) arrayList.get(i);
                int i2 = i + 1;
                boolean z = i2 < arrayList.size() && ((ItemInner) arrayList.get(i2)).viewType != 4;
                int i3 = viewHolder.mItemViewType;
                View view = viewHolder.itemView;
                switch (i3) {
                    case 0:
                        ((HeaderCell) view).setText(itemInner.text);
                        break;
                    case 1:
                        ((TextCheckCell) view).setTextAndCheck("" + ((Object) itemInner.text), itemInner.checked, z);
                        break;
                    case 2:
                        ((UserCell) view).setException(itemInner.exception, null, z);
                        break;
                    case 3:
                        TextColorCell textColorCell = (TextColorCell) view;
                        String str = "" + ((Object) itemInner.text);
                        int i4 = itemInner.color;
                        textColorCell.textView.setText(str);
                        textColorCell.needDivider = z;
                        textColorCell.currentColor = i4;
                        textColorCell.setWillNotDraw(!z && i4 == 0);
                        textColorCell.invalidate();
                        break;
                    case 4:
                        TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                        if (itemInner.text != null) {
                            textInfoPrivacyCell.setFixedSize(0);
                            textInfoPrivacyCell.setText(itemInner.text);
                        } else {
                            textInfoPrivacyCell.setFixedSize(12);
                            textInfoPrivacyCell.setText(null);
                        }
                        break;
                    case 5:
                        ((TextSettingsCell) view).setTextAndValue(itemInner.text, itemInner.text2, false, z);
                        break;
                    case 6:
                        NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
                        notificationsCheckCell.setDrawLine(true);
                        notificationsCheckCell.setChecked(itemInner.checked);
                        notificationsCheckCell.setTextAndValueAndIconAndCheck(itemInner.text, itemInner.text2, itemInner.resId, itemInner.checked, 0, false, z, true);
                        break;
                    case 7:
                        TextCell textCell = (TextCell) view;
                        if (itemInner.resId != 0) {
                            textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                            textCell.setTextAndIcon(itemInner.resId, "" + ((Object) itemInner.text), z);
                        } else {
                            textCell.setColors(-1, Theme.key_text_RedRegular);
                            textCell.setText("" + ((Object) itemInner.text), z);
                        }
                        break;
                    case 8:
                        ExpandView expandView = (ExpandView) view;
                        expandView.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        String str2 = itemInner.text;
                        OKLCH.m(expandView.imageView.animate().rotation(itemInner.resId == 1 ? 0.0f : 180.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 340L);
                        expandView.setText(str2, z);
                        break;
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            View userCell;
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
            Context context = this.mContext;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(context);
                    break;
                case 1:
                    headerCell = new TextCheckCell(context);
                    break;
                case 2:
                    userCell = new UserCell(6, 0, this.mContext, null, false, false);
                    headerCell = userCell;
                    break;
                case 3:
                    headerCell = new TextColorCell(context, null);
                    break;
                case 4:
                    headerCell = new TextInfoPrivacyCell(context, 24, null);
                    break;
                case 5:
                    headerCell = new TextSettingsCell(context, 0, null);
                    break;
                case 6:
                    userCell = new NotificationsCheckCell(this.mContext, 21, 64, true, ((BaseFragment) notificationsCustomSettingsActivity).resourceProvider);
                    headerCell = userCell;
                    break;
                case 7:
                default:
                    headerCell = new TextCell(context);
                    break;
                case 8:
                    headerCell = new ExpandView(notificationsCustomSettingsActivity, context);
                    break;
            }
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            boolean zIsGlobalNotificationsEnabled;
            ItemInner itemInner;
            ArrayList arrayList;
            ArrayList arrayList2;
            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
            int i = notificationsCustomSettingsActivity.currentType;
            if (i == 3 || ((arrayList2 = notificationsCustomSettingsActivity.exceptions) != null && arrayList2.isEmpty())) {
                if (i == 3) {
                    Boolean bool = notificationsCustomSettingsActivity.storiesEnabled;
                    zIsGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.exceptions) == null || arrayList.isEmpty());
                } else {
                    zIsGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i);
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition >= 0) {
                    ArrayList arrayList3 = notificationsCustomSettingsActivity.items;
                    if (adapterPosition < arrayList3.size()) {
                        itemInner = (ItemInner) arrayList3.get(adapterPosition);
                    } else {
                        itemInner = null;
                    }
                } else {
                    itemInner = null;
                }
                if (itemInner == null || itemInner.id != 102) {
                    int i2 = viewHolder.mItemViewType;
                    View view = viewHolder.itemView;
                    if (i2 == 0) {
                        ((HeaderCell) view).setEnabled(null, zIsGlobalNotificationsEnabled);
                        return;
                    }
                    if (i2 == 1) {
                        ((TextCheckCell) view).setEnabled(null, zIsGlobalNotificationsEnabled);
                    } else if (i2 == 3) {
                        ((TextColorCell) view).setEnabled(null, zIsGlobalNotificationsEnabled);
                    } else {
                        if (i2 != 5) {
                            return;
                        }
                        ((TextSettingsCell) view).setEnabled(null, zIsGlobalNotificationsEnabled);
                    }
                }
            }
        }
    }

    public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;
        public final SearchAdapterHelper searchAdapterHelper;
        public ArrayList searchResult = new ArrayList();
        public ArrayList searchResultNames = new ArrayList();
        public NotificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda0 searchRunnable;

        public SearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.delegate = new PhotoViewer$$ExternalSyntheticLambda115(this, 12);
        }

        @Override
        public final int getItemCount() {
            int size = this.searchResult.size();
            ArrayList arrayList = this.searchAdapterHelper.globalSearch;
            return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
        }

        @Override
        public final int getItemViewType(int i) {
            return i == this.searchResult.size() ? 1 : 0;
        }

        public final Object getObject(int i) {
            if (i >= 0 && i < this.searchResult.size()) {
                return this.searchResult.get(i);
            }
            int iM = zzki.m(1, i, this.searchResult);
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            ArrayList arrayList = searchAdapterHelper.globalSearch;
            if (iM < 0 || iM >= arrayList.size()) {
                return null;
            }
            return searchAdapterHelper.globalSearch.get(iM);
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                ((GraySectionCell) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
                return;
            }
            UserCell userCell = (UserCell) view;
            if (i < this.searchResult.size()) {
                userCell.setException((NotificationsSettingsActivity.NotificationException) this.searchResult.get(i), (CharSequence) this.searchResultNames.get(i), i != this.searchResult.size() - 1);
                userCell.setAddButtonVisible(false);
            } else {
                int iM = zzki.m(1, i, this.searchResult);
                ArrayList arrayList = this.searchAdapterHelper.globalSearch;
                userCell.setData((TLObject) arrayList.get(iM), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), iM != arrayList.size() - 1);
                userCell.setAddButtonVisible(true);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View userCell;
            if (i != 0) {
                userCell = new GraySectionCell(this.mContext, 16, null);
                userCell.setBackgroundColor(0);
                userCell.setTag(-33024);
            } else {
                userCell = new UserCell(4, 0, this.mContext, null, false, true);
            }
            return new RecyclerListView.Holder(userCell);
        }

        public final void searchDialogs(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            if (str != null) {
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                NotificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda0 notificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda0 = new NotificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda0(this, str, 0);
                this.searchRunnable = notificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda0;
                dispatchQueue.postRunnable(notificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda0, 300L);
                return;
            }
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null, null);
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int i = NotificationsCustomSettingsActivity.this.currentType;
            searchAdapterHelper.queryServerSearch(null, true, (i == 1 || i == 3) ? false : true, true, false, false, 0L, false, 0, 0, 0L, null);
            this.mObservable.notifyChanged();
        }
    }

    public NotificationsCustomSettingsActivity(int i, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        super(null);
        this.showAutoExceptions = true;
        this.exceptionsDict = new HashMap();
        this.vibrateLabels = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.popupOptions = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i2 = R.string.NotificationsPriorityHigh;
        int i3 = R.string.NotificationsPriorityUrgent;
        int i4 = R.string.NotificationsPriorityMedium;
        this.priorityOptions = new int[]{i2, i3, i3, i4, R.string.NotificationsPriorityLow, i4};
        this.oldItems = new ArrayList();
        this.items = new ArrayList();
        this.currentType = i;
        this.autoExceptions = arrayList2;
        this.exceptions = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                NotificationsSettingsActivity.NotificationException notificationException = (NotificationsSettingsActivity.NotificationException) this.exceptions.get(i5);
                this.exceptionsDict.put(Long.valueOf(notificationException.did), notificationException);
            }
        }
        ArrayList arrayList3 = this.autoExceptions;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                NotificationsSettingsActivity.NotificationException notificationException2 = (NotificationsSettingsActivity.NotificationException) this.autoExceptions.get(i6);
                this.exceptionsDict.put(Long.valueOf(notificationException2.did), notificationException2);
            }
        }
        if (z) {
            loadExceptions();
        }
    }

    public static boolean isTop5Peer(int i, long j) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new StarGiftPreviewSheet$$ExternalSyntheticLambda5(2)));
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i3)).peer) == j) {
                i2 = i3;
            }
        }
        return i2 >= 0 && i2 >= arrayList.size() + (-5);
    }

    public final void checkRowsEnabled() {
        boolean zIsGlobalNotificationsEnabled;
        ItemInner itemInner;
        int i;
        ArrayList arrayList;
        boolean zIsEmpty = this.exceptions.isEmpty();
        int i2 = this.currentType;
        if (zIsEmpty || i2 == 3) {
            int childCount = this.listView.getChildCount();
            ArrayList arrayList2 = new ArrayList();
            if (i2 == 3) {
                Boolean bool = this.storiesEnabled;
                zIsGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = this.exceptions) == null || arrayList.isEmpty());
            } else {
                zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(i2);
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.listView.getChildAt(i3);
                RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.getChildViewHolder(childAt);
                this.listView.getClass();
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    ArrayList arrayList3 = this.items;
                    if (childAdapterPosition < arrayList3.size()) {
                        itemInner = (ItemInner) arrayList3.get(childAdapterPosition);
                    } else {
                        itemInner = null;
                    }
                } else {
                    itemInner = null;
                }
                boolean z = (itemInner == null || !((i = itemInner.id) == 102 || i == 101 || i == 100)) ? zIsGlobalNotificationsEnabled : true;
                int i4 = holder.mItemViewType;
                View view = holder.itemView;
                if (i4 == 0) {
                    ((HeaderCell) view).setEnabled(arrayList2, z);
                } else if (i4 == 1) {
                    ((TextCheckCell) view).setEnabled(arrayList2, z);
                } else if (i4 == 3) {
                    ((TextColorCell) view).setEnabled(arrayList2, z);
                } else if (i4 == 5) {
                    ((TextSettingsCell) view).setEnabled(arrayList2, z);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.playTogether(arrayList2);
            this.animatorSet.addListener(new PhotoViewer$41$1(this, 21));
            this.animatorSet.setDuration(150L);
            this.animatorSet.start();
        }
    }

    @Override
    public final View createView(Context context) {
        this.searching = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.currentType == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 4));
        ArrayList arrayList = this.exceptions;
        if (arrayList != null && !arrayList.isEmpty()) {
            ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
            actionBarMenuItemAddItem.setIsSearchField$1();
            actionBarMenuItemAddItem.listener = new OKLCH() {
                @Override
                public final void onSearchCollapse() {
                    NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                    notificationsCustomSettingsActivity.searchAdapter.searchDialogs(null);
                    notificationsCustomSettingsActivity.searching = false;
                    notificationsCustomSettingsActivity.emptyView.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
                    notificationsCustomSettingsActivity.listView.setAdapter(notificationsCustomSettingsActivity.adapter);
                    notificationsCustomSettingsActivity.adapter.mObservable.notifyChanged();
                    notificationsCustomSettingsActivity.listView.setFastScrollVisible(true);
                    notificationsCustomSettingsActivity.listView.setVerticalScrollBarEnabled(false);
                    notificationsCustomSettingsActivity.emptyView.setShowAtCenter(false);
                }

                @Override
                public final void onSearchExpand() {
                    NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                    notificationsCustomSettingsActivity.searching = true;
                    notificationsCustomSettingsActivity.emptyView.setShowAtCenter(true);
                }

                @Override
                public final void onTextChanged(EditTextBoldCursor editTextBoldCursor) {
                    NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                    if (notificationsCustomSettingsActivity.searchAdapter == null) {
                        return;
                    }
                    String string = editTextBoldCursor.getText().toString();
                    if (string.length() != 0 && notificationsCustomSettingsActivity.listView != null) {
                        notificationsCustomSettingsActivity.emptyView.setText(LocaleController.getString("NoResult", R.string.NoResult));
                        notificationsCustomSettingsActivity.emptyView.showProgress();
                        notificationsCustomSettingsActivity.listView.setAdapter(notificationsCustomSettingsActivity.searchAdapter);
                        notificationsCustomSettingsActivity.searchAdapter.mObservable.notifyChanged();
                        notificationsCustomSettingsActivity.listView.setFastScrollVisible(false);
                        notificationsCustomSettingsActivity.listView.setVerticalScrollBarEnabled(true);
                    }
                    notificationsCustomSettingsActivity.searchAdapter.searchDialogs(string);
                }
            };
            actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setTextSize(18);
        this.emptyView.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.emptyView.showTextView();
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setEmptyView(this.emptyView);
        zzku.m(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new DialogsActivity$$ExternalSyntheticLambda89(28, this, context));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                NotificationsCustomSettingsActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.mAddDuration = 150L;
        defaultItemAnimator.mMoveDuration = 350L;
        defaultItemAnimator.mChangeAddDuration = 0L;
        defaultItemAnimator.mChangeRemoveDuration = 0L;
        defaultItemAnimator.mRemoveDuration = 0L;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mMoveInterpolator = new OvershootInterpolator(1.1f);
        defaultItemAnimator.translationInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 1));
        return this.fragmentView;
    }

    public final void deleteException(NotificationsSettingsActivity.NotificationException notificationException, View view) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(notificationException.did, 0L);
        getNotificationsSettings().edit().remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.autoExceptions;
        if (arrayList != null) {
            arrayList.remove(notificationException);
        }
        ArrayList arrayList2 = this.exceptions;
        if (arrayList2 != null) {
            arrayList2.remove(notificationException);
        }
        if (isTop5Peer(this.currentAccount, notificationException.did)) {
            notificationException.auto = true;
            notificationException.notify = 0;
            this.autoExceptions.add(notificationException);
        }
        if (view instanceof UserCell) {
            UserCell userCell = (UserCell) view;
            userCell.setException(notificationException, null, userCell.needDivider);
        }
        getNotificationsController().updateServerNotificationsSettings(notificationException.did, 0L, false);
        updateRows(true);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.notificationsSettingsUpdated) {
            if (i == NotificationCenter.reloadHints) {
                loadExceptions();
            }
        } else {
            ListAdapter listAdapter = this.adapter;
            if (listAdapter != null) {
                listAdapter.mObservable.notifyChanged();
            }
        }
    }

    public final int getLedColor() {
        int i = -16776961;
        int i2 = this.currentType;
        if (i2 == 0) {
            i = getNotificationsSettings().getInt("GroupLed", -16776961);
        } else if (i2 == 1) {
            i = getNotificationsSettings().getInt("MessagesLed", -16776961);
        } else if (i2 == 2) {
            i = getNotificationsSettings().getInt("ChannelLed", -16776961);
        } else if (i2 == 3) {
            i = getNotificationsSettings().getInt("StoriesLed", -16776961);
        } else if (i2 == 4 || i2 == 5) {
            i = getNotificationsSettings().getInt("ReactionsLed", -16776961);
        }
        for (int i3 = 0; i3 < 9; i3++) {
            if (TextColorCell.colorsToSave[i3] == i) {
                return TextColorCell.colors[i3];
            }
        }
        return i;
    }

    public final String getPopupOption() {
        int i;
        int i2 = this.currentType;
        if (i2 == 0) {
            i = getNotificationsSettings().getInt("popupGroup", 0);
        } else if (i2 != 1) {
            i = i2 != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0);
        } else {
            i = getNotificationsSettings().getInt("popupAll", 0);
        }
        int[] iArr = this.popupOptions;
        return LocaleController.getString(iArr[Utilities.clamp(i, iArr.length - 1, 0)]);
    }

    public final String getPriorityOption() {
        int i;
        int i2 = this.currentType;
        if (i2 == 0) {
            i = getNotificationsSettings().getInt("priority_group", 1);
        } else if (i2 == 1) {
            i = getNotificationsSettings().getInt("priority_messages", 1);
        } else if (i2 == 2) {
            i = getNotificationsSettings().getInt("priority_channel", 1);
        } else if (i2 != 3) {
            i = (i2 == 4 || i2 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1;
        } else {
            i = getNotificationsSettings().getInt("priority_stories", 1);
        }
        int[] iArr = this.priorityOptions;
        return LocaleController.getString(iArr[Utilities.clamp(i, iArr.length - 1, 0)]);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(9, this);
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, TextCheckCell.class, TextColorCell.class, TextSettingsCell.class, UserCell.class, NotificationsCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        int i3 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i3));
        int i4 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, qrActivity$$ExternalSyntheticLambda9, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextColorCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$17(Context context, View view, int i, float f, float f2) {
        ItemInner itemInner;
        ItemInner itemInner2;
        NotificationsSettingsActivity.NotificationException notificationException;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        NotificationsSettingsActivity.NotificationException notificationException2;
        NotificationsSettingsActivity.NotificationException notificationException3;
        boolean z2;
        final boolean z3;
        boolean z4;
        boolean z5;
        String str;
        NotificationsSettingsActivity.NotificationException notificationException4;
        boolean z6;
        NotificationsSettingsActivity.NotificationException notificationException5;
        ItemOptions itemOptions;
        boolean z7;
        int i2;
        String string;
        NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6 notificationsCustomSettingsActivity$$ExternalSyntheticLambda6;
        boolean z8;
        int i3;
        String string2;
        NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6 notificationsCustomSettingsActivity$$ExternalSyntheticLambda7;
        boolean z9;
        int i4;
        String string3;
        NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6 notificationsCustomSettingsActivity$$ExternalSyntheticLambda8;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this;
        int i5 = 4;
        int i6 = 2;
        int i7 = 0;
        int i8 = 1;
        if (notificationsCustomSettingsActivity.getParentActivity() == null) {
            return;
        }
        if (notificationsCustomSettingsActivity.listView.getAdapter() != notificationsCustomSettingsActivity.adapter || i < 0) {
            itemInner = null;
        } else {
            ArrayList arrayList3 = notificationsCustomSettingsActivity.items;
            if (i < arrayList3.size()) {
                itemInner = (ItemInner) arrayList3.get(i);
            } else {
                itemInner = null;
            }
        }
        if (itemInner != null && itemInner.viewType == 8) {
            notificationsCustomSettingsActivity.expanded = !notificationsCustomSettingsActivity.expanded;
            notificationsCustomSettingsActivity.updateRows(true);
            return;
        }
        int i9 = notificationsCustomSettingsActivity.currentType;
        if (i9 != 3 || itemInner == null) {
            itemInner2 = itemInner;
        } else {
            itemInner2 = itemInner;
            NotificationsSettingsActivity.NotificationException notificationException6 = itemInner2.exception;
            if (notificationException6 != null) {
                ItemOptions itemOptions2 = new ItemOptions(notificationsCustomSettingsActivity, view, false, true);
                itemOptions2.gravity = 3;
                boolean z10 = notificationException6.notify <= 0 || notificationException6.auto;
                int i10 = R.drawable.msg_mute;
                String string4 = LocaleController.getString(R.string.NotificationsStoryMute);
                NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6 notificationsCustomSettingsActivity$$ExternalSyntheticLambda9 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(notificationsCustomSettingsActivity, notificationException6, view, i, 0);
                if (z10) {
                    itemOptions2.add(i10, string4, notificationsCustomSettingsActivity$$ExternalSyntheticLambda9, false);
                }
                boolean z11 = notificationException6.notify > 0 || notificationException6.auto;
                int i11 = R.drawable.msg_unmute;
                String string5 = LocaleController.getString(R.string.NotificationsStoryUnmute);
                NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6 notificationsCustomSettingsActivity$$ExternalSyntheticLambda10 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(this, notificationException6, view, i, 1);
                if (z11) {
                    itemOptions2.add(i11, string5, notificationsCustomSettingsActivity$$ExternalSyntheticLambda10, false);
                }
                boolean z12 = notificationException6.auto;
                int i12 = R.drawable.msg_delete;
                String string6 = LocaleController.getString("DeleteException", R.string.DeleteException);
                NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6 notificationsCustomSettingsActivity$$ExternalSyntheticLambda11 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(this, notificationException6, view, i, 2);
                if (!z12) {
                    itemOptions2.add(i12, string6, notificationsCustomSettingsActivity$$ExternalSyntheticLambda11, true);
                }
                itemOptions2.setScrimViewBackground(this.listView.getClipBackground(view, false));
                itemOptions2.show();
                return;
            }
        }
        HashMap map = notificationsCustomSettingsActivity.exceptionsDict;
        if (i9 == 3) {
            RecyclerView.Adapter adapter = notificationsCustomSettingsActivity.listView.getAdapter();
            SearchAdapter searchAdapter = notificationsCustomSettingsActivity.searchAdapter;
            if (adapter == searchAdapter) {
                Object object = searchAdapter.getObject(i);
                if (!(object instanceof NotificationsSettingsActivity.NotificationException)) {
                    boolean z13 = object instanceof TLRPC.User;
                    long j = z13 ? ((TLRPC.User) object).id : -((TLRPC.Chat) object).id;
                    if (map.containsKey(Long.valueOf(j))) {
                        notificationException5 = (NotificationsSettingsActivity.NotificationException) map.get(Long.valueOf(j));
                    } else {
                        notificationException4 = new NotificationsSettingsActivity.NotificationException();
                        notificationException4.story = true;
                        notificationException4.did = j;
                        if (z13) {
                            notificationException4.did = ((TLRPC.User) object).id;
                        } else {
                            notificationException4.did = -((TLRPC.Chat) object).id;
                        }
                        z6 = true;
                    }
                    if (notificationException4 == null) {
                        return;
                    }
                    itemOptions = new ItemOptions(notificationsCustomSettingsActivity, view, false, true);
                    itemOptions.gravity = 3;
                    if (notificationException4.notify > 0 || notificationException4.auto) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    i2 = R.drawable.msg_mute;
                    string = LocaleController.getString(R.string.NotificationsStoryMute);
                    notificationsCustomSettingsActivity$$ExternalSyntheticLambda6 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(notificationsCustomSettingsActivity, notificationException4, view, z6, 3);
                    if (z7) {
                        itemOptions.add(i2, string, notificationsCustomSettingsActivity$$ExternalSyntheticLambda6, false);
                    }
                    if (notificationException4.notify <= 0 || notificationException4.auto) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    i3 = R.drawable.msg_unmute;
                    string2 = LocaleController.getString(R.string.NotificationsStoryUnmute);
                    notificationsCustomSettingsActivity$$ExternalSyntheticLambda7 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(this, notificationException4, view, z6, 4);
                    if (z8) {
                        itemOptions.add(i3, string2, notificationsCustomSettingsActivity$$ExternalSyntheticLambda7, false);
                    }
                    if (!z6 || notificationException4.auto) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    i4 = R.drawable.msg_delete;
                    string3 = LocaleController.getString("DeleteException", R.string.DeleteException);
                    notificationsCustomSettingsActivity$$ExternalSyntheticLambda8 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(this, notificationException4, view, i, 5);
                    if (z9) {
                        itemOptions.add(i4, string3, notificationsCustomSettingsActivity$$ExternalSyntheticLambda8, true);
                    }
                    itemOptions.setScrimViewBackground(this.listView.getClipBackground(view, false));
                    itemOptions.show();
                    return;
                }
                notificationException5 = (NotificationsSettingsActivity.NotificationException) object;
                notificationException4 = notificationException5;
                z6 = false;
                if (notificationException4 == null) {
                    return;
                }
                itemOptions = new ItemOptions(notificationsCustomSettingsActivity, view, false, true);
                itemOptions.gravity = 3;
                if (notificationException4.notify > 0) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                i2 = R.drawable.msg_mute;
                string = LocaleController.getString(R.string.NotificationsStoryMute);
                notificationsCustomSettingsActivity$$ExternalSyntheticLambda6 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(notificationsCustomSettingsActivity, notificationException4, view, z6, 3);
                if (z7) {
                    itemOptions.add(i2, string, notificationsCustomSettingsActivity$$ExternalSyntheticLambda6, false);
                }
                if (notificationException4.notify <= 0) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                i3 = R.drawable.msg_unmute;
                string2 = LocaleController.getString(R.string.NotificationsStoryUnmute);
                notificationsCustomSettingsActivity$$ExternalSyntheticLambda7 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(this, notificationException4, view, z6, 4);
                if (z8) {
                    itemOptions.add(i3, string2, notificationsCustomSettingsActivity$$ExternalSyntheticLambda7, false);
                }
                if (z6) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                i4 = R.drawable.msg_delete;
                string3 = LocaleController.getString("DeleteException", R.string.DeleteException);
                notificationsCustomSettingsActivity$$ExternalSyntheticLambda8 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(this, notificationException4, view, i, 5);
                if (z9) {
                    itemOptions.add(i4, string3, notificationsCustomSettingsActivity$$ExternalSyntheticLambda8, true);
                }
                itemOptions.setScrimViewBackground(this.listView.getClipBackground(view, false));
                itemOptions.show();
                return;
            }
        }
        if (notificationsCustomSettingsActivity.listView.getAdapter() == notificationsCustomSettingsActivity.searchAdapter || !(itemInner2 == null || itemInner2.exception == null)) {
            RecyclerView.Adapter adapter2 = notificationsCustomSettingsActivity.listView.getAdapter();
            SearchAdapter searchAdapter2 = notificationsCustomSettingsActivity.searchAdapter;
            if (adapter2 == searchAdapter2) {
                Object object2 = searchAdapter2.getObject(i);
                if (object2 instanceof NotificationsSettingsActivity.NotificationException) {
                    arrayList = notificationsCustomSettingsActivity.searchAdapter.searchResult;
                    notificationException = (NotificationsSettingsActivity.NotificationException) object2;
                } else {
                    boolean z14 = object2 instanceof TLRPC.User;
                    long j2 = z14 ? ((TLRPC.User) object2).id : -((TLRPC.Chat) object2).id;
                    if (map.containsKey(Long.valueOf(j2))) {
                        notificationException3 = (NotificationsSettingsActivity.NotificationException) map.get(Long.valueOf(j2));
                        z2 = false;
                    } else {
                        NotificationsSettingsActivity.NotificationException notificationException7 = new NotificationsSettingsActivity.NotificationException();
                        notificationException7.did = j2;
                        if (z14) {
                            notificationException7.did = ((TLRPC.User) object2).id;
                        } else {
                            notificationException7.did = -((TLRPC.Chat) object2).id;
                        }
                        notificationException3 = notificationException7;
                        z2 = true;
                    }
                    notificationException2 = notificationException3;
                    arrayList2 = notificationsCustomSettingsActivity.exceptions;
                    z = z2;
                }
                if (notificationException2 == null) {
                    return;
                }
                long j3 = notificationException2.did;
                ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = new ChatNotificationsPopupWrapper(context, notificationsCustomSettingsActivity.currentAccount, null, true, notificationsCustomSettingsActivity.new AnonymousClass3(j3, NotificationsController.getInstance(notificationsCustomSettingsActivity.currentAccount).isGlobalNotificationsEnabled(j3, false, false), notificationException2, z, i, arrayList2), getResourceProvider());
                chatNotificationsPopupWrapper.update(j3, 0, null);
                chatNotificationsPopupWrapper.showAsOptions(this, view, f, f2, false);
                return;
            }
            notificationException = itemInner2.exception;
            if (notificationException.auto) {
                return;
            } else {
                arrayList = notificationsCustomSettingsActivity.exceptions;
            }
            notificationException2 = notificationException;
            arrayList2 = arrayList;
            z = false;
            if (notificationException2 == null) {
                return;
            }
            long j4 = notificationException2.did;
            ChatNotificationsPopupWrapper chatNotificationsPopupWrapper2 = new ChatNotificationsPopupWrapper(context, notificationsCustomSettingsActivity.currentAccount, null, true, notificationsCustomSettingsActivity.new AnonymousClass3(j4, NotificationsController.getInstance(notificationsCustomSettingsActivity.currentAccount).isGlobalNotificationsEnabled(j4, false, false), notificationException2, z, i, arrayList2), getResourceProvider());
            chatNotificationsPopupWrapper2.update(j4, 0, null);
            chatNotificationsPopupWrapper2.showAsOptions(this, view, f, f2, false);
            return;
        }
        if (itemInner2 == null) {
            return;
        }
        int i13 = itemInner2.id;
        if (i13 == 6) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            if (i9 == 0) {
                bundle.putInt("dialogsType", 6);
            } else if (i9 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.delegate = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda17(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(dialogsActivity);
            return;
        }
        if (i13 == 7) {
            AlertDialog.Builder builder = new AlertDialog.Builder(notificationsCustomSettingsActivity.getParentActivity(), 0, null);
            String string7 = LocaleController.getString("NotificationsDeleteAllExceptionTitle", R.string.NotificationsDeleteAllExceptionTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string7;
            alertDialog.message = LocaleController.getString("NotificationsDeleteAllExceptionAlert", R.string.NotificationsDeleteAllExceptionAlert);
            builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda17(notificationsCustomSettingsActivity));
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            notificationsCustomSettingsActivity.showDialog(alertDialog);
            TextView textView = (TextView) alertDialog.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                return;
            }
            return;
        }
        if (i13 == 100 || i13 == 101) {
            boolean zIsGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i9);
            notificationsCustomSettingsActivity.listView.findViewHolderForAdapterPosition(i);
            final int i14 = notificationsCustomSettingsActivity.currentType;
            if (i14 == 3) {
                SharedPreferences.Editor editorEdit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
                Boolean bool = notificationsCustomSettingsActivity.storiesEnabled;
                boolean z15 = bool != null && bool.booleanValue();
                if (notificationsCustomSettingsActivity.storiesAuto && z15) {
                    editorEdit.remove("EnableAllStories");
                    notificationsCustomSettingsActivity.storiesEnabled = null;
                } else {
                    boolean z16 = !z15;
                    editorEdit.putBoolean("EnableAllStories", z16);
                    notificationsCustomSettingsActivity.storiesEnabled = Boolean.valueOf(z16);
                }
                editorEdit.apply();
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i9);
                notificationsCustomSettingsActivity.updateRows(true);
                boolean z17 = notificationsCustomSettingsActivity.showAutoExceptions;
                if (z17 != (notificationsCustomSettingsActivity.storiesEnabled == null ? 1 : 0) && notificationsCustomSettingsActivity.listView != null && notificationsCustomSettingsActivity.adapter != null) {
                    notificationsCustomSettingsActivity.showAutoExceptions = !z17;
                    notificationsCustomSettingsActivity.updateRows(true);
                }
                notificationsCustomSettingsActivity.checkRowsEnabled();
                return;
            }
            if (!zIsGlobalNotificationsEnabled) {
                notificationsCustomSettingsActivity.getNotificationsController().setGlobalNotificationsEnabled(i9, 0);
                notificationsCustomSettingsActivity.updateRows(true);
                return;
            }
            final ArrayList arrayList4 = notificationsCustomSettingsActivity.exceptions;
            final ArrayList arrayList5 = notificationsCustomSettingsActivity.autoExceptions;
            int i15 = notificationsCustomSettingsActivity.currentAccount;
            final PhotoViewer$$ExternalSyntheticLambda156 photoViewer$$ExternalSyntheticLambda156 = new PhotoViewer$$ExternalSyntheticLambda156(notificationsCustomSettingsActivity, i5);
            Pattern pattern = AlertsCreator.URL_PATTERN;
            if (notificationsCustomSettingsActivity.getParentActivity() == null) {
                return;
            }
            boolean zIsGlobalNotificationsEnabled2 = NotificationsController.getInstance(i15).isGlobalNotificationsEnabled(0L, false, false);
            String string8 = LocaleController.getString(R.string.NotificationsTurnOn);
            int i16 = R.string.MuteFor;
            String[] strArr = {string8, LocaleController.formatString("MuteFor", i16, LocaleController.formatPluralString("Hours", 1, new Object[0])), LocaleController.formatString("MuteFor", i16, LocaleController.formatPluralString("Days", 2, new Object[0])), null, LocaleController.getString(R.string.NotificationsTurnOff)};
            int[] iArr = {R.drawable.notifications_on, R.drawable.notifications_mute1h, R.drawable.notifications_mute2d, R.drawable.notifications_settings, R.drawable.notifications_off};
            LinearLayout linearLayout = new LinearLayout(notificationsCustomSettingsActivity.getParentActivity());
            linearLayout.setOrientation(1);
            final AlertDialog.Builder builder2 = new AlertDialog.Builder(notificationsCustomSettingsActivity.getParentActivity(), 0, null);
            int i17 = 0;
            while (i17 < 5) {
                if (strArr[i17] == null) {
                    i15 = i15;
                    z3 = zIsGlobalNotificationsEnabled2;
                } else {
                    TextView textView2 = new TextView(notificationsCustomSettingsActivity.getParentActivity());
                    Drawable drawable = notificationsCustomSettingsActivity.getParentActivity().getResources().getDrawable(iArr[i17]);
                    if (i17 == 4) {
                        textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_text_RedRegular, false), PorterDuff.Mode.MULTIPLY));
                    } else {
                        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogIcon, false), PorterDuff.Mode.MULTIPLY));
                    }
                    textView2.setTextSize(1, 16.0f);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setTag(Integer.valueOf(i17));
                    textView2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                    textView2.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                    textView2.setSingleLine(true);
                    textView2.setGravity(19);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(26.0f));
                    textView2.setText(strArr[i17]);
                    linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 48, 51));
                    z3 = zIsGlobalNotificationsEnabled2;
                    final int i18 = i15;
                    View.OnClickListener onClickListener = new View.OnClickListener(i18, z3, i14, this, arrayList4, arrayList5, photoViewer$$ExternalSyntheticLambda156, builder2) {
                        public final int f$1;
                        public final AlertDialog.Builder f$10;
                        public final int f$5;
                        public final NotificationsCustomSettingsActivity f$6;
                        public final ArrayList f$7;
                        public final ArrayList f$8;
                        public final PhotoViewer$$ExternalSyntheticLambda156 f$9;

                        {
                            this.f$5 = i14;
                            this.f$6 = this;
                            this.f$7 = arrayList4;
                            this.f$8 = arrayList5;
                            this.f$9 = photoViewer$$ExternalSyntheticLambda156;
                            this.f$10 = builder2;
                        }

                        @Override
                        public final void onClick(View view2) {
                            int i19;
                            int iIntValue = ((Integer) view2.getTag()).intValue();
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f$6;
                            int i20 = this.f$1;
                            int i21 = this.f$5;
                            int i22 = 3;
                            if (iIntValue == 0) {
                                NotificationsController.getInstance(i20).setGlobalNotificationsEnabled(i21, 0);
                            } else if (iIntValue == 3) {
                                notificationsCustomSettingsActivity2.presentFragment(new NotificationsCustomSettingsActivity(i21, this.f$7, this.f$8, false));
                            } else {
                                int currentTime = ConnectionsManager.getInstance(i20).getCurrentTime();
                                if (iIntValue == 1) {
                                    currentTime += 3600;
                                } else if (iIntValue == 2) {
                                    currentTime += 172800;
                                } else {
                                    if (iIntValue == 4) {
                                        i19 = Integer.MAX_VALUE;
                                    }
                                    NotificationsController.getInstance(i20).muteUntil(0L, 0, i19);
                                    NotificationsController.getInstance(i20).setGlobalNotificationsEnabled(i21, Integer.MAX_VALUE);
                                }
                                i19 = currentTime;
                                NotificationsController.getInstance(i20).muteUntil(0L, 0, i19);
                                NotificationsController.getInstance(i20).setGlobalNotificationsEnabled(i21, Integer.MAX_VALUE);
                            }
                            this.f$9.run(iIntValue);
                            this.f$10.alertDialog.dismissRunnable.run();
                            if (iIntValue == 0) {
                                i22 = 4;
                            } else if (iIntValue == 1) {
                                i22 = 0;
                            } else if (iIntValue == 2) {
                                i22 = 2;
                            } else if (iIntValue != 4) {
                                i22 = -1;
                            }
                            if (i22 < 0 || !BulletinFactory.canShowBulletin(notificationsCustomSettingsActivity2)) {
                                return;
                            }
                            BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity2, i22, 0, null).show();
                        }
                    };
                    notificationsCustomSettingsActivity = this;
                    textView2.setOnClickListener(onClickListener);
                }
                i17++;
                zIsGlobalNotificationsEnabled2 = z3;
                i15 = i15;
            }
            String string9 = LocaleController.getString(R.string.Notifications);
            AlertDialog alertDialog2 = builder2.alertDialog;
            alertDialog2.title = string9;
            builder2.setView(linearLayout);
            notificationsCustomSettingsActivity.showDialog(alertDialog2);
            return;
        }
        if (i13 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("type", i9);
                    notificationsCustomSettingsActivity.presentFragment(new NotificationsSoundActivity(bundle2, notificationsCustomSettingsActivity.getResourceProvider()));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (itemInner2.viewType == 3) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity.showDialog(AlertsCreator.createColorSelectDialog(notificationsCustomSettingsActivity.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity.currentType, new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda8(notificationsCustomSettingsActivity, view, i, i8), null));
                return;
            }
            return;
        }
        float f3 = 4.0f;
        if (i13 == 2) {
            if (view.isEnabled()) {
                Activity parentActivity = notificationsCustomSettingsActivity.getParentActivity();
                NotificationsCustomSettingsActivity$$ExternalSyntheticLambda8 notificationsCustomSettingsActivity$$ExternalSyntheticLambda12 = new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda8(notificationsCustomSettingsActivity, view, i, i6);
                Pattern pattern2 = AlertsCreator.URL_PATTERN;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(UserConfig.selectedAccount);
                int[] iArr2 = new int[1];
                if (i9 == 1) {
                    iArr2[0] = notificationsSettings.getInt("popupAll", 0);
                } else if (i9 == 0) {
                    iArr2[0] = notificationsSettings.getInt("popupGroup", 0);
                } else {
                    iArr2[0] = notificationsSettings.getInt("popupChannel", 0);
                }
                String[] strArr2 = {LocaleController.getString(R.string.NoPopup), LocaleController.getString(R.string.OnlyWhenScreenOn), LocaleController.getString(R.string.OnlyWhenScreenOff), LocaleController.getString(R.string.AlwaysShowPopup)};
                LinearLayout linearLayoutM = FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(parentActivity, 1);
                AlertDialog.Builder builder3 = new AlertDialog.Builder(parentActivity, 0, null);
                int i19 = 0;
                while (i19 < 4) {
                    RadioColorCell radioColorCell = new RadioColorCell(parentActivity, null);
                    radioColorCell.setTag(Integer.valueOf(i19));
                    radioColorCell.setPadding(AndroidUtilities.dp(f3), 0, AndroidUtilities.dp(4.0f), 0);
                    radioColorCell.setCheckColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                    radioColorCell.setTextAndValue(strArr2[i19], iArr2[0] == i19);
                    linearLayoutM.addView(radioColorCell);
                    int i20 = i9;
                    radioColorCell.setOnClickListener(new TopicsFragment$$ExternalSyntheticLambda17(iArr2, i20, builder3, notificationsCustomSettingsActivity$$ExternalSyntheticLambda12, 2));
                    i19++;
                    i9 = i20;
                    f3 = 4.0f;
                }
                String string10 = LocaleController.getString(R.string.PopupNotification);
                AlertDialog alertDialog3 = builder3.alertDialog;
                alertDialog3.title = string10;
                builder3.setView(linearLayoutM);
                builder3.setPositiveButton(LocaleController.getString(R.string.Cancel), null);
                notificationsCustomSettingsActivity.showDialog(alertDialog3);
                return;
            }
            return;
        }
        if (i13 == 1) {
            if (view.isEnabled()) {
                if (i9 == 1) {
                    str = "vibrate_messages";
                } else if (i9 == 0) {
                    str = "vibrate_group";
                } else if (i9 == 3) {
                    str = "vibrate_stories";
                } else {
                    str = (i9 == 4 || i9 == 5) ? "vibrate_react" : "vibrate_channel";
                }
                String str2 = str;
                notificationsCustomSettingsActivity.showDialog(AlertsCreator.createVibrationSelectDialog(notificationsCustomSettingsActivity.getParentActivity(), 0L, 0L, str2, new OAuthSheet$$ExternalSyntheticLambda2(notificationsCustomSettingsActivity, view, str2, i, 6), null));
                return;
            }
            return;
        }
        if (i13 == 4) {
            if (view.isEnabled()) {
                notificationsCustomSettingsActivity.showDialog(AlertsCreator.createPrioritySelectDialog(notificationsCustomSettingsActivity.getParentActivity(), 0L, 0, notificationsCustomSettingsActivity.currentType, new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda8(notificationsCustomSettingsActivity, view, i, i7), null));
                return;
            }
            return;
        }
        if (i13 == 102) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings2 = notificationsCustomSettingsActivity.getNotificationsSettings();
                if (notificationsSettings2.getBoolean("EnableAllStories", false)) {
                    return;
                }
                SharedPreferences.Editor editorEdit2 = notificationsSettings2.edit();
                if (notificationsCustomSettingsActivity.storiesEnabled != null) {
                    editorEdit2.remove("EnableAllStories");
                    notificationsCustomSettingsActivity.storiesEnabled = null;
                    notificationsCustomSettingsActivity.storiesAuto = true;
                    itemInner2.checked = true;
                } else {
                    editorEdit2.putBoolean("EnableAllStories", false);
                    notificationsCustomSettingsActivity.storiesEnabled = Boolean.FALSE;
                    notificationsCustomSettingsActivity.storiesAuto = false;
                    itemInner2.checked = false;
                }
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(notificationsCustomSettingsActivity.storiesAuto);
                }
                editorEdit2.commit();
                boolean z18 = notificationsCustomSettingsActivity.storiesAuto;
                boolean z19 = notificationsCustomSettingsActivity.showAutoExceptions;
                if (z18 != z19 && notificationsCustomSettingsActivity.listView != null && notificationsCustomSettingsActivity.adapter != null) {
                    notificationsCustomSettingsActivity.showAutoExceptions = !z19;
                    notificationsCustomSettingsActivity.updateRows(true);
                }
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i9);
                notificationsCustomSettingsActivity.checkRowsEnabled();
                return;
            }
            return;
        }
        if (i13 == 0) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings3 = notificationsCustomSettingsActivity.getNotificationsSettings();
                SharedPreferences.Editor editorEdit3 = notificationsSettings3.edit();
                if (i9 == 1) {
                    z5 = notificationsSettings3.getBoolean("EnablePreviewAll", true);
                    editorEdit3.putBoolean("EnablePreviewAll", !z5);
                } else if (i9 == 0) {
                    z5 = notificationsSettings3.getBoolean("EnablePreviewGroup", true);
                    editorEdit3.putBoolean("EnablePreviewGroup", !z5);
                } else if (i9 == 3) {
                    z5 = !notificationsSettings3.getBoolean("EnableHideStoriesSenders", false);
                    editorEdit3.putBoolean("EnableHideStoriesSenders", z5);
                } else if (i9 == 4 || i9 == 5) {
                    z5 = notificationsSettings3.getBoolean("EnableReactionsPreview", true);
                    editorEdit3.putBoolean("EnableReactionsPreview", !z5);
                } else {
                    z5 = notificationsSettings3.getBoolean("EnablePreviewChannel", true);
                    editorEdit3.putBoolean("EnablePreviewChannel", !z5);
                }
                editorEdit3.commit();
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i9);
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(!z5);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 103 || i13 == 104) {
            boolean z20 = !LocaleController.isRTL ? f <= ((float) (view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) : f >= ((float) AndroidUtilities.dp(76.0f));
            SharedPreferences notificationsSettings4 = notificationsCustomSettingsActivity.getNotificationsSettings();
            if (z20) {
                String str3 = itemInner2.id == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor editorEdit4 = notificationsSettings4.edit();
                editorEdit4.putBoolean(str3, !notificationsSettings4.getBoolean(str3, true));
                editorEdit4.apply();
                notificationsCustomSettingsActivity.updateRows(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i9);
                return;
            }
            String str4 = itemInner2.id == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout linearLayoutM2 = zzkf.m(context, 1);
            boolean[] zArr = {notificationsSettings4.getBoolean(str4, false)};
            RadioColorCell[] radioColorCellArr = new RadioColorCell[2];
            int i21 = 0;
            while (i21 < 2) {
                RadioColorCell radioColorCell2 = new RadioColorCell(context, notificationsCustomSettingsActivity.getResourceProvider());
                radioColorCellArr[i21] = radioColorCell2;
                radioColorCell2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCellArr[i21].setCheckColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                RadioColorCell radioColorCell3 = radioColorCellArr[i21];
                String string11 = LocaleController.getString(i21 == 0 ? R.string.NotifyAboutReactionsFromEveryone : R.string.NotifyAboutReactionsFromContacts);
                if (i21 == 0) {
                    z4 = !zArr[0];
                } else {
                    z4 = zArr[0];
                }
                radioColorCell3.setTextAndValue(string11, z4);
                radioColorCellArr[i21].setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
                linearLayoutM2.addView(radioColorCellArr[i21]);
                radioColorCellArr[i21].setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(zArr, i21, radioColorCellArr, 17));
                i21++;
            }
            AlertDialog.Builder builder4 = new AlertDialog.Builder(notificationsCustomSettingsActivity.getParentActivity(), 0, notificationsCustomSettingsActivity.resourceProvider);
            String string12 = LocaleController.getString(R.string.NotifyAboutReactionsFrom);
            AlertDialog alertDialog4 = builder4.alertDialog;
            alertDialog4.title = string12;
            builder4.setView(linearLayoutM2);
            builder4.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder4.setPositiveButton(LocaleController.getString(R.string.Save), new ArticleViewer$$ExternalSyntheticLambda54((Object) notificationsCustomSettingsActivity, (Object) notificationsSettings4, str4, (Object) zArr, 13));
            notificationsCustomSettingsActivity.showDialog(alertDialog4);
        }
    }

    public final void lambda$createView$4(NotificationsSettingsActivity.NotificationException notificationException, View view) {
        this.actionBar.closeSearchField(true);
        updateMute(notificationException, view, true);
    }

    public final void lambda$createView$5(NotificationsSettingsActivity.NotificationException notificationException, View view) {
        this.actionBar.closeSearchField(true);
        updateMute(notificationException, view, false);
    }

    public final void loadExceptions() {
        ArrayList arrayList;
        if (this.currentType == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new LinkManager$$ExternalSyntheticLambda2(24, this, arrayList));
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        String string;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                string = null;
            } else {
                string = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString("SoundDefault", R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
                ringtone.stop();
            }
            SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
            int i3 = this.currentType;
            if (i3 == 1) {
                if (string == null || uri == null) {
                    editorEdit.putString("GlobalSound", "NoSound");
                    editorEdit.putString("GlobalSoundPath", "NoSound");
                } else {
                    editorEdit.putString("GlobalSound", string);
                    editorEdit.putString("GlobalSoundPath", uri.toString());
                }
            } else if (i3 == 0) {
                if (string == null || uri == null) {
                    editorEdit.putString("GroupSound", "NoSound");
                    editorEdit.putString("GroupSoundPath", "NoSound");
                } else {
                    editorEdit.putString("GroupSound", string);
                    editorEdit.putString("GroupSoundPath", uri.toString());
                }
            } else if (i3 == 2) {
                if (string == null || uri == null) {
                    editorEdit.putString("ChannelSound", "NoSound");
                    editorEdit.putString("ChannelSoundPath", "NoSound");
                } else {
                    editorEdit.putString("ChannelSound", string);
                    editorEdit.putString("ChannelSoundPath", uri.toString());
                }
            } else if (i3 == 3) {
                if (string == null || uri == null) {
                    editorEdit.putString("StoriesSound", "NoSound");
                    editorEdit.putString("StoriesSoundPath", "NoSound");
                } else {
                    editorEdit.putString("StoriesSound", string);
                    editorEdit.putString("StoriesSoundPath", uri.toString());
                }
            }
            getNotificationsController().deleteNotificationChannelGlobal(i3);
            editorEdit.commit();
            getNotificationsController().updateServerNotificationsSettings(i3);
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                this.adapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, i);
            }
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        updateRows(true);
    }

    @Override
    public final boolean onFragmentCreate() {
        if (this.currentType == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.storiesEnabled = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.storiesAuto = false;
                this.showAutoExceptions = false;
            } else {
                this.storiesEnabled = null;
                this.storiesAuto = true;
                this.showAutoExceptions = true;
            }
        }
        updateRows(true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }

    public final void updateMute(NotificationsSettingsActivity.NotificationException notificationException, View view, boolean z) {
        Boolean bool;
        Boolean bool2;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(notificationException.did, 0L);
        SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
        boolean zIsTop5Peer = isTop5Peer(this.currentAccount, notificationException.did);
        notificationException.notify = z ? Integer.MAX_VALUE : 0;
        if (notificationException.auto) {
            notificationException.auto = false;
            editorEdit.putBoolean(zzil.m("stories_", sharedPrefKey), !z).commit();
            ArrayList arrayList = this.autoExceptions;
            if (arrayList != null) {
                arrayList.remove(notificationException);
            }
            if (this.exceptions == null) {
                this.exceptions = new ArrayList();
            }
            this.exceptions.add(0, notificationException);
        } else if (zIsTop5Peer) {
            editorEdit.putBoolean(zzil.m("stories_", sharedPrefKey), !z).commit();
        } else {
            if (!z ? (bool = this.storiesEnabled) == null || !bool.booleanValue() : (bool2 = this.storiesEnabled) != null && bool2.booleanValue()) {
                deleteException(notificationException, view);
                return;
            }
            editorEdit.putBoolean(zzil.m("stories_", sharedPrefKey), !z).commit();
        }
        if (view instanceof UserCell) {
            UserCell userCell = (UserCell) view;
            userCell.setException(notificationException, null, userCell.needDivider);
        }
        getNotificationsController().updateServerNotificationsSettings(notificationException.did, 0L, false);
        updateRows(true);
    }

    public final void updateRows(boolean z) {
        ArrayList arrayList;
        boolean z2;
        String string;
        long j;
        int i;
        Boolean bool;
        ArrayList arrayList2 = this.oldItems;
        arrayList2.clear();
        ArrayList arrayList3 = this.items;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i2 = this.currentType;
        if (i2 != -1) {
            String string2 = LocaleController.getString(R.string.NotifyMeAbout);
            ItemInner itemInner = new ItemInner(0, true);
            itemInner.text = string2;
            arrayList3.add(itemInner);
            if (i2 == 3) {
                arrayList3.size();
                arrayList3.add(ItemInner.asCheck(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    arrayList3.size();
                    arrayList3.add(ItemInner.asCheck(102, LocaleController.getString(R.string.NotifyMeAboutImportantStories), this.storiesAuto && ((bool = this.storiesEnabled) == null || !bool.booleanValue())));
                }
                String string3 = LocaleController.getString(R.string.StoryAutoExceptionsInfo);
                ItemInner itemInner2 = new ItemInner(4, true);
                itemInner2.id = -1;
                itemInner2.text = string3;
                arrayList3.add(itemInner2);
            } else if (i2 == 4 || i2 == 5) {
                arrayList3.size();
                int i3 = R.drawable.msg_markunread;
                String string4 = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                String string5 = LocaleController.getString(notificationsSettings.getBoolean("EnableReactionsMessages", true) ? notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone : R.string.NotifyFromNobody);
                boolean z3 = notificationsSettings.getBoolean("EnableReactionsMessages", true);
                ItemInner itemInner3 = new ItemInner(6, true);
                itemInner3.id = 103;
                itemInner3.resId = i3;
                itemInner3.text = string4;
                itemInner3.text2 = string5;
                itemInner3.checked = z3;
                arrayList3.add(itemInner3);
                arrayList3.size();
                int i4 = R.drawable.msg_stories_saved;
                String string6 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                String string7 = LocaleController.getString(notificationsSettings.getBoolean("EnableReactionsStories", true) ? notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone : R.string.NotifyFromNobody);
                boolean z4 = notificationsSettings.getBoolean("EnableReactionsStories", true);
                ItemInner itemInner4 = new ItemInner(6, true);
                itemInner4.id = 104;
                itemInner4.resId = i4;
                itemInner4.text = string6;
                itemInner4.text2 = string7;
                itemInner4.checked = z4;
                arrayList3.add(itemInner4);
                ItemInner itemInner5 = new ItemInner(4, true);
                itemInner5.id = -1;
                itemInner5.text = null;
                arrayList3.add(itemInner5);
            } else {
                int i5 = i2 == 1 ? R.string.NotifyMeAboutPrivate : i2 == 0 ? R.string.NotifyMeAboutGroups : R.string.NotifyMeAboutChannels;
                arrayList3.size();
                arrayList3.add(ItemInner.asCheck(100, LocaleController.getString(i5), getNotificationsController().isGlobalNotificationsEnabled(i2)));
                ItemInner itemInner6 = new ItemInner(4, true);
                itemInner6.id = -1;
                itemInner6.text = null;
                arrayList3.add(itemInner6);
            }
            String string8 = LocaleController.getString(R.string.SETTINGS);
            ItemInner itemInner7 = new ItemInner(0, true);
            itemInner7.text = string8;
            arrayList3.add(itemInner7);
            arrayList3.size();
            if (i2 == 3) {
                arrayList3.size();
                arrayList3.add(ItemInner.asCheck(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i2 == 4 || i2 == 5) {
                arrayList3.size();
                arrayList3.add(ItemInner.asCheck(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                if (i2 == 0) {
                    z2 = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                } else if (i2 != 1) {
                    z2 = i2 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true);
                } else {
                    z2 = notificationsSettings.getBoolean("EnablePreviewAll", true);
                }
                arrayList3.size();
                arrayList3.add(ItemInner.asCheck(0, LocaleController.getString(R.string.MessagePreview), z2));
            }
            arrayList3.size();
            String string9 = LocaleController.getString("Sound", R.string.Sound);
            SharedPreferences notificationsSettings2 = getNotificationsSettings();
            int i6 = R.string.SoundDefault;
            String string10 = LocaleController.getString("SoundDefault", i6);
            if (i2 == 0) {
                string = notificationsSettings2.getString("GroupSound", string10);
                j = notificationsSettings2.getLong("GroupSoundDocId", 0L);
            } else if (i2 == 1) {
                string = notificationsSettings2.getString("GlobalSound", string10);
                j = notificationsSettings2.getLong("GlobalSoundDocId", 0L);
            } else if (i2 == 3) {
                string = notificationsSettings2.getString("StoriesSound", string10);
                j = notificationsSettings2.getLong("StoriesSoundDocId", 0L);
            } else if (i2 == 4 || i2 == 5) {
                string = notificationsSettings2.getString("ReactionSound", string10);
                j = notificationsSettings2.getLong("ReactionSoundDocId", 0L);
            } else {
                string = notificationsSettings2.getString("ChannelSound", string10);
                j = notificationsSettings2.getLong("ChannelDocId", 0L);
            }
            long j2 = j;
            if (j2 != 0) {
                TLRPC.Document document = getMediaDataController().ringtoneDataStore.getDocument(j2);
                string = document == null ? LocaleController.getString("CustomSound", R.string.CustomSound) : NotificationsSoundActivity.trimTitle(document, FileLoader.getDocumentFileName(document));
            } else if (string.equals("NoSound")) {
                string = LocaleController.getString("NoSound", R.string.NoSound);
            } else if (string.equals("Default")) {
                string = LocaleController.getString("SoundDefault", i6);
            }
            ItemInner itemInner8 = new ItemInner(5, true);
            itemInner8.id = 3;
            itemInner8.text = string9;
            itemInner8.text2 = string;
            arrayList3.add(itemInner8);
            if (this.expanded) {
                arrayList3.size();
                String string11 = LocaleController.getString("LedColor", R.string.LedColor);
                int ledColor = getLedColor();
                ItemInner itemInner9 = new ItemInner(3, true);
                itemInner9.text = string11;
                itemInner9.color = ledColor;
                arrayList3.add(itemInner9);
                if (i2 == 0) {
                    i = notificationsSettings.getInt("vibrate_group", 0);
                } else if (i2 == 1) {
                    i = notificationsSettings.getInt("vibrate_messages", 0);
                } else if (i2 == 2) {
                    i = notificationsSettings.getInt("vibrate_channel", 0);
                } else if (i2 != 3) {
                    i = (i2 == 4 || i2 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0;
                } else {
                    i = notificationsSettings.getInt("vibrate_stories", 0);
                }
                arrayList3.size();
                String string12 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.vibrateLabels;
                String string13 = LocaleController.getString(iArr[Utilities.clamp(i, iArr.length - 1, 0)]);
                ItemInner itemInner10 = new ItemInner(5, true);
                itemInner10.id = 1;
                itemInner10.text = string12;
                itemInner10.text2 = string13;
                arrayList3.add(itemInner10);
                if (i2 == 1 || i2 == 0) {
                    arrayList3.size();
                    String string14 = LocaleController.getString("PopupNotification", R.string.PopupNotification);
                    String popupOption = getPopupOption();
                    ItemInner itemInner11 = new ItemInner(5, true);
                    itemInner11.id = 2;
                    itemInner11.text = string14;
                    itemInner11.text2 = popupOption;
                    arrayList3.add(itemInner11);
                }
                arrayList3.size();
                String string15 = LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance);
                String priorityOption = getPriorityOption();
                ItemInner itemInner12 = new ItemInner(5, true);
                itemInner12.id = 4;
                itemInner12.text = string15;
                itemInner12.text2 = priorityOption;
                arrayList3.add(itemInner12);
                String string16 = LocaleController.getString(R.string.NotifyLessOptions);
                ItemInner itemInner13 = new ItemInner(8, true);
                itemInner13.text = string16;
                itemInner13.resId = 0;
                arrayList3.add(itemInner13);
            } else {
                String string17 = LocaleController.getString(R.string.NotifyMoreOptions);
                ItemInner itemInner14 = new ItemInner(8, true);
                itemInner14.text = string17;
                itemInner14.resId = 1;
                arrayList3.add(itemInner14);
            }
            arrayList3.size();
            ItemInner itemInner15 = new ItemInner(4, true);
            itemInner15.id = -2;
            itemInner15.text = null;
            arrayList3.add(itemInner15);
        }
        if (i2 != 4 && i2 != 5) {
            if (i2 != -1) {
                arrayList3.size();
                int i7 = R.drawable.msg_contact_add;
                String string18 = LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException);
                ItemInner itemInner16 = new ItemInner(7, true);
                itemInner16.id = 6;
                itemInner16.resId = i7;
                itemInner16.text = string18;
                arrayList3.add(itemInner16);
            }
            arrayList3.size();
            if (this.autoExceptions != null && this.showAutoExceptions) {
                for (int i8 = 0; i8 < this.autoExceptions.size(); i8++) {
                    NotificationsSettingsActivity.NotificationException notificationException = (NotificationsSettingsActivity.NotificationException) this.autoExceptions.get(i8);
                    ItemInner itemInner17 = new ItemInner(2, true);
                    itemInner17.exception = notificationException;
                    arrayList3.add(itemInner17);
                }
            }
            if (this.exceptions != null) {
                for (int i9 = 0; i9 < this.exceptions.size(); i9++) {
                    NotificationsSettingsActivity.NotificationException notificationException2 = (NotificationsSettingsActivity.NotificationException) this.exceptions.get(i9);
                    ItemInner itemInner18 = new ItemInner(2, true);
                    itemInner18.exception = notificationException2;
                    arrayList3.add(itemInner18);
                }
            }
            arrayList3.size();
            if (i2 != -1 || ((arrayList = this.exceptions) != null && !arrayList.isEmpty())) {
                ItemInner itemInner19 = new ItemInner(4, true);
                itemInner19.id = -3;
                itemInner19.text = null;
                arrayList3.add(itemInner19);
            }
            ArrayList arrayList4 = this.exceptions;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.size();
                String string19 = LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException);
                ItemInner itemInner20 = new ItemInner(7, true);
                itemInner20.id = 7;
                itemInner20.resId = 0;
                itemInner20.text = string19;
                arrayList3.add(itemInner20);
            }
        }
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            if (z) {
                listAdapter.setItems(arrayList2, arrayList3);
            } else {
                listAdapter.mObservable.notifyChanged();
            }
        }
    }
}
