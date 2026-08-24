package org.telegram.ui.bots;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AttachableDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.LaunchActivity;

public class BotLocation {
    private static final HashMap instances = new HashMap();
    public final long botId;
    public final Context context;
    public final int currentAccount;
    public boolean granted;
    private final HashSet listeners = new HashSet();
    public boolean requested;

    public static BotLocation get(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        HashMap map = instances;
        BotLocation botLocation = (BotLocation) map.get(pair);
        if (botLocation != null) {
            return botLocation;
        }
        BotLocation botLocation2 = new BotLocation(context, i, j);
        map.put(pair, botLocation2);
        return botLocation2;
    }

    private BotLocation(Context context, int i, long j) {
        this.context = context;
        this.currentAccount = i;
        this.botId = j;
        load();
    }

    public boolean asked() {
        return this.requested;
    }

    public boolean granted() {
        return appHasPermission() && this.granted;
    }

    public void setGranted(boolean z, final Runnable runnable) {
        this.requested = true;
        if (z && !appHasPermission()) {
            final Activity activity = getActivity();
            if (activity == null) {
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), null);
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user))));
            builder.setTopImage(new BotUserLocationDrawable(this.context, UserConfig.getInstance(this.currentAccount).getCurrentUser(), user), Theme.getColor(Theme.key_dialogTopBackground));
            if (needToOpenSettings()) {
                builder.setPositiveButton(LocaleController.getString(R.string.BotLocationPermissionSettings), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotLocation.$r8$lambda$8Xj70piI7CK4FZg3bmehdrwtO2k(activity, alertDialog, i);
                    }
                });
            } else {
                builder.setPositiveButton(LocaleController.getString(R.string.BotLocationPermissionAllow), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotLocation.m4818$r8$lambda$xW3cdApB4WxZutddt_BLoC7ADU(this.f$0, runnable, alertDialog, i);
                    }
                });
            }
            builder.setNegativeButton(LocaleController.getString(R.string.BotLocationPermissionDecline), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    BotLocation.m4817$r8$lambda$wR4ZnsLyWlK0zsOBzQJ7tCxYKg(this.f$0, runnable, alertDialog, i);
                }
            });
            builder.show();
        } else {
            this.granted = z;
            Iterator it = this.listeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
        save();
    }

    public static void $r8$lambda$8Xj70piI7CK4FZg3bmehdrwtO2k(Activity activity, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m4818$r8$lambda$xW3cdApB4WxZutddt_BLoC7ADU(final BotLocation botLocation, final Runnable runnable, AlertDialog alertDialog, int i) {
        if (!botLocation.appHasPermission()) {
            PermissionRequest.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BotLocation.$r8$lambda$efYrp1OxLO4ejzk5W_UfIccrpK8(this.f$0, runnable, (int[]) obj);
                }
            });
            return;
        }
        botLocation.requested = true;
        botLocation.granted = true;
        botLocation.save();
        Iterator it = botLocation.listeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public static void $r8$lambda$efYrp1OxLO4ejzk5W_UfIccrpK8(BotLocation botLocation, Runnable runnable, int[] iArr) {
        botLocation.getClass();
        boolean z = false;
        for (int i : iArr) {
            if (i == 0) {
                z = true;
            }
        }
        botLocation.requested = z;
        botLocation.granted = z;
        botLocation.save();
        Iterator it = botLocation.listeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void m4817$r8$lambda$wR4ZnsLyWlK0zsOBzQJ7tCxYKg(BotLocation botLocation, Runnable runnable, AlertDialog alertDialog, int i) {
        botLocation.requested = true;
        botLocation.granted = false;
        botLocation.save();
        Iterator it = botLocation.listeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void listen(Runnable runnable) {
        this.listeners.add(runnable);
    }

    public void unlisten(Runnable runnable) {
        this.listeners.remove(runnable);
    }

    public void load() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences("botlocation_" + this.currentAccount, 0);
        this.requested = sharedPreferences.getBoolean(this.botId + "_requested", false);
        boolean z = sharedPreferences.getBoolean(this.botId + "_granted", false);
        this.granted = z;
        if (!z || appHasPermission()) {
            return;
        }
        this.granted = false;
        this.requested = false;
        save();
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void save() {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences("botlocation_" + this.currentAccount, 0).edit();
        editorEdit.putBoolean(this.botId + "_granted", this.granted);
        editorEdit.putBoolean(this.botId + "_requested", this.requested);
        editorEdit.apply();
    }

    private Activity getActivity() {
        Activity activityFindActivity = LaunchActivity.instance;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(this.context);
        }
        return activityFindActivity == null ? AndroidUtilities.findActivity(ApplicationLoader.applicationContext) : activityFindActivity;
    }

    private boolean deviceHasLocation() {
        return getActivity() != null && getActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps");
    }

    private boolean appHasPermission() {
        Activity activity = getActivity();
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (activity != null) {
            return activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || activity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        return false;
    }

    private boolean needToOpenSettings() {
        Activity activity;
        if (Build.VERSION.SDK_INT >= 23 && (activity = getActivity()) != null) {
            return (activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) ? false : true;
        }
        return false;
    }

    public void request(final Utilities.Callback2 callback2) {
        final Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (!deviceHasLocation()) {
            if (callback2 != null) {
                Boolean bool = Boolean.FALSE;
                callback2.run(bool, bool);
                return;
            }
            return;
        }
        if (appHasPermission() && (this.requested || this.granted)) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, Boolean.TRUE);
                return;
            }
            return;
        }
        final boolean[] zArr = new boolean[1];
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, null);
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user))));
        builder.setTopImage(new BotUserLocationDrawable(this.context, UserConfig.getInstance(this.currentAccount).getCurrentUser(), user), Theme.getColor(Theme.key_dialogTopBackground));
        if (!appHasPermission() && needToOpenSettings()) {
            builder.setPositiveButton(LocaleController.getString(R.string.BotLocationPermissionSettings), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    BotLocation.$r8$lambda$NrUSfLmt5mpXY0LtaVefOUiGIzk(activity, zArr, callback2, alertDialog, i);
                }
            });
        } else {
            builder.setPositiveButton(LocaleController.getString(R.string.BotLocationPermissionAllow), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    BotLocation.m4816$r8$lambda$dPKSAzIc5cAAoA4U3kWQAcxDF4(this.f$0, zArr, callback2, alertDialog, i);
                }
            });
        }
        builder.setNegativeButton(LocaleController.getString(R.string.BotLocationPermissionDecline), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                BotLocation.m4819$r8$lambda$yd5wcj5HHxuYpqhG8PFHvmFjeI(this.f$0, zArr, callback2, alertDialog, i);
            }
        });
        builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                BotLocation.m4815$r8$lambda$86tC18Cxj1Ix_h60feMuwSKkCw(this.f$0, zArr, callback2, dialogInterface);
            }
        });
        builder.show();
    }

    public static void $r8$lambda$NrUSfLmt5mpXY0LtaVefOUiGIzk(Activity activity, boolean[] zArr, Utilities.Callback2 callback2, AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
        zArr[0] = true;
        if (callback2 != null) {
            Boolean bool = Boolean.FALSE;
            callback2.run(bool, bool);
        }
    }

    public static void m4816$r8$lambda$dPKSAzIc5cAAoA4U3kWQAcxDF4(final BotLocation botLocation, boolean[] zArr, final Utilities.Callback2 callback2, AlertDialog alertDialog, int i) {
        botLocation.getClass();
        zArr[0] = true;
        if (!botLocation.appHasPermission()) {
            PermissionRequest.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    BotLocation.$r8$lambda$OSXabPKY6hS60qVVoINgOdUYRvM(this.f$0, callback2, (int[]) obj);
                }
            });
            return;
        }
        botLocation.requested = true;
        botLocation.granted = true;
        botLocation.save();
        Iterator it = botLocation.listeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (callback2 != null) {
            Boolean bool = Boolean.TRUE;
            callback2.run(bool, bool);
        }
    }

    public static void $r8$lambda$OSXabPKY6hS60qVVoINgOdUYRvM(BotLocation botLocation, Utilities.Callback2 callback2, int[] iArr) {
        botLocation.getClass();
        boolean z = false;
        for (int i : iArr) {
            if (i == 0) {
                z = true;
            }
        }
        botLocation.requested = true;
        botLocation.granted = true;
        botLocation.save();
        Iterator it = botLocation.listeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, Boolean.valueOf(z));
        }
    }

    public static void m4819$r8$lambda$yd5wcj5HHxuYpqhG8PFHvmFjeI(BotLocation botLocation, boolean[] zArr, Utilities.Callback2 callback2, AlertDialog alertDialog, int i) {
        botLocation.getClass();
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        botLocation.requested = true;
        botLocation.granted = false;
        botLocation.save();
        Iterator it = botLocation.listeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, Boolean.FALSE);
        }
    }

    public static void m4815$r8$lambda$86tC18Cxj1Ix_h60feMuwSKkCw(BotLocation botLocation, boolean[] zArr, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        botLocation.getClass();
        if (zArr[0]) {
            return;
        }
        botLocation.requested = true;
        botLocation.granted = false;
        botLocation.save();
        Iterator it = botLocation.listeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zArr[0] = true;
        if (callback2 != null) {
            callback2.run(Boolean.TRUE, Boolean.FALSE);
        }
    }

    public JSONObject checkObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available", deviceHasLocation());
            if (deviceHasLocation()) {
                jSONObject.put("access_requested", this.requested);
                if (this.requested) {
                    jSONObject.put("access_granted", this.granted && appHasPermission());
                    return jSONObject;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return jSONObject;
    }

    public void requestObject(final Utilities.Callback callback) {
        if (callback == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (!this.granted || !appHasPermission() || !deviceHasLocation()) {
            try {
                jSONObject.put("available", false);
            } catch (Exception e) {
                FileLog.e(e);
            }
            callback.run(jSONObject);
            return;
        }
        final LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location lastKnownLocation = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
            if (lastKnownLocation != null) {
                break;
            }
        }
        if (lastKnownLocation != null || locationManager.isProviderEnabled("gps")) {
            if (lastKnownLocation != null) {
                callback.run(locationObject(lastKnownLocation));
                return;
            }
            try {
                final LocationListener[] locationListenerArr = {locationListener};
                LocationListener locationListener = new LocationListener() {
                    @Override
                    public void onLocationChanged(Location location) {
                        locationManager.removeUpdates(locationListenerArr[0]);
                        callback.run(BotLocation.this.locationObject(location));
                    }
                };
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                return;
            } catch (Exception e2) {
                FileLog.e(e2);
                callback.run(locationObject(null));
                return;
            }
        }
        final Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTopAnimation(R.raw.permission_request_location, 72, false, Theme.getColor(Theme.key_dialogTopBackground));
                builder.setMessage(LocaleController.getString(R.string.GpsDisabledAlertText));
                builder.setPositiveButton(LocaleController.getString(R.string.Enable), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.show();
            } catch (Exception e3) {
                FileLog.e(e3);
            }
        }
        callback.run(locationObject(null));
    }

    public JSONObject locationObject(Location location) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available", location != null);
            if (location == null) {
                return jSONObject;
            }
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static class BotUserLocationDrawable extends Drawable implements AttachableDrawable {
        private final Paint arrowPaint;
        private final Paint bgPaint;
        private final ImageReceiver botImageReceiver;
        private final Drawable locationDrawable;
        private final RectF rect;
        private final ImageReceiver userImageReceiver;
        private final Paint whitePaint;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public BotUserLocationDrawable(Context context, TLRPC.User user, TLRPC.User user2) {
            Paint paint = new Paint(1);
            this.arrowPaint = paint;
            this.bgPaint = new Paint(1);
            Paint paint2 = new Paint(1);
            this.whitePaint = paint2;
            ImageReceiver imageReceiver = new ImageReceiver();
            this.userImageReceiver = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver();
            this.botImageReceiver = imageReceiver2;
            this.rect = new RectF();
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint2.setColor(-1);
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_location).mutate();
            this.locationDrawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogTopBackground), PorterDuff.Mode.SRC_IN));
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(user);
            imageReceiver.setForUserOrChat(user, avatarDrawable);
            imageReceiver.setRoundRadius(AndroidUtilities.dp(25.0f));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(user2);
            imageReceiver2.setForUserOrChat(user2, avatarDrawable2);
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(25.0f));
        }

        @Override
        public void onAttachedToWindow(ImageReceiver imageReceiver) {
            this.userImageReceiver.onAttachedToWindow();
            this.botImageReceiver.onAttachedToWindow();
        }

        @Override
        public void onDetachedFromWindow(ImageReceiver imageReceiver) {
            this.userImageReceiver.onDetachedFromWindow();
            this.botImageReceiver.onDetachedFromWindow();
        }

        @Override
        public void setParent(View view) {
            this.botImageReceiver.setParentView(view);
            this.userImageReceiver.setParentView(view);
        }

        @Override
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            this.bgPaint.setColor(Theme.getColor(Theme.key_dialogTopBackground));
            float fDp = AndroidUtilities.dp(136.0f) / 2.0f;
            this.userImageReceiver.setImageCoords(bounds.centerX() - fDp, bounds.centerY() - AndroidUtilities.dp(25.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
            this.userImageReceiver.draw(canvas);
            float fCenterX = (bounds.centerX() - fDp) + AndroidUtilities.dp(41.0f);
            float fCenterY = bounds.centerY() + AndroidUtilities.dp(16.0f);
            canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(14.0f), this.bgPaint);
            canvas.drawCircle(fCenterX, fCenterY, AndroidUtilities.dp(12.0f), this.whitePaint);
            this.locationDrawable.setBounds((int) (fCenterX - AndroidUtilities.dp(9.0f)), (int) (fCenterY - AndroidUtilities.dp(9.0f)), (int) (fCenterX + AndroidUtilities.dp(9.0f)), (int) (fCenterY + AndroidUtilities.dp(9.0f)));
            this.locationDrawable.draw(canvas);
            canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), bounds.centerY() - AndroidUtilities.dp(7.0f), bounds.centerX() + AndroidUtilities.dp(3.33f), bounds.centerY(), this.arrowPaint);
            canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), bounds.centerY() + AndroidUtilities.dp(7.0f), bounds.centerX() + AndroidUtilities.dp(3.33f), bounds.centerY(), this.arrowPaint);
            this.botImageReceiver.setImageCoords((bounds.centerX() + fDp) - AndroidUtilities.dp(50.0f), bounds.centerY() - AndroidUtilities.dp(25.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
            this.botImageReceiver.draw(canvas);
        }
    }

    public static void clear() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            context.getSharedPreferences("botlocation_" + i, 0).edit().clear().apply();
        }
        instances.clear();
    }
}
