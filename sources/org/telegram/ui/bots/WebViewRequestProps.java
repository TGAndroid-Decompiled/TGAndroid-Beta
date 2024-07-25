package org.telegram.ui.bots;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotApp;
import org.telegram.tgnet.TLRPC$User;
public class WebViewRequestProps {
    public boolean allowWrite;
    public TLRPC$BotApp app;
    public long botId;
    public TLRPC$User botUser;
    public String buttonText;
    public String buttonUrl;
    public boolean compact;
    public int currentAccount;
    public int flags;
    public long peerId;
    public int replyToMsgId;
    public TLObject response;
    public long responseTime;
    public boolean silent;
    public String startParam;
    public int type;

    public static WebViewRequestProps of(int i, long j, long j2, String str, String str2, int i2, int i3, boolean z, TLRPC$BotApp tLRPC$BotApp, boolean z2, String str3, TLRPC$User tLRPC$User, int i4, boolean z3) {
        WebViewRequestProps webViewRequestProps = new WebViewRequestProps();
        webViewRequestProps.currentAccount = i;
        webViewRequestProps.peerId = j;
        webViewRequestProps.botId = j2;
        webViewRequestProps.buttonText = str;
        webViewRequestProps.buttonUrl = str2;
        webViewRequestProps.type = i2;
        webViewRequestProps.replyToMsgId = i3;
        webViewRequestProps.silent = z;
        webViewRequestProps.app = tLRPC$BotApp;
        webViewRequestProps.allowWrite = z2;
        webViewRequestProps.startParam = str3;
        webViewRequestProps.botUser = tLRPC$User;
        webViewRequestProps.flags = i4;
        webViewRequestProps.compact = z3;
        if (!z3 && !TextUtils.isEmpty(str2)) {
            try {
                webViewRequestProps.compact = TextUtils.equals(Uri.parse(str2).getQueryParameter("mode"), "compact");
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return webViewRequestProps;
    }

    public void applyResponse(TLObject tLObject) {
        this.response = tLObject;
        this.responseTime = System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (obj instanceof WebViewRequestProps) {
            WebViewRequestProps webViewRequestProps = (WebViewRequestProps) obj;
            if (this.currentAccount == webViewRequestProps.currentAccount && this.peerId == webViewRequestProps.peerId && this.botId == webViewRequestProps.botId && TextUtils.equals(this.buttonUrl, webViewRequestProps.buttonUrl) && this.type == webViewRequestProps.type && this.replyToMsgId == webViewRequestProps.replyToMsgId && this.silent == webViewRequestProps.silent) {
                TLRPC$BotApp tLRPC$BotApp = this.app;
                long j = tLRPC$BotApp == null ? 0L : tLRPC$BotApp.id;
                TLRPC$BotApp tLRPC$BotApp2 = webViewRequestProps.app;
                if (j == (tLRPC$BotApp2 == null ? 0L : tLRPC$BotApp2.id) && this.allowWrite == webViewRequestProps.allowWrite && TextUtils.equals(this.startParam, webViewRequestProps.startParam)) {
                    TLRPC$User tLRPC$User = this.botUser;
                    long j2 = tLRPC$User == null ? 0L : tLRPC$User.id;
                    TLRPC$User tLRPC$User2 = webViewRequestProps.botUser;
                    return j2 == (tLRPC$User2 != null ? tLRPC$User2.id : 0L) && this.flags == webViewRequestProps.flags;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
