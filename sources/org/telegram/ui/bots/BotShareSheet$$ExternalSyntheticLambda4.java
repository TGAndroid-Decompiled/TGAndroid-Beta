package org.telegram.ui.bots;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CreateGroupCallBottomSheet;
import org.telegram.ui.Components.JoinCallAlert;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda18;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5;

public final class BotShareSheet$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId = 0;
    public final AlertDialog f$0;
    public final Context f$1;
    public final int f$2;
    public final long f$3;
    public final TLObject f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;
    public final Object f$8;

    public BotShareSheet$$ExternalSyntheticLambda4(AlertDialog alertDialog, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File[] fileArr, Theme.ResourcesProvider resourcesProvider, BotWebViewContainer$$ExternalSyntheticLambda5 botWebViewContainer$$ExternalSyntheticLambda5, OAuthSheet$$ExternalSyntheticLambda18 oAuthSheet$$ExternalSyntheticLambda18) {
        this.f$0 = alertDialog;
        this.f$1 = context;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = tL_messages_preparedInlineMessage;
        this.f$5 = fileArr;
        this.f$6 = resourcesProvider;
        this.f$7 = botWebViewContainer$$ExternalSyntheticLambda5;
        this.f$8 = oAuthSheet$$ExternalSyntheticLambda18;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dismiss();
                new BotShareSheet(this.f$1, this.f$2, this.f$3, (TLRPC.TL_messages_preparedInlineMessage) this.f$4, ((File[]) this.f$5)[0], null, (Theme.ResourcesProvider) this.f$6, (BotWebViewContainer$$ExternalSyntheticLambda5) this.f$7, (OAuthSheet$$ExternalSyntheticLambda18) this.f$8).show();
                break;
            default:
                try {
                    this.f$0.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                TLObject tLObject = this.f$4;
                if (tLObject != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject;
                    int size = joinaspeers.peers.size();
                    AccountInstance accountInstance = (AccountInstance) this.f$5;
                    JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate = (JoinCallAlert.JoinCallAlertDelegate) this.f$6;
                    if (size == 1) {
                        joinCallAlertDelegate.didSelectChat(accountInstance.getMessagesController().getInputPeer(MessageObject.getPeerId(joinaspeers.peers.get(0))), false, false, false);
                        break;
                    } else {
                        JoinCallAlert.cachedChats = joinaspeers.peers;
                        long j = this.f$3;
                        JoinCallAlert.lastCacheDid = j;
                        JoinCallAlert.lastCacheTime = SystemClock.elapsedRealtime();
                        JoinCallAlert.lastCachedAccount = accountInstance.getCurrentAccount();
                        accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                        accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                        ArrayList<TLRPC.Peer> arrayList = joinaspeers.peers;
                        BaseFragment baseFragment = (BaseFragment) this.f$7;
                        int i = this.f$2;
                        if (i != 0) {
                            JoinCallAlert joinCallAlert = new JoinCallAlert(this.f$1, j, arrayList, i, (TLRPC.Peer) this.f$8, joinCallAlertDelegate);
                            if (baseFragment == null) {
                                joinCallAlert.show();
                            } else if (baseFragment.getParentActivity() != null) {
                                baseFragment.showDialog(joinCallAlert);
                            }
                            break;
                        } else if (!arrayList.isEmpty()) {
                            CreateGroupCallBottomSheet createGroupCallBottomSheet = new CreateGroupCallBottomSheet(baseFragment, arrayList, j, joinCallAlertDelegate);
                            if (baseFragment.getParentActivity() == null) {
                                createGroupCallBottomSheet.show();
                            } else {
                                baseFragment.showDialog(createGroupCallBottomSheet);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    public BotShareSheet$$ExternalSyntheticLambda4(AlertDialog alertDialog, TLObject tLObject, AccountInstance accountInstance, JoinCallAlert.JoinCallAlertDelegate joinCallAlertDelegate, long j, Context context, BaseFragment baseFragment, int i, TLRPC.Peer peer) {
        this.f$0 = alertDialog;
        this.f$4 = tLObject;
        this.f$5 = accountInstance;
        this.f$6 = joinCallAlertDelegate;
        this.f$3 = j;
        this.f$1 = context;
        this.f$7 = baseFragment;
        this.f$2 = i;
        this.f$8 = peer;
    }
}
