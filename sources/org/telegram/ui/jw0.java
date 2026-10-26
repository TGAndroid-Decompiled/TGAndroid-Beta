package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class jw0 implements Comparator {
    public final int f40756a;
    public final MessagesController f40757b;

    public jw0(MessagesController messagesController, int i10) {
        this.f40756a = i10;
        this.f40757b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        ww0 ww0Var = (ww0) obj;
        ww0 ww0Var2 = (ww0) obj2;
        switch (this.f40756a) {
            case 0:
                MessagesController messagesController = this.f40757b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(ww0Var.f45566a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(ww0Var2.f45566a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f40757b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(ww0Var.f45566a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(ww0Var2.f45566a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
