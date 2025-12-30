package org.telegram.ui.Business;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;

public class BusinessLinksController {
    private static volatile BusinessLinksController[] Instance = new BusinessLinksController[4];
    private static final Object[] lockObjects = new Object[4];
    public final int currentAccount;
    public final ArrayList links = new ArrayList();
    private boolean loading = false;
    private boolean loaded = false;

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static BusinessLinksController getInstance(int i) {
        BusinessLinksController businessLinksController = Instance[i];
        if (businessLinksController == null) {
            synchronized (lockObjects[i]) {
                try {
                    businessLinksController = Instance[i];
                    if (businessLinksController == null) {
                        BusinessLinksController[] businessLinksControllerArr = Instance;
                        BusinessLinksController businessLinksController2 = new BusinessLinksController(i);
                        businessLinksControllerArr[i] = businessLinksController2;
                        businessLinksController = businessLinksController2;
                    }
                } finally {
                }
            }
        }
        return businessLinksController;
    }

    private BusinessLinksController(int i) {
        this.currentAccount = i;
    }

    public static String stripHttps(String str) {
        return str.startsWith("https://") ? str.substring(8) : str;
    }

    public boolean canAddNew() {
        return this.links.size() < MessagesController.getInstance(this.currentAccount).businessChatLinksLimit;
    }

    public void load(boolean z) {
        if (!this.loaded) {
            load(true, z);
        } else if (z) {
            load(false, true);
        }
    }

    private void load(boolean z, final boolean z2) {
        if (this.loading) {
            return;
        }
        if (!this.loaded || (z2 && !z)) {
            this.loading = true;
            if (z) {
                final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
                messagesStorage.getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$load$1(messagesStorage, z2);
                    }
                });
            } else {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getBusinessChatLinks(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$load$3(tLObject, tL_error);
                    }
                });
            }
        }
    }

    public void lambda$load$1(MessagesStorage messagesStorage, final boolean z) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        final ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        try {
            try {
                sQLiteCursorQueryFinalized = messagesStorage.getDatabase().queryFinalized("SELECT data FROM business_links ORDER BY order_value ASC", new Object[0]);
                while (sQLiteCursorQueryFinalized.next()) {
                    NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                    arrayList.add(TL_account.TL_businessChatLink.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(false), false));
                }
                sQLiteCursorQueryFinalized.dispose();
                ArrayList<Long> arrayList4 = new ArrayList<>();
                ArrayList arrayList5 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i);
                    if (!tL_businessChatLink.entities.isEmpty()) {
                        for (int i2 = 0; i2 < tL_businessChatLink.entities.size(); i2++) {
                            TLRPC.MessageEntity messageEntity = tL_businessChatLink.entities.get(i2);
                            if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                arrayList4.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                            } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                arrayList4.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                            }
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    messagesStorage.getUsersInternal(arrayList4, arrayList2);
                }
                if (!arrayList5.isEmpty()) {
                    messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLiteCursorQueryFinalized != null) {
                }
            }
            sQLiteCursorQueryFinalized.dispose();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$load$0(arrayList, arrayList2, arrayList3, z);
                }
            });
        } catch (Throwable th) {
            if (sQLiteCursorQueryFinalized != null) {
                sQLiteCursorQueryFinalized.dispose();
            }
            throw th;
        }
    }

    public void lambda$load$0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z) {
        this.links.clear();
        this.links.addAll(arrayList);
        MessagesController.getInstance(this.currentAccount).putUsers(arrayList2, true);
        MessagesController.getInstance(this.currentAccount).putChats(arrayList3, true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        this.loading = false;
        load(false, z);
    }

    public void lambda$load$3(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$load$2(tLObject);
            }
        });
    }

    public void lambda$load$2(TLObject tLObject) {
        if (tLObject instanceof TL_account.businessChatLinks) {
            TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject;
            this.links.clear();
            this.links.addAll(businesschatlinks.links);
            MessagesController.getInstance(this.currentAccount).putUsers(businesschatlinks.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(businesschatlinks.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(businesschatlinks.users, businesschatlinks.chats, true, true);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            saveToCache();
        } else {
            FileLog.e(new RuntimeException("Unexpected response from server!"));
        }
        this.loading = false;
        this.loaded = true;
    }

    public void createEmptyLink() {
        TL_account.createBusinessChatLink createbusinesschatlink = new TL_account.createBusinessChatLink();
        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
        createbusinesschatlink.link = tL_inputBusinessChatLink;
        tL_inputBusinessChatLink.message = "";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(createbusinesschatlink, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$createEmptyLink$5(tLObject, tL_error);
            }
        });
    }

    public void lambda$createEmptyLink$5(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createEmptyLink$4(tLObject);
            }
        });
    }

    public void lambda$createEmptyLink$4(TLObject tLObject) {
        if (tLObject instanceof TL_account.TL_businessChatLink) {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject;
            this.links.add(tL_businessChatLink);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinkCreated, tL_businessChatLink);
            saveToCache();
        }
    }

    public void deleteLinkUndoable(BaseFragment baseFragment, final String str) {
        final TL_account.TL_businessChatLink tL_businessChatLinkFindLink = findLink(str);
        if (tL_businessChatLinkFindLink != null) {
            final int iIndexOf = this.links.indexOf(tL_businessChatLinkFindLink);
            this.links.remove(tL_businessChatLinkFindLink);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            BulletinFactory.of(baseFragment).createUndoBulletin(LocaleController.getString(R.string.BusinessLinkDeleted), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteLinkUndoable$6(iIndexOf, tL_businessChatLinkFindLink);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$deleteLinkUndoable$9(str, tL_businessChatLinkFindLink);
                }
            }).show();
        }
    }

    public void lambda$deleteLinkUndoable$6(int i, TL_account.TL_businessChatLink tL_businessChatLink) {
        this.links.add(i, tL_businessChatLink);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
    }

    public void lambda$deleteLinkUndoable$9(String str, final TL_account.TL_businessChatLink tL_businessChatLink) {
        TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
        deletebusinesschatlink.slug = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletebusinesschatlink, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$deleteLinkUndoable$8(tL_businessChatLink, tLObject, tL_error);
            }
        });
    }

    public void lambda$deleteLinkUndoable$8(final TL_account.TL_businessChatLink tL_businessChatLink, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteLinkUndoable$7(tLObject, tL_businessChatLink);
            }
        });
    }

    public void lambda$deleteLinkUndoable$7(TLObject tLObject, TL_account.TL_businessChatLink tL_businessChatLink) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            if (this.links.contains(tL_businessChatLink)) {
                this.links.remove(tL_businessChatLink);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            }
            saveToCache();
            return;
        }
        FileLog.e(new RuntimeException("Unexpected response from server!"));
    }

    public void editLinkMessage(String str, String str2, ArrayList arrayList, Runnable runnable) {
        TL_account.TL_businessChatLink tL_businessChatLinkFindLink = findLink(str);
        if (tL_businessChatLinkFindLink == null) {
            return;
        }
        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
        tL_inputBusinessChatLink.message = str2;
        tL_inputBusinessChatLink.entities = arrayList;
        tL_inputBusinessChatLink.title = tL_businessChatLinkFindLink.title;
        editLink(tL_businessChatLinkFindLink, tL_inputBusinessChatLink, runnable);
    }

    public void editLinkTitle(String str, String str2) {
        TL_account.TL_businessChatLink tL_businessChatLinkFindLink = findLink(str);
        if (tL_businessChatLinkFindLink == null) {
            return;
        }
        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
        tL_inputBusinessChatLink.message = tL_businessChatLinkFindLink.message;
        tL_inputBusinessChatLink.entities = tL_businessChatLinkFindLink.entities;
        tL_inputBusinessChatLink.title = str2;
        editLink(tL_businessChatLinkFindLink, tL_inputBusinessChatLink, null);
    }

    private void saveToCache() {
        final ArrayList arrayList = new ArrayList(this.links);
        final MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                BusinessLinksController.lambda$saveToCache$10(messagesStorage, arrayList);
            }
        });
    }

    public static void lambda$saveToCache$10(MessagesStorage messagesStorage, ArrayList arrayList) {
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        try {
            try {
                SQLiteDatabase database = messagesStorage.getDatabase();
                database.executeFast("DELETE FROM business_links").stepThis().dispose();
                sQLitePreparedStatementExecuteFast = database.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                for (int i = 0; i < arrayList.size(); i++) {
                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i);
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                    tL_businessChatLink.serializeToStream(nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.requery();
                    sQLitePreparedStatementExecuteFast.bindByteBuffer(1, nativeByteBuffer);
                    sQLitePreparedStatementExecuteFast.bindInteger(2, i);
                    sQLitePreparedStatementExecuteFast.step();
                }
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (sQLitePreparedStatementExecuteFast == null) {
                    return;
                }
            }
            sQLitePreparedStatementExecuteFast.dispose();
        } catch (Throwable th) {
            if (sQLitePreparedStatementExecuteFast != null) {
                sQLitePreparedStatementExecuteFast.dispose();
            }
            throw th;
        }
    }

    private void editLink(final TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, final Runnable runnable) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(editbusinesschatlink, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$editLink$12(tL_businessChatLink, runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$editLink$12(final TL_account.TL_businessChatLink tL_businessChatLink, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editLink$11(tLObject, tL_businessChatLink, runnable);
            }
        });
    }

    public void lambda$editLink$11(TLObject tLObject, TL_account.TL_businessChatLink tL_businessChatLink, Runnable runnable) {
        if (tLObject instanceof TL_account.TL_businessChatLink) {
            TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject;
            int iIndexOf = this.links.indexOf(tL_businessChatLink);
            if (iIndexOf != -1) {
                this.links.set(iIndexOf, tL_businessChatLink2);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                }
                saveToCache();
            }
        }
    }

    public TL_account.TL_businessChatLink findLink(String str) {
        for (int i = 0; i < this.links.size(); i++) {
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.links.get(i);
            if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                if (!TextUtils.equals(tL_businessChatLink.link, "https://" + str)) {
                    if (!TextUtils.equals(tL_businessChatLink.link, "https://t.me/m/" + str)) {
                        if (!TextUtils.equals(tL_businessChatLink.link, "tg://message?slug=" + str)) {
                        }
                    }
                }
            }
            return tL_businessChatLink;
        }
        return null;
    }
}
