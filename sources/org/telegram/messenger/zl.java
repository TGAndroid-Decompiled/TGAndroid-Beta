package org.telegram.messenger;

import j$.util.function.IntUnaryOperator$CC;
import java.util.function.IntUnaryOperator;
public final class zl implements IntUnaryOperator {
    public IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
    }

    @Override
    public final int applyAsInt(int i10) {
        int lambda$allocateStreamId$2;
        lambda$allocateStreamId$2 = WebProxyTransport.lambda$allocateStreamId$2(i10);
        return lambda$allocateStreamId$2;
    }

    public IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
    }
}
