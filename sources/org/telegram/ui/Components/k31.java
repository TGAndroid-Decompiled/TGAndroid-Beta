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
public final class k31 extends Thread {
    public final String f26159a;
    public final String f26160b;
    public final String f26161c;
    public final Utilities.Callback2 d;

    public k31(String str, String str2, String str3, Utilities.Callback2 callback2) {
        this.f26159a = str;
        this.f26160b = str2;
        this.f26161c = str3;
        this.d = callback2;
    }

    @Override
    public final void run() {
        HttpURLConnection httpURLConnection;
        Integer num;
        String str;
        Utilities.Callback2 callback2 = this.d;
        String str2 = this.f26161c;
        boolean z4 = false;
        String str3 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(this.f26159a) + "&tl=" + Uri.encode(this.f26160b) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str2).toURL().openConnection();
        } catch (Exception e) {
            e = e;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("User-Agent", v31.O[(int) Math.round(Math.random() * 5)]);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), r8.d.f43413c));
            while (true) {
                int read = bufferedReader.read();
                if (read == -1) {
                    break;
                }
                sb.append((char) read);
            }
            bufferedReader.close();
            JSONArray jSONArray = new JSONArray(new JSONTokener(sb.toString()));
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
            AndroidUtilities.runOnUIThread(new z80(28, callback2, str4));
        } catch (Exception e6) {
            e = e6;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("failed to translate a text ");
                if (httpURLConnection != null) {
                    num = Integer.valueOf(httpURLConnection.getResponseCode());
                } else {
                    num = null;
                }
                sb2.append(num);
                sb2.append(" ");
                if (httpURLConnection != null) {
                    str3 = httpURLConnection.getResponseMessage();
                }
                sb2.append(str3);
                Log.e("translate", sb2.toString());
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            e.printStackTrace();
            if (httpURLConnection != null) {
                try {
                    if (httpURLConnection.getResponseCode() == 429) {
                        z4 = true;
                    }
                } catch (Exception unused2) {
                    AndroidUtilities.runOnUIThread(new nq0(callback2, 21));
                    return;
                }
            }
            AndroidUtilities.runOnUIThread(new kv0(2, callback2, z4));
        }
    }
}
