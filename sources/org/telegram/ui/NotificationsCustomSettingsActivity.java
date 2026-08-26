package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
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
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TranslateButton$$ExternalSyntheticLambda7;

public class NotificationsCustomSettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int BUTTON_ENABLE = 100;
    private static final int BUTTON_IMPORTANT_STORIES = 102;
    private static final int BUTTON_MESSAGES_REACTIONS = 103;
    private static final int BUTTON_NEW_STORIES = 101;
    private static final int BUTTON_STORIES_REACTIONS = 104;
    private static final int VIEW_TYPE_BUTTON = 7;
    private static final int VIEW_TYPE_CHECK = 1;
    private static final int VIEW_TYPE_CHECK2 = 6;
    private static final int VIEW_TYPE_COLOR = 3;
    private static final int VIEW_TYPE_EXPAND = 8;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_SETTING = 5;
    private static final int VIEW_TYPE_SHADOW = 4;
    private static final int VIEW_TYPE_USER = 2;
    private static final int search_button = 0;
    private ListAdapter adapter;
    public int addExceptionRow;
    private AnimatorSet animatorSet;
    private ArrayList<NotificationsSettingsActivity.NotificationException> autoExceptions;
    private int currentType;
    public int deleteExceptionsRow;
    private EmptyTextProgressView emptyView;
    private ArrayList<NotificationsSettingsActivity.NotificationException> exceptions;
    private HashMap<Long, NotificationsSettingsActivity.NotificationException> exceptionsDict;
    private int exceptionsEnd;
    private int exceptionsStart;
    public boolean expanded;
    public int importantRow;
    private final ArrayList<ItemInner> items;
    public int lightColorRow;
    private RecyclerListView listView;
    public int messagesRow;
    public int newRow;
    private final ArrayList<ItemInner> oldItems;
    private final int[] popupOptions;
    public int popupRow;
    public int previewRow;
    private final int[] priorityOptions;
    public int priorityRow;
    private SearchAdapter searchAdapter;
    private boolean searchWas;
    private boolean searching;
    private int settingsEnd;
    private int settingsStart;
    private boolean showAutoExceptions;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    private boolean storiesAuto;
    private Boolean storiesEnabled;
    public int storiesRow;
    int topicId;
    private final int[] vibrateLabels;
    public int vibrateRow;

    public class ExpandView extends TextCell {
        public ImageView imageView;

        public ExpandView(Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(NotificationsCustomSettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), PorterDuff.Mode.SRC_IN));
            this.imageView.setImageResource(R.drawable.msg_expand);
            addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int iDp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i3 - i) - AndroidUtilities.dp(41.0f);
            int iM$2 = OKLCH.m$2(24.0f, i4 - i2, 2);
            this.imageView.layout(iDp, iM$2, AndroidUtilities.dp(24.0f) + iDp, AndroidUtilities.dp(24.0f) + iM$2);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.imageView.measure(i, i2);
        }

        public void set(CharSequence charSequence, boolean z, boolean z2) {
            setArrow(z, true);
            setText(charSequence, z2);
        }

        public void setArrow(boolean z, boolean z2) {
            if (z2) {
                OKLCH.m(this.imageView.animate().rotation(z ? 0.0f : 180.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 340L);
            } else {
                this.imageView.setRotation(z ? 0.0f : 180.0f);
            }
        }
    }

    public static class ItemInner extends AdapterWithDiffUtils.Item {
        public boolean checked;
        public int color;
        public NotificationsSettingsActivity.NotificationException exception;
        public int id;
        public int resId;
        public CharSequence text;
        public CharSequence text2;

        private ItemInner(int i) {
            super(i, true);
        }

        public static ItemInner asButton(int i, int i2, CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(7);
            itemInner.id = i;
            itemInner.resId = i2;
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asCheck(int i, CharSequence charSequence, boolean z) {
            ItemInner itemInner = new ItemInner(1);
            itemInner.id = i;
            itemInner.text = charSequence;
            itemInner.checked = z;
            return itemInner;
        }

        public static ItemInner asCheck2(int i, int i2, CharSequence charSequence, CharSequence charSequence2, boolean z) {
            ItemInner itemInner = new ItemInner(6);
            itemInner.id = i;
            itemInner.resId = i2;
            itemInner.text = charSequence;
            itemInner.text2 = charSequence2;
            itemInner.checked = z;
            return itemInner;
        }

        public static ItemInner asColor(CharSequence charSequence, int i) {
            ItemInner itemInner = new ItemInner(3);
            itemInner.text = charSequence;
            itemInner.color = i;
            return itemInner;
        }

        public static ItemInner asException(NotificationsSettingsActivity.NotificationException notificationException) {
            ItemInner itemInner = new ItemInner(2);
            itemInner.exception = notificationException;
            return itemInner;
        }

        public static ItemInner asExpand(CharSequence charSequence, boolean z) {
            ItemInner itemInner = new ItemInner(8);
            itemInner.text = charSequence;
            itemInner.resId = z ? 1 : 0;
            return itemInner;
        }

        public static ItemInner asHeader(CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(0);
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asSetting(int i, CharSequence charSequence, CharSequence charSequence2) {
            ItemInner itemInner = new ItemInner(5);
            itemInner.id = i;
            itemInner.text = charSequence;
            itemInner.text2 = charSequence2;
            return itemInner;
        }

        public static ItemInner asShadow(int i, CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(4);
            itemInner.id = i;
            itemInner.text = charSequence;
            return itemInner;
        }

        @Override
        public boolean contentsEquals(AdapterWithDiffUtils.Item item) {
            if (this == item) {
                return true;
            }
            if (item != null && getClass() == item.getClass()) {
                ItemInner itemInner = (ItemInner) item;
                if (this.id == itemInner.id && this.resId == itemInner.resId && this.color == itemInner.color && this.checked == itemInner.checked && Objects.equals(this.text, itemInner.text) && Objects.equals(this.text2, itemInner.text2) && this.exception == itemInner.exception) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ItemInner itemInner = (ItemInner) obj;
                if (this.id == itemInner.id && this.color == itemInner.color && ((this.viewType == 8 || (this.resId == itemInner.resId && Objects.equals(this.text, itemInner.text) && (this.viewType == 6 || Objects.equals(this.text2, itemInner.text2)))) && this.exception == itemInner.exception)) {
                    return true;
                }
            }
            return false;
        }
    }

    public class ListAdapter extends AdapterWithDiffUtils {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return NotificationsCustomSettingsActivity.this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            if (i < 0 || i >= NotificationsCustomSettingsActivity.this.items.size()) {
                return 5;
            }
            return ((ItemInner) NotificationsCustomSettingsActivity.this.items.get(i)).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 0 || itemViewType == 4) ? false : true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= NotificationsCustomSettingsActivity.this.items.size()) {
                return;
            }
            ItemInner itemInner = (ItemInner) NotificationsCustomSettingsActivity.this.items.get(i);
            int i2 = i + 1;
            boolean z = i2 < NotificationsCustomSettingsActivity.this.items.size() && ((ItemInner) NotificationsCustomSettingsActivity.this.items.get(i2)).viewType != 4;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    ((HeaderCell) viewHolder.itemView).setText(itemInner.text);
                    break;
                case 1:
                    ((TextCheckCell) viewHolder.itemView).setTextAndCheck("" + ((Object) itemInner.text), itemInner.checked, z);
                    break;
                case 2:
                    ((UserCell) viewHolder.itemView).setException(itemInner.exception, null, z);
                    break;
                case 3:
                    TextColorCell textColorCell = (TextColorCell) viewHolder.itemView;
                    String str = "" + ((Object) itemInner.text);
                    int i3 = itemInner.color;
                    textColorCell.textView.setText(str);
                    textColorCell.needDivider = z;
                    textColorCell.currentColor = i3;
                    textColorCell.setWillNotDraw(!z && i3 == 0);
                    textColorCell.invalidate();
                    break;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (itemInner.text != null) {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(itemInner.text);
                    } else {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText(null);
                    }
                    break;
                case 5:
                    ((TextSettingsCell) viewHolder.itemView).setTextAndValue(itemInner.text, itemInner.text2, false, z);
                    break;
                case 6:
                    NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
                    notificationsCheckCell.setDrawLine(true);
                    notificationsCheckCell.setChecked(itemInner.checked);
                    notificationsCheckCell.setTextAndValueAndIconAndCheck(itemInner.text, itemInner.text2, itemInner.resId, itemInner.checked, 0, false, z, true);
                    break;
                case 7:
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    if (itemInner.resId != 0) {
                        textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        textCell.setTextAndIcon("" + ((Object) itemInner.text), itemInner.resId, z);
                    } else {
                        textCell.setColors(-1, Theme.key_text_RedRegular);
                        textCell.setText("" + ((Object) itemInner.text), z);
                    }
                    break;
                case 8:
                    ExpandView expandView = (ExpandView) viewHolder.itemView;
                    expandView.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    expandView.set(itemInner.text, itemInner.resId == 1, z);
                    break;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            View userCell;
            View textColorCell;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(this.mContext);
                    break;
                case 1:
                    headerCell = new TextCheckCell(this.mContext);
                    break;
                case 2:
                    userCell = new UserCell(6, 0, this.mContext, null, false, false);
                    headerCell = userCell;
                    break;
                case 3:
                    textColorCell = new TextColorCell(this.mContext, null);
                    headerCell = textColorCell;
                    break;
                case 4:
                    textColorCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                    headerCell = textColorCell;
                    break;
                case 5:
                    textColorCell = new TextSettingsCell(this.mContext, null, 0);
                    headerCell = textColorCell;
                    break;
                case 6:
                    userCell = new NotificationsCheckCell(this.mContext, 21, 64, true, ((BaseFragment) NotificationsCustomSettingsActivity.this).resourceProvider);
                    headerCell = userCell;
                    break;
                case 7:
                default:
                    headerCell = new TextCell(this.mContext);
                    break;
                case 8:
                    headerCell = NotificationsCustomSettingsActivity.this.new ExpandView(this.mContext);
                    break;
            }
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            boolean zIsGlobalNotificationsEnabled;
            if (NotificationsCustomSettingsActivity.this.currentType == 3 || (NotificationsCustomSettingsActivity.this.exceptions != null && NotificationsCustomSettingsActivity.this.exceptions.isEmpty())) {
                if (NotificationsCustomSettingsActivity.this.currentType == 3) {
                    zIsGlobalNotificationsEnabled = NotificationsCustomSettingsActivity.this.storiesEnabled == null || NotificationsCustomSettingsActivity.this.storiesEnabled.booleanValue() || !(NotificationsCustomSettingsActivity.this.exceptions == null || NotificationsCustomSettingsActivity.this.exceptions.isEmpty());
                } else {
                    zIsGlobalNotificationsEnabled = NotificationsCustomSettingsActivity.this.getNotificationsController().isGlobalNotificationsEnabled(NotificationsCustomSettingsActivity.this.currentType);
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                ItemInner itemInner = (adapterPosition < 0 || adapterPosition >= NotificationsCustomSettingsActivity.this.items.size()) ? null : (ItemInner) NotificationsCustomSettingsActivity.this.items.get(adapterPosition);
                if (itemInner == null || itemInner.id != 102) {
                    int itemViewType = viewHolder.getItemViewType();
                    if (itemViewType == 0) {
                        ((HeaderCell) viewHolder.itemView).setEnabled(zIsGlobalNotificationsEnabled, (ArrayList<Animator>) null);
                        return;
                    }
                    if (itemViewType == 1) {
                        ((TextCheckCell) viewHolder.itemView).setEnabled(zIsGlobalNotificationsEnabled, null);
                    } else if (itemViewType == 3) {
                        ((TextColorCell) viewHolder.itemView).setEnabled(zIsGlobalNotificationsEnabled, null);
                    } else {
                        if (itemViewType != 5) {
                            return;
                        }
                        ((TextSettingsCell) viewHolder.itemView).setEnabled(zIsGlobalNotificationsEnabled, null);
                    }
                }
            }
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private SearchAdapterHelper searchAdapterHelper;
        private ArrayList<NotificationsSettingsActivity.NotificationException> searchResult = new ArrayList<>();
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private Runnable searchRunnable;

        public SearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new PhotoViewer$55$$ExternalSyntheticLambda2(this, 14));
        }

        public void lambda$new$0(int i) {
            if (this.searchRunnable == null && !this.searchAdapterHelper.isSearchInProgress()) {
                NotificationsCustomSettingsActivity.this.emptyView.showTextView();
            }
            notifyDataSetChanged();
        }

        public void lambda$processSearch$2(String str, ArrayList arrayList) {
            String[] strArr;
            char c;
            int i;
            Object obj;
            String str2;
            String translitString;
            String str3;
            int i2;
            char c2;
            String str4;
            String str5;
            String str6;
            char c3;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
                return;
            }
            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                translitString2 = null;
            }
            char c4 = 1;
            int i3 = (translitString2 != null ? 1 : 0) + 1;
            String[] strArr2 = new String[i3];
            strArr2[0] = lowerCase;
            if (translitString2 != null) {
                strArr2[1] = translitString2;
            }
            ArrayList<Object> arrayList2 = new ArrayList<>();
            ArrayList<NotificationsSettingsActivity.NotificationException> arrayList3 = new ArrayList<>();
            ArrayList<CharSequence> arrayList4 = new ArrayList<>();
            String[] strArr3 = new String[2];
            int i4 = 0;
            while (i4 < arrayList.size()) {
                NotificationsSettingsActivity.NotificationException notificationException = (NotificationsSettingsActivity.NotificationException) arrayList.get(i4);
                if (DialogObject.isEncryptedDialog(notificationException.did)) {
                    strArr = strArr3;
                    TLRPC.EncryptedChat encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(NotificationsCustomSettingsActivity.this.getMessagesController(), notificationException.did);
                    if (encryptedChatM != null) {
                        c = 0;
                        TLRPC.User user = NotificationsCustomSettingsActivity.this.getMessagesController().getUser(Long.valueOf(encryptedChatM.user_id));
                        if (user != null) {
                            strArr[0] = ContactsController.formatName(user.first_name, user.last_name);
                            strArr[c4] = UserObject.getPublicUsername(user);
                        }
                    } else {
                        c = 0;
                    }
                } else {
                    strArr = strArr3;
                    c = 0;
                    if (DialogObject.isUserDialog(notificationException.did)) {
                        TLRPC.User user2 = NotificationsCustomSettingsActivity.this.getMessagesController().getUser(Long.valueOf(notificationException.did));
                        if (user2 != null && !user2.deleted) {
                            strArr[0] = ContactsController.formatName(user2.first_name, user2.last_name);
                            strArr[c4] = UserObject.getPublicUsername(user2);
                            obj = user2;
                            str2 = strArr[c];
                            strArr[c] = str2.toLowerCase();
                            translitString = LocaleController.getInstance().getTranslitString(strArr[c]);
                            str3 = strArr[c];
                            if (str3 != null && str3.equals(translitString)) {
                                translitString = null;
                            }
                            i2 = 0;
                            c2 = 0;
                            while (true) {
                                if (i2 >= i3) {
                                    str4 = strArr2[i2];
                                    str5 = strArr[c];
                                    i = i3;
                                    if (!(str5 == null && (str5.startsWith(str4) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str4, strArr[c]))) && (translitString == null || !(translitString.startsWith(str4) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str4, translitString)))) {
                                        str6 = strArr[1];
                                        if (str6 == null && str6.startsWith(str4)) {
                                            c3 = 2;
                                        } else {
                                            c3 = c2;
                                        }
                                    } else {
                                        c3 = 1;
                                    }
                                    if (c3 != 0) {
                                        if (c3 == 1) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr[1], null, "@" + str4));
                                        }
                                        arrayList3.add(notificationException);
                                        if (obj == null) {
                                            break;
                                        }
                                        arrayList2.add(obj);
                                        break;
                                    }
                                    i2++;
                                    c2 = c3;
                                    i3 = i;
                                }
                            }
                        }
                        i4++;
                        strArr3 = strArr;
                        i3 = i;
                        c4 = 1;
                    } else {
                        TLRPC.Chat chat = NotificationsCustomSettingsActivity.this.getMessagesController().getChat(Long.valueOf(-notificationException.did));
                        if (chat != null) {
                            if (!chat.left && !chat.kicked && chat.migrated_to == null) {
                                strArr[0] = chat.title;
                                strArr[c4] = ChatObject.getPublicUsername(chat);
                                obj = chat;
                            }
                            i4++;
                            strArr3 = strArr;
                            i3 = i;
                            c4 = 1;
                        }
                        str2 = strArr[c];
                        strArr[c] = str2.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr[c]);
                        str3 = strArr[c];
                        if (str3 != null) {
                            translitString = null;
                        }
                        i2 = 0;
                        c2 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                str4 = strArr2[i2];
                                str5 = strArr[c];
                                i = i3;
                                if (str5 == null) {
                                    str6 = strArr[1];
                                    if (str6 == null) {
                                        c3 = c2;
                                    } else {
                                        c3 = c2;
                                    }
                                } else {
                                    str6 = strArr[1];
                                    if (str6 == null) {
                                        c3 = c2;
                                    } else {
                                        c3 = c2;
                                    }
                                }
                                if (c3 != 0) {
                                    if (c3 == 1) {
                                        arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                    } else {
                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr[1], null, "@" + str4));
                                    }
                                    arrayList3.add(notificationException);
                                    if (obj == null) {
                                        break;
                                        break;
                                    } else {
                                        arrayList2.add(obj);
                                        break;
                                        break;
                                    }
                                }
                                i2++;
                                c2 = c3;
                                i3 = i;
                            }
                        }
                        i4++;
                        strArr3 = strArr;
                        i3 = i;
                        c4 = 1;
                    }
                    i = i3;
                    break;
                    i4++;
                    strArr3 = strArr;
                    i3 = i;
                    c4 = 1;
                }
                obj = null;
                str2 = strArr[c];
                strArr[c] = str2.toLowerCase();
                translitString = LocaleController.getInstance().getTranslitString(strArr[c]);
                str3 = strArr[c];
                if (str3 != null) {
                    translitString = null;
                }
                i2 = 0;
                c2 = 0;
                while (true) {
                    if (i2 >= i3) {
                        i = i3;
                        break;
                    }
                    str4 = strArr2[i2];
                    str5 = strArr[c];
                    i = i3;
                    if (str5 == null) {
                        str6 = strArr[1];
                        if (str6 == null) {
                            c3 = c2;
                        } else {
                            c3 = c2;
                        }
                    } else {
                        str6 = strArr[1];
                        if (str6 == null) {
                            c3 = c2;
                        } else {
                            c3 = c2;
                        }
                    }
                    if (c3 != 0) {
                        if (c3 == 1) {
                            arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                        } else {
                            arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr[1], null, "@" + str4));
                        }
                        arrayList3.add(notificationException);
                        if (obj == null) {
                            break;
                            break;
                        } else {
                            arrayList2.add(obj);
                            break;
                            break;
                        }
                    }
                    i2++;
                    c2 = c3;
                    i3 = i;
                }
                i4++;
                strArr3 = strArr;
                i3 = i;
                c4 = 1;
            }
            updateSearchResults(arrayList2, arrayList3, arrayList4);
        }

        public void lambda$processSearch$3(String str) {
            this.searchAdapterHelper.queryServerSearch(str, true, (NotificationsCustomSettingsActivity.this.currentType == 1 || NotificationsCustomSettingsActivity.this.currentType == 3) ? false : true, true, false, false, 0L, false, 0, 0);
            Utilities.searchQueue.postRunnable(new PhotoViewer$86$$ExternalSyntheticLambda0(this, str, new ArrayList(NotificationsCustomSettingsActivity.this.exceptions), 14));
        }

        public void lambda$updateSearchResults$4(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            if (NotificationsCustomSettingsActivity.this.searching) {
                this.searchRunnable = null;
                this.searchResult = arrayList;
                this.searchResultNames = arrayList2;
                this.searchAdapterHelper.mergeResults(arrayList3);
                if (NotificationsCustomSettingsActivity.this.searching && !this.searchAdapterHelper.isSearchInProgress()) {
                    NotificationsCustomSettingsActivity.this.emptyView.showTextView();
                }
                notifyDataSetChanged();
            }
        }

        public void lambda$searchDialogs$1(String str) {
            AndroidUtilities.runOnUIThread(new NotificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda1(this, str, 1));
        }

        private void updateSearchResults(ArrayList<Object> arrayList, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2, ArrayList<CharSequence> arrayList3) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(7, this, arrayList2, arrayList3, arrayList));
        }

        @Override
        public int getItemCount() {
            int size = this.searchResult.size();
            ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
            return !globalSearch.isEmpty() ? globalSearch.size() + 1 + size : size;
        }

        @Override
        public int getItemViewType(int i) {
            return i == this.searchResult.size() ? 1 : 0;
        }

        public Object getObject(int i) {
            if (i >= 0 && i < this.searchResult.size()) {
                return this.searchResult.get(i);
            }
            int size = i - (this.searchResult.size() + 1);
            ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
            if (size < 0 || size >= globalSearch.size()) {
                return null;
            }
            return this.searchAdapterHelper.getGlobalSearch().get(size);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    return;
                }
                ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
                return;
            }
            UserCell userCell = (UserCell) viewHolder.itemView;
            if (i < this.searchResult.size()) {
                userCell.setException(this.searchResult.get(i), this.searchResultNames.get(i), i != this.searchResult.size() - 1);
                userCell.setAddButtonVisible(false);
            } else {
                int size = i - (this.searchResult.size() + 1);
                ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
                userCell.setData(globalSearch.get(size), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), 0, size != globalSearch.size() - 1);
                userCell.setAddButtonVisible(true);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
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

        public void searchDialogs(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            if (str != null) {
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                NotificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda1 notificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda1 = new NotificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda1(this, str, 0);
                this.searchRunnable = notificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda1;
                dispatchQueue.postRunnable(notificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda1, 300L);
                return;
            }
            this.searchResult.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, true, (NotificationsCustomSettingsActivity.this.currentType == 1 || NotificationsCustomSettingsActivity.this.currentType == 3) ? false : true, true, false, false, 0L, false, 0, 0);
            notifyDataSetChanged();
        }
    }

    public NotificationsCustomSettingsActivity(int i, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2) {
        this(i, arrayList, arrayList2, false);
    }

    public static boolean areStoriesNotMuted(int i, long j) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i);
        if (notificationsSettings.contains("stories_" + j)) {
            return NotificationsController$$ExternalSyntheticOutline0.m("stories_", j, notificationsSettings, true);
        }
        return notificationsSettings.contains("EnableAllStories") ? notificationsSettings.getBoolean("EnableAllStories", true) : isTop5Peer(i, j);
    }

    public void checkRowsEnabled() {
        boolean zIsGlobalNotificationsEnabled;
        int i;
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList;
        if (this.exceptions.isEmpty() || this.currentType == 3) {
            int childCount = this.listView.getChildCount();
            ArrayList<Animator> arrayList2 = new ArrayList<>();
            if (this.currentType == 3) {
                Boolean bool = this.storiesEnabled;
                zIsGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = this.exceptions) == null || arrayList.isEmpty());
            } else {
                zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(this.currentType);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.listView.getChildAt(i2);
                RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.getChildViewHolder(childAt);
                int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
                ItemInner itemInner = (childAdapterPosition < 0 || childAdapterPosition >= this.items.size()) ? null : this.items.get(childAdapterPosition);
                boolean z = (itemInner == null || !((i = itemInner.id) == 102 || i == 101 || i == 100)) ? zIsGlobalNotificationsEnabled : true;
                int itemViewType = holder.getItemViewType();
                if (itemViewType == 0) {
                    ((HeaderCell) holder.itemView).setEnabled(z, arrayList2);
                } else if (itemViewType == 1) {
                    ((TextCheckCell) holder.itemView).setEnabled(z, arrayList2);
                } else if (itemViewType == 3) {
                    ((TextColorCell) holder.itemView).setEnabled(z, arrayList2);
                } else if (itemViewType == 5) {
                    ((TextSettingsCell) holder.itemView).setEnabled(z, arrayList2);
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
            this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(NotificationsCustomSettingsActivity.this.animatorSet)) {
                        NotificationsCustomSettingsActivity.this.animatorSet = null;
                    }
                }
            });
            this.animatorSet.setDuration(150L);
            this.animatorSet.start();
        }
    }

    public void lambda$createView$6(NotificationsSettingsActivity.NotificationException notificationException, View view, int i) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(notificationException.did, 0L);
        getNotificationsSettings().edit().remove("stories_" + sharedPrefKey).commit();
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList = this.autoExceptions;
        if (arrayList != null) {
            arrayList.remove(notificationException);
        }
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2 = this.exceptions;
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

    private int getLedColor() {
        int i = this.currentType;
        int i2 = -16776961;
        if (i == 0) {
            i2 = getNotificationsSettings().getInt("GroupLed", -16776961);
        } else if (i == 1) {
            i2 = getNotificationsSettings().getInt("MessagesLed", -16776961);
        } else if (i == 2) {
            i2 = getNotificationsSettings().getInt("ChannelLed", -16776961);
        } else if (i == 3) {
            i2 = getNotificationsSettings().getInt("StoriesLed", -16776961);
        } else if (i == 4 || i == 5) {
            i2 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
        }
        for (int i3 = 0; i3 < 9; i3++) {
            if (TextColorCell.colorsToSave[i3] == i2) {
                return TextColorCell.colors[i3];
            }
        }
        return i2;
    }

    private String getPopupOption() {
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

    private String getPriorityOption() {
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

    private String getSound() {
        String string;
        long j;
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i = R.string.SoundDefault;
        String string2 = LocaleController.getString("SoundDefault", i);
        int i2 = this.currentType;
        if (i2 == 0) {
            string = notificationsSettings.getString("GroupSound", string2);
            j = notificationsSettings.getLong("GroupSoundDocId", 0L);
        } else if (i2 == 1) {
            string = notificationsSettings.getString("GlobalSound", string2);
            j = notificationsSettings.getLong("GlobalSoundDocId", 0L);
        } else if (i2 == 3) {
            string = notificationsSettings.getString("StoriesSound", string2);
            j = notificationsSettings.getLong("StoriesSoundDocId", 0L);
        } else if (i2 == 4 || i2 == 5) {
            string = notificationsSettings.getString("ReactionSound", string2);
            j = notificationsSettings.getLong("ReactionSoundDocId", 0L);
        } else {
            string = notificationsSettings.getString("ChannelSound", string2);
            j = notificationsSettings.getLong("ChannelDocId", 0L);
        }
        if (j != 0) {
            TLRPC.Document document = getMediaDataController().ringtoneDataStore.getDocument(j);
            return document == null ? LocaleController.getString("CustomSound", R.string.CustomSound) : NotificationsSoundActivity.trimTitle(document, FileLoader.getDocumentFileName(document));
        }
        if (string.equals("NoSound")) {
            return LocaleController.getString("NoSound", R.string.NoSound);
        }
        return string.equals("Default") ? LocaleController.getString("SoundDefault", i) : string;
    }

    private static boolean isTop5Peer(int i, long j) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new NotificationsSettingsActivity$$ExternalSyntheticLambda1(1)));
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i3)).peer) == j) {
                i2 = i3;
            }
        }
        return i2 >= 0 && i2 >= arrayList.size() + (-5);
    }

    public void lambda$createView$1(NotificationsSettingsActivity.NotificationException notificationException, View view, int i) {
        updateMute(notificationException, view, i, false, true);
    }

    public void lambda$createView$10(int i) {
        updateRows(true);
    }

    public void lambda$createView$11(View view, int i) {
        if (!(view instanceof TextColorCell)) {
            updateRows(true);
            return;
        }
        if (i >= 0 && i < this.items.size()) {
            this.items.get(i).color = getLedColor();
        }
        TextColorCell textColorCell = (TextColorCell) view;
        String string = LocaleController.getString("LedColor", R.string.LedColor);
        int ledColor = getLedColor();
        textColorCell.textView.setText(string);
        textColorCell.needDivider = true;
        textColorCell.currentColor = ledColor;
        textColorCell.setWillNotDraw(false);
        textColorCell.invalidate();
    }

    public void lambda$createView$12(View view, int i) {
        if (!(view instanceof TextSettingsCell)) {
            updateRows(true);
            return;
        }
        if (i >= 0 && i < this.items.size()) {
            this.items.get(i).text2 = getPopupOption();
        }
        TextSettingsCell textSettingsCell = (TextSettingsCell) view;
        textSettingsCell.setTextAndValue(LocaleController.getString("PopupNotification", R.string.PopupNotification), getPopupOption(), true, textSettingsCell.needDivider);
    }

    public void lambda$createView$13(View view, String str, int i) {
        if (!(view instanceof TextSettingsCell)) {
            updateRows(true);
            return;
        }
        String string = LocaleController.getString(this.vibrateLabels[Utilities.clamp(getNotificationsSettings().getInt(str, 0), this.vibrateLabels.length - 1, 0)]);
        if (i >= 0 && i < this.items.size()) {
            this.items.get(i).text2 = string;
        }
        ((TextSettingsCell) view).setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
    }

    public void lambda$createView$14(View view, int i) {
        if (!(view instanceof TextSettingsCell)) {
            updateRows(true);
            return;
        }
        if (i >= 0 && i < this.items.size()) {
            this.items.get(i).text2 = getPriorityOption();
        }
        TextSettingsCell textSettingsCell = (TextSettingsCell) view;
        textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), getPriorityOption(), true, textSettingsCell.needDivider);
    }

    public static void lambda$createView$15(boolean[] zArr, int i, RadioColorCell[] radioColorCellArr, View view) {
        zArr[0] = i == 1;
        int i2 = 0;
        while (i2 < radioColorCellArr.length) {
            radioColorCellArr[i2].radioButton.setChecked(zArr[0] == (i2 == 1), true);
            i2++;
        }
    }

    public void lambda$createView$16(SharedPreferences sharedPreferences, String str, boolean[] zArr, AlertDialog alertDialog, int i) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(str, zArr[0]);
        editorEdit.apply();
        updateRows(true);
        getNotificationsController().updateServerNotificationsSettings(this.currentType);
    }

    public void lambda$createView$17(android.content.Context r27, final android.view.View r28, final int r29, float r30, float r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.lambda$createView$17(android.content.Context, android.view.View, int, float, float):void");
    }

    public void lambda$createView$2(NotificationsSettingsActivity.NotificationException notificationException, View view, int i) {
        updateMute(notificationException, view, i, false, false);
    }

    public void lambda$createView$4(NotificationsSettingsActivity.NotificationException notificationException, View view, boolean z) {
        this.actionBar.closeSearchField();
        updateMute(notificationException, view, -1, z, true);
    }

    public void lambda$createView$5(NotificationsSettingsActivity.NotificationException notificationException, View view, boolean z) {
        this.actionBar.closeSearchField();
        updateMute(notificationException, view, -1, z, false);
    }

    public void lambda$createView$7(NotificationsSettingsActivity.NotificationException notificationException) {
        this.exceptions.add(0, notificationException);
        updateRows(true);
    }

    public boolean lambda$createView$8(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        int i3 = 0;
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (this.currentType != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j);
            bundle.putBoolean("exception", true);
            ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle, getResourceProvider());
            profileNotificationsActivity.setDelegate(new NotificationsCustomSettingsActivity$$ExternalSyntheticLambda6(this));
            presentFragment(profileNotificationsActivity, true);
            return true;
        }
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2 = this.autoExceptions;
        if (arrayList2 != null) {
            Iterator<NotificationsSettingsActivity.NotificationException> it = arrayList2.iterator();
            while (it.hasNext()) {
                if (it.next().did == j) {
                    it.remove();
                }
            }
        }
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList3 = this.exceptions;
        if (arrayList3 != null) {
            Iterator<NotificationsSettingsActivity.NotificationException> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (it2.next().did == j) {
                    it2.remove();
                }
            }
        }
        NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
        notificationException.did = j;
        notificationException.story = true;
        Boolean bool = this.storiesEnabled;
        if (bool != null && bool.booleanValue()) {
            i3 = Integer.MAX_VALUE;
        }
        notificationException.notify = i3;
        if (this.exceptions == null) {
            this.exceptions = new ArrayList<>();
        }
        this.exceptions.add(notificationException);
        updateRows(true);
        return true;
    }

    public void lambda$createView$9(AlertDialog alertDialog, int i) {
        SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
        int size = this.exceptions.size();
        for (int i2 = 0; i2 < size; i2++) {
            NotificationsSettingsActivity.NotificationException notificationException = this.exceptions.get(i2);
            if (this.currentType == 3) {
                editorEdit.remove("stories_" + notificationException.did);
            } else {
                editorEdit.remove("notify2_" + notificationException.did).remove("custom_" + notificationException.did);
            }
            getMessagesStorage().setDialogFlags(notificationException.did, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(notificationException.did);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        editorEdit.commit();
        int size2 = this.exceptions.size();
        for (int i3 = 0; i3 < size2; i3++) {
            getNotificationsController().updateServerNotificationsSettings(this.exceptions.get(i3).did, this.topicId, false);
        }
        this.exceptions.clear();
        this.exceptionsDict.clear();
        updateRows(true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    public void lambda$getThemeDescriptions$21() {
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

    public void lambda$loadExceptions$19(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        getMessagesController().putEncryptedChats(arrayList3, true);
        int i = this.currentType;
        if (i == 1) {
            this.exceptions = arrayList4;
        } else if (i == 0) {
            this.exceptions = arrayList5;
        } else if (i == 3) {
            this.exceptions = arrayList6;
            this.autoExceptions = arrayList7;
        } else {
            this.exceptions = arrayList8;
        }
        updateRows(true);
    }

    public void lambda$loadExceptions$20(ArrayList arrayList) {
        boolean z;
        ArrayList<TLRPC.Chat> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        ArrayList<TLRPC.EncryptedChat> arrayList4;
        int size;
        int i;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        TLRPC.User user;
        TLRPC.Chat chat;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList12 = new ArrayList<>();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList<TLRPC.User> arrayList15 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList16 = new ArrayList<>();
        ArrayList<TLRPC.EncryptedChat> arrayList17 = new ArrayList<>();
        long j = getUserConfig().clientUserId;
        SharedPreferences notificationsSettings = getNotificationsSettings();
        Map<String, ?> all = notificationsSettings.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            it = it;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            arrayList16 = arrayList16;
            if (key.startsWith("notify2_")) {
                ArrayList<TLRPC.User> arrayList18 = arrayList15;
                String strReplace = key.replace("notify2_", "");
                Long l = Utilities.parseLong(strReplace);
                ArrayList arrayList19 = arrayList9;
                ArrayList arrayList20 = arrayList10;
                long jLongValue = l.longValue();
                if (jLongValue == 0 || jLongValue == j) {
                    arrayList9 = arrayList19;
                    arrayList15 = arrayList18;
                    arrayList10 = arrayList20;
                } else {
                    NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
                    notificationException.did = jLongValue;
                    ArrayList<TLRPC.EncryptedChat> arrayList21 = arrayList17;
                    ArrayList arrayList22 = arrayList8;
                    notificationException.hasCustom = NotificationsController$$ExternalSyntheticOutline0.m("custom_", jLongValue, notificationsSettings, false);
                    int iIntValue = ((Integer) next.getValue()).intValue();
                    notificationException.notify = iIntValue;
                    if (iIntValue != 0) {
                        Integer num = (Integer) all.get("notifyuntil_" + strReplace);
                        if (num != null) {
                            notificationException.muteUntil = num.intValue();
                        }
                    }
                    if (DialogObject.isEncryptedDialog(jLongValue)) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                        TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                        if (encryptedChat == null) {
                            arrayList14.add(Integer.valueOf(encryptedChatId));
                            longSparseArray.put(jLongValue, notificationException);
                        } else {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                            if (user2 == null) {
                                arrayList12.add(Long.valueOf(encryptedChat.user_id));
                                longSparseArray.put(encryptedChat.user_id, notificationException);
                            } else if (!user2.deleted) {
                            }
                        }
                        arrayList7.add(notificationException);
                    } else if (DialogObject.isUserDialog(jLongValue)) {
                        TLRPC.User user3 = getMessagesController().getUser(l);
                        if (user3 == null) {
                            arrayList12.add(l);
                            longSparseArray.put(jLongValue, notificationException);
                        } else if (!user3.deleted) {
                        }
                        arrayList7.add(notificationException);
                    } else {
                        long j2 = -jLongValue;
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j2));
                        if (chat2 == null) {
                            arrayList13.add(Long.valueOf(j2));
                            longSparseArray.put(jLongValue, notificationException);
                        } else if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                            if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                                arrayList8 = arrayList22;
                                arrayList8.add(notificationException);
                                arrayList15 = arrayList18;
                                arrayList10 = arrayList20;
                                arrayList9 = arrayList19;
                                arrayList17 = arrayList21;
                            } else {
                                arrayList11.add(notificationException);
                            }
                        }
                    }
                    arrayList15 = arrayList18;
                    arrayList10 = arrayList20;
                    arrayList9 = arrayList19;
                    arrayList17 = arrayList21;
                    arrayList8 = arrayList22;
                }
            }
        }
        ArrayList arrayList23 = arrayList9;
        ArrayList arrayList24 = arrayList10;
        ArrayList<TLRPC.User> arrayList25 = arrayList15;
        ArrayList<TLRPC.Chat> arrayList26 = arrayList16;
        ArrayList<TLRPC.EncryptedChat> arrayList27 = arrayList17;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next2 = it2.next();
            String key2 = next2.getKey();
            if (key2.startsWith("stories_")) {
                try {
                    Long l2 = Utilities.parseLong(key2.substring(8));
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 != 0 && jLongValue2 != j) {
                        NotificationsSettingsActivity.NotificationException notificationException2 = new NotificationsSettingsActivity.NotificationException();
                        notificationException2.did = jLongValue2;
                        notificationException2.story = true;
                        notificationException2.notify = ((Boolean) next2.getValue()).booleanValue() ? 0 : Integer.MAX_VALUE;
                        if (DialogObject.isUserDialog(jLongValue2)) {
                            TLRPC.User user4 = getMessagesController().getUser(l2);
                            if (user4 == null) {
                                try {
                                    arrayList12.add(l2);
                                    longSparseArray.put(jLongValue2, notificationException2);
                                } catch (Exception unused) {
                                    arrayList6 = arrayList23;
                                }
                            } else if (user4.deleted) {
                            }
                            arrayList6 = arrayList23;
                            try {
                                arrayList6.add(notificationException2);
                                hashSet.add(l2);
                            } catch (Exception unused2) {
                            }
                            arrayList23 = arrayList6;
                        }
                    }
                } catch (Exception unused3) {
                    arrayList6 = arrayList23;
                }
            }
        }
        ArrayList arrayList28 = arrayList23;
        if (arrayList != null) {
            Collections.sort(arrayList, Comparator$CC.comparingDouble(new NotificationsSettingsActivity$$ExternalSyntheticLambda1(2)));
            int iMax = Math.max(0, arrayList.size() - 6);
            while (iMax < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(iMax)).peer);
                if (hashSet.contains(Long.valueOf(peerDialogId))) {
                    arrayList5 = arrayList24;
                } else {
                    NotificationsSettingsActivity.NotificationException notificationException3 = new NotificationsSettingsActivity.NotificationException();
                    notificationException3.did = peerDialogId;
                    notificationException3.story = z;
                    notificationException3.notify = 0;
                    notificationException3.auto = z;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(peerDialogId));
                        if (user5 == null) {
                            arrayList12.add(Long.valueOf(peerDialogId));
                            longSparseArray.put(peerDialogId, notificationException3);
                        } else if (user5.deleted) {
                            arrayList5 = arrayList24;
                        }
                        arrayList5 = arrayList24;
                        arrayList5.add(0, notificationException3);
                        hashSet.add(Long.valueOf(peerDialogId));
                    } else {
                        arrayList5 = arrayList24;
                    }
                }
                arrayList24 = arrayList5;
                iMax++;
                z = true;
            }
        }
        ArrayList arrayList29 = arrayList24;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList14.isEmpty()) {
                    arrayList4 = arrayList27;
                } else {
                    try {
                        arrayList4 = arrayList27;
                        try {
                            getMessagesStorage().getEncryptedChatsInternal(TextUtils.join(",", arrayList14), arrayList4, arrayList12);
                        } catch (Exception e) {
                            e = e;
                            arrayList2 = arrayList26;
                            arrayList3 = arrayList25;
                            FileLog.e(e);
                            size = arrayList2.size();
                            for (i = 0; i < size; i++) {
                                chat = arrayList2.get(i);
                                if (chat.left) {
                                }
                            }
                            size2 = arrayList3.size();
                            for (i2 = 0; i2 < size2; i2++) {
                                user = arrayList3.get(i2);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.id);
                                }
                            }
                            size3 = arrayList4.size();
                            for (i3 = 0; i3 < size3; i3++) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                            }
                            size4 = longSparseArray.size();
                            for (int i4 = 0; i4 < size4; i4++) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                    arrayList8.remove(longSparseArray.valueAt(i4));
                                    arrayList11.remove(longSparseArray.valueAt(i4));
                                } else {
                                    arrayList7.remove(longSparseArray.valueAt(i4));
                                }
                            }
                            AndroidUtilities.runOnUIThread(new TranslateButton$$ExternalSyntheticLambda7(this, arrayList3, arrayList2, arrayList4, arrayList7, arrayList8, arrayList28, arrayList29, arrayList11));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList4 = arrayList27;
                        arrayList2 = arrayList26;
                        arrayList3 = arrayList25;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i < size) {
                            chat = arrayList2.get(i);
                            if (chat.left) {
                            }
                        }
                        size2 = arrayList3.size();
                        while (i2 < size2) {
                            user = arrayList3.get(i2);
                            if (!user.deleted) {
                                longSparseArray.remove(user.id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i3 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                arrayList8.remove(longSparseArray.valueAt(i4));
                                arrayList11.remove(longSparseArray.valueAt(i4));
                            } else {
                                arrayList7.remove(longSparseArray.valueAt(i4));
                            }
                        }
                        AndroidUtilities.runOnUIThread(new TranslateButton$$ExternalSyntheticLambda7(this, arrayList3, arrayList2, arrayList4, arrayList7, arrayList8, arrayList28, arrayList29, arrayList11));
                    }
                }
                if (arrayList12.isEmpty()) {
                    arrayList3 = arrayList25;
                } else {
                    try {
                        arrayList3 = arrayList25;
                        try {
                            getMessagesStorage().getUsersInternal(arrayList12, arrayList3);
                        } catch (Exception e3) {
                            e = e3;
                            arrayList2 = arrayList26;
                            FileLog.e(e);
                            size = arrayList2.size();
                            while (i < size) {
                                chat = arrayList2.get(i);
                                if (chat.left) {
                                }
                            }
                            size2 = arrayList3.size();
                            while (i2 < size2) {
                                user = arrayList3.get(i2);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.id);
                                }
                            }
                            size3 = arrayList4.size();
                            while (i3 < size3) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                            }
                            size4 = longSparseArray.size();
                            while (i4 < size4) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                    arrayList8.remove(longSparseArray.valueAt(i4));
                                    arrayList11.remove(longSparseArray.valueAt(i4));
                                } else {
                                    arrayList7.remove(longSparseArray.valueAt(i4));
                                }
                            }
                            AndroidUtilities.runOnUIThread(new TranslateButton$$ExternalSyntheticLambda7(this, arrayList3, arrayList2, arrayList4, arrayList7, arrayList8, arrayList28, arrayList29, arrayList11));
                        }
                    } catch (Exception e4) {
                        e = e4;
                        arrayList3 = arrayList25;
                        arrayList2 = arrayList26;
                        FileLog.e(e);
                        size = arrayList2.size();
                        while (i < size) {
                            chat = arrayList2.get(i);
                            if (chat.left) {
                            }
                        }
                        size2 = arrayList3.size();
                        while (i2 < size2) {
                            user = arrayList3.get(i2);
                            if (!user.deleted) {
                                longSparseArray.remove(user.id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i3 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                arrayList8.remove(longSparseArray.valueAt(i4));
                                arrayList11.remove(longSparseArray.valueAt(i4));
                            } else {
                                arrayList7.remove(longSparseArray.valueAt(i4));
                            }
                        }
                        AndroidUtilities.runOnUIThread(new TranslateButton$$ExternalSyntheticLambda7(this, arrayList3, arrayList2, arrayList4, arrayList7, arrayList8, arrayList28, arrayList29, arrayList11));
                    }
                }
                if (arrayList13.isEmpty()) {
                    arrayList2 = arrayList26;
                } else {
                    MessagesStorage messagesStorage = getMessagesStorage();
                    String strJoin = TextUtils.join(",", arrayList13);
                    arrayList2 = arrayList26;
                    try {
                        messagesStorage.getChatsInternal(strJoin, arrayList2);
                    } catch (Exception e5) {
                        e = e5;
                        FileLog.e(e);
                    }
                }
            } catch (Exception e6) {
                e = e6;
                arrayList2 = arrayList26;
                arrayList3 = arrayList25;
                arrayList4 = arrayList27;
            }
            size = arrayList2.size();
            while (i < size) {
                chat = arrayList2.get(i);
                if (chat.left && !chat.kicked && chat.migrated_to == null) {
                    NotificationsSettingsActivity.NotificationException notificationException4 = (NotificationsSettingsActivity.NotificationException) longSparseArray.get(-chat.id);
                    longSparseArray.remove(-chat.id);
                    if (notificationException4 != null) {
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            arrayList8.add(notificationException4);
                        } else {
                            arrayList11.add(notificationException4);
                        }
                    }
                }
            }
            size2 = arrayList3.size();
            while (i2 < size2) {
                user = arrayList3.get(i2);
                if (!user.deleted) {
                    longSparseArray.remove(user.id);
                }
            }
            size3 = arrayList4.size();
            while (i3 < size3) {
                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
            }
            size4 = longSparseArray.size();
            while (i4 < size4) {
                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                    arrayList8.remove(longSparseArray.valueAt(i4));
                    arrayList11.remove(longSparseArray.valueAt(i4));
                } else {
                    arrayList7.remove(longSparseArray.valueAt(i4));
                }
            }
        } else {
            arrayList2 = arrayList26;
            arrayList3 = arrayList25;
            arrayList4 = arrayList27;
        }
        AndroidUtilities.runOnUIThread(new TranslateButton$$ExternalSyntheticLambda7(this, arrayList3, arrayList2, arrayList4, arrayList7, arrayList8, arrayList28, arrayList29, arrayList11));
    }

    private void loadExceptions() {
        ArrayList arrayList;
        if (this.currentType == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new PhotoViewer$$ExternalSyntheticLambda15(18, this, arrayList));
    }

    private void updateMute(NotificationsSettingsActivity.NotificationException notificationException, View view, int i, boolean z, boolean z2) {
        Boolean bool;
        Boolean bool2;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(notificationException.did, 0L);
        SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
        boolean zIsTop5Peer = isTop5Peer(this.currentAccount, notificationException.did);
        notificationException.notify = z2 ? Integer.MAX_VALUE : 0;
        if (notificationException.auto) {
            notificationException.auto = false;
            editorEdit.putBoolean(zzii.m("stories_", sharedPrefKey), !z2).commit();
            ArrayList<NotificationsSettingsActivity.NotificationException> arrayList = this.autoExceptions;
            if (arrayList != null) {
                arrayList.remove(notificationException);
            }
            if (this.exceptions == null) {
                this.exceptions = new ArrayList<>();
            }
            this.exceptions.add(0, notificationException);
        } else if (zIsTop5Peer) {
            editorEdit.putBoolean(zzii.m("stories_", sharedPrefKey), !z2).commit();
        } else {
            if (!z2 ? (bool = this.storiesEnabled) == null || !bool.booleanValue() : (bool2 = this.storiesEnabled) != null && bool2.booleanValue()) {
                lambda$createView$6(notificationException, view, i);
                return;
            }
            editorEdit.putBoolean(zzii.m("stories_", sharedPrefKey), !z2).commit();
        }
        if (view instanceof UserCell) {
            UserCell userCell = (UserCell) view;
            userCell.setException(notificationException, null, userCell.needDivider);
        }
        getNotificationsController().updateServerNotificationsSettings(notificationException.did, 0L, false);
        updateRows(true);
    }

    @Override
    public View createView(Context context) {
        this.searching = false;
        this.searchWas = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.currentType == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    NotificationsCustomSettingsActivity.this.finishFragment();
                }
            }
        });
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList = this.exceptions;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public void onSearchCollapse() {
                    NotificationsCustomSettingsActivity.this.searchAdapter.searchDialogs(null);
                    NotificationsCustomSettingsActivity.this.searching = false;
                    NotificationsCustomSettingsActivity.this.searchWas = false;
                    NotificationsCustomSettingsActivity.this.emptyView.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
                    NotificationsCustomSettingsActivity.this.listView.setAdapter(NotificationsCustomSettingsActivity.this.adapter);
                    NotificationsCustomSettingsActivity.this.adapter.notifyDataSetChanged();
                    NotificationsCustomSettingsActivity.this.listView.setFastScrollVisible(true);
                    NotificationsCustomSettingsActivity.this.listView.setVerticalScrollBarEnabled(false);
                    NotificationsCustomSettingsActivity.this.emptyView.setShowAtCenter(false);
                }

                @Override
                public void onSearchExpand() {
                    NotificationsCustomSettingsActivity.this.searching = true;
                    NotificationsCustomSettingsActivity.this.emptyView.setShowAtCenter(true);
                }

                @Override
                public void onTextChanged(EditText editText) {
                    if (NotificationsCustomSettingsActivity.this.searchAdapter == null) {
                        return;
                    }
                    String string = editText.getText().toString();
                    if (string.length() != 0) {
                        NotificationsCustomSettingsActivity.this.searchWas = true;
                        if (NotificationsCustomSettingsActivity.this.listView != null) {
                            NotificationsCustomSettingsActivity.this.emptyView.setText(LocaleController.getString("NoResult", R.string.NoResult));
                            NotificationsCustomSettingsActivity.this.emptyView.showProgress();
                            NotificationsCustomSettingsActivity.this.listView.setAdapter(NotificationsCustomSettingsActivity.this.searchAdapter);
                            NotificationsCustomSettingsActivity.this.searchAdapter.notifyDataSetChanged();
                            NotificationsCustomSettingsActivity.this.listView.setFastScrollVisible(false);
                            NotificationsCustomSettingsActivity.this.listView.setVerticalScrollBarEnabled(true);
                        }
                    }
                    NotificationsCustomSettingsActivity.this.searchAdapter.searchDialogs(string);
                }
            }).setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setTextSize(18);
        this.emptyView.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.emptyView.showTextView();
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setEmptyView(this.emptyView);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.listView, false);
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new TodoItemMenu$$ExternalSyntheticLambda7(2, this, context));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                NotificationsCustomSettingsActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setAddDuration(150L);
        defaultItemAnimator.setMoveDuration(350L);
        defaultItemAnimator.setChangeDuration(0L);
        defaultItemAnimator.setRemoveDuration(0L);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setMoveInterpolator(new OvershootInterpolator(1.1f));
        defaultItemAnimator.setTranslationInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    AndroidUtilities.hideKeyboard(NotificationsCustomSettingsActivity.this.getParentActivity().getCurrentFocus());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        });
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.notificationsSettingsUpdated) {
            if (i == NotificationCenter.reloadHints) {
                loadExceptions();
            }
        } else {
            ListAdapter listAdapter = this.adapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 26);
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
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
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
            getNotificationsController().deleteNotificationChannelGlobal(this.currentType);
            editorEdit.commit();
            getNotificationsController().updateServerNotificationsSettings(this.currentType);
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                this.adapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, i);
            }
        }
    }

    @Override
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        updateRows(true);
    }

    @Override
    public boolean onFragmentCreate() {
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
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }

    public void toggleShowAutoExceptions() {
        if (this.listView == null || this.adapter == null) {
            return;
        }
        this.showAutoExceptions = !this.showAutoExceptions;
        updateRows(true);
    }

    public void updateRows(boolean z) {
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList;
        boolean z2;
        int i;
        Boolean bool;
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.popupRow = -1;
        this.vibrateRow = -1;
        this.priorityRow = -1;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        if (this.currentType != -1) {
            this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.NotifyMeAbout)));
            int i2 = this.currentType;
            if (i2 == 3) {
                this.newRow = this.items.size();
                this.items.add(ItemInner.asCheck(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = this.items.size();
                    this.items.add(ItemInner.asCheck(102, LocaleController.getString(R.string.NotifyMeAboutImportantStories), this.storiesAuto && ((bool = this.storiesEnabled) == null || !bool.booleanValue())));
                }
                this.items.add(ItemInner.asShadow(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i2 == 4 || i2 == 5) {
                this.messagesRow = this.items.size();
                this.items.add(ItemInner.asCheck2(103, R.drawable.msg_markunread, LocaleController.getString(R.string.NotifyMeAboutMessagesReactions), LocaleController.getString(notificationsSettings.getBoolean("EnableReactionsMessages", true) ? notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone : R.string.NotifyFromNobody), notificationsSettings.getBoolean("EnableReactionsMessages", true)));
                this.storiesRow = this.items.size();
                this.items.add(ItemInner.asCheck2(104, R.drawable.msg_stories_saved, LocaleController.getString(R.string.NotifyMeAboutStoriesReactions), LocaleController.getString(notificationsSettings.getBoolean("EnableReactionsStories", true) ? notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false) ? R.string.NotifyFromContacts : R.string.NotifyFromEveryone : R.string.NotifyFromNobody), notificationsSettings.getBoolean("EnableReactionsStories", true)));
                this.items.add(ItemInner.asShadow(-1, null));
            } else {
                int i3 = i2 == 1 ? R.string.NotifyMeAboutPrivate : i2 == 0 ? R.string.NotifyMeAboutGroups : R.string.NotifyMeAboutChannels;
                this.showRow = this.items.size();
                this.items.add(ItemInner.asCheck(100, LocaleController.getString(i3), getNotificationsController().isGlobalNotificationsEnabled(this.currentType)));
                this.items.add(ItemInner.asShadow(-1, null));
            }
            this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.SETTINGS)));
            this.settingsStart = this.items.size() - 1;
            int i4 = this.currentType;
            if (i4 == 3) {
                this.showSenderRow = this.items.size();
                this.items.add(ItemInner.asCheck(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i4 == 4 || i4 == 5) {
                this.showSenderRow = this.items.size();
                this.items.add(ItemInner.asCheck(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                if (i4 == 0) {
                    z2 = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                } else if (i4 != 1) {
                    z2 = i4 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true);
                } else {
                    z2 = notificationsSettings.getBoolean("EnablePreviewAll", true);
                }
                this.previewRow = this.items.size();
                this.items.add(ItemInner.asCheck(0, LocaleController.getString(R.string.MessagePreview), z2));
            }
            this.soundRow = this.items.size();
            this.items.add(ItemInner.asSetting(3, LocaleController.getString("Sound", R.string.Sound), getSound()));
            if (this.expanded) {
                this.lightColorRow = this.items.size();
                this.items.add(ItemInner.asColor(LocaleController.getString("LedColor", R.string.LedColor), getLedColor()));
                int i5 = this.currentType;
                if (i5 == 0) {
                    i = notificationsSettings.getInt("vibrate_group", 0);
                } else if (i5 == 1) {
                    i = notificationsSettings.getInt("vibrate_messages", 0);
                } else if (i5 == 2) {
                    i = notificationsSettings.getInt("vibrate_channel", 0);
                } else if (i5 != 3) {
                    i = (i5 == 4 || i5 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0;
                } else {
                    i = notificationsSettings.getInt("vibrate_stories", 0);
                }
                this.vibrateRow = this.items.size();
                ArrayList<ItemInner> arrayList2 = this.items;
                String string = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.vibrateLabels;
                arrayList2.add(ItemInner.asSetting(1, string, LocaleController.getString(iArr[Utilities.clamp(i, iArr.length - 1, 0)])));
                int i6 = this.currentType;
                if (i6 == 1 || i6 == 0) {
                    this.popupRow = this.items.size();
                    this.items.add(ItemInner.asSetting(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), getPopupOption()));
                }
                this.priorityRow = this.items.size();
                this.items.add(ItemInner.asSetting(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), getPriorityOption()));
                this.items.add(ItemInner.asExpand(LocaleController.getString(R.string.NotifyLessOptions), false));
            } else {
                this.items.add(ItemInner.asExpand(LocaleController.getString(R.string.NotifyMoreOptions), true));
            }
            this.settingsEnd = this.items.size() - 1;
            this.items.add(ItemInner.asShadow(-2, null));
        }
        int i7 = this.currentType;
        if (i7 == 4 || i7 == 5) {
            this.exceptionsStart = -1;
            this.exceptionsEnd = -1;
        } else {
            if (i7 != -1) {
                this.addExceptionRow = this.items.size();
                this.items.add(ItemInner.asButton(6, R.drawable.msg_contact_add, LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException)));
            }
            this.exceptionsStart = this.items.size() - 1;
            if (this.autoExceptions != null && this.showAutoExceptions) {
                for (int i8 = 0; i8 < this.autoExceptions.size(); i8++) {
                    this.items.add(ItemInner.asException(this.autoExceptions.get(i8)));
                }
            }
            if (this.exceptions != null) {
                for (int i9 = 0; i9 < this.exceptions.size(); i9++) {
                    this.items.add(ItemInner.asException(this.exceptions.get(i9)));
                }
            }
            this.exceptionsEnd = this.items.size() - 1;
            if (this.currentType != -1 || ((arrayList = this.exceptions) != null && !arrayList.isEmpty())) {
                this.items.add(ItemInner.asShadow(-3, null));
            }
            ArrayList<NotificationsSettingsActivity.NotificationException> arrayList3 = this.exceptions;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.deleteExceptionsRow = this.items.size();
                this.items.add(ItemInner.asButton(7, 0, LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException)));
            }
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

    public NotificationsCustomSettingsActivity(int i, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2, boolean z) {
        super(null);
        this.showAutoExceptions = true;
        this.exceptionsDict = new HashMap<>();
        this.topicId = 0;
        this.vibrateLabels = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.popupOptions = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i2 = R.string.NotificationsPriorityHigh;
        int i3 = R.string.NotificationsPriorityUrgent;
        int i4 = R.string.NotificationsPriorityMedium;
        this.priorityOptions = new int[]{i2, i3, i3, i4, R.string.NotificationsPriorityLow, i4};
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.vibrateRow = -1;
        this.popupRow = -1;
        this.priorityRow = -1;
        this.oldItems = new ArrayList<>();
        this.items = new ArrayList<>();
        this.currentType = i;
        this.autoExceptions = arrayList2;
        this.exceptions = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                NotificationsSettingsActivity.NotificationException notificationException = this.exceptions.get(i5);
                this.exceptionsDict.put(Long.valueOf(notificationException.did), notificationException);
            }
        }
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList3 = this.autoExceptions;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                NotificationsSettingsActivity.NotificationException notificationException2 = this.autoExceptions.get(i6);
                this.exceptionsDict.put(Long.valueOf(notificationException2.did), notificationException2);
            }
        }
        if (z) {
            loadExceptions();
        }
    }
}
