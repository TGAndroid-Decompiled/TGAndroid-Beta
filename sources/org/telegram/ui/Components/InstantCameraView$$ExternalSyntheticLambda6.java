package org.telegram.ui.Components;

import java.util.Comparator;
import org.telegram.messenger.camera.Size;

public final class InstantCameraView$$ExternalSyntheticLambda6 implements Comparator {
    public static final InstantCameraView$$ExternalSyntheticLambda6 INSTANCE = new InstantCameraView$$ExternalSyntheticLambda6();

    private InstantCameraView$$ExternalSyntheticLambda6() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$chooseOptimalSize$2;
        lambda$chooseOptimalSize$2 = InstantCameraView.lambda$chooseOptimalSize$2((Size) obj, (Size) obj2);
        return lambda$chooseOptimalSize$2;
    }
}
