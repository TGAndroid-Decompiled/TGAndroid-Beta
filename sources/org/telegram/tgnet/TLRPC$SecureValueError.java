package org.telegram.tgnet;

public abstract class TLRPC$SecureValueError extends TLObject {
    public static TLRPC$SecureValueError TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$SecureValueError tLRPC$SecureValueError;
        switch (i) {
            case -2037765467:
                tLRPC$SecureValueError = new TLRPC$TL_secureValueErrorReverseSide();
                break;
            case -2036501105:
                tLRPC$SecureValueError = new TLRPC$TL_secureValueError();
                break;
            case -1592506512:
                tLRPC$SecureValueError = new TLRPC$TL_secureValueErrorTranslationFile();
                break;
            case -449327402:
                tLRPC$SecureValueError = new TLRPC$TL_secureValueErrorSelfie();
                break;
            case -391902247:
                tLRPC$SecureValueError = new TLRPC$TL_secureValueErrorData();
                break;
            case 12467706:
                tLRPC$SecureValueError = new TLRPC$TL_secureValueErrorFrontSide();
                break;
            case 878931416:
                tLRPC$SecureValueError = new TLRPC$TL_secureValueErrorTranslationFiles();
                break;
            case 1717706985:
                tLRPC$SecureValueError = new TLRPC$TL_secureValueErrorFiles();
                break;
            case 2054162547:
                tLRPC$SecureValueError = new TLRPC$TL_secureValueErrorFile();
                break;
            default:
                tLRPC$SecureValueError = null;
                break;
        }
        if (tLRPC$SecureValueError != null || !z) {
            if (tLRPC$SecureValueError != null) {
                tLRPC$SecureValueError.readParams(abstractSerializedData, z);
            }
            return tLRPC$SecureValueError;
        }
        throw new RuntimeException(String.format("can't parse magic %x in SecureValueError", Integer.valueOf(i)));
    }
}
