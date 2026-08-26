package org.telegram.ui.Business;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;

public final class TimezonesController {
    public static volatile TimezonesController[] Instance = new TimezonesController[4];
    public static final Object[] lockObjects = new Object[4];
    public final int currentAccount;
    public boolean loaded;
    public boolean loading;
    public final ArrayList timezones = new ArrayList();

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public TimezonesController(int i) {
        this.currentAccount = i;
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

    public static String getTimezoneName(TLRPC.TL_timezone tL_timezone, boolean z) {
        if (tL_timezone == null) {
            return null;
        }
        if (!z) {
            return tL_timezone.name;
        }
        return tL_timezone.name + ", " + getTimezoneOffsetName(tL_timezone);
    }

    public static String getTimezoneOffsetName(TLRPC.TL_timezone tL_timezone) {
        int i = tL_timezone.utc_offset;
        if (i == 0) {
            return "GMT";
        }
        String strConcat = "GMT".concat(i < 0 ? "-" : "+");
        int iAbs = Math.abs(tL_timezone.utc_offset) / 60;
        int i2 = iAbs / 60;
        int i3 = iAbs % 60;
        StringBuilder sbM = DiffUtil.m(strConcat);
        sbM.append(i2 < 10 ? "0" : "");
        sbM.append(i2);
        StringBuilder sbM2 = DiffUtil.m(zzhp.m(sbM.toString(), ":"));
        sbM2.append(i3 < 10 ? "0" : "");
        sbM2.append(i3);
        return sbM2.toString();
    }

    public final TLRPC.TL_timezone findTimezone(String str) {
        if (str == null) {
            return null;
        }
        load();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.timezones;
            if (i >= arrayList.size()) {
                return null;
            }
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i);
            if (TextUtils.equals(tL_timezone.id, str)) {
                return tL_timezone;
            }
            i++;
        }
    }

    public final String getSystemTimezoneId() {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        String id = zoneIdSystemDefault != null ? zoneIdSystemDefault.getId() : null;
        if (this.loading || !this.loaded) {
            load();
            return id;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.timezones;
            if (i >= arrayList.size()) {
                int totalSeconds = zoneIdSystemDefault != null ? zoneIdSystemDefault.getRules().getOffset(Instant.now()).getTotalSeconds() : 0;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList.get(i2);
                    if (totalSeconds == tL_timezone.utc_offset) {
                        return tL_timezone.id;
                    }
                }
                if (arrayList.isEmpty()) {
                    break;
                }
                return ((TLRPC.TL_timezone) arrayList.get(0)).id;
            }
            if (TextUtils.equals(((TLRPC.TL_timezone) arrayList.get(i)).id, id)) {
                break;
            }
            i++;
        }
        return id;
    }

    public final void load() {
        if (this.loading || this.loaded) {
            return;
        }
        this.loading = true;
        int i = this.currentAccount;
        SharedPreferences mainSettings = MessagesController.getInstance(i).getMainSettings();
        TLRPC.help_timezonesList help_timezoneslistTLdeserialize = null;
        String string = mainSettings.getString("timezones", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            help_timezoneslistTLdeserialize = TLRPC.help_timezonesList.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        ArrayList arrayList = this.timezones;
        arrayList.clear();
        if (help_timezoneslistTLdeserialize != null) {
            arrayList.addAll(help_timezoneslistTLdeserialize.timezones);
        }
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.timezonesUpdated, new Object[0]);
        TLRPC.TL_help_getTimezonesList tL_help_getTimezonesList = new TLRPC.TL_help_getTimezonesList();
        tL_help_getTimezonesList.hash = help_timezoneslistTLdeserialize != null ? help_timezoneslistTLdeserialize.hash : 0;
        ConnectionsManager.getInstance(i).sendRequest(tL_help_getTimezonesList, new StarGiftSheet$$ExternalSyntheticLambda0(12, this, mainSettings));
    }

    public final String getTimezoneName(String str, boolean z) {
        String strConcat;
        TLRPC.TL_timezone tL_timezoneFindTimezone = findTimezone(str);
        if (tL_timezoneFindTimezone != null) {
            return getTimezoneName(tL_timezoneFindTimezone, z);
        }
        ZoneId zoneIdOf = ZoneId.of(str);
        if (zoneIdOf == null) {
            return "";
        }
        if (z) {
            String displayName = zoneIdOf.getRules().getOffset(Instant.now()).getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            strConcat = "GMT";
            if (displayName.length() != 1 || displayName.charAt(0) != 'Z') {
                strConcat = "GMT".concat(displayName);
            }
        } else {
            strConcat = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(zoneIdOf.getId().replace("/", ", ").replace("_", " "));
        sb.append(strConcat != null ? ", ".concat(strConcat) : "");
        return sb.toString();
    }
}
