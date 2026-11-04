package org.telegram.ui.Components;

import android.net.Uri;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import org.json.JSONArray;
import org.json.JSONTokener;
public final class v11 extends Thread {
    public final String f38956a;
    public final String f38957b;
    public final String f38958c;
    public final org.telegram.messenger.n10 d;

    public v11(String str, String str2, String str3, org.telegram.messenger.n10 n10Var) {
        this.f38956a = str;
        this.f38957b = str2;
        this.f38958c = str3;
        this.d = n10Var;
    }

    @Override
    public final void run() {
        HttpURLConnection httpURLConnection;
        Integer num;
        String str;
        org.telegram.messenger.n10 n10Var = this.d;
        String str2 = this.f38958c;
        boolean z10 = false;
        String str3 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(this.f38956a) + "&tl=" + Uri.encode(this.f38957b) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str2).toURL().openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("User-Agent", f21.P1[(int) Math.round(Math.random() * 5)]);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), f9.j.f11512a));
                while (true) {
                    int read = bufferedReader.read();
                    if (read == -1) {
                        break;
                    }
                    sb2.append((char) read);
                }
                bufferedReader.close();
                JSONArray jSONArray = new JSONArray(new JSONTokener(sb2.toString()));
                JSONArray jSONArray2 = jSONArray.getJSONArray(0);
                try {
                    str = jSONArray.getString(2);
                } catch (Exception unused) {
                    str = null;
                }
                if (str != null && str.contains("-")) {
                    str.substring(0, str.indexOf("-"));
                }
                String str4 = "";
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    String string = jSONArray2.getJSONArray(i3).getString(0);
                    if (string != null && !string.equals("null")) {
                        str4 = str4 + string;
                    }
                }
                if (str2.length() > 0 && str2.charAt(0) == '\n') {
                    str4 = "\n" + str4;
                }
                org.telegram.messenger.g0.h3(new u11(str4, 0, n10Var));
            } catch (Exception e10) {
                e = e10;
                try {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("failed to translate a text ");
                    if (httpURLConnection != null) {
                        num = Integer.valueOf(httpURLConnection.getResponseCode());
                    } else {
                        num = null;
                    }
                    sb3.append(num);
                    sb3.append(" ");
                    if (httpURLConnection != null) {
                        str3 = httpURLConnection.getResponseMessage();
                    }
                    sb3.append(str3);
                    Log.e("translate", sb3.toString());
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                e.printStackTrace();
                if (httpURLConnection != null) {
                    try {
                        if (httpURLConnection.getResponseCode() == 429) {
                            z10 = true;
                        }
                    } catch (Exception unused2) {
                        org.telegram.messenger.g0.h3(new sp0(n10Var, 21));
                        return;
                    }
                }
                org.telegram.messenger.g0.h3(new up0(4, n10Var, z10));
            }
        } catch (Exception e12) {
            e = e12;
            httpURLConnection = null;
        }
    }
}
