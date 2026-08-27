package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public class NotificationsSettingsActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;

    public org.telegram.ui.Components.zk0 f35557a;
    private int accountsAllRow;

    public boolean f35558b;
    private int badgeNumberMessagesRow;
    private int badgeNumberMutedRow;
    private int badgeNumberShowRow;

    public ek0 f35559c;
    private int channelsRow;
    private int contactJoinedRow;
    public ArrayList d;

    public ArrayList f35560e;

    public ArrayList f35561f;
    private int groupRow;
    public ArrayList h;
    private int inappPreviewRow;
    private int inappPriorityRow;
    private int inappSoundRow;
    private int inappVibrateRow;
    private int inchatSoundRow;

    public ArrayList f35562n;
    private int pinnedMessageRow;
    private int privateRow;

    public int f35563r;
    private int reactionsRow;
    private int resetNotificationsRow;

    public int f35564s;
    private int storiesRow;
    public int v;

    public int f35565w;

    public int f35566x;

    public int f35567y;

    public NotificationsSettingsActivity() {
        super(null);
        this.f35558b = false;
        this.d = null;
        this.f35560e = null;
        this.f35561f = null;
        this.h = null;
        this.f35562n = null;
        this.Q = 0;
    }

    public static void U(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putUsers(arrayList, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putChats(arrayList2, true);
        MessagesController.getInstance(notificationsSettingsActivity.currentAccount).putEncryptedChats(arrayList3, true);
        notificationsSettingsActivity.d = arrayList4;
        notificationsSettingsActivity.f35560e = arrayList5;
        notificationsSettingsActivity.f35561f = arrayList6;
        notificationsSettingsActivity.h = arrayList7;
        notificationsSettingsActivity.f35562n = arrayList8;
        ek0 ek0Var = notificationsSettingsActivity.f35559c;
        if (ek0Var != null) {
            ek0Var.m(notificationsSettingsActivity.privateRow);
            notificationsSettingsActivity.f35559c.m(notificationsSettingsActivity.groupRow);
            notificationsSettingsActivity.f35559c.m(notificationsSettingsActivity.channelsRow);
            notificationsSettingsActivity.f35559c.m(notificationsSettingsActivity.storiesRow);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void V(NotificationsSettingsActivity notificationsSettingsActivity) {
        notificationsSettingsActivity.getMessagesController().enableJoined = true;
        notificationsSettingsActivity.f35558b = false;
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
        editorEdit.clear();
        editorEdit.commit();
        notificationsSettingsActivity.f35560e.clear();
        notificationsSettingsActivity.d.clear();
        notificationsSettingsActivity.f35559c.l();
        if (notificationsSettingsActivity.getParentActivity() != null) {
            Toast.makeText(notificationsSettingsActivity.getParentActivity(), LocaleController.getString("ResetNotificationsText", R.string.ResetNotificationsText), 0).show();
        }
        notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
    }

    public static void W(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, Runnable runnable) {
        boolean z10;
        ArrayList<TLRPC.Chat> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        ArrayList<TLRPC.EncryptedChat> arrayList4;
        int size;
        int i10;
        ArrayList arrayList5;
        int size2;
        int i11;
        int size3;
        int i12;
        int size4;
        int i13;
        TLRPC.User user;
        TLRPC.Chat chat;
        ArrayList arrayList6;
        int i14;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList<TLRPC.EncryptedChat> arrayList11;
        Integer num;
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList17 = new ArrayList<>();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList<TLRPC.User> arrayList20 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList21 = new ArrayList<>();
        ArrayList<TLRPC.EncryptedChat> arrayList22 = new ArrayList<>();
        long j10 = UserConfig.getInstance(notificationsSettingsActivity.currentAccount).clientUserId;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
        Map<String, ?> all = notificationsSettings.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            arrayList21 = arrayList21;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            arrayList20 = arrayList20;
            if (key.startsWith("notify2_")) {
                arrayList11 = arrayList22;
                String strReplace = key.replace("notify2_", "");
                if (strReplace.contains("_")) {
                    arrayList22 = arrayList11;
                } else {
                    Long l10 = Utilities.parseLong(strReplace);
                    ArrayList arrayList23 = arrayList15;
                    arrayList10 = arrayList16;
                    long jLongValue = l10.longValue();
                    if (jLongValue == 0 || jLongValue == j10) {
                        arrayList9 = arrayList23;
                    } else {
                        arrayList9 = arrayList23;
                        fk0 fk0Var = new fk0();
                        fk0Var.d = jLongValue;
                        ArrayList arrayList24 = arrayList13;
                        fk0Var.f38152b = org.telegram.messenger.y1.w("custom_", jLongValue, notificationsSettings, false);
                        int iIntValue = ((Integer) next.getValue()).intValue();
                        fk0Var.f38153c = iIntValue;
                        if (iIntValue != 0 && (num = (Integer) all.get("notifyuntil_".concat(strReplace))) != null) {
                            fk0Var.f38151a = num.intValue();
                        }
                        if (DialogObject.isEncryptedDialog(jLongValue)) {
                            int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                            TLRPC.EncryptedChat encryptedChat = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getEncryptedChat(Integer.valueOf(encryptedChatId));
                            if (encryptedChat == null) {
                                arrayList19.add(Integer.valueOf(encryptedChatId));
                                longSparseArray.put(jLongValue, fk0Var);
                            } else {
                                TLRPC.User user2 = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getUser(Long.valueOf(encryptedChat.user_id));
                                if (user2 == null) {
                                    arrayList17.add(Long.valueOf(encryptedChat.user_id));
                                    longSparseArray.put(encryptedChat.user_id, fk0Var);
                                } else if (user2.deleted) {
                                    arrayList22 = arrayList11;
                                    arrayList16 = arrayList10;
                                    arrayList15 = arrayList9;
                                    arrayList13 = arrayList24;
                                }
                            }
                            arrayList12.add(fk0Var);
                            arrayList13 = arrayList24;
                        } else if (DialogObject.isUserDialog(jLongValue)) {
                            TLRPC.User user3 = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getUser(l10);
                            if (user3 == null) {
                                arrayList17.add(l10);
                                longSparseArray.put(jLongValue, fk0Var);
                            } else if (user3.deleted) {
                                arrayList22 = arrayList11;
                                arrayList16 = arrayList10;
                                arrayList15 = arrayList9;
                                arrayList13 = arrayList24;
                            }
                            arrayList12.add(fk0Var);
                            arrayList13 = arrayList24;
                        } else {
                            long j11 = -jLongValue;
                            TLRPC.Chat chat2 = MessagesController.getInstance(notificationsSettingsActivity.currentAccount).getChat(Long.valueOf(j11));
                            if (chat2 == null) {
                                arrayList18.add(Long.valueOf(j11));
                                longSparseArray.put(jLongValue, fk0Var);
                            } else if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                                if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                                    arrayList13 = arrayList24;
                                    arrayList13.add(fk0Var);
                                } else {
                                    arrayList14.add(fk0Var);
                                    arrayList13 = arrayList24;
                                }
                            }
                            arrayList22 = arrayList11;
                            arrayList16 = arrayList10;
                            arrayList15 = arrayList9;
                            arrayList13 = arrayList24;
                        }
                    }
                }
            } else {
                arrayList9 = arrayList15;
                arrayList10 = arrayList16;
                arrayList11 = arrayList22;
            }
            arrayList22 = arrayList11;
            arrayList16 = arrayList10;
            arrayList15 = arrayList9;
        }
        ArrayList arrayList25 = arrayList15;
        ArrayList arrayList26 = arrayList16;
        ArrayList<TLRPC.User> arrayList27 = arrayList20;
        ArrayList<TLRPC.EncryptedChat> arrayList28 = arrayList22;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            z10 = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next2 = it2.next();
            String key2 = next2.getKey();
            if (key2.startsWith("stories_")) {
                try {
                    Long l11 = Utilities.parseLong(key2.substring(8));
                    long jLongValue2 = l11.longValue();
                    if (jLongValue2 != 0 && jLongValue2 != j10) {
                        fk0 fk0Var2 = new fk0();
                        fk0Var2.d = jLongValue2;
                        fk0Var2.f38153c = ((Boolean) next2.getValue()).booleanValue() ? 0 : Integer.MAX_VALUE;
                        fk0Var2.f38154e = true;
                        if (DialogObject.isUserDialog(jLongValue2)) {
                            TLRPC.User user4 = notificationsSettingsActivity.getMessagesController().getUser(l11);
                            try {
                                if (user4 == null) {
                                    try {
                                        arrayList17.add(l11);
                                        longSparseArray.put(jLongValue2, fk0Var2);
                                    } catch (Exception unused) {
                                        arrayList8 = arrayList25;
                                    }
                                } else if (user4.deleted) {
                                }
                                arrayList8.add(fk0Var2);
                                hashSet.add(l11);
                            } catch (Exception unused2) {
                            }
                            arrayList8 = arrayList25;
                            arrayList25 = arrayList8;
                        }
                    }
                } catch (Exception unused3) {
                    arrayList8 = arrayList25;
                }
            }
            arrayList8 = arrayList25;
            arrayList25 = arrayList8;
        }
        ArrayList arrayList29 = arrayList25;
        ArrayList arrayList30 = arrayList;
        Collections.sort(arrayList30, Comparator$CC.comparingDouble(new hh.a1(6)));
        int iMax = Math.max(0, arrayList30.size() - 5);
        while (iMax < arrayList30.size()) {
            long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList30.get(iMax)).peer);
            if (hashSet.contains(Long.valueOf(peerDialogId))) {
                i14 = iMax;
            } else {
                fk0 fk0Var3 = new fk0();
                fk0Var3.d = peerDialogId;
                i14 = iMax;
                fk0Var3.f38153c = 0;
                fk0Var3.f38155f = z10;
                fk0Var3.f38154e = z10;
                if (DialogObject.isUserDialog(peerDialogId)) {
                    TLRPC.User user5 = notificationsSettingsActivity.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    if (user5 == null) {
                        arrayList17.add(Long.valueOf(peerDialogId));
                        longSparseArray.put(peerDialogId, fk0Var3);
                    } else if (user5.deleted) {
                    }
                    arrayList7 = arrayList26;
                    arrayList7.add(0, fk0Var3);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
                arrayList26 = arrayList7;
                iMax = i14 + 1;
                z10 = true;
                arrayList30 = arrayList;
            }
            arrayList7 = arrayList26;
            arrayList26 = arrayList7;
            iMax = i14 + 1;
            z10 = true;
            arrayList30 = arrayList;
        }
        ArrayList arrayList31 = arrayList26;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList19.isEmpty()) {
                    arrayList4 = arrayList28;
                } else {
                    try {
                        arrayList4 = arrayList28;
                        try {
                            MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount).getEncryptedChatsInternal(TextUtils.join(",", arrayList19), arrayList4, arrayList17);
                        } catch (Exception e9) {
                            e = e9;
                            arrayList2 = arrayList21;
                            arrayList3 = arrayList27;
                            FileLog.e(e);
                            size = arrayList2.size();
                            i10 = 0;
                            while (i10 < size) {
                                chat = arrayList2.get(i10);
                                if (chat.left) {
                                    arrayList6 = arrayList31;
                                } else {
                                    arrayList6 = arrayList31;
                                }
                                i10++;
                                arrayList31 = arrayList6;
                            }
                            arrayList5 = arrayList31;
                            size2 = arrayList3.size();
                            for (i11 = 0; i11 < size2; i11++) {
                                user = arrayList3.get(i11);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.f22527id);
                                }
                            }
                            size3 = arrayList4.size();
                            for (i12 = 0; i12 < size3; i12++) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
                            }
                            size4 = longSparseArray.size();
                            for (i13 = 0; i13 < size4; i13++) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                                    arrayList13.remove(longSparseArray.valueAt(i13));
                                    arrayList14.remove(longSparseArray.valueAt(i13));
                                } else {
                                    arrayList12.remove(longSparseArray.valueAt(i13));
                                }
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.xb(notificationsSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList12, arrayList13, arrayList14, arrayList29, arrayList5, runnable));
                        }
                    } catch (Exception e10) {
                        e = e10;
                        arrayList4 = arrayList28;
                        arrayList2 = arrayList21;
                        arrayList3 = arrayList27;
                        FileLog.e(e);
                        size = arrayList2.size();
                        i10 = 0;
                        while (i10 < size) {
                            chat = arrayList2.get(i10);
                            if (chat.left) {
                                arrayList6 = arrayList31;
                            } else {
                                arrayList6 = arrayList31;
                            }
                            i10++;
                            arrayList31 = arrayList6;
                        }
                        arrayList5 = arrayList31;
                        size2 = arrayList3.size();
                        while (i11 < size2) {
                            user = arrayList3.get(i11);
                            if (!user.deleted) {
                                longSparseArray.remove(user.f22527id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i12 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
                        }
                        size4 = longSparseArray.size();
                        while (i13 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                                arrayList13.remove(longSparseArray.valueAt(i13));
                                arrayList14.remove(longSparseArray.valueAt(i13));
                            } else {
                                arrayList12.remove(longSparseArray.valueAt(i13));
                            }
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.xb(notificationsSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList12, arrayList13, arrayList14, arrayList29, arrayList5, runnable));
                    }
                }
                if (arrayList17.isEmpty()) {
                    arrayList3 = arrayList27;
                } else {
                    try {
                        arrayList3 = arrayList27;
                        try {
                            MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount).getUsersInternal(arrayList17, arrayList3);
                        } catch (Exception e11) {
                            e = e11;
                            arrayList2 = arrayList21;
                            FileLog.e(e);
                            size = arrayList2.size();
                            i10 = 0;
                            while (i10 < size) {
                                chat = arrayList2.get(i10);
                                if (chat.left) {
                                    arrayList6 = arrayList31;
                                } else {
                                    arrayList6 = arrayList31;
                                }
                                i10++;
                                arrayList31 = arrayList6;
                            }
                            arrayList5 = arrayList31;
                            size2 = arrayList3.size();
                            while (i11 < size2) {
                                user = arrayList3.get(i11);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.f22527id);
                                }
                            }
                            size3 = arrayList4.size();
                            while (i12 < size3) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
                            }
                            size4 = longSparseArray.size();
                            while (i13 < size4) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                                    arrayList13.remove(longSparseArray.valueAt(i13));
                                    arrayList14.remove(longSparseArray.valueAt(i13));
                                } else {
                                    arrayList12.remove(longSparseArray.valueAt(i13));
                                }
                            }
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.xb(notificationsSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList12, arrayList13, arrayList14, arrayList29, arrayList5, runnable));
                        }
                    } catch (Exception e12) {
                        e = e12;
                        arrayList3 = arrayList27;
                        arrayList2 = arrayList21;
                        FileLog.e(e);
                        size = arrayList2.size();
                        i10 = 0;
                        while (i10 < size) {
                            chat = arrayList2.get(i10);
                            if (chat.left) {
                                arrayList6 = arrayList31;
                            } else {
                                arrayList6 = arrayList31;
                            }
                            i10++;
                            arrayList31 = arrayList6;
                        }
                        arrayList5 = arrayList31;
                        size2 = arrayList3.size();
                        while (i11 < size2) {
                            user = arrayList3.get(i11);
                            if (!user.deleted) {
                                longSparseArray.remove(user.f22527id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i12 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
                        }
                        size4 = longSparseArray.size();
                        while (i13 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                                arrayList13.remove(longSparseArray.valueAt(i13));
                                arrayList14.remove(longSparseArray.valueAt(i13));
                            } else {
                                arrayList12.remove(longSparseArray.valueAt(i13));
                            }
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.xb(notificationsSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList12, arrayList13, arrayList14, arrayList29, arrayList5, runnable));
                    }
                }
                if (arrayList18.isEmpty()) {
                    arrayList2 = arrayList21;
                } else {
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(notificationsSettingsActivity.currentAccount);
                    String strJoin = TextUtils.join(",", arrayList18);
                    arrayList2 = arrayList21;
                    try {
                        messagesStorage.getChatsInternal(strJoin, arrayList2);
                    } catch (Exception e13) {
                        e = e13;
                        FileLog.e(e);
                    }
                }
            } catch (Exception e14) {
                e = e14;
                arrayList2 = arrayList21;
                arrayList3 = arrayList27;
                arrayList4 = arrayList28;
            }
            size = arrayList2.size();
            i10 = 0;
            while (i10 < size) {
                chat = arrayList2.get(i10);
                if (chat.left || chat.kicked || chat.migrated_to != null) {
                    arrayList6 = arrayList31;
                } else {
                    fk0 fk0Var4 = (fk0) longSparseArray.get(-chat.f22380id);
                    arrayList6 = arrayList31;
                    longSparseArray.remove(-chat.f22380id);
                    if (fk0Var4 != null) {
                        if (!ChatObject.isChannel(chat) || chat.megagroup) {
                            arrayList13.add(fk0Var4);
                        } else {
                            arrayList14.add(fk0Var4);
                        }
                    }
                }
                i10++;
                arrayList31 = arrayList6;
            }
            arrayList5 = arrayList31;
            size2 = arrayList3.size();
            while (i11 < size2) {
                user = arrayList3.get(i11);
                if (!user.deleted) {
                    longSparseArray.remove(user.f22527id);
                }
            }
            size3 = arrayList4.size();
            while (i12 < size3) {
                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i12).f22388id));
            }
            size4 = longSparseArray.size();
            while (i13 < size4) {
                if (DialogObject.isChatDialog(longSparseArray.keyAt(i13))) {
                    arrayList13.remove(longSparseArray.valueAt(i13));
                    arrayList14.remove(longSparseArray.valueAt(i13));
                } else {
                    arrayList12.remove(longSparseArray.valueAt(i13));
                }
            }
        } else {
            arrayList5 = arrayList31;
            arrayList2 = arrayList21;
            arrayList3 = arrayList27;
            arrayList4 = arrayList28;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.xb(notificationsSettingsActivity, arrayList3, arrayList2, arrayList4, arrayList12, arrayList13, arrayList14, arrayList29, arrayList5, runnable));
    }

    public static void X(NotificationsSettingsActivity notificationsSettingsActivity, int i10, int i11) {
        int i12 = 5;
        if (i11 != 1) {
            if (i11 == 2) {
                i12 = 10;
            } else if (i11 == 3) {
                i12 = 30;
            } else if (i11 == 4) {
                i12 = 60;
            } else if (i11 == 5) {
                i12 = 120;
            } else {
                i12 = i11 == 6 ? 240 : 0;
            }
        }
        MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit().putInt("repeat_messages", i12).commit();
        notificationsSettingsActivity.T = true;
        notificationsSettingsActivity.f35559c.m(i10);
    }

    public static void Y(NotificationsSettingsActivity notificationsSettingsActivity, View view, int i10, float f10) {
        ArrayList arrayList;
        boolean zIsGlobalNotificationsEnabled;
        ArrayList arrayList2;
        int i11;
        boolean z10;
        ArrayList arrayList3;
        String pluralString;
        ArrayList arrayList4;
        if (notificationsSettingsActivity.getParentActivity() == null) {
            return;
        }
        int i12 = notificationsSettingsActivity.privateRow;
        String pluralString2 = null;
        parcelable = null;
        Parcelable parcelable = null;
        pluralString2 = null;
        pluralString2 = null;
        boolean z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        if (i10 != i12 && i10 != notificationsSettingsActivity.groupRow && i10 != notificationsSettingsActivity.channelsRow && i10 != notificationsSettingsActivity.storiesRow && i10 != notificationsSettingsActivity.reactionsRow) {
            if (i10 == notificationsSettingsActivity.E) {
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
                    notificationsSettingsActivity.startActivityForResult(intent, i10);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            } else if (i10 == notificationsSettingsActivity.resetNotificationsRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                String string2 = LocaleController.getString("ResetNotificationsAlertTitle", R.string.ResetNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.N = string2;
                b2Var.P = LocaleController.getString("ResetNotificationsAlert", R.string.ResetNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString("Reset", R.string.Reset), new dk0(notificationsSettingsActivity));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                notificationsSettingsActivity.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                }
            } else if (i10 == notificationsSettingsActivity.inappSoundRow) {
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit = notificationsSettings2.edit();
                z11 = notificationsSettings2.getBoolean("EnableInAppSounds", true);
                editorEdit.putBoolean("EnableInAppSounds", !z11);
                editorEdit.commit();
            } else if (i10 == notificationsSettingsActivity.inappVibrateRow) {
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit2 = notificationsSettings3.edit();
                z11 = notificationsSettings3.getBoolean("EnableInAppVibrate", true);
                editorEdit2.putBoolean("EnableInAppVibrate", !z11);
                editorEdit2.commit();
            } else if (i10 == notificationsSettingsActivity.inappPreviewRow) {
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit3 = notificationsSettings4.edit();
                z11 = notificationsSettings4.getBoolean("EnableInAppPreview", true);
                editorEdit3.putBoolean("EnableInAppPreview", !z11);
                editorEdit3.commit();
            } else if (i10 == notificationsSettingsActivity.inchatSoundRow) {
                SharedPreferences notificationsSettings5 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit4 = notificationsSettings5.edit();
                z11 = notificationsSettings5.getBoolean("EnableInChatSound", true);
                boolean z12 = !z11;
                editorEdit4.putBoolean("EnableInChatSound", z12);
                editorEdit4.commit();
                notificationsSettingsActivity.getNotificationsController().setInChatSoundEnabled(z12);
            } else if (i10 == notificationsSettingsActivity.inappPriorityRow) {
                SharedPreferences notificationsSettings6 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                SharedPreferences.Editor editorEdit5 = notificationsSettings6.edit();
                z11 = notificationsSettings6.getBoolean("EnableInAppPopup", true);
                editorEdit5.putBoolean("EnableInAppPopup", !z11);
                editorEdit5.commit();
            } else {
                int i13 = 5;
                if (i10 == notificationsSettingsActivity.contactJoinedRow) {
                    SharedPreferences notificationsSettings7 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                    SharedPreferences.Editor editorEdit6 = notificationsSettings7.edit();
                    z11 = notificationsSettings7.getBoolean("EnableContactJoined", true);
                    boolean z13 = !z11;
                    MessagesController.getInstance(notificationsSettingsActivity.currentAccount).enableJoined = z13;
                    editorEdit6.putBoolean("EnableContactJoined", z13);
                    editorEdit6.commit();
                    TL_account.setContactSignUpNotification setcontactsignupnotification = new TL_account.setContactSignUpNotification();
                    setcontactsignupnotification.silent = z11;
                    ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(setcontactsignupnotification, new jh.m5(i13));
                } else if (i10 == notificationsSettingsActivity.pinnedMessageRow) {
                    SharedPreferences notificationsSettings8 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                    SharedPreferences.Editor editorEdit7 = notificationsSettings8.edit();
                    z11 = notificationsSettings8.getBoolean("PinnedMessages", true);
                    editorEdit7.putBoolean("PinnedMessages", !z11);
                    editorEdit7.commit();
                } else if (i10 == notificationsSettingsActivity.L) {
                    SharedPreferences notificationsSettings9 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                    SharedPreferences.Editor editorEdit8 = notificationsSettings9.edit();
                    z11 = notificationsSettings9.getBoolean("EnableAutoNotifications", false);
                    editorEdit8.putBoolean("EnableAutoNotifications", !z11);
                    editorEdit8.commit();
                } else if (i10 == notificationsSettingsActivity.badgeNumberShowRow) {
                    SharedPreferences.Editor editorEdit9 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                    z11 = notificationsSettingsActivity.getNotificationsController().showBadgeNumber;
                    notificationsSettingsActivity.getNotificationsController().showBadgeNumber = !z11;
                    editorEdit9.putBoolean("badgeNumber", notificationsSettingsActivity.getNotificationsController().showBadgeNumber);
                    editorEdit9.commit();
                    notificationsSettingsActivity.getNotificationsController().updateBadge();
                } else if (i10 == notificationsSettingsActivity.badgeNumberMutedRow) {
                    SharedPreferences.Editor editorEdit10 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                    z11 = notificationsSettingsActivity.getNotificationsController().showBadgeMuted;
                    notificationsSettingsActivity.getNotificationsController().showBadgeMuted = !z11;
                    editorEdit10.putBoolean("badgeNumberMuted", notificationsSettingsActivity.getNotificationsController().showBadgeMuted);
                    editorEdit10.commit();
                    notificationsSettingsActivity.getNotificationsController().updateBadge();
                    notificationsSettingsActivity.getMessagesStorage().updateMutedDialogsFiltersCounters();
                } else if (i10 == notificationsSettingsActivity.badgeNumberMessagesRow) {
                    SharedPreferences.Editor editorEdit11 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount).edit();
                    z11 = notificationsSettingsActivity.getNotificationsController().showBadgeMessages;
                    notificationsSettingsActivity.getNotificationsController().showBadgeMessages = !z11;
                    editorEdit11.putBoolean("badgeNumberMessages", notificationsSettingsActivity.getNotificationsController().showBadgeMessages);
                    editorEdit11.commit();
                    notificationsSettingsActivity.getNotificationsController().updateBadge();
                } else if (i10 == notificationsSettingsActivity.f35565w) {
                    SharedPreferences notificationsSettings10 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                    z10 = notificationsSettings10.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().backgroundConnection);
                    SharedPreferences.Editor editorEdit12 = notificationsSettings10.edit();
                    editorEdit12.putBoolean("pushConnection", !z10);
                    editorEdit12.commit();
                    if (z10) {
                        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(false);
                    } else {
                        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).setPushConnectionEnabled(true);
                    }
                } else if (i10 == notificationsSettingsActivity.accountsAllRow) {
                    SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
                    boolean z14 = globalNotificationsSettings.getBoolean("AllAccounts", true);
                    SharedPreferences.Editor editorEdit13 = globalNotificationsSettings.edit();
                    boolean z15 = !z14;
                    editorEdit13.putBoolean("AllAccounts", z15);
                    editorEdit13.commit();
                    SharedConfig.showNotificationsForAllAccounts = z15;
                    for (int i14 = 0; i14 < 4; i14++) {
                        if (SharedConfig.showNotificationsForAllAccounts) {
                            NotificationsController.getInstance(i14).showNotifications();
                        } else if (i14 == notificationsSettingsActivity.currentAccount) {
                            NotificationsController.getInstance(i14).showNotifications();
                        } else {
                            NotificationsController.getInstance(i14).hideNotifications();
                        }
                    }
                    z11 = z14;
                } else if (i10 == notificationsSettingsActivity.v) {
                    SharedPreferences notificationsSettings11 = MessagesController.getNotificationsSettings(notificationsSettingsActivity.currentAccount);
                    z11 = notificationsSettings11.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().keepAliveService);
                    SharedPreferences.Editor editorEdit14 = notificationsSettings11.edit();
                    editorEdit14.putBoolean("pushService", !z11);
                    editorEdit14.commit();
                    ApplicationLoader.startPushService();
                } else if (i10 == notificationsSettingsActivity.D) {
                    if (notificationsSettingsActivity.getParentActivity() == null) {
                        return;
                    } else {
                        notificationsSettingsActivity.showDialog(org.telegram.ui.Components.y4.Y(notificationsSettingsActivity.getParentActivity(), 0L, 0L, i10 == notificationsSettingsActivity.D ? "vibrate_calls" : null, new org.telegram.ui.Components.xl(notificationsSettingsActivity, i10, 17), null));
                    }
                } else if (i10 == notificationsSettingsActivity.M) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                    String string3 = LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                    b2Var2.N = string3;
                    alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString("RepeatDisabled", R.string.RepeatDisabled), LocaleController.formatPluralString("Minutes", 5, new Object[0]), LocaleController.formatPluralString("Minutes", 10, new Object[0]), LocaleController.formatPluralString("Minutes", 30, new Object[0]), LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Hours", 2, new Object[0]), LocaleController.formatPluralString("Hours", 4, new Object[0])}, new ky(notificationsSettingsActivity, i10, 1));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    notificationsSettingsActivity.showDialog(b2Var2);
                }
            }
            if (view instanceof org.telegram.ui.Cells.p8) {
                ((org.telegram.ui.Cells.p8) view).setChecked(!z11);
            }
        }
        if (i10 == i12) {
            arrayList = notificationsSettingsActivity.d;
            zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(1);
            arrayList2 = null;
            i11 = 1;
        } else if (i10 == notificationsSettingsActivity.groupRow) {
            arrayList = notificationsSettingsActivity.f35560e;
            zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(0);
            arrayList2 = null;
            i11 = 0;
        } else if (i10 == notificationsSettingsActivity.storiesRow) {
            arrayList = notificationsSettingsActivity.h;
            ArrayList arrayList5 = notificationsSettingsActivity.f35562n;
            zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableAllStories", false);
            arrayList2 = arrayList5;
            i11 = 3;
        } else if (i10 == notificationsSettingsActivity.reactionsRow) {
            zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsMessages", true) || notificationsSettingsActivity.getNotificationsSettings().getBoolean("EnableReactionsStories", true);
            arrayList = null;
            arrayList2 = null;
            i11 = 4;
        } else {
            arrayList = notificationsSettingsActivity.f35561f;
            zIsGlobalNotificationsEnabled = notificationsSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(2);
            arrayList2 = null;
            i11 = 2;
        }
        if (arrayList == null && i11 != 4) {
            return;
        }
        org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
        if ((!LocaleController.isRTL || f10 > AndroidUtilities.dp(76.0f)) && (LocaleController.isRTL || f10 < view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            int i15 = i11;
            z10 = zIsGlobalNotificationsEnabled;
            notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(i15, arrayList, arrayList2, false));
        } else {
            boolean z16 = zIsGlobalNotificationsEnabled;
            org.telegram.messenger.nj njVar = new org.telegram.messenger.nj(notificationsSettingsActivity, i11, z16, g5Var, i10);
            z10 = z16;
            if (i10 == notificationsSettingsActivity.storiesRow) {
                arrayList3 = notificationsSettingsActivity.h;
                arrayList4 = notificationsSettingsActivity.f35562n;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    pluralString2 = LocaleController.formatPluralString("ChatsException", arrayList3.size(), new Object[0]);
                }
            } else if (i10 == notificationsSettingsActivity.privateRow) {
                arrayList3 = notificationsSettingsActivity.d;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    arrayList4 = null;
                } else {
                    pluralString = LocaleController.formatPluralString("ChatsException", arrayList3.size(), new Object[0]);
                    arrayList4 = null;
                    pluralString2 = pluralString;
                }
            } else if (i10 == notificationsSettingsActivity.groupRow) {
                arrayList3 = notificationsSettingsActivity.f35560e;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    arrayList4 = null;
                } else {
                    pluralString = LocaleController.formatPluralString("Groups", arrayList3.size(), new Object[0]);
                    arrayList4 = null;
                    pluralString2 = pluralString;
                }
            } else if (i10 == notificationsSettingsActivity.reactionsRow) {
                njVar.run();
            } else {
                arrayList3 = notificationsSettingsActivity.f35561f;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    arrayList4 = null;
                } else {
                    pluralString = LocaleController.formatPluralString("Channels", arrayList3.size(), new Object[0]);
                    arrayList4 = null;
                    pluralString2 = pluralString;
                }
            }
            if (pluralString2 == null) {
                njVar.run();
            } else {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(notificationsSettingsActivity.getParentActivity());
                int size = arrayList3.size();
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
                if (size == 1) {
                    b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsSingleAlert, pluralString2));
                } else {
                    b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.NotificationsExceptionsAlert, pluralString2));
                }
                b2Var3.N = LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions);
                alertDialog$Builder3.i(LocaleController.getString("ViewExceptions", R.string.ViewExceptions), new b7(notificationsSettingsActivity, arrayList3, arrayList4, 16));
                alertDialog$Builder3.h(LocaleController.getString("OK", R.string.OK), new zt(njVar, 26));
                notificationsSettingsActivity.showDialog(b2Var3);
            }
        }
        z11 = z10;
        if (view instanceof org.telegram.ui.Cells.p8) {
            ((org.telegram.ui.Cells.p8) view).setChecked(!z11);
        }
    }

    public static void Z(NotificationsSettingsActivity notificationsSettingsActivity) {
        if (notificationsSettingsActivity.f35558b) {
            return;
        }
        notificationsSettingsActivity.f35558b = true;
        ConnectionsManager.getInstance(notificationsSettingsActivity.currentAccount).sendRequest(new TL_account.resetNotifySettings(), new n(notificationsSettingsActivity, 15));
    }

    public final void A0(xs xsVar) {
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new bf0(this, new ArrayList(MediaDataController.getInstance(this.currentAccount).hints), xsVar, 9));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsAndSounds));
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 7));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f35557a = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35557a);
        this.f35557a.setItemAnimator(null);
        this.f35557a.setLayoutAnimation(null);
        this.f35557a.setLayoutManager(new j(i10, false, 11));
        this.f35557a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35557a, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var2 = this.f35557a;
        ek0 ek0Var = new ek0(this, context);
        this.f35559c = ek0Var;
        zk0Var2.setAdapter(ek0Var);
        this.f35557a.setOnItemClickListener(new dk0(this));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            this.f35559c.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 16, new Class[]{org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.g5.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.M6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35557a, 2, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String string;
        Ringtone ringtone;
        if (i11 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                string = null;
            } else {
                if (i10 == this.E) {
                    string = uri.equals(Settings.System.DEFAULT_RINGTONE_URI) ? LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone) : ringtone.getTitle(getParentActivity());
                } else {
                    string = uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI) ? LocaleController.getString("SoundDefault", R.string.SoundDefault) : ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            if (i10 == this.E) {
                if (string == null || uri == null) {
                    editorEdit.putString("CallsRingtone", "NoSound");
                    editorEdit.putString("CallsRingtonePath", "NoSound");
                } else {
                    editorEdit.putString("CallsRingtone", string);
                    editorEdit.putString("CallsRingtonePath", uri.toString());
                }
                this.S = true;
            }
            editorEdit.commit();
            this.f35559c.m(i10);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController.getInstance(this.currentAccount).loadSignUpNotificationsSettings();
        A0(null);
        if (UserConfig.getActivatedAccountsCount() > 1) {
            int i10 = this.Q;
            this.f35563r = i10;
            this.accountsAllRow = i10 + 1;
            this.Q = i10 + 3;
            this.f35564s = i10 + 2;
        } else {
            this.f35563r = -1;
            this.accountsAllRow = -1;
            this.f35564s = -1;
        }
        int i11 = this.Q;
        this.f35566x = i11;
        this.privateRow = i11 + 1;
        this.groupRow = i11 + 2;
        this.channelsRow = i11 + 3;
        this.storiesRow = i11 + 4;
        this.reactionsRow = i11 + 5;
        this.f35567y = i11 + 6;
        this.C = i11 + 7;
        this.D = i11 + 8;
        this.E = i11 + 9;
        this.F = i11 + 10;
        this.J = i11 + 11;
        this.badgeNumberShowRow = i11 + 12;
        this.badgeNumberMutedRow = i11 + 13;
        this.badgeNumberMessagesRow = i11 + 14;
        this.K = i11 + 15;
        this.A = i11 + 16;
        this.inappSoundRow = i11 + 17;
        this.inappVibrateRow = i11 + 18;
        this.inappPreviewRow = i11 + 19;
        this.inchatSoundRow = i11 + 20;
        this.inappPriorityRow = i11 + 21;
        this.B = i11 + 22;
        this.G = i11 + 23;
        this.contactJoinedRow = i11 + 24;
        this.pinnedMessageRow = i11 + 25;
        this.H = i11 + 26;
        this.I = i11 + 27;
        this.v = i11 + 28;
        this.f35565w = i11 + 29;
        this.L = -1;
        this.M = i11 + 30;
        this.N = i11 + 31;
        this.O = i11 + 32;
        this.resetNotificationsRow = i11 + 33;
        this.Q = i11 + 35;
        this.P = i11 + 34;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getMessagesController().reloadReactionsNotifySettings();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35557a.setPadding(0, 0, 0, i13);
        this.f35557a.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ek0 ek0Var = this.f35559c;
        if (ek0Var != null) {
            ek0Var.l();
        }
    }
}
