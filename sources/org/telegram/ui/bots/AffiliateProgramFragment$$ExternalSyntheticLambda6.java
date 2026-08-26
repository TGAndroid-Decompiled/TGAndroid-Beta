package org.telegram.ui.bots;

import java.util.Locale;
import org.telegram.messenger.Utilities;

public final class AffiliateProgramFragment$$ExternalSyntheticLambda6 implements Utilities.CallbackReturn {
    @Override
    public final Object run(Object obj) {
        return String.format(Locale.US, "%.1f%%", Float.valueOf(((Integer) obj).intValue() / 10.0f));
    }
}
