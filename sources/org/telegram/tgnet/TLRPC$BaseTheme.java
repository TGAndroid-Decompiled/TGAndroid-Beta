package org.telegram.tgnet;

public abstract class TLRPC$BaseTheme extends TLObject {
    public static TLRPC$BaseTheme TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$BaseTheme tLRPC$BaseTheme;
        switch (i) {
            case -1212997976:
                tLRPC$BaseTheme = new TLRPC$TL_baseThemeNight();
                break;
            case -1012849566:
                tLRPC$BaseTheme = new TLRPC$TL_baseThemeClassic();
                break;
            case -69724536:
                tLRPC$BaseTheme = new TLRPC$TL_baseThemeDay();
                break;
            case 1527845466:
                tLRPC$BaseTheme = new TLRPC$TL_baseThemeArctic();
                break;
            case 1834973166:
                tLRPC$BaseTheme = new TLRPC$TL_baseThemeTinted();
                break;
            default:
                tLRPC$BaseTheme = null;
                break;
        }
        if (tLRPC$BaseTheme != null || !z) {
            if (tLRPC$BaseTheme != null) {
                tLRPC$BaseTheme.readParams(abstractSerializedData, z);
            }
            return tLRPC$BaseTheme;
        }
        throw new RuntimeException(String.format("can't parse magic %x in BaseTheme", Integer.valueOf(i)));
    }
}
