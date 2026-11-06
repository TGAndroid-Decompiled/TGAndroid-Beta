package org.telegram.messenger;

import android.app.Notification;
import android.content.Context;
import android.graphics.SurfaceTexture;
public abstract class z8 {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(FilesMigrationService filesMigrationService, String str) {
        return new Notification.Builder(filesMigrationService, str);
    }

    public static SurfaceTexture c() {
        return new SurfaceTexture(false);
    }
}
