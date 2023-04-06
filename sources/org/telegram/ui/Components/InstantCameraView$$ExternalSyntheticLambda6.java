package org.telegram.ui.Components;

import java.util.Comparator;
public final class InstantCameraView$$ExternalSyntheticLambda6 implements Comparator {
    public static final InstantCameraView$$ExternalSyntheticLambda6 INSTANCE = new InstantCameraView$$ExternalSyntheticLambda6();

    private InstantCameraView$$ExternalSyntheticLambda6() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$chooseOptimalSize$2;
        lambda$chooseOptimalSize$2 = InstantCameraView.lambda$chooseOptimalSize$2((org.telegram.messenger.camera.Size) obj, (org.telegram.messenger.camera.Size) obj2);
        return lambda$chooseOptimalSize$2;
    }
}
