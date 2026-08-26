package org.telegram.ui.Stars;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.web.BotWebViewContainer;

public final class StarGiftSheet$$ExternalSyntheticLambda129 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Serializable f$3;
    public final Serializable f$4;

    public StarGiftSheet$$ExternalSyntheticLambda129(Object obj, Object obj2, Object obj3, Serializable serializable, Serializable serializable2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = serializable;
        this.f$4 = serializable2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f$1;
                ButtonSpan.TextViewButtons[] textViewButtonsArr = (ButtonSpan.TextViewButtons[]) this.f$3;
                ((StarGiftSheet) this.f$0).lambda$addAttributeRow$44(starGift, (TL_stars.StarGiftAttribute) this.f$2, textViewButtonsArr, (boolean[]) this.f$4, (ArrayList) obj);
                break;
            default:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$36((AlertDialog) this.f$1, (String) this.f$2, (String) this.f$3, (String) this.f$4, (File) obj);
                break;
        }
    }
}
