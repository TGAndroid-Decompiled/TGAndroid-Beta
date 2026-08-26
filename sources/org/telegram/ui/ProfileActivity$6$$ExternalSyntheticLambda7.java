package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.Weather;
import org.telegram.ui.Stories.recorder.Weather$$ExternalSyntheticLambda5;
import org.telegram.ui.bots.BotLocation$$ExternalSyntheticLambda10;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.WebBrowserSettings;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class ProfileActivity$6$$ExternalSyntheticLambda7 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public ProfileActivity$6$$ExternalSyntheticLambda7(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr;
        Context context;
        int i = 7;
        int i2 = 3;
        TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda9 = null;
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = ProfileActivity.this;
                if (profileActivity.getParentActivity() != null) {
                    BulletinFactory.of(profileActivity).createDownloadBulletin(this.f$1 ? BulletinFactory.FileType.VIDEO : BulletinFactory.FileType.PHOTO, null).show();
                    break;
                }
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                StarsController starsController = (StarsController) this.f$0;
                if (this.f$1) {
                    SendMessagesHelper.getInstance(starsController.currentAccount).cancelSendingMessage(new ArrayList<>(hashSet));
                } else {
                    starsController.getClass();
                }
                break;
            case 2:
                PeerStoriesView peerStoriesView = (PeerStoriesView) this.f$0;
                PeerStoriesView.AnonymousClass4 anonymousClass4 = peerStoriesView.storyContainer;
                DarkThemeResourceProvider darkThemeResourceProvider = peerStoriesView.resourcesProvider;
                new BulletinFactory(anonymousClass4, darkThemeResourceProvider).createDownloadBulletin(this.f$1 ? BulletinFactory.FileType.VIDEO : BulletinFactory.FileType.PHOTO, darkThemeResourceProvider).show();
                break;
            case 3:
                Utilities.Callback callback = (Utilities.Callback) this.f$0;
                boolean z = this.f$1;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activityFindActivity = LaunchActivity.instance;
                    if (activityFindActivity == null) {
                        activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activityFindActivity == null || activityFindActivity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        AlertDialog alertDialog = z ? new AlertDialog(activityFindActivity, 3, new DarkThemeResourceProvider()) : null;
                        if (z) {
                            alertDialog.showDelayed(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        PhotoViewer$$ExternalSyntheticLambda91 photoViewer$$ExternalSyntheticLambda91 = new PhotoViewer$$ExternalSyntheticLambda91(z, alertDialog, callback, 4);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(1000.0d * longitude) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (Weather.cacheValue == null || !TextUtils.equals(Weather.cacheKey, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            Weather$$ExternalSyntheticLambda5 weather$$ExternalSyntheticLambda5 = new Weather$$ExternalSyntheticLambda5(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, photoViewer$$ExternalSyntheticLambda91, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new ChatActivity$$ExternalSyntheticLambda206(iArr2, messagesController, userArr, weather$$ExternalSyntheticLambda5, photoViewer$$ExternalSyntheticLambda91, 14));
                            } else {
                                iArr = iArr2;
                                weather$$ExternalSyntheticLambda5.run();
                            }
                            todoItemMenu$$ExternalSyntheticLambda9 = new TodoItemMenu$$ExternalSyntheticLambda9(i, iArr, connectionsManager);
                        } else {
                            photoViewer$$ExternalSyntheticLambda91.run(Weather.cacheValue);
                        }
                        if (z && todoItemMenu$$ExternalSyntheticLambda9 != null) {
                            alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(todoItemMenu$$ExternalSyntheticLambda9, i));
                            break;
                        }
                    }
                }
                break;
            case 4:
                ProfileActivity$6$$ExternalSyntheticLambda7 profileActivity$6$$ExternalSyntheticLambda7 = (ProfileActivity$6$$ExternalSyntheticLambda7) this.f$0;
                boolean z2 = this.f$1;
                if (((Boolean) obj).booleanValue()) {
                    final LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location lastKnownLocation = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
                        if (lastKnownLocation != null) {
                            if (lastKnownLocation == null && z2) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    try {
                                        final Utilities.Callback[] callbackArr = {profileActivity$6$$ExternalSyntheticLambda7};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() {
                                            @Override
                                            public final void onLocationChanged(Location location2) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                Utilities.Callback[] callbackArr2 = callbackArr;
                                                Utilities.Callback callback2 = callbackArr2[0];
                                                if (callback2 != null) {
                                                    callback2.run(location2);
                                                    callbackArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        profileActivity$6$$ExternalSyntheticLambda7.run(null);
                                        return;
                                    }
                                } else {
                                    context = LaunchActivity.instance;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, null);
                                            builder.setTopAnimation(R.raw.permission_request_location, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
                                            builder.alertDialog.message = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            builder.setPositiveButton(LocaleController.getString(R.string.Enable), new BotLocation$$ExternalSyntheticLambda10(context, i2));
                                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                            builder.show();
                                        } catch (Exception e2) {
                                            FileLog.e(e2);
                                        }
                                    }
                                }
                            }
                            profileActivity$6$$ExternalSyntheticLambda7.run(lastKnownLocation);
                        }
                        break;
                    }
                    if (lastKnownLocation == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                            context = LaunchActivity.instance;
                            if (context == null) {
                                context = ApplicationLoader.applicationContext;
                            }
                            if (context != null) {
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
                                builder2.setTopAnimation(R.raw.permission_request_location, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
                                builder2.alertDialog.message = LocaleController.getString(R.string.GpsDisabledAlertText);
                                builder2.setPositiveButton(LocaleController.getString(R.string.Enable), new BotLocation$$ExternalSyntheticLambda10(context, i2));
                                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                builder2.show();
                            }
                        } else {
                            final Utilities.Callback[] callbackArr2 = {profileActivity$6$$ExternalSyntheticLambda7};
                            final LocationListener[] locationListenerArr2 = {null};
                            LocationListener locationListener2 = new LocationListener() {
                                @Override
                                public final void onLocationChanged(Location location2) {
                                    LocationListener[] locationListenerArr3 = locationListenerArr2;
                                    LocationListener locationListener3 = locationListenerArr3[0];
                                    if (locationListener3 != null) {
                                        locationManager.removeUpdates(locationListener3);
                                        locationListenerArr3[0] = null;
                                    }
                                    Utilities.Callback[] callbackArr3 = callbackArr2;
                                    Utilities.Callback callback2 = callbackArr3[0];
                                    if (callback2 != null) {
                                        callback2.run(location2);
                                        callbackArr3[0] = null;
                                    }
                                }
                            };
                            locationListenerArr2[0] = locationListener2;
                            locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener2);
                        }
                    }
                    profileActivity$6$$ExternalSyntheticLambda7.run(lastKnownLocation);
                } else {
                    profileActivity$6$$ExternalSyntheticLambda7.run(null);
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda8((AddressBarList) this.f$0, (String) obj, this.f$1, 15));
                break;
            default:
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) this.f$0;
                webBrowserSettings.getMessagesController().addWebBrowserException((String) obj, this.f$1);
                webBrowserSettings.listView.adapter.update(true);
                break;
        }
    }
}
