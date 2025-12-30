package org.telegram.ui;

import j$.util.function.Function$CC;
import java.util.function.Function;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

public final class CallLogActivity$$ExternalSyntheticLambda8 implements Function {
    public Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        return Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) obj));
    }

    public Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
