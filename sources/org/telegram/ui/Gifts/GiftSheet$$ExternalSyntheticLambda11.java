package org.telegram.ui.Gifts;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;

public final class GiftSheet$$ExternalSyntheticLambda11 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;

    public GiftSheet$$ExternalSyntheticLambda11(Object obj, long j, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$1 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Browser.Progress progress = (Browser.Progress) obj;
                GiftSheet giftSheet = (GiftSheet) this.f$0;
                giftSheet.getClass();
                progress.init();
                GiftSheet.AnonymousClass8 anonymousClass8 = (GiftSheet.AnonymousClass8) this.f$1;
                anonymousClass8.doTransfer(this.f$2, new GiftSheet$$ExternalSyntheticLambda23(0, giftSheet, progress, (Utilities.Callback) this.f$3, anonymousClass8));
                break;
            case 1:
                FactCheckController factCheckController = (FactCheckController) this.f$0;
                ArrayList arrayList = (ArrayList) this.f$1;
                factCheckController.lambda$loadMissing$3(this.f$2, arrayList, (HashMap) this.f$3, (ArrayList) obj);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$checkSensitive$448(this.f$2, (boolean[]) this.f$1, (Runnable) this.f$3, (Boolean) obj);
                break;
            default:
                ((TranslateController) this.f$0).lambda$checkTranslation$6((MessageObject) this.f$1, (String) this.f$3, this.f$2, (TLRPC.TL_textWithEntities) obj);
                break;
        }
    }

    public GiftSheet$$ExternalSyntheticLambda11(TranslateController translateController, MessageObject messageObject, String str, long j) {
        this.$r8$classId = 3;
        this.f$0 = translateController;
        this.f$1 = messageObject;
        this.f$3 = str;
        this.f$2 = j;
    }

    public GiftSheet$$ExternalSyntheticLambda11(GiftSheet giftSheet, GiftSheet.AnonymousClass8 anonymousClass8, long j, Utilities.Callback callback) {
        this.$r8$classId = 0;
        this.f$0 = giftSheet;
        this.f$1 = anonymousClass8;
        this.f$2 = j;
        this.f$3 = callback;
    }
}
