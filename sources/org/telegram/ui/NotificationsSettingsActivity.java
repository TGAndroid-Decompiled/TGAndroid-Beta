package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextDetailSettingsCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;

public class NotificationsSettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private int accountsAllRow;
    private int accountsInfoRow;
    private int accountsSectionRow;
    private ListAdapter adapter;
    private int androidAutoAlertRow;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberSection;
    private int badgeNumberSection2Row;
    private int badgeNumberShowRow;
    private int callsRingtoneRow;
    private int callsSection2Row;
    private int callsSectionRow;
    private int callsVibrateRow;
    private int channelsRow;
    private int contactJoinedRow;
    private int eventsSection2Row;
    private int eventsSectionRow;
    private int groupRow;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSectionRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private int notificationsSection2Row;
    private int notificationsSectionRow;
    private int notificationsServiceConnectionRow;
    private int notificationsServiceRow;
    private int otherSection2Row;
    private int otherSectionRow;
    private int pinnedMessageRow;
    private int privateRow;
    private int reactionsRow;
    private int repeatRow;
    private int resetNotificationsRow;
    private int resetNotificationsSectionRow;
    private int resetSection2Row;
    private int resetSectionRow;
    private int storiesRow;
    private boolean updateRepeatNotifications;
    private boolean updateRingtone;
    private boolean updateVibrate;
    private boolean reseting = false;
    private ArrayList exceptionUsers = null;
    private ArrayList exceptionChats = null;
    private ArrayList exceptionChannels = null;
    private ArrayList exceptionStories = null;
    private ArrayList exceptionAutoStories = null;
    private int rowCount = 0;

    public static class NotificationException {
        public boolean auto;
        public long did;
        public boolean hasCustom;
        public int muteUntil;
        public int notify;
        public boolean story;
    }

    public static void $r8$lambda$z8728ZbQxis9p3M0Wak40C7BT78(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        loadExceptions(null);
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i = this.rowCount;
            this.accountsSectionRow = i;
            this.accountsAllRow = i + 1;
            this.rowCount = i + 3;
            this.accountsInfoRow = i + 2;
        } else {
            this.accountsSectionRow = -1;
            this.accountsAllRow = -1;
            this.accountsInfoRow = -1;
        }
        int i2 = this.rowCount;
        this.notificationsSectionRow = i2;
        this.privateRow = i2 + 1;
        this.groupRow = i2 + 2;
        this.channelsRow = i2 + 3;
        this.storiesRow = i2 + 4;
        this.reactionsRow = i2 + 5;
        this.notificationsSection2Row = i2 + 6;
        this.callsSectionRow = i2 + 7;
        this.callsVibrateRow = i2 + 8;
        this.callsRingtoneRow = i2 + 9;
        this.eventsSection2Row = i2 + 10;
        this.badgeNumberSection = i2 + 11;
        this.badgeNumberShowRow = i2 + 12;
        this.badgeNumberMutedRow = i2 + 13;
        this.badgeNumberMessagesRow = i2 + 14;
        this.badgeNumberSection2Row = i2 + 15;
        this.inappSectionRow = i2 + 16;
        this.inappSoundRow = i2 + 17;
        this.inappVibrateRow = i2 + 18;
        this.inappPreviewRow = i2 + 19;
        int i3 = i2 + 21;
        this.rowCount = i3;
        this.inchatSoundRow = i2 + 20;
        this.inappPriorityRow = i3;
        this.callsSection2Row = i2 + 22;
        this.eventsSectionRow = i2 + 23;
        this.contactJoinedRow = i2 + 24;
        this.pinnedMessageRow = i2 + 25;
        this.otherSection2Row = i2 + 26;
        this.otherSectionRow = i2 + 27;
        this.notificationsServiceRow = i2 + 28;
        this.notificationsServiceConnectionRow = i2 + 29;
        this.androidAutoAlertRow = -1;
        this.repeatRow = i2 + 30;
        this.resetSection2Row = i2 + 31;
        this.resetSectionRow = i2 + 32;
        this.resetNotificationsRow = i2 + 33;
        this.rowCount = i2 + 35;
        this.resetNotificationsSectionRow = i2 + 34;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getMessagesController().reloadReactionsNotifySettings();
        return super.onFragmentCreate();
    }

    public void loadExceptions(final Runnable runnable) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        final ArrayList arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsSettingsActivity.m3578$r8$lambda$P_A6RQck9sbGCvk1lkbQc4JRR4(this.f$0, arrayList, runnable);
            }
        });
    }

    public static void m3578$r8$lambda$P_A6RQck9sbGCvk1lkbQc4JRR4(final NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, final Runnable runnable) {
        boolean z;
        ArrayList<TLRPC.Chat> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        ArrayList<TLRPC.EncryptedChat> arrayList4;
        int size;
        int i;
        ArrayList arrayList5;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        int i4;
        TLRPC.User user;
        TLRPC.Chat chat;
        ArrayList arrayList6;
        int i5;
        ArrayList arrayList7;
        ArrayList arrayList8;
        notificationsSettingsActivity.getClass();
        final ArrayList arrayList9 = new ArrayList();
        final ArrayList arrayList10 = new ArrayList();
        final ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList14 = new ArrayList<>();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList<TLRPC.User> arrayList17 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList18 = new ArrayList<>();
        ArrayList<TLRPC.EncryptedChat> arrayList19 = new ArrayList<>();
        long j = UserConfig.getInstance(notificationsSettingsActivity.currentAccount).clientUserId;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
        Map<String, ?> all = notificationsSettings.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            arrayList18 = arrayList18;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            arrayList17 = arrayList17;
            if (key.startsWith("notify2_")) {
                ArrayList<TLRPC.EncryptedChat> arrayList20 = arrayList19;
                String strReplace = key.replace("notify2_", "");
                if (strReplace.contains("_")) {
                    arrayList19 = arrayList20;
                } else {
                    Long l = Utilities.parseLong(strReplace);
                    ArrayList arrayList21 = arrayList12;
                    ArrayList arrayList22 = arrayList13;
                    long jLongValue = l.longValue();
                    if (jLongValue == 0 || jLongValue == j) {
                        arrayList12 = arrayList21;
                        arrayList19 = arrayList20;
                        arrayList13 = arrayList22;
                    } else {
                        NotificationException notificationException = new NotificationException();
                        notificationException.did = jLongValue;
                        StringBuilder sb = new StringBuilder();
                        ArrayList arrayList23 = arrayList10;
                        sb.append("custom_");
                        sb.append(jLongValue);
                        notificationException.hasCustom = notificationsSettings.getBoolean(sb.toString(), false);
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
                            TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getEncryptedChat(Integer.valueOf(encryptedChatId));
                            if (encryptedChat == null) {
                                arrayList16.add(Integer.valueOf(encryptedChatId));
                                longSparseArray.put(jLongValue, notificationException);
                            } else {
                                TLRPC.User user2 = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
                                if (user2 == null) {
                                    arrayList14.add(Long.valueOf(encryptedChat.user_id));
                                    longSparseArray.put(encryptedChat.user_id, notificationException);
                                } else if (!user2.deleted) {
                                }
                            }
                            arrayList9.add(notificationException);
                        } else if (DialogObject.isUserDialog(jLongValue)) {
                            TLRPC.User user3 = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getUser(l);
                            if (user3 == null) {
                                arrayList14.add(l);
                                longSparseArray.put(jLongValue, notificationException);
                            } else if (!user3.deleted) {
                            }
                            arrayList9.add(notificationException);
                        } else {
                            long j2 = -jLongValue;
                            TLRPC.Chat chat2 = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getChat(Long.valueOf(j2));
                            if (chat2 == null) {
                                arrayList15.add(Long.valueOf(j2));
                                longSparseArray.put(jLongValue, notificationException);
                            } else if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                if (ChatObject.isChannel(chat2) && !chat2.megagroup) {
                                    arrayList11.add(notificationException);
                                } else {
                                    arrayList10 = arrayList23;
                                    arrayList10.add(notificationException);
                                    arrayList19 = arrayList20;
                                    arrayList13 = arrayList22;
                                    arrayList12 = arrayList21;
                                }
                            }
                        }
                        arrayList19 = arrayList20;
                        arrayList13 = arrayList22;
                        arrayList12 = arrayList21;
                        arrayList10 = arrayList23;
                    }
                }
            }
        }
        ArrayList arrayList24 = arrayList12;
        ArrayList arrayList25 = arrayList13;
        ArrayList<TLRPC.User> arrayList26 = arrayList17;
        ArrayList<TLRPC.EncryptedChat> arrayList27 = arrayList19;
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
                        NotificationException notificationException2 = new NotificationException();
                        notificationException2.did = jLongValue2;
                        notificationException2.notify = ((Boolean) next2.getValue()).booleanValue() ? 0 : Integer.MAX_VALUE;
                        notificationException2.story = true;
                        if (DialogObject.isUserDialog(jLongValue2)) {
                            TLRPC.User user4 = notificationsSettingsActivity.getMessagesController().getUser(l2);
                            if (user4 == null) {
                                try {
                                    arrayList14.add(l2);
                                    longSparseArray.put(jLongValue2, notificationException2);
                                } catch (Exception unused) {
                                    arrayList8 = arrayList24;
                                }
                            } else if (user4.deleted) {
                            }
                            arrayList8 = arrayList24;
                            try {
                                arrayList8.add(notificationException2);
                                hashSet.add(l2);
                            } catch (Exception unused2) {
                            }
                            arrayList24 = arrayList8;
                        }
                    }
                } catch (Exception unused3) {
                    arrayList8 = arrayList24;
                }
            }
        }
        final ArrayList arrayList28 = arrayList24;
        if (arrayList != null) {
            ArrayList arrayList29 = arrayList;
            Collections.sort(arrayList29, Comparator$CC.comparingDouble(new ToDoubleFunction() {
                @Override
                public final double applyAsDouble(Object obj) {
                    return ((TLRPC.TL_topPeer) obj).rating;
                }
            }));
            int iMax = Math.max(0, arrayList29.size() - 5);
            while (iMax < arrayList29.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList29.get(iMax)).peer);
                if (hashSet.contains(Long.valueOf(peerDialogId))) {
                    i5 = iMax;
                } else {
                    NotificationException notificationException3 = new NotificationException();
                    notificationException3.did = peerDialogId;
                    i5 = iMax;
                    notificationException3.notify = 0;
                    notificationException3.auto = z;
                    notificationException3.story = z;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user5 = notificationsSettingsActivity.getMessagesController().getUser(Long.valueOf(peerDialogId));
                        if (user5 == null) {
                            arrayList14.add(Long.valueOf(peerDialogId));
                            longSparseArray.put(peerDialogId, notificationException3);
                        } else if (user5.deleted) {
                        }
                        arrayList7 = arrayList25;
                        arrayList7.add(0, notificationException3);
                        hashSet.add(Long.valueOf(peerDialogId));
                    }
                    arrayList25 = arrayList7;
                    iMax = i5 + 1;
                    z = true;
                    arrayList29 = arrayList;
                }
                arrayList7 = arrayList25;
                arrayList25 = arrayList7;
                iMax = i5 + 1;
                z = true;
                arrayList29 = arrayList;
            }
        }
        ArrayList arrayList30 = arrayList25;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList16.isEmpty()) {
                    arrayList4 = arrayList27;
                } else {
                    try {
                        arrayList4 = arrayList27;
                        try {
                            MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount).getEncryptedChatsInternal(TextUtils.join(",", arrayList16), arrayList4, arrayList14);
                        } catch (Exception e) {
                            e = e;
                            arrayList2 = arrayList18;
                            arrayList3 = arrayList26;
                            FileLog.e(e);
                            size = arrayList2.size();
                            i = 0;
                            while (i < size) {
                                chat = arrayList2.get(i);
                                if (chat.left) {
                                    arrayList6 = arrayList30;
                                } else {
                                    arrayList6 = arrayList30;
                                }
                                i++;
                                arrayList30 = arrayList6;
                            }
                            arrayList5 = arrayList30;
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
                            for (i4 = 0; i4 < size4; i4++) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                    arrayList10.remove(longSparseArray.valueAt(i4));
                                    arrayList11.remove(longSparseArray.valueAt(i4));
                                } else {
                                    arrayList9.remove(longSparseArray.valueAt(i4));
                                }
                            }
                            final ArrayList<TLRPC.Chat> arrayList31 = arrayList2;
                            final ArrayList<TLRPC.User> arrayList32 = arrayList3;
                            final ArrayList<TLRPC.EncryptedChat> arrayList33 = arrayList4;
                            final ArrayList arrayList34 = arrayList5;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(this.f$0, arrayList32, arrayList31, arrayList33, arrayList9, arrayList10, arrayList11, arrayList28, arrayList34, runnable);
                                }
                            });
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList4 = arrayList27;
                        arrayList2 = arrayList18;
                        arrayList3 = arrayList26;
                        FileLog.e(e);
                        size = arrayList2.size();
                        i = 0;
                        while (i < size) {
                            chat = arrayList2.get(i);
                            if (chat.left) {
                                arrayList6 = arrayList30;
                            } else {
                                arrayList6 = arrayList30;
                            }
                            i++;
                            arrayList30 = arrayList6;
                        }
                        arrayList5 = arrayList30;
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
                                arrayList10.remove(longSparseArray.valueAt(i4));
                                arrayList11.remove(longSparseArray.valueAt(i4));
                            } else {
                                arrayList9.remove(longSparseArray.valueAt(i4));
                            }
                        }
                        final ArrayList arrayList35 = arrayList2;
                        final ArrayList arrayList36 = arrayList3;
                        final ArrayList arrayList37 = arrayList4;
                        final ArrayList arrayList38 = arrayList5;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(this.f$0, arrayList36, arrayList35, arrayList37, arrayList9, arrayList10, arrayList11, arrayList28, arrayList38, runnable);
                            }
                        });
                    }
                }
                if (arrayList14.isEmpty()) {
                    arrayList3 = arrayList26;
                } else {
                    try {
                        arrayList3 = arrayList26;
                        try {
                            MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount).getUsersInternal(arrayList14, arrayList3);
                        } catch (Exception e3) {
                            e = e3;
                            arrayList2 = arrayList18;
                            FileLog.e(e);
                            size = arrayList2.size();
                            i = 0;
                            while (i < size) {
                                chat = arrayList2.get(i);
                                if (chat.left) {
                                    arrayList6 = arrayList30;
                                } else {
                                    arrayList6 = arrayList30;
                                }
                                i++;
                                arrayList30 = arrayList6;
                            }
                            arrayList5 = arrayList30;
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
                                    arrayList10.remove(longSparseArray.valueAt(i4));
                                    arrayList11.remove(longSparseArray.valueAt(i4));
                                } else {
                                    arrayList9.remove(longSparseArray.valueAt(i4));
                                }
                            }
                            final ArrayList arrayList39 = arrayList2;
                            final ArrayList arrayList310 = arrayList3;
                            final ArrayList arrayList311 = arrayList4;
                            final ArrayList arrayList312 = arrayList5;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(this.f$0, arrayList310, arrayList39, arrayList311, arrayList9, arrayList10, arrayList11, arrayList28, arrayList312, runnable);
                                }
                            });
                        }
                    } catch (Exception e4) {
                        e = e4;
                        arrayList3 = arrayList26;
                        arrayList2 = arrayList18;
                        FileLog.e(e);
                        size = arrayList2.size();
                        i = 0;
                        while (i < size) {
                            chat = arrayList2.get(i);
                            if (chat.left) {
                                arrayList6 = arrayList30;
                            } else {
                                arrayList6 = arrayList30;
                            }
                            i++;
                            arrayList30 = arrayList6;
                        }
                        arrayList5 = arrayList30;
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
                                arrayList10.remove(longSparseArray.valueAt(i4));
                                arrayList11.remove(longSparseArray.valueAt(i4));
                            } else {
                                arrayList9.remove(longSparseArray.valueAt(i4));
                            }
                        }
                        final ArrayList arrayList313 = arrayList2;
                        final ArrayList arrayList314 = arrayList3;
                        final ArrayList arrayList315 = arrayList4;
                        final ArrayList arrayList316 = arrayList5;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(this.f$0, arrayList314, arrayList313, arrayList315, arrayList9, arrayList10, arrayList11, arrayList28, arrayList316, runnable);
                            }
                        });
                    }
                }
                if (arrayList15.isEmpty()) {
                    arrayList2 = arrayList18;
                } else {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount);
                    String strJoin = TextUtils.join(",", arrayList15);
                    arrayList2 = arrayList18;
                    try {
                        messagesStorage.getChatsInternal(strJoin, arrayList2);
                    } catch (Exception e5) {
                        e = e5;
                        FileLog.e(e);
                    }
                }
            } catch (Exception e6) {
                e = e6;
                arrayList2 = arrayList18;
                arrayList3 = arrayList26;
                arrayList4 = arrayList27;
            }
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                chat = arrayList2.get(i);
                if (chat.left || chat.kicked || chat.migrated_to != null) {
                    arrayList6 = arrayList30;
                } else {
                    NotificationException notificationException4 = (NotificationException) longSparseArray.get(-chat.id);
                    arrayList6 = arrayList30;
                    longSparseArray.remove(-chat.id);
                    if (notificationException4 != null) {
                        if (ChatObject.isChannel(chat) && !chat.megagroup) {
                            arrayList11.add(notificationException4);
                        } else {
                            arrayList10.add(notificationException4);
                        }
                    }
                }
                i++;
                arrayList30 = arrayList6;
            }
            arrayList5 = arrayList30;
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
                    arrayList10.remove(longSparseArray.valueAt(i4));
                    arrayList11.remove(longSparseArray.valueAt(i4));
                } else {
                    arrayList9.remove(longSparseArray.valueAt(i4));
                }
            }
        } else {
            arrayList5 = arrayList30;
            arrayList2 = arrayList18;
            arrayList3 = arrayList26;
            arrayList4 = arrayList27;
        }
        final ArrayList arrayList317 = arrayList2;
        final ArrayList arrayList318 = arrayList3;
        final ArrayList arrayList319 = arrayList4;
        final ArrayList arrayList3110 = arrayList5;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationsSettingsActivity.$r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(this.f$0, arrayList318, arrayList317, arrayList319, arrayList9, arrayList10, arrayList11, arrayList28, arrayList3110, runnable);
            }
        });
    }

    public static void $r8$lambda$7rLxoZRmplIdVqQ0_YxC3UNlODs(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putEncryptedChats(arrayList3, true);
        notificationsSettingsActivity.exceptionUsers = arrayList4;
        notificationsSettingsActivity.exceptionChats = arrayList5;
        notificationsSettingsActivity.exceptionChannels = arrayList6;
        notificationsSettingsActivity.exceptionStories = arrayList7;
        notificationsSettingsActivity.exceptionAutoStories = arrayList8;
        ListAdapter listAdapter = notificationsSettingsActivity.adapter;
        if (listAdapter != null) {
            listAdapter.notifyItemChanged(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.adapter.notifyItemChanged(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.adapter.notifyItemChanged(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.adapter.notifyItemChanged(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public NotificationsCustomSettingsActivity makeNotificationsCustomSettingsActivity(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        if (i == 1) {
            arrayList = this.exceptionUsers;
        } else if (i == 0) {
            arrayList = this.exceptionChats;
        } else {
            if (i == 4) {
                arrayList2 = null;
            } else if (i == 3) {
                arrayList3 = this.exceptionStories;
                arrayList2 = this.exceptionAutoStories;
            } else {
                arrayList = this.exceptionChannels;
            }
            return new NotificationsCustomSettingsActivity(i, arrayList3, arrayList2);
        }
        arrayList3 = arrayList;
        arrayList2 = null;
        return new NotificationsCustomSettingsActivity(i, arrayList3, arrayList2);
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    NotificationsSettingsActivity.this.finishFragment();
                }
            }
        });
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isRightLayout()) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setItemAnimator(null);
        this.listView.setLayoutAnimation(null);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, i, false) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i2) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i2);
            }

            @Override
            public void onDoubleTap(View view, int i2, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i2, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i2, float f, float f2) {
                NotificationsSettingsActivity.$r8$lambda$ZJEt7NazINK9z60O2ShN38ZYxKI(this.f$0, view, i2, f, f2);
            }
        });
        return this.fragmentView;
    }

    public static void $r8$lambda$ZJEt7NazINK9z60O2ShN38ZYxKI(final NotificationsSettingsActivity notificationsSettingsActivity, View view, final int i, float f, float f2) {
        ArrayList arrayList;
        final int i2;
        boolean z;
        zIsGlobalNotificationsEnabled = false;
        final boolean zIsGlobalNotificationsEnabled = false;
        if (notificationsSettingsActivity.getParentActivity() == null) {
            return;
        }
        int i3 = notificationsSettingsActivity.privateRow;
        ArrayList arrayList2 = null;
        parcelable = null;
        Parcelable parcelable = null;
        if (i == i3 || i == notificationsSettingsActivity.groupRow || i == notificationsSettingsActivity.channelsRow || i == notificationsSettingsActivity.storiesRow || i == notificationsSettingsActivity.reactionsRow) {
            if (i == i3) {
                arrayList2 = notificationsSettingsActivity.exceptionUsers;
                arrayList = null;
                zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(1);
                i2 = 1;
            } else if (i == notificationsSettingsActivity.groupRow) {
                arrayList2 = notificationsSettingsActivity.exceptionChats;
                arrayList = null;
                zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(0);
                i2 = 0;
            } else if (i == notificationsSettingsActivity.storiesRow) {
                arrayList2 = notificationsSettingsActivity.exceptionStories;
                arrayList = notificationsSettingsActivity.exceptionAutoStories;
                zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableAllStories", false);
                i2 = 3;
            } else if (i == notificationsSettingsActivity.reactionsRow) {
                zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsMessages", true) || notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsStories", true);
                arrayList = null;
                i2 = 4;
            } else {
                arrayList2 = notificationsSettingsActivity.exceptionChannels;
                arrayList = null;
                zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(2);
                i2 = 2;
            }
            if (arrayList2 == null && i2 != 4) {
                return;
            }
            final NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            if ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                notificationsSettingsActivity.showExceptionsAlert(i, new Runnable() {
                    @Override
                    public final void run() {
                        NotificationsSettingsActivity.$r8$lambda$DG1oNHlVHFZ6B7U2mKxgLf_uAXs(this.f$0, i2, zIsGlobalNotificationsEnabled, notificationsCheckCell, i);
                    }
                });
            } else {
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(i2, arrayList2, arrayList));
            }
        } else if (i == notificationsSettingsActivity.callsRingtoneRow) {
            try {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                String path = uri != null ? uri.getPath() : null;
                String string = notificationsSettings.getString("CallsRingtonePath", path);
                if (string != null && !string.equals("NoSound")) {
                    parcelable = string.equals(path) ? uri : Uri.parse(string);
                }
                intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                notificationsSettingsActivity.startActivityForResult(intent, i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (i == notificationsSettingsActivity.resetNotificationsRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(notificationsSettingsActivity.getParentActivity());
            builder.setTitle(LocaleController.getString("ResetNotificationsAlertTitle", R.string.ResetNotificationsAlertTitle));
            builder.setMessage(LocaleController.getString("ResetNotificationsAlert", R.string.ResetNotificationsAlert));
            builder.setPositiveButton(LocaleController.getString("Reset", R.string.Reset), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i4) {
                    NotificationsSettingsActivity.m3579$r8$lambda$dp9jwDqimedbijyv0bOqsHHBSg(this.f$0, alertDialog, i4);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            notificationsSettingsActivity.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        } else if (i == notificationsSettingsActivity.inappSoundRow) {
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
            SharedPreferences.Editor editorEdit = notificationsSettings2.edit();
            zIsGlobalNotificationsEnabled = notificationsSettings2.getBoolean("EnableInAppSounds", true);
            editorEdit.putBoolean("EnableInAppSounds", !zIsGlobalNotificationsEnabled);
            editorEdit.commit();
        } else if (i == notificationsSettingsActivity.inappVibrateRow) {
            SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
            SharedPreferences.Editor editorEdit2 = notificationsSettings3.edit();
            zIsGlobalNotificationsEnabled = notificationsSettings3.getBoolean("EnableInAppVibrate", true);
            editorEdit2.putBoolean("EnableInAppVibrate", !zIsGlobalNotificationsEnabled);
            editorEdit2.commit();
        } else if (i == notificationsSettingsActivity.inappPreviewRow) {
            SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
            SharedPreferences.Editor editorEdit3 = notificationsSettings4.edit();
            zIsGlobalNotificationsEnabled = notificationsSettings4.getBoolean("EnableInAppPreview", true);
            editorEdit3.putBoolean("EnableInAppPreview", !zIsGlobalNotificationsEnabled);
            editorEdit3.commit();
        } else {
            if (i == notificationsSettingsActivity.inchatSoundRow) {
                SharedPreferences notificationsSettings5 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit4 = notificationsSettings5.edit();
                z = notificationsSettings5.getBoolean("EnableInChatSound", true);
                boolean z2 = !z;
                editorEdit4.putBoolean("EnableInChatSound", z2);
                editorEdit4.commit();
                notificationsSettingsActivity.getNotificationsController().setInChatSoundEnabled(z2);
            } else if (i == notificationsSettingsActivity.inappPriorityRow) {
                SharedPreferences notificationsSettings6 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit5 = notificationsSettings6.edit();
                zIsGlobalNotificationsEnabled = notificationsSettings6.getBoolean("EnableInAppPopup", true);
                editorEdit5.putBoolean("EnableInAppPopup", !zIsGlobalNotificationsEnabled);
                editorEdit5.commit();
            } else if (i == notificationsSettingsActivity.contactJoinedRow) {
                SharedPreferences notificationsSettings7 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit6 = notificationsSettings7.edit();
                z = notificationsSettings7.getBoolean("EnableContactJoined", true);
                boolean z3 = !z;
                MessagesController.getInstance(notificationsSettingsActivity.currentAccount).enableJoined = z3;
                editorEdit6.putBoolean("EnableContactJoined", z3);
                editorEdit6.commit();
                TL_account.setContactSignUpNotification setcontactsignupnotification = new TL_account.setContactSignUpNotification();
                setcontactsignupnotification.silent = z;
                ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(setcontactsignupnotification, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        NotificationsSettingsActivity.$r8$lambda$z8728ZbQxis9p3M0Wak40C7BT78(tLObject, tL_error);
                    }
                });
            } else if (i == notificationsSettingsActivity.pinnedMessageRow) {
                SharedPreferences notificationsSettings8 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit7 = notificationsSettings8.edit();
                zIsGlobalNotificationsEnabled = notificationsSettings8.getBoolean("PinnedMessages", true);
                editorEdit7.putBoolean("PinnedMessages", !zIsGlobalNotificationsEnabled);
                editorEdit7.commit();
            } else if (i == notificationsSettingsActivity.androidAutoAlertRow) {
                SharedPreferences notificationsSettings9 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit8 = notificationsSettings9.edit();
                zIsGlobalNotificationsEnabled = notificationsSettings9.getBoolean("EnableAutoNotifications", false);
                editorEdit8.putBoolean("EnableAutoNotifications", !zIsGlobalNotificationsEnabled);
                editorEdit8.commit();
            } else if (i == notificationsSettingsActivity.badgeNumberShowRow) {
                SharedPreferences.Editor editorEdit9 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().showBadgeNumber;
                notificationsSettingsActivity.getNotificationsController().showBadgeNumber = !zIsGlobalNotificationsEnabled;
                editorEdit9.putBoolean("badgeNumber", notificationsSettingsActivity.getNotificationsController().showBadgeNumber);
                editorEdit9.commit();
                notificationsSettingsActivity.getNotificationsController().updateBadge();
            } else if (i == notificationsSettingsActivity.badgeNumberMutedRow) {
                SharedPreferences.Editor editorEdit10 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().showBadgeMuted;
                notificationsSettingsActivity.getNotificationsController().showBadgeMuted = !zIsGlobalNotificationsEnabled;
                editorEdit10.putBoolean("badgeNumberMuted", notificationsSettingsActivity.getNotificationsController().showBadgeMuted);
                editorEdit10.commit();
                notificationsSettingsActivity.getNotificationsController().updateBadge();
                notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
            } else if (i == notificationsSettingsActivity.badgeNumberMessagesRow) {
                SharedPreferences.Editor editorEdit11 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().showBadgeMessages;
                notificationsSettingsActivity.getNotificationsController().showBadgeMessages = !zIsGlobalNotificationsEnabled;
                editorEdit11.putBoolean("badgeNumberMessages", notificationsSettingsActivity.getNotificationsController().showBadgeMessages);
                editorEdit11.commit();
                notificationsSettingsActivity.getNotificationsController().updateBadge();
            } else if (i == notificationsSettingsActivity.notificationsServiceConnectionRow) {
                SharedPreferences notificationsSettings10 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                boolean z4 = notificationsSettings10.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().backgroundConnection);
                SharedPreferences.Editor editorEdit12 = notificationsSettings10.edit();
                editorEdit12.putBoolean("pushConnection", !z4);
                editorEdit12.commit();
                if (!z4) {
                    ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(true);
                } else {
                    ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(false);
                }
                zIsGlobalNotificationsEnabled = z4;
            } else if (i == notificationsSettingsActivity.accountsAllRow) {
                SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
                boolean z5 = globalNotificationsSettings.getBoolean("AllAccounts", true);
                SharedPreferences.Editor editorEdit13 = globalNotificationsSettings.edit();
                boolean z6 = !z5;
                editorEdit13.putBoolean("AllAccounts", z6);
                editorEdit13.commit();
                SharedConfig.showNotificationsForAllAccounts = z6;
                for (int i4 = 0; i4 < 4; i4++) {
                    if (SharedConfig.showNotificationsForAllAccounts) {
                        NotificationsController.getInstance(i4).showNotifications();
                    } else if (i4 == notificationsSettingsActivity.currentAccount) {
                        NotificationsController.getInstance(i4).showNotifications();
                    } else {
                        NotificationsController.getInstance(i4).hideNotifications();
                    }
                }
                zIsGlobalNotificationsEnabled = z5;
            } else if (i == notificationsSettingsActivity.notificationsServiceRow) {
                SharedPreferences notificationsSettings11 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                zIsGlobalNotificationsEnabled = notificationsSettings11.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().keepAliveService);
                SharedPreferences.Editor editorEdit14 = notificationsSettings11.edit();
                editorEdit14.putBoolean("pushService", !zIsGlobalNotificationsEnabled);
                editorEdit14.commit();
                ApplicationLoader.startPushService();
            } else if (i == notificationsSettingsActivity.callsVibrateRow) {
                if (notificationsSettingsActivity.getParentActivity() == null) {
                    return;
                } else {
                    notificationsSettingsActivity.showDialog(AlertsCreator.createVibrationSelectDialog(notificationsSettingsActivity.getParentActivity(), 0L, 0L, i == notificationsSettingsActivity.callsVibrateRow ? "vibrate_calls" : null, new Runnable() {
                        @Override
                        public final void run() {
                            NotificationsSettingsActivity.$r8$lambda$GBHksFBx7bWTK0gMkezTOmCQXHo(this.f$0, i);
                        }
                    }));
                }
            } else if (i == notificationsSettingsActivity.repeatRow) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(notificationsSettingsActivity.getParentActivity());
                builder2.setTitle(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications));
                builder2.setItems(new CharSequence[]{LocaleController.getString("RepeatDisabled", R.string.RepeatDisabled), LocaleController.formatPluralString("Minutes", 5, new Object[0]), LocaleController.formatPluralString("Minutes", 10, new Object[0]), LocaleController.formatPluralString("Minutes", 30, new Object[0]), LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Hours", 2, new Object[0]), LocaleController.formatPluralString("Hours", 4, new Object[0])}, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        NotificationsSettingsActivity.$r8$lambda$SdVhuJSBr4KeDmUOA0xezqQXqWw(this.f$0, i, dialogInterface, i5);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                notificationsSettingsActivity.showDialog(builder2.create());
            }
            zIsGlobalNotificationsEnabled = z;
        }
        if (view instanceof TextCheckCell) {
            ((TextCheckCell) view).setChecked(!zIsGlobalNotificationsEnabled);
        }
    }

    public static void $r8$lambda$DG1oNHlVHFZ6B7U2mKxgLf_uAXs(NotificationsSettingsActivity notificationsSettingsActivity, int i, boolean z, NotificationsCheckCell notificationsCheckCell, int i2) {
        notificationsSettingsActivity.getClass();
        if (i == 3) {
            SharedPreferences.Editor editorEdit = notificationsSettingsActivity.getNotificationsSettings().edit();
            if (z) {
                editorEdit.remove("EnableAllStories");
            } else {
                editorEdit.putBoolean("EnableAllStories", true);
            }
            editorEdit.apply();
            notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i);
        } else if (i == 4 || i == 5) {
            SharedPreferences.Editor editorEdit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
            if (z) {
                editorEdit2.putBoolean("EnableReactionsMessages", false);
                editorEdit2.putBoolean("EnableReactionsStories", false);
            } else {
                editorEdit2.putBoolean("EnableReactionsMessages", true);
                editorEdit2.putBoolean("EnableReactionsStories", true);
            }
            editorEdit2.apply();
            notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i);
            notificationsSettingsActivity.getNotificationsController().deleteNotificationChannelGlobal(i);
        } else {
            notificationsSettingsActivity.getNotificationsController().setGlobalNotificationsEnabled(i, !z ? 0 : Integer.MAX_VALUE);
        }
        notificationsCheckCell.setChecked(!z, 0);
        notificationsSettingsActivity.adapter.notifyItemChanged(i2);
    }

    public static void m3579$r8$lambda$dp9jwDqimedbijyv0bOqsHHBSg(final NotificationsSettingsActivity notificationsSettingsActivity, AlertDialog alertDialog, int i) {
        if (notificationsSettingsActivity.reseting) {
            return;
        }
        notificationsSettingsActivity.reseting = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                NotificationsSettingsActivity.$r8$lambda$2SfBkj9y6dttpxVApl9kajCwoF8(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$2SfBkj9y6dttpxVApl9kajCwoF8(final NotificationsSettingsActivity notificationsSettingsActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        notificationsSettingsActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationsSettingsActivity.$r8$lambda$Ke8WudTsJCvz8ot4WZceEENMavs(this.f$0);
            }
        });
    }

    public static void $r8$lambda$Ke8WudTsJCvz8ot4WZceEENMavs(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().enableJoined = true;
        notificationsSettingsActivity.reseting = false;
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
        editorEdit.clear();
        editorEdit.commit();
        notificationsSettingsActivity.exceptionChats.clear();
        notificationsSettingsActivity.exceptionUsers.clear();
        notificationsSettingsActivity.adapter.notifyDataSetChanged();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    public static void $r8$lambda$GBHksFBx7bWTK0gMkezTOmCQXHo(NotificationsSettingsActivity notificationsSettingsActivity, int i) {
        notificationsSettingsActivity.updateVibrate = true;
        notificationsSettingsActivity.adapter.notifyItemChanged(i);
    }

    public static void $r8$lambda$SdVhuJSBr4KeDmUOA0xezqQXqWw(NotificationsSettingsActivity notificationsSettingsActivity, int i, DialogInterface dialogInterface, int i2) {
        notificationsSettingsActivity.getClass();
        int i3 = 5;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = 10;
            } else if (i2 == 3) {
                i3 = 30;
            } else if (i2 == 4) {
                i3 = 60;
            } else if (i2 == 5) {
                i3 = 120;
            } else {
                i3 = i2 == 6 ? 240 : 0;
            }
        }
        MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit().putInt("repeat_messages", i3).commit();
        notificationsSettingsActivity.updateRepeatNotifications = true;
        notificationsSettingsActivity.adapter.notifyItemChanged(i);
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        String title;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                title = null;
            } else {
                if (i == this.callsRingtoneRow) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        title = LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone);
                    } else {
                        title = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    title = LocaleController.getString("SoundDefault", R.string.SoundDefault);
                } else {
                    title = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (i == this.callsRingtoneRow) {
                if (title != null && uri != null) {
                    editorEdit.putString("CallsRingtone", title);
                    editorEdit.putString("CallsRingtonePath", uri.toString());
                } else {
                    editorEdit.putString("CallsRingtone", "NoSound");
                    editorEdit.putString("CallsRingtonePath", "NoSound");
                }
                this.updateRingtone = true;
            }
            editorEdit.commit();
            this.adapter.notifyItemChanged(i);
        }
    }

    private void showExceptionsAlert(int i, final Runnable runnable) {
        final ArrayList arrayList;
        String pluralString;
        final ArrayList arrayList2;
        String pluralString2 = null;
        if (i == this.storiesRow) {
            arrayList = this.exceptionStories;
            arrayList2 = this.exceptionAutoStories;
            if (arrayList != null && !arrayList.isEmpty()) {
                pluralString2 = LocaleController.formatPluralString("ChatsException", arrayList.size(), new Object[0]);
            }
        } else if (i == this.privateRow) {
            arrayList = this.exceptionUsers;
            if (arrayList == null || arrayList.isEmpty()) {
                arrayList2 = null;
            } else {
                pluralString = LocaleController.formatPluralString("ChatsException", arrayList.size(), new Object[0]);
                pluralString2 = pluralString;
                arrayList2 = null;
            }
        } else if (i == this.groupRow) {
            arrayList = this.exceptionChats;
            if (arrayList == null || arrayList.isEmpty()) {
                arrayList2 = null;
            } else {
                pluralString = LocaleController.formatPluralString("Groups", arrayList.size(), new Object[0]);
                pluralString2 = pluralString;
                arrayList2 = null;
            }
        } else {
            if (i == this.reactionsRow) {
                runnable.run();
                return;
            }
            arrayList = this.exceptionChannels;
            if (arrayList == null || arrayList.isEmpty()) {
                arrayList2 = null;
            } else {
                pluralString = LocaleController.formatPluralString("Channels", arrayList.size(), new Object[0]);
                pluralString2 = pluralString;
                arrayList2 = null;
            }
        }
        if (pluralString2 == null) {
            runnable.run();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        if (arrayList.size() == 1) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsSingleAlert, pluralString2)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsAlert, pluralString2)));
        }
        builder.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        builder.setNeutralButton(LocaleController.getString("ViewExceptions", R.string.ViewExceptions), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                NotificationsSettingsActivity.$r8$lambda$_24_Z2pEDipArxO4_3M8tQmYQHY(this.f$0, arrayList, arrayList2, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                runnable.run();
            }
        });
        showDialog(builder.create());
    }

    public static void $r8$lambda$_24_Z2pEDipArxO4_3M8tQmYQHY(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, AlertDialog alertDialog, int i) {
        notificationsSettingsActivity.getClass();
        notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, arrayList, arrayList2));
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.notificationsSettingsUpdated) {
            this.adapter.notifyDataSetChanged();
        }
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return (adapterPosition == NotificationsSettingsActivity.this.notificationsSectionRow || adapterPosition == NotificationsSettingsActivity.this.notificationsSection2Row || adapterPosition == NotificationsSettingsActivity.this.inappSectionRow || adapterPosition == NotificationsSettingsActivity.this.eventsSectionRow || adapterPosition == NotificationsSettingsActivity.this.otherSectionRow || adapterPosition == NotificationsSettingsActivity.this.resetSectionRow || adapterPosition == NotificationsSettingsActivity.this.badgeNumberSection || adapterPosition == NotificationsSettingsActivity.this.otherSection2Row || adapterPosition == NotificationsSettingsActivity.this.resetSection2Row || adapterPosition == NotificationsSettingsActivity.this.callsSection2Row || adapterPosition == NotificationsSettingsActivity.this.callsSectionRow || adapterPosition == NotificationsSettingsActivity.this.badgeNumberSection2Row || adapterPosition == NotificationsSettingsActivity.this.accountsSectionRow || adapterPosition == NotificationsSettingsActivity.this.accountsInfoRow || adapterPosition == NotificationsSettingsActivity.this.resetNotificationsSectionRow || adapterPosition == NotificationsSettingsActivity.this.eventsSection2Row) ? false : true;
        }

        @Override
        public int getItemCount() {
            return NotificationsSettingsActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            if (i == 0) {
                headerCell = new HeaderCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else if (i == 1) {
                headerCell = new TextCheckCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else if (i == 2) {
                headerCell = new TextDetailSettingsCell(this.mContext);
            } else if (i == 3) {
                headerCell = new NotificationsCheckCell(this.mContext, 21, 64, true, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else if (i == 4) {
                headerCell = new ShadowSectionCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else if (i == 5) {
                headerCell = new TextSettingsCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            } else {
                headerCell = new TextInfoPrivacyCell(this.mContext, ((BaseFragment) NotificationsSettingsActivity.this).resourceProvider);
            }
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            ArrayList arrayList;
            int i2;
            int i3;
            int i4;
            ArrayList arrayList2;
            boolean z;
            int i5;
            StringBuilder sb;
            boolean z2;
            boolean z3;
            String pluralString;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i != NotificationsSettingsActivity.this.notificationsSectionRow) {
                    if (i != NotificationsSettingsActivity.this.inappSectionRow) {
                        if (i != NotificationsSettingsActivity.this.eventsSectionRow) {
                            if (i != NotificationsSettingsActivity.this.otherSectionRow) {
                                if (i != NotificationsSettingsActivity.this.resetSectionRow) {
                                    if (i != NotificationsSettingsActivity.this.callsSectionRow) {
                                        if (i != NotificationsSettingsActivity.this.badgeNumberSection) {
                                            if (i == NotificationsSettingsActivity.this.accountsSectionRow) {
                                                headerCell.setText(LocaleController.getString("ShowNotificationsFor", R.string.ShowNotificationsFor));
                                                return;
                                            }
                                            return;
                                        }
                                        headerCell.setText(LocaleController.getString("BadgeNumber", R.string.BadgeNumber));
                                        return;
                                    }
                                    headerCell.setText(LocaleController.getString("VoipNotificationSettings", R.string.VoipNotificationSettings));
                                    return;
                                }
                                headerCell.setText(LocaleController.getString("Reset", R.string.Reset));
                                return;
                            }
                            headerCell.setText(LocaleController.getString("NotificationsOther", R.string.NotificationsOther));
                            return;
                        }
                        headerCell.setText(LocaleController.getString("Events", R.string.Events));
                        return;
                    }
                    headerCell.setText(LocaleController.getString("InAppNotifications", R.string.InAppNotifications));
                    return;
                }
                headerCell.setText(LocaleController.getString("NotificationsForChats", R.string.NotificationsForChats));
                return;
            }
            if (itemViewType == 1) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) NotificationsSettingsActivity.this).currentAccount);
                if (i != NotificationsSettingsActivity.this.inappSoundRow) {
                    if (i != NotificationsSettingsActivity.this.inappVibrateRow) {
                        if (i != NotificationsSettingsActivity.this.inappPreviewRow) {
                            if (i != NotificationsSettingsActivity.this.inappPriorityRow) {
                                if (i != NotificationsSettingsActivity.this.contactJoinedRow) {
                                    if (i != NotificationsSettingsActivity.this.pinnedMessageRow) {
                                        if (i != NotificationsSettingsActivity.this.androidAutoAlertRow) {
                                            if (i != NotificationsSettingsActivity.this.notificationsServiceRow) {
                                                if (i != NotificationsSettingsActivity.this.notificationsServiceConnectionRow) {
                                                    if (i == NotificationsSettingsActivity.this.badgeNumberShowRow) {
                                                        textCheckCell.setTextAndCheck(LocaleController.getString("BadgeNumberShow", R.string.BadgeNumberShow), NotificationsSettingsActivity.this.getNotificationsController().showBadgeNumber, true);
                                                        return;
                                                    }
                                                    if (i == NotificationsSettingsActivity.this.badgeNumberMutedRow) {
                                                        textCheckCell.setTextAndCheck(LocaleController.getString("BadgeNumberMutedChats", R.string.BadgeNumberMutedChats), NotificationsSettingsActivity.this.getNotificationsController().showBadgeMuted, true);
                                                        return;
                                                    }
                                                    if (i == NotificationsSettingsActivity.this.badgeNumberMessagesRow) {
                                                        textCheckCell.setTextAndCheck(LocaleController.getString("BadgeNumberUnread", R.string.BadgeNumberUnread), NotificationsSettingsActivity.this.getNotificationsController().showBadgeMessages, false);
                                                        return;
                                                    }
                                                    if (i != NotificationsSettingsActivity.this.inchatSoundRow) {
                                                        if (i != NotificationsSettingsActivity.this.callsVibrateRow) {
                                                            if (i == NotificationsSettingsActivity.this.accountsAllRow) {
                                                                textCheckCell.setTextAndCheck(LocaleController.getString("AllAccounts", R.string.AllAccounts), MessagesController.getGlobalNotificationsSettings().getBoolean("AllAccounts", true), false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        textCheckCell.setTextAndCheck(LocaleController.getString("Vibrate", R.string.Vibrate), notificationsSettings.getBoolean("EnableCallVibrate", true), true);
                                                        return;
                                                    }
                                                    textCheckCell.setTextAndCheck(LocaleController.getString("InChatSound", R.string.InChatSound), notificationsSettings.getBoolean("EnableInChatSound", true), true);
                                                    return;
                                                }
                                                textCheckCell.setTextAndValueAndCheck(LocaleController.getString("NotificationsServiceConnection", R.string.NotificationsServiceConnection), LocaleController.getString("NotificationsServiceConnectionInfo", R.string.NotificationsServiceConnectionInfo), notificationsSettings.getBoolean("pushConnection", NotificationsSettingsActivity.this.getMessagesController().backgroundConnection), true, true);
                                                return;
                                            }
                                            textCheckCell.setTextAndValueAndCheck(LocaleController.getString("NotificationsService", R.string.NotificationsService), LocaleController.getString("NotificationsServiceInfo", R.string.NotificationsServiceInfo), notificationsSettings.getBoolean("pushService", NotificationsSettingsActivity.this.getMessagesController().keepAliveService), true, true);
                                            return;
                                        }
                                        textCheckCell.setTextAndCheck("Android Auto", notificationsSettings.getBoolean("EnableAutoNotifications", false), true);
                                        return;
                                    }
                                    textCheckCell.setTextAndCheck(LocaleController.getString("PinnedMessages", R.string.PinnedMessages), notificationsSettings.getBoolean("PinnedMessages", true), false);
                                    return;
                                }
                                textCheckCell.setTextAndCheck(LocaleController.getString("ContactJoined", R.string.ContactJoined), notificationsSettings.getBoolean("EnableContactJoined", true), true);
                                return;
                            }
                            textCheckCell.setTextAndValueAndCheck(LocaleController.getString(R.string.InAppPopup), LocaleController.getString(R.string.InAppPopupInfo), notificationsSettings.getBoolean("EnableInAppPopup", true), true, false);
                            return;
                        }
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.InAppPreview), notificationsSettings.getBoolean("EnableInAppPreview", true), true);
                        return;
                    }
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.InAppVibrate), notificationsSettings.getBoolean("EnableInAppVibrate", true), true);
                    return;
                }
                textCheckCell.setTextAndCheck(LocaleController.getString(R.string.InAppSounds), notificationsSettings.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            if (itemViewType == 2) {
                TextDetailSettingsCell textDetailSettingsCell = (TextDetailSettingsCell) viewHolder.itemView;
                textDetailSettingsCell.setMultilineDetail(true);
                if (i == NotificationsSettingsActivity.this.resetNotificationsRow) {
                    textDetailSettingsCell.setTextAndValue(LocaleController.getString("ResetAllNotifications", R.string.ResetAllNotifications), LocaleController.getString("UndoAllCustom", R.string.UndoAllCustom), false);
                    return;
                }
                return;
            }
            if (itemViewType != 3) {
                if (itemViewType != 5) {
                    if (itemViewType != 6) {
                        return;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (i == NotificationsSettingsActivity.this.accountsInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("ShowNotificationsForInfo", R.string.ShowNotificationsForInfo));
                        return;
                    }
                    return;
                }
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((BaseFragment) NotificationsSettingsActivity.this).currentAccount);
                if (i != NotificationsSettingsActivity.this.callsRingtoneRow) {
                    if (i != NotificationsSettingsActivity.this.callsVibrateRow) {
                        if (i == NotificationsSettingsActivity.this.repeatRow) {
                            int i6 = notificationsSettings2.getInt("repeat_messages", 60);
                            if (i6 == 0) {
                                pluralString = LocaleController.getString("RepeatNotificationsNever", R.string.RepeatNotificationsNever);
                            } else if (i6 < 60) {
                                pluralString = LocaleController.formatPluralString("Minutes", i6, new Object[0]);
                            } else {
                                pluralString = LocaleController.formatPluralString("Hours", i6 / 60, new Object[0]);
                            }
                            textSettingsCell.setTextAndValue(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications), pluralString, NotificationsSettingsActivity.this.updateRepeatNotifications, false);
                            NotificationsSettingsActivity.this.updateRepeatNotifications = false;
                            return;
                        }
                        return;
                    }
                    int i7 = notificationsSettings2.getInt("vibrate_calls", 0);
                    if (i7 == 0) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDefault", R.string.VibrationDefault), NotificationsSettingsActivity.this.updateVibrate, true);
                    } else if (i7 == 1) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Short", R.string.Short), NotificationsSettingsActivity.this.updateVibrate, true);
                    } else if (i7 == 2) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDisabled", R.string.VibrationDisabled), NotificationsSettingsActivity.this.updateVibrate, true);
                    } else if (i7 == 3) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Long", R.string.Long), NotificationsSettingsActivity.this.updateVibrate, true);
                    } else if (i7 == 4) {
                        textSettingsCell.setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("OnlyIfSilent", R.string.OnlyIfSilent), NotificationsSettingsActivity.this.updateVibrate, true);
                    }
                    NotificationsSettingsActivity.this.updateVibrate = false;
                    return;
                }
                String string2 = notificationsSettings2.getString("CallsRingtone", LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone));
                if (string2.equals("NoSound")) {
                    string2 = LocaleController.getString("NoSound", R.string.NoSound);
                }
                textSettingsCell.setTextAndValue(LocaleController.getString("VoipSettingsRingtone", R.string.VoipSettingsRingtone), string2, NotificationsSettingsActivity.this.updateRingtone, false);
                NotificationsSettingsActivity.this.updateRingtone = false;
                return;
            }
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
            SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((BaseFragment) NotificationsSettingsActivity.this).currentAccount);
            int currentTime = ConnectionsManager.getInstance(((BaseFragment) NotificationsSettingsActivity.this).currentAccount).getCurrentTime();
            ArrayList arrayList3 = null;
            if (i != NotificationsSettingsActivity.this.privateRow) {
                if (i != NotificationsSettingsActivity.this.groupRow) {
                    if (i != NotificationsSettingsActivity.this.storiesRow) {
                        if (i == NotificationsSettingsActivity.this.reactionsRow) {
                            string = LocaleController.getString(R.string.NotificationReactions);
                            int i8 = (notificationsSettings3.getBoolean("EnableReactionsMessages", true) || notificationsSettings3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                            i3 = R.drawable.msg_reactions;
                            i4 = i8;
                            arrayList2 = null;
                        } else {
                            string = LocaleController.getString(R.string.NotificationsChannels);
                            arrayList = NotificationsSettingsActivity.this.exceptionChannels;
                            i2 = notificationsSettings3.getInt("EnableChannel2", 0);
                            i3 = R.drawable.msg_channel;
                        }
                    } else {
                        string = LocaleController.getString(R.string.NotificationStories);
                        arrayList3 = NotificationsSettingsActivity.this.exceptionStories;
                        arrayList2 = NotificationsSettingsActivity.this.exceptionAutoStories;
                        i4 = notificationsSettings3.getBoolean("EnableAllStories", false) ? 0 : Integer.MAX_VALUE;
                        i3 = R.drawable.msg_menu_stories;
                    }
                    if (i4 < currentTime) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && i4 - 31536000 < currentTime) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    sb = new StringBuilder();
                    String str = string;
                    int i9 = i5;
                    if (i == NotificationsSettingsActivity.this.reactionsRow) {
                        if (arrayList3 == null && !arrayList3.isEmpty()) {
                            z = i4 < currentTime;
                            if (z) {
                                sb.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                            } else if (i4 - 31536000 >= currentTime) {
                                sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                            } else {
                                sb.append(LocaleController.formatString("NotificationsOffUntil", R.string.NotificationsOffUntil, LocaleController.stringForMessageListDate(i4)));
                            }
                            if (sb.length() != 0) {
                                sb.append(", ");
                            }
                            int size = arrayList3.size();
                            if (i == NotificationsSettingsActivity.this.storiesRow && !notificationsSettings3.contains("EnableAllStories") && arrayList2 != null) {
                                size += arrayList2.size();
                            }
                            sb.append(LocaleController.formatPluralString("Exception", size, new Object[0]));
                        } else if (arrayList2 == null && !arrayList2.isEmpty()) {
                            if (i4 > 0) {
                                sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                            } else {
                                sb.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                            }
                            if (!arrayList2.isEmpty() && !notificationsSettings3.contains("EnableAllStories")) {
                                sb.append(", ");
                                sb.append(LocaleController.formatPluralString("AutoException", arrayList2.size(), new Object[0]));
                            }
                        } else {
                            sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                        }
                        z2 = z;
                    } else if (i4 > 0) {
                        sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        z2 = false;
                    } else {
                        if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                            sb.append(LocaleController.getString(R.string.NotificationReactionsMessages));
                        }
                        if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(LocaleController.getString(R.string.NotificationReactionsStories));
                        }
                        z2 = true;
                    }
                    if (i != NotificationsSettingsActivity.this.reactionsRow) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    notificationsCheckCell.setTextAndValueAndIconAndCheck(str, sb, i3, z2, i9, false, z3);
                }
                string = LocaleController.getString(R.string.NotificationsGroups);
                arrayList = NotificationsSettingsActivity.this.exceptionChats;
                i2 = notificationsSettings3.getInt("EnableGroup2", 0);
                i3 = R.drawable.msg_groups;
            } else {
                string = LocaleController.getString(R.string.NotificationsPrivateChats);
                arrayList = NotificationsSettingsActivity.this.exceptionUsers;
                i2 = notificationsSettings3.getInt("EnableAll2", 0);
                i3 = R.drawable.msg_openprofile;
            }
            int i10 = i2;
            arrayList2 = null;
            arrayList3 = arrayList;
            i4 = i10;
            if (i4 < currentTime) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i5 = 0;
            } else {
                i5 = 2;
            }
            sb = new StringBuilder();
            String str2 = string;
            int i11 = i5;
            if (i == NotificationsSettingsActivity.this.reactionsRow) {
                if (arrayList3 == null) {
                    if (arrayList2 == null) {
                        sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                    } else {
                        sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                    }
                } else if (arrayList2 == null) {
                    sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                } else {
                    sb.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                }
                z2 = z;
            } else if (i4 > 0) {
                sb.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                z2 = false;
            } else {
                if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                    sb.append(LocaleController.getString(R.string.NotificationReactionsMessages));
                }
                if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(LocaleController.getString(R.string.NotificationReactionsStories));
                }
                z2 = true;
            }
            if (i != NotificationsSettingsActivity.this.reactionsRow) {
                z3 = true;
            } else {
                z3 = false;
            }
            notificationsCheckCell.setTextAndValueAndIconAndCheck(str2, sb, i3, z2, i11, false, z3);
        }

        @Override
        public int getItemViewType(int i) {
            if (i == NotificationsSettingsActivity.this.eventsSectionRow || i == NotificationsSettingsActivity.this.otherSectionRow || i == NotificationsSettingsActivity.this.resetSectionRow || i == NotificationsSettingsActivity.this.callsSectionRow || i == NotificationsSettingsActivity.this.badgeNumberSection || i == NotificationsSettingsActivity.this.inappSectionRow || i == NotificationsSettingsActivity.this.notificationsSectionRow || i == NotificationsSettingsActivity.this.accountsSectionRow) {
                return 0;
            }
            if (i == NotificationsSettingsActivity.this.inappSoundRow || i == NotificationsSettingsActivity.this.inappVibrateRow || i == NotificationsSettingsActivity.this.notificationsServiceConnectionRow || i == NotificationsSettingsActivity.this.inappPreviewRow || i == NotificationsSettingsActivity.this.contactJoinedRow || i == NotificationsSettingsActivity.this.pinnedMessageRow || i == NotificationsSettingsActivity.this.notificationsServiceRow || i == NotificationsSettingsActivity.this.badgeNumberMutedRow || i == NotificationsSettingsActivity.this.badgeNumberMessagesRow || i == NotificationsSettingsActivity.this.badgeNumberShowRow || i == NotificationsSettingsActivity.this.inappPriorityRow || i == NotificationsSettingsActivity.this.inchatSoundRow || i == NotificationsSettingsActivity.this.androidAutoAlertRow || i == NotificationsSettingsActivity.this.accountsAllRow) {
                return 1;
            }
            if (i == NotificationsSettingsActivity.this.resetNotificationsRow) {
                return 2;
            }
            if (i == NotificationsSettingsActivity.this.privateRow || i == NotificationsSettingsActivity.this.groupRow || i == NotificationsSettingsActivity.this.channelsRow || i == NotificationsSettingsActivity.this.storiesRow || i == NotificationsSettingsActivity.this.reactionsRow) {
                return 3;
            }
            if (i == NotificationsSettingsActivity.this.eventsSection2Row || i == NotificationsSettingsActivity.this.notificationsSection2Row || i == NotificationsSettingsActivity.this.otherSection2Row || i == NotificationsSettingsActivity.this.resetSection2Row || i == NotificationsSettingsActivity.this.callsSection2Row || i == NotificationsSettingsActivity.this.badgeNumberSection2Row || i == NotificationsSettingsActivity.this.resetNotificationsSectionRow) {
                return 4;
            }
            return i == NotificationsSettingsActivity.this.accountsInfoRow ? 6 : 5;
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, TextCheckCell.class, TextDetailSettingsCell.class, TextSettingsCell.class, NotificationsCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        int i3 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i4 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteLinkText));
        return arrayList;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
