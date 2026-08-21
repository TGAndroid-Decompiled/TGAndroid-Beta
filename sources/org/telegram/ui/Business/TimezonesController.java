package org.telegram.ui.Business;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public class TimezonesController {
    private static volatile TimezonesController[] Instance = new TimezonesController[4];
    private static final Object[] lockObjects = new Object[4];
    public final int currentAccount;
    private boolean loaded;
    private boolean loading;
    private final ArrayList timezones = new ArrayList();

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static TimezonesController getInstance(int i) {
        TimezonesController timezonesController;
        TimezonesController timezonesController2 = Instance[i];
        if (timezonesController2 != null) {
            return timezonesController2;
        }
        synchronized (lockObjects[i]) {
            try {
                timezonesController = Instance[i];
                if (timezonesController == null) {
                    TimezonesController[] timezonesControllerArr = Instance;
                    TimezonesController timezonesController3 = new TimezonesController(i);
                    timezonesControllerArr[i] = timezonesController3;
                    timezonesController = timezonesController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return timezonesController;
    }

    private TimezonesController(int i) {
        this.currentAccount = i;
    }

    public ArrayList getTimezones() {
        load();
        return this.timezones;
    }

    public void load() {
        if (this.loading || this.loaded) {
            return;
        }
        this.loading = true;
        final SharedPreferences mainSettings = MessagesController.getInstance(this.currentAccount).getMainSettings();
        TLRPC.help_timezonesList help_timezoneslistTLdeserialize = null;
        String string = mainSettings.getString("timezones", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            help_timezoneslistTLdeserialize = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.timezones.clear();
        if (help_timezoneslistTLdeserialize != null) {
            this.timezones.addAll(help_timezoneslistTLdeserialize.timezones);
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.timezonesUpdated, new Object[0]);
        TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
        tL_help_getTimezonesList.hash = help_timezoneslistTLdeserialize != null ? help_timezoneslistTLdeserialize.hash : 0;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getTimezonesList, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TimezonesController.m1420$r8$lambda$f6dXHBZd0MEqZLgFSSBGh4Zd1Q(this.f$0, mainSettings, tLObject, tL_error);
            }
        });
    }

    public static void m1420$r8$lambda$f6dXHBZd0MEqZLgFSSBGh4Zd1Q(final TimezonesController timezonesController, final SharedPreferences sharedPreferences, final TLObject tLObject, TLRPC.TL_error tL_error) {
        timezonesController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TimezonesController.m1421$r8$lambda$tqrv1Lre0W6MbPeoaQYSWqckzk(this.f$0, tLObject, sharedPreferences);
            }
        });
    }

    public static void m1421$r8$lambda$tqrv1Lre0W6MbPeoaQYSWqckzk(TimezonesController timezonesController, TLObject tLObject, SharedPreferences sharedPreferences) {
        timezonesController.getClass();
        if (tLObject instanceof TLRPC.TL_help_timezonesList) {
            timezonesController.timezones.clear();
            timezonesController.timezones.addAll(((TLRPC.TL_help_timezonesList) tLObject).timezones);
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            sharedPreferences.edit().putString("timezones", Utilities.bytesToHex(serializedData.toByteArray())).apply();
            NotificationCenter.getInstance(timezonesController.currentAccount).postNotificationName(NotificationCenter.timezonesUpdated, new Object[0]);
        }
        timezonesController.loaded = true;
        timezonesController.loading = false;
    }

    public String getSystemTimezoneId() {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        String id = zoneIdSystemDefault != null ? zoneIdSystemDefault.getId() : null;
        if (this.loading || !this.loaded) {
            load();
            return id;
        }
        for (int i = 0; i < this.timezones.size(); i++) {
            if (TextUtils.equals(((TLRPC.TL_timezone) this.timezones.get(i)).id, id)) {
                return id;
            }
        }
        int totalSeconds = zoneIdSystemDefault != null ? zoneIdSystemDefault.getRules().getOffset(Instant.now()).getTotalSeconds() : 0;
        for (int i2 = 0; i2 < this.timezones.size(); i2++) {
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) this.timezones.get(i2);
            if (totalSeconds == tL_timezone.utc_offset) {
                return tL_timezone.id;
            }
        }
        if (!this.timezones.isEmpty()) {
            return ((TLRPC.TL_timezone) this.timezones.get(0)).id;
        }
        return id;
    }

    public TLRPC.TL_timezone findTimezone(String str) {
        if (str == null) {
            return null;
        }
        load();
        for (int i = 0; i < this.timezones.size(); i++) {
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) this.timezones.get(i);
            if (TextUtils.equals(tL_timezone.id, str)) {
                return tL_timezone;
            }
        }
        return null;
    }

    public String getTimezoneName(TLRPC.TL_timezone tL_timezone, boolean z) {
        if (tL_timezone == null) {
            return null;
        }
        if (z) {
            return tL_timezone.name + ", " + getTimezoneOffsetName(tL_timezone);
        }
        return tL_timezone.name;
    }

    public String getTimezoneOffsetName(TLRPC.TL_timezone tL_timezone) {
        if (tL_timezone.utc_offset == 0) {
            return "GMT";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GMT");
        sb.append(tL_timezone.utc_offset < 0 ? "-" : "+");
        String string = sb.toString();
        int iAbs = Math.abs(tL_timezone.utc_offset) / 60;
        int i = iAbs / 60;
        int i2 = iAbs % 60;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(i < 10 ? "0" : "");
        sb2.append(i);
        String str = sb2.toString() + ":";
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(i2 < 10 ? "0" : "");
        sb3.append(i2);
        return sb3.toString();
    }

    public String getTimezoneName(String str, boolean z) {
        String str2;
        TLRPC.TL_timezone tL_timezoneFindTimezone = findTimezone(str);
        if (tL_timezoneFindTimezone != null) {
            return getTimezoneName(tL_timezoneFindTimezone, z);
        }
        ZoneId zoneIdOf = ZoneId.of(str);
        String str3 = "";
        if (zoneIdOf == null) {
            return "";
        }
        if (z) {
            String displayName = zoneIdOf.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            str2 = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                str2 = "GMT" + displayName;
            }
        } else {
            str2 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(zoneIdOf.getId().replace("/", ", ").replace("_", " "));
        if (str2 != null) {
            str3 = ", " + str2;
        }
        sb.append(str3);
        return sb.toString();
    }
}
