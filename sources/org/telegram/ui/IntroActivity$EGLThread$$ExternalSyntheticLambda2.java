package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.IntroActivity;
public final class IntroActivity$EGLThread$$ExternalSyntheticLambda2 implements GenericProvider {
    public static final IntroActivity$EGLThread$$ExternalSyntheticLambda2 INSTANCE = new IntroActivity$EGLThread$$ExternalSyntheticLambda2();

    private IntroActivity$EGLThread$$ExternalSyntheticLambda2() {
    }

    @Override
    public final Object provide(Object obj) {
        Bitmap lambda$new$0;
        lambda$new$0 = IntroActivity.EGLThread.lambda$new$0((Void) obj);
        return lambda$new$0;
    }
}
