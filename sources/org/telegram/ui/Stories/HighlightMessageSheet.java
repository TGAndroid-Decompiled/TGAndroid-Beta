package org.telegram.ui.Stories;

import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticLambda335;
import org.telegram.messenger.MessagesController$$ExternalSyntheticLambda44;
import org.telegram.tgnet.TLRPC;

public abstract class HighlightMessageSheet {
    public static int[] getDefaultTiers() {
        return new int[]{10000, 3600, 400, 20, -10787210, -8681059, -14341066, 2000, 1800, 280, 10, -2013375, -1482439, -7666429, 500, 900, 200, 7, -1214690, -1214690, -6606592, 250, 600, 150, 4, -1926647, -1926647, -6668800, 100, 300, 110, 3, -12539616, -12539616, -15244800, 50, 120, 80, 2, -12147733, -12147733, -16756594, 10, 60, 60, 1, -6988581, -6988581, -11991141, 0, 30, 30, 0, -6988581, -6988581, -11991141};
    }

    public static int getTierOption(int i, int i2, int i3) {
        int[] iArr = MessagesController.getInstance(i).starsGroupcallMessageLimits;
        for (int i4 = 0; i4 < iArr.length / 7; i4++) {
            int i5 = i4 * 7;
            if (i2 >= iArr[i5]) {
                return iArr[i5 + 1 + i3];
            }
        }
        return 0;
    }

    public static int[] parseTiers(TLRPC.TL_jsonArray tL_jsonArray) {
        int i;
        int i2;
        int[] iArr = new int[tL_jsonArray.value.size() * 7];
        for (int i3 = 0; i3 < tL_jsonArray.value.size(); i3++) {
            TLRPC.JSONValue jSONValue = tL_jsonArray.value.get(i3);
            if (jSONValue instanceof TLRPC.TL_jsonObject) {
                ArrayList<TLRPC.TL_jsonObjectValue> arrayList = ((TLRPC.TL_jsonObject) jSONValue).value;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue = arrayList.get(i4);
                    i4++;
                    TLRPC.TL_jsonObjectValue tL_jsonObjectValue2 = tL_jsonObjectValue;
                    TLRPC.JSONValue jSONValue2 = tL_jsonObjectValue2.value;
                    if (jSONValue2 instanceof TLRPC.TL_jsonNumber) {
                        int i5 = (int) ((TLRPC.TL_jsonNumber) jSONValue2).value;
                        String str = tL_jsonObjectValue2.key;
                        str.getClass();
                        switch (str) {
                            case "text_length_max":
                                i = 2;
                                break;
                            case "pin_period":
                                i = 1;
                                break;
                            case "stars":
                                i = 0;
                                break;
                            case "emoji_max":
                                i = 3;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        if (i >= 0) {
                            iArr[(i3 * 7) + i] = i5;
                        }
                    } else if (jSONValue2 instanceof TLRPC.TL_jsonString) {
                        String str2 = ((TLRPC.TL_jsonString) jSONValue2).value;
                        String str3 = tL_jsonObjectValue2.key;
                        str3.getClass();
                        switch (str3) {
                            case "color1":
                                i2 = 4;
                                break;
                            case "color2":
                                i2 = 5;
                                break;
                            case "color_bg":
                                i2 = 6;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                        if (i2 >= 0) {
                            try {
                                iArr[(i3 * 7) + i2] = (int) Long.parseLong("FF" + str2, 16);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                    }
                }
            }
        }
        return iArr;
    }

    public static int[] parseTiersString(String str) {
        if (str == null || str.length() == 0) {
            return getDefaultTiers();
        }
        try {
            return DesugarArrays.stream(str.split(",")).mapToInt(new MessagesController$$ExternalSyntheticLambda335(0)).toArray();
        } catch (Exception e) {
            FileLog.e(e);
            return getDefaultTiers();
        }
    }

    public static boolean tiersEqual(int[] iArr, int[] iArr2) {
        if (iArr2 != null && iArr.length == iArr2.length) {
            for (int i = 0; i < iArr.length; i++) {
                if (iArr[i] == iArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static String tiersToString(int[] iArr) {
        return (String) DesugarArrays.stream(iArr).mapToObj(new MessagesController$$ExternalSyntheticLambda44(0)).collect(Collectors.joining(","));
    }
}
