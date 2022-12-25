package org.telegram.p009ui;

import java.util.Objects;
import org.telegram.p009ui.CountrySelectActivity;
import p008j$.util.function.Function;

public final class LoginActivity$PhoneView$$ExternalSyntheticLambda17 implements Function {
    public static final LoginActivity$PhoneView$$ExternalSyntheticLambda17 INSTANCE = new LoginActivity$PhoneView$$ExternalSyntheticLambda17();

    private LoginActivity$PhoneView$$ExternalSyntheticLambda17() {
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
