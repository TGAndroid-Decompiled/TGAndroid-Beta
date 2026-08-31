package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class n50 extends File {
    @Override
    public final boolean delete() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("delete camera file");
        }
        return super.delete();
    }
}
