package org.telegram.ui.bots;

import android.app.Activity;
import android.content.Context;
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
import android.os.Build;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
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
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda60;
import org.telegram.ui.iv.RichEditor$3$$ExternalSyntheticLambda0;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22;

public final class BotLocation {
    public static final HashMap instances = new HashMap();
    public final long botId;
    public final Context context;
    public final int currentAccount;
    public boolean granted;
    public final HashSet listeners;
    public boolean requested;

    public final class BotUserLocationDrawable extends Drawable implements AttachableDrawable {
        public final Paint arrowPaint;
        public final Paint bgPaint;
        public final ImageReceiver botImageReceiver;
        public final Drawable locationDrawable;
        public final ImageReceiver userImageReceiver;
        public final Paint whitePaint;

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
            new RectF();
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint2.setColor(-1);
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.filled_location).mutate();
            this.locationDrawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogTopBackground, false), PorterDuff.Mode.SRC_IN));
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
        public final void draw(Canvas canvas) {
            Rect bounds = getBounds();
            Paint paint = this.bgPaint;
            paint.setColor(Theme.getColor(null, Theme.key_dialogTopBackground, false));
            float fDp = AndroidUtilities.dp(136.0f);
            ImageReceiver imageReceiver = this.userImageReceiver;
            float f = fDp / 2.0f;
            imageReceiver.setImageCoords(bounds.centerX() - f, bounds.centerY() - AndroidUtilities.dp(25.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
            imageReceiver.draw(canvas);
            float fCenterX = (bounds.centerX() - f) + AndroidUtilities.dp(41.0f);
            float fDp2 = AndroidUtilities.dp(16.0f) + bounds.centerY();
            canvas.drawCircle(fCenterX, fDp2, AndroidUtilities.dp(14.0f), paint);
            canvas.drawCircle(fCenterX, fDp2, AndroidUtilities.dp(12.0f), this.whitePaint);
            int iDp = (int) (fCenterX - AndroidUtilities.dp(9.0f));
            int iDp2 = (int) (fDp2 - AndroidUtilities.dp(9.0f));
            int iDp3 = (int) (fCenterX + AndroidUtilities.dp(9.0f));
            int iDp4 = (int) (fDp2 + AndroidUtilities.dp(9.0f));
            Drawable drawable = this.locationDrawable;
            drawable.setBounds(iDp, iDp2, iDp3, iDp4);
            drawable.draw(canvas);
            float fCenterX2 = bounds.centerX() - AndroidUtilities.dp(3.33f);
            float fCenterY = bounds.centerY() - AndroidUtilities.dp(7.0f);
            float fDp3 = AndroidUtilities.dp(3.33f) + bounds.centerX();
            float fCenterY2 = bounds.centerY();
            Paint paint2 = this.arrowPaint;
            canvas.drawLine(fCenterX2, fCenterY, fDp3, fCenterY2, paint2);
            canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), AndroidUtilities.dp(7.0f) + bounds.centerY(), AndroidUtilities.dp(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
            ImageReceiver imageReceiver2 = this.botImageReceiver;
            imageReceiver2.setImageCoords((bounds.centerX() + f) - AndroidUtilities.dp(50.0f), bounds.centerY() - AndroidUtilities.dp(25.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
            imageReceiver2.draw(canvas);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void onAttachedToWindow(ImageReceiver imageReceiver) {
            this.userImageReceiver.onAttachedToWindow();
            this.botImageReceiver.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow(ImageReceiver imageReceiver) {
            this.userImageReceiver.onDetachedFromWindow();
            this.botImageReceiver.onDetachedFromWindow();
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        @Override
        public final void setParent(View view) {
            this.botImageReceiver.setParentView(view);
            this.userImageReceiver.setParentView(view);
        }
    }

    public BotLocation(Context context, int i, long j) {
        HashSet hashSet = new HashSet();
        this.listeners = hashSet;
        this.context = context;
        this.currentAccount = i;
        this.botId = j;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i, 0);
        this.requested = sharedPreferences.getBoolean(j + "_requested", false);
        boolean z = sharedPreferences.getBoolean(j + "_granted", false);
        this.granted = z;
        if (!z || appHasPermission()) {
            return;
        }
        this.granted = false;
        this.requested = false;
        save();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

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

    public static JSONObject locationObject(Location location) {
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

    public final boolean appHasPermission() {
        Activity activity = getActivity();
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (activity != null) {
            return activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || activity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        return false;
    }

    public final boolean asked() {
        return this.requested;
    }

    public final boolean deviceHasLocation() {
        return getActivity() != null && getActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps");
    }

    public final Activity getActivity() {
        Activity activityFindActivity = LaunchActivity.instance;
        if (activityFindActivity == null) {
            activityFindActivity = AndroidUtilities.findActivity(this.context);
        }
        return activityFindActivity == null ? AndroidUtilities.findActivity(ApplicationLoader.applicationContext) : activityFindActivity;
    }

    public final void request(final BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22) {
        Activity activity;
        final int i = 1;
        final int i2 = 0;
        Activity activity2 = getActivity();
        if (activity2 == null) {
            return;
        }
        if (!deviceHasLocation()) {
            Boolean bool = Boolean.FALSE;
            botWebViewContainer$$ExternalSyntheticLambda22.run(bool, bool);
            return;
        }
        if (appHasPermission() && (this.requested || this.granted)) {
            botWebViewContainer$$ExternalSyntheticLambda22.run(Boolean.FALSE, Boolean.TRUE);
            return;
        }
        final boolean[] zArr = new boolean[1];
        int i3 = this.currentAccount;
        TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(this.botId));
        AlertDialog.Builder builder = new AlertDialog.Builder(activity2, 0, null);
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user))));
        builder.setTopImage(new BotUserLocationDrawable(this.context, UserConfig.getInstance(i3).getCurrentUser(), user), Theme.getColor(null, Theme.key_dialogTopBackground, false));
        if (appHasPermission() || Build.VERSION.SDK_INT < 23 || (activity = getActivity()) == null || (activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
            builder.setPositiveButton(LocaleController.getString(R.string.BotLocationPermissionAllow), new AlertDialog.OnButtonClickListener(this) {
                public final BotLocation f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i4) {
                    switch (i2) {
                        case 0:
                            BotLocation botLocation = this.f$0;
                            botLocation.getClass();
                            zArr[0] = true;
                            boolean zAppHasPermission = botLocation.appHasPermission();
                            BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda23 = botWebViewContainer$$ExternalSyntheticLambda22;
                            if (!zAppHasPermission) {
                                PermissionRequest.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new GiftSheet$$ExternalSyntheticLambda4(24, botLocation, botWebViewContainer$$ExternalSyntheticLambda23));
                            } else {
                                botLocation.requested = true;
                                botLocation.granted = true;
                                botLocation.save();
                                Iterator it = botLocation.listeners.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                botWebViewContainer$$ExternalSyntheticLambda23.run(bool2, bool2);
                            }
                            break;
                        default:
                            BotLocation botLocation2 = this.f$0;
                            botLocation2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                botLocation2.requested = true;
                                botLocation2.granted = false;
                                botLocation2.save();
                                Iterator it2 = botLocation2.listeners.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                botWebViewContainer$$ExternalSyntheticLambda22.run(Boolean.TRUE, Boolean.FALSE);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            builder.setPositiveButton(LocaleController.getString(R.string.BotLocationPermissionSettings), new RichEditor$$ExternalSyntheticLambda60(activity2, zArr, botWebViewContainer$$ExternalSyntheticLambda22, 14));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.BotLocationPermissionDecline), new AlertDialog.OnButtonClickListener(this) {
            public final BotLocation f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                switch (i) {
                    case 0:
                        BotLocation botLocation = this.f$0;
                        botLocation.getClass();
                        zArr[0] = true;
                        boolean zAppHasPermission = botLocation.appHasPermission();
                        BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda23 = botWebViewContainer$$ExternalSyntheticLambda22;
                        if (!zAppHasPermission) {
                            PermissionRequest.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new GiftSheet$$ExternalSyntheticLambda4(24, botLocation, botWebViewContainer$$ExternalSyntheticLambda23));
                        } else {
                            botLocation.requested = true;
                            botLocation.granted = true;
                            botLocation.save();
                            Iterator it = botLocation.listeners.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            botWebViewContainer$$ExternalSyntheticLambda23.run(bool2, bool2);
                        }
                        break;
                    default:
                        BotLocation botLocation2 = this.f$0;
                        botLocation2.getClass();
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            botLocation2.requested = true;
                            botLocation2.granted = false;
                            botLocation2.save();
                            Iterator it2 = botLocation2.listeners.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            botWebViewContainer$$ExternalSyntheticLambda22.run(Boolean.TRUE, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        builder.setOnDismissListener(new BotLocation$$ExternalSyntheticLambda13(this, zArr, botWebViewContainer$$ExternalSyntheticLambda22, i2));
        builder.show();
    }

    public final void requestObject(final Utilities.Callback callback) {
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
                    public final void onLocationChanged(Location location) {
                        locationManager.removeUpdates(locationListenerArr[0]);
                        BotLocation.this.getClass();
                        callback.run(BotLocation.locationObject(location));
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
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
                builder.setTopAnimation(R.raw.permission_request_location, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false));
                builder.setMessage(LocaleController.getString(R.string.GpsDisabledAlertText));
                builder.setPositiveButton(LocaleController.getString(R.string.Enable), new RichEditor$3$$ExternalSyntheticLambda0(context, 6));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.show();
            } catch (Exception e3) {
                FileLog.e(e3);
            }
        }
        callback.run(locationObject(null));
    }

    public final void save() {
        SharedPreferences.Editor editorEdit = this.context.getSharedPreferences("botlocation_" + this.currentAccount, 0).edit();
        StringBuilder sb = new StringBuilder();
        long j = this.botId;
        editorEdit.putBoolean(Fragment$$ExternalSyntheticOutline0.m(sb, j, "_granted"), this.granted);
        editorEdit.putBoolean(j + "_requested", this.requested);
        editorEdit.apply();
    }

    public final void setGranted(boolean z, final QrActivity$$ExternalSyntheticLambda5 qrActivity$$ExternalSyntheticLambda5) {
        Activity activity;
        final int i = 0;
        final int i2 = 1;
        this.requested = true;
        if (!z || appHasPermission()) {
            this.granted = z;
            Iterator it = this.listeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (qrActivity$$ExternalSyntheticLambda5 != null) {
                qrActivity$$ExternalSyntheticLambda5.run();
            }
        } else {
            Activity activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            int i3 = this.currentAccount;
            TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(this.botId));
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), 0, null);
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user))));
            builder.setTopImage(new BotUserLocationDrawable(this.context, UserConfig.getInstance(i3).getCurrentUser(), user), Theme.getColor(null, Theme.key_dialogTopBackground, false));
            if (Build.VERSION.SDK_INT < 23 || (activity = getActivity()) == null || (activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                builder.setPositiveButton(LocaleController.getString(R.string.BotLocationPermissionAllow), new AlertDialog.OnButtonClickListener(this) {
                    public final BotLocation f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        switch (i) {
                            case 0:
                                BotLocation botLocation = this.f$0;
                                if (!botLocation.appHasPermission()) {
                                    PermissionRequest.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new GiftSheet$$ExternalSyntheticLambda4(25, botLocation, qrActivity$$ExternalSyntheticLambda5));
                                } else {
                                    botLocation.requested = true;
                                    botLocation.granted = true;
                                    botLocation.save();
                                    Iterator it2 = botLocation.listeners.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                }
                                break;
                            default:
                                BotLocation botLocation2 = this.f$0;
                                botLocation2.requested = true;
                                botLocation2.granted = false;
                                botLocation2.save();
                                Iterator it3 = botLocation2.listeners.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                QrActivity$$ExternalSyntheticLambda5 qrActivity$$ExternalSyntheticLambda6 = qrActivity$$ExternalSyntheticLambda5;
                                if (qrActivity$$ExternalSyntheticLambda6 != null) {
                                    qrActivity$$ExternalSyntheticLambda6.run();
                                }
                                break;
                        }
                    }
                });
            } else {
                builder.setPositiveButton(LocaleController.getString(R.string.BotLocationPermissionSettings), new BotLocation$$ExternalSyntheticLambda7(activity2, 0));
            }
            builder.setNegativeButton(LocaleController.getString(R.string.BotLocationPermissionDecline), new AlertDialog.OnButtonClickListener(this) {
                public final BotLocation f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i4) {
                    switch (i2) {
                        case 0:
                            BotLocation botLocation = this.f$0;
                            if (!botLocation.appHasPermission()) {
                                PermissionRequest.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new GiftSheet$$ExternalSyntheticLambda4(25, botLocation, qrActivity$$ExternalSyntheticLambda5));
                            } else {
                                botLocation.requested = true;
                                botLocation.granted = true;
                                botLocation.save();
                                Iterator it2 = botLocation.listeners.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                            }
                            break;
                        default:
                            BotLocation botLocation2 = this.f$0;
                            botLocation2.requested = true;
                            botLocation2.granted = false;
                            botLocation2.save();
                            Iterator it3 = botLocation2.listeners.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            QrActivity$$ExternalSyntheticLambda5 qrActivity$$ExternalSyntheticLambda6 = qrActivity$$ExternalSyntheticLambda5;
                            if (qrActivity$$ExternalSyntheticLambda6 != null) {
                                qrActivity$$ExternalSyntheticLambda6.run();
                            }
                            break;
                    }
                }
            });
            builder.show();
        }
        save();
    }
}
