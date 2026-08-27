package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

public final class em0 implements Comparator {

    public final xm0 f37786a;

    public em0(xm0 xm0Var) {
        this.f37786a = xm0Var;
    }

    public final int a(TLRPC.SecureValueError secureValueError) {
        if (secureValueError instanceof TLRPC.TL_secureValueError) {
            return 0;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
            return 1;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
            return 2;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
            return 3;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
            return 4;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
            return 5;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
            return 6;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
            return 7;
        }
        if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
            return xm0.C0(this.f37786a, ((TLRPC.TL_secureValueErrorData) secureValueError).field);
        }
        return 100;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int iA = a((TLRPC.SecureValueError) obj);
        int iA2 = a((TLRPC.SecureValueError) obj2);
        if (iA < iA2) {
            return -1;
        }
        return iA > iA2 ? 1 : 0;
    }
}
