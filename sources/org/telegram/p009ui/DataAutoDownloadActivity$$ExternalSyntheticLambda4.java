package org.telegram.p009ui;

import java.util.Comparator;
import org.telegram.messenger.DownloadController;

public final class DataAutoDownloadActivity$$ExternalSyntheticLambda4 implements Comparator {
    public static final DataAutoDownloadActivity$$ExternalSyntheticLambda4 INSTANCE = new DataAutoDownloadActivity$$ExternalSyntheticLambda4();

    private DataAutoDownloadActivity$$ExternalSyntheticLambda4() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$fillPresets$5;
        lambda$fillPresets$5 = DataAutoDownloadActivity.lambda$fillPresets$5((DownloadController.Preset) obj, (DownloadController.Preset) obj2);
        return lambda$fillPresets$5;
    }
}
