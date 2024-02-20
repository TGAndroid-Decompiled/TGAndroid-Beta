package org.telegram.tgnet;
public abstract class TLRPC$BaseTheme extends TLObject {
    public static TLRPC$BaseTheme TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$BaseTheme tLRPC$TL_baseThemeNight;
        switch (i) {
            case -1212997976:
                tLRPC$TL_baseThemeNight = new TLRPC$TL_baseThemeNight();
                break;
            case -1012849566:
                tLRPC$TL_baseThemeNight = new TLRPC$TL_baseThemeClassic();
                break;
            case -69724536:
                tLRPC$TL_baseThemeNight = new TLRPC$TL_baseThemeDay();
                break;
            case 1527845466:
                tLRPC$TL_baseThemeNight = new TLRPC$TL_baseThemeArctic();
                break;
            case 1834973166:
                tLRPC$TL_baseThemeNight = new TLRPC$TL_baseThemeTinted();
                break;
            default:
                tLRPC$TL_baseThemeNight = null;
                break;
        }
        if (tLRPC$TL_baseThemeNight == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BaseTheme", Integer.valueOf(i)));
        }
        if (tLRPC$TL_baseThemeNight != null) {
            tLRPC$TL_baseThemeNight.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_baseThemeNight;
    }
}
