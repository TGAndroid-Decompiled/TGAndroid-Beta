package org.telegram.ui;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class fj0 implements Comparator {
    public final yj0 f45292a;

    public fj0(yj0 yj0Var) {
        this.f45292a = yj0Var;
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
            return yj0.G0(this.f45292a, ((TLRPC.TL_secureValueErrorData) secureValueError).field);
        }
        return 100;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a10 = a((TLRPC.SecureValueError) obj);
        int a11 = a((TLRPC.SecureValueError) obj2);
        if (a10 < a11) {
            return -1;
        }
        if (a10 > a11) {
            return 1;
        }
        return 0;
    }
}
