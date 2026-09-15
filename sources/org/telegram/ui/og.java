package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class og implements Utilities.Callback2 {
    public final int f36207a;
    public final bo f36208b;
    public final String f36209c;

    public og(bo boVar, String str, int i10) {
        this.f36207a = i10;
        this.f36208b = boVar;
        this.f36209c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f36207a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    bo boVar = this.f36208b;
                    String str = this.f36209c;
                    if (booleanValue) {
                        boVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    boVar.getParentActivity();
                    nf.f.n(str);
                    return;
                }
                return;
            default:
                bo boVar2 = this.f36208b;
                boVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f36209c;
                    if (booleanValue2) {
                        boVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    nf.f.m(boVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
