package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class jg implements Utilities.Callback2 {
    public final int f34796a;
    public final wn f34797b;
    public final String f34798c;

    public jg(wn wnVar, String str, int i10) {
        this.f34796a = i10;
        this.f34797b = wnVar;
        this.f34798c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f34796a) {
            case 0:
                wn wnVar = this.f34797b;
                wnVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.f34798c;
                    if (booleanValue) {
                        wnVar.getMessagesController().addWebBrowserException(str, true);
                    }
                    nf.f.m(wnVar.getParentActivity(), str, false, null);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    wn wnVar2 = this.f34797b;
                    String str2 = this.f34798c;
                    if (booleanValue2) {
                        wnVar2.getMessagesController().addWebBrowserException(str2, false);
                    }
                    wnVar2.getParentActivity();
                    nf.f.n(str2);
                    return;
                }
                return;
        }
    }
}
