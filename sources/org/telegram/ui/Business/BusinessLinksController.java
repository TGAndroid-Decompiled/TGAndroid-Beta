package org.telegram.ui.Business;

import android.text.TextUtils;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView$$ExternalSyntheticLambda3;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class BusinessLinksController {
    public static volatile BusinessLinksController[] Instance = new BusinessLinksController[4];
    public static final Object[] lockObjects = new Object[4];
    public final int currentAccount;
    public final ArrayList links = new ArrayList();
    public boolean loading = false;
    public boolean loaded = false;

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public BusinessLinksController(int i) {
        this.currentAccount = i;
    }

    public static BusinessLinksController getInstance(int i) {
        BusinessLinksController businessLinksController;
        BusinessLinksController businessLinksController2 = Instance[i];
        if (businessLinksController2 != null) {
            return businessLinksController2;
        }
        synchronized (lockObjects[i]) {
            try {
                businessLinksController = Instance[i];
                if (businessLinksController == null) {
                    BusinessLinksController[] businessLinksControllerArr = Instance;
                    BusinessLinksController businessLinksController3 = new BusinessLinksController(i);
                    businessLinksControllerArr[i] = businessLinksController3;
                    businessLinksController = businessLinksController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return businessLinksController;
    }

    public final void deleteLinkUndoable(BusinessLinksActivity businessLinksActivity, String str) {
        TL_account.TL_businessChatLink tL_businessChatLinkFindLink = findLink(str);
        if (tL_businessChatLinkFindLink != null) {
            ArrayList arrayList = this.links;
            int iIndexOf = arrayList.indexOf(tL_businessChatLinkFindLink);
            arrayList.remove(tL_businessChatLinkFindLink);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
            BulletinFactory.of(businessLinksActivity).createUndoBulletin((CharSequence) LocaleController.getString(R.string.BusinessLinkDeleted), true, (Runnable) new RichTextCell$2$$ExternalSyntheticLambda1(this, iIndexOf, tL_businessChatLinkFindLink, 7), (Runnable) new RemoteUtils$$ExternalSyntheticLambda2((Object) this, str, (Object) tL_businessChatLinkFindLink, 26)).show();
        }
    }

    public final void editLink(TL_account.TL_businessChatLink tL_businessChatLink, TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink, ChatActivityEnterView$$ExternalSyntheticLambda3 chatActivityEnterView$$ExternalSyntheticLambda3) {
        TL_account.editBusinessChatLink editbusinesschatlink = new TL_account.editBusinessChatLink();
        editbusinesschatlink.slug = tL_businessChatLink.link;
        if (!tL_inputBusinessChatLink.entities.isEmpty()) {
            tL_inputBusinessChatLink.flags |= 1;
        }
        if (!TextUtils.isEmpty(tL_inputBusinessChatLink.title)) {
            tL_inputBusinessChatLink.flags |= 2;
        }
        editbusinesschatlink.link = tL_inputBusinessChatLink;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(editbusinesschatlink, new StarGiftSheet$$ExternalSyntheticLambda1(this, tL_businessChatLink, chatActivityEnterView$$ExternalSyntheticLambda3, 1));
    }

    public final TL_account.TL_businessChatLink findLink(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.links;
            if (i >= arrayList.size()) {
                return null;
            }
            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i);
            if (!TextUtils.equals(tL_businessChatLink.link, str)) {
                if (!TextUtils.equals(tL_businessChatLink.link, "https://" + str)) {
                    if (!TextUtils.equals(tL_businessChatLink.link, "https://t.me/m/" + str)) {
                        if (!TextUtils.equals(tL_businessChatLink.link, "tg://message?slug=" + str)) {
                            i++;
                        }
                    }
                }
            }
            return tL_businessChatLink;
        }
    }

    public final void load(boolean z, boolean z2) {
        if (this.loading) {
            return;
        }
        if (!this.loaded || (z2 && !z)) {
            this.loading = true;
            int i = this.currentAccount;
            if (z) {
                MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
                messagesStorage.getStorageQueue().postRunnable(new EglRenderer$$ExternalSyntheticLambda8(this, messagesStorage, z2, 6));
            } else {
                ConnectionsManager.getInstance(i).sendRequest(new TL_account.getBusinessChatLinks(), new BusinessLinksController$$ExternalSyntheticLambda0(this, 1));
            }
        }
    }

    public final void saveToCache() {
        ArrayList arrayList = new ArrayList(this.links);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new QuickRepliesController$$ExternalSyntheticLambda22(1, arrayList, messagesStorage));
    }
}
