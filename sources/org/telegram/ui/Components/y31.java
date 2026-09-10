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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y31 extends Thread {
    public final String f29241a;
    public final String f29242b;
    public final String f29243c;
    public final Utilities.Callback2 d;

    public y31(String str, String str2, String str3, Utilities.Callback2 callback2) {
        this.f29241a = str;
        this.f29242b = str2;
        this.f29243c = str3;
        this.d = callback2;
    }

    @Override
    public final void run() {
        HttpURLConnection httpURLConnection;
        Integer num;
        String str;
        Utilities.Callback2 callback2 = this.d;
        String str2 = this.f29243c;
        boolean z10 = false;
        String str3 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(this.f29241a) + "&tl=" + Uri.encode(this.f29242b) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str2).toURL().openConnection();
        } catch (Exception e) {
            e = e;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("User-Agent", i41.R[(int) Math.round(Math.random() * 5)]);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), d9.d.f6336a));
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
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String string = jSONArray2.getJSONArray(i10).getString(0);
                if (string != null && !string.equals("null")) {
                    str4 = str4 + string;
                }
            }
            if (str2.length() > 0 && str2.charAt(0) == '\n') {
                str4 = "\n" + str4;
            }
            AndroidUtilities.runOnUIThread(new yo0(14, callback2, str4));
        } catch (Exception e7) {
            e = e7;
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
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            e.printStackTrace();
            if (httpURLConnection != null) {
                try {
                    if (httpURLConnection.getResponseCode() == 429) {
                        z10 = true;
                    }
                } catch (Exception unused2) {
                    AndroidUtilities.runOnUIThread(new uq0(callback2, 21));
                    return;
                }
            }
            AndroidUtilities.runOnUIThread(new bs0(3, callback2, z10));
        }
    }
}
