package org.telegram.ui.Components;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
public abstract class ec1 {
    public static final int[] f27819a = {org.telegram.ui.ActionBar.y6.f23619ra, org.telegram.ui.ActionBar.y6.f23381ec, org.telegram.ui.ActionBar.y6.f23548nd, org.telegram.ui.ActionBar.y6.gc, org.telegram.ui.ActionBar.y6.Wc};
    public static final int[] f27820b = {org.telegram.ui.ActionBar.y6.Aa, org.telegram.ui.ActionBar.y6.f23399fc, org.telegram.ui.ActionBar.y6.f23640sb, org.telegram.ui.ActionBar.y6.f23435hc, org.telegram.ui.ActionBar.y6.f23343cb};
    public static final int[] f27821c = {org.telegram.ui.ActionBar.y6.Da, org.telegram.ui.ActionBar.y6.Ea, org.telegram.ui.ActionBar.y6.Fa};

    public static String a(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        boolean q5;
        int[] iArr;
        int i10;
        Object obj;
        String str = "light";
        if (u6Var != null) {
            q5 = u6Var.a();
        } else {
            q5 = org.telegram.ui.ActionBar.y6.I.q();
        }
        if (z10) {
            iArr = f27820b;
        } else {
            iArr = f27819a;
        }
        try {
            int b10 = b(u6Var, z10);
            if (q5) {
                i10 = -16777216;
            } else {
                i10 = -1;
            }
            int v = org.telegram.ui.ActionBar.y6.v(i10, b10);
            int w02 = org.telegram.ui.ActionBar.y6.w0(iArr[1], u6Var);
            int w03 = org.telegram.ui.ActionBar.y6.w0(iArr[2], u6Var);
            int w04 = org.telegram.ui.ActionBar.y6.w0(iArr[3], u6Var);
            int w05 = org.telegram.ui.ActionBar.y6.w0(iArr[4], u6Var);
            int w06 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
            int w07 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sh, u6Var);
            int v10 = org.telegram.ui.ActionBar.y6.v(v, org.telegram.ui.ActionBar.y6.o1(0.1f, w05));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", c(v, v));
            jSONObject.put("text_color", c(w02, v));
            jSONObject.put("hint_color", c(w03, v));
            jSONObject.put("link_color", c(w04, v));
            jSONObject.put("button_color", c(w06, v));
            jSONObject.put("button_text_color", c(w07, w06));
            jSONObject.put("secondary_bg_color", c(v10, v));
            jSONObject.put("accent_text_color", c(w05, v));
            jSONObject.put("subtitle_text_color", c(w03, v));
            jSONObject.put("destructive_text_color", c(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p7, u6Var), v));
            jSONObject.put("section_bg_color", c(v, v));
            jSONObject.put("section_header_text_color", c(w05, v));
            jSONObject.put("section_separator_color", c(org.telegram.ui.ActionBar.y6.o1(0.12f, w02), v));
            jSONObject.put("header_bg_color", c(v10, v));
            jSONObject.put("bottom_bar_bg_color", c(v10, v));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", c(w05, v));
            JSONObject jSONObject3 = new JSONObject();
            if (!q5) {
                obj = "light";
            } else {
                obj = "dark";
            }
            jSONObject3.put("colorScheme", obj);
            jSONObject3.put("params", jSONObject);
            jSONObject3.put("button", jSONObject2);
            jSONObject3.put("text", f());
            return jSONObject3.toString();
        } catch (Exception e) {
            FileLog.e(e);
            StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
            if (q5) {
                str = "dark";
            }
            return a1.g.s(sb2, str, "\"}");
        }
    }

    public static int b(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        if (z10) {
            i10 = f27820b[0];
        } else {
            i10 = f27819a[0];
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        if (z10) {
            int[] iArr = f27821c;
            int i13 = iArr[0];
            if (u6Var != null) {
                i11 = u6Var.i(i13);
            } else {
                i11 = org.telegram.ui.ActionBar.y6.ul.get(i13);
            }
            if (i11 != 0) {
                int red = Color.red(w02);
                int green = Color.green(w02);
                int blue = Color.blue(w02);
                int i14 = 1;
                for (int i15 : iArr) {
                    if (u6Var != null) {
                        i12 = u6Var.i(i15);
                    } else {
                        i12 = org.telegram.ui.ActionBar.y6.ul.get(i15);
                    }
                    if (i12 != 0) {
                        int red2 = Color.red(i12) + red;
                        int green2 = Color.green(i12) + green;
                        i14++;
                        blue = Color.blue(i12) + blue;
                        green = green2;
                        red = red2;
                    }
                }
                return Color.argb(Color.alpha(w02), red / i14, green / i14, blue / i14);
            }
        }
        return w02;
    }

    public static String c(int i10, int i11) {
        int v = org.telegram.ui.ActionBar.y6.v(i11, i10);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(v)), Integer.valueOf(Color.green(v)), Integer.valueOf(Color.blue(v)));
    }

    public static String d(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder("{\"colorScheme\":\"");
        if (z10) {
            str = "dark";
        } else {
            str = "light";
        }
        return a1.g.s(sb2, str, "\"}");
    }

    public static int e(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        int i10;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12 = 0;
        if (u6Var == null ? org.telegram.ui.ActionBar.y6.I.q() : u6Var.a()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (z10) {
            iArr = f27820b;
        } else {
            iArr = f27819a;
        }
        for (int i13 : iArr) {
            i10 = (i10 * 31) + org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
        }
        if (z10) {
            for (int i14 : f27821c) {
                int i15 = i10 * 31;
                if (u6Var != null) {
                    i11 = u6Var.i(i14);
                } else {
                    i11 = org.telegram.ui.ActionBar.y6.ul.get(i14);
                }
                i10 = i15 + i11;
            }
        }
        int w02 = (((org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23582p7, u6Var) + ((org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Sh, u6Var) + ((org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var) + (i10 * 31)) * 31)) * 31)) * 31) + SharedConfig.fontSize) * 31;
        TextPaint textPaint = org.telegram.ui.ActionBar.y6.f23557o2;
        if (textPaint != null) {
            i12 = Float.floatToIntBits(textPaint.getTextSize());
        }
        return bn0.l() + ((w02 + i12) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", SharedConfig.fontSize);
        TextPaint textPaint = org.telegram.ui.ActionBar.y6.f23557o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        int round = Math.round(bn0.l() / AndroidUtilities.density);
        jSONObject.put("padding", "8px " + round + "px");
        return jSONObject;
    }
}
