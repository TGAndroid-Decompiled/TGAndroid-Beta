package org.telegram.ui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.web.BotWebViewContainer;

public final class OAuthSheet$$ExternalSyntheticLambda12 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$10;
    public final Object f$2;
    public final boolean f$3;
    public final String f$4;
    public final Object f$5;
    public final Object f$6;
    public final boolean f$7;
    public final Object f$8;
    public final Serializable f$9;

    public OAuthSheet$$ExternalSyntheticLambda12(SelectAnimatedEmojiDialog selectAnimatedEmojiDialog, String str, boolean z, ArrayList arrayList, HashMap map, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z2) {
        this.f$0 = selectAnimatedEmojiDialog;
        this.f$4 = str;
        this.f$3 = z;
        this.f$1 = arrayList;
        this.f$2 = map;
        this.f$9 = arrayList2;
        this.f$5 = linkedHashSet;
        this.f$6 = linkedHashSet2;
        this.f$8 = arrayList3;
        this.f$10 = arrayList4;
        this.f$7 = z2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                int[] iArr = (int[]) this.f$0;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f$1;
                BottomSheet bottomSheet = (BottomSheet) this.f$2;
                String[] strArr = (String[]) this.f$6;
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$8;
                String str = (String) this.f$9;
                OAuthSheet.lambda$handle$4(iArr, tL_messages_requestUrlAuth, bottomSheet, this.f$3, this.f$4, (TLRPC.UrlAuthResult) this.f$5, strArr, this.f$7, botWebViewContainer, str, (Theme.ResourcesProvider) this.f$10, (Integer) obj);
                break;
            default:
                SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
                ArrayList arrayList = (ArrayList) this.f$1;
                ArrayList arrayList2 = (ArrayList) this.f$9;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f$5;
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f$6;
                ArrayList arrayList3 = (ArrayList) this.f$8;
                ArrayList arrayList4 = (ArrayList) this.f$10;
                selectAnimatedEmojiDialog.lambda$search$14(this.f$4, this.f$3, arrayList, (HashMap) this.f$2, arrayList2, linkedHashSet, linkedHashSet2, arrayList3, arrayList4, this.f$7, (Runnable) obj);
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda12(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, BottomSheet bottomSheet, boolean z, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, BotWebViewContainer botWebViewContainer, String str2, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = iArr;
        this.f$1 = tL_messages_requestUrlAuth;
        this.f$2 = bottomSheet;
        this.f$3 = z;
        this.f$4 = str;
        this.f$5 = urlAuthResult;
        this.f$6 = strArr;
        this.f$7 = z2;
        this.f$8 = botWebViewContainer;
        this.f$9 = str2;
        this.f$10 = resourcesProvider;
    }
}
