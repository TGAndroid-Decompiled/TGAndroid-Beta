package org.telegram.p009ui;

import java.util.Objects;
import org.telegram.p009ui.CountrySelectActivity;
import p008j$.util.function.Function;

public final class NewContactBottomSheet$$ExternalSyntheticLambda10 implements Function {
    public static final NewContactBottomSheet$$ExternalSyntheticLambda10 INSTANCE = new NewContactBottomSheet$$ExternalSyntheticLambda10();

    private NewContactBottomSheet$$ExternalSyntheticLambda10() {
    }

    @Override
    public Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override
    public final Object apply(Object obj) {
        String str;
        str = ((CountrySelectActivity.Country) obj).name;
        return str;
    }

    @Override
    public Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
