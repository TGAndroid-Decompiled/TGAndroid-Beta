package org.telegram.ui.Components;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.util.Locale;
import org.json.JSONObject;
public abstract class ib1 {
    public static DateFormat a(JSONObject jSONObject, String str, Locale locale) {
        boolean z10;
        int i10;
        boolean z11;
        DateFormat dateFormat;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String optString = jSONObject.optString("dateStyle");
        optString.getClass();
        int i11 = 2;
        boolean z12 = true;
        switch (optString.hashCode()) {
            case -1078030475:
                if (optString.equals("medium")) {
                    z10 = false;
                    break;
                }
                z10 = true;
                break;
            case 3154575:
                if (optString.equals("full")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 3327612:
                if (optString.equals("long")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case 109413500:
                if (optString.equals("short")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            default:
                z10 = true;
                break;
        }
        switch (z10) {
            case false:
                i10 = 2;
                break;
            case true:
                i10 = 0;
                break;
            case true:
                i10 = 1;
                break;
            case true:
                i10 = 3;
                break;
            default:
                i10 = -1;
                break;
        }
        String optString2 = jSONObject.optString("timeStyle");
        optString2.getClass();
        switch (optString2.hashCode()) {
            case -1078030475:
                if (optString2.equals("medium")) {
                    z11 = false;
                    break;
                }
                z11 = true;
                break;
            case 3154575:
                if (optString2.equals("full")) {
                    z11 = true;
                    break;
                }
                z11 = true;
                break;
            case 3327612:
                if (optString2.equals("long")) {
                    z11 = true;
                    break;
                }
                z11 = true;
                break;
            case 109413500:
                if (optString2.equals("short")) {
                    z11 = true;
                    break;
                }
                z11 = true;
                break;
            default:
                z11 = true;
                break;
        }
        switch (z11) {
            case false:
                break;
            case true:
                i11 = 0;
                break;
            case true:
                i11 = 1;
                break;
            case true:
                i11 = 3;
                break;
            default:
                i11 = -1;
                break;
        }
        if (i10 >= 0 && i11 >= 0) {
            dateFormat = DateFormat.getDateTimeInstance(i10, i11, locale);
        } else if (i10 >= 0) {
            dateFormat = DateFormat.getDateInstance(i10, locale);
        } else if (i11 >= 0) {
            dateFormat = DateFormat.getTimeInstance(i11, locale);
        } else {
            dateFormat = null;
        }
        if (dateFormat == null) {
            StringBuilder sb2 = new StringBuilder();
            String optString3 = jSONObject.optString("era");
            if (!optString3.isEmpty()) {
                if (optString3.equals("long")) {
                    str7 = "GGGG";
                } else if (optString3.equals("narrow")) {
                    str7 = "GGGGG";
                } else {
                    str7 = "G";
                }
                sb2.append(str7);
            }
            String optString4 = jSONObject.optString("year");
            if (!optString4.isEmpty()) {
                if (optString4.equals("2-digit")) {
                    str6 = "yy";
                } else {
                    str6 = "y";
                }
                sb2.append(str6);
            }
            String optString5 = jSONObject.optString("month");
            if (!optString5.isEmpty()) {
                if (optString5.equals("long")) {
                    str5 = "MMMM";
                } else if (optString5.equals("short")) {
                    str5 = "MMM";
                } else if (optString5.equals("narrow")) {
                    str5 = "MMMMM";
                } else if (optString5.equals("2-digit")) {
                    str5 = "MM";
                } else {
                    str5 = "M";
                }
                sb2.append(str5);
            }
            String optString6 = jSONObject.optString("weekday");
            if (!optString6.isEmpty()) {
                if (optString6.equals("long")) {
                    str4 = "EEEE";
                } else if (optString6.equals("narrow")) {
                    str4 = "EEEEE";
                } else {
                    str4 = "EEE";
                }
                sb2.append(str4);
            }
            String optString7 = jSONObject.optString("day");
            if (!optString7.isEmpty()) {
                if (optString7.equals("2-digit")) {
                    str3 = "dd";
                } else {
                    str3 = "d";
                }
                sb2.append(str3);
            }
            String optString8 = jSONObject.optString("hour");
            if (!optString8.isEmpty()) {
                sb2.append(c(jSONObject, optString8.equals("2-digit")));
            }
            if (jSONObject.has("minute")) {
                sb2.append("mm");
            }
            if (jSONObject.has("second")) {
                sb2.append("ss");
            }
            if (sb2.length() == 0) {
                boolean equals = str.equals("toLocaleTimeString");
                if (!str.equals("toLocaleTimeString") && !str.equals("toLocaleString")) {
                    z12 = false;
                }
                if (!equals) {
                    sb2.append("yMd");
                }
                if (z12) {
                    sb2.append(c(jSONObject, false));
                    sb2.append("mmss");
                }
            }
            String optString9 = jSONObject.optString("timeZoneName");
            if (!optString9.isEmpty()) {
                if (optString9.equals("long")) {
                    str2 = "zzzz";
                } else {
                    str2 = "z";
                }
                sb2.append(str2);
            }
            dateFormat = DateFormat.getInstanceForSkeleton(sb2.toString(), locale);
        }
        String optString10 = jSONObject.optString("timeZone");
        if (!optString10.isEmpty()) {
            dateFormat.setTimeZone(TimeZone.getTimeZone(optString10));
        }
        return dateFormat;
    }

    public static java.lang.String b(java.lang.String r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib1.b(java.lang.String):java.lang.String");
    }

    public static java.lang.String c(org.json.JSONObject r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ib1.c(org.json.JSONObject, boolean):java.lang.String");
    }
}
