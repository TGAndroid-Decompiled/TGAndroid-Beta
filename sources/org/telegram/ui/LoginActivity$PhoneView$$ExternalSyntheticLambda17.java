package org.telegram.ui;

import j$.util.function.Function;
import org.telegram.ui.CountrySelectActivity;

public final class LoginActivity$PhoneView$$ExternalSyntheticLambda17 implements Function {
    public static final LoginActivity$PhoneView$$ExternalSyntheticLambda17 INSTANCE = new LoginActivity$PhoneView$$ExternalSyntheticLambda17();

    private LoginActivity$PhoneView$$ExternalSyntheticLambda17() {
    }

    @Override
    public Function andThen(Function function) {
        return function.getClass();
    }

    @Override
    public final Object apply(Object obj) {
        String str;
        str = ((CountrySelectActivity.Country) obj).name;
        return str;
    }

    @Override
    public Function compose(Function function) {
        return function.getClass();
    }
}
