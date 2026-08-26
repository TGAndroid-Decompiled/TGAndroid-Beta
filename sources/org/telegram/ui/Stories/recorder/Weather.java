package org.telegram.ui.Stories.recorder;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.TimeZone;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.ProfileActivity$6$$ExternalSyntheticLambda7;

public abstract class Weather {
    public static String cacheKey;
    public static State cacheValue;

    public final class State extends TLObject {
        public String emoji;
        public double lat;
        public double lng;
        public float temperature;

        public final String getTemperature() {
            if (!Weather.isDefaultCelsius()) {
                return SurfaceContainer$$ExternalSyntheticOutline0.m((int) Math.round(((((double) this.temperature) * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
            }
            return Math.round(this.temperature) + "°C";
        }

        @Override
        public final void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeDouble(this.lat);
            outputSerializedData.writeDouble(this.lng);
            outputSerializedData.writeString(this.emoji);
            outputSerializedData.writeFloat(this.temperature);
        }
    }

    public static void fetch(boolean z, Utilities.Callback callback) {
        PermissionRequest.ensureEitherPermission(R.raw.permission_request_location, R.string.PermissionNoLocationStory, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ProfileActivity$6$$ExternalSyntheticLambda7(4, new ProfileActivity$6$$ExternalSyntheticLambda7(3, callback, z), z));
    }

    public static boolean isDefaultCelsius() {
        String id = TimeZone.getDefault().getID();
        return (id.startsWith("US/") || "America/Nassau".equals(id) || "America/Belize".equals(id) || "America/Cayman".equals(id) || "Pacific/Palau".equals(id)) ? false : true;
    }
}
