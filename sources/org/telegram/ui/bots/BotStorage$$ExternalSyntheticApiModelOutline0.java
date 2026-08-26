package org.telegram.ui.bots;

import android.media.AudioRecord;
import android.security.keystore.KeyGenParameterSpec;

public abstract class BotStorage$$ExternalSyntheticApiModelOutline0 {
    public static AudioRecord.Builder m() {
        return new AudioRecord.Builder();
    }

    public static KeyGenParameterSpec.Builder m3591m() {
        return new KeyGenParameterSpec.Builder("MiniAppsKey", 3);
    }
}
