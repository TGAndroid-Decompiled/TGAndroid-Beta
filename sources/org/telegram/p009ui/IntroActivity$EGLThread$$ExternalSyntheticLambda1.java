package org.telegram.p009ui;

import android.graphics.Bitmap;
import org.telegram.messenger.GenericProvider;
import org.telegram.p009ui.IntroActivity;

public final class IntroActivity$EGLThread$$ExternalSyntheticLambda1 implements GenericProvider {
    public static final IntroActivity$EGLThread$$ExternalSyntheticLambda1 INSTANCE = new IntroActivity$EGLThread$$ExternalSyntheticLambda1();

    private IntroActivity$EGLThread$$ExternalSyntheticLambda1() {
    }

    @Override
    public final Object provide(Object obj) {
        Bitmap lambda$initGL$1;
        lambda$initGL$1 = IntroActivity.EGLThread.lambda$initGL$1((Void) obj);
        return lambda$initGL$1;
    }
}
