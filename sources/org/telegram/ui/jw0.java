package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class jw0 implements Comparator {
    public final int f38136a;
    public final MessagesController f38137b;

    public jw0(MessagesController messagesController, int i10) {
        this.f38136a = i10;
        this.f38137b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        ww0 ww0Var = (ww0) obj;
        ww0 ww0Var2 = (ww0) obj2;
        switch (this.f38136a) {
            case 0:
                MessagesController messagesController = this.f38137b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(ww0Var.f42867a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(ww0Var2.f42867a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f38137b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(ww0Var.f42867a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(ww0Var2.f42867a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
